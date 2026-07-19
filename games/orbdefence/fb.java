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
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static String c(int param0) {
        if (param0 > -44) {
            field_i = (ba) null;
            return cd.field_t.g(2);
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
            byte[] array$1 = null;
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
            int var13_int = 0;
            Class[] var13 = null;
            int var14 = 0;
            int var15 = 0;
            Object var16 = null;
            ud var16_ref = null;
            byte[][] var17 = null;
            String var18 = null;
            String var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            String stackIn_48_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_42_0 = null;
            StringBuilder stackOut_42_1 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            String stackOut_43_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            var15 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                var16_ref = new ud();
                var16_ref.field_o = param0.b((byte) 90);
                var16_ref.field_k = param0.l(0);
                var16_ref.field_m = new int[var16_ref.field_o];
                var16_ref.field_n = new int[var16_ref.field_o];
                var16_ref.field_i = new eb[var16_ref.field_o];
                var16_ref.field_g = new byte[var16_ref.field_o][][];
                var5 = 123 % ((param2 - 75) / 46);
                var16_ref.field_l = new int[var16_ref.field_o];
                var16_ref.field_h = new eb[var16_ref.field_o];
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var16_ref.field_o <= var6) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            var7_int = param0.b((byte) 90);
                            if (var15 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  if (0 == var7_int) {
                                    break L6;
                                  } else {
                                    if ((var7_int ^ -1) == -2) {
                                      break L6;
                                    } else {
                                      if ((var7_int ^ -1) == -3) {
                                        break L6;
                                      } else {
                                        L7: {
                                          if (3 == var7_int) {
                                            break L7;
                                          } else {
                                            if (4 == var7_int) {
                                              break L7;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        var18 = param0.g(2);
                                        var9 = param0.g(2);
                                        var10 = param0.b((byte) 90);
                                        var11 = new String[var10];
                                        var12_int = 0;
                                        L8: while (true) {
                                          if (var12_int >= var10) {
                                            L9: {
                                              L10: {
                                                var21 = new byte[var10][];
                                                var17 = var21;
                                                var12 = var17;
                                                if ((var7_int ^ -1) != -4) {
                                                  break L10;
                                                } else {
                                                  var13_int = 0;
                                                  L11: while (true) {
                                                    if (var13_int >= var10) {
                                                      break L10;
                                                    } else {
                                                      var14 = param0.l(0);
                                                      array$1 = new byte[var14];
                                                      var12[var13_int] = array$1;
                                                      param0.a((byte) 115, var21[var13_int], 0, var14);
                                                      var13_int++;
                                                      if (var15 != 0) {
                                                        break L9;
                                                      } else {
                                                        continue L11;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var16_ref.field_l[var6] = var7_int;
                                              break L9;
                                            }
                                            var13 = new Class[var10];
                                            var14 = 0;
                                            L12: while (true) {
                                              L13: {
                                                if (var14 >= var10) {
                                                  var16_ref.field_i[var6] = param3.a(var13, -334290960, var9, ie.a(var18, 64));
                                                  var16_ref.field_g[var6] = var21;
                                                  break L13;
                                                } else {
                                                  var13[var14] = ie.a(var11[var14], 73);
                                                  var14++;
                                                  if (var15 != 0) {
                                                    break L13;
                                                  } else {
                                                    continue L12;
                                                  }
                                                }
                                              }
                                              if (var15 == 0) {
                                                break L5;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          } else {
                                            var11[var12_int] = param0.g(2);
                                            var12_int++;
                                            if (var15 != 0) {
                                              break L5;
                                            } else {
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L14: {
                                  var19 = param0.g(2);
                                  var20 = param0.g(2);
                                  var10 = 0;
                                  if (-2 == (var7_int ^ -1)) {
                                    var10 = param0.l(0);
                                    break L14;
                                  } else {
                                    break L14;
                                  }
                                }
                                var16_ref.field_l[var6] = var7_int;
                                var16_ref.field_n[var6] = var10;
                                var16_ref.field_h[var6] = param3.a(ie.a(var19, 43), var20, -128);
                                break L5;
                              }
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          }
                        } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L15: {
                            var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                            var16_ref.field_m[var6] = -1;
                            decompiledRegionSelector0 = 1;
                            break L15;
                          }
                        } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L16: {
                            var7_ref = (SecurityException) (Object) decompiledCaughtException;
                            var16_ref.field_m[var6] = -2;
                            decompiledRegionSelector0 = 1;
                            break L16;
                          }
                        } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                          decompiledCaughtException = decompiledCaughtParameter2;
                          L17: {
                            var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                            var16_ref.field_m[var6] = -3;
                            decompiledRegionSelector0 = 1;
                            break L17;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L18: {
                            var7_ref3 = (Exception) (Object) decompiledCaughtException;
                            var16_ref.field_m[var6] = -4;
                            decompiledRegionSelector0 = 1;
                            break L18;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter4) {
                          decompiledCaughtException = decompiledCaughtParameter4;
                          L19: {
                            var7_ref4 = decompiledCaughtException;
                            var16_ref.field_m[var6] = -5;
                            decompiledRegionSelector0 = 1;
                            break L19;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          var6++;
                          if (var15 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ab.field_h.a(-78, var16_ref);
                    break L2;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L20: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_42_0 = (RuntimeException) (var4);
                stackOut_42_1 = new StringBuilder().append("fb.B(");
                stackIn_44_0 = stackOut_42_0;
                stackIn_44_1 = stackOut_42_1;
                stackIn_43_0 = stackOut_42_0;
                stackIn_43_1 = stackOut_42_1;
                if (param0 == null) {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "null";
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  stackIn_45_2 = stackOut_44_2;
                  break L20;
                } else {
                  stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
                  stackOut_43_2 = "{...}";
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_45_1 = stackOut_43_1;
                  stackIn_45_2 = stackOut_43_2;
                  break L20;
                }
              }
              L21: {
                stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_47_0 = stackOut_45_0;
                stackIn_47_1 = stackOut_45_1;
                stackIn_46_0 = stackOut_45_0;
                stackIn_46_1 = stackOut_45_1;
                if (param3 == null) {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "null";
                  stackIn_48_0 = stackOut_47_0;
                  stackIn_48_1 = stackOut_47_1;
                  stackIn_48_2 = stackOut_47_2;
                  break L21;
                } else {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "{...}";
                  stackIn_48_0 = stackOut_46_0;
                  stackIn_48_1 = stackOut_46_1;
                  stackIn_48_2 = stackOut_46_2;
                  break L21;
                }
              }
              throw dd.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, ki param1) {
        String discarded$0 = null;
        nj var2 = null;
        dl discarded$1 = null;
        try {
            if (param0 != -2) {
                discarded$0 = fb.c(-98);
            }
            nj.b(param1.a("", 1, "headers.packvorbis"));
            var2 = nj.a(param1, "jagex logo2.packvorbis", "");
            discarded$1 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ee b(byte param0) {
        String var1 = null;
        if (param0 >= -9) {
          L0: {
            field_i = (ba) null;
            var1 = am.b(114);
            if (var1 == null) {
              break L0;
            } else {
              if (-1 < (var1.indexOf('@') ^ -1)) {
                break L0;
              } else {
                var1 = "";
                break L0;
              }
            }
          }
          return new ee(am.b(-31), ui.a(true));
        } else {
          L1: {
            var1 = am.b(114);
            if (var1 == null) {
              break L1;
            } else {
              if (-1 < (var1.indexOf('@') ^ -1)) {
                break L1;
              } else {
                var1 = "";
                break L1;
              }
            }
          }
          return new ee(am.b(-31), ui.a(true));
        }
    }

    private fb() throws Throwable {
        throw new Error();
    }

    static {
        field_i = new ba(1, 2, 2, 0);
    }
}
