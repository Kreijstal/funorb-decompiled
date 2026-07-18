/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ak extends tp {
    int field_O;
    private int field_jb;
    private int field_Y;
    int field_hb;
    boolean field_rb;
    private boolean field_lb;
    tf field_ob;
    int field_Q;
    private int field_F;
    private int field_Ab;
    int field_Z;
    int field_tb;
    int field_N;
    tf field_xb;
    int field_wb;
    int field_ub;
    int field_V;
    private int field_w;
    String field_qb;
    int field_J;
    static ak field_E;
    boolean field_U;
    int field_gb;
    static ak field_T;
    tf[] field_eb;
    int field_K;
    tf field_B;
    boolean field_A;
    int field_Bb;
    tf field_z;
    tf[] field_zb;
    boolean field_R;
    tf[] field_ab;
    String field_cb;
    boolean field_vb;
    int field_kb;
    int field_y;
    int field_mb;
    jl field_Db;
    bb field_L;
    static int[] field_db;
    private int field_I;
    tf field_H;
    private boolean field_X;
    int field_Cb;
    int field_yb;
    private boolean field_fb;
    boolean field_W;
    int field_C;
    int field_S;
    tf[] field_M;
    int field_sb;
    int field_pb;
    int field_D;
    private int field_x;
    tf[] field_bb;
    private int field_G;
    int field_P;
    int field_nb;
    static int field_ib;

    final void a(ak param0, byte param1) {
        RuntimeException var3 = null;
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
              if (((ak) this).field_L != null) {
                break L1;
              } else {
                ((ak) this).field_L = new bb();
                break L1;
              }
            }
            L2: {
              ((ak) this).field_L.a(22125, (fa) (Object) param0);
              if (param1 == 26) {
                break L2;
              } else {
                ((ak) this).a(false, -2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ak.M(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        ak var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != 95) {
          return 37;
        } else {
          L0: {
            var3 = 0;
            if (null == ((ak) this).field_cb) {
              break L0;
            } else {
              if (null == ((ak) this).field_Db) {
                break L0;
              } else {
                var4_int = ((ak) this).field_Db.a(((ak) this).field_cb, param1);
                if (var4_int > var3) {
                  var3 = var4_int;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L1: {
            if (null == ((ak) this).field_H) {
              break L1;
            } else {
              var4_int = ((ak) this).field_H.field_A;
              if (var4_int <= var3) {
                break L1;
              } else {
                var3 = var4_int;
                break L1;
              }
            }
          }
          L2: {
            if (null != ((ak) this).field_L) {
              var4 = (ak) (Object) ((ak) this).field_L.c(1504642273);
              L3: while (true) {
                if (var4 == null) {
                  break L2;
                } else {
                  L4: {
                    var5 = var4.field_K + var4.field_D;
                    if (var3 >= var5) {
                      break L4;
                    } else {
                      var3 = var5;
                      break L4;
                    }
                  }
                  var4 = (ak) (Object) ((ak) this).field_L.f(1504642273);
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ak) this).field_G = 0;
        ((ak) this).field_D = param2;
        ((ak) this).field_F = 0;
        ((ak) this).field_K = param4;
        if (param3 != 256) {
          return;
        } else {
          ((ak) this).field_wb = 0;
          ((ak) this).field_nb = param1;
          ((ak) this).field_S = param0;
          ((ak) this).field_Z = 0;
          return;
        }
    }

    final void a(int param0, byte param1, boolean param2, int param3) {
        int var9 = 0;
        ak var10_ref_ak = null;
        int var11 = Pixelate.field_H ? 1 : 0;
        int var5 = -((ak) this).field_S;
        int var6 = var5 + -((ak) this).field_wb;
        int var7 = ((ak) this).field_nb;
        int var8 = var7 - -((ak) this).field_Z;
        if (!(param2)) {
            var9 = 0;
            var10_ref_ak = (ak) (Object) ((ak) this).field_L.c(1504642273);
            while (var10_ref_ak != null) {
                var10_ref_ak.field_wb = -var10_ref_ak.field_S + var9;
                var9 = var9 + (var10_ref_ak.field_nb - (-var10_ref_ak.field_Z - param0));
                var10_ref_ak = (ak) (Object) ((ak) this).field_L.f(1504642273);
            }
            var8 = -param0 + var9;
        }
        var9 = -param3 + var8;
        if (var6 > var9) {
            var6 = var9;
        }
        if (param1 >= -127) {
            ((ak) this).field_A = false;
        }
        if (!(var6 >= 0)) {
            var6 = 0;
        }
        int var10 = -param3 + var7;
        if (var10 < var5) {
            var5 = var10;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        ((ak) this).field_nb = var7;
        ((ak) this).field_Z = var8 - var7;
        ((ak) this).field_wb = -var6 + var5;
        ((ak) this).field_S = -var5;
    }

    final void a(int param0, boolean param1) {
        cg.field_I = !param1 ? true : false;
        bm.field_q = !param1 ? true : false;
        if (param0 != -28476) {
            Object var4 = null;
            ((ak) this).a((ak) null, (byte) 61);
        }
        this.a(t.field_j, 0, true, t.field_d, 0, 59);
    }

    ak(long param0, ak param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    final void a(boolean param0, int param1) {
        this.a(false, 0, false, param0, t.field_j, false, (byte) -50, param1, t.field_d, false, true);
    }

    final void a(ak param0, int param1, int param2, ak param3) {
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
              if (param3 == null) {
                param0.field_S = 0;
                param0.field_wb = 0;
                break L1;
              } else {
                param0.field_wb = param3.field_Z + param3.field_wb;
                param0.field_S = param1 + (param3.field_nb + param3.field_S);
                break L1;
              }
            }
            L2: {
              if (param2 == -1) {
                break L2;
              } else {
                ((ak) this).field_Q = -9;
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
            stackOut_6_1 = new StringBuilder().append("ak.R(");
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    private final void a(boolean param0, int param1, boolean param2, boolean param3, int param4, boolean param5, byte param6, int param7, int param8, boolean param9, boolean param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        tf[] var16 = null;
        tf var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int var23_int = 0;
        ak var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        String var27 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var23 = null;
          var25 = Pixelate.field_H ? 1 : 0;
          ((ak) this).field_gb = ((ak) this).field_S + param7;
          ((ak) this).field_tb = param1 + ((ak) this).field_D;
          var12 = t.field_e;
          var13 = t.field_f;
          var14 = t.field_h;
          var15 = t.field_a;
          t.d(((ak) this).field_tb, ((ak) this).field_gb, ((ak) this).field_K + ((ak) this).field_tb, ((ak) this).field_gb + ((ak) this).field_nb);
          if (!((ak) this).field_fb) {
            L1: {
              param0 = ((ak) this).field_U;
              if (((ak) this).field_J == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            param5 = stackIn_5_0 != 0;
            param9 = ((ak) this).field_W;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          param10 = param10 & ((ak) this).field_rb;
          var16 = ((ak) this).field_zb;
          var17 = ((ak) this).field_H;
          var18 = ((ak) this).field_N;
          var19 = 0;
          var20 = 0;
          if (param10) {
            break L2;
          } else {
            L3: {
              if (0 > ((ak) this).field_O) {
                break L3;
              } else {
                var18 = ((ak) this).field_O;
                break L3;
              }
            }
            L4: {
              if (null != ((ak) this).field_xb) {
                var17 = ((ak) this).field_xb;
                break L4;
              } else {
                break L4;
              }
            }
            if (null == ((ak) this).field_M) {
              break L2;
            } else {
              var16 = ((ak) this).field_M;
              break L2;
            }
          }
        }
        L5: {
          if (!param9) {
            break L5;
          } else {
            L6: {
              if (((ak) this).field_x == -2147483648) {
                break L6;
              } else {
                var20 = ((ak) this).field_x;
                break L6;
              }
            }
            L7: {
              if (null != ((ak) this).field_ab) {
                var16 = ((ak) this).field_ab;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((ak) this).field_Y == -2147483648) {
                break L8;
              } else {
                var19 = ((ak) this).field_Y;
                break L8;
              }
            }
            L9: {
              if (null != ((ak) this).field_B) {
                var17 = ((ak) this).field_B;
                break L9;
              } else {
                break L9;
              }
            }
            if (((ak) this).field_y >= 0) {
              var18 = ((ak) this).field_y;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L10: {
          if (param5) {
            L11: {
              if (null == ((ak) this).field_ob) {
                break L11;
              } else {
                var17 = ((ak) this).field_ob;
                break L11;
              }
            }
            L12: {
              if (((ak) this).field_pb < 0) {
                break L12;
              } else {
                var18 = ((ak) this).field_pb;
                break L12;
              }
            }
            L13: {
              if (((ak) this).field_bb == null) {
                break L13;
              } else {
                var16 = ((ak) this).field_bb;
                break L13;
              }
            }
            L14: {
              if (((ak) this).field_V == -2147483648) {
                break L14;
              } else {
                var20 = ((ak) this).field_V;
                break L14;
              }
            }
            if (((ak) this).field_Q == -2147483648) {
              break L10;
            } else {
              var19 = ((ak) this).field_Q;
              break L10;
            }
          } else {
            break L10;
          }
        }
        L15: {
          if (param0) {
            L16: {
              if (((ak) this).field_Cb < 0) {
                break L16;
              } else {
                var18 = ((ak) this).field_Cb;
                break L16;
              }
            }
            L17: {
              if (((ak) this).field_sb != -2147483648) {
                var20 = ((ak) this).field_sb;
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              if (((ak) this).field_z == null) {
                break L18;
              } else {
                var17 = ((ak) this).field_z;
                break L18;
              }
            }
            L19: {
              if (-2147483648 == ((ak) this).field_hb) {
                break L19;
              } else {
                var19 = ((ak) this).field_hb;
                break L19;
              }
            }
            if (null == ((ak) this).field_eb) {
              break L15;
            } else {
              var16 = ((ak) this).field_eb;
              break L15;
            }
          } else {
            break L15;
          }
        }
        L20: {
          var21 = ((ak) this).field_w - -var19;
          var22 = var20 + ((ak) this).field_I;
          if (!((ak) this).field_A) {
            dk.a(((ak) this).field_K, ((ak) this).field_tb, (byte) 75, ((ak) this).field_nb, ((ak) this).field_gb, var16);
            break L20;
          } else {
            dk.a(param4, param1, (byte) 75, param8, param7, var16);
            break L20;
          }
        }
        L21: {
          if (var17 == null) {
            break L21;
          } else {
            L22: {
              var23_int = ((ak) this).field_tb - -var21;
              var24 = var22 + ((ak) this).field_gb;
              if (((ak) this).field_Bb != 1) {
                break L22;
              } else {
                var23_int = var23_int + (-var17.field_A + ((ak) this).field_K) / 2;
                break L22;
              }
            }
            L23: {
              if (2 != ((ak) this).field_Bb) {
                break L23;
              } else {
                var23_int = var23_int + (-var17.field_A + ((ak) this).field_K);
                break L23;
              }
            }
            L24: {
              if (((ak) this).field_kb != 1) {
                break L24;
              } else {
                var24 = var24 + (-var17.field_B + ((ak) this).field_nb) / 2;
                break L24;
              }
            }
            L25: {
              if (((ak) this).field_kb != 2) {
                break L25;
              } else {
                var24 = var24 + (((ak) this).field_nb - var17.field_B);
                break L25;
              }
            }
            if (((ak) this).field_jb >= 256) {
              var17.b(var23_int, var24);
              break L21;
            } else {
              var17.a(var23_int, var24, ((ak) this).field_jb);
              break L21;
            }
          }
        }
        L26: {
          if (((ak) this).field_cb == null) {
            break L26;
          } else {
            if (((ak) this).field_Db == null) {
              break L26;
            } else {
              L27: {
                var26 = ((ak) this).field_cb;
                var27 = var26;
                var27 = var26;
                if (!param3) {
                  break L27;
                } else {
                  if (null == ((ak) this).field_qb) {
                    break L27;
                  } else {
                    var27 = var26 + ((ak) this).field_qb;
                    break L27;
                  }
                }
              }
              L28: {
                if (((ak) this).field_Db.c(var27) > ((ak) this).field_K + -(2 * ((ak) this).field_C)) {
                  break L28;
                } else {
                  if (var27.indexOf("<br>") < 0) {
                    L29: {
                      if (((ak) this).field_kb != 1) {
                        if (((ak) this).field_kb == 2) {
                          var22 = var22 + (((ak) this).field_nb + -((ak) this).field_Db.field_z + -((ak) this).field_Db.field_w);
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var22 = var22 + (-((ak) this).field_Db.field_z + (-((ak) this).field_Db.field_w + ((ak) this).field_nb)) / 2;
                        break L29;
                      }
                    }
                    if (((ak) this).field_Bb != 0) {
                      if (((ak) this).field_Bb != 1) {
                        if (2 != ((ak) this).field_Bb) {
                          int discarded$2 = ((ak) this).field_Db.a(var27, ((ak) this).field_C + ((ak) this).field_tb - -var21, ((ak) this).field_gb - -var22, ((ak) this).field_K + -(((ak) this).field_C * 2), ((ak) this).field_nb, var18, -1, ((ak) this).field_yb, ((ak) this).field_Bb, ((ak) this).field_kb, ((ak) this).field_mb);
                          break L26;
                        } else {
                          ((ak) this).field_Db.c(var27, ((ak) this).field_K - (((ak) this).field_C * 2 - var21 - (((ak) this).field_tb + ((ak) this).field_C)), ((ak) this).field_gb + (var22 + ((ak) this).field_Db.field_w), var18, -1, ((ak) this).field_yb);
                          break L26;
                        }
                      } else {
                        ((ak) this).field_Db.a(var27, (-(2 * ((ak) this).field_C) + ((ak) this).field_K) / 2 + var21 + (((ak) this).field_tb + ((ak) this).field_C), ((ak) this).field_Db.field_w + (((ak) this).field_gb + var22), var18, -1, ((ak) this).field_yb);
                        break L26;
                      }
                    } else {
                      ((ak) this).field_Db.b(var27, ((ak) this).field_tb + (((ak) this).field_C - -var21), ((ak) this).field_Db.field_w + ((ak) this).field_gb + var22, var18, -1, ((ak) this).field_yb);
                      break L26;
                    }
                  } else {
                    break L28;
                  }
                }
              }
              int discarded$3 = ((ak) this).field_Db.a(var27, var21 + ((ak) this).field_C + ((ak) this).field_tb, var22 + ((ak) this).field_gb, -(((ak) this).field_C * 2) + ((ak) this).field_K, ((ak) this).field_nb, var18, -1, ((ak) this).field_yb, ((ak) this).field_Bb, ((ak) this).field_kb, ((ak) this).field_mb);
              break L26;
            }
          }
        }
        L30: {
          if (((ak) this).field_L != null) {
            var23_ref = (ak) (Object) ((ak) this).field_L.c(1504642273);
            L31: while (true) {
              if (var23_ref == null) {
                break L30;
              } else {
                var23_ref.a(param0, ((ak) this).field_tb - -var19, ((ak) this).field_X, param3, ((ak) this).field_K, param5, (byte) -50, var20 + ((ak) this).field_gb, ((ak) this).field_nb, param9, param10);
                var23_ref = (ak) (Object) ((ak) this).field_L.f(1504642273);
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        t.f(var12, var13, var14, var15);
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ak var14 = null;
        int var15 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var15 = Pixelate.field_H ? 1 : 0;
          if (((ak) this).field_G <= 0) {
            var7 = ((ak) this).field_G >> 2;
            break L0;
          } else {
            var7 = -(-((ak) this).field_G >> 2);
            break L0;
          }
        }
        L1: {
          ((ak) this).field_G = ((ak) this).field_G - var7;
          ((ak) this).field_D = ((ak) this).field_D + var7;
          if (((ak) this).field_wb <= 0) {
            var7 = ((ak) this).field_wb >> 2;
            break L1;
          } else {
            var7 = -(-((ak) this).field_wb >> 2);
            break L1;
          }
        }
        L2: {
          ((ak) this).field_S = ((ak) this).field_S + var7;
          ((ak) this).field_wb = ((ak) this).field_wb - var7;
          if (0 < ((ak) this).field_F) {
            var7 = -(-((ak) this).field_F >> 2);
            break L2;
          } else {
            var7 = ((ak) this).field_F >> 2;
            break L2;
          }
        }
        L3: {
          var8 = 81 % ((param5 - -17) / 33);
          ((ak) this).field_F = ((ak) this).field_F - var7;
          ((ak) this).field_K = ((ak) this).field_K + var7;
          if (0 >= ((ak) this).field_Z) {
            var7 = ((ak) this).field_Z >> 2;
            break L3;
          } else {
            var7 = -(-((ak) this).field_Z >> 2);
            break L3;
          }
        }
        L4: {
          L5: {
            param2 = param2 & ((ak) this).field_rb;
            ((ak) this).field_gb = param4 - -((ak) this).field_S;
            ((ak) this).field_nb = ((ak) this).field_nb + var7;
            ((ak) this).field_Z = ((ak) this).field_Z - var7;
            ((ak) this).field_tb = ((ak) this).field_D + param1;
            var9 = t.field_e;
            var10 = t.field_f;
            var11 = t.field_h;
            var12 = t.field_a;
            t.d(((ak) this).field_tb, ((ak) this).field_gb, ((ak) this).field_K + ((ak) this).field_tb, ((ak) this).field_gb - -((ak) this).field_nb);
            var13 = 0;
            if (cg.field_I) {
              break L5;
            } else {
              if (!param2) {
                break L5;
              } else {
                if (nm.field_c == 0) {
                  break L5;
                } else {
                  if (uo.field_a < t.field_e) {
                    break L5;
                  } else {
                    if (uo.field_a >= t.field_h) {
                      break L5;
                    } else {
                      if (ji.field_c < t.field_f) {
                        break L5;
                      } else {
                        if (ji.field_c < t.field_a) {
                          var13 = 1;
                          ((ak) this).field_Ab = -((ak) this).field_gb + ji.field_c;
                          ((ak) this).field_P = nm.field_c;
                          ((ak) this).field_ub = -((ak) this).field_tb + uo.field_a;
                          ((ak) this).field_J = nm.field_c;
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
          L6: {
            if (0 == nm.field_c) {
              break L6;
            } else {
              ((ak) this).field_J = 0;
              break L6;
            }
          }
          ((ak) this).field_P = 0;
          break L4;
        }
        L7: {
          L8: {
            stackOut_24_0 = this;
            stackIn_30_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (bm.field_q) {
              break L8;
            } else {
              stackOut_25_0 = this;
              stackIn_30_0 = stackOut_25_0;
              stackIn_26_0 = stackOut_25_0;
              if (t.field_e > uf.field_d) {
                break L8;
              } else {
                stackOut_26_0 = this;
                stackIn_30_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (uf.field_d >= t.field_h) {
                  break L8;
                } else {
                  stackOut_27_0 = this;
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (bg.field_k < t.field_f) {
                    break L8;
                  } else {
                    stackOut_28_0 = this;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (t.field_a <= bg.field_k) {
                      break L8;
                    } else {
                      stackOut_29_0 = this;
                      stackOut_29_1 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      break L7;
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
          break L7;
        }
        L9: {
          ((ak) this).field_R = stackIn_31_1 != 0;
          if (0 == ef.field_b) {
            ((ak) this).field_J = 0;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          L11: {
            stackOut_34_0 = this;
            stackIn_38_0 = stackOut_34_0;
            stackIn_35_0 = stackOut_34_0;
            if (!((ak) this).field_R) {
              break L11;
            } else {
              stackOut_35_0 = this;
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (ef.field_b != ((ak) this).field_J) {
                break L11;
              } else {
                stackOut_36_0 = this;
                stackIn_38_0 = stackOut_36_0;
                stackIn_37_0 = stackOut_36_0;
                if (!param2) {
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
          ((ak) this).field_W = stackIn_39_1 != 0;
          if (null != ((ak) this).field_L) {
            var14 = (ak) (Object) ((ak) this).field_L.g(1504642273);
            L13: while (true) {
              if (var14 == null) {
                break L12;
              } else {
                var14.a(((ak) this).field_K, ((ak) this).field_tb, param2, ((ak) this).field_nb, ((ak) this).field_gb, -123);
                var14 = (ak) (Object) ((ak) this).field_L.j(0);
                continue L13;
              }
            }
          } else {
            break L12;
          }
        }
        L14: {
          if (!((ak) this).field_R) {
            break L14;
          } else {
            bm.field_q = true;
            break L14;
          }
        }
        L15: {
          if (var13 != 0) {
            cg.field_I = true;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          t.f(var9, var10, var11, var12);
          if (((ak) this).field_J == 0) {
            break L16;
          } else {
            if (!((ak) this).field_vb) {
              break L16;
            } else {
              L17: {
                ((ak) this).field_D = -((ak) this).field_ub + (uf.field_d - param1);
                ((ak) this).field_S = bg.field_k - ((ak) this).field_Ab + -param4;
                if (((ak) this).field_D >= 0) {
                  break L17;
                } else {
                  ((ak) this).field_D = 0;
                  break L17;
                }
              }
              L18: {
                if (0 > ((ak) this).field_S) {
                  ((ak) this).field_S = 0;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (((ak) this).field_D > param0 + -((ak) this).field_K) {
                  ((ak) this).field_D = -((ak) this).field_K + param0;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                ((ak) this).field_G = 0;
                ((ak) this).field_wb = 0;
                ((ak) this).field_tb = param1 - -((ak) this).field_D;
                if (((ak) this).field_S > -((ak) this).field_nb + param3) {
                  ((ak) this).field_S = param3 - ((ak) this).field_nb;
                  break L20;
                } else {
                  break L20;
                }
              }
              ((ak) this).field_gb = param4 + ((ak) this).field_S;
              break L16;
            }
          }
        }
    }

    ak(long param0, ak param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void i(int param0) {
        jp.a(-117);
        uo.b(false);
        hc.field_M = null;
        mj.a(false);
    }

    final static void c(boolean param0) {
        ce.field_d = 0;
        ib.b(20558);
    }

    final void a(int param0, ak param1) {
        RuntimeException var3 = null;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        Object stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_94_0 = null;
        Object stackOut_95_0 = null;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        Object stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                L2: {
                  if (param1.field_fb) {
                    ((ak) this).field_fb = param1.field_fb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param1.field_A) {
                    break L3;
                  } else {
                    ((ak) this).field_A = param1.field_A;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_C != 0) {
                    ((ak) this).field_C = param1.field_C;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null == param1.field_z) {
                    break L5;
                  } else {
                    ((ak) this).field_z = param1.field_z;
                    break L5;
                  }
                }
                L6: {
                  if (null != param1.field_M) {
                    ((ak) this).field_M = param1.field_M;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_Cb < 0) {
                    break L7;
                  } else {
                    ((ak) this).field_Cb = param1.field_Cb;
                    break L7;
                  }
                }
                L8: {
                  if (null != param1.field_H) {
                    ((ak) this).field_H = param1.field_H;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (256 == param1.field_yb) {
                    break L9;
                  } else {
                    ((ak) this).field_yb = param1.field_yb;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_ob == null) {
                    break L10;
                  } else {
                    ((ak) this).field_ob = param1.field_ob;
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_pb < 0) {
                    break L11;
                  } else {
                    ((ak) this).field_pb = param1.field_pb;
                    break L11;
                  }
                }
                L12: {
                  if (null == param1.field_bb) {
                    break L12;
                  } else {
                    ((ak) this).field_bb = param1.field_bb;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_eb == null) {
                    break L13;
                  } else {
                    ((ak) this).field_eb = param1.field_eb;
                    break L13;
                  }
                }
                L14: {
                  if (!param1.field_lb) {
                    break L14;
                  } else {
                    ((ak) this).field_lb = param1.field_lb;
                    break L14;
                  }
                }
                L15: {
                  if (null != param1.field_ab) {
                    ((ak) this).field_ab = param1.field_ab;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_B == null) {
                    break L16;
                  } else {
                    ((ak) this).field_B = param1.field_B;
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_y >= 0) {
                    ((ak) this).field_y = param1.field_y;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_rb) {
                    break L18;
                  } else {
                    ((ak) this).field_rb = param1.field_rb;
                    break L18;
                  }
                }
                L19: {
                  if (null == param1.field_cb) {
                    break L19;
                  } else {
                    ((ak) this).field_cb = param1.field_cb;
                    break L19;
                  }
                }
                L20: {
                  if (0 != param1.field_N) {
                    ((ak) this).field_N = param1.field_N;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_xb != null) {
                    ((ak) this).field_xb = param1.field_xb;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (null == param1.field_Db) {
                    break L22;
                  } else {
                    ((ak) this).field_Db = param1.field_Db;
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_O >= 0) {
                    ((ak) this).field_O = param1.field_O;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_mb == 0) {
                    break L24;
                  } else {
                    ((ak) this).field_mb = param1.field_mb;
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_U) {
                    ((ak) this).field_U = param1.field_U;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param1.field_qb != null) {
                    ((ak) this).field_qb = param1.field_qb;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != param1.field_zb) {
                    ((ak) this).field_zb = param1.field_zb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_sb != -2147483648) {
                    ((ak) this).field_sb = param1.field_sb;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_kb == 0) {
                    break L29;
                  } else {
                    ((ak) this).field_kb = param1.field_kb;
                    break L29;
                  }
                }
                L30: {
                  if (param1.field_vb) {
                    ((ak) this).field_vb = param1.field_vb;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_I != 0) {
                    ((ak) this).field_I = param1.field_I;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_hb != -2147483648) {
                    ((ak) this).field_hb = param1.field_hb;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_V == -2147483648) {
                    break L33;
                  } else {
                    ((ak) this).field_V = param1.field_V;
                    break L33;
                  }
                }
                L34: {
                  if (0 == param1.field_Bb) {
                    break L34;
                  } else {
                    ((ak) this).field_Bb = param1.field_Bb;
                    break L34;
                  }
                }
                L35: {
                  if (-2147483648 != param1.field_Y) {
                    ((ak) this).field_Y = param1.field_Y;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (-2147483648 != param1.field_x) {
                    ((ak) this).field_x = param1.field_x;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (0 != param1.field_w) {
                    ((ak) this).field_w = param1.field_w;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (-2147483648 == param1.field_Q) {
                    break L38;
                  } else {
                    ((ak) this).field_Q = param1.field_Q;
                    break L38;
                  }
                }
                L39: {
                  L40: {
                    stackOut_94_0 = this;
                    stackIn_97_0 = stackOut_94_0;
                    stackIn_95_0 = stackOut_94_0;
                    if (!((ak) this).field_lb) {
                      break L40;
                    } else {
                      stackOut_95_0 = this;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_96_0 = stackOut_95_0;
                      if (!param1.field_X) {
                        break L40;
                      } else {
                        stackOut_96_0 = this;
                        stackOut_96_1 = 1;
                        stackIn_98_0 = stackOut_96_0;
                        stackIn_98_1 = stackOut_96_1;
                        break L39;
                      }
                    }
                  }
                  stackOut_97_0 = this;
                  stackOut_97_1 = 0;
                  stackIn_98_0 = stackOut_97_0;
                  stackIn_98_1 = stackOut_97_1;
                  break L39;
                }
                ((ak) this).field_X = stackIn_98_1 != 0;
                break L1;
              }
            }
            L41: {
              if (param0 == -27813) {
                break L41;
              } else {
                ak.c(true);
                break L41;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L42: {
            var3 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var3;
            stackOut_102_1 = new StringBuilder().append("ak.Q(").append(param0).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L42;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L42;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ')');
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_db = null;
        field_T = null;
    }

    final void h(int param0) {
        ak var4 = null;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (((ak) this).field_L != null) {
            var4 = (ak) (Object) ((ak) this).field_L.g(1504642273);
            while (var4 != null) {
                var4.field_fb = true;
                var4.h(-257);
                var4 = (ak) (Object) ((ak) this).field_L.j(0);
            }
        }
        if (param0 != -257) {
            ((ak) this).field_fb = true;
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
            return -99;
        }
        return ((ak) this).a((byte) 95, 2147483647);
    }

    protected ak() {
        ((ak) this).field_Y = -2147483648;
        ((ak) this).field_rb = true;
        ((ak) this).field_lb = false;
        ((ak) this).field_jb = 256;
        ((ak) this).field_O = -1;
        ((ak) this).field_hb = -2147483648;
        ((ak) this).field_y = -1;
        ((ak) this).field_V = -2147483648;
        ((ak) this).field_X = false;
        ((ak) this).field_yb = 256;
        ((ak) this).field_Cb = -1;
        ((ak) this).field_pb = -1;
        ((ak) this).field_sb = -2147483648;
        ((ak) this).field_Q = -2147483648;
        ((ak) this).field_x = -2147483648;
    }

    ak(long param0, ak param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((ak) this).field_Y = -2147483648;
        ((ak) this).field_rb = true;
        ((ak) this).field_lb = false;
        ((ak) this).field_jb = 256;
        ((ak) this).field_O = -1;
        ((ak) this).field_hb = -2147483648;
        ((ak) this).field_y = -1;
        ((ak) this).field_V = -2147483648;
        ((ak) this).field_X = false;
        ((ak) this).field_yb = 256;
        ((ak) this).field_Cb = -1;
        ((ak) this).field_pb = -1;
        ((ak) this).field_sb = -2147483648;
        ((ak) this).field_Q = -2147483648;
        ((ak) this).field_x = -2147483648;
        try {
          L0: {
            L1: {
              ((ak) this).field_e = param0;
              ((ak) this).field_K = param4;
              ((ak) this).field_nb = param5;
              ((ak) this).field_S = param3;
              ((ak) this).field_D = param2;
              ((ak) this).a(-27813, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((ak) this).field_cb = param6;
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
            stackOut_4_1 = new StringBuilder().append("ak.<init>(").append(param0).append(',');
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new int[]{10, 10, 20, 20, 20, 20};
    }
}
