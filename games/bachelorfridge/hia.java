/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hia extends sfa {
    int field_k;
    int field_j;
    static String field_i;

    public static void d(byte param0) {
        if (param0 != -74) {
            hia.d((byte) 13);
        }
        field_i = null;
    }

    hia(int param0, aga param1) {
        super(1, param0, new nq(param1));
    }

    final static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        byte[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lu var17 = null;
        lu var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var16 = BachelorFridge.field_y;
        try {
          L0: {
            var17 = new lu(param1);
            var18 = var17;
            var18.field_g = param1.length - 2;
            ok.field_vb = var18.e((byte) 62);
            eha.field_s = new int[ok.field_vb];
            fd.field_D = new int[ok.field_vb];
            baa.field_P = new byte[ok.field_vb][];
            cea.field_d = new byte[ok.field_vb][];
            uf.field_b = new boolean[ok.field_vb];
            fl.field_j = new int[ok.field_vb];
            lq.field_A = new int[ok.field_vb];
            var18.field_g = -(8 * ok.field_vb) + param1.length - 7;
            ok.field_Bb = var18.e((byte) 101);
            kh.field_r = var18.e((byte) 60);
            var3 = (var18.b(16711935) & 255) - -1;
            var4 = 0;
            L1: while (true) {
              if (~var4 <= ~ok.field_vb) {
                var4 = 0;
                L2: while (true) {
                  if (~var4 <= ~ok.field_vb) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= ok.field_vb) {
                        var4 = 7 % ((param0 - 60) / 48);
                        var5 = 0;
                        L4: while (true) {
                          if (~var5 <= ~ok.field_vb) {
                            var18.field_g = param1.length - (7 - -(8 * ok.field_vb) + (3 * var3 + -3));
                            hk.field_f = new int[var3];
                            var5 = 1;
                            L5: while (true) {
                              if (var3 <= var5) {
                                var18.field_g = 0;
                                var5 = 0;
                                L6: while (true) {
                                  if (~ok.field_vb >= ~var5) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var6 = lq.field_A[var5];
                                      var7 = eha.field_s[var5];
                                      var8 = var6 * var7;
                                      var25 = new byte[var8];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      baa.field_P[var5] = var25;
                                      var26 = new byte[var8];
                                      var24 = var26;
                                      var22 = var24;
                                      var20 = var22;
                                      var10 = var20;
                                      cea.field_d[var5] = var26;
                                      var11 = 0;
                                      var12 = var18.b(16711935);
                                      if ((1 & var12) != 0) {
                                        var13 = 0;
                                        L8: while (true) {
                                          if (var6 <= var13) {
                                            if (0 != (2 & var12)) {
                                              var13 = 0;
                                              L9: while (true) {
                                                if (var13 >= var6) {
                                                  break L7;
                                                } else {
                                                  var14 = 0;
                                                  L10: while (true) {
                                                    if (var14 >= var7) {
                                                      var13++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var18.b(true);
                                                        var10[var6 * var14 + var13] = dupTemp$2;
                                                        var15 = dupTemp$2;
                                                        stackOut_43_0 = var11;
                                                        stackIn_45_0 = stackOut_43_0;
                                                        stackIn_44_0 = stackOut_43_0;
                                                        if (var15 == -1) {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 0;
                                                          stackIn_46_0 = stackOut_45_0;
                                                          stackIn_46_1 = stackOut_45_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_44_0 = stackIn_44_0;
                                                          stackOut_44_1 = 1;
                                                          stackIn_46_0 = stackOut_44_0;
                                                          stackIn_46_1 = stackOut_44_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var11 = stackIn_46_0 | stackIn_46_1;
                                                      var14++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var14 = 0;
                                            L12: while (true) {
                                              if (~var7 >= ~var14) {
                                                var13++;
                                                continue L8;
                                              } else {
                                                var9[var13 - -(var14 * var6)] = var18.b(true);
                                                var14++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var13 = 0;
                                        L13: while (true) {
                                          if (var8 <= var13) {
                                            if ((2 & var12) == 0) {
                                              break L7;
                                            } else {
                                              var13 = 0;
                                              L14: while (true) {
                                                if (var13 >= var8) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var18.b(true);
                                                    var10[var13] = dupTemp$3;
                                                    var14 = dupTemp$3;
                                                    stackOut_27_0 = var11;
                                                    stackIn_29_0 = stackOut_27_0;
                                                    stackIn_28_0 = stackOut_27_0;
                                                    if (var14 == -1) {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 0;
                                                      stackIn_30_0 = stackOut_29_0;
                                                      stackIn_30_1 = stackOut_29_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_28_0 = stackIn_28_0;
                                                      stackOut_28_1 = 1;
                                                      stackIn_30_0 = stackOut_28_0;
                                                      stackIn_30_1 = stackOut_28_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var11 = stackIn_30_0 | stackIn_30_1;
                                                  var13++;
                                                  continue L14;
                                                }
                                              }
                                            }
                                          } else {
                                            var9[var13] = var18.b(true);
                                            var13++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    uf.field_b[var5] = var11 != 0;
                                    var5++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  hk.field_f[var5] = var18.a(3);
                                  if (hk.field_f[var5] != 0) {
                                    break L16;
                                  } else {
                                    hk.field_f[var5] = 1;
                                    break L16;
                                  }
                                }
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            eha.field_s[var5] = var18.e((byte) 105);
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        lq.field_A[var4] = var18.e((byte) 67);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    fd.field_D[var4] = var18.e((byte) 99);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                fl.field_j[var4] = var17.e((byte) 57);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("hia.E(").append(param0).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + ')');
        }
    }

    private final vja a(boolean param0, boolean param1, boolean param2, int param3) {
        if (((t) (Object) al.a(param3 ^ -366, ((hia) this).field_g)).field_p == 3) {
            return (vja) (Object) new ce(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, param0, param2, param1, 0);
        }
        if (param3 != -279) {
            ((hia) this).field_j = -73;
        }
        if (!(((t) (Object) al.a(param3 + 240, ((hia) this).field_g)).field_p != 2)) {
            return (vja) (Object) new hba(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, ((hia) this).field_k, param0, param2, param1, false);
        }
        return new vja(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, ((hia) this).field_k, param0, param2, param1);
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        t var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        aga var10 = null;
        vja stackIn_4_0 = null;
        vja stackIn_10_0 = null;
        vja stackIn_15_0 = null;
        hba stackIn_31_0 = null;
        Object stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        vja stackOut_3_0 = null;
        vja stackOut_9_0 = null;
        vja stackOut_14_0 = null;
        hba stackOut_30_0 = null;
        Object stackOut_35_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var10 = ((hia) this).field_h.a(44, param0);
            if (9 == var10.field_y) {
              stackOut_3_0 = this.a(true, false, true, param1 ^ -278);
              stackIn_4_0 = stackOut_3_0;
              return (ii) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param1 == 3) {
                  break L1;
                } else {
                  var9 = null;
                  ((hia) this).a(-51, (lu) null);
                  break L1;
                }
              }
              if (2 == var10.field_y) {
                stackOut_9_0 = this.a(true, false, true, param1 + -282);
                stackIn_10_0 = stackOut_9_0;
                return (ii) (Object) stackIn_10_0;
              } else {
                L2: {
                  if (11 != var10.field_y) {
                    break L2;
                  } else {
                    if (50 < kla.a(100, param0.field_w, -2147483648)) {
                      stackOut_14_0 = this.a(false, true, true, -279);
                      stackIn_15_0 = stackOut_14_0;
                      return (ii) (Object) stackIn_15_0;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var4 = (t) (Object) al.a(-107, ((hia) this).field_g);
                  if (var10.field_q < 10) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  int discarded$1 = kla.a(50, param0.field_w, param1 + 2147483645);
                  var5 = null;
                  if (var4.field_p == 3) {
                    L5: {
                      L6: {
                        var6 = ((hia) this).field_k;
                        ((hia) this).field_k = 0;
                        var7 = 0;
                        if (var4.field_u == 15) {
                          break L6;
                        } else {
                          if (var4.field_u == 45) {
                            break L6;
                          } else {
                            if (var4.field_u == 46) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var7 = 1;
                      break L5;
                    }
                    var6 = om.a(((hia) this).field_j, (byte) 118, var10.field_J, var7 != 0, var6, var10, var10.field_x, param0);
                    var5 = (Object) (Object) new ce(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, false, false, false, var6);
                    L7: while (true) {
                      if (var6 <= ((hia) this).field_k) {
                        break L4;
                      } else {
                        this.a(104, ((vja) var5).field_o, param0);
                        ((hia) this).field_k = ((hia) this).field_k + 1;
                        continue L7;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L8: {
                  if (2 == var4.field_p) {
                    var6 = ((hia) this).field_k;
                    if (param0.a(-9, var6, ((hia) this).field_j, var10)) {
                      var5 = (Object) (Object) new hba(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, var6, false, false, false, false);
                      break L8;
                    } else {
                      stackOut_30_0 = new hba(((hia) this).field_g, ((hia) this).field_h, ((hia) this).field_j, var6, false, false, false, true);
                      stackIn_31_0 = stackOut_30_0;
                      return (ii) (Object) stackIn_31_0;
                    }
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var5 != null) {
                    break L9;
                  } else {
                    var5 = (Object) (Object) this.a(false, false, false, -279);
                    break L9;
                  }
                }
                this.a(param1 ^ 94, ((vja) var5).field_o, param0);
                stackOut_35_0 = var5;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("hia.A(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L10;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_36_0;
    }

    private final void a(int param0, eaa param1, op param2) {
        RuntimeException var4 = null;
        aga var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wia var12_ref_wia = null;
        int var12 = 0;
        aga var13_ref_aga = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        iv var17_ref_iv = null;
        int var18 = 0;
        int var19 = 0;
        wia var20 = null;
        aga var21 = null;
        sl var22_ref_sl = null;
        ro var22_ref_ro = null;
        bm var22_ref_bm = null;
        int var22 = 0;
        o var23_ref_o = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        iv var26 = null;
        int var27 = 0;
        Object var28 = null;
        t var28_ref = null;
        t var29 = null;
        int[][] var33 = null;
        int stackIn_6_0 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_113_0 = 0;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_130_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        var28 = null;
        var27 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var28_ref = (t) (Object) al.a(-103, ((hia) this).field_g);
              var29 = var28_ref;
              var5 = ((hia) this).field_h.a(67, param2);
              var33 = haa.b(1, var5.d(125, ((hia) this).field_g), ((hia) this).field_j);
              var7 = var5.field_x;
              if (param0 > 26) {
                break L1;
              } else {
                ((hia) this).field_j = -84;
                break L1;
              }
            }
            L2: {
              var8 = var5.field_J;
              var9 = var29.field_q;
              if (var9 > 0) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_6_0;
              if (var10 == 0) {
                var9 = (int)(var5.a((oha) (Object) var29, -5313) * (double)var9);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var11 = 0;
              if (((hia) this).field_k != 31) {
                L5: {
                  if (2 != ((hia) this).field_j) {
                    if (((hia) this).field_j != 4) {
                      if (((hia) this).field_j == 1) {
                        var8 = var8 - ((hia) this).field_k;
                        break L5;
                      } else {
                        if (((hia) this).field_j == 3) {
                          var8 = var8 + ((hia) this).field_k;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      var7 = var7 + ((hia) this).field_k;
                      break L5;
                    }
                  } else {
                    var7 = var7 - ((hia) this).field_k;
                    break L5;
                  }
                }
                var12 = 17;
                var13 = 17;
                var14 = -1 + var12 >> 1;
                var15 = -1 + var13 >> 1;
                var16 = 0;
                L6: while (true) {
                  if (~var12 >= ~var16) {
                    break L4;
                  } else {
                    var17 = 0;
                    L7: while (true) {
                      if (~var13 >= ~var17) {
                        var16++;
                        continue L6;
                      } else {
                        L8: {
                          if (var33[var16][var17] != 1) {
                            break L8;
                          } else {
                            L9: {
                              L10: {
                                if (71 == var29.field_j) {
                                  break L10;
                                } else {
                                  if (var29.field_j == 72) {
                                    break L10;
                                  } else {
                                    if (var29.field_j == 73) {
                                      break L10;
                                    } else {
                                      if (var29.field_j == 12) {
                                        break L10;
                                      } else {
                                        if (13 == var29.field_j) {
                                          break L10;
                                        } else {
                                          if (var29.field_j == 14) {
                                            break L10;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              param2.field_T.field_B[var5.field_D] = param2.field_T.field_B[var5.field_D] + 1;
                              break L9;
                            }
                            L11: {
                              L12: {
                                if (9 == var29.field_j) {
                                  break L12;
                                } else {
                                  if (var29.field_j == 10) {
                                    break L12;
                                  } else {
                                    if (11 == var29.field_j) {
                                      break L12;
                                    } else {
                                      if (var29.field_j == 54) {
                                        break L12;
                                      } else {
                                        if (55 == var29.field_j) {
                                          break L12;
                                        } else {
                                          if (var29.field_j != 56) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              param2.field_T.field_k[var5.field_D] = param2.field_T.field_k[var5.field_D] + 1;
                              break L11;
                            }
                            var18 = -var14 + (var16 + var7);
                            var19 = var8 - -var17 - var15;
                            if (var18 < 0) {
                              break L8;
                            } else {
                              if (var18 >= param2.field_z) {
                                break L8;
                              } else {
                                if (var19 < 0) {
                                  break L8;
                                } else {
                                  if (param2.field_B > var19) {
                                    L13: {
                                      var20 = param2.field_a[var18][var19];
                                      var21 = var20.field_l;
                                      if (var20.b((byte) -113)) {
                                        var22_ref_sl = new sl(var9, var18, var19);
                                        param1.a((bw) (Object) var22_ref_sl, true);
                                        if (var20.field_n != 34) {
                                          break L13;
                                        } else {
                                          var23_ref_o = new o(50);
                                          param1.a((bw) (Object) var23_ref_o, true);
                                          break L13;
                                        }
                                      } else {
                                        break L13;
                                      }
                                    }
                                    L14: {
                                      if (!var20.field_d) {
                                        break L14;
                                      } else {
                                        var22_ref_ro = new ro(var18, var19);
                                        param1.a((bw) (Object) var22_ref_ro, true);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      if (var29.field_j == 80) {
                                        var22_ref_bm = new bm(15, var18, var19);
                                        if (param2.field_a[var18][var19].field_l == null) {
                                          param1.a((bw) (Object) var22_ref_bm, true);
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      } else {
                                        if (var29.field_j == 81) {
                                          var22_ref_bm = new bm(14, var18, var19);
                                          if (null == param2.field_a[var18][var19].field_l) {
                                            param1.a((bw) (Object) var22_ref_bm, true);
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (var21 != null) {
                                      L16: {
                                        if (var5.field_y == 42) {
                                          var5.field_G = true;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        var22 = 0;
                                        var23 = var9;
                                        var24 = 1;
                                        if (var29.field_p != 4) {
                                          L18: {
                                            if (var20.field_n != 18) {
                                              break L18;
                                            } else {
                                              var23 = 0;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            if (var21.field_y != 32) {
                                              break L19;
                                            } else {
                                              if (!var29.c(27863)) {
                                                var23 = 0;
                                                break L19;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          var24 = ga.field_b[var29.field_c][var21.field_o.field_k.field_b];
                                          if (var20.field_d) {
                                            var23 = var23 >> 1;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        } else {
                                          break L17;
                                        }
                                      }
                                      L20: {
                                        if (~var5.field_E != ~var21.field_D) {
                                          break L20;
                                        } else {
                                          if (var5.field_y != 37) {
                                            break L20;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                      L21: {
                                        if (var5.field_y != 53) {
                                          break L21;
                                        } else {
                                          var11++;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        if (var5.field_y != 53) {
                                          stackOut_112_0 = var29.field_u;
                                          stackIn_113_0 = stackOut_112_0;
                                          break L22;
                                        } else {
                                          stackOut_111_0 = 53;
                                          stackIn_113_0 = stackOut_111_0;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        var25 = stackIn_113_0;
                                        if (var21.field_y != 32) {
                                          break L23;
                                        } else {
                                          if (!var29.c(27863)) {
                                            var25 = 0;
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var26 = new iv(new nq(var21), var22 != 0, var24, var23, var25);
                                      param1.a((bw) (Object) var26, true);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
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
                var12_ref_wia = param2.field_a[var7][var8];
                var13_ref_aga = var12_ref_wia.field_l;
                if (var13_ref_aga == null) {
                  return;
                } else {
                  L24: {
                    var14 = 0;
                    var15 = var9;
                    var16 = 1;
                    if (var29.field_p == 4) {
                      break L24;
                    } else {
                      L25: {
                        if (var12_ref_wia.field_n == 18) {
                          var15 = 0;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      var16 = ga.field_b[var28_ref.field_c][var13_ref_aga.field_o.field_k.field_b];
                      if (var16 == 2) {
                        var15 = var15 << 1;
                        break L24;
                      } else {
                        if (var16 == 0) {
                          var15 = var15 >> 1;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  L26: {
                    if (var15 > 0) {
                      param2.field_T.field_f[var5.field_D] = param2.field_T.field_f[var5.field_D] + var15;
                      param2.field_T.field_b[var13_ref_aga.field_D] = param2.field_T.field_b[var13_ref_aga.field_D] + var15;
                      param2.field_T.field_n[var5.field_D] = param2.field_T.field_n[var5.field_D] + var15;
                      param2.field_T.field_g[var13_ref_aga.field_D] = param2.field_T.field_g[var13_ref_aga.field_D] + 1;
                      param2.field_T.field_y[var5.field_D] = param2.field_T.field_y[var5.field_D] + 1;
                      break L26;
                    } else {
                      L27: {
                        stackOut_23_0 = param2.field_T.field_F;
                        stackOut_23_1 = var5.field_D;
                        stackOut_23_2 = param2.field_T.field_F[var5.field_D];
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        if (var15 <= var13_ref_aga.field_t + -var13_ref_aga.field_I) {
                          stackOut_25_0 = (int[]) (Object) stackIn_25_0;
                          stackOut_25_1 = stackIn_25_1;
                          stackOut_25_2 = stackIn_25_2;
                          stackOut_25_3 = var15;
                          stackIn_26_0 = stackOut_25_0;
                          stackIn_26_1 = stackOut_25_1;
                          stackIn_26_2 = stackOut_25_2;
                          stackIn_26_3 = stackOut_25_3;
                          break L27;
                        } else {
                          stackOut_24_0 = (int[]) (Object) stackIn_24_0;
                          stackOut_24_1 = stackIn_24_1;
                          stackOut_24_2 = stackIn_24_2;
                          stackOut_24_3 = -var13_ref_aga.field_I + var13_ref_aga.field_t;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          stackIn_26_3 = stackOut_24_3;
                          break L27;
                        }
                      }
                      stackIn_26_0[stackIn_26_1] = stackIn_26_2 + -stackIn_26_3;
                      if (var13_ref_aga.field_D != var5.field_D) {
                        param2.field_T.field_j[var13_ref_aga.field_D] = true;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                  }
                  L28: {
                    if (-var15 + var13_ref_aga.field_I <= 0) {
                      param2.field_T.field_w[var5.field_D] = param2.field_T.field_w[var5.field_D] + 1;
                      if (20 != var5.field_o.field_b) {
                        break L28;
                      } else {
                        if (var13_ref_aga.field_o.field_b == 3) {
                          param2.field_T.field_x[var5.field_D] = true;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (53 != var5.field_y) {
                      break L29;
                    } else {
                      var11++;
                      break L29;
                    }
                  }
                  var17_ref_iv = new iv(new nq(var13_ref_aga), var14 != 0, var16, var15, var29.field_u);
                  param1.a((bw) (Object) var17_ref_iv, true);
                  break L4;
                }
              }
            }
            L30: {
              if (var11 >= 3) {
                param2.field_T.field_d[var5.field_D] = true;
                break L30;
              } else {
                break L30;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var4 = decompiledCaughtException;
            stackOut_124_0 = (RuntimeException) var4;
            stackOut_124_1 = new StringBuilder().append("hia.D(").append(param0).append(',');
            stackIn_126_0 = stackOut_124_0;
            stackIn_126_1 = stackOut_124_1;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            if (param1 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L31;
            } else {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "{...}";
              stackIn_127_0 = stackOut_125_0;
              stackIn_127_1 = stackOut_125_1;
              stackIn_127_2 = stackOut_125_2;
              break L31;
            }
          }
          L32: {
            stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
            stackOut_127_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_127_2).append(',');
            stackIn_129_0 = stackOut_127_0;
            stackIn_129_1 = stackOut_127_1;
            stackIn_128_0 = stackOut_127_0;
            stackIn_128_1 = stackOut_127_1;
            if (param2 == null) {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "null";
              stackIn_130_0 = stackOut_129_0;
              stackIn_130_1 = stackOut_129_1;
              stackIn_130_2 = stackOut_129_2;
              break L32;
            } else {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "{...}";
              stackIn_130_0 = stackOut_128_0;
              stackIn_130_1 = stackOut_128_1;
              stackIn_130_2 = stackOut_128_2;
              break L32;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_130_0, stackIn_130_2 + ')');
        }
    }

    final void a(int param0, lu param1) {
        try {
            int var3_int = 84 / ((61 - param0) / 53);
            param1.d(((hia) this).field_j | ((hia) this).field_k << 3, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hia.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = BachelorFridge.field_y;
          if (((dfa) (Object) dj.field_c).field_a) {
            if ((dj.field_c.field_h.field_f & 1 << dj.field_c.field_n) == 0) {
              if (0 != dj.field_c.field_h.field_f) {
                lr.field_k[12] = wha.field_g;
                break L0;
              } else {
                if ((1 << dj.field_c.field_h.field_d) - 1 == (1 << dj.field_c.field_n | dj.field_c.field_V)) {
                  lr.field_k[12] = ama.field_m;
                  break L0;
                } else {
                  lr.field_k[12] = rna.field_b;
                  break L0;
                }
              }
            } else {
              lr.field_k[12] = as.field_b;
              break L0;
            }
          } else {
            if (0 == (1 << dj.field_c.field_n & dj.field_c.field_h.field_f)) {
              if (dj.field_c.field_h.field_f != 0) {
                lr.field_k[12] = iia.field_o;
                break L0;
              } else {
                if ((1 << dj.field_c.field_h.field_d) + -1 == (1 << dj.field_c.field_n | dj.field_c.field_V)) {
                  lr.field_k[12] = dda.field_k;
                  break L0;
                } else {
                  lr.field_k[12] = mw.field_g;
                  break L0;
                }
              }
            } else {
              lr.field_k[12] = dk.field_q;
              break L0;
            }
          }
        }
        L1: {
          if (param0 <= -99) {
            break L1;
          } else {
            var3 = null;
            hia.a(101, (byte[]) null);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "<%0> cannot join; the game has started.";
    }
}
