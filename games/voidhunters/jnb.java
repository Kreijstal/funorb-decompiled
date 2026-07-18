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
            int discarded$7 = 0;
            if (!rnb.a()) {
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

    final static void a(eab param0, int param1, ds param2) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
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
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var14 = VoidHunters.field_G;
            try {
              L0: {
                var18 = (Object) (Object) new mv();
                ((mv) var18).field_i = param2.e((byte) -90);
                ((mv) var18).field_d = param2.h(26);
                ((mv) var18).field_e = new mob[((mv) var18).field_i];
                ((mv) var18).field_j = new int[((mv) var18).field_i];
                ((mv) var18).field_f = new byte[((mv) var18).field_i][][];
                ((mv) var18).field_g = new mob[((mv) var18).field_i];
                ((mv) var18).field_h = new int[((mv) var18).field_i];
                ((mv) var18).field_k = new int[((mv) var18).field_i];
                var5 = 0;
                L1: while (true) {
                  if (((mv) var18).field_i <= var5) {
                    tma.field_r.b(-10258, (ksa) var18);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param2.e((byte) -114);
                            if (0 == var6_int) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int == 2) {
                                  break L4;
                                } else {
                                  if (var6_int == 3) {
                                    var7 = param2.a(-1);
                                    var20 = param2.a(-1);
                                    var9 = param2.e((byte) -92);
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
                                                var13 = param2.h(62);
                                                var11[var12_int] = new byte[var13];
                                                param2.a(0, var23[var12_int], (byte) -59, var13);
                                                var12_int++;
                                                continue L7;
                                              }
                                            }
                                          }
                                        }
                                        ((mv) var18).field_h[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L8: while (true) {
                                          if (var9 <= var17) {
                                            int discarded$4 = 99;
                                            ((mv) var18).field_e[var5] = param0.a(var12, (byte) 95, beb.a(var7), var20);
                                            ((mv) var18).field_f[var5] = var23;
                                            break L3;
                                          } else {
                                            int discarded$5 = 99;
                                            var12[var17] = beb.a(var10[var17]);
                                            var17++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param2.a(-1);
                                        var11_int++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (var6_int != 4) {
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var5++;
                                    decompiledRegionSelector0 = 0;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            String dupTemp$6 = param2.a(-1);
                            var16 = dupTemp$6;
                            var7 = dupTemp$6;
                            var15 = param2.a(-1);
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param2.h(40);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((mv) var18).field_h[var5] = var6_int;
                          ((mv) var18).field_j[var5] = var9;
                          int discarded$7 = 99;
                          ((mv) var18).field_g[var5] = param0.a(var15, beb.a(var16), -6576);
                          break L3;
                        }
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((mv) var18).field_k[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((mv) var18).field_k[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((mv) var18).field_k[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L1;
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("jnb.D(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L16;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L16;
                }
              }
              L17: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param2 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + false + ')');
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
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              si.a(38, 62, param0[0].a(118));
              stackOut_3_0 = new nc((Object) (Object) "void");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jnb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
        field_o = 1;
    }
}
