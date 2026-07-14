/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jnb extends rqa {
    static java.math.BigInteger field_p;
    static int field_o;

    public static void a(int param0) {
        field_p = null;
        int var1 = 24 / ((param0 - -45) / 52);
    }

    final static boolean e(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 9) {
            break L0;
          } else {
            jnb.a(24);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!rnb.a(0)) {
              break L2;
            } else {
              if ((kdb.field_o & 8) != 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(eab param0, int param1, ds param2, boolean param3) {
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
            Class[] var12 = null;
            int var12_int = 0;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            mv var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var14 = VoidHunters.field_G;
              if (!param3) {
                break L0;
              } else {
                var15 = null;
                jnb.a((eab) null, 59, (ds) null, false);
                break L0;
              }
            }
            var19 = new mv();
            var19.field_i = param2.e((byte) -90);
            var19.field_d = param2.h(26);
            var19.field_e = new mob[var19.field_i];
            var19.field_j = new int[var19.field_i];
            var19.field_f = new byte[var19.field_i][][];
            var19.field_g = new mob[var19.field_i];
            var19.field_h = new int[var19.field_i];
            var19.field_k = new int[var19.field_i];
            var5 = 0;
            L1: while (true) {
              if (var19.field_i <= var5) {
                var6_ref4 = decompiledCaughtException;
                var19.field_k[var5] = -5;
                var5++;
              } else {
                try {
                  L2: {
                    L3: {
                      var6_int = param2.e((byte) -114);
                      if (0 == var6_int) {
                        break L3;
                      } else {
                        if (var6_int == 1) {
                          break L3;
                        } else {
                          if (var6_int == 2) {
                            break L3;
                          } else {
                            L4: {
                              if (var6_int == 3) {
                                break L4;
                              } else {
                                if ((var6_int ^ -1) == -5) {
                                  break L4;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                            }
                            var21 = param2.a(-1);
                            var22 = param2.a(-1);
                            var9 = param2.e((byte) -92);
                            var10 = new String[var9];
                            var11_int = 0;
                            L5: while (true) {
                              if (var11_int >= var9) {
                                L6: {
                                  var25 = new byte[var9][];
                                  var24 = var25;
                                  var23 = var24;
                                  var20 = var23;
                                  var11 = var20;
                                  if ((var6_int ^ -1) != -4) {
                                    break L6;
                                  } else {
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var9 <= var12_int) {
                                        break L6;
                                      } else {
                                        var13 = param2.h(62);
                                        var11[var12_int] = new byte[var13];
                                        param2.a(0, var25[var12_int], (byte) -59, var13);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                var19.field_h[var5] = var6_int;
                                var12 = new Class[var9];
                                var18 = 0;
                                var13 = var18;
                                L8: while (true) {
                                  if (var9 <= var18) {
                                    var19.field_e[var5] = param0.a(var12, (byte) 95, beb.a(var21, (byte) 99), var22);
                                    var19.field_f[var5] = var25;
                                    var5++;
                                    break L2;
                                  } else {
                                    var12[var18] = beb.a(var10[var18], (byte) 99);
                                    var18++;
                                    continue L8;
                                  }
                                }
                              } else {
                                var10[var11_int] = param2.a(-1);
                                var11_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      var17 = param2.a(-1);
                      var16 = param2.a(-1);
                      var9 = 0;
                      if (-2 == (var6_int ^ -1)) {
                        var9 = param2.h(40);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var19.field_h[var5] = var6_int;
                    var19.field_j[var5] = var9;
                    var19.field_g[var5] = param0.a(var16, beb.a(var17, (byte) 99), -6576);
                    break L2;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var5++;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var19.field_k[var5] = -3;
                  var5++;
                } catch (java.lang.Throwable decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var19.field_k[var5] = -4;
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

    jnb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        si.a(38, 62, param0[0].a(118));
        return new nc((Object) (Object) "void");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_o = 1;
    }
}
