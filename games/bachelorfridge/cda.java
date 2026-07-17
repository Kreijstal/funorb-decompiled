/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cda {
    gfa[] field_b;
    int field_a;

    final static hn a() {
        return saa.field_a;
    }

    final static void a(int param0, lu param1, ht param2) {
        try {
            RuntimeException var4 = null;
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
            Object var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = BachelorFridge.field_y;
            try {
              L0: {
                var18 = (Object) (Object) new fka();
                ((fka) var18).field_k = param1.b(16711935);
                ((fka) var18).field_n = param1.f(82);
                ((fka) var18).field_m = new int[((fka) var18).field_k];
                ((fka) var18).field_j = new eh[((fka) var18).field_k];
                ((fka) var18).field_l = new int[((fka) var18).field_k];
                ((fka) var18).field_g = new int[((fka) var18).field_k];
                ((fka) var18).field_f = new byte[((fka) var18).field_k][][];
                ((fka) var18).field_i = new eh[((fka) var18).field_k];
                var5 = 0;
                L1: while (true) {
                  if (((fka) var18).field_k <= var5) {
                    fd.field_z.a((bw) var18, true);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param1.b(16711935);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int == 2) {
                                  break L4;
                                } else {
                                  if (var6_int == 3) {
                                    var20 = param1.g(69);
                                    var21 = param1.g(40);
                                    var9 = param1.b(16711935);
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
                                          if (var6_int == 3) {
                                            var12_int = 0;
                                            L7: while (true) {
                                              if (var9 <= var12_int) {
                                                break L6;
                                              } else {
                                                var13 = param1.f(-87);
                                                var11[var12_int] = new byte[var13];
                                                param1.a(var24[var12_int], var13, 128, 0);
                                                var12_int++;
                                                continue L7;
                                              }
                                            }
                                          } else {
                                            break L6;
                                          }
                                        }
                                        ((fka) var18).field_g[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L8: while (true) {
                                          if (var17 >= var9) {
                                            ((fka) var18).field_j[var5] = param2.a(31633, wi.a(var20, -69), var12, var21);
                                            ((fka) var18).field_f[var5] = var24;
                                            break L3;
                                          } else {
                                            var12[var17] = wi.a(var10[var17], 81);
                                            var17++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param1.g(-126);
                                        var11_int++;
                                        continue L5;
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (4 != var6_int) {
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
                            var16 = param1.g(98);
                            var15 = param1.g(97);
                            var9 = 0;
                            if (1 == var6_int) {
                              var9 = param1.f(63);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((fka) var18).field_g[var5] = var6_int;
                          ((fka) var18).field_m[var5] = var9;
                          ((fka) var18).field_i[var5] = param2.a(var15, wi.a(var16, 88), -128);
                          break L3;
                        }
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((fka) var18).field_l[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((fka) var18).field_l[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        ((fka) var18).field_l[var5] = -5;
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
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("cda.B(").append(param0).append(44);
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param1 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L16;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L16;
                }
              }
              L17: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param2 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L17;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L17;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + 1 + 41);
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
