/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static le field_b;
    static String field_a;
    static kc[] field_c;

    final static void a(pb param0, byte param1, int param2, le param3) {
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
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = Main.field_T;
            try {
              L0: {
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
                  L1: while (true) {
                    if (~((fd) var18).field_o >= ~var5) {
                      vb.field_e.a((qb) var18, 27362);
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              var6_int = param0.f(-95);
                              if (var6_int == 0) {
                                break L4;
                              } else {
                                if (var6_int == 1) {
                                  break L4;
                                } else {
                                  if (2 != var6_int) {
                                    L5: {
                                      if (var6_int == 3) {
                                        break L5;
                                      } else {
                                        if (var6_int == 4) {
                                          break L5;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    var20 = param0.c(false);
                                    var21 = param0.c(false);
                                    var9 = param0.f(-101);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var11_int >= var9) {
                                        L7: {
                                          var24 = new byte[var9][];
                                          var23 = var24;
                                          var22 = var23;
                                          var19 = var22;
                                          var11 = var19;
                                          if (var6_int == 3) {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (~var12_int <= ~var9) {
                                                break L7;
                                              } else {
                                                var13 = param0.e((byte) 124);
                                                var11[var12_int] = new byte[var13];
                                                param0.a(93, var24[var12_int], 0, var13);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        ((fd) var18).field_k[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (~var17 <= ~var9) {
                                            ((fd) var18).field_r[var5] = param3.a((byte) 99, t.a(var20, -122), var21, var12);
                                            ((fd) var18).field_l[var5] = var24;
                                            break L3;
                                          } else {
                                            var12[var17] = t.a(var10[var17], -56);
                                            var17++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.c(false);
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                            L10: {
                              var15 = param0.c(false);
                              var7 = var15;
                              var16 = param0.c(false);
                              var8 = var16;
                              var9 = 0;
                              if (var6_int != 1) {
                                break L10;
                              } else {
                                var9 = param0.e((byte) 125);
                                break L10;
                              }
                            }
                            ((fd) var18).field_k[var5] = var6_int;
                            ((fd) var18).field_m[var5] = var9;
                            ((fd) var18).field_p[var5] = param3.a(t.a(var15, -107), var16, 115);
                            break L3;
                          }
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          ((fd) var18).field_i[var5] = -1;
                          break L11;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          ((fd) var18).field_i[var5] = -4;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          ((fd) var18).field_i[var5] = -5;
                          break L15;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) var4;
                stackOut_36_1 = new StringBuilder().append("td.C(");
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param0 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44).append(param1).append(44).append(param2).append(44);
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param3 == null) {
                  stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                  stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + 41);
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
        int var1 = 0;
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
