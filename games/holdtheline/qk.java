/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk {
    short field_o;
    short[] field_K;
    byte[] field_r;
    int[] field_C;
    int[] field_M;
    short[] field_O;
    short[] field_t;
    short[] field_c;
    byte field_l;
    int[] field_D;
    int[] field_g;
    private boolean field_B;
    short[] field_w;
    static sd field_j;
    short[] field_k;
    short[] field_q;
    short[] field_Q;
    short[] field_i;
    short[] field_z;
    short[] field_A;
    int[] field_a;
    int field_n;
    static hj[] field_y;
    static mg field_f;
    int[] field_h;
    int field_d;
    int field_L;
    int field_H;
    int field_p;
    short[] field_P;
    int[] field_R;
    short[] field_s;
    short field_J;
    short[] field_m;
    static String field_I;
    short[] field_G;
    int field_F;
    short field_u;
    int[] field_v;
    short[] field_e;
    short[] field_x;
    int[] field_b;
    short[] field_N;
    static hj[] field_E;

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0 <= param1) {
              return;
            } else {
              if (1 + param1 >= param4) {
                return;
              } else {
                L1: {
                  if (param4 <= param1 + 5) {
                    break L1;
                  } else {
                    if (param5 != param6) {
                      var7_int = (param5 & param6 & 1) + (param6 >> 1) + (param5 >> 1);
                      var8 = param1;
                      var9 = param6;
                      var10 = param5;
                      var11 = param1;
                      L2: while (true) {
                        if (param4 <= var11) {
                          qk.a(param0, param1, param2, param3, var8, var9, param6);
                          qk.a(param0, var8, param2, param3, param4, param5, var10);
                          break L0;
                        } else {
                          L3: {
                            var12 = im.field_h[var11];
                            if (!param3) {
                              stackOut_23_0 = oh.field_s[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = va.field_j[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var13 <= var7_int) {
                              if (var10 < var13) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                im.field_h[var11] = im.field_h[var8];
                                if (var13 < var9) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              int incrementValue$2 = var8;
                              var8++;
                              im.field_h[incrementValue$2] = var12;
                              break L4;
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param4 - 1;
                L6: while (true) {
                  if (param1 >= var7_int) {
                    return;
                  } else {
                    var8 = param1;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = im.field_h[var8];
                          var10 = im.field_h[1 + var8];
                          int discarded$3 = 13234;
                          if (!mf.a(var10, param3, var9)) {
                            break L8;
                          } else {
                            im.field_h[var8] = var10;
                            im.field_h[var8 - -1] = var9;
                            break L8;
                          }
                        }
                        var8++;
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
          var7 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var7, "qk.F(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static int[] a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        pf var8 = null;
        pf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        pf var14 = null;
        int[] stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_31_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            var2_int = param0[0];
            var3 = param0[1];
            var4 = param0.length / 2;
            var5 = 1;
            L1: while (true) {
              if (~var4 >= ~var5) {
                L2: {
                  L3: {
                    if (null == qn.field_l) {
                      break L3;
                    } else {
                      if (~var4 >= ~qn.field_l.length) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qn.field_l = new pf[var4];
                  break L2;
                }
                var5 = 0;
                L4: while (true) {
                  if (var5 >= var4) {
                    var5 = 0;
                    L5: while (true) {
                      if (~var4 >= ~var5) {
                        L6: {
                          if (param1 < -110) {
                            break L6;
                          } else {
                            qk.a(-8);
                            break L6;
                          }
                        }
                        en.a(5433, (hd[]) (Object) qn.field_l, var4);
                        var5 = 2;
                        var6 = 2;
                        L7: while (true) {
                          if (~var4 >= ~var6) {
                            var12 = new int[2 * var5];
                            var7 = var12;
                            var13 = 0;
                            var6 = var13;
                            L8: while (true) {
                              if (var5 <= var13) {
                                stackOut_31_0 = (int[]) var7;
                                stackIn_32_0 = stackOut_31_0;
                                break L0;
                              } else {
                                var12[var13 * 2] = var2_int + qn.field_l[var13].field_a;
                                var12[2 * var13 - -1] = qn.field_l[var13].field_e + var3;
                                var13++;
                                continue L8;
                              }
                            }
                          } else {
                            L9: {
                              var14 = qn.field_l[-2 + var5];
                              var8 = qn.field_l[var5 + -1];
                              var9 = qn.field_l[var6];
                              var10 = -((-var14.field_e + var8.field_e) * (var9.field_a + -var14.field_a)) + (-var14.field_a + var8.field_a) * (var9.field_e - var14.field_e);
                              if (var10 > 0) {
                                break L9;
                              } else {
                                if (var5 >= 3) {
                                  var5--;
                                  continue L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            int incrementValue$1 = var5;
                            var5++;
                            qn.field_l[incrementValue$1] = var9;
                            var6++;
                            continue L7;
                          }
                        }
                      } else {
                        qn.field_l[var5].field_a = -var2_int + param0[var5 * 2];
                        qn.field_l[var5].field_e = param0[var5 * 2 - -1] + -var3;
                        var5++;
                        continue L5;
                      }
                    }
                  } else {
                    qn.field_l[var5] = new pf();
                    var5++;
                    continue L4;
                  }
                }
              } else {
                L10: {
                  L11: {
                    if (~param0[2 * var5] > ~var2_int) {
                      break L11;
                    } else {
                      if (~var2_int != ~param0[2 * var5]) {
                        break L10;
                      } else {
                        if (param0[2 * var5 - -1] < var3) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  var2_int = param0[2 * var5];
                  var3 = param0[2 * var5 + 1];
                  break L10;
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("qk.D(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param1 + 41);
        }
        return stackIn_32_0;
    }

    private final void a(byte param0) {
        if (param0 >= -101) {
            this.a((byte) -87);
        }
        ((qk) this).field_B = false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        if (param3 != 2) {
            return;
        }
        for (var6 = 0; var6 < ((qk) this).field_u; var6++) {
            ((qk) this).field_m[var6] = (short)(param2 * ((qk) this).field_m[var6] / param4);
            ((qk) this).field_G[var6] = (short)(((qk) this).field_G[var6] * param1 / param4);
            ((qk) this).field_k[var6] = (short)(param0 * ((qk) this).field_k[var6] / param4);
        }
        this.a((byte) -103);
    }

    final void c(int param0) {
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
        var12 = HoldTheLine.field_D;
        if (!((qk) this).field_B) {
          ((qk) this).field_B = true;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = param0;
          L0: while (true) {
            if (((qk) this).field_u <= var8) {
              ((qk) this).field_H = var3;
              ((qk) this).field_n = var4;
              ((qk) this).field_p = var7;
              ((qk) this).field_L = var2;
              ((qk) this).field_d = var6;
              ((qk) this).field_F = var5;
              return;
            } else {
              L1: {
                var9 = ((qk) this).field_m[var8];
                var10 = ((qk) this).field_G[var8];
                if (var2 > var9) {
                  var2 = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var9 > var5) {
                  var5 = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10 <= var6) {
                  break L3;
                } else {
                  var6 = var10;
                  break L3;
                }
              }
              L4: {
                if (var3 <= var10) {
                  break L4;
                } else {
                  var3 = var10;
                  break L4;
                }
              }
              L5: {
                var11 = ((qk) this).field_k[var8];
                if (var4 <= var11) {
                  break L5;
                } else {
                  var4 = var11;
                  break L5;
                }
              }
              if (var7 < var11) {
                var7 = var11;
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (param2 != -26608) {
            qk.a(-35);
        }
        for (var5 = 0; ((qk) this).field_u > var5; var5++) {
            ((qk) this).field_m[var5] = (short)(((qk) this).field_m[var5] + param1);
            ((qk) this).field_G[var5] = (short)(((qk) this).field_G[var5] + param0);
            ((qk) this).field_k[var5] = (short)(((qk) this).field_k[var5] + param3);
        }
        this.a((byte) -109);
    }

    public static void a(int param0) {
        field_E = null;
        if (param0 != -32768) {
            field_I = null;
        }
        field_y = null;
        field_f = null;
        field_j = null;
        field_I = null;
    }

    final static int b() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            th var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_31_0 = 0;
            if (ce.field_n.field_c >= 4) {
              if (ce.field_n.field_f != -1) {
                if (ce.field_n.field_f != -2) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (lc.field_g != 0) {
                      break L1;
                    } else {
                      tl.field_y = kl.field_v.a(0, lg.field_e, pe.field_c);
                      lc.field_g = lc.field_g + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (lc.field_g != 1) {
                      break L2;
                    } else {
                      if (2 == tl.field_y.field_d) {
                        stackOut_12_0 = bd.a(-1, 8077);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      } else {
                        if (1 != tl.field_y.field_d) {
                          break L2;
                        } else {
                          lc.field_g = lc.field_g + 1;
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (2 != lc.field_g) {
                      break L3;
                    } else {
                      oc.field_c = new nn((java.net.Socket) tl.field_y.field_b, kl.field_v);
                      var2 = new th(13);
                      ui.a(a.field_H, (byte) -95, var2, ee.field_n, wd.field_r);
                      var2.f(111, 15);
                      var2.a((byte) -58, rd.field_g);
                      oc.field_c.a(13, var2.field_i, 0, 1);
                      lc.field_g = lc.field_g + 1;
                      aj.field_b = 30000L + bb.b(-1);
                      break L3;
                    }
                  }
                  L4: {
                    if (lc.field_g == 3) {
                      if (oc.field_c.b(false) > 0) {
                        var1_int = oc.field_c.c(-27418);
                        if (var1_int != 0) {
                          stackOut_27_0 = bd.a(var1_int, 8077);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        } else {
                          lc.field_g = lc.field_g + 1;
                          break L4;
                        }
                      } else {
                        if (aj.field_b < bb.b(-1)) {
                          stackOut_23_0 = bd.a(-2, 8077);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (lc.field_g != 4) {
                    stackOut_33_0 = -1;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    ce.field_n.a((Object) (Object) oc.field_c, ka.field_d, 20);
                    oc.field_c = null;
                    tl.field_y = null;
                    lc.field_g = 0;
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return bd.a(-3, 8077);
              }
              return stackIn_34_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qk() {
        ((qk) this).field_l = (byte) 0;
        ((qk) this).field_B = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_I = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
    }
}
