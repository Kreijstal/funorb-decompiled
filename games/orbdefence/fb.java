/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ca {
    static ba field_i;
    int field_h;
    int[] field_g;
    static int[] field_f;

    public static void a() {
        field_f = null;
        field_i = null;
    }

    final static String c() {
        return cd.field_t.g(2);
    }

    final static v c(boolean param0) {
        return vb.field_f;
    }

    final static void a(mg param0, int param1, int param2, be param3) {
        try {
            RuntimeException var4 = null;
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
            Object var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
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
            var15 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var19 = (Object) (Object) new ud();
                ((ud) var19).field_o = param0.b((byte) 90);
                ((ud) var19).field_k = param0.l(0);
                ((ud) var19).field_m = new int[((ud) var19).field_o];
                ((ud) var19).field_n = new int[((ud) var19).field_o];
                ((ud) var19).field_i = new eb[((ud) var19).field_o];
                ((ud) var19).field_g = new byte[((ud) var19).field_o][][];
                var5 = 1;
                ((ud) var19).field_l = new int[((ud) var19).field_o];
                ((ud) var19).field_h = new eb[((ud) var19).field_o];
                var6 = 0;
                L1: while (true) {
                  if (((ud) var19).field_o <= var6) {
                    ab.field_h.a(-78, (ca) var19);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param0.b((byte) 90);
                            if (0 == var7_int) {
                              break L4;
                            } else {
                              if (var7_int == 1) {
                                break L4;
                              } else {
                                if (var7_int == 2) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (3 == var7_int) {
                                      break L5;
                                    } else {
                                      if (4 == var7_int) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var21 = param0.g(2);
                                  var9 = param0.g(2);
                                  var10 = param0.b((byte) 90);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var12_int >= var10) {
                                      L7: {
                                        var24 = new byte[var10][];
                                        var23 = var24;
                                        var22 = var23;
                                        var20 = var22;
                                        var12 = var20;
                                        if (var7_int != 3) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var13_int >= var10) {
                                              break L7;
                                            } else {
                                              var14 = param0.l(0);
                                              var12[var13_int] = new byte[var14];
                                              param0.a((byte) 115, var24[var13_int], 0, var14);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      ((ud) var19).field_l[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          ((ud) var19).field_i[var6] = param3.a(var13, -334290960, var9, ie.a(var21, 64));
                                          ((ud) var19).field_g[var6] = var24;
                                          break L3;
                                        } else {
                                          var13[var18] = ie.a(var11[var18], 73);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param0.g(2);
                                      var12_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param0.g(2);
                            String dupTemp$1 = param0.g(2);
                            var17 = dupTemp$1;
                            var9 = dupTemp$1;
                            var10 = 0;
                            if (var7_int == 1) {
                              var10 = param0.l(0);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((ud) var19).field_l[var6] = var7_int;
                          ((ud) var19).field_n[var6] = var10;
                          ((ud) var19).field_h[var6] = param3.a(ie.a(var16, 43), var17, -128);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((ud) var19).field_m[var6] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((ud) var19).field_m[var6] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        ((ud) var19).field_m[var6] = -5;
                        break L15;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_33_0 = (RuntimeException) var4;
                stackOut_33_1 = new StringBuilder().append("fb.B(");
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
                stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(-31).append(',');
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
              throw dd.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ki param1) {
        nj var2 = null;
        try {
            nj.b(param1.a("", 1, "headers.packvorbis"));
            var2 = nj.a(param1, "jagex logo2.packvorbis", "");
            dl discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "fb.E(" + -2 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ee b() {
        String var1 = am.b(114);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
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
