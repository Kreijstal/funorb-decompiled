/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cda {
    gfa[] field_b;
    int field_a;

    final static hn a(int param0) {
        if (param0 != 0) {
            return null;
        }
        return saa.field_a;
    }

    final static void a(int param0, lu param1, ht param2, boolean param3) {
        try {
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
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
            fka var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = BachelorFridge.field_y;
            var18 = new fka();
            var18.field_k = param1.b(16711935);
            var18.field_n = param1.f(82);
            var18.field_m = new int[var18.field_k];
            var18.field_j = new eh[var18.field_k];
            var18.field_l = new int[var18.field_k];
            var18.field_g = new int[var18.field_k];
            var18.field_f = new byte[var18.field_k][][];
            var18.field_i = new eh[var18.field_k];
            var5 = 0;
            L0: while (true) {
              if (var18.field_k <= var5) {
                var6_ref4 = decompiledCaughtException;
                var18.field_l[var5] = -5;
                var5++;
              } else {
                try {
                  L1: {
                    L2: {
                      var6_int = param1.b(16711935);
                      if (var6_int == 0) {
                        break L2;
                      } else {
                        if (var6_int == 1) {
                          break L2;
                        } else {
                          if (var6_int == 2) {
                            break L2;
                          } else {
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
                            var20 = param1.g(69);
                            var21 = param1.g(40);
                            var9 = param1.b(16711935);
                            var10 = new String[var9];
                            var11_int = 0;
                            L4: while (true) {
                              if (var11_int >= var9) {
                                L5: {
                                  var24 = new byte[var9][];
                                  var23 = var24;
                                  var22 = var23;
                                  var19 = var22;
                                  var11 = var19;
                                  if (-4 == (var6_int ^ -1)) {
                                    var12_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var12_int) {
                                        break L5;
                                      } else {
                                        var13 = param1.f(-87);
                                        var11[var12_int] = new byte[var13];
                                        param1.a(var24[var12_int], var13, 128, 0);
                                        var12_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                                var18.field_g[var5] = var6_int;
                                var12 = new Class[var9];
                                var17 = 0;
                                var13 = var17;
                                L7: while (true) {
                                  if (var17 >= var9) {
                                    var18.field_j[var5] = param2.a(31633, wi.a(var20, -69), var12, var21);
                                    var18.field_f[var5] = var24;
                                    var5++;
                                    break L1;
                                  } else {
                                    var12[var17] = wi.a(var10[var17], 81);
                                    var17++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var10[var11_int] = param1.g(-126);
                                var11_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var16 = param1.g(98);
                      var15 = param1.g(97);
                      var9 = 0;
                      if (1 == var6_int) {
                        var9 = param1.f(63);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var18.field_g[var5] = var6_int;
                    var18.field_m[var5] = var9;
                    var18.field_i[var5] = param2.a(var15, wi.a(var16, 88), -128);
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var18.field_l[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var18.field_l[var5] = -4;
                  var5++;
                }
                continue L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    cda() {
        int var1 = 0;
        ((cda) this).field_b = new gfa[11];
        for (var1 = 0; var1 < ((cda) this).field_b.length; var1++) {
            ((cda) this).field_b[var1] = new gfa(0, 0);
        }
    }

    static {
    }
}
