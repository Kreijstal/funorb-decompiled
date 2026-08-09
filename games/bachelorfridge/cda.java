/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cda {
    gfa[] field_b;
    int field_a;

    final static hn a(int param0) {
        if (param0 != 0) {
            return (hn) null;
        }
        return saa.field_a;
    }

    final static void a(int param0, lu param1, ht param2, boolean param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            StringBuilder stackIn_40_1 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
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
            var14 = BachelorFridge.field_y;
            try {
              L0: {
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
                L1: while (true) {
                  if (var18.field_k <= var5) {
                    fd.field_z.a(var18, param3);
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
                                  L5: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L5;
                                    } else {
                                      if (4 == var6_int) {
                                        break L5;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L2;
                                      }
                                    }
                                  }
                                  var20 = param1.g(69);
                                  var21 = param1.g(40);
                                  var9 = param1.b(16711935);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var11_int >= var9) {
                                      L7: {
                                        var22 = new byte[var9][];
                                        var19 = var22;
                                        var11 = var19;
                                        if (-4 == (var6_int ^ -1)) {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param1.f(-87);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param1.a(var22[var12_int], var13, 128, 0);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      var18.field_g[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var17 >= var9) {
                                          var18.field_j[var5] = param2.a(31633, wi.a(var20, -69), var12, var21);
                                          var18.field_f[var5] = var22;
                                          break L3;
                                        } else {
                                          var12[var17] = wi.a(var10[var17], 81);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.g(-126);
                                      var11_int++;
                                      continue L6;
                                    }
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
                          var18.field_g[var5] = var6_int;
                          var18.field_m[var5] = var9;
                          var18.field_i[var5] = param2.a(var15, wi.a(var16, 88), -128);
                          break L3;
                        }
                        decompiledRegionSelector0 = 1;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_l[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_l[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_l[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_l[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_l[var5] = -5;
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
                stackIn_37_0 = (RuntimeException) (var4);

                stackIn_37_1 = new StringBuilder().append("cda.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "null";
                  break L16;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackIn_38_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');

                if (param2 == null) {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "null";
                  break L17;
                } else {
                  stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackIn_41_2 = "{...}";
                  break L17;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    cda() {
        int var1 = 0;
        this.field_b = new gfa[11];
        for (var1 = 0; var1 < this.field_b.length; var1++) {
            this.field_b[var1] = new gfa(0, 0);
        }
    }

    static {
    }
}
