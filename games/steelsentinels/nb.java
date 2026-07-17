/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;
import java.lang.String;

final class nb {
    private mb field_u;
    private int field_r;
    private int[] field_O;
    private int field_s;
    private int[] field_D;
    private int field_F;
    private int field_Q;
    mb field_C;
    int field_l;
    static String field_T;
    private mb[] field_W;
    private int[] field_B;
    private int field_n;
    boolean field_J;
    private int field_U;
    private int field_v;
    boolean field_z;
    int field_i;
    private int[] field_e;
    int field_N;
    private int[] field_b;
    static long field_G;
    int field_p;
    private boolean field_k;
    private int field_q;
    static String field_m;
    private int[] field_H;
    static int field_L;
    int field_V;
    private boolean field_d;
    private int[] field_a;
    private int[] field_o;
    int field_E;
    private boolean field_A;
    int field_P;
    private boolean field_y;
    static boolean field_I;
    int field_w;
    private int field_Y;
    private boolean field_ab;
    private int field_S;
    private boolean field_f;
    private int[] field_g;
    private int[] field_M;
    ee field_X;
    int field_j;
    private int field_Z;
    static String field_x;
    private boolean field_h;
    private int field_t;
    private int[] field_c;
    private int[] field_K;

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = SteelSentinels.field_G;
        if (!((nb) this).field_X.field_j) {
            if (oh.field_f < 0) {
                if (0 > pi.field_c) {
                    return;
                }
            }
            var8 = 0;
            var9 = 0;
            for (var10 = param2; var10 < hf.field_c; var10++) {
                var11 = 160 + (320 * ((nb) this).field_D[var10] / param4 >> 4);
                var12 = ((nb) this).field_K[var10] / (param3 * 16) + 474;
                if (!(0 >= var10)) {
                    pb.a(var8, var9, var11, var12, 16777215, 128);
                }
                var8 = var11;
                var9 = var12;
            }
            return;
        }
    }

    private final void j() {
        int var2 = 0;
        mb[] var3 = null;
        int var4 = 0;
        jc var5 = null;
        mb var6_ref_mb = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mb var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          var2 = ((nb) this).field_X.field_Q + ((nb) this).field_X.field_kb;
          if (0 <= ((nb) this).field_X.field_A) {
            var2++;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((nb) this).field_B) {
              break L2;
            } else {
              if (var2 != ((nb) this).field_B.length) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          ((nb) this).field_B = new int[var2];
          break L1;
        }
        var3 = new mb[var2];
        var4 = 0;
        var5 = new jc(((nb) this).field_X.field_K);
        var6_ref_mb = (mb) (Object) var5.b(2);
        L3: while (true) {
          if (var6_ref_mb == null) {
            L4: {
              if (var2 > var4) {
                var2 = var4;
                break L4;
              } else {
                break L4;
              }
            }
            var6 = 0;
            L5: while (true) {
              if (var6 >= -1 + var2) {
                var7 = 0;
                var12 = 0;
                var6 = var12;
                L6: while (true) {
                  if (var2 <= var12) {
                    return;
                  } else {
                    L7: {
                      var10 = var3[var12].field_Bb;
                      if (((nb) this).field_X.field_A < 0) {
                        break L7;
                      } else {
                        if (((nb) this).field_X.field_A != var10) {
                          break L7;
                        } else {
                          var10 = var3.length - 1;
                          break L7;
                        }
                      }
                    }
                    if (var7 <= ((nb) this).field_B[var10]) {
                      if (((nb) this).field_B[var10] > var7) {
                        ((nb) this).field_B[var10] = ((nb) this).field_B[var10] - 1;
                        var7 += 9;
                        var12++;
                        continue L6;
                      } else {
                        var7 += 9;
                        var12++;
                        continue L6;
                      }
                    } else {
                      ((nb) this).field_B[var10] = ((nb) this).field_B[var10] + 1;
                      var7 += 9;
                      var12++;
                      continue L6;
                    }
                  }
                }
              } else {
                var7 = var6;
                var8 = var6;
                L8: while (true) {
                  if (var2 <= var8) {
                    if (var7 != var6) {
                      var9 = var3[var6];
                      var3[var6] = var3[var7];
                      var3[var7] = var9;
                      var6++;
                      continue L5;
                    } else {
                      var6++;
                      continue L5;
                    }
                  } else {
                    if (var3[var7].field_vb + -var3[var7].field_Ab < -var3[var8].field_Ab + var3[var8].field_vb) {
                      var7 = var8;
                      var8++;
                      continue L8;
                    } else {
                      var8++;
                      continue L8;
                    }
                  }
                }
              }
            }
          } else {
            L9: {
              L10: {
                if (0 > var6_ref_mb.field_Bb) {
                  break L10;
                } else {
                  if (((nb) this).field_X.field_kb + ((nb) this).field_X.field_Q > var6_ref_mb.field_Bb) {
                    int incrementValue$2 = var4;
                    var4++;
                    var3[incrementValue$2] = var6_ref_mb;
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              if (0 > ((nb) this).field_X.field_A) {
                break L9;
              } else {
                if (((nb) this).field_X.field_A == var6_ref_mb.field_Bb) {
                  int incrementValue$3 = var4;
                  var4++;
                  var3[incrementValue$3] = var6_ref_mb;
                  break L9;
                } else {
                  var6_ref_mb = (mb) (Object) var5.d(2);
                  continue L3;
                }
              }
            }
            var6_ref_mb = (mb) (Object) var5.d(2);
            continue L3;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        try {
            Object var8_ref3 = null;
            Object var5 = null;
            int[] var6 = null;
            Object var7 = null;
            int var7_int = 0;
            java.awt.Cursor var7_ref = null;
            IllegalAccessException var8 = null;
            InstantiationException var8_ref = null;
            java.lang.reflect.InvocationTargetException var8_ref2 = null;
            int var9 = 0;
            Object var11 = null;
            Object stackIn_5_0 = null;
            Throwable decompiledCaughtException = null;
            java.awt.Canvas stackOut_4_0 = null;
            nn stackOut_3_0 = null;
            var8_ref3 = null;
            L0: {
              var9 = SteelSentinels.field_G;
              if (((nb) this).field_q != param1) {
                L1: {
                  ((nb) this).field_q = param1;
                  if (null == wb.field_c) {
                    stackOut_4_0 = sl.field_n;
                    stackIn_5_0 = (Object) (Object) stackOut_4_0;
                    break L1;
                  } else {
                    stackOut_3_0 = wb.field_c;
                    stackIn_5_0 = (Object) (Object) stackOut_3_0;
                    break L1;
                  }
                }
                var5 = stackIn_5_0;
                if (!hd.c(-104)) {
                  return;
                } else {
                  var6 = new int[vg.field_h[((nb) this).field_q].field_E.length];
                  var7_int = 0;
                  L2: while (true) {
                    if (var7_int >= var6.length) {
                      var7 = null;
                      try {
                        L3: {
                          var11 = hl.field_u.newInstance(new Object[3]);
                          var8_ref3 = var11;
                          Object discarded$1 = nh.field_u.invoke(var8_ref3, new Object[7]);
                          var7_ref = (java.awt.Cursor) jd.field_rb.invoke((Object) (Object) ((java.awt.Canvas) var5).getToolkit(), new Object[3]);
                          break L3;
                        }
                      } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var8 = (IllegalAccessException) (Object) decompiledCaughtException;
                          jd.field_rb = null;
                          break L4;
                        }
                      } catch (java.lang.InstantiationException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        var8_ref = (InstantiationException) (Object) decompiledCaughtException;
                        throw new RuntimeException();
                      } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        var8_ref2 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                        throw new RuntimeException();
                      }
                      ((java.awt.Canvas) var5).setCursor(var7_ref);
                      break L0;
                    } else {
                      if (vg.field_h[((nb) this).field_q].field_E[var7_int] == 0) {
                        var6[var7_int] = 0;
                        var7_int++;
                        continue L2;
                      } else {
                        var6[var7_int] = vn.a(vg.field_h[((nb) this).field_q].field_E[var7_int], -16777216);
                        var7_int++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(byte param0) {
        mb var2 = null;
        int var3 = 0;
        int var4 = 0;
        mb var5_ref_mb = null;
        mb[] var5_ref_mb__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mb var7_ref_mb = null;
        int var8 = 0;
        mb var9 = null;
        mb stackIn_8_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        Object stackOut_7_0 = null;
        mb stackOut_6_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        L0: {
          var8 = SteelSentinels.field_G;
          if (((nb) this).field_X.field_P == 1) {
            ((nb) this).field_O = new int[2];
            break L0;
          } else {
            if (((nb) this).field_X.field_P == 2) {
              ((nb) this).field_O = new int[3];
              break L0;
            } else {
              ((nb) this).field_O = null;
              break L0;
            }
          }
        }
        L1: {
          if (((nb) this).field_X.field_A < 0) {
            stackOut_7_0 = null;
            stackIn_8_0 = (mb) (Object) stackOut_7_0;
            break L1;
          } else {
            stackOut_6_0 = ((nb) this).field_X.field_y;
            stackIn_8_0 = stackOut_6_0;
            break L1;
          }
        }
        L2: {
          var9 = stackIn_8_0;
          var2 = var9;
          var3 = ((nb) this).field_X.field_kb - -((nb) this).field_X.field_Q;
          if (var2 == null) {
            break L2;
          } else {
            var3++;
            break L2;
          }
        }
        ((nb) this).field_W = new mb[var3];
        var4 = 0;
        var5_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
        L3: while (true) {
          if (var5_ref_mb == null) {
            L4: {
              if (var2 != null) {
                var9 = var2;
                int incrementValue$2 = var4;
                var4++;
                ((nb) this).field_W[incrementValue$2] = var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var3 > var4) {
                var5_ref_mb__ = ((nb) this).field_W;
                ((nb) this).field_W = new mb[var4];
                ii.a((Object[]) (Object) var5_ref_mb__, 0, (Object[]) (Object) ((nb) this).field_W, 0, var4);
                var3 = var4;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (((nb) this).field_O != null) {
                var5 = 0;
                L7: while (true) {
                  if (-1 + var3 <= var5) {
                    break L6;
                  } else {
                    var6 = var5;
                    var7 = 1 + var5;
                    L8: while (true) {
                      if (var7 >= var3) {
                        if (var5 != var6) {
                          var7_ref_mb = ((nb) this).field_W[var6];
                          ((nb) this).field_W[var6] = ((nb) this).field_W[var5];
                          ((nb) this).field_W[var5] = var7_ref_mb;
                          var5++;
                          continue L7;
                        } else {
                          var5++;
                          continue L7;
                        }
                      } else {
                        if (((nb) this).field_W[var7].field_jc < ((nb) this).field_W[var6].field_jc) {
                          var6 = var7;
                          var7++;
                          continue L8;
                        } else {
                          var7++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                break L6;
              }
            }
            L9: {
              ((nb) this).field_c = new int[32];
              ((nb) this).field_a = new int[32];
              if (param0 < -9) {
                break L9;
              } else {
                ((nb) this).c(50);
                break L9;
              }
            }
            L10: {
              ((nb) this).field_e = new int[var3];
              ((nb) this).field_H = new int[32];
              if (di.field_g == -1) {
                stackOut_39_0 = 0;
                stackIn_40_0 = stackOut_39_0;
                break L10;
              } else {
                stackOut_38_0 = 1;
                stackIn_40_0 = stackOut_38_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_40_0;
              if (var5 != 0) {
                stackOut_42_0 = 0;
                stackIn_43_0 = stackOut_42_0;
                break L11;
              } else {
                stackOut_41_0 = 1;
                stackIn_43_0 = stackOut_41_0;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_43_0;
              if (!((nb) this).field_X.field_lb) {
                break L12;
              } else {
                if (((nb) this).field_X.field_cb >= 43) {
                  break L12;
                } else {
                  var6 = 0;
                  break L12;
                }
              }
            }
            L13: {
              if (var6 == 0) {
                var7 = 0;
                L14: while (true) {
                  if (((nb) this).field_W.length <= var7) {
                    break L13;
                  } else {
                    ((nb) this).field_H[var7] = ((nb) this).field_W[var7].field_vb;
                    var7++;
                    continue L14;
                  }
                }
              } else {
                ((nb) this).field_X.a(((nb) this).field_W, ((nb) this).field_O, ((nb) this).field_H, -112, ((nb) this).field_e, ((nb) this).field_c);
                break L13;
              }
            }
            L15: {
              L16: {
                if (var6 == 0) {
                  break L16;
                } else {
                  if (null == ((nb) this).field_C) {
                    break L16;
                  } else {
                    if (ed.field_j < 0) {
                      break L16;
                    } else {
                      var7 = 0;
                      L17: while (true) {
                        if (var7 >= 32) {
                          if (null == ((nb) this).field_O) {
                            break L15;
                          } else {
                            ((nb) this).field_a[25] = ((nb) this).field_O[((nb) this).field_C.field_jc];
                            break L15;
                          }
                        } else {
                          ((nb) this).field_a[var7] = ((nb) this).field_C.b(true, var7);
                          var7++;
                          continue L17;
                        }
                      }
                    }
                  }
                }
              }
              var7 = 0;
              L18: while (true) {
                if (var7 >= 32) {
                  break L15;
                } else {
                  ((nb) this).field_a[var7] = 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L19: {
              if (var5 == 0) {
                break L19;
              } else {
                ((nb) this).field_c[0] = ((nb) this).field_X.field_r / 50;
                break L19;
              }
            }
            L20: {
              if (var5 == 0) {
                break L20;
              } else {
                if (0 > nc.field_a) {
                  break L20;
                } else {
                  ((nb) this).field_c[0] = nc.field_a;
                  break L20;
                }
              }
            }
            return;
          } else {
            L21: {
              if (0 > var5_ref_mb.field_Bb) {
                break L21;
              } else {
                if (var5_ref_mb.field_Bb < ((nb) this).field_X.field_Q + ((nb) this).field_X.field_kb) {
                  int incrementValue$3 = var4;
                  var4++;
                  ((nb) this).field_W[incrementValue$3] = var5_ref_mb;
                  break L21;
                } else {
                  break L21;
                }
              }
            }
            var5_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -41);
            continue L3;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, mb param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17_int = 0;
        Object var17 = null;
        wk var17_ref = null;
        String var18 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        try {
          L0: {
            if (param7 == null) {
              return;
            } else {
              L1: {
                var10_int = param0;
                pb.c(param8, param5, var10_int, param0, 0, 160);
                var11 = -var10_int + (param3 + -4);
                var12 = 4 + var10_int + param8;
                var13 = param5;
                var14 = hj.field_w;
                var15 = 0;
                var16 = null;
                var17_int = ul.a((byte) 105, param7.field_Zb.field_N);
                if (var17_int < 0) {
                  break L1;
                } else {
                  if (var17_int >= cd.field_c.length) {
                    break L1;
                  } else {
                    var16 = (Object) (Object) cd.field_c[var17_int];
                    if (n.field_z[var17_int] == 84) {
                      var15 += 10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                pb.a(param8, param5, var10_int + param8, param5 + param0);
                if (param4) {
                  oa.field_N.a(param8 - -((-oa.field_N.field_z + var10_int) / 2), param5 + (-oa.field_N.field_B + param0) / 2);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                hj.field_w = var10_int * 6400 / param6;
                var17 = null;
                if (!param4) {
                  param7.field_Zb.a(0, true, var10_int / 2 + param8, param0 + param5 - (6 - var15), (byte) 49, 0);
                  fl.a(var10_int, param7, (byte) -125, param0, param8, param5);
                  break L3;
                } else {
                  var17_ref = new wk(var10_int, param0);
                  var17_ref.d();
                  param7.field_Zb.a(0, true, var10_int / 2, var15 + -6 + param0, (byte) 49, 0);
                  bg.a(var17_ref, param7, 14590);
                  sb.field_bb.b((byte) 121);
                  var17_ref.a(param8, param5);
                  break L3;
                }
              }
              pb.c();
              hj.field_w = var14;
              pb.c(var12, var13, var11, 21, 0, 160);
              var13 += 16;
              var18 = ((nb) this).field_X.d(-1661904765, param7.field_Bb);
              L4: {
                if (param2 == qd.field_t[0]) {
                  param2 = uj.a(param2, 96);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var18 != null) {
                  pl.field_U.b(var18.toUpperCase(), var12 - -4, var13, param2, -1);
                  var12 += 150;
                  break L5;
                } else {
                  var12 += 4;
                  break L5;
                }
              }
              L6: {
                if (var18 != null) {
                  break L6;
                } else {
                  if (var16 == null) {
                    break L6;
                  } else {
                    pl.field_U.b(((String) var16).toUpperCase(), var12, var13, param2, -1);
                    break L6;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var10 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var10;
            stackOut_26_1 = new StringBuilder().append("nb.PA(").append(param0).append(44).append(0).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param7 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param8 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        bh var5_ref_bh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        double var18_double = 0.0;
        int var18 = 0;
        int var19 = 0;
        double var19_double = 0.0;
        int var20_int = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        int[] var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_148_0 = 0;
        mb stackIn_149_0 = null;
        mb stackIn_150_0 = null;
        mb stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        mb stackOut_148_0 = null;
        mb stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        mb stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        L0: {
          var29 = SteelSentinels.field_G;
          var3 = 0;
          if (qg.field_n == null) {
            km.field_c = ((nb) this).field_C.field_hc;
            dl.field_G = ((nb) this).field_C.field_Gb;
            var5_ref_bh = new bh(((nb) this).field_C);
            var6 = -((nb) this).field_P >> 4;
            var7 = 400 + -(((nb) this).field_E >> 4);
            var5_ref_bh.field_k = 16;
            var5_ref_bh.a((byte) -110, 35, var6, 2, true, var7);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -1) {
          L1: {
            L2: {
              var4 = 0;
              var5 = (km.field_c >> 8) + -(((nb) this).field_P >> 4);
              var6 = 400 + (-(((nb) this).field_E >> 4) + (-(((nb) this).field_C.field_Db * 8) + dl.field_G >> 8));
              if (Math.abs(320 + -var5) > 320) {
                break L2;
              } else {
                if (190 >= Math.abs(-var6 + 190)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L1;
          }
          L3: {
            var4 = stackIn_10_0;
            var5 = Math.max(48, Math.min(592, var5));
            var6 = Math.max(48, Math.min(332, var6));
            var3 = var4;
            if (Math.abs(((nb) this).field_C.field_F) <= 100) {
              break L3;
            } else {
              if (null != qg.field_n) {
                break L3;
              } else {
                var3 = 1;
                break L3;
              }
            }
          }
          L4: {
            L5: {
              nc.field_b = false;
              if (((nb) this).field_C == null) {
                break L5;
              } else {
                if (((nb) this).field_C.field_ub >= 0) {
                  break L5;
                } else {
                  if (((nb) this).field_F < 0) {
                    break L5;
                  } else {
                    if (~((nb) this).field_F <= ~((nb) this).field_C.field_Xb.length) {
                      break L5;
                    } else {
                      if (!c.a((byte) -122, ((nb) this).field_C.field_Xb[((nb) this).field_F])) {
                        break L5;
                      } else {
                        stackOut_18_0 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        break L4;
                      }
                    }
                  }
                }
              }
            }
            stackOut_19_0 = 0;
            stackIn_20_0 = stackOut_19_0;
            break L4;
          }
          L6: {
            var7 = stackIn_20_0;
            if (((nb) this).field_C != null) {
              break L6;
            } else {
              if (1 <= ((nb) this).field_C.field_Tb) {
                break L6;
              } else {
                if (((nb) this).field_F < 0) {
                  break L6;
                } else {
                  if (~((nb) this).field_F <= ~((nb) this).field_C.field_Xb.length) {
                    break L6;
                  } else {
                    if (((nb) this).field_C.field_Xb[((nb) this).field_F] != 8) {
                      break L6;
                    } else {
                      var7 = 1;
                      break L6;
                    }
                  }
                }
              }
            }
          }
          L7: {
            if (null == ((nb) this).field_C) {
              break L7;
            } else {
              L8: {
                if (!param0) {
                  break L8;
                } else {
                  if (((nb) this).field_C.field_Hb) {
                    break L8;
                  } else {
                    L9: {
                      if (!((nb) this).field_C.field_pc) {
                        break L9;
                      } else {
                        if (((nb) this).field_C.field_Qb >= 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var8 = -1 + ml.field_f.length;
                    L10: while (true) {
                      if (var8 < 0) {
                        L11: {
                          if (~((nb) this).field_C.field_Xb.length >= ~((nb) this).field_F) {
                            ((nb) this).field_F = 0;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        L12: {
                          if (((nb) this).field_C.field_Xb.length <= 0) {
                            ((nb) this).field_C.field_Zb.a(0, -1, ml.field_f);
                            break L12;
                          } else {
                            ((nb) this).field_C.field_Zb.a(((nb) this).field_C.field_Xb[((nb) this).field_F], param1, ml.field_f);
                            break L12;
                          }
                        }
                        L13: {
                          L14: {
                            var8 = 48;
                            if (((nb) this).field_C.field_Xb.length <= 0) {
                              break L14;
                            } else {
                              if (var3 == 0) {
                                break L14;
                              } else {
                                if (~((-var6 + pi.field_c) * (pi.field_c - var6) + (oh.field_f + -var5) * (oh.field_f + -var5)) <= ~(var8 * var8)) {
                                  break L14;
                                } else {
                                  stackOut_44_0 = 1;
                                  stackIn_46_0 = stackOut_44_0;
                                  break L13;
                                }
                              }
                            }
                          }
                          stackOut_45_0 = 0;
                          stackIn_46_0 = stackOut_45_0;
                          break L13;
                        }
                        L15: {
                          var9 = stackIn_46_0;
                          if (var9 == 0) {
                            stackOut_48_0 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            break L15;
                          } else {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            break L15;
                          }
                        }
                        L16: {
                          nc.field_b = stackIn_49_0 != 0;
                          if (var9 == 0) {
                            break L16;
                          } else {
                            pb.b(var5, var6, var8, 8421631, 50);
                            break L16;
                          }
                        }
                        L17: {
                          if (var4 != 0) {
                            pb.b(var5, var6, var8 + -1, 0, 200);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        var10 = 1;
                        L18: while (true) {
                          if (var10 > 255) {
                            L19: {
                              ((nb) this).field_Q = 0;
                              ((nb) this).field_Z = 0;
                              var10 = 0;
                              if (var9 != 0) {
                                stackOut_59_0 = 198156;
                                stackIn_60_0 = stackOut_59_0;
                                break L19;
                              } else {
                                stackOut_58_0 = 329737;
                                stackIn_60_0 = stackOut_58_0;
                                break L19;
                              }
                            }
                            var11 = stackIn_60_0;
                            var11 = ((nb) this).field_M[0] >> 5 & 493447;
                            var12 = 0;
                            var13_int = 1;
                            L20: while (true) {
                              if (128 <= var13_int) {
                                L21: {
                                  fm.field_j.field_o[0] = 0;
                                  var13 = new int[4];
                                  pb.b(var13);
                                  var14 = ((nb) this).d(true, km.field_c + l.field_g);
                                  var15 = this.b(1, cf.field_q - -dl.field_G);
                                  if (nc.field_b) {
                                    break L21;
                                  } else {
                                    if (var7 != 0) {
                                      break L21;
                                    } else {
                                      if (0 > oh.field_f) {
                                        break L21;
                                      } else {
                                        if (((nb) this).field_n != -1) {
                                          break L21;
                                        } else {
                                          L22: {
                                            if (var14 >= oh.field_f) {
                                              stackOut_100_0 = 0;
                                              stackIn_101_0 = stackOut_100_0;
                                              break L22;
                                            } else {
                                              stackOut_99_0 = 1;
                                              stackIn_101_0 = stackOut_99_0;
                                              break L22;
                                            }
                                          }
                                          L23: {
                                            var16 = stackIn_101_0;
                                            if (qg.field_n != null) {
                                              L24: {
                                                if (0 >= qg.field_n.field_B) {
                                                  stackOut_105_0 = 0;
                                                  stackIn_106_0 = stackOut_105_0;
                                                  break L24;
                                                } else {
                                                  stackOut_104_0 = 1;
                                                  stackIn_106_0 = stackOut_104_0;
                                                  break L24;
                                                }
                                              }
                                              var16 = stackIn_106_0;
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                          L25: {
                                            if (var16 != 0) {
                                              pb.h(var14 - -1, 0, 640, 480);
                                              break L25;
                                            } else {
                                              pb.h(0, 0, var14, 480);
                                              break L25;
                                            }
                                          }
                                          fm.field_j.c(-48 + var14, var15 + -48);
                                          break L21;
                                        }
                                      }
                                    }
                                  }
                                }
                                L26: {
                                  pb.a(var13);
                                  if (nc.field_b) {
                                    break L26;
                                  } else {
                                    if (oh.field_f < 0) {
                                      break L26;
                                    } else {
                                      if (((nb) this).field_n != -1) {
                                        break L26;
                                      } else {
                                        var16 = -var14 + oh.field_f;
                                        var17 = -var15 + pi.field_c;
                                        var18_double = Math.sqrt((double)(var17 * var17 + var16 * var16));
                                        if (var18_double == 0.0) {
                                          break L26;
                                        } else {
                                          var20_int = (int)((double)(var16 * 53) / var18_double) + var14;
                                          var21 = (int)((double)(var17 * 53) / var18_double) + var15;
                                          var22 = var14 - -(int)((double)(var16 * 48) / var18_double);
                                          var23 = var15 - -(int)((double)(var17 * 48) / var18_double);
                                          var24 = var22 + (-var23 - -var21);
                                          var25_int = var23 + (var22 - var20_int);
                                          var26 = var23 + (-var21 + var22);
                                          var27 = var23 - (-var20_int + var22);
                                          dl.a(var25_int, var20_int, var24, true, ((nb) this).field_M[0], var21, var27, var26);
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                }
                                L27: {
                                  if (var4 == 0) {
                                    break L27;
                                  } else {
                                    if (oh.field_f < 0) {
                                      break L27;
                                    } else {
                                      if (-1 != ((nb) this).field_n) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var16 = var14;
                                          var14 = var5 - -(l.field_g >> 8);
                                          var15 = (((nb) this).field_C.field_Db >>> 5) + (var6 + (cf.field_q >> 8));
                                          if (!nc.field_b) {
                                            break L28;
                                          } else {
                                            var16 = var14;
                                            break L28;
                                          }
                                        }
                                        L29: {
                                          if (var16 >= oh.field_f) {
                                            stackOut_123_0 = 0;
                                            stackIn_124_0 = stackOut_123_0;
                                            break L29;
                                          } else {
                                            stackOut_122_0 = 1;
                                            stackIn_124_0 = stackOut_122_0;
                                            break L29;
                                          }
                                        }
                                        L30: {
                                          var17 = stackIn_124_0;
                                          if (qg.field_n == null) {
                                            break L30;
                                          } else {
                                            L31: {
                                              if (qg.field_n.field_B <= 0) {
                                                stackOut_127_0 = 0;
                                                stackIn_128_0 = stackOut_127_0;
                                                break L31;
                                              } else {
                                                stackOut_126_0 = 1;
                                                stackIn_128_0 = stackOut_126_0;
                                                break L31;
                                              }
                                            }
                                            var17 = stackIn_128_0;
                                            break L30;
                                          }
                                        }
                                        L32: {
                                          if (var17 == 0) {
                                            pb.h(0, 0, var14, 480);
                                            break L32;
                                          } else {
                                            pb.h(var14 + 1, 0, 640, 480);
                                            break L32;
                                          }
                                        }
                                        L33: {
                                          if (var7 == 0) {
                                            fm.field_j.c(-48 + var14, var15 - 48);
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        }
                                        pb.a(var13);
                                        if (!nc.field_b) {
                                          break L27;
                                        } else {
                                          if (var7 != 0) {
                                            break L27;
                                          } else {
                                            var17 = oh.field_f + -var14;
                                            var18 = pi.field_c + -var15;
                                            var19_double = Math.sqrt((double)(var18 * var18 + var17 * var17));
                                            if (0.0 != var19_double) {
                                              var21 = var14 + (int)((double)(55 * var17) / var19_double);
                                              var22 = (int)((double)(var18 * 55) / var19_double) + var15;
                                              var23 = var14 - -(int)((double)(50 * var17) / var19_double);
                                              var24 = var15 + (int)((double)(var18 * 50) / var19_double);
                                              var25_int = var23 - (-var22 + var24);
                                              var26 = var24 + -var21 + var23;
                                              var27 = var23 + -var22 + var24;
                                              var28 = var21 - var23 + var24;
                                              dl.a(var26, var21, var25_int, true, ((nb) this).field_M[0], var22, var28, var27);
                                              break L27;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L34: {
                                  if (var3 != 0) {
                                    pb.a(var5 << 4, var6 << 4, var8 << 4, 99, ((nb) this).field_b);
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                L35: {
                                  if (var4 != 0) {
                                    L36: {
                                      rl.field_b.d();
                                      pb.b();
                                      var16 = ((nb) this).field_C.field_S;
                                      if (!((nb) this).field_C.field_Cb) {
                                        stackOut_147_0 = 0;
                                        stackIn_148_0 = stackOut_147_0;
                                        break L36;
                                      } else {
                                        stackOut_146_0 = 1;
                                        stackIn_148_0 = stackOut_146_0;
                                        break L36;
                                      }
                                    }
                                    L37: {
                                      var17 = stackIn_148_0;
                                      ((nb) this).field_C.field_S = 0;
                                      ((nb) this).field_C.field_Cb = false;
                                      ((nb) this).field_C.b(40, 256, 80, -68);
                                      stackOut_148_0 = ((nb) this).field_C;
                                      stackIn_150_0 = stackOut_148_0;
                                      stackIn_149_0 = stackOut_148_0;
                                      if (var17 == 0) {
                                        stackOut_150_0 = (mb) (Object) stackIn_150_0;
                                        stackOut_150_1 = 0;
                                        stackIn_151_0 = stackOut_150_0;
                                        stackIn_151_1 = stackOut_150_1;
                                        break L37;
                                      } else {
                                        stackOut_149_0 = (mb) (Object) stackIn_149_0;
                                        stackOut_149_1 = 1;
                                        stackIn_151_0 = stackOut_149_0;
                                        stackIn_151_1 = stackOut_149_1;
                                        break L37;
                                      }
                                    }
                                    stackIn_151_0.field_Cb = stackIn_151_1 != 0;
                                    ((nb) this).field_C.field_S = var16;
                                    var10 = 0;
                                    rl.field_b.e(0, 0, 1);
                                    var18 = ((nb) this).field_C.d((byte) -128);
                                    var19 = 0;
                                    L38: while (true) {
                                      if (var19 >= rl.field_b.field_A) {
                                        sb.field_bb.b((byte) 125);
                                        pb.a(var5 - 48, var6 - 48, 48 + var5, 48 + var6);
                                        var19 = -80 + (((nb) this).field_C.field_Db >>> 5);
                                        rl.field_b.e(-40 + var5, var19 + var6, 128, 128);
                                        var20_int = ((nb) this).d(true, ((nb) this).field_C.field_hc);
                                        var21 = this.b(param1 ^ -2, ((nb) this).field_C.field_Gb);
                                        var22 = -40 + var20_int;
                                        L39: while (true) {
                                          if (var22 >= var20_int - -40) {
                                            this.a(var20_int, var19 + (var6 - -80), (byte) -63, var5, var21, var6);
                                            var22 = 0;
                                            L40: while (true) {
                                              if (~var22 <= ~hd.field_a) {
                                                pb.c();
                                                break L35;
                                              } else {
                                                L41: {
                                                  var23 = -var20_int + f.field_w[var22] + var5;
                                                  var24 = 80 + (var6 + (nj.field_U[var22] + var19)) - var21;
                                                  var25 = pe.field_o;
                                                  var26 = var5 + -var23;
                                                  var27 = -var24 + var6;
                                                  if (2304 > var26 * var26 - -(var27 * var27)) {
                                                    pb.a(var23 << 4, var24 << 4, 20, -1 + var25.length, var25);
                                                    break L41;
                                                  } else {
                                                    break L41;
                                                  }
                                                }
                                                var22++;
                                                continue L40;
                                              }
                                            }
                                          } else {
                                            L42: {
                                              var23 = this.a(1024, var22) >>> 4;
                                              var24 = -((nb) this).field_X.field_ab.a((byte) -116, var23);
                                              var25_int = this.b(1, var24 << 4);
                                              var25_int = var25_int + (var6 + var19 - (-80 - -var21));
                                              var26 = -var20_int + var22;
                                              var27 = -var6 + var25_int;
                                              if (var27 * var27 + var26 * var26 >= 1600) {
                                                break L42;
                                              } else {
                                                pb.a(-var20_int + (var5 + var22), var25_int, 20560);
                                                break L42;
                                              }
                                            }
                                            L43: {
                                              var24 = -((nb) this).field_X.field_ab.a(false, var23);
                                              var28 = this.b(1, var24 << 4);
                                              var28 = var28 + (-var21 + (var19 + var6) - -80);
                                              if (~var25_int == ~var28) {
                                                break L43;
                                              } else {
                                                var27 = var28 - var6;
                                                var26 = -var20_int + var22;
                                                if (var27 * var27 + var26 * var26 < 2304) {
                                                  pb.a(-var20_int + (var22 + var5), var28, 20560);
                                                  break L43;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                            }
                                            var22++;
                                            continue L39;
                                          }
                                        }
                                      } else {
                                        var20_int = 0;
                                        L44: while (true) {
                                          if (~rl.field_b.field_F >= ~var20_int) {
                                            var19++;
                                            continue L38;
                                          } else {
                                            L45: {
                                              if (1 == rl.field_b.field_E[var10]) {
                                                L46: {
                                                  if (0 >= var19) {
                                                    break L46;
                                                  } else {
                                                    if (0 == rl.field_b.field_E[var10 + -1]) {
                                                      rl.field_b.field_E[-1 + var10] = var18;
                                                      break L46;
                                                    } else {
                                                      break L46;
                                                    }
                                                  }
                                                }
                                                L47: {
                                                  if (0 >= var19) {
                                                    break L47;
                                                  } else {
                                                    if (rl.field_b.field_E[var10 + -rl.field_b.field_A] == 0) {
                                                      rl.field_b.field_E[var10 + -rl.field_b.field_A] = var18;
                                                      break L47;
                                                    } else {
                                                      break L47;
                                                    }
                                                  }
                                                }
                                                L48: {
                                                  if (var19 <= 0) {
                                                    break L48;
                                                  } else {
                                                    if (rl.field_b.field_E[1 + var10] != 0) {
                                                      break L48;
                                                    } else {
                                                      rl.field_b.field_E[var10 + 1] = var18;
                                                      break L48;
                                                    }
                                                  }
                                                }
                                                if (0 >= var19) {
                                                  break L45;
                                                } else {
                                                  if (rl.field_b.field_E[var10 - -rl.field_b.field_A] != 0) {
                                                    break L45;
                                                  } else {
                                                    rl.field_b.field_E[var10 - -rl.field_b.field_A] = var18;
                                                    break L45;
                                                  }
                                                }
                                              } else {
                                                break L45;
                                              }
                                            }
                                            var10++;
                                            var20_int++;
                                            continue L44;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L35;
                                  }
                                }
                                if (0 >= rc.field_l) {
                                  break L8;
                                } else {
                                  if (((nb) this).field_C.field_Xb.length <= 0) {
                                    break L8;
                                  } else {
                                    L49: {
                                      if (3 != di.field_g) {
                                        break L49;
                                      } else {
                                        if (qh.field_Yb >= 5) {
                                          break L49;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var16 = var5;
                                    var17 = -26 + var6;
                                    var18 = 100 - rc.field_l;
                                    pb.a(0, -50 + var17, 640, var17);
                                    var17 = var17 + (-(10 * var18 / 20) + 5);
                                    var19 = -(256 * var18 / 100) + 256;
                                    var20 = li.field_B[((nb) this).field_C.field_Xb[((nb) this).field_F]];
                                    fk.field_d.c(var20, var16, var17, 16777215, 0, var19);
                                    pb.c();
                                    break L8;
                                  }
                                }
                              } else {
                                L50: {
                                  L51: {
                                    if (0 >= ml.field_f[var13_int]) {
                                      break L51;
                                    } else {
                                      if (127 > var13_int) {
                                        L52: {
                                          if (var12 != 0) {
                                            break L52;
                                          } else {
                                            L53: {
                                              L54: {
                                                if (((nb) this).field_Q == 0) {
                                                  break L54;
                                                } else {
                                                  if (var13_int >= ((nb) this).field_Q) {
                                                    break L53;
                                                  } else {
                                                    break L54;
                                                  }
                                                }
                                              }
                                              ((nb) this).field_Q = var13_int;
                                              break L53;
                                            }
                                            var12 = 20;
                                            break L52;
                                          }
                                        }
                                        L55: {
                                          var12--;
                                          if (var12 == 0) {
                                            var12 = 1;
                                            break L55;
                                          } else {
                                            break L55;
                                          }
                                        }
                                        var14 = var13_int;
                                        var14 = -var14 + 128;
                                        if (0 >= var14) {
                                          break L50;
                                        } else {
                                          if (255 <= var14) {
                                            break L50;
                                          } else {
                                            fm.field_j.field_o[var14 / 2] = var11 * 20;
                                            if (var12 > 16) {
                                              fm.field_j.field_o[var14 / 2 + 127] = var11 * 20;
                                              break L50;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                  if (1 != var12) {
                                    break L50;
                                  } else {
                                    var14 = 0;
                                    L56: while (true) {
                                      if (20 <= var14) {
                                        L57: {
                                          var12 = 0;
                                          if (((nb) this).field_Z == 0) {
                                            break L57;
                                          } else {
                                            if (~((nb) this).field_Z <= ~var13_int) {
                                              break L50;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                        ((nb) this).field_Z = var13_int;
                                        break L50;
                                      } else {
                                        L58: {
                                          var15 = var13_int + -var14;
                                          var15 = 128 + -var15;
                                          if (var15 <= 0) {
                                            break L58;
                                          } else {
                                            if (255 > var15) {
                                              fm.field_j.field_o[var15 / 2] = var11 * 20;
                                              if (var14 < 3) {
                                                fm.field_j.field_o[127 + var15 / 2] = 20 * var11;
                                                break L58;
                                              } else {
                                                break L58;
                                              }
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                        var14++;
                                        continue L56;
                                      }
                                    }
                                  }
                                }
                                var13_int++;
                                continue L20;
                              }
                            }
                          } else {
                            fm.field_j.field_o[var10] = 0;
                            var10++;
                            continue L18;
                          }
                        }
                      } else {
                        ml.field_f[var8] = 0;
                        var8--;
                        continue L10;
                      }
                    }
                  }
                }
              }
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        String var2 = null;
        if (param0 < 104) {
            return;
        }
        if (im.field_g != null) {
            var2 = im.field_g;
            String var1 = var2;
            vf.a(320, db.a(jj.field_b, -94, new String[1]));
            im.field_g = null;
        }
    }

    private final void e() {
        wl var2 = null;
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
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        L0: {
          L1: {
            var21 = SteelSentinels.field_G;
            hf.field_c = 0;
            if (((nb) this).field_C == null) {
              break L1;
            } else {
              if (((nb) this).field_F < 0) {
                break L1;
              } else {
                if (((nb) this).field_F >= ((nb) this).field_C.field_Xb.length) {
                  break L1;
                } else {
                  if (!c.a((byte) -118, ((nb) this).field_C.field_Xb[((nb) this).field_F])) {
                    break L1;
                  } else {
                    if (((nb) this).field_C.field_ub < 0) {
                      break L0;
                    } else {
                      L2: {
                        if (0 != ((nb) this).field_C.field_Tb) {
                          break L2;
                        } else {
                          if (0 == ((nb) this).field_C.field_ub) {
                            return;
                          } else {
                            break L2;
                          }
                        }
                      }
                      if (((nb) this).field_C.field_Xb[((nb) this).field_F] != 8) {
                        break L1;
                      } else {
                        if (((nb) this).field_C.field_Tb < 1) {
                          return;
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
          if (((nb) this).field_X.field_j) {
            break L0;
          } else {
            L3: {
              if (oh.field_f >= 0) {
                break L3;
              } else {
                if (0 <= pi.field_c) {
                  break L3;
                } else {
                  return;
                }
              }
            }
            L4: {
              if (di.field_g != 0) {
                break L4;
              } else {
                if (qh.field_Yb < 8) {
                  return;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (di.field_g != 3) {
                break L5;
              } else {
                if (qh.field_Yb >= 5) {
                  break L5;
                } else {
                  return;
                }
              }
            }
            L6: {
              L7: {
                var2 = (wl) (Object) pm.field_db.e(13058);
                var2.field_I = true;
                var3 = ((nb) this).d(true, var2.field_U);
                var4 = this.b(1, var2.field_A);
                var5 = var2.field_U;
                var6 = var2.field_A;
                ((nb) this).field_D[0] = var5;
                ((nb) this).field_K[0] = var6;
                if (var2.field_C == 0) {
                  break L7;
                } else {
                  if (var2.field_C != 7) {
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              break L6;
            }
            L8: {
              L9: {
                var7 = stackIn_28_0;
                if (null == ((nb) this).field_C) {
                  break L9;
                } else {
                  if (((nb) this).field_C.i(21, -27)) {
                    break L9;
                  } else {
                    if (var7 != 0) {
                      break L9;
                    } else {
                      stackOut_31_0 = 1;
                      stackIn_33_0 = stackOut_31_0;
                      break L8;
                    }
                  }
                }
              }
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L8;
            }
            L10: {
              L11: {
                var8 = stackIn_33_0;
                if (var2.field_y == 14) {
                  break L11;
                } else {
                  if (var2.field_y != 28) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              stackOut_36_0 = 1;
              stackIn_38_0 = stackOut_36_0;
              break L10;
            }
            var9 = stackIn_38_0;
            var10 = 0;
            L12: while (true) {
              L13: {
                if (~((nb) this).field_S >= ~var10) {
                  break L13;
                } else {
                  if (var2.field_T) {
                    break L13;
                  } else {
                    L14: {
                      var2.i(-1);
                      var11 = ((nb) this).d(true, var2.field_U);
                      var12 = this.b(1, var2.field_A);
                      stackOut_41_0 = var3;
                      stackOut_41_1 = var4;
                      stackOut_41_2 = var11;
                      stackOut_41_3 = var12;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      stackIn_43_2 = stackOut_41_2;
                      stackIn_43_3 = stackOut_41_3;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      stackIn_42_2 = stackOut_41_2;
                      stackIn_42_3 = stackOut_41_3;
                      if (var9 != 0) {
                        stackOut_43_0 = stackIn_43_0;
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = stackIn_43_2;
                        stackOut_43_3 = stackIn_43_3;
                        stackOut_43_4 = 16744576;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        stackIn_44_2 = stackOut_43_2;
                        stackIn_44_3 = stackOut_43_3;
                        stackIn_44_4 = stackOut_43_4;
                        break L14;
                      } else {
                        stackOut_42_0 = stackIn_42_0;
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = stackIn_42_2;
                        stackOut_42_3 = stackIn_42_3;
                        stackOut_42_4 = 16777215;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackIn_44_2 = stackOut_42_2;
                        stackIn_44_3 = stackOut_42_3;
                        stackIn_44_4 = stackOut_42_4;
                        break L14;
                      }
                    }
                    L15: {
                      pb.a(stackIn_44_0, stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, 128);
                      if (~(var10 - -1) > ~((nb) this).field_S) {
                        ((nb) this).field_D[var10 - -1] = var2.field_U;
                        ((nb) this).field_K[1 + var10] = var2.field_A;
                        hf.field_c = var10 + 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (var8 != 0) {
                        var13 = Math.abs(-((nb) this).field_C.field_hc + var2.field_U) >> 4;
                        var14 = Math.abs(var2.field_A - ((nb) this).field_C.field_Gb) >> 4;
                        var13 = var13 * var13;
                        var14 = var14 * var14;
                        if (var13 + var14 < 10240000) {
                          break L16;
                        } else {
                          break L13;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        L19: {
                          if (var8 != 0) {
                            break L19;
                          } else {
                            if (var7 == 0) {
                              break L19;
                            } else {
                              if (~var2.field_hb >= ~var2.field_Z) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                        if (var9 == 0) {
                          break L17;
                        } else {
                          if (20 <= var2.field_Z) {
                            break L18;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L20: {
                        var13 = var2.field_U - var5;
                        var14 = -var6 + var2.field_A;
                        if (var13 != 0) {
                          break L20;
                        } else {
                          if (var14 == 0) {
                            break L13;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L21: {
                        var15 = 6.0 / Math.sqrt((double)(var13 * var13 - -(var14 * var14)));
                        var13 = (int)((double)var13 * var15);
                        var14 = (int)(var15 * (double)var14);
                        var17 = var11 + var14;
                        var18 = var12 + -var13;
                        var19 = var11 - var14;
                        var20 = var13 + var12;
                        stackOut_61_0 = var17;
                        stackOut_61_1 = var18;
                        stackOut_61_2 = var19;
                        stackOut_61_3 = var20;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        stackIn_63_2 = stackOut_61_2;
                        stackIn_63_3 = stackOut_61_3;
                        stackIn_62_0 = stackOut_61_0;
                        stackIn_62_1 = stackOut_61_1;
                        stackIn_62_2 = stackOut_61_2;
                        stackIn_62_3 = stackOut_61_3;
                        if (var9 == 0) {
                          stackOut_63_0 = stackIn_63_0;
                          stackOut_63_1 = stackIn_63_1;
                          stackOut_63_2 = stackIn_63_2;
                          stackOut_63_3 = stackIn_63_3;
                          stackOut_63_4 = 16777215;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          stackIn_64_2 = stackOut_63_2;
                          stackIn_64_3 = stackOut_63_3;
                          stackIn_64_4 = stackOut_63_4;
                          break L21;
                        } else {
                          stackOut_62_0 = stackIn_62_0;
                          stackOut_62_1 = stackIn_62_1;
                          stackOut_62_2 = stackIn_62_2;
                          stackOut_62_3 = stackIn_62_3;
                          stackOut_62_4 = 16744576;
                          stackIn_64_0 = stackOut_62_0;
                          stackIn_64_1 = stackOut_62_1;
                          stackIn_64_2 = stackOut_62_2;
                          stackIn_64_3 = stackOut_62_3;
                          stackIn_64_4 = stackOut_62_4;
                          break L21;
                        }
                      }
                      pb.b(stackIn_64_0, stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_64_4, 128);
                      var9 = 0;
                      if (var7 != 0) {
                        break L13;
                      } else {
                        break L17;
                      }
                    }
                    var6 = var2.field_A;
                    var4 = var12;
                    var3 = var11;
                    var5 = var2.field_U;
                    var10++;
                    continue L12;
                  }
                }
              }
              pm.field_db.g(6);
              return;
            }
          }
        }
    }

    private final void a(int param0, boolean param1, boolean param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        mb var6_ref_mb = null;
        int var7 = 0;
        bh var7_ref_bh = null;
        mb var8 = null;
        bh var8_ref = null;
        qb var8_ref2 = null;
        ne var8_ref3 = null;
        jb var8_ref4 = null;
        wl var8_ref5 = null;
        int var9_int = 0;
        je var9 = null;
        bh var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        je var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        mb var17 = null;
        bh stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        bh stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        bh stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        bh stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        bh stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        bh stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        L0: {
          L1: {
            var16 = SteelSentinels.field_G;
            ((nb) this).field_u = null;
            var5 = 0;
            if (((nb) this).field_C == null) {
              break L1;
            } else {
              if (!param2) {
                break L1;
              } else {
                if (((nb) this).field_C.field_Hb) {
                  break L1;
                } else {
                  L2: {
                    if (0 > ((nb) this).field_C.field_Qb) {
                      break L2;
                    } else {
                      if (((nb) this).field_C.field_pc) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var6_ref_mb = ((nb) this).field_C;
                  var7_ref_bh = new bh(var6_ref_mb);
                  var8_ref = new bh(var6_ref_mb);
                  hd.field_a = 0;
                  var7_ref_bh.field_k = 0;
                  var9_int = 100;
                  var10 = 0;
                  var11 = ((nb) this).field_X.field_r + 1;
                  L3: while (true) {
                    if (var11 >= 500 + ((nb) this).field_X.field_r) {
                      if (var10 == 0) {
                        hf.field_c = 0;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var12 = var7_ref_bh.a(qg.field_n, true, var11);
                          je discarded$6 = var8_ref.a((je) null, true, var11);
                          if (var12 == null) {
                            break L5;
                          } else {
                            if (var12.field_s != 0) {
                              break L5;
                            } else {
                              if (pm.field_db.f(7)) {
                                break L5;
                              } else {
                                L6: {
                                  if (((nb) this).field_C.field_ub >= 0) {
                                    break L6;
                                  } else {
                                    if (c.a((byte) -95, ((nb) this).field_C.field_Xb[((nb) this).field_F])) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                L7: {
                                  if (((nb) this).field_C.field_Tb >= 1) {
                                    break L7;
                                  } else {
                                    if (((nb) this).field_C.field_Xb[((nb) this).field_F] == 8) {
                                      break L5;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var10 = 1;
                                int discarded$7 = -104;
                                this.e();
                                break L4;
                              }
                            }
                          }
                        }
                        if (var12 == null) {
                          break L4;
                        } else {
                          hf.field_c = 0;
                          break L4;
                        }
                      }
                      L8: {
                        L9: {
                          var13 = -(((nb) this).field_P >> 4);
                          var14 = -(((nb) this).field_E >> 4) + 400;
                          if (var11 % var9_int == 0) {
                            break L9;
                          } else {
                            if (0 <= var7_ref_bh.field_k) {
                              break L9;
                            } else {
                              if (var12 == null) {
                                break L8;
                              } else {
                                if (qg.field_n != var12) {
                                  break L8;
                                } else {
                                  if (var11 == var12.field_x) {
                                    break L9;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L10: {
                          var15 = 0;
                          if (null == qg.field_n) {
                            break L10;
                          } else {
                            if (qg.field_n.field_x > var11) {
                              break L10;
                            } else {
                              var15 = 1;
                              break L10;
                            }
                          }
                        }
                        if (var15 == 1) {
                          if (0 <= ((nb) this).field_C.field_ub) {
                            if (qg.field_n != var12) {
                              break L8;
                            } else {
                              if (var11 != qg.field_n.field_x) {
                                break L8;
                              } else {
                                var8_ref.a((byte) -61, 35, var13, 0, true, var14);
                                break L8;
                              }
                            }
                          } else {
                            if (qg.field_n != var12) {
                              break L8;
                            } else {
                              if (var11 != qg.field_n.field_x) {
                                break L8;
                              } else {
                                var8_ref.a((byte) -61, 35, var13, 0, true, var14);
                                break L8;
                              }
                            }
                          }
                        } else {
                          if (null == qg.field_n) {
                            break L8;
                          } else {
                            var7_ref_bh.a((byte) -106, 35, var13, var15, true, var14);
                            break L8;
                          }
                        }
                      }
                      L11: {
                        if (var12 == null) {
                          break L11;
                        } else {
                          var8_ref.a(var14, var12, 256, -1, var13);
                          break L11;
                        }
                      }
                      if (var12 == qg.field_n) {
                        if (null != qg.field_n) {
                          bj.field_h = var7_ref_bh.field_b;
                          km.field_c = var7_ref_bh.field_g;
                          gi.field_r = var7_ref_bh.field_r;
                          dl.field_G = var7_ref_bh.field_q;
                          var11++;
                          continue L3;
                        } else {
                          var11++;
                          continue L3;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
          if (((nb) this).field_C != null) {
            dl.field_G = ((nb) this).field_C.field_Gb;
            gi.field_r = ((nb) this).field_C.field_pc;
            bj.field_h = ((nb) this).field_C.field_E;
            km.field_c = ((nb) this).field_C.field_hc;
            break L0;
          } else {
            break L0;
          }
        }
        L12: {
          var6 = -(((nb) this).field_P >> 4);
          var7 = -(((nb) this).field_E >> 4) + 400;
          if (!param1) {
            break L12;
          } else {
            var8 = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
            L13: while (true) {
              if (var8 == null) {
                var8_ref3 = (ne) (Object) ((nb) this).field_X.field_e.e(13058);
                L14: while (true) {
                  if (var8_ref3 == null) {
                    break L12;
                  } else {
                    var8_ref3.a(256, var7, -1, var6);
                    var8_ref3 = (ne) (Object) ((nb) this).field_X.field_e.a((byte) -72);
                    continue L14;
                  }
                }
              } else {
                L15: {
                  if (var8.a((byte) -22, var6, oh.field_f, pi.field_c, var7)) {
                    L16: {
                      if (((nb) this).field_C == null) {
                        break L16;
                      } else {
                        if (((nb) this).field_C.field_jc != var8.field_jc) {
                          break L16;
                        } else {
                          if (((nb) this).field_C == null) {
                            break L15;
                          } else {
                            if (((nb) this).field_C.field_Vb != var8) {
                              break L15;
                            } else {
                              boolean discarded$8 = ((nb) this).field_C.a(var6, 256, 23859, var7);
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    ((nb) this).field_u = var8;
                    if (((nb) this).field_C == null) {
                      break L15;
                    } else {
                      if (((nb) this).field_C.field_Vb != var8) {
                        break L15;
                      } else {
                        boolean discarded$9 = ((nb) this).field_C.a(var6, 256, 23859, var7);
                        break L15;
                      }
                    }
                  } else {
                    if (((nb) this).field_C == null) {
                      break L15;
                    } else {
                      if (((nb) this).field_C.field_Vb != var8) {
                        break L15;
                      } else {
                        boolean discarded$10 = ((nb) this).field_C.a(var6, 256, 23859, var7);
                        break L15;
                      }
                    }
                  }
                }
                L17: {
                  if (null == ((nb) this).field_C) {
                    break L17;
                  } else {
                    if (((nb) this).field_X.field_j) {
                      break L17;
                    } else {
                      if (!((nb) this).field_C.i(21, -27)) {
                        break L17;
                      } else {
                        if (var8.i(81)) {
                          break L17;
                        } else {
                          L18: {
                            if (((nb) this).field_C != var8) {
                              break L18;
                            } else {
                              if (var5 == 0) {
                                break L18;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (var8.field_Zb.field_N == 109) {
                            break L17;
                          } else {
                            if (var8.field_pc) {
                              break L17;
                            } else {
                              if (!var8.field_Hb) {
                                L19: {
                                  var9_ref = new bh(var8);
                                  if (var8 == ((nb) this).field_C) {
                                    break L19;
                                  } else {
                                    var9_ref.field_n = var8.d((byte) 110);
                                    break L19;
                                  }
                                }
                                var10 = 100;
                                var9_ref.field_k = 0;
                                var11 = 1 + ((nb) this).field_X.field_r;
                                L20: while (true) {
                                  if (var11 >= ((nb) this).field_X.field_r - -90) {
                                    break L17;
                                  } else {
                                    L21: {
                                      je discarded$11 = var9_ref.a((je) null, true, var11);
                                      if (var11 % var10 == 0) {
                                        break L21;
                                      } else {
                                        if (0 <= var9_ref.field_k) {
                                          break L21;
                                        } else {
                                          var11++;
                                          continue L20;
                                        }
                                      }
                                    }
                                    L22: {
                                      stackOut_88_0 = (bh) var9_ref;
                                      stackOut_88_1 = -39;
                                      stackIn_90_0 = stackOut_88_0;
                                      stackIn_90_1 = stackOut_88_1;
                                      stackIn_89_0 = stackOut_88_0;
                                      stackIn_89_1 = stackOut_88_1;
                                      if (var11 >= ((nb) this).field_X.field_r - -70) {
                                        stackOut_90_0 = (bh) (Object) stackIn_90_0;
                                        stackOut_90_1 = stackIn_90_1;
                                        stackOut_90_2 = 25;
                                        stackIn_91_0 = stackOut_90_0;
                                        stackIn_91_1 = stackOut_90_1;
                                        stackIn_91_2 = stackOut_90_2;
                                        break L22;
                                      } else {
                                        stackOut_89_0 = (bh) (Object) stackIn_89_0;
                                        stackOut_89_1 = stackIn_89_1;
                                        stackOut_89_2 = 35;
                                        stackIn_91_0 = stackOut_89_0;
                                        stackIn_91_1 = stackOut_89_1;
                                        stackIn_91_2 = stackOut_89_2;
                                        break L22;
                                      }
                                    }
                                    ((bh) (Object) stackIn_91_0).a((byte) stackIn_91_1, stackIn_91_2, var6, 2, true, var7);
                                    var11++;
                                    continue L20;
                                  }
                                }
                              } else {
                                var8 = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -57);
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var8 = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -57);
                continue L13;
              }
            }
          }
        }
        L23: {
          if (param3) {
            var8_ref2 = (qb) (Object) ((nb) this).field_X.field_o.e(13058);
            L24: while (true) {
              if (var8_ref2 == null) {
                var8_ref4 = (jb) (Object) ((nb) this).field_X.field_C.e(13058);
                L25: while (true) {
                  if (var8_ref4 == null) {
                    var8_ref5 = (wl) (Object) ((nb) this).field_X.field_db.e(13058);
                    L26: while (true) {
                      if (var8_ref5 == null) {
                        var8_ref2 = (qb) (Object) ((nb) this).field_X.field_o.e(13058);
                        L27: while (true) {
                          if (var8_ref2 == null) {
                            break L23;
                          } else {
                            var8_ref2.a(var6, var7, false, (byte) -107);
                            var8_ref2 = (qb) (Object) ((nb) this).field_X.field_o.a((byte) -61);
                            continue L27;
                          }
                        }
                      } else {
                        var8_ref5.a(var7, var6, 4);
                        var8_ref5 = (wl) (Object) ((nb) this).field_X.field_db.a((byte) -55);
                        continue L26;
                      }
                    }
                  } else {
                    var8_ref4.a(var7, var6, 116);
                    var8_ref4 = (jb) (Object) ((nb) this).field_X.field_C.a((byte) -82);
                    continue L25;
                  }
                }
              } else {
                var8_ref2.a(var6, var7, true, (byte) -119);
                var8_ref2 = (qb) (Object) ((nb) this).field_X.field_o.a((byte) -8);
                continue L24;
              }
            }
          } else {
            break L23;
          }
        }
        L28: {
          if (((nb) this).field_X.field_b < 50) {
            if (((nb) this).field_X.field_b <= 0) {
              break L28;
            } else {
              pb.c(0, 0, 640, 400, 16777215, ((nb) this).field_X.field_b * 5);
              break L28;
            }
          } else {
            pb.c(0, 0, 640, 400, 16777215, 255 * (-((nb) this).field_X.field_b + 550) / 500);
            break L28;
          }
        }
        L29: {
          if (!param1) {
            break L29;
          } else {
            if (null == ((nb) this).field_C) {
              break L29;
            } else {
              if (!jc.a(2)) {
                L30: {
                  var17 = ((nb) this).field_C;
                  var8 = var17;
                  ((nb) this).field_P = Math.min(((nb) this).field_P, ((nb) this).field_X.field_ab.a(99) - 10240);
                  ((nb) this).field_P = Math.max(((nb) this).field_P, 0);
                  if (!fc.field_e[81]) {
                    if (null == qg.field_n) {
                      break L30;
                    } else {
                      if (((nb) this).field_C.field_Xb.length <= 0) {
                        break L30;
                      } else {
                        var8.field_Zb.a(qg.field_n.field_B * bj.field_h, -126, var17.field_Xb[((nb) this).field_F]);
                        break L30;
                      }
                    }
                  } else {
                    break L30;
                  }
                }
                var9 = (je) (Object) var8.field_B.b(1063677678);
                L31: while (true) {
                  if (var9 == null) {
                    break L29;
                  } else {
                    L32: {
                      if (var9.field_s == 0) {
                        qi.field_k = true;
                        var8.field_Zb.a(var9.field_B * ((nb) this).field_C.field_E, -117, var9.field_A);
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    var9 = (je) (Object) var8.field_B.a(-2137);
                    continue L31;
                  }
                }
              } else {
                break L29;
              }
            }
          }
        }
        L33: {
          if (param0 < -78) {
            break L33;
          } else {
            field_x = null;
            break L33;
          }
        }
    }

    private final void a() {
        int var5 = 0;
        int discarded$0 = 0;
        this.c();
        qd.field_g = 500;
        int var2 = ol.field_Ub + 10 * ge.field_j;
        ((nb) this).field_C.a(ua.field_C[var2], true, false, 0, 0);
        ((nb) this).field_X.field_N = ((nb) this).field_X.field_N + 100000 * ((nb) this).field_C.field_x;
        ((nb) this).field_X.field_q = ((nb) this).field_X.field_q + ((nb) this).field_C.field_Eb * 60000;
        ((nb) this).field_X.field_M = ua.field_t[var2][3];
        int var3 = ua.field_t[var2][2];
        ((nb) this).field_C.field_Qb = 170;
        ((nb) this).field_C.field_hc = var3 << 4;
        ((nb) this).field_C.field_ab = 1000;
        ((nb) this).field_C.field_K = 0;
        ((nb) this).field_C.field_Gb = -120000;
        int var4 = 0;
        ((nb) this).field_C.field_U = 0;
        if (ge.field_j == 0) {
            int discarded$1 = 32;
            var5 = vc.a();
            if (var5 >= 0) {
                ((nb) this).field_C.field_hc = var5;
            }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (((nb) this).field_d) {
            break L0;
          } else {
            if (ni.b(112)) {
              var3 = param1 ? 1 : 0;
              q.a(0, var3 != 0, -1, 0);
              break L0;
            } else {
              if (null == lc.field_c) {
                var3 = param1 ? 1 : 0;
                q.a(0, var3 != 0, -1, 0);
                break L0;
              } else {
                var3 = param1 ? 1 : 0;
                q.a(5, var3 != 0, -1, 0);
                break L0;
              }
            }
          }
        }
        var3 = -98 % ((param0 - -53) / 49);
    }

    final void c(int param0) {
        if (param0 < 123) {
            field_G = -18L;
        }
        if (!((nb) this).field_d) {
            throw new IllegalStateException();
        }
        mm.field_g.a(60, (byte) -117);
        ((nb) this).field_C = null;
    }

    private final void g() {
        int var2 = 0;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        u stackIn_53_0 = null;
        u stackIn_54_0 = null;
        u stackIn_55_0 = null;
        String stackIn_55_1 = null;
        u stackIn_65_0 = null;
        u stackIn_66_0 = null;
        u stackIn_67_0 = null;
        String stackIn_67_1 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        u stackOut_52_0 = null;
        u stackOut_54_0 = null;
        String stackOut_54_1 = null;
        u stackOut_53_0 = null;
        String stackOut_53_1 = null;
        u stackOut_64_0 = null;
        u stackOut_66_0 = null;
        String stackOut_66_1 = null;
        u stackOut_65_0 = null;
        String stackOut_65_1 = null;
        L0: {
          var24 = SteelSentinels.field_G;
          if (nc.field_a < 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (ge.field_j != 0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_6_0;
          if (ni.b(117)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          L4: {
            var4 = stackIn_9_0;
            if (var4 != 0) {
              break L4;
            } else {
              if (0 != ge.field_j) {
                break L4;
              } else {
                if (ol.field_Ub != 9) {
                  break L4;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
              }
            }
          }
          stackOut_13_0 = 0;
          stackIn_14_0 = stackOut_13_0;
          break L3;
        }
        L5: {
          var5 = stackIn_14_0;
          var6 = ql.a(ce.field_t, 18286) ? 1 : 0;
          if (null != ad.field_i) {
            stackOut_16_0 = ad.field_i.length;
            stackIn_17_0 = stackOut_16_0;
            break L5;
          } else {
            stackOut_15_0 = 0;
            stackIn_17_0 = stackOut_15_0;
            break L5;
          }
        }
        L6: {
          stackOut_17_0 = stackIn_17_0;
          stackIn_19_0 = stackOut_17_0;
          stackIn_18_0 = stackOut_17_0;
          if (null == vk.field_g) {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            break L6;
          } else {
            stackOut_18_0 = stackIn_18_0;
            stackOut_18_1 = vk.field_g.length;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            break L6;
          }
        }
        L7: {
          var7 = Math.max(stackIn_20_0, stackIn_20_1);
          var8 = 14;
          var9 = 3;
          var10 = 26;
          var11 = 200;
          var12 = 3 + pl.field_U.field_U;
          var13 = 0;
          var14 = 1;
          if (var5 == 0) {
            if (var4 != 0) {
              break L7;
            } else {
              var13 = pl.field_U.a(id.field_Tb, 560, var12);
              var14 += 2;
              var8 = var8 + (var13 + var10);
              break L7;
            }
          } else {
            var13 = pl.field_U.a(mg.field_Zb, 560, var12);
            var14 += 2;
            var8 = var8 + (var10 - -var13);
            break L7;
          }
        }
        L8: {
          if (var6 != 0) {
            var8 += 32;
            var14++;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (var7 <= 0) {
            break L9;
          } else {
            var14 += 3;
            var8 = var8 + (var12 * var7 + (var12 + var12));
            break L9;
          }
        }
        L10: {
          L11: {
            if (var2 == 0) {
              break L11;
            } else {
              if (var5 == 0) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          var8 = var8 + var10;
          var14++;
          break L10;
        }
        L12: {
          if (110 > var9 * var14 + var8) {
            var9 = (110 + -var8) / var14;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var8 = var8 + var14 * var9;
          var15 = 480 - var8;
          ch.a(var15, 640, 32308, 0, var8);
          pb.g(3, 3 + var15, 634, var8 - 6, 8, 0);
          var16 = 473;
          var17 = 0;
          if (var5 == 0) {
            if (var4 != 0) {
              break L13;
            } else {
              L14: {
                var16 = var16 - var10;
                var17 = (640 + -var11) / 2;
                if (!nm.a(var16, var17, 123, cf.field_v, var10, var11)) {
                  break L14;
                } else {
                  ((nb) this).field_r = 31;
                  break L14;
                }
              }
              var16 = var16 - var9;
              var16 = var16 - var13;
              int discarded$3 = pl.field_U.a(id.field_Tb, 40, var16, 560, var13, 16777215, -1, 1, 0, var12);
              var16 = var16 - var9;
              break L13;
            }
          } else {
            L15: {
              var16 = var16 - var10;
              var17 = (-20 + (640 + -(2 * var11))) / 2;
              if (nm.a(var16, var17, 122, rn.field_B, var10, var11)) {
                ((nb) this).field_r = 32;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var17 = var17 + (20 + var11);
              if (!nm.a(var16, var17, 125, cf.field_v, var10, var11)) {
                break L16;
              } else {
                ((nb) this).field_r = 31;
                break L16;
              }
            }
            var16 = var16 - var9;
            var16 = var16 - var13;
            int discarded$4 = pl.field_U.a(mg.field_Zb, 40, var16, 560, var13, 16777215, -1, 1, 0, var12);
            var16 = var16 - var9;
            break L13;
          }
        }
        L17: {
          var18 = -1;
          if (var6 != 0) {
            var16 -= 32;
            var18 = var16;
            var16 = var16 - var9;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          if (var7 > 0) {
            L19: {
              var16 = var16 - (var9 + (var12 + var9 + var7 * var12));
              stackOut_52_0 = pl.field_U;
              stackIn_54_0 = stackOut_52_0;
              stackIn_53_0 = stackOut_52_0;
              if (ge.field_j == 0) {
                stackOut_54_0 = (u) (Object) stackIn_54_0;
                stackOut_54_1 = na.field_c;
                stackIn_55_0 = stackOut_54_0;
                stackIn_55_1 = stackOut_54_1;
                break L19;
              } else {
                stackOut_53_0 = (u) (Object) stackIn_53_0;
                stackOut_53_1 = ej.field_s;
                stackIn_55_0 = stackOut_53_0;
                stackIn_55_1 = stackOut_53_1;
                break L19;
              }
            }
            L20: {
              ((u) (Object) stackIn_55_0).b(stackIn_55_1, 20, var16, 16777215, -1);
              var19 = var9 + (var12 + var16);
              var17 = 20;
              if (ad.field_i.length <= 0) {
                break L20;
              } else {
                var20 = var19;
                pl.field_U.b(qg.field_l, var17, var20, 10526880, 0);
                var20 += 4;
                var17 += 8;
                var25 = ad.field_i;
                var22 = 0;
                L21: while (true) {
                  if (~var25.length >= ~var22) {
                    var17 += 180;
                    break L20;
                  } else {
                    var23 = var25[var22];
                    var20 = var20 + var12;
                    pl.field_U.b(t.field_e[var23], var17, var20, 1021128, 0);
                    var22++;
                    continue L21;
                  }
                }
              }
            }
            L22: {
              if (0 < vk.field_g.length) {
                var20 = var19;
                pl.field_U.b(wa.field_o, var17, var20, 10526880, 0);
                var20 += 4;
                var17 += 8;
                var26 = vk.field_g;
                var27 = 0;
                var22 = var27;
                L23: while (true) {
                  if (~var27 <= ~var26.length) {
                    break L22;
                  } else {
                    L24: {
                      var23 = var26[var27];
                      var20 = var20 + var12;
                      stackOut_64_0 = pl.field_U;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      if (var23 != 34) {
                        stackOut_66_0 = (u) (Object) stackIn_66_0;
                        stackOut_66_1 = rj.field_m[var23];
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        break L24;
                      } else {
                        stackOut_65_0 = (u) (Object) stackIn_65_0;
                        stackOut_65_1 = "GODULE";
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        break L24;
                      }
                    }
                    ((u) (Object) stackIn_67_0).b(stackIn_67_1, var17, var20, 1021128, 0);
                    var27++;
                    continue L23;
                  }
                }
              } else {
                break L22;
              }
            }
            var16 = var16 - (var9 + var12);
            break L18;
          } else {
            break L18;
          }
        }
        L25: {
          var16 = var16 - (var9 + var10);
          var19 = -12;
          if (var5 != 0) {
            L26: {
              if (var2 == 0) {
                var17 = (640 - var11) / 2;
                if (nm.a(var16, var17, 119, r.field_o, var10, var11)) {
                  ((nb) this).field_r = 40;
                  break L26;
                } else {
                  break L26;
                }
              } else {
                break L26;
              }
            }
            var16 = var16 - var9;
            break L25;
          } else {
            if (var2 == 0) {
              if (var3 == 0) {
                L27: {
                  var17 = (-var11 + 640) / 2;
                  if (!nm.a(var16, var17, 120, bf.field_Db, var10, var11)) {
                    break L27;
                  } else {
                    ((nb) this).field_r = 5;
                    break L27;
                  }
                }
                var16 = var16 - var9;
                break L25;
              } else {
                L28: {
                  var17 = (620 + -var11 - var11) / 2;
                  if (nm.a(var16, var17, 123, r.field_o, var10, var11)) {
                    ((nb) this).field_r = 40;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  var17 = var17 + (var11 + 20);
                  if (nm.a(var16, var17, 124, f.field_z, var10, var11)) {
                    ((nb) this).field_r = 39;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                var16 = var16 - var9;
                break L25;
              }
            } else {
              L30: {
                var17 = (-var11 + 640) / 2;
                if (nm.a(var16, var17, 120, bf.field_Db, var10, var11)) {
                  ((nb) this).field_r = 5;
                  break L30;
                } else {
                  break L30;
                }
              }
              var16 = var16 - var9;
              break L25;
            }
          }
        }
        L31: {
          if (var6 != 0) {
            int discarded$5 = this.e(true, var18);
            break L31;
          } else {
            break L31;
          }
        }
    }

    final void c(int param0, boolean param1) {
        String var3_ref_String = null;
        int var3 = 0;
        Object var4_ref = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7_ref = null;
        int var7 = 0;
        jc var7_ref_jc = null;
        nk[] var7_ref_nk__ = null;
        mb var7_ref_mb = null;
        int var8 = 0;
        int var9 = 0;
        wl var9_ref_wl = null;
        nk var9_ref_nk = null;
        je var9_ref_je = null;
        int var10 = 0;
        je var10_ref_je = null;
        int var11 = 0;
        je var11_ref_je = null;
        int var12_int = 0;
        wk[] var12 = null;
        int var13 = 0;
        double var13_double = 0.0;
        int var14 = 0;
        int var15 = 0;
        nk[] var15_ref_nk__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        int var20 = 0;
        int stackIn_12_0 = 0;
        int stackIn_325_0 = 0;
        int stackIn_326_0 = 0;
        int stackIn_327_0 = 0;
        int stackIn_328_0 = 0;
        int stackIn_328_1 = 0;
        je stackIn_339_0 = null;
        je stackIn_340_0 = null;
        je stackIn_341_0 = null;
        int stackIn_341_1 = 0;
        int stackIn_479_0 = 0;
        Object stackIn_643_0 = null;
        Object stackIn_644_0 = null;
        Object stackIn_645_0 = null;
        int stackIn_645_1 = 0;
        Object stackIn_646_0 = null;
        Object stackIn_647_0 = null;
        Object stackIn_648_0 = null;
        int stackIn_648_1 = 0;
        int stackIn_676_0 = 0;
        wk[] stackIn_679_0 = null;
        int stackIn_691_0 = 0;
        Object stackIn_699_0 = null;
        Object stackIn_700_0 = null;
        Object stackIn_701_0 = null;
        int stackIn_701_1 = 0;
        Object stackIn_702_0 = null;
        Object stackIn_703_0 = null;
        Object stackIn_704_0 = null;
        int stackIn_704_1 = 0;
        int stackIn_747_0 = 0;
        int stackIn_751_0 = 0;
        Object stackIn_778_0 = null;
        int stackIn_778_1 = 0;
        int stackIn_778_2 = 0;
        Object stackIn_779_0 = null;
        int stackIn_779_1 = 0;
        int stackIn_779_2 = 0;
        Object stackIn_780_0 = null;
        int stackIn_780_1 = 0;
        int stackIn_780_2 = 0;
        Object stackIn_781_0 = null;
        int stackIn_781_1 = 0;
        int stackIn_781_2 = 0;
        Object stackIn_782_0 = null;
        int stackIn_782_1 = 0;
        int stackIn_782_2 = 0;
        Object stackIn_783_0 = null;
        int stackIn_783_1 = 0;
        int stackIn_783_2 = 0;
        int stackIn_783_3 = 0;
        int stackIn_800_0 = 0;
        int stackIn_815_0 = 0;
        String[] stackIn_816_0 = null;
        int stackIn_816_1 = 0;
        String[] stackIn_817_0 = null;
        int stackIn_817_1 = 0;
        String[] stackIn_818_0 = null;
        int stackIn_818_1 = 0;
        String stackIn_818_2 = null;
        int stackIn_826_0 = 0;
        String[] stackIn_827_0 = null;
        int stackIn_827_1 = 0;
        String[] stackIn_828_0 = null;
        int stackIn_828_1 = 0;
        String[] stackIn_829_0 = null;
        int stackIn_829_1 = 0;
        String stackIn_829_2 = null;
        int stackIn_837_0 = 0;
        String[] stackIn_838_0 = null;
        int stackIn_838_1 = 0;
        String[] stackIn_839_0 = null;
        int stackIn_839_1 = 0;
        String[] stackIn_840_0 = null;
        int stackIn_840_1 = 0;
        String stackIn_840_2 = null;
        int stackIn_984_0 = 0;
        wk[] stackIn_987_0 = null;
        int stackIn_999_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_323_0 = 0;
        int stackOut_324_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_326_0 = 0;
        int stackOut_326_1 = 0;
        int stackOut_327_0 = 0;
        int stackOut_327_1 = 0;
        je stackOut_338_0 = null;
        je stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        je stackOut_340_0 = null;
        int stackOut_340_1 = 0;
        int stackOut_477_0 = 0;
        int stackOut_478_0 = 0;
        Object stackOut_642_0 = null;
        Object stackOut_643_0 = null;
        int stackOut_643_1 = 0;
        Object stackOut_644_0 = null;
        int stackOut_644_1 = 0;
        Object stackOut_645_0 = null;
        Object stackOut_646_0 = null;
        int stackOut_646_1 = 0;
        Object stackOut_647_0 = null;
        int stackOut_647_1 = 0;
        int stackOut_674_0 = 0;
        int stackOut_675_0 = 0;
        wk[] stackOut_677_0 = null;
        wk[] stackOut_678_0 = null;
        int stackOut_689_0 = 0;
        int stackOut_690_0 = 0;
        Object stackOut_698_0 = null;
        Object stackOut_699_0 = null;
        int stackOut_699_1 = 0;
        Object stackOut_700_0 = null;
        int stackOut_700_1 = 0;
        Object stackOut_701_0 = null;
        Object stackOut_702_0 = null;
        int stackOut_702_1 = 0;
        Object stackOut_703_0 = null;
        int stackOut_703_1 = 0;
        int stackOut_745_0 = 0;
        int stackOut_746_0 = 0;
        int stackOut_749_0 = 0;
        int stackOut_750_0 = 0;
        Object stackOut_777_0 = null;
        int stackOut_777_1 = 0;
        int stackOut_777_2 = 0;
        Object stackOut_778_0 = null;
        int stackOut_778_1 = 0;
        int stackOut_778_2 = 0;
        Object stackOut_779_0 = null;
        int stackOut_779_1 = 0;
        int stackOut_779_2 = 0;
        Object stackOut_780_0 = null;
        int stackOut_780_1 = 0;
        int stackOut_780_2 = 0;
        Object stackOut_781_0 = null;
        int stackOut_781_1 = 0;
        int stackOut_781_2 = 0;
        int stackOut_781_3 = 0;
        Object stackOut_782_0 = null;
        int stackOut_782_1 = 0;
        int stackOut_782_2 = 0;
        int stackOut_782_3 = 0;
        int stackOut_798_0 = 0;
        int stackOut_799_0 = 0;
        int stackOut_813_0 = 0;
        int stackOut_814_0 = 0;
        String[] stackOut_815_0 = null;
        int stackOut_815_1 = 0;
        String[] stackOut_816_0 = null;
        int stackOut_816_1 = 0;
        String stackOut_816_2 = null;
        String[] stackOut_817_0 = null;
        int stackOut_817_1 = 0;
        String stackOut_817_2 = null;
        int stackOut_824_0 = 0;
        int stackOut_825_0 = 0;
        String[] stackOut_826_0 = null;
        int stackOut_826_1 = 0;
        String[] stackOut_827_0 = null;
        int stackOut_827_1 = 0;
        String stackOut_827_2 = null;
        String[] stackOut_828_0 = null;
        int stackOut_828_1 = 0;
        String stackOut_828_2 = null;
        int stackOut_835_0 = 0;
        int stackOut_836_0 = 0;
        String[] stackOut_837_0 = null;
        int stackOut_837_1 = 0;
        String[] stackOut_838_0 = null;
        int stackOut_838_1 = 0;
        String stackOut_838_2 = null;
        String[] stackOut_839_0 = null;
        int stackOut_839_1 = 0;
        String stackOut_839_2 = null;
        int stackOut_982_0 = 0;
        int stackOut_983_0 = 0;
        wk[] stackOut_985_0 = null;
        wk[] stackOut_986_0 = null;
        int stackOut_997_0 = 0;
        int stackOut_998_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7_ref = null;
                    var18 = SteelSentinels.field_G;
                    if (((nb) this).field_X.field_p) {
                        statePc = 13;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (!wc.field_a) {
                        statePc = 13;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (0 > ((nb) this).field_X.field_A) {
                        statePc = 13;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-2 == ed.field_j) {
                        statePc = 13;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    wc.field_a = false;
                    var3 = Math.min(2, Math.max(0, ((nb) this).field_X.field_Q));
                    var4_ref = null;
                    if (1 == var3) {
                        statePc = 8;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var3 == 2) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var4_ref_String = ((nb) this).field_X.d(-1661904765, ((nb) this).field_X.field_A);
                    statePc = 9;
                    continue stateLoop;
                }
                case 7: {
                    var4_ref_String = ((nb) this).field_X.d(-1661904765, ((nb) this).field_X.field_kb + (1 & ((nb) this).field_X.field_r));
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    var4_ref_String = ((nb) this).field_X.d(-1661904765, ((nb) this).field_X.field_kb);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4_ref_String = var4_ref_String + ": " + rh.field_t[var3];
                    if (0 < var3) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 16776960;
                    stackIn_12_0 = stackOut_10_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = 48127;
                    stackIn_12_0 = stackOut_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    bl.a(stackIn_12_0, var4_ref_String, (byte) 34);
                    int discarded$40 = 100;
                    bc.a(var4_ref_String, ((nb) this).field_X);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    if (!((nb) this).field_X.field_p) {
                        statePc = 17;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (wc.field_a) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (ed.field_j == -2) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    wc.field_a = true;
                    var3_ref_String = si.field_H[((nb) this).field_X.field_r % si.field_H.length];
                    var3_ref_String = dc.field_a + ": " + var3_ref_String;
                    bl.a(16776960, var3_ref_String, (byte) -50);
                    int discarded$41 = 100;
                    bc.a(var3_ref_String, ((nb) this).field_X);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (di.field_g == -1) {
                        statePc = 19;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (uj.field_f) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    if (((nb) this).field_X.field_P == 0) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (!((nb) this).field_X.field_lb) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    int discarded$42 = 53;
                    this.j();
                    statePc = 33;
                    continue stateLoop;
                }
                case 24: {
                    if (((nb) this).field_X.field_P == 1) {
                        statePc = 26;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 26: {
                    int discarded$43 = 30483;
                    this.f();
                    statePc = 33;
                    continue stateLoop;
                }
                case 27: {
                    if (((nb) this).field_X.field_P == 0) {
                        statePc = 30;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (!((nb) this).field_X.field_lb) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    this.b(true);
                    statePc = 33;
                    continue stateLoop;
                }
                case 31: {
                    if (((nb) this).field_X.field_P != 1) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    int discarded$44 = -21714;
                    this.l();
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (sh.field_d < 0) {
                        statePc = 37;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (bh.a(true)) {
                        statePc = 36;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 36: {
                    sh.field_d = sh.field_d + 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (!((nb) this).field_X.field_j) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (q.field_h <= 0) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    q.field_h = q.field_h - 1;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (qd.field_g > 0) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    qd.field_g = qd.field_g - 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (!((nb) this).field_X.field_j) {
                        statePc = 46;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (((nb) this).field_W != null) {
                        statePc = 46;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    this.h((byte) -69);
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    if (-1 == ((nb) this).field_t) {
                        statePc = 51;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (lb.field_gc != 1) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (!((nb) this).field_X.field_j) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((nb) this).field_F = ((nb) this).field_t;
                    ((nb) this).field_t = -1;
                    rc.field_l = 100;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    if (0 < rc.field_l) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    rc.field_l = rc.field_l - 1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (!hb.field_f) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (150 <= je.field_o) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    je.field_o = je.field_o + 2;
                    statePc = 61;
                    continue stateLoop;
                }
                case 57: {
                    if (hb.field_f) {
                        statePc = 61;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (je.field_o > 0) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    je.field_o = je.field_o - 1;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (-1 != g.field_h) {
                        statePc = 63;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 63: {
                    pd.field_X = pd.field_X + 1;
                    if (250 < pd.field_X) {
                        statePc = 65;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 65: {
                    g.field_h = -1;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    if (pm.field_db.f(7)) {
                        statePc = 70;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (~rc.field_g != ~((nb) this).field_F) {
                        statePc = 69;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 69: {
                    pm.field_db.g(6);
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    rc.field_g = ((nb) this).field_F;
                    if (null == pm.field_db) {
                        statePc = 76;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (pm.field_db.f(7)) {
                        statePc = 73;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (null == ((nb) this).field_C) {
                        statePc = 76;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (((nb) this).field_C.field_pc) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    sn.field_n = true;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (((nb) this).field_r == -1) {
                        statePc = 83;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (26 == ((nb) this).field_r) {
                        statePc = 83;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    if (((nb) this).field_r == 0) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if (((nb) this).field_r == 28) {
                        statePc = 83;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (((nb) this).field_r != ((nb) this).field_n) {
                        statePc = 82;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ee.c(-2483, 97);
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    if (!ue.field_b) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (((nb) this).field_U <= ((nb) this).field_Y) {
                        statePc = 91;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    ((nb) this).field_Y = ((nb) this).field_Y + 10;
                    if (((nb) this).field_U >= ((nb) this).field_Y) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    ((nb) this).field_Y = ((nb) this).field_U;
                    statePc = 91;
                    continue stateLoop;
                }
                case 87: {
                    if (((nb) this).field_Y > 0) {
                        statePc = 89;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 89: {
                    ((nb) this).field_Y = ((nb) this).field_Y - 10;
                    if (0 <= ((nb) this).field_Y) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    ((nb) this).field_Y = 0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    ((nb) this).field_n = ((nb) this).field_r;
                    if (!fn.field_a) {
                        statePc = 95;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    if (~((nb) this).field_s >= ~((nb) this).field_v) {
                        statePc = 99;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    ((nb) this).field_v = ((nb) this).field_v + 10;
                    if (((nb) this).field_s >= ((nb) this).field_v) {
                        statePc = 99;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    ((nb) this).field_v = ((nb) this).field_s;
                    statePc = 99;
                    continue stateLoop;
                }
                case 95: {
                    if (0 >= ((nb) this).field_v) {
                        statePc = 99;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    ((nb) this).field_v = ((nb) this).field_v - 10;
                    if (((nb) this).field_v < 0) {
                        statePc = 98;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 98: {
                    ((nb) this).field_v = 0;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    var3 = 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (var3 >= 6) {
                        statePc = 110;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (ke.field_b[var3] == null) {
                        statePc = 109;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (var3 <= 2) {
                        statePc = 106;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (hh.field_c[var3] > 0) {
                        statePc = 105;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 105: {
                    hh.field_c[var3] = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    hh.field_c[var3] = hh.field_c[var3] - 1;
                    if (hh.field_c[var3] - 1 < -50) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    ke.field_b[var3] = null;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var3++;
                    statePc = 100;
                    continue stateLoop;
                }
                case 110: {
                    var3 = 1;
                    if (!bb.field_T) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var3 = 0;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (!vl.field_v) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (qc.field_V.field_cb > pi.field_c) {
                        statePc = 115;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var3 = 0;
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    if (((nb) this).field_r != 0) {
                        statePc = 117;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var3 = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var3 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    hf.field_c = 0;
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (di.field_g == -1) {
                        statePc = 124;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (4 == di.field_g) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (di.field_g == 10) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (~qh.field_Yb == ~dl.field_M) {
                        statePc = 124;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    param1 = false;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (null == ((nb) this).field_C) {
                        statePc = 127;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (!((nb) this).field_C.field_pc) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    hf.field_c = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (((nb) this).field_C != null) {
                        statePc = 129;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (((nb) this).field_C.field_pc) {
                        statePc = 156;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    if (0 >= ((nb) this).field_C.field_Q) {
                        statePc = 137;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (((nb) this).field_A) {
                        statePc = 134;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (0 < ((nb) this).field_C.field_S) {
                        statePc = 134;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    ((nb) this).field_A = true;
                    pc discarded$45 = fc.a((byte) 78, 83, -1);
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (!((nb) this).field_A) {
                        statePc = 137;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if (~((nb) this).field_C.field_S >= ~(((nb) this).field_C.field_Q / 10)) {
                        statePc = 137;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    ((nb) this).field_A = false;
                    pc discarded$46 = fc.a((byte) -94, 29, -1);
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (((nb) this).field_C.field_ub < 0) {
                        statePc = 147;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    if (((nb) this).field_f) {
                        statePc = 142;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (((nb) this).field_C.field_Tb >= 3) {
                        statePc = 142;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    if (~(((nb) this).field_C.field_x / 2) >= ~((nb) this).field_C.field_Tb) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    ((nb) this).field_f = true;
                    pc discarded$47 = fc.a((byte) 55, 82, -1);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (!((nb) this).field_f) {
                        statePc = 148;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    if (((nb) this).field_C.field_Tb > 3) {
                        statePc = 146;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if (((nb) this).field_C.field_Tb > ((nb) this).field_C.field_x / 2) {
                        statePc = 146;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 146: {
                    ((nb) this).field_f = false;
                    statePc = 148;
                    continue stateLoop;
                }
                case 147: {
                    ((nb) this).field_f = false;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (((nb) this).field_y) {
                        statePc = 152;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (~((nb) this).field_C.field_rb >= ~(((nb) this).field_C.field_Eb / 4)) {
                        statePc = 151;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 151: {
                    ((nb) this).field_y = true;
                    pc discarded$48 = fc.a((byte) 108, 78, -1);
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (!((nb) this).field_y) {
                        statePc = 157;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (((nb) this).field_C.field_rb >= ((nb) this).field_C.field_Eb / 2) {
                        statePc = 155;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 155: {
                    ((nb) this).field_y = false;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    sn.field_n = false;
                    ((nb) this).field_y = false;
                    ((nb) this).field_A = false;
                    ((nb) this).field_f = false;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    var4 = ((nb) this).field_P + (oh.field_f << 4) << 4;
                    var6 = -32 % ((param0 - 1) / 59);
                    var5 = pi.field_c + -400 + (((nb) this).field_E >> 4) << 8;
                    if (di.field_g == -1) {
                        statePc = 445;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (4 == di.field_g) {
                        statePc = 445;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (di.field_g == 10) {
                        statePc = 445;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    if (qh.field_Yb != dl.field_M) {
                        statePc = 445;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    ((nb) this).field_C.field_vb = 0;
                    if (di.field_g != 0) {
                        statePc = 184;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var7 = qh.field_Yb;
                    switch (var7) {
                        case 1: statePc = 163; break;
                        case 2: statePc = 166; break;
                        case 3: statePc = 169; break;
                        case 4: statePc = 172; break;
                        case 6: statePc = 174; break;
                        case 7: statePc = 177; break;
                        case 9: statePc = 180; break;
                        case 10: statePc = 182; break;
                        default: statePc = 184; break;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (tj.field_c == 1) {
                        statePc = 165;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 165: {
                    int discarded$49 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 166: {
                    if (tj.field_c == 1) {
                        statePc = 168;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 168: {
                    int discarded$50 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 169: {
                    if (tj.field_c == 1) {
                        statePc = 171;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 171: {
                    int discarded$51 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 172: {
                    if (!((nb) this).field_X.f(-48)) {
                        statePc = 184;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    int discarded$52 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 174: {
                    if (tj.field_c == 1) {
                        statePc = 176;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 176: {
                    int discarded$53 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 177: {
                    if (((nb) this).field_X.f(-91)) {
                        statePc = 179;
                    } else {
                        statePc = 184;
                    }
                    continue stateLoop;
                }
                case 179: {
                    int discarded$54 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 180: {
                    if (!((nb) this).field_X.f(-73)) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    int discarded$55 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 182: {
                    if (!((nb) this).field_X.f(-50)) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    int discarded$56 = -1589;
                    this.k();
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (1 != di.field_g) {
                        statePc = 186;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var7 = qh.field_Yb;
                    switch (var7) {
                        case 1: statePc = -1; break;
                        case 2: statePc = -1; break;
                        case 3: statePc = -1; break;
                        case 4: statePc = -1; break;
                        case 5: statePc = -1; break;
                        case 6: statePc = -1; break;
                        case 7: statePc = -1; break;
                        case 8: statePc = -1; break;
                        case 9: statePc = -1; break;
                        case 11: statePc = -1; break;
                        case 12: statePc = -1; break;
                        case 13: statePc = -1; break;
                        default: statePc = 186; break;
                    }
                    continue stateLoop;
                }
                case 186: {
                    if (di.field_g == 7) {
                        statePc = 188;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 188: {
                    var7 = qh.field_Yb;
                    if (0 == var7) {
                        statePc = 196;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (var7 == 1) {
                        statePc = 200;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var7 == 2) {
                        statePc = 212;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    if (var7 != 3) {
                        statePc = 193;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var7 == 4) {
                        statePc = 226;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (var7 != 5) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (0 > ((nb) this).field_F) {
                        statePc = 231;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (((nb) this).field_C.field_Xb.length <= ((nb) this).field_F) {
                        statePc = 231;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (((nb) this).field_C.field_Xb[((nb) this).field_F] != 17) {
                        statePc = 231;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    int discarded$57 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 200: {
                    if (((nb) this).field_X.f(-46)) {
                        statePc = 211;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    ((nb) this).field_C.field_Zb.d(65536, 17);
                    if (si.field_t != 0) {
                        statePc = 231;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    var7_ref_jc = new jc(((nb) this).field_X.field_db);
                    var8 = 0;
                    var9_ref_wl = (wl) (Object) var7_ref_jc.b(2);
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (var9_ref_wl == null) {
                        statePc = 208;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    if (var9_ref_wl.field_y == 20) {
                        statePc = 206;
                    } else {
                        statePc = 207;
                    }
                    continue stateLoop;
                }
                case 206: {
                    var8 = 1;
                    statePc = 207;
                    continue stateLoop;
                }
                case 207: {
                    var9_ref_wl = (wl) (Object) var7_ref_jc.d(2);
                    statePc = 203;
                    continue stateLoop;
                }
                case 208: {
                    if (var8 == 0) {
                        statePc = 210;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 210: {
                    int discarded$58 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 211: {
                    int discarded$59 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 212: {
                    if (((nb) this).field_X.f(-93)) {
                        statePc = 220;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    var7_ref_nk__ = ((nb) this).field_C.field_gb;
                    var8 = 0;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    if (var7_ref_nk__.length <= var8) {
                        statePc = 231;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var9_ref_nk = var7_ref_nk__[var8];
                    if (var9_ref_nk == null) {
                        statePc = 219;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (37 != var9_ref_nk.field_N) {
                        statePc = 219;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    if (var9_ref_nk.field_C <= 350) {
                        statePc = 219;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    var9_ref_nk.field_C = 350;
                    statePc = 219;
                    continue stateLoop;
                }
                case 219: {
                    var8++;
                    statePc = 214;
                    continue stateLoop;
                }
                case 220: {
                    int discarded$60 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 221: {
                    if (((nb) this).field_F < 0) {
                        statePc = 231;
                    } else {
                        statePc = 222;
                    }
                    continue stateLoop;
                }
                case 222: {
                    if (((nb) this).field_F >= ((nb) this).field_C.field_Xb.length) {
                        statePc = 231;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    if (((nb) this).field_C.field_Xb[((nb) this).field_F] == 2) {
                        statePc = 225;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 225: {
                    int discarded$61 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 226: {
                    if (!((nb) this).field_X.f(-52)) {
                        statePc = 231;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    int discarded$62 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 228: {
                    if (((nb) this).field_X.f(-63)) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    int discarded$63 = -1589;
                    this.k();
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (3 == di.field_g) {
                        statePc = 233;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var7 = qh.field_Yb;
                    if (var7 == 2) {
                        statePc = 240;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (var7 != 1) {
                        statePc = 236;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 236: {
                    if (4 != var7) {
                        statePc = 238;
                    } else {
                        statePc = 245;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (var7 == 5) {
                        statePc = 248;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (((nb) this).field_C.field_ub >= 0) {
                        statePc = 250;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    int discarded$64 = -1589;
                    this.k();
                    statePc = 250;
                    continue stateLoop;
                }
                case 242: {
                    if (tj.field_c > 0) {
                        statePc = 244;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 244: {
                    int discarded$65 = -1589;
                    this.k();
                    statePc = 250;
                    continue stateLoop;
                }
                case 245: {
                    if (((nb) this).field_X.f(-128)) {
                        statePc = 247;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 247: {
                    int discarded$66 = -1589;
                    this.k();
                    statePc = 250;
                    continue stateLoop;
                }
                case 248: {
                    if (!((nb) this).field_X.f(-70)) {
                        statePc = 250;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    int discarded$67 = -1589;
                    this.k();
                    statePc = 250;
                    continue stateLoop;
                }
                case 250: {
                    if (di.field_g == 5) {
                        statePc = 252;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 252: {
                    var7 = qh.field_Yb;
                    if (var7 != 0) {
                        statePc = 254;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (1 != var7) {
                        statePc = 256;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 256: {
                    if (var7 != 2) {
                        statePc = 266;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 258: {
                    if (((nb) this).field_C.field_Vb != null) {
                        statePc = 260;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 260: {
                    int discarded$68 = -1589;
                    this.k();
                    statePc = 266;
                    continue stateLoop;
                }
                case 261: {
                    if (((nb) this).field_X.f(-74)) {
                        statePc = 263;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 263: {
                    int discarded$69 = -1589;
                    this.k();
                    statePc = 266;
                    continue stateLoop;
                }
                case 264: {
                    if (!((nb) this).field_X.f(-100)) {
                        statePc = 266;
                    } else {
                        statePc = 265;
                    }
                    continue stateLoop;
                }
                case 265: {
                    int discarded$70 = -1589;
                    this.k();
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    if (9 != di.field_g) {
                        statePc = 291;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    var7 = qh.field_Yb;
                    if (0 != var7) {
                        statePc = 269;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (var7 != 1) {
                        statePc = 271;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (var7 == 3) {
                        statePc = 281;
                    } else {
                        statePc = 272;
                    }
                    continue stateLoop;
                }
                case 272: {
                    if (var7 == 4) {
                        statePc = 283;
                    } else {
                        statePc = 273;
                    }
                    continue stateLoop;
                }
                case 273: {
                    if (var7 == 5) {
                        statePc = 288;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (((nb) this).field_F < 0) {
                        statePc = 291;
                    } else {
                        statePc = 276;
                    }
                    continue stateLoop;
                }
                case 276: {
                    if (~((nb) this).field_F <= ~((nb) this).field_C.field_Xb.length) {
                        statePc = 291;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (((nb) this).field_C.field_Xb[((nb) this).field_F] != 1) {
                        statePc = 291;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 278: {
                    int discarded$71 = -1589;
                    this.k();
                    statePc = 291;
                    continue stateLoop;
                }
                case 279: {
                    if (!((nb) this).field_X.f(-109)) {
                        statePc = 291;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    int discarded$72 = -1589;
                    this.k();
                    statePc = 291;
                    continue stateLoop;
                }
                case 281: {
                    if (!((nb) this).field_X.f(-47)) {
                        statePc = 291;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    int discarded$73 = -1589;
                    this.k();
                    statePc = 291;
                    continue stateLoop;
                }
                case 283: {
                    if (((nb) this).field_F < 0) {
                        statePc = 291;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    if (~((nb) this).field_F <= ~((nb) this).field_C.field_Xb.length) {
                        statePc = 291;
                    } else {
                        statePc = 285;
                    }
                    continue stateLoop;
                }
                case 285: {
                    if (((nb) this).field_C.field_Xb[((nb) this).field_F] == 15) {
                        statePc = 287;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 287: {
                    int discarded$74 = -1589;
                    this.k();
                    statePc = 291;
                    continue stateLoop;
                }
                case 288: {
                    if (((nb) this).field_X.f(-64)) {
                        statePc = 290;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 290: {
                    int discarded$75 = -1589;
                    this.k();
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    var7_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if (var7_ref_mb == null) {
                        statePc = 445;
                    } else {
                        statePc = 293;
                    }
                    continue stateLoop;
                }
                case 293: {
                    if (var7_ref_mb.field_Nb != 6) {
                        statePc = 301;
                    } else {
                        statePc = 294;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var8 = Math.abs(var7_ref_mb.field_hc - ((nb) this).field_C.field_hc);
                    var9 = Math.abs(var7_ref_mb.field_Gb + -((nb) this).field_C.field_Gb);
                    if (8192 <= var8) {
                        statePc = 301;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 295: {
                    if (var9 >= 1024) {
                        statePc = 301;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (di.field_g != 0) {
                        statePc = 300;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (6 < qh.field_Yb) {
                        statePc = 300;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    if (((nb) this).field_C.field_U != 0) {
                        statePc = 301;
                    } else {
                        statePc = 300;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var7_ref_mb.f(128);
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (var7_ref_mb.field_Nb != 2) {
                        statePc = 307;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    if (di.field_g != 3) {
                        statePc = 307;
                    } else {
                        statePc = 303;
                    }
                    continue stateLoop;
                }
                case 303: {
                    if (5 > qh.field_Yb) {
                        statePc = 305;
                    } else {
                        statePc = 307;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var8 = -((nb) this).field_C.field_hc + var7_ref_mb.field_hc;
                    var8 = var8 / 1000;
                    var9 = -((nb) this).field_C.field_Gb + var7_ref_mb.field_Gb;
                    var9 = var9 / 1000;
                    if (var9 * var9 + var8 * (4 * var8) >= 50) {
                        statePc = 307;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 306: {
                    var7_ref_mb.f(128);
                    statePc = 307;
                    continue stateLoop;
                }
                case 307: {
                    if (var7_ref_mb.field_Nb == 9) {
                        statePc = 309;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (1 != di.field_g) {
                        statePc = 317;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (qh.field_Yb == 13) {
                        statePc = 312;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 312: {
                    if (tj.field_c <= 1) {
                        statePc = 314;
                    } else {
                        statePc = 313;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var7_ref_mb.field_Nb = 7;
                    statePc = 317;
                    continue stateLoop;
                }
                case 314: {
                    if (~var7_ref_mb.field_Eb < ~var7_ref_mb.field_rb) {
                        statePc = 316;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 316: {
                    tj.field_c = 2;
                    statePc = 317;
                    continue stateLoop;
                }
                case 317: {
                    if (2 != var7_ref_mb.field_Nb) {
                        statePc = 342;
                    } else {
                        statePc = 318;
                    }
                    continue stateLoop;
                }
                case 318: {
                    if (3 == di.field_g) {
                        statePc = 322;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 319: {
                    if (5 == di.field_g) {
                        statePc = 322;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (9 != di.field_g) {
                        statePc = 342;
                    } else {
                        statePc = 322;
                    }
                    continue stateLoop;
                }
                case 322: {
                    if (di.field_g != 9) {
                        statePc = 324;
                    } else {
                        statePc = 323;
                    }
                    continue stateLoop;
                }
                case 323: {
                    stackOut_323_0 = 1;
                    stackIn_325_0 = stackOut_323_0;
                    statePc = 325;
                    continue stateLoop;
                }
                case 324: {
                    stackOut_324_0 = 0;
                    stackIn_325_0 = stackOut_324_0;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    var8 = stackIn_325_0;
                    stackOut_325_0 = var7_ref_mb.field_Gb;
                    stackIn_327_0 = stackOut_325_0;
                    stackIn_326_0 = stackOut_325_0;
                    if (var8 == 0) {
                        statePc = 327;
                    } else {
                        statePc = 326;
                    }
                    continue stateLoop;
                }
                case 326: {
                    stackOut_326_0 = stackIn_326_0;
                    stackOut_326_1 = -60000;
                    stackIn_328_0 = stackOut_326_0;
                    stackIn_328_1 = stackOut_326_1;
                    statePc = 328;
                    continue stateLoop;
                }
                case 327: {
                    stackOut_327_0 = stackIn_327_0;
                    stackOut_327_1 = -75000;
                    stackIn_328_0 = stackOut_327_0;
                    stackIn_328_1 = stackOut_327_1;
                    statePc = 328;
                    continue stateLoop;
                }
                case 328: {
                    if (stackIn_328_0 <= stackIn_328_1) {
                        statePc = 342;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    if (var7_ref_mb.field_B.f(7)) {
                        statePc = 331;
                    } else {
                        statePc = 342;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var9_ref_je = new je(3, 0, 10 + ((nb) this).field_X.field_r);
                    var9_ref_je.field_u = ((int)(Math.random() * (double)((nb) this).field_X.field_ab.a(19) / 4.0) + -(((nb) this).field_X.field_ab.a(32) / 8) << 4) - -((nb) this).field_C.field_hc;
                    var9_ref_je.field_p = true;
                    if (var7_ref_mb.field_K <= 0) {
                        statePc = 334;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    if (384000 > var7_ref_mb.field_hc) {
                        statePc = 336;
                    } else {
                        statePc = 334;
                    }
                    continue stateLoop;
                }
                case 334: {
                    if (var7_ref_mb.field_hc >= 64000) {
                        statePc = 337;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var9_ref_je.field_u = var7_ref_mb.field_hc - -5000;
                    statePc = 338;
                    continue stateLoop;
                }
                case 337: {
                    var9_ref_je.field_u = var7_ref_mb.field_hc - 5000;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    stackOut_338_0 = (je) var9_ref_je;
                    stackIn_340_0 = stackOut_338_0;
                    stackIn_339_0 = stackOut_338_0;
                    if (var8 != 0) {
                        statePc = 340;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    stackOut_339_0 = (je) (Object) stackIn_339_0;
                    stackOut_339_1 = -80000;
                    stackIn_341_0 = stackOut_339_0;
                    stackIn_341_1 = stackOut_339_1;
                    statePc = 341;
                    continue stateLoop;
                }
                case 340: {
                    stackOut_340_0 = (je) (Object) stackIn_340_0;
                    stackOut_340_1 = -65000;
                    stackIn_341_0 = stackOut_340_0;
                    stackIn_341_1 = stackOut_340_1;
                    statePc = 341;
                    continue stateLoop;
                }
                case 341: {
                    stackIn_341_0.field_y = stackIn_341_1;
                    var7_ref_mb.field_B.a(3, (ck) (Object) var9_ref_je);
                    var7_ref_mb.g(5);
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (var7_ref_mb.field_Nb == 2) {
                        statePc = 344;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 344: {
                    if (di.field_g == 3) {
                        statePc = 346;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 346: {
                    var8 = -55000;
                    if (var7_ref_mb.field_Nb != 2) {
                        statePc = 348;
                    } else {
                        statePc = 347;
                    }
                    continue stateLoop;
                }
                case 347: {
                    var8 = -75000;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    if (var8 >= var7_ref_mb.field_Gb) {
                        statePc = 380;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    if (var7_ref_mb.field_B.f(7)) {
                        statePc = 351;
                    } else {
                        statePc = 380;
                    }
                    continue stateLoop;
                }
                case 351: {
                    var9_ref_je = new je(3, 0, 10 + ((nb) this).field_X.field_r);
                    var9_ref_je.field_u = ((int)(Math.random() * (double)((nb) this).field_X.field_ab.a(-123) / 4.0) - ((nb) this).field_X.field_ab.a(41) / 8 << 4) + ((nb) this).field_C.field_hc;
                    if (~var9_ref_je.field_u > ~(-5000 + var7_ref_mb.field_hc)) {
                        statePc = 353;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 353: {
                    var9_ref_je.field_u = var7_ref_mb.field_hc + -5000;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    var9_ref_je.field_y = -60000;
                    if (~var9_ref_je.field_u < ~(var7_ref_mb.field_hc - -5000)) {
                        statePc = 356;
                    } else {
                        statePc = 357;
                    }
                    continue stateLoop;
                }
                case 356: {
                    var9_ref_je.field_u = var7_ref_mb.field_hc - -5000;
                    statePc = 357;
                    continue stateLoop;
                }
                case 357: {
                    var9_ref_je.field_p = true;
                    var7_ref_mb.field_B.a(3, (ck) (Object) var9_ref_je);
                    var7_ref_mb.g(5);
                    var9_ref_je = new je(0, var7_ref_mb.field_Xb[0], ((nb) this).field_X.field_r + 20);
                    var10 = 1;
                    var11 = -var7_ref_mb.field_hc + ((nb) this).field_C.field_hc;
                    var12_int = -var7_ref_mb.field_Gb + (((nb) this).field_C.field_Gb + -(((nb) this).field_C.field_Db * 8));
                    if (Math.abs(var11) <= 80000) {
                        statePc = 359;
                    } else {
                        statePc = 358;
                    }
                    continue stateLoop;
                }
                case 358: {
                    var10 = 0;
                    statePc = 359;
                    continue stateLoop;
                }
                case 359: {
                    if (2 == var7_ref_mb.field_Nb) {
                        statePc = 361;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 361: {
                    var10 = 0;
                    statePc = 362;
                    continue stateLoop;
                }
                case 362: {
                    if (var10 == 0) {
                        statePc = 380;
                    } else {
                        statePc = 363;
                    }
                    continue stateLoop;
                }
                case 363: {
                    if (var11 < 0) {
                        statePc = 365;
                    } else {
                        statePc = 364;
                    }
                    continue stateLoop;
                }
                case 364: {
                    bj.field_h = 1;
                    statePc = 366;
                    continue stateLoop;
                }
                case 365: {
                    bj.field_h = -1;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var9_ref_je.field_B = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var15_ref_nk__ = var7_ref_mb.field_Zb.a(0, var7_ref_mb, new nk[0], var9_ref_je.field_B * bj.field_h, var7_ref_mb.field_Xb[0]);
                    var7_ref_mb.field_Zb.b((byte) -128, 0, bj.field_h, 0);
                    var16 = 0;
                    var17 = 0;
                    statePc = 367;
                    continue stateLoop;
                }
                case 367: {
                    if (~var15_ref_nk__.length >= ~var17) {
                        statePc = 369;
                    } else {
                        statePc = 368;
                    }
                    continue stateLoop;
                }
                case 368: {
                    var16 = var16 + var15_ref_nk__[var17].field_V;
                    var17++;
                    statePc = 367;
                    continue stateLoop;
                }
                case 369: {
                    if (var15_ref_nk__.length > 0) {
                        statePc = 371;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 371: {
                    var12_int = var12_int - var16 / var15_ref_nk__.length;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var9_ref_je.field_B = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var9_ref_je.field_y = ((nb) this).field_C.field_Gb;
                    var9_ref_je.field_u = ((nb) this).field_C.field_hc;
                    if (bj.field_h >= 0) {
                        statePc = 376;
                    } else {
                        statePc = 373;
                    }
                    continue stateLoop;
                }
                case 373: {
                    if (16384 < var9_ref_je.field_B) {
                        statePc = 375;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 375: {
                    var9_ref_je.field_B = var9_ref_je.field_B - 65536;
                    statePc = 379;
                    continue stateLoop;
                }
                case 376: {
                    if (var9_ref_je.field_B < -16384) {
                        statePc = 378;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 378: {
                    var9_ref_je.field_B = var9_ref_je.field_B + 65536;
                    statePc = 379;
                    continue stateLoop;
                }
                case 379: {
                    var9_ref_je.field_p = true;
                    var7_ref_mb.field_B.a(3, (ck) (Object) var9_ref_je);
                    statePc = 380;
                    continue stateLoop;
                }
                case 380: {
                    if (3 == var7_ref_mb.field_Nb) {
                        statePc = 384;
                    } else {
                        statePc = 381;
                    }
                    continue stateLoop;
                }
                case 381: {
                    if (4 == var7_ref_mb.field_Nb) {
                        statePc = 384;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 382: {
                    if (var7_ref_mb.field_Nb != 9) {
                        statePc = 444;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    var7_ref_mb.field_pc = false;
                    if (var7_ref_mb.field_B.f(7)) {
                        statePc = 386;
                    } else {
                        statePc = 444;
                    }
                    continue stateLoop;
                }
                case 386: {
                    var8 = 1;
                    if (di.field_g != 1) {
                        statePc = 393;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    if (qh.field_Yb > 12) {
                        statePc = 393;
                    } else {
                        statePc = 388;
                    }
                    continue stateLoop;
                }
                case 388: {
                    if (var7_ref_mb.field_Lb) {
                        statePc = 390;
                    } else {
                        statePc = 391;
                    }
                    continue stateLoop;
                }
                case 390: {
                    var8 = 0;
                    statePc = 391;
                    continue stateLoop;
                }
                case 391: {
                    if (var7_ref_mb.field_hc - ((nb) this).field_C.field_hc <= 100000) {
                        statePc = 393;
                    } else {
                        statePc = 392;
                    }
                    continue stateLoop;
                }
                case 392: {
                    var8 = 0;
                    statePc = 393;
                    continue stateLoop;
                }
                case 393: {
                    if (var7_ref_mb.field_Nb != 9) {
                        statePc = 395;
                    } else {
                        statePc = 394;
                    }
                    continue stateLoop;
                }
                case 394: {
                    var8 = 0;
                    statePc = 395;
                    continue stateLoop;
                }
                case 395: {
                    var9 = 0;
                    if (5 == var7_ref_mb.field_Nb) {
                        statePc = 397;
                    } else {
                        statePc = 399;
                    }
                    continue stateLoop;
                }
                case 397: {
                    if (var7_ref_mb.field_Gb <= -20000) {
                        statePc = 399;
                    } else {
                        statePc = 398;
                    }
                    continue stateLoop;
                }
                case 398: {
                    var10_ref_je = new je(3, 0, 1 + ((nb) this).field_X.field_r);
                    var10_ref_je.field_y = -20000 + var7_ref_mb.field_Gb;
                    var10_ref_je.field_u = var7_ref_mb.field_hc;
                    var10_ref_je.field_p = true;
                    var7_ref_mb.field_B.a(3, (ck) (Object) var10_ref_je);
                    var7_ref_mb.g(5);
                    statePc = 399;
                    continue stateLoop;
                }
                case 399: {
                    if (var7_ref_mb.field_Nb != 9) {
                        statePc = 407;
                    } else {
                        statePc = 400;
                    }
                    continue stateLoop;
                }
                case 400: {
                    if (var7_ref_mb.field_hc > 16000) {
                        statePc = 402;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    var7_ref_mb.field_U = 1;
                    statePc = 406;
                    continue stateLoop;
                }
                case 402: {
                    if (var7_ref_mb.field_hc < 213000) {
                        statePc = 404;
                    } else {
                        statePc = 403;
                    }
                    continue stateLoop;
                }
                case 403: {
                    var7_ref_mb.field_U = -1;
                    statePc = 406;
                    continue stateLoop;
                }
                case 404: {
                    if (var7_ref_mb.field_U != 0) {
                        statePc = 406;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    var7_ref_mb.field_U = 1;
                    statePc = 406;
                    continue stateLoop;
                }
                case 406: {
                    var9 = (int)(100.0 * Math.random()) - -100;
                    statePc = 419;
                    continue stateLoop;
                }
                case 407: {
                    if (var7_ref_mb.field_Nb != 4) {
                        statePc = 419;
                    } else {
                        statePc = 408;
                    }
                    continue stateLoop;
                }
                case 408: {
                    if (var7_ref_mb.field_Lb) {
                        statePc = 419;
                    } else {
                        statePc = 409;
                    }
                    continue stateLoop;
                }
                case 409: {
                    if (5.0 <= 100.0 * Math.random()) {
                        statePc = 412;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    if (var7_ref_mb.field_r == 5) {
                        statePc = 417;
                    } else {
                        statePc = 412;
                    }
                    continue stateLoop;
                }
                case 412: {
                    if (~((nb) this).field_C.field_hc > ~(var7_ref_mb.field_hc - 1000)) {
                        statePc = 414;
                    } else {
                        statePc = 415;
                    }
                    continue stateLoop;
                }
                case 414: {
                    var7_ref_mb.field_U = -1;
                    statePc = 415;
                    continue stateLoop;
                }
                case 415: {
                    if (~((nb) this).field_C.field_hc >= ~(1000 + var7_ref_mb.field_hc)) {
                        statePc = 418;
                    } else {
                        statePc = 416;
                    }
                    continue stateLoop;
                }
                case 416: {
                    var7_ref_mb.field_U = 1;
                    statePc = 418;
                    continue stateLoop;
                }
                case 417: {
                    var10_ref_je = new je(3, 0, 1 + ((nb) this).field_X.field_r);
                    var10_ref_je.field_y = -20000 + var7_ref_mb.field_Gb;
                    var10_ref_je.field_p = true;
                    var10_ref_je.field_u = ((nb) this).field_C.field_hc;
                    var7_ref_mb.field_B.a(3, (ck) (Object) var10_ref_je);
                    var7_ref_mb.g(5);
                    statePc = 418;
                    continue stateLoop;
                }
                case 418: {
                    var9 = (int)(100.0 * Math.random()) - -100;
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    var10_ref_je = new je(0, var7_ref_mb.field_Xb[0], var9 + 2 + ((nb) this).field_X.field_r);
                    var11 = ((nb) this).field_C.field_hc - var7_ref_mb.field_hc;
                    var12_int = -(((nb) this).field_C.field_Db * 8) + ((nb) this).field_C.field_Gb - var7_ref_mb.field_Gb;
                    if (0 != var7_ref_mb.field_Xb[0]) {
                        statePc = 422;
                    } else {
                        statePc = 420;
                    }
                    continue stateLoop;
                }
                case 420: {
                    if (Math.abs(var11) <= 80000) {
                        statePc = 422;
                    } else {
                        statePc = 421;
                    }
                    continue stateLoop;
                }
                case 421: {
                    var8 = 0;
                    statePc = 422;
                    continue stateLoop;
                }
                case 422: {
                    if (var7_ref_mb.field_Xb[0] != 13) {
                        statePc = 426;
                    } else {
                        statePc = 423;
                    }
                    continue stateLoop;
                }
                case 423: {
                    if (Math.abs(var11) > 150000) {
                        statePc = 425;
                    } else {
                        statePc = 426;
                    }
                    continue stateLoop;
                }
                case 425: {
                    var8 = 0;
                    statePc = 426;
                    continue stateLoop;
                }
                case 426: {
                    if (var8 == 0) {
                        statePc = 444;
                    } else {
                        statePc = 427;
                    }
                    continue stateLoop;
                }
                case 427: {
                    if (0 > var11) {
                        statePc = 429;
                    } else {
                        statePc = 428;
                    }
                    continue stateLoop;
                }
                case 428: {
                    bj.field_h = 1;
                    statePc = 430;
                    continue stateLoop;
                }
                case 429: {
                    bj.field_h = -1;
                    statePc = 430;
                    continue stateLoop;
                }
                case 430: {
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var10_ref_je.field_B = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var15_ref_nk__ = var7_ref_mb.field_Zb.a(0, var7_ref_mb, new nk[0], var10_ref_je.field_B * bj.field_h, var7_ref_mb.field_Xb[0]);
                    var7_ref_mb.field_Zb.b((byte) -128, 0, bj.field_h, 0);
                    var16 = 0;
                    var20 = 0;
                    var17 = var20;
                    statePc = 431;
                    continue stateLoop;
                }
                case 431: {
                    if (~var20 <= ~var15_ref_nk__.length) {
                        statePc = 433;
                    } else {
                        statePc = 432;
                    }
                    continue stateLoop;
                }
                case 432: {
                    var16 = var16 + var15_ref_nk__[var20].field_V;
                    var20++;
                    statePc = 431;
                    continue stateLoop;
                }
                case 433: {
                    if (0 < var15_ref_nk__.length) {
                        statePc = 435;
                    } else {
                        statePc = 436;
                    }
                    continue stateLoop;
                }
                case 435: {
                    var12_int = var12_int - var16 / var15_ref_nk__.length;
                    statePc = 436;
                    continue stateLoop;
                }
                case 436: {
                    var13_double = Math.atan2((double)var11, (double)(-var12_int));
                    var10_ref_je.field_B = (int)(var13_double * 65536.0 / 6.283185307179586);
                    var10_ref_je.field_u = ((nb) this).field_C.field_hc;
                    if (0 > bj.field_h) {
                        statePc = 439;
                    } else {
                        statePc = 437;
                    }
                    continue stateLoop;
                }
                case 437: {
                    if (-16384 <= var10_ref_je.field_B) {
                        statePc = 442;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    var10_ref_je.field_B = var10_ref_je.field_B + 65536;
                    statePc = 442;
                    continue stateLoop;
                }
                case 439: {
                    if (var10_ref_je.field_B > 16384) {
                        statePc = 441;
                    } else {
                        statePc = 442;
                    }
                    continue stateLoop;
                }
                case 441: {
                    var10_ref_je.field_B = var10_ref_je.field_B - 65536;
                    statePc = 442;
                    continue stateLoop;
                }
                case 442: {
                    var10_ref_je.field_p = true;
                    var10_ref_je.field_y = ((nb) this).field_C.field_Gb;
                    var7_ref_mb.field_B.a(3, (ck) (Object) var10_ref_je);
                    if (var7_ref_mb.field_Xb[0] != 13) {
                        statePc = 444;
                    } else {
                        statePc = 443;
                    }
                    continue stateLoop;
                }
                case 443: {
                    var10_ref_je.field_x = var10_ref_je.field_x + 50;
                    statePc = 444;
                    continue stateLoop;
                }
                case 444: {
                    var7_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -88);
                    statePc = 292;
                    continue stateLoop;
                }
                case 445: {
                    var7 = 320;
                    if (0 == di.field_g) {
                        statePc = 451;
                    } else {
                        statePc = 446;
                    }
                    continue stateLoop;
                }
                case 446: {
                    if (0 == jj.field_d) {
                        statePc = 451;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 447: {
                    if (((nb) this).field_C == null) {
                        statePc = 451;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    if (((nb) this).field_C.field_Xb == null) {
                        statePc = 451;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 449: {
                    if (((nb) this).field_X.field_j) {
                        statePc = 451;
                    } else {
                        statePc = 450;
                    }
                    continue stateLoop;
                }
                case 450: {
                    ((nb) this).field_F = Math.max(0, Math.min(((nb) this).field_C.field_Xb.length + -1, -jj.field_d + ((nb) this).field_F));
                    rc.field_l = 100;
                    statePc = 451;
                    continue stateLoop;
                }
                case 451: {
                    if (di.field_g != 1) {
                        statePc = 465;
                    } else {
                        statePc = 452;
                    }
                    continue stateLoop;
                }
                case 452: {
                    if (qh.field_Yb != 6) {
                        statePc = 465;
                    } else {
                        statePc = 453;
                    }
                    continue stateLoop;
                }
                case 453: {
                    if (fc.field_e[97]) {
                        statePc = 456;
                    } else {
                        statePc = 454;
                    }
                    continue stateLoop;
                }
                case 454: {
                    if (fc.field_e[on.field_h]) {
                        statePc = 456;
                    } else {
                        statePc = 457;
                    }
                    continue stateLoop;
                }
                case 456: {
                    tj.field_c = tj.field_c | 1;
                    statePc = 457;
                    continue stateLoop;
                }
                case 457: {
                    if (fc.field_e[98]) {
                        statePc = 460;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    if (!fc.field_e[fm.field_d]) {
                        statePc = 461;
                    } else {
                        statePc = 460;
                    }
                    continue stateLoop;
                }
                case 460: {
                    tj.field_c = tj.field_c | 2;
                    statePc = 461;
                    continue stateLoop;
                }
                case 461: {
                    if (fc.field_e[99]) {
                        statePc = 464;
                    } else {
                        statePc = 462;
                    }
                    continue stateLoop;
                }
                case 462: {
                    if (fc.field_e[pd.field_V]) {
                        statePc = 464;
                    } else {
                        statePc = 465;
                    }
                    continue stateLoop;
                }
                case 464: {
                    tj.field_c = tj.field_c | 4;
                    statePc = 465;
                    continue stateLoop;
                }
                case 465: {
                    if (!fc.field_e[b.field_b]) {
                        statePc = 468;
                    } else {
                        statePc = 466;
                    }
                    continue stateLoop;
                }
                case 466: {
                    if (((nb) this).field_C != null) {
                        statePc = 470;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    if (0 >= lk.field_eb) {
                        statePc = 471;
                    } else {
                        statePc = 469;
                    }
                    continue stateLoop;
                }
                case 469: {
                    lk.field_eb = lk.field_eb - 1;
                    statePc = 471;
                    continue stateLoop;
                }
                case 470: {
                    lk.field_eb = 16;
                    statePc = 471;
                    continue stateLoop;
                }
                case 471: {
                    if (((nb) this).field_C == null) {
                        statePc = 478;
                    } else {
                        statePc = 472;
                    }
                    continue stateLoop;
                }
                case 472: {
                    if (!((nb) this).field_C.field_pc) {
                        statePc = 478;
                    } else {
                        statePc = 473;
                    }
                    continue stateLoop;
                }
                case 473: {
                    if (((nb) this).field_C.field_Hb) {
                        statePc = 478;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (((nb) this).field_C.field_Qb < 0) {
                        statePc = 477;
                    } else {
                        statePc = 475;
                    }
                    continue stateLoop;
                }
                case 475: {
                    if (((nb) this).field_C.field_Qb <= 100) {
                        statePc = 478;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    stackOut_477_0 = 1;
                    stackIn_479_0 = stackOut_477_0;
                    statePc = 479;
                    continue stateLoop;
                }
                case 478: {
                    stackOut_478_0 = 0;
                    stackIn_479_0 = stackOut_478_0;
                    statePc = 479;
                    continue stateLoop;
                }
                case 479: {
                    var8 = stackIn_479_0;
                    if (null == ((nb) this).field_C) {
                        statePc = 484;
                    } else {
                        statePc = 480;
                    }
                    continue stateLoop;
                }
                case 480: {
                    if (!si.field_p) {
                        statePc = 484;
                    } else {
                        statePc = 481;
                    }
                    continue stateLoop;
                }
                case 481: {
                    if (!((nb) this).field_C.field_pc) {
                        statePc = 484;
                    } else {
                        statePc = 482;
                    }
                    continue stateLoop;
                }
                case 482: {
                    if (((nb) this).field_C.field_Qb != 0) {
                        statePc = 484;
                    } else {
                        statePc = 483;
                    }
                    continue stateLoop;
                }
                case 483: {
                    ((nb) this).field_V = ((nb) this).field_E + (-(((nb) this).field_C.field_Gb >> 4) + -3200);
                    ((nb) this).field_p = 5120 + -(((nb) this).field_C.field_hc >> 4) + ((nb) this).field_P;
                    statePc = 484;
                    continue stateLoop;
                }
                case 484: {
                    if (ri.field_b == null) {
                        statePc = 492;
                    } else {
                        statePc = 485;
                    }
                    continue stateLoop;
                }
                case 485: {
                    if (((nb) this).field_X.field_j) {
                        statePc = 492;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 486: {
                    var9 = Math.max(0, Math.min(((nb) this).field_X.field_ab.a(-127) + -10240, (ri.field_b.field_U >> 4) - 5120));
                    var10 = 3200 + (ri.field_b.field_A >> 4);
                    if (~var9 <= ~((nb) this).field_P) {
                        statePc = 488;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    ((nb) this).field_P = Math.max(var9, -500 + ((nb) this).field_P);
                    statePc = 489;
                    continue stateLoop;
                }
                case 488: {
                    ((nb) this).field_P = Math.min(var9, ((nb) this).field_P + 500);
                    statePc = 489;
                    continue stateLoop;
                }
                case 489: {
                    if (~((nb) this).field_E >= ~var10) {
                        statePc = 491;
                    } else {
                        statePc = 490;
                    }
                    continue stateLoop;
                }
                case 490: {
                    ((nb) this).field_E = Math.max(var10, -500 + ((nb) this).field_E);
                    statePc = 613;
                    continue stateLoop;
                }
                case 491: {
                    ((nb) this).field_E = Math.min(var10, 500 + ((nb) this).field_E);
                    statePc = 613;
                    continue stateLoop;
                }
                case 492: {
                    if (!dm.field_c) {
                        statePc = 533;
                    } else {
                        statePc = 493;
                    }
                    continue stateLoop;
                }
                case 493: {
                    var9 = 0;
                    var10 = ((nb) this).field_X.field_ab.a(-126) + -10240;
                    var11 = -3000;
                    var12_int = 1024;
                    var13 = 0;
                    if (lb.field_gc == 2) {
                        statePc = 516;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    if (0 != (4 & sf.field_d)) {
                        statePc = 509;
                    } else {
                        statePc = 495;
                    }
                    continue stateLoop;
                }
                case 495: {
                    if (((nb) this).field_C == null) {
                        statePc = 517;
                    } else {
                        statePc = 496;
                    }
                    continue stateLoop;
                }
                case 496: {
                    if (var8 != 0) {
                        statePc = 517;
                    } else {
                        statePc = 497;
                    }
                    continue stateLoop;
                }
                case 497: {
                    if (si.field_p) {
                        statePc = 499;
                    } else {
                        statePc = 517;
                    }
                    continue stateLoop;
                }
                case 499: {
                    if (~((nb) this).field_P > ~var9) {
                        statePc = 501;
                    } else {
                        statePc = 502;
                    }
                    continue stateLoop;
                }
                case 501: {
                    ((nb) this).field_P = var9;
                    statePc = 502;
                    continue stateLoop;
                }
                case 502: {
                    if (~((nb) this).field_P >= ~var10) {
                        statePc = 504;
                    } else {
                        statePc = 503;
                    }
                    continue stateLoop;
                }
                case 503: {
                    ((nb) this).field_P = var10;
                    statePc = 504;
                    continue stateLoop;
                }
                case 504: {
                    if (((nb) this).field_E >= var11) {
                        statePc = 506;
                    } else {
                        statePc = 505;
                    }
                    continue stateLoop;
                }
                case 505: {
                    ((nb) this).field_E = var11;
                    statePc = 506;
                    continue stateLoop;
                }
                case 506: {
                    if (((nb) this).field_E <= var12_int) {
                        statePc = 508;
                    } else {
                        statePc = 507;
                    }
                    continue stateLoop;
                }
                case 507: {
                    ((nb) this).field_E = var12_int;
                    statePc = 508;
                    continue stateLoop;
                }
                case 508: {
                    ((nb) this).field_P = ((nb) this).field_p + ((((nb) this).field_C.field_hc >> 4) + -5120);
                    ((nb) this).field_E = 3200 + ((nb) this).field_V + (((nb) this).field_C.field_Gb >> 4);
                    statePc = 517;
                    continue stateLoop;
                }
                case 509: {
                    var13 = 1;
                    var14 = pa.field_c - oh.field_f;
                    var15 = -pi.field_c + la.field_a;
                    if (ui.field_G) {
                        statePc = 511;
                    } else {
                        statePc = 512;
                    }
                    continue stateLoop;
                }
                case 511: {
                    var14 = -var14;
                    statePc = 512;
                    continue stateLoop;
                }
                case 512: {
                    pa.field_c = oh.field_f;
                    if (ik.field_h) {
                        statePc = 514;
                    } else {
                        statePc = 515;
                    }
                    continue stateLoop;
                }
                case 514: {
                    var15 = -var15;
                    statePc = 515;
                    continue stateLoop;
                }
                case 515: {
                    la.field_a = pi.field_c;
                    ((nb) this).field_P = ((nb) this).field_P - 16 * var14;
                    ((nb) this).field_E = ((nb) this).field_E - var15 * 16;
                    var8 = 0;
                    statePc = 517;
                    continue stateLoop;
                }
                case 516: {
                    la.field_a = pi.field_c;
                    pa.field_c = oh.field_f;
                    var8 = 0;
                    statePc = 517;
                    continue stateLoop;
                }
                case 517: {
                    if (~var9 >= ~((nb) this).field_P) {
                        statePc = 519;
                    } else {
                        statePc = 518;
                    }
                    continue stateLoop;
                }
                case 518: {
                    ((nb) this).field_P = var9;
                    statePc = 519;
                    continue stateLoop;
                }
                case 519: {
                    if (~var10 > ~((nb) this).field_P) {
                        statePc = 521;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 521: {
                    ((nb) this).field_P = var10;
                    statePc = 522;
                    continue stateLoop;
                }
                case 522: {
                    if (~((nb) this).field_E <= ~var11) {
                        statePc = 525;
                    } else {
                        statePc = 523;
                    }
                    continue stateLoop;
                }
                case 523: {
                    if (var8 != 0) {
                        statePc = 525;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 524: {
                    ((nb) this).field_E = var11;
                    statePc = 525;
                    continue stateLoop;
                }
                case 525: {
                    if (~var12_int > ~((nb) this).field_E) {
                        statePc = 527;
                    } else {
                        statePc = 528;
                    }
                    continue stateLoop;
                }
                case 527: {
                    ((nb) this).field_E = var12_int;
                    statePc = 528;
                    continue stateLoop;
                }
                case 528: {
                    if (var13 == 0) {
                        statePc = 613;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    if (((nb) this).field_C != null) {
                        statePc = 531;
                    } else {
                        statePc = 613;
                    }
                    continue stateLoop;
                }
                case 531: {
                    ((nb) this).field_V = -3200 + -(((nb) this).field_C.field_Gb >> 4) + ((nb) this).field_E;
                    ((nb) this).field_p = 5120 - (((nb) this).field_C.field_hc >> 4) + ((nb) this).field_P;
                    statePc = 613;
                    continue stateLoop;
                }
                case 533: {
                    if (null == ((nb) this).field_C) {
                        statePc = 537;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    if (!si.field_p) {
                        statePc = 537;
                    } else {
                        statePc = 535;
                    }
                    continue stateLoop;
                }
                case 535: {
                    if (!((nb) this).field_X.field_j) {
                        statePc = 555;
                    } else {
                        statePc = 537;
                    }
                    continue stateLoop;
                }
                case 537: {
                    if (!jn.field_g) {
                        statePc = 539;
                    } else {
                        statePc = 613;
                    }
                    continue stateLoop;
                }
                case 539: {
                    if (fc.field_e[96]) {
                        statePc = 542;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    if (fc.field_e[sa.field_c]) {
                        statePc = 542;
                    } else {
                        statePc = 543;
                    }
                    continue stateLoop;
                }
                case 542: {
                    var8 = 0;
                    ((nb) this).field_P = Math.max(0, ((nb) this).field_P + -var7);
                    statePc = 543;
                    continue stateLoop;
                }
                case 543: {
                    if (fc.field_e[97]) {
                        statePc = 546;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    if (fc.field_e[on.field_h]) {
                        statePc = 546;
                    } else {
                        statePc = 547;
                    }
                    continue stateLoop;
                }
                case 546: {
                    var8 = 0;
                    ((nb) this).field_P = Math.min(-10240 + ((nb) this).field_X.field_ab.a(-117), var7 + ((nb) this).field_P);
                    statePc = 547;
                    continue stateLoop;
                }
                case 547: {
                    if (fc.field_e[99]) {
                        statePc = 550;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    if (fc.field_e[pd.field_V]) {
                        statePc = 550;
                    } else {
                        statePc = 551;
                    }
                    continue stateLoop;
                }
                case 550: {
                    var8 = 0;
                    ((nb) this).field_E = ((nb) this).field_E + var7;
                    statePc = 551;
                    continue stateLoop;
                }
                case 551: {
                    if (fc.field_e[98]) {
                        statePc = 554;
                    } else {
                        statePc = 552;
                    }
                    continue stateLoop;
                }
                case 552: {
                    if (!fc.field_e[fm.field_d]) {
                        statePc = 613;
                    } else {
                        statePc = 554;
                    }
                    continue stateLoop;
                }
                case 554: {
                    ((nb) this).field_E = Math.max(-var7 + ((nb) this).field_E, -3000);
                    var8 = 0;
                    statePc = 613;
                    continue stateLoop;
                }
                case 555: {
                    if (null == ((nb) this).field_C) {
                        statePc = 613;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    if (!si.field_p) {
                        statePc = 613;
                    } else {
                        statePc = 557;
                    }
                    continue stateLoop;
                }
                case 557: {
                    if (jn.field_g) {
                        statePc = 574;
                    } else {
                        statePc = 558;
                    }
                    continue stateLoop;
                }
                case 558: {
                    if (fc.field_e[96]) {
                        statePc = 561;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    if (!fc.field_e[sa.field_c]) {
                        statePc = 562;
                    } else {
                        statePc = 561;
                    }
                    continue stateLoop;
                }
                case 561: {
                    ((nb) this).field_p = ((nb) this).field_p - var7;
                    var8 = 0;
                    statePc = 562;
                    continue stateLoop;
                }
                case 562: {
                    if (fc.field_e[97]) {
                        statePc = 565;
                    } else {
                        statePc = 563;
                    }
                    continue stateLoop;
                }
                case 563: {
                    if (!fc.field_e[on.field_h]) {
                        statePc = 566;
                    } else {
                        statePc = 565;
                    }
                    continue stateLoop;
                }
                case 565: {
                    ((nb) this).field_p = ((nb) this).field_p + var7;
                    var8 = 0;
                    statePc = 566;
                    continue stateLoop;
                }
                case 566: {
                    if (fc.field_e[98]) {
                        statePc = 569;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    if (fc.field_e[fm.field_d]) {
                        statePc = 569;
                    } else {
                        statePc = 570;
                    }
                    continue stateLoop;
                }
                case 569: {
                    var8 = 0;
                    ((nb) this).field_V = ((nb) this).field_V - var7;
                    statePc = 570;
                    continue stateLoop;
                }
                case 570: {
                    if (fc.field_e[99]) {
                        statePc = 573;
                    } else {
                        statePc = 571;
                    }
                    continue stateLoop;
                }
                case 571: {
                    if (fc.field_e[pd.field_V]) {
                        statePc = 573;
                    } else {
                        statePc = 574;
                    }
                    continue stateLoop;
                }
                case 573: {
                    var8 = 0;
                    ((nb) this).field_V = ((nb) this).field_V + var7;
                    statePc = 574;
                    continue stateLoop;
                }
                case 574: {
                    ((nb) this).field_E = ((nb) this).field_V + (((nb) this).field_C.field_Gb >> 4) - -3200;
                    ((nb) this).field_P = -5120 + ((nb) this).field_p + (((nb) this).field_C.field_hc >> 4);
                    if (((nb) this).field_P < 0) {
                        statePc = 576;
                    } else {
                        statePc = 584;
                    }
                    continue stateLoop;
                }
                case 576: {
                    if (jn.field_g) {
                        statePc = 580;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    if (fc.field_e[97]) {
                        statePc = 582;
                    } else {
                        statePc = 578;
                    }
                    continue stateLoop;
                }
                case 578: {
                    if (fc.field_e[on.field_h]) {
                        statePc = 582;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    if (((nb) this).field_P >= -2000) {
                        statePc = 583;
                    } else {
                        statePc = 581;
                    }
                    continue stateLoop;
                }
                case 581: {
                    ((nb) this).field_p = ((nb) this).field_p - (2000 + ((nb) this).field_P);
                    statePc = 583;
                    continue stateLoop;
                }
                case 582: {
                    ((nb) this).field_p = ((nb) this).field_p - ((nb) this).field_P;
                    statePc = 583;
                    continue stateLoop;
                }
                case 583: {
                    ((nb) this).field_P = 0;
                    statePc = 584;
                    continue stateLoop;
                }
                case 584: {
                    var9 = -10240 + ((nb) this).field_X.field_ab.a(-127);
                    if (var9 >= ((nb) this).field_P) {
                        statePc = 593;
                    } else {
                        statePc = 585;
                    }
                    continue stateLoop;
                }
                case 585: {
                    if (jn.field_g) {
                        statePc = 589;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 586: {
                    if (fc.field_e[96]) {
                        statePc = 591;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    if (fc.field_e[sa.field_c]) {
                        statePc = 591;
                    } else {
                        statePc = 589;
                    }
                    continue stateLoop;
                }
                case 589: {
                    if (((nb) this).field_P <= var9 - -2000) {
                        statePc = 592;
                    } else {
                        statePc = 590;
                    }
                    continue stateLoop;
                }
                case 590: {
                    ((nb) this).field_p = ((nb) this).field_p - (-2000 + -var9 + ((nb) this).field_P);
                    statePc = 592;
                    continue stateLoop;
                }
                case 591: {
                    ((nb) this).field_p = ((nb) this).field_p - (((nb) this).field_P - var9);
                    statePc = 592;
                    continue stateLoop;
                }
                case 592: {
                    ((nb) this).field_P = var9;
                    statePc = 593;
                    continue stateLoop;
                }
                case 593: {
                    var10 = -3000;
                    if (~((nb) this).field_E <= ~var10) {
                        statePc = 603;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 594: {
                    if (var8 != 0) {
                        statePc = 603;
                    } else {
                        statePc = 595;
                    }
                    continue stateLoop;
                }
                case 595: {
                    if (jn.field_g) {
                        statePc = 600;
                    } else {
                        statePc = 596;
                    }
                    continue stateLoop;
                }
                case 596: {
                    if (fc.field_e[99]) {
                        statePc = 599;
                    } else {
                        statePc = 597;
                    }
                    continue stateLoop;
                }
                case 597: {
                    if (!fc.field_e[pd.field_V]) {
                        statePc = 600;
                    } else {
                        statePc = 599;
                    }
                    continue stateLoop;
                }
                case 599: {
                    ((nb) this).field_V = ((nb) this).field_V - (((nb) this).field_E + -var10);
                    statePc = 602;
                    continue stateLoop;
                }
                case 600: {
                    if (((nb) this).field_E >= -2000 + var10) {
                        statePc = 602;
                    } else {
                        statePc = 601;
                    }
                    continue stateLoop;
                }
                case 601: {
                    ((nb) this).field_V = ((nb) this).field_V - (((nb) this).field_E - (-2000 + var10));
                    statePc = 602;
                    continue stateLoop;
                }
                case 602: {
                    ((nb) this).field_E = var10;
                    statePc = 603;
                    continue stateLoop;
                }
                case 603: {
                    if (((nb) this).field_E > 1024) {
                        statePc = 605;
                    } else {
                        statePc = 613;
                    }
                    continue stateLoop;
                }
                case 605: {
                    if (jn.field_g) {
                        statePc = 609;
                    } else {
                        statePc = 606;
                    }
                    continue stateLoop;
                }
                case 606: {
                    if (fc.field_e[98]) {
                        statePc = 611;
                    } else {
                        statePc = 607;
                    }
                    continue stateLoop;
                }
                case 607: {
                    if (fc.field_e[fm.field_d]) {
                        statePc = 611;
                    } else {
                        statePc = 609;
                    }
                    continue stateLoop;
                }
                case 609: {
                    if (((nb) this).field_E <= 3024) {
                        statePc = 612;
                    } else {
                        statePc = 610;
                    }
                    continue stateLoop;
                }
                case 610: {
                    ((nb) this).field_V = ((nb) this).field_V - (-3024 + ((nb) this).field_E);
                    statePc = 612;
                    continue stateLoop;
                }
                case 611: {
                    ((nb) this).field_V = ((nb) this).field_V - (((nb) this).field_E - 1024);
                    statePc = 612;
                    continue stateLoop;
                }
                case 612: {
                    ((nb) this).field_E = 1024;
                    statePc = 613;
                    continue stateLoop;
                }
                case 613: {
                    if (lk.field_eb > 0) {
                        statePc = 616;
                    } else {
                        statePc = 614;
                    }
                    continue stateLoop;
                }
                case 614: {
                    if (var8 == 0) {
                        statePc = 627;
                    } else {
                        statePc = 616;
                    }
                    continue stateLoop;
                }
                case 616: {
                    var9 = Math.max(0, Math.min(-10240 + ((nb) this).field_X.field_ab.a(54), (((nb) this).field_C.field_hc >> 4) + -5120));
                    var10 = 3200 + (((nb) this).field_C.field_Gb >> 4);
                    var11 = Math.max(Math.abs(var9 + -((nb) this).field_P), Math.abs(-((nb) this).field_E + var10)) / 5;
                    if (0 >= lk.field_eb) {
                        statePc = 618;
                    } else {
                        statePc = 617;
                    }
                    continue stateLoop;
                }
                case 617: {
                    var11 = Math.max(var11, 400);
                    statePc = 619;
                    continue stateLoop;
                }
                case 618: {
                    var11 = Math.min(var11, 150);
                    statePc = 619;
                    continue stateLoop;
                }
                case 619: {
                    if (~var9 > ~((nb) this).field_P) {
                        statePc = 621;
                    } else {
                        statePc = 620;
                    }
                    continue stateLoop;
                }
                case 620: {
                    ((nb) this).field_P = Math.min(var9, ((nb) this).field_P + var11);
                    statePc = 622;
                    continue stateLoop;
                }
                case 621: {
                    ((nb) this).field_P = Math.max(var9, ((nb) this).field_P + -var11);
                    statePc = 622;
                    continue stateLoop;
                }
                case 622: {
                    if (~var10 > ~((nb) this).field_E) {
                        statePc = 624;
                    } else {
                        statePc = 623;
                    }
                    continue stateLoop;
                }
                case 623: {
                    ((nb) this).field_E = Math.min(var10, var11 + ((nb) this).field_E);
                    statePc = 625;
                    continue stateLoop;
                }
                case 624: {
                    ((nb) this).field_E = Math.max(var10, ((nb) this).field_E + -var11);
                    statePc = 625;
                    continue stateLoop;
                }
                case 625: {
                    if (!si.field_p) {
                        statePc = 627;
                    } else {
                        statePc = 626;
                    }
                    continue stateLoop;
                }
                case 626: {
                    ((nb) this).field_V = -3200 + -(((nb) this).field_C.field_Gb >> 4) + ((nb) this).field_E;
                    ((nb) this).field_p = -(((nb) this).field_C.field_hc >> 4) + (5120 + ((nb) this).field_P);
                    statePc = 627;
                    continue stateLoop;
                }
                case 627: {
                    if (((nb) this).field_d) {
                        statePc = 630;
                    } else {
                        statePc = 628;
                    }
                    continue stateLoop;
                }
                case 628: {
                    if (~qh.field_Yb != ~dl.field_M) {
                        statePc = 630;
                    } else {
                        statePc = 629;
                    }
                    continue stateLoop;
                }
                case 629: {
                    ((nb) this).field_i = 1 + ((nb) this).field_X.field_r;
                    statePc = 630;
                    continue stateLoop;
                }
                case 630: {
                    if (!((nb) this).field_X.field_j) {
                        statePc = 632;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 631: {
                    ((nb) this).field_i = ((nb) this).field_X.field_r + 1;
                    statePc = 634;
                    continue stateLoop;
                }
                case 632: {
                    if (~((nb) this).field_i != ~((nb) this).field_X.field_r) {
                        statePc = 634;
                    } else {
                        statePc = 633;
                    }
                    continue stateLoop;
                }
                case 633: {
                    ((nb) this).field_X.e(-1);
                    statePc = 634;
                    continue stateLoop;
                }
                case 634: {
                    if (!((nb) this).field_d) {
                        statePc = 638;
                    } else {
                        statePc = 635;
                    }
                    continue stateLoop;
                }
                case 635: {
                    if (~((nb) this).field_X.field_r > ~((nb) this).field_i) {
                        statePc = 640;
                    } else {
                        statePc = 636;
                    }
                    continue stateLoop;
                }
                case 636: {
                    if (((nb) this).field_X.field_j) {
                        statePc = 640;
                    } else {
                        statePc = 638;
                    }
                    continue stateLoop;
                }
                case 638: {
                    if (!((nb) this).field_d) {
                        statePc = 640;
                    } else {
                        statePc = 694;
                    }
                    continue stateLoop;
                }
                case 640: {
                    if (~((nb) this).field_l == ~((nb) this).field_X.field_r) {
                        statePc = 642;
                    } else {
                        statePc = 649;
                    }
                    continue stateLoop;
                }
                case 642: {
                    stackOut_642_0 = this;
                    stackIn_644_0 = stackOut_642_0;
                    stackIn_643_0 = stackOut_642_0;
                    if ((65535 & ((nb) this).field_X.b(false)) == (65535 & ((nb) this).field_j)) {
                        statePc = 644;
                    } else {
                        statePc = 643;
                    }
                    continue stateLoop;
                }
                case 643: {
                    stackOut_643_0 = this;
                    stackOut_643_1 = 1;
                    stackIn_645_0 = stackOut_643_0;
                    stackIn_645_1 = stackOut_643_1;
                    statePc = 645;
                    continue stateLoop;
                }
                case 644: {
                    stackOut_644_0 = this;
                    stackOut_644_1 = 0;
                    stackIn_645_0 = stackOut_644_0;
                    stackIn_645_1 = stackOut_644_1;
                    statePc = 645;
                    continue stateLoop;
                }
                case 645: {
                    ((nb) this).field_ab = stackIn_645_1 != 0;
                    stackOut_645_0 = this;
                    stackIn_647_0 = stackOut_645_0;
                    stackIn_646_0 = stackOut_645_0;
                    if (~(-65536 & ((nb) this).field_X.b(false)) == ~(((nb) this).field_j & -65536)) {
                        statePc = 647;
                    } else {
                        statePc = 646;
                    }
                    continue stateLoop;
                }
                case 646: {
                    stackOut_646_0 = this;
                    stackOut_646_1 = 1;
                    stackIn_648_0 = stackOut_646_0;
                    stackIn_648_1 = stackOut_646_1;
                    statePc = 648;
                    continue stateLoop;
                }
                case 647: {
                    stackOut_647_0 = this;
                    stackOut_647_1 = 0;
                    stackIn_648_0 = stackOut_647_0;
                    stackIn_648_1 = stackOut_647_1;
                    statePc = 648;
                    continue stateLoop;
                }
                case 648: {
                    ((nb) this).field_k = stackIn_648_1 != 0;
                    statePc = 649;
                    continue stateLoop;
                }
                case 649: {
                    ((nb) this).field_X.b((byte) 27);
                    if (um.field_X > 0) {
                        statePc = 651;
                    } else {
                        statePc = 652;
                    }
                    continue stateLoop;
                }
                case 651: {
                    um.field_X = um.field_X - 1;
                    statePc = 652;
                    continue stateLoop;
                }
                case 652: {
                    if (!((nb) this).field_d) {
                        statePc = 661;
                    } else {
                        statePc = 653;
                    }
                    continue stateLoop;
                }
                case 653: {
                    hj.field_s = sg.field_b;
                    if (!vl.field_v) {
                        statePc = 655;
                    } else {
                        statePc = 660;
                    }
                    continue stateLoop;
                }
                case 655: {
                    if (ln.field_e <= 1) {
                        statePc = 657;
                    } else {
                        statePc = 656;
                    }
                    continue stateLoop;
                }
                case 656: {
                    hj.field_s = db.a(cj.field_b, -61, new String[1]);
                    statePc = 660;
                    continue stateLoop;
                }
                case 657: {
                    if (ln.field_e == 1) {
                        statePc = 659;
                    } else {
                        statePc = 658;
                    }
                    continue stateLoop;
                }
                case 658: {
                    hj.field_s = ci.field_d;
                    statePc = 660;
                    continue stateLoop;
                }
                case 659: {
                    hj.field_s = gb.field_b;
                    statePc = 660;
                    continue stateLoop;
                }
                case 660: {
                    var9 = fk.field_d.c(hj.field_s.toUpperCase());
                    jl.field_c = jl.field_c + 0.05000000074505806f * ((float)var9 - jl.field_c);
                    statePc = 661;
                    continue stateLoop;
                }
                case 661: {
                    if (!((nb) this).field_d) {
                        statePc = 665;
                    } else {
                        statePc = 662;
                    }
                    continue stateLoop;
                }
                case 662: {
                    if (!param1) {
                        statePc = 665;
                    } else {
                        statePc = 663;
                    }
                    continue stateLoop;
                }
                case 663: {
                    if (!jn.field_g) {
                        statePc = 666;
                    } else {
                        statePc = 665;
                    }
                    continue stateLoop;
                }
                case 665: {
                    bb.field_T = false;
                    statePc = 694;
                    continue stateLoop;
                }
                case 666: {
                    var9 = 24;
                    var10 = 356;
                    bb.field_T = false;
                    if (!vl.field_v) {
                        statePc = 668;
                    } else {
                        statePc = 667;
                    }
                    continue stateLoop;
                }
                case 667: {
                    var10 = 336;
                    statePc = 668;
                    continue stateLoop;
                }
                case 668: {
                    if (!bb.field_T) {
                        statePc = 671;
                    } else {
                        statePc = 669;
                    }
                    continue stateLoop;
                }
                case 669: {
                    if (param1) {
                        statePc = 674;
                    } else {
                        statePc = 671;
                    }
                    continue stateLoop;
                }
                case 671: {
                    if (ln.field_e <= 0) {
                        statePc = 675;
                    } else {
                        statePc = 672;
                    }
                    continue stateLoop;
                }
                case 672: {
                    if (a.field_c % 40 >= 20) {
                        statePc = 675;
                    } else {
                        statePc = 674;
                    }
                    continue stateLoop;
                }
                case 674: {
                    stackOut_674_0 = 1;
                    stackIn_676_0 = stackOut_674_0;
                    statePc = 676;
                    continue stateLoop;
                }
                case 675: {
                    stackOut_675_0 = 0;
                    stackIn_676_0 = stackOut_675_0;
                    statePc = 676;
                    continue stateLoop;
                }
                case 676: {
                    var11 = stackIn_676_0;
                    if (var11 != 0) {
                        statePc = 678;
                    } else {
                        statePc = 677;
                    }
                    continue stateLoop;
                }
                case 677: {
                    stackOut_677_0 = co.field_d;
                    stackIn_679_0 = stackOut_677_0;
                    statePc = 679;
                    continue stateLoop;
                }
                case 678: {
                    stackOut_678_0 = be.field_f;
                    stackIn_679_0 = stackOut_678_0;
                    statePc = 679;
                    continue stateLoop;
                }
                case 679: {
                    var12 = stackIn_679_0;
                    var13 = var12[2].field_A + var12[0].field_A + (int)jl.field_c;
                    if (oh.field_f < 0) {
                        statePc = 685;
                    } else {
                        statePc = 680;
                    }
                    continue stateLoop;
                }
                case 680: {
                    if (oh.field_f >= var13) {
                        statePc = 685;
                    } else {
                        statePc = 681;
                    }
                    continue stateLoop;
                }
                case 681: {
                    if (~var10 < ~pi.field_c) {
                        statePc = 685;
                    } else {
                        statePc = 682;
                    }
                    continue stateLoop;
                }
                case 682: {
                    if (pi.field_c < var10 + var9) {
                        statePc = 684;
                    } else {
                        statePc = 685;
                    }
                    continue stateLoop;
                }
                case 684: {
                    ((nb) this).field_r = 0;
                    bb.field_T = true;
                    statePc = 685;
                    continue stateLoop;
                }
                case 685: {
                    if (lb.field_gc != 1) {
                        statePc = 694;
                    } else {
                        statePc = 686;
                    }
                    continue stateLoop;
                }
                case 686: {
                    if (bb.field_T) {
                        statePc = 688;
                    } else {
                        statePc = 694;
                    }
                    continue stateLoop;
                }
                case 688: {
                    if (vl.field_v) {
                        statePc = 690;
                    } else {
                        statePc = 689;
                    }
                    continue stateLoop;
                }
                case 689: {
                    stackOut_689_0 = 1;
                    stackIn_691_0 = stackOut_689_0;
                    statePc = 691;
                    continue stateLoop;
                }
                case 690: {
                    stackOut_690_0 = 0;
                    stackIn_691_0 = stackOut_690_0;
                    statePc = 691;
                    continue stateLoop;
                }
                case 691: {
                    vl.field_v = stackIn_691_0 != 0;
                    if (vl.field_v) {
                        statePc = 693;
                    } else {
                        statePc = 694;
                    }
                    continue stateLoop;
                }
                case 693: {
                    ln.field_e = 0;
                    statePc = 694;
                    continue stateLoop;
                }
                case 694: {
                    if (~((nb) this).field_X.field_r <= ~(-in.field_g[((nb) this).field_X.field_c] + ((nb) this).field_i)) {
                        statePc = 707;
                    } else {
                        statePc = 695;
                    }
                    continue stateLoop;
                }
                case 695: {
                    if (((nb) this).field_z) {
                        statePc = 707;
                    } else {
                        statePc = 696;
                    }
                    continue stateLoop;
                }
                case 696: {
                    if (~((nb) this).field_l == ~((nb) this).field_X.field_r) {
                        statePc = 698;
                    } else {
                        statePc = 705;
                    }
                    continue stateLoop;
                }
                case 698: {
                    stackOut_698_0 = this;
                    stackIn_700_0 = stackOut_698_0;
                    stackIn_699_0 = stackOut_698_0;
                    if ((65535 & ((nb) this).field_X.b(false)) == (((nb) this).field_j & 65535)) {
                        statePc = 700;
                    } else {
                        statePc = 699;
                    }
                    continue stateLoop;
                }
                case 699: {
                    stackOut_699_0 = this;
                    stackOut_699_1 = 1;
                    stackIn_701_0 = stackOut_699_0;
                    stackIn_701_1 = stackOut_699_1;
                    statePc = 701;
                    continue stateLoop;
                }
                case 700: {
                    stackOut_700_0 = this;
                    stackOut_700_1 = 0;
                    stackIn_701_0 = stackOut_700_0;
                    stackIn_701_1 = stackOut_700_1;
                    statePc = 701;
                    continue stateLoop;
                }
                case 701: {
                    ((nb) this).field_ab = stackIn_701_1 != 0;
                    stackOut_701_0 = this;
                    stackIn_703_0 = stackOut_701_0;
                    stackIn_702_0 = stackOut_701_0;
                    if ((((nb) this).field_X.b(false) & -65536) == (-65536 & ((nb) this).field_j)) {
                        statePc = 703;
                    } else {
                        statePc = 702;
                    }
                    continue stateLoop;
                }
                case 702: {
                    stackOut_702_0 = this;
                    stackOut_702_1 = 1;
                    stackIn_704_0 = stackOut_702_0;
                    stackIn_704_1 = stackOut_702_1;
                    statePc = 704;
                    continue stateLoop;
                }
                case 703: {
                    stackOut_703_0 = this;
                    stackOut_703_1 = 0;
                    stackIn_704_0 = stackOut_703_0;
                    stackIn_704_1 = stackOut_703_1;
                    statePc = 704;
                    continue stateLoop;
                }
                case 704: {
                    ((nb) this).field_k = stackIn_704_1 != 0;
                    statePc = 705;
                    continue stateLoop;
                }
                case 705: {
                    ((nb) this).field_X.b((byte) 27);
                    if (0 >= um.field_X) {
                        statePc = 694;
                    } else {
                        statePc = 706;
                    }
                    continue stateLoop;
                }
                case 706: {
                    um.field_X = um.field_X - 1;
                    statePc = 694;
                    continue stateLoop;
                }
                case 707: {
                    if (!((nb) this).field_d) {
                        statePc = 709;
                    } else {
                        statePc = 710;
                    }
                    continue stateLoop;
                }
                case 709: {
                    ((nb) this).field_ab = false;
                    ((nb) this).field_k = false;
                    statePc = 710;
                    continue stateLoop;
                }
                case 710: {
                    if (((nb) this).field_w <= ((nb) this).field_X.field_r) {
                        statePc = 712;
                    } else {
                        statePc = 711;
                    }
                    continue stateLoop;
                }
                case 711: {
                    return;
                }
                case 712: {
                    if (!param1) {
                        statePc = 716;
                    } else {
                        statePc = 713;
                    }
                    continue stateLoop;
                }
                case 713: {
                    if (jc.a(2)) {
                        statePc = 716;
                    } else {
                        statePc = 714;
                    }
                    continue stateLoop;
                }
                case 714: {
                    if (!jn.field_g) {
                        statePc = 717;
                    } else {
                        statePc = 716;
                    }
                    continue stateLoop;
                }
                case 716: {
                    this.b(0, 0, 0, 0);
                    statePc = 793;
                    continue stateLoop;
                }
                case 717: {
                    if (((nb) this).field_d) {
                        statePc = 723;
                    } else {
                        statePc = 718;
                    }
                    continue stateLoop;
                }
                case 718: {
                    if (!fc.field_e[35]) {
                        statePc = 723;
                    } else {
                        statePc = 719;
                    }
                    continue stateLoop;
                }
                case 719: {
                    if (((nb) this).field_d) {
                        statePc = 723;
                    } else {
                        statePc = 720;
                    }
                    continue stateLoop;
                }
                case 720: {
                    if (ul.field_d >= 2) {
                        statePc = 722;
                    } else {
                        statePc = 723;
                    }
                    continue stateLoop;
                }
                case 722: {
                    ((nb) this).field_X.field_ab.a(1200, ((nb) this).field_X.field_kb, ((nb) this).field_X.field_Y);
                    statePc = 723;
                    continue stateLoop;
                }
                case 723: {
                    if (1 == lb.field_gc) {
                        statePc = 724;
                    } else {
                        statePc = 724;
                    }
                    continue stateLoop;
                }
                case 724: {
                    if (lb.field_gc != 1) {
                        statePc = 739;
                    } else {
                        statePc = 725;
                    }
                    continue stateLoop;
                }
                case 725: {
                    if (((nb) this).field_C == null) {
                        statePc = 739;
                    } else {
                        statePc = 726;
                    }
                    continue stateLoop;
                }
                case 726: {
                    if (null == ((nb) this).field_C.field_Vb) {
                        statePc = 739;
                    } else {
                        statePc = 727;
                    }
                    continue stateLoop;
                }
                case 727: {
                    if (!jc.field_k) {
                        statePc = 739;
                    } else {
                        statePc = 728;
                    }
                    continue stateLoop;
                }
                case 728: {
                    var9 = ((nb) this).field_X.field_r + vk.field_h[((nb) this).field_X.field_c];
                    var10_ref_je = new je(12, 0, var9);
                    var11_ref_je = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                    if (var11_ref_je == null) {
                        statePc = 732;
                    } else {
                        statePc = 729;
                    }
                    continue stateLoop;
                }
                case 729: {
                    if (var11_ref_je.field_r > var9) {
                        statePc = 731;
                    } else {
                        statePc = 732;
                    }
                    continue stateLoop;
                }
                case 731: {
                    var9 = var11_ref_je.field_r;
                    statePc = 732;
                    continue stateLoop;
                }
                case 732: {
                    if (!((nb) this).field_d) {
                        statePc = 734;
                    } else {
                        statePc = 733;
                    }
                    continue stateLoop;
                }
                case 733: {
                    mm.field_g.a(64, (byte) -117);
                    mm.field_g.a((byte) 127, 12);
                    mm.field_g.a((byte) 120, 0);
                    mm.field_g.b(true, var9);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    statePc = 735;
                    continue stateLoop;
                }
                case 734: {
                    var10_ref_je.field_p = true;
                    statePc = 735;
                    continue stateLoop;
                }
                case 735: {
                    if (di.field_g != -1) {
                        statePc = 738;
                    } else {
                        statePc = 736;
                    }
                    continue stateLoop;
                }
                case 736: {
                    if (1 == ((nb) this).field_X.field_c) {
                        statePc = 739;
                    } else {
                        statePc = 738;
                    }
                    continue stateLoop;
                }
                case 738: {
                    ((nb) this).field_C.field_B.a(3, (ck) (Object) var10_ref_je);
                    statePc = 739;
                    continue stateLoop;
                }
                case 739: {
                    if (var3 == 0) {
                        statePc = 792;
                    } else {
                        statePc = 740;
                    }
                    continue stateLoop;
                }
                case 740: {
                    if (null == ((nb) this).field_C) {
                        statePc = 792;
                    } else {
                        statePc = 741;
                    }
                    continue stateLoop;
                }
                case 741: {
                    if (!((nb) this).field_C.field_pc) {
                        statePc = 744;
                    } else {
                        statePc = 742;
                    }
                    continue stateLoop;
                }
                case 742: {
                    if (((nb) this).field_C.field_Qb >= 0) {
                        statePc = 792;
                    } else {
                        statePc = 744;
                    }
                    continue stateLoop;
                }
                case 744: {
                    if (!fc.field_e[81]) {
                        statePc = 746;
                    } else {
                        statePc = 745;
                    }
                    continue stateLoop;
                }
                case 745: {
                    stackOut_745_0 = 1;
                    stackIn_747_0 = stackOut_745_0;
                    statePc = 747;
                    continue stateLoop;
                }
                case 746: {
                    stackOut_746_0 = 0;
                    stackIn_747_0 = stackOut_746_0;
                    statePc = 747;
                    continue stateLoop;
                }
                case 747: {
                    var9 = stackIn_747_0;
                    if (!dm.field_c) {
                        statePc = 752;
                    } else {
                        statePc = 748;
                    }
                    continue stateLoop;
                }
                case 748: {
                    if (fc.field_e[81]) {
                        statePc = 750;
                    } else {
                        statePc = 749;
                    }
                    continue stateLoop;
                }
                case 749: {
                    stackOut_749_0 = 0;
                    stackIn_751_0 = stackOut_749_0;
                    statePc = 751;
                    continue stateLoop;
                }
                case 750: {
                    stackOut_750_0 = 1;
                    stackIn_751_0 = stackOut_750_0;
                    statePc = 751;
                    continue stateLoop;
                }
                case 751: {
                    var9 = stackIn_751_0;
                    statePc = 752;
                    continue stateLoop;
                }
                case 752: {
                    if (!fc.field_e[86]) {
                        statePc = 755;
                    } else {
                        statePc = 753;
                    }
                    continue stateLoop;
                }
                case 753: {
                    if (((nb) this).field_C.i(16, -27)) {
                        statePc = 766;
                    } else {
                        statePc = 755;
                    }
                    continue stateLoop;
                }
                case 755: {
                    if (dm.field_c) {
                        statePc = 758;
                    } else {
                        statePc = 756;
                    }
                    continue stateLoop;
                }
                case 756: {
                    if ((4 & sf.field_d) == 0) {
                        statePc = 758;
                    } else {
                        statePc = 757;
                    }
                    continue stateLoop;
                }
                case 757: {
                    ie.field_c = true;
                    var9 = 1;
                    statePc = 767;
                    continue stateLoop;
                }
                case 758: {
                    if (!dm.field_c) {
                        statePc = 762;
                    } else {
                        statePc = 759;
                    }
                    continue stateLoop;
                }
                case 759: {
                    if (fc.field_e[fm.field_d]) {
                        statePc = 765;
                    } else {
                        statePc = 760;
                    }
                    continue stateLoop;
                }
                case 760: {
                    if (fc.field_e[83]) {
                        statePc = 765;
                    } else {
                        statePc = 762;
                    }
                    continue stateLoop;
                }
                case 762: {
                    if (dm.field_c) {
                        statePc = 767;
                    } else {
                        statePc = 763;
                    }
                    continue stateLoop;
                }
                case 763: {
                    if (!fc.field_e[83]) {
                        statePc = 767;
                    } else {
                        statePc = 764;
                    }
                    continue stateLoop;
                }
                case 764: {
                    ie.field_c = true;
                    var9 = 1;
                    statePc = 767;
                    continue stateLoop;
                }
                case 765: {
                    ie.field_c = true;
                    var9 = 1;
                    statePc = 767;
                    continue stateLoop;
                }
                case 766: {
                    var9 = 2;
                    statePc = 767;
                    continue stateLoop;
                }
                case 767: {
                    if (!gi.field_r) {
                        statePc = 770;
                    } else {
                        statePc = 768;
                    }
                    continue stateLoop;
                }
                case 768: {
                    if (var9 == 1) {
                        statePc = 770;
                    } else {
                        statePc = 769;
                    }
                    continue stateLoop;
                }
                case 769: {
                    var9 = 0;
                    statePc = 770;
                    continue stateLoop;
                }
                case 770: {
                    if (!param1) {
                        statePc = 791;
                    } else {
                        statePc = 771;
                    }
                    continue stateLoop;
                }
                case 771: {
                    if (((nb) this).field_r != -1) {
                        statePc = 791;
                    } else {
                        statePc = 772;
                    }
                    continue stateLoop;
                }
                case 772: {
                    if (0 != var9) {
                        statePc = 774;
                    } else {
                        statePc = 790;
                    }
                    continue stateLoop;
                }
                case 774: {
                    if (1 == var9) {
                        statePc = 784;
                    } else {
                        statePc = 775;
                    }
                    continue stateLoop;
                }
                case 775: {
                    if (2 == var9) {
                        statePc = 777;
                    } else {
                        statePc = 776;
                    }
                    continue stateLoop;
                }
                case 776: {
                    this.a(-7289, var5, var9, var4);
                    statePc = 793;
                    continue stateLoop;
                }
                case 777: {
                    stackOut_777_0 = this;
                    stackOut_777_1 = 15;
                    stackOut_777_2 = 6;
                    stackIn_781_0 = stackOut_777_0;
                    stackIn_781_1 = stackOut_777_1;
                    stackIn_781_2 = stackOut_777_2;
                    stackIn_778_0 = stackOut_777_0;
                    stackIn_778_1 = stackOut_777_1;
                    stackIn_778_2 = stackOut_777_2;
                    if (null == ((nb) this).field_u) {
                        statePc = 781;
                    } else {
                        statePc = 778;
                    }
                    continue stateLoop;
                }
                case 778: {
                    stackOut_778_0 = this;
                    stackOut_778_1 = stackIn_778_1;
                    stackOut_778_2 = stackIn_778_2;
                    stackIn_781_0 = stackOut_778_0;
                    stackIn_781_1 = stackOut_778_1;
                    stackIn_781_2 = stackOut_778_2;
                    stackIn_779_0 = stackOut_778_0;
                    stackIn_779_1 = stackOut_778_1;
                    stackIn_779_2 = stackOut_778_2;
                    if (0 >= ((nb) this).field_C.field_Tb) {
                        statePc = 781;
                    } else {
                        statePc = 779;
                    }
                    continue stateLoop;
                }
                case 779: {
                    stackOut_779_0 = this;
                    stackOut_779_1 = stackIn_779_1;
                    stackOut_779_2 = stackIn_779_2;
                    stackIn_782_0 = stackOut_779_0;
                    stackIn_782_1 = stackOut_779_1;
                    stackIn_782_2 = stackOut_779_2;
                    stackIn_780_0 = stackOut_779_0;
                    stackIn_780_1 = stackOut_779_1;
                    stackIn_780_2 = stackOut_779_2;
                    if (((nb) this).field_C.field_ub >= 0) {
                        statePc = 782;
                    } else {
                        statePc = 780;
                    }
                    continue stateLoop;
                }
                case 780: {
                    stackOut_780_0 = this;
                    stackOut_780_1 = stackIn_780_1;
                    stackOut_780_2 = stackIn_780_2;
                    stackIn_781_0 = stackOut_780_0;
                    stackIn_781_1 = stackOut_780_1;
                    stackIn_781_2 = stackOut_780_2;
                    statePc = 781;
                    continue stateLoop;
                }
                case 781: {
                    stackOut_781_0 = this;
                    stackOut_781_1 = stackIn_781_1;
                    stackOut_781_2 = stackIn_781_2;
                    stackOut_781_3 = 1;
                    stackIn_783_0 = stackOut_781_0;
                    stackIn_783_1 = stackOut_781_1;
                    stackIn_783_2 = stackOut_781_2;
                    stackIn_783_3 = stackOut_781_3;
                    statePc = 783;
                    continue stateLoop;
                }
                case 782: {
                    stackOut_782_0 = this;
                    stackOut_782_1 = stackIn_782_1;
                    stackOut_782_2 = stackIn_782_2;
                    stackOut_782_3 = 0;
                    stackIn_783_0 = stackOut_782_0;
                    stackIn_783_1 = stackOut_782_1;
                    stackIn_783_2 = stackOut_782_2;
                    stackIn_783_3 = stackOut_782_3;
                    statePc = 783;
                    continue stateLoop;
                }
                case 783: {
                    this.b(stackIn_783_1, stackIn_783_2 + stackIn_783_3, 0, 15);
                    statePc = 790;
                    continue stateLoop;
                }
                case 784: {
                    var10 = 2;
                    if (((nb) this).field_C.field_cb <= 0) {
                        statePc = 789;
                    } else {
                        statePc = 785;
                    }
                    continue stateLoop;
                }
                case 785: {
                    if (((nb) this).field_C.field_Lb) {
                        statePc = 788;
                    } else {
                        statePc = 786;
                    }
                    continue stateLoop;
                }
                case 786: {
                    if (0 < ((nb) this).field_C.field_Fb) {
                        statePc = 789;
                    } else {
                        statePc = 788;
                    }
                    continue stateLoop;
                }
                case 788: {
                    var10 = 3;
                    statePc = 789;
                    continue stateLoop;
                }
                case 789: {
                    this.b(15, var10, 0, 1);
                    statePc = 790;
                    continue stateLoop;
                }
                case 790: {
                    this.a(-7289, var5, var9, var4);
                    statePc = 793;
                    continue stateLoop;
                }
                case 791: {
                    this.b(0, 0, 0, 0);
                    dl.field_G = ((nb) this).field_C.field_Gb;
                    km.field_c = ((nb) this).field_C.field_hc;
                    statePc = 793;
                    continue stateLoop;
                }
                case 792: {
                    this.b(0, 0, 0, 0);
                    statePc = 793;
                    continue stateLoop;
                }
                case 793: {
                    if ((1 & sf.field_d) != 0) {
                        statePc = 795;
                    } else {
                        statePc = 794;
                    }
                    continue stateLoop;
                }
                case 794: {
                    vd.field_b = false;
                    statePc = 795;
                    continue stateLoop;
                }
                case 795: {
                    if (41 != ((nb) this).field_r) {
                        statePc = 804;
                    } else {
                        statePc = 796;
                    }
                    continue stateLoop;
                }
                case 796: {
                    if (lb.field_gc != 1) {
                        statePc = 804;
                    } else {
                        statePc = 797;
                    }
                    continue stateLoop;
                }
                case 797: {
                    if (uj.field_f) {
                        statePc = 799;
                    } else {
                        statePc = 798;
                    }
                    continue stateLoop;
                }
                case 798: {
                    stackOut_798_0 = 1;
                    stackIn_800_0 = stackOut_798_0;
                    statePc = 800;
                    continue stateLoop;
                }
                case 799: {
                    stackOut_799_0 = 0;
                    stackIn_800_0 = stackOut_799_0;
                    statePc = 800;
                    continue stateLoop;
                }
                case 800: {
                    uj.field_f = stackIn_800_0 != 0;
                    vd.field_b = true;
                    if (null == ((nb) this).field_B) {
                        statePc = 804;
                    } else {
                        statePc = 801;
                    }
                    continue stateLoop;
                }
                case 801: {
                    var9 = 0;
                    statePc = 802;
                    continue stateLoop;
                }
                case 802: {
                    if (~var9 <= ~((nb) this).field_B.length) {
                        statePc = 804;
                    } else {
                        statePc = 803;
                    }
                    continue stateLoop;
                }
                case 803: {
                    ((nb) this).field_B[var9] = 0;
                    var9++;
                    statePc = 802;
                    continue stateLoop;
                }
                case 804: {
                    if (((nb) this).field_r != 1) {
                        statePc = 810;
                    } else {
                        statePc = 805;
                    }
                    continue stateLoop;
                }
                case 805: {
                    if (lb.field_gc == 1) {
                        statePc = 807;
                    } else {
                        statePc = 810;
                    }
                    continue stateLoop;
                }
                case 807: {
                    vd.field_b = true;
                    if (dl.field_M > 0) {
                        statePc = 809;
                    } else {
                        statePc = 810;
                    }
                    continue stateLoop;
                }
                case 809: {
                    dl.field_M = dl.field_M - 1;
                    statePc = 810;
                    continue stateLoop;
                }
                case 810: {
                    if (36 != ((nb) this).field_r) {
                        statePc = 820;
                    } else {
                        statePc = 811;
                    }
                    continue stateLoop;
                }
                case 811: {
                    if (lb.field_gc != 1) {
                        statePc = 820;
                    } else {
                        statePc = 812;
                    }
                    continue stateLoop;
                }
                case 812: {
                    if (dm.field_c) {
                        statePc = 814;
                    } else {
                        statePc = 813;
                    }
                    continue stateLoop;
                }
                case 813: {
                    stackOut_813_0 = 1;
                    stackIn_815_0 = stackOut_813_0;
                    statePc = 815;
                    continue stateLoop;
                }
                case 814: {
                    stackOut_814_0 = 0;
                    stackIn_815_0 = stackOut_814_0;
                    statePc = 815;
                    continue stateLoop;
                }
                case 815: {
                    dm.field_c = stackIn_815_0 != 0;
                    vd.field_b = true;
                    gd.field_sb = null;
                    stackOut_815_0 = ti.field_A;
                    stackOut_815_1 = 42;
                    stackIn_817_0 = stackOut_815_0;
                    stackIn_817_1 = stackOut_815_1;
                    stackIn_816_0 = stackOut_815_0;
                    stackIn_816_1 = stackOut_815_1;
                    if (dm.field_c) {
                        statePc = 817;
                    } else {
                        statePc = 816;
                    }
                    continue stateLoop;
                }
                case 816: {
                    stackOut_816_0 = (String[]) (Object) stackIn_816_0;
                    stackOut_816_1 = stackIn_816_1;
                    stackOut_816_2 = od.field_j;
                    stackIn_818_0 = stackOut_816_0;
                    stackIn_818_1 = stackOut_816_1;
                    stackIn_818_2 = stackOut_816_2;
                    statePc = 818;
                    continue stateLoop;
                }
                case 817: {
                    stackOut_817_0 = (String[]) (Object) stackIn_817_0;
                    stackOut_817_1 = stackIn_817_1;
                    stackOut_817_2 = qm.field_c;
                    stackIn_818_0 = stackOut_817_0;
                    stackIn_818_1 = stackOut_817_1;
                    stackIn_818_2 = stackOut_817_2;
                    statePc = 818;
                    continue stateLoop;
                }
                case 818: {
                    stackIn_818_0[stackIn_818_1] = stackIn_818_2;
                    if (ni.b(88)) {
                        statePc = 820;
                    } else {
                        statePc = 819;
                    }
                    continue stateLoop;
                }
                case 819: {
                    int discarded$76 = 3;
                    um.f();
                    statePc = 820;
                    continue stateLoop;
                }
                case 820: {
                    if (((nb) this).field_r != 37) {
                        statePc = 832;
                    } else {
                        statePc = 821;
                    }
                    continue stateLoop;
                }
                case 821: {
                    if (lb.field_gc == 1) {
                        statePc = 823;
                    } else {
                        statePc = 832;
                    }
                    continue stateLoop;
                }
                case 823: {
                    vd.field_b = true;
                    if (ui.field_G) {
                        statePc = 825;
                    } else {
                        statePc = 824;
                    }
                    continue stateLoop;
                }
                case 824: {
                    stackOut_824_0 = 1;
                    stackIn_826_0 = stackOut_824_0;
                    statePc = 826;
                    continue stateLoop;
                }
                case 825: {
                    stackOut_825_0 = 0;
                    stackIn_826_0 = stackOut_825_0;
                    statePc = 826;
                    continue stateLoop;
                }
                case 826: {
                    ui.field_G = stackIn_826_0 != 0;
                    stackOut_826_0 = ti.field_A;
                    stackOut_826_1 = 43;
                    stackIn_828_0 = stackOut_826_0;
                    stackIn_828_1 = stackOut_826_1;
                    stackIn_827_0 = stackOut_826_0;
                    stackIn_827_1 = stackOut_826_1;
                    if (ui.field_G) {
                        statePc = 828;
                    } else {
                        statePc = 827;
                    }
                    continue stateLoop;
                }
                case 827: {
                    stackOut_827_0 = (String[]) (Object) stackIn_827_0;
                    stackOut_827_1 = stackIn_827_1;
                    stackOut_827_2 = fj.field_i;
                    stackIn_829_0 = stackOut_827_0;
                    stackIn_829_1 = stackOut_827_1;
                    stackIn_829_2 = stackOut_827_2;
                    statePc = 829;
                    continue stateLoop;
                }
                case 828: {
                    stackOut_828_0 = (String[]) (Object) stackIn_828_0;
                    stackOut_828_1 = stackIn_828_1;
                    stackOut_828_2 = tm.field_f;
                    stackIn_829_0 = stackOut_828_0;
                    stackIn_829_1 = stackOut_828_1;
                    stackIn_829_2 = stackOut_828_2;
                    statePc = 829;
                    continue stateLoop;
                }
                case 829: {
                    stackIn_829_0[stackIn_829_1] = stackIn_829_2;
                    if (!ni.b(109)) {
                        statePc = 831;
                    } else {
                        statePc = 832;
                    }
                    continue stateLoop;
                }
                case 831: {
                    int discarded$77 = 3;
                    um.f();
                    statePc = 832;
                    continue stateLoop;
                }
                case 832: {
                    if (((nb) this).field_r != 38) {
                        statePc = 842;
                    } else {
                        statePc = 833;
                    }
                    continue stateLoop;
                }
                case 833: {
                    if (lb.field_gc != 1) {
                        statePc = 842;
                    } else {
                        statePc = 834;
                    }
                    continue stateLoop;
                }
                case 834: {
                    vd.field_b = true;
                    if (ik.field_h) {
                        statePc = 836;
                    } else {
                        statePc = 835;
                    }
                    continue stateLoop;
                }
                case 835: {
                    stackOut_835_0 = 1;
                    stackIn_837_0 = stackOut_835_0;
                    statePc = 837;
                    continue stateLoop;
                }
                case 836: {
                    stackOut_836_0 = 0;
                    stackIn_837_0 = stackOut_836_0;
                    statePc = 837;
                    continue stateLoop;
                }
                case 837: {
                    ik.field_h = stackIn_837_0 != 0;
                    stackOut_837_0 = ti.field_A;
                    stackOut_837_1 = 44;
                    stackIn_839_0 = stackOut_837_0;
                    stackIn_839_1 = stackOut_837_1;
                    stackIn_838_0 = stackOut_837_0;
                    stackIn_838_1 = stackOut_837_1;
                    if (!ik.field_h) {
                        statePc = 839;
                    } else {
                        statePc = 838;
                    }
                    continue stateLoop;
                }
                case 838: {
                    stackOut_838_0 = (String[]) (Object) stackIn_838_0;
                    stackOut_838_1 = stackIn_838_1;
                    stackOut_838_2 = o.field_a;
                    stackIn_840_0 = stackOut_838_0;
                    stackIn_840_1 = stackOut_838_1;
                    stackIn_840_2 = stackOut_838_2;
                    statePc = 840;
                    continue stateLoop;
                }
                case 839: {
                    stackOut_839_0 = (String[]) (Object) stackIn_839_0;
                    stackOut_839_1 = stackIn_839_1;
                    stackOut_839_2 = sa.field_b;
                    stackIn_840_0 = stackOut_839_0;
                    stackIn_840_1 = stackOut_839_1;
                    stackIn_840_2 = stackOut_839_2;
                    statePc = 840;
                    continue stateLoop;
                }
                case 840: {
                    stackIn_840_0[stackIn_840_1] = stackIn_840_2;
                    if (ni.b(20)) {
                        statePc = 842;
                    } else {
                        statePc = 841;
                    }
                    continue stateLoop;
                }
                case 841: {
                    int discarded$78 = 3;
                    um.f();
                    statePc = 842;
                    continue stateLoop;
                }
                case 842: {
                    if (((nb) this).field_r != 33) {
                        statePc = 858;
                    } else {
                        statePc = 843;
                    }
                    continue stateLoop;
                }
                case 843: {
                    if (lb.field_gc == 1) {
                        statePc = 845;
                    } else {
                        statePc = 858;
                    }
                    continue stateLoop;
                }
                case 845: {
                    var9 = ((nb) this).field_X.field_r + vk.field_h[((nb) this).field_X.field_c];
                    var10_ref_je = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                    if (var10_ref_je == null) {
                        statePc = 849;
                    } else {
                        statePc = 846;
                    }
                    continue stateLoop;
                }
                case 846: {
                    if (var10_ref_je.field_r > var9) {
                        statePc = 848;
                    } else {
                        statePc = 849;
                    }
                    continue stateLoop;
                }
                case 848: {
                    var9 = var10_ref_je.field_r;
                    statePc = 849;
                    continue stateLoop;
                }
                case 849: {
                    if (var9 < 500 + ((nb) this).field_X.field_r) {
                        statePc = 851;
                    } else {
                        statePc = 858;
                    }
                    continue stateLoop;
                }
                case 851: {
                    var11_ref_je = new je(6, -1, var9);
                    if (!((nb) this).field_d) {
                        statePc = 853;
                    } else {
                        statePc = 852;
                    }
                    continue stateLoop;
                }
                case 852: {
                    mm.field_g.a(64, (byte) -117);
                    mm.field_g.a((byte) 115, 6);
                    mm.field_g.a((byte) 122, -1);
                    mm.field_g.b(true, var9);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    statePc = 854;
                    continue stateLoop;
                }
                case 853: {
                    var11_ref_je.field_p = true;
                    statePc = 854;
                    continue stateLoop;
                }
                case 854: {
                    if (di.field_g != -1) {
                        statePc = 857;
                    } else {
                        statePc = 855;
                    }
                    continue stateLoop;
                }
                case 855: {
                    if (((nb) this).field_X.field_c == 1) {
                        statePc = 858;
                    } else {
                        statePc = 857;
                    }
                    continue stateLoop;
                }
                case 857: {
                    ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var11_ref_je);
                    statePc = 858;
                    continue stateLoop;
                }
                case 858: {
                    if (((nb) this).field_r != 34) {
                        statePc = 873;
                    } else {
                        statePc = 859;
                    }
                    continue stateLoop;
                }
                case 859: {
                    if (lb.field_gc == 1) {
                        statePc = 861;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 861: {
                    var9 = vk.field_h[((nb) this).field_X.field_c] + ((nb) this).field_X.field_r;
                    var10_ref_je = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                    if (var10_ref_je == null) {
                        statePc = 864;
                    } else {
                        statePc = 862;
                    }
                    continue stateLoop;
                }
                case 862: {
                    if (var9 >= var10_ref_je.field_r) {
                        statePc = 864;
                    } else {
                        statePc = 863;
                    }
                    continue stateLoop;
                }
                case 863: {
                    var9 = var10_ref_je.field_r;
                    statePc = 864;
                    continue stateLoop;
                }
                case 864: {
                    if (var9 < 500 + ((nb) this).field_X.field_r) {
                        statePc = 866;
                    } else {
                        statePc = 873;
                    }
                    continue stateLoop;
                }
                case 866: {
                    var11_ref_je = new je(6, 1, var9);
                    if (!((nb) this).field_d) {
                        statePc = 868;
                    } else {
                        statePc = 867;
                    }
                    continue stateLoop;
                }
                case 867: {
                    mm.field_g.a(64, (byte) -117);
                    mm.field_g.a((byte) 122, 6);
                    mm.field_g.a((byte) 115, -1);
                    mm.field_g.b(true, var9);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    statePc = 869;
                    continue stateLoop;
                }
                case 868: {
                    var11_ref_je.field_p = true;
                    statePc = 869;
                    continue stateLoop;
                }
                case 869: {
                    if (di.field_g != -1) {
                        statePc = 872;
                    } else {
                        statePc = 870;
                    }
                    continue stateLoop;
                }
                case 870: {
                    if (1 == ((nb) this).field_X.field_c) {
                        statePc = 873;
                    } else {
                        statePc = 872;
                    }
                    continue stateLoop;
                }
                case 872: {
                    ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var11_ref_je);
                    statePc = 873;
                    continue stateLoop;
                }
                case 873: {
                    if (((nb) this).field_r != 35) {
                        statePc = 888;
                    } else {
                        statePc = 874;
                    }
                    continue stateLoop;
                }
                case 874: {
                    if (lb.field_gc != 1) {
                        statePc = 888;
                    } else {
                        statePc = 875;
                    }
                    continue stateLoop;
                }
                case 875: {
                    var9 = vk.field_h[((nb) this).field_X.field_c] + ((nb) this).field_X.field_r;
                    var10_ref_je = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                    if (var10_ref_je == null) {
                        statePc = 879;
                    } else {
                        statePc = 876;
                    }
                    continue stateLoop;
                }
                case 876: {
                    if (var9 < var10_ref_je.field_r) {
                        statePc = 878;
                    } else {
                        statePc = 879;
                    }
                    continue stateLoop;
                }
                case 878: {
                    var9 = var10_ref_je.field_r;
                    statePc = 879;
                    continue stateLoop;
                }
                case 879: {
                    if (((nb) this).field_X.field_r + 500 > var9) {
                        statePc = 881;
                    } else {
                        statePc = 888;
                    }
                    continue stateLoop;
                }
                case 881: {
                    var11_ref_je = new je(6, 0, var9);
                    if (!((nb) this).field_d) {
                        statePc = 883;
                    } else {
                        statePc = 882;
                    }
                    continue stateLoop;
                }
                case 882: {
                    mm.field_g.a(64, (byte) -117);
                    mm.field_g.a((byte) 122, 6);
                    mm.field_g.a((byte) 110, -1);
                    mm.field_g.b(true, var9);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    mm.field_g.b(true, 0);
                    statePc = 884;
                    continue stateLoop;
                }
                case 883: {
                    var11_ref_je.field_p = true;
                    statePc = 884;
                    continue stateLoop;
                }
                case 884: {
                    if (di.field_g != -1) {
                        statePc = 887;
                    } else {
                        statePc = 885;
                    }
                    continue stateLoop;
                }
                case 885: {
                    if (((nb) this).field_X.field_c == 1) {
                        statePc = 888;
                    } else {
                        statePc = 887;
                    }
                    continue stateLoop;
                }
                case 887: {
                    ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var11_ref_je);
                    statePc = 888;
                    continue stateLoop;
                }
                case 888: {
                    if (5 == ((nb) this).field_r) {
                        statePc = 891;
                    } else {
                        statePc = 889;
                    }
                    continue stateLoop;
                }
                case 889: {
                    if (((nb) this).field_r != 39) {
                        statePc = 895;
                    } else {
                        statePc = 891;
                    }
                    continue stateLoop;
                }
                case 891: {
                    if (1 != lb.field_gc) {
                        statePc = 895;
                    } else {
                        statePc = 892;
                    }
                    continue stateLoop;
                }
                case 892: {
                    vd.field_b = true;
                    if (((nb) this).field_r != 39) {
                        statePc = 894;
                    } else {
                        statePc = 893;
                    }
                    continue stateLoop;
                }
                case 893: {
                    lh.field_D = true;
                    statePc = 894;
                    continue stateLoop;
                }
                case 894: {
                    ((nb) this).i(106);
                    statePc = 895;
                    continue stateLoop;
                }
                case 895: {
                    if (((nb) this).field_r == 2) {
                        statePc = 898;
                    } else {
                        statePc = 896;
                    }
                    continue stateLoop;
                }
                case 896: {
                    if (42 != ((nb) this).field_r) {
                        statePc = 905;
                    } else {
                        statePc = 898;
                    }
                    continue stateLoop;
                }
                case 898: {
                    if (lb.field_gc == 1) {
                        statePc = 900;
                    } else {
                        statePc = 905;
                    }
                    continue stateLoop;
                }
                case 900: {
                    vd.field_b = true;
                    if (10 != di.field_g) {
                        statePc = 903;
                    } else {
                        statePc = 901;
                    }
                    continue stateLoop;
                }
                case 901: {
                    if (qh.field_Yb == 0) {
                        statePc = 904;
                    } else {
                        statePc = 903;
                    }
                    continue stateLoop;
                }
                case 903: {
                    int discarded$79 = -1589;
                    this.k();
                    statePc = 905;
                    continue stateLoop;
                }
                case 904: {
                    dl.field_M = 1;
                    qh.field_Yb = 1;
                    statePc = 905;
                    continue stateLoop;
                }
                case 905: {
                    if (((nb) this).field_r != 3) {
                        statePc = 908;
                    } else {
                        statePc = 906;
                    }
                    continue stateLoop;
                }
                case 906: {
                    if (lb.field_gc != 1) {
                        statePc = 908;
                    } else {
                        statePc = 907;
                    }
                    continue stateLoop;
                }
                case 907: {
                    vd.field_b = true;
                    statePc = 908;
                    continue stateLoop;
                }
                case 908: {
                    if (((nb) this).field_r != 4) {
                        statePc = 914;
                    } else {
                        statePc = 909;
                    }
                    continue stateLoop;
                }
                case 909: {
                    if (lb.field_gc == 1) {
                        statePc = 911;
                    } else {
                        statePc = 914;
                    }
                    continue stateLoop;
                }
                case 911: {
                    vd.field_b = true;
                    g.field_c.g(100);
                    g.field_c = null;
                    var9 = 2 * ll.field_q;
                    if (256 >= var9) {
                        statePc = 913;
                    } else {
                        statePc = 912;
                    }
                    continue stateLoop;
                }
                case 912: {
                    var9 = 256;
                    statePc = 913;
                    continue stateLoop;
                }
                case 913: {
                    ef.a(1, var9);
                    statePc = 914;
                    continue stateLoop;
                }
                case 914: {
                    if (di.field_g != 4) {
                        statePc = 918;
                    } else {
                        statePc = 915;
                    }
                    continue stateLoop;
                }
                case 915: {
                    if (lb.field_gc == 1) {
                        statePc = 917;
                    } else {
                        statePc = 918;
                    }
                    continue stateLoop;
                }
                case 917: {
                    this.d(91);
                    statePc = 918;
                    continue stateLoop;
                }
                case 918: {
                    if (27 != ((nb) this).field_r) {
                        statePc = 922;
                    } else {
                        statePc = 919;
                    }
                    continue stateLoop;
                }
                case 919: {
                    if (lb.field_gc == 1) {
                        statePc = 921;
                    } else {
                        statePc = 922;
                    }
                    continue stateLoop;
                }
                case 921: {
                    vd.field_b = true;
                    ee.c(-2483, 95);
                    ((nb) this).field_h = false;
                    statePc = 922;
                    continue stateLoop;
                }
                case 922: {
                    if (((nb) this).field_r != 30) {
                        statePc = 936;
                    } else {
                        statePc = 923;
                    }
                    continue stateLoop;
                }
                case 923: {
                    if (1 == lb.field_gc) {
                        statePc = 925;
                    } else {
                        statePc = 936;
                    }
                    continue stateLoop;
                }
                case 925: {
                    vd.field_b = true;
                    ee.c(-2483, 95);
                    if (ob.field_y) {
                        statePc = 927;
                    } else {
                        statePc = 933;
                    }
                    continue stateLoop;
                }
                case 927: {
                    var9 = vb.field_g;
                    if (5 == var9) {
                        statePc = 931;
                    } else {
                        statePc = 928;
                    }
                    continue stateLoop;
                }
                case 928: {
                    if (var9 == 6) {
                        statePc = 931;
                    } else {
                        statePc = 929;
                    }
                    continue stateLoop;
                }
                case 929: {
                    if (var9 != 8) {
                        statePc = 932;
                    } else {
                        statePc = 931;
                    }
                    continue stateLoop;
                }
                case 931: {
                    var9 = gh.field_Jb;
                    statePc = 932;
                    continue stateLoop;
                }
                case 932: {
                    q.a(-5, true, -1, var9);
                    statePc = 933;
                    continue stateLoop;
                }
                case 933: {
                    if (ee.field_G) {
                        statePc = 935;
                    } else {
                        statePc = 936;
                    }
                    continue stateLoop;
                }
                case 935: {
                    ei.a(0, (byte) -23, 11);
                    statePc = 936;
                    continue stateLoop;
                }
                case 936: {
                    if (((nb) this).field_r != 29) {
                        statePc = 939;
                    } else {
                        statePc = 937;
                    }
                    continue stateLoop;
                }
                case 937: {
                    if (lb.field_gc != 1) {
                        statePc = 939;
                    } else {
                        statePc = 938;
                    }
                    continue stateLoop;
                }
                case 938: {
                    vd.field_b = true;
                    ee.c(-2483, 95);
                    fk.field_i.a(false);
                    q.a(-1, true, -1, 0);
                    statePc = 939;
                    continue stateLoop;
                }
                case 939: {
                    if (31 != ((nb) this).field_r) {
                        statePc = 942;
                    } else {
                        statePc = 940;
                    }
                    continue stateLoop;
                }
                case 940: {
                    if (lb.field_gc != 1) {
                        statePc = 942;
                    } else {
                        statePc = 941;
                    }
                    continue stateLoop;
                }
                case 941: {
                    vd.field_b = true;
                    ee.c(-2483, 95);
                    var19 = null;
                    v.a(-1, (String) null, 10);
                    statePc = 942;
                    continue stateLoop;
                }
                case 942: {
                    if (((nb) this).field_r != 32) {
                        statePc = 957;
                    } else {
                        statePc = 943;
                    }
                    continue stateLoop;
                }
                case 943: {
                    if (lb.field_gc == 1) {
                        statePc = 945;
                    } else {
                        statePc = 957;
                    }
                    continue stateLoop;
                }
                case 945: {
                    vd.field_b = true;
                    fm.field_f[0] = 0;
                    var9 = 0;
                    statePc = 946;
                    continue stateLoop;
                }
                case 946: {
                    if (~rn.field_D.length >= ~var9) {
                        statePc = 948;
                    } else {
                        statePc = 947;
                    }
                    continue stateLoop;
                }
                case 947: {
                    rn.field_D[var9] = 0;
                    var9++;
                    statePc = 946;
                    continue stateLoop;
                }
                case 948: {
                    var9 = 0;
                    statePc = 949;
                    continue stateLoop;
                }
                case 949: {
                    if (~var9 <= ~fe.field_D.length) {
                        statePc = 951;
                    } else {
                        statePc = 950;
                    }
                    continue stateLoop;
                }
                case 950: {
                    fe.field_D[var9] = 0;
                    var9++;
                    statePc = 949;
                    continue stateLoop;
                }
                case 951: {
                    ea.field_k = false;
                    ol.field_Ub = 0;
                    lc.field_e = true;
                    var9 = vb.field_g;
                    if (var9 == 5) {
                        statePc = 955;
                    } else {
                        statePc = 952;
                    }
                    continue stateLoop;
                }
                case 952: {
                    if (var9 == 6) {
                        statePc = 955;
                    } else {
                        statePc = 953;
                    }
                    continue stateLoop;
                }
                case 953: {
                    if (var9 == 8) {
                        statePc = 955;
                    } else {
                        statePc = 956;
                    }
                    continue stateLoop;
                }
                case 955: {
                    var9 = gh.field_Jb;
                    statePc = 956;
                    continue stateLoop;
                }
                case 956: {
                    q.a(0, false, -1, var9);
                    statePc = 957;
                    continue stateLoop;
                }
                case 957: {
                    if (((nb) this).field_r != 40) {
                        statePc = 960;
                    } else {
                        statePc = 958;
                    }
                    continue stateLoop;
                }
                case 958: {
                    if (lb.field_gc != 1) {
                        statePc = 960;
                    } else {
                        statePc = 959;
                    }
                    continue stateLoop;
                }
                case 959: {
                    sh.a(-3, true, true);
                    statePc = 960;
                    continue stateLoop;
                }
                case 960: {
                    if (((nb) this).field_d) {
                        statePc = 962;
                    } else {
                        statePc = 969;
                    }
                    continue stateLoop;
                }
                case 962: {
                    hj.field_s = sg.field_b;
                    if (vl.field_v) {
                        statePc = 968;
                    } else {
                        statePc = 963;
                    }
                    continue stateLoop;
                }
                case 963: {
                    if (ln.field_e <= 1) {
                        statePc = 965;
                    } else {
                        statePc = 964;
                    }
                    continue stateLoop;
                }
                case 964: {
                    hj.field_s = db.a(cj.field_b, -80, new String[1]);
                    statePc = 968;
                    continue stateLoop;
                }
                case 965: {
                    if (1 != ln.field_e) {
                        statePc = 967;
                    } else {
                        statePc = 966;
                    }
                    continue stateLoop;
                }
                case 966: {
                    hj.field_s = gb.field_b;
                    statePc = 968;
                    continue stateLoop;
                }
                case 967: {
                    hj.field_s = ci.field_d;
                    statePc = 968;
                    continue stateLoop;
                }
                case 968: {
                    var9 = fk.field_d.c(hj.field_s.toUpperCase());
                    jl.field_c = jl.field_c + 0.05000000074505806f * ((float)var9 - jl.field_c);
                    statePc = 969;
                    continue stateLoop;
                }
                case 969: {
                    if (!((nb) this).field_d) {
                        statePc = 973;
                    } else {
                        statePc = 970;
                    }
                    continue stateLoop;
                }
                case 970: {
                    if (!param1) {
                        statePc = 973;
                    } else {
                        statePc = 971;
                    }
                    continue stateLoop;
                }
                case 971: {
                    if (!jn.field_g) {
                        statePc = 974;
                    } else {
                        statePc = 973;
                    }
                    continue stateLoop;
                }
                case 973: {
                    bb.field_T = false;
                    statePc = 1003;
                    continue stateLoop;
                }
                case 974: {
                    var9 = 24;
                    var10 = 356;
                    if (!vl.field_v) {
                        statePc = 976;
                    } else {
                        statePc = 975;
                    }
                    continue stateLoop;
                }
                case 975: {
                    var10 = 336;
                    statePc = 976;
                    continue stateLoop;
                }
                case 976: {
                    bb.field_T = false;
                    if (!bb.field_T) {
                        statePc = 979;
                    } else {
                        statePc = 977;
                    }
                    continue stateLoop;
                }
                case 977: {
                    if (param1) {
                        statePc = 982;
                    } else {
                        statePc = 979;
                    }
                    continue stateLoop;
                }
                case 979: {
                    if (ln.field_e <= 0) {
                        statePc = 983;
                    } else {
                        statePc = 980;
                    }
                    continue stateLoop;
                }
                case 980: {
                    if (a.field_c % 40 >= 20) {
                        statePc = 983;
                    } else {
                        statePc = 982;
                    }
                    continue stateLoop;
                }
                case 982: {
                    stackOut_982_0 = 1;
                    stackIn_984_0 = stackOut_982_0;
                    statePc = 984;
                    continue stateLoop;
                }
                case 983: {
                    stackOut_983_0 = 0;
                    stackIn_984_0 = stackOut_983_0;
                    statePc = 984;
                    continue stateLoop;
                }
                case 984: {
                    var11 = stackIn_984_0;
                    if (var11 == 0) {
                        statePc = 986;
                    } else {
                        statePc = 985;
                    }
                    continue stateLoop;
                }
                case 985: {
                    stackOut_985_0 = be.field_f;
                    stackIn_987_0 = stackOut_985_0;
                    statePc = 987;
                    continue stateLoop;
                }
                case 986: {
                    stackOut_986_0 = co.field_d;
                    stackIn_987_0 = stackOut_986_0;
                    statePc = 987;
                    continue stateLoop;
                }
                case 987: {
                    var12 = stackIn_987_0;
                    var13 = var12[0].field_A + ((int)jl.field_c + var12[2].field_A);
                    if (oh.field_f < 0) {
                        statePc = 993;
                    } else {
                        statePc = 988;
                    }
                    continue stateLoop;
                }
                case 988: {
                    if (var13 <= oh.field_f) {
                        statePc = 993;
                    } else {
                        statePc = 989;
                    }
                    continue stateLoop;
                }
                case 989: {
                    if (pi.field_c < var10) {
                        statePc = 993;
                    } else {
                        statePc = 990;
                    }
                    continue stateLoop;
                }
                case 990: {
                    if (~pi.field_c > ~(var9 + var10)) {
                        statePc = 992;
                    } else {
                        statePc = 993;
                    }
                    continue stateLoop;
                }
                case 992: {
                    bb.field_T = true;
                    ((nb) this).field_r = 0;
                    statePc = 993;
                    continue stateLoop;
                }
                case 993: {
                    if (lb.field_gc != 1) {
                        statePc = 1003;
                    } else {
                        statePc = 994;
                    }
                    continue stateLoop;
                }
                case 994: {
                    if (bb.field_T) {
                        statePc = 996;
                    } else {
                        statePc = 1003;
                    }
                    continue stateLoop;
                }
                case 996: {
                    if (vl.field_v) {
                        statePc = 998;
                    } else {
                        statePc = 997;
                    }
                    continue stateLoop;
                }
                case 997: {
                    stackOut_997_0 = 1;
                    stackIn_999_0 = stackOut_997_0;
                    statePc = 999;
                    continue stateLoop;
                }
                case 998: {
                    stackOut_998_0 = 0;
                    stackIn_999_0 = stackOut_998_0;
                    statePc = 999;
                    continue stateLoop;
                }
                case 999: {
                    vl.field_v = stackIn_999_0 != 0;
                    if (vl.field_v) {
                        statePc = 1001;
                    } else {
                        statePc = 1003;
                    }
                    continue stateLoop;
                }
                case 1001: {
                    ln.field_e = 0;
                    statePc = 1003;
                    continue stateLoop;
                }
                case 1003: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void b(boolean param0, int param1) {
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
        int var16 = 0;
        String var16_ref_String = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        hd var25_ref_hd = null;
        int var25 = 0;
        String var25_ref_String = null;
        Object var26_ref = null;
        int var26 = 0;
        mb var26_ref_mb = null;
        ne var26_ref_ne = null;
        wl var26_ref_wl = null;
        jb var26_ref_jb = null;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        wk var29_ref_wk = null;
        je var29_ref_je = null;
        int var30 = 0;
        String var30_ref_String = null;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_150_0 = 0;
        fh stackIn_151_0 = null;
        String stackIn_151_1 = null;
        int stackIn_151_2 = 0;
        int stackIn_151_3 = 0;
        fh stackIn_152_0 = null;
        String stackIn_152_1 = null;
        int stackIn_152_2 = 0;
        int stackIn_152_3 = 0;
        fh stackIn_153_0 = null;
        String stackIn_153_1 = null;
        int stackIn_153_2 = 0;
        int stackIn_153_3 = 0;
        int stackIn_153_4 = 0;
        int stackIn_156_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_158_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        int stackIn_161_0 = 0;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_162_2 = 0;
        int stackIn_162_3 = 0;
        int stackIn_170_0 = 0;
        fh stackIn_171_0 = null;
        String stackIn_171_1 = null;
        int stackIn_171_2 = 0;
        int stackIn_171_3 = 0;
        fh stackIn_172_0 = null;
        String stackIn_172_1 = null;
        int stackIn_172_2 = 0;
        int stackIn_172_3 = 0;
        fh stackIn_173_0 = null;
        String stackIn_173_1 = null;
        int stackIn_173_2 = 0;
        int stackIn_173_3 = 0;
        int stackIn_173_4 = 0;
        int stackIn_176_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        int stackIn_180_2 = 0;
        int stackIn_181_0 = 0;
        int stackIn_181_1 = 0;
        int stackIn_181_2 = 0;
        int stackIn_182_0 = 0;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        int stackIn_182_3 = 0;
        int stackIn_193_0 = 0;
        fh stackIn_196_0 = null;
        String stackIn_196_1 = null;
        int stackIn_196_2 = 0;
        int stackIn_196_3 = 0;
        fh stackIn_197_0 = null;
        String stackIn_197_1 = null;
        int stackIn_197_2 = 0;
        int stackIn_197_3 = 0;
        fh stackIn_198_0 = null;
        String stackIn_198_1 = null;
        int stackIn_198_2 = 0;
        int stackIn_198_3 = 0;
        int stackIn_198_4 = 0;
        int stackIn_201_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_204_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_205_2 = 0;
        int stackIn_206_0 = 0;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_207_0 = 0;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int stackIn_207_3 = 0;
        int stackIn_215_0 = 0;
        fh stackIn_216_0 = null;
        String stackIn_216_1 = null;
        int stackIn_216_2 = 0;
        int stackIn_216_3 = 0;
        fh stackIn_217_0 = null;
        String stackIn_217_1 = null;
        int stackIn_217_2 = 0;
        int stackIn_217_3 = 0;
        fh stackIn_218_0 = null;
        String stackIn_218_1 = null;
        int stackIn_218_2 = 0;
        int stackIn_218_3 = 0;
        int stackIn_218_4 = 0;
        int stackIn_221_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_224_1 = 0;
        int stackIn_225_0 = 0;
        int stackIn_225_1 = 0;
        int stackIn_225_2 = 0;
        int stackIn_226_0 = 0;
        int stackIn_226_1 = 0;
        int stackIn_226_2 = 0;
        int stackIn_227_0 = 0;
        int stackIn_227_1 = 0;
        int stackIn_227_2 = 0;
        int stackIn_227_3 = 0;
        fh stackIn_286_0 = null;
        String stackIn_286_1 = null;
        int stackIn_286_2 = 0;
        int stackIn_286_3 = 0;
        fh stackIn_287_0 = null;
        String stackIn_287_1 = null;
        int stackIn_287_2 = 0;
        int stackIn_287_3 = 0;
        fh stackIn_288_0 = null;
        String stackIn_288_1 = null;
        int stackIn_288_2 = 0;
        int stackIn_288_3 = 0;
        int stackIn_288_4 = 0;
        fh stackIn_290_0 = null;
        String stackIn_290_1 = null;
        int stackIn_290_2 = 0;
        int stackIn_290_3 = 0;
        fh stackIn_291_0 = null;
        String stackIn_291_1 = null;
        int stackIn_291_2 = 0;
        int stackIn_291_3 = 0;
        fh stackIn_292_0 = null;
        String stackIn_292_1 = null;
        int stackIn_292_2 = 0;
        int stackIn_292_3 = 0;
        int stackIn_292_4 = 0;
        int stackIn_297_0 = 0;
        String stackIn_310_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_149_0 = 0;
        fh stackOut_150_0 = null;
        String stackOut_150_1 = null;
        int stackOut_150_2 = 0;
        int stackOut_150_3 = 0;
        fh stackOut_152_0 = null;
        String stackOut_152_1 = null;
        int stackOut_152_2 = 0;
        int stackOut_152_3 = 0;
        int stackOut_152_4 = 0;
        fh stackOut_151_0 = null;
        String stackOut_151_1 = null;
        int stackOut_151_2 = 0;
        int stackOut_151_3 = 0;
        int stackOut_151_4 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_158_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_161_2 = 0;
        int stackOut_161_3 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        int stackOut_160_2 = 0;
        int stackOut_160_3 = 0;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        fh stackOut_170_0 = null;
        String stackOut_170_1 = null;
        int stackOut_170_2 = 0;
        int stackOut_170_3 = 0;
        fh stackOut_172_0 = null;
        String stackOut_172_1 = null;
        int stackOut_172_2 = 0;
        int stackOut_172_3 = 0;
        int stackOut_172_4 = 0;
        fh stackOut_171_0 = null;
        String stackOut_171_1 = null;
        int stackOut_171_2 = 0;
        int stackOut_171_3 = 0;
        int stackOut_171_4 = 0;
        int stackOut_175_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_178_1 = 0;
        int stackOut_177_0 = 0;
        int stackOut_177_1 = 0;
        int stackOut_179_0 = 0;
        int stackOut_179_1 = 0;
        int stackOut_179_2 = 0;
        int stackOut_181_0 = 0;
        int stackOut_181_1 = 0;
        int stackOut_181_2 = 0;
        int stackOut_181_3 = 0;
        int stackOut_180_0 = 0;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        int stackOut_180_3 = 0;
        int stackOut_191_0 = 0;
        int stackOut_192_0 = 0;
        fh stackOut_195_0 = null;
        String stackOut_195_1 = null;
        int stackOut_195_2 = 0;
        int stackOut_195_3 = 0;
        fh stackOut_197_0 = null;
        String stackOut_197_1 = null;
        int stackOut_197_2 = 0;
        int stackOut_197_3 = 0;
        int stackOut_197_4 = 0;
        fh stackOut_196_0 = null;
        String stackOut_196_1 = null;
        int stackOut_196_2 = 0;
        int stackOut_196_3 = 0;
        int stackOut_196_4 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_203_1 = 0;
        int stackOut_202_0 = 0;
        int stackOut_202_1 = 0;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        int stackOut_206_0 = 0;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_206_3 = 0;
        int stackOut_205_0 = 0;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int stackOut_205_3 = 0;
        int stackOut_214_0 = 0;
        int stackOut_213_0 = 0;
        fh stackOut_215_0 = null;
        String stackOut_215_1 = null;
        int stackOut_215_2 = 0;
        int stackOut_215_3 = 0;
        fh stackOut_217_0 = null;
        String stackOut_217_1 = null;
        int stackOut_217_2 = 0;
        int stackOut_217_3 = 0;
        int stackOut_217_4 = 0;
        fh stackOut_216_0 = null;
        String stackOut_216_1 = null;
        int stackOut_216_2 = 0;
        int stackOut_216_3 = 0;
        int stackOut_216_4 = 0;
        int stackOut_220_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_223_1 = 0;
        int stackOut_222_0 = 0;
        int stackOut_222_1 = 0;
        int stackOut_224_0 = 0;
        int stackOut_224_1 = 0;
        int stackOut_224_2 = 0;
        int stackOut_226_0 = 0;
        int stackOut_226_1 = 0;
        int stackOut_226_2 = 0;
        int stackOut_226_3 = 0;
        int stackOut_225_0 = 0;
        int stackOut_225_1 = 0;
        int stackOut_225_2 = 0;
        int stackOut_225_3 = 0;
        fh stackOut_289_0 = null;
        String stackOut_289_1 = null;
        int stackOut_289_2 = 0;
        int stackOut_289_3 = 0;
        fh stackOut_291_0 = null;
        String stackOut_291_1 = null;
        int stackOut_291_2 = 0;
        int stackOut_291_3 = 0;
        int stackOut_291_4 = 0;
        fh stackOut_290_0 = null;
        String stackOut_290_1 = null;
        int stackOut_290_2 = 0;
        int stackOut_290_3 = 0;
        int stackOut_290_4 = 0;
        fh stackOut_285_0 = null;
        String stackOut_285_1 = null;
        int stackOut_285_2 = 0;
        int stackOut_285_3 = 0;
        fh stackOut_287_0 = null;
        String stackOut_287_1 = null;
        int stackOut_287_2 = 0;
        int stackOut_287_3 = 0;
        int stackOut_287_4 = 0;
        fh stackOut_286_0 = null;
        String stackOut_286_1 = null;
        int stackOut_286_2 = 0;
        int stackOut_286_3 = 0;
        int stackOut_286_4 = 0;
        int stackOut_296_0 = 0;
        int stackOut_295_0 = 0;
        String stackOut_309_0 = null;
        String stackOut_308_0 = null;
        L0: {
          var26_ref = null;
          var40 = SteelSentinels.field_G;
          var3 = 1;
          var4 = 1;
          var5 = 1;
          var6 = di.field_g;
          if (var6 == 0) {
            L1: {
              var4 = 0;
              if (qh.field_Yb < 8) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            var5 = stackIn_7_0;
            var3 = 0;
            break L0;
          } else {
            if (1 == var6) {
              break L0;
            } else {
              if (var6 == 3) {
                L2: {
                  if (qh.field_Yb < 5) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                var5 = stackIn_11_0;
                if (qh.field_Yb != 3) {
                  break L0;
                } else {
                  if ((31 & a.field_c) <= 24) {
                    break L0;
                  } else {
                    if (((nb) this).field_C.field_ub < 0) {
                      break L0;
                    } else {
                      var4 = 0;
                      break L0;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        L3: {
          L4: {
            if (sj.a(true)) {
              break L4;
            } else {
              if (kj.field_w <= 0) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              } else {
                break L4;
              }
            }
          }
          stackOut_18_0 = 1;
          stackIn_20_0 = stackOut_18_0;
          break L3;
        }
        L5: {
          var6 = stackIn_20_0;
          if (((nb) this).field_r != -1) {
            break L5;
          } else {
            if (var6 == 0) {
              break L5;
            } else {
              ((nb) this).field_r = 0;
              break L5;
            }
          }
        }
        L6: {
          if (((nb) this).field_C != null) {
            pb.a(3, 423, 71, 54, 0);
            pb.a(77, 423, 77, 54, 0);
            pb.e(4, 424, 69, 26, 0, 1052688);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (param1 == 1956917985) {
            break L7;
          } else {
            this.a(116, -87, -26);
            break L7;
          }
        }
        L8: {
          if (((nb) this).field_C == null) {
            break L8;
          } else {
            L9: {
              if (!((nb) this).field_C.i(24, -27)) {
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (!((nb) this).field_C.i(16, -27)) {
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (((nb) this).field_C.i(15, -27)) {
                break L11;
              } else {
                break L11;
              }
            }
            if (((nb) this).field_C.field_fb != 0) {
              break L8;
            } else {
              break L8;
            }
          }
        }
        L12: {
          var7 = 138;
          var8 = 138;
          var9 = 1;
          var10 = 41;
          var11 = 3;
          var14 = -var9 + var7 - var11;
          var12 = var11;
          var13 = var11 + 385;
          if (null != ((nb) this).field_C) {
            break L12;
          } else {
            if (((nb) this).field_X.field_j) {
              break L12;
            } else {
              L13: {
                var16_ref_String = ri.field_d;
                if (0 >= ((nb) this).field_X.field_bb.length) {
                  break L13;
                } else {
                  if (null == ((nb) this).field_X.field_bb[0]) {
                    break L13;
                  } else {
                    var16_ref_String = db.a(n.field_o, -30, new String[1]);
                    break L13;
                  }
                }
              }
              L14: {
                var17 = ((nb) this).field_M[0];
                if (var17 != 7196927) {
                  break L14;
                } else {
                  var17 = 26248;
                  break L14;
                }
              }
              pl.field_U.a(var16_ref_String, 320, 405, var17, -1);
              break L12;
            }
          }
        }
        L15: {
          var15 = var10 + -var9 + -var11;
          if (((nb) this).field_C == null) {
            break L15;
          } else {
            L16: {
              var16 = 6;
              var17 = 427;
              fk.field_d.b(mb.field_I, var16, var17 - -9, 1021128, -1);
              var16 = var16 + (2 + fk.field_d.c(mb.field_I));
              qg.field_f[3].a(var16, var17);
              var17 += 22;
              var16 = 6;
              var18 = 1021128;
              if (null == ((nb) this).field_C) {
                break L16;
              } else {
                if (((nb) this).field_C.field_Dc <= 0) {
                  break L16;
                } else {
                  var18 = 8421504;
                  break L16;
                }
              }
            }
            L17: {
              fk.field_d.b(l.field_f, var16, 9 + var17, var18, -1);
              var17 += 13;
              if (!dm.field_c) {
                qg.field_f[4].a(var16, var17);
                var16 += 13;
                break L17;
              } else {
                qg.field_f[5].a(var16, var17);
                var16 += 14;
                break L17;
              }
            }
            fk.field_d.b(fg.field_Pb, var16, 9 + var17, 10526880, -1);
            var16 = var16 + (fk.field_d.c(fg.field_Pb) - -2);
            bc.field_wb.f(var16, var17);
            var16 = var16 + (2 + bc.field_wb.field_A);
            fk.field_d.b("+", var16, 9 + var17, 10526880, -1);
            var16 = var16 + fk.field_d.c("+");
            qg.field_f[3].a(var16, var17);
            break L15;
          }
        }
        L18: {
          if (((nb) this).field_C == null) {
            break L18;
          } else {
            L19: {
              var14 = -var8 + (640 - var7);
              var13 = 385 + var11;
              var12 = var7;
              var15 = var10 + (-var9 + -var11);
              if (!((nb) this).field_C.field_pc) {
                break L19;
              } else {
                if (((nb) this).field_C.field_Qb <= 0) {
                  break L19;
                } else {
                  if (((nb) this).field_C.field_Qb >= 100) {
                    break L19;
                  } else {
                    if (((nb) this).field_C.field_Qb >= ((nb) this).field_X.field_r) {
                      break L19;
                    } else {
                      var4 = 0;
                      var3 = 0;
                      break L19;
                    }
                  }
                }
              }
            }
            L20: {
              if (((nb) this).field_F >= ((nb) this).field_C.field_Xb.length) {
                ((nb) this).field_F = 0;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var13 = 383;
              var18 = 190;
              var19 = -var18 + 640;
              if (vl.field_v) {
                break L21;
              } else {
                if (var5 == 0) {
                  break L21;
                } else {
                  pb.a(var18, 0, var19, 480);
                  var20 = -5;
                  var21 = 6;
                  var22 = 30;
                  var23 = 1;
                  var24 = 320;
                  var25 = 0;
                  var26 = 0;
                  var27 = var20;
                  L22: while (true) {
                    if (var27 > var21) {
                      L23: {
                        pb.c();
                        if (var25 == 0) {
                          break L23;
                        } else {
                          var27 = 0;
                          L24: while (true) {
                            if (var27 >= 5) {
                              break L23;
                            } else {
                              pb.d(var18 + var27 + -6, -var27 + 400, 2 * var27 + 1, 10066329);
                              var27++;
                              continue L24;
                            }
                          }
                        }
                      }
                      if (var26 == 0) {
                        break L21;
                      } else {
                        var27 = 0;
                        L25: while (true) {
                          if (var27 >= 5) {
                            break L21;
                          } else {
                            pb.d(6 + -var27 + var19, -var27 + 400, var27 * 2 + 1, 10066329);
                            var27++;
                            continue L25;
                          }
                        }
                      }
                    } else {
                      L26: {
                        var28 = ((nb) this).field_F + var27;
                        if (0 > var28) {
                          break L26;
                        } else {
                          if (var28 < ((nb) this).field_C.field_Xb.length) {
                            L27: {
                              var16 = var24 - -(var27 * (var23 + var22));
                              var29 = ((nb) this).field_C.field_Xb[var28];
                              var17 = var15 / 2 + var13;
                              if (var27 < 0) {
                                var16 -= 22;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if (var27 <= 0) {
                                break L28;
                              } else {
                                var16 += 22;
                                break L28;
                              }
                            }
                            L29: {
                              ((nb) this).field_C.field_Zb.d(65536, var29);
                              if (var27 == 0) {
                                var17--;
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            if (var18 > var16) {
                              var25 = 1;
                              break L26;
                            } else {
                              if (~var19 > ~var16) {
                                var26 = 1;
                                break L26;
                              } else {
                                L30: {
                                  if (var27 != 0) {
                                    L31: {
                                      if (kj.field_w != 0) {
                                        break L31;
                                      } else {
                                        if (~var18 <= ~oh.field_f) {
                                          break L31;
                                        } else {
                                          if (var19 <= oh.field_f) {
                                            break L31;
                                          } else {
                                            if (oh.field_f < -15 + var16) {
                                              break L31;
                                            } else {
                                              if (~(var17 + -15) < ~pi.field_c) {
                                                break L31;
                                              } else {
                                                if (~oh.field_f < ~(var16 + 15)) {
                                                  break L31;
                                                } else {
                                                  if (var17 + 15 >= pi.field_c) {
                                                    ((nb) this).field_t = var28;
                                                    pb.a(var16 << 4, var17 << 4, 320, pe.field_o.length + -1, pe.field_o);
                                                    break L31;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (eh.field_b[ed.field_f] <= 0) {
                                      L32: {
                                        hb.field_j[((nb) this).field_M[3] + var29].d(var16, var17, 0, 4096 * var22 / 40);
                                        if (((nb) this).field_C.field_ub >= 0) {
                                          break L32;
                                        } else {
                                          if (c.a((byte) -101, var29)) {
                                            pb.c(var16 + -(var22 / 2), -(var22 / 2) + var17, var22, var22, 0, 192);
                                            break L30;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                      if (((nb) this).field_C.field_Tb >= 1) {
                                        break L30;
                                      } else {
                                        if (var29 == 8) {
                                          pb.c(-(var22 / 2) + var16, var17 + -(var22 / 2), var22, var22, 0, 192);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    } else {
                                      L33: {
                                        hb.field_j[var29 - -((nb) this).field_M[3]].d(var16, var17, 0, var22 * 4096 / 40);
                                        if (gl.field_p > 0) {
                                          var30 = var22 * gl.field_p / (50 * eh.field_b[ed.field_f]);
                                          pb.c(var16 - var22 / 2, -(var22 / 2) + var17, var22, var30, 0, 192);
                                          if (0 == si.field_t) {
                                            pb.c(-(var22 / 2) + var16, var30 + var17 - var22 / 2, var22, -var30 + var22, 0, 128);
                                            break L33;
                                          } else {
                                            break L33;
                                          }
                                        } else {
                                          break L33;
                                        }
                                      }
                                      fk.field_d.c(Integer.toString(si.field_t), 15 + var16, 14 + var17, 16777215, 0);
                                      break L30;
                                    }
                                  } else {
                                    if (eh.field_b[ed.field_f] <= 0) {
                                      L34: {
                                        hb.field_j[var29 + ((nb) this).field_M[3]].d(var16, var17, 0, 4096);
                                        if (((nb) this).field_C.field_ub >= 0) {
                                          break L34;
                                        } else {
                                          if (!c.a((byte) -90, var29)) {
                                            break L34;
                                          } else {
                                            pb.c(var16 - 20, -20 + var17, 40, 40, 0, 192);
                                            break L30;
                                          }
                                        }
                                      }
                                      if (((nb) this).field_C.field_Tb >= 1) {
                                        break L30;
                                      } else {
                                        if (var29 == 8) {
                                          pb.c(var16 + -20, -20 + var17, 40, 40, 0, 192);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    } else {
                                      L35: {
                                        hb.field_j[((nb) this).field_M[3] + var29].d(var16, var17, 0, 4096);
                                        if (gl.field_p > 0) {
                                          var30 = 40 * gl.field_p / (50 * eh.field_b[ed.field_f]);
                                          pb.c(var16 + -20, -20 + var17, 40, var30, 0, 192);
                                          if (si.field_t != 0) {
                                            break L35;
                                          } else {
                                            pb.c(-20 + var16, var17 - 20 - -var30, 40, 40 + -var30, 0, 128);
                                            break L35;
                                          }
                                        } else {
                                          break L35;
                                        }
                                      }
                                      fk.field_d.c(Integer.toString(si.field_t), 20 + var16, 17 + var17, 16777215, 0);
                                      break L30;
                                    }
                                  }
                                }
                                if (var27 == -1) {
                                  var30 = 0;
                                  L36: while (true) {
                                    if (var30 >= 11) {
                                      fk.field_d.a(gf.field_e, var22 / 2 + (var16 + 12), var17 + 4, 0, -1);
                                      break L26;
                                    } else {
                                      pb.d(var16 + (var30 + 20), var17 + -var30, 2 * var30 + 1, 10066329);
                                      var30++;
                                      continue L36;
                                    }
                                  }
                                } else {
                                  if (var27 != 1) {
                                    break L26;
                                  } else {
                                    var30 = 0;
                                    L37: while (true) {
                                      if (var30 >= 11) {
                                        fk.field_d.a(ob.field_w, -12 + var16 - var22 / 2, 4 + var17, 0, -1);
                                        break L26;
                                      } else {
                                        pb.d(var16 + (-var30 + -21), var17 + -var30, var30 * 2 + 1, 10066329);
                                        var30++;
                                        continue L37;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L26;
                          }
                        }
                      }
                      var27++;
                      continue L22;
                    }
                  }
                }
              }
            }
            L38: {
              if (var8 > 0) {
                var20 = 487;
                var21 = 423;
                var22 = 54;
                var23 = 150;
                var24 = 3;
                var25 = (-(var24 * 4) + var23) / 4;
                var26 = var24 + var20;
                pb.a(var20, var21, var23, var22, 0);
                var27 = var21 - -3;
                var13 = var11 + 385;
                var15 = -var9 + var10 - var11;
                var14 = var8 - (var11 + var9);
                var12 = -var8 + 640 - -var9;
                var28 = 0;
                L39: while (true) {
                  if (var28 >= 4) {
                    L40: {
                      var17 = var15 / 2 + var21 + 12;
                      var16 = 17 + -var25 + (-var24 + var26);
                      var28 = var25 + var24;
                      if (((nb) this).field_C.i(24, -27)) {
                        L41: {
                          L42: {
                            L43: {
                              ie.field_d[24].c(var16 - 10, var17 + -14);
                              if (((nb) this).field_C.field_ub < 0) {
                                break L43;
                              } else {
                                if (((nb) this).field_C.field_Tb >= 5) {
                                  break L42;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            if (((nb) this).field_C.field_rc == 24) {
                              break L42;
                            } else {
                              stackOut_148_0 = 1;
                              stackIn_150_0 = stackOut_148_0;
                              break L41;
                            }
                          }
                          stackOut_149_0 = 0;
                          stackIn_150_0 = stackOut_149_0;
                          break L41;
                        }
                        L44: {
                          var29 = stackIn_150_0;
                          stackOut_150_0 = fk.field_d;
                          stackOut_150_1 = bl.field_o;
                          stackOut_150_2 = var16;
                          stackOut_150_3 = -15 + var17;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          stackIn_152_2 = stackOut_150_2;
                          stackIn_152_3 = stackOut_150_3;
                          stackIn_151_0 = stackOut_150_0;
                          stackIn_151_1 = stackOut_150_1;
                          stackIn_151_2 = stackOut_150_2;
                          stackIn_151_3 = stackOut_150_3;
                          if (var29 == 0) {
                            stackOut_152_0 = (fh) (Object) stackIn_152_0;
                            stackOut_152_1 = (String) (Object) stackIn_152_1;
                            stackOut_152_2 = stackIn_152_2;
                            stackOut_152_3 = stackIn_152_3;
                            stackOut_152_4 = 30651;
                            stackIn_153_0 = stackOut_152_0;
                            stackIn_153_1 = stackOut_152_1;
                            stackIn_153_2 = stackOut_152_2;
                            stackIn_153_3 = stackOut_152_3;
                            stackIn_153_4 = stackOut_152_4;
                            break L44;
                          } else {
                            stackOut_151_0 = (fh) (Object) stackIn_151_0;
                            stackOut_151_1 = (String) (Object) stackIn_151_1;
                            stackOut_151_2 = stackIn_151_2;
                            stackOut_151_3 = stackIn_151_3;
                            stackOut_151_4 = 13158;
                            stackIn_153_0 = stackOut_151_0;
                            stackIn_153_1 = stackOut_151_1;
                            stackIn_153_2 = stackOut_151_2;
                            stackIn_153_3 = stackOut_151_3;
                            stackIn_153_4 = stackOut_151_4;
                            break L44;
                          }
                        }
                        L45: {
                          ((fh) (Object) stackIn_153_0).a(stackIn_153_1, stackIn_153_2, stackIn_153_3, stackIn_153_4, 0);
                          if (var29 != 0) {
                            stackOut_155_0 = 6710886;
                            stackIn_156_0 = stackOut_155_0;
                            break L45;
                          } else {
                            stackOut_154_0 = 10724259;
                            stackIn_156_0 = stackOut_154_0;
                            break L45;
                          }
                        }
                        L46: {
                          stackOut_156_0 = stackIn_156_0;
                          stackIn_158_0 = stackOut_156_0;
                          stackIn_157_0 = stackOut_156_0;
                          if (var29 == 0) {
                            stackOut_158_0 = stackIn_158_0;
                            stackOut_158_1 = 0;
                            stackIn_159_0 = stackOut_158_0;
                            stackIn_159_1 = stackOut_158_1;
                            break L46;
                          } else {
                            stackOut_157_0 = stackIn_157_0;
                            stackOut_157_1 = 2236962;
                            stackIn_159_0 = stackOut_157_0;
                            stackIn_159_1 = stackOut_157_1;
                            break L46;
                          }
                        }
                        L47: {
                          stackOut_159_0 = stackIn_159_0;
                          stackOut_159_1 = stackIn_159_1;
                          stackOut_159_2 = 18 + var17;
                          stackIn_161_0 = stackOut_159_0;
                          stackIn_161_1 = stackOut_159_1;
                          stackIn_161_2 = stackOut_159_2;
                          stackIn_160_0 = stackOut_159_0;
                          stackIn_160_1 = stackOut_159_1;
                          stackIn_160_2 = stackOut_159_2;
                          if (var29 == 0) {
                            stackOut_161_0 = stackIn_161_0;
                            stackOut_161_1 = stackIn_161_1;
                            stackOut_161_2 = stackIn_161_2;
                            stackOut_161_3 = 8158332;
                            stackIn_162_0 = stackOut_161_0;
                            stackIn_162_1 = stackOut_161_1;
                            stackIn_162_2 = stackOut_161_2;
                            stackIn_162_3 = stackOut_161_3;
                            break L47;
                          } else {
                            stackOut_160_0 = stackIn_160_0;
                            stackOut_160_1 = stackIn_160_1;
                            stackOut_160_2 = stackIn_160_2;
                            stackOut_160_3 = 4473924;
                            stackIn_162_0 = stackOut_160_0;
                            stackIn_162_1 = stackOut_160_1;
                            stackIn_162_2 = stackOut_160_2;
                            stackIn_162_3 = stackOut_160_3;
                            break L47;
                          }
                        }
                        kb.a(stackIn_162_0, stackIn_162_1, stackIn_162_2, stackIn_162_3, true, ck.field_n, (mi) (Object) fk.field_d, var16);
                        var16 = var16 - var28;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L48: {
                      if (((nb) this).field_C.i(15, -27)) {
                        L49: {
                          L50: {
                            ie.field_d[15].c(-10 + var16, var17 - 14);
                            if (0 > ((nb) this).field_C.field_ub) {
                              break L50;
                            } else {
                              if (0 >= ((nb) this).field_C.field_Yb) {
                                stackOut_169_0 = 0;
                                stackIn_170_0 = stackOut_169_0;
                                break L49;
                              } else {
                                break L50;
                              }
                            }
                          }
                          stackOut_168_0 = 1;
                          stackIn_170_0 = stackOut_168_0;
                          break L49;
                        }
                        L51: {
                          var29 = stackIn_170_0;
                          stackOut_170_0 = fk.field_d;
                          stackOut_170_1 = sf.field_v;
                          stackOut_170_2 = var16;
                          stackOut_170_3 = -15 + var17;
                          stackIn_172_0 = stackOut_170_0;
                          stackIn_172_1 = stackOut_170_1;
                          stackIn_172_2 = stackOut_170_2;
                          stackIn_172_3 = stackOut_170_3;
                          stackIn_171_0 = stackOut_170_0;
                          stackIn_171_1 = stackOut_170_1;
                          stackIn_171_2 = stackOut_170_2;
                          stackIn_171_3 = stackOut_170_3;
                          if (var29 == 0) {
                            stackOut_172_0 = (fh) (Object) stackIn_172_0;
                            stackOut_172_1 = (String) (Object) stackIn_172_1;
                            stackOut_172_2 = stackIn_172_2;
                            stackOut_172_3 = stackIn_172_3;
                            stackOut_172_4 = 30651;
                            stackIn_173_0 = stackOut_172_0;
                            stackIn_173_1 = stackOut_172_1;
                            stackIn_173_2 = stackOut_172_2;
                            stackIn_173_3 = stackOut_172_3;
                            stackIn_173_4 = stackOut_172_4;
                            break L51;
                          } else {
                            stackOut_171_0 = (fh) (Object) stackIn_171_0;
                            stackOut_171_1 = (String) (Object) stackIn_171_1;
                            stackOut_171_2 = stackIn_171_2;
                            stackOut_171_3 = stackIn_171_3;
                            stackOut_171_4 = 13158;
                            stackIn_173_0 = stackOut_171_0;
                            stackIn_173_1 = stackOut_171_1;
                            stackIn_173_2 = stackOut_171_2;
                            stackIn_173_3 = stackOut_171_3;
                            stackIn_173_4 = stackOut_171_4;
                            break L51;
                          }
                        }
                        L52: {
                          ((fh) (Object) stackIn_173_0).a(stackIn_173_1, stackIn_173_2, stackIn_173_3, stackIn_173_4, 0);
                          if (var29 == 0) {
                            stackOut_175_0 = 10724259;
                            stackIn_176_0 = stackOut_175_0;
                            break L52;
                          } else {
                            stackOut_174_0 = 6710886;
                            stackIn_176_0 = stackOut_174_0;
                            break L52;
                          }
                        }
                        L53: {
                          stackOut_176_0 = stackIn_176_0;
                          stackIn_178_0 = stackOut_176_0;
                          stackIn_177_0 = stackOut_176_0;
                          if (var29 != 0) {
                            stackOut_178_0 = stackIn_178_0;
                            stackOut_178_1 = 2236962;
                            stackIn_179_0 = stackOut_178_0;
                            stackIn_179_1 = stackOut_178_1;
                            break L53;
                          } else {
                            stackOut_177_0 = stackIn_177_0;
                            stackOut_177_1 = 0;
                            stackIn_179_0 = stackOut_177_0;
                            stackIn_179_1 = stackOut_177_1;
                            break L53;
                          }
                        }
                        L54: {
                          stackOut_179_0 = stackIn_179_0;
                          stackOut_179_1 = stackIn_179_1;
                          stackOut_179_2 = 18 + var17;
                          stackIn_181_0 = stackOut_179_0;
                          stackIn_181_1 = stackOut_179_1;
                          stackIn_181_2 = stackOut_179_2;
                          stackIn_180_0 = stackOut_179_0;
                          stackIn_180_1 = stackOut_179_1;
                          stackIn_180_2 = stackOut_179_2;
                          if (var29 != 0) {
                            stackOut_181_0 = stackIn_181_0;
                            stackOut_181_1 = stackIn_181_1;
                            stackOut_181_2 = stackIn_181_2;
                            stackOut_181_3 = 4473924;
                            stackIn_182_0 = stackOut_181_0;
                            stackIn_182_1 = stackOut_181_1;
                            stackIn_182_2 = stackOut_181_2;
                            stackIn_182_3 = stackOut_181_3;
                            break L54;
                          } else {
                            stackOut_180_0 = stackIn_180_0;
                            stackOut_180_1 = stackIn_180_1;
                            stackOut_180_2 = stackIn_180_2;
                            stackOut_180_3 = 8158332;
                            stackIn_182_0 = stackOut_180_0;
                            stackIn_182_1 = stackOut_180_1;
                            stackIn_182_2 = stackOut_180_2;
                            stackIn_182_3 = stackOut_180_3;
                            break L54;
                          }
                        }
                        kb.a(stackIn_182_0, stackIn_182_1, stackIn_182_2, stackIn_182_3, true, dc.field_d, (mi) (Object) fk.field_d, var16);
                        var16 = var16 - var28;
                        break L48;
                      } else {
                        break L48;
                      }
                    }
                    L55: {
                      if (!((nb) this).field_C.i(16, -27)) {
                        break L55;
                      } else {
                        L56: {
                          L57: {
                            if (Math.abs(oh.field_f + -var16) >= 16) {
                              break L57;
                            } else {
                              if (Math.abs(-var17 + pi.field_c + 1) >= 17) {
                                break L57;
                              } else {
                                if (((nb) this).field_C.field_Vb == null) {
                                  break L57;
                                } else {
                                  jc.field_k = true;
                                  break L56;
                                }
                              }
                            }
                          }
                          jc.field_k = false;
                          break L56;
                        }
                        L58: {
                          L59: {
                            ie.field_d[16].c(var16 - 10, var17 - 14);
                            if (jc.field_k) {
                              break L59;
                            } else {
                              if (((nb) this).field_C.field_ub >= 0) {
                                break L59;
                              } else {
                                stackOut_191_0 = 1;
                                stackIn_193_0 = stackOut_191_0;
                                break L58;
                              }
                            }
                          }
                          stackOut_192_0 = 0;
                          stackIn_193_0 = stackOut_192_0;
                          break L58;
                        }
                        L60: {
                          var29 = stackIn_193_0;
                          var30_ref_String = sn.field_a;
                          if (!jc.field_k) {
                            break L60;
                          } else {
                            var30_ref_String = id.field_Zb;
                            break L60;
                          }
                        }
                        L61: {
                          stackOut_195_0 = fk.field_d;
                          stackOut_195_1 = se.field_d;
                          stackOut_195_2 = var16;
                          stackOut_195_3 = -15 + var17;
                          stackIn_197_0 = stackOut_195_0;
                          stackIn_197_1 = stackOut_195_1;
                          stackIn_197_2 = stackOut_195_2;
                          stackIn_197_3 = stackOut_195_3;
                          stackIn_196_0 = stackOut_195_0;
                          stackIn_196_1 = stackOut_195_1;
                          stackIn_196_2 = stackOut_195_2;
                          stackIn_196_3 = stackOut_195_3;
                          if (var29 != 0) {
                            stackOut_197_0 = (fh) (Object) stackIn_197_0;
                            stackOut_197_1 = (String) (Object) stackIn_197_1;
                            stackOut_197_2 = stackIn_197_2;
                            stackOut_197_3 = stackIn_197_3;
                            stackOut_197_4 = 13158;
                            stackIn_198_0 = stackOut_197_0;
                            stackIn_198_1 = stackOut_197_1;
                            stackIn_198_2 = stackOut_197_2;
                            stackIn_198_3 = stackOut_197_3;
                            stackIn_198_4 = stackOut_197_4;
                            break L61;
                          } else {
                            stackOut_196_0 = (fh) (Object) stackIn_196_0;
                            stackOut_196_1 = (String) (Object) stackIn_196_1;
                            stackOut_196_2 = stackIn_196_2;
                            stackOut_196_3 = stackIn_196_3;
                            stackOut_196_4 = 30651;
                            stackIn_198_0 = stackOut_196_0;
                            stackIn_198_1 = stackOut_196_1;
                            stackIn_198_2 = stackOut_196_2;
                            stackIn_198_3 = stackOut_196_3;
                            stackIn_198_4 = stackOut_196_4;
                            break L61;
                          }
                        }
                        L62: {
                          ((fh) (Object) stackIn_198_0).a(stackIn_198_1, stackIn_198_2, stackIn_198_3, stackIn_198_4, 0);
                          if (var29 == 0) {
                            stackOut_200_0 = 10724259;
                            stackIn_201_0 = stackOut_200_0;
                            break L62;
                          } else {
                            stackOut_199_0 = 6710886;
                            stackIn_201_0 = stackOut_199_0;
                            break L62;
                          }
                        }
                        L63: {
                          stackOut_201_0 = stackIn_201_0;
                          stackIn_203_0 = stackOut_201_0;
                          stackIn_202_0 = stackOut_201_0;
                          if (var29 != 0) {
                            stackOut_203_0 = stackIn_203_0;
                            stackOut_203_1 = 2236962;
                            stackIn_204_0 = stackOut_203_0;
                            stackIn_204_1 = stackOut_203_1;
                            break L63;
                          } else {
                            stackOut_202_0 = stackIn_202_0;
                            stackOut_202_1 = 0;
                            stackIn_204_0 = stackOut_202_0;
                            stackIn_204_1 = stackOut_202_1;
                            break L63;
                          }
                        }
                        L64: {
                          stackOut_204_0 = stackIn_204_0;
                          stackOut_204_1 = stackIn_204_1;
                          stackOut_204_2 = var17 - -18;
                          stackIn_206_0 = stackOut_204_0;
                          stackIn_206_1 = stackOut_204_1;
                          stackIn_206_2 = stackOut_204_2;
                          stackIn_205_0 = stackOut_204_0;
                          stackIn_205_1 = stackOut_204_1;
                          stackIn_205_2 = stackOut_204_2;
                          if (var29 != 0) {
                            stackOut_206_0 = stackIn_206_0;
                            stackOut_206_1 = stackIn_206_1;
                            stackOut_206_2 = stackIn_206_2;
                            stackOut_206_3 = 4473924;
                            stackIn_207_0 = stackOut_206_0;
                            stackIn_207_1 = stackOut_206_1;
                            stackIn_207_2 = stackOut_206_2;
                            stackIn_207_3 = stackOut_206_3;
                            break L64;
                          } else {
                            stackOut_205_0 = stackIn_205_0;
                            stackOut_205_1 = stackIn_205_1;
                            stackOut_205_2 = stackIn_205_2;
                            stackOut_205_3 = 8158332;
                            stackIn_207_0 = stackOut_205_0;
                            stackIn_207_1 = stackOut_205_1;
                            stackIn_207_2 = stackOut_205_2;
                            stackIn_207_3 = stackOut_205_3;
                            break L64;
                          }
                        }
                        kb.a(stackIn_207_0, stackIn_207_1, stackIn_207_2, stackIn_207_3, true, var30_ref_String, (mi) (Object) fk.field_d, var16);
                        var16 = var16 - var28;
                        break L55;
                      }
                    }
                    if (((nb) this).field_C.field_fb == 0) {
                      break L38;
                    } else {
                      L65: {
                        L66: {
                          if (((nb) this).field_C.field_ub < 0) {
                            break L66;
                          } else {
                            L67: {
                              if (3 != ((nb) this).field_C.field_fb) {
                                break L67;
                              } else {
                                if (10 <= ((nb) this).field_C.field_Tb) {
                                  break L67;
                                } else {
                                  break L66;
                                }
                              }
                            }
                            stackOut_214_0 = 0;
                            stackIn_215_0 = stackOut_214_0;
                            break L65;
                          }
                        }
                        stackOut_213_0 = 1;
                        stackIn_215_0 = stackOut_213_0;
                        break L65;
                      }
                      L68: {
                        var29 = stackIn_215_0;
                        hb.field_j[((nb) this).field_C.field_fb + 19].b(var16 + -10, var17 - 14);
                        stackOut_215_0 = fk.field_d;
                        stackOut_215_1 = fk.field_l;
                        stackOut_215_2 = var16;
                        stackOut_215_3 = -15 + var17;
                        stackIn_217_0 = stackOut_215_0;
                        stackIn_217_1 = stackOut_215_1;
                        stackIn_217_2 = stackOut_215_2;
                        stackIn_217_3 = stackOut_215_3;
                        stackIn_216_0 = stackOut_215_0;
                        stackIn_216_1 = stackOut_215_1;
                        stackIn_216_2 = stackOut_215_2;
                        stackIn_216_3 = stackOut_215_3;
                        if (var29 != 0) {
                          stackOut_217_0 = (fh) (Object) stackIn_217_0;
                          stackOut_217_1 = (String) (Object) stackIn_217_1;
                          stackOut_217_2 = stackIn_217_2;
                          stackOut_217_3 = stackIn_217_3;
                          stackOut_217_4 = 13158;
                          stackIn_218_0 = stackOut_217_0;
                          stackIn_218_1 = stackOut_217_1;
                          stackIn_218_2 = stackOut_217_2;
                          stackIn_218_3 = stackOut_217_3;
                          stackIn_218_4 = stackOut_217_4;
                          break L68;
                        } else {
                          stackOut_216_0 = (fh) (Object) stackIn_216_0;
                          stackOut_216_1 = (String) (Object) stackIn_216_1;
                          stackOut_216_2 = stackIn_216_2;
                          stackOut_216_3 = stackIn_216_3;
                          stackOut_216_4 = 30651;
                          stackIn_218_0 = stackOut_216_0;
                          stackIn_218_1 = stackOut_216_1;
                          stackIn_218_2 = stackOut_216_2;
                          stackIn_218_3 = stackOut_216_3;
                          stackIn_218_4 = stackOut_216_4;
                          break L68;
                        }
                      }
                      L69: {
                        ((fh) (Object) stackIn_218_0).a(stackIn_218_1, stackIn_218_2, stackIn_218_3, stackIn_218_4, 0);
                        if (var29 == 0) {
                          stackOut_220_0 = 10724259;
                          stackIn_221_0 = stackOut_220_0;
                          break L69;
                        } else {
                          stackOut_219_0 = 6710886;
                          stackIn_221_0 = stackOut_219_0;
                          break L69;
                        }
                      }
                      L70: {
                        stackOut_221_0 = stackIn_221_0;
                        stackIn_223_0 = stackOut_221_0;
                        stackIn_222_0 = stackOut_221_0;
                        if (var29 != 0) {
                          stackOut_223_0 = stackIn_223_0;
                          stackOut_223_1 = 2236962;
                          stackIn_224_0 = stackOut_223_0;
                          stackIn_224_1 = stackOut_223_1;
                          break L70;
                        } else {
                          stackOut_222_0 = stackIn_222_0;
                          stackOut_222_1 = 0;
                          stackIn_224_0 = stackOut_222_0;
                          stackIn_224_1 = stackOut_222_1;
                          break L70;
                        }
                      }
                      L71: {
                        stackOut_224_0 = stackIn_224_0;
                        stackOut_224_1 = stackIn_224_1;
                        stackOut_224_2 = var17 + 18;
                        stackIn_226_0 = stackOut_224_0;
                        stackIn_226_1 = stackOut_224_1;
                        stackIn_226_2 = stackOut_224_2;
                        stackIn_225_0 = stackOut_224_0;
                        stackIn_225_1 = stackOut_224_1;
                        stackIn_225_2 = stackOut_224_2;
                        if (var29 == 0) {
                          stackOut_226_0 = stackIn_226_0;
                          stackOut_226_1 = stackIn_226_1;
                          stackOut_226_2 = stackIn_226_2;
                          stackOut_226_3 = 8158332;
                          stackIn_227_0 = stackOut_226_0;
                          stackIn_227_1 = stackOut_226_1;
                          stackIn_227_2 = stackOut_226_2;
                          stackIn_227_3 = stackOut_226_3;
                          break L71;
                        } else {
                          stackOut_225_0 = stackIn_225_0;
                          stackOut_225_1 = stackIn_225_1;
                          stackOut_225_2 = stackIn_225_2;
                          stackOut_225_3 = 4473924;
                          stackIn_227_0 = stackOut_225_0;
                          stackIn_227_1 = stackOut_225_1;
                          stackIn_227_2 = stackOut_225_2;
                          stackIn_227_3 = stackOut_225_3;
                          break L71;
                        }
                      }
                      kb.a(stackIn_227_0, stackIn_227_1, stackIn_227_2, stackIn_227_3, true, jf.field_eb, (mi) (Object) fk.field_d, var16);
                      break L38;
                    }
                  } else {
                    pb.e(var26, var27, var25, 25, 1776411, 2565927);
                    pb.e(var26, 25 + var27, var25, var22 + (-25 + -(2 * var24)), 1644825, 2631720);
                    var26 = var26 + (var25 + var24);
                    var28++;
                    continue L39;
                  }
                }
              } else {
                break L38;
              }
            }
            L72: {
              var14 = 640 - var11 * 2;
              var15 = 95 + (-var11 + -var10);
              var12 = var11;
              var13 = 385 - -var10;
              var13 += 2;
              var13 = 395;
              var20 = 10;
              var21 = 120;
              var22 = Math.max(fk.field_d.c(tj.field_d), fk.field_d.c(vg.field_e));
              var23 = var22 + (var20 - -10);
              if (var3 == 0) {
                break L72;
              } else {
                L73: {
                  fk.field_d.b(tj.field_d, var9 + var20, var13 - -18, 52224, -1);
                  var24 = Math.max(((nb) this).field_C.field_Q, ((nb) this).field_C.field_Eb) + 100;
                  var25 = 12;
                  var26 = var24 / 100;
                  var27 = var13 - -6;
                  if (~var21 <= ~(var25 * var26)) {
                    break L73;
                  } else {
                    var25 = var21 / var26;
                    break L73;
                  }
                }
                L74: {
                  var28 = 16;
                  if (var25 == 0) {
                    var25 = 1;
                    break L74;
                  } else {
                    break L74;
                  }
                }
                pb.a(var23, var27, var25 * ((nb) this).field_C.field_Eb / 100 + var23, var27 + var28);
                pb.a(var23, var27, var25 * var26, var28, 0);
                pb.a(var23, var27, var25 * ((nb) this).field_C.field_rb / 100 + var23, var28 + var27);
                var29 = 8;
                var30 = 0;
                L75: while (true) {
                  if (var26 < var30) {
                    var30 = 0;
                    L76: while (true) {
                      if (~var30 <= ~var26) {
                        L77: {
                          pb.c();
                          if (38 == ((nb) this).field_C.field_rc) {
                            var30 = 127 + (int)(Math.sin(0.2 * (double)((nb) this).field_X.field_r) * 128.0);
                            pb.a(var23, var27, var21, var28, 65280 + 65537 * var30);
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        var30 = 8 + var27;
                        var31 = var28 - 8;
                        pb.a(var23, var30, var25 * ((nb) this).field_C.field_Q / 100 + var23, var30 + var31);
                        pb.c(var23, var30, ((nb) this).field_C.field_Q * var25 / 100, 0, 192);
                        pb.a(var23, var30, var26 * var25, var31, 0);
                        pb.a(var23, var30, var25 * ((nb) this).field_C.field_S / 100 + var23, var31 + var30);
                        var32 = 0;
                        L78: while (true) {
                          if (var26 < var32) {
                            pb.c();
                            var32 = 0;
                            L79: while (true) {
                              if (~(((nb) this).field_C.field_Q / 100) > ~var32) {
                                break L72;
                              } else {
                                L80: {
                                  if (1 < var25) {
                                    pb.d(var25 * var32 + var23, var30, var31, 0);
                                    break L80;
                                  } else {
                                    break L80;
                                  }
                                }
                                var32++;
                                continue L79;
                              }
                            }
                          } else {
                            L81: {
                              var33 = var25 * var32 + var23;
                              pb.a(var33, var30 - -1, var25, var31, 2138367);
                              if (var25 <= 4) {
                                break L81;
                              } else {
                                var34 = 1 + var33;
                                L82: while (true) {
                                  if (var34 >= var33 + var25) {
                                    break L81;
                                  } else {
                                    pb.f(var34, var27, var28, 0, 100);
                                    var34 += 2;
                                    continue L82;
                                  }
                                }
                              }
                            }
                            var32++;
                            continue L78;
                          }
                        }
                      } else {
                        L83: {
                          if (var25 <= 1) {
                            break L83;
                          } else {
                            pb.d(var25 * var30 + var23, var27, var28, 0);
                            break L83;
                          }
                        }
                        var30++;
                        continue L76;
                      }
                    }
                  } else {
                    L84: {
                      var31 = var30 * var25 + var23;
                      pb.e(var31, var27, var25, var29, 100611, 514822);
                      pb.g(var31, var29 + var27, var25, 501766);
                      pb.e(var31, var27 + var29 + 1, var25, -var29 + var28 + -1, 487430, 93952);
                      if (var25 <= 4) {
                        break L84;
                      } else {
                        var32 = 1 + var31;
                        L85: while (true) {
                          if (~(var31 - -var25) >= ~var32) {
                            break L84;
                          } else {
                            pb.f(var32, var27, var28, 0, 100);
                            var32 += 2;
                            continue L85;
                          }
                        }
                      }
                    }
                    var30++;
                    continue L75;
                  }
                }
              }
            }
            L86: {
              if (var4 != 0) {
                L87: {
                  fk.field_d.c(vg.field_e, 630 + -var9, 18 + var13, 16736304, -1);
                  var24 = -var22 + 620;
                  var25 = 100 * ((nb) this).field_C.field_x;
                  var26 = ((nb) this).field_C.field_ub / 30 + ((nb) this).field_C.field_Tb * 100;
                  var27 = 100 + var25;
                  var28 = 12;
                  var29 = var27 / 100;
                  var30 = 6 + var13;
                  var31 = 16;
                  var32 = 8;
                  if (~var21 > ~(var28 * var29)) {
                    var28 = var21 / var29;
                    break L87;
                  } else {
                    break L87;
                  }
                }
                L88: {
                  pb.a(-(var25 * var28 / 100) + var24, var30, var24, var30 - -var31);
                  pb.a(-(var28 * var29) + var24, var30, var29 * var28, var31, 0);
                  pb.a(var24 + -(var26 * var28 / 100), var30, var24, var30 + var31);
                  var33 = 0;
                  var34 = 0;
                  var35 = 0;
                  if (((nb) this).field_C.field_mc > 0) {
                    var33 = 128;
                    var34 = 255;
                    var35 = 128;
                    break L88;
                  } else {
                    var33 = 16711680;
                    var34 = 16744448;
                    var35 = 4210688;
                    break L88;
                  }
                }
                var36 = 0;
                L89: while (true) {
                  if (var29 < var36) {
                    var36 = 0;
                    L90: while (true) {
                      if (~var36 <= ~var29) {
                        L91: {
                          if (((nb) this).field_C.field_rc == 37) {
                            var36 = (int)(Math.sin((double)((nb) this).field_X.field_r * 0.2) * 64.0) + 63;
                            pb.a(var24 - var21, var30, var21, var31, var36 * 513 + 16711680);
                            break L91;
                          } else {
                            break L91;
                          }
                        }
                        pb.c();
                        if (0 < ((nb) this).field_C.field_mc) {
                          L92: {
                            var36 = var24 - var28 * ((nb) this).field_C.field_x / 2;
                            stackOut_289_0 = fk.field_d;
                            stackOut_289_1 = r.field_i;
                            stackOut_289_2 = var36;
                            stackOut_289_3 = 6 + var30;
                            stackIn_291_0 = stackOut_289_0;
                            stackIn_291_1 = stackOut_289_1;
                            stackIn_291_2 = stackOut_289_2;
                            stackIn_291_3 = stackOut_289_3;
                            stackIn_290_0 = stackOut_289_0;
                            stackIn_290_1 = stackOut_289_1;
                            stackIn_290_2 = stackOut_289_2;
                            stackIn_290_3 = stackOut_289_3;
                            if (25 > a.field_c % 50) {
                              stackOut_291_0 = (fh) (Object) stackIn_291_0;
                              stackOut_291_1 = (String) (Object) stackIn_291_1;
                              stackOut_291_2 = stackIn_291_2;
                              stackOut_291_3 = stackIn_291_3;
                              stackOut_291_4 = 16777215;
                              stackIn_292_0 = stackOut_291_0;
                              stackIn_292_1 = stackOut_291_1;
                              stackIn_292_2 = stackOut_291_2;
                              stackIn_292_3 = stackOut_291_3;
                              stackIn_292_4 = stackOut_291_4;
                              break L92;
                            } else {
                              stackOut_290_0 = (fh) (Object) stackIn_290_0;
                              stackOut_290_1 = (String) (Object) stackIn_290_1;
                              stackOut_290_2 = stackIn_290_2;
                              stackOut_290_3 = stackIn_290_3;
                              stackOut_290_4 = 6316128;
                              stackIn_292_0 = stackOut_290_0;
                              stackIn_292_1 = stackOut_290_1;
                              stackIn_292_2 = stackOut_290_2;
                              stackIn_292_3 = stackOut_290_3;
                              stackIn_292_4 = stackOut_290_4;
                              break L92;
                            }
                          }
                          ((fh) (Object) stackIn_292_0).a(stackIn_292_1, stackIn_292_2, stackIn_292_3, stackIn_292_4, 0);
                          fk.field_d.a(db.a(f.field_E, -61, new String[1]), var36, 6 + (var30 - -10), 16777215, 0);
                          break L86;
                        } else {
                          if (0 <= ((nb) this).field_C.field_ub) {
                            break L86;
                          } else {
                            L93: {
                              var36 = -(var28 * ((nb) this).field_C.field_x / 2) + var24;
                              var37 = -((nb) this).field_C.field_ub / (100 + 50 * ((nb) this).field_C.field_wb);
                              stackOut_285_0 = fk.field_d;
                              stackOut_285_1 = hk.field_pc;
                              stackOut_285_2 = var36;
                              stackOut_285_3 = var30 + 6;
                              stackIn_287_0 = stackOut_285_0;
                              stackIn_287_1 = stackOut_285_1;
                              stackIn_287_2 = stackOut_285_2;
                              stackIn_287_3 = stackOut_285_3;
                              stackIn_286_0 = stackOut_285_0;
                              stackIn_286_1 = stackOut_285_1;
                              stackIn_286_2 = stackOut_285_2;
                              stackIn_286_3 = stackOut_285_3;
                              if (a.field_c % 50 < 25) {
                                stackOut_287_0 = (fh) (Object) stackIn_287_0;
                                stackOut_287_1 = (String) (Object) stackIn_287_1;
                                stackOut_287_2 = stackIn_287_2;
                                stackOut_287_3 = stackIn_287_3;
                                stackOut_287_4 = 16777215;
                                stackIn_288_0 = stackOut_287_0;
                                stackIn_288_1 = stackOut_287_1;
                                stackIn_288_2 = stackOut_287_2;
                                stackIn_288_3 = stackOut_287_3;
                                stackIn_288_4 = stackOut_287_4;
                                break L93;
                              } else {
                                stackOut_286_0 = (fh) (Object) stackIn_286_0;
                                stackOut_286_1 = (String) (Object) stackIn_286_1;
                                stackOut_286_2 = stackIn_286_2;
                                stackOut_286_3 = stackIn_286_3;
                                stackOut_286_4 = 6316128;
                                stackIn_288_0 = stackOut_286_0;
                                stackIn_288_1 = stackOut_286_1;
                                stackIn_288_2 = stackOut_286_2;
                                stackIn_288_3 = stackOut_286_3;
                                stackIn_288_4 = stackOut_286_4;
                                break L93;
                              }
                            }
                            ((fh) (Object) stackIn_288_0).a(stackIn_288_1, stackIn_288_2, stackIn_288_3, stackIn_288_4, 0);
                            fk.field_d.a(db.a(f.field_E, -62, new String[1]), var36, 10 + var30 - -6, 16777215, 0);
                            break L86;
                          }
                        }
                      } else {
                        pb.d(-((1 + var36) * var28) + var24, var30, var31, 0);
                        var36++;
                        continue L90;
                      }
                    }
                  } else {
                    L94: {
                      var37 = -((var36 - -1) * var28) + var24;
                      pb.e(var37, var30, var28, var32, var33, var34);
                      pb.e(var37, var32 + var30, var28, var31 - var32, var34, var35);
                      if (var28 <= 4) {
                        break L94;
                      } else {
                        var38 = 1 + var37;
                        L95: while (true) {
                          if (var37 + var28 <= var38) {
                            break L94;
                          } else {
                            pb.f(var38, var30, var31, 0, 100);
                            var38 += 2;
                            continue L95;
                          }
                        }
                      }
                    }
                    var36++;
                    continue L89;
                  }
                }
              } else {
                break L86;
              }
            }
            this.a(463, 116, param1 ^ -1956917986);
            break L18;
          }
        }
        L96: {
          var16 = 160;
          var17 = 320;
          if (((nb) this).field_X.field_ab.b(95) == 4) {
            stackOut_296_0 = 256;
            stackIn_297_0 = stackOut_296_0;
            break L96;
          } else {
            stackOut_295_0 = 100;
            stackIn_297_0 = stackOut_295_0;
            break L96;
          }
        }
        L97: {
          var18 = stackIn_297_0;
          var19 = 474;
          var20 = 48;
          var21 = -var20 + var19;
          var22 = 400;
          if (4 == ((nb) this).field_X.field_ab.b(61)) {
            var22 = 435;
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          var22 = var22 - (-7680 + ((nb) this).field_E) / var18;
          pb.a(var16 + -3, var19 - (var20 + 3), var17 + 6, 6 + var20, 0);
          var22 = var19;
          if (null == ((nb) this).field_C) {
            break L98;
          } else {
            if (((nb) this).field_C.field_rc == -1) {
              break L98;
            } else {
              var23 = 64;
              var24 = 455;
              ((nb) this).field_C.a(var24, false, var23, (byte) 45);
              if (~(-10 + var23) < ~oh.field_f) {
                break L98;
              } else {
                if (10 + var23 <= oh.field_f) {
                  break L98;
                } else {
                  if (pi.field_c < -30 + var24) {
                    break L98;
                  } else {
                    if (~pi.field_c > ~var24) {
                      L99: {
                        if (((nb) this).field_C.field_rc < 35) {
                          stackOut_309_0 = rj.field_m[((nb) this).field_C.field_rc];
                          stackIn_310_0 = stackOut_309_0;
                          break L99;
                        } else {
                          stackOut_308_0 = qj.field_v[((nb) this).field_C.field_rc + -35];
                          stackIn_310_0 = stackOut_308_0;
                          break L99;
                        }
                      }
                      var25_ref_String = stackIn_310_0;
                      var26 = 4 + fk.field_d.c(var25_ref_String);
                      var27 = fk.field_d.field_F + fk.field_d.field_G;
                      var28 = Math.max(0, var23 - var26 / 2);
                      var29 = -var27 + (var24 - 30);
                      pb.c(var28, var29, var26, var27, 0, 128);
                      fk.field_d.b(var25_ref_String, var28 - -2, var29 + 10, 16777215, 0);
                      break L98;
                    } else {
                      break L98;
                    }
                  }
                }
              }
            }
          }
        }
        L100: {
          var23 = 4;
          pb.a(var16 - -var23, var21, var17 + var16 + -var23 + 3, var20 + var21);
          var24 = ((nb) this).field_X.field_ab.a(-121);
          var25_ref_hd = ((nb) this).field_X.field_ab;
          if (((nb) this).field_X.field_ab.b(param1 + -1956917895) == 4) {
            var26 = 0;
            L101: while (true) {
              if (~var26 <= ~var25_ref_hd.field_c) {
                break L100;
              } else {
                L102: {
                  var27 = var17 * var25_ref_hd.field_o[var26] / var24 + var16;
                  var15 = sb.field_W.field_B >> 4;
                  var28 = -(var25_ref_hd.field_h[var26] / var18) + var22;
                  var14 = var24 * sb.field_W.field_z / var17 >> 11;
                  if (var26 != 0) {
                    if (var26 != 1) {
                      if (var25_ref_hd.field_j[var26] == -1) {
                        break L102;
                      } else {
                        var29_ref_wk = kc.field_x[1][var25_ref_hd.field_j[var26]];
                        var15 = var29_ref_wk.field_B >> 5;
                        var14 = var24 * var29_ref_wk.field_z / var17 >> 13;
                        var29_ref_wk.c(-(var14 / 2) + var27, var28, var14, var15);
                        break L102;
                      }
                    } else {
                      hb.field_e.c(var27 + -(var14 / 2), var28, var14, var15);
                      break L102;
                    }
                  } else {
                    sb.field_W.c(-(var14 / 2) + var27, var28, var14, var15);
                    break L102;
                  }
                }
                var26++;
                continue L101;
              }
            }
          } else {
            L103: {
              var26 = ((nb) this).field_M[0];
              if (65535 != (65535 & var26)) {
                break L103;
              } else {
                var26 = 1021128;
                break L103;
              }
            }
            var27 = 255;
            var28 = 0;
            L104: while (true) {
              if (~var17 >= ~var28) {
                break L100;
              } else {
                L105: {
                  var12 = var24 * var28 / var17;
                  var13 = -(((nb) this).field_X.field_ab.a((byte) -112, var12) / var18) + var22;
                  var27 = -var27 + 383;
                  var29 = (((nb) this).field_X.field_ab.a((byte) -114, var12) & 63) * var27 / 64;
                  pb.a(var28 - -var16, var13, 65536 * (var29 * (16711680 & var26) >> 24) + (var29 * (65280 & var26) >> 16) * 256 + ((255 & var26) * var29 >> 8));
                  pb.d(var16 + var28, var13 + 1, -var13 + (var19 - 1), ((65280 & var26) * var27 >> 16) * 256 + (var27 * (255 & var26) >> 8) - -((var27 * (16711680 & var26) >> 24) * 65536));
                  var30 = var22 - ((nb) this).field_X.field_ab.a(false, var12) / var18;
                  var31 = var22 - ((nb) this).field_X.field_ab.b((byte) 119, var12) / var18;
                  if (~var30 == ~var31) {
                    break L105;
                  } else {
                    pb.d(var16 + var28, var30, -var30 + var31, 65536 * ((16711680 & var26) * var27 >> 24) + (256 * (var27 * (var26 & 65280) >> 16) + (var27 * (var26 & 255) >> 8)));
                    break L105;
                  }
                }
                L106: {
                  if (var13 == var31) {
                    break L106;
                  } else {
                    pb.d(var16 + var28, var31, var13 - var31, (var27 * (var26 & 65280) >> 17) * 256 + ((var27 * (255 & var26) >> 9) + (((var26 & 16711680) >> 8) * var27 >> 17) * 65536));
                    break L106;
                  }
                }
                var28++;
                continue L104;
              }
            }
          }
        }
        var26_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(param1 ^ 1956905443);
        L107: while (true) {
          if (var26_ref_mb == null) {
            L108: {
              if (((nb) this).field_C == null) {
                break L108;
              } else {
                if (((nb) this).field_C.field_Hb) {
                  break L108;
                } else {
                  var26_ref_mb = ((nb) this).field_C;
                  var12 = var16 + (var26_ref_mb.field_hc * var17 / var24 >> 4);
                  var13 = var26_ref_mb.field_Gb / (var18 * 16) - -var22;
                  var27 = var26_ref_mb.d((byte) 92);
                  if (~var21 < ~var13) {
                    pb.g(var12, var21 + 1, 1, var27);
                    pb.g(-1 + var12, var21 + 2, 3, var27);
                    pb.g(-2 + var12, 3 + var21, 5, var27);
                    pb.g(var12 + -3, 4 + var21, 7, 16777215);
                    pb.d(var12 - 1, 1 + var21, var12 + -3, 3 + var21, 16777215);
                    pb.d(1 + var12, 1 + var21, 3 + var12, 3 + var21, 16777215);
                    break L108;
                  } else {
                    pb.e(var12, -4 + var13, 4, var27);
                    pb.c(var12, var13 - 4, 4, 16777215);
                    break L108;
                  }
                }
              }
            }
            var26_ref_ne = (ne) (Object) ((nb) this).field_X.field_e.e(13058);
            L109: while (true) {
              if (var26_ref_ne == null) {
                var26_ref_wl = (wl) (Object) ((nb) this).field_X.field_db.e(13058);
                L110: while (true) {
                  if (var26_ref_wl == null) {
                    L111: {
                      if (((nb) this).field_C == null) {
                        break L111;
                      } else {
                        this.a(var19, var16, param1 ^ 1956917985, var18, var24);
                        break L111;
                      }
                    }
                    var26_ref_jb = (jb) (Object) ((nb) this).field_X.field_C.e(13058);
                    L112: while (true) {
                      if (var26_ref_jb == null) {
                        L113: {
                          var26 = -1 + ((nb) this).field_P * var17 / var24 + var16 - -5;
                          var27 = var17 * (((nb) this).field_P + 9680) / var24 - -var16 + 5;
                          var28 = (((nb) this).field_E - 7680) / var18 - -var22;
                          var29 = var22 + (((nb) this).field_E + -320) / var18;
                          if (4 == ((nb) this).field_X.field_ab.b(92)) {
                            var29 += 3;
                            var28 += 3;
                            break L113;
                          } else {
                            break L113;
                          }
                        }
                        L114: {
                          pb.c(var26, var28, 1 + -var26 + var27, var29 + -var28 + 1, 16777215, 40);
                          pb.c();
                          pb.d(var16 + (var17 + -2), -2 + var22 - 3, 4, 0);
                          pb.d(-2 + var17 + (var16 - 1), var22 + -3, 2, 0);
                          pb.d(-4 + var16 + var17, -2 + var22, 1, 0);
                          pb.d(var16 - -var17 - 5, -2 + var22, 1, 0);
                          var30 = Math.max(var21 + 12, var28 - -10);
                          if (dm.field_c) {
                            fk.field_d.a("<img=26>", 10 + var26, var30, ((nb) this).field_M[0], -1);
                            break L114;
                          } else {
                            fk.field_d.a(qe.field_f, var26 + 9, var30, 0, 0);
                            fk.field_d.a(ai.field_r, 9 + var26, 6 + var30, 0, 0);
                            fk.field_d.a(qe.field_f, var26 + 10, var30 + -1, 0, 0);
                            fk.field_d.a(ai.field_r, 10 + var26, 5 + var30, 0, 0);
                            fk.field_d.a(qe.field_f, 10 + var26, var30, ((nb) this).field_M[0], -1);
                            fk.field_d.a(ai.field_r, var26 - -10, var30 - -6, ((nb) this).field_M[0], -1);
                            break L114;
                          }
                        }
                        L115: {
                          if (di.field_g != 4) {
                            break L115;
                          } else {
                            int discarded$1 = -86;
                            this.d();
                            break L115;
                          }
                        }
                        L116: {
                          if (((nb) this).field_X.field_r <= 50) {
                            break L116;
                          } else {
                            if (ul.field_d < 2) {
                              break L116;
                            } else {
                              L117: {
                                if (!((nb) this).field_ab) {
                                  break L117;
                                } else {
                                  dk.field_h.c("S/C checksums broken", 636, 80, 16711680, -1);
                                  break L117;
                                }
                              }
                              if (!((nb) this).field_k) {
                                break L116;
                              } else {
                                dk.field_h.c("S/C score checksums broken", 636, 100, 16711680, -1);
                                break L116;
                              }
                            }
                          }
                        }
                        L118: {
                          if (((nb) this).field_E <= 1024) {
                            break L118;
                          } else {
                            ((nb) this).field_E = 1024;
                            break L118;
                          }
                        }
                        L119: {
                          L120: {
                            if (param0) {
                              L121: {
                                if (((nb) this).field_C == null) {
                                  break L121;
                                } else {
                                  L122: {
                                    if (~((nb) this).field_C.field_Xb.length < ~((nb) this).field_F) {
                                      break L122;
                                    } else {
                                      ((nb) this).field_F = 0;
                                      break L122;
                                    }
                                  }
                                  var23 = 0;
                                  var24 = 640;
                                  var25 = var24 - var23;
                                  var26 = 360;
                                  if (((nb) this).field_X.field_c != 1) {
                                    var27 = vk.field_h[((nb) this).field_X.field_c] * (var24 + -var23) / 500;
                                    pb.e(var23, var26 - -2, -var27 + var24 - var23, 8, 2236962, 8772);
                                    pb.e(var23, 8 + var26 + 2, var24 - var23 + -var27, 8, 68, 0);
                                    pb.e(var24 - var27, var26 + 2, var27, 8, 2236962, 16729156);
                                    pb.e(-var27 + var24, 10 + var26, var27, 8, 16729156, 0);
                                    var28 = 1;
                                    var29_ref_je = (je) (Object) ((nb) this).field_C.field_B.e(param1 ^ 1956905443);
                                    L123: while (true) {
                                      if (var29_ref_je == null) {
                                        break L121;
                                      } else {
                                        L124: {
                                          var30 = var29_ref_je.field_x + -((nb) this).field_X.field_r;
                                          var31 = -((nb) this).field_X.field_r + var29_ref_je.field_r;
                                          var32 = var25 + -(var25 * var31 / 500);
                                          var33 = var25 - var25 * var30 / 500;
                                          var14 = var33 - var32;
                                          var34 = var26;
                                          var15 = 20;
                                          var35 = var15 / 2 + -1;
                                          var36 = -1 + var14 / 2;
                                          if (~var35 >= ~var36) {
                                            break L124;
                                          } else {
                                            var35 = var36;
                                            break L124;
                                          }
                                        }
                                        L125: {
                                          var37 = 65535;
                                          if (6 == var29_ref_je.field_s) {
                                            var37 = 35071;
                                            break L125;
                                          } else {
                                            break L125;
                                          }
                                        }
                                        L126: {
                                          if (var29_ref_je.field_s != 3) {
                                            break L126;
                                          } else {
                                            var37 = 65416;
                                            break L126;
                                          }
                                        }
                                        L127: {
                                          if (!var29_ref_je.field_q) {
                                            break L127;
                                          } else {
                                            var37 = 8947712;
                                            break L127;
                                          }
                                        }
                                        L128: {
                                          pb.g(var23 + var32, var34, var14, var15, var35, var37);
                                          pb.g(2 + (var32 + var23), 2 + var34, var14 - 4, -4 + var15, -2 + var35, 0);
                                          if (var29_ref_je.field_s != 0) {
                                            break L128;
                                          } else {
                                            var38 = var29_ref_je.field_A;
                                            if (var38 < 0) {
                                              break L128;
                                            } else {
                                              if (var38 < 30) {
                                                if (var28 != 0) {
                                                  var28 = 0;
                                                  var39 = var32 - (-var23 + 20);
                                                  if (var39 >= var23) {
                                                    hb.field_j[((nb) this).field_M[3] + var38].b(var23 + var32, var34);
                                                    break L128;
                                                  } else {
                                                    hb.field_j[var38 + ((nb) this).field_M[3]].a(var23, var34 + -20);
                                                    break L128;
                                                  }
                                                } else {
                                                  hb.field_j[var38 + ((nb) this).field_M[3]].b(var23 + var32, var34);
                                                  break L128;
                                                }
                                              } else {
                                                var29_ref_je = (je) (Object) ((nb) this).field_C.field_B.a((byte) -8);
                                                continue L123;
                                              }
                                            }
                                          }
                                        }
                                        var29_ref_je = (je) (Object) ((nb) this).field_C.field_B.a((byte) -8);
                                        continue L123;
                                      }
                                    }
                                  } else {
                                    break L121;
                                  }
                                }
                              }
                              if (!vl.field_v) {
                                var23 = 352;
                                var24 = 6;
                                var25 = 10;
                                var26 = 0;
                                fk.field_d.a((ea[]) (Object) bf.field_Cb, (int[]) null);
                                var27 = 0;
                                L129: while (true) {
                                  if (var27 >= 6) {
                                    break L120;
                                  } else {
                                    if (null != ke.field_b[var27]) {
                                      L130: {
                                        if (hh.field_c[var27] >= 0) {
                                          var28 = 255;
                                          break L130;
                                        } else {
                                          var28 = 255 + 255 * hh.field_c[var27] / 50;
                                          break L130;
                                        }
                                      }
                                      L131: {
                                        var28 = var28 * (-var27 + 6) / 6;
                                        var29 = fi.field_g[var27];
                                        var30 = 6 + fk.field_d.c(ke.field_b[var27]);
                                        pb.c(-3 + var24, var23 - fk.field_d.field_G, var30, fk.field_d.field_G, 0, var28 * 2 / 3);
                                        if (~var30 >= ~var26) {
                                          break L131;
                                        } else {
                                          pb.c(var24 - (3 + -var26), var23, var30 - var26, 5, 0, 2 * var28 / 3);
                                          break L131;
                                        }
                                      }
                                      var26 = var30;
                                      fk.field_d.a(ke.field_b[var27], var24, var23, var29, 0, var28);
                                      var23 = var23 - var25;
                                      var27++;
                                      continue L129;
                                    } else {
                                      break L120;
                                    }
                                  }
                                }
                              } else {
                                break L119;
                              }
                            } else {
                              if (!vl.field_v) {
                                var23 = 352;
                                var24 = 6;
                                var25 = 10;
                                var26 = 0;
                                fk.field_d.a((ea[]) (Object) bf.field_Cb, (int[]) null);
                                var27 = 0;
                                L132: while (true) {
                                  if (var27 >= 6) {
                                    break L120;
                                  } else {
                                    if (null != ke.field_b[var27]) {
                                      L133: {
                                        if (hh.field_c[var27] >= 0) {
                                          var28 = 255;
                                          break L133;
                                        } else {
                                          var28 = 255 + 255 * hh.field_c[var27] / 50;
                                          break L133;
                                        }
                                      }
                                      L134: {
                                        var28 = var28 * (-var27 + 6) / 6;
                                        var29 = fi.field_g[var27];
                                        var30 = 6 + fk.field_d.c(ke.field_b[var27]);
                                        pb.c(-3 + var24, var23 - fk.field_d.field_G, var30, fk.field_d.field_G, 0, var28 * 2 / 3);
                                        if (~var30 >= ~var26) {
                                          break L134;
                                        } else {
                                          pb.c(var24 - (3 + -var26), var23, var30 - var26, 5, 0, 2 * var28 / 3);
                                          break L134;
                                        }
                                      }
                                      var26 = var30;
                                      fk.field_d.a(ke.field_b[var27], var24, var23, var29, 0, var28);
                                      var23 = var23 - var25;
                                      var27++;
                                      continue L132;
                                    } else {
                                      break L120;
                                    }
                                  }
                                }
                              } else {
                                break L119;
                              }
                            }
                          }
                          fk.field_d.a((ea[]) (Object) jc.field_c, bb.field_X);
                          break L119;
                        }
                        return;
                      } else {
                        L135: {
                          var13 = var22 + var26_ref_jb.field_M / (var18 * 16);
                          var12 = (var17 * var26_ref_jb.field_H / var24 >> 4) + var16;
                          var27 = var26_ref_jb.field_F;
                          var14 = 300 * var27 / var24 / 2;
                          var15 = (var27 >> 6) / 2;
                          var28 = 16746496;
                          if (var26_ref_jb.field_O) {
                            var28 = 16711680;
                            break L135;
                          } else {
                            break L135;
                          }
                        }
                        pb.f(var12 - var14, var13, var12, var13 - var15, var28, 256);
                        pb.f(var12, -var15 + var13, var14 + var12, var13, var28, 256);
                        pb.f(var12 - -var14, var13, var12, var15 + var13, var28, 256);
                        pb.f(var12, var13 - -var15, -var14 + var12, var13, var28, 256);
                        var26_ref_jb = (jb) (Object) ((nb) this).field_X.field_C.a((byte) -96);
                        continue L112;
                      }
                    }
                  } else {
                    var13 = var26_ref_wl.field_A / (var18 * 16) - -var22;
                    var12 = var16 + (var17 * var26_ref_wl.field_U / var24 >> 4);
                    pb.a(var12, var13, 16776960);
                    var26_ref_wl = (wl) (Object) ((nb) this).field_X.field_db.a((byte) -103);
                    continue L110;
                  }
                }
              } else {
                L136: {
                  var12 = var16 + (var17 * var26_ref_ne.field_z / var24 >> 4);
                  var13 = var26_ref_ne.field_I / (16 * var18) + var22;
                  var27 = (int)(128.0 * Math.sin((double)((nb) this).field_X.field_r / 10.0)) + 128;
                  var27 = 65536 * (-var27 + 255) + var27 * 257;
                  var28 = var26_ref_ne.field_K / 2;
                  if (~var13 > ~var21) {
                    if (var28 < 256) {
                      pb.c(var12, 1 + var21, 1, var27, var28);
                      pb.c(var12 + -1, var21 + 2, 3, var27, var28);
                      pb.c(var12 + -2, 3 + var21, 5, var27, var28);
                      pb.c(-3 + var12, 4 + var21, 7, var27, var28);
                      pb.b(var12 - 1, var21 + 1, var12 + -3, 3 + var21, 65535, var28);
                      pb.b(1 + var12, 1 + var21, var12 + 3, 3 + var21, 65535, var28);
                      break L136;
                    } else {
                      pb.g(var12, 1 + var21, 1, var27);
                      pb.g(-1 + var12, 2 + var21, 3, var27);
                      pb.g(-2 + var12, 3 + var21, 5, var27);
                      pb.g(var12 - 3, var21 + 4, 7, var27);
                      pb.d(var12 - 1, var21 - -1, -3 + var12, var21 - -3, 65535);
                      pb.d(var12 - -1, var21 - -1, var12 + 3, var21 + 3, 65535);
                      break L136;
                    }
                  } else {
                    if (var28 >= 256) {
                      pb.a(var12, var13 + -6, 6, 6, var27);
                      pb.h(var12, var13 - 6, 6, 6, 65535);
                      break L136;
                    } else {
                      pb.c(var12, -6 + var13, 6, 6, var27, var28);
                      pb.h(var12, var13 + -6, 6, 6, 65535, var28);
                      break L136;
                    }
                  }
                }
                var26_ref_ne = (ne) (Object) ((nb) this).field_X.field_e.a((byte) -6);
                continue L109;
              }
            }
          } else {
            L137: {
              var12 = var16 + (var26_ref_mb.field_hc * var17 / var24 >> 4);
              var13 = var22 + var26_ref_mb.field_Gb / (var18 * 16);
              if (((nb) this).field_C == var26_ref_mb) {
                break L137;
              } else {
                if (var26_ref_mb.field_Hb) {
                  break L137;
                } else {
                  L138: {
                    if (di.field_g != 0) {
                      break L138;
                    } else {
                      if (qh.field_Yb != 4) {
                        break L138;
                      } else {
                        if ((16 & a.field_c) <= 0) {
                          break L138;
                        } else {
                          break L137;
                        }
                      }
                    }
                  }
                  L139: {
                    if (1 != di.field_g) {
                      break L139;
                    } else {
                      if (11 != qh.field_Yb) {
                        break L139;
                      } else {
                        if ((a.field_c & 16) <= 0) {
                          break L139;
                        } else {
                          break L137;
                        }
                      }
                    }
                  }
                  if (250 <= var26_ref_mb.field_F) {
                    break L137;
                  } else {
                    L140: {
                      if (!var26_ref_mb.field_pc) {
                        break L140;
                      } else {
                        if (var26_ref_mb.field_Nb == 7) {
                          break L140;
                        } else {
                          break L137;
                        }
                      }
                    }
                    L141: {
                      var27 = var26_ref_mb.d((byte) -125);
                      if (var27 == qd.field_t[0]) {
                        var27 = 7612277;
                        break L141;
                      } else {
                        break L141;
                      }
                    }
                    L142: {
                      var28 = 0;
                      if (var26_ref_mb.field_Cb) {
                        L143: {
                          if (2 == ((nb) this).field_X.field_ab.b(116)) {
                            var28 = (int)((1.0 + Math.sin(3.141592653589793 * (double)((63 & ((nb) this).field_X.field_r) * 2) / 64.0)) * 255.0 / 2.0);
                            break L143;
                          } else {
                            break L143;
                          }
                        }
                        pb.c(var12, var13 + -3, (int)(2.0 * Math.sin(3.141592653589793 * (double)(2 * (63 & ((nb) this).field_X.field_r)) / 64.0)) + 6, var27);
                        break L142;
                      } else {
                        break L142;
                      }
                    }
                    if (~(var21 - -4) < ~var13) {
                      L144: {
                        pb.g(var12, 1 + var21, 1, var27);
                        if (150 <= var26_ref_mb.field_F) {
                          break L144;
                        } else {
                          pb.g(var12 - 1, 2 + var21, 3, var27);
                          break L144;
                        }
                      }
                      L145: {
                        if (var26_ref_mb.field_F >= 50) {
                          break L145;
                        } else {
                          pb.g(var12 - 2, 3 + var21, 5, var27);
                          break L145;
                        }
                      }
                      if (0 < var28) {
                        L146: {
                          pb.c(var12, 1 + var21, 1, var27, var28);
                          if (var26_ref_mb.field_F >= 150) {
                            break L146;
                          } else {
                            pb.c(var12 + -1, var21 - -2, 3, 16776960, var28);
                            break L146;
                          }
                        }
                        if (50 <= var26_ref_mb.field_F) {
                          break L137;
                        } else {
                          pb.c(var12 + -2, 3 + var21, 5, 16776960, var28);
                          break L137;
                        }
                      } else {
                        break L137;
                      }
                    } else {
                      pb.e(var12, -3 + var13, (250 - var26_ref_mb.field_F) * 3 / 250, var27);
                      if (var28 > 0) {
                        pb.b(var12, -3 + var13, (250 - var26_ref_mb.field_F) * 3 / 250, 16776960, var28);
                        break L137;
                      } else {
                        break L137;
                      }
                    }
                  }
                }
              }
            }
            var26_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -42);
            continue L107;
          }
        }
    }

    final void a(boolean param0) {
        if (param0) {
            ((nb) this).field_k = true;
        }
        if (!((nb) this).field_d) {
            throw new IllegalStateException();
        }
        mm.field_g.a(61, (byte) -117);
    }

    private final int a(boolean param0, hd param1, boolean param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wk var11_ref_wk = null;
        int var12 = 0;
        mb var13_ref_mb = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var20 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = 480;
              if (1024 < ((nb) this).field_E) {
                ((nb) this).field_E = 1024;
                break L1;
              } else {
                break L1;
              }
            }
            var6 = ((nb) this).field_P;
            var7 = ((nb) this).field_E;
            pb.a(0, 0, 640, 400);
            if (param3 < -87) {
              L2: {
                var8 = -(var7 >> 4) + 400;
                var9 = -var8 + 400;
                if (var9 >= 30) {
                  break L2;
                } else {
                  var9 = 30;
                  break L2;
                }
              }
              L3: {
                if (param1.b(104) == 4) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var10 = stackIn_12_0;
                if (param0) {
                  if (var10 == 0) {
                    break L4;
                  } else {
                    L5: {
                      var11_ref_wk = bc.field_rb[((nb) this).field_X.field_ab.b(107)];
                      var12 = 128;
                      var13 = 1 + var8;
                      if (var13 > 400) {
                        var13 = 400;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var14 = 0;
                    L6: while (true) {
                      if (640 <= var14) {
                        pb.c();
                        break L4;
                      } else {
                        L7: {
                          var15 = var6 + (var14 << 4);
                          var16 = param1.a((byte) -127, var15) + var7;
                          var17 = param1.a(false, var15) - -var7;
                          var18 = param1.b((byte) 119, var15) + var7;
                          if (param1.b(70) != 2) {
                            break L7;
                          } else {
                            if (-var7 + var17 <= 1125) {
                              break L7;
                            } else {
                              var17 = 1125 + var7;
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (var16 < var17) {
                            pb.a(var14, -(var18 >> 4) + 400, 1 + var14, -(var16 >> 4) + 400);
                            pb.f(var14, 400 + -(var18 >> 4), 400 + -(-var18 + var16 >> 4) - -1, 0, 64);
                            pb.a(var14, 401 + -(var17 >> 4), 1 + var14, 400 - (var18 >> 4));
                            var11_ref_wk.f(-(255 & var15 >> 4) + var14, var8 + -(3 * var12));
                            var11_ref_wk.f(-((var15 & 4095) >> 4) + var14, var8 + -var12);
                            pb.a(var14, 400 - (var17 >> 4) - -1, 1 + var14, 400 + -(var16 >> 4));
                            vi.field_R.d(-(1023 & var15 >> 2) + var14, -(var17 >> 4) + 400, 1024, 16, 128);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        pb.a(var14, 1 + -(var16 >> 4) + 400, 1 + var14, var9 + var13);
                        var11_ref_wk.f(-(255 & var15 >> 4) + var14, var8 - var12 * 3);
                        var11_ref_wk.f(var14 + -(var15 >> 4 & 255), var8 + -var12);
                        vi.field_R.d(var14 - ((var15 & 4095) >> 2), 400 - (var16 >> 4), 1024, 16, 128);
                        pb.a(var14, 400 + -(var16 >> 4), var14 + 1, 1 + (400 + -(var16 >> 4)));
                        var19 = (var16 << 8) % 4096 * 256 / 4096;
                        var11_ref_wk.b(-(255 & var15 >> 4) + var14, -(3 * var12) + var8, var19);
                        var11_ref_wk.b(var14 + -((4095 & var15) >> 4), var8 - var12, var19);
                        vi.field_R.d(-(1023 & var15 >> 2) + var14, -(var16 >> 4) + 400, 1024, 16, var19 * 128 / 256);
                        var14++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              var11 = -(((nb) this).field_P >> 4);
              var12 = -(((nb) this).field_E >> 4) + 400;
              var13_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
              L9: while (true) {
                if (var13_ref_mb == null) {
                  L10: {
                    if (je.field_o <= 0) {
                      break L10;
                    } else {
                      if (0 != he.field_k) {
                        L11: {
                          var11 = 33023;
                          var12 = Math.min(je.field_o, 256);
                          var13 = (he.field_k >> 8) + -(((nb) this).field_P >> 4);
                          var14 = 400;
                          if (fk.field_c) {
                            L12: {
                              var14 = var14 * var12 / 150;
                              if (je.field_o == 0) {
                                he.field_k = 0;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var12 = 150;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var15 = 0;
                        L13: while (true) {
                          if (var15 >= 100) {
                            break L10;
                          } else {
                            pb.f(var13 - var15, 0, var14, var11, var12);
                            var12 -= 4;
                            if (0 >= var12) {
                              break L10;
                            } else {
                              var15++;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  L14: {
                    if (je.field_o <= 0) {
                      break L14;
                    } else {
                      if (ge.field_l != 0) {
                        L15: {
                          var11 = 33023;
                          var12 = Math.min(je.field_o, 256);
                          var13 = -(((nb) this).field_P >> 4) - -(ge.field_l >> 8);
                          var14 = 400;
                          if (!fk.field_c) {
                            break L15;
                          } else {
                            L16: {
                              var14 = var14 * var12 / 150;
                              if (je.field_o != 0) {
                                break L16;
                              } else {
                                ge.field_l = 0;
                                break L16;
                              }
                            }
                            var12 = 150;
                            break L15;
                          }
                        }
                        var15 = 0;
                        L17: while (true) {
                          if (var15 >= 100) {
                            break L14;
                          } else {
                            pb.f(var15 + var13, 0, var14, var11, var12);
                            var12 -= 4;
                            if (var12 <= 4) {
                              break L14;
                            } else {
                              var15++;
                              continue L17;
                            }
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  stackOut_59_0 = var5_int;
                  stackIn_60_0 = stackOut_59_0;
                  break L0;
                } else {
                  L18: {
                    boolean discarded$2 = var13_ref_mb.a(var12, 256, 16711680, ((nb) this).field_C, var11);
                    if (null == ((nb) this).field_C) {
                      break L18;
                    } else {
                      if (var13_ref_mb == ((nb) this).field_C.field_Vb) {
                        boolean discarded$3 = ((nb) this).field_C.a(var11, 256, 23859, var12);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                  }
                  var13_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -85);
                  continue L9;
                }
              }
            } else {
              stackOut_5_0 = 92;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5;
            stackOut_61_1 = new StringBuilder().append("nb.C(").append(param0).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L19;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L19;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_60_0;
    }

    final static wk[] a(cm param0, byte param1, String param2, String param3) {
        wk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wk[] var6 = null;
        wk[] stackIn_1_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        wk[] stackOut_0_0 = null;
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
        try {
          L0: {
            var6 = cf.a(param2, param3, (byte) -116, param0);
            var4 = var6;
            var5 = -58 / ((param1 - -18) / 32);
            var6[1].field_z = var6[1].field_A;
            var6[3].field_B = var6[3].field_F;
            var6[5].field_B = var6[5].field_F;
            var6[7].field_z = var6[7].field_A;
            stackOut_0_0 = (wk[]) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("nb.GA(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    private final void i(byte param0) {
        int var2 = 0;
        ld var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var9_ref_String = null;
        int var10_int = 0;
        u var10 = null;
        int var11 = 0;
        mb[] var12_ref_mb__ = null;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23_ref_int__ = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        String var28_ref_String = null;
        fh var28_ref_fh = null;
        int var29 = 0;
        mb var29_ref_mb = null;
        String var29_ref_String = null;
        int var30 = 0;
        String var30_ref_String = null;
        int var31 = 0;
        String var31_ref_String = null;
        int var32 = 0;
        String var32_ref_String = null;
        int var33_int = 0;
        String var33 = null;
        int var34 = 0;
        wk var34_ref_wk = null;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        Object var39_ref = null;
        String var39_ref_String = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        String var48 = null;
        String var49 = null;
        int var50 = 0;
        int var51 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        mb[] stackIn_89_0 = null;
        mb[] stackIn_90_0 = null;
        mb[] stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_122_0 = 0;
        mb[] stackIn_145_0 = null;
        mb[] stackIn_146_0 = null;
        mb[] stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_154_0 = 0;
        int[] stackIn_154_1 = null;
        int stackIn_155_0 = 0;
        int[] stackIn_155_1 = null;
        int stackIn_156_0 = 0;
        int[] stackIn_156_1 = null;
        int stackIn_156_2 = 0;
        int stackIn_159_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_187_0 = 0;
        String stackIn_253_0 = null;
        int stackIn_253_1 = 0;
        String[] stackIn_253_2 = null;
        String[] stackIn_253_3 = null;
        int stackIn_253_4 = 0;
        String stackIn_254_0 = null;
        int stackIn_254_1 = 0;
        String[] stackIn_254_2 = null;
        String[] stackIn_254_3 = null;
        int stackIn_254_4 = 0;
        String stackIn_255_0 = null;
        int stackIn_255_1 = 0;
        String[] stackIn_255_2 = null;
        String[] stackIn_255_3 = null;
        int stackIn_255_4 = 0;
        String stackIn_255_5 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_120_0 = 0;
        mb[] stackOut_88_0 = null;
        mb[] stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        mb[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        String stackOut_252_0 = null;
        int stackOut_252_1 = 0;
        String[] stackOut_252_2 = null;
        String[] stackOut_252_3 = null;
        int stackOut_252_4 = 0;
        String stackOut_254_0 = null;
        int stackOut_254_1 = 0;
        String[] stackOut_254_2 = null;
        String[] stackOut_254_3 = null;
        int stackOut_254_4 = 0;
        String stackOut_254_5 = null;
        String stackOut_253_0 = null;
        int stackOut_253_1 = 0;
        String[] stackOut_253_2 = null;
        String[] stackOut_253_3 = null;
        int stackOut_253_4 = 0;
        String stackOut_253_5 = null;
        mb[] stackOut_144_0 = null;
        mb[] stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        mb[] stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_153_0 = 0;
        int[] stackOut_153_1 = null;
        int stackOut_155_0 = 0;
        int[] stackOut_155_1 = null;
        int stackOut_155_2 = 0;
        int stackOut_154_0 = 0;
        int[] stackOut_154_1 = null;
        int stackOut_154_2 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_185_0 = 0;
        L0: {
          var51 = SteelSentinels.field_G;
          if (di.field_g == -1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          var3 = ql.field_Tb;
          if (null != ((nb) this).field_W) {
            break L1;
          } else {
            this.h((byte) -50);
            break L1;
          }
        }
        L2: {
          L3: {
            var4 = 0;
            var5 = kj.field_x;
            if (var2 == 0) {
              break L3;
            } else {
              if (0 > nc.field_a) {
                break L3;
              } else {
                if (!ni.b(122)) {
                  break L3;
                } else {
                  if (ge.field_j != 0) {
                    break L3;
                  } else {
                    if (ol.field_Ub != 9) {
                      break L3;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_11_0 = 0;
          stackIn_12_0 = stackOut_11_0;
          break L2;
        }
        L4: {
          var6 = stackIn_12_0;
          if (var6 == 0) {
            if (var2 == 0) {
              break L4;
            } else {
              if (nc.field_a >= 0) {
                var5 = fg.field_Wb;
                break L4;
              } else {
                break L4;
              }
            }
          } else {
            var5 = ij.field_T;
            break L4;
          }
        }
        L5: {
          if (var2 == 0) {
            break L5;
          } else {
            if (nc.field_a < 0) {
              var5 = bf.field_Eb;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          var5 = ke.a(42, var5);
          ic.field_db.f(0, -10);
          if (var5 != null) {
            ((mi) (Object) var3).a(var5, 320, ((mi) (Object) var3).field_G / 2 + 22, 0, -1);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var7 = 375;
          if (var2 == 0) {
            break L7;
          } else {
            if (0 > nc.field_a) {
              break L7;
            } else {
              if (!ni.b(53)) {
                break L7;
              } else {
                var7 = 310;
                break L7;
              }
            }
          }
        }
        L8: {
          ((nb) this).field_r = 28;
          if (var2 != 0) {
            int discarded$1 = -118;
            this.g();
            break L8;
          } else {
            if (ed.field_j < 0) {
              break L8;
            } else {
              ch.a(var7, 640, 32308, 0, 480 + -var7);
              pb.g(3, 3 + var7, 634, -var7 + 474, 8, 0);
              break L8;
            }
          }
        }
        if (param0 < -3) {
          L9: {
            var8 = 640;
            if (ed.field_j < 0) {
              break L9;
            } else {
              if (var2 != 0) {
                break L9;
              } else {
                L10: {
                  h.i(-1);
                  var8 = 330;
                  var9_ref_String = ti.field_A[12];
                  var10_int = 10 + pl.field_U.c(var9_ref_String);
                  if (var10_int >= 140) {
                    break L10;
                  } else {
                    var10_int = 140;
                    break L10;
                  }
                }
                if (!nm.a(440, var8, 122, var9_ref_String, 28, var10_int)) {
                  break L9;
                } else {
                  ((nb) this).field_r = 29;
                  break L9;
                }
              }
            }
          }
          L11: {
            if (var2 == 0) {
              L12: {
                if (ed.field_j >= 0) {
                  stackOut_55_0 = 440;
                  stackIn_56_0 = stackOut_55_0;
                  break L12;
                } else {
                  stackOut_54_0 = 390;
                  stackIn_56_0 = stackOut_54_0;
                  break L12;
                }
              }
              L13: {
                stackOut_56_0 = stackIn_56_0;
                stackIn_58_0 = stackOut_56_0;
                stackIn_57_0 = stackOut_56_0;
                if (ed.field_j < 0) {
                  stackOut_58_0 = stackIn_58_0;
                  stackOut_58_1 = 240;
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  break L13;
                } else {
                  stackOut_57_0 = stackIn_57_0;
                  stackOut_57_1 = 150;
                  stackIn_59_0 = stackOut_57_0;
                  stackIn_59_1 = stackOut_57_1;
                  break L13;
                }
              }
              L14: {
                if (!nm.a(stackIn_59_0, stackIn_59_1, 120, bi.field_c, 28, 160)) {
                  break L14;
                } else {
                  ((nb) this).field_r = 30;
                  break L14;
                }
              }
              L15: {
                var9 = ((nb) this).field_W.length;
                if (var4 <= 0) {
                  break L15;
                } else {
                  var9 = var4;
                  break L15;
                }
              }
              var10 = pl.field_U;
              var11 = 0;
              var12_ref_mb__ = ((nb) this).field_W;
              var13 = 0;
              L16: while (true) {
                if (~var13 <= ~var12_ref_mb__.length) {
                  break L11;
                } else {
                  L17: {
                    var14 = (Object) (Object) var12_ref_mb__[var13];
                    if (((mb) var14).field_Db > var11) {
                      var11 = ((mb) var14).field_Db;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (~((mb) var14).field_Ub < ~var11) {
                      var11 = ((mb) var14).field_Ub;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var13++;
                  continue L16;
                }
              }
            } else {
              L19: {
                var9 = ((nb) this).field_W.length;
                if (var4 <= 0) {
                  break L19;
                } else {
                  var9 = var4;
                  break L19;
                }
              }
              var10 = pl.field_U;
              var11 = 0;
              var12_ref_mb__ = ((nb) this).field_W;
              var13 = 0;
              L20: while (true) {
                if (~var13 <= ~var12_ref_mb__.length) {
                  break L11;
                } else {
                  L21: {
                    var14 = (Object) (Object) var12_ref_mb__[var13];
                    if (((mb) var14).field_Db > var11) {
                      var11 = ((mb) var14).field_Db;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (~((mb) var14).field_Ub < ~var11) {
                      var11 = ((mb) var14).field_Ub;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  var13++;
                  continue L20;
                }
              }
            }
          }
          L23: {
            var12 = 3000 / var9;
            var13 = 1;
            if (1 != ((nb) this).field_X.field_P) {
              break L23;
            } else {
              var13 = 2;
              break L23;
            }
          }
          L24: {
            if (((nb) this).field_X.field_P != 2) {
              break L24;
            } else {
              var13 = 3;
              break L24;
            }
          }
          L25: {
            if (var12 > 1024) {
              var12 = 1024;
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            if (~var13 != ~var9) {
              break L26;
            } else {
              var13 = 1;
              break L26;
            }
          }
          L27: {
            var14 = null;
            var15 = 0;
            var16 = 0;
            if (var6 != 0) {
              break L27;
            } else {
              if (!ni.b(119)) {
                break L27;
              } else {
                if (di.field_g == 4) {
                  break L27;
                } else {
                  break L27;
                }
              }
            }
          }
          L28: {
            var17 = var9;
            var18 = 1;
            var19 = 8;
            var20 = 311;
            var21 = 45;
            var22 = 8;
            if (var13 != 2) {
              break L28;
            } else {
              var18 = 2;
              var23_ref_int__ = new int[2];
              var24 = 0;
              L29: while (true) {
                if (~var9 >= ~var24) {
                  L30: {
                    if (((nb) this).field_O[0] > ((nb) this).field_O[1]) {
                      stackOut_99_0 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      break L30;
                    } else {
                      if (~((nb) this).field_O[1] < ~((nb) this).field_O[0]) {
                        stackOut_98_0 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        break L30;
                      } else {
                        stackOut_97_0 = -1;
                        stackIn_100_0 = stackOut_97_0;
                        break L30;
                      }
                    }
                  }
                  L31: {
                    var24 = stackIn_100_0;
                    if (var24 < 0) {
                      break L31;
                    } else {
                      if (0 != var4) {
                        break L31;
                      } else {
                        var25 = 1;
                        var26 = 0;
                        L32: while (true) {
                          L33: {
                            if (var26 >= ((nb) this).field_e.length) {
                              break L33;
                            } else {
                              L34: {
                                if (-1 == ((nb) this).field_e[var26]) {
                                  break L34;
                                } else {
                                  if (null == ((nb) this).field_W[var26]) {
                                    break L34;
                                  } else {
                                    if (~((nb) this).field_W[var26].field_jc != ~var24) {
                                      break L34;
                                    } else {
                                      var25 = 0;
                                      break L33;
                                    }
                                  }
                                }
                              }
                              var26++;
                              continue L32;
                            }
                          }
                          if (var25 == 0) {
                            break L31;
                          } else {
                            var24 = -1;
                            break L31;
                          }
                        }
                      }
                    }
                  }
                  L35: {
                    var25 = Math.max(var23_ref_int__[0], var23_ref_int__[1]);
                    var17 = var25;
                    if (var17 > 5) {
                      var22 = 5;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  var26 = 0;
                  L36: while (true) {
                    if (2 <= var26) {
                      break L28;
                    } else {
                      L37: {
                        var27 = 3;
                        var28_ref_String = db.a(kk.field_f, -85, new String[2]);
                        var28_ref_String = ke.a(42, var28_ref_String);
                        var29 = ui.field_U.c(var28_ref_String) + 2 * var27;
                        var30 = -(var29 / 2) + (640 - -(var26 * 1280)) / 4;
                        var31 = 60;
                        var32 = ui.field_U.field_U + 2 * var27;
                        pb.c(var30, var31, var29, var32, 0, 160);
                        var33_int = fj.field_h[var26];
                        if (~qd.field_t[0] != ~var33_int) {
                          break L37;
                        } else {
                          var33_int = uj.a(var33_int, 100);
                          break L37;
                        }
                      }
                      L38: {
                        ui.field_U.b(var28_ref_String, var27 + var30, -var27 + (var31 - -var32), var33_int, 0);
                        if (~var24 != ~var26) {
                          break L38;
                        } else {
                          L39: {
                            var34 = 250;
                            var35 = 100;
                            if (var26 == 1) {
                              stackOut_121_0 = 320;
                              stackIn_122_0 = stackOut_121_0;
                              break L39;
                            } else {
                              stackOut_120_0 = 0;
                              stackIn_122_0 = stackOut_120_0;
                              break L39;
                            }
                          }
                          var36 = stackIn_122_0 + (320 + -var34) / 2;
                          td.field_ec.a(var36, var35);
                          break L38;
                        }
                      }
                      var26++;
                      continue L36;
                    }
                  }
                } else {
                  L40: {
                    stackOut_88_0 = ((nb) this).field_W;
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_89_0 = stackOut_88_0;
                    if (var4 > 0) {
                      stackOut_90_0 = (mb[]) (Object) stackIn_90_0;
                      stackOut_90_1 = 0;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      break L40;
                    } else {
                      stackOut_89_0 = (mb[]) (Object) stackIn_89_0;
                      stackOut_89_1 = var24;
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_91_1 = stackOut_89_1;
                      break L40;
                    }
                  }
                  L41: {
                    var25 = stackIn_91_0[stackIn_91_1].field_jc;
                    if (var25 < 0) {
                      break L41;
                    } else {
                      if (2 <= var25) {
                        break L41;
                      } else {
                        var23_ref_int__[var25] = var23_ref_int__[var25] + 1;
                        break L41;
                      }
                    }
                  }
                  var24++;
                  continue L29;
                }
              }
            }
          }
          L42: {
            if (var9 <= 4) {
              break L42;
            } else {
              var18 = 2;
              break L42;
            }
          }
          L43: {
            if (var2 != 0) {
              var21 = 100;
              var20 = 450;
              break L43;
            } else {
              break L43;
            }
          }
          L44: {
            if (4 <= var9) {
              break L44;
            } else {
              var22 = 16;
              break L44;
            }
          }
          L45: {
            if (var18 != 2) {
              break L45;
            } else {
              var17 = (1 + var9) / 2;
              break L45;
            }
          }
          L46: {
            var23 = -((var22 + var17 * (var21 + var22)) / 2) + 218;
            var24 = (var19 + 640 + -((var20 + var19) * var18)) / 2;
            var25 = 0;
            if (var13 == 2) {
              var23 += 16;
              break L46;
            } else {
              break L46;
            }
          }
          var26 = var24;
          var27 = var23;
          var28 = 0;
          L47: while (true) {
            if (var28 >= var9) {
              L48: {
                if (var14 != null) {
                  var28_ref_fh = ff.field_lb;
                  var29 = ((mi) (Object) var28_ref_fh).c((String) var14);
                  var15 = var15 - var29 / 2;
                  var15 = Math.min(var15, 638 - var29);
                  var15 = Math.max(var15, 2);
                  pb.c(-2 + var15, var16 - 2, var29 + 4, 4 + (((mi) (Object) var28_ref_fh).field_F + ((mi) (Object) var28_ref_fh).field_G), 0, 192);
                  ((mi) (Object) var28_ref_fh).b((String) var14, var15, var16 - -((mi) (Object) var28_ref_fh).field_G, 16777215, 0);
                  break L48;
                } else {
                  break L48;
                }
              }
              L49: {
                if (0 > ed.field_j) {
                  break L49;
                } else {
                  if (((nb) this).field_J) {
                    break L49;
                  } else {
                    if (var25 == 0) {
                      break L49;
                    } else {
                      if (!((nb) this).field_X.field_lb) {
                        pl.field_U.a(oa.field_O, 320, 436, 1021128, -1);
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                  }
                }
              }
              L50: {
                if (ed.field_j < 0) {
                  break L50;
                } else {
                  if (var2 != 0) {
                    break L50;
                  } else {
                    L51: {
                      if (hj.field_F > 0) {
                        break L51;
                      } else {
                        if (li.field_v > 0) {
                          break L51;
                        } else {
                          break L50;
                        }
                      }
                    }
                    L52: {
                      var28 = 32 + var7;
                      if (!ql.a(ce.field_t, 18286)) {
                        break L52;
                      } else {
                        var28 -= 15;
                        break L52;
                      }
                    }
                    L53: {
                      var29_ref_String = "00a2ff";
                      var30_ref_String = db.a(de.field_g, -128, new String[2]);
                      stackOut_252_0 = ph.field_d;
                      stackOut_252_1 = -123;
                      stackOut_252_2 = new String[2];
                      stackOut_252_3 = new String[2];
                      stackOut_252_4 = 0;
                      stackIn_254_0 = stackOut_252_0;
                      stackIn_254_1 = stackOut_252_1;
                      stackIn_254_2 = stackOut_252_2;
                      stackIn_254_3 = stackOut_252_3;
                      stackIn_254_4 = stackOut_252_4;
                      stackIn_253_0 = stackOut_252_0;
                      stackIn_253_1 = stackOut_252_1;
                      stackIn_253_2 = stackOut_252_2;
                      stackIn_253_3 = stackOut_252_3;
                      stackIn_253_4 = stackOut_252_4;
                      if (1000 != li.field_v) {
                        stackOut_254_0 = (String) (Object) stackIn_254_0;
                        stackOut_254_1 = stackIn_254_1;
                        stackOut_254_2 = (String[]) (Object) stackIn_254_2;
                        stackOut_254_3 = (String[]) (Object) stackIn_254_3;
                        stackOut_254_4 = stackIn_254_4;
                        stackOut_254_5 = Integer.toString(li.field_v);
                        stackIn_255_0 = stackOut_254_0;
                        stackIn_255_1 = stackOut_254_1;
                        stackIn_255_2 = stackOut_254_2;
                        stackIn_255_3 = stackOut_254_3;
                        stackIn_255_4 = stackOut_254_4;
                        stackIn_255_5 = stackOut_254_5;
                        break L53;
                      } else {
                        stackOut_253_0 = (String) (Object) stackIn_253_0;
                        stackOut_253_1 = stackIn_253_1;
                        stackOut_253_2 = (String[]) (Object) stackIn_253_2;
                        stackOut_253_3 = (String[]) (Object) stackIn_253_3;
                        stackOut_253_4 = stackIn_253_4;
                        stackOut_253_5 = tm.field_g;
                        stackIn_255_0 = stackOut_253_0;
                        stackIn_255_1 = stackOut_253_1;
                        stackIn_255_2 = stackOut_253_2;
                        stackIn_255_3 = stackOut_253_3;
                        stackIn_255_4 = stackOut_253_4;
                        stackIn_255_5 = stackOut_253_5;
                        break L53;
                      }
                    }
                    stackIn_255_3[stackIn_255_4] = stackIn_255_5;
                    stackIn_255_2[1] = var29_ref_String;
                    var31_ref_String = db.a(stackIn_255_0, stackIn_255_1, stackIn_255_2);
                    pl.field_U.b(var30_ref_String, 100, var28, 16777215, -1);
                    pl.field_U.b(var31_ref_String, 400, var28, 16777215, -1);
                    break L50;
                  }
                }
              }
              L54: {
                if (ed.field_j < 0) {
                  break L54;
                } else {
                  L55: {
                    if (var2 != 0) {
                      break L55;
                    } else {
                      if (ql.a(ce.field_t, 18286)) {
                        var28 = uf.a(120, ce.field_t);
                        var29 = -10 + var28 * 40;
                        var30 = (640 - var29) / 2;
                        var31 = 0;
                        var32 = -1;
                        var33_int = 0;
                        L56: while (true) {
                          if (256 <= var33_int) {
                            if (0 <= var32) {
                              L57: {
                                var33 = jg.field_t[var32];
                                var34 = 4 + ff.field_lb.c(var33);
                                var31 = var31 - var34 / 2;
                                var35 = 14;
                                if (10 <= var31) {
                                  break L57;
                                } else {
                                  var31 = 10;
                                  break L57;
                                }
                              }
                              L58: {
                                if (630 < var31 + var34) {
                                  var31 = -var34 + 630;
                                  break L58;
                                } else {
                                  break L58;
                                }
                              }
                              var36 = -var35 + 396;
                              pb.c(var31, var36, var34, var35, 0, 192);
                              ff.field_lb.b(var33, 2 + var31, -2 + (var35 + var36), 16777215, -1);
                              break L55;
                            } else {
                              break L54;
                            }
                          } else {
                            L59: {
                              if (ve.a(ce.field_t, 1, var33_int)) {
                                L60: {
                                  var34_ref_wk = od.field_c[var33_int];
                                  var34_ref_wk.d(var30, 400);
                                  if (var30 > oh.field_f) {
                                    break L60;
                                  } else {
                                    if (~oh.field_f <= ~(30 + var30)) {
                                      break L60;
                                    } else {
                                      if (400 > pi.field_c) {
                                        break L60;
                                      } else {
                                        if (pi.field_c >= 430) {
                                          break L60;
                                        } else {
                                          var31 = 15 + var30;
                                          var32 = var33_int;
                                          break L60;
                                        }
                                      }
                                    }
                                  }
                                }
                                var30 += 40;
                                break L59;
                              } else {
                                break L59;
                              }
                            }
                            var33_int++;
                            continue L56;
                          }
                        }
                      } else {
                        break L54;
                      }
                    }
                  }
                  break L54;
                }
              }
              return;
            } else {
              L61: {
                if (var9 % 2 != 1) {
                  break L61;
                } else {
                  if (var18 != 2) {
                    break L61;
                  } else {
                    if (var13 != 1) {
                      break L61;
                    } else {
                      if (~var28 == ~(-1 + var17)) {
                        var26 = var26 + (var19 + var20) / 2;
                        break L61;
                      } else {
                        break L61;
                      }
                    }
                  }
                }
              }
              L62: {
                stackOut_144_0 = ((nb) this).field_W;
                stackIn_146_0 = stackOut_144_0;
                stackIn_145_0 = stackOut_144_0;
                if (var4 <= 0) {
                  stackOut_146_0 = (mb[]) (Object) stackIn_146_0;
                  stackOut_146_1 = var28;
                  stackIn_147_0 = stackOut_146_0;
                  stackIn_147_1 = stackOut_146_1;
                  break L62;
                } else {
                  stackOut_145_0 = (mb[]) (Object) stackIn_145_0;
                  stackOut_145_1 = 0;
                  stackIn_147_0 = stackOut_145_0;
                  stackIn_147_1 = stackOut_145_1;
                  break L62;
                }
              }
              L63: {
                L64: {
                  var29_ref_mb = stackIn_147_0[stackIn_147_1];
                  if (var4 > 0) {
                    break L64;
                  } else {
                    L65: {
                      if (-1 == ((nb) this).field_e[var28]) {
                        break L65;
                      } else {
                        if ((256 & ((nb) this).field_e[var28]) == 0) {
                          break L65;
                        } else {
                          break L64;
                        }
                      }
                    }
                    stackOut_152_0 = 0;
                    stackIn_153_0 = stackOut_152_0;
                    break L63;
                  }
                }
                stackOut_151_0 = 1;
                stackIn_153_0 = stackOut_151_0;
                break L63;
              }
              L66: {
                var30 = stackIn_153_0;
                stackOut_153_0 = 0;
                stackOut_153_1 = ((nb) this).field_e;
                stackIn_155_0 = stackOut_153_0;
                stackIn_155_1 = stackOut_153_1;
                stackIn_154_0 = stackOut_153_0;
                stackIn_154_1 = stackOut_153_1;
                if (var4 <= 0) {
                  stackOut_155_0 = stackIn_155_0;
                  stackOut_155_1 = (int[]) (Object) stackIn_155_1;
                  stackOut_155_2 = var28;
                  stackIn_156_0 = stackOut_155_0;
                  stackIn_156_1 = stackOut_155_1;
                  stackIn_156_2 = stackOut_155_2;
                  break L66;
                } else {
                  stackOut_154_0 = stackIn_154_0;
                  stackOut_154_1 = (int[]) (Object) stackIn_154_1;
                  stackOut_154_2 = 0;
                  stackIn_156_0 = stackOut_154_0;
                  stackIn_156_1 = stackOut_154_1;
                  stackIn_156_2 = stackOut_154_2;
                  break L66;
                }
              }
              L67: {
                if (stackIn_156_0 != ~stackIn_156_1[stackIn_156_2]) {
                  stackOut_158_0 = 0;
                  stackIn_159_0 = stackOut_158_0;
                  break L67;
                } else {
                  stackOut_157_0 = 1;
                  stackIn_159_0 = stackOut_157_0;
                  break L67;
                }
              }
              L68: {
                L69: {
                  var31 = stackIn_159_0;
                  if (var2 == 0) {
                    break L69;
                  } else {
                    if (ge.field_j > 0) {
                      break L69;
                    } else {
                      break L68;
                    }
                  }
                }
                this.a(var21, false, var29_ref_mb.d((byte) 28), var20, var30 != 0, var27, var11, var29_ref_mb, var26);
                break L68;
              }
              L70: {
                var32_ref_String = Integer.toString(((nb) this).field_H[var28] / 100);
                if (var31 == 0) {
                  stackOut_165_0 = 16777215;
                  stackIn_166_0 = stackOut_165_0;
                  break L70;
                } else {
                  stackOut_164_0 = 11579568;
                  stackIn_166_0 = stackOut_164_0;
                  break L70;
                }
              }
              L71: {
                var33_int = stackIn_166_0;
                if (var2 != 0) {
                  L72: {
                    if (0 == ge.field_j) {
                      var32_ref_String = "";
                      break L72;
                    } else {
                      var32_ref_String = db.a(ak.field_a, -37, new String[1]);
                      break L72;
                    }
                  }
                  L73: {
                    if (nc.field_a >= 0) {
                      stackOut_173_0 = 65280;
                      stackIn_174_0 = stackOut_173_0;
                      break L73;
                    } else {
                      stackOut_172_0 = 6316128;
                      stackIn_174_0 = stackOut_172_0;
                      break L73;
                    }
                  }
                  var33_int = stackIn_174_0;
                  break L71;
                } else {
                  break L71;
                }
              }
              L74: {
                ((mi) (Object) var10).c(var32_ref_String, -5 + (var26 + var20), var27 - -16, var33_int, -1);
                var34 = 25 + var27;
                var35 = 4 + (var26 - -var21);
                var36 = -var35 + var20 + var26;
                var37 = var27 - (-var21 - -var34);
                var38 = 160;
                if (var2 != 0) {
                  break L74;
                } else {
                  L75: {
                    if (!((nb) this).field_X.field_lb) {
                      break L75;
                    } else {
                      if (((nb) this).field_X.field_cb >= 43) {
                        break L75;
                      } else {
                        L76: {
                          pb.c(var35, var34, var36, var37, 0, var38);
                          var39_ref = null;
                          if (((nb) this).field_X.field_cb <= 40) {
                            var39_ref_String = "" + ((nb) this).field_X.field_cb;
                            break L76;
                          } else {
                            var39_ref_String = "40+";
                            break L76;
                          }
                        }
                        var39_ref_String = db.a(jf.field_W, -100, new String[1]);
                        var48 = var39_ref_String;
                        var14 = (Object) (Object) var48;
                        ((mi) (Object) var10).a(var39_ref_String, var36 / 2 + var35, (var37 + ((mi) (Object) var10).field_U) / 2 + var34, 16777215, 0);
                        break L74;
                      }
                    }
                  }
                  var39 = var35;
                  var40 = var37 / 2 + var34;
                  var41 = 20;
                  var42 = 20;
                  var43 = var39;
                  if (var31 == 0) {
                    L77: {
                      var25 = 1;
                      var44 = 1;
                      if (0 < var4) {
                        stackOut_186_0 = (var28 + 1) % 2 * 32;
                        stackIn_187_0 = stackOut_186_0;
                        break L77;
                      } else {
                        stackOut_185_0 = mm.a((byte) 106, ((nb) this).field_e[var28]);
                        stackIn_187_0 = stackOut_185_0;
                        break L77;
                      }
                    }
                    L78: {
                      var45 = stackIn_187_0;
                      var46 = var36 / var41;
                      if (0 < var45) {
                        pb.c(var35, var34, var36, var37, 0, var38);
                        break L78;
                      } else {
                        break L78;
                      }
                    }
                    L79: {
                      if (var46 >= var45) {
                        break L79;
                      } else {
                        if (var37 > 40) {
                          var40 -= 10;
                          break L79;
                        } else {
                          var46 = var45;
                          var41 = var36 / var45;
                          break L79;
                        }
                      }
                    }
                    var45 = 0;
                    var43 -= 3;
                    var40 = var40 - var42 / 2;
                    var47 = 0;
                    L80: while (true) {
                      if (var47 >= 32) {
                        break L74;
                      } else {
                        L81: {
                          L82: {
                            L83: {
                              if (0 >= var4) {
                                break L83;
                              } else {
                                if (var28 % 2 == 0) {
                                  break L82;
                                } else {
                                  break L83;
                                }
                              }
                            }
                            if (var4 != 0) {
                              break L81;
                            } else {
                              if ((var44 & ((nb) this).field_e[var28]) != 0) {
                                break L82;
                              } else {
                                break L81;
                              }
                            }
                          }
                          L84: {
                            pd.field_Z[var47].a(var43, var40);
                            if (~var43 < ~oh.field_f) {
                              break L84;
                            } else {
                              if (~oh.field_f <= ~(var43 - -pd.field_Z[var47].field_z)) {
                                break L84;
                              } else {
                                if (~var40 < ~pi.field_c) {
                                  break L84;
                                } else {
                                  if (pi.field_c >= pd.field_Z[var47].field_B + var40) {
                                    break L84;
                                  } else {
                                    L85: {
                                      L86: {
                                        var48 = Integer.toString(((nb) this).field_c[var47]);
                                        var49 = var48;
                                        var48 = var49;
                                        var14 = (Object) (Object) var48;
                                        var49 = Integer.toString(((nb) this).field_a[var47]);
                                        if (7 == var47) {
                                          break L86;
                                        } else {
                                          if (30 == var47) {
                                            break L86;
                                          } else {
                                            if (var47 == 24) {
                                              break L86;
                                            } else {
                                              L87: {
                                                if (var47 == 4) {
                                                  break L87;
                                                } else {
                                                  if (var47 != 5) {
                                                    if (27 != var47) {
                                                      break L85;
                                                    } else {
                                                      var49 = var49 + 37;
                                                      var48 = var49;
                                                      var14 = (Object) (Object) var48;
                                                      var48 = var49;
                                                      var48 = var48 + 37;
                                                      break L85;
                                                    }
                                                  } else {
                                                    break L87;
                                                  }
                                                }
                                              }
                                              var50 = Math.min(((nb) this).field_a[var47], -1 + dl.field_I.length);
                                              var49 = db.a(dl.field_I[var50], -55, new String[1]);
                                              var48 = var49;
                                              var49 = var48;
                                              var48 = var49;
                                              var14 = (Object) (Object) var48;
                                              break L85;
                                            }
                                          }
                                        }
                                      }
                                      L88: {
                                        if (((nb) this).field_c[var47] != 1) {
                                          var48 = var48 + tc.field_s;
                                          var14 = (Object) (Object) var48;
                                          var14 = (Object) (Object) var48;
                                          break L88;
                                        } else {
                                          var48 = var48 + ck.field_d;
                                          break L88;
                                        }
                                      }
                                      if (1 != ((nb) this).field_a[var47]) {
                                        var49 = var49 + tc.field_s;
                                        var14 = (Object) (Object) var49;
                                        var14 = (Object) (Object) var49;
                                        break L85;
                                      } else {
                                        var49 = var49 + ck.field_d;
                                        break L85;
                                      }
                                    }
                                    L89: {
                                      var14 = (Object) (Object) db.a(bj.field_l[var47 * 2], -78, new String[1]);
                                      var50 = 1;
                                      if (ed.field_j > -1) {
                                        break L89;
                                      } else {
                                        var50 = 0;
                                        break L89;
                                      }
                                    }
                                    L90: {
                                      if (null != bj.field_l[var47 * 2 - -1]) {
                                        if (((nb) this).field_c[var47] != ((nb) this).field_a[var47]) {
                                          break L90;
                                        } else {
                                          var50 = 0;
                                          break L90;
                                        }
                                      } else {
                                        var50 = 0;
                                        break L90;
                                      }
                                    }
                                    var16 = var40 - 25;
                                    var15 = var43 - -8;
                                    if (var50 == 0) {
                                      break L84;
                                    } else {
                                      var14 = (Object) (Object) (var14 + db.a(bj.field_l[1 + 2 * var47], -127, new String[1]));
                                      break L84;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var45++;
                          var43 = var43 + var41;
                          if (~var45 != ~var46) {
                            break L81;
                          } else {
                            var40 = var40 + var42;
                            var45 = 0;
                            var43 = var39;
                            break L81;
                          }
                        }
                        var44 = var44 << 1;
                        var47++;
                        continue L80;
                      }
                    }
                  } else {
                    pb.c(var35, var34, var36, var37, 0, var38);
                    ((mi) (Object) var10).b(jc.field_e, 4 + var39, ((mi) (Object) var10).field_U / 2 + var40, 11579568, 0);
                    break L74;
                  }
                }
              }
              L91: {
                if (~(1 + var28) == ~var17) {
                  var27 = var23;
                  var26 = var19 + var20 + var24;
                  break L91;
                } else {
                  var27 = var27 + (var22 + var21);
                  break L91;
                }
              }
              var28++;
              continue L47;
            }
          }
        } else {
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (null != ((nb) this).field_C) {
            if (((nb) this).field_C.field_Fb < 5) {
                if (!(0 < ((nb) this).field_C.field_cb)) {
                    return true;
                }
            }
        }
        if (param2 <= dl.field_G) {
            return false;
        }
        if (((nb) this).field_X.a(4 + (dl.field_G >> 4), 4, 0, dl.field_G >> 4, km.field_c >> 4, (byte) 98, km.field_c >> 4)) {
            return true;
        }
        return false;
    }

    private final boolean e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        var3 = SteelSentinels.field_G;
        if (dl.field_M < qh.field_Yb) {
          return true;
        } else {
          L0: {
            if (param0 == -100) {
              break L0;
            } else {
              int discarded$2 = this.e(false, 117);
              break L0;
            }
          }
          var2 = di.field_g;
          if (0 == var2) {
            L1: {
              var2 = qh.field_Yb;
              if (0 != var2) {
                if (var2 == 5) {
                  break L1;
                } else {
                  if (8 != var2) {
                    return false;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            return true;
          } else {
            if (var2 != 1) {
              if (var2 != 7) {
                L2: {
                  if (3 == var2) {
                    L3: {
                      var2 = qh.field_Yb;
                      if (0 != var2) {
                        if (var2 != 3) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    return true;
                  } else {
                    if (5 == var2) {
                      break L2;
                    } else {
                      if (var2 == 9) {
                        L4: {
                          var2 = qh.field_Yb;
                          if (var2 == 2) {
                            stackOut_35_0 = 1;
                            stackIn_36_0 = stackOut_35_0;
                            break L4;
                          } else {
                            stackOut_34_0 = 0;
                            stackIn_36_0 = stackOut_34_0;
                            break L4;
                          }
                        }
                        return stackIn_36_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
                return false;
              } else {
                return false;
              }
            } else {
              L5: {
                var2 = qh.field_Yb;
                if (0 != var2) {
                  if (var2 != 10) {
                    return false;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              return true;
            }
          }
        }
    }

    private final void c() {
        int var4 = SteelSentinels.field_G;
        ul var2 = ((nb) this).field_X.field_K;
        mb var3 = (mb) (Object) var2.e(13058);
        while (var3 != null) {
            if (var3.field_Nb != 0) {
                var3.f(128);
                b.field_f = true;
            }
            var3 = (mb) (Object) var2.a((byte) -49);
        }
    }

    private final int a(int param0, int param1) {
        return (param1 << 4) + ((nb) this).field_P << 4;
    }

    final void c(boolean param0, int param1) {
        int var3 = 0;
        hd var4 = null;
        u var5_ref_u = null;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        String var7_ref_String = null;
        wk[] var7_ref_wk__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        int var12 = 0;
        wk[] var13 = null;
        int stackIn_8_0 = 0;
        int stackIn_24_0 = 0;
        String stackIn_36_0 = null;
        String stackIn_63_0 = null;
        int stackIn_76_0 = 0;
        int stackIn_86_0 = 0;
        wk[] stackIn_89_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        String stackOut_62_0 = null;
        String stackOut_61_0 = null;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_85_0 = 0;
        wk[] stackOut_88_0 = null;
        wk[] stackOut_87_0 = null;
        var12 = SteelSentinels.field_G;
        if (~((nb) this).field_X.field_r > ~((nb) this).field_w) {
          this.a(param0, (byte) -21);
          return;
        } else {
          L0: {
            L1: {
              ((nb) this).field_n = ((nb) this).field_r;
              ((nb) this).field_r = -1;
              sb.field_bb.b((byte) 126);
              if (jc.a(param1 ^ 21517)) {
                break L1;
              } else {
                if (!param0) {
                  break L1;
                } else {
                  if (jn.field_g) {
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          L2: {
            var3 = stackIn_8_0;
            var4 = ((nb) this).field_X.field_ab;
            this.a((byte) 125, true, true, var4);
            this.a(-93, true, var3 != 0, true);
            int discarded$2 = this.a(true, var4, true, (byte) -95);
            if (di.field_g == -1) {
              break L2;
            } else {
              if (di.field_g == 4) {
                break L2;
              } else {
                if (dl.field_M == qh.field_Yb) {
                  break L2;
                } else {
                  pb.c(0, 0, 640, 480, 0, 128);
                  break L2;
                }
              }
            }
          }
          L3: {
            if (null == ((nb) this).field_C) {
              break L3;
            } else {
              this.a(var3 != 0, param1 ^ -21520);
              break L3;
            }
          }
          L4: {
            pb.c();
            ((nb) this).field_t = -1;
            this.b(var3 != 0, 1956917985);
            if (di.field_g != -1) {
              break L4;
            } else {
              if (((nb) this).field_X.field_j) {
                break L4;
              } else {
                if (1 != ((nb) this).field_X.field_ab.b(param1 + -21434)) {
                  break L4;
                } else {
                  L5: {
                    var5 = 16;
                    var6 = 8;
                    var7 = 428;
                    var8 = 192;
                    var9 = 508;
                    pb.c(var7, var5, var9 + -var7, var6, 32768, var8);
                    var7 = var9;
                    var9 = 549;
                    pb.c(var7, var5, -var7 + var9, var6, 8421376, var8);
                    var7 = var9;
                    var9 = 589;
                    pb.c(var7, var5, var9 - var7, var6, 8409088, var8);
                    var7 = var9;
                    var9 = 628;
                    pb.c(var7, var5, var9 + -var7, var6, 8388608, var8);
                    if (12000 > ((nb) this).field_X.field_r) {
                      stackOut_23_0 = 32768;
                      stackIn_24_0 = stackOut_23_0;
                      break L5;
                    } else {
                      if (18000 <= ((nb) this).field_X.field_r) {
                        if (((nb) this).field_X.field_r < 24000) {
                          stackOut_22_0 = 8409088;
                          stackIn_24_0 = stackOut_22_0;
                          break L5;
                        } else {
                          stackOut_21_0 = 8388608;
                          stackIn_24_0 = stackOut_21_0;
                          break L5;
                        }
                      } else {
                        stackOut_19_0 = 8421376;
                        stackIn_24_0 = stackOut_19_0;
                        break L5;
                      }
                    }
                  }
                  var10 = stackIn_24_0;
                  var5 -= 2;
                  var7 = Math.min(200 * ((nb) this).field_X.field_r / 29750, 200) + 428;
                  var11_int = 4;
                  L6: while (true) {
                    if (var11_int <= 0) {
                      break L4;
                    } else {
                      pb.c(-var11_int + var7, -var11_int + var5, var11_int * 2, var10, var8);
                      pb.c(-var11_int + var7, var6 + (var11_int + var5) - -3, var11_int * 2, var10, var8);
                      var11_int--;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
          L7: {
            if (di.field_g != -1) {
              break L7;
            } else {
              L8: {
                if (!((nb) this).field_X.field_j) {
                  break L8;
                } else {
                  if (q.field_h <= 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              this.f(var3 != 0, 8209);
              break L7;
            }
          }
          L9: {
            if (g.field_h < 0) {
              break L9;
            } else {
              L10: {
                var5_ref_u = dm.field_f;
                if (35 > g.field_h) {
                  stackOut_35_0 = rj.field_m[g.field_h];
                  stackIn_36_0 = stackOut_35_0;
                  break L10;
                } else {
                  stackOut_34_0 = qj.field_v[g.field_h - 35];
                  stackIn_36_0 = stackOut_34_0;
                  break L10;
                }
              }
              L11: {
                var6_ref_String = stackIn_36_0;
                if (24 != g.field_h) {
                  break L11;
                } else {
                  var6_ref_String = bk.field_O;
                  break L11;
                }
              }
              L12: {
                var7_ref_String = ll.field_p[g.field_h];
                if (di.field_g != 1) {
                  break L12;
                } else {
                  if (22 == g.field_h) {
                    var7_ref_String = hm.field_b;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              L13: {
                var8 = pd.field_X;
                var9 = 320;
                var10 = 240;
                var11_int = var10 - -(((mi) (Object) var5_ref_u).field_U / 2);
                if (var8 < 25) {
                  var11_int = var11_int - 3 * var8;
                  break L13;
                } else {
                  if (225 <= var8) {
                    var11_int = var11_int - (-(3 * var8) + 750);
                    break L13;
                  } else {
                    var11_int -= 75;
                    break L13;
                  }
                }
              }
              pb.a(0, 0, 640, var10);
              ((mi) (Object) var5_ref_u).a(ke.a(42, var6_ref_String), var9, var11_int, 16777215, 0);
              pb.a(0, 10 + var11_int, 640, 480);
              int discarded$3 = pl.field_U.a(var7_ref_String, 100, 200, 440, 200, 1044724, 0, 1, 0, pl.field_U.field_G);
              pb.c();
              break L9;
            }
          }
          L14: {
            if (!((nb) this).field_X.field_j) {
              break L14;
            } else {
              pb.c(0, 0, 640, 480, 0, Math.max(0, -q.field_h + 100));
              break L14;
            }
          }
          if (param1 == 21519) {
            L15: {
              L16: {
                if (!((nb) this).field_X.field_j) {
                  break L16;
                } else {
                  if (q.field_h <= 0) {
                    this.i((byte) -23);
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (((nb) this).field_X.field_R <= 150) {
                  break L17;
                } else {
                  if (((nb) this).field_X.field_ab.b(56) != 4) {
                    if (((nb) this).field_X.field_ab.b(param1 ^ 21572) == 1) {
                      break L15;
                    } else {
                      ui.field_U.a(nh.field_A.toUpperCase(), 320, 80, 16777215, 8421504);
                      break L15;
                    }
                  } else {
                    break L17;
                  }
                }
              }
              if (((nb) this).field_X.field_R <= 0) {
                break L15;
              } else {
                if (((nb) this).field_X.field_ab.b(62) == 4) {
                  break L15;
                } else {
                  L18: {
                    if (1 == ((nb) this).field_X.field_ab.b(81)) {
                      stackOut_62_0 = hk.field_jc;
                      stackIn_63_0 = stackOut_62_0;
                      break L18;
                    } else {
                      stackOut_61_0 = wb.field_f;
                      stackIn_63_0 = stackOut_61_0;
                      break L18;
                    }
                  }
                  var5_ref_String = stackIn_63_0;
                  ui.field_U.a(db.a(var5_ref_String, -126, new String[1]).toUpperCase(), 320, 80, 16777215, 8421504);
                  break L15;
                }
              }
            }
            L19: {
              L20: {
                if (di.field_g == 0) {
                  break L20;
                } else {
                  if (di.field_g == 1) {
                    break L20;
                  } else {
                    if (di.field_g == 3) {
                      break L20;
                    } else {
                      if (di.field_g == 5) {
                        break L20;
                      } else {
                        if (di.field_g == 7) {
                          break L20;
                        } else {
                          if (di.field_g != 9) {
                            stackOut_75_0 = 0;
                            stackIn_76_0 = stackOut_75_0;
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                  }
                }
              }
              stackOut_74_0 = 1;
              stackIn_76_0 = stackOut_74_0;
              break L19;
            }
            L21: {
              var5 = stackIn_76_0;
              if (var5 != 0) {
                this.c((byte) 104);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if (10 != di.field_g) {
                break L22;
              } else {
                this.a(-5669);
                break L22;
              }
            }
            L23: {
              if (!((nb) this).field_d) {
                break L23;
              } else {
                L24: {
                  L25: {
                    if (!bb.field_T) {
                      break L25;
                    } else {
                      if (!param0) {
                        break L25;
                      } else {
                        stackOut_84_0 = 1;
                        stackIn_86_0 = stackOut_84_0;
                        break L24;
                      }
                    }
                  }
                  stackOut_85_0 = 0;
                  stackIn_86_0 = stackOut_85_0;
                  break L24;
                }
                L26: {
                  var6 = stackIn_86_0;
                  if (var6 != 0) {
                    stackOut_88_0 = tk.field_t;
                    stackIn_89_0 = stackOut_88_0;
                    break L26;
                  } else {
                    stackOut_87_0 = co.field_d;
                    stackIn_89_0 = stackOut_87_0;
                    break L26;
                  }
                }
                L27: {
                  var13 = stackIn_89_0;
                  var7_ref_wk__ = var13;
                  var8 = var13[2].field_A + ((int)jl.field_c - -var13[0].field_A);
                  var9 = 24;
                  var10 = 356;
                  if (!vl.field_v) {
                    if (~(qc.field_V.field_cb + -var9) <= ~var10) {
                      break L27;
                    } else {
                      var10 = -var9 + qc.field_V.field_cb;
                      break L27;
                    }
                  } else {
                    L28: {
                      var10 = -var9 + qc.field_V.field_cb;
                      if (var10 < 336) {
                        var10 = 336;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    if (var10 <= 356) {
                      break L27;
                    } else {
                      var10 = 356;
                      break L27;
                    }
                  }
                }
                L29: {
                  pb.c(0, var10, var8, var9, 0, 192);
                  hb.a((byte) 44, var7_ref_wk__, var8, var10, 0, var9);
                  if (0 > oh.field_f) {
                    break L29;
                  } else {
                    if (var8 <= oh.field_f) {
                      break L29;
                    } else {
                      if (pi.field_c < var10) {
                        break L29;
                      } else {
                        if (var9 + var10 <= pi.field_c) {
                          break L29;
                        } else {
                          ((nb) this).field_r = 0;
                          vd.field_b = true;
                          break L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  var11 = new int[4];
                  pb.b(var11);
                  if (hj.field_s == null) {
                    break L30;
                  } else {
                    fk.field_d.c(hj.field_s.toUpperCase(), var13[0].field_A + (int)jl.field_c, -var13[6].field_F + var10 - (-var9 - 3), ((nb) this).field_M[0], -1);
                    break L30;
                  }
                }
                pb.a(var11);
                break L23;
              }
            }
            L31: {
              L32: {
                var6 = 0;
                if (!fc.field_e[28]) {
                  break L32;
                } else {
                  if (di.field_g != -1) {
                    break L32;
                  } else {
                    var6 = 1;
                    break L31;
                  }
                }
              }
              if (((nb) this).field_h) {
                if (((nb) this).field_X.field_r >= 250) {
                  ((nb) this).field_h = false;
                  break L31;
                } else {
                  var6 = 1;
                  break L31;
                }
              } else {
                break L31;
              }
            }
            L33: {
              if (var6 != 0) {
                if (kj.field_w >= 105) {
                  break L33;
                } else {
                  kj.field_w = Math.min(25 + kj.field_w, 105);
                  break L33;
                }
              } else {
                if (kj.field_w <= 0) {
                  break L33;
                } else {
                  kj.field_w = Math.max(0, -25 + kj.field_w);
                  break L33;
                }
              }
            }
            L34: {
              if (kj.field_w <= 0) {
                break L34;
              } else {
                this.h(-4294);
                break L34;
              }
            }
            var7 = 0;
            L35: while (true) {
              if (var7 >= 640) {
                var7 = 0;
                L36: while (true) {
                  if (var7 >= 480) {
                    return;
                  } else {
                    var8 = sb.field_bb.field_c * var7;
                    sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], bi.a(param1, 5662));
                    var8 += 639;
                    sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], 16913);
                    var7++;
                    continue L36;
                  }
                }
              } else {
                var8 = var7;
                sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], 16913);
                var8 = var8 + 306560;
                sb.field_bb.field_a[var8] = ri.a(48, sb.field_bb.field_a[var8], 16913);
                var7++;
                continue L35;
              }
            }
          } else {
            return;
          }
        }
    }

    private final void l() {
        int[] var2 = null;
        int var3 = 0;
        mb[] var4 = null;
        int var5 = 0;
        jc var6 = null;
        mb var7_ref_mb = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          L1: {
            var8 = SteelSentinels.field_G;
            var9 = new int[2];
            var2 = var9;
            var3 = ((nb) this).field_X.field_kb - -((nb) this).field_X.field_Q;
            if (null == ((nb) this).field_B) {
              break L1;
            } else {
              if (((nb) this).field_B.length == var3) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((nb) this).field_B = new int[var3];
          break L0;
        }
        var4 = new mb[var3];
        var5 = 0;
        var6 = new jc(((nb) this).field_X.field_K);
        var7_ref_mb = (mb) (Object) var6.b(2);
        L2: while (true) {
          if (var7_ref_mb == null) {
            L3: {
              if (var9[0] <= var9[1]) {
                stackOut_13_0 = 1;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                stackOut_12_0 = 0;
                stackIn_14_0 = stackOut_12_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_14_0;
              if (var9[0] / 100 == var9[1] / 100) {
                if (((nb) this).field_B[1] >= ((nb) this).field_B[0]) {
                  var7 = 0;
                  break L4;
                } else {
                  var7 = 1;
                  break L4;
                }
              } else {
                break L4;
              }
            }
            L5: {
              if (((nb) this).field_B[var7] >= 0) {
                if (((nb) this).field_B[var7] <= 0) {
                  break L5;
                } else {
                  ((nb) this).field_B[var7] = ((nb) this).field_B[var7] - 1;
                  break L5;
                }
              } else {
                ((nb) this).field_B[var7] = ((nb) this).field_B[var7] + 1;
                break L5;
              }
            }
            L6: {
              if (((nb) this).field_B[-var7 + 1] < 12) {
                ((nb) this).field_B[-var7 + 1] = ((nb) this).field_B[-var7 + 1] + 1;
                break L6;
              } else {
                if (((nb) this).field_B[1 - var7] <= 12) {
                  break L6;
                } else {
                  ((nb) this).field_B[1 + -var7] = ((nb) this).field_B[1 + -var7] - 1;
                  break L6;
                }
              }
            }
            return;
          } else {
            L7: {
              if (var7_ref_mb.field_Bb < 0) {
                break L7;
              } else {
                if (var7_ref_mb.field_Bb < var3) {
                  int incrementValue$1 = var5;
                  var5++;
                  var4[incrementValue$1] = var7_ref_mb;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            var9[var7_ref_mb.field_jc] = var9[var7_ref_mb.field_jc] + (var7_ref_mb.field_vb - var7_ref_mb.field_Ab);
            var7_ref_mb = (mb) (Object) var6.d(2);
            continue L2;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var4_ref = null;
        int var5 = 0;
        Object var5_ref = null;
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        String[] var8_ref_String__ = null;
        int[][] var9 = null;
        String[] var9_array = null;
        String var9_ref = null;
        int var10_int = 0;
        jc var10 = null;
        String var10_ref = null;
        mb var11_ref_mb = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        int var16 = 0;
        String[] var17 = null;
        int[][] var18 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        Object stackIn_28_2 = null;
        Object stackIn_28_3 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_29_2 = null;
        Object stackIn_29_3 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_30_2 = null;
        Object stackIn_30_3 = null;
        int stackIn_30_4 = 0;
        String stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        String[] stackIn_48_2 = null;
        String[] stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        String stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String[] stackIn_49_2 = null;
        String[] stackIn_49_3 = null;
        int stackIn_49_4 = 0;
        String stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String[] stackIn_50_2 = null;
        String[] stackIn_50_3 = null;
        int stackIn_50_4 = 0;
        String stackIn_50_5 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_27_2 = null;
        Object stackOut_27_3 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_29_2 = null;
        Object stackOut_29_3 = null;
        int stackOut_29_4 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_28_2 = null;
        Object stackOut_28_3 = null;
        int stackOut_28_4 = 0;
        String stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        String[] stackOut_47_2 = null;
        String[] stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        String stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        String[] stackOut_49_2 = null;
        String[] stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        String stackOut_49_5 = null;
        String stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String[] stackOut_48_2 = null;
        String[] stackOut_48_3 = null;
        int stackOut_48_4 = 0;
        String stackOut_48_5 = null;
        var16 = SteelSentinels.field_G;
        if (((nb) this).field_X.field_j) {
          return;
        } else {
          L0: {
            dl.field_M = qh.field_Yb;
            if (param0 == -5669) {
              break L0;
            } else {
              this.d(-18);
              break L0;
            }
          }
          L1: {
            var2 = ge.field_j * 10 + ol.field_Ub;
            var3 = 0;
            if (var3 == 0) {
              break L1;
            } else {
              if (((nb) this).field_X.field_j) {
                break L1;
              } else {
                L2: {
                  L3: {
                    var4_ref = null;
                    var5_ref = null;
                    if (ol.field_Ub >= dl.field_N.length) {
                      break L3;
                    } else {
                      if (dl.field_M < dl.field_N[ol.field_Ub].length) {
                        var4_ref = (Object) (Object) dl.field_N[ol.field_Ub][dl.field_M];
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (ol.field_Ub >= dl.field_N.length) {
                    break L2;
                  } else {
                    if (dl.field_N[ol.field_Ub].length != 1) {
                      break L2;
                    } else {
                      var4_ref = (Object) (Object) dl.field_N[ol.field_Ub][0];
                      break L2;
                    }
                  }
                }
                L4: {
                  var6 = null;
                  var7 = 0;
                  var8_ref_String__ = dj.field_g[var2];
                  if (!dm.field_c) {
                    break L4;
                  } else {
                    var8_ref_String__ = null;
                    break L4;
                  }
                }
                L5: {
                  var17 = dl.field_H[var2];
                  var9_array = var17;
                  if (var8_ref_String__ == null) {
                    break L5;
                  } else {
                    var5_ref = (Object) (Object) var8_ref_String__[var7];
                    break L5;
                  }
                }
                L6: {
                  if (var5_ref == null) {
                    var5_ref = (Object) (Object) var17[var7];
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (0 != qh.field_Yb) {
                    break L7;
                  } else {
                    L8: {
                      if (var8_ref_String__ != null) {
                        var6 = (Object) (Object) var8_ref_String__[var7 - -1];
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (var6 != null) {
                      break L7;
                    } else {
                      var6 = (Object) (Object) var17[var7 + 1];
                      break L7;
                    }
                  }
                }
                L9: {
                  stackOut_27_0 = this;
                  stackOut_27_1 = 0;
                  stackOut_27_2 = var4_ref;
                  stackOut_27_3 = var5_ref;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  stackIn_29_3 = stackOut_27_3;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  stackIn_28_3 = stackOut_27_3;
                  if (0 != qh.field_Yb) {
                    stackOut_29_0 = this;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = stackIn_29_2;
                    stackOut_29_3 = stackIn_29_3;
                    stackOut_29_4 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    stackIn_30_3 = stackOut_29_3;
                    stackIn_30_4 = stackOut_29_4;
                    break L9;
                  } else {
                    stackOut_28_0 = this;
                    stackOut_28_1 = stackIn_28_1;
                    stackOut_28_2 = stackIn_28_2;
                    stackOut_28_3 = stackIn_28_3;
                    stackOut_28_4 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_30_2 = stackOut_28_2;
                    stackIn_30_3 = stackOut_28_3;
                    stackIn_30_4 = stackOut_28_4;
                    break L9;
                  }
                }
                this.a(stackIn_30_1, (String) (Object) stackIn_30_2, (String) (Object) stackIn_30_3, stackIn_30_4 != 0, false, (String) var6);
                break L1;
              }
            }
          }
          L10: {
            if (var3 != 0) {
              break L10;
            } else {
              var4 = ((nb) this).field_M[1];
              var5 = 16777215;
              var6 = (Object) (Object) fk.field_d;
              pb.c(0, 0, 192, 47, 0, 192);
              pb.h(0, 0, 192, 47, var4, 192);
              pb.a(2, 2, 188, 14, 2565927);
              var7 = 0;
              var8 = 0;
              var18 = ua.field_I[ge.field_j * 10 + ol.field_Ub];
              var9 = var18;
              var10_int = 0;
              L11: while (true) {
                if (var18.length <= var10_int) {
                  var10 = new jc(((nb) this).field_X.field_K);
                  var11_ref_mb = (mb) (Object) var10.b(2);
                  L12: while (true) {
                    if (var11_ref_mb == null) {
                      L13: {
                        var7 = var7 * 100 / var8;
                        var8 = 13;
                        var9_ref = db.a(dc.field_f, -77, new String[1]);
                        var10_ref = db.a(ne.field_J, -112, new String[1]);
                        var11 = ((nb) this).field_X.field_r / 50;
                        if (b.field_f) {
                          var11 += 600;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        var12 = hc.field_V + var11;
                        var13 = db.a(il.field_g, -44, new String[1]);
                        stackOut_47_0 = sn.field_k;
                        stackOut_47_1 = -13;
                        stackOut_47_2 = new String[1];
                        stackOut_47_3 = new String[1];
                        stackOut_47_4 = 0;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        stackIn_49_2 = stackOut_47_2;
                        stackIn_49_3 = stackOut_47_3;
                        stackIn_49_4 = stackOut_47_4;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        stackIn_48_2 = stackOut_47_2;
                        stackIn_48_3 = stackOut_47_3;
                        stackIn_48_4 = stackOut_47_4;
                        if (((nb) this).field_X.field_M == -1) {
                          stackOut_49_0 = (String) (Object) stackIn_49_0;
                          stackOut_49_1 = stackIn_49_1;
                          stackOut_49_2 = (String[]) (Object) stackIn_49_2;
                          stackOut_49_3 = (String[]) (Object) stackIn_49_3;
                          stackOut_49_4 = stackIn_49_4;
                          stackOut_49_5 = ul.field_b;
                          stackIn_50_0 = stackOut_49_0;
                          stackIn_50_1 = stackOut_49_1;
                          stackIn_50_2 = stackOut_49_2;
                          stackIn_50_3 = stackOut_49_3;
                          stackIn_50_4 = stackOut_49_4;
                          stackIn_50_5 = stackOut_49_5;
                          break L14;
                        } else {
                          stackOut_48_0 = (String) (Object) stackIn_48_0;
                          stackOut_48_1 = stackIn_48_1;
                          stackOut_48_2 = (String[]) (Object) stackIn_48_2;
                          stackOut_48_3 = (String[]) (Object) stackIn_48_3;
                          stackOut_48_4 = stackIn_48_4;
                          stackOut_48_5 = Integer.toString(((nb) this).field_X.field_M);
                          stackIn_50_0 = stackOut_48_0;
                          stackIn_50_1 = stackOut_48_1;
                          stackIn_50_2 = stackOut_48_2;
                          stackIn_50_3 = stackOut_48_3;
                          stackIn_50_4 = stackOut_48_4;
                          stackIn_50_5 = stackOut_48_5;
                          break L14;
                        }
                      }
                      L15: {
                        stackIn_50_3[stackIn_50_4] = stackIn_50_5;
                        var14 = db.a(stackIn_50_0, stackIn_50_1, stackIn_50_2);
                        var15 = db.a(ub.field_k, -82, new String[1]);
                        ((mi) var6).b(cc.field_ic[ge.field_j], 6, var8, var5, 0);
                        ((mi) var6).b(var9_ref, 99, var8, 1021128, 0);
                        var8 += 17;
                        var5 = 1021128;
                        ((mi) var6).b(var10_ref, 6, var8, var5, 0);
                        ((mi) var6).b(var13, 99, var8, var5, 0);
                        var8 += 11;
                        ((mi) var6).b(var14, 6, var8, var5, 0);
                        if (ge.field_j <= 0) {
                          break L15;
                        } else {
                          ((mi) var6).b(var15, 99, var8, var5, 0);
                          break L15;
                        }
                      }
                      if (0 != qh.field_Yb) {
                        break L10;
                      } else {
                        qh.field_Yb = 1;
                        dl.field_M = 1;
                        break L10;
                      }
                    } else {
                      L16: {
                        if (0 == var11_ref_mb.field_Nb) {
                          break L16;
                        } else {
                          if (nn.field_c[0] != var11_ref_mb.field_Zb.field_N) {
                            var7 -= 9;
                            break L16;
                          } else {
                            var7--;
                            break L16;
                          }
                        }
                      }
                      var11_ref_mb = (mb) (Object) var10.d(2);
                      continue L12;
                    }
                  }
                } else {
                  var8 = var8 + var18[var10_int].length * 9;
                  if (var10_int <= ((nb) this).field_X.field_cb) {
                    var7 = var7 + 9 * var18[var10_int].length;
                    var10_int++;
                    continue L11;
                  } else {
                    var10_int++;
                    continue L11;
                  }
                }
              }
            }
          }
          return;
        }
    }

    final static cm a(boolean param0, int param1, int param2) {
        if (param2 != 256) {
            nb.b((byte) 125);
        }
        return rf.a(true, 1, (byte) -118, false, false, param1);
    }

    final int d(boolean param0, int param1) {
        param1 = param1 >> 4;
        param1 = param1 - ((nb) this).field_P;
        param1 = param1 >> 4;
        if (!param0) {
            boolean discarded$0 = this.e(-60);
        }
        return param1;
    }

    private final void a(int param0, String param1, String param2, boolean param3, boolean param4, String param5) {
        RuntimeException var7 = null;
        fh var7_ref = null;
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
        String[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        wk var21_ref_wk = null;
        int var22_int = 0;
        wk var22 = null;
        int var23 = 0;
        int var24_int = 0;
        double var24 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        fh var30 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var29 = SteelSentinels.field_G;
        try {
          L0: {
            if (!((nb) this).field_X.field_j) {
              L1: {
                param4 = false;
                var30 = ff.field_lb;
                var7_ref = var30;
                var8 = 10;
                var9 = 636;
                if (ge.field_j != 0) {
                  break L1;
                } else {
                  if (ol.field_Ub != 0) {
                    break L1;
                  } else {
                    if (dl.field_M == 5) {
                      var9 = 400;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var10 = 4;
                var11 = 96;
                var12 = var10 * 2;
                var13 = var10 * 2;
                int discarded$2 = 50;
                qb.a();
                var8 = var12 - (-var11 + -8);
                var14 = 0;
                var15 = ff.field_lb.field_U + 3;
                var16 = 14;
                var17 = -10 + -var8 + var9;
                var18 = new String[16];
                var19 = 0;
                if (param5 != null) {
                  var14 = ff.field_lb.a(param5, var17, var15);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var13 -= 2;
                var20 = 2;
                if (param1 == null) {
                  break L3;
                } else {
                  var20 += 25;
                  break L3;
                }
              }
              L4: {
                var20 = var20 + var14;
                if (param2 == null) {
                  break L4;
                } else {
                  var19 = ((mi) (Object) var30).a(param2, new int[1], var18);
                  var20 = var20 + var16 * var19;
                  break L4;
                }
              }
              L5: {
                ta.a(var9 + -var8, 0, param0, 255, 0, 128, var8, var13, var20);
                pb.c(var8, var13 - -var20, -var8 + var9, param0, 64);
                var13 = 20;
                if (param1 == null) {
                  break L5;
                } else {
                  pl.field_U.b(param1, var8 + 5, var13, 16777215, 0);
                  break L5;
                }
              }
              L6: {
                var13 += 5;
                if (param5 == null) {
                  break L6;
                } else {
                  L7: {
                    var21 = 1021128;
                    if (!this.e(-100)) {
                      break L7;
                    } else {
                      if (~(5 + var8) < ~oh.field_f) {
                        break L7;
                      } else {
                        if (~oh.field_f <= ~(ff.field_lb.a(param5, var17) + (5 + var8))) {
                          break L7;
                        } else {
                          if (~pi.field_c > ~var13) {
                            break L7;
                          } else {
                            if (~pi.field_c <= ~(var13 + ff.field_lb.a(param5, var17, var15))) {
                              break L7;
                            } else {
                              var21 = 1044724;
                              ((nb) this).field_r = 42;
                              break L7;
                            }
                          }
                        }
                      }
                    }
                  }
                  int discarded$3 = ff.field_lb.a(param5, 5 + var8, var13, var17, 100, var21, -1, 0, 0, var15);
                  var13 = var13 + var14;
                  break L6;
                }
              }
              L8: {
                if (param2 != null) {
                  L9: {
                    var21 = 14;
                    var12 = 5 + var8;
                    var22_int = 16777215;
                    if (sh.field_d >= 0) {
                      var23 = sh.field_d;
                      var24_int = 0;
                      var25 = 0;
                      var26 = 0;
                      L10: while (true) {
                        L11: {
                          if (var23 <= var25) {
                            break L11;
                          } else {
                            L12: {
                              if (null == var18[var24_int]) {
                                break L12;
                              } else {
                                if (~var26 > ~var18[var24_int].length()) {
                                  if (60 != var18[var24_int].charAt(var26)) {
                                    var25++;
                                    var26++;
                                    continue L10;
                                  } else {
                                    var27 = var18[var24_int].indexOf('>', 1 + var26);
                                    if (var27 < 0) {
                                      break L11;
                                    } else {
                                      var26 = var27 + 1;
                                      continue L10;
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var26 = 0;
                            var24_int++;
                            if (var24_int >= var19) {
                              break L11;
                            } else {
                              continue L10;
                            }
                          }
                        }
                        if (~var19 < ~var24_int) {
                          var18[var24_int] = var18[var24_int].substring(0, var26);
                          var19 = var24_int + 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      break L9;
                    }
                  }
                  var13 = var13 + (var21 + var10);
                  var23 = 0;
                  L13: while (true) {
                    if (var23 >= var19) {
                      break L8;
                    } else {
                      ((mi) (Object) var30).b(var18[var23], var12, var13, var22_int, 5263440);
                      var13 = var13 + var21;
                      var23++;
                      continue L13;
                    }
                  }
                } else {
                  break L8;
                }
              }
              L14: {
                var12 = 10;
                var13 = 10;
                if (param4) {
                  L15: {
                    var21_ref_wk = am.field_f[0];
                    var22 = var21_ref_wk;
                    var22 = var21_ref_wk;
                    var22_int = 1021128;
                    if (dl.field_M > 0) {
                      if (~oh.field_f > ~var12) {
                        break L15;
                      } else {
                        if (~(var21_ref_wk.field_z + var12) >= ~oh.field_f) {
                          break L15;
                        } else {
                          if (~pi.field_c > ~var13) {
                            break L15;
                          } else {
                            if (~pi.field_c <= ~(var13 - -var21_ref_wk.field_B)) {
                              break L15;
                            } else {
                              ((nb) this).field_r = 1;
                              break L15;
                            }
                          }
                        }
                      }
                    } else {
                      var22_int = 8421504;
                      break L15;
                    }
                  }
                  if (((nb) this).field_r != 1) {
                    am.field_f[0].c(var12, var13, var22_int);
                    break L14;
                  } else {
                    am.field_f[0].b(-3 + var12, -3 + var13, 6 + var21_ref_wk.field_z, 6 + var21_ref_wk.field_B, var22_int);
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              L16: {
                if (param3) {
                  L17: {
                    var12 = 618;
                    var21 = 1021128;
                    var22 = am.field_f[1];
                    var23 = 0;
                    if (di.field_g != 10) {
                      if (this.e(param0 + -100)) {
                        var23 = 1;
                        break L17;
                      } else {
                        break L17;
                      }
                    } else {
                      var23 = 1;
                      break L17;
                    }
                  }
                  L18: {
                    if (var23 == 0) {
                      var21 = 8421504;
                      break L18;
                    } else {
                      L19: {
                        if (-1 + var12 > oh.field_f) {
                          break L19;
                        } else {
                          if (~(15 + var12) >= ~oh.field_f) {
                            break L19;
                          } else {
                            if (pi.field_c < var13 - 1) {
                              break L19;
                            } else {
                              if (var13 + 15 > pi.field_c) {
                                ((nb) this).field_r = 2;
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                      var24 = (Math.sin((double)(a.field_c / 8)) + 1.0) * 0.5;
                      var26 = (var21 & 16765495) >> 16;
                      var27 = (var21 & 65425) >> 8;
                      var27 = var27 + (int)((double)(-var27 + 255) * var24);
                      var26 = var26 + (int)(var24 * (double)(255 - var26));
                      var28 = var21 & 255;
                      var28 = var28 + (int)((double)(-var28 + 255) * var24);
                      var21 = var28 | (var27 << 8 | var26 << 16);
                      break L18;
                    }
                  }
                  if (((nb) this).field_r == 2) {
                    var22.b(-2 + var12, var13 + -2, 20, 20, var21);
                    break L16;
                  } else {
                    var22.c(var12, var13, var21);
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var7;
            stackOut_78_1 = new StringBuilder().append("nb.K(").append(param0).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L20;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L20;
            }
          }
          L21: {
            stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(44);
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param2 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L21;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L21;
            }
          }
          L22: {
            stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param5 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L22;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L22;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_87_0, stackIn_87_2 + 41);
        }
    }

    private final void f(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        mb var6_ref_mb = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12_ref = null;
        mb var12_ref_mb = null;
        int var12 = 0;
        mb var13_ref_mb = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jc var16_ref_jc = null;
        int[] var16_ref_int__ = null;
        int var16 = 0;
        Object var17_ref = null;
        mb var17_ref_mb = null;
        int[] var17_ref_int__ = null;
        int var17 = 0;
        mb var18_ref_mb = null;
        int var18 = 0;
        String var18_ref_String = null;
        int var19 = 0;
        int var20 = 0;
        String var21_ref_String = null;
        int var21 = 0;
        String var22 = null;
        int var22_int = 0;
        String var23 = null;
        int var23_int = 0;
        String var24 = null;
        int var24_int = 0;
        int var25 = 0;
        wk var26 = null;
        int var27 = 0;
        int[] var28 = null;
        int stackIn_30_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int stackIn_94_4 = 0;
        int stackIn_132_0 = 0;
        int stackIn_183_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        int stackOut_182_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        var12_ref = null;
        var17_ref = null;
        var27 = SteelSentinels.field_G;
        var3 = ((nb) this).field_M[1];
        var4 = ((nb) this).field_M[0];
        var5 = 0;
        var6_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
        L0: while (true) {
          if (var6_ref_mb == null) {
            L1: {
              if (!((nb) this).field_X.field_lb) {
                break L1;
              } else {
                var5 += 4;
                break L1;
              }
            }
            L2: {
              var6 = 1;
              if (((nb) this).field_X.field_P != 1) {
                if (((nb) this).field_X.field_P != 2) {
                  break L2;
                } else {
                  var6 = 3;
                  break L2;
                }
              } else {
                var6 = 2;
                break L2;
              }
            }
            L3: {
              if (var6 == var5) {
                var6 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var7 = 3 * var6 + 9 + (7 * var5 + (-1 + var5) * 2);
              if (!uj.field_f) {
                break L4;
              } else {
                if (var5 > 4) {
                  break L4;
                } else {
                  if (var6 >= 2) {
                    break L4;
                  } else {
                    uj.field_f = false;
                    break L4;
                  }
                }
              }
            }
            L5: {
              L6: {
                var8 = 138;
                if (!uj.field_f) {
                  break L6;
                } else {
                  if (((nb) this).field_X.field_lb) {
                    break L6;
                  } else {
                    L7: {
                      if (var5 > 4) {
                        break L7;
                      } else {
                        if (var5 <= 3) {
                          break L6;
                        } else {
                          if (var6 <= 1) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    break L5;
                  }
                }
              }
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L5;
            }
            L8: {
              var9 = stackIn_30_0;
              if (var9 == 0) {
                break L8;
              } else {
                var7 = 28;
                break L8;
              }
            }
            L9: {
              L10: {
                var10 = null;
                var11 = null;
                if (var9 == 0) {
                  break L10;
                } else {
                  if (var6 != 1) {
                    break L10;
                  } else {
                    var10 = (Object) (Object) new mb[2];
                    var12_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
                    L11: while (true) {
                      if (var12_ref_mb == null) {
                        if (((nb) this).field_C == null) {
                          break L9;
                        } else {
                          if ((Object) (Object) ((nb) this).field_C == ((Object[]) var10)[0]) {
                            break L9;
                          } else {
                            if ((Object) (Object) ((nb) this).field_C == ((Object[]) var10)[1]) {
                              break L9;
                            } else {
                              ((Object[]) var10)[1] = (Object) (Object) ((nb) this).field_C;
                              break L9;
                            }
                          }
                        }
                      } else {
                        L12: {
                          L13: {
                            L14: {
                              if (var12_ref_mb.field_Bb < 0) {
                                break L14;
                              } else {
                                if (((nb) this).field_X.field_kb > var12_ref_mb.field_Bb) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (var12_ref_mb.field_Nb == 11) {
                              break L13;
                            } else {
                              break L12;
                            }
                          }
                          L15: {
                            if (null == ((Object[]) var10)[0]) {
                              break L15;
                            } else {
                              if (var12_ref_mb.field_vb > ((mb) ((Object[]) var10)[0]).field_vb) {
                                break L15;
                              } else {
                                L16: {
                                  if (((Object[]) var10)[1] == null) {
                                    break L16;
                                  } else {
                                    if (~((mb) ((Object[]) var10)[1]).field_vb > ~var12_ref_mb.field_vb) {
                                      break L16;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                ((Object[]) var10)[1] = (Object) (Object) var12_ref_mb;
                                break L12;
                              }
                            }
                          }
                          ((Object[]) var10)[1] = ((Object[]) var10)[0];
                          ((Object[]) var10)[0] = (Object) (Object) var12_ref_mb;
                          break L12;
                        }
                        var12_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -16);
                        continue L11;
                      }
                    }
                  }
                }
              }
              if (var9 == 0) {
                break L9;
              } else {
                var28 = new int[2];
                var11 = (Object) (Object) var28;
                var12_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
                L17: while (true) {
                  if (var12_ref_mb == null) {
                    var7 += 3;
                    break L9;
                  } else {
                    L18: {
                      L19: {
                        if (var12_ref_mb.field_jc == 0) {
                          break L19;
                        } else {
                          if (1 == var12_ref_mb.field_jc) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var28[var12_ref_mb.field_jc] = var28[var12_ref_mb.field_jc] + var12_ref_mb.field_vb;
                      break L18;
                    }
                    var12_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -36);
                    continue L17;
                  }
                }
              }
            }
            L20: {
              if (!((nb) this).field_X.field_fb) {
                break L20;
              } else {
                if (var9 != 0) {
                  break L20;
                } else {
                  var12 = 0;
                  var13_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
                  L21: while (true) {
                    L22: {
                      if (var13_ref_mb == null) {
                        break L22;
                      } else {
                        L23: {
                          if (0 >= var13_ref_mb.field_kc) {
                            break L23;
                          } else {
                            L24: {
                              if (var13_ref_mb.field_Nb == 0) {
                                break L24;
                              } else {
                                if (var13_ref_mb.field_Nb != 11) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var12 = 1;
                            break L22;
                          }
                        }
                        var13_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -117);
                        continue L21;
                      }
                    }
                    if (var12 == 0) {
                      break L20;
                    } else {
                      var8 += 40;
                      break L20;
                    }
                  }
                }
              }
            }
            L25: {
              if (var6 <= 1) {
                break L25;
              } else {
                if (var9 != 0) {
                  break L25;
                } else {
                  var8 += 50;
                  break L25;
                }
              }
            }
            L26: {
              pb.c(0, 0, var8, var7, 0, 192);
              pb.h(0, 0, var8, var7, var3, 192);
              if (((nb) this).field_X.field_lb) {
                break L26;
              } else {
                L27: {
                  if (var5 > 4) {
                    break L27;
                  } else {
                    if (var5 <= 3) {
                      break L26;
                    } else {
                      if (var6 > 1) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                }
                L28: {
                  L29: {
                    var12 = 138;
                    var13 = 12;
                    var12 = var12 - var13;
                    var14 = var7;
                    var15 = 9;
                    var14 = var14 - var15 / 2;
                    pb.a(var12, var14, var13, var15, 0);
                    if (oh.field_f < var12) {
                      break L29;
                    } else {
                      if (var12 + var13 <= oh.field_f) {
                        break L29;
                      } else {
                        if (pi.field_c < var14) {
                          break L29;
                        } else {
                          if (~pi.field_c <= ~(var14 - -var15)) {
                            break L29;
                          } else {
                            stackOut_86_0 = 1;
                            stackIn_88_0 = stackOut_86_0;
                            break L28;
                          }
                        }
                      }
                    }
                  }
                  stackOut_87_0 = 0;
                  stackIn_88_0 = stackOut_87_0;
                  break L28;
                }
                L30: {
                  var16 = stackIn_88_0;
                  if (var16 != 0) {
                    ((nb) this).field_r = 41;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  stackOut_91_0 = var12;
                  stackOut_91_1 = var14;
                  stackOut_91_2 = var13;
                  stackOut_91_3 = var15;
                  stackIn_93_0 = stackOut_91_0;
                  stackIn_93_1 = stackOut_91_1;
                  stackIn_93_2 = stackOut_91_2;
                  stackIn_93_3 = stackOut_91_3;
                  stackIn_92_0 = stackOut_91_0;
                  stackIn_92_1 = stackOut_91_1;
                  stackIn_92_2 = stackOut_91_2;
                  stackIn_92_3 = stackOut_91_3;
                  if (var16 != 0) {
                    stackOut_93_0 = stackIn_93_0;
                    stackOut_93_1 = stackIn_93_1;
                    stackOut_93_2 = stackIn_93_2;
                    stackOut_93_3 = stackIn_93_3;
                    stackOut_93_4 = uj.a(var3, 120);
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    stackIn_94_2 = stackOut_93_2;
                    stackIn_94_3 = stackOut_93_3;
                    stackIn_94_4 = stackOut_93_4;
                    break L31;
                  } else {
                    stackOut_92_0 = stackIn_92_0;
                    stackOut_92_1 = stackIn_92_1;
                    stackOut_92_2 = stackIn_92_2;
                    stackOut_92_3 = stackIn_92_3;
                    stackOut_92_4 = var3;
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_94_1 = stackOut_92_1;
                    stackIn_94_2 = stackOut_92_2;
                    stackIn_94_3 = stackOut_92_3;
                    stackIn_94_4 = stackOut_92_4;
                    break L31;
                  }
                }
                pb.h(stackIn_94_0, stackIn_94_1, stackIn_94_2, stackIn_94_3, stackIn_94_4);
                var12 = var12 + var13 / 2;
                if (uj.field_f) {
                  var17 = 0;
                  L32: while (true) {
                    if (var17 >= 5) {
                      break L26;
                    } else {
                      pb.g(-var17 + var12, -var17 + (var15 + (var14 - 3)), 2 * var17, var3);
                      var17++;
                      continue L32;
                    }
                  }
                } else {
                  var17 = 0;
                  L33: while (true) {
                    if (var17 >= 5) {
                      break L26;
                    } else {
                      pb.g(-var17 + var12, var14 - (-var17 + -1), 2 * var17, var3);
                      var17++;
                      continue L33;
                    }
                  }
                }
              }
            }
            L34: {
              if (param1 == 8209) {
                break L34;
              } else {
                ((nb) this).field_s = 76;
                break L34;
              }
            }
            L35: {
              var12 = 13;
              var13 = -1;
              var14 = 0;
              var15 = 136;
              if (var10 == null) {
                if (var11 == null) {
                  var16_ref_int__ = new int[]{480, 480};
                  var17_ref_int__ = new int[]{0, 0};
                  var18_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.e(13058);
                  L36: while (true) {
                    if (var18_ref_mb == null) {
                      if (var13 != -1) {
                        var17_ref_int__[var13] = Math.max(var17_ref_int__[var13], var12 - 9);
                        pb.g(var15, var16_ref_int__[var13], 3, fj.field_h[var13]);
                        pb.g(var15, var17_ref_int__[var13], 3, fj.field_h[var13]);
                        pb.d(3 + var15, var16_ref_int__[var13], -var16_ref_int__[var13] + (var17_ref_int__[var13] - -1), fj.field_h[var13]);
                        var14 = var14 / 100;
                        var18 = (var16_ref_int__[var13] - -var17_ref_int__[var13]) / 2;
                        var19 = ff.field_lb.c(Integer.toString(var14));
                        var19 = -var19 + -6 + (var8 - 3 - var15);
                        pb.g(3 + var15, var18, -5 + var19, fj.field_h[var13]);
                        ff.field_lb.b(Integer.toString(var14), var19 + var15 - -3, var18 + 4, fj.field_h[var13], -1);
                        break L35;
                      } else {
                        break L35;
                      }
                    } else {
                      L37: {
                        var19 = var4;
                        var20 = 13421772;
                        if (0 < var18_ref_mb.field_Ab) {
                          var20 = 16777215;
                          break L37;
                        } else {
                          if (var18_ref_mb.field_Ab < 0) {
                            var20 = 16711680;
                            break L37;
                          } else {
                            if (!var18_ref_mb.field_Cb) {
                              break L37;
                            } else {
                              L38: {
                                if (3 == ((nb) this).field_X.field_ab.b(74)) {
                                  break L38;
                                } else {
                                  if (((nb) this).field_X.field_ab.b(126) == 2) {
                                    break L38;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              var20 = 16777215;
                              break L37;
                            }
                          }
                        }
                      }
                      L39: {
                        L40: {
                          if (var18_ref_mb.field_Bb < 0) {
                            break L40;
                          } else {
                            if (~((nb) this).field_X.field_kb >= ~var18_ref_mb.field_Bb) {
                              break L40;
                            } else {
                              L41: {
                                var21_ref_String = ((nb) this).field_X.field_bb[var18_ref_mb.field_Bb].toUpperCase();
                                if (((nb) this).field_B == null) {
                                  break L41;
                                } else {
                                  if (var18_ref_mb.field_Bb >= ((nb) this).field_B.length) {
                                    break L41;
                                  } else {
                                    var12 = ((nb) this).field_B[var18_ref_mb.field_Bb] + 13;
                                    break L41;
                                  }
                                }
                              }
                              L42: {
                                if (var6 <= 1) {
                                  break L42;
                                } else {
                                  var16_ref_int__[var18_ref_mb.field_jc] = Math.min(var16_ref_int__[var18_ref_mb.field_jc], var12 - 7);
                                  var17_ref_int__[var18_ref_mb.field_jc] = Math.max(var17_ref_int__[var18_ref_mb.field_jc], var12);
                                  break L42;
                                }
                              }
                              L43: {
                                if (var6 <= 1) {
                                  break L43;
                                } else {
                                  if (~var18_ref_mb.field_jc == ~var13) {
                                    break L43;
                                  } else {
                                    L44: {
                                      if (var13 == -1) {
                                        break L44;
                                      } else {
                                        L45: {
                                          var22_int = fj.field_h[var13];
                                          if (var22_int == qd.field_t[0]) {
                                            var22_int = uj.a(var22_int, 105);
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                        pb.g(var15, var16_ref_int__[var13], 3, var22_int);
                                        pb.g(var15, var17_ref_int__[var13], 3, var22_int);
                                        pb.d(3 + var15, var16_ref_int__[var13], 1 + (var17_ref_int__[var13] + -var16_ref_int__[var13]), var22_int);
                                        var14 = var14 / 100;
                                        var23_int = (var16_ref_int__[var13] + var17_ref_int__[var13]) / 2;
                                        var24_int = ff.field_lb.c(Integer.toString(var14));
                                        var24_int = -3 - var15 + (-6 + (var8 + -var24_int));
                                        pb.g(3 + var15, var23_int, -5 + var24_int, var22_int);
                                        ff.field_lb.b(Integer.toString(var14), var24_int + (3 + var15), 4 + var23_int, var22_int, -1);
                                        break L44;
                                      }
                                    }
                                    var13 = var18_ref_mb.field_jc;
                                    var14 = 0;
                                    break L43;
                                  }
                                }
                              }
                              L46: {
                                if (!((nb) this).field_d) {
                                  break L46;
                                } else {
                                  var19 = var18_ref_mb.d((byte) 88);
                                  if (~qd.field_t[0] != ~var19) {
                                    break L46;
                                  } else {
                                    var19 = uj.a(var19, 114);
                                    break L46;
                                  }
                                }
                              }
                              L47: {
                                var22 = Integer.toString(var18_ref_mb.field_vb / 100);
                                var14 = var14 + var18_ref_mb.field_vb;
                                if ((1 << var18_ref_mb.field_Bb & ((nb) this).field_X.field_hb) == 0) {
                                  stackOut_182_0 = 0;
                                  stackIn_183_0 = stackOut_182_0;
                                  break L47;
                                } else {
                                  stackOut_181_0 = 1;
                                  stackIn_183_0 = stackOut_181_0;
                                  break L47;
                                }
                              }
                              L48: {
                                var23_int = stackIn_183_0;
                                if (var23_int == 0) {
                                  break L48;
                                } else {
                                  var19 = 10526880;
                                  if (var6 > 1) {
                                    break L48;
                                  } else {
                                    var20 = 10526880;
                                    break L48;
                                  }
                                }
                              }
                              L49: {
                                if (!var18_ref_mb.field_Cb) {
                                  break L49;
                                } else {
                                  if (((nb) this).field_X.field_ab.b(param1 ^ 8259) == 2) {
                                    var19 = 16776960;
                                    break L49;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              L50: {
                                fk.field_d.b(var21_ref_String, 6, var12, var19, -1);
                                fk.field_d.c(var22, 132, var12, var20, -1);
                                if (!((nb) this).field_X.field_fb) {
                                  break L50;
                                } else {
                                  if (var18_ref_mb.field_kc <= 0) {
                                    break L50;
                                  } else {
                                    var24 = "<times>" + var18_ref_mb.field_kc;
                                    var25 = fk.field_d.c(var24);
                                    var26 = pd.field_Z[31];
                                    var26.b(-1 + (-(var26.field_z / 2) + (-var25 + 172)), var12 - 8);
                                    fk.field_d.b("<times>" + var18_ref_mb.field_kc, -var25 + 172, var12, 13421772, -1);
                                    break L50;
                                  }
                                }
                              }
                              L51: {
                                if (var23_int != 0) {
                                  if (1 >= var6) {
                                    pb.g(6, var12 - fk.field_d.field_U / 2 - 1, 126, 10526880);
                                    break L51;
                                  } else {
                                    pb.g(6, -(fk.field_d.field_U / 2) + var12 + -1, fk.field_d.c(var21_ref_String), 10526880);
                                    break L51;
                                  }
                                } else {
                                  break L51;
                                }
                              }
                              var12 += 9;
                              break L39;
                            }
                          }
                        }
                        if (var18_ref_mb.field_Nb != 11) {
                          break L39;
                        } else {
                          L52: {
                            var21 = var18_ref_mb.field_Bb;
                            if (((nb) this).field_X.field_A != var21) {
                              break L52;
                            } else {
                              if (null == ((nb) this).field_B) {
                                break L52;
                              } else {
                                var21 = ((nb) this).field_B.length + -1;
                                break L52;
                              }
                            }
                          }
                          L53: {
                            if (null == ((nb) this).field_B) {
                              break L53;
                            } else {
                              if (((nb) this).field_B.length > var21) {
                                var12 = 13 + ((nb) this).field_B[var21];
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                          }
                          L54: {
                            var19 = var18_ref_mb.d((byte) -98);
                            var22 = ((nb) this).field_X.d(-1661904765, var18_ref_mb.field_Bb);
                            var23 = Integer.toString(var18_ref_mb.field_vb / 100);
                            fk.field_d.b(var22, 6, var12, var19, -1);
                            fk.field_d.c(var23, 132, var12, var20, -1);
                            if (!((nb) this).field_X.field_fb) {
                              break L54;
                            } else {
                              if (var18_ref_mb.field_kc <= 0) {
                                break L54;
                              } else {
                                var24 = "<times>" + var18_ref_mb.field_kc;
                                var25 = fk.field_d.c(var24);
                                var26 = pd.field_Z[31];
                                var26.b(-1 + -var25 + (172 - var26.field_z / 2), var12 - 8);
                                fk.field_d.b("<times>" + var18_ref_mb.field_kc, 172 - var25, var12, 13421772, -1);
                                break L54;
                              }
                            }
                          }
                          var12 += 9;
                          break L39;
                        }
                      }
                      var18_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -97);
                      continue L36;
                    }
                  }
                } else {
                  if (null == ((nb) this).field_B) {
                    break L35;
                  } else {
                    var16 = 0;
                    L55: while (true) {
                      if (var16 >= 2) {
                        break L35;
                      } else {
                        L56: {
                          var17 = var16;
                          var18_ref_String = mm.field_d[var17].toUpperCase();
                          var19 = fj.field_h[var17];
                          var20 = 13421772;
                          if (var19 != fj.field_h[0]) {
                            break L56;
                          } else {
                            var19 = uj.a(var19, 119);
                            break L56;
                          }
                        }
                        var21_ref_String = Integer.toString(((int[]) var11)[var17] / 100);
                        var12 = ((nb) this).field_B[var16] - -12;
                        fk.field_d.b(var18_ref_String, 6, var12, var19, -1);
                        fk.field_d.c(var21_ref_String, 132, var12, var20, -1);
                        var16++;
                        continue L55;
                      }
                    }
                  }
                }
              } else {
                var16_ref_jc = new jc(((nb) this).field_X.field_K);
                pb.a(0, 0, var8, -1 + var7);
                var17_ref_mb = (mb) (Object) var16_ref_jc.b(param1 + -8207);
                L57: while (true) {
                  if (var17_ref_mb == null) {
                    pb.c();
                    break L35;
                  } else {
                    L58: {
                      var18 = var17_ref_mb.field_Bb;
                      if (var18 != ((nb) this).field_X.field_A) {
                        break L58;
                      } else {
                        if (null != ((nb) this).field_B) {
                          var18 = -1 + ((nb) this).field_B.length;
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                    }
                    L59: {
                      if (((nb) this).field_B == null) {
                        break L59;
                      } else {
                        if (var18 < 0) {
                          break L59;
                        } else {
                          if (~var18 > ~((nb) this).field_B.length) {
                            var12 = ((nb) this).field_B[var18];
                            var12 += 12;
                            if (var12 >= var7) {
                              break L59;
                            } else {
                              L60: {
                                var19 = var4;
                                var20 = 13421772;
                                if (var17_ref_mb.field_Ab > 0) {
                                  var20 = 16777215;
                                  break L60;
                                } else {
                                  if (var17_ref_mb.field_Ab >= 0) {
                                    if (!var17_ref_mb.field_Cb) {
                                      break L60;
                                    } else {
                                      L61: {
                                        if (((nb) this).field_X.field_ab.b(84) == 3) {
                                          break L61;
                                        } else {
                                          if (((nb) this).field_X.field_ab.b(param1 + -8131) == 2) {
                                            break L61;
                                          } else {
                                            break L60;
                                          }
                                        }
                                      }
                                      var20 = 16777215;
                                      break L60;
                                    }
                                  } else {
                                    var20 = 16711680;
                                    break L60;
                                  }
                                }
                              }
                              if (~((nb) this).field_X.field_kb >= ~var17_ref_mb.field_Bb) {
                                if (var17_ref_mb.field_Nb != 11) {
                                  break L59;
                                } else {
                                  var21_ref_String = ((nb) this).field_X.d(-1661904765, var17_ref_mb.field_Bb);
                                  var19 = var17_ref_mb.d((byte) -124);
                                  var22 = Integer.toString(var17_ref_mb.field_vb / 100);
                                  fk.field_d.b(var21_ref_String, 6, var12, var19, -1);
                                  fk.field_d.c(var22, 132, var12, 13421772, -1);
                                  var12 += 9;
                                  break L59;
                                }
                              } else {
                                L62: {
                                  var21_ref_String = ((nb) this).field_X.field_bb[var17_ref_mb.field_Bb].toUpperCase();
                                  if (!((nb) this).field_d) {
                                    break L62;
                                  } else {
                                    var19 = var17_ref_mb.d((byte) -117);
                                    if (~qd.field_t[0] == ~var19) {
                                      var19 = uj.a(var19, 91);
                                      break L62;
                                    } else {
                                      break L62;
                                    }
                                  }
                                }
                                L63: {
                                  var22 = Integer.toString(var17_ref_mb.field_vb / 100);
                                  if (0 == (((nb) this).field_X.field_hb & 1 << var17_ref_mb.field_Bb)) {
                                    stackOut_131_0 = 0;
                                    stackIn_132_0 = stackOut_131_0;
                                    break L63;
                                  } else {
                                    stackOut_130_0 = 1;
                                    stackIn_132_0 = stackOut_130_0;
                                    break L63;
                                  }
                                }
                                L64: {
                                  var23_int = stackIn_132_0;
                                  if (var23_int == 0) {
                                    var14 = var14 + var17_ref_mb.field_vb;
                                    break L64;
                                  } else {
                                    var19 = 10526880;
                                    var20 = 10526880;
                                    break L64;
                                  }
                                }
                                L65: {
                                  if (!var17_ref_mb.field_Cb) {
                                    break L65;
                                  } else {
                                    if (((nb) this).field_X.field_ab.b(param1 ^ 8298) != 2) {
                                      break L65;
                                    } else {
                                      var19 = 16776960;
                                      break L65;
                                    }
                                  }
                                }
                                fk.field_d.b(var21_ref_String, 6, var12, var19, -1);
                                fk.field_d.c(var22, 132, var12, var20, -1);
                                if (var23_int == 0) {
                                  break L59;
                                } else {
                                  pb.g(6, -1 + var12 + -(fk.field_d.field_U / 2), 126, 10526880);
                                  break L59;
                                }
                              }
                            }
                          } else {
                            var17_ref_mb = (mb) (Object) var16_ref_jc.d(2);
                            continue L57;
                          }
                        }
                      }
                    }
                    var17_ref_mb = (mb) (Object) var16_ref_jc.d(2);
                    continue L57;
                  }
                }
              }
            }
            L66: {
              if (((nb) this).field_X.field_lb) {
                var12 = 13 + ((nb) this).field_B.length * 9;
                var12 += 9;
                fk.field_d.b(ci.field_f, 6, var12, var4, -1);
                fk.field_d.c(Integer.toString(((nb) this).field_X.field_cb), 132, var12, 13421772, -1);
                var12 += 9;
                fk.field_d.b(mc.field_e, 6, var12, var4, -1);
                fk.field_d.c(Integer.toString(((nb) this).field_X.field_M), 132, var12, 13421772, -1);
                var12 += 4;
                var16 = 6;
                var17 = 126;
                if (((nb) this).field_X.field_d > 0) {
                  var18 = Math.min(var17 - 2, ((nb) this).field_X.field_gb * (var17 - 2) / ((nb) this).field_X.field_d);
                  pb.h(var16, var12, var17, 7, var4);
                  pb.a(1 + var16, 1 + var12, var18, 5, ((nb) this).field_M[2]);
                  break L66;
                } else {
                  break L66;
                }
              } else {
                break L66;
              }
            }
            return;
          } else {
            L67: {
              L68: {
                if (var6_ref_mb.field_Bb < 0) {
                  break L68;
                } else {
                  if (var6_ref_mb.field_Bb < ((nb) this).field_X.field_kb) {
                    var5++;
                    break L67;
                  } else {
                    break L68;
                  }
                }
              }
              if (var6_ref_mb.field_Nb != 11) {
                break L67;
              } else {
                var5++;
                break L67;
              }
            }
            var6_ref_mb = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -124);
            continue L0;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        L0: {
          var9 = SteelSentinels.field_G;
          ((nb) this).field_Y = 0;
          fn.field_a = false;
          ((nb) this).field_v = 0;
          ue.field_b = false;
          ((nb) this).field_C.field_U = 0;
          var10 = n.field_z;
          var3 = var10;
          if (((nb) this).field_o == null) {
            ((nb) this).field_o = new int[var10.length];
            ((nb) this).field_g = new int[var10.length];
            break L0;
          } else {
            break L0;
          }
        }
        var4 = 7;
        var5 = 41;
        var6 = 0;
        var7 = 0;
        var8 = 0;
        L1: while (true) {
          if (var8 >= var10.length) {
            ((nb) this).field_s = 0;
            var7 = (var7 + 1) / 2;
            var11 = 0;
            var8 = var11;
            L2: while (true) {
              if (var3.length <= var11) {
                ((nb) this).field_C.field_Gb = -50000;
                ((nb) this).field_C.field_hc = 138000;
                ((nb) this).field_C.field_Qb = 256;
                ((nb) this).field_C.field_ab = 1000;
                ((nb) this).field_E = 327;
                ((nb) this).field_P = 6000;
                ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                ((nb) this).field_s = ((nb) this).field_s + 40;
                return;
              } else {
                if (t.a(rn.field_D, var3[var11], -20370)) {
                  L3: {
                    ((nb) this).field_o[var11] = var4;
                    ((nb) this).field_g[var11] = var5;
                    var6++;
                    var5 += 32;
                    if (((nb) this).field_s < ((nb) this).field_g[var11]) {
                      ((nb) this).field_s = ((nb) this).field_g[var11];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (var7 == var6) {
                    var4 += 82;
                    var5 = 41;
                    var11++;
                    continue L2;
                  } else {
                    var11++;
                    continue L2;
                  }
                } else {
                  ((nb) this).field_o[var11] = -1;
                  var11++;
                  continue L2;
                }
              }
            }
          } else {
            if (t.a(rn.field_D, var10[var8], -20370)) {
              var7++;
              var8++;
              continue L1;
            } else {
              var8++;
              continue L1;
            }
          }
        }
    }

    private final void c(byte param0) {
        String[] var2 = null;
        String[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6_ref = null;
        int var6 = 0;
        Object var7_ref = null;
        int var7 = 0;
        Object var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        String var10_ref = null;
        String[] var11 = null;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        String stackIn_35_3 = null;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        String stackIn_42_3 = null;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        String stackIn_47_3 = null;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        String stackOut_34_3 = null;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        String stackOut_33_3 = null;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        String stackOut_41_3 = null;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        String stackOut_40_3 = null;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        String stackOut_46_3 = null;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        String stackOut_45_3 = null;
        if (!((nb) this).field_X.field_j) {
          L0: {
            var11 = dl.field_H[di.field_g];
            var2 = var11;
            var3 = dj.field_g[di.field_g];
            if (dm.field_c) {
              var3 = null;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = 126 % ((-10 - param0) / 38);
            var4 = 2 * dl.field_M;
            if (0 > var4) {
              break L1;
            } else {
              if (var4 < var11.length) {
                L2: {
                  var6_ref = null;
                  var7_ref = null;
                  var8_ref = null;
                  if (dl.field_N.length <= ol.field_Ub) {
                    break L2;
                  } else {
                    if (dl.field_N[ol.field_Ub].length > dl.field_M) {
                      var6_ref = (Object) (Object) dl.field_N[ol.field_Ub][dl.field_M];
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var3 != null) {
                    var7_ref = (Object) (Object) var3[var4];
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (qh.field_Yb <= dl.field_M) {
                    L5: {
                      if (var3 != null) {
                        var8_ref = (Object) (Object) var3[var4 + 1];
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var8_ref == null) {
                      var8_ref = (Object) (Object) var11[var4 + 1];
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    var8_ref = (Object) (Object) ue.field_d;
                    break L4;
                  }
                }
                L6: {
                  if (var7_ref == null) {
                    var7_ref = (Object) (Object) var11[var4];
                    var10 = var7_ref;
                    var10 = var7_ref;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.a(0, (String) var6_ref, (String) var7_ref, true, true, (String) var8_ref);
                break L1;
              } else {
                break L1;
              }
            }
          }
          L7: {
            if (ge.field_j != 0) {
              break L7;
            } else {
              L8: {
                if (ol.field_Ub != 0) {
                  break L8;
                } else {
                  if (pm.field_T != -1) {
                    break L8;
                  } else {
                    if (vb.field_g != -1) {
                      break L8;
                    } else {
                      if (5 != dl.field_M) {
                        break L8;
                      } else {
                        L9: {
                          var6 = 404;
                          var7 = 30;
                          var8 = 30;
                          var9 = 230;
                          var10 = null;
                          stackOut_32_0 = var7;
                          stackOut_32_1 = var6;
                          stackOut_32_2 = 127;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          stackIn_34_2 = stackOut_32_2;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          stackIn_33_2 = stackOut_32_2;
                          if (!dm.field_c) {
                            stackOut_34_0 = stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = stackIn_34_2;
                            stackOut_34_3 = od.field_j;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            stackIn_35_2 = stackOut_34_2;
                            stackIn_35_3 = stackOut_34_3;
                            break L9;
                          } else {
                            stackOut_33_0 = stackIn_33_0;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = stackIn_33_2;
                            stackOut_33_3 = qm.field_c;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            stackIn_35_2 = stackOut_33_2;
                            stackIn_35_3 = stackOut_33_3;
                            break L9;
                          }
                        }
                        L10: {
                          if (!nm.a(stackIn_35_0, stackIn_35_1, stackIn_35_2, stackIn_35_3, var8, var9)) {
                            break L10;
                          } else {
                            ((nb) this).field_r = 36;
                            break L10;
                          }
                        }
                        L11: {
                          if (dm.field_c) {
                            L12: {
                              var7 += 35;
                              stackOut_39_0 = var7;
                              stackOut_39_1 = var6;
                              stackOut_39_2 = 127;
                              stackIn_41_0 = stackOut_39_0;
                              stackIn_41_1 = stackOut_39_1;
                              stackIn_41_2 = stackOut_39_2;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              stackIn_40_2 = stackOut_39_2;
                              if (ui.field_G) {
                                stackOut_41_0 = stackIn_41_0;
                                stackOut_41_1 = stackIn_41_1;
                                stackOut_41_2 = stackIn_41_2;
                                stackOut_41_3 = tm.field_f;
                                stackIn_42_0 = stackOut_41_0;
                                stackIn_42_1 = stackOut_41_1;
                                stackIn_42_2 = stackOut_41_2;
                                stackIn_42_3 = stackOut_41_3;
                                break L12;
                              } else {
                                stackOut_40_0 = stackIn_40_0;
                                stackOut_40_1 = stackIn_40_1;
                                stackOut_40_2 = stackIn_40_2;
                                stackOut_40_3 = fj.field_i;
                                stackIn_42_0 = stackOut_40_0;
                                stackIn_42_1 = stackOut_40_1;
                                stackIn_42_2 = stackOut_40_2;
                                stackIn_42_3 = stackOut_40_3;
                                break L12;
                              }
                            }
                            L13: {
                              if (!nm.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, var8, var9)) {
                                break L13;
                              } else {
                                ((nb) this).field_r = 37;
                                break L13;
                              }
                            }
                            L14: {
                              var7 += 35;
                              stackOut_44_0 = var7;
                              stackOut_44_1 = var6;
                              stackOut_44_2 = 121;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              stackIn_46_2 = stackOut_44_2;
                              stackIn_45_0 = stackOut_44_0;
                              stackIn_45_1 = stackOut_44_1;
                              stackIn_45_2 = stackOut_44_2;
                              if (!ik.field_h) {
                                stackOut_46_0 = stackIn_46_0;
                                stackOut_46_1 = stackIn_46_1;
                                stackOut_46_2 = stackIn_46_2;
                                stackOut_46_3 = sa.field_b;
                                stackIn_47_0 = stackOut_46_0;
                                stackIn_47_1 = stackOut_46_1;
                                stackIn_47_2 = stackOut_46_2;
                                stackIn_47_3 = stackOut_46_3;
                                break L14;
                              } else {
                                stackOut_45_0 = stackIn_45_0;
                                stackOut_45_1 = stackIn_45_1;
                                stackOut_45_2 = stackIn_45_2;
                                stackOut_45_3 = o.field_a;
                                stackIn_47_0 = stackOut_45_0;
                                stackIn_47_1 = stackOut_45_1;
                                stackIn_47_2 = stackOut_45_2;
                                stackIn_47_3 = stackOut_45_3;
                                break L14;
                              }
                            }
                            L15: {
                              if (nm.a(stackIn_47_0, stackIn_47_1, stackIn_47_2, stackIn_47_3, var8, var9)) {
                                ((nb) this).field_r = 38;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            var10_ref = hb.field_g[0];
                            var7 += 35;
                            break L11;
                          } else {
                            var7 += 105;
                            var10_ref = hb.field_g[1];
                            break L11;
                          }
                        }
                        var9 -= 5;
                        var6 += 3;
                        var7 += 3;
                        var8 = ff.field_lb.a(var10_ref, var9, 18);
                        pb.c(-3 + var6, -3 + var7, var9 + 5, var8 - -5, 0, 128);
                        int discarded$1 = ff.field_lb.a(var10_ref, var6, var7, var9, 100, 1021128, -1, 0, 0, 18);
                        break L8;
                      }
                    }
                  }
                }
              }
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = SteelSentinels.field_G;
          int discarded$2 = 0;
          this.c();
          if (param0 >= 18) {
            break L0;
          } else {
            ((nb) this).field_J = true;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              ea.field_k = false;
              lc.field_e = true;
              if (ge.field_j != 0) {
                break L3;
              } else {
                if (3 <= fm.field_f[0]) {
                  break L3;
                } else {
                  if (nc.field_a >= 0) {
                    break L2;
                  } else {
                    if (lh.field_D) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            L4: {
              if (!lh.field_D) {
                break L4;
              } else {
                if (ni.b(34)) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (nc.field_a < 0) {
                break L5;
              } else {
                if (!ni.b(11)) {
                  L6: {
                    L7: {
                      var2 = vb.field_g;
                      if (var2 == 5) {
                        break L7;
                      } else {
                        if (var2 == 6) {
                          break L7;
                        } else {
                          if (var2 == 8) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    var2 = gh.field_Jb;
                    break L6;
                  }
                  q.a(19, false, -1, var2);
                  break L1;
                } else {
                  break L5;
                }
              }
            }
            L8: {
              L9: {
                var2 = vb.field_g;
                if (var2 == 5) {
                  break L9;
                } else {
                  if (var2 == 6) {
                    break L9;
                  } else {
                    if (var2 != 8) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              var2 = gh.field_Jb;
              break L8;
            }
            q.a(20, false, -1, var2);
            break L1;
          }
          L10: {
            L11: {
              ol.field_Ub = ol.field_Ub + 1;
              var2 = vb.field_g;
              if (var2 == 5) {
                break L11;
              } else {
                if (var2 == 6) {
                  break L11;
                } else {
                  if (var2 != 8) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
            }
            var2 = gh.field_Jb;
            break L10;
          }
          q.a(20, false, -1, var2);
          break L1;
        }
    }

    private final void f() {
        int[] var2 = null;
        int var3 = 0;
        mb[] var4 = null;
        int var5 = 0;
        jc var6 = null;
        mb var7_ref_mb = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        mb var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        L0: {
          L1: {
            var12 = SteelSentinels.field_G;
            var13 = new int[2];
            var2 = var13;
            var3 = ((nb) this).field_X.field_Q + ((nb) this).field_X.field_kb;
            if (null == ((nb) this).field_B) {
              break L1;
            } else {
              if (var3 == ((nb) this).field_B.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((nb) this).field_B = new int[var3];
          break L0;
        }
        var4 = new mb[var3];
        var5 = 0;
        var6 = new jc(((nb) this).field_X.field_K);
        var7_ref_mb = (mb) (Object) var6.b(2);
        L2: while (true) {
          if (var7_ref_mb == null) {
            L3: {
              if (var13[0] / 100 != var13[1] / 100) {
                break L3;
              } else {
                if (((nb) this).field_B[var3 / 2] < ((nb) this).field_B[0]) {
                  var2[1] = var2[1] + 100;
                  break L3;
                } else {
                  var13[0] = var13[0] + 100;
                  break L3;
                }
              }
            }
            var7 = 0;
            L4: while (true) {
              if (-1 + var3 <= var7) {
                var8 = 0;
                var14 = 0;
                var7 = var14;
                L5: while (true) {
                  if (var14 >= var3) {
                    return;
                  } else {
                    L6: {
                      var11 = var4[var14].field_Bb;
                      if (var14 <= 0) {
                        break L6;
                      } else {
                        if (var4[var14 - 1].field_jc == var4[var14].field_jc) {
                          break L6;
                        } else {
                          var8 += 3;
                          break L6;
                        }
                      }
                    }
                    if (var8 > ((nb) this).field_B[var11]) {
                      ((nb) this).field_B[var11] = ((nb) this).field_B[var11] + 1;
                      var8 += 9;
                      var14++;
                      continue L5;
                    } else {
                      if (((nb) this).field_B[var11] > var8) {
                        ((nb) this).field_B[var11] = ((nb) this).field_B[var11] - 1;
                        var8 += 9;
                        var14++;
                        continue L5;
                      } else {
                        var8 += 9;
                        var14++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var8 = var7;
                var9 = var7;
                L7: while (true) {
                  if (var3 <= var9) {
                    if (var7 != var8) {
                      var10 = var4[var7];
                      var4[var7] = var4[var8];
                      var4[var8] = var10;
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  } else {
                    L8: {
                      if (var2[var4[var8].field_jc] < var2[var4[var9].field_jc]) {
                        break L8;
                      } else {
                        if (var4[var8].field_jc == var4[var9].field_jc) {
                          if (var4[var8].field_vb + -var4[var8].field_Ab < var4[var9].field_vb + -var4[var9].field_Ab) {
                            break L8;
                          } else {
                            var9++;
                            continue L7;
                          }
                        } else {
                          var9++;
                          continue L7;
                        }
                      }
                    }
                    var8 = var9;
                    var9++;
                    continue L7;
                  }
                }
              }
            }
          } else {
            L9: {
              if (var7_ref_mb.field_Bb < 0) {
                break L9;
              } else {
                if (var7_ref_mb.field_Bb >= var3) {
                  break L9;
                } else {
                  int incrementValue$1 = var5;
                  var5++;
                  var4[incrementValue$1] = var7_ref_mb;
                  break L9;
                }
              }
            }
            var13[var7_ref_mb.field_jc] = var13[var7_ref_mb.field_jc] + (var7_ref_mb.field_vb + -var7_ref_mb.field_Ab);
            var7_ref_mb = (mb) (Object) var6.d(2);
            continue L2;
          }
        }
    }

    private final void a(byte param0, boolean param1, boolean param2, hd param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wk var12_ref_wk = null;
        ie var12_ref_ie = null;
        int var13 = 0;
        int[] var13_ref_int__ = null;
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
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var27 = SteelSentinels.field_G;
          if (((nb) this).field_E > 1024) {
            ((nb) this).field_E = 1024;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var5_int = ((nb) this).field_P;
          var6 = ((nb) this).field_E;
          pb.a(0, 0, 640, 400);
          var7 = -(var6 >> 4) + 400;
          var8 = -var7 + 400;
          if (var8 >= 30) {
            break L1;
          } else {
            var8 = 30;
            break L1;
          }
        }
        L2: {
          if (4 == param3.b(111)) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_8_0;
          if (param1) {
            L4: {
              if (var9 != 0) {
                break L4;
              } else {
                L5: {
                  L6: {
                    pb.b();
                    var10 = -var8 + var7;
                    var11 = -(((nb) this).field_P >> 4) - -(((nb) this).field_X.field_ab.a(param0 + -74) / 2 >> 4);
                    var11 = 320 + (var11 - 320) * 3 / 10;
                    var12 = 1000;
                    var13 = 4 * var8 / 6 + (var10 - var12 * 2 / 3);
                    var13 = 31 + -(((nb) this).field_E >> 4);
                    var13 = -180 + ((var13 * 3 - 720) / 10 - -240);
                    if (null == un.field_o) {
                      break L6;
                    } else {
                      if (h.field_T != null) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  im.field_h.field_d = 0;
                  un.field_o = (wk) (Object) new ek(im.field_h.a("planet.jpg", -742, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                  h.field_T = (wk) (Object) new ek(im.field_h.a("moon.jpg", param0 ^ -665, "fleetbattle/"), (java.awt.Component) (Object) gl.a(false));
                  break L5;
                }
                if (null == un.field_o) {
                  break L4;
                } else {
                  if (h.field_T != null) {
                    un.field_o.f(var11, var13);
                    var11 = -(((nb) this).field_P >> 4) / 2;
                    h.field_T.f(var11, var13);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (var9 == 0) {
              break L3;
            } else {
              var10 = -var8 + var7;
              if (0 >= var8) {
                break L3;
              } else {
                L7: {
                  var11 = 0;
                  var12 = 288;
                  var13 = var12 * 800 >> 9;
                  pb.a(0, 0, 640, -(var13 * 4 / 5) + (var10 + 4 * var8 / 6), 0);
                  var14 = ((nb) this).field_X.field_ab.a(86) + -10240;
                  if (var14 < 30000) {
                    var14 = 30000;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  var15 = -((nb) this).field_P * (var13 * 2 + -640) / var14;
                  var16 = 4 * var8 / 6 + var10 - 4 * var13 / 5;
                  var11++;
                  var16 = (-240 + var16) / 10;
                  if (var11 >= 4) {
                    var11 -= 4;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (null != jh.field_h) {
                    break L9;
                  } else {
                    L10: {
                      im.field_h.field_d = 0;
                      if (((nb) this).field_X.field_ab.b(55) != 0) {
                        break L10;
                      } else {
                        jh.field_h = new wk(im.field_h.a("wz_background.jpg", -742, "warzone/"), (java.awt.Component) (Object) gl.a(false));
                        break L10;
                      }
                    }
                    L11: {
                      if (1 == ((nb) this).field_X.field_ab.b(79)) {
                        jh.field_h = new wk(im.field_h.a("lw_background.jpg", param0 + -867, "lostworld/"), (java.awt.Component) (Object) gl.a(false));
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (((nb) this).field_X.field_ab.b(63) == 2) {
                        jh.field_h = new wk(im.field_h.a("ct_background.jpg", param0 + -867, "city/"), (java.awt.Component) (Object) gl.a(false));
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    if (((nb) this).field_X.field_ab.b(90) != 3) {
                      break L9;
                    } else {
                      jh.field_h = new wk(im.field_h.a("mn_background.jpg", -742, "moon/"), (java.awt.Component) (Object) gl.a(false));
                      break L9;
                    }
                  }
                }
                L13: {
                  if (jh.field_h == null) {
                    break L13;
                  } else {
                    jh.field_h.c(var15, var16, 2 * var13, var13);
                    break L13;
                  }
                }
                if (((nb) this).field_X.field_ab.b(113) == 3) {
                  break L3;
                } else {
                  if (!ka.field_V) {
                    break L3;
                  } else {
                    var12_ref_ie = new ie(new int[2]);
                    var13_ref_int__ = new int[]{24000, 24000, 10000, 26000};
                    var14 = var12_ref_ie.a(-95, var13_ref_int__.length);
                    var15 = 256;
                    var16 = 500 * var15 >> 9;
                    var17 = -16000;
                    L14: while (true) {
                      if (~var17 <= ~(22000 + ((nb) this).field_X.field_ab.a(param0 + -249))) {
                        var15 = 256;
                        var16 = 800 * var15 >> 9;
                        var17 = -12000;
                        L15: while (true) {
                          if (~(20000 + ((nb) this).field_X.field_ab.a(106)) >= ~var17) {
                            break L3;
                          } else {
                            var18 = -((nb) this).field_P * var15 / 4096 + (var15 * var17 >> 12);
                            var19 = var8 + var10 + -var16;
                            var18 = 320 + (-320 + var18) * 5 / 20;
                            var19 = (var19 * 5 - 1200) / 20 - -80;
                            ig.field_o[((nb) this).field_X.field_ab.b(101)][var14].c(var18 - var16 / 2, var19, var16, var16);
                            var17 = var17 + var13_ref_int__[var14];
                            var14 = var14 + (1 + var12_ref_ie.a(-122, -1 + var13_ref_int__.length));
                            if (~var13_ref_int__.length >= ~var14) {
                              var14 = var14 - var13_ref_int__.length;
                              continue L15;
                            } else {
                              continue L15;
                            }
                          }
                        }
                      } else {
                        L16: {
                          var18 = -((nb) this).field_P * var15 / 4096 + (var15 * var17 >> 12);
                          var19 = var8 + var10 + -var16;
                          var18 = 320 + (3 * var18 - 960) / 20;
                          var19 = (-720 + 3 * var19) / 20 - -160;
                          if (((nb) this).field_X.field_ab.b(76) != 2) {
                            break L16;
                          } else {
                            if (ig.field_o[((nb) this).field_X.field_ab.b(param0 + -38)][var14].field_F >= 300) {
                              ig.field_o[((nb) this).field_X.field_ab.b(81)][var14].c(var18 - var16 / 2, var19, var16, var16);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                        L17: {
                          var17 = var17 + var13_ref_int__[var14];
                          var14 = var14 + (var12_ref_ie.a(-107, var13_ref_int__.length + -1) + 1);
                          if (~var14 > ~var13_ref_int__.length) {
                            break L17;
                          } else {
                            var14 = var14 - var13_ref_int__.length;
                            break L17;
                          }
                        }
                        continue L14;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L3;
          }
        }
        L18: {
          if (param0 == 125) {
            break L18;
          } else {
            ((nb) this).field_j = 55;
            break L18;
          }
        }
        L19: {
          if (param2) {
            L20: {
              if (var9 != 0) {
                L21: {
                  var10 = -(((nb) this).field_P >> 4);
                  var11 = 400 - (((nb) this).field_E >> 4);
                  if (2 != param3.b(54)) {
                    if (ka.field_V) {
                      var12 = 0;
                      L22: while (true) {
                        if (param3.field_c <= var12) {
                          break L21;
                        } else {
                          var13 = (param3.field_o[var12] >> 4) + var10;
                          var14 = var11 - (param3.field_h[var12] >> 4);
                          var15 = kc.field_x[((nb) this).field_X.field_ab.b(param0 + -68)][param3.field_j[var12]].field_z >> 2;
                          kc.field_x[((nb) this).field_X.field_ab.b(param0 ^ 65)][param3.field_j[var12]].c(var13 - var15 / 2, var14, var15, var15);
                          var12++;
                          continue L22;
                        }
                      }
                    } else {
                      break L21;
                    }
                  } else {
                    L23: {
                      if (ka.field_V) {
                        var12 = 0;
                        L24: while (true) {
                          if (var12 >= param3.field_c) {
                            break L23;
                          } else {
                            L25: {
                              if (1 < param3.field_j[var12]) {
                                var13 = (param3.field_o[var12] >> 4) + var10;
                                var14 = -(param3.field_h[var12] >> 4) + var11;
                                var15 = kc.field_x[((nb) this).field_X.field_ab.b(param0 ^ 63)][param3.field_j[var12]].field_z >> 1;
                                kc.field_x[((nb) this).field_X.field_ab.b(70)][param3.field_j[var12]].c(var13 + -(var15 / 2), var14, var15, var15);
                                break L25;
                              } else {
                                break L25;
                              }
                            }
                            var12++;
                            continue L24;
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                    var12 = 0;
                    L26: while (true) {
                      if (~var12 <= ~param3.field_c) {
                        break L21;
                      } else {
                        L27: {
                          if (1 < param3.field_j[var12]) {
                            break L27;
                          } else {
                            var13 = var10 - -(param3.field_o[var12] >> 4);
                            var14 = var11 + -(param3.field_h[var12] >> 4);
                            var15 = kc.field_x[((nb) this).field_X.field_ab.b(46)][param3.field_j[var12]].field_z >> 1;
                            kc.field_x[((nb) this).field_X.field_ab.b(72)][param3.field_j[var12]].c(-(var15 / 2) + var13, var14, var15, var15);
                            break L27;
                          }
                        }
                        var12++;
                        continue L26;
                      }
                    }
                  }
                }
                L28: {
                  if (1024 >= ((nb) this).field_E) {
                    break L28;
                  } else {
                    ((nb) this).field_E = 1024;
                    break L28;
                  }
                }
                L29: {
                  if (var8 < 30) {
                    var8 = 30;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  pb.a(0, 0, 640, 400);
                  var12_ref_wk = bc.field_rb[((nb) this).field_X.field_ab.b(109)];
                  var13 = 128;
                  var14 = var7 + 1;
                  if (ka.field_V) {
                    var15 = 0;
                    L31: while (true) {
                      if (var15 >= 640) {
                        break L30;
                      } else {
                        L32: {
                          var16 = var5_int + (var15 << 4);
                          var17 = var6 + param3.a((byte) -96, var16);
                          var18 = var6 + param3.a(false, var16);
                          var19 = param3.b((byte) 123, var16) - -var6;
                          var20 = var17;
                          var21 = -(var20 >> 4) + 400;
                          var22 = 0;
                          if (400 >= var21) {
                            break L32;
                          } else {
                            var22 = var22 - (400 + -var21);
                            var21 = 400;
                            break L32;
                          }
                        }
                        var21 = var15 + 640 * var21;
                        L33: while (true) {
                          L34: {
                            if (var22 >= 256) {
                              break L34;
                            } else {
                              if (var21 < 0) {
                                break L34;
                              } else {
                                var23 = sb.field_bb.field_a[var21];
                                var24 = var22 * (16711680 & var23) >> 8 & 16711680;
                                var25 = var22 * (65280 & var23) >> 8 & 65280;
                                var26 = var22 * (var23 & 255) >> 8 & 255;
                                sb.field_bb.field_a[var21] = var24 + var25 - -var26;
                                var21 -= 640;
                                var22 += 4;
                                continue L33;
                              }
                            }
                          }
                          L35: {
                            if (var18 <= var17) {
                              break L35;
                            } else {
                              pb.a(var15, 400 - (var19 >> 4), 1 + var15, 400 + -(var17 >> 4));
                              var12_ref_wk.c(-((4095 & var16) >> 1) + var15, var7 + -var13, 2048, var13);
                              var12_ref_wk.c(var15 + -((4095 & var16) >> 1), var7 + -(var13 * 2), 2048, var13);
                              var12_ref_wk.c(-((4095 & var16) >> 1) + var15, var7, 2048, var13);
                              pb.f(var15, 400 + -(var19 >> 4), -(var17 - var19 >> 4) + 401, 0, 192);
                              break L35;
                            }
                          }
                          var15++;
                          continue L31;
                        }
                      }
                    }
                  } else {
                    var15 = 0;
                    L36: while (true) {
                      if (var15 >= 640) {
                        break L30;
                      } else {
                        L37: {
                          var16 = var5_int + (var15 << 4);
                          var17 = var6 + param3.a((byte) -119, var16);
                          var18 = param3.a(false, var16) - -var6;
                          var19 = var6 + param3.b((byte) 126, var16);
                          if (var18 > var17) {
                            pb.d(var15, 400 - (var19 >> 4), -(var17 + -var19 >> 4) + 401, 0);
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                        var15++;
                        continue L36;
                      }
                    }
                  }
                }
                L38: {
                  if (400 >= var14) {
                    break L38;
                  } else {
                    var14 = 400;
                    break L38;
                  }
                }
                pb.c();
                break L20;
              } else {
                var10 = -(((nb) this).field_P >> 4);
                var11 = -(((nb) this).field_E >> 4) + 400;
                var12 = 0;
                L39: while (true) {
                  if (~var12 <= ~param3.field_c) {
                    break L20;
                  } else {
                    L40: {
                      var13 = var10 + (param3.field_o[var12] >> 4);
                      var14 = var11 + -(param3.field_h[var12] >> 4);
                      if (var12 >= 2) {
                        if (param3.field_j[var12] == -1) {
                          break L40;
                        } else {
                          var15 = kc.field_x[1][param3.field_j[var12]].field_z >> 2;
                          kc.field_x[1][param3.field_j[var12]].c(var13 + -(var15 / 2), var14, var15, var15);
                          break L40;
                        }
                      } else {
                        L41: {
                          var15 = sb.field_W.field_z;
                          if (var12 != 0) {
                            break L41;
                          } else {
                            sb.field_W.a(-(var15 / 2) + var13, var14);
                            var16 = ((nb) this).field_X.field_r / 5 % 6;
                            if ((1 & ((nb) this).field_X.field_v) == 0) {
                              b.field_n[var16].d(var13 - var15 / 2, var14, var15, var15, 64);
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                        }
                        L42: {
                          if (1 != var12) {
                            break L42;
                          } else {
                            hb.field_e.a(-(var15 / 2) + var13, var14);
                            var16 = 6 + ((nb) this).field_X.field_r / 5 % 6;
                            if ((2 & ((nb) this).field_X.field_v) == 0) {
                              b.field_n[var16].d(var13 - var15 / 2, var14, var15, var15, 64);
                              break L42;
                            } else {
                              break L40;
                            }
                          }
                        }
                        break L40;
                      }
                    }
                    var12++;
                    continue L39;
                  }
                }
              }
            }
            if (((nb) this).field_X.field_ab.b(param0 + -70) != 3) {
              break L19;
            } else {
              var10 = -(((nb) this).field_P >> 4);
              var11 = -(((nb) this).field_E >> 4) + 400;
              var12 = ((nb) this).field_X.field_ab.a(param0 ^ 35);
              var13 = (var12 >> 5) + var10;
              var14 = var11;
              var14 += 384;
              var15 = sb.field_W.field_z;
              var16 = sb.field_W.field_B;
              sb.field_W.a(-(var15 / 2) + var13, -(3 * var16 / 2) + var14);
              var17 = ((nb) this).field_X.field_r / 5 % 6;
              b.field_n[var17].d(-(var15 / 2) + var13, -(var15 / 2) + (var14 - 3 * var16 / 4), var15, var15, 64);
              break L19;
            }
          } else {
            break L19;
          }
        }
        L43: {
          if (((nb) this).field_X.field_fb) {
            pb.c(0, 0, 640, 480, 0, 180);
            break L43;
          } else {
            break L43;
          }
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
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
        var16 = SteelSentinels.field_G;
        if (((nb) this).field_X.field_j) {
          return;
        } else {
          L0: {
            if (oh.field_f >= 0) {
              break L0;
            } else {
              if (pi.field_c < 0) {
                return;
              } else {
                break L0;
              }
            }
          }
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L1: while (true) {
            L2: {
              if (hf.field_c <= var9) {
                break L2;
              } else {
                L3: {
                  L4: {
                    var10 = ((nb) this).d(true, ((nb) this).field_D[var9]);
                    var10 = var10 + (-param0 + param3);
                    var11 = this.b(1, ((nb) this).field_K[var9]);
                    var11 = var11 + (-param4 + param1);
                    var12 = -param3 + var10;
                    var13 = -param5 + var11;
                    if (var9 <= 0) {
                      break L4;
                    } else {
                      if (var13 * var13 + var12 * var12 >= 2304) {
                        break L4;
                      } else {
                        pb.a(var7, var8, var10, var11, 12632304, 128);
                        break L3;
                      }
                    }
                  }
                  if (0 < var9) {
                    L5: {
                      var14 = 0;
                      var15 = 0;
                      if (Math.abs(var12) <= Math.abs(var13)) {
                        if (~var8 > ~var11) {
                          var15 = var8 + 1;
                          L6: while (true) {
                            if (~var15 <= ~var11) {
                              break L5;
                            } else {
                              var14 = (-var7 + var10) * (var15 + -var8) / (var11 - var8) + var7;
                              var12 = var14 + -param3;
                              var13 = var15 - param5;
                              if (var13 * var13 + var12 * var12 < 2304) {
                                var15++;
                                continue L6;
                              } else {
                                pb.a(var7, var8, var14, var15, 12632304, 128);
                                break L2;
                              }
                            }
                          }
                        } else {
                          var15 = -1 + var8;
                          L7: while (true) {
                            if (var11 >= var15) {
                              break L5;
                            } else {
                              var14 = var7 - -((-var7 + var10) * (var15 - var8) / (-var8 + var11));
                              var13 = var15 - param5;
                              var12 = -param3 + var14;
                              if (var13 * var13 + var12 * var12 >= 2304) {
                                break L5;
                              } else {
                                var15--;
                                continue L7;
                              }
                            }
                          }
                        }
                      } else {
                        if (~var7 > ~var10) {
                          var14 = 1 + var7;
                          L8: while (true) {
                            if (var14 >= var10) {
                              break L5;
                            } else {
                              var12 = -param3 + var14;
                              var15 = var8 + (var11 - var8) * (var14 + -var7) / (-var7 + var10);
                              var13 = var15 + -param5;
                              if (var12 * var12 + var13 * var13 < 2304) {
                                var14++;
                                continue L8;
                              } else {
                                break L5;
                              }
                            }
                          }
                        } else {
                          var14 = var7 - 1;
                          L9: while (true) {
                            if (var14 <= var10) {
                              break L5;
                            } else {
                              var15 = (-var7 + var14) * (-var8 + var11) / (-var7 + var10) + var8;
                              var12 = -param3 + var14;
                              var13 = var15 + -param5;
                              if (var12 * var12 + var13 * var13 < 2304) {
                                var14--;
                                continue L9;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    pb.a(var7, var8, var14, var15, 12632304, 128);
                    break L2;
                  } else {
                    if (var9 <= 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                var8 = var11;
                var7 = var10;
                var9++;
                continue L1;
              }
            }
            return;
          }
        }
    }

    final void m(int param0) {
        if (param0 != 1125) {
            boolean discarded$0 = this.e(82);
        }
        if (!((nb) this).field_d) {
            throw new IllegalStateException();
        }
        mm.field_g.a(59, (byte) -117);
    }

    private final void d() {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
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
        wk var17_ref_wk = null;
        int var17 = 0;
        int var18_int = 0;
        String var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        L0: {
          var20 = SteelSentinels.field_G;
          var2 = 41;
          var3 = 1021128;
          ic.field_db.f(0, -ic.field_db.field_B + var2);
          if (((nb) this).field_r != -1) {
            break L0;
          } else {
            if (oh.field_f < 479) {
              break L0;
            } else {
              if (635 <= oh.field_f) {
                break L0;
              } else {
                if (pi.field_c < 2) {
                  break L0;
                } else {
                  if (pi.field_c >= 30) {
                    break L0;
                  } else {
                    var3 = 1044724;
                    ((nb) this).field_r = 6;
                    break L0;
                  }
                }
              }
            }
          }
        }
        L1: {
          int discarded$6 = 28;
          ra.a(var3, 2, (mi) (Object) pl.field_U, 479, 156, (byte) 68, ha.field_S);
          var3 = 1021128;
          if (((nb) this).field_r != -1) {
            break L1;
          } else {
            if (oh.field_f < 173) {
              break L1;
            } else {
              if (oh.field_f >= 321) {
                break L1;
              } else {
                if (pi.field_c < 2) {
                  break L1;
                } else {
                  if (pi.field_c >= 30) {
                    break L1;
                  } else {
                    ((nb) this).field_r = 12;
                    var3 = 1044724;
                    break L1;
                  }
                }
              }
            }
          }
        }
        L2: {
          int discarded$7 = 28;
          ra.a(var3, 2, (mi) (Object) pl.field_U, 173, 148, (byte) 68, sl.field_f);
          var3 = 1021128;
          var3 = 1021128;
          if (((nb) this).field_r != -1) {
            break L2;
          } else {
            L3: {
              if (oh.field_f < 5) {
                break L3;
              } else {
                if (oh.field_f >= 171) {
                  break L3;
                } else {
                  if (pi.field_c < 2) {
                    break L3;
                  } else {
                    if (pi.field_c < 30) {
                      var3 = 1044724;
                      ((nb) this).field_r = 13;
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L2;
          }
        }
        L4: {
          int discarded$8 = 28;
          ra.a(var3, 2, (mi) (Object) pl.field_U, 5, 166, (byte) 68, SteelSentinels.field_I);
          if (((nb) this).field_v > 0) {
            var4 = new int[4];
            pb.b(var4);
            pb.h(0, var2, 640, 480);
            var5 = new int[4];
            pb.b(var5);
            var6 = n.field_z;
            var7 = 0;
            var8 = 0;
            L5: while (true) {
              if (var8 >= var6.length) {
                var7 = var7 + (-((nb) this).field_s + (32 + ((nb) this).field_v));
                pb.a(5, var2, 166, var7 + -var2, 0);
                ei.a(5, var7, 166, 8, -96);
                var8 = 50;
                var9 = 2 + var7;
                var10 = 0;
                L6: while (true) {
                  if (var10 >= 8) {
                    L7: {
                      var7 += 8;
                      if (-1 != ((nb) this).field_r) {
                        break L7;
                      } else {
                        if (oh.field_f < 5) {
                          break L7;
                        } else {
                          if (oh.field_f >= 171) {
                            break L7;
                          } else {
                            if (pi.field_c < var2) {
                              break L7;
                            } else {
                              if (~pi.field_c > ~var7) {
                                ((nb) this).field_r = 26;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      if (12 > ((nb) this).field_X.field_K.b((byte) -128)) {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L8;
                      } else {
                        stackOut_39_0 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        break L8;
                      }
                    }
                    var8 = stackIn_41_0;
                    var9 = oe.field_i;
                    oe.field_i = -1;
                    var21 = 0;
                    var10 = var21;
                    L9: while (true) {
                      if (var21 >= var6.length) {
                        pb.a(var4);
                        break L4;
                      } else {
                        L10: {
                          var11 = ((nb) this).field_o[var21];
                          var12 = -((nb) this).field_s + ((nb) this).field_g[var21] - -((nb) this).field_v;
                          if (var11 < 0) {
                            break L10;
                          } else {
                            L11: {
                              var13 = 0;
                              var3 = 1021128;
                              if (((nb) this).field_r != 26) {
                                break L11;
                              } else {
                                if (!fn.field_a) {
                                  break L11;
                                } else {
                                  if (~((nb) this).field_s != ~((nb) this).field_v) {
                                    break L11;
                                  } else {
                                    if (~var11 < ~oh.field_f) {
                                      break L11;
                                    } else {
                                      if (oh.field_f >= var11 + 80) {
                                        break L11;
                                      } else {
                                        if (pi.field_c < var12) {
                                          break L11;
                                        } else {
                                          if (30 + var12 > pi.field_c) {
                                            L12: {
                                              var3 = 1044724;
                                              ((nb) this).field_r = 14 - -var21;
                                              oe.field_i = var21;
                                              if (var9 == oe.field_i) {
                                                break L12;
                                              } else {
                                                nc.field_f = a.field_c;
                                                break L12;
                                              }
                                            }
                                            var13 = (-nc.field_f + a.field_c) / 7 % 15;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L13: {
                              if (var8 == 0) {
                                break L13;
                              } else {
                                var3 = 7829367;
                                break L13;
                              }
                            }
                            int discarded$9 = 80;
                            int discarded$10 = 90;
                            int discarded$11 = 30;
                            a.a(var12, var11);
                            var14 = 28;
                            var15 = var11 - -2;
                            var16 = 1 + var12;
                            pb.g(var15, var16, var14, var14, 4, 0);
                            pb.h(var15, 1 + var16, var15 - -var14, var14 + var16);
                            var17_ref_wk = si.field_E[var21];
                            var18_int = var13 % 4 * var14;
                            var19 = var14 * (var13 / 4);
                            var17_ref_wk.c(var15 + -var18_int, -var19 + var16, 4 * var14, 4 * var14);
                            pb.a(var5);
                            var17 = var12 + (30 - -fk.field_d.field_G) / 2 + -3;
                            var18 = cd.field_c[var21];
                            var19 = fk.field_d.c(var18);
                            if (~(80 - var14 - 6) > ~var19) {
                              fk.field_d.c(var18, -1 + (var11 + 80), var17, var3, -1);
                              break L10;
                            } else {
                              fk.field_d.a(var18, var11 + (80 + var14) / 2, var17, var3, -1);
                              break L10;
                            }
                          }
                        }
                        var21++;
                        continue L9;
                      }
                    }
                  } else {
                    ao.field_y.a(var8, var9);
                    var8 += 10;
                    var10++;
                    continue L6;
                  }
                }
              } else {
                L14: {
                  if (((nb) this).field_o[var8] < 0) {
                    break L14;
                  } else {
                    if (((nb) this).field_g[var8] <= var7) {
                      break L14;
                    } else {
                      var7 = ((nb) this).field_g[var8];
                      break L14;
                    }
                  }
                }
                var8++;
                continue L5;
              }
            }
          } else {
            break L4;
          }
        }
        L15: {
          if (-1 != ((nb) this).field_r) {
            break L15;
          } else {
            if (~var2 >= ~pi.field_c) {
              break L15;
            } else {
              ((nb) this).field_r = 26;
              break L15;
            }
          }
        }
    }

    private final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        String var5 = null;
        int var6_int = 0;
        ld var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        mb[] var10 = null;
        int var11 = 0;
        mb var12 = null;
        int var12_int = 0;
        int[] var12_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int stackIn_41_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_113_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        L0: {
          var21 = SteelSentinels.field_G;
          pb.c(0, 0, 640, 480, 0, 100);
          var2 = 25;
          var3 = 0;
          var4 = null;
          var5 = "";
          var6_int = ((nb) this).field_X.field_P;
          if (var6_int == 0) {
            var5 = vd.field_e[0];
            var4 = (Object) (Object) var5;
            var4 = (Object) (Object) var5;
            if (di.field_g != 4) {
              var4 = (Object) (Object) vn.field_k;
              break L0;
            } else {
              var4 = (Object) (Object) na.field_u;
              break L0;
            }
          } else {
            L1: {
              if (var6_int == 1) {
                break L1;
              } else {
                if (var6_int != 2) {
                  if (var6_int != 3) {
                    break L0;
                  } else {
                    if (1 == ((nb) this).field_X.field_kb) {
                      var5 = vd.field_e[2];
                      var4 = (Object) (Object) a.field_b;
                      break L0;
                    } else {
                      var4 = (Object) (Object) de.field_b;
                      var5 = vd.field_e[3];
                      break L0;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var4 = (Object) (Object) ag.field_t;
            var5 = vd.field_e[1];
            var4 = (Object) (Object) var5;
            var4 = (Object) (Object) var5;
            break L0;
          }
        }
        L2: {
          var6_int = ((nb) this).field_X.field_ab.b(77);
          if (var6_int != 0) {
            if (1 != var6_int) {
              if (2 != var6_int) {
                if (3 == var6_int) {
                  var5 = var5 + nh.field_o[3];
                  break L2;
                } else {
                  if (var6_int != 4) {
                    break L2;
                  } else {
                    var5 = var5 + nh.field_o[4];
                    break L2;
                  }
                }
              } else {
                var5 = var5 + nh.field_o[2];
                break L2;
              }
            } else {
              var5 = var5 + nh.field_o[1];
              break L2;
            }
          } else {
            var5 = var5 + nh.field_o[0];
            break L2;
          }
        }
        L3: {
          if (di.field_g != 4) {
            break L3;
          } else {
            var5 = null;
            break L3;
          }
        }
        L4: {
          L5: {
            ic.field_db.f(0, -115 - -kj.field_w);
            if (((nb) this).field_X.field_W) {
              break L5;
            } else {
              if (0 <= ((nb) this).field_X.field_A) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          pb.b(639, -58 + kj.field_w, 16776960);
          break L4;
        }
        L6: {
          var4 = (Object) (Object) ke.a(42, (String) var4);
          var6 = ql.field_Tb;
          if (param0 == -4294) {
            break L6;
          } else {
            nb.b((byte) 5);
            break L6;
          }
        }
        L7: {
          if (var4 != null) {
            ((mi) (Object) var6).a((String) var4, 320, kj.field_w + -83 - -(((mi) (Object) var6).field_G / 2), 0, -1);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (0 >= var3) {
            stackOut_40_0 = ((nb) this).field_X.field_Q + ((nb) this).field_X.field_kb;
            stackIn_41_0 = stackOut_40_0;
            break L8;
          } else {
            stackOut_39_0 = var3;
            stackIn_41_0 = stackOut_39_0;
            break L8;
          }
        }
        L9: {
          var9 = stackIn_41_0;
          var10 = new mb[var9];
          var11 = 0;
          if (var3 == 0) {
            var12 = (mb) (Object) ((nb) this).field_X.field_K.e(param0 + 17352);
            L10: while (true) {
              if (var12 == null) {
                break L9;
              } else {
                L11: {
                  if (0 > var12.field_Bb) {
                    break L11;
                  } else {
                    if (~var12.field_Bb > ~var9) {
                      var10[var12.field_Bb] = var12;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L12: {
                  if (var12.field_Db <= var11) {
                    break L12;
                  } else {
                    var11 = var12.field_Db;
                    break L12;
                  }
                }
                L13: {
                  if (var12.field_Ub > var11) {
                    var11 = var12.field_Ub;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var12 = (mb) (Object) ((nb) this).field_X.field_K.a((byte) -71);
                continue L10;
              }
            }
          } else {
            var12_int = 0;
            L14: while (true) {
              if (~var10.length >= ~var12_int) {
                var11 = Math.max(((nb) this).field_C.field_Db, ((nb) this).field_C.field_Ub);
                break L9;
              } else {
                var10[var12_int] = ((nb) this).field_C;
                var12_int++;
                continue L14;
              }
            }
          }
        }
        L15: {
          if (((nb) this).field_X.field_P != 3) {
            break L15;
          } else {
            var7 = (var2 + (640 - var9 * (100 + var2))) / 2;
            var8 = 149;
            var12_int = 0;
            L16: while (true) {
              if (~var12_int <= ~var9) {
                break L15;
              } else {
                int discarded$8 = 130;
                this.a(var11, 100, 5, var10[var12_int], fj.field_h[0], var7, var8);
                var7 = var7 + (var2 + 100);
                var12_int++;
                continue L16;
              }
            }
          }
        }
        L17: {
          if (0 != ((nb) this).field_X.field_P) {
            break L17;
          } else {
            if (var9 < 4) {
              var7 = (var2 + (-((var2 + 100) * var9) + 640)) / 2;
              var8 = 149;
              var12_int = 0;
              L18: while (true) {
                if (var12_int >= var9) {
                  break L17;
                } else {
                  int discarded$9 = 130;
                  this.a(var11, 100, 5, var10[var12_int], var10[var12_int].d((byte) 31), var7, var8);
                  var7 = var7 + (var2 + 100);
                  var12_int++;
                  continue L18;
                }
              }
            } else {
              L19: {
                var8 = 73;
                if (var9 <= 10) {
                  break L19;
                } else {
                  var2 = 8;
                  break L19;
                }
              }
              var12_int = (1 + var9) / 2;
              var7 = (640 + -(var12_int * (var2 + 100)) - -var2) / 2;
              var13 = 0;
              L20: while (true) {
                if (var12_int <= var13) {
                  var12_int = -var12_int + var9;
                  var8 = 225;
                  var7 = (var2 + -(var12_int * (100 - -var2)) + 640) / 2;
                  L21: while (true) {
                    if (var9 <= var13) {
                      break L17;
                    } else {
                      int discarded$10 = 130;
                      this.a(var11, 100, param0 + 4299, var10[var13], var10[var13].d((byte) -107), var7, var8);
                      var7 = var7 + (100 - -var2);
                      var13++;
                      continue L21;
                    }
                  }
                } else {
                  int discarded$11 = 130;
                  this.a(var11, 100, 5, var10[var13], var10[var13].d((byte) -110), var7, var8);
                  var7 = var7 + (100 + var2);
                  var13++;
                  continue L20;
                }
              }
            }
          }
        }
        L22: {
          if (((nb) this).field_X.field_P == 1) {
            var22 = new int[2];
            var12_array = new int[2];
            var13 = 0;
            L23: while (true) {
              if (var13 >= var9) {
                L24: {
                  var13 = Math.max(var22[0], var22[1]);
                  if (var13 <= 5) {
                    break L24;
                  } else {
                    var2 = 12;
                    break L24;
                  }
                }
                var8 = 73;
                var14 = (-((var2 + 100) * var13) + 640 - -var2) / 2;
                var7 = var14;
                var15 = 0;
                L25: while (true) {
                  L26: {
                    if (~var15 <= ~var9) {
                      break L26;
                    } else {
                      if (~var10[0].field_jc != ~var10[var15].field_jc) {
                        break L26;
                      } else {
                        int discarded$12 = 130;
                        this.a(var11, 100, 5, var10[var15], var10[var15].d((byte) 121), var7, var8);
                        var7 = var7 + (var2 + 100);
                        var15++;
                        continue L25;
                      }
                    }
                  }
                  var8 = 225;
                  var7 = var14;
                  var16 = var15;
                  L27: while (true) {
                    if (~var9 >= ~var15) {
                      break L22;
                    } else {
                      if (~var10[var16].field_jc != ~var10[var15].field_jc) {
                        break L22;
                      } else {
                        int discarded$13 = 130;
                        this.a(var11, 100, 5, var10[var15], var10[var15].d((byte) -115), var7, var8);
                        var7 = var7 + (100 + var2);
                        var15++;
                        continue L27;
                      }
                    }
                  }
                }
              } else {
                L28: {
                  if (0 < var3) {
                    var10[var13] = ((nb) this).field_X.f(var13 * 2 / var3, bi.a(param0, 4283));
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (null == var10[var13]) {
                    break L29;
                  } else {
                    var22[var10[var13].field_jc] = var22[var10[var13].field_jc] + 1;
                    break L29;
                  }
                }
                var13++;
                continue L23;
              }
            }
          } else {
            break L22;
          }
        }
        L30: {
          if (((nb) this).field_X.field_P == 2) {
            var23 = new int[3];
            var12_array = new int[3];
            var13 = 0;
            L31: while (true) {
              if (~var9 >= ~var13) {
                L32: {
                  var13 = Math.max(var23[0], Math.max(var23[1], var23[2]));
                  if (var13 > 2) {
                    var2 = 12;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  var14 = Math.min(var13, 2);
                  var15 = (var13 - -1) / 2;
                  if (var13 <= 2) {
                    stackOut_107_0 = 30;
                    stackIn_108_0 = stackOut_107_0;
                    break L33;
                  } else {
                    stackOut_106_0 = 20;
                    stackIn_108_0 = stackOut_106_0;
                    break L33;
                  }
                }
                var16 = stackIn_108_0;
                var17 = (-(300 * var15) + -(2 * var16) + (640 + -(var2 * ((-1 + var15) * 3)))) / 2;
                var18 = 0;
                L34: while (true) {
                  if (var18 >= 3) {
                    break L30;
                  } else {
                    L35: {
                      var7 = var17;
                      if (var14 != 1) {
                        stackOut_112_0 = 73;
                        stackIn_113_0 = stackOut_112_0;
                        break L35;
                      } else {
                        stackOut_111_0 = 149;
                        stackIn_113_0 = stackOut_111_0;
                        break L35;
                      }
                    }
                    var8 = stackIn_113_0;
                    var19 = 0;
                    var20 = 0;
                    L36: while (true) {
                      if (var9 <= var20) {
                        var17 = var17 + (var16 + (100 - -var2) * var15 + -var2);
                        var18++;
                        continue L34;
                      } else {
                        L37: {
                          if (null == var10[var20]) {
                            break L37;
                          } else {
                            if (var10[var20].field_jc == var18) {
                              int discarded$14 = 130;
                              this.a(var11, 100, param0 + 4299, var10[var20], fj.field_h[var18], var7, var8);
                              var19++;
                              if (~var19 == ~var15) {
                                var7 = var17;
                                var8 = 225;
                                if (var23[var18] == 3) {
                                  var7 = var7 + (100 + var2) / 2;
                                  break L37;
                                } else {
                                  break L37;
                                }
                              } else {
                                var7 = var7 + (100 + var2);
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                        }
                        var20++;
                        continue L36;
                      }
                    }
                  }
                }
              } else {
                L38: {
                  if (var10[var13] == null) {
                    break L38;
                  } else {
                    var23[var10[var13].field_jc] = var23[var10[var13].field_jc] + 1;
                    break L38;
                  }
                }
                var13++;
                continue L31;
              }
            }
          } else {
            break L30;
          }
        }
        L39: {
          pb.a(0, 480 - kj.field_w, 640, 105, 0);
          pb.c(0, -kj.field_w + 479, 640, 0, 128);
          if (var5 == null) {
            break L39;
          } else {
            int discarded$15 = pl.field_U.a(var5, 100, -kj.field_w + 500, 440, 100, 1021128, -1, 1, 0, pl.field_U.field_U + 6);
            break L39;
          }
        }
        L40: {
          if (!((nb) this).field_h) {
            break L40;
          } else {
            if (nm.a(-kj.field_w + 541, 280, param0 + 4418, ja.field_c, 30, 80)) {
              ((nb) this).field_r = 27;
              break L40;
            } else {
              break L40;
            }
          }
        }
    }

    private final void d(int param0) {
        int[][] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        mb var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int[][] var10 = null;
        int stackIn_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        var9 = SteelSentinels.field_G;
        if (0 > ((nb) this).field_r) {
          return;
        } else {
          if (((nb) this).field_r == 26) {
            return;
          } else {
            L0: {
              L1: {
                var10 = new int[][]{ua.field_v, ua.field_x, ua.field_P, ua.field_z, ua.field_N, ua.field_O, ua.field_D, ua.field_J, ua.field_E, vk.field_s, jm.field_p, si.field_k};
                var2 = var10;
                var3 = 0;
                if (((nb) this).field_r < 14) {
                  break L1;
                } else {
                  if (((nb) this).field_r >= 14 - -var10.length) {
                    break L1;
                  } else {
                    var3 = ((nb) this).field_r + -14;
                    break L0;
                  }
                }
              }
              if (((nb) this).field_r < 8) {
                break L0;
              } else {
                if (11 <= ((nb) this).field_r) {
                  break L0;
                } else {
                  var3 = -8 + ((nb) this).field_r;
                  break L0;
                }
              }
            }
            L2: {
              ee.c(-2483, 95);
              var4 = -29 / ((24 - param0) / 51);
              vd.field_b = true;
              var5 = -var3 + ((nb) this).field_r;
              if (var5 != 12) {
                if (var5 != 6) {
                  if (var5 != 7) {
                    if (var5 == 14) {
                      if (((nb) this).field_X.field_K.b((byte) -128) >= 12) {
                        break L2;
                      } else {
                        L3: {
                          var5 = (int)((double)(((nb) this).field_X.field_ab.a(-115) << 4) * Math.random());
                          var6 = -100000;
                          var7 = new mb(var5, var6, ((nb) this).field_X);
                          var8 = var2[var3];
                          if (var8 != ua.field_v) {
                            break L3;
                          } else {
                            if (t.a(rn.field_D, 49, -20370)) {
                              var8 = pg.field_z;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7.a(var8, true, false, -1, 1);
                        var7.field_Nb = 7;
                        var7.d(-28033);
                        var7.field_ab = 1000;
                        var7.field_Qb = 256;
                        ((nb) this).field_X.field_K.a(3, (ck) (Object) var7);
                        break L2;
                      }
                    } else {
                      if (8 != var5) {
                        if (var5 == 13) {
                          L4: {
                            if (fn.field_a) {
                              stackOut_50_0 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              break L4;
                            } else {
                              stackOut_49_0 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              break L4;
                            }
                          }
                          fn.field_a = stackIn_51_0 != 0;
                          if (!fn.field_a) {
                            break L2;
                          } else {
                            ue.field_b = false;
                            break L2;
                          }
                        } else {
                          vd.field_b = false;
                          break L2;
                        }
                      } else {
                        di.field_g = 0 - -var3;
                        qh.field_Yb = 0;
                        this.j((byte) -123);
                        break L2;
                      }
                    }
                  } else {
                    lc.field_e = true;
                    ea.field_k = false;
                    if (fm.field_f[0] >= 10) {
                      L5: {
                        L6: {
                          var5 = vb.field_g;
                          if (5 == var5) {
                            break L6;
                          } else {
                            if (var5 == 6) {
                              break L6;
                            } else {
                              if (var5 != 8) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var5 = gh.field_Jb;
                        break L5;
                      }
                      q.a(19, false, -1, var5);
                      break L2;
                    } else {
                      L7: {
                        L8: {
                          ol.field_Ub = fm.field_f[0];
                          ge.field_j = 0;
                          var5 = vb.field_g;
                          if (var5 == 5) {
                            break L8;
                          } else {
                            if (var5 == 6) {
                              break L8;
                            } else {
                              if (8 != var5) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        var5 = gh.field_Jb;
                        break L7;
                      }
                      q.a(20, false, -1, var5);
                      break L2;
                    }
                  }
                } else {
                  L9: {
                    L10: {
                      hl.field_v = ji.a(uc.field_b, (byte) 0, di.field_c);
                      lc.field_e = true;
                      ea.field_k = false;
                      var5 = vb.field_g;
                      if (var5 == 5) {
                        break L10;
                      } else {
                        if (var5 == 6) {
                          break L10;
                        } else {
                          if (var5 == 8) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var5 = gh.field_Jb;
                    break L9;
                  }
                  q.a(14, false, -1, var5);
                  break L2;
                }
              } else {
                int discarded$1 = 0;
                this.c();
                break L2;
              }
            }
            return;
          }
        }
    }

    private final int b(int param0, int param1) {
        if (param0 != 1) {
            ((nb) this).field_J = false;
        }
        param1 = param1 >> 8;
        param1 = param1 + (400 - ((nb) this).field_E / 16);
        return param1;
    }

    final void f(byte param0) {
        pm.field_db.g(6);
        ri.field_b = null;
        hf.field_c = 0;
        ((nb) this).field_X.field_O.g(6);
        ((nb) this).field_X.field_o.g(6);
        int discarded$0 = 10000;
        db.c();
        jh.field_h = null;
        if (param0 >= -60) {
            ((nb) this).g(109);
        }
        un.field_o = null;
        h.field_T = null;
    }

    private final int e(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          if (param0) {
            break L0;
          } else {
            this.j((byte) -91);
            break L0;
          }
        }
        var3 = uf.a(108, ce.field_t);
        var4 = 0;
        var5 = 0;
        var6 = (20 + -(52 * var3) + 640) / 2;
        var7 = -1;
        var8 = 0;
        L1: while (true) {
          if (var3 <= var4) {
            L2: {
              if (var7 < 0) {
                break L2;
              } else {
                L3: {
                  var9 = jg.field_t[var7];
                  var10 = ff.field_lb.c(var9) - -4;
                  var6 = var8 - var10 / 2;
                  if (var6 < 10) {
                    var6 = 10;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  param1 -= 4;
                  if (630 < var6 + var10) {
                    var6 = 630 + -var10;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                pb.c(var6 + -3, -ff.field_lb.field_U + (param1 + -3), var10, ff.field_lb.field_U + (ff.field_lb.field_F + 3), 0, 128);
                ff.field_lb.b(var9, var6, param1, 16777215, -1);
                break L2;
              }
            }
            return var7;
          } else {
            if (ve.a(ce.field_t, 1, var5)) {
              od.field_c[var5].d(var6, param1);
              if (var6 <= oh.field_f) {
                if (var6 - -32 > oh.field_f) {
                  if (pi.field_c >= param1) {
                    if (pi.field_c < param1 + 32) {
                      var7 = var5;
                      var8 = var6 + 16;
                      var6 += 52;
                      var4++;
                      var5++;
                      continue L1;
                    } else {
                      var6 += 52;
                      var4++;
                      var5++;
                      continue L1;
                    }
                  } else {
                    var6 += 52;
                    var4++;
                    var5++;
                    continue L1;
                  }
                } else {
                  var6 += 52;
                  var4++;
                  var5++;
                  continue L1;
                }
              } else {
                var6 += 52;
                var4++;
                var5++;
                continue L1;
              }
            } else {
              var5++;
              continue L1;
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
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
        String stackIn_29_0 = null;
        fh stackIn_51_0 = null;
        fh stackIn_52_0 = null;
        fh stackIn_53_0 = null;
        String stackIn_53_1 = null;
        fh stackIn_54_0 = null;
        fh stackIn_55_0 = null;
        fh stackIn_56_0 = null;
        String stackIn_56_1 = null;
        mb stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        mb stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        mb stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        fh stackOut_50_0 = null;
        fh stackOut_52_0 = null;
        String stackOut_52_1 = null;
        fh stackOut_51_0 = null;
        String stackOut_51_1 = null;
        fh stackOut_53_0 = null;
        fh stackOut_55_0 = null;
        String stackOut_55_1 = null;
        fh stackOut_54_0 = null;
        String stackOut_54_1 = null;
        mb stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        mb stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        mb stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        L0: {
          var18 = SteelSentinels.field_G;
          var4 = 0;
          var5 = -1;
          if (pi.field_c < -2 + param0) {
            break L0;
          } else {
            if (pi.field_c >= 12 + param0) {
              break L0;
            } else {
              if (((nb) this).field_C.field_ub >= 0) {
                if (oh.field_f >= -40 + param1) {
                  if (param1 + -13 > oh.field_f) {
                    ((nb) this).field_r = 33;
                    pb.a(param1 - 17 << 4, param0 - -6 << 4, 144, pe.field_o.length + -1, pe.field_o);
                    break L0;
                  } else {
                    if (param1 - -12 <= oh.field_f) {
                      if (oh.field_f < param1 + 40) {
                        ((nb) this).field_r = 34;
                        pb.a(16 + param1 << 4, 6 + param0 << 4, 144, pe.field_o.length + -1, pe.field_o);
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      ((nb) this).field_r = 35;
                      pb.a(-1 + param1 << 4, param0 + 6 << 4, 160, -1 + pe.field_o.length, pe.field_o);
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
          }
        }
        L1: {
          if (((nb) this).field_C.field_ub <= param2) {
            if (0 == ((nb) this).field_C.field_U) {
              var4 = 16777215;
              var5 = -1;
              break L1;
            } else {
              var5 = 16777215;
              var4 = 0;
              break L1;
            }
          } else {
            var5 = -1;
            var4 = 8388608;
            break L1;
          }
        }
        L2: {
          s.a(var4, true, true, param0 + 6, param1 - 19, var5);
          if (0 > ((nb) this).field_C.field_ub) {
            var4 = 8388608;
            var5 = -1;
            break L2;
          } else {
            if (((nb) this).field_C.field_U != 0) {
              var4 = 0;
              var5 = 16777215;
              break L2;
            } else {
              var5 = -1;
              var4 = 16777215;
              break L2;
            }
          }
        }
        L3: {
          L4: {
            if (!sn.field_o.equals((Object) (Object) "X")) {
              break L4;
            } else {
              if (!dm.field_c) {
                L5: {
                  var6 = param1 - 8;
                  var7 = 1 + param0;
                  var8 = 6 + param0;
                  var9 = 11 + param0;
                  var10 = var8 - 2;
                  var11 = var8 - -2;
                  var12 = param1 - 1;
                  var13 = param1 + 6;
                  var14 = -3 + param1;
                  var15 = param1 - -1;
                  var16 = 4;
                  if (var4 == -1) {
                    break L5;
                  } else {
                    var17 = 0;
                    L6: while (true) {
                      if (var17 > var16) {
                        break L5;
                      } else {
                        pb.d(var6 + var17, var7, var17 + (var6 - -10), var9, var4);
                        pb.d(var6 - -var17, var9, 10 + var6 - -var17, var7, var4);
                        var17++;
                        continue L6;
                      }
                    }
                  }
                }
                if (var5 == -1) {
                  break L3;
                } else {
                  pb.d(var6, var7, var14, var8, var5);
                  pb.d(var14, var8, var6, var9, var5);
                  pb.g(var6, var9, var16, var5);
                  pb.d(var16 + var6, var9, var12, var11, var5);
                  pb.d(var12, var11, -var16 + var13, var9, var5);
                  pb.g(var13 - var16, var9, var16, var5);
                  pb.d(var13, var9, var15, var8, var5);
                  pb.d(var15, var8, var13, var7, var5);
                  pb.g(var13 - var16, var7, var16, var5);
                  pb.d(-var16 + var13, var7, var12, var10, var5);
                  pb.d(var12, var10, var6 + var16, var7, var5);
                  pb.g(var6, var7, var16, var5);
                  break L3;
                }
              } else {
                break L4;
              }
            }
          }
          L7: {
            if (dm.field_c) {
              stackOut_28_0 = b.field_p;
              stackIn_29_0 = stackOut_28_0;
              break L7;
            } else {
              stackOut_27_0 = sn.field_o;
              stackIn_29_0 = stackOut_27_0;
              break L7;
            }
          }
          L8: {
            var6_ref_String = stackIn_29_0;
            if (var4 != -1) {
              pb.a(param1 - 8, param0 + 1, 15, 11, var4);
              fk.field_d.a(var6_ref_String, param1, 10 + param0, 0, -1);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            L10: {
              if (var4 == -1) {
                break L10;
              } else {
                if (0 == var4) {
                  break L10;
                } else {
                  break L9;
                }
              }
            }
            fk.field_d.a(var6_ref_String, param1, param0 + 10, 1021128, -1);
            break L9;
          }
          if (-1 != var5) {
            pb.h(param1 - 8, param0 - -1, 15, 11, var5);
            break L3;
          } else {
            break L3;
          }
        }
        L11: {
          if (((nb) this).field_C.field_ub >= 0) {
            if (((nb) this).field_C.field_U == 1) {
              var4 = 16777215;
              var5 = -1;
              break L11;
            } else {
              var5 = 16777215;
              var4 = 0;
              break L11;
            }
          } else {
            var5 = -1;
            var4 = 8388608;
            break L11;
          }
        }
        L12: {
          s.a(var4, true, false, 6 + param0, param1 + 17, var5);
          stackOut_50_0 = fk.field_d;
          stackIn_52_0 = stackOut_50_0;
          stackIn_51_0 = stackOut_50_0;
          if (!dm.field_c) {
            stackOut_52_0 = (fh) (Object) stackIn_52_0;
            stackOut_52_1 = gm.field_a;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            break L12;
          } else {
            stackOut_51_0 = (fh) (Object) stackIn_51_0;
            stackOut_51_1 = lk.field_X;
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            break L12;
          }
        }
        L13: {
          ((fh) (Object) stackIn_53_0).b(stackIn_53_1, param1 - -29, 10 + param0, 1021128, -1);
          stackOut_53_0 = fk.field_d;
          stackIn_55_0 = stackOut_53_0;
          stackIn_54_0 = stackOut_53_0;
          if (!dm.field_c) {
            stackOut_55_0 = (fh) (Object) stackIn_55_0;
            stackOut_55_1 = fm.field_i;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            break L13;
          } else {
            stackOut_54_0 = (fh) (Object) stackIn_54_0;
            stackOut_54_1 = cl.field_g;
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            break L13;
          }
        }
        L14: {
          ((fh) (Object) stackIn_56_0).c(stackIn_56_1, param1 + -29, 10 + param0, 1021128, -1);
          pb.a(0, 423, 640, 480);
          stackOut_56_0 = ((nb) this).field_C;
          stackOut_56_1 = param1;
          stackOut_56_2 = 256;
          stackIn_58_0 = stackOut_56_0;
          stackIn_58_1 = stackOut_56_1;
          stackIn_58_2 = stackOut_56_2;
          stackIn_57_0 = stackOut_56_0;
          stackIn_57_1 = stackOut_56_1;
          stackIn_57_2 = stackOut_56_2;
          if (!((nb) this).field_C.field_Lb) {
            stackOut_58_0 = (mb) (Object) stackIn_58_0;
            stackOut_58_1 = stackIn_58_1;
            stackOut_58_2 = stackIn_58_2;
            stackOut_58_3 = 0;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            stackIn_59_2 = stackOut_58_2;
            stackIn_59_3 = stackOut_58_3;
            break L14;
          } else {
            stackOut_57_0 = (mb) (Object) stackIn_57_0;
            stackOut_57_1 = stackIn_57_1;
            stackOut_57_2 = stackIn_57_2;
            stackOut_57_3 = 7;
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_59_2 = stackOut_57_2;
            stackIn_59_3 = stackOut_57_3;
            break L14;
          }
        }
        ((mb) (Object) stackIn_59_0).b(stackIn_59_1, stackIn_59_2, -stackIn_59_3 + param0, -118);
        pb.c();
    }

    private final void k() {
        int var2 = 0;
        int var3 = 0;
        ne var3_ref_ne = null;
        jc var3_ref_jc = null;
        int var4 = 0;
        mb var4_ref_mb = null;
        mb var5 = null;
        int var6 = 0;
        L0: {
          var6 = SteelSentinels.field_G;
          if (di.field_g != 7) {
            break L0;
          } else {
            if (dl.field_M != 1) {
              break L0;
            } else {
              if (!((nb) this).field_X.f(-122)) {
                break L0;
              } else {
                dl.field_M = dl.field_M + 1;
                break L0;
              }
            }
          }
        }
        tj.field_c = 0;
        var2 = ec.field_c[di.field_g];
        if (~dl.field_M > ~var2) {
          L1: {
            dl.field_M = dl.field_M + 1;
            sh.field_d = 0;
            if (di.field_g != 1) {
              break L1;
            } else {
              if (6 == dl.field_M) {
                dl.field_M = dl.field_M + 1;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (var2 > dl.field_M) {
              break L2;
            } else {
              ((nb) this).field_X.field_j = true;
              if (nc.field_a < 0) {
                nc.field_a = 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (~dl.field_M < ~qh.field_Yb) {
              L4: {
                qh.field_Yb = dl.field_M;
                qd.field_g = 500;
                var3 = di.field_g;
                if (0 == var3) {
                  var3 = qh.field_Yb;
                  if (var3 == 4) {
                    var3 = 52000;
                    var4 = -23000;
                    var5 = new mb(var3, var4, ((nb) this).field_X);
                    var5.a(va.field_f, true, false, -1, 1);
                    var5.field_Nb = 6;
                    var5.field_pc = false;
                    ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                    break L3;
                  } else {
                    if (var3 == 7) {
                      var3 = 126000;
                      var4 = -25000;
                      var5 = new mb(var3, var4, ((nb) this).field_X);
                      var5.a(va.field_f, true, false, -1, 1);
                      var5.field_pc = false;
                      var5.field_Nb = 6;
                      var3 = 166000;
                      var4 = -30000;
                      ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                      var5 = new mb(var3, var4, ((nb) this).field_X);
                      var5.a(va.field_f, true, false, -1, 1);
                      var5.field_pc = false;
                      var5.field_Nb = 6;
                      var4 = -40000;
                      var3 = 221000;
                      ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                      var5 = new mb(var3, var4, ((nb) this).field_X);
                      var5.a(va.field_f, true, false, -1, 1);
                      var5.field_pc = false;
                      var5.field_Nb = 6;
                      ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                      break L3;
                    } else {
                      if (var3 == 9) {
                        var3 = 180000;
                        var4 = -30000;
                        var5 = new mb(var3, var4, ((nb) this).field_X);
                        var5.a(va.field_f, true, false, -1, 1);
                        var5.field_Nb = 1;
                        var5.field_pc = false;
                        ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                        break L3;
                      } else {
                        if (var3 == 10) {
                          var3 = 25000;
                          var4 = -100000;
                          var5 = new mb(var3, var4, ((nb) this).field_X);
                          var5.field_ab = -100;
                          var5.a(va.field_f, true, false, -1, 1);
                          var5.field_Nb = 9;
                          var5.field_pc = false;
                          ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                          var3 = 96000;
                          var5 = new mb(var3, var4, ((nb) this).field_X);
                          var5.a(va.field_f, true, false, -1, 1);
                          var5.field_Nb = 9;
                          var5.field_pc = false;
                          ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                          var3 = 166000;
                          var5 = new mb(var3, var4, ((nb) this).field_X);
                          var5.a(va.field_f, true, false, -1, 1);
                          var5.field_Nb = 9;
                          var5.field_pc = false;
                          ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                          var3 = 228000;
                          var4 = -4000;
                          var5 = new mb(var3, var4, ((nb) this).field_X);
                          var5.a(va.field_f, true, false, -1, 1);
                          var5.field_Nb = 9;
                          var5.field_pc = false;
                          var5.field_u = true;
                          ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                          break L3;
                        } else {
                          if (11 != var3) {
                            break L3;
                          } else {
                            mj.a(0, 0, 1200, 0, 0, 0, 0, (byte) -65);
                            if (0 != vn.field_o) {
                              break L4;
                            } else {
                              vn.field_o = 1;
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  L5: {
                    if (var3 == 1) {
                      var3 = qh.field_Yb;
                      if (var3 != 2) {
                        if (var3 == 3) {
                          L6: {
                            var3_ref_ne = new ne(((nb) this).field_X, 22);
                            if (((nb) this).field_C.field_hc <= 203000) {
                              var3_ref_ne.field_z = 225000;
                              break L6;
                            } else {
                              var3_ref_ne.field_z = 187000;
                              break L6;
                            }
                          }
                          var3_ref_ne.field_I = -100000;
                          var3_ref_ne.field_E = false;
                          var3_ref_ne.field_S = 500;
                          var3_ref_ne.field_F = 2147483647;
                          var3_ref_ne.field_K = 2147483647;
                          ((nb) this).field_X.field_e.a(3, (ck) (Object) var3_ref_ne);
                          break L3;
                        } else {
                          if (var3 != 4) {
                            if (var3 != 5) {
                              if (var3 != 7) {
                                if (var3 == 9) {
                                  var4 = -100000;
                                  var3 = 25000;
                                  var5 = new mb(var3, var4, ((nb) this).field_X);
                                  var5.field_ab = -100;
                                  var5.a(va.field_f, true, false, -1, 1);
                                  var5.field_Nb = 9;
                                  var5.field_pc = false;
                                  var5.field_o = 7;
                                  var3 = 96000;
                                  ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                  var5 = new mb(var3, var4, ((nb) this).field_X);
                                  var5.a(va.field_f, true, false, -1, 1);
                                  var5.field_o = 7;
                                  var5.field_Nb = 9;
                                  var5.field_pc = false;
                                  ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                  var3 = 166000;
                                  var5 = new mb(var3, var4, ((nb) this).field_X);
                                  var5.a(va.field_f, true, false, -1, 1);
                                  var5.field_o = 7;
                                  var5.field_Nb = 9;
                                  var5.field_pc = false;
                                  ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                  var4 = -4000;
                                  var3 = 228000;
                                  var5 = new mb(var3, var4, ((nb) this).field_X);
                                  var5.a(va.field_f, true, false, -1, 1);
                                  var5.field_o = 7;
                                  var5.field_Nb = 9;
                                  var5.field_pc = false;
                                  var5.field_u = true;
                                  ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                  break L3;
                                } else {
                                  if (var3 == 10) {
                                    int discarded$1 = 0;
                                    this.c();
                                    break L3;
                                  } else {
                                    if (var3 == 11) {
                                      this.j((byte) -123);
                                      je.field_o = 150;
                                      hb.field_f = false;
                                      fk.field_c = true;
                                      var3 = 147000;
                                      var4 = -150000;
                                      var5 = new mb(var3, var4, ((nb) this).field_X);
                                      var5.a(in.field_j, true, false, -1, 1);
                                      var5.field_pc = false;
                                      var5.field_Lb = true;
                                      var5.field_Nb = 3;
                                      var5.field_ab = 2000;
                                      ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                      var5.field_o = -2;
                                      break L3;
                                    } else {
                                      if (12 == var3) {
                                        ((nb) this).field_C.field_U = 0;
                                        var3_ref_jc = new jc(((nb) this).field_X.field_K);
                                        var4_ref_mb = (mb) (Object) var3_ref_jc.b(2);
                                        L7: while (true) {
                                          if (var4_ref_mb == null) {
                                            break L5;
                                          } else {
                                            var4_ref_mb.field_o = -1;
                                            var4_ref_mb = (mb) (Object) var3_ref_jc.d(2);
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (13 == var3) {
                                          break L4;
                                        } else {
                                          if (var3 != 14) {
                                            break L4;
                                          } else {
                                            mj.a(0, 0, 1200, 1, 0, 0, 0, (byte) -65);
                                            break L3;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (!((nb) this).field_X.f(-102)) {
                                  break L4;
                                } else {
                                  var4 = -100000;
                                  var3 = 17000;
                                  var5 = new mb(var3, var4, ((nb) this).field_X);
                                  var5.a(va.field_f, true, false, -1, 1);
                                  var5.field_Nb = 1;
                                  var5.field_pc = false;
                                  var5.field_o = 7;
                                  ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                  break L3;
                                }
                              }
                            } else {
                              var4 = -100000;
                              var3 = 17000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.a(va.field_f, true, false, -1, 1);
                              var5.field_Nb = 1;
                              var5.field_o = 7;
                              var5.field_pc = false;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              break L3;
                            }
                          } else {
                            var3 = 102000;
                            var4 = -100000;
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.a(va.field_f, true, false, -1, 1);
                            var5.field_Nb = 1;
                            var5.field_o = 7;
                            var5.field_pc = false;
                            var3 = 67000;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.a(va.field_f, true, false, -1, 1);
                            var5.field_o = 7;
                            var5.field_pc = false;
                            var5.field_Nb = 1;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            break L3;
                          }
                        }
                      } else {
                        var3 = 122000;
                        var4 = -25000;
                        var5 = new mb(var3, var4, ((nb) this).field_X);
                        var5.a(va.field_f, true, false, -1, 1);
                        var5.field_Nb = 1;
                        var5.field_pc = false;
                        var5.field_o = 7;
                        ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                        break L3;
                      }
                    } else {
                      if (var3 == 7) {
                        var3 = qh.field_Yb;
                        if (var3 == 1) {
                          var4 = -100000;
                          var3 = 20000;
                          var5 = new mb(var3, var4, ((nb) this).field_X);
                          var5.field_ab = -100;
                          var5.a(va.field_f, true, false, -1, 1);
                          var5.field_rb = 1;
                          var5.field_o = 20;
                          var5.field_Eb = 1;
                          var5.field_Nb = 1;
                          var5.field_pc = false;
                          ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                          break L3;
                        } else {
                          if (4 == var3) {
                            var3 = 142000;
                            var4 = -100000;
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.a(va.field_f, true, false, -1, 1);
                            var5.field_pc = false;
                            var5.field_Nb = 1;
                            var5.field_o = 13;
                            var3 = 102000;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.a(va.field_f, true, false, -1, 1);
                            var5.field_pc = false;
                            var5.field_o = 13;
                            var5.field_Nb = 1;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var3 = 67000;
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.a(va.field_f, true, false, -1, 1);
                            var5.field_Nb = 1;
                            var5.field_pc = false;
                            var5.field_o = 13;
                            var3 = 49000;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.a(va.field_f, true, false, -1, 1);
                            var5.field_o = 13;
                            var5.field_pc = false;
                            var5.field_Nb = 1;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            break L3;
                          } else {
                            if (var3 == 5) {
                              je.field_o = 150;
                              hb.field_f = false;
                              fk.field_c = true;
                              var4 = -100000;
                              var3 = 142000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.a(va.field_f, true, false, -1, 1);
                              var5.field_Nb = 9;
                              var5.field_pc = false;
                              var3 = 102000;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.a(va.field_f, true, false, -1, 1);
                              var5.field_pc = false;
                              var5.field_Nb = 9;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var3 = 67000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.a(va.field_f, true, false, -1, 1);
                              var5.field_Nb = 9;
                              var5.field_pc = false;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var3 = 49000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.a(va.field_f, true, false, -1, 1);
                              var5.field_pc = false;
                              var5.field_Nb = 9;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              break L3;
                            } else {
                              if (var3 == 6) {
                                mj.a(0, 0, 1200, 7, 0, 0, 0, (byte) -65);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        if (var3 == 3) {
                          var3 = qh.field_Yb;
                          if (var3 == 4) {
                            var4 = -100000;
                            var3 = 25000;
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.field_ab = -100;
                            var5.a(qm.field_d, true, false, -1, 1);
                            var5.field_pc = false;
                            var5.field_Nb = 2;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var3 = 105000;
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.field_ab = -100;
                            var5.a(qm.field_d, true, false, -1, 1);
                            var5.field_pc = false;
                            var5.field_Nb = 2;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var3 = 205000;
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.field_ab = -100;
                            var5.a(qm.field_d, true, false, -1, 1);
                            var5.field_pc = false;
                            var5.field_Nb = 2;
                            var3 = 305000;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.field_ab = -100;
                            var5.a(qm.field_d, true, false, -1, 1);
                            var5.field_pc = false;
                            var5.field_Nb = 2;
                            var3 = 405000;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            var5 = new mb(var3, var4, ((nb) this).field_X);
                            var5.field_ab = -100;
                            var5.a(qm.field_d, true, false, -1, 1);
                            var5.field_Nb = 2;
                            var5.field_pc = false;
                            ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                            break L3;
                          } else {
                            if (var3 == 5) {
                              var4 = -100000;
                              var3 = 25000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.field_ab = -100;
                              var5.a(qm.field_d, true, false, -1, 1);
                              var5.field_Nb = 2;
                              var5.field_rb = 1;
                              var5.field_pc = false;
                              var5.field_Eb = 1;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var3 = 105000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.field_ab = -100;
                              var5.a(qm.field_d, true, false, -1, 1);
                              var5.field_Nb = 2;
                              var5.field_pc = false;
                              var5.field_Eb = 1;
                              var5.field_rb = 1;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var3 = 205000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.field_ab = -100;
                              var5.a(qm.field_d, true, false, -1, 1);
                              var5.field_Nb = 2;
                              var5.field_Eb = 1;
                              var5.field_rb = 1;
                              var5.field_pc = false;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var3 = 305000;
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.field_ab = -100;
                              var5.a(qm.field_d, true, false, -1, 1);
                              var5.field_rb = 1;
                              var5.field_Nb = 2;
                              var5.field_pc = false;
                              var5.field_Eb = 1;
                              var3 = 405000;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              var5 = new mb(var3, var4, ((nb) this).field_X);
                              var5.field_ab = -100;
                              var5.a(qm.field_d, true, false, -1, 1);
                              var5.field_Eb = 1;
                              var5.field_pc = false;
                              var5.field_rb = 1;
                              var5.field_Nb = 2;
                              ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                              break L3;
                            } else {
                              if (var3 == 6) {
                                mj.a(0, 0, 1200, 3, 0, 0, 0, (byte) -65);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                        } else {
                          if (var3 != 5) {
                            if (var3 == 9) {
                              var3 = qh.field_Yb;
                              if (var3 == 1) {
                                var4 = -100000;
                                var3 = 20000;
                                var5 = new mb(var3, var4, ((nb) this).field_X);
                                var5.field_ab = -100;
                                var5.a(va.field_f, true, false, -1, -1);
                                var5.field_Nb = 9;
                                var5.field_pc = false;
                                var5.field_o = 0;
                                ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                break L3;
                              } else {
                                if (var3 == 3) {
                                  var4 = -100000;
                                  var3 = 20000;
                                  var5 = new mb(var3, var4, ((nb) this).field_X);
                                  var5.field_ab = -100;
                                  var5.a(eb.field_o, true, false, -1, -1);
                                  var5.field_Nb = 7;
                                  var5.field_o = 7;
                                  var5.field_pc = false;
                                  ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                  break L3;
                                } else {
                                  if (var3 == 5) {
                                    var3 = 25000;
                                    var4 = -100000;
                                    var5 = new mb(var3, var4, ((nb) this).field_X);
                                    var5.field_ab = -100;
                                    var5.a(bb.field_S, true, false, -1, 1);
                                    var5.field_Nb = 2;
                                    var5.field_pc = false;
                                    var3 = 105000;
                                    ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                    var5 = new mb(var3, var4, ((nb) this).field_X);
                                    var5.field_ab = -100;
                                    var5.a(bb.field_S, true, false, -1, 1);
                                    var5.field_Nb = 2;
                                    var5.field_pc = false;
                                    var3 = 205000;
                                    ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                    var5 = new mb(var3, var4, ((nb) this).field_X);
                                    var5.field_ab = -100;
                                    var5.a(bb.field_S, true, false, -1, 1);
                                    var5.field_Nb = 2;
                                    var5.field_pc = false;
                                    ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                    break L3;
                                  } else {
                                    if (var3 != 6) {
                                      break L4;
                                    } else {
                                      mj.a(0, 0, 1200, 9, 0, 0, 0, (byte) -65);
                                      break L3;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            var3 = qh.field_Yb;
                            if (var3 == 1) {
                              var3_ref_jc = new jc(((nb) this).field_X.field_K);
                              var4_ref_mb = (mb) (Object) var3_ref_jc.b(2);
                              L8: while (true) {
                                if (var4_ref_mb == null) {
                                  break L5;
                                } else {
                                  var4_ref_mb.field_o = -1;
                                  var4_ref_mb = (mb) (Object) var3_ref_jc.d(2);
                                  continue L8;
                                }
                              }
                            } else {
                              if (2 == var3) {
                                fk.field_c = true;
                                hb.field_f = false;
                                je.field_o = 150;
                                var4 = -100000;
                                var3 = 25000;
                                var5 = new mb(var3, var4, ((nb) this).field_X);
                                var5.field_ab = -100;
                                var5.a(qm.field_d, true, false, -1, 1);
                                var5.field_Nb = 2;
                                var5.field_pc = false;
                                var5.field_o = 4;
                                var3 = 105000;
                                ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                var5 = new mb(var3, var4, ((nb) this).field_X);
                                var5.field_ab = -100;
                                var5.a(qm.field_d, true, false, -1, 1);
                                var5.field_o = 4;
                                var5.field_pc = false;
                                var5.field_Nb = 2;
                                ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                var3 = 205000;
                                var5 = new mb(var3, var4, ((nb) this).field_X);
                                var5.field_ab = -100;
                                var5.a(qm.field_d, true, false, -1, 1);
                                var5.field_pc = false;
                                var5.field_o = 4;
                                var5.field_Nb = 2;
                                ((nb) this).field_X.field_K.a(3, (ck) (Object) var5);
                                break L3;
                              } else {
                                if (var3 == 3) {
                                  mj.a(0, 0, 1200, 5, 0, 0, 0, (byte) -65);
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  break L3;
                }
              }
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        mb[] var3 = null;
        int var4 = 0;
        jc var5 = null;
        mb var6_ref_mb = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mb var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SteelSentinels.field_G;
          var2 = ((nb) this).field_X.field_kb - -((nb) this).field_X.field_Q;
          if (((nb) this).field_X.field_A < 0) {
            break L0;
          } else {
            var2++;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((nb) this).field_B == null) {
              break L2;
            } else {
              if (((nb) this).field_B.length != var2) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          ((nb) this).field_B = new int[var2];
          break L1;
        }
        var3 = new mb[var2];
        var4 = 0;
        var5 = new jc(((nb) this).field_X.field_K);
        var6_ref_mb = (mb) (Object) var5.b(2);
        L3: while (true) {
          if (var6_ref_mb == null) {
            L4: {
              if (var4 >= var2) {
                break L4;
              } else {
                var2 = var4;
                break L4;
              }
            }
            var6 = 0;
            L5: while (true) {
              if (var2 + -1 <= var6) {
                L6: {
                  var7 = 0;
                  if (((nb) this).field_C == null) {
                    break L6;
                  } else {
                    if (((nb) this).field_C == var3[0]) {
                      break L6;
                    } else {
                      if (var3[1] == ((nb) this).field_C) {
                        break L6;
                      } else {
                        var6 = 2;
                        L7: while (true) {
                          if (var6 >= var2) {
                            break L6;
                          } else {
                            if (((nb) this).field_C == var3[var6]) {
                              var3[var6] = var3[1];
                              var3[1] = ((nb) this).field_C;
                              var6++;
                              continue L7;
                            } else {
                              var6++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var6 = 0;
                L8: while (true) {
                  if (var2 <= var6) {
                    return;
                  } else {
                    L9: {
                      var10 = var3[var6].field_Bb;
                      if (var10 == ((nb) this).field_X.field_A) {
                        var10 = var3.length + -1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var7 > ((nb) this).field_B[var10]) {
                        ((nb) this).field_B[var10] = ((nb) this).field_B[var10] + 1;
                        break L10;
                      } else {
                        if (var7 >= ((nb) this).field_B[var10]) {
                          break L10;
                        } else {
                          ((nb) this).field_B[var10] = ((nb) this).field_B[var10] - 1;
                          break L10;
                        }
                      }
                    }
                    if (var6 < 2) {
                      var7 += 9;
                      var6++;
                      continue L8;
                    } else {
                      var6++;
                      continue L8;
                    }
                  }
                }
              } else {
                var7 = var6;
                var8 = var6;
                L11: while (true) {
                  if (var8 >= var2) {
                    if (var6 != var7) {
                      var9 = var3[var6];
                      var3[var6] = var3[var7];
                      var3[var7] = var9;
                      var6++;
                      continue L5;
                    } else {
                      var6++;
                      continue L5;
                    }
                  } else {
                    if (var3[var8].field_vb - var3[var8].field_Ab > var3[var7].field_vb + -var3[var7].field_Ab) {
                      var7 = var8;
                      var8++;
                      continue L11;
                    } else {
                      var8++;
                      continue L11;
                    }
                  }
                }
              }
            }
          } else {
            L12: {
              L13: {
                if (var6_ref_mb.field_Bb < 0) {
                  break L13;
                } else {
                  if (var6_ref_mb.field_Bb < ((nb) this).field_X.field_kb + ((nb) this).field_X.field_Q) {
                    int incrementValue$2 = var4;
                    var4++;
                    var3[incrementValue$2] = var6_ref_mb;
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              if (var6_ref_mb.field_Bb != ((nb) this).field_X.field_A) {
                break L12;
              } else {
                if (var6_ref_mb.field_Hb) {
                  break L12;
                } else {
                  int incrementValue$3 = var4;
                  var4++;
                  var3[incrementValue$3] = var6_ref_mb;
                  break L12;
                }
              }
            }
            var6_ref_mb = (mb) (Object) var5.d(2);
            continue L3;
          }
        }
    }

    private final void a(int param0, int param1, int param2, mb param3, int param4, int param5, int param6) {
        int var9_int = 0;
        RuntimeException var9 = null;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
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
        try {
          L0: {
            L1: {
              var9_int = 82;
              pb.c(param5, param6, 100, var9_int, 0, 150);
              pb.c(param5, param6 - -var9_int + 4, 100, 20, 0, 150);
              var10 = ((nb) this).field_X.d(-1661904765, param3.field_Bb);
              if (var10 == null) {
                break L1;
              } else {
                pb.c(param5, 8 + (param6 - (-var9_int + -20)), 100, 20, 0, 150);
                break L1;
              }
            }
            L2: {
              var11 = hj.field_w;
              var12 = -4 + Math.min(100, var9_int);
              hj.field_w = 6400 * var12 / param0;
              pb.a(param5, param6, 100 + param5, var9_int + param6);
              param3.field_Zb.a(0, true, 50 + param5, -6 + var9_int + param6, (byte) 49, 0);
              fl.a(100, param3, (byte) -98, var9_int, param5, param6);
              pb.c();
              hj.field_w = var11;
              if (param4 == qd.field_t[0]) {
                param4 = uj.a(param4, 93);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var13 = var9_int + param6 + (4 + (20 + pl.field_U.field_U) / 2);
              if (var10 == null) {
                break L3;
              } else {
                L4: {
                  var14 = (Object) (Object) pl.field_U;
                  var15 = ((mi) var14).c(var10);
                  if (var15 <= 100) {
                    break L4;
                  } else {
                    L5: {
                      var14 = (Object) (Object) ff.field_lb;
                      var15 = ((mi) var14).c(var10);
                      if (var15 > 100) {
                        var14 = (Object) (Object) fk.field_d;
                        var15 = ((mi) var14).c(var10);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var15 <= 100) {
                      break L4;
                    } else {
                      var10 = bg.a(var10, 100, (byte) -45, (mi) var14);
                      var14 = (Object) (Object) var10;
                      var14 = (Object) (Object) var10;
                      break L4;
                    }
                  }
                }
                ((mi) var14).a(var10, param5 + 50, var13, param4, 0);
                var13 += 24;
                break L3;
              }
            }
            L6: {
              if (param2 == 5) {
                break L6;
              } else {
                this.a(95, false, true, true);
                break L6;
              }
            }
            L7: {
              var14 = null;
              var15 = ul.a((byte) -59, param3.field_Zb.field_N);
              if (var15 < 0) {
                break L7;
              } else {
                if (var15 >= cd.field_c.length) {
                  break L7;
                } else {
                  var14 = (Object) (Object) cd.field_c[var15];
                  break L7;
                }
              }
            }
            L8: {
              if (var14 == null) {
                break L8;
              } else {
                pl.field_U.a((String) var14, param5 + 50, var13, param4, 0);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var9 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var9;
            stackOut_21_1 = new StringBuilder().append("nb.NA(").append(param0).append(44).append(100).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + 130 + 41);
        }
    }

    private final void j(byte param0) {
        int var2_int = 0;
        mb var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        int discarded$1 = 0;
        this.c();
        ((nb) this).field_C.field_Qb = 250;
        if (param0 == -123) {
          L0: {
            qd.field_g = 500;
            ((nb) this).field_C.field_U = 0;
            if (di.field_g != 1) {
              break L0;
            } else {
              if (qh.field_Yb == 11) {
                ((nb) this).field_X.field_ab.a(param0 + 1323, ((nb) this).field_X.field_kb, 16);
                ((nb) this).field_C.a(ua.field_x, true, false, 0, 0);
                ((nb) this).field_C.field_Gb = -100000;
                ((nb) this).field_C.field_hc = 31000;
                ((nb) this).field_C.field_ab = 3000;
                ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                ((nb) this).field_C.field_u = true;
                ((nb) this).field_C.field_E = 1;
                ((nb) this).field_C.field_pc = false;
                ((nb) this).field_C.field_Qb = -1;
                ((nb) this).field_C.field_K = 0;
                nh.a(true, ((nb) this).field_C);
                ((nb) this).field_E = 1024;
                ((nb) this).field_P = 0;
                ((nb) this).field_C.field_J = 0;
                var2 = ((nb) this).field_C;
                var2.field_r = 0;
                return;
              } else {
                break L0;
              }
            }
          }
          L1: {
            qh.field_Yb = 0;
            dl.field_M = 0;
            var2_int = di.field_g;
            if (0 == var2_int) {
              ((nb) this).field_C.a(ua.field_C[0], true, false, 0, 0);
              ((nb) this).field_C.field_Gb = -100000;
              ((nb) this).field_C.field_hc = 92000;
              ((nb) this).field_P = 1024;
              ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
              ((nb) this).field_E = 1024;
              ((nb) this).field_C.field_ab = 3000;
              break L1;
            } else {
              if (var2_int == 1) {
                ((nb) this).field_C.a(ua.field_C[1], true, false, 0, 0);
                ((nb) this).field_C.field_hc = 218000;
                ((nb) this).field_C.field_Gb = -40000;
                ((nb) this).field_P = 4000;
                ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                ((nb) this).field_E = 1024;
                break L1;
              } else {
                if (var2_int == 7) {
                  ((nb) this).field_C.a(ua.field_C[7], true, false, 0, 0);
                  ((nb) this).field_C.field_Gb = -40000;
                  ((nb) this).field_C.field_hc = 218000;
                  ((nb) this).field_E = 1024;
                  ((nb) this).field_C.field_ab = 0;
                  ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                  ((nb) this).field_P = 4000;
                  break L1;
                } else {
                  if (var2_int == 3) {
                    ((nb) this).field_C.a(ua.field_C[3], true, false, 0, 0);
                    ((nb) this).field_C.field_hc = 108000;
                    ((nb) this).field_C.field_Gb = -40000;
                    ((nb) this).field_P = 1000;
                    ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                    ((nb) this).field_E = 1024;
                    break L1;
                  } else {
                    if (var2_int == 5) {
                      ((nb) this).field_C.a(ua.field_C[5], true, false, 0, 0);
                      ((nb) this).field_C.field_Gb = -40000;
                      ((nb) this).field_C.field_hc = 200000;
                      ((nb) this).field_P = 4000;
                      ((nb) this).field_E = 1024;
                      ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                      var3 = 109000;
                      var4 = -16000;
                      var2 = new mb(0, 0, ((nb) this).field_X);
                      var2.a(va.field_f, true, false, -1, 1);
                      var2.field_o = -2;
                      var2.field_Nb = 1;
                      var2.field_hc = var3;
                      var2.field_pc = false;
                      var2.field_Gb = var4;
                      var3 = 77000;
                      ((nb) this).field_X.field_K.a(3, (ck) (Object) var2);
                      var4 = -4000;
                      var2 = new mb(0, 0, ((nb) this).field_X);
                      var2.a(va.field_f, true, false, -1, 1);
                      var2.field_hc = var3;
                      var2.field_pc = false;
                      var2.field_Gb = var4;
                      var2.field_Nb = 1;
                      var2.field_o = -2;
                      ((nb) this).field_X.field_K.a(3, (ck) (Object) var2);
                      break L1;
                    } else {
                      if (var2_int != 9) {
                        break L1;
                      } else {
                        ((nb) this).field_C.a(ua.field_C[9], true, false, 0, 0);
                        ((nb) this).field_C.field_hc = 218000;
                        ((nb) this).field_C.field_Gb = -40000;
                        ((nb) this).field_E = 1024;
                        ((nb) this).field_C.field_ab = 0;
                        ((nb) this).field_P = 4000;
                        ((nb) this).field_C.field_fc = ((nb) this).field_C.field_Gb;
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          var2 = ((nb) this).field_C;
          ((nb) this).field_C.field_J = 0;
          var2.field_r = 0;
          return;
        } else {
          return;
        }
    }

    public static void b() {
        field_m = null;
        field_x = null;
        field_T = null;
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        hd var4 = null;
        int var5 = 0;
        wk[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        wk[] stackIn_21_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        wk[] stackOut_20_0 = null;
        wk[] stackOut_19_0 = null;
        L0: {
          sb.field_bb.b((byte) 121);
          if (!jc.a(param1 + 23)) {
            if (param0) {
              if (!jn.field_g) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_8_0;
          if (param1 == -21) {
            break L1;
          } else {
            nb.b(-25, false);
            break L1;
          }
        }
        L2: {
          var4 = ((nb) this).field_X.field_ab;
          this.a((byte) 125, true, true, var4);
          this.a(-105, true, var3 != 0, true);
          int discarded$1 = this.a(true, var4, true, (byte) -110);
          pb.c(0, 0, 640, 480, 0, 128);
          pb.h(218, 198, 204, 44, 16777215);
          pb.c(220, 200, ((nb) this).field_X.field_r * 200 / ((nb) this).field_w, 40, 4473924, 128);
          pl.field_U.a(eb.field_q + " " + ((nb) this).field_X.field_r * 100 / ((nb) this).field_w + "%", 320, pl.field_U.field_U / 2 + 220, 16777215, 0);
          pl.field_U.a(rb.field_b, 320, 220 + pl.field_U.field_U / 2 + 40, 16777215, 0);
          this.b(true, 1956917985);
          if (((nb) this).field_d) {
            L3: {
              if (bb.field_T) {
                if (param0) {
                  stackOut_16_0 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_18_0 = stackOut_15_0;
                  break L3;
                }
              } else {
                stackOut_13_0 = 0;
                stackIn_18_0 = stackOut_13_0;
                break L3;
              }
            }
            L4: {
              var5 = stackIn_18_0;
              if (var5 != 0) {
                stackOut_20_0 = tk.field_t;
                stackIn_21_0 = stackOut_20_0;
                break L4;
              } else {
                stackOut_19_0 = co.field_d;
                stackIn_21_0 = stackOut_19_0;
                break L4;
              }
            }
            L5: {
              var6 = stackIn_21_0;
              var7 = var6[2].field_A + (var6[0].field_A + (int)jl.field_c);
              var8 = 24;
              var9 = 356;
              if (!vl.field_v) {
                if (-var8 + qc.field_V.field_cb < var9) {
                  var9 = qc.field_V.field_cb - var8;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                L6: {
                  var9 = qc.field_V.field_cb + -var8;
                  if (var9 < 336) {
                    var9 = 336;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (var9 <= 356) {
                  break L5;
                } else {
                  var9 = 356;
                  break L5;
                }
              }
            }
            L7: {
              pb.c(0, var9, var7, var8, 0, 192);
              hb.a((byte) 115, var6, var7, var9, 0, var8);
              if (oh.field_f < 0) {
                break L7;
              } else {
                if (var7 <= oh.field_f) {
                  break L7;
                } else {
                  if (pi.field_c < var9) {
                    break L7;
                  } else {
                    if (pi.field_c < var8 + var9) {
                      vd.field_b = true;
                      ((nb) this).field_r = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            L8: {
              var10 = new int[4];
              pb.b(var10);
              if (null == hj.field_s) {
                break L8;
              } else {
                fk.field_d.c(hj.field_s.toUpperCase(), (int)jl.field_c + var6[0].field_A, 3 + (var9 + (-var6[6].field_F + var8)), ((nb) this).field_M[0], -1);
                break L8;
              }
            }
            pb.a(var10);
            break L2;
          } else {
            break L2;
          }
        }
    }

    final static void b(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        va.field_b = param0;
        if (wa.field_p != an.field_h) {
            var2 = an.field_h * an.field_h;
            var3 = var2 + -(wa.field_p * wa.field_p);
            param0 = param0 + var3 * (-param0 + jn.field_c) / var2;
        }
        qc.field_V.a(0, param0, 120, me.field_e, 640);
        nm.a(da.field_g, 0, va.field_e, 5, jn.field_c - 24, 640, 115);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        Object var6_ref = null;
        je var6_ref_je = null;
        int var6 = 0;
        je var7 = null;
        int var7_int = 0;
        int var8_int = 0;
        je var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        double var15_double = 0.0;
        int var16_int = 0;
        nk var16_ref_nk = null;
        double var16 = 0.0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int stackIn_100_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_264_0 = 0;
        int stackIn_272_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_263_0 = 0;
        int stackOut_262_0 = 0;
        int stackOut_271_0 = 0;
        int stackOut_270_0 = 0;
        L0: {
          var6_ref = null;
          var20 = SteelSentinels.field_G;
          if (param2 == 0) {
            break L0;
          } else {
            cf.field_q = -1;
            l.field_g = -1;
            break L0;
          }
        }
        L1: {
          L2: {
            if (lb.field_gc != 1) {
              break L2;
            } else {
              if (param2 != 2) {
                break L2;
              } else {
                if (null == ((nb) this).field_u) {
                  break L2;
                } else {
                  L3: {
                    var5 = ((nb) this).field_X.field_r + vk.field_h[((nb) this).field_X.field_c];
                    var6_ref_je = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                    if (var6_ref_je == null) {
                      break L3;
                    } else {
                      if (var6_ref_je.field_r <= var5) {
                        break L3;
                      } else {
                        var5 = var6_ref_je.field_r;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 >= 500 + ((nb) this).field_X.field_r) {
                      break L4;
                    } else {
                      pc discarded$4 = fc.a((byte) 101, 69, -1);
                      if (((nb) this).field_C.i(16, -27)) {
                        L5: {
                          var7 = new je(5, ((nb) this).field_u.field_Bb, var5);
                          var7.field_y = param1;
                          var7.field_u = param3;
                          if (!((nb) this).field_d) {
                            var7.field_p = true;
                            break L5;
                          } else {
                            mm.field_g.a(64, (byte) -117);
                            mm.field_g.a((byte) 126, 5);
                            mm.field_g.a((byte) 112, ((nb) this).field_u.field_Bb);
                            mm.field_g.b(true, var5);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (di.field_g != -1) {
                              break L7;
                            } else {
                              if (1 != ((nb) this).field_X.field_c) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((nb) this).field_C.field_B.a(3, (ck) (Object) var7);
                          break L6;
                        }
                        pc discarded$5 = fc.a((byte) 59, 26, -1);
                        break L4;
                      } else {
                        break L1;
                      }
                    }
                  }
                  break L1;
                }
              }
            }
          }
          L8: {
            if (param2 != 2) {
              break L8;
            } else {
              if (lb.field_gc != 2) {
                break L8;
              } else {
                if (!tj.field_a) {
                  break L8;
                } else {
                  L9: {
                    var5 = ((nb) this).field_X.field_r + vk.field_h[((nb) this).field_X.field_c];
                    var6_ref_je = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                    if (var6_ref_je != null) {
                      if (~var6_ref_je.field_r < ~var5) {
                        var5 = var6_ref_je.field_r;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    var7 = new je(12, 0, var5);
                    if (((nb) this).field_d) {
                      mm.field_g.a(64, (byte) -117);
                      mm.field_g.a((byte) 111, 12);
                      mm.field_g.a((byte) 123, 0);
                      mm.field_g.b(true, var5);
                      mm.field_g.b(true, 0);
                      mm.field_g.b(true, 0);
                      mm.field_g.b(true, 0);
                      break L10;
                    } else {
                      var7.field_p = true;
                      break L10;
                    }
                  }
                  L11: {
                    if (di.field_g != -1) {
                      break L11;
                    } else {
                      if (((nb) this).field_X.field_c == 1) {
                        break L1;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ((nb) this).field_C.field_B.a(3, (ck) (Object) var7);
                  break L1;
                }
              }
            }
          }
          if (param2 != 2) {
            break L1;
          } else {
            if (null != ((nb) this).field_u) {
              L12: {
                var5 = ((nb) this).field_X.field_r - -vk.field_h[((nb) this).field_X.field_c];
                var6_ref_je = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                if (var6_ref_je == null) {
                  break L12;
                } else {
                  if (var6_ref_je.field_r > var5) {
                    var5 = var6_ref_je.field_r;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              if (var5 < kh.field_x + ((nb) this).field_X.field_r) {
                qg.field_n = new je(5, ((nb) this).field_u.field_Bb, var5);
                break L1;
              } else {
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
        L13: {
          L14: {
            if (null == ((nb) this).field_C) {
              break L14;
            } else {
              L15: {
                if (1 == lb.field_gc) {
                  break L15;
                } else {
                  if (0 == (1 & sf.field_d)) {
                    break L14;
                  } else {
                    if (vd.field_b) {
                      break L14;
                    } else {
                      if (0 < um.field_X) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                }
              }
              if (((nb) this).field_F < 0) {
                break L14;
              } else {
                if (~((nb) this).field_C.field_Xb.length >= ~((nb) this).field_F) {
                  break L14;
                } else {
                  L16: {
                    if (ad.field_e) {
                      break L16;
                    } else {
                      if (((nb) this).field_C.field_Mb[((nb) this).field_F] > 0) {
                        break L14;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (0 != param2) {
                    break L14;
                  } else {
                    L17: {
                      if (di.field_g != 0) {
                        break L17;
                      } else {
                        if (qh.field_Yb < 8) {
                          break L14;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      if (3 != di.field_g) {
                        break L18;
                      } else {
                        if (5 > qh.field_Yb) {
                          break L14;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      var5 = ((nb) this).field_X.field_r + vk.field_h[((nb) this).field_X.field_c];
                      var6_ref_je = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                      if (var6_ref_je != null) {
                        if (var5 < var6_ref_je.field_r) {
                          var5 = var6_ref_je.field_r;
                          break L19;
                        } else {
                          break L19;
                        }
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (((nb) this).field_X.field_r + kh.field_x <= var5) {
                        break L20;
                      } else {
                        if (((nb) this).field_C.field_Xb.length <= 0) {
                          break L20;
                        } else {
                          L21: {
                            L22: {
                              if (0 > ((nb) this).field_C.field_ub) {
                                break L22;
                              } else {
                                if (((nb) this).field_C.field_Tb > 0) {
                                  break L21;
                                } else {
                                  if (((nb) this).field_C.field_ub != 0) {
                                    break L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (c.a((byte) -56, ((nb) this).field_C.field_Xb[((nb) this).field_F])) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                          L23: {
                            if (((nb) this).field_C.field_Xb[((nb) this).field_F] != 8) {
                              break L23;
                            } else {
                              if (((nb) this).field_C.field_Tb >= 1) {
                                break L23;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L24: {
                            var7 = new je(0, ((nb) this).field_C.field_Xb[((nb) this).field_F], var5);
                            var7.field_u = param3;
                            var7.field_y = param1;
                            var8_int = (km.field_c >> 8) + -(((nb) this).field_P >> 4);
                            var9 = 400 + (-(((nb) this).field_E >> 4) - -(dl.field_G + -(((nb) this).field_C.field_Db * 8) >> 8));
                            if (var8_int < 0) {
                              var8_int = 48;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          L25: {
                            if (var8_int > 640) {
                              var8_int = 592;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                          L26: {
                            if (0 > var9) {
                              var9 = 48;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            if (var9 <= 380) {
                              break L27;
                            } else {
                              var9 = 332;
                              break L27;
                            }
                          }
                          L28: {
                            if (!nc.field_b) {
                              break L28;
                            } else {
                              var7.field_y = dl.field_G + 10000 * (pi.field_c - var9);
                              var7.field_u = (oh.field_f - var8_int) * 10000 + km.field_c;
                              break L28;
                            }
                          }
                          L29: {
                            var10 = -km.field_c + var7.field_u;
                            var11 = var7.field_y - dl.field_G;
                            if (var10 >= 0) {
                              bj.field_h = 1;
                              break L29;
                            } else {
                              bj.field_h = -1;
                              break L29;
                            }
                          }
                          L30: {
                            L31: {
                              var12 = 0L;
                              if (!((nb) this).field_C.field_Lb) {
                                break L31;
                              } else {
                                if (!((nb) this).field_C.i(31, -27)) {
                                  stackOut_99_0 = 0;
                                  stackIn_100_0 = stackOut_99_0;
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            stackOut_98_0 = 1;
                            stackIn_100_0 = stackOut_98_0;
                            break L30;
                          }
                          var14 = stackIn_100_0;
                          var15 = 0;
                          L32: while (true) {
                            if (var15 >= ((nb) this).field_C.field_gb.length) {
                              L33: {
                                ((nb) this).field_C.field_Zb.b((byte) -128, 0, bj.field_h, 0);
                                if (var12 == 0L) {
                                  break L33;
                                } else {
                                  var15 = 0;
                                  var16_int = 0;
                                  L34: while (true) {
                                    if (~((nb) this).field_C.field_gb.length >= ~var16_int) {
                                      var11 = var11 - var15 / ff.a(false, var12);
                                      break L33;
                                    } else {
                                      L35: {
                                        if ((1L << var16_int & var12) == 0L) {
                                          break L35;
                                        } else {
                                          var15 = var15 + ((nb) this).field_C.field_gb[var16_int].field_V;
                                          break L35;
                                        }
                                      }
                                      var16_int++;
                                      continue L34;
                                    }
                                  }
                                }
                              }
                              L36: {
                                if (Math.abs(var10) >= 1600) {
                                  break L36;
                                } else {
                                  if (1600 > Math.abs(var11)) {
                                    var11 = 0;
                                    break L36;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                var15_double = Math.atan2((double)var10, (double)(-var11));
                                var7.field_B = (int)(var15_double * 65536.0 / 6.283185307179586);
                                if (~(var7.field_B * bj.field_h) > ~(((nb) this).field_Q - -1 << 8)) {
                                  var7.field_B = bj.field_h * (1 + ((nb) this).field_Q << 8);
                                  var10 = (int)(Math.sin((double)var7.field_B * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                                  var11 = -(int)(Math.cos(3.141592653589793 * (double)var7.field_B * 2.0 / 65536.0) * 256.0);
                                  break L37;
                                } else {
                                  if (bj.field_h * var7.field_B > ((nb) this).field_Z + -1 << 8) {
                                    var7.field_B = (-1 + ((nb) this).field_Z << 8) * bj.field_h;
                                    var10 = (int)(Math.sin((double)var7.field_B * 3.141592653589793 * 2.0 / 65536.0) * 256.0) * bj.field_h;
                                    var11 = -(int)(256.0 * Math.cos((double)var7.field_B * 3.141592653589793 * 2.0 / 65536.0));
                                    break L37;
                                  } else {
                                    var10 = (int)(256.0 * Math.sin((double)var7.field_B * 3.141592653589793 * 2.0 / 65536.0)) * bj.field_h;
                                    var11 = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)var7.field_B) / 65536.0) * 256.0);
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (bj.field_h >= 0) {
                                  if (var7.field_B < -16384) {
                                    var7.field_B = var7.field_B + 65536;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  if (16384 < var7.field_B) {
                                    var7.field_B = var7.field_B - 65536;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (~(bj.field_h * var7.field_B) > ~sl.field_i) {
                                  var7.field_B = sl.field_i;
                                  break L39;
                                } else {
                                  if (ic.field_P >= bj.field_h * var7.field_B) {
                                    break L39;
                                  } else {
                                    var7.field_B = ic.field_P;
                                    break L39;
                                  }
                                }
                              }
                              if (var12 == 0L) {
                                break L20;
                              } else {
                                L40: {
                                  if (!((nb) this).field_d) {
                                    var7.field_p = true;
                                    break L40;
                                  } else {
                                    mm.field_g.a(64, (byte) -117);
                                    mm.field_g.a((byte) 123, 0);
                                    mm.field_g.a((byte) 112, ((nb) this).field_C.field_Xb[((nb) this).field_F]);
                                    mm.field_g.b(true, var5);
                                    mm.field_g.b(true, var7.field_u);
                                    mm.field_g.b(true, var7.field_y);
                                    mm.field_g.b(true, var7.field_B);
                                    break L40;
                                  }
                                }
                                L41: {
                                  L42: {
                                    pc discarded$6 = fc.a((byte) -83, 69, -1);
                                    if (-1 != di.field_g) {
                                      break L42;
                                    } else {
                                      if (((nb) this).field_X.field_c == 1) {
                                        break L41;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                  ((nb) this).field_C.field_B.a(3, (ck) (Object) var7);
                                  break L41;
                                }
                                var17 = -var7.field_x + var7.field_r;
                                ((nb) this).field_C.field_Mb[((nb) this).field_F] = ((nb) this).field_C.field_Mb[((nb) this).field_F] + var17;
                                um.field_X = um.field_X + var17;
                                break L20;
                              }
                            } else {
                              L43: {
                                var16_ref_nk = ((nb) this).field_C.field_gb[var15];
                                if (ja.a(var16_ref_nk.field_N, false) != ((nb) this).field_C.field_Xb[((nb) this).field_F]) {
                                  break L43;
                                } else {
                                  L44: {
                                    if (var14 != 0) {
                                      break L44;
                                    } else {
                                      if (!bi.b(-69, var16_ref_nk.field_N)) {
                                        break L44;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                  var12 = var12 | 1L << var15;
                                  break L43;
                                }
                              }
                              var15++;
                              continue L32;
                            }
                          }
                        }
                      }
                    }
                    break L13;
                  }
                }
              }
            }
          }
          if (param2 == 0) {
            L45: {
              var5 = ((nb) this).field_X.field_r - -vk.field_h[((nb) this).field_X.field_c];
              var6_ref_je = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
              if (var6_ref_je != null) {
                if (~var5 <= ~var6_ref_je.field_r) {
                  break L45;
                } else {
                  var5 = var6_ref_je.field_r;
                  break L45;
                }
              } else {
                break L45;
              }
            }
            L46: {
              var7_int = 0;
              if (0 == ((nb) this).field_C.field_Xb.length) {
                var7_int = 0;
                break L46;
              } else {
                L47: {
                  var8_int = ((nb) this).field_C.field_Xb[((nb) this).field_F];
                  if (7 == var8_int) {
                    break L47;
                  } else {
                    if (var8_int != 0) {
                      if (8 != var8_int) {
                        L48: {
                          if (var8_int == 12) {
                            break L48;
                          } else {
                            if (var8_int == 11) {
                              break L48;
                            } else {
                              var7_int = 8;
                              break L46;
                            }
                          }
                        }
                        L49: {
                          if (((nb) this).field_C.field_Vb != null) {
                            stackOut_166_0 = 12;
                            stackIn_167_0 = stackOut_166_0;
                            break L49;
                          } else {
                            stackOut_165_0 = 10;
                            stackIn_167_0 = stackOut_165_0;
                            break L49;
                          }
                        }
                        var7_int = stackIn_167_0;
                        break L46;
                      } else {
                        break L47;
                      }
                    } else {
                      break L47;
                    }
                  }
                }
                L50: {
                  if (((nb) this).field_C.field_Vb == null) {
                    stackOut_162_0 = 4;
                    stackIn_163_0 = stackOut_162_0;
                    break L50;
                  } else {
                    stackOut_161_0 = 14;
                    stackIn_163_0 = stackOut_161_0;
                    break L50;
                  }
                }
                var7_int = stackIn_163_0;
                break L46;
              }
            }
            L51: {
              if (~var5 <= ~(((nb) this).field_X.field_r + 500)) {
                break L51;
              } else {
                if (null == ((nb) this).field_C) {
                  break L51;
                } else {
                  if (((nb) this).field_C.field_Xb.length <= 0) {
                    break L51;
                  } else {
                    L52: {
                      if (((nb) this).field_F >= ((nb) this).field_C.field_Xb.length) {
                        ((nb) this).field_F = 0;
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    L53: {
                      L54: {
                        if (null == qg.field_n) {
                          break L54;
                        } else {
                          if (qg.field_n.field_s != 0) {
                            break L54;
                          } else {
                            if (~qg.field_n.field_A != ~((nb) this).field_C.field_Xb[((nb) this).field_F]) {
                              break L54;
                            } else {
                              qg.field_n.field_r = var5 - (-qg.field_n.field_r - -qg.field_n.field_x);
                              qg.field_n.field_x = var5;
                              break L53;
                            }
                          }
                        }
                      }
                      qg.field_n = new je(0, ((nb) this).field_C.field_Xb[((nb) this).field_F], var5);
                      break L53;
                    }
                    L55: {
                      qg.field_n.field_u = param3;
                      qg.field_n.field_y = param1;
                      var8_int = (km.field_c >> 8) + -(((nb) this).field_P >> 4);
                      var9 = -(((nb) this).field_E >> 4) + (400 + (dl.field_G + -(((nb) this).field_C.field_Db * 8) >> 8));
                      if (var8_int < 0) {
                        var8_int = 48;
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                    L56: {
                      if (var9 < 0) {
                        var9 = 48;
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L57: {
                      if (var8_int > 640) {
                        var8_int = 592;
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                    L58: {
                      if (var9 <= 380) {
                        break L58;
                      } else {
                        var9 = 332;
                        break L58;
                      }
                    }
                    L59: {
                      if (!nc.field_b) {
                        break L59;
                      } else {
                        qg.field_n.field_y = dl.field_G + (-var9 + pi.field_c) * 10000;
                        qg.field_n.field_u = km.field_c + 10000 * (oh.field_f - var8_int);
                        break L59;
                      }
                    }
                    L60: {
                      var10 = qg.field_n.field_u - km.field_c;
                      var11 = -dl.field_G + qg.field_n.field_y;
                      if (0 <= var10) {
                        bj.field_h = 1;
                        break L60;
                      } else {
                        bj.field_h = -1;
                        break L60;
                      }
                    }
                    L61: {
                      L62: {
                        var12 = 0L;
                        if (!((nb) this).field_C.field_Lb) {
                          break L62;
                        } else {
                          if (!((nb) this).field_C.i(31, -27)) {
                            stackOut_201_0 = 0;
                            stackIn_202_0 = stackOut_201_0;
                            break L61;
                          } else {
                            break L62;
                          }
                        }
                      }
                      stackOut_200_0 = 1;
                      stackIn_202_0 = stackOut_200_0;
                      break L61;
                    }
                    var14 = stackIn_202_0;
                    var15 = 0;
                    L63: while (true) {
                      if (((nb) this).field_C.field_gb.length <= var15) {
                        ((nb) this).field_C.field_Zb.b((byte) -128, 0, bj.field_h, 0);
                        var15 = 0;
                        var21 = 0;
                        var16_int = var21;
                        L64: while (true) {
                          if (~((nb) this).field_C.field_gb.length >= ~var21) {
                            L65: {
                              if (0L != var12) {
                                var11 = var11 - var15 / ff.a(false, var12);
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                            L66: {
                              if (Math.abs(var10) >= 1600) {
                                break L66;
                              } else {
                                if (1600 <= Math.abs(var11)) {
                                  break L66;
                                } else {
                                  var11 = 0;
                                  break L66;
                                }
                              }
                            }
                            L67: {
                              var16 = Math.atan2((double)var10, (double)(-var11));
                              qg.field_n.field_B = (int)(65536.0 * var16 / 6.283185307179586);
                              if (~(bj.field_h * qg.field_n.field_B) <= ~(1 + ((nb) this).field_Q << 8)) {
                                if (-1 + ((nb) this).field_Z << 8 < qg.field_n.field_B * bj.field_h) {
                                  qg.field_n.field_B = bj.field_h * (((nb) this).field_Z - 1 << 8);
                                  var10 = (int)(256.0 * Math.sin(3.141592653589793 * (double)qg.field_n.field_B * 2.0 / 65536.0)) * bj.field_h;
                                  var11 = -(int)(256.0 * Math.cos((double)qg.field_n.field_B * 3.141592653589793 * 2.0 / 65536.0));
                                  break L67;
                                } else {
                                  var10 = (int)(256.0 * Math.sin((double)qg.field_n.field_B * 3.141592653589793 * 2.0 / 65536.0)) * bj.field_h;
                                  var11 = -(int)(256.0 * Math.cos(3.141592653589793 * (double)qg.field_n.field_B * 2.0 / 65536.0));
                                  break L67;
                                }
                              } else {
                                qg.field_n.field_B = bj.field_h * (((nb) this).field_Q + 1 << 8);
                                var10 = (int)(Math.sin(2.0 * ((double)qg.field_n.field_B * 3.141592653589793) / 65536.0) * 256.0) * bj.field_h;
                                var11 = -(int)(256.0 * Math.cos((double)qg.field_n.field_B * 3.141592653589793 * 2.0 / 65536.0));
                                break L67;
                              }
                            }
                            L68: {
                              qg.field_n.field_p = true;
                              if (bj.field_h >= 0) {
                                if (-16384 > qg.field_n.field_B) {
                                  qg.field_n.field_B = qg.field_n.field_B + 65536;
                                  break L68;
                                } else {
                                  break L68;
                                }
                              } else {
                                if (qg.field_n.field_B > 16384) {
                                  qg.field_n.field_B = qg.field_n.field_B - 65536;
                                  break L68;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            L69: {
                              var18 = 0;
                              if (((nb) this).field_X.field_r - -kh.field_x <= var5) {
                                var18 = 1;
                                break L69;
                              } else {
                                break L69;
                              }
                            }
                            L70: {
                              if (0L != var12) {
                                L71: {
                                  if (((nb) this).field_C.field_ub < 0) {
                                    break L71;
                                  } else {
                                    L72: {
                                      if (((nb) this).field_C.field_Tb != 0) {
                                        break L72;
                                      } else {
                                        if (((nb) this).field_C.field_ub == 0) {
                                          break L71;
                                        } else {
                                          break L72;
                                        }
                                      }
                                    }
                                    L73: {
                                      if (((nb) this).field_C.field_Xb[((nb) this).field_F] != 8) {
                                        break L73;
                                      } else {
                                        if (((nb) this).field_C.field_Tb < 1) {
                                          var18 = 1;
                                          break L70;
                                        } else {
                                          break L73;
                                        }
                                      }
                                    }
                                    if (ml.field_f[Math.max(0, qg.field_n.field_B * bj.field_h >> 8)] != 0) {
                                      break L70;
                                    } else {
                                      if (0 == hf.field_c) {
                                        var18 = 1;
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    }
                                  }
                                }
                                var19 = ((nb) this).field_C.field_Xb[((nb) this).field_F];
                                if (c.a((byte) -119, var19)) {
                                  var18 = 1;
                                  break L70;
                                } else {
                                  break L70;
                                }
                              } else {
                                qg.field_n.field_p = false;
                                var18 = 1;
                                qg.field_n = null;
                                break L70;
                              }
                            }
                            L74: {
                              if (var18 == 0) {
                                break L74;
                              } else {
                                var7_int++;
                                break L74;
                              }
                            }
                            this.b(15, var7_int, 0, 15);
                            break L13;
                          } else {
                            L75: {
                              if ((1L << var21 & var12) == 0L) {
                                break L75;
                              } else {
                                var15 = var15 + ((nb) this).field_C.field_gb[var21].field_V;
                                break L75;
                              }
                            }
                            var21++;
                            continue L64;
                          }
                        }
                      } else {
                        L76: {
                          var16_ref_nk = ((nb) this).field_C.field_gb[var15];
                          if (ja.a(var16_ref_nk.field_N, false) != qg.field_n.field_A) {
                            break L76;
                          } else {
                            if (0 < var16_ref_nk.field_C) {
                              break L76;
                            } else {
                              L77: {
                                if (var14 != 0) {
                                  break L77;
                                } else {
                                  if (bi.b(110, var16_ref_nk.field_N)) {
                                    break L76;
                                  } else {
                                    break L77;
                                  }
                                }
                              }
                              var12 = var12 | 1L << var15;
                              break L76;
                            }
                          }
                        }
                        var15++;
                        continue L63;
                      }
                    }
                  }
                }
              }
            }
            L78: {
              if (var7_int != 0) {
                this.b(15, var7_int - -1, 0, 15);
                break L78;
              } else {
                this.b(0, var7_int, 0, 0);
                break L78;
              }
            }
            qg.field_n = null;
            break L13;
          } else {
            break L13;
          }
        }
        L79: {
          if ((4 & sf.field_d) == 0) {
            stackOut_263_0 = 0;
            stackIn_264_0 = stackOut_263_0;
            break L79;
          } else {
            stackOut_262_0 = 1;
            stackIn_264_0 = stackOut_262_0;
            break L79;
          }
        }
        L80: {
          var5 = stackIn_264_0;
          if (dm.field_c) {
            L81: {
              L82: {
                if (fc.field_e[fm.field_d]) {
                  break L82;
                } else {
                  if (!fc.field_e[83]) {
                    stackOut_271_0 = 0;
                    stackIn_272_0 = stackOut_271_0;
                    break L81;
                  } else {
                    break L82;
                  }
                }
              }
              stackOut_270_0 = 1;
              stackIn_272_0 = stackOut_270_0;
              break L81;
            }
            var5 = stackIn_272_0;
            break L80;
          } else {
            if (!fc.field_e[83]) {
              break L80;
            } else {
              var5 = 1;
              break L80;
            }
          }
        }
        L83: {
          L84: {
            L85: {
              if (lb.field_gc != 1) {
                break L85;
              } else {
                if (param2 != 1) {
                  break L85;
                } else {
                  if (var5 == 0) {
                    break L84;
                  } else {
                    break L85;
                  }
                }
              }
            }
            L86: {
              if (!ie.field_c) {
                break L86;
              } else {
                if (var5 != 0) {
                  break L86;
                } else {
                  if (param2 == -1) {
                    break L86;
                  } else {
                    break L84;
                  }
                }
              }
            }
            if (param2 == 1) {
              L87: {
                var6 = ((nb) this).field_X.field_r - -vk.field_h[((nb) this).field_X.field_c];
                var7 = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                if (var7 != null) {
                  if (~var7.field_r >= ~var6) {
                    break L87;
                  } else {
                    var6 = var7.field_r;
                    break L87;
                  }
                } else {
                  break L87;
                }
              }
              if (~(500 + ((nb) this).field_X.field_r) >= ~var6) {
                break L83;
              } else {
                if (!this.b(-5821, param3, param1)) {
                  qg.field_n = new je(3, 0, var6);
                  qg.field_n.field_y = param1;
                  qg.field_n.field_u = param3;
                  break L83;
                } else {
                  break L83;
                }
              }
            } else {
              break L83;
            }
          }
          L88: {
            var6 = vk.field_h[((nb) this).field_X.field_c] + ((nb) this).field_X.field_r;
            var7 = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
            if (var7 != null) {
              if (var6 >= var7.field_r) {
                break L88;
              } else {
                var6 = var7.field_r;
                break L88;
              }
            } else {
              break L88;
            }
          }
          if (500 + ((nb) this).field_X.field_r > var6) {
            L89: {
              var8 = new je(3, 0, var6);
              var8.field_u = param3;
              var8.field_y = param1;
              if (this.b(-5821, param3, param1)) {
                break L89;
              } else {
                L90: {
                  if (((nb) this).field_d) {
                    mm.field_g.a(64, (byte) -117);
                    mm.field_g.a((byte) 112, 3);
                    mm.field_g.a((byte) 113, 0);
                    mm.field_g.b(true, var6);
                    mm.field_g.b(true, var8.field_u);
                    mm.field_g.b(true, var8.field_y);
                    mm.field_g.b(true, var8.field_B);
                    break L90;
                  } else {
                    var8.field_p = true;
                    break L90;
                  }
                }
                L91: {
                  pc discarded$7 = fc.a((byte) 67, 69, -1);
                  if (di.field_g != -1) {
                    break L91;
                  } else {
                    if (1 == ((nb) this).field_X.field_c) {
                      break L89;
                    } else {
                      break L91;
                    }
                  }
                }
                ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var8);
                break L83;
              }
            }
            break L83;
          } else {
            break L83;
          }
        }
        L92: {
          if (dm.field_c) {
            L93: {
              if (fc.field_e[fm.field_d]) {
                break L93;
              } else {
                if (fc.field_e[83]) {
                  break L93;
                } else {
                  ie.field_c = false;
                  break L92;
                }
              }
            }
            break L92;
          } else {
            if ((sf.field_d & 4) != 0) {
              break L92;
            } else {
              if (!fc.field_e[83]) {
                ie.field_c = false;
                break L92;
              } else {
                break L92;
              }
            }
          }
        }
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        je var5_ref = null;
        int var5_int = 0;
        int var6 = 0;
        je var6_ref_je = null;
        Object var7 = null;
        je var7_ref = null;
        int var7_int = 0;
        ne var8 = null;
        int var9 = 0;
        int stackIn_214_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_212_0 = 0;
        L0: {
          var5 = null;
          var7 = null;
          var9 = SteelSentinels.field_G;
          if (ei.field_q != 13) {
            break L0;
          } else {
            L1: {
              if (di.field_g != 10) {
                break L1;
              } else {
                if (nc.field_a < 0) {
                  break L1;
                } else {
                  if (ge.field_j != 0) {
                    break L1;
                  } else {
                    if (ol.field_Ub != 9) {
                      break L1;
                    } else {
                      if (ni.b(55)) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L2: {
              ee.c(-2483, 84);
              var2 = 1;
              if (!((nb) this).field_d) {
                break L2;
              } else {
                if (ed.field_j >= 0) {
                  if (!((nb) this).field_X.field_j) {
                    var2 = 2;
                    break L2;
                  } else {
                    var2 = 3;
                    break L2;
                  }
                } else {
                  var2 = 4;
                  break L2;
                }
              }
            }
            var3 = var2;
            q.a(var3, false, -1, 0);
            ea.field_k = true;
            return;
          }
        }
        L3: {
          if (!fc.field_e[86]) {
            break L3;
          } else {
            if (ei.field_q != 84) {
              break L3;
            } else {
              if (nk.f((byte) -76)) {
                if (wb.field_c == null) {
                  si.field_y = false;
                  ag.a(-4, false);
                  break L3;
                } else {
                  ub.c(0);
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
        }
        if (~((nb) this).field_X.field_r <= ~((nb) this).field_w) {
          L4: {
            var2 = -127 / ((param0 - -29) / 46);
            if (((nb) this).field_C == null) {
              break L4;
            } else {
              L5: {
                if (((nb) this).field_X.field_j) {
                  break L5;
                } else {
                  L6: {
                    var3 = 0;
                    if (ln.field_d != ei.field_q) {
                      break L6;
                    } else {
                      if (0 != di.field_g) {
                        ((nb) this).field_F = ((nb) this).field_F - 1;
                        var3 = 1;
                        if (((nb) this).field_F < 0) {
                          ((nb) this).field_F = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (vh.field_c != ei.field_q) {
                      break L7;
                    } else {
                      if (di.field_g != 0) {
                        var3 = 1;
                        ((nb) this).field_F = ((nb) this).field_F + 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (16 > ei.field_q) {
                      break L8;
                    } else {
                      if (ei.field_q > 24) {
                        break L8;
                      } else {
                        if (di.field_g == 0) {
                          break L8;
                        } else {
                          ((nb) this).field_F = -16 + ei.field_q;
                          var3 = 1;
                          break L8;
                        }
                      }
                    }
                  }
                  L9: {
                    if (((nb) this).field_F >= ((nb) this).field_C.field_Xb.length) {
                      ((nb) this).field_F = -1 + ((nb) this).field_C.field_Xb.length;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (ei.field_q == 85) {
                      break L10;
                    } else {
                      if (ei.field_q == 101) {
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (var3 == 0) {
                      break L11;
                    } else {
                      L12: {
                        if (3 != di.field_g) {
                          break L12;
                        } else {
                          if (qh.field_Yb >= 5) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      rc.field_l = 100;
                      break L11;
                    }
                  }
                  L13: {
                    if (0 >= ul.field_d) {
                      break L13;
                    } else {
                      L14: {
                        if (ei.field_q == 41) {
                          break L14;
                        } else {
                          if (ei.field_q == 40) {
                            break L14;
                          } else {
                            if (ei.field_q == 56) {
                              break L14;
                            } else {
                              if (ei.field_q != 55) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      if (di.field_g == 4) {
                        L15: {
                          var4 = ((nb) this).field_P + (oh.field_f << 4) << 4;
                          var5_int = pi.field_c + -400 - -(((nb) this).field_E >> 4) << 8;
                          var6 = 0;
                          if (ei.field_q == 41) {
                            var6 = 0;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (ei.field_q != 40) {
                            break L16;
                          } else {
                            var6 = 10;
                            break L16;
                          }
                        }
                        L17: {
                          if (ei.field_q == 56) {
                            var6 = 20;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L18: {
                          if (ei.field_q == 55) {
                            var6 = 30;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        L19: {
                          if (!fc.field_e[16]) {
                            break L19;
                          } else {
                            var6++;
                            break L19;
                          }
                        }
                        L20: {
                          if (fc.field_e[17]) {
                            var6 += 2;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        L21: {
                          if (!fc.field_e[18]) {
                            break L21;
                          } else {
                            var6 += 3;
                            break L21;
                          }
                        }
                        L22: {
                          if (!fc.field_e[19]) {
                            break L22;
                          } else {
                            var6 += 4;
                            break L22;
                          }
                        }
                        L23: {
                          if (fc.field_e[20]) {
                            var6 += 5;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (!fc.field_e[21]) {
                            break L24;
                          } else {
                            var6 += 6;
                            break L24;
                          }
                        }
                        L25: {
                          if (fc.field_e[22]) {
                            var6 += 7;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if (fc.field_e[23]) {
                            var6 += 8;
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                        L27: {
                          if (fc.field_e[24]) {
                            var6 += 9;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        if (~var6 >= ~fg.field_Xb.length) {
                          var7_int = fg.field_Xb[var6];
                          var8 = new ne(((nb) this).field_X, var7_int);
                          var8.field_I = var5_int;
                          var8.field_z = var4;
                          ((nb) this).field_X.field_e.a(3, (ck) (Object) var8);
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                  }
                  L28: {
                    L29: {
                      if (71 == ei.field_q) {
                        break L29;
                      } else {
                        if (ei.field_q == jf.field_hb) {
                          break L29;
                        } else {
                          if (!dm.field_c) {
                            break L28;
                          } else {
                            if (ei.field_q == sa.field_c) {
                              break L29;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                    L30: {
                      var4 = ((nb) this).field_X.field_r - -vk.field_h[((nb) this).field_X.field_c];
                      var5_ref = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                      var6 = 0;
                      if (var5_ref != null) {
                        L31: {
                          if (~var5_ref.field_r < ~var4) {
                            var4 = var5_ref.field_r;
                            break L31;
                          } else {
                            break L31;
                          }
                        }
                        if (var5_ref.field_s != 6) {
                          break L30;
                        } else {
                          if (var5_ref.field_A == -1) {
                            L32: {
                              var7_ref = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                              if (var7_ref == null) {
                                break L32;
                              } else {
                                if (~var7_ref.field_r <= ~var5_ref.field_r) {
                                  break L30;
                                } else {
                                  break L32;
                                }
                              }
                            }
                            var6 = 1;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      } else {
                        break L30;
                      }
                    }
                    if (500 + ((nb) this).field_X.field_r <= var4) {
                      break L28;
                    } else {
                      if (var6 == 0) {
                        L33: {
                          var7_ref = new je(6, -1, var4);
                          if (((nb) this).field_d) {
                            mm.field_g.a(64, (byte) -117);
                            mm.field_g.a((byte) 108, 6);
                            mm.field_g.a((byte) 113, -1);
                            mm.field_g.b(true, var4);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            break L33;
                          } else {
                            var7_ref.field_p = true;
                            break L33;
                          }
                        }
                        L34: {
                          if (di.field_g != -1) {
                            break L34;
                          } else {
                            if (1 != ((nb) this).field_X.field_c) {
                              break L34;
                            } else {
                              break L28;
                            }
                          }
                        }
                        ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var7_ref);
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                  }
                  L35: {
                    L36: {
                      if (ei.field_q == 72) {
                        break L36;
                      } else {
                        if (~ei.field_q == ~rj.field_b) {
                          break L36;
                        } else {
                          if (!dm.field_c) {
                            break L35;
                          } else {
                            if (~on.field_h != ~ei.field_q) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                      }
                    }
                    L37: {
                      var4 = ((nb) this).field_X.field_r - -vk.field_h[((nb) this).field_X.field_c];
                      var5_ref = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                      var6 = 0;
                      if (var5_ref == null) {
                        break L37;
                      } else {
                        L38: {
                          if (var5_ref.field_r > var4) {
                            var4 = var5_ref.field_r;
                            break L38;
                          } else {
                            break L38;
                          }
                        }
                        if (var5_ref.field_s != 6) {
                          break L37;
                        } else {
                          if (1 == var5_ref.field_A) {
                            L39: {
                              var7_ref = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                              if (var7_ref == null) {
                                break L39;
                              } else {
                                if (~var7_ref.field_r > ~var5_ref.field_r) {
                                  break L39;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            var6 = 1;
                            break L37;
                          } else {
                            break L37;
                          }
                        }
                      }
                    }
                    if (500 + ((nb) this).field_X.field_r <= var4) {
                      break L35;
                    } else {
                      if (var6 == 0) {
                        L40: {
                          var7_ref = new je(6, 1, var4);
                          if (!((nb) this).field_d) {
                            var7_ref.field_p = true;
                            break L40;
                          } else {
                            mm.field_g.a(64, (byte) -117);
                            mm.field_g.a((byte) 110, 6);
                            mm.field_g.a((byte) 112, 1);
                            mm.field_g.b(true, var4);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            break L40;
                          }
                        }
                        L41: {
                          if (di.field_g != -1) {
                            break L41;
                          } else {
                            if (((nb) this).field_X.field_c == 1) {
                              break L35;
                            } else {
                              break L41;
                            }
                          }
                        }
                        ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var7_ref);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L42: {
                    L43: {
                      if (fe.field_y == ei.field_q) {
                        break L43;
                      } else {
                        if (!dm.field_c) {
                          break L42;
                        } else {
                          if (~pd.field_V != ~ei.field_q) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    L44: {
                      var4 = ((nb) this).field_X.field_r + vk.field_h[((nb) this).field_X.field_c];
                      var5_ref = (je) (Object) ((nb) this).field_C.field_Ec.b(1063677678);
                      var6 = 0;
                      if (var5_ref != null) {
                        L45: {
                          if (var5_ref.field_r > var4) {
                            var4 = var5_ref.field_r;
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        if (var5_ref.field_s != 6) {
                          break L44;
                        } else {
                          if (var5_ref.field_A == 0) {
                            var6 = 1;
                            break L44;
                          } else {
                            break L44;
                          }
                        }
                      } else {
                        break L44;
                      }
                    }
                    if (~var4 <= ~(((nb) this).field_X.field_r - -500)) {
                      break L42;
                    } else {
                      if (var6 == 0) {
                        L46: {
                          var7_ref = new je(6, 0, var4);
                          if (!((nb) this).field_d) {
                            var7_ref.field_p = true;
                            break L46;
                          } else {
                            mm.field_g.a(64, (byte) -117);
                            mm.field_g.a((byte) 115, 6);
                            mm.field_g.a((byte) 110, 0);
                            mm.field_g.b(true, var4);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            break L46;
                          }
                        }
                        L47: {
                          if (di.field_g != -1) {
                            break L47;
                          } else {
                            if (((nb) this).field_X.field_c == 1) {
                              break L42;
                            } else {
                              break L47;
                            }
                          }
                        }
                        ((nb) this).field_C.field_Ec.a(3, (ck) (Object) var7_ref);
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                  }
                  L48: {
                    if (na.field_b != ei.field_q) {
                      break L48;
                    } else {
                      if (((nb) this).field_C.field_fb != 0) {
                        L49: {
                          var4 = vk.field_h[((nb) this).field_X.field_c] + ((nb) this).field_X.field_r;
                          var5_ref = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                          if (var5_ref != null) {
                            if (~var4 > ~var5_ref.field_r) {
                              var4 = var5_ref.field_r;
                              break L49;
                            } else {
                              break L49;
                            }
                          } else {
                            break L49;
                          }
                        }
                        if (500 + ((nb) this).field_X.field_r > var4) {
                          L50: {
                            var6_ref_je = new je(7, ((nb) this).field_C.field_fb, var4);
                            if (((nb) this).field_d) {
                              mm.field_g.a(64, (byte) -117);
                              mm.field_g.a((byte) 112, 7);
                              mm.field_g.a((byte) 120, ((nb) this).field_C.field_fb);
                              mm.field_g.b(true, var4);
                              mm.field_g.b(true, 0);
                              mm.field_g.b(true, 0);
                              mm.field_g.b(true, 0);
                              break L50;
                            } else {
                              var6_ref_je.field_p = true;
                              break L50;
                            }
                          }
                          L51: {
                            if (-1 != di.field_g) {
                              break L51;
                            } else {
                              if (1 == ((nb) this).field_X.field_c) {
                                break L48;
                              } else {
                                break L51;
                              }
                            }
                          }
                          ((nb) this).field_C.field_B.a(3, (ck) (Object) var6_ref_je);
                          break L48;
                        } else {
                          break L48;
                        }
                      } else {
                        break L48;
                      }
                    }
                  }
                  L52: {
                    if (ff.field_nb != ei.field_q) {
                      break L52;
                    } else {
                      if (!((nb) this).field_C.i(15, -27)) {
                        break L52;
                      } else {
                        L53: {
                          var4 = ((nb) this).field_X.field_r - -vk.field_h[((nb) this).field_X.field_c];
                          var5_ref = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                          if (var5_ref != null) {
                            if (~var4 <= ~var5_ref.field_r) {
                              break L53;
                            } else {
                              var4 = var5_ref.field_r;
                              break L53;
                            }
                          } else {
                            break L53;
                          }
                        }
                        if (500 + ((nb) this).field_X.field_r > var4) {
                          L54: {
                            var6_ref_je = new je(8, 0, var4);
                            if (((nb) this).field_d) {
                              mm.field_g.a(64, (byte) -117);
                              mm.field_g.a((byte) 112, 8);
                              mm.field_g.a((byte) 116, 0);
                              mm.field_g.b(true, var4);
                              mm.field_g.b(true, 0);
                              mm.field_g.b(true, 0);
                              mm.field_g.b(true, 0);
                              break L54;
                            } else {
                              var6_ref_je.field_p = true;
                              break L54;
                            }
                          }
                          L55: {
                            if (di.field_g != -1) {
                              break L55;
                            } else {
                              if (((nb) this).field_X.field_c == 1) {
                                break L52;
                              } else {
                                break L55;
                              }
                            }
                          }
                          ((nb) this).field_C.field_B.a(3, (ck) (Object) var6_ref_je);
                          break L52;
                        } else {
                          break L52;
                        }
                      }
                    }
                  }
                  if (~ei.field_q != ~dg.field_d) {
                    break L5;
                  } else {
                    if (!((nb) this).field_C.i(24, -27)) {
                      break L5;
                    } else {
                      L56: {
                        var4 = vk.field_h[((nb) this).field_X.field_c] + ((nb) this).field_X.field_r;
                        var5_ref = (je) (Object) ((nb) this).field_C.field_B.b(1063677678);
                        if (var5_ref != null) {
                          if (var5_ref.field_r > var4) {
                            var4 = var5_ref.field_r;
                            break L56;
                          } else {
                            break L56;
                          }
                        } else {
                          break L56;
                        }
                      }
                      if (var4 >= ((nb) this).field_X.field_r - -500) {
                        break L5;
                      } else {
                        L57: {
                          if (((nb) this).field_C.field_rc != 24) {
                            stackOut_213_0 = 9;
                            stackIn_214_0 = stackOut_213_0;
                            break L57;
                          } else {
                            stackOut_212_0 = 11;
                            stackIn_214_0 = stackOut_212_0;
                            break L57;
                          }
                        }
                        L58: {
                          var6 = stackIn_214_0;
                          var7_ref = new je(var6, 0, var4);
                          if (((nb) this).field_d) {
                            mm.field_g.a(64, (byte) -117);
                            mm.field_g.a((byte) 116, var6);
                            mm.field_g.a((byte) 123, 0);
                            mm.field_g.b(true, var4);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            mm.field_g.b(true, 0);
                            break L58;
                          } else {
                            var7_ref.field_p = true;
                            break L58;
                          }
                        }
                        L59: {
                          if (-1 != di.field_g) {
                            break L59;
                          } else {
                            if (1 != ((nb) this).field_X.field_c) {
                              break L59;
                            } else {
                              break L4;
                            }
                          }
                        }
                        ((nb) this).field_C.field_B.a(3, (ck) (Object) var7_ref);
                        break L5;
                      }
                    }
                  }
                }
              }
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    nb(boolean param0, int param1, int param2, String[] param3, int param4, boolean param5, int[][] param6, int param7, int param8, boolean param9, boolean param10) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_68_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        ((nb) this).field_r = -1;
        ((nb) this).field_p = 0;
        ((nb) this).field_U = 0;
        ((nb) this).field_b = new int[100];
        ((nb) this).field_s = 0;
        ((nb) this).field_n = -1;
        ((nb) this).field_P = 0;
        ((nb) this).field_q = -1;
        ((nb) this).field_z = false;
        ((nb) this).field_v = 0;
        ((nb) this).field_V = 0;
        ((nb) this).field_Y = 0;
        ((nb) this).field_S = 500;
        ((nb) this).field_E = 0;
        ((nb) this).field_t = -1;
        try {
          L0: {
            L1: {
              lh.field_D = false;
              b.field_f = false;
              uj.field_f = false;
              q.field_h = 100;
              sh.field_d = 0;
              hj.field_F = 0;
              if (1 != param2) {
                stackOut_3_0 = 500;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 100;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              kh.field_x = stackIn_4_0;
              g.field_h = -1;
              ri.field_b = null;
              nc.field_a = -1;
              rc.field_l = 0;
              pm.field_db = new ul();
              hh.field_c = new int[6];
              ((nb) this).field_D = new int[((nb) this).field_S];
              fi.field_g = new int[6];
              ((nb) this).field_K = new int[((nb) this).field_S];
              ke.field_b = new String[6];
              ed.field_j = param4;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param5) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((nb) this).field_J = stackIn_7_1 != 0;
              hd.field_a = 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param0) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((nb) this).field_d = stackIn_10_1 != 0;
              dl.field_M = qh.field_Yb;
              f.field_w = new int[10];
              nj.field_U = new int[10];
              ce.field_t = jg.a(true);
              var12_int = 0;
              if (!((nb) this).field_J) {
                break L4;
              } else {
                L5: {
                  var13 = param3.length;
                  if (var13 != 2) {
                    break L5;
                  } else {
                    if (param8 != 1) {
                      break L5;
                    } else {
                      var12_int = 2;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var13 != 3) {
                    break L6;
                  } else {
                    if (1 != param8) {
                      break L6;
                    } else {
                      var12_int = 1;
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var13 != 2) {
                    break L7;
                  } else {
                    if (param8 != 2) {
                      break L7;
                    } else {
                      var12_int = 2;
                      break L7;
                    }
                  }
                }
                if (var13 != 3) {
                  break L4;
                } else {
                  if (param8 != 2) {
                    break L4;
                  } else {
                    var12_int = 1;
                    break L4;
                  }
                }
              }
            }
            L8: {
              ((nb) this).field_X = new ee(param1, param2, param3, param6, false, param7, var12_int, param8, param9, param10);
              wc.field_a = ((nb) this).field_X.field_W;
              vi.field_db = ((nb) this).field_X.field_fb;
              fj.field_h = fj.field_a;
              if (((nb) this).field_X.field_P != 0) {
                break L8;
              } else {
                fj.field_h = new int[12];
                if (param4 != -2) {
                  var13 = 0;
                  L9: while (true) {
                    if (12 <= var13) {
                      if (ed.field_j < 0) {
                        break L8;
                      } else {
                        if (fj.field_h.length <= ed.field_j) {
                          break L8;
                        } else {
                          fj.field_h[ed.field_j] = 65535;
                          break L8;
                        }
                      }
                    } else {
                      fj.field_h[var13] = 16711680;
                      var13++;
                      continue L9;
                    }
                  }
                } else {
                  var13 = 0;
                  L10: while (true) {
                    if (var13 >= 12) {
                      break L8;
                    } else {
                      fj.field_h[var13] = 65535;
                      var13++;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (((nb) this).field_X.field_P != 1) {
                break L11;
              } else {
                fj.field_h = qd.field_t;
                break L11;
              }
            }
            L12: {
              if (((nb) this).field_X.field_ab.b(72) != 0) {
                break L12;
              } else {
                jn.a(true, (byte) 104, 200, l.field_i);
                break L12;
              }
            }
            L13: {
              if (1 != ((nb) this).field_X.field_ab.b(68)) {
                break L13;
              } else {
                jn.a(true, (byte) 86, 200, gb.field_e);
                break L13;
              }
            }
            L14: {
              if (((nb) this).field_X.field_ab.b(119) != 2) {
                break L14;
              } else {
                jn.a(true, (byte) 82, 200, kj.field_z);
                break L14;
              }
            }
            L15: {
              if (((nb) this).field_X.field_ab.b(107) != 3) {
                break L15;
              } else {
                jn.a(true, (byte) 111, 200, ue.field_e);
                break L15;
              }
            }
            L16: {
              if (((nb) this).field_X.field_ab.b(61) != 4) {
                break L16;
              } else {
                jn.a(true, (byte) 70, 200, db.field_a);
                break L16;
              }
            }
            L17: {
              ((nb) this).field_C = ((nb) this).field_X.f(param4, -127);
              if (null != ((nb) this).field_C) {
                ((nb) this).field_M = new int[4];
                var13 = ((nb) this).field_C.field_jc;
                ((nb) this).field_M[2] = 65535;
                ((nb) this).field_M[1] = 26248;
                ((nb) this).field_M[0] = 7196927;
                ((nb) this).field_M[3] = 0;
                if (1 != ((nb) this).field_X.field_P) {
                  break L17;
                } else {
                  L18: {
                    if (0 != var13) {
                      break L18;
                    } else {
                      ((nb) this).field_M[1] = 6559605;
                      ((nb) this).field_M[3] = 30;
                      ((nb) this).field_M[0] = 11701178;
                      ((nb) this).field_M[2] = 8388863;
                      break L18;
                    }
                  }
                  if (1 != var13) {
                    break L17;
                  } else {
                    ((nb) this).field_M[3] = 60;
                    ((nb) this).field_M[2] = 16752704;
                    ((nb) this).field_M[0] = 16744448;
                    ((nb) this).field_M[1] = 8413184;
                    break L17;
                  }
                }
              } else {
                ((nb) this).field_M = new int[4];
                ((nb) this).field_M[0] = 7172239;
                ((nb) this).field_M[1] = 4216424;
                ((nb) this).field_M[3] = 0;
                ((nb) this).field_M[2] = 13692927;
                break L17;
              }
            }
            var13 = 66056;
            var13 = (6316128 & ((nb) this).field_M[2]) >> 5;
            var14 = 258;
            var14 = (6316128 & ((nb) this).field_M[2]) >> 5;
            var15 = 0;
            L19: while (true) {
              if (10 <= var15) {
                var17 = 20;
                var15 = var17;
                L20: while (true) {
                  if (var17 >= 100) {
                    L21: {
                      if (di.field_g == -1) {
                        break L21;
                      } else {
                        if (di.field_g == 4) {
                          break L21;
                        } else {
                          if (di.field_g == 10) {
                            break L21;
                          } else {
                            this.j((byte) -123);
                            break L21;
                          }
                        }
                      }
                    }
                    L22: {
                      if (10 != di.field_g) {
                        break L22;
                      } else {
                        int discarded$1 = -10;
                        this.a();
                        break L22;
                      }
                    }
                    L23: {
                      if (((nb) this).field_d) {
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      ((nb) this).field_F = 0;
                      ((nb) this).field_i = 0;
                      this.b(0, 0, 0, 0);
                      if (4 != di.field_g) {
                        break L24;
                      } else {
                        this.a(1, true);
                        break L24;
                      }
                    }
                    L25: {
                      stackOut_68_0 = this;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_69_0 = stackOut_68_0;
                      if (1 >= ((nb) this).field_X.field_kb) {
                        stackOut_70_0 = this;
                        stackOut_70_1 = 0;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        break L25;
                      } else {
                        stackOut_69_0 = this;
                        stackOut_69_1 = 1;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        break L25;
                      }
                    }
                    L26: {
                      L27: {
                        ((nb) this).field_h = stackIn_71_1 != 0;
                        vk.field_g = null;
                        ad.field_i = null;
                        if (((nb) this).field_X.field_ab.b(118) != 4) {
                          break L27;
                        } else {
                          if (null == ((nb) this).field_C) {
                            break L27;
                          } else {
                            if (((nb) this).field_C.field_jc != 1) {
                              break L26;
                            } else {
                              ((nb) this).field_P = -10240 + ((nb) this).field_X.field_ab.a(-125);
                              break L27;
                            }
                          }
                        }
                      }
                      break L26;
                    }
                    break L0;
                  } else {
                    ((nb) this).field_b[var17] = var14 * 10;
                    var17++;
                    continue L20;
                  }
                }
              } else {
                ((nb) this).field_b[var15] = (var14 + var13) * var15;
                ((nb) this).field_b[19 - var15] = var14 * 10 + var15 * var13;
                var15++;
                continue L19;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var12 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var12;
            stackOut_76_1 = new StringBuilder().append("nb.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param3 == null) {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L28;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L28;
            }
          }
          L29: {
            stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
            stackOut_79_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_79_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_81_0 = stackOut_79_0;
            stackIn_81_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param6 == null) {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "null";
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L29;
            } else {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "{...}";
              stackIn_82_0 = stackOut_80_0;
              stackIn_82_1 = stackOut_80_1;
              stackIn_82_2 = stackOut_80_2;
              break L29;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_82_0, stackIn_82_2 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Cancel draw";
        field_I = false;
        field_T = "Connection lost. <%0>";
        field_x = "Tips";
    }
}
