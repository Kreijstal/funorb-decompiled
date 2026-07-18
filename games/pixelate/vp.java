/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends ak {
    static String field_Nb;
    private ak field_Kb;
    static int[] field_Fb;
    private ak field_Eb;
    private int field_Ob;
    private ak field_Pb;
    private ak field_Mb;
    private ak field_Rb;
    static int[] field_Sb;
    static pf field_Gb;
    private ak field_Jb;
    static int field_Ib;
    static ak field_Qb;
    static int field_Lb;
    static bb field_Hb;

    public static void c(byte param0) {
        field_Qb = null;
        field_Hb = null;
        int var1 = -33 % ((49 - param0) / 39);
        field_Fb = null;
        field_Sb = null;
        field_Gb = null;
        field_Nb = null;
    }

    final int a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          if (param0 == 3) {
            break L0;
          } else {
            boolean discarded$1 = ((vp) this).e((byte) -58);
            break L0;
          }
        }
        L1: {
          var6 = ((vp) this).field_Rb.field_nb - ((vp) this).field_Pb.field_nb;
          if (var6 <= 0) {
            break L1;
          } else {
            var7 = ((vp) this).field_Pb.field_S;
            var8 = param1 - param3;
            var5 = (var8 * var7 + var6 / 2) / var6;
            break L1;
          }
        }
        if (!param2) {
          L2: {
            if (var5 <= -param3 + param1) {
              break L2;
            } else {
              var5 = -param3 + param1;
              break L2;
            }
          }
          if (0 <= var5) {
            return var5;
          } else {
            var5 = 0;
            return var5;
          }
        } else {
          L3: {
            if (var5 < 0) {
              var5 = 0;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param1 - param3 >= var5) {
              break L4;
            } else {
              var5 = -param3 + param1;
              break L4;
            }
          }
          return var5;
        }
    }

    final static vj d(byte param0) {
        return wi.field_d;
    }

    vp(long param0, vp param1) {
        this(param0, param1.field_Kb, param1.field_Mb, param1.field_Eb, param1.field_Pb);
    }

    final boolean b(byte param0) {
        if (((vp) this).field_Mb.field_P != 0) {
          ((vp) this).field_Ob = 20;
          return true;
        } else {
          if (param0 >= 11) {
            if (-1 != ((vp) this).field_Mb.field_J) {
              if (-1 >= ((vp) this).field_Ob) {
                if (0 != ((vp) this).field_Ob) {
                  return false;
                } else {
                  ((vp) this).field_Ob = 3;
                  return true;
                }
              } else {
                ((vp) this).field_Ob = ((vp) this).field_Ob - 1;
                if (0 == ((vp) this).field_Ob) {
                  ((vp) this).field_Ob = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            field_Sb = null;
            if (-1 != ((vp) this).field_Mb.field_J) {
              if (-1 < ((vp) this).field_Ob) {
                ((vp) this).field_Ob = ((vp) this).field_Ob - 1;
                if (0 == ((vp) this).field_Ob) {
                  ((vp) this).field_Ob = 3;
                  return true;
                } else {
                  return false;
                }
              } else {
                if (0 != ((vp) this).field_Ob) {
                  return false;
                } else {
                  ((vp) this).field_Ob = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final boolean e(byte param0) {
        if (!(((vp) this).field_Kb.field_P == 0)) {
            ((vp) this).field_Ob = 20;
            return true;
        }
        if (0 != ((vp) this).field_Kb.field_J) {
            if (((vp) this).field_Ob > 0) {
                ((vp) this).field_Ob = ((vp) this).field_Ob - 1;
                if (!(((vp) this).field_Ob != 0)) {
                    ((vp) this).field_Ob = 3;
                    return true;
                }
                if (param0 >= 118) {
                    return false;
                }
                vp.c((byte) -109);
                return false;
            }
            if (((vp) this).field_Ob != 0) {
                if (param0 >= 118) {
                    return false;
                }
                vp.c((byte) -109);
                return false;
            }
            ((vp) this).field_Ob = 3;
            return true;
        }
        if (param0 < 118) {
            vp.c((byte) -109);
            return false;
        }
        return false;
    }

    final boolean k(int param0) {
        if (param0 <= 70) {
            return true;
        }
        return ((vp) this).field_Pb.field_J != 0 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((vp) this).field_S = param6;
        ((vp) this).field_K = param5;
        ((vp) this).field_D = param0;
        ((vp) this).field_nb = param2;
        ((vp) this).a(param3, (byte) 108, param4, param1);
        if (param7 != -1) {
            vp.a(55, 126);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ak var14 = null;
        ak var15 = null;
        ak var16 = null;
        ak var17 = null;
        ak var18 = null;
        ak var19 = null;
        ak stackIn_8_0 = null;
        ak stackIn_8_1 = null;
        ak stackIn_8_2 = null;
        ak stackIn_9_0 = null;
        ak stackIn_9_1 = null;
        ak stackIn_9_2 = null;
        ak stackIn_10_0 = null;
        ak stackIn_10_1 = null;
        ak stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        ak stackIn_22_0 = null;
        ak stackIn_22_1 = null;
        ak stackIn_22_2 = null;
        ak stackIn_23_0 = null;
        ak stackIn_23_1 = null;
        ak stackIn_23_2 = null;
        ak stackIn_24_0 = null;
        ak stackIn_24_1 = null;
        ak stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        ak stackOut_21_0 = null;
        ak stackOut_21_1 = null;
        ak stackOut_21_2 = null;
        ak stackOut_23_0 = null;
        ak stackOut_23_1 = null;
        ak stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        ak stackOut_22_0 = null;
        ak stackOut_22_1 = null;
        ak stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        ak stackOut_7_0 = null;
        ak stackOut_7_1 = null;
        ak stackOut_7_2 = null;
        ak stackOut_9_0 = null;
        ak stackOut_9_1 = null;
        ak stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        ak stackOut_8_0 = null;
        ak stackOut_8_1 = null;
        ak stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        L0: {
          if (((vp) this).field_nb >= ((vp) this).field_K * 2) {
            var5 = ((vp) this).field_K;
            var6 = -((vp) this).field_K + ((vp) this).field_nb;
            break L0;
          } else {
            var6 = ((vp) this).field_nb / 2;
            var5 = ((vp) this).field_nb / 2;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param3 > 0) {
          L1: {
            var8 = var8 * param0 / param3;
            if (((vp) this).field_K > var8) {
              var8 = ((vp) this).field_K;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var8 <= var7) {
              break L2;
            } else {
              var8 = var7;
              break L2;
            }
          }
          L3: {
            var9 = -param0 + param3;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 >= var9) {
              break L3;
            } else {
              var11 = (var9 / 2 + var10 * param2) / var9;
              break L3;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((vp) this).field_Kb;
          var14.field_K = ((vp) this).field_K;
          var14.field_S = 0;
          var14.field_D = 0;
          var14.field_nb = var5;
          var15 = ((vp) this).field_Mb;
          var15.field_D = 0;
          var15.field_S = var6;
          var15.field_K = ((vp) this).field_K;
          var15.field_nb = ((vp) this).field_nb - var6;
          var16 = ((vp) this).field_Rb;
          var16.field_K = ((vp) this).field_K;
          var16.field_nb = var7;
          var16.field_S = var5;
          var16.field_D = 0;
          var17 = ((vp) this).field_Eb;
          var17.field_nb = var12;
          var17.field_S = 0;
          var17.field_D = 0;
          var17.field_K = ((vp) this).field_K;
          var18 = ((vp) this).field_Jb;
          var18.field_S = var12;
          var18.field_D = 0;
          var18.field_K = ((vp) this).field_K;
          var18.field_nb = var7 + -var12;
          var19 = ((vp) this).field_Pb;
          var19.field_nb = var8;
          if (param1 != 108) {
            return;
          } else {
            L4: {
              var19.field_D = 0;
              stackOut_21_0 = ((vp) this).field_Kb;
              stackOut_21_1 = ((vp) this).field_Mb;
              stackOut_21_2 = ((vp) this).field_Rb;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              if (param3 <= param0) {
                stackOut_23_0 = (ak) (Object) stackIn_23_0;
                stackOut_23_1 = (ak) (Object) stackIn_23_1;
                stackOut_23_2 = (ak) (Object) stackIn_23_2;
                stackOut_23_3 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                break L4;
              } else {
                stackOut_22_0 = (ak) (Object) stackIn_22_0;
                stackOut_22_1 = (ak) (Object) stackIn_22_1;
                stackOut_22_2 = (ak) (Object) stackIn_22_2;
                stackOut_22_3 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                stackIn_24_3 = stackOut_22_3;
                break L4;
              }
            }
            stackIn_24_2.field_rb = stackIn_24_3 != 0;
            stackIn_24_1.field_rb = stackIn_24_3 != 0;
            stackIn_24_0.field_rb = stackIn_24_3 != 0;
            var19.field_K = ((vp) this).field_K;
            var19.field_S = var11;
            return;
          }
        } else {
          L5: {
            var9 = -param0 + param3;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 >= var9) {
              break L5;
            } else {
              var11 = (var9 / 2 + var10 * param2) / var9;
              break L5;
            }
          }
          var12 = var11 - -(var8 / 2);
          var14 = ((vp) this).field_Kb;
          var14.field_K = ((vp) this).field_K;
          var14.field_S = 0;
          var14.field_D = 0;
          var14.field_nb = var5;
          var15 = ((vp) this).field_Mb;
          var15.field_D = 0;
          var15.field_S = var6;
          var15.field_K = ((vp) this).field_K;
          var15.field_nb = ((vp) this).field_nb - var6;
          var16 = ((vp) this).field_Rb;
          var16.field_K = ((vp) this).field_K;
          var16.field_nb = var7;
          var16.field_S = var5;
          var16.field_D = 0;
          var17 = ((vp) this).field_Eb;
          var17.field_nb = var12;
          var17.field_S = 0;
          var17.field_D = 0;
          var17.field_K = ((vp) this).field_K;
          var18 = ((vp) this).field_Jb;
          var18.field_S = var12;
          var18.field_D = 0;
          var18.field_K = ((vp) this).field_K;
          var18.field_nb = var7 + -var12;
          var19 = ((vp) this).field_Pb;
          var19.field_nb = var8;
          if (param1 != 108) {
            return;
          } else {
            L6: {
              var19.field_D = 0;
              stackOut_7_0 = ((vp) this).field_Kb;
              stackOut_7_1 = ((vp) this).field_Mb;
              stackOut_7_2 = ((vp) this).field_Rb;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (param3 <= param0) {
                stackOut_9_0 = (ak) (Object) stackIn_9_0;
                stackOut_9_1 = (ak) (Object) stackIn_9_1;
                stackOut_9_2 = (ak) (Object) stackIn_9_2;
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L6;
              } else {
                stackOut_8_0 = (ak) (Object) stackIn_8_0;
                stackOut_8_1 = (ak) (Object) stackIn_8_1;
                stackOut_8_2 = (ak) (Object) stackIn_8_2;
                stackOut_8_3 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L6;
              }
            }
            stackIn_10_2.field_rb = stackIn_10_3 != 0;
            stackIn_10_1.field_rb = stackIn_10_3 != 0;
            stackIn_10_0.field_rb = stackIn_10_3 != 0;
            var19.field_K = ((vp) this).field_K;
            var19.field_S = var11;
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        df var4 = null;
        sm var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var4 = (df) (Object) he.field_b.c(param0 + 1504642273);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    field_Hb = null;
                    break L2;
                  }
                }
                var5 = (sm) (Object) in.field_J.c(param0 ^ 1504642273);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    he.a((byte) -53, param1, var5);
                    var5 = (sm) (Object) in.field_J.f(1504642273);
                    continue L3;
                  }
                }
              } else {
                Pixelate.a(param1, (byte) 109, var4);
                var4 = (df) (Object) he.field_b.f(1504642273);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "vp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean f(byte param0) {
        if (((vp) this).field_Eb.field_P == 0) {
          if (((vp) this).field_Eb.field_J != 0) {
            if (0 >= ((vp) this).field_Ob) {
              if (((vp) this).field_Ob != 0) {
                if (param0 <= 24) {
                  vp.c((byte) -65);
                  return false;
                } else {
                  return false;
                }
              } else {
                if (((vp) this).field_Pb.field_gb - -((vp) this).field_Pb.field_wb <= bg.field_k) {
                  if (param0 <= 24) {
                    vp.c((byte) -65);
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  ((vp) this).field_Ob = 3;
                  return true;
                }
              }
            } else {
              ((vp) this).field_Ob = ((vp) this).field_Ob - 1;
              if (((vp) this).field_Ob == 0) {
                if (((vp) this).field_Pb.field_gb - -((vp) this).field_Pb.field_wb > bg.field_k) {
                  ((vp) this).field_Ob = 3;
                  return true;
                } else {
                  if (param0 <= 24) {
                    vp.c((byte) -65);
                    return false;
                  } else {
                    return false;
                  }
                }
              } else {
                if (param0 <= 24) {
                  vp.c((byte) -65);
                  return false;
                } else {
                  return false;
                }
              }
            }
          } else {
            if (param0 <= 24) {
              vp.c((byte) -65);
              return false;
            } else {
              return false;
            }
          }
        } else {
          ((vp) this).field_Ob = 20;
          return true;
        }
    }

    vp(long param0, ak param1, ak param2, ak param3, ak param4) {
        super(param0, (ak) null);
        RuntimeException var7 = null;
        ak var9 = null;
        ak var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            ((vp) this).field_Kb = new ak(0L, param1);
            ((vp) this).field_Mb = new ak(0L, param2);
            ((vp) this).a(((vp) this).field_Kb, (byte) 26);
            ((vp) this).a(((vp) this).field_Mb, (byte) 26);
            ((vp) this).field_Rb = new ak(0L, (ak) null);
            ((vp) this).a(((vp) this).field_Rb, (byte) 26);
            ((vp) this).field_Eb = new ak(0L, param3);
            ((vp) this).field_Jb = new ak(0L, param3);
            var9 = ((vp) this).field_Eb;
            var10 = var9;
            ((vp) this).field_Jb.field_A = true;
            var10.field_A = true;
            ((vp) this).field_Rb.a(((vp) this).field_Eb, (byte) 26);
            ((vp) this).field_Rb.a(((vp) this).field_Jb, (byte) 26);
            ((vp) this).field_Pb = new ak(0L, param4);
            ((vp) this).field_Pb.field_vb = true;
            ((vp) this).field_Rb.a(((vp) this).field_Pb, (byte) 26);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("vp.<init>(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 != ((vp) this).field_Jb.field_P) {
          ((vp) this).field_Ob = 20;
          return true;
        } else {
          if (-1 != ((vp) this).field_Jb.field_J) {
            L0: {
              if (((vp) this).field_Ob > 0) {
                ((vp) this).field_Ob = ((vp) this).field_Ob - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((vp) this).field_Ob == 0) {
              if (bg.field_k < ((vp) this).field_Pb.field_Z + (((vp) this).field_Pb.field_gb - -((vp) this).field_Pb.field_wb + ((vp) this).field_Pb.field_nb)) {
                return false;
              } else {
                ((vp) this).field_Ob = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = new int[]{2, 20, 21, 27, 6, 5, 11, 13};
        field_Gb = new pf(1);
    }
}
