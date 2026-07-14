/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ca {
    static ba field_i;
    int field_h;
    int[] field_g;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 120) {
            field_i = null;
        }
        field_i = null;
    }

    final static String c(int param0) {
        if (param0 > -44) {
            field_i = null;
        }
        return cd.field_t.g(2);
    }

    final static v c(boolean param0) {
        if (param0) {
            return null;
        }
        return vb.field_f;
    }

    final static void a(mg param0, int param1, int param2, be param3) {
        try {
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            Class[] var13 = null;
            int var13_int = 0;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            ud var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var15 = OrbDefence.field_D ? 1 : 0;
            var19 = new ud();
            var19.field_o = param0.b((byte) 90);
            var19.field_k = param0.l(0);
            var19.field_m = new int[var19.field_o];
            var19.field_n = new int[var19.field_o];
            var19.field_i = new eb[var19.field_o];
            var19.field_g = new byte[var19.field_o][][];
            var5 = 123 % ((param2 - 75) / 46);
            var19.field_l = new int[var19.field_o];
            var19.field_h = new eb[var19.field_o];
            var6 = 0;
            L0: while (true) {
              if (var19.field_o <= var6) {
                var7_ref4 = decompiledCaughtException;
                var19.field_m[var6] = -5;
                var6++;
              } else {
                try {
                  L1: {
                    L2: {
                      var7_int = param0.b((byte) 90);
                      if (0 == var7_int) {
                        break L2;
                      } else {
                        if ((var7_int ^ -1) == -2) {
                          break L2;
                        } else {
                          if ((var7_int ^ -1) == -3) {
                            break L2;
                          } else {
                            L3: {
                              if (3 == var7_int) {
                                break L3;
                              } else {
                                if (4 == var7_int) {
                                  break L3;
                                } else {
                                  var6++;
                                  break L1;
                                }
                              }
                            }
                            var21 = param0.g(2);
                            var9 = param0.g(2);
                            var10 = param0.b((byte) 90);
                            var11 = new String[var10];
                            var12_int = 0;
                            L4: while (true) {
                              if (var12_int >= var10) {
                                L5: {
                                  var24 = new byte[var10][];
                                  var23 = var24;
                                  var22 = var23;
                                  var20 = var22;
                                  var12 = var20;
                                  if ((var7_int ^ -1) != -4) {
                                    break L5;
                                  } else {
                                    var13_int = 0;
                                    L6: while (true) {
                                      if (var13_int >= var10) {
                                        break L5;
                                      } else {
                                        var14 = param0.l(0);
                                        var12[var13_int] = new byte[var14];
                                        param0.a((byte) 115, var24[var13_int], 0, var14);
                                        var13_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                                var19.field_l[var6] = var7_int;
                                var13 = new Class[var10];
                                var18 = 0;
                                var14 = var18;
                                L7: while (true) {
                                  if (var18 >= var10) {
                                    var19.field_i[var6] = param3.a(var13, -334290960, var9, ie.a(var21, 64));
                                    var19.field_g[var6] = var24;
                                    var6++;
                                    break L1;
                                  } else {
                                    var13[var18] = ie.a(var11[var18], 73);
                                    var18++;
                                    continue L7;
                                  }
                                }
                              } else {
                                var11[var12_int] = param0.g(2);
                                var12_int++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    }
                    L8: {
                      var16 = param0.g(2);
                      var17 = param0.g(2);
                      var9 = param0.g(2);
                      var10 = 0;
                      if (-2 == (var7_int ^ -1)) {
                        var10 = param0.l(0);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var19.field_l[var6] = var7_int;
                    var19.field_n[var6] = var10;
                    var19.field_h[var6] = param3.a(ie.a(var16, 43), var17, -128);
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var19.field_m[var6] = -3;
                  var6++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var7_ref3 = (Exception) (Object) decompiledCaughtException;
                  var19.field_m[var6] = -4;
                  var6++;
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

    final static void a(int param0, ki param1) {
        if (param0 != -2) {
            String discarded$0 = fb.c(-98);
        }
        nj.b(param1.a("", 1, "headers.packvorbis"));
        nj var2 = nj.a(param1, "jagex logo2.packvorbis", "");
        dl discarded$1 = var2.a();
    }

    final static ee b(byte param0) {
        if (param0 >= -9) {
            field_i = null;
        }
        String var1 = am.b(114);
        if (var1 != null) {
            if (-1 >= (var1.indexOf('@') ^ -1)) {
                var1 = "";
            }
        }
        return new ee(am.b(-31), ui.a(true));
    }

    private fb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ba(1, 2, 2, 0);
    }
}
