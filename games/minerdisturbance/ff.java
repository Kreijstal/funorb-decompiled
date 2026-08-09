/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static bg field_a;
    static ea[] field_c;
    static ea field_f;
    static int field_b;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        ml stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        ml stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        L0: {
          if (-12 <= (oj.field_J ^ -1)) {
            if (pd.field_b.field_K) {
              if (-12 > (q.field_c ^ -1)) {
                break L0;
              } else {
                nj.a(true);
                break L0;
              }
            } else {
              if (!pd.field_b.field_K) {
                break L0;
              } else {
                if (-12 > (q.field_c ^ -1)) {
                  break L0;
                } else {
                  nj.a(true);
                  break L0;
                }
              }
            }
          } else {
            if (!pd.field_b.field_K) {
              break L0;
            } else {
              if (-12 > (q.field_c ^ -1)) {
                break L0;
              } else {
                nj.a(true);
                break L0;
              }
            }
          }
        }
        L1: {
          if ((oj.field_J ^ -1) <= -1) {
            L2: {
              L3: {
                stackIn_16_0 = nb.field_i[oj.field_J];

                stackIn_16_1 = tl.field_q;

                stackIn_16_2 = -22674;

                if (11 >= mc.field_w) {
                  break L3;
                } else {
                  stackIn_16_0 = (ml) ((Object) stackIn_16_0);

                  if (tk.field_a) {
                    break L3;
                  } else {
                    stackIn_17_0 = (ml) ((Object) stackIn_16_0);
                    stackIn_17_1 = stackIn_16_1;
                    stackIn_17_2 = stackIn_16_2;
                    stackIn_17_3 = 0;
                    break L2;
                  }
                }
              }
              stackIn_17_0 = (ml) ((Object) stackIn_16_0);
              stackIn_17_1 = stackIn_16_1;
              stackIn_17_2 = stackIn_16_2;
              stackIn_17_3 = ui.field_L;
              break L2;
            }
            ((ml) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_17_2, stackIn_17_3);
            break L1;
          } else {
            break L1;
          }
        }
        L4: {
          if (!param0) {
            break L4;
          } else {
            ff.a(true);
            break L4;
          }
        }
    }

    final static void a(vf param0, sb param1, int param2, boolean param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            sb stackIn_13_0 = null;
            sb stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            RuntimeException stackIn_43_0 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
            StringBuilder stackIn_45_1 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
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
            gl var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = MinerDisturbance.field_ab;
            try {
              L0: {
                var18 = new gl();
                var18.field_y = param1.d((byte) -54);
                var18.field_n = param1.b((byte) 27);
                var18.field_r = new ia[var18.field_y];
                var18.field_s = new int[var18.field_y];
                var18.field_p = new int[var18.field_y];
                var18.field_q = new ia[var18.field_y];
                var18.field_w = new int[var18.field_y];
                var18.field_v = new byte[var18.field_y][][];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var18.field_y) {
                    L2: {
                      if (param3) {
                        break L2;
                      } else {
                        field_f = (ea) null;
                        break L2;
                      }
                    }
                    on.field_t.a((byte) 69, var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param1.d((byte) -54);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (-2 == (var6_int ^ -1)) {
                                break L5;
                              } else {
                                if (-3 == (var6_int ^ -1)) {
                                  break L5;
                                } else {
                                  L6: {
                                    if ((var6_int ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      if (var6_int == 4) {
                                        break L6;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  L7: {
                                    stackIn_13_0 = (sb) (param1);

                                    if (param3) {
                                      stackIn_14_0 = (sb) ((Object) stackIn_13_0);
                                      stackIn_14_1 = 0;
                                      break L7;
                                    } else {
                                      stackIn_14_0 = (sb) ((Object) stackIn_13_0);
                                      stackIn_14_1 = 1;
                                      break L7;
                                    }
                                  }
                                  var20 = ((sb) (Object) stackIn_14_0).a(stackIn_14_1 != 0);
                                  var8 = param1.a(false);
                                  var9 = param1.d((byte) -54);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L8: while (true) {
                                    if (var11_int >= var9) {
                                      L9: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (-4 == (var6_int ^ -1)) {
                                          var12_int = 0;
                                          L10: while (true) {
                                            if (var9 <= var12_int) {
                                              break L9;
                                            } else {
                                              var13 = param1.b((byte) 15);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param1.a(var21[var12_int], (byte) -120, 0, var13);
                                              var12_int++;
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var18.field_s[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L11: while (true) {
                                        if (var17 >= var9) {
                                          var18.field_q[var5] = param0.a(var8, di.a((byte) 122, var20), 75, var12);
                                          var18.field_v[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = di.a((byte) 111, var10[var17]);
                                          var17++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param1.a(false);
                                      var11_int++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L12: {
                            var15 = param1.a(false);
                            dupTemp$1 = param1.a(false);
                            var16 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if (1 != var6_int) {
                              break L12;
                            } else {
                              var9 = param1.b((byte) 90);
                              break L12;
                            }
                          }
                          var18.field_s[var5] = var6_int;
                          var18.field_p[var5] = var9;
                          var18.field_r[var5] = param0.a(di.a((byte) 120, var15), var16, 21268);
                          break L4;
                        }
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L13: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -1;
                        break L13;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L14: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -2;
                        break L14;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L15: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -3;
                        break L15;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L16: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_w[var5] = -4;
                        break L16;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L17: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_w[var5] = -5;
                        break L17;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L18: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_42_0 = (RuntimeException) (var4);

                stackIn_42_1 = new StringBuilder().append("ff.A(");

                if (param0 == null) {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "null";
                  break L18;
                } else {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "{...}";
                  break L18;
                }
              }
              L19: {


                stackIn_45_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');

                if (param1 == null) {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "null";
                  break L19;
                } else {
                  stackIn_43_0 = (RuntimeException) ((Object) stackIn_43_0);
                  stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackIn_46_2 = "{...}";
                  break L19;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_43_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_f = null;
        if (param0 != -12) {
            return;
        }
        field_e = null;
        field_d = null;
    }

    static {
        field_a = new bg(2, 4, 4, 0);
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_b = 0;
        field_d = "Service unavailable";
    }
}
