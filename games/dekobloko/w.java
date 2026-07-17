/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w extends km {
    static pf field_H;
    ck[] field_Q;
    int field_nb;
    int field_W;
    mm field_J;
    boolean field_Kb;
    int field_pb;
    String field_Y;
    String field_T;
    private int field_yb;
    int field_gb;
    boolean field_Hb;
    int field_Bb;
    int field_vb;
    ck field_tb;
    int field_ob;
    private boolean field_O;
    ck[] field_lb;
    ck field_bb;
    int field_E;
    static ud field_Eb;
    int field_ub;
    private int field_Jb;
    ck[] field_Ab;
    boolean field_Gb;
    int field_F;
    int field_mb;
    ck[] field_S;
    int field_xb;
    private int field_V;
    private boolean field_L;
    int field_fb;
    private int field_Lb;
    private boolean field_cb;
    int field_Z;
    int field_db;
    int field_Ib;
    static lm field_kb;
    int field_Mb;
    ck field_R;
    private int field_zb;
    boolean field_ab;
    int field_rb;
    private int field_K;
    int field_Db;
    static ck field_qb;
    static int field_Fb;
    int field_G;
    boolean field_jb;
    ck field_sb;
    boolean field_U;
    ck[] field_eb;
    private int field_Cb;
    int field_P;
    int field_ib;
    ck field_I;
    private int field_hb;
    vj field_M;
    int field_N;
    int field_X;
    int field_wb;

    w(long param0, w param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final static void a(int param0, int param1, fa param2) {
        uf var6 = null;
        int var4 = 0;
        try {
            var6 = we.field_b;
            var6.f(param1, -4);
            var6.field_n = var6.field_n + 1;
            var4 = var6.field_n;
            var6.a(true, 1);
            if (null != param2.field_p) {
                var6.a(true, param2.field_p.length);
                var6.a(false, param2.field_p.length, param2.field_p, 0);
            } else {
                var6.a(true, 0);
            }
            int var5 = 120 % ((param0 - 60) / 53);
            int discarded$0 = var6.a((byte) -15, var4);
            var6.field_n = var6.field_n - 4;
            param2.field_s = var6.i(7553);
            var6.b(var6.field_n + -var4, true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "w.NA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((w) this).field_K = param1;
        ((w) this).field_F = 0;
        ((w) this).field_vb = param4;
        ((w) this).field_Ib = param2;
        ((w) this).field_Mb = 0;
        ((w) this).field_N = param3;
        ((w) this).field_mb = param0;
        ((w) this).field_yb = 0;
    }

    public static void f(byte param0) {
        field_qb = null;
        field_kb = null;
        int var1 = 0;
        field_H = null;
        field_Eb = null;
    }

    final int a(boolean param0) {
        if (!param0) {
            return -120;
        }
        return ((w) this).a((byte) 84, 2147483647);
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ck[] var16 = null;
        ck var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        w var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var23 = null;
          var25 = client.field_A ? 1 : 0;
          ((w) this).field_E = ((w) this).field_vb + param4;
          ((w) this).field_pb = param7 + ((w) this).field_Ib;
          var12 = hk.field_c;
          var13 = hk.field_h;
          var14 = hk.field_g;
          var15 = hk.field_b;
          hk.f(((w) this).field_E, ((w) this).field_pb, ((w) this).field_E - -((w) this).field_mb, ((w) this).field_N + ((w) this).field_pb);
          param3 = param3 & ((w) this).field_Hb;
          if (!((w) this).field_L) {
            L1: {
              param2 = ((w) this).field_jb;
              if (0 == ((w) this).field_gb) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param9 = stackIn_5_0 != 0;
            param6 = ((w) this).field_ab;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          var16 = ((w) this).field_lb;
          var17 = ((w) this).field_I;
          var18 = ((w) this).field_G;
          var19 = 0;
          if (param3) {
            break L2;
          } else {
            L3: {
              if (0 > ((w) this).field_P) {
                break L3;
              } else {
                var18 = ((w) this).field_P;
                break L3;
              }
            }
            L4: {
              if (((w) this).field_Ab == null) {
                break L4;
              } else {
                var16 = ((w) this).field_Ab;
                break L4;
              }
            }
            if (null == ((w) this).field_tb) {
              break L2;
            } else {
              var17 = ((w) this).field_tb;
              break L2;
            }
          }
        }
        L5: {
          var20 = 0;
          if (!param2) {
            break L5;
          } else {
            L6: {
              if (((w) this).field_Bb >= 0) {
                var18 = ((w) this).field_Bb;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (((w) this).field_R == null) {
                break L7;
              } else {
                var17 = ((w) this).field_R;
                break L7;
              }
            }
            L8: {
              if (null == ((w) this).field_S) {
                break L8;
              } else {
                var16 = ((w) this).field_S;
                break L8;
              }
            }
            L9: {
              if (((w) this).field_V != -2147483648) {
                var19 = ((w) this).field_V;
                break L9;
              } else {
                break L9;
              }
            }
            if (((w) this).field_hb == -2147483648) {
              break L5;
            } else {
              var20 = ((w) this).field_hb;
              break L5;
            }
          }
        }
        L10: {
          if (!param9) {
            break L10;
          } else {
            L11: {
              if (null != ((w) this).field_bb) {
                var17 = ((w) this).field_bb;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (((w) this).field_fb >= 0) {
                var18 = ((w) this).field_fb;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (((w) this).field_Z != -2147483648) {
                var19 = ((w) this).field_Z;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (null == ((w) this).field_eb) {
                break L14;
              } else {
                var16 = ((w) this).field_eb;
                break L14;
              }
            }
            if (((w) this).field_db != -2147483648) {
              var20 = ((w) this).field_db;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L15: {
          if (!param6) {
            break L15;
          } else {
            L16: {
              if (((w) this).field_rb >= 0) {
                var18 = ((w) this).field_rb;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (((w) this).field_nb != -2147483648) {
                var20 = ((w) this).field_nb;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (null != ((w) this).field_Q) {
                var16 = ((w) this).field_Q;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (null == ((w) this).field_sb) {
                break L19;
              } else {
                var17 = ((w) this).field_sb;
                break L19;
              }
            }
            if (-2147483648 == ((w) this).field_ib) {
              break L15;
            } else {
              var19 = ((w) this).field_ib;
              break L15;
            }
          }
        }
        L20: {
          var21 = ((w) this).field_Cb + var19;
          var22 = var20 + ((w) this).field_Lb;
          if (!((w) this).field_Gb) {
            vk.a(((w) this).field_N, (byte) 50, var16, ((w) this).field_mb, ((w) this).field_pb, ((w) this).field_E);
            break L20;
          } else {
            vk.a(param5, (byte) 50, var16, param1, param7, param4);
            break L20;
          }
        }
        L21: {
          if (var17 == null) {
            break L21;
          } else {
            L22: {
              var23_int = var21 + ((w) this).field_E;
              var24 = ((w) this).field_pb + var22;
              if (((w) this).field_X != 1) {
                break L22;
              } else {
                var23_int = var23_int + (((w) this).field_mb - var17.field_K) / 2;
                break L22;
              }
            }
            L23: {
              if (((w) this).field_W != 1) {
                break L23;
              } else {
                var24 = var24 + (((w) this).field_N + -var17.field_C) / 2;
                break L23;
              }
            }
            L24: {
              if (2 != ((w) this).field_X) {
                break L24;
              } else {
                var23_int = var23_int + (-var17.field_K + ((w) this).field_mb);
                break L24;
              }
            }
            L25: {
              if (((w) this).field_W == 2) {
                var24 = var24 + (((w) this).field_N + -var17.field_C);
                break L25;
              } else {
                break L25;
              }
            }
            if (((w) this).field_zb < 256) {
              var17.c(var23_int, var24, ((w) this).field_zb);
              break L21;
            } else {
              var17.c(var23_int, var24);
              break L21;
            }
          }
        }
        L26: {
          if (null == ((w) this).field_Y) {
            break L26;
          } else {
            if (((w) this).field_J != null) {
              L27: {
                var26 = ((w) this).field_Y;
                var27 = var26;
                var27 = var26;
                if (!param0) {
                  break L27;
                } else {
                  if (((w) this).field_T != null) {
                    var27 = var26 + ((w) this).field_T;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (~((w) this).field_J.a(var27) < ~(((w) this).field_mb + -(2 * ((w) this).field_ub))) {
                  break L28;
                } else {
                  if (0 > var27.indexOf("<br>")) {
                    L29: {
                      if (((w) this).field_W != 1) {
                        if (((w) this).field_W != 2) {
                          break L29;
                        } else {
                          var22 = var22 + (-((w) this).field_J.field_R + (-((w) this).field_J.field_K + ((w) this).field_N));
                          break L29;
                        }
                      } else {
                        var22 = var22 + (((w) this).field_N - ((w) this).field_J.field_R + -((w) this).field_J.field_K) / 2;
                        break L29;
                      }
                    }
                    if (((w) this).field_X != 0) {
                      if (((w) this).field_X == 1) {
                        ((w) this).field_J.b(var27, (-(2 * ((w) this).field_ub) + ((w) this).field_mb) / 2 + (((w) this).field_E - (-((w) this).field_ub + -var21)), ((w) this).field_J.field_R + (((w) this).field_pb + var22), var18, -1, ((w) this).field_wb);
                        break L26;
                      } else {
                        if (2 == ((w) this).field_X) {
                          ((w) this).field_J.a(var27, -(((w) this).field_ub * 2) + (((w) this).field_mb + ((w) this).field_E - -((w) this).field_ub) - -var21, ((w) this).field_pb + (var22 - -((w) this).field_J.field_R), var18, -1, ((w) this).field_wb);
                          break L26;
                        } else {
                          int discarded$2 = ((w) this).field_J.a(var27, var21 + ((w) this).field_ub + ((w) this).field_E, var22 + ((w) this).field_pb, -(2 * ((w) this).field_ub) + ((w) this).field_mb, ((w) this).field_N, var18, -1, ((w) this).field_wb, ((w) this).field_X, ((w) this).field_W, ((w) this).field_Db);
                          break L26;
                        }
                      }
                    } else {
                      ((w) this).field_J.c(var27, ((w) this).field_ub + (((w) this).field_E + var21), ((w) this).field_J.field_R + (var22 + ((w) this).field_pb), var18, -1, ((w) this).field_wb);
                      break L26;
                    }
                  } else {
                    break L28;
                  }
                }
              }
              int discarded$3 = ((w) this).field_J.a(var27, var21 + ((w) this).field_ub + ((w) this).field_E, ((w) this).field_pb - -var22, -(((w) this).field_ub * 2) + ((w) this).field_mb, ((w) this).field_N, var18, -1, ((w) this).field_wb, ((w) this).field_X, ((w) this).field_W, ((w) this).field_Db);
              break L26;
            } else {
              break L26;
            }
          }
        }
        L30: {
          if (((w) this).field_M != null) {
            var23_ref = (w) (Object) ((w) this).field_M.c((byte) -124);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a(param0, var23_ref.field_mb, param2, param3, var19 + var23_ref.field_E, var23_ref.field_N, param6, var23_ref.field_pb - -var20, var23_ref.field_O, param9, -29696);
                var23_ref = (w) (Object) var23_ref.field_M.d(true);
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        hk.b(var12, var13, var14, var15);
    }

    final static lm a(byte[] param0, byte param1) {
        lm var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        Object stackIn_2_0 = null;
        lm stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              L1: {
                var2 = new lm(param0, sg.field_d, fh.field_a, tm.field_a, hc.field_c, tc.field_Nb);
                oa.a(127);
                if (param1 == -5) {
                  break L1;
                } else {
                  var3 = null;
                  lm discarded$2 = w.a((byte[]) null, (byte) -7);
                  break L1;
                }
              }
              stackOut_5_0 = (lm) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (lm) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("w.AA(");
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
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    final void a(byte param0, int param1, int param2, boolean param3) {
        int var9 = 0;
        w var10_ref_w = null;
        int var11 = client.field_A ? 1 : 0;
        int var5 = -((w) this).field_Ib;
        int var6 = var5 - ((w) this).field_Mb;
        int var7 = ((w) this).field_N;
        int var8 = var7 - -((w) this).field_F;
        if (!(param3)) {
            var9 = 0;
            var10_ref_w = (w) (Object) ((w) this).field_M.c((byte) 118);
            while (var10_ref_w != null) {
                var10_ref_w.field_Mb = -var10_ref_w.field_Ib + var9;
                var9 = var9 + (var10_ref_w.field_F + var10_ref_w.field_N + param1);
                var10_ref_w = (w) (Object) ((w) this).field_M.d(true);
            }
            var8 = -param1 + var9;
        }
        if (param0 != -94) {
            ((w) this).field_U = true;
        }
        var9 = -param2 + var8;
        if (!(var6 <= var9)) {
            var6 = var9;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var10 = var7 - param2;
        if (!(var5 <= var10)) {
            var5 = var10;
        }
        if (!(0 <= var5)) {
            var5 = 0;
        }
        ((w) this).field_F = var8 + -var7;
        ((w) this).field_N = var7;
        ((w) this).field_Mb = var5 - var6;
        ((w) this).field_Ib = -var5;
    }

    w(long param0, w param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(boolean param0, boolean param1) {
        if (param0) {
            ((w) this).field_ub = -111;
        }
        gb.field_Zb = !param1 ? true : false;
        sl.field_c = !param1 ? true : false;
        this.a(0, (byte) 127, true, hk.field_i, hk.field_j, 0);
    }

    final void a(w param0, int param1) {
        try {
            if (param1 != -16834) {
                Object var4 = null;
                ((w) this).a((w) null, -88);
            }
            if (null == ((w) this).field_M) {
                ((w) this).field_M = new vj();
            }
            ((w) this).field_M.a((bh) (Object) param0, 2777);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "w.GA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void d(int param0) {
        w var4 = null;
        int var3 = client.field_A ? 1 : 0;
        if (((w) this).field_M != null) {
            var4 = (w) (Object) ((w) this).field_M.b(true);
            while (var4 != null) {
                var4.field_L = true;
                var4.d(-92);
                var4 = (w) (Object) var4.field_M.c(true);
            }
        }
        if (param0 >= -16) {
            field_kb = null;
        }
    }

    private final void a(int param0, byte param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int var14 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        L0: {
          var13 = null;
          var14 = client.field_A ? 1 : 0;
          if (((w) this).field_yb <= 0) {
            var7 = ((w) this).field_yb >> 2;
            break L0;
          } else {
            var7 = -(-((w) this).field_yb >> 2);
            break L0;
          }
        }
        L1: {
          ((w) this).field_vb = ((w) this).field_vb + var7;
          ((w) this).field_yb = ((w) this).field_yb - var7;
          if (((w) this).field_Mb <= 0) {
            var7 = ((w) this).field_Mb >> 2;
            break L1;
          } else {
            var7 = -(-((w) this).field_Mb >> 2);
            break L1;
          }
        }
        L2: {
          ((w) this).field_Ib = ((w) this).field_Ib + var7;
          ((w) this).field_Mb = ((w) this).field_Mb - var7;
          if (((w) this).field_K > 0) {
            var7 = -(-((w) this).field_K >> 2);
            break L2;
          } else {
            var7 = ((w) this).field_K >> 2;
            break L2;
          }
        }
        L3: {
          ((w) this).field_mb = ((w) this).field_mb + var7;
          ((w) this).field_K = ((w) this).field_K - var7;
          if (((w) this).field_F <= 0) {
            var7 = ((w) this).field_F >> 2;
            break L3;
          } else {
            var7 = -(-((w) this).field_F >> 2);
            break L3;
          }
        }
        L4: {
          L5: {
            ((w) this).field_pb = param5 + ((w) this).field_Ib;
            ((w) this).field_F = ((w) this).field_F - var7;
            param2 = param2 & ((w) this).field_Hb;
            ((w) this).field_N = ((w) this).field_N + var7;
            ((w) this).field_E = ((w) this).field_vb + param0;
            var8 = hk.field_c;
            var9 = hk.field_h;
            var10 = hk.field_g;
            var11 = hk.field_b;
            hk.f(((w) this).field_E, ((w) this).field_pb, ((w) this).field_mb + ((w) this).field_E, ((w) this).field_N + ((w) this).field_pb);
            var12 = 0;
            if (gb.field_Zb) {
              break L5;
            } else {
              if (!param2) {
                break L5;
              } else {
                if (0 == ig.field_Yb) {
                  break L5;
                } else {
                  if (he.field_S < hk.field_c) {
                    break L5;
                  } else {
                    if (hk.field_g <= he.field_S) {
                      break L5;
                    } else {
                      if (hk.field_h > nf.field_h) {
                        break L5;
                      } else {
                        if (nf.field_h < hk.field_b) {
                          ((w) this).field_xb = -((w) this).field_E + he.field_S;
                          ((w) this).field_Jb = -((w) this).field_pb + nf.field_h;
                          ((w) this).field_gb = ig.field_Yb;
                          var12 = 1;
                          ((w) this).field_ob = ig.field_Yb;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((w) this).field_ob = 0;
          if (ig.field_Yb != 0) {
            ((w) this).field_gb = 0;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            stackOut_24_0 = this;
            stackIn_30_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (sl.field_c) {
              break L7;
            } else {
              stackOut_25_0 = this;
              stackIn_30_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (hk.field_c > bh.field_g) {
                break L7;
              } else {
                stackOut_26_0 = this;
                stackIn_30_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (bh.field_g >= hk.field_g) {
                  break L7;
                } else {
                  stackOut_27_0 = this;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (hk.field_h > pm.field_f) {
                    break L7;
                  } else {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (pm.field_f >= hk.field_b) {
                      break L7;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L6;
                    }
                  }
                }
              }
            }
          }
          stackOut_30_0 = this;
          stackOut_30_1 = 0;
          stackIn_31_0 = stackOut_30_0;
          stackIn_31_1 = stackOut_30_1;
          break L6;
        }
        L8: {
          ((w) this).field_Kb = stackIn_31_1 != 0;
          if (0 != be.field_n) {
            break L8;
          } else {
            ((w) this).field_gb = 0;
            break L8;
          }
        }
        L9: {
          L10: {
            stackOut_33_0 = this;
            stackIn_37_0 = stackOut_33_0;
            stackIn_34_0 = stackOut_33_0;
            if (!((w) this).field_Kb) {
              break L10;
            } else {
              stackOut_34_0 = this;
              stackIn_37_0 = stackOut_34_0;
              stackIn_35_0 = stackOut_34_0;
              if (be.field_n != ((w) this).field_gb) {
                break L10;
              } else {
                stackOut_35_0 = this;
                stackIn_37_0 = stackOut_35_0;
                stackIn_36_0 = stackOut_35_0;
                if (!param2) {
                  break L10;
                } else {
                  stackOut_36_0 = this;
                  stackOut_36_1 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  break L9;
                }
              }
            }
          }
          stackOut_37_0 = this;
          stackOut_37_1 = 0;
          stackIn_38_0 = stackOut_37_0;
          stackIn_38_1 = stackOut_37_1;
          break L9;
        }
        L11: {
          ((w) this).field_jb = stackIn_38_1 != 0;
          if (null != ((w) this).field_M) {
            var13 = (Object) (Object) (w) (Object) ((w) this).field_M.b(true);
            L12: while (true) {
              if (var13 == null) {
                break L11;
              } else {
                ((w) var13).a(((w) var13).field_E, (byte) 126, param2, ((w) var13).field_N, ((w) var13).field_mb, ((w) var13).field_pb);
                var13 = (Object) (Object) (w) (Object) ((w) var13).field_M.c(true);
                continue L12;
              }
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (!((w) var13).field_Kb) {
            break L13;
          } else {
            sl.field_c = true;
            break L13;
          }
        }
        L14: {
          if (var12 != 0) {
            gb.field_Zb = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          hk.b(var8, var9, var10, var11);
          if (((w) var13).field_gb == 0) {
            break L15;
          } else {
            if (!((w) var13).field_U) {
              break L15;
            } else {
              L16: {
                ((w) this).field_vb = -param0 + bh.field_g - ((w) var13).field_xb;
                ((w) this).field_Ib = -((w) var13).field_Jb + pm.field_f - param5;
                if (((w) var13).field_vb < 0) {
                  ((w) this).field_vb = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (0 <= ((w) var13).field_Ib) {
                  break L17;
                } else {
                  ((w) this).field_Ib = 0;
                  break L17;
                }
              }
              L18: {
                if (-((w) var13).field_mb + param4 < ((w) var13).field_vb) {
                  ((w) this).field_vb = param4 + -((w) var13).field_mb;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                ((w) this).field_yb = 0;
                ((w) this).field_Mb = 0;
                if (param3 + -((w) var13).field_N < ((w) var13).field_Ib) {
                  ((w) this).field_Ib = param3 - ((w) var13).field_N;
                  break L19;
                } else {
                  break L19;
                }
              }
              ((w) this).field_E = param0 - -((w) var13).field_vb;
              ((w) this).field_pb = ((w) var13).field_Ib + param5;
              break L15;
            }
          }
        }
        L20: {
          if (param1 >= 125) {
            break L20;
          } else {
            ((w) this).field_E = 12;
            break L20;
          }
        }
    }

    final void a(int param0, boolean param1) {
        this.a(param1, hk.field_j, false, true, 0, hk.field_i, false, 0, false, false, -29696);
        if (param0 != 1141039778) {
            ((w) this).field_sb = null;
        }
    }

    final void a(int param0, w param1) {
        RuntimeException var3 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_62_0 = null;
        Object stackOut_63_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                L2: {
                  if (param1.field_lb == null) {
                    break L2;
                  } else {
                    ((w) this).field_lb = param1.field_lb;
                    break L2;
                  }
                }
                L3: {
                  if (param1.field_rb < 0) {
                    break L3;
                  } else {
                    ((w) this).field_rb = param1.field_rb;
                    break L3;
                  }
                }
                L4: {
                  if (!param1.field_ab) {
                    break L4;
                  } else {
                    ((w) this).field_ab = param1.field_ab;
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_bb == null) {
                    break L5;
                  } else {
                    ((w) this).field_bb = param1.field_bb;
                    break L5;
                  }
                }
                L6: {
                  if (null != param1.field_Y) {
                    ((w) this).field_Y = param1.field_Y;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_S != null) {
                    ((w) this).field_S = param1.field_S;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param1.field_Gb) {
                    ((w) this).field_Gb = param1.field_Gb;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_Q == null) {
                    break L9;
                  } else {
                    ((w) this).field_Q = param1.field_Q;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_Ab != null) {
                    ((w) this).field_Ab = param1.field_Ab;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (null == param1.field_T) {
                    break L11;
                  } else {
                    ((w) this).field_T = param1.field_T;
                    break L11;
                  }
                }
                L12: {
                  if (0 > param1.field_fb) {
                    break L12;
                  } else {
                    ((w) this).field_fb = param1.field_fb;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_P < 0) {
                    break L13;
                  } else {
                    ((w) this).field_P = param1.field_P;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_ub != 0) {
                    ((w) this).field_ub = param1.field_ub;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (null != param1.field_tb) {
                    ((w) this).field_tb = param1.field_tb;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (!param1.field_L) {
                    break L16;
                  } else {
                    ((w) this).field_L = param1.field_L;
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_Db != 0) {
                    ((w) this).field_Db = param1.field_Db;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_Hb) {
                    break L18;
                  } else {
                    ((w) this).field_Hb = param1.field_Hb;
                    break L18;
                  }
                }
                L19: {
                  if (0 > param1.field_Bb) {
                    break L19;
                  } else {
                    ((w) this).field_Bb = param1.field_Bb;
                    break L19;
                  }
                }
                L20: {
                  if (param1.field_eb != null) {
                    ((w) this).field_eb = param1.field_eb;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null == param1.field_R) {
                    break L21;
                  } else {
                    ((w) this).field_R = param1.field_R;
                    break L21;
                  }
                }
                L22: {
                  if (param1.field_I == null) {
                    break L22;
                  } else {
                    ((w) this).field_I = param1.field_I;
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_G != 0) {
                    ((w) this).field_G = param1.field_G;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_wb == 256) {
                    break L24;
                  } else {
                    ((w) this).field_wb = param1.field_wb;
                    break L24;
                  }
                }
                L25: {
                  if (null == param1.field_J) {
                    break L25;
                  } else {
                    ((w) this).field_J = param1.field_J;
                    break L25;
                  }
                }
                L26: {
                  if (null == param1.field_sb) {
                    break L26;
                  } else {
                    ((w) this).field_sb = param1.field_sb;
                    break L26;
                  }
                }
                L27: {
                  if (!param1.field_cb) {
                    break L27;
                  } else {
                    ((w) this).field_cb = param1.field_cb;
                    break L27;
                  }
                }
                L28: {
                  L29: {
                    stackOut_62_0 = this;
                    stackIn_65_0 = stackOut_62_0;
                    stackIn_63_0 = stackOut_62_0;
                    if (!((w) this).field_cb) {
                      break L29;
                    } else {
                      stackOut_63_0 = this;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      if (!param1.field_O) {
                        break L29;
                      } else {
                        stackOut_64_0 = this;
                        stackOut_64_1 = 1;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        break L28;
                      }
                    }
                  }
                  stackOut_65_0 = this;
                  stackOut_65_1 = 0;
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  break L28;
                }
                L30: {
                  ((w) this).field_O = stackIn_66_1 != 0;
                  if (param1.field_db != -2147483648) {
                    ((w) this).field_db = param1.field_db;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (0 == param1.field_Lb) {
                    break L31;
                  } else {
                    ((w) this).field_Lb = param1.field_Lb;
                    break L31;
                  }
                }
                L32: {
                  if (0 != param1.field_X) {
                    ((w) this).field_X = param1.field_X;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_hb == -2147483648) {
                    break L33;
                  } else {
                    ((w) this).field_hb = param1.field_hb;
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_nb == -2147483648) {
                    break L34;
                  } else {
                    ((w) this).field_nb = param1.field_nb;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_ib == -2147483648) {
                    break L35;
                  } else {
                    ((w) this).field_ib = param1.field_ib;
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_Cb != 0) {
                    ((w) this).field_Cb = param1.field_Cb;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_V == -2147483648) {
                    break L37;
                  } else {
                    ((w) this).field_V = param1.field_V;
                    break L37;
                  }
                }
                L38: {
                  if (param1.field_W == 0) {
                    break L38;
                  } else {
                    ((w) this).field_W = param1.field_W;
                    break L38;
                  }
                }
                L39: {
                  if (param1.field_Z != -2147483648) {
                    ((w) this).field_Z = param1.field_Z;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                if (!param1.field_U) {
                  break L1;
                } else {
                  ((w) this).field_U = param1.field_U;
                  break L1;
                }
              }
            }
            L40: {
              if (param0 < -111) {
                break L40;
              } else {
                int discarded$1 = ((w) this).a(true);
                break L40;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) var3;
            stackOut_95_1 = new StringBuilder().append("w.W(").append(param0).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param1 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L41;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L41;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
    }

    final void a(w param0, w param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
            if (param3 == 0) {
              L1: {
                if (param0 == null) {
                  param1.field_Ib = 0;
                  param1.field_Mb = 0;
                  break L1;
                } else {
                  param1.field_Mb = param0.field_Mb - -param0.field_F;
                  param1.field_Ib = param0.field_N + (param0.field_Ib - -param2);
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
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("w.KA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
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
          throw dh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final int a(byte param0, int param1) {
        int var4_int = 0;
        w var4 = null;
        int var5 = 0;
        int var6 = client.field_A ? 1 : 0;
        int var3 = 0;
        if (((w) this).field_Y != null) {
            if (!(((w) this).field_J == null)) {
                var4_int = ((w) this).field_J.b(((w) this).field_Y, param1);
                if (var4_int > var3) {
                    var3 = var4_int;
                }
            }
        }
        if (param0 != 84) {
            ((w) this).field_hb = -71;
        }
        if (!(((w) this).field_I == null)) {
            var4_int = ((w) this).field_I.field_K;
            if (!(var3 >= var4_int)) {
                var3 = var4_int;
            }
        }
        if (!(null == ((w) this).field_M)) {
            var4 = (w) (Object) ((w) this).field_M.c((byte) -125);
            while (var4 != null) {
                var5 = var4.field_mb + var4.field_vb;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (w) (Object) ((w) this).field_M.d(true);
            }
        }
        return var3;
    }

    protected w() {
        ((w) this).field_nb = -2147483648;
        ((w) this).field_Bb = -1;
        ((w) this).field_V = -2147483648;
        ((w) this).field_O = false;
        ((w) this).field_Z = -2147483648;
        ((w) this).field_db = -2147483648;
        ((w) this).field_cb = false;
        ((w) this).field_Hb = true;
        ((w) this).field_rb = -1;
        ((w) this).field_fb = -1;
        ((w) this).field_zb = 256;
        ((w) this).field_ib = -2147483648;
        ((w) this).field_P = -1;
        ((w) this).field_wb = 256;
        ((w) this).field_hb = -2147483648;
    }

    w(long param0, w param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((w) this).field_nb = -2147483648;
        ((w) this).field_Bb = -1;
        ((w) this).field_V = -2147483648;
        ((w) this).field_O = false;
        ((w) this).field_Z = -2147483648;
        ((w) this).field_db = -2147483648;
        ((w) this).field_cb = false;
        ((w) this).field_Hb = true;
        ((w) this).field_rb = -1;
        ((w) this).field_fb = -1;
        ((w) this).field_zb = 256;
        ((w) this).field_ib = -2147483648;
        ((w) this).field_P = -1;
        ((w) this).field_wb = 256;
        ((w) this).field_hb = -2147483648;
        try {
          L0: {
            L1: {
              ((w) this).field_mb = param4;
              ((w) this).field_i = param0;
              ((w) this).field_N = param5;
              ((w) this).field_vb = param2;
              ((w) this).field_Ib = param3;
              ((w) this).a(-119, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((w) this).field_Y = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("w.<init>(").append(param0).append(44);
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = 100;
    }
}
