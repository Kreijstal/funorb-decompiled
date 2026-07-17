/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qr extends hm {
    static nk[] field_A;
    int field_I;
    private int field_E;
    boolean field_s;
    private int field_X;
    int field_N;
    bi field_Z;
    private int field_D;
    int field_x;
    int field_V;
    bi field_ob;
    int field_w;
    int field_kb;
    int field_t;
    int field_hb;
    int field_y;
    bi field_pb;
    int field_ub;
    int field_Y;
    private int field_tb;
    boolean field_r;
    int field_G;
    bi field_U;
    nq field_nb;
    int field_T;
    bi[] field_lb;
    bi field_fb;
    pf field_M;
    bi[] field_vb;
    int field_J;
    int field_W;
    String field_u;
    int field_jb;
    int field_gb;
    int field_rb;
    private int field_O;
    private boolean field_ib;
    private boolean field_H;
    private int field_cb;
    private int field_S;
    bi[] field_wb;
    int field_qb;
    int field_K;
    bi[] field_F;
    boolean field_P;
    bi[] field_sb;
    int field_B;
    int field_Q;
    static String field_R;
    private int field_eb;
    boolean field_bb;
    private boolean field_C;
    boolean field_v;
    String field_z;
    int field_db;
    int field_mb;
    int field_ab;
    boolean field_L;

    final static String a(String param0, byte param1, String param2, String param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_12_0 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_11_0 = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            var5 = param3.length();
            var6 = param2.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (0 != var8) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param0.indexOf(param3, var9_int);
                    if (var9_int < 0) {
                      break L1;
                    } else {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param0.indexOf(param3, var10);
                if (var11 < 0) {
                  StringBuilder discarded$3 = var9.append(param0.substring(var10));
                  stackOut_11_0 = var9.toString();
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  StringBuilder discarded$4 = var9.append(param0.substring(var10, var11));
                  StringBuilder discarded$5 = var9.append(param2);
                  var10 = var11 - -var5;
                  continue L3;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("qr.L(");
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(-125).append(44);
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
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_12_0;
    }

    final static dc a(int param0, int param1, String[] param2, vr param3, int param4, int param5) {
        try {
            RuntimeException var6 = null;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            jn var10 = null;
            int var10_int = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            dc var15 = null;
            hs var16 = null;
            vl var17 = null;
            pc var18 = null;
            dc stackIn_17_0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            dc stackOut_16_0 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            var14 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                var15 = new dc(param0, param3, param4, param2);
                var7 = param2.length;
                var8 = var7 * md.field_J[param5];
                if (param1 == 50) {
                  break L0;
                } else {
                  qr.a(false, (byte) 41);
                  break L0;
                }
              }
              var9 = 0;
              L1: while (true) {
                if (50 > var9) {
                  try {
                    L2: {
                      L3: {
                        L4: {
                          int discarded$1 = 27;
                          var10_int = lr.a();
                          var11 = var8 * 100 / 45;
                          var12 = (int)Math.sqrt((double)var11);
                          var13 = param4;
                          if (var13 != 0) {
                            if (var13 == 2) {
                              break L4;
                            } else {
                              if (1 == var13) {
                                var17 = new vl(var10_int, var15.field_v.length);
                                var15.field_g = var17.a((byte) -128);
                                break L3;
                              } else {
                                if (var13 != 3) {
                                  throw new RuntimeException("Cannot generate map for unknown gametype " + param4);
                                } else {
                                  var18 = new pc(var12, var12, var10_int, var8, var15.field_v.length);
                                  var15.field_g = var18.a((byte) -127);
                                  break L3;
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        var16 = new hs(var12, var12, var10_int, var8, var15.field_v.length);
                        var15.field_g = var16.a((byte) -126);
                        break L3;
                      }
                      var15.field_g.a(var15.field_v, param3, param1 + -46);
                      var15.e(param1 + -50);
                      var15.b(param1 + -151);
                      stackOut_16_0 = (dc) var15;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 0;
                      break L2;
                    }
                  } catch (jn decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var10 = (jn) (Object) decompiledCaughtException;
                      var9++;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    return stackIn_17_0;
                  } else {
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) var6;
                stackOut_20_1 = new StringBuilder().append("qr.R(").append(param0).append(44).append(param1).append(44);
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param2 == null) {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L6;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  break L6;
                }
              }
              L7: {
                stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param3 == null) {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L7;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L7;
                }
              }
              throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param4 + 44 + param5 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, byte param1) {
        int var4_int = 0;
        qr var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        if (null != ((qr) this).field_z) {
            if (((qr) this).field_nb != null) {
                var4_int = ((qr) this).field_nb.c(((qr) this).field_z, param0);
                if (var4_int > var3) {
                    var3 = var4_int;
                }
            }
        }
        if (null != ((qr) this).field_pb) {
            var4_int = ((qr) this).field_pb.field_o;
            if (var4_int > var3) {
                var3 = var4_int;
            }
        }
        if (param1 >= -56) {
            this.a(false, false, true, 31, 106, -74, false, -100, false, false, -72);
        }
        if (!(null == ((qr) this).field_M)) {
            var4 = (qr) (Object) ((qr) this).field_M.d(0);
            while (var4 != null) {
                var5 = var4.field_hb + var4.field_K;
                if (!(var3 >= var5)) {
                    var3 = var5;
                }
                var4 = (qr) (Object) ((qr) this).field_M.a((byte) -71);
            }
        }
        return var3;
    }

    final void a(int param0, qr param1) {
        if (!(null != ((qr) this).field_M)) {
            ((qr) this).field_M = new pf();
        }
        if (param0 != 4) {
            return;
        }
        try {
            ((qr) this).field_M.a((byte) -113, (oh) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qr.DA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, qr param1, qr param2, byte param3) {
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
            L1: {
              if (param1 == null) {
                param2.field_w = 0;
                param2.field_db = 0;
                break L1;
              } else {
                param2.field_db = param1.field_mb + (param1.field_db - -param0);
                param2.field_w = param1.field_w - -param1.field_gb;
                break L1;
              }
            }
            L2: {
              if (param3 >= 38) {
                break L2;
              } else {
                ((qr) this).field_s = false;
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
            stackOut_6_1 = new StringBuilder().append("qr.O(").append(param0).append(44);
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
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param3 + 41);
        }
    }

    final void b(boolean param0, int param1) {
        this.a(false, true, false, 0, 0, -2147483648, false, gf.field_k, false, param0, gf.field_b);
        int var3 = 114 % ((param1 - 25) / 62);
    }

    final static void a(boolean param0, byte param1) {
        int discarded$3 = -27;
        jb.a(param0);
        if (param1 <= 107) {
            Object var3 = null;
            dc discarded$4 = qr.a(46, -4, (String[]) null, (vr) null, -66, -4);
        }
        mj.a(0, param0);
    }

    final void a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qr var10_ref_qr = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = -((qr) this).field_db;
          var6 = var5 + -((qr) this).field_w;
          var7 = ((qr) this).field_mb;
          var8 = var7 - -((qr) this).field_gb;
          if (param2) {
            break L0;
          } else {
            var9 = 0;
            var10_ref_qr = (qr) (Object) ((qr) this).field_M.d(0);
            L1: while (true) {
              if (var10_ref_qr == null) {
                var8 = -param3 + var9;
                break L0;
              } else {
                var10_ref_qr.field_w = -var10_ref_qr.field_db + var9;
                var9 = var9 + (var10_ref_qr.field_mb - -var10_ref_qr.field_gb - -param3);
                var10_ref_qr = (qr) (Object) ((qr) this).field_M.a((byte) -71);
                continue L1;
              }
            }
          }
        }
        var9 = var8 - param0;
        if (!param1) {
          return;
        } else {
          L2: {
            if (var6 <= var9) {
              break L2;
            } else {
              var6 = var9;
              break L2;
            }
          }
          L3: {
            if (var6 < 0) {
              var6 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var10 = -param0 + var7;
            if (var5 > var10) {
              var5 = var10;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (var5 >= 0) {
              break L5;
            } else {
              var5 = 0;
              break L5;
            }
          }
          ((qr) this).field_mb = var7;
          ((qr) this).field_w = var5 + -var6;
          ((qr) this).field_db = -var5;
          ((qr) this).field_gb = -var7 + var8;
          return;
        }
    }

    final void e(byte param0) {
        qr var4 = null;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((qr) this).field_M == null)) {
            var4 = (qr) (Object) ((qr) this).field_M.f(3725);
            while (var4 != null) {
                var4.field_H = true;
                var4.e((byte) -123);
                var4 = (qr) (Object) var4.field_M.b(-125);
            }
        }
        if (param0 >= -122) {
            ((qr) this).field_pb = null;
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var14 = null;
          var15 = ShatteredPlansClient.field_F ? 1 : 0;
          if (0 >= ((qr) this).field_cb) {
            var7 = ((qr) this).field_cb >> 2;
            break L0;
          } else {
            var7 = -(-((qr) this).field_cb >> 2);
            break L0;
          }
        }
        L1: {
          ((qr) this).field_cb = ((qr) this).field_cb - var7;
          ((qr) this).field_hb = ((qr) this).field_hb + var7;
          if (((qr) this).field_w > 0) {
            var7 = -(-((qr) this).field_w >> 2);
            break L1;
          } else {
            var7 = ((qr) this).field_w >> 2;
            break L1;
          }
        }
        L2: {
          ((qr) this).field_db = ((qr) this).field_db + var7;
          ((qr) this).field_w = ((qr) this).field_w - var7;
          var8 = 92 / ((-17 - param4) / 43);
          if (0 < ((qr) this).field_S) {
            var7 = -(-((qr) this).field_S >> 2);
            break L2;
          } else {
            var7 = ((qr) this).field_S >> 2;
            break L2;
          }
        }
        L3: {
          ((qr) this).field_K = ((qr) this).field_K + var7;
          ((qr) this).field_S = ((qr) this).field_S - var7;
          if (0 < ((qr) this).field_gb) {
            var7 = -(-((qr) this).field_gb >> 2);
            break L3;
          } else {
            var7 = ((qr) this).field_gb >> 2;
            break L3;
          }
        }
        L4: {
          L5: {
            ((qr) this).field_gb = ((qr) this).field_gb - var7;
            param3 = param3 & ((qr) this).field_s;
            ((qr) this).field_B = param0 + ((qr) this).field_hb;
            ((qr) this).field_mb = ((qr) this).field_mb + var7;
            ((qr) this).field_N = ((qr) this).field_db + param1;
            var9 = gf.field_i;
            var10 = gf.field_a;
            var11 = gf.field_l;
            var12 = gf.field_f;
            gf.i(((qr) this).field_B, ((qr) this).field_N, ((qr) this).field_B - -((qr) this).field_K, ((qr) this).field_N - -((qr) this).field_mb);
            var13 = 0;
            if (us.field_c) {
              break L5;
            } else {
              if (!param3) {
                break L5;
              } else {
                if (je.field_d == 0) {
                  break L5;
                } else {
                  if (gf.field_i > nh.field_p) {
                    break L5;
                  } else {
                    if (gf.field_l <= nh.field_p) {
                      break L5;
                    } else {
                      if (td.field_P < gf.field_a) {
                        break L5;
                      } else {
                        if (td.field_P >= gf.field_f) {
                          break L5;
                        } else {
                          ((qr) this).field_Q = -((qr) this).field_B + nh.field_p;
                          var13 = 1;
                          ((qr) this).field_X = -((qr) this).field_N + td.field_P;
                          ((qr) this).field_rb = je.field_d;
                          ((qr) this).field_ub = je.field_d;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L6: {
            if (je.field_d != 0) {
              ((qr) this).field_ub = 0;
              break L6;
            } else {
              break L6;
            }
          }
          ((qr) this).field_rb = 0;
          break L4;
        }
        L7: {
          if (rf.field_n == 0) {
            ((qr) this).field_ub = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          L9: {
            stackOut_27_0 = this;
            stackIn_33_0 = stackOut_27_0;
            stackIn_28_0 = stackOut_27_0;
            if (pa.field_j) {
              break L9;
            } else {
              stackOut_28_0 = this;
              stackIn_33_0 = stackOut_28_0;
              stackIn_29_0 = stackOut_28_0;
              if (gf.field_i > pd.field_k) {
                break L9;
              } else {
                stackOut_29_0 = this;
                stackIn_33_0 = stackOut_29_0;
                stackIn_30_0 = stackOut_29_0;
                if (gf.field_l <= pd.field_k) {
                  break L9;
                } else {
                  stackOut_30_0 = this;
                  stackIn_33_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (gf.field_a > bb.field_b) {
                    break L9;
                  } else {
                    stackOut_31_0 = this;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_32_0 = stackOut_31_0;
                    if (gf.field_f <= bb.field_b) {
                      break L9;
                    } else {
                      stackOut_32_0 = this;
                      stackOut_32_1 = 1;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      break L8;
                    }
                  }
                }
              }
            }
          }
          stackOut_33_0 = this;
          stackOut_33_1 = 0;
          stackIn_34_0 = stackOut_33_0;
          stackIn_34_1 = stackOut_33_1;
          break L8;
        }
        L10: {
          L11: {
            ((qr) this).field_v = stackIn_34_1 != 0;
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((qr) this).field_v) {
              break L11;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (((qr) this).field_ub != rf.field_n) {
                break L11;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param3) {
                  break L11;
                } else {
                  stackOut_37_0 = this;
                  stackOut_37_1 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  break L10;
                }
              }
            }
          }
          stackOut_38_0 = this;
          stackOut_38_1 = 0;
          stackIn_39_0 = stackOut_38_0;
          stackIn_39_1 = stackOut_38_1;
          break L10;
        }
        L12: {
          ((qr) this).field_L = stackIn_39_1 != 0;
          if (null != ((qr) this).field_M) {
            var14 = (Object) (Object) (qr) (Object) ((qr) this).field_M.f(3725);
            L13: while (true) {
              if (var14 == null) {
                break L12;
              } else {
                ((qr) var14).a(((qr) var14).field_B, ((qr) var14).field_N, ((qr) var14).field_K, param3, -93, ((qr) var14).field_mb);
                var14 = (Object) (Object) (qr) (Object) ((qr) var14).field_M.b(-125);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (((qr) var14).field_v) {
            pa.field_j = true;
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          if (var13 != 0) {
            us.field_c = true;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          gf.d(var9, var10, var11, var12);
          if (((qr) var14).field_ub == 0) {
            break L16;
          } else {
            if (((qr) var14).field_P) {
              L17: {
                ((qr) this).field_db = -param1 + (bb.field_b - ((qr) var14).field_X);
                ((qr) this).field_hb = -param0 + -((qr) var14).field_Q + pd.field_k;
                if (((qr) var14).field_hb >= 0) {
                  break L17;
                } else {
                  ((qr) this).field_hb = 0;
                  break L17;
                }
              }
              L18: {
                if (((qr) var14).field_hb <= param2 - ((qr) var14).field_K) {
                  break L18;
                } else {
                  ((qr) this).field_hb = -((qr) var14).field_K + param2;
                  break L18;
                }
              }
              L19: {
                if (((qr) var14).field_db < 0) {
                  ((qr) this).field_db = 0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                ((qr) this).field_cb = 0;
                if (((qr) var14).field_db <= -((qr) var14).field_mb + param5) {
                  break L20;
                } else {
                  ((qr) this).field_db = param5 - ((qr) var14).field_mb;
                  break L20;
                }
              }
              ((qr) this).field_B = param0 - -((qr) var14).field_hb;
              ((qr) this).field_w = 0;
              ((qr) this).field_N = param1 + ((qr) var14).field_db;
              break L16;
            } else {
              break L16;
            }
          }
        }
    }

    final static void f(int param0) {
        ha.field_a = null;
        rm.field_a = null;
    }

    final void a(qr param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        Object stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_108_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_97_0 = null;
        Object stackOut_98_0 = null;
        Object stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        String stackOut_106_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                L2: {
                  if (null != param0.field_z) {
                    ((qr) this).field_z = param0.field_z;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param0.field_r) {
                    break L3;
                  } else {
                    ((qr) this).field_r = param0.field_r;
                    break L3;
                  }
                }
                L4: {
                  if (null != param0.field_Z) {
                    ((qr) this).field_Z = param0.field_Z;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (!param0.field_s) {
                    ((qr) this).field_s = param0.field_s;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param0.field_bb) {
                    ((qr) this).field_bb = param0.field_bb;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param0.field_kb == 0) {
                    break L7;
                  } else {
                    ((qr) this).field_kb = param0.field_kb;
                    break L7;
                  }
                }
                L8: {
                  if (param0.field_lb != null) {
                    ((qr) this).field_lb = param0.field_lb;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0.field_wb != null) {
                    ((qr) this).field_wb = param0.field_wb;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_H) {
                    ((qr) this).field_H = param0.field_H;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0.field_I != 256) {
                    ((qr) this).field_I = param0.field_I;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param0.field_qb >= 0) {
                    ((qr) this).field_qb = param0.field_qb;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param0.field_jb >= 0) {
                    ((qr) this).field_jb = param0.field_jb;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_C) {
                    ((qr) this).field_C = param0.field_C;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (null != param0.field_u) {
                    ((qr) this).field_u = param0.field_u;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null != param0.field_ob) {
                    ((qr) this).field_ob = param0.field_ob;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param0.field_W >= 0) {
                    ((qr) this).field_W = param0.field_W;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0.field_ab >= 0) {
                    ((qr) this).field_ab = param0.field_ab;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (null == param0.field_vb) {
                    break L19;
                  } else {
                    ((qr) this).field_vb = param0.field_vb;
                    break L19;
                  }
                }
                L20: {
                  if (null != param0.field_F) {
                    ((qr) this).field_F = param0.field_F;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null != param0.field_pb) {
                    ((qr) this).field_pb = param0.field_pb;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (param0.field_fb == null) {
                    break L22;
                  } else {
                    ((qr) this).field_fb = param0.field_fb;
                    break L22;
                  }
                }
                L23: {
                  if (param0.field_Y == 0) {
                    break L23;
                  } else {
                    ((qr) this).field_Y = param0.field_Y;
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_U != null) {
                    ((qr) this).field_U = param0.field_U;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (0 == param0.field_x) {
                    break L25;
                  } else {
                    ((qr) this).field_x = param0.field_x;
                    break L25;
                  }
                }
                L26: {
                  if (null == param0.field_nb) {
                    break L26;
                  } else {
                    ((qr) this).field_nb = param0.field_nb;
                    break L26;
                  }
                }
                L27: {
                  if (null == param0.field_sb) {
                    break L27;
                  } else {
                    ((qr) this).field_sb = param0.field_sb;
                    break L27;
                  }
                }
                L28: {
                  if (param0.field_V == -2147483648) {
                    break L28;
                  } else {
                    ((qr) this).field_V = param0.field_V;
                    break L28;
                  }
                }
                L29: {
                  if (-2147483648 == param0.field_T) {
                    break L29;
                  } else {
                    ((qr) this).field_T = param0.field_T;
                    break L29;
                  }
                }
                L30: {
                  if (0 == param0.field_y) {
                    break L30;
                  } else {
                    ((qr) this).field_y = param0.field_y;
                    break L30;
                  }
                }
                L31: {
                  if (param0.field_t == -2147483648) {
                    break L31;
                  } else {
                    ((qr) this).field_t = param0.field_t;
                    break L31;
                  }
                }
                L32: {
                  if (-2147483648 != param0.field_O) {
                    ((qr) this).field_O = param0.field_O;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_E != 0) {
                    ((qr) this).field_E = param0.field_E;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (0 == param0.field_tb) {
                    break L34;
                  } else {
                    ((qr) this).field_tb = param0.field_tb;
                    break L34;
                  }
                }
                L35: {
                  if (!param0.field_P) {
                    break L35;
                  } else {
                    ((qr) this).field_P = param0.field_P;
                    break L35;
                  }
                }
                L36: {
                  if (0 != param0.field_G) {
                    ((qr) this).field_G = param0.field_G;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_J == -2147483648) {
                    break L37;
                  } else {
                    ((qr) this).field_J = param0.field_J;
                    break L37;
                  }
                }
                L38: {
                  if (param0.field_D != -2147483648) {
                    ((qr) this).field_D = param0.field_D;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                L39: {
                  L40: {
                    stackOut_97_0 = this;
                    stackIn_100_0 = stackOut_97_0;
                    stackIn_98_0 = stackOut_97_0;
                    if (!((qr) this).field_C) {
                      break L40;
                    } else {
                      stackOut_98_0 = this;
                      stackIn_100_0 = stackOut_98_0;
                      stackIn_99_0 = stackOut_98_0;
                      if (!param0.field_ib) {
                        break L40;
                      } else {
                        stackOut_99_0 = this;
                        stackOut_99_1 = 1;
                        stackIn_101_0 = stackOut_99_0;
                        stackIn_101_1 = stackOut_99_1;
                        break L39;
                      }
                    }
                  }
                  stackOut_100_0 = this;
                  stackOut_100_1 = 0;
                  stackIn_101_0 = stackOut_100_0;
                  stackIn_101_1 = stackOut_100_1;
                  break L39;
                }
                ((qr) this).field_ib = stackIn_101_1 != 0;
                break L1;
              }
            }
            L41: {
              if (!param1) {
                break L41;
              } else {
                ((qr) this).a(true, -124);
                break L41;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var3 = decompiledCaughtException;
            stackOut_105_0 = (RuntimeException) var3;
            stackOut_105_1 = new StringBuilder().append("qr.P(");
            stackIn_107_0 = stackOut_105_0;
            stackIn_107_1 = stackOut_105_1;
            stackIn_106_0 = stackOut_105_0;
            stackIn_106_1 = stackOut_105_1;
            if (param0 == null) {
              stackOut_107_0 = (RuntimeException) (Object) stackIn_107_0;
              stackOut_107_1 = (StringBuilder) (Object) stackIn_107_1;
              stackOut_107_2 = "null";
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              stackIn_108_2 = stackOut_107_2;
              break L42;
            } else {
              stackOut_106_0 = (RuntimeException) (Object) stackIn_106_0;
              stackOut_106_1 = (StringBuilder) (Object) stackIn_106_1;
              stackOut_106_2 = "{...}";
              stackIn_108_0 = stackOut_106_0;
              stackIn_108_1 = stackOut_106_1;
              stackIn_108_2 = stackOut_106_2;
              break L42;
            }
          }
          throw r.a((Throwable) (Object) stackIn_108_0, stackIn_108_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        ((qr) this).field_db = param3;
        ((qr) this).field_hb = param4;
        if (param2 <= 38) {
            ((qr) this).field_F = null;
        }
        ((qr) this).field_gb = 0;
        ((qr) this).field_cb = 0;
        ((qr) this).field_w = 0;
        ((qr) this).field_K = param0;
        ((qr) this).field_mb = param1;
        ((qr) this).field_S = 0;
    }

    final static void a(int[] param0, byte[] param1, byte[] param2, String[][] param3, String[] param4, int param5, String[][] param6, bc param7, bc param8, int param9, bc param10, bi[][] param11, int param12, boolean param13, bi[][] param14) {
        int var15_int = 0;
        RuntimeException var15 = null;
        Object var16 = null;
        Object var17 = null;
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
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            var15_int = 87 / ((40 - param12) / 61);
            var17 = null;
            var16 = null;
            ga.a((nk[]) null, param5, param10, (int[]) null, param11, param4, param9, param7, param1, param3, param8, param2, param13, param6, 16384, param0, param14);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var15 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var15;
            stackOut_2_1 = new StringBuilder().append("qr.FA(");
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
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
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param5).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param6 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param7 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param8 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param9).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param10 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param11 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param12).append(44).append(param13).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param14 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
        }
    }

    qr(long param0, qr param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final int e(boolean param0) {
        if (param0) {
            ((qr) this).a(55, true, true, 26);
        }
        return ((qr) this).a(2147483647, (byte) -93);
    }

    final void a(boolean param0, int param1) {
        us.field_c = !param0 ? true : false;
        pa.field_j = !param0 ? true : false;
        if (param1 != -20429) {
            ((qr) this).field_z = null;
        }
        this.a(0, 0, gf.field_b, true, -98, gf.field_k);
    }

    private final void a(boolean param0, boolean param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        bi[] var16 = null;
        bi var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        qr var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var23 = null;
          var25 = ShatteredPlansClient.field_F ? 1 : 0;
          ((qr) this).field_B = param3 + ((qr) this).field_hb;
          ((qr) this).field_N = param4 - -((qr) this).field_db;
          var12 = gf.field_i;
          var13 = gf.field_a;
          var14 = gf.field_l;
          var15 = gf.field_f;
          gf.i(((qr) this).field_B, ((qr) this).field_N, ((qr) this).field_B - -((qr) this).field_K, ((qr) this).field_mb + ((qr) this).field_N);
          param1 = param1 & ((qr) this).field_s;
          if (param5 == -2147483648) {
            break L0;
          } else {
            qr.a((int[]) null, (byte[]) null, (byte[]) null, (String[][]) null, (String[]) null, 117, (String[][]) null, (bc) null, (bc) null, 119, (bc) null, (bi[][]) null, 82, false, (bi[][]) null);
            break L0;
          }
        }
        L1: {
          if (!((qr) this).field_H) {
            L2: {
              param6 = ((qr) this).field_bb;
              param8 = ((qr) this).field_L;
              if (((qr) this).field_ub == 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            param2 = stackIn_7_0 != 0;
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          var16 = ((qr) this).field_F;
          var17 = ((qr) this).field_pb;
          var18 = ((qr) this).field_x;
          var19 = 0;
          if (!param1) {
            L4: {
              if (((qr) this).field_ob == null) {
                break L4;
              } else {
                var17 = ((qr) this).field_ob;
                break L4;
              }
            }
            L5: {
              if (((qr) this).field_W < 0) {
                break L5;
              } else {
                var18 = ((qr) this).field_W;
                break L5;
              }
            }
            if (((qr) this).field_wb != null) {
              var16 = ((qr) this).field_wb;
              break L3;
            } else {
              break L3;
            }
          } else {
            break L3;
          }
        }
        L6: {
          var20 = 0;
          if (param8) {
            L7: {
              if (((qr) this).field_D != -2147483648) {
                var19 = ((qr) this).field_D;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (null != ((qr) this).field_fb) {
                var17 = ((qr) this).field_fb;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (((qr) this).field_lb != null) {
                var16 = ((qr) this).field_lb;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (((qr) this).field_jb >= 0) {
                var18 = ((qr) this).field_jb;
                break L10;
              } else {
                break L10;
              }
            }
            if (-2147483648 == ((qr) this).field_O) {
              break L6;
            } else {
              var20 = ((qr) this).field_O;
              break L6;
            }
          } else {
            break L6;
          }
        }
        L11: {
          if (param2) {
            L12: {
              if (0 <= ((qr) this).field_qb) {
                var18 = ((qr) this).field_qb;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (null != ((qr) this).field_vb) {
                var16 = ((qr) this).field_vb;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (((qr) this).field_U != null) {
                var17 = ((qr) this).field_U;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (((qr) this).field_t == -2147483648) {
                break L15;
              } else {
                var19 = ((qr) this).field_t;
                break L15;
              }
            }
            if (((qr) this).field_J != -2147483648) {
              var20 = ((qr) this).field_J;
              break L11;
            } else {
              break L11;
            }
          } else {
            break L11;
          }
        }
        L16: {
          if (!param6) {
            break L16;
          } else {
            L17: {
              if (((qr) this).field_V == -2147483648) {
                break L17;
              } else {
                var19 = ((qr) this).field_V;
                break L17;
              }
            }
            L18: {
              if (((qr) this).field_T != -2147483648) {
                var20 = ((qr) this).field_T;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if (null == ((qr) this).field_sb) {
                break L19;
              } else {
                var16 = ((qr) this).field_sb;
                break L19;
              }
            }
            L20: {
              if (null == ((qr) this).field_Z) {
                break L20;
              } else {
                var17 = ((qr) this).field_Z;
                break L20;
              }
            }
            if (((qr) this).field_ab < 0) {
              break L16;
            } else {
              var18 = ((qr) this).field_ab;
              break L16;
            }
          }
        }
        L21: {
          var21 = ((qr) this).field_E + var19;
          var22 = ((qr) this).field_tb + var20;
          if (((qr) this).field_r) {
            em.a(param7, param10, 7, param4, var16, param3);
            break L21;
          } else {
            em.a(((qr) this).field_mb, ((qr) this).field_K, 7, ((qr) this).field_N, var16, ((qr) this).field_B);
            break L21;
          }
        }
        L22: {
          if (var17 != null) {
            L23: {
              var23_int = ((qr) this).field_B + var21;
              if (((qr) this).field_y == 1) {
                var23_int = var23_int + (-var17.field_o + ((qr) this).field_K) / 2;
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var24 = var22 + ((qr) this).field_N;
              if (1 == ((qr) this).field_G) {
                var24 = var24 + (((qr) this).field_mb - var17.field_p) / 2;
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              if (((qr) this).field_y == 2) {
                var23_int = var23_int + (-var17.field_o + ((qr) this).field_K);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (((qr) this).field_G == 2) {
                var24 = var24 + (-var17.field_p + ((qr) this).field_mb);
                break L26;
              } else {
                break L26;
              }
            }
            if (256 > ((qr) this).field_eb) {
              var17.a(var23_int, var24, ((qr) this).field_eb);
              break L22;
            } else {
              var17.f(var23_int, var24);
              break L22;
            }
          } else {
            break L22;
          }
        }
        L27: {
          if (null == ((qr) this).field_z) {
            break L27;
          } else {
            if (null != ((qr) this).field_nb) {
              L28: {
                var26 = ((qr) this).field_z;
                var27 = var26;
                var27 = var26;
                if (!param9) {
                  break L28;
                } else {
                  if (((qr) this).field_u != null) {
                    var27 = var26 + ((qr) this).field_u;
                    break L28;
                  } else {
                    break L28;
                  }
                }
              }
              L29: {
                if (~((qr) this).field_nb.c(var27) < ~(-(2 * ((qr) this).field_kb) + ((qr) this).field_K)) {
                  break L29;
                } else {
                  if (var27.indexOf("<br>") < 0) {
                    L30: {
                      if (((qr) this).field_G == 1) {
                        var22 = var22 + (-((qr) this).field_nb.field_q + ((qr) this).field_mb + -((qr) this).field_nb.field_J) / 2;
                        break L30;
                      } else {
                        if (2 == ((qr) this).field_G) {
                          var22 = var22 + (-((qr) this).field_nb.field_J + (-((qr) this).field_nb.field_q + ((qr) this).field_mb));
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                    if (((qr) this).field_y != 0) {
                      if (((qr) this).field_y == 1) {
                        ((qr) this).field_nb.a(var27, var21 + ((qr) this).field_B + ((qr) this).field_kb - -((((qr) this).field_K - ((qr) this).field_kb * 2) / 2), ((qr) this).field_N + var22 + ((qr) this).field_nb.field_J, var18, -1, ((qr) this).field_I);
                        break L27;
                      } else {
                        if (((qr) this).field_y != 2) {
                          int discarded$2 = ((qr) this).field_nb.a(var27, ((qr) this).field_kb + ((qr) this).field_B - -var21, var22 + ((qr) this).field_N, ((qr) this).field_K + -(2 * ((qr) this).field_kb), ((qr) this).field_mb, var18, -1, ((qr) this).field_I, ((qr) this).field_y, ((qr) this).field_G, ((qr) this).field_Y);
                          break L27;
                        } else {
                          ((qr) this).field_nb.c(var27, ((qr) this).field_K + (-(((qr) this).field_kb * 2) + var21) + (((qr) this).field_B + ((qr) this).field_kb), var22 + (((qr) this).field_N - -((qr) this).field_nb.field_J), var18, -1, ((qr) this).field_I);
                          break L27;
                        }
                      }
                    } else {
                      ((qr) this).field_nb.d(var27, var21 + (((qr) this).field_B + ((qr) this).field_kb), ((qr) this).field_nb.field_J + var22 + ((qr) this).field_N, var18, -1, ((qr) this).field_I);
                      break L27;
                    }
                  } else {
                    break L29;
                  }
                }
              }
              int discarded$3 = ((qr) this).field_nb.a(var27, var21 + (((qr) this).field_kb + ((qr) this).field_B), ((qr) this).field_N - -var22, ((qr) this).field_K - 2 * ((qr) this).field_kb, ((qr) this).field_mb, var18, -1, ((qr) this).field_I, ((qr) this).field_y, ((qr) this).field_G, ((qr) this).field_Y);
              break L27;
            } else {
              break L27;
            }
          }
        }
        L31: {
          if (null == ((qr) this).field_M) {
            break L31;
          } else {
            var23_ref = (qr) (Object) ((qr) this).field_M.d(0);
            L32: while (true) {
              if (var23_ref == null) {
                break L31;
              } else {
                var23_ref.a(var23_ref.field_ib, param1, param2, var23_ref.field_B - -var19, var20 + var23_ref.field_N, -2147483648, param6, var23_ref.field_mb, param8, param9, var23_ref.field_K);
                var23_ref = (qr) (Object) var23_ref.field_M.a((byte) -71);
                continue L32;
              }
            }
          }
        }
        gf.d(var12, var13, var14, var15);
    }

    final static void a(bc param0) {
        bi var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new bi(param0.a(true, "", "final_frame.jpg"), (java.awt.Component) (Object) tm.field_i);
            var3 = var2.field_z;
            var4 = var2.field_w;
            wh.a(false);
            qa.field_q = new bi(var3, 3 * var4 / 4);
            qa.field_q.e();
            var2.c(0, 0);
            ak.field_z = new bi(var3, -qa.field_q.field_w + var4);
            ak.field_z.e();
            var2.c(0, -qa.field_q.field_w);
            ak.field_z.field_x = qa.field_q.field_w;
            ln.f((byte) 85);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "qr.T(" + (param0 != null ? "{...}" : "null") + 44 + 56 + 41);
        }
    }

    qr(long param0, qr param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    public static void e() {
        field_A = null;
        field_R = null;
    }

    protected qr() {
        ((qr) this).field_W = -1;
        ((qr) this).field_T = -2147483648;
        ((qr) this).field_I = 256;
        ((qr) this).field_D = -2147483648;
        ((qr) this).field_qb = -1;
        ((qr) this).field_V = -2147483648;
        ((qr) this).field_jb = -1;
        ((qr) this).field_O = -2147483648;
        ((qr) this).field_J = -2147483648;
        ((qr) this).field_ib = false;
        ((qr) this).field_s = true;
        ((qr) this).field_C = false;
        ((qr) this).field_eb = 256;
        ((qr) this).field_ab = -1;
        ((qr) this).field_t = -2147483648;
    }

    qr(long param0, qr param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((qr) this).field_W = -1;
        ((qr) this).field_T = -2147483648;
        ((qr) this).field_I = 256;
        ((qr) this).field_D = -2147483648;
        ((qr) this).field_qb = -1;
        ((qr) this).field_V = -2147483648;
        ((qr) this).field_jb = -1;
        ((qr) this).field_O = -2147483648;
        ((qr) this).field_J = -2147483648;
        ((qr) this).field_ib = false;
        ((qr) this).field_s = true;
        ((qr) this).field_C = false;
        ((qr) this).field_eb = 256;
        ((qr) this).field_ab = -1;
        ((qr) this).field_t = -2147483648;
        try {
          L0: {
            L1: {
              ((qr) this).field_K = param4;
              ((qr) this).field_hb = param2;
              ((qr) this).field_mb = param5;
              ((qr) this).field_b = param0;
              ((qr) this).field_db = param3;
              ((qr) this).a(param1, false);
              if (param6 == null) {
                break L1;
              } else {
                ((qr) this).field_z = param6;
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
            stackOut_4_1 = new StringBuilder().append("qr.<init>(").append(param0).append(44);
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
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Checking";
    }
}
