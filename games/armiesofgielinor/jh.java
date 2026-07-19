/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends mk {
    static wk[] field_l;
    static String field_j;
    static int[] field_k;

    final static void a(vh param0, hd param1, int param2, int param3) {
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
            int var9 = 0;
            String[] var10 = null;
            int var11_int = 0;
            byte[][] var11 = null;
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            Object var15 = null;
            dc var15_ref = null;
            byte[][] var16 = null;
            String var17 = null;
            String var18 = null;
            String var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            var14 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                var15_ref = new dc();
                var15_ref.field_p = param0.k(0);
                var15_ref.field_q = param0.i(1);
                var15_ref.field_m = new int[var15_ref.field_p];
                var15_ref.field_u = new byte[var15_ref.field_p][][];
                if (param3 == -1) {
                  var15_ref.field_k = new wo[var15_ref.field_p];
                  var15_ref.field_r = new wo[var15_ref.field_p];
                  var15_ref.field_t = new int[var15_ref.field_p];
                  var15_ref.field_v = new int[var15_ref.field_p];
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5 >= var15_ref.field_p) {
                          break L3;
                        } else {
                          try {
                            L4: {
                              var6_int = param0.k(0);
                              if (var14 != 0) {
                                decompiledRegionSelector0 = 0;
                                break L4;
                              } else {
                                L5: {
                                  L6: {
                                    if (0 == var6_int) {
                                      break L6;
                                    } else {
                                      if (var6_int == 1) {
                                        break L6;
                                      } else {
                                        if (-3 == (var6_int ^ -1)) {
                                          break L6;
                                        } else {
                                          L7: {
                                            if (3 == var6_int) {
                                              break L7;
                                            } else {
                                              if ((var6_int ^ -1) == -5) {
                                                break L7;
                                              } else {
                                                break L5;
                                              }
                                            }
                                          }
                                          var17 = param0.g(1);
                                          var18 = param0.g(param3 + 2);
                                          var9 = param0.k(0);
                                          var10 = new String[var9];
                                          var11_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var11_int) {
                                              L9: {
                                                L10: {
                                                  var21 = new byte[var9][];
                                                  var16 = var21;
                                                  var11 = var16;
                                                  if (var6_int != 3) {
                                                    break L10;
                                                  } else {
                                                    var12_int = 0;
                                                    L11: while (true) {
                                                      if (var9 <= var12_int) {
                                                        break L10;
                                                      } else {
                                                        var13 = param0.i(1);
                                                        array$1 = new byte[var13];
                                                        var11[var12_int] = array$1;
                                                        param0.a(0, var13, 0, var21[var12_int]);
                                                        var12_int++;
                                                        if (var14 != 0) {
                                                          break L9;
                                                        } else {
                                                          continue L11;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                var15_ref.field_t[var5] = var6_int;
                                                break L9;
                                              }
                                              var12 = new Class[var9];
                                              var13 = 0;
                                              L12: while (true) {
                                                L13: {
                                                  if (var9 <= var13) {
                                                    var15_ref.field_r[var5] = param1.a(ah.a(var17, (byte) 90), 0, var12, var18);
                                                    var15_ref.field_u[var5] = var21;
                                                    break L13;
                                                  } else {
                                                    var12[var13] = ah.a(var10[var13], (byte) 90);
                                                    var13++;
                                                    if (var14 != 0) {
                                                      break L13;
                                                    } else {
                                                      continue L12;
                                                    }
                                                  }
                                                }
                                                if (var14 == 0) {
                                                  break L5;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              var10[var11_int] = param0.g(kf.b(param3, -2));
                                              var11_int++;
                                              if (var14 != 0) {
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
                                    var19 = param0.g(param3 + 2);
                                    var20 = param0.g(1);
                                    var9 = 0;
                                    if (var6_int != 1) {
                                      break L14;
                                    } else {
                                      var9 = param0.i(param3 + 2);
                                      break L14;
                                    }
                                  }
                                  var15_ref.field_t[var5] = var6_int;
                                  var15_ref.field_v[var5] = var9;
                                  var15_ref.field_k[var5] = param1.a(-30598, ah.a(var19, (byte) 90), var20);
                                  break L5;
                                }
                                decompiledRegionSelector0 = 1;
                                break L4;
                              }
                            }
                          } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L15: {
                              var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                              var15_ref.field_m[var5] = -1;
                              decompiledRegionSelector0 = 1;
                              break L15;
                            }
                          } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            L16: {
                              var6_ref = (SecurityException) (Object) decompiledCaughtException;
                              var15_ref.field_m[var5] = -2;
                              decompiledRegionSelector0 = 1;
                              break L16;
                            }
                          } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            L17: {
                              var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                              var15_ref.field_m[var5] = -3;
                              decompiledRegionSelector0 = 1;
                              break L17;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter3) {
                            decompiledCaughtException = decompiledCaughtParameter3;
                            L18: {
                              var6_ref3 = (Exception) (Object) decompiledCaughtException;
                              var15_ref.field_m[var5] = -4;
                              decompiledRegionSelector0 = 1;
                              break L18;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter4) {
                            decompiledCaughtException = decompiledCaughtParameter4;
                            L19: {
                              var6_ref4 = decompiledCaughtException;
                              var15_ref.field_m[var5] = -5;
                              decompiledRegionSelector0 = 1;
                              break L19;
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            break L2;
                          } else {
                            var5++;
                            if (var14 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      tp.field_e.a((byte) -119, (tc) (var15_ref));
                      break L2;
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L20: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) (var4);
                stackOut_43_1 = new StringBuilder().append("jh.P(");
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param0 == null) {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L20;
                } else {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L20;
                }
              }
              L21: {
                stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param1 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L21;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L21;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
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
                field_k = (int[]) null;
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param1);
            if (!vv.a(-66, var4)) {
              stackOut_4_0 = rn.field_e;
              stackIn_5_0 = stackOut_4_0;
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
              stackOut_9_0 = rn.field_e;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3);
            stackOut_11_1 = new StringBuilder().append("jh.R(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
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
        if (param0 == 2) {
          L0: {
            if (0 == (fk.field_b ^ -1)) {
              if (!es.a(-122, 1)) {
                return false;
              } else {
                fk.field_b = mg.field_e.k(0);
                mg.field_e.field_q = 0;
                break L0;
              }
            } else {
              break L0;
            }
          }
          if (-2 == fk.field_b) {
            if (!es.a(-96, 2)) {
              return false;
            } else {
              fk.field_b = mg.field_e.e((byte) -104);
              mg.field_e.field_q = 0;
              return es.a(-105, fk.field_b);
            }
          } else {
            return es.a(-105, fk.field_b);
          }
        } else {
          L1: {
            field_l = (wk[]) null;
            if (0 == (fk.field_b ^ -1)) {
              if (!es.a(-122, 1)) {
                return false;
              } else {
                fk.field_b = mg.field_e.k(0);
                mg.field_e.field_q = 0;
                break L1;
              }
            } else {
              break L1;
            }
          }
          if (-2 == fk.field_b) {
            if (!es.a(-96, 2)) {
              return false;
            } else {
              fk.field_b = mg.field_e.e((byte) -104);
              mg.field_e.field_q = 0;
              return es.a(-105, fk.field_b);
            }
          } else {
            return es.a(-105, fk.field_b);
          }
        }
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
                field_l = (wk[]) null;
                break L1;
              }
            }
            if (this.a(-3137, param1) == rn.field_e) {
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
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("jh.O(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
            field_l = null;
            field_k = null;
            return;
        }
        field_l = null;
        field_k = null;
    }

    final static void c(byte param0) {
        try {
            boolean discarded$1 = false;
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (param0 < -64) {
                    break L1;
                  } else {
                    discarded$1 = jh.g(-70);
                    break L1;
                  }
                }
                L2: {
                  if (var1 == null) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1.invoke((Object) (var2_ref), (Object[]) null));
                        hq.field_f = (int)(var3.longValue() / 1048576L) + 1;
                        decompiledRegionSelector0 = 0;
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2 = decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L4;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                break L5;
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
