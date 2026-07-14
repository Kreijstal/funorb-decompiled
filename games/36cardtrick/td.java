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
            fd var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = Main.field_T;
            if (param1 < -101) {
              var18 = new fd();
              var18.field_o = param0.f(38);
              var18.field_j = param0.e((byte) 126);
              var18.field_l = new byte[((fd) var18).field_o][][];
              var18.field_k = new int[((fd) var18).field_o];
              var18.field_p = new vi[((fd) var18).field_o];
              var18.field_i = new int[((fd) var18).field_o];
              var18.field_m = new int[((fd) var18).field_o];
              var18.field_r = new vi[((fd) var18).field_o];
              var5 = 0;
              L0: while (true) {
                if (((fd) var18).field_o <= var5) {
                  var6_ref4 = decompiledCaughtException;
                  ((fd) var18).field_i[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param0.f(-95);
                        if (var6_int == -1) {
                          break L2;
                        } else {
                          if (-2 == var6_int) {
                            break L2;
                          } else {
                            if (2 != var6_int) {
                              L3: {
                                if (-4 == (var6_int ^ -1)) {
                                  break L3;
                                } else {
                                  if (var6_int == 4) {
                                    break L3;
                                  } else {
                                    var5++;
                                    break L1;
                                  }
                                }
                              }
                              var20 = param0.c(false);
                              var21 = param0.c(false);
                              var9 = param0.f(-101);
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
                                        if (var12_int >= var9) {
                                          break L5;
                                        } else {
                                          var13 = param0.e((byte) 124);
                                          var11[var12_int] = new byte[var13];
                                          param0.a(93, var24[var12_int], 0, var13);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                  ((fd) var18).field_k[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var17 >= var9) {
                                      ((fd) var18).field_r[var5] = param3.a((byte) 99, t.a(var20, -122), var21, var12);
                                      ((fd) var18).field_l[var5] = var24;
                                      break L1;
                                    } else {
                                      var12[var17] = t.a(var10[var17], -56);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param0.c(false);
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
                        var15 = param0.c(false);
                        var7 = var15;
                        var16 = param0.c(false);
                        var8 = var16;
                        var9 = 0;
                        if ((var6_int ^ -1) != -2) {
                          break L8;
                        } else {
                          var9 = param0.e((byte) 125);
                          break L8;
                        }
                      }
                      ((fd) var18).field_k[var5] = var6_int;
                      ((fd) var18).field_m[var5] = var9;
                      ((fd) var18).field_p[var5] = param3.a(t.a(var15, -107), var16, 115);
                      var5++;
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    ((fd) var18).field_i[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    ((fd) var18).field_i[var5] = -4;
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
            return (String) null;
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
