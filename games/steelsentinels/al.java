/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al {
    static String[] field_a;
    static int field_g;
    static String field_c;
    static hl field_i;
    static int field_d;
    static String field_e;
    static String[] field_f;
    static String field_b;
    static String field_h;

    abstract long a(byte param0);

    final static void a(boolean param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) ub.field_e);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ub.field_e);
        if (!param0) {
            return;
        }
        param1.addFocusListener((java.awt.event.FocusListener) (Object) ub.field_e);
    }

    final static int a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        return gh.field_hb;
    }

    final static wk[] a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 72) {
            int discarded$0 = al.a(-2);
        }
        return SteelSentinels.a(param0, param3, (byte) -62, 1, param2);
    }

    final int a(byte param0, long param1) {
        int var4 = -100 / ((param0 - -28) / 54);
        long var5 = ((al) this).a((byte) 120);
        if (-1L > (var5 ^ -1L)) {
            a.a((byte) 121, var5);
        }
        return ((al) this).a(param1, (byte) -97);
    }

    final static void a(pn param0, boolean param1, gi param2, int param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            ua var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = SteelSentinels.field_G;
              if (!param1) {
                break L0;
              } else {
                wk[] discarded$1 = al.a(-105, (byte) -107, 76, 3);
                break L0;
              }
            }
            var18 = new ua();
            var18.field_B = param2.f((byte) -80);
            var18.field_q = param2.i(0);
            var18.field_w = new int[var18.field_B];
            var18.field_F = new byte[var18.field_B][][];
            var18.field_K = new wj[var18.field_B];
            var18.field_A = new int[var18.field_B];
            var18.field_y = new wj[var18.field_B];
            var18.field_s = new int[var18.field_B];
            var5 = 0;
            L1: while (true) {
              if (var18.field_B <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_A[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param2.f((byte) -117);
                      if (0 == var6_int) {
                        break L3;
                      } else {
                        if (1 == var6_int) {
                          break L3;
                        } else {
                          if (2 == var6_int) {
                            break L3;
                          } else {
                            L4: {
                              if (-4 == (var6_int ^ -1)) {
                                break L4;
                              } else {
                                if (4 == var6_int) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var20 = param2.h(1);
                            var8 = param2.h(1);
                            var9 = param2.f((byte) -84);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var23 = new byte[var9][];
                                  var22 = var23;
                                  var21 = var22;
                                  var19 = var21;
                                  var11 = var19;
                                  if (var6_int != 3) {
                                    break L6;
                                  } else {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var9 <= var12_int) {
                                        break L6;
                                      } else {
                                        var13 = param2.i(0);
                                        var11[var12_int] = new byte[var13];
                                        param2.a(0, var23[var12_int], 28, var13);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var18.field_s[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var17 >= var9) {
                                    var18.field_K[var5] = param0.a(var8, (byte) 52, ea.a(10126, var20), var12);
                                    var18.field_F[var5] = var23;
                                    var5++;
                                    break L2;
                                  } else {
                                    var12[var17] = ea.a(10126, var10[var17]);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param2.h(1);
                                var11_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var15 = param2.h(1);
                      var16 = param2.h(1);
                      var8 = param2.h(1);
                      var9 = 0;
                      if (1 == var6_int) {
                        var9 = param2.i(0);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var18.field_s[var5] = var6_int;
                    var18.field_w[var5] = var9;
                    var18.field_y[var5] = param0.a(9, ea.a(10126, var15), var16);
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_A[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_A[var5] = -4;
                  var5++;
                }
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int[] param1, int param2, int[][] param3, int param4, int param5, int param6) {
        if (ua.field_p >= 30) {
            ua.field_p = ua.field_p + 1;
            return;
        }
        ua.field_t[ua.field_p][0] = param4;
        ua.field_t[ua.field_p][1] = param2;
        if (param0 < 44) {
            field_b = null;
        }
        ua.field_t[ua.field_p][2] = param5;
        ua.field_t[ua.field_p][3] = param6;
        ua.field_C[ua.field_p] = param1;
        ua.field_I[ua.field_p] = param3;
        ua.field_p = ua.field_p + 1;
    }

    abstract void c(byte param0);

    final static e b(byte param0) {
        if (param0 != 73) {
            al.a(105, (int[]) null, -49, (int[][]) null, 72, 102, -29);
        }
        if (cb.field_j == mm.field_e) {
            throw new IllegalStateException();
        }
        if (cb.field_j != sn.field_p) {
            return null;
        }
        cb.field_j = mm.field_e;
        return qf.field_d;
    }

    abstract int a(long param0, byte param1);

    public static void b(int param0) {
        if (param0 != 30) {
            int discarded$0 = al.a(-15);
        }
        field_c = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_c = "Honour";
        field_e = "Module slots: <%0>";
        field_b = "Press F10 to open Quick Chat.";
        field_f = new String[]{"OK"};
        field_h = "Cannot ordinarily be fired while your sentinel is in the air.";
    }
}
