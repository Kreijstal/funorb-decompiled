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
        return s.field_c[var4];
    }

    final static void a(ni param0, int param1, int param2, ce param3) {
        try {
            RuntimeException var4 = null;
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
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            var14 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new fg();
                ((fg) var18).field_k = param0.e(false);
                ((fg) var18).field_v = param0.c((byte) 126);
                ((fg) var18).field_w = new byte[((fg) var18).field_k][][];
                ((fg) var18).field_p = new int[((fg) var18).field_k];
                ((fg) var18).field_o = new int[((fg) var18).field_k];
                ((fg) var18).field_n = new od[((fg) var18).field_k];
                ((fg) var18).field_r = new int[((fg) var18).field_k];
                ((fg) var18).field_s = new od[((fg) var18).field_k];
                var5 = 0;
                L1: while (true) {
                  if (((fg) var18).field_k <= var5) {
                    jk.field_m.a(false, (lh) var18);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param0.e(false);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int == 2) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (var6_int == 3) {
                                      break L5;
                                    } else {
                                      if (4 == var6_int) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param0.h(0);
                                  var8 = param0.h(0);
                                  var9 = param0.e(false);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var9 <= var11_int) {
                                      L7: {
                                        var23 = new byte[var9][];
                                        var22 = var23;
                                        var21 = var22;
                                        var19 = var21;
                                        var11 = var19;
                                        if (var6_int != 3) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var12_int >= var9) {
                                              break L7;
                                            } else {
                                              var13 = param0.c((byte) -92);
                                              var11[var12_int] = new byte[var13];
                                              param0.b(var23[var12_int], 0, -106, var13);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      ((fg) var18).field_o[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          ((fg) var18).field_s[var5] = param3.a(var12, var8, nc.a((byte) -90, var20), 0);
                                          ((fg) var18).field_w[var5] = var23;
                                          break L3;
                                        } else {
                                          var12[var17] = nc.a((byte) -121, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param0.h(df.a(-3, -3));
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param0.h(0);
                            String dupTemp$1 = param0.h(0);
                            var15 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param0.c((byte) -120);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((fg) var18).field_o[var5] = var6_int;
                          ((fg) var18).field_p[var5] = var9;
                          ((fg) var18).field_n[var5] = param3.a((byte) 109, var15, nc.a((byte) -110, var16));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((fg) var18).field_r[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((fg) var18).field_r[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((fg) var18).field_r[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_33_0 = (RuntimeException) var4;
                stackOut_33_1 = new StringBuilder().append("kf.B(");
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                if (param0 == null) {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L16;
                } else {
                  stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                  stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                  stackOut_34_2 = "{...}";
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  break L16;
                }
              }
              L17: {
                stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(-3).append(44).append(param2).append(44);
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param3 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L17;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L17;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
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
