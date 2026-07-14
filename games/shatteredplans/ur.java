/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ur extends qr {
    static String field_yb;
    private qr field_Gb;
    private qr field_Fb;
    static gb field_zb;
    private qr field_xb;
    static String[] field_Bb;
    private qr field_Eb;
    static String field_Db;
    private qr field_Ab;
    private qr field_Cb;
    private int field_Hb;

    ur(long param0, qr param1, qr param2, qr param3, qr param4) {
        super(param0, (qr) null);
        ((ur) this).field_Fb = new qr(0L, param1);
        ((ur) this).field_Cb = new qr(0L, param2);
        ((ur) this).a(4, ((ur) this).field_Fb);
        ((ur) this).a(4, ((ur) this).field_Cb);
        ((ur) this).field_Gb = new qr(0L, (qr) null);
        ((ur) this).a(4, ((ur) this).field_Gb);
        ((ur) this).field_xb = new qr(0L, param3);
        ((ur) this).field_Eb = new qr(0L, param3);
        ((ur) this).field_Eb.field_r = true;
        qr var9 = ((ur) this).field_xb;
        qr var10 = var9;
        var10.field_r = true;
        ((ur) this).field_Gb.a(4, ((ur) this).field_xb);
        ((ur) this).field_Gb.a(4, ((ur) this).field_Eb);
        ((ur) this).field_Ab = new qr(0L, param4);
        ((ur) this).field_Ab.field_P = true;
        ((ur) this).field_Gb.a(4, ((ur) this).field_Ab);
    }

    final boolean i(int param0) {
        if (((ur) this).field_xb.field_rb == 0) {
          if (0 != ((ur) this).field_xb.field_ub) {
            L0: {
              if (((ur) this).field_Hb > 0) {
                ((ur) this).field_Hb = ((ur) this).field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (0 == ((ur) this).field_Hb) {
              if (((ur) this).field_Ab.field_N + ((ur) this).field_Ab.field_w <= bb.field_b) {
                if (param0 <= 84) {
                  return true;
                } else {
                  return false;
                }
              } else {
                ((ur) this).field_Hb = 3;
                return true;
              }
            } else {
              if (param0 <= 84) {
                return true;
              } else {
                return false;
              }
            }
          } else {
            if (param0 <= 84) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          ((ur) this).field_Hb = 20;
          return true;
        }
    }

    final int a(int param0, int param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = ((ur) this).field_Gb.field_mb - ((ur) this).field_Ab.field_mb;
          if (0 >= var6) {
            break L0;
          } else {
            var7 = ((ur) this).field_Ab.field_db;
            var8 = -param2 + param1;
            var5 = (var6 / 2 + var8 * var7) / var6;
            break L0;
          }
        }
        if (param0 == -5639) {
          if (param3) {
            L1: {
              if (-1 >= (var5 ^ -1)) {
                break L1;
              } else {
                var5 = 0;
                break L1;
              }
            }
            if (var5 <= param1 + -param2) {
              return var5;
            } else {
              var5 = param1 - param2;
              return var5;
            }
          } else {
            L2: {
              if (-param2 + param1 < var5) {
                var5 = -param2 + param1;
                break L2;
              } else {
                break L2;
              }
            }
            if (0 <= var5) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          }
        } else {
          return 96;
        }
    }

    final boolean h(int param0) {
        if (param0 < -109) {
          if (-1 == ((ur) this).field_Fb.field_rb) {
            if (-1 != ((ur) this).field_Fb.field_ub) {
              if ((((ur) this).field_Hb ^ -1) >= -1) {
                if (((ur) this).field_Hb == 0) {
                  ((ur) this).field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              } else {
                ((ur) this).field_Hb = ((ur) this).field_Hb - 1;
                if (((ur) this).field_Hb == 0) {
                  ((ur) this).field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ((ur) this).field_Hb = 20;
            return true;
          }
        } else {
          return false;
        }
    }

    final boolean g(byte param0) {
        int var2 = 0;
        if (-1 == (((ur) this).field_Eb.field_rb ^ -1)) {
          if (((ur) this).field_Eb.field_ub != 0) {
            L0: {
              if (((ur) this).field_Hb > 0) {
                ((ur) this).field_Hb = ((ur) this).field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((ur) this).field_Hb == 0) {
              if (bb.field_b < ((ur) this).field_Ab.field_N - -((ur) this).field_Ab.field_w + (((ur) this).field_Ab.field_mb - -((ur) this).field_Ab.field_gb)) {
                var2 = 125 % ((param0 - -29) / 47);
                return false;
              } else {
                ((ur) this).field_Hb = 3;
                return true;
              }
            } else {
              var2 = 125 % ((param0 - -29) / 47);
              return false;
            }
          } else {
            var2 = 125 % ((param0 - -29) / 47);
            return false;
          }
        } else {
          ((ur) this).field_Hb = 20;
          return true;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        ((ur) this).field_hb = param1;
        if (param3 != -77) {
          return;
        } else {
          ((ur) this).field_mb = param7;
          ((ur) this).field_db = param0;
          ((ur) this).field_K = param2;
          ((ur) this).a(param5, param3 + 97, param6, param4);
          return;
        }
    }

    final boolean g(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -20641) {
          L0: {
            boolean discarded$11 = ((ur) this).i(-86);
            if (((ur) this).field_Ab.field_ub == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ur) this).field_Ab.field_ub == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void j(int param0) {
        if (param0 != 0) {
            return;
        }
        Object var2 = null;
        ce.a(ae.field_g, (String) null, (byte) 3);
    }

    final boolean f(boolean param0) {
        if (((ur) this).field_Cb.field_rb != 0) {
          ((ur) this).field_Hb = 20;
          return true;
        } else {
          if (!param0) {
            if (((ur) this).field_Cb.field_ub != -1) {
              if (-1 >= ((ur) this).field_Hb) {
                if (0 != ((ur) this).field_Hb) {
                  return false;
                } else {
                  ((ur) this).field_Hb = 3;
                  return true;
                }
              } else {
                ((ur) this).field_Hb = ((ur) this).field_Hb - 1;
                if (0 == ((ur) this).field_Hb) {
                  ((ur) this).field_Hb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ur.f((byte) -12);
            if (((ur) this).field_Cb.field_ub != -1) {
              if (-1 < ((ur) this).field_Hb) {
                ((ur) this).field_Hb = ((ur) this).field_Hb - 1;
                if (0 != ((ur) this).field_Hb) {
                  return false;
                } else {
                  ((ur) this).field_Hb = 3;
                  return true;
                }
              } else {
                if (0 != ((ur) this).field_Hb) {
                  return false;
                } else {
                  ((ur) this).field_Hb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (param1) {
            return;
        }
        cb.field_n = param0;
        s.field_c = param2;
    }

    public static void f(byte param0) {
        field_Bb = null;
        field_Db = null;
        field_zb = null;
        if (param0 != -118) {
            return;
        }
        field_yb = null;
    }

    final static void a(bi[][] param0, int param1, byte[] param2, boolean param3, bc param4, int[] param5, bi[][] param6, String[] param7, String[] param8, int param9, byte[] param10, bc param11, bc param12, nk[] param13, String[][] param14, int param15, String[][] param16, int[] param17, int param18) {
        Object var20 = null;
        fe.a(param3, param2, param10, param18, param5, param7, param1, param4, param11, param16, param12, param0, (String[]) null, param6, param14, param13, -128, param17, param8, 1);
        if (param9 <= -55) {
            return;
        }
        field_Db = null;
    }

    ur(long param0, ur param1) {
        this(param0, param1.field_Fb, param1.field_Cb, param1.field_xb, param1.field_Ab);
    }

    final static fs a(dc param0, int param1, ob param2) {
        if (param1 <= 53) {
            return null;
        }
        return us.a(param2, param0.field_v, 2);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qr var14 = null;
        qr var15 = null;
        qr var16 = null;
        qr var17 = null;
        qr var18 = null;
        qr var19 = null;
        qr stackIn_10_0 = null;
        qr stackIn_10_1 = null;
        qr stackIn_10_2 = null;
        qr stackIn_11_0 = null;
        qr stackIn_11_1 = null;
        qr stackIn_11_2 = null;
        qr stackIn_12_0 = null;
        qr stackIn_12_1 = null;
        qr stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        qr stackIn_22_0 = null;
        qr stackIn_22_1 = null;
        qr stackIn_22_2 = null;
        qr stackIn_23_0 = null;
        qr stackIn_23_1 = null;
        qr stackIn_23_2 = null;
        qr stackIn_24_0 = null;
        qr stackIn_24_1 = null;
        qr stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        qr stackIn_31_0 = null;
        qr stackIn_31_1 = null;
        qr stackIn_31_2 = null;
        qr stackIn_32_0 = null;
        qr stackIn_32_1 = null;
        qr stackIn_32_2 = null;
        qr stackIn_33_0 = null;
        qr stackIn_33_1 = null;
        qr stackIn_33_2 = null;
        int stackIn_33_3 = 0;
        qr stackOut_30_0 = null;
        qr stackOut_30_1 = null;
        qr stackOut_30_2 = null;
        qr stackOut_32_0 = null;
        qr stackOut_32_1 = null;
        qr stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        qr stackOut_31_0 = null;
        qr stackOut_31_1 = null;
        qr stackOut_31_2 = null;
        int stackOut_31_3 = 0;
        qr stackOut_21_0 = null;
        qr stackOut_21_1 = null;
        qr stackOut_21_2 = null;
        qr stackOut_23_0 = null;
        qr stackOut_23_1 = null;
        qr stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        qr stackOut_22_0 = null;
        qr stackOut_22_1 = null;
        qr stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        qr stackOut_9_0 = null;
        qr stackOut_9_1 = null;
        qr stackOut_9_2 = null;
        qr stackOut_11_0 = null;
        qr stackOut_11_1 = null;
        qr stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        qr stackOut_10_0 = null;
        qr stackOut_10_1 = null;
        qr stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        L0: {
          if (((ur) this).field_K * 2 > ((ur) this).field_mb) {
            var6 = ((ur) this).field_mb / 2;
            var5 = ((ur) this).field_mb / 2;
            break L0;
          } else {
            var5 = ((ur) this).field_K;
            var6 = -((ur) this).field_K + ((ur) this).field_mb;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (0 < param2) {
          L1: {
            var8 = param0 * var8 / param2;
            if (var8 >= ((ur) this).field_K) {
              break L1;
            } else {
              var8 = ((ur) this).field_K;
              break L1;
            }
          }
          if (var7 >= var8) {
            L2: {
              var9 = -param0 + param2;
              var10 = var7 - var8;
              var11 = 0;
              if (0 < var9) {
                var11 = (param3 * var10 - -(var9 / 2)) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var11 - -(var8 / 2);
              var14 = ((ur) this).field_Fb;
              var14.field_mb = var5;
              var14.field_hb = 0;
              var14.field_db = 0;
              var14.field_K = ((ur) this).field_K;
              var15 = ((ur) this).field_Cb;
              var15.field_db = var6;
              var15.field_mb = -var6 + ((ur) this).field_mb;
              if (param1 == 20) {
                break L3;
              } else {
                boolean discarded$3 = ((ur) this).i(-87);
                break L3;
              }
            }
            L4: {
              var15.field_hb = 0;
              var15.field_K = ((ur) this).field_K;
              var16 = ((ur) this).field_Gb;
              var16.field_hb = 0;
              var16.field_db = var5;
              var16.field_K = ((ur) this).field_K;
              var16.field_mb = var7;
              var17 = ((ur) this).field_xb;
              var17.field_mb = var12;
              var17.field_K = ((ur) this).field_K;
              var17.field_hb = 0;
              var17.field_db = 0;
              var18 = ((ur) this).field_Eb;
              var18.field_mb = var7 + -var12;
              var18.field_db = var12;
              var18.field_hb = 0;
              var18.field_K = ((ur) this).field_K;
              var19 = ((ur) this).field_Ab;
              stackOut_30_0 = ((ur) this).field_Fb;
              stackOut_30_1 = ((ur) this).field_Cb;
              stackOut_30_2 = ((ur) this).field_Gb;
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              if (param2 <= param0) {
                stackOut_32_0 = (qr) (Object) stackIn_32_0;
                stackOut_32_1 = (qr) (Object) stackIn_32_1;
                stackOut_32_2 = (qr) (Object) stackIn_32_2;
                stackOut_32_3 = 0;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                stackIn_33_3 = stackOut_32_3;
                break L4;
              } else {
                stackOut_31_0 = (qr) (Object) stackIn_31_0;
                stackOut_31_1 = (qr) (Object) stackIn_31_1;
                stackOut_31_2 = (qr) (Object) stackIn_31_2;
                stackOut_31_3 = 1;
                stackIn_33_0 = stackOut_31_0;
                stackIn_33_1 = stackOut_31_1;
                stackIn_33_2 = stackOut_31_2;
                stackIn_33_3 = stackOut_31_3;
                break L4;
              }
            }
            stackIn_33_2.field_s = stackIn_33_3 != 0;
            stackIn_33_1.field_s = stackIn_33_3 != 0;
            stackIn_33_0.field_s = stackIn_33_3 != 0;
            var19.field_db = var11;
            var19.field_K = ((ur) this).field_K;
            var19.field_hb = 0;
            var19.field_mb = var8;
            return;
          } else {
            L5: {
              var8 = var7;
              var9 = -param0 + param2;
              var10 = var7 - var8;
              var11 = 0;
              if (0 < var9) {
                var11 = (param3 * var10 - -(var9 / 2)) / var9;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var12 = var11 - -(var8 / 2);
              var14 = ((ur) this).field_Fb;
              var14.field_mb = var5;
              var14.field_hb = 0;
              var14.field_db = 0;
              var14.field_K = ((ur) this).field_K;
              var15 = ((ur) this).field_Cb;
              var15.field_db = var6;
              var15.field_mb = -var6 + ((ur) this).field_mb;
              if (param1 == 20) {
                break L6;
              } else {
                boolean discarded$4 = ((ur) this).i(-87);
                break L6;
              }
            }
            L7: {
              var15.field_hb = 0;
              var15.field_K = ((ur) this).field_K;
              var16 = ((ur) this).field_Gb;
              var16.field_hb = 0;
              var16.field_db = var5;
              var16.field_K = ((ur) this).field_K;
              var16.field_mb = var7;
              var17 = ((ur) this).field_xb;
              var17.field_mb = var12;
              var17.field_K = ((ur) this).field_K;
              var17.field_hb = 0;
              var17.field_db = 0;
              var18 = ((ur) this).field_Eb;
              var18.field_mb = var7 + -var12;
              var18.field_db = var12;
              var18.field_hb = 0;
              var18.field_K = ((ur) this).field_K;
              var19 = ((ur) this).field_Ab;
              stackOut_21_0 = ((ur) this).field_Fb;
              stackOut_21_1 = ((ur) this).field_Cb;
              stackOut_21_2 = ((ur) this).field_Gb;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              if (param2 <= param0) {
                stackOut_23_0 = (qr) (Object) stackIn_23_0;
                stackOut_23_1 = (qr) (Object) stackIn_23_1;
                stackOut_23_2 = (qr) (Object) stackIn_23_2;
                stackOut_23_3 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                break L7;
              } else {
                stackOut_22_0 = (qr) (Object) stackIn_22_0;
                stackOut_22_1 = (qr) (Object) stackIn_22_1;
                stackOut_22_2 = (qr) (Object) stackIn_22_2;
                stackOut_22_3 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                stackIn_24_3 = stackOut_22_3;
                break L7;
              }
            }
            stackIn_24_2.field_s = stackIn_24_3 != 0;
            stackIn_24_1.field_s = stackIn_24_3 != 0;
            stackIn_24_0.field_s = stackIn_24_3 != 0;
            var19.field_db = var11;
            var19.field_K = ((ur) this).field_K;
            var19.field_hb = 0;
            var19.field_mb = var8;
            return;
          }
        } else {
          L8: {
            var9 = -param0 + param2;
            var10 = var7 - var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (param3 * var10 - -(var9 / 2)) / var9;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            var12 = var11 - -(var8 / 2);
            var14 = ((ur) this).field_Fb;
            var14.field_mb = var5;
            var14.field_hb = 0;
            var14.field_db = 0;
            var14.field_K = ((ur) this).field_K;
            var15 = ((ur) this).field_Cb;
            var15.field_db = var6;
            var15.field_mb = -var6 + ((ur) this).field_mb;
            if (param1 == 20) {
              break L9;
            } else {
              boolean discarded$5 = ((ur) this).i(-87);
              break L9;
            }
          }
          L10: {
            var15.field_hb = 0;
            var15.field_K = ((ur) this).field_K;
            var16 = ((ur) this).field_Gb;
            var16.field_hb = 0;
            var16.field_db = var5;
            var16.field_K = ((ur) this).field_K;
            var16.field_mb = var7;
            var17 = ((ur) this).field_xb;
            var17.field_mb = var12;
            var17.field_K = ((ur) this).field_K;
            var17.field_hb = 0;
            var17.field_db = 0;
            var18 = ((ur) this).field_Eb;
            var18.field_mb = var7 + -var12;
            var18.field_db = var12;
            var18.field_hb = 0;
            var18.field_K = ((ur) this).field_K;
            var19 = ((ur) this).field_Ab;
            stackOut_9_0 = ((ur) this).field_Fb;
            stackOut_9_1 = ((ur) this).field_Cb;
            stackOut_9_2 = ((ur) this).field_Gb;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_11_2 = stackOut_9_2;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            stackIn_10_2 = stackOut_9_2;
            if (param2 <= param0) {
              stackOut_11_0 = (qr) (Object) stackIn_11_0;
              stackOut_11_1 = (qr) (Object) stackIn_11_1;
              stackOut_11_2 = (qr) (Object) stackIn_11_2;
              stackOut_11_3 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              stackIn_12_3 = stackOut_11_3;
              break L10;
            } else {
              stackOut_10_0 = (qr) (Object) stackIn_10_0;
              stackOut_10_1 = (qr) (Object) stackIn_10_1;
              stackOut_10_2 = (qr) (Object) stackIn_10_2;
              stackOut_10_3 = 1;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              stackIn_12_3 = stackOut_10_3;
              break L10;
            }
          }
          stackIn_12_2.field_s = stackIn_12_3 != 0;
          stackIn_12_1.field_s = stackIn_12_3 != 0;
          stackIn_12_0.field_s = stackIn_12_3 != 0;
          var19.field_db = var11;
          var19.field_K = ((ur) this).field_K;
          var19.field_hb = 0;
          var19.field_mb = var8;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = new String[]{"Shattered", "Freezing", "Scorching", "Lost", "Cold", "Sundered", "Burning", "Wandering", "Enduring", "Ancient", "Chaos", "Potent", "Reborn", "Unseen", "Golden", "Beckoning", "Silent", "Waning", "Dancing", "Quantum", "Glittering", "Blackened"};
        field_yb = "Project is <%0>/5 complete.";
        field_Db = "Achievements";
    }
}
