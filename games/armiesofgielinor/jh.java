/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends mk {
    static wk[] field_l;
    static String field_j;
    static int[] field_k;

    final static void a(vh param0, hd param1, int param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            StringBuilder stackIn_39_1 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
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
            dc var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var18 = new dc();
                var18.field_p = param0.k(0);
                var18.field_q = param0.i(1);
                var18.field_m = new int[var18.field_p];
                var18.field_u = new byte[var18.field_p][][];
                if (param3 == -1) {
                  var18.field_k = new wo[var18.field_p];
                  var18.field_r = new wo[var18.field_p];
                  var18.field_t = new int[var18.field_p];
                  var18.field_v = new int[var18.field_p];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var18.field_p) {
                      tp.field_e.a((byte) -119, (tc) (var18));
                      decompiledRegionSelector0 = 1;
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
                                  if (-3 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (3 == var6_int) {
                                        break L5;
                                      } else {
                                        if ((var6_int ^ -1) == -5) {
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
                                          var22 = new byte[var9][];
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
                                                array$0 = new byte[var13];
                                                var11[var12_int] = array$0;
                                                param0.a(0, var13, 0, var22[var12_int]);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          }
                                        }
                                        var18.field_t[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var9 <= var17) {
                                            var18.field_r[var5] = param1.a(ah.a(var20, (byte) 90), 0, var12, var21);
                                            var18.field_u[var5] = var22;
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
                            var18.field_t[var5] = var6_int;
                            var18.field_v[var5] = var9;
                            var18.field_k[var5] = param1.a(-30598, ah.a(var15, (byte) 90), var16);
                            break L3;
                          }
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var18.field_m[var5] = -1;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var18.field_m[var5] = -2;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var18.field_m[var5] = -3;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var18.field_m[var5] = -4;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var18.field_m[var5] = -5;
                          break L15;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_36_0 = (RuntimeException) (var4);

                stackIn_36_1 = new StringBuilder().append("jh.P(");

                if (param0 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "null";
                  break L16;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

                if (param1 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -3137) {
                break L1;
              } else {
                field_k = (int[]) null;
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param1);
            if (!vv.a(-66, var4)) {
              stackIn_5_0 = rn.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var5 = (CharSequence) ((Object) param1);
                var3_int = dq.a(46, var5);
                if ((var3_int ^ -1) >= -1) {
                  break L2;
                } else {
                  if ((var3_int ^ -1) < -131) {
                    break L2;
                  } else {
                    return oo.field_g;
                  }
                }
              }
              stackIn_10_0 = rn.field_e;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("jh.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static boolean g(int param0) {
        if (param0 != 2) {
            field_l = (wk[]) null;
        }
        if (!(0 != (fk.field_b ^ -1))) {
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
            throw ig.a((Throwable) ((Object) runtimeException), "jh.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 89) {
                break L1;
              } else {
                field_l = (wk[]) null;
                break L1;
              }
            }
            if (this.a(-3137, param1) == rn.field_e) {
              stackIn_5_0 = jg.field_n;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("jh.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void h(int param0) {
        field_j = null;
        if (param0 >= -45) {
            field_k = (int[]) null;
        }
        field_l = null;
        field_k = null;
    }

    final static void c(byte param0) {
        try {
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (param0 < -64) {
                    break L1;
                  } else {
                    jh.g(-70);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (var1 == null) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          var2 = Runtime.getRuntime();
                          var4 = (Object[]) null;
                          var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
                          hq.field_f = (int)(var3.longValue() / 1048576L) + 1;
                          decompiledRegionSelector0 = 0;
                          break L4;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          var2_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L5;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L6;
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
