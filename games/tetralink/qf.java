/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static String field_a;
    static String field_c;
    static df field_h;
    static String[] field_f;
    static String field_e;
    static String field_j;
    static int field_i;
    static String[] field_b;
    static boolean field_g;
    static se field_k;
    static String field_d;

    final static String a(byte param0, String param1, int param2) {
        CharSequence var7 = (CharSequence) (Object) param1;
        if (!gi.a(false, var7)) {
            return uk.field_u;
        }
        if (ji.field_Tb != 2) {
            return el.field_qc;
        }
        if (!(!ej.a(param1, 4))) {
            return hl.field_A;
        }
        if (param0 != 122) {
            Object var5 = null;
            qf.a(-37, -32, (bh) null, (ie) null);
        }
        if (!(!oj.a(1, param1))) {
            return sk.a(new String[1], tc.field_n, 123);
        }
        if (-101 >= (qi.field_q ^ -1)) {
            if (0 >= mb.field_C) {
                return ha.field_g;
            }
        }
        if (qi.field_q >= 200) {
            return ha.field_g;
        }
        if (sb.a((byte) 2, param1)) {
            return sk.a(new String[1], rh.field_J, 126);
        }
        bc var6 = nd.field_Lb;
        var6.f(param2, (byte) -92);
        var6.field_t = var6.field_t + 1;
        int var4 = var6.field_t;
        var6.a(0, false);
        var6.a(param1, 0);
        var6.b(var6.field_t + -var4, param0 ^ -124);
        return null;
    }

    final static void a(int param0, boolean param1) {
        ra.a();
        if (param0 != 1) {
            field_k = null;
        }
    }

    final static void a(int param0, int param1, bh param2, ie param3) {
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
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            nm var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = TetraLink.field_J;
              var18 = new nm();
              var18.field_r = param2.d((byte) -99);
              var18.field_s = param2.f(-118);
              var18.field_u = new vl[var18.field_r];
              var18.field_x = new vl[var18.field_r];
              if (param1 == 4) {
                break L0;
              } else {
                qf.a(85, false);
                break L0;
              }
            }
            var18.field_w = new int[var18.field_r];
            var18.field_q = new int[var18.field_r];
            var18.field_z = new int[var18.field_r];
            var18.field_t = new byte[var18.field_r][][];
            var5 = 0;
            L1: while (true) {
              if (var18.field_r <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_w[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param2.d((byte) -99);
                      if (var6_int == 0) {
                        break L3;
                      } else {
                        if (var6_int == 1) {
                          break L3;
                        } else {
                          if (-3 != (var6_int ^ -1)) {
                            L4: {
                              if (var6_int == 3) {
                                break L4;
                              } else {
                                if (var6_int == 4) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var20 = param2.g((byte) 81);
                            var21 = param2.g((byte) 81);
                            var9 = param2.d((byte) -99);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
                                L6: {
                                  var24 = new byte[var9][];
                                  var23 = var24;
                                  var22 = var23;
                                  var19 = var22;
                                  var11 = var19;
                                  if ((var6_int ^ -1) != -4) {
                                    break L6;
                                  } else {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var12_int >= var9) {
                                        break L6;
                                      } else {
                                        var13 = param2.f(param1 + -113);
                                        var11[var12_int] = new byte[var13];
                                        param2.b(var13, 0, var24[var12_int], param1 ^ -29);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var18.field_z[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_u[var5] = param3.a(8, hh.a(var20, 42), var12, var21);
                                    var18.field_t[var5] = var24;
                                    break L2;
                                  } else {
                                    var12[var17] = hh.a(var10[var17], 111);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param2.g((byte) 81);
                                var11_int++;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L9: {
                      var16 = param2.g((byte) 81);
                      var7 = var16;
                      var15 = param2.g((byte) 81);
                      var8 = var15;
                      var9 = 0;
                      if (1 != var6_int) {
                        break L9;
                      } else {
                        var9 = param2.f(-123);
                        break L9;
                      }
                    }
                    var18.field_z[var5] = var6_int;
                    var18.field_q[var5] = var9;
                    var18.field_x[var5] = param3.a(var15, 26298, hh.a(var16, -72));
                    var5++;
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_w[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_w[var5] = -4;
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

    public static void a(boolean param0) {
        field_c = null;
        field_h = null;
        field_a = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_e = null;
        field_j = null;
        field_k = null;
        field_f = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Don't mind";
        field_e = "Buying or selling an account";
        field_a = "Tips";
        field_f = new String[]{"2D - Fastest", "2D - Best", "3D - Fastest", "3D - Balanced", "3D - Best"};
        field_b = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_i = 20;
        field_h = new df(2);
        field_d = "Switch to 3D mode";
    }
}
