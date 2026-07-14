/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gp extends li {
    gp field_p;
    long field_n;
    gp field_o;
    static r field_s;
    static String field_r;
    static String field_q;

    public static void g(int param0) {
        field_s = null;
        int var1 = 11 % ((param0 - -49) / 44);
        field_r = null;
        field_q = null;
    }

    final long f(int param0) {
        int var2 = 51 / ((56 - param0) / 35);
        return ((gp) this).field_n;
    }

    final void a(int param0) {
        if (param0 >= -96) {
            return;
        }
        if (((gp) this).field_o == null) {
            return;
        }
        ((gp) this).field_o.field_p = ((gp) this).field_p;
        ((gp) this).field_p.field_o = ((gp) this).field_o;
        ((gp) this).field_o = null;
        ((gp) this).field_p = null;
    }

    final void a(int param0, long param1) {
        if (!(null == ((gp) this).field_o)) {
            throw new RuntimeException();
        }
        ((gp) this).field_n = param1;
        if (param0 != -1) {
            field_s = null;
        }
    }

    protected gp() {
    }

    final boolean e(int param0) {
        if (!(null != ((gp) this).field_o)) {
            return false;
        }
        if (param0 >= -12) {
            return true;
        }
        return true;
    }

    final static void a(jj param0, int param1, ed param2, int param3) {
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
            oc var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var14 = Vertigo2.field_L ? 1 : 0;
            var18 = new oc();
            var18.field_n = param2.h(-11);
            var18.field_p = param2.b(true);
            if (param1 < -71) {
              var18.field_q = new byte[var18.field_n][][];
              var18.field_t = new wk[var18.field_n];
              var18.field_o = new int[var18.field_n];
              var18.field_w = new wk[var18.field_n];
              var18.field_y = new int[var18.field_n];
              var18.field_u = new int[var18.field_n];
              var5 = 0;
              L0: while (true) {
                if (var5 >= var18.field_n) {
                  var6_ref4 = decompiledCaughtException;
                  var18.field_y[var5] = -5;
                  var5++;
                } else {
                  try {
                    L1: {
                      L2: {
                        var6_int = param2.h(-11);
                        if (-1 == var6_int) {
                          break L2;
                        } else {
                          if (1 == var6_int) {
                            break L2;
                          } else {
                            if (-3 == var6_int) {
                              break L2;
                            } else {
                              L3: {
                                if (var6_int == 3) {
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
                              var20 = param2.f(128);
                              var21 = param2.f(128);
                              var9 = param2.h(-11);
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
                                    if (3 == var6_int) {
                                      var12_int = 0;
                                      L6: while (true) {
                                        if (var12_int >= var9) {
                                          break L5;
                                        } else {
                                          var13 = param2.b(true);
                                          var11[var12_int] = new byte[var13];
                                          param2.a(0, var24[var12_int], var13, 105);
                                          var12_int++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      break L5;
                                    }
                                  }
                                  var18.field_o[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L7: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_w[var5] = param0.a(var12, 38, eh.a(-1147375319, var20), var21);
                                      var18.field_q[var5] = var24;
                                      var5++;
                                      break L1;
                                    } else {
                                      var12[var17] = eh.a(-1147375319, var10[var17]);
                                      var17++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param2.f(128);
                                  var11_int++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      L8: {
                        var15 = param2.f(128);
                        var16 = param2.f(128);
                        var9 = 0;
                        if (var6_int == 1) {
                          var9 = param2.b(true);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var18.field_o[var5] = var6_int;
                      var18.field_u[var5] = var9;
                      var18.field_t[var5] = param0.a(-67, eh.a(-1147375319, var15), var16);
                      break L1;
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var5++;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                    var18.field_y[var5] = -3;
                    var5++;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_y[var5] = -4;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Enter name of player to add to list";
        field_q = "<%0>% of the map was <%1>";
    }
}
