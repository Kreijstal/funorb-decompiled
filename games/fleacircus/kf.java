/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends lh {
    static int field_k;
    static String field_l;
    static dd field_i;
    static String field_j;

    private kf() throws Throwable {
        throw new Error();
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (!(!param0)) {
            var4 += 2;
        }
        if (param2) {
            var4++;
        }
        if (param1 >= -110) {
            field_l = null;
        }
        return s.field_c[var4];
    }

    final static void a(ni param0, int param1, int param2, ce param3) {
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
            fg var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = fleas.field_A ? 1 : 0;
              var18 = new fg();
              var18.field_k = param0.e(false);
              var18.field_v = param0.c((byte) 126);
              var18.field_w = new byte[var18.field_k][][];
              var18.field_p = new int[var18.field_k];
              var18.field_o = new int[var18.field_k];
              var18.field_n = new od[var18.field_k];
              var18.field_r = new int[var18.field_k];
              var18.field_s = new od[var18.field_k];
              if (param1 == -3) {
                break L0;
              } else {
                kf.a(-63);
                break L0;
              }
            }
            var5 = 0;
            L1: while (true) {
              if (var18.field_k <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_r[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param0.e(false);
                      if (var6_int == 0) {
                        break L3;
                      } else {
                        if (-2 == (var6_int ^ -1)) {
                          break L3;
                        } else {
                          if ((var6_int ^ -1) == -3) {
                            break L3;
                          } else {
                            L4: {
                              if ((var6_int ^ -1) == -4) {
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
                            var20 = param0.h(0);
                            var8 = param0.h(0);
                            var9 = param0.e(false);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var9 <= var11_int) {
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
                                      if (var12_int >= var9) {
                                        break L6;
                                      } else {
                                        var13 = param0.c((byte) -92);
                                        var11[var12_int] = new byte[var13];
                                        param0.b(var23[var12_int], 0, param1 + -103, var13);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var18.field_o[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L8: while (true) {
                                  if (var9 <= var17) {
                                    var18.field_s[var5] = param3.a(var12, var8, nc.a((byte) -90, var20), 0);
                                    var18.field_w[var5] = var23;
                                    var5++;
                                    break L2;
                                  } else {
                                    var12[var17] = nc.a((byte) -121, var10[var17]);
                                    var17++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param0.h(df.a(param1, -3));
                                var11_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var16 = param0.h(param1 + 3);
                      var15 = param0.h(0);
                      var8 = param0.h(0);
                      var9 = 0;
                      if ((var6_int ^ -1) == -2) {
                        var9 = param0.c((byte) -120);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var18.field_p[var5] = var9;
                    var18.field_n[var5] = param3.a((byte) 109, var15, nc.a((byte) -110, var16));
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_r[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_r[var5] = -4;
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

    public static void a(int param0) {
        if (param0 > -88) {
            field_i = null;
        }
        field_i = null;
        field_j = null;
        field_l = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 64;
        field_l = "Restart Level";
        field_j = "<%0>Exit:<%1> this is where you've got to get the fleas to";
    }
}
