/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class oe {
    na field_eb;
    private int field_T;
    int[][] field_V;
    static String field_cc;
    private int field_sc;
    int field_Mb;
    private int field_c;
    private int field_S;
    Vector field_kb;
    int field_Fb;
    private int[][] field_Vb;
    private int field_L;
    private va field_Ab;
    boolean field_rc;
    boolean field_gb;
    boolean field_F;
    int field_D;
    static int[] field_xb;
    cn field_k;
    private int field_Rb;
    int field_Q;
    private int field_Yb;
    private int field_nc;
    private int field_P;
    private byte[][] field_Nb;
    private ce field_Y;
    int field_Pb;
    int field_fc;
    int field_n;
    private cn field_vb;
    private od field_Db;
    private oc field_Xb;
    int field_t;
    private int field_I;
    private int field_Kb;
    int field_H;
    private int field_qc;
    private boolean field_lb;
    private int field_ib;
    private int field_Ob;
    private boolean field_W;
    private int field_O;
    private int field_pc;
    private int field_ac;
    private int field_E;
    private int field_mc;
    private int field_x;
    private int field_o;
    private int field_bb;
    private int field_e;
    private boolean field_Bb;
    private int field_Tb;
    private int field_mb;
    private hg field_nb;
    private int field_U;
    private int field_tb;
    private int field_Sb;
    int field_p;
    int field_Ub;
    private int field_hc;
    private int field_gc;
    private cn field_G;
    int field_M;
    private int field_qb;
    boolean field_ec;
    private cn field_N;
    private int field_w;
    boolean field_Jb;
    private int field_J;
    int field_Zb;
    private int field_m;
    private int field_Hb;
    boolean field_Gb;
    int field_ob;
    private boolean field_q;
    private int field_yb;
    private int field_A;
    private cn field_tc;
    boolean field_Ib;
    private boolean field_jc;
    int field_cb;
    private boolean field_rb;
    private int field_pb;
    private int field_ic;
    boolean field_Cb;
    private cn field_hb;
    private int field_u;
    private boolean field_kc;
    private int field_bc;
    private int field_d;
    private int[] field_g;
    private ed field_i;
    boolean field_a;
    private String field_h;
    int field_X;
    private int field_y;
    private int field_sb;
    private int field_Qb;
    private boolean field_db;
    private int[] field_Lb;
    private int field_l;
    private int field_dc;
    private int field_z;
    private int field_ab;
    private int field_j;
    li field_B;
    private cn field_s;
    private boolean field_zb;
    private hl field_f;
    private hl field_wb;
    private m field_fb;
    private hl field_v;
    private hl field_Eb;
    private hl field_Wb;
    private hl field_r;
    private cn field_C;
    hl field_lc;
    private hl field_Z;
    private int field_ub;
    private hl field_jb;
    private hl field_R;
    private int field_oc;
    private boolean field_b;

    private final void c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var11 = 0;
        int var12 = EscapeVector.field_A;
        int var9 = (param5 << 5) - param1;
        int var10 = -param4 + (param2 << 5);
        if (var9 > 0) {
            int discarded$0 = 1299998021;
            var10 = this.b(param0, param2, -var9 + 32, -1 + param5, param7, var10, 32);
        }
        for (var11 = param5; ~var11 > ~param6; var11++) {
            int discarded$1 = 1299998021;
            var10 = this.b(param0, param2, 0, var11, param7, var10, 32);
        }
        var11 = 31 & -var9 + 480;
        if (var11 > 0) {
            int discarded$2 = 1299998021;
            int discarded$3 = this.b(param0, param2, 0, param6, param7, var10, var11);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14) {
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        hg var21_ref_hg = null;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        Object var25 = null;
        int[] var26 = null;
        Object var27 = null;
        am var27_ref = null;
        int[] var28 = null;
        Object var29 = null;
        am var29_ref = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var27 = null;
          var29 = null;
          var24 = EscapeVector.field_A;
          var32 = this.a(param14, -1, param8);
          var31 = var32;
          var30 = var31;
          var28 = var30;
          var26 = var28;
          var16 = var26;
          if (param1 >= 78) {
            break L0;
          } else {
            var25 = null;
            this.a((pi) null, -78);
            break L0;
          }
        }
        L1: {
          if (var26 != null) {
            break L1;
          } else {
            if (vh.field_i == 0) {
              return;
            } else {
              break L1;
            }
          }
        }
        param8 = param8 << 16;
        param14 = param14 << 16;
        var17 = param11;
        L2: while (true) {
          if (param9 < var17) {
            return;
          } else {
            var18 = param7;
            L3: while (true) {
              if (~var18 < ~param2) {
                var17++;
                continue L2;
              } else {
                L4: {
                  var19 = (var18 << 11) + param8;
                  var20 = param14 + (var17 << 11);
                  if ((param13 - param12) * (var20 - param3) <= (-param12 + var19) * (-param3 + param4)) {
                    if (~((param13 - param10) * (var20 - param6)) >= ~((param4 + -param6) * (-param10 + var19))) {
                      break L4;
                    } else {
                      if ((-param10 + param12) * (var20 - param6) < (param3 + -param6) * (-param10 + var19)) {
                        var21_ref_hg = cn.field_f.a(false);
                        var22 = 0;
                        L5: while (true) {
                          if (~vh.field_i >= ~var22) {
                            if (((oe) this).field_rb) {
                              break L4;
                            } else {
                              if (var26 == null) {
                                break L4;
                              } else {
                                if (!this.a(var32, var18, (byte) -74, var17)) {
                                  break L4;
                                } else {
                                  if ((255 & 24 + ((oe) this).field_I) > 48) {
                                    ((oe) this).field_q = true;
                                    return;
                                  } else {
                                    if (65536 >= (((oe) this).field_mc >> 8) * (((oe) this).field_mc >> 8) + (((oe) this).field_hc >> 8) * (((oe) this).field_hc >> 8)) {
                                      var21 = -param10 + var19;
                                      var22 = -param6 + var20;
                                      if (var22 * var22 + var21 * var21 >= 150994944) {
                                        ((oe) this).field_q = true;
                                        return;
                                      } else {
                                        ((oe) this).field_kc = true;
                                        break L4;
                                      }
                                    } else {
                                      ((oe) this).field_q = true;
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L6: {
                              var29_ref = (am) (Object) var21_ref_hg;
                              if (~var20 == ~var29_ref.field_j) {
                                if (var29_ref.field_i > var19) {
                                  break L6;
                                } else {
                                  if (~var29_ref.field_h >= ~var19) {
                                    break L6;
                                  } else {
                                    ((oe) this).field_q = true;
                                    return;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            var21_ref_hg = var21_ref_hg.field_b;
                            var22++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    if (~((var19 + -param0) * (-param5 + param4)) >= ~((-param5 + var20) * (-param0 + param13))) {
                      break L4;
                    } else {
                      if (~((-param5 + param3) * (-param0 + var19)) <= ~((-param0 + param12) * (var20 + -param5))) {
                        break L4;
                      } else {
                        var21_ref_hg = cn.field_f.a(false);
                        var22 = 0;
                        L7: while (true) {
                          if (~vh.field_i >= ~var22) {
                            if (((oe) this).field_rb) {
                              break L4;
                            } else {
                              if (var26 == null) {
                                break L4;
                              } else {
                                if (!this.a(var32, var18, (byte) -74, var17)) {
                                  break L4;
                                } else {
                                  if ((255 & ((oe) this).field_I - -24) > 48) {
                                    ((oe) this).field_q = true;
                                    return;
                                  } else {
                                    if ((((oe) this).field_hc >> 8) * (((oe) this).field_hc >> 8) + (((oe) this).field_mc >> 8) * (((oe) this).field_mc >> 8) > 65536) {
                                      ((oe) this).field_q = true;
                                      return;
                                    } else {
                                      var21 = var19 + -param0;
                                      var22 = -param5 + var20;
                                      if (var21 * var21 + var22 * var22 < 150994944) {
                                        ((oe) this).field_jc = true;
                                        break L4;
                                      } else {
                                        ((oe) this).field_q = true;
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L8: {
                              var27_ref = (am) (Object) var21_ref_hg;
                              if (~var20 != ~var27_ref.field_j) {
                                break L8;
                              } else {
                                if (~var19 > ~var27_ref.field_i) {
                                  break L8;
                                } else {
                                  if (~var27_ref.field_h >= ~var19) {
                                    break L8;
                                  } else {
                                    ((oe) this).field_q = true;
                                    return;
                                  }
                                }
                              }
                            }
                            var21_ref_hg = var21_ref_hg.field_b;
                            var22++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
                var18++;
                continue L3;
              }
            }
          }
        }
    }

    private final void b(int param0, byte param1) {
        if (10 != param0) {
            return;
        }
        ((oe) this).field_lb = true;
        af.a(0);
        this.a(-128, hd.field_a);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        if ((param4 ^ param6) >> 5 == 0) {
            this.a(param11, 94, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, param6 & 31, param1, param8, param6 >> 5);
        } else {
            this.a(param11, 106, param9, param3, param0, param10, param13, param5, param12, 31, param2, 31 & param6, param1, param8, param6 >> 5);
            if (!(!((oe) this).field_q)) {
                return;
            }
            this.a(param11, 104, param9, param3, param0, param10, param13, param5, param12, param4 & 31, param2, 0, param1, param8, param4 >> 5);
        }
        int var15 = -29 / ((param7 - 71) / 38);
    }

    private final int b(int param0, int param1) {
        return (param0 & 65280) >> 8;
    }

    final void D(int param0) {
        int var2 = 0;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        if (param0 >= ((oe) this).field_D) {
            var2 = param0 + 1;
            var3 = new int[((oe) this).field_Mb * var2][];
            for (var4 = 0; var4 < ((oe) this).field_Mb * ((oe) this).field_D; var4++) {
                var3[var4] = ((oe) this).field_V[var4];
            }
            var5 = ((oe) this).field_Mb * ((oe) this).field_D;
            var4 = var5;
            while (var5 < ((oe) this).field_Mb * var2) {
                var3[var5] = si.field_v;
                var5++;
            }
            ((oe) this).field_D = var2;
            ((oe) this).field_Fb = ((oe) this).field_D << 5;
            ((oe) this).field_V = var3;
            return;
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        Object var7 = null;
        vh var7_ref = null;
        hg var8 = null;
        L0: {
          L1: {
            param1 = ((((oe) this).field_n << 16) + param1) % (((oe) this).field_n << 16);
            if (((oe) this).field_O == 0) {
              break L1;
            } else {
              if (~((oe) this).field_O != ~((oe) this).field_x) {
                L2: {
                  var7 = null;
                  if (((oe) this).field_nb != null) {
                    var7_ref = (vh) (Object) ((oe) this).field_nb.field_b;
                    break L2;
                  } else {
                    var7_ref = (vh) (Object) ((oe) this).field_G.a(false);
                    break L2;
                  }
                }
                var7_ref.a(param1, false, param5, param2, (byte) -124, param4, param0, 250);
                ((oe) this).field_x = ((oe) this).field_x + 1;
                ((oe) this).field_nb = (hg) (Object) var7_ref;
                break L0;
              } else {
                break L1;
              }
            }
          }
          var8 = (hg) (Object) new vh(param1, param0, param5, param2, param4, 250);
          ((oe) this).field_G.a(-12328, var8);
          ((oe) this).field_O = ((oe) this).field_O + 1;
          ((oe) this).field_x = ((oe) this).field_x + 1;
          ((oe) this).field_nb = var8;
          break L0;
        }
    }

    private final void a(boolean param0, int param1, int param2, DataInputStream param3) throws IOException {
        vc var5 = new vc(param3, param1);
        vl.b(1, var5.field_c);
        ((oe) this).field_P = var5.field_c;
        ((oe) this).field_Yb = var5.field_b;
        try {
            ((oe) this).field_V = var5.field_d;
            ((oe) this).field_n = var5.field_h;
            ((oe) this).field_Fb = var5.field_g;
            ((oe) this).field_Mb = var5.field_a;
            ((oe) this).field_D = var5.field_f;
            this.l((byte) 111);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.SF(" + 0 + 44 + param1 + 44 + 640 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void t(int param0) {
        int var2 = 0;
        int var3 = 0;
        sa var4 = null;
        int var5 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          ce.field_f.c(0, ((oe) this).field_fc, ((oe) this).field_Pb);
          this.o(0);
          if (((oe) this).field_Pb == 15) {
            if (((oe) this).field_Rb > 0) {
              break L0;
            } else {
              L1: {
                if (90000 < ((oe) this).field_cb) {
                  break L1;
                } else {
                  ((oe) this).a(((oe) this).field_fc, false, 9, 246);
                  break L1;
                }
              }
              if (((oe) this).field_cb > 60000) {
                break L0;
              } else {
                ((oe) this).a(((oe) this).field_fc, false, 10, 245);
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (((oe) this).field_ac > 2500) {
            ((oe) this).a(((oe) this).field_fc, false, 6, 249);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((oe) this).field_b) {
            ((oe) this).a(((oe) this).field_fc, false, 7, 248);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (7 != ((oe) this).field_Pb) {
            break L4;
          } else {
            if (1700 != ((oe) this).field_ib) {
              break L4;
            } else {
              ((oe) this).a(((oe) this).field_fc, false, 13, 242);
              break L4;
            }
          }
        }
        L5: {
          if (9 != ((oe) this).field_Pb) {
            break L5;
          } else {
            if (((oe) this).field_db) {
              break L5;
            } else {
              if (((oe) this).field_m >= 0) {
                break L5;
              } else {
                ((oe) this).a(((oe) this).field_fc, false, 14, 241);
                break L5;
              }
            }
          }
        }
        L6: {
          if (((oe) this).field_Pb != 10) {
            break L6;
          } else {
            var2 = 0;
            var3 = 0;
            L7: while (true) {
              if (~var3 <= ~((oe) this).field_kb.size()) {
                if (8 > var2) {
                  break L6;
                } else {
                  ((oe) this).a(((oe) this).field_fc, false, 15, 240);
                  break L6;
                }
              } else {
                L8: {
                  var4 = (sa) ((oe) this).field_kb.elementAt(var3);
                  if (var4.field_n != 2) {
                    break L8;
                  } else {
                    var2++;
                    break L8;
                  }
                }
                var3++;
                continue L7;
              }
            }
          }
        }
        L9: {
          if (((oe) this).field_Pb != 14) {
            break L9;
          } else {
            if (!((oe) this).field_db) {
              ((oe) this).a(((oe) this).field_fc, false, 16, 239);
              break L9;
            } else {
              break L9;
            }
          }
        }
    }

    final int b(int param0, int param1, int param2, int param3) {
        int var6 = EscapeVector.field_A;
        param1 = param1 - ((oe) this).field_H;
        param3 = param3 - ((oe) this).field_p;
        while (-((oe) this).field_n << 15 > param1) {
            param1 = param1 + (((oe) this).field_n << 16);
        }
        while (((oe) this).field_n << 15 < param1) {
            param1 = param1 - (((oe) this).field_n << 16);
        }
        int var5 = (int)Math.sqrt((double)param3 * (double)param3 + (double)param1 * (double)param1);
        if (~var5 >= ~param0) {
            return qm.field_c * 6144 / 64;
        }
        if (param2 != 96) {
            Object var7 = null;
            this.a((am) null, (byte) 83);
        }
        return qm.field_c * param0 / (var5 / 96);
    }

    private final String d(boolean param0, int param1) {
        String var3 = null;
        int var4 = 0;
        L0: {
          L1: {
            var4 = EscapeVector.field_A;
            var3 = "";
            if (((oe) this).field_tb != 0) {
              break L1;
            } else {
              if (param1 != 1) {
                break L1;
              } else {
                var3 = ef.field_k;
                break L0;
              }
            }
          }
          if (param1 != 1) {
            L2: {
              if (((oe) this).field_tb != 0) {
                break L2;
              } else {
                if (param1 != 5) {
                  break L2;
                } else {
                  var3 = dd.field_b;
                  break L0;
                }
              }
            }
            if (5 != param1) {
              break L0;
            } else {
              var3 = af.field_g;
              break L0;
            }
          } else {
            var3 = li.field_p;
            break L0;
          }
        }
        return var3;
    }

    private final void a(int param0, boolean param1) {
        ((oe) this).s((byte) -41);
        ((oe) this).field_vb.a((byte) 118);
        ((oe) this).field_Db = new od((oe) this);
        ((oe) this).field_Xb.f((byte) -125);
        ji.a(true);
        ((oe) this).field_pc = 0;
        ((oe) this).field_qc = 0;
        ((oe) this).field_tc = new cn();
        ((oe) this).field_sb = 0;
    }

    private final void c() {
        rb var2 = null;
        if (!(((oe) this).field_ab <= 0)) {
            ((oe) this).field_ab = ((oe) this).field_ab - 1;
            if (!(0 != ((oe) this).field_ab)) {
                ((oe) this).field_h = null;
            }
        }
        if (((oe) this).field_h == null) {
            var2 = this.B(-27521);
            if (var2 == null) {
                return;
            }
            ((oe) this).field_h = var2.field_g;
            ((oe) this).field_ab = var2.field_i;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        ((oe) this).field_C.a((hg) (Object) new am(param2, param0, param1), 8364);
        ((oe) this).field_ub = ((oe) this).field_ub + 1;
    }

    private final sa a(DataInputStream param0, byte param1, int param2, int param3) throws IOException {
        sa var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sa stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_10_0 = null;
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
              var6 = param0.readUnsignedByte();
              if (param3 >= 2) {
                break L1;
              } else {
                if (var6 >= 8) {
                  var6++;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var7 = param0.readUnsignedShort();
              var8 = 8;
              var9 = param0.readUnsignedShort();
              if (param3 < 5) {
                var5 = new sa(param2, var6, var7, var9);
                break L2;
              } else {
                var5 = this.a(param0, var7, param3, false, var6, var9, param2);
                break L2;
              }
            }
            L3: {
              if (var6 != 2) {
                break L3;
              } else {
                if (11 > param3) {
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_10_0 = (sa) var5;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5_ref;
            stackOut_12_1 = new StringBuilder().append("oe.IF(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -67 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_11_0;
    }

    private final void v(int param0) {
        if (!(((oe) this).field_fc == 2)) {
            return;
        }
        if (!(null != ua.field_c)) {
            return;
        }
        if (!(ua.field_c.c(115))) {
            return;
        }
        int var3 = 28;
        int var4 = var3 ^ 255;
        ((oe) this).a(((oe) this).field_fc, false, var3, var4);
    }

    private final int a(uk param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        ga var6 = null;
        ga var7 = null;
        ga var8 = null;
        ga var9 = null;
        int var10 = 0;
        int var11 = 0;
        ga var12 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
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
            var12 = param0.field_e;
            var6 = param0.field_d;
            var7 = param0.field_k;
            var8 = param0.field_c;
            var9 = param0.field_g;
            var10 = var12.field_a + param3 << 11;
            var11 = param2 + var12.field_c << 11;
            if (~((var10 + -var6.field_a) * (-var6.field_c + var7.field_c)) <= ~((-var6.field_a + var7.field_a) * (var11 - var6.field_c))) {
              if ((-var9.field_c + var7.field_c) * (-var9.field_a + var10) < (var11 + -var9.field_c) * (-var9.field_a + var7.field_a)) {
                if ((var11 - var9.field_c) * (var6.field_a - var9.field_a) < (var6.field_c + -var9.field_c) * (var10 - var9.field_a)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                return 0;
              }
            } else {
              L1: {
                if ((var7.field_c + -var8.field_c) * (-var8.field_a + var10) <= (-var8.field_c + var11) * (var7.field_a - var8.field_a)) {
                  break L1;
                } else {
                  if (~((var6.field_c - var8.field_c) * (-var8.field_a + var10)) <= ~((-var8.field_c + var11) * (-var8.field_a + var6.field_a))) {
                    break L1;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_4_0 = stackOut_3_0;
                    return stackIn_4_0;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("oe.RF(");
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 15 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_14_0;
    }

    private final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        ((oe) this).field_nc = ((oe) this).field_D;
        if (param0 > 110) {
          ((oe) this).field_Vb = new int[((oe) this).field_V.length][];
          var2 = 0;
          L0: while (true) {
            if (((oe) this).field_V.length <= var2) {
              return;
            } else {
              L1: {
                L2: {
                  if (((oe) this).field_V[var2] == null) {
                    break L2;
                  } else {
                    if (((oe) this).field_V[var2] != si.field_v) {
                      ((oe) this).field_Vb[var2] = new int[32];
                      var3 = 0;
                      L3: while (true) {
                        if (var3 >= 32) {
                          break L1;
                        } else {
                          ((oe) this).field_Vb[var2][var3] = ((oe) this).field_V[var2][var3];
                          var3++;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                ((oe) this).field_Vb[var2] = ((oe) this).field_V[var2];
                break L1;
              }
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    private final void a() {
        ed var2_ref_ed = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (!((oe) this).field_Gb) {
            break L0;
          } else {
            if (((oe) this).field_A != 0) {
              break L0;
            } else {
              L1: {
                var2_ref_ed = ij.field_g;
                var3 = -var2_ref_ed.field_A + 640 >> 1;
                var4 = 480 + -var2_ref_ed.field_z >> 1;
                if (!((oe) this).field_a) {
                  break L1;
                } else {
                  if (((oe) this).field_X < 0) {
                    var5 = 1;
                    var2_ref_ed.a(var3, var4, var5);
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var2_ref_ed.e(var3, var4);
              break L0;
            }
          }
        }
        var2 = 0;
    }

    private final void a(int param0) {
        Object var2 = null;
        pi var3 = null;
        ic var3_ref = null;
        Throwable var4 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var5 = EscapeVector.field_A;
          pl.field_n.b((wg) (Object) ((oe) this).field_jb);
          pl.field_n.b((wg) (Object) ((oe) this).field_Z);
          pl.field_n.b((wg) (Object) ((oe) this).field_v);
          if (null == ((oe) this).field_R) {
            break L0;
          } else {
            pl.field_n.b((wg) (Object) ((oe) this).field_R);
            break L0;
          }
        }
        L1: {
          if (null == ((oe) this).field_f) {
            break L1;
          } else {
            pl.field_n.b((wg) (Object) ((oe) this).field_f);
            break L1;
          }
        }
        L2: {
          if (((oe) this).field_Eb != null) {
            ((oe) this).field_Eb.h(0);
            break L2;
          } else {
            break L2;
          }
        }
        pl.field_n.b((wg) (Object) ((oe) this).field_Wb);
        pl.field_n.b((wg) (Object) ((oe) this).field_wb);
        pl.field_n.b((wg) (Object) ((oe) this).field_r);
        pl.field_n.b((wg) (Object) ((oe) this).field_lc);
        pl.field_n.b((wg) (Object) ((oe) this).field_fb);
        var2 = (Object) (Object) pl.field_n;
        synchronized (var2) {
          L3: {
            var3 = (pi) (Object) ((oe) this).field_hb.a(false);
            L4: while (true) {
              if (var3 == null) {
                var3_ref = (ic) (Object) ((oe) this).field_N.a(false);
                L5: while (true) {
                  if (var3_ref == null) {
                    break L3;
                  } else {
                    L6: {
                      if (null != var3_ref.field_g) {
                        pl.field_n.b((wg) (Object) var3_ref.field_g);
                        pl.field_n.b((wg) (Object) var3_ref.field_m);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var3_ref = (ic) (Object) ((oe) this).field_N.b((byte) 70);
                    continue L5;
                  }
                }
              } else {
                L7: {
                  if (var3.field_r == 0) {
                    break L7;
                  } else {
                    pl.field_n.b((wg) (Object) var3.field_o);
                    break L7;
                  }
                }
                var3 = (pi) (Object) ((oe) this).field_hb.b((byte) 70);
                continue L4;
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2, ed param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        double var7 = 0.0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_49_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        var31 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              param2 = param2 + param3.field_q;
              param1 = param1 + param3.field_v;
              var5_int = param3.field_s + param2 - 1;
              var6 = -1 + (param3.field_x + param1);
              var7 = (double)((oe) this).field_I * 0.02454369260617026;
              var9 = (int)(2048.0 * Math.sin(var7));
              var10 = -(int)(2048.0 * Math.cos(var7));
              var11 = -var10;
              var12 = var9;
              var13 = ((oe) this).field_H >> 5;
              var13 = var13 + (((oe) this).field_n << 11);
              var14 = ((oe) this).field_p >> 5;
              var15 = var13 + var9 * 10;
              var16 = var13 + -(2 * var9);
              var17 = var14 + var10 * 10;
              var18 = var14 + -(var10 * 2);
              var19 = var13 + (-(var9 * 6) - 8 * var11);
              var20 = -(var9 * 6) + var13 - -(var11 * 8);
              var21 = -(6 * var10) + var14 - var12 * 8;
              var22 = var12 * 8 + (var14 - 6 * var10);
              var23 = var15;
              if (~var23 < ~var19) {
                var23 = var19;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var20 >= var23) {
                break L2;
              } else {
                var23 = var20;
                break L2;
              }
            }
            L3: {
              var24 = var17;
              if (~var24 < ~var21) {
                var24 = var21;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var22 < var24) {
                var24 = var22;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var25 = var15;
              if (~var25 > ~var19) {
                var25 = var19;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var25 >= var20) {
                break L6;
              } else {
                var25 = var20;
                break L6;
              }
            }
            L7: {
              var26 = var17;
              if (var21 > var26) {
                var26 = var21;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var23 = var23 >> 11;
              var25 = var25 >> 11;
              if (var26 < var22) {
                var26 = var22;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var24 = var24 >> 11;
              if (var24 >= param1) {
                break L9;
              } else {
                var24 = param1;
                break L9;
              }
            }
            L10: {
              if (~var5_int <= ~var25) {
                break L10;
              } else {
                var25 = var5_int;
                break L10;
              }
            }
            L11: {
              if (~var23 <= ~param2) {
                break L11;
              } else {
                var23 = param2;
                break L11;
              }
            }
            L12: {
              var26 = var26 >> 11;
              if (~var26 >= ~var6) {
                break L12;
              } else {
                var26 = var6;
                break L12;
              }
            }
            var27 = var24;
            L13: while (true) {
              if (var26 < var27) {
                stackOut_49_0 = 0;
                stackIn_50_0 = stackOut_49_0;
                break L0;
              } else {
                var28 = var23;
                L14: while (true) {
                  if (~var25 > ~var28) {
                    var27++;
                    continue L13;
                  } else {
                    L15: {
                      if (0 == param3.field_B[-param2 + ((var27 + -param1) * param3.field_s - -var28)]) {
                        break L15;
                      } else {
                        var29 = var28 << 11;
                        var30 = var27 << 11;
                        if (~((var30 + -var18) * (-var16 + var15)) < ~((-var16 + var29) * (var17 + -var18))) {
                          if ((var17 - var22) * (var29 - var20) > (var30 + -var22) * (-var20 + var15)) {
                            if ((var16 - var20) * (var30 + -var22) > (-var22 + var18) * (-var20 + var29)) {
                              stackOut_45_0 = 1;
                              stackIn_46_0 = stackOut_45_0;
                              return stackIn_46_0 != 0;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        } else {
                          if ((-var21 + var17) * (-var19 + var29) >= (-var19 + var15) * (var30 - var21)) {
                            break L15;
                          } else {
                            if (~((-var19 + var16) * (var30 + -var21)) <= ~((var29 - var19) * (var18 + -var21))) {
                              break L15;
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_40_0 = stackOut_39_0;
                              return stackIn_40_0 != 0;
                            }
                          }
                        }
                      }
                    }
                    var28++;
                    continue L14;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var5;
            stackOut_51_1 = new StringBuilder().append("oe.UE(").append(0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param3 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L16;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              break L16;
            }
          }
          throw t.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + 41);
        }
        return stackIn_50_0 != 0;
    }

    private final hg a(hg param0, int param1, int param2, boolean param3, int param4) {
        Object var6 = null;
        am var6_ref = null;
        RuntimeException var6_ref2 = null;
        am stackIn_6_0 = null;
        am stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_5_0 = null;
        am stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (aa.field_a == 0) {
                break L1;
              } else {
                if (~vh.field_i == ~aa.field_a) {
                  break L1;
                } else {
                  L2: {
                    var6 = null;
                    if (param0 == null) {
                      var6_ref = (am) (Object) cn.field_f.a(false);
                      break L2;
                    } else {
                      var6_ref = (am) (Object) param0.field_b;
                      break L2;
                    }
                  }
                  vh.field_i = vh.field_i + 1;
                  var6_ref.field_j = param4;
                  var6_ref.field_h = param1;
                  var6_ref.field_i = param2;
                  stackOut_5_0 = (am) var6_ref;
                  stackIn_6_0 = stackOut_5_0;
                  return (hg) (Object) stackIn_6_0;
                }
              }
            }
            var6_ref = new am(param2, param1, param4);
            cn.field_f.a(-12328, (hg) (Object) var6_ref);
            aa.field_a = aa.field_a + 1;
            vh.field_i = vh.field_i + 1;
            stackOut_7_0 = (am) var6_ref;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6_ref2;
            stackOut_9_1 = new StringBuilder().append("oe.BD(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 44 + 1 + 44 + param4 + 41);
        }
        return (hg) (Object) stackIn_8_0;
    }

    private final boolean a(int param0, ed param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        int[] var11_array = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hg var16 = null;
        int var17 = 0;
        Object var18 = null;
        am var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int stackIn_5_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var18 = null;
        var19 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var24 = this.a(param6, param4, param3);
              var23 = var24;
              var22 = var23;
              var21 = var22;
              var20 = var21;
              var11_array = var20;
              if (var20 != null) {
                break L1;
              } else {
                if (0 == vh.field_i) {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            param6 = param6 << 5;
            param3 = param3 << 5;
            var12 = param5;
            L2: while (true) {
              if (~param7 > ~var12) {
                stackOut_28_0 = 0;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              } else {
                var13 = param2;
                L3: while (true) {
                  if (param8 < var13) {
                    var12++;
                    continue L2;
                  } else {
                    L4: {
                      var14 = param9 - -var13;
                      var15 = var12 + param0;
                      if (param1.field_B[param1.field_s * var15 - -var14] != 0) {
                        var16 = cn.field_f.a(false);
                        var17 = 0;
                        L5: while (true) {
                          if (vh.field_i <= var17) {
                            if (var20 == null) {
                              break L4;
                            } else {
                              if (!this.a(var24, var13, (byte) -74, var12)) {
                                break L4;
                              } else {
                                stackOut_24_0 = 1;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0 != 0;
                              }
                            }
                          } else {
                            L6: {
                              var18_ref = (am) (Object) var16;
                              if (var12 + param6 == var18_ref.field_j) {
                                if (~(var13 + param3) > ~var18_ref.field_i) {
                                  break L6;
                                } else {
                                  if (~(var13 + param3) > ~var18_ref.field_h) {
                                    stackOut_19_0 = 1;
                                    stackIn_20_0 = stackOut_19_0;
                                    return stackIn_20_0 != 0;
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            var16 = var16.field_b;
                            var17++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var13++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var11;
            stackOut_30_1 = new StringBuilder().append("oe.MB(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
        return stackIn_29_0 != 0;
    }

    private final void x() {
        if (!(!ua.field_c.b(15954, ((oe) this).field_fc, ((oe) this).field_Pb))) {
            int discarded$0 = 64;
            ua.field_c.a(-15748, ((oe) this).field_fc, ((oe) this).field_Pb, oj.k());
        }
    }

    private final void A(byte param0) {
        double var2 = 0.0;
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
        int var22 = 0;
        hg var23 = null;
        int var24 = 0;
        Object var25 = null;
        am var25_ref = null;
        int var26 = 0;
        L0: {
          var25 = null;
          var26 = EscapeVector.field_A;
          var2 = (double)((oe) this).field_I * 0.02454369260617026;
          var4 = (int)(Math.sin(var2) * 2048.0);
          var5 = -(int)(Math.cos(var2) * 2048.0);
          var6 = -var5;
          var7 = var4;
          var8 = ((oe) this).field_H >> 5;
          var8 = var8 + (((oe) this).field_n << 11);
          var9 = ((oe) this).field_p >> 5;
          var10 = var4 * 10 + var8;
          var11 = -(2 * var4) + var8;
          var12 = var5 * 10 + var9;
          var13 = 26 / ((-43 - param0) / 47);
          var14 = var9 - var5 * 2;
          var15 = -(8 * var6) + (-(6 * var4) + var8);
          var16 = var6 * 8 + (var8 - var4 * 6);
          var17 = -(8 * var7) + (var9 + -(var5 * 6));
          var18 = -(var5 * 6) + (var9 - -(8 * var7));
          var19 = var10;
          if (var19 > var15) {
            var19 = var15;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var16 < var19) {
            var19 = var16;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var20 = var12;
          if (var17 >= var20) {
            break L2;
          } else {
            var20 = var17;
            break L2;
          }
        }
        L3: {
          if (var20 > var18) {
            var20 = var18;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var21 = var10;
          if (var21 >= var15) {
            break L4;
          } else {
            var21 = var15;
            break L4;
          }
        }
        L5: {
          if (var21 < var16) {
            var21 = var16;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var22 = var12;
          if (~var17 >= ~var22) {
            break L6;
          } else {
            var22 = var17;
            break L6;
          }
        }
        L7: {
          var21 = var21 >> 11;
          var19 = var19 >> 11;
          if (~var22 <= ~var18) {
            break L7;
          } else {
            var22 = var18;
            break L7;
          }
        }
        var20 = var20 >> 11;
        var22 = var22 >> 11;
        this.a(94, var22, var20, var19, var21);
        var23 = cn.field_f.a(false);
        var24 = 0;
        L8: while (true) {
          if (vh.field_i <= var24) {
            L9: {
              if (!((oe) this).field_rb) {
                break L9;
              } else {
                if (vh.field_i == 0) {
                  return;
                } else {
                  break L9;
                }
              }
            }
            L10: {
              if ((var21 ^ var19) >> 5 != 0) {
                this.a(var12, var11, var15, var14, var22, 31 & var19, var20, -5, var10, 31, var18, var16, var19 >> 5, var17);
                if (((oe) this).field_q) {
                  return;
                } else {
                  this.a(var12, var11, var15, var14, var22, 0, var20, 112, var10, 31 & var21, var18, var16, var21 >> 5, var17);
                  break L10;
                }
              } else {
                this.a(var12, var11, var15, var14, var22, 31 & var19, var20, -98, var10, var21 & 31, var18, var16, var19 >> 5, var17);
                break L10;
              }
            }
            return;
          } else {
            var25_ref = (am) (Object) var23;
            var23 = var23.field_b;
            var25_ref.field_i = var25_ref.field_i << 11;
            var25_ref.field_h = var25_ref.field_h << 11;
            var25_ref.field_j = var25_ref.field_j << 11;
            var24++;
            continue L8;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        if ((param0 ^ param6) >> 5 != 0) {
            this.a(param4, 31 & param0, param1, param2, param0 >> 5, param3, (byte) 119, param7, 31);
            this.a(param4, 0, param1, param2, param6 >> 5, param3, (byte) 123, param7, 31 & param6);
        } else {
            this.a(param4, 31 & param0, param1, param2, param0 >> 5, param3, (byte) 123, param7, 31 & param6);
        }
    }

    private final void a(byte param0, DataInputStream param1, int param2) throws IOException {
        try {
            if (param2 < 3) {
                ((oe) this).field_bb = -8388608;
                ((oe) this).field_t = ((oe) this).field_n << 15;
                ((oe) this).field_U = 2500;
            } else {
                ((oe) this).field_t = param1.readInt();
                ((oe) this).field_bb = param1.readInt();
                ((oe) this).field_U = param1.readInt();
                if (!(((oe) this).field_U > 0)) {
                    ((oe) this).field_U = 2500;
                }
            }
            int var4_int = 29;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.FB(" + 121 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var12 = 0;
        var12 = EscapeVector.field_A;
        L0: while (true) {
          if (param0 <= 0) {
            return true;
          } else {
            L1: while (true) {
              if (0 <= param3) {
                L2: while (true) {
                  if (param3 < ((oe) this).field_n << 16) {
                    L3: {
                      var7 = param3 >> 16;
                      var8 = param2 >> 16;
                      var9 = var7 & 31;
                      var7 = var7 >> 5;
                      var10 = var8 & 31;
                      var8 = var8 >> 5;
                      if (var8 >= 0) {
                        if (~var8 > ~((oe) this).field_D) {
                          var11 = ((oe) this).field_V[var7 + var8 * ((oe) this).field_Mb];
                          if (var11 != null) {
                            L4: {
                              if (var11 == si.field_v) {
                                break L4;
                              } else {
                                if ((var11[var10] & 1 << var9) != 0) {
                                  break L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            return false;
                          } else {
                            break L3;
                          }
                        } else {
                          return false;
                        }
                      } else {
                        break L3;
                      }
                    }
                    param2 = param2 + param1;
                    param0--;
                    param3 = param3 + param4;
                    continue L0;
                  } else {
                    param3 = param3 - (((oe) this).field_n << 16);
                    continue L2;
                  }
                }
              } else {
                param3 = param3 + (((oe) this).field_n << 16);
                continue L1;
              }
            }
          }
        }
    }

    private final boolean i(int param0) {
        int var2 = -92;
        if (!(((oe) this).field_l != 0)) {
            return false;
        }
        if (!(0 != ((oe) this).field_Q)) {
            if (!(((oe) this).field_l != 1)) {
                return true;
            }
        }
        if (((oe) this).field_Q != 1) {
            return false;
        }
        if (((oe) this).field_l == 2) {
            return true;
        }
        return false;
    }

    private final void a(int param0, int param1, ed param2, int param3, hh param4) {
        int var6_int = 0;
        oc var7 = null;
        try {
            int discarded$0 = 8192;
            var6_int = this.n() ? 1 : 0;
            var7 = ci.a((byte) -43, param4, param3, param2, var6_int != 0, param0);
            ((oe) this).field_vb.a(-12328, (hg) (Object) var7);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.D(" + param0 + 44 + -28311553 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    private final void u(int param0) {
    }

    private final int a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int[] param8) {
        RuntimeException var10 = null;
        int[] var10_array = null;
        int[] var11 = null;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var17 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var27 = this.a(param7, (byte) -82, param1);
              var25 = var27;
              var23 = var25;
              var21 = var23;
              var18 = var21;
              var10_array = var18;
              var26 = this.a(param1, -1, param7);
              var24 = var26;
              var22 = var24;
              var20 = var22;
              var11 = var20;
              if (var18 == null) {
                param0 = param0 + 640 * (-param6 + param4);
                var12 = param5;
                L2: while (true) {
                  if (~param2 >= ~var12) {
                    break L1;
                  } else {
                    param8[var12] = ae.a(255, (param7 << 5) - -var12);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                var12_ref_int__ = dd.field_a[((oe) this).field_P].field_B;
                if (var18 != si.field_v) {
                  var13 = param6;
                  L3: while (true) {
                    if (~var13 <= ~param4) {
                      break L1;
                    } else {
                      var14 = var27[var13];
                      var19 = param5;
                      var15 = var19;
                      L4: while (true) {
                        if (~var19 <= ~param2) {
                          param0 += 640;
                          var13++;
                          continue L3;
                        } else {
                          L5: {
                            if ((1 & var14 >>> var19) == 0) {
                              param8[var19] = ae.a(var19 + (param7 << 5), 255);
                              break L5;
                            } else {
                              if (param8[var19] < 3840) {
                                L6: {
                                  if (param0 - -var19 < 0) {
                                    break L6;
                                  } else {
                                    if (var11 == null) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if (si.field_v == var11) {
                                          break L7;
                                        } else {
                                          if ((1 & var26[var13] >>> var19) != 0) {
                                            break L7;
                                          } else {
                                            param8[var19] = param8[var19] + 256;
                                            break L5;
                                          }
                                        }
                                      }
                                      var16 = var12_ref_int__[param8[var19]];
                                      if (var16 != 0) {
                                        em.field_i[param0 + var19] = var16;
                                        break L6;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                                param8[var19] = param8[var19] + 256;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var19++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var13 = param6;
                  L8: while (true) {
                    if (var13 >= param4) {
                      break L1;
                    } else {
                      var14 = 0;
                      var15 = param5;
                      L9: while (true) {
                        if (~var15 <= ~param2) {
                          if (var14 != 0) {
                            param0 += 640;
                            var13++;
                            continue L8;
                          } else {
                            param0 = param0 + 640 * (-var13 + param4);
                            break L1;
                          }
                        } else {
                          L10: {
                            if (param8[var15] < 3840) {
                              L11: {
                                if (0 > var15 + param0) {
                                  break L11;
                                } else {
                                  if (var11 == null) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (si.field_v == var11) {
                                        break L12;
                                      } else {
                                        if (0 != (var26[var13] >>> var15 & 1)) {
                                          break L12;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var16 = var12_ref_int__[param8[var15]];
                                    if (var16 != 0) {
                                      em.field_i[param0 + var15] = var16;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              var14 = 1;
                              param8[var15] = param8[var15] + 256;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var15++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_44_0 = param0;
            stackIn_45_0 = stackOut_44_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var10 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var10;
            stackOut_46_1 = new StringBuilder().append("oe.SD(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(0).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param8 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L13;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L13;
            }
          }
          throw t.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 41);
        }
        return stackIn_45_0;
    }

    private final void m(int param0) {
        tj var3 = null;
        tj var4 = null;
        tj var5 = null;
        tj var6 = null;
        tj var7 = null;
        if (!hi.a(((oe) this).field_fc, -2)) {
            return;
        }
        if (((oe) this).field_Pb == 0) {
            sa.a(1, (byte) -86);
        }
        if (!(((oe) this).field_Pb != 0)) {
            var3 = new tj(ma.field_c, ae.field_c, se.field_a, false);
            re.a(1820, var3);
        }
        if (!(2 != ((oe) this).field_Pb)) {
            var4 = new tj(bg.field_c, ae.field_c, ae.field_e, false);
            re.a(1820, var4);
        }
        if (4 == ((oe) this).field_Pb) {
            var5 = new tj(na.field_i, ae.field_c, co.field_e, false);
            re.a(1820, var5);
        }
        if (!(param0 != ~((oe) this).field_Pb)) {
            var6 = new tj(bj.field_F, ae.field_c, me.field_g, false);
            re.a(param0 + 1829, var6);
        }
        if (!(((oe) this).field_Pb != 12)) {
            var7 = new tj(vl.field_c, ae.field_c, tl.field_t, false);
            re.a(1820, var7);
        }
    }

    private final boolean a(byte param0, int param1, int param2) {
        double var4 = 0.0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        L0: {
          var25 = EscapeVector.field_A;
          var4 = 0.02454369260617026 * (double)((oe) this).field_I;
          var6 = (int)(2048.0 * Math.sin(var4));
          var7 = -(int)(Math.cos(var4) * 2048.0);
          var8 = -var7;
          var9 = var6;
          var10 = ((oe) this).field_H >> 5;
          var10 = var10 + (((oe) this).field_n << 11);
          var11 = ((oe) this).field_p >> 5;
          var12 = var6 * 10 + var10;
          var13 = -(2 * var6) + var10;
          var14 = var11 + var7 * 10;
          var15 = var11 - var7 * 2;
          var16 = var10 - 6 * var6 + -(var8 * 8);
          var17 = var8 * 8 + var10 + -(6 * var6);
          var18 = -(var9 * 8) + (var11 - var7 * 6);
          var19 = -(6 * var7) + (var11 + 8 * var9);
          var20 = 0;
          var21 = var12;
          if (var16 >= var21) {
            break L0;
          } else {
            var21 = var16;
            break L0;
          }
        }
        L1: {
          if (var21 <= var17) {
            break L1;
          } else {
            var21 = var17;
            break L1;
          }
        }
        L2: {
          var22 = var14;
          if (var22 > var18) {
            var22 = var18;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var19 < var22) {
            var22 = var19;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var23 = var12;
          if (~var16 >= ~var23) {
            break L4;
          } else {
            var23 = var16;
            break L4;
          }
        }
        L5: {
          if (var17 <= var23) {
            break L5;
          } else {
            var23 = var17;
            break L5;
          }
        }
        L6: {
          var24 = var14;
          if (var18 <= var24) {
            break L6;
          } else {
            var24 = var18;
            break L6;
          }
        }
        L7: {
          if (~var24 > ~var19) {
            var24 = var19;
            break L7;
          } else {
            break L7;
          }
        }
        param2 = param2 << 11;
        param1 = param1 << 11;
        L8: while (true) {
          if (var21 <= param2) {
            L9: {
              if (~var23 > ~param2) {
                break L9;
              } else {
                if (param1 < var22) {
                  break L9;
                } else {
                  if (~var24 > ~param1) {
                    break L9;
                  } else {
                    L10: {
                      if ((param2 + -var13) * (var14 - var15) < (var12 - var13) * (param1 + -var15)) {
                        if ((param2 + -var17) * (-var19 + var14) > (-var19 + param1) * (-var17 + var12)) {
                          if ((var13 + -var17) * (param1 + -var19) > (-var17 + param2) * (var15 - var19)) {
                            this.h((byte) -118);
                            return true;
                          } else {
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      } else {
                        if ((-var16 + param2) * (-var18 + var14) >= (-var18 + param1) * (-var16 + var12)) {
                          break L10;
                        } else {
                          if (~((param1 - var18) * (-var16 + var13)) > ~((-var16 + param2) * (-var18 + var15))) {
                            this.h((byte) -62);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
            }
            return false;
          } else {
            param2 = param2 + (((oe) this).field_n << 11);
            continue L8;
          }
        }
    }

    private final boolean n(byte param0) {
        if (param0 < 26) {
            return false;
        }
        int var2 = 1;
        if (6 == ((oe) this).field_Yb) {
            int discarded$5 = 0;
            var2 = fg.c() ? 1 : 0;
        }
        var2 = var2 != 0 & mm.a(4, ((oe) this).field_P) ? 1 : 0;
        return var2 != 0;
    }

    final int m(byte param0) {
        if (4 > ((oe) this).field_Pb) {
            return 0;
        }
        if (!(((oe) this).field_Pb >= 12)) {
            return 1;
        }
        if (param0 != -84) {
            return -54;
        }
        return 2;
    }

    private final void a(byte[] param0) {
        try {
            IOException var3 = null;
            RuntimeException var3_ref = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
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
                {
                  L1: {
                    int discarded$1 = 0;
                    this.a((InputStream) (Object) new ByteArrayInputStream(param0));
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var3_ref;
                stackOut_4_1 = new StringBuilder().append("oe.OD(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 100 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean k(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ed var8 = null;
        L0: {
          var7 = EscapeVector.field_A;
          if (((oe) this).field_Ub < 0) {
            break L0;
          } else {
            if (0 != ((oe) this).field_e) {
              break L0;
            } else {
              var8 = mb.field_f[((oe) this).field_Ub];
              var5 = ((oe) this).field_n + ((((oe) this).field_mb - (var8.field_A << 15) >> 16) + var8.field_q);
              var6 = (-(var8.field_z << 15) + ((oe) this).field_E >> 16) - -var8.field_v;
              L1: while (true) {
                if (~param1 <= ~var5) {
                  L2: {
                    if (~param1 <= ~(var8.field_s + var5)) {
                      break L2;
                    } else {
                      if (~param2 > ~var6) {
                        break L2;
                      } else {
                        if (~param2 > ~(var6 + var8.field_x)) {
                          if (var8.field_B[param1 + (param2 - var6) * var8.field_x + -var5] == 0) {
                            return false;
                          } else {
                            this.k((byte) 81);
                            return true;
                          }
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  return false;
                } else {
                  param1 = param1 + ((oe) this).field_n;
                  continue L1;
                }
              }
            }
          }
        }
        return false;
    }

    final static void c(boolean param0, int param1) {
        pg.field_b = true;
        if (param1 != 2560) {
            oe.c((byte) 49);
        }
        hm.field_o = new pf(param0);
        di.field_d = null;
        mj.field_d = 0;
        gi.a((byte) -93);
    }

    final void j(int param0) {
        int discarded$0 = 94;
        this.e();
        if (param0 != 256) {
            this.b(63, -69, (byte) -63);
        }
        int discarded$1 = 10974;
        this.l();
    }

    private final void k() {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            {
              L0: {
                int discarded$1 = 0;
                this.a((InputStream) (Object) new ByteArrayInputStream(((oe) this).field_Nb[((oe) this).field_Pb]));
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final oc i(int param0, int param1) {
        int discarded$0 = 8192;
        int var3 = this.n() ? 1 : 0;
        int discarded$1 = 8;
        return ma.a(param0, var3 != 0);
    }

    private final boolean a(int[] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
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
            if (si.field_v == param0) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                if ((param0[param3] & 1 << param1) == 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("oe.LF(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + -74 + 44 + param3 + 41);
        }
        return stackIn_9_0 != 0;
    }

    private final boolean n() {
        return ((oe) this).field_P == 4;
    }

    private final oc a(sa param0) {
        int var3_int = 0;
        RuntimeException var3 = null;
        oc var4 = null;
        oc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        oc stackOut_0_0 = null;
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
            int discarded$2 = 8192;
            var3_int = this.n() ? 1 : 0;
            var4 = ee.a(param0, 14, var3_int != 0);
            ((oe) this).field_vb.a(-12328, (hg) (Object) var4);
            stackOut_0_0 = (oc) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("oe.AC(");
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
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 42 + 41);
        }
        return stackIn_1_0;
    }

    private final void b(int param0, int param1, byte param2) {
        ed var4 = null;
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        if (!(((oe) this).field_Pb >= 0)) {
            var4 = qf.field_d;
            if (var4 == null) {
                return;
            }
            for (var5 = -param0; var5 > -1024; var5 -= 1024) {
            }
            while (var5 < 640) {
                var4.e(480 - -var5, -param1);
                var5 += 1024;
            }
        }
        if (param2 != -14) {
            ((oe) this).field_fb = null;
        }
    }

    private final void f(int param0, int param1) {
        if (!(((oe) this).field_l != 0)) {
            return;
        }
        if (!(param1 == ((oe) this).field_l)) {
            return;
        }
        ((oe) this).field_a = true;
        int var3 = 100;
        if (param1 == 3) {
            var3 = 164;
        }
        this.a(var3, (byte) 72, di.field_c);
        int var4 = -77 / ((param0 - -30) / 34);
    }

    private final void e(int param0, int param1, int param2) {
        int var10 = EscapeVector.field_A;
        if (!(dd.field_a[((oe) this).field_P] != null)) {
            return;
        }
        while (0 > param2) {
            param2 = param2 + ((oe) this).field_n;
        }
        int var4 = 31 + param2 >> 5;
        int var5 = param0 + 16 >> 5;
        int var6 = param2 - -640 >> 5;
        int var7 = param0 + 480 >> 5;
        int var8 = -param2 + (var4 << 5);
        if (0 < var8) {
            this.a(-1 + var4, var5, param0, var7, 32 - var8, param2, 10943, 32);
        }
        int var9 = var4;
        if (param1 != 8192) {
            ((oe) this).field_fc = -7;
        }
        while (~var6 < ~var9) {
            this.a(var9, var5, param0, var7, 0, param2, param1 + 2751, 32);
            var9++;
        }
        var9 = 31 & -var8 + 640;
        if (!(var9 <= 0)) {
            this.a(var6, var5, param0, var7, 0, param2, 10943, var9);
        }
    }

    private final void F() {
        int var2 = 0;
        int var3 = 0;
        hg var4 = null;
        int var5 = 0;
        vh var6 = null;
        hg var7 = null;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        var2 = 0;
        var3 = 0;
        var4 = ((oe) this).field_G.a(false);
        var5 = 0;
        L0: while (true) {
          if (((oe) this).field_x <= var5) {
            ((oe) this).field_x = ((oe) this).field_x - var3;
            return;
          } else {
            L1: {
              var6 = (vh) (Object) var4;
              if (!var6.field_h) {
                var4 = var4.field_b;
                break L1;
              } else {
                L2: {
                  var6.d(-37);
                  var3++;
                  if (0 == ((oe) this).field_x + -var3) {
                    ((oe) this).field_nb = null;
                    break L2;
                  } else {
                    if (((oe) this).field_nb == var4) {
                      ((oe) this).field_nb = var4.field_d;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = var4;
                var4 = var4.field_b;
                var7.c((byte) -14);
                ((oe) this).field_G.a(-12328, var7);
                break L1;
              }
            }
            var5++;
            continue L0;
          }
        }
    }

    private final void f(boolean param0) {
        int var2 = ((oe) this).field_ob + ((oe) this).field_J;
        ce.field_f.d((byte) -101, ((oe) this).field_fc, var2);
    }

    private final void e() {
        tj var9 = null;
        tj var5 = null;
        tj var6 = null;
        tj var7 = null;
        tj var8 = null;
        int var4 = EscapeVector.field_A;
        if (!hi.a(((oe) this).field_fc, -2)) {
            return;
        }
        int var2 = -95;
        if (((oe) this).field_Pb < 2) {
            var5 = new tj(ma.field_c, ae.field_c, se.field_a, false);
            re.a(1820, var5);
        } else {
            if (((oe) this).field_Pb < 4) {
                var6 = new tj(bg.field_c, ae.field_c, ae.field_e, false);
                re.a(1820, var6);
            } else {
                if (((oe) this).field_Pb < 8) {
                    var7 = new tj(na.field_i, ae.field_c, co.field_e, false);
                    re.a(1820, var7);
                } else {
                    if (((oe) this).field_Pb < 12) {
                        var8 = new tj(bj.field_F, ae.field_c, me.field_g, false);
                        re.a(1820, var8);
                    } else {
                        var9 = new tj(vl.field_c, ae.field_c, tl.field_t, false);
                        re.a(1820, var9);
                    }
                }
            }
        }
    }

    private final void a(int param0, String param1) {
        try {
            int var3_int = -72 / ((param0 - -38) / 58);
            this.a(100, (byte) 91, param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.QB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, hl param1) {
        if (!(param1 != null)) {
            return;
        }
        try {
            if (param0 != 4) {
                Object var4 = null;
                boolean discarded$0 = this.a((ed) null, -82, -79, -108, -58, 107, 91, -47);
            }
            param1.f(0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.JB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final int b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int[] var9 = null;
        ed var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var16 = EscapeVector.field_A;
          var20 = this.a(param3, -1, param1);
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var9 = var17;
          if (var9 == null) {
            param5 = param5 + (-param2 + param6) * 640;
            break L0;
          } else {
            L1: {
              var10 = tk.field_a[((oe) this).field_P];
              var11 = var10.field_B;
              var12 = (param1 << 5) % var10.field_s + (param2 + (param3 << 5)) % var10.field_x * var10.field_s;
              if (si.field_v == var9) {
                var13 = param2;
                L2: while (true) {
                  if (~var13 <= ~param6) {
                    break L1;
                  } else {
                    var14 = param0;
                    L3: while (true) {
                      if (param4 <= var14) {
                        var12 = var12 + var10.field_s;
                        param5 += 640;
                        var13++;
                        continue L2;
                      } else {
                        em.field_i[var14 + param5] = var11[var12 - -var14];
                        var14++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var13 = param2;
                L4: while (true) {
                  if (param6 <= var13) {
                    break L1;
                  } else {
                    var14 = var20[var13];
                    var15 = param0;
                    L5: while (true) {
                      if (~var15 <= ~param4) {
                        var12 = var12 + var10.field_s;
                        param5 += 640;
                        var13++;
                        continue L4;
                      } else {
                        L6: {
                          if (0 != (var14 >>> var15 & 1)) {
                            em.field_i[var15 + param5] = var11[var12 - -var15];
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var15++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        }
        return param5;
    }

    private final String r(int param0) {
        return wk.a(ah.field_l, false, sm.field_d, da.field_d[((oe) this).field_P], fi.field_j);
    }

    private final void c(int param0, int param1, int param2) {
        ed var4 = sl.field_b[((oe) this).field_Yb][3];
        int var5 = -128;
        if (var4 != null) {
            param1 = param1 + var4.field_z;
        }
        ed var6 = pf.field_g[((oe) this).field_Yb];
        if (!(var6 != null)) {
            return;
        }
        this.a(true, false, 94, var6, param1, param0);
    }

    private final void a(int param0, DataInputStream param1, boolean param2) throws IOException {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        sa var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            ((oe) this).field_L = 0;
            ((oe) this).field_k = null;
            ((oe) this).field_S = 0;
            ((oe) this).field_Ab = null;
            var4_int = param1.readUnsignedByte();
            ((oe) this).field_kb.setSize(var4_int);
            var5 = 0;
            L1: while (true) {
              if (~var4_int >= ~var5) {
                break L0;
              } else {
                L2: {
                  var6 = this.a(param1, (byte) -67, var5, param0);
                  ((oe) this).field_kb.setElementAt((Object) (Object) var6, var5);
                  if (var6.e((byte) -5)) {
                    ((oe) this).field_L = ((oe) this).field_L + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("oe.UA(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 1 + 41);
        }
    }

    final boolean g(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (((oe) this).field_Q == 0) {
          L0: {
            L1: {
              if (!((oe) this).field_Ib) {
                break L1;
              } else {
                if (1 != ((oe) this).field_Ub) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          if (((oe) this).field_Q != 1) {
            if (param0 <= -14) {
              return false;
            } else {
              ((oe) this).field_Nb = null;
              return false;
            }
          } else {
            L2: {
              L3: {
                if (!((oe) this).field_Ib) {
                  break L3;
                } else {
                  if (!this.e(119)) {
                    break L3;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
              }
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            }
            return stackIn_12_0 != 0;
          }
        }
    }

    final void e(int param0, int param1) {
        if (param0 < 0) {
            return;
        }
        if (param0 >= ((oe) this).field_Nb.length) {
            return;
        }
        ((oe) this).field_Pb = param0;
        this.a(false, ((oe) this).field_Nb[param0], true);
        int var3 = 20 / ((28 - param1) / 51);
    }

    private final void w(int param0) {
        int var3 = 0;
        L0: {
          var3 = EscapeVector.field_A;
          if (0 == ((oe) this).field_Q) {
            if (this.e(true)) {
              ((oe) this).field_Ib = true;
              if (1 != ((oe) this).field_Ub) {
                L1: {
                  if (0 <= ((oe) this).field_Pb) {
                    break L1;
                  } else {
                    if (!((oe) this).field_ec) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                this.a(-98, ki.field_I);
                break L0;
              } else {
                L2: {
                  vj.b(97);
                  pl.field_n.a(jh.field_k, 100, qm.field_c * 6144 / 64, 8192);
                  if (!((oe) this).field_rc) {
                    break L2;
                  } else {
                    L3: {
                      if (((oe) this).field_Pb >= 0) {
                        ((oe) this).field_c = -150;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    int discarded$2 = 6324320;
                    this.x();
                    this.t(7);
                    break L2;
                  }
                }
                this.b((byte) -109, 1);
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (((oe) this).field_Q == 1) {
            if (!this.e(98)) {
              if (this.e(true)) {
                ((oe) this).field_Ib = true;
                pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                this.a(-101, jl.field_c);
                break L4;
              } else {
                break L4;
              }
            } else {
              L5: {
                if (!this.i(-108)) {
                  break L5;
                } else {
                  if (this.e(true)) {
                    break L5;
                  } else {
                    return;
                  }
                }
              }
              L6: {
                ((oe) this).field_Ib = true;
                vj.b(104);
                pl.field_n.a(jh.field_k, 100, 6144 * qm.field_c / 64, 8192);
                if (((oe) this).field_rc) {
                  L7: {
                    if (0 <= ((oe) this).field_Pb) {
                      ((oe) this).field_c = -150;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  int discarded$3 = 6324320;
                  this.x();
                  this.t(7);
                  break L6;
                } else {
                  break L6;
                }
              }
              this.b((byte) -124, 1);
              break L4;
            }
          } else {
            break L4;
          }
        }
    }

    private final void a(int param0, byte param1, String param2) {
        rb var4 = null;
        try {
            var4 = new rb(param2, param0);
            if (param1 <= 52) {
                int[] discarded$0 = this.a(-114, (byte) -86, 65);
            }
            ((oe) this).field_tc.a(-12328, (hg) (Object) var4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.SB(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        if (param1 == 12) {
            var3 = 1;
        }
        if (param1 == 13) {
            var3 = 5;
        }
        if (!(0 != var3)) {
            return;
        }
        String var4 = this.d(false, var3);
        this.a(-110, var4);
        ((oe) this).field_tb = ((oe) this).field_tb + var3;
        bf.a(var3, -15655);
    }

    final void y(byte param0) {
        this.m(-9);
        if (param0 != -40) {
            ((oe) this).field_dc = -86;
        }
        int discarded$0 = -122;
        this.C();
    }

    private final void a(int param0, DataInputStream param1, int param2) throws IOException {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            ((oe) this).field_qb = 512;
            if (param2 < 8) {
              return;
            } else {
              L1: {
                var4_int = param1.readUnsignedShort();
                if (var4_int == 512) {
                  ((oe) this).field_qb = 512;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4_int == 768) {
                  ((oe) this).field_qb = 768;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (16 != var4_int) {
                  break L3;
                } else {
                  ((oe) this).field_qb = 16;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("oe.RB(").append(512).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    private final rb B(int param0) {
        if (((oe) this).field_tc == null) {
            return null;
        }
        if (((oe) this).field_tc.a(-97)) {
            return null;
        }
        hg var2 = ((oe) this).field_tc.a(false);
        if (var2 == null) {
            return null;
        }
        var2.c((byte) -59);
        return (rb) (Object) var2;
    }

    private final int a(int param0, int param1) {
        int var3 = 51 / ((-3 - param0) / 63);
        return param1 & 255;
    }

    private final void E() {
        tj var2 = null;
        String var2_ref = null;
        String var3 = null;
        ed[] var4 = null;
        String[] var5 = null;
        tj var6 = null;
        if (!(!hi.a(((oe) this).field_fc, -2))) {
            var2 = new tj(fn.field_e, ae.field_c, mb.field_b, true);
            var2.field_m = false;
            re.a(1820, var2);
        }
        if (!(((oe) this).field_fc != 2)) {
            var2_ref = "vengeance_concl";
            var3 = "scene";
            var4 = ug.field_a;
            var5 = de.field_h;
            var6 = new tj(var2_ref, var3, var4, var5, true);
            re.a(1820, var6);
        }
    }

    private final boolean t() {
        int var5 = 0;
        ce var6 = null;
        int var2 = 1;
        int var3 = this.c(true);
        boolean[] var4 = wk.field_b;
        if (var4 != null) {
            if (var3 >= 0) {
                if (~var4.length < ~var3) {
                    var2 = var4[var3] ? 1 : 0;
                }
            }
        }
        if (!(null == ((oe) this).field_Db)) {
            var5 = 0;
            var6 = ((oe) this).field_Db.b(true);
            if (!(var6 == null)) {
                var2 = var5;
            }
        }
        return var2 != 0;
    }

    private final int s() {
        int var5 = 0;
        int var2 = -1;
        int var3 = this.c(true);
        int[] var4 = wi.field_h;
        if (var4 != null) {
            if (var3 >= 0) {
                if (var3 < var4.length) {
                    if (var4[var3] >= 0) {
                        var2 = var4[var3];
                    }
                }
            }
        }
        if (!(null == ((oe) this).field_Db)) {
            var5 = ((oe) this).field_Db.c(true);
            if (var5 >= 0) {
                var2 = var5;
            }
        }
        return var2;
    }

    private final void o() {
        int var2 = 0;
        if (((oe) this).field_Bb) {
            int var3 = 10053375;
            int discarded$0 = 48;
            em.g(319, 239, 10);
            int discarded$1 = 48;
            em.g(320, 239, 10);
            int discarded$2 = 48;
            em.g(319, 240, 10);
            int discarded$3 = 48;
            em.g(320, 240, 10);
        }
    }

    private final void i(int param0, int param1, int param2) {
        param2 -= 64;
        int discarded$0 = 90;
        this.a(this.r(), false, 117, sl.field_b[((oe) this).field_Yb][0], (-param2 >> 3) - (((oe) this).field_pc >> 1), -param1 >> 3);
        int var4 = 26 / ((16 - param0) / 39);
        this.h(-1, param2);
        this.a(false, false, 124, sl.field_b[((oe) this).field_Yb][1], -param2 * 5 >> 3, 5 * -param1 >> 3);
        this.a(false, false, 74, sl.field_b[((oe) this).field_Yb][2], -param2 + (param2 >> 2), (param1 >> 2) + -param1);
        this.a(false, true, 92, sl.field_b[((oe) this).field_Yb][3], (param2 >> 3) - param2, -param1 + (param1 >> 3));
        this.c(-param1 + (param1 >> 3), -param2 + (param2 >> 3), -36);
        this.g(param2, -7778, param1);
    }

    private final void a(boolean param0, int param1, InputStream param2) throws IOException {
        DataInputStream var6 = null;
        int var5 = 0;
        try {
            var6 = new DataInputStream(param2);
            var5 = var6.readByte();
            int discarded$0 = 126;
            this.a(var5, var6);
            this.a(var5, -8277, var6);
            this.a(false, var5, 640, var6);
            this.a(var5, var6, true);
            int discarded$1 = -17;
            this.b(var5, var6);
            this.a((byte) 121, var6, var5);
            this.b(-112, var6, var5);
            int discarded$2 = 71;
            this.a(var6, var5);
            this.a(512, var6, var5);
            var6.close();
            ((oe) this).field_rb = false;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.FD(" + 0 + 44 + -1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0) {
        int var2 = 0;
        if (((oe) this).field_e > 0) {
            ((oe) this).field_e = ((oe) this).field_e - 1;
            if (!(((oe) this).field_e != 0)) {
                this.k(-123, ((oe) this).field_Ub);
                pl.field_n.a(nm.field_a, 100, qm.field_c * 6144 / 64, 8192);
                var2 = qj.a((byte) -38, ((oe) this).field_Ub, ((oe) this).field_fc);
                ((oe) this).field_J = ((oe) this).field_J + var2;
                v.a(8, var2);
                ((oe) this).field_Ub = -1;
                if (!(!((oe) this).field_rc)) {
                    ((oe) this).field_u = ((oe) this).field_u + 1;
                    int discarded$2 = 119;
                    mh.a();
                    if (((oe) this).field_u == 19) {
                        ((oe) this).a(((oe) this).field_fc, false, 11, 244);
                    }
                }
            }
        }
    }

    private final boolean a(ed param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_5_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param6 == 31) {
              if ((param5 ^ param2) >> 5 == 0) {
                stackOut_9_0 = this.a(-(31 & param2), param0, param3, param1, param6 + -32, 31 & param2, param2 >> 5, param5 & 31, param7, param4);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (!this.a(-(31 & param2), param0, param3, param1, -1, 31 & param2, param2 >> 5, 31, param7, param4)) {
                  stackOut_7_0 = this.a(-param2 & 31, param0, param3, param1, -1, 0, param5 >> 5, 31 & param5, param7, param4);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var9;
            stackOut_11_1 = new StringBuilder().append("oe.RA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_10_0;
    }

    private final int g() {
        int var3 = 0;
        int var4 = EscapeVector.field_A;
        int var2 = 0;
        for (var3 = 0; var3 < ((oe) this).field_fc; var3++) {
            var2 = var2 + je.a(false, var3);
        }
        var2 = var2 + ((oe) this).field_Pb;
        return var2;
    }

    private final void p(byte param0) {
        ed var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ed var3_ref_ed = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        sa var8 = null;
        L0: {
          var7 = EscapeVector.field_A;
          if (((oe) this).field_Pb >= 0) {
            break L0;
          } else {
            if (((oe) this).field_zb) {
              break L0;
            } else {
              if (((oe) this).field_z <= 0) {
                L1: {
                  if (((oe) this).field_Gb) {
                    break L1;
                  } else {
                    if (((oe) this).field_Ib) {
                      break L1;
                    } else {
                      if (((oe) this).field_ec) {
                        break L1;
                      } else {
                        L2: {
                          if (((oe) this).field_ab >= 60) {
                            break L2;
                          } else {
                            L3: {
                              if (((oe) this).field_y != 0) {
                                break L3;
                              } else {
                                if (58720256 > ((oe) this).field_p) {
                                  ((oe) this).field_y = 1;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            L4: {
                              if (((oe) this).field_y != 1) {
                                break L4;
                              } else {
                                if (!((oe) this).field_rb) {
                                  break L4;
                                } else {
                                  ((oe) this).field_y = 2;
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              if (((oe) this).field_y > 3) {
                                break L5;
                              } else {
                                if (((oe) this).field_p >= 33554432) {
                                  break L5;
                                } else {
                                  ((oe) this).field_y = 4;
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              L7: {
                                if (4 == ((oe) this).field_y) {
                                  break L7;
                                } else {
                                  if (((oe) this).field_y != 5) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (((oe) this).field_p < 33554432) {
                                break L6;
                              } else {
                                ((oe) this).field_y = 3;
                                break L6;
                              }
                            }
                            L8: {
                              if (4 != ((oe) this).field_y) {
                                break L8;
                              } else {
                                if (((oe) this).field_db) {
                                  ((oe) this).field_y = 5;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (((oe) this).field_Ub != 1) {
                                break L9;
                              } else {
                                if (((oe) this).field_y >= 6) {
                                  break L9;
                                } else {
                                  ((oe) this).field_y = 6;
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              var2_int = 0;
                              if (((oe) this).field_p >= 20971520) {
                                break L10;
                              } else {
                                if (((oe) this).field_y < 5) {
                                  break L10;
                                } else {
                                  if (0 >= ((oe) this).field_kb.size()) {
                                    break L10;
                                  } else {
                                    var8 = (sa) ((oe) this).field_kb.elementAt(0);
                                    if (var8.field_n == 8) {
                                      var2_int = 1;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            L11: {
                              if (var2_int != 0) {
                                ((oe) this).field_y = 7;
                                break L11;
                              } else {
                                if (((oe) this).field_y == 7) {
                                  if (((oe) this).field_Ub >= 0) {
                                    ((oe) this).field_y = 8;
                                    break L11;
                                  } else {
                                    ((oe) this).field_y = 5;
                                    break L11;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (((oe) this).field_y != 8) {
                              break L2;
                            } else {
                              if (20971520 > ((oe) this).field_p) {
                                break L2;
                              } else {
                                ((oe) this).field_y = 9;
                                break L2;
                              }
                            }
                          }
                        }
                        L12: {
                          if (~((oe) this).field_y == ~((oe) this).field_dc) {
                            break L12;
                          } else {
                            L13: {
                              if (((oe) this).field_Qb <= 0) {
                                break L13;
                              } else {
                                ((oe) this).field_Qb = ((oe) this).field_Qb - 1;
                                break L13;
                              }
                            }
                            if (((oe) this).field_Qb != 0) {
                              break L12;
                            } else {
                              ((oe) this).field_dc = ((oe) this).field_y;
                              var2 = ((oe) this).field_i;
                              ((oe) this).field_i.field_A = 638;
                              var2.field_s = 638;
                              var3_ref_ed = ((oe) this).field_i;
                              ((oe) this).field_i.field_z = 60;
                              var3_ref_ed.field_x = 60;
                              ((oe) this).field_i.g();
                              em.d();
                              fh.field_g.c(ic.field_k[3 * ((oe) this).field_y], 319, 20, 16777215, -1);
                              fh.field_g.c(ic.field_k[((oe) this).field_y * 3 + 1], 319, 40, 16777215, -1);
                              fh.field_g.c(ic.field_k[2 + ((oe) this).field_y * 3], 319, 60, 16777215, -1);
                              md.field_D.a(126);
                              break L12;
                            }
                          }
                        }
                        if (~((oe) this).field_dc != ~((oe) this).field_y) {
                          break L0;
                        } else {
                          if (((oe) this).field_Qb >= 31) {
                            break L0;
                          } else {
                            ((oe) this).field_Qb = ((oe) this).field_Qb + 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (-32 <= ((oe) this).field_c) {
                    break L14;
                  } else {
                    if (((oe) this).field_Qb >= 31) {
                      break L0;
                    } else {
                      break L14;
                    }
                  }
                }
                if (((oe) this).field_Qb > 0) {
                  ((oe) this).field_Qb = ((oe) this).field_Qb - 1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                L15: {
                  if (0 >= ((oe) this).field_Qb) {
                    break L15;
                  } else {
                    ((oe) this).field_Qb = ((oe) this).field_Qb - 1;
                    break L15;
                  }
                }
                if (((oe) this).field_Qb == 0) {
                  ((oe) this).field_zb = true;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L16: {
          if (param0 == 9) {
            break L16;
          } else {
            this.b(-119, (byte) 66, 9);
            break L16;
          }
        }
        L17: {
          L18: {
            if (((oe) this).field_Pb >= 0) {
              break L18;
            } else {
              if (!((oe) this).field_zb) {
                break L17;
              } else {
                break L18;
              }
            }
          }
          L19: {
            if (((oe) this).field_Qb > 0) {
              ((oe) this).field_Qb = ((oe) this).field_Qb - 1;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (((oe) this).field_Qb != 0) {
              break L20;
            } else {
              if (((oe) this).field_z > 0) {
                ((oe) this).field_d = 0;
                L21: while (true) {
                  L22: {
                    if (((oe) this).field_z <= 0) {
                      break L22;
                    } else {
                      if (((oe) this).field_d >= 3) {
                        break L22;
                      } else {
                        int fieldTemp$2 = ((oe) this).field_d;
                        ((oe) this).field_d = ((oe) this).field_d + 1;
                        ((oe) this).field_g[fieldTemp$2] = ((oe) this).field_Lb[0];
                        ((oe) this).field_z = ((oe) this).field_z - 1;
                        qg.a(((oe) this).field_Lb, 1, ((oe) this).field_Lb, 0, ((oe) this).field_z);
                        continue L21;
                      }
                    }
                  }
                  ((oe) this).field_i.field_A = -20 + ((oe) this).field_d * 160;
                  ((oe) this).field_i.field_s = -20 + ((oe) this).field_d * 160;
                  ((oe) this).field_Qb = 150;
                  ((oe) this).field_i.field_z = 40;
                  var2 = ((oe) this).field_i;
                  var2.field_x = 40;
                  ((oe) this).field_i.g();
                  em.d();
                  var3 = 0;
                  var4 = 0;
                  L23: while (true) {
                    if (~var4 <= ~((oe) this).field_d) {
                      md.field_D.a(113);
                      break L20;
                    } else {
                      var5 = ((oe) this).field_g[var4];
                      mi.field_m[var5].e(var3, 4);
                      var6 = 39 + -(fh.field_g.a(hk.field_r[var5], 100) * 10);
                      int discarded$3 = fh.field_g.a(hk.field_r[var5], var3 - -40, var6 + -fh.field_g.field_r, 100, 1000, 16777215, -1, 0, 0, 20);
                      var3 += 160;
                      var4++;
                      continue L23;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
          }
          L24: {
            if (((oe) this).field_Qb != 0) {
              break L24;
            } else {
              if (((oe) this).field_z != 0) {
                break L24;
              } else {
                if (0 > ((oe) this).field_Pb) {
                  ((oe) this).field_zb = false;
                  ((oe) this).field_dc = -1;
                  this.p((byte) 9);
                  break L24;
                } else {
                  break L17;
                }
              }
            }
          }
          break L17;
        }
    }

    private final ce w() {
        ce var5 = null;
        Object var2 = null;
        int var3 = this.c(true);
        ce[] var4 = rk.field_d;
        if (var4 != null) {
            if (var3 >= 0) {
                if (var4.length > var3) {
                    if (!(var4[var3] == null)) {
                        var2 = (Object) (Object) var4[var3];
                    }
                }
            }
        }
        if (((oe) this).field_Db != null) {
            var5 = ((oe) this).field_Db.b(true);
            if (!(var5 == null)) {
                var2 = (Object) (Object) var5;
            }
        }
        return (ce) var2;
    }

    private final sa b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        sa var4 = null;
        int var5 = 0;
        var5 = EscapeVector.field_A;
        if (((oe) this).field_kb != null) {
          var2 = ((oe) this).field_kb.size();
          var3 = 0;
          L0: while (true) {
            if (var2 > var3) {
              var4 = (sa) ((oe) this).field_kb.elementAt(var3);
              if (var4.field_n != 1) {
                var3++;
                continue L0;
              } else {
                return var4;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, byte param1) {
        if (param0 != 5) {
            return;
        }
        String var3 = b.field_a;
        this.a(-110, var3);
    }

    private final void b(byte param0, int param1) {
        if (aj.b(-100)) {
            return;
        }
        if (od.field_k) {
            return;
        }
        int discarded$0 = 20824;
        int var3 = this.g();
        if (param0 >= -99) {
            ((oe) this).field_F = true;
        }
        if (!(var3 >= 0)) {
            return;
        }
        int var4 = ((oe) this).field_sb / (th.field_p + 1);
        if (!(var4 >= 0)) {
            return;
        }
        int discarded$1 = 1;
        ua.a(var3, var4, param1);
    }

    private final void j(int param0, int param1, int param2) {
        int var5 = 0;
        sa var6 = null;
        ed var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        int var4 = 27;
        for (var5 = 0; ((oe) this).field_kb.size() > var5; var5++) {
            var6 = (sa) ((oe) this).field_kb.elementAt(var5);
            if (var6.field_n != 6) {
                if (!(var6.field_n == 7)) {
                    var7 = var6.field_i;
                    var8 = var7.field_v + var6.field_g;
                    if (param1 >= var8) {
                        if (param1 < var7.field_x + var8) {
                            var9 = var6.field_k + var7.field_q;
                            while (~param2 < ~var9) {
                                var9 = var9 + ((oe) this).field_n;
                            }
                            while (param2 < var9) {
                                var9 = var9 - ((oe) this).field_n;
                            }
                            if (!(~(var7.field_s + var9) >= ~param2)) {
                                if (!(var7.field_B[(param1 - var8) * var7.field_s + (-var9 + param2)] == 0)) {
                                    this.a(var6, -120, var5);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = 0;
        ic var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ed var9 = null;
        int var10 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var10 = EscapeVector.field_A;
        int discarded$2 = 8192;
        var4 = this.n() ? 1 : 0;
        var5 = (ic) (Object) ((oe) this).field_N.a(false);
        L0: while (true) {
          if (var5 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (null == var5.field_m) {
                  break L2;
                } else {
                  if ((65536 & var5.field_m.field_r) == 0) {
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
            var6 = stackIn_6_0;
            var7 = -16 + (var5.field_p >> 16) - param0;
            var8 = -param1 + (var5.field_q >> 16) - 16;
            L3: while (true) {
              if (~-od.field_b.field_A <= ~var7) {
                var7 = var7 + ((oe) this).field_n;
                L4: while (true) {
                  if (640 <= var7) {
                    var5 = (ic) (Object) ((oe) this).field_N.b((byte) 70);
                    continue L0;
                  } else {
                    L5: {
                      var9 = s.field_H;
                      if (var4 == 0) {
                        break L5;
                      } else {
                        if (null == ka.field_a) {
                          break L5;
                        } else {
                          var9 = ka.field_a;
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var9.e(8 + var7, var8 + 8);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        od.field_b.c(var7, var8, 128);
                        break L6;
                      }
                    }
                    var7 = var7 + ((oe) this).field_n;
                    continue L4;
                  }
                }
              } else {
                var7 = var7 - ((oe) this).field_n;
                continue L3;
              }
            }
          }
        }
    }

    private final void a(ed param0, int param1, int param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var19 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              param2 = param2 + param0.field_q;
              param1 = param1 + param0.field_v;
              var5_int = -1 + param2 + param0.field_s;
              var6 = -1 + param0.field_x + param1;
              var7 = ((oe) this).field_H >> 5;
              var9 = 0;
              var7 = var7 + (((oe) this).field_n << 11);
              var8 = ((oe) this).field_p >> 5;
              var10 = var7 - 24576;
              var11 = -24576 + var8;
              var12 = 24576 + var7;
              var13 = var8 - -24576;
              var12 = var12 >> 11;
              var10 = var10 >> 11;
              var11 = var11 >> 11;
              if (var10 >= param2) {
                break L1;
              } else {
                var10 = param2;
                break L1;
              }
            }
            L2: {
              if (var5_int < var12) {
                var12 = var5_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var13 = var13 >> 11;
              if (var11 < param1) {
                var11 = param1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (~var6 <= ~var13) {
                break L4;
              } else {
                var13 = var6;
                break L4;
              }
            }
            var14 = var11;
            L5: while (true) {
              if (var14 > var13) {
                break L0;
              } else {
                var15 = var10;
                L6: while (true) {
                  if (var12 < var15) {
                    var14++;
                    continue L5;
                  } else {
                    L7: {
                      var16 = (var15 << 11) - var7;
                      var17 = -var8 + (var14 << 11);
                      var18 = var16 * var16 + var17 * var17;
                      if (var18 >= 603979776) {
                        break L7;
                      } else {
                        if (param0.field_B[-param2 + ((var14 - param1) * param0.field_s + var15)] == 0) {
                          break L7;
                        } else {
                          ((oe) this).field_Hb = ((oe) this).field_Hb + var16;
                          ((oe) this).field_pb = ((oe) this).field_pb + var17;
                          break L7;
                        }
                      }
                    }
                    var15++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("oe.NC(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 44 + param2 + 44 + 83 + 41);
        }
    }

    private final void o(int param0) {
        int discarded$0 = 102;
        this.u();
        this.v(-33);
    }

    private final void a(int param0, int param1, byte param2) {
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        if (!(tk.field_a[((oe) this).field_P] != null)) {
            return;
        }
        while (param1 < 0) {
            param1 = param1 + ((oe) this).field_n;
        }
        int var4 = 31 + param1 >> 5;
        int var5 = param0 - -31 >> 5;
        int var6 = 640 + param1 >> 5;
        int var7 = 480 + param0 >> 5;
        int var8 = (var4 << 5) + -param1;
        if (!(var8 <= 0)) {
            this.c(-var8 + 32, param0, var4 - 1, 1395798865, param1, var5, var7, 32);
        }
        for (var9 = var4; var9 < var6; var9++) {
            this.c(0, param0, var9, 1395798865, param1, var5, var7, 32);
        }
        var9 = -var8 + 640 & 31;
        if (!(0 >= var9)) {
            this.c(0, param0, var6, 1395798865, param1, var5, var7, var9);
        }
    }

    private final void b(boolean param0, int param1) {
        if (!(param1 == 11)) {
            return;
        }
        ((oe) this).field_ib = 2550;
        int discarded$0 = -64;
        bh.c();
        this.a(113, oh.field_g);
    }

    private final void a(boolean param0, boolean param1, int param2, ed param3, int param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (param3 != null) {
              param4 -= 48;
              L1: while (true) {
                L2: {
                  if (param4 >= 480) {
                    break L2;
                  } else {
                    L3: while (true) {
                      if (param5 <= 0) {
                        L4: while (true) {
                          if (param5 >= 640) {
                            param4 = param4 + param3.field_z;
                            if (!param0) {
                              break L2;
                            } else {
                              continue L1;
                            }
                          } else {
                            param3.e(param5, param4);
                            param5 = param5 + param3.field_A;
                            continue L4;
                          }
                        }
                      } else {
                        param5 = param5 - param3.field_A;
                        continue L3;
                      }
                    }
                  }
                }
                L5: {
                  if (!param1) {
                    break L5;
                  } else {
                    if (480 > param4) {
                      var7_int = param3.field_B[(-1 + param3.field_x) * param3.field_s];
                      em.a(0, param4, 640, 480 + -param4, var7_int);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (param2 >= 66) {
                    break L6;
                  } else {
                    oe.c((byte) -67);
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var7;
            stackOut_18_1 = new StringBuilder().append("oe.HD(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final void b(int param0, DataInputStream param1, int param2) throws IOException {
        RuntimeException runtimeException = null;
        int var4_int = 0;
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
            L1: {
              if (param2 < 4) {
                ((oe) this).field_gc = 150;
                break L1;
              } else {
                ((oe) this).field_gc = param1.readInt();
                if (((oe) this).field_gc > 0) {
                  break L1;
                } else {
                  ((oe) this).field_gc = 150;
                  break L1;
                }
              }
            }
            var4_int = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("oe.HF(").append(-112).append(44);
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
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        sa var4 = null;
        int var5_int = 0;
        en var5 = null;
        sa var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        sa var10 = null;
        var9 = EscapeVector.field_A;
        ((oe) this).field_ub = 0;
        ((oe) this).field_b = false;
        var3 = 0;
        L0: while (true) {
          if (~((oe) this).field_kb.size() >= ~var3) {
            L1: {
              var3 = -109 % ((-71 - param1) / 35);
              int discarded$4 = -101;
              this.b();
              ((oe) this).field_Zb = 0;
              ((oe) this).field_oc = 0;
              td.a(((oe) this).field_J, 128);
              ((oe) this).field_J = 0;
              if (((oe) this).field_gb) {
                ((oe) this).field_cb = ((oe) this).field_T;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ck.a(111, -((oe) this).field_u);
              mn.a(-((oe) this).field_bc, (byte) 44);
              ((oe) this).field_bc = ((oe) this).field_w;
              ((oe) this).field_u = ((oe) this).field_ic;
              ck.a(77, ((oe) this).field_ic);
              mn.a(((oe) this).field_w, (byte) 44);
              if (0 > ((oe) this).field_Pb) {
                break L2;
              } else {
                ((oe) this).field_db = false;
                break L2;
              }
            }
            L3: {
              L4: {
                ((oe) this).field_Xb = this.i(512, -22944);
                int discarded$5 = 8192;
                if (!this.n()) {
                  break L4;
                } else {
                  if (!param0) {
                    break L4;
                  } else {
                    ((oe) this).field_eb = new na(((oe) this).field_V, si.field_v, (int[]) null, ((oe) this).field_Mb, ((oe) this).field_D);
                    ic.a(-101, ((oe) this).field_eb.field_B);
                    break L3;
                  }
                }
              }
              ((oe) this).field_eb = null;
              break L3;
            }
            L5: {
              this.f(-75, 3);
              int discarded$6 = 0;
              this.h();
              var4 = this.b(false);
              ((oe) this).field_B = new li((oe) this, var4, gj.a(((oe) this).field_Pb, ((oe) this).field_fc, (byte) 54));
              int discarded$7 = 0;
              this.z();
              var5 = ce.field_f;
              if (var5 != null) {
                var5.a((byte) 36);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              var10 = (sa) ((oe) this).field_kb.elementAt(var3);
              var10.a(true, (oe) this);
              if (var10.field_n != 6) {
                break L6;
              } else {
                var5_int = 0;
                L7: while (true) {
                  if (~var5_int <= ~((oe) this).field_kb.size()) {
                    break L6;
                  } else {
                    L8: {
                      var6 = (sa) ((oe) this).field_kb.elementAt(var5_int);
                      if (var6.field_n != 7) {
                        break L8;
                      } else {
                        if (var10.field_g != var6.field_g) {
                          break L8;
                        } else {
                          var7 = (20 + var10.field_k) % ((oe) this).field_n;
                          var8 = var6.field_k;
                          L9: while (true) {
                            if (~var7 >= ~var8) {
                              this.a(var8, var10.field_g + 14, var7, 2134602960);
                              break L6;
                            } else {
                              var8 = var8 + ((oe) this).field_n;
                              continue L9;
                            }
                          }
                        }
                      }
                    }
                    var5_int++;
                    continue L7;
                  }
                }
              }
            }
            var3++;
            continue L0;
          }
        }
    }

    private final void a(ic param0) {
        try {
            if (!(null == param0.field_g)) {
                pl.field_n.b((wg) (Object) param0.field_g);
                pl.field_n.b((wg) (Object) param0.field_m);
                param0.field_m = null;
                param0.field_g = null;
            }
            this.a(125, param0.field_q, ve.field_d, param0.field_p);
            param0.c((byte) -11);
            this.q((byte) -128);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.RC(" + (param0 != null ? "{...}" : "null") + 44 + 5 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param1) {
            ((oe) this).field_i = null;
        }
        if (ce.field_f.a((byte) 54, param3, param2, param0)) {
            int fieldTemp$0 = ((oe) this).field_z;
            ((oe) this).field_z = ((oe) this).field_z + 1;
            ((oe) this).field_Lb[fieldTemp$0] = param2;
        }
    }

    private final sa a(DataInputStream param0, int param1, int param2, boolean param3, int param4, int param5, int param6) throws IOException {
        sa var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        sa stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        sa stackOut_16_0 = null;
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
              var9 = param0.readByte();
              if (var9 == 0) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = stackIn_3_0;
              var11 = 0;
              if (param2 < 6) {
                break L2;
              } else {
                L3: {
                  var12 = param0.readByte();
                  if (var12 == 0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L3;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L3;
                  }
                }
                var11 = stackIn_7_0;
                break L2;
              }
            }
            L4: {
              if (param2 >= 9) {
                var12 = param0.readInt();
                var8 = new sa(param6, param4, param1, param5, var10 != 0, var11 != 0, var12);
                break L4;
              } else {
                var8 = new sa(param6, param4, param1, param5, var10 != 0, var11 != 0);
                break L4;
              }
            }
            L5: {
              if (var10 == 0) {
                break L5;
              } else {
                L6: {
                  if (null == ((oe) this).field_k) {
                    ((oe) this).field_k = new cn();
                    ((oe) this).field_Ab = new va();
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((oe) this).field_k.a(-12328, (hg) (Object) var8);
                break L5;
              }
            }
            stackOut_16_0 = (sa) var8;
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8_ref;
            stackOut_18_1 = new StringBuilder().append("oe.EA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + 0 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0;
    }

    private final int a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        if (!((oe) this).field_a) {
            return param2;
        }
        if (((oe) this).field_X <= 0) {
            return param3;
        }
        int var5 = ((oe) this).field_X % param1;
        param1 = param1 / 2;
        if (!(~var5 <= ~param1)) {
            var6 = param3;
            param3 = param2;
            param2 = var6;
        }
        var5 = ((oe) this).field_X % param1;
        var6 = this.d(param3, 30351) + -this.d(param2, 30351);
        int var7 = this.b(param3, 16082) - this.b(param2, 16082);
        int var8 = this.a(-99, param3) + -this.a(87, param2);
        int var9 = this.d(param2, 30351) + var6 * var5 / param1;
        int var10 = var7 * var5 / param1 + this.b(param2, 16082);
        int var11 = var5 * var8 / param1 + this.a(-128, param2);
        return this.a(var11, var9, true, var10);
    }

    private final boolean d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var11 = EscapeVector.field_A;
        var4 = ((oe) this).field_H >> 5;
        var4 = var4 + (((oe) this).field_n << 11);
        var5 = ((oe) this).field_p >> 5;
        var6 = -24576 + var4;
        var7 = -24576 + var5;
        var8 = 24576 + var4;
        param2 = param2 << 11;
        var9 = var5 + 24576;
        param0 = param0 << 11;
        L0: while (true) {
          if (~param0 <= ~var6) {
            L1: {
              if (var8 < param0) {
                break L1;
              } else {
                if (~var7 < ~param2) {
                  break L1;
                } else {
                  if (~param2 >= ~var9) {
                    L2: {
                      param0 = param0 - var4;
                      param2 = param2 - var5;
                      var10 = param2 * param2 + param0 * param0;
                      if (var10 >= 603979776) {
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
                  } else {
                    return false;
                  }
                }
              }
            }
            return false;
          } else {
            param0 = param0 + (((oe) this).field_n << 11);
            continue L0;
          }
        }
    }

    private final void a(boolean param0, byte[] param1, boolean param2) {
        try {
            if (!param2) {
                this.m(-93);
            }
            this.a(24661, param0);
            int discarded$0 = 100;
            this.a(param1);
            this.a(param0, -119);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    private final int[] a(int param0, int param1, int param2) {
        int[] stackIn_7_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_5_0 = null;
        if (param1 == -1) {
          if (param0 >= 0) {
            L0: {
              if (~param0 <= ~((oe) this).field_D) {
                stackOut_6_0 = si.field_v;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = ((oe) this).field_V[((oe) this).field_Mb * param0 + param2 % ((oe) this).field_Mb];
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final void C() {
        int[] var32 = null;
        String[] var13 = null;
        tj var14 = null;
        int[] var33 = null;
        String[] var16 = null;
        tj var17 = null;
        int[] var34 = null;
        String[] var19 = null;
        tj var20 = null;
        int[] var35 = null;
        String[] var22 = null;
        tj var23 = null;
        if (((oe) this).field_fc != 2) {
            return;
        }
        ed[] var12 = ae.field_c;
        if (((oe) this).field_Pb == 0) {
            sa.a(2, (byte) -116);
        }
        if (!(0 != ((oe) this).field_Pb)) {
            var32 = uj.field_e;
            var13 = lh.field_c;
            var14 = new tj(var32, var12, var13, false);
            re.a(1820, var14);
        }
        if (!(4 != ((oe) this).field_Pb)) {
            var33 = p.field_j;
            var16 = rb.field_j;
            var17 = new tj(var33, var12, var16, false);
            re.a(1820, var17);
        }
        if (!(((oe) this).field_Pb != 8)) {
            var34 = ha.field_e;
            var19 = pc.field_b;
            var20 = new tj(var34, var12, var19, false);
            re.a(1820, var20);
        }
        if (!(((oe) this).field_Pb != 12)) {
            var35 = w.field_bb;
            var22 = vd.field_i;
            var23 = new tj(var35, var12, var22, false);
            re.a(1820, var23);
        }
    }

    private final void d(boolean param0) {
        int var3 = EscapeVector.field_A;
        oc var2 = (oc) (Object) ((oe) this).field_vb.a(false);
        while (var2 != null) {
            if (!var2.field_B) {
                var2.a();
            } else {
                var2.c((byte) -71);
            }
            var2 = (oc) (Object) ((oe) this).field_vb.b((byte) 70);
        }
        this.f(-20320);
    }

    private final void p() {
        L0: {
          L1: {
            this.a(72);
            dh.field_b = ma.field_a.field_fc;
            ma.field_a = null;
            pl.field_q = new t();
            oe.c((byte) -28);
            mj.field_d = 0;
            if (!aj.b(-89)) {
              break L1;
            } else {
              L2: {
                if (null != de.field_i) {
                  break L2;
                } else {
                  if (ce.field_f.b(-49)) {
                    break L2;
                  } else {
                    if (ua.field_c.d(17523)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              n.field_h = true;
              di.field_d = new wc(2);
              int discarded$3 = 8158;
              di.field_d.a(gb.a(dh.field_d, bj.field_y), true, 4767999);
              break L0;
            }
          }
          int discarded$4 = 0;
          ci.a();
          break L0;
        }
        gi.a((byte) -77);
    }

    private final void a(pi param0, int param1) {
        pl.field_n.b((wg) (Object) param0.field_o);
        param0.field_o = null;
        if (param1 < 7) {
            return;
        }
        try {
            this.a(123, param0.field_g, td.field_c, param0.field_n);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.MC(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void c(int param0, byte param1) {
        if (!(9 == param0)) {
            return;
        }
        ((oe) this).field_Tb = ((oe) this).field_Tb + 150;
        if (!(((oe) this).field_Tb < 500)) {
            ((oe) this).field_Tb = 500;
        }
        this.a(-116, qh.field_e);
    }

    private final void g(int param0, int param1, int param2) {
        ed var10 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        if (!(((oe) this).field_Pb >= 0)) {
            var10 = c.field_n;
            if (!(var10 != null)) {
                return;
            }
            var5 = (param2 >> 3) - param2;
            var6 = (param0 >> 3) - param0;
            var6 += 240;
            if (!(var6 <= 0)) {
                em.f(0, var6, 640, 480);
            }
            var7 = 0;
            while (0 < var5) {
                var7 = var7 == 0 ? 1 : 0;
                var5 = var5 - var10.field_A;
            }
            var8 = var6;
            while (var5 < 640) {
                if (!(var7 == 0)) {
                    var6 = var6 - var10.field_z / 2;
                }
                while (var6 < 480) {
                    var10.e(var5, var6);
                    var6 = var6 + var10.field_z;
                }
                var5 = var5 + var10.field_A;
                var7 = var7 == 0 ? 1 : 0;
                var6 = var8;
            }
            em.c();
        }
    }

    private final void z() {
        de var6 = null;
        int var7 = 0;
        int var8 = EscapeVector.field_A;
        if (!(((oe) this).field_s != null)) {
            return;
        }
        if (((oe) this).field_s.a(-97)) {
            return;
        }
        int var2 = 9;
        int var3 = 5 + (var2 + -1);
        int var4 = 54;
        hg var5 = ((oe) this).field_s.a(false);
        while (var5 != null) {
            var6 = (de) (Object) var5;
            var7 = var6.field_g;
            if (~var7 <= ~var2) {
                if (!(~var3 > ~var7)) {
                    this.k(-122, var7);
                }
            }
            var5 = ((oe) this).field_s.b((byte) 70);
        }
    }

    private final void a(int param0, int param1, DataInputStream param2) throws IOException {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 < 6) {
                ((oe) this).field_a = false;
                ((oe) this).field_X = 0;
                ((oe) this).field_l = 0;
                break L1;
              } else {
                ((oe) this).field_l = param2.readUnsignedByte();
                ((oe) this).field_X = param2.readInt();
                ((oe) this).field_a = false;
                break L1;
              }
            }
            this.d(20802);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("oe.TF(").append(param0).append(44).append(-8277).append(44);
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
          throw t.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void f() {
        field_xb = null;
        field_cc = null;
    }

    private final int a(int param0, int param1, boolean param2, int param3) {
        param3 = param3 << 8;
        param1 = param1 << 16;
        int var5 = param1 & 16711680;
        var5 = var5 | param3 & 65280;
        var5 = var5 | 255 & param0;
        return var5;
    }

    private final void h(int param0, int param1) {
        if (!(((oe) this).field_j > 0)) {
            return;
        }
        mj.field_b.g();
        em.d();
        String var3 = ce.a((byte) 120, ((oe) this).field_fc, ((oe) this).field_Pb);
        fh.field_g.c(var3, 160, 22, 7899280, -1);
        md.field_D.a(126);
        int discarded$0 = 1;
        int discarded$1 = 1;
        cf.a(mj.field_b);
        mj.field_b.h(5267536);
        int var4 = ((oe) this).field_j;
        if (var4 > 128) {
            var4 = 128;
        }
        mj.field_b.a(-mj.field_b.field_A + 320, (-param1 >> 3) - 4, 2 * mj.field_b.field_A, mj.field_b.field_z * 2, var4);
    }

    private final void a(am param0, byte param1) {
        try {
            param0.c((byte) -25);
            if (param1 <= 10) {
                ((oe) this).field_c = -106;
            }
            ((oe) this).field_b = true;
            ((oe) this).field_ub = ((oe) this).field_ub - 1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.E(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void c(byte param0) {
        wa.field_c = new cn();
        si.field_u = new cn();
        mh.field_e = 0;
        hi.field_q = 6324320;
        int var1 = -7 / ((70 - param0) / 32);
    }

    private final void a(int param0, int param1, hh param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        oc var6 = null;
        Object var7 = null;
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
        try {
          L0: {
            L1: {
              int discarded$2 = 8192;
              var5_int = this.n() ? 1 : 0;
              var6 = eg.a(param1, param3, var5_int != 0, true, param2);
              ((oe) this).field_vb.a(-12328, (hg) (Object) var6);
              if (param0 > 120) {
                break L1;
              } else {
                var7 = null;
                this.a(true, (byte[]) null, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var5;
            stackOut_3_1 = new StringBuilder().append("oe.LD(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param3 + 41);
        }
    }

    private final void a(sa param0, int param1, int param2) {
        oc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              param0.a((oe) this, (byte) 76);
              int discarded$6 = 42;
              var4 = this.a(param0);
              ((oe) this).field_kb.removeElementAt(param2);
              if (!((oe) this).field_Gb) {
                var5 = mf.b(((oe) this).field_fc, param0.field_n, -2);
                ((oe) this).field_J = ((oe) this).field_J + var5;
                v.a(8, var5);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = 33 % ((6 - param1) / 44);
              if (1 != param0.field_n) {
                if (9 <= param0.field_n) {
                  break L2;
                } else {
                  if (param0.field_n != 5) {
                    this.q((byte) -117);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                this.b(0);
                break L2;
              }
            }
            L3: {
              int discarded$7 = -2;
              this.a(param0, var4);
              this.a((byte) 124, param0);
              if (((oe) this).field_B != null) {
                ((oe) this).field_B.a(param0, 4236);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("oe.B(");
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final boolean e(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 > 90) {
          L0: {
            L1: {
              if (((oe) this).field_Gb) {
                break L1;
              } else {
                if (((oe) this).field_k == null) {
                  break L1;
                } else {
                  if (!((oe) this).field_k.a(-128)) {
                    break L1;
                  } else {
                    if (!((oe) this).field_Ab.b(-182442704)) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final void e(boolean param0, int param1) {
        ce var3 = null;
        int var4 = 0;
        int var5 = 0;
        if (param1 == 0) {
          L0: {
            int discarded$6 = -123;
            var3 = this.w();
            int discarded$7 = -68661304;
            var4 = this.s();
            int discarded$8 = -48;
            var5 = this.t() ? 1 : 0;
            if (var3 == null) {
              break L0;
            } else {
              if (var4 < 0) {
                break L0;
              } else {
                L1: {
                  if (((oe) this).field_Y != var3) {
                    break L1;
                  } else {
                    if (param0) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                vc.a(var4, var3, var5 != 0, (byte) -93);
                ((oe) this).field_sc = var4;
                ((oe) this).field_Y = var3;
                break L0;
              }
            }
          }
          this.z(86);
          return;
        } else {
          return;
        }
    }

    private final void u() {
        if (!(((oe) this).field_fc == 3)) {
            return;
        }
        if (ua.field_c == null) {
            return;
        }
        if (!(ua.field_c.a(((oe) this).field_fc, false))) {
            return;
        }
        int var3 = 29;
        int var4 = 255 ^ var3;
        ((oe) this).a(((oe) this).field_fc, false, var3, var4);
    }

    private final boolean e(boolean param0) {
        return !((oe) this).field_Gb && -16777216 > ((oe) this).field_p;
    }

    final void G(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        pi var5_ref_pi = null;
        ed var5_ref_ed = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ed var8_ref_ed = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        oc var12 = null;
        int stackIn_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        var11 = EscapeVector.field_A;
        if (!this.n((byte) 59)) {
          em.d();
          fh.field_g.c(this.r(4251), 320, 250, 16777215, -1);
          return;
        } else {
          L0: {
            int discarded$6 = 8192;
            var2 = this.n() ? 1 : 0;
            var3 = (((oe) this).field_H >> 16) + -319;
            var4 = (((oe) this).field_p >> 16) - 239;
            this.i(param0 + -48, (((oe) this).field_H >> 16) - -((oe) this).field_Kb, ((oe) this).field_p >> 16);
            if (((oe) this).field_eb == null) {
              break L0;
            } else {
              ((oe) this).field_eb.e(param0 + 640, var3, var4);
              break L0;
            }
          }
          this.b(var3, var4, (byte) -14);
          var5_ref_pi = (pi) (Object) ((oe) this).field_hb.a(false);
          L1: while (true) {
            if (var5_ref_pi == null) {
              ((oe) this).field_Xb.a(82, var3, var4);
              var12 = (oc) (Object) ((oe) this).field_vb.a(false);
              L2: while (true) {
                if (var12 == null) {
                  L3: {
                    if (null != ((oe) this).field_eb) {
                      break L3;
                    } else {
                      this.a(var4, var3, (byte) -115);
                      this.e(var4, param0 + 8192, var3);
                      break L3;
                    }
                  }
                  this.h(11905, var3, var4);
                  var5_ref_pi = (pi) (Object) ((oe) this).field_hb.a(false);
                  L4: while (true) {
                    if (var5_ref_pi == null) {
                      L5: {
                        if (((oe) this).field_Ub < 0) {
                          break L5;
                        } else {
                          L6: {
                            var5_ref_ed = mb.field_f[((oe) this).field_Ub];
                            if (var2 == 0) {
                              break L6;
                            } else {
                              if (ob.field_b[((oe) this).field_Ub] != null) {
                                var5_ref_ed = ob.field_b[((oe) this).field_Ub];
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            var6 = (((oe) this).field_mb - (var5_ref_ed.field_A << 15) >> 16) - var3;
                            var7 = (((oe) this).field_E - (var5_ref_ed.field_z << 15) >> 16) - var4;
                            if (640 - ((oe) this).field_n >> 1 > var6) {
                              var6 = var6 + ((oe) this).field_n;
                              break L7;
                            } else {
                              if (~var6 > ~(640 + ((oe) this).field_n >> 1)) {
                                break L7;
                              } else {
                                var6 = var6 - ((oe) this).field_n;
                                break L7;
                              }
                            }
                          }
                          L8: {
                            var8 = var5_ref_ed.field_s;
                            var9 = var5_ref_ed.field_x;
                            if (((oe) this).field_e > 0) {
                              var7 = ((oe) this).field_e * (-240 + var7) / 50 + 240;
                              var9 = var9 * ((oe) this).field_e / 50;
                              var8 = ((oe) this).field_e * var8 / 50;
                              var6 = ((oe) this).field_e * (-320 + var6) / 50 + 320;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            if (((oe) this).field_Gb) {
                              break L9;
                            } else {
                              L10: {
                                var10 = 16777215;
                                if (var2 == 0) {
                                  break L10;
                                } else {
                                  if (((oe) this).field_eb != null) {
                                    var10 = ((oe) this).field_eb.field_z;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              em.d(320, 240, var6 + (var8 >> 1), var7 - -(var9 >> 1), var10);
                              break L9;
                            }
                          }
                          if (((oe) this).field_e > 0) {
                            var5_ref_ed.b(var6, var7, var8, var9);
                            break L5;
                          } else {
                            var5_ref_ed.e(var6, var7);
                            break L5;
                          }
                        }
                      }
                      L11: {
                        if (!((oe) this).field_Gb) {
                          this.a(var4, (ed) null, 65793, var3);
                          int discarded$7 = -110;
                          this.o();
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        this.f(var3, var4, 8);
                        this.b(var3, var4, param0);
                        this.b(var3, (byte) -108, var4);
                        if (null == ((oe) this).field_Db) {
                          break L12;
                        } else {
                          ((oe) this).field_Db.a((byte) -87, var3, var4);
                          break L12;
                        }
                      }
                      L13: {
                        this.y(param0 ^ -32369);
                        if (((oe) this).field_Pb >= 0) {
                          int discarded$8 = 3;
                          this.q();
                          break L13;
                        } else {
                          if (null != da.field_c) {
                            break L13;
                          } else {
                            if (!((oe) this).field_Jb) {
                              int discarded$9 = 476;
                              int discarded$10 = 320;
                              dc.a((byte) 57, ek.field_c);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      L14: {
                        if (da.field_c != null) {
                          break L14;
                        } else {
                          L15: {
                            if (!((oe) this).g((byte) -91)) {
                              break L15;
                            } else {
                              L16: {
                                if (!((oe) this).field_rc) {
                                  break L16;
                                } else {
                                  if (0 <= ((oe) this).field_Pb) {
                                    L17: {
                                      ga.field_b.e(640 - ga.field_b.field_A >> 1, -ga.field_b.field_z + 212);
                                      if (-100 > ((oe) this).field_c) {
                                        oj.a(266, 340, (byte) -106, en.field_e);
                                        EscapeVector.a(Integer.toString(((oe) this).field_J), 340, 266, (byte) 110);
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (((oe) this).field_c < -75) {
                                        oj.a(286, 340, (byte) -102, dg.field_s);
                                        EscapeVector.a(Integer.toString(((oe) this).field_ac), 340, 286, (byte) -5);
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      if (((oe) this).field_c < -50) {
                                        oj.a(306, 340, (byte) -116, fl.field_g);
                                        EscapeVector.a(Integer.toString(((oe) this).field_Tb + ((oe) this).field_Tb), 340, 306, (byte) -43);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    oj.a(336, 340, (byte) 85, ad.field_c);
                                    EscapeVector.a(Integer.toString(((oe) this).field_ob), 340, 336, (byte) 119);
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              ga.field_b.e(640 - ga.field_b.field_A >> 1, 480 - ga.field_b.field_z >> 1);
                              break L15;
                            }
                          }
                          int discarded$11 = -76;
                          this.a();
                          if (0 >= ((oe) this).field_ab) {
                            break L14;
                          } else {
                            if (((oe) this).field_ab > 100) {
                              break L14;
                            } else {
                              fh.field_g.b(((oe) this).field_h, 320, 174 + (((oe) this).field_ab >> 1), 16777215, -1, (((oe) this).field_ab << 8) / 100);
                              break L14;
                            }
                          }
                        }
                      }
                      L20: {
                        if (((oe) this).field_c <= 0) {
                          break L20;
                        } else {
                          L21: {
                            L22: {
                              if (((oe) this).field_Gb) {
                                break L22;
                              } else {
                                L23: {
                                  if (!((oe) this).field_ec) {
                                    break L23;
                                  } else {
                                    if (((oe) this).field_Pb < 0) {
                                      break L22;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                                if (!((oe) this).field_Ib) {
                                  stackOut_87_0 = 0;
                                  stackIn_88_0 = stackOut_87_0;
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            stackOut_86_0 = 1;
                            stackIn_88_0 = stackOut_86_0;
                            break L21;
                          }
                          var5 = stackIn_88_0;
                          gh.a(((oe) this).field_c + 1, 256 - (((oe) this).field_c << 2), var5 != 0, var5 != 0);
                          break L20;
                        }
                      }
                      L24: {
                        if (null == ((oe) this).field_B) {
                          break L24;
                        } else {
                          if (!((oe) this).field_B.b((byte) -122)) {
                            break L24;
                          } else {
                            ((oe) this).field_B.a((byte) -120);
                            break L24;
                          }
                        }
                      }
                      return;
                    } else {
                      L25: {
                        if (var5_ref_pi.field_r != 0) {
                          var6 = (var5_ref_pi.field_n >> 16) + (-var3 + 1);
                          var7 = 1 + ((var5_ref_pi.field_g >> 16) - var4);
                          L26: while (true) {
                            if (var6 <= -7) {
                              var6 = var6 + ((oe) this).field_n;
                              L27: while (true) {
                                if (var6 >= 647) {
                                  break L25;
                                } else {
                                  L28: {
                                    var8_ref_ed = mf.field_m;
                                    if (var2 == 0) {
                                      break L28;
                                    } else {
                                      if (ej.field_a != null) {
                                        var8_ref_ed = ej.field_a;
                                        break L28;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  var8_ref_ed.a(var6, (byte) 34, 4096, -var5_ref_pi.field_m << 8, var7);
                                  var6 = var6 + ((oe) this).field_n;
                                  continue L27;
                                }
                              }
                            } else {
                              var6 = var6 - ((oe) this).field_n;
                              continue L26;
                            }
                          }
                        } else {
                          break L25;
                        }
                      }
                      var5_ref_pi = (pi) (Object) ((oe) this).field_hb.b((byte) 70);
                      continue L4;
                    }
                  }
                } else {
                  var12.a(99, var3, var4);
                  var12 = (oc) (Object) ((oe) this).field_vb.b((byte) 70);
                  continue L2;
                }
              }
            } else {
              var5_ref_pi.field_i.a(param0 ^ 97, var3, var4);
              var5_ref_pi = (pi) (Object) ((oe) this).field_hb.b((byte) 70);
              continue L1;
            }
          }
        }
    }

    final void x(byte param0) {
        int var2 = 92 % ((-5 - param0) / 38);
        if (!(((oe) this).field_c >= 0)) {
            if (((oe) this).g((byte) -127)) {
                if (((oe) this).field_rc) {
                    if (((oe) this).field_Pb >= 0) {
                        if (!(((oe) this).field_c >= -100)) {
                            ((oe) this).field_ob = ((oe) this).field_ob + ((oe) this).field_J;
                            ((oe) this).field_J = 0;
                            ((oe) this).field_T = ((oe) this).field_cb;
                        }
                        if (-75 > ((oe) this).field_c) {
                            ((oe) this).field_ob = ((oe) this).field_ob + ((oe) this).field_ac;
                            v.a(8, ((oe) this).field_ac);
                        }
                        if (!(((oe) this).field_c >= -50)) {
                            ((oe) this).field_ob = ((oe) this).field_ob + (((oe) this).field_Tb - -((oe) this).field_Tb);
                            v.a(8, ((oe) this).field_Tb - -((oe) this).field_Tb);
                        }
                        this.f(false);
                    }
                }
            }
            ((oe) this).field_c = 0;
        }
    }

    private final void a(InputStream param0) throws IOException {
        try {
            this.a(false, -1, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.TC(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    private final void d(int param0) {
        if (param0 != 20802) {
            return;
        }
    }

    private final int d(int param0, int param1) {
        return (16711680 & param0) >> 16;
    }

    private final void h(byte param0) {
        if (!(!((oe) this).field_F)) {
            return;
        }
        this.a(0, mf.field_a, 65793, 0);
        this.a(0, -28311553, mf.field_a, 0, ib.field_a);
        if (!(((oe) this).field_Ub < 0)) {
            if (!(((oe) this).field_e <= 0)) {
                ((oe) this).field_e = 0;
                ((oe) this).field_Ub = -1;
            }
            pl.field_n.a(bc.field_c, 100, 6144 * qm.field_c / 64, 8192);
        }
        ((oe) this).field_Gb = true;
        if (!((oe) this).field_gb) {
            if (((oe) this).field_Pb >= 0) {
                ((oe) this).field_A = ((oe) this).field_A - 1;
                int discarded$0 = 1;
                jc.a();
                this.b((byte) -106, 0);
            }
        }
        if (param0 >= -34) {
            ((oe) this).field_P = 112;
        }
    }

    private final String g(boolean param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var2 = "12:00:00+";
          var3 = ((oe) this).field_cb;
          if (((oe) this).field_a) {
            var3 = ((oe) this).field_X;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (2160000 > ((oe) this).field_cb) {
              break L2;
            } else {
              if (((oe) this).field_a) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          var4 = var3 / 50;
          var5 = var4 / 60;
          var4 = var4 - var5 * 60;
          var6 = var5 / 60;
          var5 = var5 - var6 * 60;
          var2 = var6 + ":" + var5 / 10 + var5 % 10 + ":" + var4 / 10 + var4 % 10;
          break L1;
        }
        return var2;
    }

    private final void h(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sa var7 = null;
        L0: {
          var6 = EscapeVector.field_A;
          if (((oe) this).field_Pb >= 0) {
            break L0;
          } else {
            if (fa.field_c[5]) {
              var4 = -param1;
              L1: while (true) {
                if (var4 <= -1024) {
                  L2: while (true) {
                    if (var4 >= 640) {
                      break L0;
                    } else {
                      em.h(0, 0, 448 - -var4, 480);
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= 512) {
                          bf.field_T.e(var4 + 224, -param2 + 96);
                          var5 = 256;
                          L4: while (true) {
                            if (512 <= var5) {
                              em.c();
                              em.h(var4 + 576, 0, 640, 480);
                              var5 = 512;
                              L5: while (true) {
                                if (1024 <= var5) {
                                  var5 = 512;
                                  L6: while (true) {
                                    if (var5 >= 768) {
                                      kn.field_h.e(var4 + 768, 96 + -param2);
                                      em.c();
                                      uf.field_e.e(var4 + 448, -param2);
                                      wa.field_b.e(544 + var4, -param2);
                                      gm.field_a.e(448 + var4, 288 - param2);
                                      gm.field_a.e(448 + var4, -param2 + 480);
                                      em.h(0, 128 + -param2, 640, 480);
                                      var5 = 128;
                                      L7: while (true) {
                                        if (var5 >= 1024) {
                                          em.c();
                                          ej.field_e.e(var4 + 224, 1024 - param2);
                                          var5 = 256;
                                          L8: while (true) {
                                            if (var5 >= 768) {
                                              q.field_G.e(768 + var4, -param2 + 1024);
                                              var4 += 1024;
                                              continue L2;
                                            } else {
                                              dg.field_r.e(var5 + var4, -param2 + 1024);
                                              var5 += 32;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          n.field_l.e(var4 + 224, -param2 + var5);
                                          cj.field_a.e(768 - -var4, -param2 + var5);
                                          var5 += 32;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      mj.field_f.e(var5 - -var4, 96 - param2);
                                      var5 += 32;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  wa.field_e.e(var5 + var4, -param2);
                                  var5 += 32;
                                  continue L5;
                                }
                              }
                            } else {
                              mj.field_f.e(var5 - -var4, 96 - param2);
                              var5 += 32;
                              continue L4;
                            }
                          }
                        } else {
                          wa.field_e.e(var4 + var5, -param2);
                          var5 += 32;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var4 -= 1024;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        var4 = 0;
        L9: while (true) {
          if (((oe) this).field_kb.size() <= var4) {
            return;
          } else {
            var7 = (sa) ((oe) this).field_kb.elementAt(var4);
            var7.a(param2, (byte) 109, param1);
            var4++;
            continue L9;
          }
        }
    }

    private final void a(byte param0, sa param1) {
        if (!(param1 != null)) {
            return;
        }
        if (!param1.e((byte) -5)) {
            return;
        }
        ((oe) this).field_S = ((oe) this).field_S + 1;
        if (((oe) this).field_L != ((oe) this).field_S) {
            return;
        }
        try {
            int discarded$0 = 64;
            ua.field_c.a((byte) -64, ((oe) this).field_fc, oj.k(), ((oe) this).field_Pb);
            int var3_int = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "oe.VF(" + 124 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void j(int param0, int param1) {
        int var3 = 1;
    }

    private final void b(int param0, DataInputStream param1) throws IOException {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ic var6 = null;
        int var7 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              ((oe) this).field_N = new cn();
              if (param0 >= 1) {
                var4_int = param1.readUnsignedByte();
                var5 = 0;
                L2: while (true) {
                  if (~var5 <= ~var4_int) {
                    break L1;
                  } else {
                    var6 = new ic();
                    int dupTemp$50 = param1.readUnsignedShort() << 16;
                    var6.field_j = dupTemp$50;
                    var6.field_p = dupTemp$50;
                    int dupTemp$51 = param1.readUnsignedShort() << 16;
                    var6.field_l = dupTemp$51;
                    var6.field_q = dupTemp$51;
                    var6.field_i = (int)(32769.0 * Math.random()) + -16384;
                    var6.field_h = -16384 + (int)(32769.0 * Math.random());
                    ((oe) this).field_N.a(-12328, (hg) (Object) var6);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("oe.GB(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + -17 + 41);
        }
    }

    private final void A() {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8 = 0;
        L0: {
          var2 = (double)((oe) this).field_Hb;
          var4 = (double)((oe) this).field_pb;
          var6 = 1.0 / Math.sqrt(var4 * var4 + var2 * var2);
          var2 = var2 * var6;
          var4 = var4 * var6;
          var6 = (double)((oe) this).field_hc * var4 + var2 * (double)((oe) this).field_mc;
          if (var6 <= -32768.0) {
            break L0;
          } else {
            if (524288.0 < var6) {
              this.h((byte) -50);
              if (!((oe) this).field_rc) {
                return;
              } else {
                L1: {
                  if (((oe) this).field_Pb >= 0) {
                    break L1;
                  } else {
                    if (33554432 <= ((oe) this).field_p) {
                      ((oe) this).a(((oe) this).field_fc, false, 8, 247);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                return;
              }
            } else {
              L2: {
                if (32768.0 >= var6) {
                  var6 = var6 + 32768.0;
                  break L2;
                } else {
                  var6 = 2.0 * var6;
                  break L2;
                }
              }
              L3: {
                ((oe) this).field_mc = (int)((double)((oe) this).field_mc - var6 * var2);
                ((oe) this).field_hc = (int)((double)((oe) this).field_hc - var6 * var4);
                var8 = (int)var6 >> 4;
                if (var8 <= 6144) {
                  break L3;
                } else {
                  var8 = 6144;
                  break L3;
                }
              }
              pl.field_n.a(co.field_d, 100, qm.field_c * var8 / 64, 8192);
              break L0;
            }
          }
        }
    }

    private final void z(int param0) {
        if (((oe) this).field_Y == null) {
          return;
        } else {
          if (((oe) this).field_sc < 0) {
            return;
          } else {
            L0: {
              L1: {
                L2: {
                  if (!((oe) this).field_Gb) {
                    break L2;
                  } else {
                    if (((oe) this).field_A == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!((oe) this).g((byte) -113)) {
                    break L3;
                  } else {
                    int discarded$291 = 1;
                    if (!kl.a(((oe) this).field_Pb - -1, ((oe) this).field_fc)) {
                      break L3;
                    } else {
                      break L1;
                    }
                  }
                }
                L4: {
                  if (((oe) this).field_Jb) {
                    break L4;
                  } else {
                    if (!((oe) this).field_Cb) {
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
                if (((oe) this).field_c < 0) {
                  break L0;
                } else {
                  if (32 >= ((oe) this).field_c) {
                    int discarded$292 = 32471;
                    wa.a((32 - ((oe) this).field_c) * ((oe) this).field_sc / 32);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              if (((oe) this).field_c < -64) {
                break L0;
              } else {
                if (((oe) this).field_c <= 0) {
                  int discarded$293 = 32471;
                  wa.a(((oe) this).field_sc * -((oe) this).field_c / 64);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var12 = 0;
        int var13 = EscapeVector.field_A;
        int[] var14 = new int[32];
        int[] var18 = var14;
        for (var10 = param4; ~param7 < ~var10; var10++) {
            var14[var10] = ae.a((param0 << 5) + var10, 255);
        }
        var10 = 15 - param2 + (param1 << 5);
        int var11 = -param5 + ((param0 << 5) - 9600);
        if (param6 != 10943) {
            return;
        }
        if (!(var10 <= 0)) {
            var11 = this.a(var11, param1 + -1, param7, false, 32, param4, -var10 + 32, param0, var18);
        }
        for (var12 = param1; var12 < param3; var12++) {
            var11 = this.a(var11, var12, param7, false, 32, param4, 0, param0, var18);
        }
        var12 = param2 + 480 & 31;
        if (var12 > 0) {
            int discarded$0 = this.a(var11, param3, param7, false, var12, param4, 0, param0, var18);
        }
    }

    private final void q(byte param0) {
        L0: {
          L1: {
            if (((oe) this).field_rc) {
              break L1;
            } else {
              if (!((oe) this).field_F) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((oe) this).field_Pb < 0) {
            break L0;
          } else {
            if (!((oe) this).field_Gb) {
              ((oe) this).field_bc = ((oe) this).field_bc + 1;
              c.m(-45);
              if (((oe) this).field_bc == 76) {
                ((oe) this).a(((oe) this).field_fc, false, 12, 243);
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param0 < -115) {
            break L2;
          } else {
            ((oe) this).field_i = null;
            break L2;
          }
        }
    }

    private final void b(int param0, byte param1, int param2) {
        hg var4 = null;
        int var5 = 0;
        am var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var12 = EscapeVector.field_A;
          if (((oe) this).field_oc >= 50) {
            break L0;
          } else {
            var4 = ((oe) this).field_C.a(false);
            var5 = 0;
            L1: while (true) {
              if (((oe) this).field_ub <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = (am) (Object) var4;
                  var7 = var6.field_j - param2;
                  if (-1 > var7) {
                    break L2;
                  } else {
                    if (var7 < 481) {
                      var8 = var6.field_i - param0;
                      var9 = var6.field_h + -param0;
                      L3: while (true) {
                        if (0 >= var9) {
                          var9 = var9 + ((oe) this).field_n;
                          var8 = var8 + ((oe) this).field_n;
                          L4: while (true) {
                            if (var8 >= 640) {
                              break L2;
                            } else {
                              L5: {
                                if (var8 < 0) {
                                  stackOut_13_0 = 0;
                                  stackIn_14_0 = stackOut_13_0;
                                  break L5;
                                } else {
                                  stackOut_12_0 = var8;
                                  stackIn_14_0 = stackOut_12_0;
                                  break L5;
                                }
                              }
                              L6: {
                                var10 = stackIn_14_0;
                                if (var9 > 640) {
                                  stackOut_16_0 = 640;
                                  stackIn_17_0 = stackOut_16_0;
                                  break L6;
                                } else {
                                  stackOut_15_0 = var9;
                                  stackIn_17_0 = stackOut_15_0;
                                  break L6;
                                }
                              }
                              var11 = stackIn_17_0;
                              L7: while (true) {
                                if (var10 >= var11) {
                                  var8 = var8 + ((oe) this).field_n;
                                  var9 = var9 + ((oe) this).field_n;
                                  continue L4;
                                } else {
                                  em.a(var10, var7, 16744512);
                                  em.a(var10, var7 + -1, 8396804);
                                  em.a(var10, 1 + var7, 8396804);
                                  var10++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          var9 = var9 - ((oe) this).field_n;
                          var8 = var8 - ((oe) this).field_n;
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var5++;
                var4 = var4.field_b;
                continue L1;
              }
            }
          }
        }
        L8: {
          if (param1 == -108) {
            break L8;
          } else {
            var13 = null;
            this.a(true, (byte[]) null, true);
            break L8;
          }
        }
    }

    private final void a(DataInputStream param0, int param1) throws IOException {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        de var8 = null;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            ((oe) this).field_s = new cn();
            if (param1 < 7) {
              return;
            } else {
              var4_int = 0;
              var5 = param0.readUnsignedByte();
              if (0 != var5) {
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var5) {
                    break L0;
                  } else {
                    L2: {
                      var7 = param0.readUnsignedByte();
                      if (!mf.a(var7, -64)) {
                        break L2;
                      } else {
                        var8 = new de(var7);
                        ((oe) this).field_s.a(-12328, (hg) (Object) var8);
                        this.j(var7, 101);
                        break L2;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("oe.HB(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + 71 + 41);
        }
    }

    private final void a(int param0, DataInputStream param1) throws IOException {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (5 > param0) {
                ((oe) this).field_Q = 0;
                break L1;
              } else {
                ((oe) this).field_Q = param1.readUnsignedByte();
                if (((oe) this).field_Q == 0) {
                  break L1;
                } else {
                  if (((oe) this).field_Q != 1) {
                    ((oe) this).field_Q = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            this.u(-15474);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("oe.WA(").append(param0).append(44);
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
          throw t.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 126 + 41);
        }
    }

    private final void y(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = EscapeVector.field_A;
          if (param0 == -32369) {
            break L0;
          } else {
            ((oe) this).field_Jb = true;
            break L0;
          }
        }
        L1: {
          if (((oe) this).field_Qb > 0) {
            L2: {
              var2 = -(((oe) this).field_i.field_A / 2) + 320;
              if (((oe) this).field_Qb < 31) {
                if (null != da.field_c) {
                  break L2;
                } else {
                  if (!((oe) this).field_Jb) {
                    mf.a(4, var2, 31 - ((oe) this).field_Qb, ((oe) this).field_i, -99);
                    break L2;
                  } else {
                    break L1;
                  }
                }
              } else {
                if (((oe) this).field_Qb <= 120) {
                  ge.a(-((oe) this).field_i.field_A, ((oe) this).field_i.field_B, 0, -((oe) this).field_i.field_A + em.field_l, (byte) -126, 0, 0, -((oe) this).field_i.field_z, em.field_i, 3 * em.field_l + (-1 + var2));
                  ge.a(-((oe) this).field_i.field_A, ((oe) this).field_i.field_B, 0, -((oe) this).field_i.field_A + em.field_l, (byte) -84, 0, 0, -((oe) this).field_i.field_z, em.field_i, var2 + 1 + 3 * em.field_l);
                  ge.a(-((oe) this).field_i.field_A, ((oe) this).field_i.field_B, 0, -((oe) this).field_i.field_A + em.field_l, (byte) -100, 0, 0, -((oe) this).field_i.field_z, em.field_i, -1 + (var2 - -(5 * em.field_l)));
                  ge.a(-((oe) this).field_i.field_A, ((oe) this).field_i.field_B, 0, em.field_l - ((oe) this).field_i.field_A, (byte) -81, 0, 0, -((oe) this).field_i.field_z, em.field_i, 1 + (var2 - -(5 * em.field_l)));
                  ((oe) this).field_i.e(var2, 4);
                  break L1;
                } else {
                  if (da.field_c != null) {
                    break L1;
                  } else {
                    if (((oe) this).field_Jb) {
                      break L2;
                    } else {
                      mf.a(4, var2, -120 + ((oe) this).field_Qb, ((oe) this).field_i, -123);
                      break L1;
                    }
                  }
                }
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    private final int c(boolean param0) {
        int var2 = 0;
        var2 = ((oe) this).field_P;
        if (var2 != 0) {
          if (var2 == 2) {
            return 1;
          } else {
            if (var2 == 1) {
              return 2;
            } else {
              if (var2 == 3) {
                return 3;
              } else {
                if (var2 == 4) {
                  return 4;
                } else {
                  if (var2 == 5) {
                    return 0;
                  } else {
                    return 0;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    final void h(int param0) {
        int var2 = 0;
        double var2_double = 0.0;
        int var3 = 0;
        ic var3_ref_ic = null;
        int var4 = 0;
        long var4_long = 0L;
        Object var4_ref = null;
        double var4_double = 0.0;
        long var5_long = 0L;
        double var5_double = 0.0;
        int var5 = 0;
        hl var5_ref_hl = null;
        hg var5_ref_hg = null;
        hg var6_ref_hg = null;
        double var6_double = 0.0;
        int var6 = 0;
        pi var6_ref_pi = null;
        long var7_long = 0L;
        double var7_double = 0.0;
        int var7 = 0;
        int var8 = 0;
        double var8_double = 0.0;
        ed var8_ref_ed = null;
        int var9 = 0;
        Object var9_ref_Object = null;
        ed var9_ref_ed = null;
        int var10 = 0;
        double var10_double = 0.0;
        ed var10_ref_ed = null;
        int var11 = 0;
        double var11_double = 0.0;
        ic var11_ref_ic = null;
        ed var11_ref_ed = null;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        double var12_double = 0.0;
        double var13 = 0.0;
        int var13_int = 0;
        int var14 = 0;
        double var14_double = 0.0;
        double var15 = 0.0;
        int var15_int = 0;
        int var16 = 0;
        double var16_double = 0.0;
        double var17 = 0.0;
        int var17_int = 0;
        ed var18_ref_ed = null;
        int var18 = 0;
        int var19 = 0;
        long var20_long = 0L;
        double var20_double = 0.0;
        int var20 = 0;
        Object var21_ref = null;
        ic var21_ref_ic = null;
        int var21 = 0;
        Object var22 = null;
        int var22_int = 0;
        double var22_double = 0.0;
        sa var22_ref = null;
        int var23_int = 0;
        ed var23 = null;
        double var24_double = 0.0;
        int var24 = 0;
        int var25 = 0;
        Throwable var26_ref_Throwable = null;
        int var26 = 0;
        hg var27 = null;
        int var28 = 0;
        Object var29 = null;
        am var29_ref = null;
        int var30 = 0;
        hl var31 = null;
        Object var32 = null;
        sa var32_ref = null;
        Object var33 = null;
        am var33_ref = null;
        Object var34 = null;
        sa var34_ref = null;
        hl var35 = null;
        hl var36 = null;
        Object var37 = null;
        sa var37_ref = null;
        ed var38 = null;
        ed var39 = null;
        Object var40 = null;
        vh var40_ref = null;
        ed var41 = null;
        int[] var42 = null;
        pi var43 = null;
        Object var44 = null;
        sa var44_ref = null;
        fn var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        hl stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        hl stackIn_222_0 = null;
        int stackIn_222_1 = 0;
        hl stackIn_223_0 = null;
        int stackIn_223_1 = 0;
        int stackIn_223_2 = 0;
        hl stackIn_224_0 = null;
        int stackIn_224_1 = 0;
        hl stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        hl stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        int stackIn_226_2 = 0;
        hl stackIn_240_0 = null;
        int stackIn_240_1 = 0;
        int stackIn_240_2 = 0;
        hl stackIn_241_0 = null;
        int stackIn_241_1 = 0;
        int stackIn_241_2 = 0;
        hl stackIn_242_0 = null;
        int stackIn_242_1 = 0;
        int stackIn_242_2 = 0;
        int stackIn_242_3 = 0;
        int stackIn_255_0 = 0;
        double stackIn_283_0 = 0.0;
        int stackIn_331_0 = 0;
        int stackIn_334_0 = 0;
        int stackIn_337_0 = 0;
        int stackIn_448_0 = 0;
        int stackIn_453_0 = 0;
        int stackIn_457_0 = 0;
        int[] stackIn_573_0 = null;
        hl stackIn_694_0 = null;
        int stackIn_694_1 = 0;
        hl stackIn_695_0 = null;
        int stackIn_695_1 = 0;
        hl stackIn_696_0 = null;
        int stackIn_696_1 = 0;
        int stackIn_696_2 = 0;
        Throwable caughtException = null;
        Throwable decompiledCaughtException = null;
        hl stackOut_220_0 = null;
        int stackOut_220_1 = 0;
        hl stackOut_222_0 = null;
        int stackOut_222_1 = 0;
        int stackOut_222_2 = 0;
        hl stackOut_221_0 = null;
        int stackOut_221_1 = 0;
        int stackOut_221_2 = 0;
        hl stackOut_223_0 = null;
        int stackOut_223_1 = 0;
        hl stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        int stackOut_225_2 = 0;
        hl stackOut_224_0 = null;
        int stackOut_224_1 = 0;
        int stackOut_224_2 = 0;
        hl stackOut_239_0 = null;
        int stackOut_239_1 = 0;
        int stackOut_239_2 = 0;
        hl stackOut_241_0 = null;
        int stackOut_241_1 = 0;
        int stackOut_241_2 = 0;
        int stackOut_241_3 = 0;
        hl stackOut_240_0 = null;
        int stackOut_240_1 = 0;
        int stackOut_240_2 = 0;
        int stackOut_240_3 = 0;
        int stackOut_330_0 = 0;
        int stackOut_329_0 = 0;
        int stackOut_333_0 = 0;
        int stackOut_332_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_335_0 = 0;
        int stackOut_456_0 = 0;
        int stackOut_455_0 = 0;
        int stackOut_452_0 = 0;
        int stackOut_451_0 = 0;
        int stackOut_447_0 = 0;
        int stackOut_446_0 = 0;
        hl stackOut_693_0 = null;
        int stackOut_693_1 = 0;
        hl stackOut_695_0 = null;
        int stackOut_695_1 = 0;
        int stackOut_695_2 = 0;
        hl stackOut_694_0 = null;
        int stackOut_694_1 = 0;
        int stackOut_694_2 = 0;
        int[] stackOut_572_0 = null;
        int[] stackOut_571_0 = null;
        int stackOut_253_0 = 0;
        int stackOut_254_0 = 0;
        double stackOut_282_0 = 0.0;
        double stackOut_281_0 = 0.0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_35_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        L0: {
          var32 = null;
          var33 = null;
          var34 = null;
          var37 = null;
          var40 = null;
          var21_ref = null;
          var22 = null;
          var29 = null;
          var44 = null;
          var30 = EscapeVector.field_A;
          if (((oe) this).field_eb == null) {
            break L0;
          } else {
            pf.e((byte) -106);
            break L0;
          }
        }
        L1: {
          if (((oe) this).field_Pb >= 0) {
            break L1;
          } else {
            ((oe) this).field_pc = -1 + ((oe) this).field_pc & 1023;
            break L1;
          }
        }
        L2: {
          if (((oe) this).field_B == null) {
            break L2;
          } else {
            ((oe) this).field_B.field_c = ((oe) this).field_B.field_c + 1;
            break L2;
          }
        }
        L3: while (true) {
          if (!pn.p(-116)) {
            if (((oe) this).field_B.b((byte) -110)) {
              return;
            } else {
              ((oe) this).field_sb = ((oe) this).field_sb + 1;
              if (this.n((byte) 94)) {
                L4: {
                  int discarded$35 = 0;
                  this.c();
                  if (((oe) this).field_j > 0) {
                    ((oe) this).field_j = ((oe) this).field_j - 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (((oe) this).field_Gb) {
                      break L6;
                    } else {
                      if (((oe) this).field_Ib) {
                        break L6;
                      } else {
                        if (((oe) this).field_Jb) {
                          break L6;
                        } else {
                          L7: {
                            if (!((oe) this).field_ec) {
                              break L7;
                            } else {
                              if (0 > ((oe) this).field_Pb) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (((oe) this).field_c <= 0) {
                            if (((oe) this).field_Pb < 0) {
                              break L5;
                            } else {
                              if (2160000 <= ((oe) this).field_cb) {
                                break L5;
                              } else {
                                ((oe) this).field_cb = ((oe) this).field_cb + 1;
                                int discarded$36 = 0;
                                hi.d();
                                break L5;
                              }
                            }
                          } else {
                            L8: {
                              if (((oe) this).field_c == 64) {
                                pl.field_n.a(dd.field_g, 100, qm.field_c * 1024 / 64, 8192);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              ((oe) this).field_c = ((oe) this).field_c - 1;
                              if (0 != ((oe) this).field_c) {
                                break L9;
                              } else {
                                ((oe) this).field_c = -64;
                                break L9;
                              }
                            }
                            ((oe) this).s((byte) -41);
                            return;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (((oe) this).field_Jb) {
                        break L11;
                      } else {
                        if (((oe) this).field_c < 0) {
                          break L11;
                        } else {
                          if (((oe) this).field_Qb == 0) {
                            break L11;
                          } else {
                            if (((oe) this).field_Pb >= 0) {
                              break L10;
                            } else {
                              if (((oe) this).field_z != 0) {
                                break L10;
                              } else {
                                if (!((oe) this).field_zb) {
                                  break L11;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    L12: {
                      if (((oe) this).field_c == 0) {
                        var31 = hl.c(dd.field_g, 100, qm.field_c * 1024 / 64, 8192);
                        var31.e();
                        pl.field_n.a((wg) (Object) var31);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    ((oe) this).field_c = ((oe) this).field_c + 1;
                    break L10;
                  }
                  L13: {
                    if (!((oe) this).g((byte) -61)) {
                      break L13;
                    } else {
                      if (!((oe) this).field_rc) {
                        break L13;
                      } else {
                        if (0 > ((oe) this).field_Pb) {
                          break L13;
                        } else {
                          L14: {
                            if (((oe) this).field_c != -100) {
                              break L14;
                            } else {
                              ((oe) this).field_ob = ((oe) this).field_ob + ((oe) this).field_J;
                              ((oe) this).field_T = ((oe) this).field_cb;
                              ((oe) this).field_J = 0;
                              pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
                              break L14;
                            }
                          }
                          L15: {
                            if (((oe) this).field_c == -75) {
                              var2 = ei.a(0, ((oe) this).field_ac, ((oe) this).field_fc);
                              ((oe) this).field_ob = ((oe) this).field_ob + var2;
                              v.a(8, var2);
                              pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          L16: {
                            if (((oe) this).field_c == -50) {
                              var2 = ei.a(0, ((oe) this).field_Tb * 2, ((oe) this).field_fc);
                              ((oe) this).field_ob = ((oe) this).field_ob + var2;
                              v.a(8, var2);
                              pl.field_n.a(pl.field_o, 100, qm.field_c * 6144 / 64, 8192);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          this.f(false);
                          break L13;
                        }
                      }
                    }
                  }
                  if (((oe) this).field_c >= 64) {
                    L17: {
                      L18: {
                        L19: {
                          if (((oe) this).field_Gb) {
                            break L19;
                          } else {
                            if (!((oe) this).field_Jb) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        if (((oe) this).field_Cb) {
                          break L18;
                        } else {
                          L20: {
                            if (((oe) this).field_A == 0) {
                              break L20;
                            } else {
                              if (!((oe) this).field_Jb) {
                                break L17;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (((oe) this).field_Pb < 0) {
                              break L21;
                            } else {
                              this.b((byte) 36, ((oe) this).field_ob - -((oe) this).field_J, ((oe) this).field_Pb);
                              break L21;
                            }
                          }
                          int discarded$37 = 0;
                          this.p();
                          return;
                        }
                      }
                      L22: {
                        if (((oe) this).g((byte) -122)) {
                          break L22;
                        } else {
                          if (!((oe) this).field_Cb) {
                            break L17;
                          } else {
                            break L22;
                          }
                        }
                      }
                      L23: {
                        L24: {
                          ((oe) this).field_Jb = false;
                          ((oe) this).field_Pb = ((oe) this).field_Pb + 1;
                          ((oe) this).field_w = ((oe) this).field_bc;
                          ((oe) this).field_Cb = false;
                          ((oe) this).field_ic = ((oe) this).field_u;
                          if (((oe) this).field_Pb == 2) {
                            break L24;
                          } else {
                            if ((((oe) this).field_Pb & 3) != 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        L25: {
                          if (((oe) this).field_Pb == 0) {
                            ((oe) this).field_Qb = 0;
                            this.a(164, (byte) 55, m.field_n);
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        ((oe) this).y((byte) -40);
                        break L23;
                      }
                      L26: {
                        if (((oe) this).field_Nb == null) {
                          break L26;
                        } else {
                          if (((oe) this).field_Nb.length != ((oe) this).field_Pb) {
                            break L26;
                          } else {
                            this.b((byte) -122, ((oe) this).field_ob, ((oe) this).field_Nb.length);
                            int discarded$38 = -3;
                            this.E();
                            int discarded$39 = 0;
                            this.p();
                            return;
                          }
                        }
                      }
                      ((oe) this).field_j = 314;
                      break L17;
                    }
                    int discarded$40 = -110;
                    this.j();
                    return;
                  } else {
                    L27: {
                      if (((oe) this).field_Ib) {
                        break L27;
                      } else {
                        if (!((oe) this).field_Jb) {
                          break L5;
                        } else {
                          break L27;
                        }
                      }
                    }
                    ((oe) this).s((byte) -41);
                    this.p((byte) 9);
                    return;
                  }
                }
                var2 = 0;
                L28: while (true) {
                  if (var2 >= 64) {
                    L29: {
                      ((oe) this).field_Xb.a();
                      ((oe) this).field_Zb = 15 & 1 + ((oe) this).field_Zb;
                      this.d(true);
                      if (!((oe) this).field_Gb) {
                        L30: {
                          if (!((oe) this).field_rb) {
                            L31: {
                              if (!ik.field_h[97]) {
                                break L31;
                              } else {
                                if (ik.field_h[96]) {
                                  break L31;
                                } else {
                                  if (!((oe) this).field_jc) {
                                    ((oe) this).field_I = 252 & 7 + ((oe) this).field_I;
                                    break L31;
                                  } else {
                                    ((oe) this).field_I = ((oe) this).field_I - -2 & 255;
                                    break L31;
                                  }
                                }
                              }
                            }
                            ((oe) this).field_hc = ((oe) this).field_hc + ((oe) this).field_qb;
                            if (!ik.field_h[96]) {
                              break L30;
                            } else {
                              if (!ik.field_h[97]) {
                                if (!((oe) this).field_kc) {
                                  ((oe) this).field_I = -4 + ((oe) this).field_I & 252;
                                  break L30;
                                } else {
                                  ((oe) this).field_I = -2 + ((oe) this).field_I & 255;
                                  break L30;
                                }
                              } else {
                                break L30;
                              }
                            }
                          } else {
                            break L30;
                          }
                        }
                        L32: {
                          if (!ik.field_h[98]) {
                            break L32;
                          } else {
                            if (((oe) this).field_ac <= 0) {
                              break L32;
                            } else {
                              if (0 != ((oe) this).field_e) {
                                break L32;
                              } else {
                                L33: {
                                  ((oe) this).field_jb.f(1024 * qm.field_c / 64);
                                  ((oe) this).field_kc = false;
                                  ((oe) this).field_rb = false;
                                  ((oe) this).field_jc = false;
                                  var2_double = 0.02454369260617026 * (double)((oe) this).field_I;
                                  ((oe) this).field_mc = ((oe) this).field_mc + (int)((double)((oe) this).field_ib * Math.sin(var2_double));
                                  ((oe) this).field_hc = ((oe) this).field_hc - (int)((double)((oe) this).field_ib * Math.cos(var2_double));
                                  if (((oe) this).field_Pb < 0) {
                                    break L33;
                                  } else {
                                    L34: {
                                      if (!((oe) this).field_F) {
                                        ((oe) this).field_ac = ((oe) this).field_ac - 1;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    ji.a(true, -1);
                                    break L33;
                                  }
                                }
                                L35: {
                                  if (((oe) this).field_ac != 0) {
                                    break L35;
                                  } else {
                                    this.a(-111, rl.field_l);
                                    break L35;
                                  }
                                }
                                var4 = 0;
                                L36: while (true) {
                                  if (var4 >= 64) {
                                    ((oe) this).field_qc = ((oe) this).field_qc + 64;
                                    break L29;
                                  } else {
                                    ((oe) this).field_Xb.field_E[((oe) this).field_Sb - -var4] = true;
                                    var5_double = var2_double + 0.2 * Math.random() - 0.1;
                                    var7_double = (double)((oe) this).field_ib * 616.8094117647058 * (0.5 + Math.random());
                                    var9 = -(int)(var7_double * Math.sin(var5_double));
                                    var10 = (int)(var7_double * Math.cos(var5_double));
                                    ((oe) this).field_Xb.field_x[((oe) this).field_Sb - -var4] = ((oe) this).field_H + ((oe) this).field_mc;
                                    ((oe) this).field_Xb.field_A[((oe) this).field_Sb + var4] = ((oe) this).field_p + ((oe) this).field_hc;
                                    var11_double = Math.random();
                                    ((oe) this).field_Xb.field_y[var4 + ((oe) this).field_Sb] = (int)((double)var9 * var11_double);
                                    ((oe) this).field_Xb.field_C[((oe) this).field_Sb + var4] = (int)(var11_double * (double)var10);
                                    ((oe) this).field_Xb.field_w[((oe) this).field_Sb - -var4] = 0;
                                    ((oe) this).field_Xb.i(var4 + ((oe) this).field_Sb);
                                    ((oe) this).field_Xb.field_y[((oe) this).field_Sb - -var4] = var9 + ((oe) this).field_mc;
                                    ((oe) this).field_Xb.field_C[var4 + ((oe) this).field_Sb] = var10 + ((oe) this).field_hc;
                                    var4++;
                                    continue L36;
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((oe) this).field_jb.j(0);
                        break L29;
                      } else {
                        ((oe) this).field_jb.j(0);
                        break L29;
                      }
                    }
                    L37: {
                      var2 = 0;
                      if (((oe) this).field_Pb >= 0) {
                        break L37;
                      } else {
                        L38: {
                          if (((oe) this).field_p >= 33554432) {
                            L39: {
                              L40: {
                                if (18874368 > ((oe) this).field_H) {
                                  break L40;
                                } else {
                                  if (((oe) this).field_H >= 48234496) {
                                    break L40;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              var2 = 1;
                              break L39;
                            }
                            if (((oe) this).field_p >= 35651584) {
                              break L38;
                            } else {
                              if (((oe) this).field_H < 28311552) {
                                break L38;
                              } else {
                                if (((oe) this).field_H < 38797312) {
                                  var2 = 1;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                        var3 = (((oe) this).field_hc >> 8) * (((oe) this).field_hc >> 8) + (((oe) this).field_mc >> 8) * (((oe) this).field_mc >> 8);
                        if (((oe) this).field_p < 65011712) {
                          break L37;
                        } else {
                          if (var3 > 50176) {
                            L41: {
                              var4 = -((oe) this).field_p + 67108864;
                              if (1048576 > var4) {
                                break L41;
                              } else {
                                if ((-1048576 + var4 >> 6) + 50176 >= var3) {
                                  break L37;
                                } else {
                                  break L41;
                                }
                              }
                            }
                            var2 = 1;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                      }
                    }
                    L42: {
                      L43: {
                        if (((oe) this).field_Gb) {
                          break L43;
                        } else {
                          L44: {
                            L45: {
                              if (bc.field_d) {
                                break L45;
                              } else {
                                if (ik.field_h[83]) {
                                  break L44;
                                } else {
                                  break L45;
                                }
                              }
                            }
                            if (ik.field_h[81]) {
                              break L44;
                            } else {
                              if (var2 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                          if (((oe) this).field_Tb <= 0) {
                            break L43;
                          } else {
                            if (((oe) this).field_e != 0) {
                              break L43;
                            } else {
                              L46: {
                                if (var2 == 0) {
                                  ((oe) this).field_db = true;
                                  break L46;
                                } else {
                                  break L46;
                                }
                              }
                              L47: {
                                if (((oe) this).field_Pb < 0) {
                                  break L47;
                                } else {
                                  ((oe) this).field_Tb = ((oe) this).field_Tb - 1;
                                  int discarded$41 = 76;
                                  ca.b();
                                  break L47;
                                }
                              }
                              L48: {
                                if (0 != ((oe) this).field_Tb) {
                                  break L48;
                                } else {
                                  this.a(-107, rc.field_c);
                                  pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                                  break L48;
                                }
                              }
                              ((oe) this).field_Bb = true;
                              ((oe) this).field_rb = false;
                              ((oe) this).field_v.f(qm.field_c * 16384 / 64);
                              break L42;
                            }
                          }
                        }
                      }
                      ((oe) this).field_Bb = false;
                      ((oe) this).field_v.f(0);
                      break L42;
                    }
                    this.a(true);
                    var3 = 0;
                    var4 = 0;
                    var5_long = 0L;
                    var7_long = 0L;
                    var9 = 0;
                    L49: while (true) {
                      if (~((oe) this).field_kb.size() >= ~var9) {
                        L50: {
                          stackOut_220_0 = ((oe) this).field_Wb;
                          stackOut_220_1 = (int)Math.sqrt((double)var3 + 0.5);
                          stackIn_222_0 = stackOut_220_0;
                          stackIn_222_1 = stackOut_220_1;
                          stackIn_221_0 = stackOut_220_0;
                          stackIn_221_1 = stackOut_220_1;
                          if (0 == var3) {
                            stackOut_222_0 = (hl) (Object) stackIn_222_0;
                            stackOut_222_1 = stackIn_222_1;
                            stackOut_222_2 = 8192;
                            stackIn_223_0 = stackOut_222_0;
                            stackIn_223_1 = stackOut_222_1;
                            stackIn_223_2 = stackOut_222_2;
                            break L50;
                          } else {
                            stackOut_221_0 = (hl) (Object) stackIn_221_0;
                            stackOut_221_1 = stackIn_221_1;
                            stackOut_221_2 = (int)(var5_long / (long)var3);
                            stackIn_223_0 = stackOut_221_0;
                            stackIn_223_1 = stackOut_221_1;
                            stackIn_223_2 = stackOut_221_2;
                            break L50;
                          }
                        }
                        L51: {
                          ((hl) (Object) stackIn_223_0).f(stackIn_223_1, stackIn_223_2);
                          stackOut_223_0 = ((oe) this).field_wb;
                          stackOut_223_1 = (int)Math.sqrt((double)var4 + 0.5);
                          stackIn_225_0 = stackOut_223_0;
                          stackIn_225_1 = stackOut_223_1;
                          stackIn_224_0 = stackOut_223_0;
                          stackIn_224_1 = stackOut_223_1;
                          if (var4 != 0) {
                            stackOut_225_0 = (hl) (Object) stackIn_225_0;
                            stackOut_225_1 = stackIn_225_1;
                            stackOut_225_2 = (int)(var7_long / (long)var4);
                            stackIn_226_0 = stackOut_225_0;
                            stackIn_226_1 = stackOut_225_1;
                            stackIn_226_2 = stackOut_225_2;
                            break L51;
                          } else {
                            stackOut_224_0 = (hl) (Object) stackIn_224_0;
                            stackOut_224_1 = stackIn_224_1;
                            stackOut_224_2 = 8192;
                            stackIn_226_0 = stackOut_224_0;
                            stackIn_226_1 = stackOut_224_1;
                            stackIn_226_2 = stackOut_224_2;
                            break L51;
                          }
                        }
                        L52: {
                          ((hl) (Object) stackIn_226_0).f(stackIn_226_1, stackIn_226_2);
                          var3 = 0;
                          var4_long = 0L;
                          if (((oe) this).field_oc < 50) {
                            var6_ref_hg = ((oe) this).field_C.a(false);
                            var7 = 0;
                            L53: while (true) {
                              if (~var7 <= ~((oe) this).field_ub) {
                                break L52;
                              } else {
                                var33_ref = (am) (Object) var6_ref_hg;
                                var9 = var33_ref.field_i << 16;
                                var10 = var33_ref.field_i << 16;
                                var11 = var33_ref.field_j << 16;
                                L54: while (true) {
                                  if (((oe) this).field_H >= var9) {
                                    L55: {
                                      if (~var10 >= ~((oe) this).field_H) {
                                        if (((oe) this).field_H >= ((oe) this).field_n + var10 >> 1) {
                                          var12 = var9;
                                          break L55;
                                        } else {
                                          var12 = var10;
                                          break L55;
                                        }
                                      } else {
                                        var12 = ((oe) this).field_H;
                                        break L55;
                                      }
                                    }
                                    var13_int = ((oe) this).b(1310720, var12, 96, var11);
                                    var13_int = var13_int * var13_int;
                                    var4_long = var4_long + (long)((oe) this).c(var12, 123) * (long)var13_int;
                                    var3 = var3 + var13_int;
                                    var6_ref_hg = var6_ref_hg.field_b;
                                    var7++;
                                    continue L53;
                                  } else {
                                    var9 = var9 - (((oe) this).field_n << 16);
                                    var10 = var10 - (((oe) this).field_n << 16);
                                    continue L54;
                                  }
                                }
                              }
                            }
                          } else {
                            break L52;
                          }
                        }
                        L56: {
                          stackOut_239_0 = ((oe) this).field_r;
                          stackOut_239_1 = ie.field_q / 100;
                          stackOut_239_2 = (int)Math.sqrt(0.5 + (double)var3);
                          stackIn_241_0 = stackOut_239_0;
                          stackIn_241_1 = stackOut_239_1;
                          stackIn_241_2 = stackOut_239_2;
                          stackIn_240_0 = stackOut_239_0;
                          stackIn_240_1 = stackOut_239_1;
                          stackIn_240_2 = stackOut_239_2;
                          if (var3 == 0) {
                            stackOut_241_0 = (hl) (Object) stackIn_241_0;
                            stackOut_241_1 = stackIn_241_1;
                            stackOut_241_2 = stackIn_241_2;
                            stackOut_241_3 = 8192;
                            stackIn_242_0 = stackOut_241_0;
                            stackIn_242_1 = stackOut_241_1;
                            stackIn_242_2 = stackOut_241_2;
                            stackIn_242_3 = stackOut_241_3;
                            break L56;
                          } else {
                            stackOut_240_0 = (hl) (Object) stackIn_240_0;
                            stackOut_240_1 = stackIn_240_1;
                            stackOut_240_2 = stackIn_240_2;
                            stackOut_240_3 = (int)(var4_long / (long)var3);
                            stackIn_242_0 = stackOut_240_0;
                            stackIn_242_1 = stackOut_240_1;
                            stackIn_242_2 = stackOut_240_2;
                            stackIn_242_3 = stackOut_240_3;
                            break L56;
                          }
                        }
                        ((hl) (Object) stackIn_242_0).a(stackIn_242_1, stackIn_242_2, stackIn_242_3);
                        var3_ref_ic = (ic) (Object) ((oe) this).field_N.a(false);
                        L57: while (true) {
                          if (var3_ref_ic == null) {
                            L58: {
                              L59: {
                                ((oe) this).field_oc = (1 + ((oe) this).field_oc) % 200;
                                if (!((oe) this).field_Gb) {
                                  break L59;
                                } else {
                                  if (((oe) this).field_Ub >= 0) {
                                    break L59;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              L60: {
                                var3 = 0;
                                var4 = 0;
                                if (((oe) this).field_Gb) {
                                  break L60;
                                } else {
                                  var4 = ((oe) this).field_hc;
                                  var3 = ((oe) this).field_mc;
                                  break L60;
                                }
                              }
                              L61: {
                                if (((oe) this).field_Ub >= 0) {
                                  var3 = (((oe) this).field_Ob >> 2) + var3 - (var3 >> 2);
                                  var4 = (((oe) this).field_o >> 2) + (var4 - (var4 >> 2));
                                  break L61;
                                } else {
                                  break L61;
                                }
                              }
                              var5_double = (double)var4 * (double)var4 + (double)var3 * (double)var3;
                              if (1717986918400.0 > var5_double) {
                                break L58;
                              } else {
                                var5_double = Math.sqrt(1717986918400.0 / var5_double);
                                ((oe) this).field_mc = (int)((double)((oe) this).field_mc * var5_double);
                                ((oe) this).field_Ob = (int)((double)((oe) this).field_Ob * var5_double);
                                ((oe) this).field_o = (int)((double)((oe) this).field_o * var5_double);
                                ((oe) this).field_hc = (int)((double)((oe) this).field_hc * var5_double);
                                break L58;
                              }
                            }
                            L62: {
                              var3 = 0;
                              if (!((oe) this).field_Gb) {
                                L63: {
                                  if (!((oe) this).field_rb) {
                                    L64: {
                                      if (((oe) this).field_p < 33554432) {
                                        stackOut_330_0 = 0;
                                        stackIn_331_0 = stackOut_330_0;
                                        break L64;
                                      } else {
                                        stackOut_329_0 = 1;
                                        stackIn_331_0 = stackOut_329_0;
                                        break L64;
                                      }
                                    }
                                    L65: {
                                      var4 = stackIn_331_0;
                                      ((oe) this).field_M = ((oe) this).field_M + ((oe) this).field_mc;
                                      ((oe) this).field_H = ((oe) this).field_H + ((oe) this).field_mc;
                                      ((oe) this).field_p = ((oe) this).field_p + ((oe) this).field_hc;
                                      if (!((oe) this).field_kc) {
                                        stackOut_333_0 = 0;
                                        stackIn_334_0 = stackOut_333_0;
                                        break L65;
                                      } else {
                                        stackOut_332_0 = 1;
                                        stackIn_334_0 = stackOut_332_0;
                                        break L65;
                                      }
                                    }
                                    L66: {
                                      var5 = stackIn_334_0;
                                      if (!((oe) this).field_jc) {
                                        stackOut_336_0 = 0;
                                        stackIn_337_0 = stackOut_336_0;
                                        break L66;
                                      } else {
                                        stackOut_335_0 = 1;
                                        stackIn_337_0 = stackOut_335_0;
                                        break L66;
                                      }
                                    }
                                    L67: {
                                      var6 = stackIn_337_0;
                                      ((oe) this).field_q = false;
                                      ((oe) this).field_jc = false;
                                      ((oe) this).field_kc = false;
                                      if (!((oe) this).field_Bb) {
                                        this.A((byte) -102);
                                        if (((oe) this).field_q) {
                                          this.h((byte) -70);
                                          break L67;
                                        } else {
                                          L68: {
                                            if (((oe) this).field_kc) {
                                              break L68;
                                            } else {
                                              if (!((oe) this).field_jc) {
                                                break L67;
                                              } else {
                                                break L68;
                                              }
                                            }
                                          }
                                          L69: {
                                            if (var5 == 0) {
                                              if (!((oe) this).field_kc) {
                                                break L69;
                                              } else {
                                                pl.field_n.a(ka.field_e, 100, qm.field_c * 6144 / 64, 8192);
                                                break L69;
                                              }
                                            } else {
                                              ((oe) this).field_kc = true;
                                              break L69;
                                            }
                                          }
                                          L70: {
                                            if (var6 != 0) {
                                              ((oe) this).field_jc = true;
                                              break L70;
                                            } else {
                                              if (!((oe) this).field_jc) {
                                                break L70;
                                              } else {
                                                pl.field_n.a(ri.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                                break L70;
                                              }
                                            }
                                          }
                                          L71: {
                                            ((oe) this).field_mc = ((oe) this).field_mc >> 1;
                                            if (((oe) this).field_hc <= 65536) {
                                              break L71;
                                            } else {
                                              ((oe) this).field_hc = 65536;
                                              break L71;
                                            }
                                          }
                                          L72: {
                                            if (!((oe) this).field_kc) {
                                              break L72;
                                            } else {
                                              if (((oe) this).field_jc) {
                                                L73: {
                                                  if (((oe) this).field_hc > 0) {
                                                    ((oe) this).field_hc = 0;
                                                    break L73;
                                                  } else {
                                                    break L73;
                                                  }
                                                }
                                                ((oe) this).field_p = ((oe) this).field_p - 65536;
                                                if (-256 > ((oe) this).field_mc) {
                                                  break L67;
                                                } else {
                                                  if (((oe) this).field_mc > 256) {
                                                    break L67;
                                                  } else {
                                                    ((oe) this).field_hc = 0;
                                                    var3 = 1;
                                                    ((oe) this).field_mc = 0;
                                                    ((oe) this).field_rb = true;
                                                    break L67;
                                                  }
                                                }
                                              } else {
                                                break L72;
                                              }
                                            }
                                          }
                                          if (((oe) this).field_kc) {
                                            ((oe) this).field_M = ((oe) this).field_M + 16384;
                                            ((oe) this).field_H = ((oe) this).field_H + 16384;
                                            ((oe) this).field_I = ((oe) this).field_I + 1 & 255;
                                            break L67;
                                          } else {
                                            ((oe) this).field_H = ((oe) this).field_H - 16384;
                                            ((oe) this).field_I = -1 + ((oe) this).field_I & 255;
                                            ((oe) this).field_M = ((oe) this).field_M - 16384;
                                            break L67;
                                          }
                                        }
                                      } else {
                                        ((oe) this).field_Hb = 0;
                                        ((oe) this).field_pb = 0;
                                        int discarded$42 = 69;
                                        this.v();
                                        if (0 == (((oe) this).field_Hb | ((oe) this).field_pb)) {
                                          break L67;
                                        } else {
                                          int discarded$43 = -125;
                                          this.A();
                                          break L67;
                                        }
                                      }
                                    }
                                    L74: {
                                      if (((oe) this).field_Pb >= 0) {
                                        break L74;
                                      } else {
                                        if (((oe) this).field_ec) {
                                          break L74;
                                        } else {
                                          L75: {
                                            if (var4 == 0) {
                                              break L75;
                                            } else {
                                              if (((oe) this).field_p >= 33554432) {
                                                break L75;
                                              } else {
                                                this.a(-114, bh.field_e);
                                                pl.field_n.a(gm.field_b, 100, qm.field_c * 6144 / 64, 8192);
                                                break L75;
                                              }
                                            }
                                          }
                                          L76: {
                                            if (var4 != 0) {
                                              break L76;
                                            } else {
                                              if (((oe) this).field_p < 33554432) {
                                                break L76;
                                              } else {
                                                this.a(67, ge.field_a);
                                                pl.field_n.a(gm.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                                break L63;
                                              }
                                            }
                                          }
                                          break L63;
                                        }
                                      }
                                    }
                                    break L63;
                                  } else {
                                    ((oe) this).field_q = false;
                                    this.A((byte) 72);
                                    if (!((oe) this).field_q) {
                                      break L63;
                                    } else {
                                      this.h((byte) -112);
                                      break L63;
                                    }
                                  }
                                }
                                L77: while (true) {
                                  if (((oe) this).field_H >= 0) {
                                    L78: while (true) {
                                      if (((oe) this).field_H < ((oe) this).field_n << 16) {
                                        break L62;
                                      } else {
                                        ((oe) this).field_H = ((oe) this).field_H - (((oe) this).field_n << 16);
                                        ((oe) this).field_Kb = ((oe) this).field_Kb + ((oe) this).field_n;
                                        continue L78;
                                      }
                                    }
                                  } else {
                                    ((oe) this).field_H = ((oe) this).field_H + (((oe) this).field_n << 16);
                                    ((oe) this).field_Kb = ((oe) this).field_Kb - ((oe) this).field_n;
                                    continue L77;
                                  }
                                }
                              } else {
                                break L62;
                              }
                            }
                            var4_ref = (Object) (Object) ((oe) this).field_f;
                            var5_ref_hl = ((oe) this).field_Eb;
                            ((oe) this).field_f = null;
                            ((oe) this).field_Eb = null;
                            var6 = 0;
                            L79: while (true) {
                              if (var6 >= ((oe) this).field_kb.size()) {
                                L80: {
                                  if (var4_ref == null) {
                                    break L80;
                                  } else {
                                    if (((oe) this).field_f == null) {
                                      pl.field_n.b((wg) var4_ref);
                                      pl.field_n.b((wg) (Object) ((oe) this).field_R);
                                      ((oe) this).field_R = null;
                                      pl.field_n.a(al.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                      break L80;
                                    } else {
                                      break L80;
                                    }
                                  }
                                }
                                L81: {
                                  if (var5_ref_hl == null) {
                                    break L81;
                                  } else {
                                    if (null != ((oe) this).field_Eb) {
                                      break L81;
                                    } else {
                                      var5_ref_hl.h(0);
                                      break L81;
                                    }
                                  }
                                }
                                L82: {
                                  if (((oe) this).field_Gb) {
                                    break L82;
                                  } else {
                                    if (!((oe) this).field_rb) {
                                      break L82;
                                    } else {
                                      if (((oe) this).field_ac == 0) {
                                        this.h((byte) -61);
                                        break L82;
                                      } else {
                                        break L82;
                                      }
                                    }
                                  }
                                }
                                L83: {
                                  if (((oe) this).field_Gb) {
                                    break L83;
                                  } else {
                                    if (!((oe) this).field_rb) {
                                      break L83;
                                    } else {
                                      if (((oe) this).field_Ub < 0) {
                                        var4_ref = null;
                                        var5 = 0;
                                        L84: while (true) {
                                          if (var5 >= 3) {
                                            if (var3 == 0) {
                                              break L83;
                                            } else {
                                              if (var4_ref != null) {
                                                pl.field_n.a(gm.field_b, 100, 6144 * qm.field_c / 64, 8192);
                                                this.a(127, (String) var4_ref);
                                                break L83;
                                              } else {
                                                break L83;
                                              }
                                            }
                                          } else {
                                            var6 = 0;
                                            L85: while (true) {
                                              if (~var6 <= ~((oe) this).field_kb.size()) {
                                                var5++;
                                                continue L84;
                                              } else {
                                                L86: {
                                                  var37_ref = (sa) ((oe) this).field_kb.elementAt(var6);
                                                  if (var5 != 0) {
                                                    if (var5 != 1) {
                                                      L87: {
                                                        if (var37_ref.field_n != 1) {
                                                          stackOut_456_0 = 0;
                                                          stackIn_457_0 = stackOut_456_0;
                                                          break L87;
                                                        } else {
                                                          stackOut_455_0 = 1;
                                                          stackIn_457_0 = stackOut_455_0;
                                                          break L87;
                                                        }
                                                      }
                                                      var8 = stackIn_457_0;
                                                      break L86;
                                                    } else {
                                                      L88: {
                                                        if (5 != var37_ref.field_n) {
                                                          stackOut_452_0 = 0;
                                                          stackIn_453_0 = stackOut_452_0;
                                                          break L88;
                                                        } else {
                                                          stackOut_451_0 = 1;
                                                          stackIn_453_0 = stackOut_451_0;
                                                          break L88;
                                                        }
                                                      }
                                                      var8 = stackIn_453_0;
                                                      break L86;
                                                    }
                                                  } else {
                                                    L89: {
                                                      if (!mf.a(var37_ref.field_n, -64)) {
                                                        stackOut_447_0 = 0;
                                                        stackIn_448_0 = stackOut_447_0;
                                                        break L89;
                                                      } else {
                                                        stackOut_446_0 = 1;
                                                        stackIn_448_0 = stackOut_446_0;
                                                        break L89;
                                                      }
                                                    }
                                                    var8 = stackIn_448_0;
                                                    break L86;
                                                  }
                                                }
                                                L90: {
                                                  if (var8 == 0) {
                                                    break L90;
                                                  } else {
                                                    var38 = var37_ref.field_i;
                                                    var10 = ((var37_ref.field_k << 16) - -(var38.field_A << 15)) % (((oe) this).field_n << 16);
                                                    var11 = (var38.field_z << 15) + (var37_ref.field_g << 16);
                                                    var12 = -(var10 >> 16) + (((oe) this).field_H >> 16);
                                                    L91: while (true) {
                                                      if (~(-((oe) this).field_n >> 1) >= ~var12) {
                                                        L92: while (true) {
                                                          if (((oe) this).field_n >> 1 > var12) {
                                                            L93: {
                                                              var13_int = (((oe) this).field_p >> 16) - (var11 >> 16);
                                                              if (-5 > var12) {
                                                                break L93;
                                                              } else {
                                                                if (var12 > 5) {
                                                                  break L93;
                                                                } else {
                                                                  if (-10 - var38.field_z / 2 > var13_int) {
                                                                    break L93;
                                                                  } else {
                                                                    if (var13_int <= -(var38.field_z / 2) + -2) {
                                                                      if (var37_ref.field_n >= 9) {
                                                                        var4_ref = (Object) (Object) on.field_d;
                                                                        break L90;
                                                                      } else {
                                                                        var13_int = 0;
                                                                        var12 = 0;
                                                                        break L93;
                                                                      }
                                                                    } else {
                                                                      break L93;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L94: {
                                                              if (-5 > var13_int) {
                                                                break L94;
                                                              } else {
                                                                if (var13_int > 5) {
                                                                  break L94;
                                                                } else {
                                                                  if (-32 > var12) {
                                                                    break L94;
                                                                  } else {
                                                                    if (var12 <= 32) {
                                                                      L95: {
                                                                        ((oe) this).field_kb.removeElementAt(var6);
                                                                        var37_ref.a((oe) this, (byte) 75);
                                                                        var6--;
                                                                        if (((oe) this).field_B == null) {
                                                                          break L95;
                                                                        } else {
                                                                          ((oe) this).field_B.a(var37_ref, 4236);
                                                                          break L95;
                                                                        }
                                                                      }
                                                                      L96: {
                                                                        ((oe) this).field_Ub = var37_ref.field_n;
                                                                        this.f(-118, 1);
                                                                        ((oe) this).field_mb = var10;
                                                                        ((oe) this).field_o = 0;
                                                                        ((oe) this).field_E = var11;
                                                                        ((oe) this).field_Ob = 0;
                                                                        ((oe) this).field_W = false;
                                                                        if (((oe) this).field_Ub < 9) {
                                                                          var14 = qj.a((byte) -38, ((oe) this).field_Ub, ((oe) this).field_fc);
                                                                          ((oe) this).field_J = ((oe) this).field_J + var14;
                                                                          v.a(8, var14);
                                                                          this.a(((oe) this).field_Ub, (byte) -9);
                                                                          break L96;
                                                                        } else {
                                                                          ((oe) this).field_e = 50;
                                                                          break L96;
                                                                        }
                                                                      }
                                                                      pl.field_n.a(fg.field_a, 100, qm.field_c * 6144 / 64, 8192);
                                                                      break L83;
                                                                    } else {
                                                                      break L94;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L97: {
                                                              if (var4_ref == (Object) (Object) on.field_d) {
                                                                break L97;
                                                              } else {
                                                                if (var13_int < -15) {
                                                                  break L97;
                                                                } else {
                                                                  if (var13_int > 15) {
                                                                    break L97;
                                                                  } else {
                                                                    if (var12 < -32) {
                                                                      break L97;
                                                                    } else {
                                                                      if (32 >= var12) {
                                                                        if (1 == var37_ref.field_n) {
                                                                          var4_ref = (Object) (Object) ff.field_f;
                                                                          break L90;
                                                                        } else {
                                                                          if (5 != var37_ref.field_n) {
                                                                            var4_ref = (Object) (Object) nn.field_c;
                                                                            break L90;
                                                                          } else {
                                                                            var4_ref = (Object) (Object) ui.field_d;
                                                                            break L90;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L97;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            if (var4_ref != null) {
                                                              break L90;
                                                            } else {
                                                              if (var13_int < -15) {
                                                                break L90;
                                                              } else {
                                                                if (15 < var13_int) {
                                                                  break L90;
                                                                } else {
                                                                  if (var12 < -64) {
                                                                    break L90;
                                                                  } else {
                                                                    if (var12 <= 64) {
                                                                      var4_ref = (Object) (Object) fd.field_e;
                                                                      break L90;
                                                                    } else {
                                                                      break L90;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var12 = var12 - ((oe) this).field_n;
                                                            continue L92;
                                                          }
                                                        }
                                                      } else {
                                                        var12 = var12 + ((oe) this).field_n;
                                                        continue L91;
                                                      }
                                                    }
                                                  }
                                                }
                                                var6++;
                                                continue L85;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L83;
                                      }
                                    }
                                  }
                                }
                                L98: {
                                  if (((oe) this).field_Ub >= 0) {
                                    L99: {
                                      L100: {
                                        if (((oe) this).field_W) {
                                          break L100;
                                        } else {
                                          if (!((oe) this).field_Gb) {
                                            L101: {
                                              var4 = ((oe) this).field_H + -((oe) this).field_mb >> 8;
                                              if (-((oe) this).field_n << 7 > var4) {
                                                var4 = var4 + (((oe) this).field_n << 8);
                                                break L101;
                                              } else {
                                                if (~(((oe) this).field_n << 7) < ~var4) {
                                                  break L101;
                                                } else {
                                                  var4 = var4 - (((oe) this).field_n << 8);
                                                  break L101;
                                                }
                                              }
                                            }
                                            L102: {
                                              var5 = -((oe) this).field_E + ((oe) this).field_p >> 8;
                                              var6 = ((oe) this).field_mc;
                                              var7 = ((oe) this).field_hc;
                                              if (((oe) this).field_e > 0) {
                                                var6 = var6 + (var4 << 8) * (-((oe) this).field_e + 50) / 2500;
                                                var7 = var7 + (-((oe) this).field_e + 50) * (var5 << 8) / 2500;
                                                var5 = (125 + -((oe) this).field_e) * var5 / 75;
                                                var4 = var4 * (125 + -((oe) this).field_e) / 75;
                                                break L102;
                                              } else {
                                                break L102;
                                              }
                                            }
                                            var8 = var4 * var4 - -(var5 * var5);
                                            var9_ref_Object = (Object) (Object) pl.field_n;
                                            synchronized (var9_ref_Object) {
                                              L103: {
                                                L104: {
                                                  L105: {
                                                    var10_double = 0.000244140625 * Math.sqrt((double)var8);
                                                    var5 = (int)((double)var5 / var10_double);
                                                    var4 = (int)((double)var4 / var10_double);
                                                    var12 = ((var6 >> 4) * var4 - -(var5 * (var7 >> 4))) * qm.field_c / 64 >> 6;
                                                    if (((oe) this).field_e != 0) {
                                                      break L105;
                                                    } else {
                                                      if (var8 < 150994944) {
                                                        break L105;
                                                      } else {
                                                        pl.field_n.a(rk.field_c, 100, var12 >> 11);
                                                        ((oe) this).field_W = true;
                                                        ((oe) this).field_fb.field_l = 0;
                                                        break L104;
                                                      }
                                                    }
                                                  }
                                                  ((oe) this).field_fb.field_l = var12;
                                                  ((oe) this).field_fb.field_o = var8 / 2304;
                                                  break L104;
                                                }
                                                break L103;
                                              }
                                            }
                                            break L99;
                                          } else {
                                            break L100;
                                          }
                                        }
                                      }
                                      ((oe) this).field_fb.field_l = 0;
                                      break L99;
                                    }
                                    if (((oe) this).field_W) {
                                      L106: {
                                        ((oe) this).field_mb = ((oe) this).field_mb + ((oe) this).field_Ob;
                                        ((oe) this).field_o = ((oe) this).field_o + ((oe) this).field_qb;
                                        ((oe) this).field_E = ((oe) this).field_E + ((oe) this).field_o;
                                        if (!((oe) this).field_Gb) {
                                          L107: {
                                            var4_double = (double)(-((oe) this).field_H + ((oe) this).field_mb);
                                            if ((double)(-((oe) this).field_n << 15) > var4_double) {
                                              var4_double = var4_double + (double)(((oe) this).field_n << 16);
                                              break L107;
                                            } else {
                                              if ((double)(((oe) this).field_n << 15) > var4_double) {
                                                break L107;
                                              } else {
                                                var4_double = var4_double - (double)(((oe) this).field_n << 16);
                                                break L107;
                                              }
                                            }
                                          }
                                          L108: {
                                            var6_double = (double)(((oe) this).field_E - ((oe) this).field_p);
                                            var8_double = Math.sqrt(var6_double * var6_double + var4_double * var4_double);
                                            var4_double = var4_double / var8_double;
                                            var10_double = var8_double - 3145728.0;
                                            var6_double = var6_double / var8_double;
                                            var12 = (int)(var4_double * var10_double);
                                            var13_int = (int)(var10_double * var6_double);
                                            if (!((oe) this).field_rb) {
                                              ((oe) this).field_p = ((oe) this).field_p + (var13_int >> 2);
                                              ((oe) this).field_E = ((oe) this).field_E - (var13_int + -(var13_int >> 2));
                                              ((oe) this).field_H = ((oe) this).field_H + (var12 >> 2);
                                              ((oe) this).field_mb = ((oe) this).field_mb - (-(var12 >> 2) + var12);
                                              ((oe) this).field_H = ((((oe) this).field_n << 16) + ((oe) this).field_H) % (((oe) this).field_n << 16);
                                              ((oe) this).field_M = ((oe) this).field_M + (var12 >> 2);
                                              break L108;
                                            } else {
                                              ((oe) this).field_mb = ((oe) this).field_mb - var12;
                                              ((oe) this).field_E = ((oe) this).field_E - var13_int;
                                              break L108;
                                            }
                                          }
                                          var14_double = (double)(((oe) this).field_o - ((oe) this).field_hc) * var6_double + (double)(((oe) this).field_Ob + -((oe) this).field_mc) * var4_double;
                                          var16 = (int)(var14_double * var4_double);
                                          var17_int = (int)(var6_double * var14_double);
                                          if (((oe) this).field_rb) {
                                            ((oe) this).field_o = ((oe) this).field_o - var17_int;
                                            ((oe) this).field_Ob = ((oe) this).field_Ob - var16;
                                            break L106;
                                          } else {
                                            ((oe) this).field_mc = ((oe) this).field_mc + (var16 >> 2);
                                            ((oe) this).field_hc = ((oe) this).field_hc + (var17_int >> 2);
                                            ((oe) this).field_Ob = ((oe) this).field_Ob - (-(var16 >> 2) + var16);
                                            ((oe) this).field_o = ((oe) this).field_o - (-(var17_int >> 2) + var17_int);
                                            break L106;
                                          }
                                        } else {
                                          break L106;
                                        }
                                      }
                                      ((oe) this).field_mb = (((oe) this).field_mb - -(((oe) this).field_n << 16)) % (((oe) this).field_n << 16);
                                      ((oe) this).field_o = ((oe) this).field_o - ((oe) this).field_o / 256;
                                      ((oe) this).field_Ob = ((oe) this).field_Ob - ((oe) this).field_Ob / 256;
                                      var39 = mb.field_f[((oe) this).field_Ub];
                                      var4_ref = (Object) (Object) var39;
                                      var5 = (-(var39.field_A << 15) + ((oe) this).field_mb >> 16) + ((oe) this).field_n;
                                      var6 = ((oe) this).field_E - (var39.field_z << 15) >> 16;
                                      int discarded$44 = -1;
                                      if (this.b(var5, (ed) var4_ref, var6)) {
                                        this.k((byte) 9);
                                        break L98;
                                      } else {
                                        break L98;
                                      }
                                    } else {
                                      break L98;
                                    }
                                  } else {
                                    ((oe) this).field_fb.field_l = 0;
                                    break L98;
                                  }
                                }
                                var4 = 0;
                                var5_ref_hg = ((oe) this).field_G.a(false);
                                var6 = 0;
                                L109: while (true) {
                                  if (var6 >= ((oe) this).field_x) {
                                    L110: {
                                      if (var4 == 0) {
                                        break L110;
                                      } else {
                                        int discarded$45 = 127;
                                        this.F();
                                        break L110;
                                      }
                                    }
                                    var4 = ((oe) this).field_qc * qm.field_c / 32;
                                    var5 = var4 * 8192;
                                    var6_ref_pi = (pi) (Object) ((oe) this).field_hb.a(false);
                                    L111: while (true) {
                                      if (var6_ref_pi == null) {
                                        L112: {
                                          if (((oe) this).field_Gb) {
                                            break L112;
                                          } else {
                                            L113: {
                                              if (((oe) this).field_m > 0) {
                                                ((oe) this).field_m = ((oe) this).field_m - 1;
                                                break L113;
                                              } else {
                                                if (ik.field_p) {
                                                  break L113;
                                                } else {
                                                  if (!ik.field_h[82]) {
                                                    break L113;
                                                  } else {
                                                    L114: {
                                                      var6_double = (double)((oe) this).field_I * 0.02454369260617026;
                                                      var8 = (int)(Math.sin(var6_double) * 131072.0);
                                                      var9 = -(int)(Math.cos(var6_double) * 131072.0);
                                                      this.b(((oe) this).field_p + 5 * var9, ((oe) this).field_H - -(5 * var8), ((oe) this).field_hc + var9, 256, 0, var8 + ((oe) this).field_mc);
                                                      if (!((oe) this).field_lb) {
                                                        pl.field_n.a(ni.field_M, 100, qm.field_c * 6144 / 64, 8192);
                                                        break L114;
                                                      } else {
                                                        this.b(((oe) this).field_p - -(var9 * 5), ((oe) this).field_H + var8 * 5, (var8 >> 3) + -(var9 >> 3) + (((oe) this).field_hc + var9), 256, 0, ((oe) this).field_mc + (var8 - ((var8 >> 3) + (var9 >> 3))));
                                                        this.b(((oe) this).field_p - -(var9 * 5), 5 * var8 + ((oe) this).field_H, -(var8 >> 3) + -(var9 >> 3) + (var9 + ((oe) this).field_hc), 256, 0, (var9 >> 3) + ((oe) this).field_mc + (var8 + -(var8 >> 3)));
                                                        pl.field_n.a(gn.field_e, 100, 6144 * qm.field_c / 64, 8192);
                                                        break L114;
                                                      }
                                                    }
                                                    ((oe) this).field_m = 9;
                                                    break L113;
                                                  }
                                                }
                                              }
                                            }
                                            if (0 >= ((oe) this).field_yb) {
                                              if (((oe) this).field_tb <= 0) {
                                                break L112;
                                              } else {
                                                int discarded$46 = 61;
                                                if (!this.d()) {
                                                  break L112;
                                                } else {
                                                  var6_double = 0.02454369260617026 * (double)((oe) this).field_I;
                                                  var8 = (int)(131072.0 * Math.sin(var6_double));
                                                  var9 = -(int)(Math.cos(var6_double) * 131072.0);
                                                  var43 = new pi();
                                                  var43.field_p = ((oe) this).field_hc + var9;
                                                  var43.field_n = (((oe) this).field_H + (5 * var8 - -(((oe) this).field_n << 16))) % (((oe) this).field_n << 16);
                                                  var43.field_r = 100;
                                                  var43.field_m = ((oe) this).field_I;
                                                  var43.field_k = ((oe) this).field_mc + var8;
                                                  var43.field_g = ((oe) this).field_p + 5 * var9;
                                                  var43.field_i = this.i(256, -22944);
                                                  var43.field_o = hl.c(kf.field_p, 100, ((oe) this).b(2097152, var43.field_n, 96, var43.field_g), ((oe) this).c(var43.field_n, 116));
                                                  pl.field_n.a((wg) (Object) var43.field_o);
                                                  ((oe) this).field_hb.a(-12328, (hg) (Object) var43);
                                                  ((oe) this).field_tb = ((oe) this).field_tb - 1;
                                                  int discarded$47 = 0;
                                                  fk.b();
                                                  ((oe) this).field_yb = 24;
                                                  break L112;
                                                }
                                              }
                                            } else {
                                              ((oe) this).field_yb = ((oe) this).field_yb - 1;
                                              break L112;
                                            }
                                          }
                                        }
                                        var6 = 0;
                                        L115: while (true) {
                                          if (~var6 <= ~((oe) this).field_kb.size()) {
                                            L116: {
                                              int discarded$48 = 109;
                                              this.B();
                                              if (null != ((oe) this).field_Db) {
                                                ((oe) this).field_Db.c(-1);
                                                break L116;
                                              } else {
                                                break L116;
                                              }
                                            }
                                            this.w(0);
                                            if (param0 <= -7) {
                                              L117: {
                                                stackOut_693_0 = ((oe) this).field_Z;
                                                stackOut_693_1 = var4;
                                                stackIn_695_0 = stackOut_693_0;
                                                stackIn_695_1 = stackOut_693_1;
                                                stackIn_694_0 = stackOut_693_0;
                                                stackIn_694_1 = stackOut_693_1;
                                                if (var4 == 0) {
                                                  stackOut_695_0 = (hl) (Object) stackIn_695_0;
                                                  stackOut_695_1 = stackIn_695_1;
                                                  stackOut_695_2 = 8192;
                                                  stackIn_696_0 = stackOut_695_0;
                                                  stackIn_696_1 = stackOut_695_1;
                                                  stackIn_696_2 = stackOut_695_2;
                                                  break L117;
                                                } else {
                                                  stackOut_694_0 = (hl) (Object) stackIn_694_0;
                                                  stackOut_694_1 = stackIn_694_1;
                                                  stackOut_694_2 = var5 / var4;
                                                  stackIn_696_0 = stackOut_694_0;
                                                  stackIn_696_1 = stackOut_694_1;
                                                  stackIn_696_2 = stackOut_694_2;
                                                  break L117;
                                                }
                                              }
                                              L118: {
                                                ((hl) (Object) stackIn_696_0).f(stackIn_696_1, stackIn_696_2);
                                                ((oe) this).field_Sb = (64 + ((oe) this).field_Sb) % 512;
                                                if (!((oe) this).field_rc) {
                                                  break L118;
                                                } else {
                                                  if (((oe) this).field_Pb >= 0) {
                                                    this.f(false);
                                                    break L118;
                                                  } else {
                                                    break L118;
                                                  }
                                                }
                                              }
                                              L119: {
                                                this.p((byte) 9);
                                                if (!ik.field_h[82]) {
                                                  ik.field_p = false;
                                                  break L119;
                                                } else {
                                                  break L119;
                                                }
                                              }
                                              L120: {
                                                if (ik.field_h[84]) {
                                                  break L120;
                                                } else {
                                                  s.field_E = false;
                                                  break L120;
                                                }
                                              }
                                              L121: {
                                                if (ik.field_h[83]) {
                                                  break L121;
                                                } else {
                                                  bc.field_d = false;
                                                  break L121;
                                                }
                                              }
                                              return;
                                            } else {
                                              return;
                                            }
                                          } else {
                                            L122: {
                                              var44_ref = (sa) ((oe) this).field_kb.elementAt(var6);
                                              if (var44_ref.field_n != 2) {
                                                break L122;
                                              } else {
                                                if (var44_ref.field_o > 0) {
                                                  var44_ref.field_o = var44_ref.field_o - 1;
                                                  break L122;
                                                } else {
                                                  if (!((oe) this).field_Gb) {
                                                    int discarded$49 = 16384;
                                                    var45 = rf.a(var44_ref.field_l);
                                                    if (var45 != null) {
                                                      L123: {
                                                        var9 = var44_ref.field_k - -var45.field_c << 16;
                                                        var10 = var45.field_b + var44_ref.field_g << 16;
                                                        var11 = ((oe) this).field_H - var9;
                                                        var12 = ((oe) this).field_p + -var10;
                                                        if (~var11 <= ~(-((oe) this).field_n << 15)) {
                                                          if (~var11 <= ~(((oe) this).field_n << 15)) {
                                                            var11 = var11 - (((oe) this).field_n << 16);
                                                            break L123;
                                                          } else {
                                                            break L123;
                                                          }
                                                        } else {
                                                          var11 = var11 + (((oe) this).field_n << 16);
                                                          break L123;
                                                        }
                                                      }
                                                      L124: {
                                                        var13 = (double)var11;
                                                        var15 = (double)var12;
                                                        var17 = Math.sqrt(var15 * var15 + var13 * var13);
                                                        if (13107200.0 <= var17) {
                                                          break L124;
                                                        } else {
                                                          var13 = var13 / var17;
                                                          var15 = var15 / var17;
                                                          var11 = (int)(131072.0 * var13);
                                                          var12 = (int)(var15 * 131072.0);
                                                          if (this.a((int)var17 >> 17, var12, 5 * var12 + var10, 5 * var11 + var9, var11, 0)) {
                                                            this.b(var10 + 5 * var12, var11 * 5 + var9, var12, 256, 1, var11);
                                                            var44_ref.field_o = 49;
                                                            pl.field_n.a(uk.field_j, 100, ((oe) this).b(6553600, var9, 96, var10), ((oe) this).c(var9, 120));
                                                            break L124;
                                                          } else {
                                                            break L122;
                                                          }
                                                        }
                                                      }
                                                      break L122;
                                                    } else {
                                                      break L122;
                                                    }
                                                  } else {
                                                    break L122;
                                                  }
                                                }
                                              }
                                            }
                                            var6++;
                                            continue L115;
                                          }
                                        }
                                      } else {
                                        var7 = 0;
                                        L125: while (true) {
                                          if (var7 >= 32) {
                                            L126: {
                                              var6_ref_pi.field_i.a();
                                              if (var6_ref_pi.field_r > 0) {
                                                var7_double = 0.02454369260617026 * (double)var6_ref_pi.field_m;
                                                var6_ref_pi.field_k = var6_ref_pi.field_k + (int)(2000.0 * Math.sin(var7_double));
                                                var6_ref_pi.field_p = var6_ref_pi.field_p - (int)(2000.0 * Math.cos(var7_double));
                                                var9 = 0;
                                                L127: while (true) {
                                                  if (32 <= var9) {
                                                    var6_ref_pi.field_l = var6_ref_pi.field_l + 32;
                                                    break L126;
                                                  } else {
                                                    var6_ref_pi.field_i.field_E[var9 + var6_ref_pi.field_q] = true;
                                                    var10_double = Math.random() * 0.2 + var7_double - 0.1;
                                                    var12_double = (0.5 + Math.random()) * 524288.0;
                                                    var14 = -(int)(Math.sin(var10_double) * var12_double);
                                                    var15_int = (int)(var12_double * Math.cos(var10_double));
                                                    var6_ref_pi.field_i.field_x[var9 + var6_ref_pi.field_q] = var6_ref_pi.field_n + var6_ref_pi.field_k;
                                                    var6_ref_pi.field_i.field_A[var9 + var6_ref_pi.field_q] = var6_ref_pi.field_g - -var6_ref_pi.field_p;
                                                    var16_double = Math.random();
                                                    var6_ref_pi.field_i.field_y[var6_ref_pi.field_q - -var9] = (int)(var16_double * (double)var14);
                                                    var6_ref_pi.field_i.field_C[var6_ref_pi.field_q - -var9] = (int)(var16_double * (double)var15_int);
                                                    var6_ref_pi.field_i.field_w[var9 + var6_ref_pi.field_q] = 0;
                                                    var6_ref_pi.field_i.i(var9 + var6_ref_pi.field_q);
                                                    var6_ref_pi.field_i.field_y[var6_ref_pi.field_q - -var9] = var6_ref_pi.field_k - -var14;
                                                    var6_ref_pi.field_i.field_C[var6_ref_pi.field_q - -var9] = var15_int + var6_ref_pi.field_p;
                                                    var9++;
                                                    continue L127;
                                                  }
                                                }
                                              } else {
                                                break L126;
                                              }
                                            }
                                            L128: {
                                              var7 = var6_ref_pi.field_l * ((oe) this).b(2097152, var6_ref_pi.field_n, 96, var6_ref_pi.field_g) / 1024;
                                              var4 = var4 + var7;
                                              var5 = var5 + var7 * ((oe) this).c(var6_ref_pi.field_n, 124);
                                              var6_ref_pi.field_q = (32 + var6_ref_pi.field_q) % 256;
                                              if (0 != var6_ref_pi.field_r) {
                                                int fieldTemp$50 = var6_ref_pi.field_r - 1;
                                                var6_ref_pi.field_r = var6_ref_pi.field_r - 1;
                                                if (fieldTemp$50 == 0) {
                                                  this.a(var6_ref_pi, 49);
                                                  break L128;
                                                } else {
                                                  mf.field_a.field_v = 0;
                                                  var8_ref_ed = mf.field_a;
                                                  var8_ref_ed.field_q = 0;
                                                  var9_ref_ed = mf.field_a;
                                                  var10_ref_ed = mf.field_a;
                                                  mf.field_a.field_x = 7;
                                                  var11_ref_ed = mf.field_a;
                                                  var9_ref_ed.field_A = 7;
                                                  var11_ref_ed.field_s = 7;
                                                  var10_ref_ed.field_z = 7;
                                                  mf.field_a.g();
                                                  em.d();
                                                  mf.field_m.a(4, (byte) 34, 4096, -var6_ref_pi.field_m << 8, 4);
                                                  md.field_D.a(120);
                                                  var12 = (int)Math.sqrt((double)var6_ref_pi.field_p * (double)var6_ref_pi.field_p + (double)var6_ref_pi.field_k * (double)var6_ref_pi.field_k);
                                                  var13_int = var12 / 196608 + 1;
                                                  var14 = var6_ref_pi.field_k;
                                                  var15_int = var6_ref_pi.field_p;
                                                  var16 = var13_int;
                                                  L129: while (true) {
                                                    if (0 >= var16) {
                                                      L130: {
                                                        if (!var6_ref_pi.field_h) {
                                                          break L130;
                                                        } else {
                                                          var6_ref_pi.field_h = false;
                                                          pl.field_n.a((wg) (Object) var6_ref_pi.field_o);
                                                          break L130;
                                                        }
                                                      }
                                                      var6_ref_pi.field_o.f(((oe) this).b(2097152, var6_ref_pi.field_n, 96, var6_ref_pi.field_g), ((oe) this).c(var6_ref_pi.field_n, 125));
                                                      break L128;
                                                    } else {
                                                      var17_int = var14 / var16;
                                                      var18 = var15_int / var16;
                                                      var19 = ((((oe) this).field_n << 16) + var6_ref_pi.field_n + var17_int) % (((oe) this).field_n << 16);
                                                      var6_ref_pi.field_n = var19;
                                                      var20 = var18 + var6_ref_pi.field_g;
                                                      var14 = var14 - var17_int;
                                                      var19 = var19 >> 16;
                                                      var15_int = var15_int - var18;
                                                      var6_ref_pi.field_g = var20;
                                                      var19 -= 4;
                                                      var20 = var20 >> 16;
                                                      var20 -= 4;
                                                      var21_ref_ic = (ic) (Object) ((oe) this).field_N.a(false);
                                                      L131: while (true) {
                                                        if (var21_ref_ic == null) {
                                                          int discarded$51 = -1;
                                                          if (this.b(((oe) this).field_n + var19, mf.field_a, var20)) {
                                                            var21 = 0;
                                                            L132: while (true) {
                                                              if (((oe) this).field_kb.size() <= var21) {
                                                                this.a(var6_ref_pi, 78);
                                                                var6_ref_pi.field_r = 0;
                                                                break L128;
                                                              } else {
                                                                var22_ref = (sa) ((oe) this).field_kb.elementAt(var21);
                                                                var23 = var22_ref.field_i;
                                                                var24 = -var19 + var22_ref.field_k;
                                                                L133: while (true) {
                                                                  if (((oe) this).field_n >> 1 >= var24) {
                                                                    L134: while (true) {
                                                                      if (~(-((oe) this).field_n >> 1) >= ~var24) {
                                                                        L135: {
                                                                          var25 = var22_ref.field_g + -var20;
                                                                          if (!ln.a(mf.field_a, 0, 0, var23, var24, var25)) {
                                                                            break L135;
                                                                          } else {
                                                                            L136: {
                                                                              this.a(var22_ref, 67, var21);
                                                                              if (var22_ref.field_n == 6) {
                                                                                break L136;
                                                                              } else {
                                                                                if (var22_ref.field_n == 7) {
                                                                                  break L136;
                                                                                } else {
                                                                                  break L135;
                                                                                }
                                                                              }
                                                                            }
                                                                            var26 = var22_ref.field_g - -14;
                                                                            var27 = ((oe) this).field_C.a(false);
                                                                            var28 = 0;
                                                                            L137: while (true) {
                                                                              if (((oe) this).field_ub <= var28) {
                                                                                break L135;
                                                                              } else {
                                                                                var29_ref = (am) (Object) var27;
                                                                                if (var29_ref.field_j != var26) {
                                                                                  var28++;
                                                                                  var27 = var27.field_b;
                                                                                  continue L137;
                                                                                } else {
                                                                                  this.a(var29_ref, (byte) 27);
                                                                                  break L135;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        var21++;
                                                                        continue L132;
                                                                      } else {
                                                                        var24 = var24 + ((oe) this).field_n;
                                                                        continue L134;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var24 = var24 - ((oe) this).field_n;
                                                                    continue L133;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var16--;
                                                            continue L129;
                                                          }
                                                        } else {
                                                          L138: {
                                                            var22_int = -(var21_ref_ic.field_p >> 16) + var19 + 8;
                                                            if (-(((oe) this).field_n >> 1) <= var22_int) {
                                                              if (~(((oe) this).field_n >> 1) > ~var22_int) {
                                                                var22_int = var22_int - ((oe) this).field_n;
                                                                break L138;
                                                              } else {
                                                                break L138;
                                                              }
                                                            } else {
                                                              var22_int = var22_int + ((oe) this).field_n;
                                                              break L138;
                                                            }
                                                          }
                                                          var23_int = var20 + (-(var21_ref_ic.field_q >> 16) - -8);
                                                          if (!ln.a(s.field_H, 0, 0, mf.field_a, var22_int, var23_int)) {
                                                            var21_ref_ic = (ic) (Object) ((oe) this).field_N.b((byte) 70);
                                                            continue L131;
                                                          } else {
                                                            L139: {
                                                              if (((oe) this).field_Gb) {
                                                                break L139;
                                                              } else {
                                                                var24 = hc.a(((oe) this).field_fc, (byte) 105);
                                                                ((oe) this).field_J = ((oe) this).field_J + var24;
                                                                v.a(8, var24);
                                                                break L139;
                                                              }
                                                            }
                                                            int discarded$52 = 5;
                                                            this.a(var21_ref_ic);
                                                            this.a(var6_ref_pi, 82);
                                                            var6_ref_pi.field_r = 0;
                                                            break L128;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (var6_ref_pi.field_l == 0) {
                                                  var6_ref_pi.c((byte) -52);
                                                  break L128;
                                                } else {
                                                  var6_ref_pi = (pi) (Object) ((oe) this).field_hb.b((byte) 70);
                                                  continue L111;
                                                }
                                              }
                                            }
                                            var6_ref_pi = (pi) (Object) ((oe) this).field_hb.b((byte) 70);
                                            continue L111;
                                          } else {
                                            L140: {
                                              if (var6_ref_pi.field_i.field_E[var7 + var6_ref_pi.field_q]) {
                                                var6_ref_pi.field_l = var6_ref_pi.field_l - 1;
                                                var6_ref_pi.field_i.field_E[var6_ref_pi.field_q + var7] = false;
                                                break L140;
                                              } else {
                                                break L140;
                                              }
                                            }
                                            var7++;
                                            continue L125;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L141: {
                                      var40_ref = (vh) (Object) var5_ref_hg;
                                      int fieldTemp$53 = var40_ref.field_m - 1;
                                      var40_ref.field_m = var40_ref.field_m - 1;
                                      if (fieldTemp$53 == 0) {
                                        var4 = 1;
                                        var40_ref.field_h = true;
                                        break L141;
                                      } else {
                                        L142: {
                                          var8 = (var40_ref.field_j + var40_ref.field_n - -(((oe) this).field_n << 16)) % (((oe) this).field_n << 16);
                                          var9 = var40_ref.field_g + var40_ref.field_l;
                                          var40_ref.field_j = var8;
                                          var40_ref.field_l = var9;
                                          var8 = var8 >> 16;
                                          var9 = var9 >> 16;
                                          if (var40_ref.field_k == 0) {
                                            var41 = s.field_H;
                                            var11_ref_ic = (ic) (Object) ((oe) this).field_N.a(false);
                                            L143: while (true) {
                                              if (var11_ref_ic == null) {
                                                break L142;
                                              } else {
                                                L144: {
                                                  var12 = var41.field_v + ((var11_ref_ic.field_q >> 16) - 8);
                                                  if (~var12 < ~var9) {
                                                    break L144;
                                                  } else {
                                                    if (~(var41.field_x + var12) >= ~var9) {
                                                      break L144;
                                                    } else {
                                                      var13_int = var8 + (-(var11_ref_ic.field_p >> 16) + (8 - var41.field_q));
                                                      L145: while (true) {
                                                        if (var13_int >= 0) {
                                                          var13_int = var13_int % ((oe) this).field_n;
                                                          if (var41.field_s <= var13_int) {
                                                            break L144;
                                                          } else {
                                                            if (var41.field_B[(var9 + -var12) * var41.field_s + var13_int] != 0) {
                                                              L146: {
                                                                if (!((oe) this).field_Gb) {
                                                                  var14 = hc.a(((oe) this).field_fc, (byte) 112);
                                                                  ((oe) this).field_J = ((oe) this).field_J + var14;
                                                                  v.a(8, var14);
                                                                  break L146;
                                                                } else {
                                                                  break L146;
                                                                }
                                                              }
                                                              int discarded$54 = 5;
                                                              this.a(var11_ref_ic);
                                                              var40_ref.field_h = true;
                                                              var4 = 1;
                                                              break L141;
                                                            } else {
                                                              break L144;
                                                            }
                                                          }
                                                        } else {
                                                          var13_int = var13_int + ((oe) this).field_n;
                                                          continue L145;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var11_ref_ic = (ic) (Object) ((oe) this).field_N.b((byte) 70);
                                                continue L143;
                                              }
                                            }
                                          } else {
                                            break L142;
                                          }
                                        }
                                        L147: {
                                          var10 = var8 & 31;
                                          var8 = var8 >> 5;
                                          var11 = var9 & 31;
                                          var9 = var9 >> 5;
                                          if (0 <= var9) {
                                            L148: {
                                              if (~((oe) this).field_D >= ~var9) {
                                                stackOut_572_0 = si.field_v;
                                                stackIn_573_0 = stackOut_572_0;
                                                break L148;
                                              } else {
                                                stackOut_571_0 = ((oe) this).field_V[var9 * ((oe) this).field_Mb - -var8];
                                                stackIn_573_0 = stackOut_571_0;
                                                break L148;
                                              }
                                            }
                                            var48 = stackIn_573_0;
                                            var47 = var48;
                                            var46 = var47;
                                            var42 = var46;
                                            var12_ref_int__ = var42;
                                            if (var12_ref_int__ == null) {
                                              break L147;
                                            } else {
                                              L149: {
                                                if (var12_ref_int__ == si.field_v) {
                                                  break L149;
                                                } else {
                                                  if ((var48[var11] & 1 << var10) == 0) {
                                                    break L147;
                                                  } else {
                                                    break L149;
                                                  }
                                                }
                                              }
                                              L150: {
                                                if (0 == var40_ref.field_k) {
                                                  this.j(-90, var11 | var9 << 5, var10 | var8 << 5);
                                                  break L150;
                                                } else {
                                                  break L150;
                                                }
                                              }
                                              var4 = 1;
                                              var40_ref.field_h = true;
                                              break L141;
                                            }
                                          } else {
                                            break L147;
                                          }
                                        }
                                        if (var40_ref.field_k != 1) {
                                          break L141;
                                        } else {
                                          if (!((oe) this).field_Gb) {
                                            L151: {
                                              L152: {
                                                if (!((oe) this).field_Bb) {
                                                  break L152;
                                                } else {
                                                  if (this.d(var8 << 5 | var10, 32, var9 << 5 | var11)) {
                                                    break L151;
                                                  } else {
                                                    break L152;
                                                  }
                                                }
                                              }
                                              if (this.a((byte) 105, var9 << 5 | var11, var8 << 5 | var10)) {
                                                break L151;
                                              } else {
                                                if (this.k(-2, var10 | var8 << 5, var9 << 5 | var11)) {
                                                  break L151;
                                                } else {
                                                  break L141;
                                                }
                                              }
                                            }
                                            var4 = 1;
                                            var40_ref.field_h = true;
                                            break L141;
                                          } else {
                                            break L141;
                                          }
                                        }
                                      }
                                    }
                                    var5_ref_hg = var5_ref_hg.field_b;
                                    var6++;
                                    continue L109;
                                  }
                                }
                              } else {
                                L153: {
                                  var34_ref = (sa) ((oe) this).field_kb.elementAt(var6);
                                  if (var34_ref.field_n != 0) {
                                    break L153;
                                  } else {
                                    var34_ref.field_h = false;
                                    if (((oe) this).field_Gb) {
                                      break L153;
                                    } else {
                                      if (((oe) this).field_rb) {
                                        L154: {
                                          var8 = (-var34_ref.field_k + ((((oe) this).field_H >> 16) + ((oe) this).field_n)) % ((oe) this).field_n;
                                          var9 = -var34_ref.field_g + (((oe) this).field_p >> 16);
                                          if (var8 < 7) {
                                            break L154;
                                          } else {
                                            if (var8 >= 23) {
                                              break L154;
                                            } else {
                                              if (var9 < 50) {
                                                break L154;
                                              } else {
                                                if (var9 >= 55) {
                                                  break L154;
                                                } else {
                                                  if (((oe) this).field_ac < 5000) {
                                                    L155: {
                                                      var34_ref.field_h = true;
                                                      var10 = 5000 - ((oe) this).field_ac;
                                                      if (var10 <= 13) {
                                                        break L155;
                                                      } else {
                                                        var10 = 13;
                                                        break L155;
                                                      }
                                                    }
                                                    L156: {
                                                      ji.a(true, var10);
                                                      ((oe) this).field_ac = ((oe) this).field_ac + 13;
                                                      if (((oe) this).field_ac > 5000) {
                                                        ((oe) this).field_ac = 5000;
                                                        break L156;
                                                      } else {
                                                        break L156;
                                                      }
                                                    }
                                                    L157: {
                                                      if (var4_ref != null) {
                                                        ((hl) var4_ref).f(6144 * qm.field_c / 64);
                                                        ((oe) this).field_R.f(6144 * qm.field_c / 64);
                                                        break L157;
                                                      } else {
                                                        ((oe) this).field_R = hl.c(qa.field_E, 100, 6144 * qm.field_c / 64, 8192);
                                                        pl.field_n.a((wg) (Object) ((oe) this).field_R);
                                                        var36 = hl.c(lm.field_d, 100, qm.field_c * 6144 / 64, 8192);
                                                        var4_ref = (Object) (Object) var36;
                                                        var36.h(-1);
                                                        pl.field_n.a((wg) (Object) var36);
                                                        break L157;
                                                      }
                                                    }
                                                    ((oe) this).field_f = (hl) var4_ref;
                                                    break L154;
                                                  } else {
                                                    L158: {
                                                      if (var4_ref == null) {
                                                        break L158;
                                                      } else {
                                                        pl.field_n.b((wg) var4_ref);
                                                        pl.field_n.b((wg) (Object) ((oe) this).field_R);
                                                        var4_ref = null;
                                                        ((oe) this).field_R = null;
                                                        break L158;
                                                      }
                                                    }
                                                    L159: {
                                                      if (var5_ref_hl != null) {
                                                        break L159;
                                                      } else {
                                                        var35 = hl.c(fn.field_f, 100, 3584 * qm.field_c / 64, 8192);
                                                        var5_ref_hl = var35;
                                                        var35.h(-1);
                                                        pl.field_n.a((wg) (Object) var35);
                                                        break L159;
                                                      }
                                                    }
                                                    ((oe) this).field_Eb = var5_ref_hl;
                                                    break L154;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (var8 < 3) {
                                          break L153;
                                        } else {
                                          if (27 <= var8) {
                                            break L153;
                                          } else {
                                            if (48 > var9) {
                                              break L153;
                                            } else {
                                              if (var9 < 57) {
                                                var3 = 0;
                                                break L153;
                                              } else {
                                                break L153;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L153;
                                      }
                                    }
                                  }
                                }
                                L160: {
                                  if (!((oe) this).field_rc) {
                                    break L160;
                                  } else {
                                    if (((oe) this).field_Pb != 7) {
                                      break L160;
                                    } else {
                                      if (((oe) this).field_Gb) {
                                        break L160;
                                      } else {
                                        if (!((oe) this).field_rb) {
                                          break L160;
                                        } else {
                                          if (var34_ref.field_n != 3) {
                                            break L160;
                                          } else {
                                            var8 = ((oe) this).field_H >> 16;
                                            var9 = ((oe) this).field_p >> 16;
                                            if (~var8 > ~(var34_ref.field_k + -20)) {
                                              break L160;
                                            } else {
                                              if (var34_ref.field_k - -40 <= var8) {
                                                break L160;
                                              } else {
                                                if (var9 < -30 + var34_ref.field_g) {
                                                  break L160;
                                                } else {
                                                  if (var34_ref.field_g > var9) {
                                                    ((oe) this).a(((oe) this).field_fc, false, 17, 238);
                                                    break L160;
                                                  } else {
                                                    break L160;
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
                                var6++;
                                continue L79;
                              }
                            }
                          } else {
                            L161: {
                              if (null == var3_ref_ic.field_g) {
                                var3_ref_ic.field_m = new tl();
                                int discarded$55 = 8192;
                                int discarded$56 = 0;
                                int discarded$57 = 256;
                                var3_ref_ic.field_g = hl.a(ci.field_a);
                                int discarded$58 = 8192;
                                int discarded$59 = 0;
                                int discarded$60 = 256;
                                var3_ref_ic.field_m.field_k = hl.a(qi.field_J);
                                int discarded$61 = 8192;
                                int discarded$62 = 0;
                                int discarded$63 = 256;
                                var3_ref_ic.field_m.field_q = hl.a(qi.field_J);
                                var3_ref_ic.field_g.h(-1);
                                var3_ref_ic.field_m.field_k.h(-1);
                                var3_ref_ic.field_m.field_q.h(-1);
                                var3_ref_ic.field_g.e((int)(Math.random() * (double)ci.field_a.field_h.length));
                                pl.field_n.a((wg) (Object) var3_ref_ic.field_g);
                                pl.field_n.a((wg) (Object) var3_ref_ic.field_m);
                                break L161;
                              } else {
                                break L161;
                              }
                            }
                            L162: {
                              var4 = ((oe) this).field_H + -var3_ref_ic.field_p;
                              var5 = ((oe) this).field_p + -var3_ref_ic.field_q;
                              if (-((oe) this).field_n << 15 <= var4) {
                                if (var4 < ((oe) this).field_n << 15) {
                                  break L162;
                                } else {
                                  var4 = var4 - (((oe) this).field_n << 16);
                                  break L162;
                                }
                              } else {
                                var4 = var4 + (((oe) this).field_n << 16);
                                break L162;
                              }
                            }
                            L163: {
                              L164: {
                                var6_double = (double)var5 * (double)var5 + (double)var4 * (double)var4;
                                if (((oe) this).field_Gb) {
                                  break L164;
                                } else {
                                  if (171798691840000.0 <= var6_double) {
                                    break L164;
                                  } else {
                                    stackOut_253_0 = 1;
                                    stackIn_255_0 = stackOut_253_0;
                                    break L163;
                                  }
                                }
                              }
                              stackOut_254_0 = 0;
                              stackIn_255_0 = stackOut_254_0;
                              break L163;
                            }
                            L165: {
                              var8 = stackIn_255_0;
                              if (var8 == 0) {
                                L166: {
                                  var3_ref_ic.field_m.field_p = 0;
                                  var4 = var3_ref_ic.field_j + -var3_ref_ic.field_p;
                                  if (-((oe) this).field_n << 15 > var4) {
                                    var4 = var4 + (((oe) this).field_n << 16);
                                    break L166;
                                  } else {
                                    if (~(((oe) this).field_n << 15) >= ~var4) {
                                      var4 = var4 - (((oe) this).field_n << 16);
                                      break L166;
                                    } else {
                                      break L166;
                                    }
                                  }
                                }
                                L167: {
                                  var4 = 32 + var4 >> 6;
                                  var5 = var3_ref_ic.field_l + -var3_ref_ic.field_q - -16 >> 5;
                                  if (var5 <= -64) {
                                    break L167;
                                  } else {
                                    if (var5 >= 64) {
                                      break L167;
                                    } else {
                                      if (0 >= var5) {
                                        var5 = -64;
                                        break L167;
                                      } else {
                                        var5 = 64;
                                        break L167;
                                      }
                                    }
                                  }
                                }
                                L168: {
                                  if (var4 <= -64) {
                                    break L168;
                                  } else {
                                    if (var4 < 64) {
                                      if (var4 > 0) {
                                        var4 = 64;
                                        break L168;
                                      } else {
                                        var4 = -64;
                                        break L168;
                                      }
                                    } else {
                                      break L168;
                                    }
                                  }
                                }
                                var9 = 30000 + -(var3_ref_ic.field_h >> 6);
                                break L165;
                              } else {
                                var6_double = Math.sqrt(var6_double);
                                var3_ref_ic.field_m.field_k.i((int)(Math.pow(0.8464491362763915, var6_double / 13107200.0) * 6668800.0) / ie.field_q);
                                var3_ref_ic.field_m.field_q.i((int)(Math.pow(0.5646606914212549, var6_double / 13107200.0) * 59980800.0) / ie.field_q);
                                var3_ref_ic.field_m.field_p = (int)(Math.pow(0.1, var6_double / 13107200.0) * 26214.4);
                                var3_ref_ic.field_l = var3_ref_ic.field_q;
                                var6_double = 2949.12 / var6_double;
                                var3_ref_ic.field_j = var3_ref_ic.field_p;
                                var9 = 40000;
                                var5 = (int)((double)var5 * var6_double);
                                var4 = (int)((double)var4 * var6_double);
                                break L165;
                              }
                            }
                            L169: {
                              if (var3_ref_ic.field_o == 0) {
                                var3_ref_ic.field_o = var9;
                                break L169;
                              } else {
                                var3_ref_ic.field_o = var3_ref_ic.field_o + (4 + -var3_ref_ic.field_o + var9 >> 3);
                                break L169;
                              }
                            }
                            L170: {
                              var3_ref_ic.field_g.i(var3_ref_ic.field_o * 256 / ie.field_q);
                              var3_ref_ic.field_h = var3_ref_ic.field_h + var5;
                              var3_ref_ic.field_i = var3_ref_ic.field_i + var4;
                              if (var8 == 0) {
                                var3_ref_ic.field_i = var3_ref_ic.field_i + (32 + var3_ref_ic.field_i >> 6);
                                var3_ref_ic.field_h = var3_ref_ic.field_h + (var3_ref_ic.field_h - -32 >> 6);
                                break L170;
                              } else {
                                var3_ref_ic.field_h = var3_ref_ic.field_h - (var3_ref_ic.field_h + 32 >> 6);
                                var3_ref_ic.field_i = var3_ref_ic.field_i - (var3_ref_ic.field_i + 32 >> 6);
                                break L170;
                              }
                            }
                            L171: {
                              var6_double = (double)var3_ref_ic.field_i * (double)var3_ref_ic.field_i + (double)var3_ref_ic.field_h * (double)var3_ref_ic.field_h;
                              if (var8 != 0) {
                                stackOut_282_0 = 38654705664.0;
                                stackIn_283_0 = stackOut_282_0;
                                break L171;
                              } else {
                                stackOut_281_0 = 9663676416.0;
                                stackIn_283_0 = stackOut_281_0;
                                break L171;
                              }
                            }
                            L172: {
                              var10_double = stackIn_283_0;
                              if (var10_double < var6_double) {
                                var6_double = Math.sqrt(var10_double / var6_double);
                                var3_ref_ic.field_h = (int)((double)var3_ref_ic.field_h * var6_double);
                                var3_ref_ic.field_i = (int)((double)var3_ref_ic.field_i * var6_double);
                                break L172;
                              } else {
                                break L172;
                              }
                            }
                            L173: {
                              L174: {
                                var3_ref_ic.field_q = var3_ref_ic.field_q + var3_ref_ic.field_h;
                                var3_ref_ic.field_p = ((((oe) this).field_n << 16) + (var3_ref_ic.field_p - -var3_ref_ic.field_i)) % (((oe) this).field_n << 16);
                                var12 = ((oe) this).b(4194304, var3_ref_ic.field_p, 96, var3_ref_ic.field_q);
                                var13_int = ((oe) this).c(var3_ref_ic.field_p, 117);
                                var3_ref_ic.field_g.f(var12 >> 1, var13_int);
                                var3_ref_ic.field_m.field_s = var12;
                                var3_ref_ic.field_m.field_n = var13_int;
                                var14 = ((oe) this).field_n + (var3_ref_ic.field_p >> 16);
                                var15_int = var3_ref_ic.field_q >> 16;
                                var16 = var14 + -8;
                                var17_int = -8 + var15_int;
                                if (((oe) this).field_Gb) {
                                  break L174;
                                } else {
                                  if (!((oe) this).field_Bb) {
                                    if (!this.a(false, var17_int, var16, s.field_H)) {
                                      break L174;
                                    } else {
                                      this.h((byte) -62);
                                      int discarded$64 = 5;
                                      this.a(var3_ref_ic);
                                      break L173;
                                    }
                                  } else {
                                    ((oe) this).field_Hb = 0;
                                    ((oe) this).field_pb = 0;
                                    int discarded$65 = 83;
                                    this.a(s.field_H, var17_int, var16);
                                    if ((((oe) this).field_Hb | ((oe) this).field_pb) != 0) {
                                      L175: {
                                        var18 = var3_ref_ic.field_i + 3 * ((oe) this).field_mc >> 2;
                                        ((oe) this).field_mc = ((oe) this).field_mc - var18;
                                        var19 = ((oe) this).field_hc * 3 + var3_ref_ic.field_h >> 2;
                                        ((oe) this).field_hc = ((oe) this).field_hc - var19;
                                        var20_double = (double)((oe) this).field_Hb;
                                        var22_double = (double)((oe) this).field_pb;
                                        var24_double = 1.0 / Math.sqrt(var20_double * var20_double + var22_double * var22_double);
                                        var22_double = var22_double * var24_double;
                                        var20_double = var20_double * var24_double;
                                        var24_double = 49152.0 + ((double)((oe) this).field_mc * var20_double + (double)((oe) this).field_hc * var22_double);
                                        if (var24_double > 0.0) {
                                          ((oe) this).field_hc = (int)((double)((oe) this).field_hc - var24_double * var22_double);
                                          ((oe) this).field_mc = (int)((double)((oe) this).field_mc - var24_double * var20_double);
                                          break L175;
                                        } else {
                                          break L175;
                                        }
                                      }
                                      L176: {
                                        ((oe) this).field_mc = ((oe) this).field_mc + var18;
                                        ((oe) this).field_hc = ((oe) this).field_hc + var19;
                                        int discarded$66 = 5;
                                        this.a(var3_ref_ic);
                                        var12 = (int)var24_double >> 4;
                                        if (var12 > 6144) {
                                          var12 = 6144;
                                          break L176;
                                        } else {
                                          break L176;
                                        }
                                      }
                                      pl.field_n.a(co.field_d, 100, var12 * qm.field_c / 64, 8192);
                                      break L173;
                                    } else {
                                      break L174;
                                    }
                                  }
                                }
                              }
                              L177: {
                                if (0 > ((oe) this).field_Ub) {
                                  break L177;
                                } else {
                                  if (((oe) this).field_e != 0) {
                                    break L177;
                                  } else {
                                    var18_ref_ed = mb.field_f[((oe) this).field_Ub];
                                    var19 = -var16 + (((oe) this).field_mb - (var18_ref_ed.field_A << 15) >> 16);
                                    L178: while (true) {
                                      if (-((oe) this).field_n >> 1 <= var19) {
                                        L179: while (true) {
                                          if (var19 < ((oe) this).field_n >> 1) {
                                            if (!ln.a(s.field_H, 0, var17_int, var18_ref_ed, var19, -(var18_ref_ed.field_z << 15) + ((oe) this).field_E >> 16)) {
                                              break L177;
                                            } else {
                                              this.k((byte) 64);
                                              int discarded$67 = 5;
                                              this.a(var3_ref_ic);
                                              break L173;
                                            }
                                          } else {
                                            var19 = var19 - ((oe) this).field_n;
                                            continue L179;
                                          }
                                        }
                                      } else {
                                        var19 = var19 + ((oe) this).field_n;
                                        continue L178;
                                      }
                                    }
                                  }
                                }
                              }
                              int discarded$68 = -1;
                              if (!this.b(var16, s.field_H, var17_int)) {
                                break L173;
                              } else {
                                L180: {
                                  if (((oe) this).field_Gb) {
                                    break L180;
                                  } else {
                                    var18 = hc.a(((oe) this).field_fc, (byte) 77);
                                    ((oe) this).field_J = ((oe) this).field_J + var18;
                                    v.a(8, var18);
                                    break L180;
                                  }
                                }
                                int discarded$69 = 5;
                                this.a(var3_ref_ic);
                                break L173;
                              }
                            }
                            var3_ref_ic = (ic) (Object) ((oe) this).field_N.b((byte) 70);
                            continue L57;
                          }
                        }
                      } else {
                        L181: {
                          L182: {
                            var32_ref = (sa) ((oe) this).field_kb.elementAt(var9);
                            if (var32_ref.field_n == 3) {
                              break L182;
                            } else {
                              if (4 != var32_ref.field_n) {
                                break L181;
                              } else {
                                break L182;
                              }
                            }
                          }
                          var32_ref.field_h = false;
                          if (((oe) this).field_Gb) {
                            break L181;
                          } else {
                            L183: {
                              var11 = 12 + var32_ref.field_k << 16;
                              var12 = var32_ref.field_g + 12 << 16;
                              var13 = (double)(-var11 + ((oe) this).field_H);
                              var15 = (double)(((oe) this).field_p + -var12);
                              if ((double)(-((oe) this).field_n << 15) > var13) {
                                var13 = var13 + (double)(((oe) this).field_n << 16);
                                break L183;
                              } else {
                                if ((double)(((oe) this).field_n << 15) > var13) {
                                  break L183;
                                } else {
                                  var13 = var13 - (double)(((oe) this).field_n << 16);
                                  break L183;
                                }
                              }
                            }
                            var17 = var15 * var15 + var13 * var13;
                            if (var17 >= 171798691840000.0) {
                              break L181;
                            } else {
                              L184: {
                                var32_ref.field_h = true;
                                var19 = ((oe) this).b(1310720, var11, 96, var12);
                                var19 = var19 * var19;
                                var20_long = (long)((oe) this).c(var11, 106) * (long)var19;
                                if (var32_ref.field_n == 3) {
                                  var4 = var4 + var19;
                                  var7_long = var7_long + var20_long;
                                  break L184;
                                } else {
                                  var5_long = var5_long + var20_long;
                                  var3 = var3 + var19;
                                  break L184;
                                }
                              }
                              if (((oe) this).field_rb) {
                                break L181;
                              } else {
                                L185: {
                                  var22_int = (int)(var13 * 4294967296.0 / var17);
                                  var23_int = (int)(4294967296.0 * var15 / var17);
                                  if (var32_ref.field_n == 3) {
                                    var22_int = -var22_int;
                                    var23_int = -var23_int;
                                    break L185;
                                  } else {
                                    break L185;
                                  }
                                }
                                ((oe) this).field_hc = ((oe) this).field_hc + var23_int;
                                ((oe) this).field_mc = ((oe) this).field_mc + var22_int;
                                break L181;
                              }
                            }
                          }
                        }
                        var9++;
                        continue L49;
                      }
                    }
                  } else {
                    L186: {
                      if (((oe) this).field_Xb.field_E[((oe) this).field_Sb - -var2]) {
                        ((oe) this).field_qc = ((oe) this).field_qc - 1;
                        ((oe) this).field_Xb.field_E[((oe) this).field_Sb + var2] = false;
                        break L186;
                      } else {
                        break L186;
                      }
                    }
                    var2++;
                    continue L28;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L187: {
              if (~nk.field_n != ~of.field_c) {
                break L187;
              } else {
                if (((oe) this).field_B == null) {
                  break L187;
                } else {
                  ((oe) this).field_B.e((byte) -101);
                  if (((oe) this).field_B.b((byte) -107)) {
                    ((oe) this).s((byte) -41);
                    break L187;
                  } else {
                    break L187;
                  }
                }
              }
            }
            L188: {
              if (((oe) this).field_B == null) {
                break L188;
              } else {
                if (!((oe) this).field_B.b((byte) -114)) {
                  break L188;
                } else {
                  if (nk.field_n != 13) {
                    break L188;
                  } else {
                    ((oe) this).field_B.e((byte) -101);
                    break L188;
                  }
                }
              }
            }
            L189: {
              if (nk.field_n == 13) {
                L190: {
                  if (!((oe) this).field_Gb) {
                    break L190;
                  } else {
                    if (((oe) this).field_A == 0) {
                      break L189;
                    } else {
                      break L190;
                    }
                  }
                }
                if (!((oe) this).field_Jb) {
                  L191: {
                    if (!((oe) this).field_B.b((byte) -122)) {
                      break L191;
                    } else {
                      ((oe) this).field_B.e((byte) -101);
                      break L191;
                    }
                  }
                  ((oe) this).s((byte) -41);
                  da.field_c = new tf();
                  mj.field_d = 0;
                  gi.a((byte) -56);
                  return;
                } else {
                  break L189;
                }
              } else {
                break L189;
              }
            }
            L192: {
              if (!od.field_k) {
                break L192;
              } else {
                if (nk.field_n != 12) {
                  break L192;
                } else {
                  ((oe) this).field_c = 63;
                  ((oe) this).field_Ub = 1;
                  ((oe) this).field_Ib = true;
                  ((oe) this).field_Gb = false;
                  ((oe) this).field_rc = false;
                  System.out.println("Level skip cheat activated");
                  break L192;
                }
              }
            }
            L193: {
              if (!od.field_k) {
                break L193;
              } else {
                if (nk.field_n == 11) {
                  L194: {
                    stackOut_32_0 = this;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (((oe) this).field_F) {
                      stackOut_34_0 = this;
                      stackOut_34_1 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L194;
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L194;
                    }
                  }
                  L195: {
                    ((oe) this).field_F = stackIn_35_1 != 0;
                    stackOut_35_0 = this;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (((oe) this).field_F) {
                      stackOut_37_0 = this;
                      stackOut_37_1 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L195;
                    } else {
                      stackOut_36_0 = this;
                      stackOut_36_1 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      break L195;
                    }
                  }
                  ((oe) this).field_rc = stackIn_38_1 != 0;
                  System.out.println("Easypeasy cheat activated");
                  break L193;
                } else {
                  break L193;
                }
              }
            }
            if (!od.field_k) {
              continue L3;
            } else {
              if (nk.field_n == 10) {
                L196: {
                  stackOut_42_0 = this;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_43_0 = stackOut_42_0;
                  if (((oe) this).field_gb) {
                    stackOut_44_0 = this;
                    stackOut_44_1 = 0;
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    break L196;
                  } else {
                    stackOut_43_0 = this;
                    stackOut_43_1 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_45_1 = stackOut_43_1;
                    break L196;
                  }
                }
                L197: {
                  ((oe) this).field_gb = stackIn_45_1 != 0;
                  stackOut_45_0 = this;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_46_0 = stackOut_45_0;
                  if (((oe) this).field_gb) {
                    stackOut_47_0 = this;
                    stackOut_47_1 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    break L197;
                  } else {
                    stackOut_46_0 = this;
                    stackOut_46_1 = 1;
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    break L197;
                  }
                }
                ((oe) this).field_rc = stackIn_48_1 != 0;
                System.out.println("Timehack checking cheat activated");
                continue L3;
              } else {
                continue L3;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        hg var16 = null;
        int var17 = 0;
        Object var18 = null;
        am var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        var18 = null;
        var19 = EscapeVector.field_A;
        if (param6 > 115) {
          L0: {
            var20 = this.a(param4, -1, param0);
            var24 = var20;
            var23 = var24;
            var22 = var23;
            var21 = var22;
            var10 = var21;
            if (var20 != null) {
              break L0;
            } else {
              if (0 == vh.field_i) {
                return;
              } else {
                break L0;
              }
            }
          }
          param0 = param0 << 16;
          param4 = param4 << 16;
          var11 = param1;
          L1: while (true) {
            if (~param8 > ~var11) {
              return;
            } else {
              var12 = param7;
              L2: while (true) {
                if (~var12 < ~param2) {
                  var11++;
                  continue L1;
                } else {
                  L3: {
                    var13 = param0 + (var12 << 11) + -param3;
                    var14 = -param5 + (var11 << 11) + param4;
                    var15 = var13 * var13 + var14 * var14;
                    if (var15 < 603979776) {
                      L4: {
                        if (var10 == null) {
                          break L4;
                        } else {
                          if (!this.a(var24, var12, (byte) -74, var11)) {
                            break L4;
                          } else {
                            ((oe) this).field_Hb = ((oe) this).field_Hb + var13;
                            ((oe) this).field_pb = ((oe) this).field_pb + var14;
                            break L3;
                          }
                        }
                      }
                      var16 = cn.field_f.a(false);
                      var17 = 0;
                      L5: while (true) {
                        if (~vh.field_i >= ~var17) {
                          break L3;
                        } else {
                          L6: {
                            var18_ref = (am) (Object) var16;
                            if (~var18_ref.field_j == ~var14) {
                              if (~var18_ref.field_i < ~var13) {
                                break L6;
                              } else {
                                if (var18_ref.field_h <= var13) {
                                  break L6;
                                } else {
                                  ((oe) this).field_Hb = ((oe) this).field_Hb + var13;
                                  ((oe) this).field_pb = ((oe) this).field_pb + var14;
                                  break L3;
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          var16 = var16.field_b;
                          var17++;
                          continue L5;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var12++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final void q() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        String var11 = null;
        int var12 = 0;
        ih var13 = null;
        int stackIn_16_0 = 0;
        int stackIn_42_0 = 0;
        ih stackIn_43_0 = null;
        String stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        ih stackIn_44_0 = null;
        String stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        ih stackIn_45_0 = null;
        String stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        ih stackIn_46_0 = null;
        String stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        int stackIn_46_4 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        ih stackOut_42_0 = null;
        String stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        ih stackOut_43_0 = null;
        String stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        ih stackOut_44_0 = null;
        String stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        ih stackOut_45_0 = null;
        String stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        int stackOut_45_4 = 0;
        L0: {
          var13 = fh.field_g;
          var3 = var13.b(di.field_b);
          var4 = var13.b(k.field_p);
          if (var4 > var3) {
            var3 = var4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var5 = var13.b("0000");
          var6 = 40;
          var7 = 18;
          if (0 < ((oe) this).field_tb) {
            var4 = var13.b(af.field_f);
            var6 = var6 + var7;
            if (var3 < var4) {
              var3 = var4;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (((oe) this).field_Q == 1) {
            var6 = var6 + var7;
            var4 = var13.b(hg.field_f);
            if (var3 < var4) {
              var3 = var4;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          var8 = 0;
          if (var8 >= 20) {
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            break L3;
          } else {
            stackOut_14_0 = (-var8 + 20) * 160 / 20;
            stackIn_16_0 = stackOut_14_0;
            break L3;
          }
        }
        L4: {
          var9 = stackIn_16_0;
          eh.a(var9, -4, -4, 6320248, -2, var6 - -6, -3, var5 + var3 + 16, 12110032, 3160124, 2 * var8);
          var10 = 22;
          var13.b(di.field_b, var3 + 6, var10, 10004656, -1);
          var13.a(Integer.toString(((oe) this).field_ac), 6 + var3, var10, 16777215, -1);
          var10 = var10 + var7;
          var13.b(k.field_p, var3 + 6, var10, 10004656, -1);
          var13.a(Integer.toString(((oe) this).field_Tb + ((oe) this).field_Tb), 6 - -var3, var10, 16777215, -1);
          var10 = var10 + var7;
          if (((oe) this).field_tb > 0) {
            var13.b(af.field_f, var3 + 6, var10, 10004656, -1);
            var13.a(Integer.toString(((oe) this).field_tb), 6 - -var3, var10, 16777215, -1);
            var10 = var10 + var7;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (((oe) this).field_Q != 1) {
            break L5;
          } else {
            L6: {
              var11_int = 0;
              if (((oe) this).field_k != null) {
                var11_int = ((oe) this).field_k.c((byte) 49);
                break L6;
              } else {
                break L6;
              }
            }
            var13.b(hg.field_f, 6 + var3, var10, 10004656, -1);
            var13.a(Integer.toString(var11_int), var3 + 6, var10, 16777215, -1);
            var10 = var10 + var7;
            break L5;
          }
        }
        L7: {
          var3 = var13.b(jf.field_K);
          var4 = var13.b(vd.field_c);
          var5 = var13.b(Integer.toString(((oe) this).field_Pb - -1));
          if (var3 >= var4) {
            break L7;
          } else {
            var3 = var4;
            break L7;
          }
        }
        L8: {
          var4 = var13.b(Integer.toString(((oe) this).field_A));
          if (~var5 <= ~var4) {
            break L8;
          } else {
            var5 = var4;
            break L8;
          }
        }
        L9: {
          var6 = 40;
          var11 = this.g(true);
          var6 += 18;
          var4 = var13.b(uk.field_a);
          if (var4 <= var3) {
            break L9;
          } else {
            var3 = var4;
            break L9;
          }
        }
        L10: {
          var4 = var13.b(Integer.toString(((oe) this).field_J + ((oe) this).field_ob));
          if (var5 >= var4) {
            break L10;
          } else {
            var5 = var4;
            break L10;
          }
        }
        L11: {
          L12: {
            if (nf.field_r) {
              break L12;
            } else {
              if (((oe) this).field_a) {
                break L12;
              } else {
                break L11;
              }
            }
          }
          L13: {
            var6 += 18;
            var4 = var13.b(hn.field_f);
            if (var3 >= var4) {
              break L13;
            } else {
              var3 = var4;
              break L13;
            }
          }
          var4 = var13.b(var11);
          if (~var5 <= ~var4) {
            break L11;
          } else {
            var5 = var4;
            break L11;
          }
        }
        L14: {
          var8 = 0;
          if (20 > var8) {
            stackOut_41_0 = (3200 - var8 * 160) / 20;
            stackIn_42_0 = stackOut_41_0;
            break L14;
          } else {
            stackOut_40_0 = 0;
            stackIn_42_0 = stackOut_40_0;
            break L14;
          }
        }
        L15: {
          L16: {
            var9 = stackIn_42_0;
            eh.a(var9, 634 + -var5 + -var3 - 10, -4, 6320248, -2, var6 + 6, -3, 644, 12110032, 3160124, var8 * 2);
            var13.b(jf.field_K, -var5 + 634, 22, 10004656, -1);
            var13.a(Integer.toString(((oe) this).field_Pb - -1), -var5 + 634, 22, 16777215, -1);
            var13.b(vd.field_c, -var5 + 634, 40, 10004656, -1);
            var13.a(Integer.toString(((oe) this).field_A), -var5 + 634, 40, 16777215, -1);
            var13.b(uk.field_a, -var5 + 634, 58, 10004656, -1);
            stackOut_42_0 = (ih) var13;
            stackOut_42_1 = Integer.toString(((oe) this).field_ob + ((oe) this).field_J);
            stackOut_42_2 = -var5 + 634;
            stackOut_42_3 = 58;
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_45_2 = stackOut_42_2;
            stackIn_45_3 = stackOut_42_3;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            stackIn_43_2 = stackOut_42_2;
            stackIn_43_3 = stackOut_42_3;
            if (((oe) this).field_gb) {
              break L16;
            } else {
              stackOut_43_0 = (ih) (Object) stackIn_43_0;
              stackOut_43_1 = (String) (Object) stackIn_43_1;
              stackOut_43_2 = stackIn_43_2;
              stackOut_43_3 = stackIn_43_3;
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              stackIn_45_3 = stackOut_43_3;
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              stackIn_44_3 = stackOut_43_3;
              if (((oe) this).field_rc) {
                break L16;
              } else {
                stackOut_44_0 = (ih) (Object) stackIn_44_0;
                stackOut_44_1 = (String) (Object) stackIn_44_1;
                stackOut_44_2 = stackIn_44_2;
                stackOut_44_3 = stackIn_44_3;
                stackOut_44_4 = 4227327;
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_46_2 = stackOut_44_2;
                stackIn_46_3 = stackOut_44_3;
                stackIn_46_4 = stackOut_44_4;
                break L15;
              }
            }
          }
          stackOut_45_0 = (ih) (Object) stackIn_45_0;
          stackOut_45_1 = (String) (Object) stackIn_45_1;
          stackOut_45_2 = stackIn_45_2;
          stackOut_45_3 = stackIn_45_3;
          stackOut_45_4 = 16777215;
          stackIn_46_0 = stackOut_45_0;
          stackIn_46_1 = stackOut_45_1;
          stackIn_46_2 = stackOut_45_2;
          stackIn_46_3 = stackOut_45_3;
          stackIn_46_4 = stackOut_45_4;
          break L15;
        }
        L17: {
          L18: {
            ((ih) (Object) stackIn_46_0).a(stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4, -1);
            if (nf.field_r) {
              break L18;
            } else {
              if (((oe) this).field_a) {
                break L18;
              } else {
                break L17;
              }
            }
          }
          var12 = this.a((byte) 114, 50, 16777215, 16711680);
          var13.b(hn.field_f, -var5 + 634, 76, 10004656, -1);
          var13.a(var11, -var5 + 634, 76, var12, -1);
          break L17;
        }
    }

    private final void a(byte param0, int param1) {
        if (1 == param1) {
        }
        if (0 != param1) {
        }
    }

    private final void j() {
        this.a(24661, true);
        if (((oe) this).field_Pb >= 0) {
            int discarded$1 = -127;
            this.k();
        } else {
            int discarded$2 = -120;
            this.i();
        }
        this.a(true, 19);
    }

    private final boolean d() {
        int var2 = -2;
        if (!s.field_E) {
            if (!(!ik.field_h[84])) {
                return true;
            }
        }
        if (ik.field_h[jl.field_a]) {
            return true;
        }
        if (ik.field_h[86]) {
            return true;
        }
        return false;
    }

    final void s(byte param0) {
        Object var2 = null;
        pi var3 = null;
        ic var3_ref = null;
        Throwable var4 = null;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var5 = EscapeVector.field_A;
        this.a(param0 + 45, ((oe) this).field_jb);
        if (param0 == -41) {
          L0: {
            this.a(4, ((oe) this).field_Z);
            this.a(4, ((oe) this).field_v);
            this.a(4, ((oe) this).field_R);
            this.a(4, ((oe) this).field_f);
            if (null == ((oe) this).field_Eb) {
              break L0;
            } else {
              ((oe) this).field_Eb.h(0);
              ((oe) this).field_Eb = null;
              break L0;
            }
          }
          L1: {
            this.a(4, ((oe) this).field_Wb);
            this.a(4, ((oe) this).field_wb);
            if (((oe) this).field_r != null) {
              ((oe) this).field_r.c(ie.field_q / 100, 0);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((oe) this).field_lc != null) {
              this.a(param0 ^ -45, ((oe) this).field_lc);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (null == ((oe) this).field_fb) {
              break L3;
            } else {
              ((oe) this).field_fb.field_l = 0;
              break L3;
            }
          }
          L4: {
            if (null != ((oe) this).field_hb) {
              var2 = (Object) (Object) pl.field_n;
              synchronized (var2) {
                L5: {
                  var3 = (pi) (Object) ((oe) this).field_hb.a(false);
                  L6: while (true) {
                    if (var3 == null) {
                      var3_ref = (ic) (Object) ((oe) this).field_N.a(false);
                      L7: while (true) {
                        if (var3_ref == null) {
                          break L5;
                        } else {
                          L8: {
                            if (null == var3_ref.field_g) {
                              break L8;
                            } else {
                              pl.field_n.b((wg) (Object) var3_ref.field_g);
                              pl.field_n.b((wg) (Object) var3_ref.field_m);
                              var3_ref.field_g = null;
                              var3_ref.field_m = null;
                              break L8;
                            }
                          }
                          var3_ref = (ic) (Object) ((oe) this).field_N.b((byte) 70);
                          continue L7;
                        }
                      }
                    } else {
                      L9: {
                        if (var3.field_r == 0) {
                          break L9;
                        } else {
                          if (!var3.field_o.b((byte) 48)) {
                            break L9;
                          } else {
                            pl.field_n.b((wg) (Object) var3.field_o);
                            var3.field_h = true;
                            break L9;
                          }
                        }
                      }
                      var3 = (pi) (Object) ((oe) this).field_hb.b((byte) 70);
                      continue L6;
                    }
                  }
                }
              }
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b() {
        ((oe) this).field_Tb = ((oe) this).field_gc;
        ((oe) this).field_M = 0;
        ((oe) this).field_lb = false;
        ((oe) this).field_tb = 0;
        ((oe) this).field_Bb = false;
        ((oe) this).field_ib = 1700;
        ((oe) this).field_I = 0;
        ((oe) this).field_e = 0;
        ((oe) this).field_ac = ((oe) this).field_U;
        ((oe) this).field_Kb = 0;
        ((oe) this).field_hc = 0;
        ((oe) this).field_mc = 0;
        ((oe) this).field_H = ((oe) this).field_t;
        ((oe) this).field_ec = false;
        ((oe) this).field_h = null;
        ((oe) this).field_Ub = -1;
        ((oe) this).field_m = -1;
        ((oe) this).field_ab = 0;
        ((oe) this).field_p = ((oe) this).field_bb;
        ((oe) this).field_hb = new cn();
        ((oe) this).field_jc = false;
        ((oe) this).field_yb = 0;
        ((oe) this).field_Gb = false;
        ((oe) this).field_kc = false;
        ((oe) this).field_Ib = false;
        ((oe) this).field_q = false;
        ((oe) this).field_G = new cn();
        ((oe) this).field_x = 0;
        ((oe) this).field_nb = null;
        ((oe) this).field_O = 0;
        cn.field_f = new cn();
        aa.field_a = 0;
        vh.field_i = 0;
    }

    private final void b(int param0, int param1, int param2) {
        int var5 = 0;
        vh var6 = null;
        int var7 = EscapeVector.field_A;
        hg var4 = ((oe) this).field_G.a(false);
        for (var5 = param2; ~((oe) this).field_x < ~var5; var5++) {
            var6 = (vh) (Object) var4;
            var6.a(param0, false, param1);
            var4 = var4.field_b;
        }
    }

    private final void k(byte param0) {
        int var2_int = 0;
        if (((oe) this).field_F) {
            if (((oe) this).field_Ub == 1) {
                return;
            }
        }
        if (!(((oe) this).field_Gb)) {
            var2_int = mf.b(((oe) this).field_fc, ((oe) this).field_Ub, -2);
            ((oe) this).field_J = ((oe) this).field_J + var2_int;
            v.a(8, var2_int);
        }
        ed var3 = mb.field_f[((oe) this).field_Ub];
        ed var2 = var3;
        this.a(-(var3.field_A << 15) + ((oe) this).field_mb >> 16, -28311553, var2, -(var3.field_z << 15) + ((oe) this).field_E >> 16, sf.field_e[((oe) this).field_Ub]);
        if (!(((oe) this).field_Ub != 1)) {
            this.b(0);
        }
        if (param0 < 6) {
            return;
        }
        ((oe) this).field_Ub = -1;
        if (!((oe) this).field_Gb) {
            pl.field_n.a(bc.field_c, 100, qm.field_c * 6144 / 64, 8192);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        am var9_ref_am = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = EscapeVector.field_A;
        vh.field_i = 0;
        Object var6 = null;
        if (!(50 > ((oe) this).field_oc)) {
            return;
        }
        hg var7 = ((oe) this).field_C.a(false);
        int var8 = 0;
        while (((oe) this).field_ub > var8) {
            var9_ref_am = (am) (Object) var7;
            var10 = var9_ref_am.field_j;
            if (param2 <= var10) {
                if (!(~var10 < ~param1)) {
                    var11 = var9_ref_am.field_i;
                    var12 = var9_ref_am.field_h;
                    while (~param3 > ~var12) {
                        var11 = var11 - ((oe) this).field_n;
                        var12 = var12 - ((oe) this).field_n;
                    }
                    while (param3 >= var12) {
                        var12 = var12 + ((oe) this).field_n;
                        var11 = var11 + ((oe) this).field_n;
                    }
                    while (param4 >= var11) {
                        var6 = (Object) (Object) this.a((hg) var6, var12, var11, true, var10);
                        var11 = var11 + ((oe) this).field_n;
                        var12 = var12 + ((oe) this).field_n;
                    }
                }
            }
            var8++;
            var7 = var7.field_b;
        }
        int var9 = -42 / ((45 - param0) / 34);
    }

    private final void b(int param0) {
        if (((oe) this).field_Q != 0) {
            return;
        }
        ((oe) this).field_ec = true;
        if (!((oe) this).field_Gb) {
            this.a(50, 0 > ((oe) this).field_Pb ? qc.field_xb : hi.field_n);
        }
    }

    private final void k(int param0, int param1) {
        this.c(param1, (byte) -111);
        this.b(param1, (byte) 59);
        this.b(false, param1);
        this.g(320, param1);
        if (param0 > -70) {
            this.d(44);
        }
    }

    private final void l() {
        int var6 = 0;
        ed[] var12 = null;
        String[] var13 = null;
        tj var14 = null;
        String[] var16 = null;
        tj var17 = null;
        String[] var19 = null;
        tj var20 = null;
        String[] var22 = null;
        tj var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var6 = EscapeVector.field_A;
        if (((oe) this).field_fc == 2) {
          L0: {
            var12 = ae.field_c;
            if (((oe) this).field_Pb < 4) {
              var27 = uj.field_e;
              var22 = lh.field_c;
              var23 = new tj(var27, var12, var22, false);
              re.a(1820, var23);
              break L0;
            } else {
              if (((oe) this).field_Pb < 8) {
                var26 = p.field_j;
                var19 = rb.field_j;
                var20 = new tj(var26, var12, var19, false);
                re.a(1820, var20);
                break L0;
              } else {
                if (((oe) this).field_Pb < 12) {
                  var25 = ha.field_e;
                  var16 = pc.field_b;
                  var17 = new tj(var25, var12, var16, false);
                  re.a(1820, var17);
                  break L0;
                } else {
                  var24 = w.field_bb;
                  var13 = vd.field_i;
                  var14 = new tj(var24, var12, var13, false);
                  re.a(1820, var14);
                  break L0;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int[] param1, byte param2, int param3, int param4, uk param5) {
        RuntimeException var7 = null;
        ga var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ga var14 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = EscapeVector.field_A;
        try {
          L0: {
            var14 = param5.field_f;
            var8 = param5.field_i;
            var9 = var14.field_c * param3;
            var10 = var14.field_c;
            L1: while (true) {
              if (~var8.field_c > ~var10) {
                break L0;
              } else {
                var11 = var14.field_a;
                L2: while (true) {
                  if (~var11 < ~var8.field_a) {
                    var9 = var9 + param3;
                    var10++;
                    continue L1;
                  } else {
                    L3: {
                      var12 = this.a(param5, (byte) 15, var10, var11);
                      if (var12 > 0) {
                        param1[var9 - -var11] = param4;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (0 <= var12) {
                        break L4;
                      } else {
                        param1[var9 + var11] = param0;
                        break L4;
                      }
                    }
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var7;
            stackOut_15_1 = new StringBuilder().append("oe.IC(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(43).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    private final void v() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hg var8 = null;
        int var9 = 0;
        am var10 = null;
        int var11 = 0;
        var11 = EscapeVector.field_A;
        var2 = ((oe) this).field_H >> 5;
        var2 = var2 + (((oe) this).field_n << 11);
        var3 = ((oe) this).field_p >> 5;
        var4 = var2 + -24576;
        var5 = -24576 + var3;
        var6 = 24576 + var2;
        var4 = var4 >> 11;
        var7 = 24576 + var3;
        var6 = var6 >> 11;
        var5 = var5 >> 11;
        var7 = var7 >> 11;
        this.a(98, var7, var5, var4, var6);
        var8 = cn.field_f.a(false);
        var9 = 0;
        L0: while (true) {
          if (var9 >= vh.field_i) {
            L1: {
              if ((var6 ^ var4) >> 5 != 0) {
                this.a(var5, 31, var2, var3, var4 >> 5, true, var7, var4 & 31);
                this.a(var5, var6 & 31, var2, var3, var6 >> 5, true, var7, 0);
                break L1;
              } else {
                this.a(var5, 31 & var6, var2, var3, var4 >> 5, true, var7, 31 & var4);
                break L1;
              }
            }
            return;
          } else {
            var10 = (am) (Object) var8;
            var10.field_i = -var2 + (var10.field_i << 11);
            var10.field_h = -var2 + (var10.field_h << 11);
            var8 = var8.field_b;
            var10.field_j = (var10.field_j << 11) - var3;
            var9++;
            continue L0;
          }
        }
    }

    private final void a(sa param0, oc param1) {
        hg var4 = null;
        RuntimeException var4_ref = null;
        sa var5 = null;
        int var6 = 0;
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
        var6 = EscapeVector.field_A;
        try {
          L0: {
            if (((oe) this).field_Q == 1) {
              if (((oe) this).field_k != null) {
                if (((oe) this).field_k.a(-113)) {
                  return;
                } else {
                  if (param0 == null) {
                    return;
                  } else {
                    if (!param0.field_r) {
                      return;
                    } else {
                      var4 = ((oe) this).field_k.a(false);
                      L1: while (true) {
                        if (var4 == null) {
                          break L0;
                        } else {
                          var5 = (sa) (Object) var4;
                          if (var5.field_j == param0.field_j) {
                            L2: {
                              if (!param0.field_p) {
                                break L2;
                              } else {
                                this.f(27, 2);
                                break L2;
                              }
                            }
                            var4.c((byte) -101);
                            ((oe) this).field_Ab.a(-1, (fl) (Object) param1);
                            this.a(-111, oi.field_J);
                            return;
                          } else {
                            var4 = ((oe) this).field_k.b((byte) 70);
                            continue L1;
                          }
                        }
                      }
                    }
                  }
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
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var4_ref;
            stackOut_24_1 = new StringBuilder().append("oe.UB(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          L4: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
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
              break L4;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + -2 + 41);
        }
    }

    final int c(int param0, int param1) {
        int var4 = EscapeVector.field_A;
        param0 = param0 - ((oe) this).field_H;
        while (~(-((oe) this).field_n << 15) < ~param0) {
            param0 = param0 + (((oe) this).field_n << 16);
        }
        while (((oe) this).field_n << 15 < param0) {
            param0 = param0 - (((oe) this).field_n << 16);
        }
        if (param0 < -((oe) this).field_n << 14) {
            param0 = -param0 + (-((oe) this).field_n << 15);
        }
        if (!(param0 <= ((oe) this).field_n << 14)) {
            param0 = (((oe) this).field_n << 15) + -param0;
        }
        if (!(param0 > -20971520)) {
            return 0;
        }
        if (param0 >= 20971520) {
            return 16384;
        }
        if (param1 <= 94) {
            return 5;
        }
        return 8192 - -(param0 / 2560);
    }

    private final void h() {
        if (!(0 != ((oe) this).field_Q)) {
            this.a(164, (byte) 127, tf.field_i);
        }
        if (!(1 != ((oe) this).field_Q)) {
            this.a(164, (byte) 92, gl.field_r);
        }
    }

    private final int[] a(int param0, byte param1, int param2) {
        int[] stackIn_7_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_5_0 = null;
        if (param1 == -82) {
          if (param2 >= 0) {
            L0: {
              if (~((oe) this).field_nc < ~param2) {
                stackOut_6_0 = ((oe) this).field_Vb[param2 * ((oe) this).field_Mb + param0 % ((oe) this).field_Mb];
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = si.field_v;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return stackIn_7_0;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private final boolean b(int param0, ed param1, int param2) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_7_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            param0 = param0 + param1.field_q;
            param2 = param2 + param1.field_v;
            var5_int = -1 + (param1.field_s + param0);
            var6 = -1 + (param2 - -param1.field_x);
            this.a(96, var6, param2, param0, var5_int);
            if ((var5_int ^ param0) >> 5 == 0) {
              stackOut_7_0 = this.a(param1, param0 >> 5, param2, 31 & param0, -(31 & param0), var6, 31, 31 & var5_int);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              if (this.a(param1, param0 >> 5, param2, 31 & param0, -(31 & param0), var6, 31, 31)) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                return stackIn_4_0 != 0;
              } else {
                stackOut_5_0 = this.a(param1, var5_int >> 5, param2, 0, -param0 & 31, var6, 31, 31 & var5_int);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5;
            stackOut_9_1 = new StringBuilder().append("oe.EE(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + -1 + 41);
        }
        return stackIn_8_0;
    }

    private final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          L1: {
            if (((oe) this).field_rc) {
              if (param1 > 0) {
                if (param2 < 0) {
                  pf.a(false, "EV1: " + param1, (Throwable) null);
                  return;
                } else {
                  L2: {
                    var4 = ((oe) this).field_Rb;
                    if (var4 >= 0) {
                      break L2;
                    } else {
                      var4 = 0;
                      break L2;
                    }
                  }
                  param1 = tj.a(((oe) this).field_fc, (byte) 126, param1);
                  var5 = -var4 + param2;
                  var6 = var5 + 50 * (param2 + param1 * 50);
                  var7 = al.a(((oe) this).field_fc, 26504);
                  if (var7 < 0) {
                    return;
                  } else {
                    lh.a((byte) 99, param1);
                    int discarded$3 = -3282;
                    var13 = jm.j();
                    var12 = var13;
                    var11 = var12;
                    var10 = var11;
                    var8 = var10;
                    if (var8 == null) {
                      return;
                    } else {
                      if (4 != var13.length) {
                        return;
                      } else {
                        de.field_i = new ik(var7, var7 ^ 65535, var13[0], var13[1], var13[2], var13[3], new int[1]);
                        if (aj.b(-98)) {
                          break L1;
                        } else {
                          int discarded$4 = 101;
                          int discarded$5 = 3;
                          ml.a(de.field_i);
                          break L1;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = -40 % ((param0 - 78) / 38);
                break L0;
              }
            } else {
              break L1;
            }
          }
          var4 = -40 % ((param0 - 78) / 38);
          break L0;
        }
    }

    private final void f(int param0) {
        fl var2 = null;
        oc var3 = null;
        int var4 = EscapeVector.field_A;
        if (((oe) this).field_Ab != null) {
            if (((oe) this).field_Ab.b(-182442704)) {
                return;
            }
            var2 = ((oe) this).field_Ab.a(0);
            while (var2 != null) {
                var3 = (oc) (Object) var2;
                if (var3.field_B) {
                    var2.d(-103);
                    return;
                }
                var2 = ((oe) this).field_Ab.a((byte) 124);
            }
            return;
        }
    }

    private final void B() {
        if (((oe) this).field_l == 0) {
          return;
        } else {
          L0: {
            if (!((oe) this).field_a) {
              break L0;
            } else {
              if (0 <= ((oe) this).field_X) {
                L1: {
                  ((oe) this).field_X = ((oe) this).field_X - 1;
                  if (((oe) this).field_X >= 0) {
                    break L1;
                  } else {
                    if (((oe) this).field_Gb) {
                      break L1;
                    } else {
                      this.h((byte) -79);
                      break L0;
                    }
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final boolean r() {
        if (!(((oe) this).field_Pb >= 0)) {
            return true;
        }
        if (((oe) this).field_Yb != 6) {
            return false;
        }
        return true;
    }

    private final void i() {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        sa var6 = null;
        sa var7 = null;
        L0: {
          var5 = EscapeVector.field_A;
          if (((oe) this).field_y >= 2) {
            ((oe) this).field_y = 2;
            break L0;
          } else {
            ((oe) this).field_y = 0;
            break L0;
          }
        }
        ((oe) this).field_dc = -1;
        ((oe) this).field_Mb = 32;
        ((oe) this).field_n = ((oe) this).field_Mb << 5;
        ((oe) this).field_D = 32;
        ((oe) this).field_Fb = ((oe) this).field_D << 5;
        ((oe) this).field_Yb = 5;
        ((oe) this).field_P = 5;
        vl.b(1, 0);
        ((oe) this).field_V = new int[((oe) this).field_D * ((oe) this).field_Mb][];
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 4;
            L2: while (true) {
              if (var2 >= 32) {
                var2 = 14;
                L3: while (true) {
                  if (var2 >= 18) {
                    var2 = 14;
                    L4: while (true) {
                      if (var2 >= 18) {
                        this.l((byte) 124);
                        var2 = 2;
                        var3 = 0;
                        ((oe) this).field_kb.setSize(var2);
                        int incrementValue$2 = var3;
                        var3++;
                        var6 = new sa(incrementValue$2, 8, 480, -mb.field_f[8].field_z + 128);
                        ((oe) this).field_kb.setElementAt((Object) (Object) var6, 0);
                        int incrementValue$3 = var3;
                        var3++;
                        var7 = new sa(incrementValue$3, 1, 512 - mb.field_f[1].field_A / 2, 480 - mb.field_f[1].field_z);
                        ((oe) this).field_kb.setElementAt((Object) (Object) var7, 1);
                        ((oe) this).field_N = new cn();
                        ((oe) this).field_bb = 66715648;
                        ((oe) this).field_qb = 512;
                        ((oe) this).field_t = ((oe) this).field_n << 15;
                        ((oe) this).field_gc = 150;
                        ((oe) this).field_U = 2500;
                        ((oe) this).field_rb = true;
                        return;
                      } else {
                        ((oe) this).field_V[var2 + ((oe) this).field_Mb * 15] = si.field_v;
                        var2++;
                        continue L4;
                      }
                    }
                  } else {
                    ((oe) this).field_V[9 * ((oe) this).field_Mb + var2] = si.field_v;
                    var2++;
                    continue L3;
                  }
                }
              } else {
                var3 = 0;
                L5: while (true) {
                  if (var3 >= 8) {
                    var3 = 24;
                    L6: while (true) {
                      if (var3 >= 32) {
                        var2++;
                        continue L2;
                      } else {
                        ((oe) this).field_V[var2 * ((oe) this).field_Mb - -var3] = si.field_v;
                        var3++;
                        continue L6;
                      }
                    }
                  } else {
                    ((oe) this).field_V[var2 * ((oe) this).field_Mb - -var3] = si.field_v;
                    var3++;
                    continue L5;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            L7: while (true) {
              if (var3 >= 15) {
                var3 = 17;
                L8: while (true) {
                  if (32 <= var3) {
                    var2++;
                    continue L1;
                  } else {
                    ((oe) this).field_V[var3 + ((oe) this).field_Mb * var2] = si.field_v;
                    var3++;
                    continue L8;
                  }
                }
              } else {
                ((oe) this).field_V[((oe) this).field_Mb * var2 - -var3] = si.field_v;
                var3++;
                continue L7;
              }
            }
          }
        }
    }

    private final void a(int param0, ed param1, int param2, int param3) {
        RuntimeException var5 = null;
        double var5_double = 0.0;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        uk var32 = null;
        int var33 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var33 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var5_double = (double)((oe) this).field_I * 0.02454369260617026;
              var7 = (int)(Math.sin(var5_double) * 2048.0);
              var8 = -(int)(Math.cos(var5_double) * 2048.0);
              var9 = -var8;
              var10 = var7;
              var11 = ((oe) this).field_H >> 5;
              var12 = ((oe) this).field_p >> 5;
              var13 = var11 + 10 * var7;
              var14 = -(var7 * 2) + var11;
              var15 = var12 - -(var8 * 10);
              var16 = -(var8 * 2) + var12;
              var17 = -(6 * var7) + (var11 + -(8 * var9));
              var18 = var11 + (-(6 * var7) - -(8 * var9));
              var19 = -(var10 * 8) + (-(6 * var8) + var12);
              var20 = 8 * var10 + -(var8 * 6) + var12;
              var21 = var13;
              if (var21 > var17) {
                var21 = var17;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var18 >= var21) {
                break L2;
              } else {
                var21 = var18;
                break L2;
              }
            }
            L3: {
              var22 = var15;
              if (~var19 > ~var22) {
                var22 = var19;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var22 <= var20) {
                break L4;
              } else {
                var22 = var20;
                break L4;
              }
            }
            L5: {
              var23 = var13;
              if (~var23 > ~var17) {
                var23 = var17;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var18 > var23) {
                var23 = var18;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var24 = var15;
              if (var19 > var24) {
                var24 = var19;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var21 = -param3 + (var21 >> 11);
              if (~var24 > ~var20) {
                var24 = var20;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var22 = -param0 + (var22 >> 11);
              var23 = -param3 + (var23 >> 11);
              var24 = -param0 + (var24 >> 11);
              if (param1 != null) {
                L10: {
                  param1.field_v = var22;
                  var23 = var23 - var21;
                  param1.field_q = var21;
                  var24 = var24 - var22;
                  var21 = var21 << 11;
                  var22 = var22 << 11;
                  var13 = var13 - var21;
                  var11 = var11 - var21;
                  var18 = var18 - var21;
                  var14 = var14 - var21;
                  var15 = var15 - var22;
                  var20 = var20 - var22;
                  var19 = var19 - var22;
                  var16 = var16 - var22;
                  var12 = var12 - var22;
                  var17 = var17 - var21;
                  param1.field_x = 1 + var24;
                  var21 = 0;
                  param1.field_s = var23 + 1;
                  var22 = 0;
                  param1.field_z = param1.field_x + param1.field_v;
                  param1.field_A = param1.field_q + param1.field_s;
                  var27 = param1.field_s * param1.field_x;
                  if (~param1.field_B.length <= ~var27) {
                    var28 = 0;
                    L11: while (true) {
                      if (var28 >= var27) {
                        break L10;
                      } else {
                        param1.field_B[var28] = 0;
                        var28++;
                        continue L11;
                      }
                    }
                  } else {
                    param1.field_B = new int[var27];
                    break L10;
                  }
                }
                var25 = param1.field_B;
                var26 = param1.field_s;
                break L9;
              } else {
                L12: {
                  if (var22 >= 0) {
                    break L12;
                  } else {
                    var22 = 0;
                    break L12;
                  }
                }
                L13: {
                  if (var23 <= 639) {
                    break L13;
                  } else {
                    var23 = 639;
                    break L13;
                  }
                }
                L14: {
                  var25 = em.field_i;
                  if (var24 <= 479) {
                    break L14;
                  } else {
                    var24 = 479;
                    break L14;
                  }
                }
                var26 = 640;
                if (var21 >= 0) {
                  break L9;
                } else {
                  var21 = 0;
                  break L9;
                }
              }
            }
            L15: {
              var27 = -(var9 >> 5) - -(var7 >> 7);
              var28 = -(var10 >> 5) + (var8 >> 7);
              var29 = 65793 * (-(var27 >> 1) + (128 - var28));
              var27 = (var7 >> 7) + (var9 >> 5);
              var28 = (var8 >> 7) + (var10 >> 5);
              var30 = 65793 * (-var28 + (128 - (var27 >> 1)));
              int discarded$1 = 8192;
              if (!this.n()) {
                break L15;
              } else {
                if (se.field_b == null) {
                  break L15;
                } else {
                  var30 = se.field_b.field_b;
                  var29 = se.field_b.field_b;
                  break L15;
                }
              }
            }
            var32 = ae.field_b;
            var32.field_e.a(param3, 120, param0);
            var32.field_k.a(var13, 126, var15);
            var32.field_d.a(var14, 123, var16);
            var32.field_g.a(var17, 124, var19);
            var32.field_c.a(var18, 125, var20);
            var32.field_f.a(var21, 127, var22);
            var32.field_i.a(var23, 122, var24);
            this.a(var29, var25, (byte) 43, var26, var30, var32);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var5 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var5;
            stackOut_43_1 = new StringBuilder().append("oe.GA(").append(param0).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L16;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L16;
            }
          }
          throw t.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + 65793 + 44 + param3 + 41);
        }
    }

    oe(byte[][] param0, int param1, int param2, int param3) {
        try {
            RuntimeException var5 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            ((oe) this).field_F = false;
            ((oe) this).field_rc = true;
            ((oe) this).field_gb = false;
            ((oe) this).field_Q = 0;
            ((oe) this).field_kb = new Vector();
            ((oe) this).field_vb = new cn();
            ((oe) this).field_Db = new od((oe) this);
            ((oe) this).field_Xb = new oc(512);
            ((oe) this).field_Sb = 0;
            ((oe) this).field_qc = 0;
            ((oe) this).field_nb = null;
            ((oe) this).field_G = new cn();
            ((oe) this).field_A = 3;
            ((oe) this).field_tc = new cn();
            ((oe) this).field_X = 0;
            ((oe) this).field_a = false;
            ((oe) this).field_g = new int[3];
            ((oe) this).field_sb = 0;
            ((oe) this).field_l = 0;
            ((oe) this).field_Lb = new int[32];
            ((oe) this).field_i = new ed(638, 60);
            ((oe) this).field_s = new cn();
            ((oe) this).field_C = new cn();
            try {
              L0: {
                L1: {
                  od.field_k = l.a((byte) -111);
                  if (!od.field_k) {
                    break L1;
                  } else {
                    System.out.println("Mod logged in: Cheats activated");
                    break L1;
                  }
                }
                L2: {
                  ((oe) this).field_jb = hl.a(oj.field_N, 100, 0);
                  ((oe) this).field_jb.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_jb);
                  ((oe) this).field_Z = hl.a(ng.field_mb, 100, 0);
                  ((oe) this).field_Z.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_Z);
                  ((oe) this).field_v = hl.a(th.field_G, 100, 0);
                  ((oe) this).field_v.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_v);
                  ((oe) this).field_Wb = hl.a(vi.field_c, 100, 0);
                  ((oe) this).field_Wb.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_Wb);
                  ((oe) this).field_wb = hl.a(w.field_hb, 100, 0);
                  ((oe) this).field_wb.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_wb);
                  ((oe) this).field_r = hl.a(of.field_h, 100, 0);
                  ((oe) this).field_r.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_r);
                  ((oe) this).field_lc = hl.a(pa.field_a, 100, 0);
                  ((oe) this).field_lc.h(-1);
                  pl.field_n.a((wg) (Object) ((oe) this).field_lc);
                  ((oe) this).field_fb = new m();
                  pl.field_n.a((wg) (Object) ((oe) this).field_fb);
                  g.a(127, param3);
                  ((oe) this).field_Nb = param0;
                  ((oe) this).field_Pb = param3;
                  ((oe) this).field_fc = param2;
                  ((oe) this).field_Rb = param3;
                  int discarded$1 = -110;
                  this.j();
                  ((oe) this).field_c = 64;
                  if (param3 < 0) {
                    break L2;
                  } else {
                    this.a(164, (byte) 122, m.field_n);
                    ((oe) this).field_j = 314;
                    break L2;
                  }
                }
                this.a((byte) 84, param1);
                this.o(0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var5 = decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var5;
                stackOut_7_1 = new StringBuilder().append("oe.<init>(");
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
              throw t.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    oe(byte[][] param0) {
        try {
            ((oe) this).field_F = false;
            ((oe) this).field_rc = true;
            ((oe) this).field_gb = false;
            ((oe) this).field_Q = 0;
            ((oe) this).field_kb = new Vector();
            ((oe) this).field_vb = new cn();
            ((oe) this).field_Db = new od((oe) this);
            ((oe) this).field_Xb = new oc(512);
            ((oe) this).field_Sb = 0;
            ((oe) this).field_qc = 0;
            ((oe) this).field_nb = null;
            ((oe) this).field_G = new cn();
            ((oe) this).field_A = 3;
            ((oe) this).field_tc = new cn();
            ((oe) this).field_X = 0;
            ((oe) this).field_a = false;
            ((oe) this).field_g = new int[3];
            ((oe) this).field_sb = 0;
            ((oe) this).field_l = 0;
            ((oe) this).field_Lb = new int[32];
            ((oe) this).field_i = new ed(638, 60);
            ((oe) this).field_s = new cn();
            ((oe) this).field_C = new cn();
            try {
                ((oe) this).field_Nb = param0;
            } catch (RuntimeException runtimeException) {
                throw t.a((Throwable) (Object) runtimeException, "oe.<init>(" + (param0 != null ? "{...}" : "null") + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cc = "...";
        field_xb = new int[8192];
    }
}
