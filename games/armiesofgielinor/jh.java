/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class jh extends mk {
    static wk[] field_l;
    static String field_j;
    static int[] field_k;

    final static void a(vh param0, hd param1, int param2, int param3) {
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
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
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
            var14 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new dc();
                ((dc) var18).field_p = param0.k(0);
                ((dc) var18).field_q = param0.i(1);
                ((dc) var18).field_m = new int[((dc) var18).field_p];
                ((dc) var18).field_u = new byte[((dc) var18).field_p][][];
                if (param3 == -1) {
                  ((dc) var18).field_k = new wo[((dc) var18).field_p];
                  ((dc) var18).field_r = new wo[((dc) var18).field_p];
                  ((dc) var18).field_t = new int[((dc) var18).field_p];
                  ((dc) var18).field_v = new int[((dc) var18).field_p];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= ((dc) var18).field_p) {
                      tp.field_e.a((byte) -119, (tc) var18);
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              var6_int = param0.k(0);
                              if (0 == var6_int) {
                                break L4;
                              } else {
                                if (var6_int == 1) {
                                  break L4;
                                } else {
                                  if (var6_int == 2) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (3 == var6_int) {
                                        break L5;
                                      } else {
                                        if (var6_int == 4) {
                                          break L5;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    var20 = param0.g(1);
                                    var21 = param0.g(param3 + 2);
                                    var9 = param0.k(0);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var9 <= var11_int) {
                                        L7: {
                                          var24 = new byte[var9][];
                                          var23 = var24;
                                          var22 = var23;
                                          var19 = var22;
                                          var11 = var19;
                                          if (var6_int != 3) {
                                            break L7;
                                          } else {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var9 <= var12_int) {
                                                break L7;
                                              } else {
                                                var13 = param0.i(1);
                                                var11[var12_int] = new byte[var13];
                                                param0.a(0, var13, 0, var24[var12_int]);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          }
                                        }
                                        ((dc) var18).field_t[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var9 <= var17) {
                                            ((dc) var18).field_r[var5] = param1.a(ah.a(var20, (byte) 90), 0, var12, var21);
                                            ((dc) var18).field_u[var5] = var24;
                                            break L3;
                                          } else {
                                            var12[var17] = ah.a(var10[var17], (byte) 90);
                                            var17++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.g(kf.b(param3, -2));
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L10: {
                              var15 = param0.g(param3 + 2);
                              var16 = param0.g(1);
                              var9 = 0;
                              if (var6_int != 1) {
                                break L10;
                              } else {
                                var9 = param0.i(param3 + 2);
                                break L10;
                              }
                            }
                            ((dc) var18).field_t[var5] = var6_int;
                            ((dc) var18).field_v[var5] = var9;
                            ((dc) var18).field_k[var5] = param1.a(-30598, ah.a(var15, (byte) 90), var16);
                            break L3;
                          }
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          ((dc) var18).field_m[var5] = -1;
                          break L11;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          ((dc) var18).field_m[var5] = -4;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          ((dc) var18).field_m[var5] = -5;
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
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("jh.P(");
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
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param1 == null) {
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
              throw ig.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jh(fn param0) {
        super(param0);
    }

    final gu a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        gu stackIn_5_0 = null;
        gu stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        gu stackOut_4_0 = null;
        gu stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3137) {
                break L1;
              } else {
                field_k = null;
                break L1;
              }
            }
            var4 = (CharSequence) (Object) param1;
            if (!vv.a(-66, var4)) {
              stackOut_4_0 = rn.field_e;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                var5 = (CharSequence) (Object) param1;
                var3_int = dq.a(46, var5);
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (var3_int > 130) {
                    break L2;
                  } else {
                    return oo.field_g;
                  }
                }
              }
              stackOut_9_0 = rn.field_e;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("jh.R(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final static boolean g(int param0) {
        if (param0 != 2) {
            field_l = null;
        }
        if (!(fk.field_b != -1)) {
            if (!(es.a(-122, 1))) {
                return false;
            }
            fk.field_b = mg.field_e.k(0);
            mg.field_e.field_q = 0;
        }
        if (-2 == fk.field_b) {
            if (!es.a(-96, 2)) {
                return false;
            }
            fk.field_b = mg.field_e.e((byte) -104);
            mg.field_e.field_q = 0;
        }
        return es.a(-105, fk.field_b);
    }

    final static void a(String param0, long param1, int param2, int param3, int param4) {
        vt.field_l = param3;
        wn.field_db = param0;
        vi.field_e = param2;
        if (param4 != 19212) {
            return;
        }
        try {
            lq.field_d = true;
            rt.field_z = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "jh.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 89) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            if (((jh) this).a(-3137, param1) == rn.field_e) {
              stackOut_4_0 = jg.field_n;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("jh.O(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_5_0;
    }

    public static void h(int param0) {
        field_j = null;
        field_l = null;
        field_k = null;
    }

    final static void c(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                        hq.field_f = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
