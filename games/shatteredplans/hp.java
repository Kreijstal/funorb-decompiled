/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends me {
    static int[] field_k;
    static ub field_l;
    static fc field_m;
    static bc field_n;
    private int[] field_q;
    private int[] field_o;
    static int field_p;

    final int b(boolean param0) {
        if (param0) {
            hp.b((byte) -59);
        }
        return rs.field_Cb.field_J - -(((hp) this).field_o.length * cc.field_n);
    }

    final boolean a(dc param0, byte param1) {
        int var3 = 0;
        ln[] var3_ref_ln__ = null;
        int var4 = 0;
        ln var5_ref_ln = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var7 = null;
        int var8 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!super.a(param0, (byte) 94)) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= ((hp) this).field_i.length) {
              var7 = param0.field_g.field_e;
              var3_ref_ln__ = var7;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var7.length) {
                  L2: {
                    if (param1 >= 23) {
                      break L2;
                    } else {
                      int discarded$1 = ((hp) this).b(false);
                      break L2;
                    }
                  }
                  var3 = 0;
                  L3: while (true) {
                    if (((hp) this).field_i.length <= var3) {
                      var3 = 0;
                      var4 = 0;
                      var5 = 0;
                      L4: while (true) {
                        if (((hp) this).field_o.length <= var5) {
                          if (var3 == 0) {
                            return false;
                          } else {
                            ((hp) this).field_g = new fs[var3];
                            var8 = 0;
                            var5 = var8;
                            L5: while (true) {
                              if (var8 >= ((hp) this).field_i.length) {
                                return true;
                              } else {
                                if (((hp) this).field_o[var8] == var4) {
                                  var3--;
                                  ((hp) this).field_g[var3] = ((hp) this).field_i[var8];
                                  var8++;
                                  continue L5;
                                } else {
                                  var8++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          if (-1 == (param0.field_w & 1 << var5 ^ -1)) {
                            if (50 <= ((hp) this).field_o[var5]) {
                              if (((hp) this).field_o[var5] <= var4) {
                                if (var4 == ((hp) this).field_o[var5]) {
                                  var3++;
                                  var5++;
                                  continue L4;
                                } else {
                                  var5++;
                                  continue L4;
                                }
                              } else {
                                var4 = ((hp) this).field_o[var5];
                                var3 = 1;
                                var5++;
                                continue L4;
                              }
                            } else {
                              var5++;
                              continue L4;
                            }
                          } else {
                            ((hp) this).field_o[var5] = -1;
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      ((hp) this).field_o[var3] = ((hp) this).field_o[var3] + ((hp) this).field_q[var3];
                      var3++;
                      continue L3;
                    }
                  }
                } else {
                  var5_ref_ln = var7[var4];
                  if (2 == var5_ref_ln.field_L) {
                    if (null != var5_ref_ln.field_y) {
                      ((hp) this).field_q[var5_ref_ln.field_y.field_x] = ((hp) this).field_q[var5_ref_ln.field_y.field_x] - var5_ref_ln.field_G[0];
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              ((hp) this).field_q[var3] = 0;
              var3++;
              continue L0;
            }
          }
        } else {
          return true;
        }
    }

    hp(fs[] param0) {
        super(param0);
        ((hp) this).field_o = new int[((hp) this).field_i.length];
        ((hp) this).field_q = new int[((hp) this).field_i.length];
    }

    final void a(int param0, ob param1) {
        int var3 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var3 = 0; var3 < ((hp) this).field_o.length; var3++) {
            param1.c(((hp) this).field_o[var3], (byte) -92);
        }
        int var4 = -49 % ((-72 - param0) / 45);
    }

    final fs[] b(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5_int = 0;
        fs[] var5 = null;
        int var6 = 0;
        double var6_double = 0.0;
        double var7 = 0.0;
        int var9 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_m = null;
            break L0;
          }
        }
        if (null != ((hp) this).field_g) {
          return ((hp) this).field_g;
        } else {
          var2 = 0;
          var3 = 1.7976931348623157e+308;
          var5_int = 0;
          L1: while (true) {
            if (((hp) this).field_i.length <= var5_int) {
              if (var2 != 0) {
                var5 = new fs[var2];
                var6 = 0;
                L2: while (true) {
                  if (var6 >= ((hp) this).field_i.length) {
                    return var5;
                  } else {
                    if (-1 != (((hp) this).field_q[var6] ^ -1)) {
                      var7 = (double)(50 + -((hp) this).field_o[var6]) / (double)((hp) this).field_q[var6];
                      if (var3 == var7) {
                        var2--;
                        var5[var2] = ((hp) this).field_i[var6];
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new fs[]{};
              }
            } else {
              if (-1 != (((hp) this).field_q[var5_int] ^ -1)) {
                if (((hp) this).field_o[var5_int] != 0) {
                  var6_double = (double)(50 + -((hp) this).field_o[var5_int]) / (double)((hp) this).field_q[var5_int];
                  if (var6_double != var3) {
                    if (var3 > var6_double) {
                      var2 = 1;
                      var3 = var6_double;
                      var5_int++;
                      continue L1;
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    var5_int++;
                    continue L1;
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              } else {
                var5_int++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String var4 = null;
            String var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        cr.field_d = param2;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = param1.getParameter("cookieprefix");
                            var4 = param1.getParameter("cookiehost");
                            var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                            if (param2.length() == 0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ll.a(param1, "document.cookie=\"" + var5 + "\"", (byte) 123);
                            if (param0 > 7) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            field_n = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3_ref = caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        h.a(-1, param1);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_m = null;
        field_k = null;
        field_n = null;
        field_l = null;
        int var1 = 29 / ((param0 - 12) / 51);
    }

    final void a(ob param0, byte param1) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var3 = 0; ((hp) this).field_o.length > var3; var3++) {
            ((hp) this).field_o[var3] = param0.g(-2852);
        }
        if (param1 != -109) {
            Object var5 = null;
            hp.a((byte) 83, (java.applet.Applet) null, (String) null);
        }
    }

    final void a(byte param0, dc param1, kq param2) {
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        qk[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        var34 = new int[((hp) this).field_i.length];
        var29 = var34;
        var24 = var29;
        var18 = var24;
        var16 = var18;
        var36 = var16;
        var31 = var36;
        var26 = var31;
        var20 = var26;
        var4 = var20;
        if (param0 <= -9) {
          var5 = 0;
          L0: while (true) {
            if (var34.length <= var5) {
              var5 = 0;
              var35 = ((hp) this).field_o;
              var30 = var35;
              var25 = var30;
              var19 = var25;
              var17 = var19;
              var6 = var17;
              var7_int = 0;
              L1: while (true) {
                if (var7_int >= var35.length) {
                  L2: {
                    if (-1 > (var5 ^ -1)) {
                      lh.a((byte) 35, var4, (int[]) ((hp) this).field_o.clone());
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var23 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[1]))};
                  var7 = new fs[((hp) this).field_i.length];
                  var38 = new int[((hp) this).field_i.length];
                  var33 = var38;
                  var28 = var33;
                  var22 = var28;
                  var8 = var22;
                  var37 = new int[((hp) this).field_i.length];
                  var32 = var37;
                  var27 = var32;
                  var21 = var27;
                  var9 = var21;
                  var10_int = 0;
                  L3: while (true) {
                    if (var10_int >= ((hp) this).field_i.length) {
                      L4: {
                        L5: {
                          var10 = ((hp) this).b(0);
                          if (null != ((hp) this).field_g) {
                            break L5;
                          } else {
                            if (var10.length == 0) {
                              break L5;
                            } else {
                              var12 = var10[0].field_x;
                              var13 = (double)(-((hp) this).field_o[var12] + 50) / (double)((hp) this).field_q[var12];
                              var11 = (int)Math.ceil(var13);
                              break L4;
                            }
                          }
                        }
                        var11 = 0;
                        break L4;
                      }
                      param2.a(50, var7, var37, var38, var10, var23, (byte) -47, var11);
                      return;
                    } else {
                      var7[var10_int] = ((hp) this).field_i[var36[var10_int]];
                      var8[var10_int] = ((hp) this).field_o[var36[var10_int]];
                      var9[var10_int] = ((hp) this).field_q[var36[var10_int]];
                      var10_int++;
                      continue L3;
                    }
                  }
                } else {
                  var8_int = var35[var7_int];
                  var5 = var5 + var8_int;
                  var7_int++;
                  continue L1;
                }
              }
            } else {
              var34[var5] = var5;
              var5++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[]{800, 400, 200, 120, 80};
    }
}
