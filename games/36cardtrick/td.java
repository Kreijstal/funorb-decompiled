/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static le field_b;
    static String field_a;
    static kc[] field_c;

    final static void a(pb param0, byte param1, int param2, le param3) {
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
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = Main.field_T;
            if (param1 < -101) {
              var18 = (Object) (Object) new fd();
              ((fd) var18).field_o = param0.f(38);
              ((fd) var18).field_j = param0.e((byte) 126);
              ((fd) var18).field_l = new byte[((fd) var18).field_o][][];
              ((fd) var18).field_k = new int[((fd) var18).field_o];
              ((fd) var18).field_p = new vi[((fd) var18).field_o];
              ((fd) var18).field_i = new int[((fd) var18).field_o];
              ((fd) var18).field_m = new int[((fd) var18).field_o];
              ((fd) var18).field_r = new vi[((fd) var18).field_o];
              var5 = 0;
              L0: while (true) {
                if ((((fd) var18).field_o ^ -1) >= (var5 ^ -1)) {
                  vb.field_e.a((qb) var18, 27362);
                  return;
                } else {
                  try {
                    L1: {
                      L2: {
                        L3: {
                          var6_int = param0.f(-95);
                          if ((var6_int ^ -1) == -1) {
                            break L3;
                          } else {
                            if (-2 == (var6_int ^ -1)) {
                              break L3;
                            } else {
                              if (2 != var6_int) {
                                L4: {
                                  if (-4 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    if (var6_int == 4) {
                                      break L4;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                                var20 = param0.c(false);
                                var21 = param0.c(false);
                                var9 = param0.f(-101);
                                var10 = new String[var9];
                                var11_int = 0;
                                L5: while (true) {
                                  if (var11_int >= var9) {
                                    L6: {
                                      var24 = new byte[var9][];
                                      var23 = var24;
                                      var22 = var23;
                                      var19 = var22;
                                      var11 = var19;
                                      if (-4 == (var6_int ^ -1)) {
                                        var12_int = 0;
                                        L7: while (true) {
                                          if ((var12_int ^ -1) <= (var9 ^ -1)) {
                                            break L6;
                                          } else {
                                            var13 = param0.e((byte) 124);
                                            var11[var12_int] = new byte[var13];
                                            param0.a(93, var24[var12_int], 0, var13);
                                            var12_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                    ((fd) var18).field_k[var5] = var6_int;
                                    var12 = new Class[var9];
                                    var17 = 0;
                                    var13 = var17;
                                    L8: while (true) {
                                      if ((var17 ^ -1) <= (var9 ^ -1)) {
                                        ((fd) var18).field_r[var5] = param3.a((byte) 99, t.a(var20, -122), var21, var12);
                                        ((fd) var18).field_l[var5] = var24;
                                        break L2;
                                      } else {
                                        var12[var17] = t.a(var10[var17], -56);
                                        var17++;
                                        continue L8;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = param0.c(false);
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
                          var15 = param0.c(false);
                          var7 = var15;
                          var16 = param0.c(false);
                          var8 = var16;
                          var9 = 0;
                          if ((var6_int ^ -1) != -2) {
                            break L9;
                          } else {
                            var9 = param0.e((byte) 125);
                            break L9;
                          }
                        }
                        ((fd) var18).field_k[var5] = var6_int;
                        ((fd) var18).field_m[var5] = var9;
                        ((fd) var18).field_p[var5] = param3.a(t.a(var15, -107), var16, 115);
                        break L2;
                      }
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L10: {
                      var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                      ((fd) var18).field_i[var5] = -1;
                      break L10;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    L13: {
                      var6_ref3 = (Exception) (Object) decompiledCaughtException;
                      ((fd) var18).field_i[var5] = -4;
                      break L13;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    L14: {
                      var6_ref4 = decompiledCaughtException;
                      ((fd) var18).field_i[var5] = -5;
                      break L14;
                    }
                  }
                  var5++;
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

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = 96 % ((-46 - param0) / 61);
        field_a = null;
        field_c = null;
    }

    final static String a(int param0) {
        if (jc.field_P == hh.field_g) {
            return ri.field_b;
        }
        if (param0 != -2) {
            return null;
        }
        return ja.field_a;
    }

    final static void a(byte param0) {
        if (param0 != -11) {
            String discarded$0 = td.a(64);
        }
        gh.a(4, 31888);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Sound: ";
        field_c = new kc[6];
    }
}
