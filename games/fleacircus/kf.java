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
        L0: {
          var4 = 0;
          if (param3) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0) {
            var4 += 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (!param2) {
          if (param1 >= -110) {
            field_l = (String) null;
            return s.field_c[var4];
          } else {
            return s.field_c[var4];
          }
        } else {
          var4++;
          if (param1 < -110) {
            return s.field_c[var4];
          } else {
            field_l = (String) null;
            return s.field_c[var4];
          }
        }
    }

    final static void a(ni param0, int param1, int param2, ce param3) {
        try {
            byte[] array$1 = null;
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
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            fg var15_ref = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            byte[][] var19 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            String stackOut_49_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            var14 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  var15_ref = new fg();
                  var15_ref.field_k = param0.e(false);
                  var15_ref.field_v = param0.c((byte) 126);
                  var15_ref.field_w = new byte[var15_ref.field_k][][];
                  var15_ref.field_p = new int[var15_ref.field_k];
                  var15_ref.field_o = new int[var15_ref.field_k];
                  var15_ref.field_n = new od[var15_ref.field_k];
                  var15_ref.field_r = new int[var15_ref.field_k];
                  var15_ref.field_s = new od[var15_ref.field_k];
                  if (param1 == -3) {
                    break L1;
                  } else {
                    kf.a(-63);
                    break L1;
                  }
                }
                var5 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var15_ref.field_k <= var5) {
                        break L4;
                      } else {
                        try {
                          L5: {
                            var6_int = param0.e(false);
                            if (var14 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L5;
                            } else {
                              L6: {
                                L7: {
                                  if (var6_int == 0) {
                                    break L7;
                                  } else {
                                    if (-2 == (var6_int ^ -1)) {
                                      break L7;
                                    } else {
                                      if ((var6_int ^ -1) == -3) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if ((var6_int ^ -1) == -4) {
                                            break L8;
                                          } else {
                                            if (4 == var6_int) {
                                              break L8;
                                            } else {
                                              break L6;
                                            }
                                          }
                                        }
                                        var17 = param0.h(0);
                                        var8 = param0.h(0);
                                        var9 = param0.e(false);
                                        var10 = new String[var9];
                                        var11_int = 0;
                                        L9: while (true) {
                                          if (var9 <= var11_int) {
                                            L10: {
                                              L11: {
                                                var19 = new byte[var9][];
                                                var16 = var19;
                                                var11 = var16;
                                                if (var6_int != 3) {
                                                  break L11;
                                                } else {
                                                  var12_int = 0;
                                                  L12: while (true) {
                                                    if (var12_int >= var9) {
                                                      break L11;
                                                    } else {
                                                      var13 = param0.c((byte) -92);
                                                      array$1 = new byte[var13];
                                                      var11[var12_int] = array$1;
                                                      param0.b(var19[var12_int], 0, param1 + -103, var13);
                                                      var12_int++;
                                                      if (var14 != 0) {
                                                        break L10;
                                                      } else {
                                                        continue L12;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              var15_ref.field_o[var5] = var6_int;
                                              break L10;
                                            }
                                            var12 = new Class[var9];
                                            var13 = 0;
                                            L13: while (true) {
                                              L14: {
                                                if (var9 <= var13) {
                                                  var15_ref.field_s[var5] = param3.a(var12, var8, nc.a((byte) -90, var17), 0);
                                                  var15_ref.field_w[var5] = var19;
                                                  break L14;
                                                } else {
                                                  var12[var13] = nc.a((byte) -121, var10[var13]);
                                                  var13++;
                                                  if (var14 != 0) {
                                                    break L14;
                                                  } else {
                                                    continue L13;
                                                  }
                                                }
                                              }
                                              if (var14 == 0) {
                                                break L6;
                                              } else {
                                                break L7;
                                              }
                                            }
                                          } else {
                                            var10[var11_int] = param0.h(df.a(param1, -3));
                                            var11_int++;
                                            if (var14 != 0) {
                                              break L6;
                                            } else {
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  var18 = param0.h(param1 + 3);
                                  var8 = param0.h(0);
                                  var9 = 0;
                                  if ((var6_int ^ -1) == -2) {
                                    var9 = param0.c((byte) -120);
                                    break L15;
                                  } else {
                                    break L15;
                                  }
                                }
                                var15_ref.field_o[var5] = var6_int;
                                var15_ref.field_p[var5] = var9;
                                var15_ref.field_n[var5] = param3.a((byte) 109, var8, nc.a((byte) -110, var18));
                                break L6;
                              }
                              decompiledRegionSelector0 = 1;
                              break L5;
                            }
                          }
                        } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L16: {
                            var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                            var15_ref.field_r[var5] = -1;
                            decompiledRegionSelector0 = 1;
                            break L16;
                          }
                        } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L17: {
                            var6_ref = (SecurityException) (Object) decompiledCaughtException;
                            var15_ref.field_r[var5] = -2;
                            decompiledRegionSelector0 = 1;
                            break L17;
                          }
                        } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                          decompiledCaughtException = decompiledCaughtParameter2;
                          L18: {
                            var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                            var15_ref.field_r[var5] = -3;
                            decompiledRegionSelector0 = 1;
                            break L18;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L19: {
                            var6_ref3 = (Exception) (Object) decompiledCaughtException;
                            var15_ref.field_r[var5] = -4;
                            decompiledRegionSelector0 = 1;
                            break L19;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter4) {
                          decompiledCaughtException = decompiledCaughtParameter4;
                          L20: {
                            var6_ref4 = decompiledCaughtException;
                            var15_ref.field_r[var5] = -5;
                            decompiledRegionSelector0 = 1;
                            break L20;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L3;
                        } else {
                          var5++;
                          if (var14 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    jk.field_m.a(false, var15_ref);
                    break L3;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L21: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_44_0 = (RuntimeException) (var4);
                stackOut_44_1 = new StringBuilder().append("kf.B(");
                stackIn_46_0 = stackOut_44_0;
                stackIn_46_1 = stackOut_44_1;
                stackIn_45_0 = stackOut_44_0;
                stackIn_45_1 = stackOut_44_1;
                if (param0 == null) {
                  stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackOut_46_2 = "null";
                  stackIn_47_0 = stackOut_46_0;
                  stackIn_47_1 = stackOut_46_1;
                  stackIn_47_2 = stackOut_46_2;
                  break L21;
                } else {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "{...}";
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_47_2 = stackOut_45_2;
                  break L21;
                }
              }
              L22: {
                stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_49_0 = stackOut_47_0;
                stackIn_49_1 = stackOut_47_1;
                stackIn_48_0 = stackOut_47_0;
                stackIn_48_1 = stackOut_47_1;
                if (param3 == null) {
                  stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackOut_49_2 = "null";
                  stackIn_50_0 = stackOut_49_0;
                  stackIn_50_1 = stackOut_49_1;
                  stackIn_50_2 = stackOut_49_2;
                  break L22;
                } else {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "{...}";
                  stackIn_50_0 = stackOut_48_0;
                  stackIn_50_1 = stackOut_48_1;
                  stackIn_50_2 = stackOut_48_2;
                  break L22;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        if (param0 > -88) {
          field_i = (dd) null;
          field_i = null;
          field_j = null;
          field_l = null;
          return;
        } else {
          field_i = null;
          field_j = null;
          field_l = null;
          return;
        }
    }

    static {
        field_k = 64;
        field_l = "Restart Level";
        field_j = "<%0>Exit:<%1> this is where you've got to get the fleas to";
    }
}
