/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends ca {
    static ba field_i;
    int field_h;
    int[] field_g;
    static int[] field_f;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 120) {
            field_i = (ba) null;
        }
        field_i = null;
    }

    final static String c(int param0) {
        if (param0 > -44) {
            field_i = (ba) null;
        }
        return cd.field_t.g(2);
    }

    final static v c(boolean param0) {
        if (param0) {
            return (v) null;
        }
        return vb.field_f;
    }

    final static void a(mg param0, int param1, int param2, be param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            StringBuilder stackIn_38_1 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            int var13_int = 0;
            Class[] var13 = null;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            ud var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var15 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var19 = new ud();
                var19.field_o = param0.b((byte) 90);
                var19.field_k = param0.l(0);
                var19.field_m = new int[var19.field_o];
                var19.field_n = new int[var19.field_o];
                var19.field_i = new eb[var19.field_o];
                var19.field_g = new byte[var19.field_o][][];
                var5 = 123 % ((param2 - 75) / 46);
                var19.field_l = new int[var19.field_o];
                var19.field_h = new eb[var19.field_o];
                var6 = 0;
                L1: while (true) {
                  if (var19.field_o <= var6) {
                    ab.field_h.a(-78, var19);
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
                              if ((var7_int ^ -1) == -2) {
                                break L4;
                              } else {
                                if ((var7_int ^ -1) == -3) {
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
                                        var22 = new byte[var10][];
                                        var20 = var22;
                                        var12 = var20;
                                        if ((var7_int ^ -1) != -4) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var13_int >= var10) {
                                              break L7;
                                            } else {
                                              var14 = param0.l(0);
                                              array$0 = new byte[var14];
                                              var12[var13_int] = array$0;
                                              param0.a((byte) 115, var22[var13_int], 0, var14);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var19.field_l[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          var19.field_i[var6] = param3.a(var13, -334290960, var9, ie.a(var21, 64));
                                          var19.field_g[var6] = var22;
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
                            dupTemp$1 = param0.g(2);
                            var17 = dupTemp$1;
                            var9 = dupTemp$1;
                            var10 = 0;
                            if (-2 == (var7_int ^ -1)) {
                              var10 = param0.l(0);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var19.field_l[var6] = var7_int;
                          var19.field_n[var6] = var10;
                          var19.field_h[var6] = param3.a(ie.a(var16, 43), var17, -128);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19.field_m[var6] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19.field_m[var6] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19.field_m[var6] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19.field_m[var6] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var19.field_m[var6] = -5;
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
                stackIn_35_0 = (RuntimeException) (var4);

                stackIn_35_1 = new StringBuilder().append("fb.B(");

                if (param0 == null) {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackIn_36_2 = "null";
                  break L16;
                } else {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackIn_36_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L17;
                } else {
                  stackIn_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L17;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_36_0), stackIn_39_2 + ')');
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
            if (param0 != -2) {
                fb.c(-98);
            }
            nj.b(param1.a("", 1, "headers.packvorbis"));
            var2 = nj.a(param1, "jagex logo2.packvorbis", "");
            var2.a();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ee b(byte param0) {
        if (param0 >= -9) {
            field_i = (ba) null;
        }
        String var1 = am.b(114);
        if (var1 != null && -1 >= (var1.indexOf('@') ^ -1)) {
            var1 = "";
        }
        return new ee(am.b(-31), ui.a(true));
    }

    private fb() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new ba(1, 2, 2, 0);
    }
}
