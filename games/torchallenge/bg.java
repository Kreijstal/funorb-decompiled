/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends ic {
    private boolean field_J;
    static int[] field_Q;
    static int[] field_O;
    private int field_N;
    private int field_M;
    static java.awt.Canvas field_P;
    private String field_L;
    private int field_H;
    static jf field_K;
    private eg field_F;
    static int[][] field_I;
    static float field_G;

    public static void h(int param0) {
        if (param0 != 0) {
            return;
        }
        field_Q = null;
        field_K = null;
        field_O = null;
        field_I = null;
        field_P = null;
    }

    final static int a(int param0, ji param1, int param2, ae param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TorChallenge.field_F ? 1 : 0;
          if (param3 == null) {
            break L0;
          } else {
            if (param3.field_l == null) {
              break L0;
            } else {
              if (param1 == null) {
                break L0;
              } else {
                if (param1.field_o != param3.field_o) {
                  break L0;
                } else {
                  var4 = param1.field_w.length;
                  var5 = param3.field_l[param0].length / var4;
                  var6 = 0;
                  if (param2 == 21179) {
                    L1: while (true) {
                      if (var6 >= var5) {
                        return -1;
                      } else {
                        if (param1.field_x == param3.field_t[param0][var6]) {
                          if (jc.a(param3.field_i[param0][var6], 26691)) {
                            var7 = 0;
                            L2: while (true) {
                              if (var7 >= var4) {
                                return var6;
                              } else {
                                if (param3.field_l[param0][var7 + var6 * var4] == param1.field_w[var7]) {
                                  var6 = var6;
                                  var7++;
                                  continue L2;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          } else {
                            var6++;
                            continue L1;
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return -77;
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(int param0, byte param1, ae param2) {
        pa var3 = dk.field_s;
        var3.d(param1 ^ 3, param0);
        var3.d(5, (byte) 122);
        var3.d(0, (byte) 122);
        var3.a(param2.field_o, (byte) 106);
        if (param1 != 26) {
            return;
        }
        var3.d(param2.field_r, (byte) 122);
        var3.d(param2.field_q, (byte) 122);
    }

    final static void a(kb param0, int param1, int param2, int param3, java.awt.Component param4, uj param5, int param6, boolean param7) {
        kh.a(param1, param7, 10);
        bh.field_o = kh.a(param5, param4, 0, param3);
        re.field_B = kh.a(param5, param4, 1, param2);
        mj.field_a = new jk();
        ea.field_f = param2 * 1000 / param1;
        re.field_B.b((qd) (Object) mj.field_a);
        la.field_a = param0;
        la.field_a.c(nk.field_h, false);
        int var8 = -123 % ((param6 - 59) / 51);
        bh.field_o.b((qd) (Object) la.field_a);
    }

    final static void a(int param0, byte param1, uj param2, uf param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            gh var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            var14 = TorChallenge.field_F ? 1 : 0;
            var18 = new gh();
            var18.field_p = param3.j(-125);
            var18.field_l = param3.i(84);
            var18.field_s = new byte[var18.field_p][][];
            var18.field_q = new mi[var18.field_p];
            var18.field_t = new int[var18.field_p];
            var18.field_u = new int[var18.field_p];
            if (param1 > 120) {
              var18.field_o = new int[var18.field_p];
              var18.field_j = new mi[var18.field_p];
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_p) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_o[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param3.j(-121);
                        if (-1 == (var6_int ^ -1)) {
                          break L2;
                        } else {
                          if ((var6_int ^ -1) == -2) {
                            break L2;
                          } else {
                            if (2 != var6_int) {
                              L3: {
                                if ((var6_int ^ -1) == -4) {
                                  break L3;
                                } else {
                                  if (4 == var6_int) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param3.b(false);
                              var8 = param3.b(false);
                              var9 = param3.j(-87);
                              var10 = new String[var9];
                              var11_int = 0;
                              L4: while (true) {
                                if (var11_int >= var9) {
                                  L5: {
                                    var23 = new byte[var9][];
                                    var22 = var23;
                                    var21 = var22;
                                    var19 = var21;
                                    var11 = var19;
                                    if (var6_int == 3) {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var9 <= var12_int) {
                                          break L5;
                                        } else {
                                          var13 = param3.i(98);
                                          var11[var12_int] = new byte[var13];
                                          param3.a(102, var23[var12_int], var13, 0);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                  var18.field_t[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var17 >= var9) {
                                      var18.field_q[var5] = param2.a(var8, (byte) 113, var12, gf.a(0, var20));
                                      var18.field_s[var5] = var23;
                                      break L1;
                                    } else {
                                      var12[var17] = gf.a(0, var10[var17]);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param3.b(false);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      L8: {
                        var16 = param3.b(false);
                        var7 = var16;
                        var15 = param3.b(false);
                        var8 = var15;
                        var9 = 0;
                        if ((var6_int ^ -1) != -2) {
                          break L8;
                        } else {
                          var9 = param3.i(92);
                          break L8;
                        }
                      }
                      var18.field_t[var5] = var6_int;
                      var18.field_u[var5] = var9;
                      var18.field_j[var5] = param2.a((byte) -125, var15, gf.a(0, var16));
                      var5++;
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_o[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_o[var5] = -4;
                    var5++;
                  }
                  continue L0;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bg(int param0, int param1, int param2, int param3, ee param4, boolean param5, int param6, int param7, eg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (j) null, (gg) null);
        ((bg) this).field_H = param7;
        ((bg) this).field_A = param4;
        ((bg) this).field_L = param10;
        ((bg) this).field_N = param9;
        ((bg) this).field_J = param5 ? true : false;
        ((bg) this).field_M = param6;
        ((bg) this).field_F = param8;
        int var12 = ((bg) this).field_M - ((bg) this).field_H;
        int var13 = ((bg) this).field_F.b(param10, var12, ((bg) this).field_F.field_x) - -(((bg) this).field_H * 2);
        if (param3 < var13) {
            ((bg) this).a((byte) 126, param0, var13, param2, param1);
        } else {
            var13 = param3;
        }
        int var14 = ((bg) this).field_J ? 0 : 2 * ((bg) this).field_H + ((bg) this).field_M;
        ((bg) this).field_A.a((byte) 103, var14, param3 + -(2 * ((bg) this).field_H), -((bg) this).field_M + (param2 + -(((bg) this).field_H * 3)), ((bg) this).field_H + (-param3 + var13 >> 1627127361));
    }

    final String b(boolean param0) {
        int var2 = ((bg) this).field_A.field_w ? 1 : 0;
        ((bg) this).field_A.field_w = ((bg) this).field_w;
        String var3 = ((bg) this).field_A.b(param0);
        if (param0) {
            return null;
        }
        ((bg) this).field_A.field_w = var2 != 0 ? true : false;
        return var3;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = ((bg) this).field_m - -param1;
        int var6 = param0 + ((bg) this).field_i;
        super.a(param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        int var7 = !((bg) this).field_J ? 0 : -(((bg) this).field_H * 2) + ((bg) this).field_p - ((bg) this).field_M;
        int discarded$0 = ((bg) this).field_F.a(((bg) this).field_L, var7 + var5 - -((bg) this).field_H, var6 + ((bg) this).field_H, ((bg) this).field_M - ((bg) this).field_H, -(2 * ((bg) this).field_H) + ((bg) this).field_l, ((bg) this).field_N, -1, ((bg) this).field_J ? 0 : 2, 1, ((bg) this).field_F.field_x);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[][]{new int[4], new int[4], new int[4]};
        field_O = new int[8192];
    }
}
