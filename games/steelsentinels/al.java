/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class al {
    static String[] field_a;
    static int field_g;
    static String field_c;
    static hl field_i;
    static int field_d;
    static String field_e;
    static String[] field_f;
    static String field_b;
    static String field_h;

    abstract long a(byte param0);

    final static void a(boolean param0, java.awt.Component param1) {
        param1.addMouseListener(ub.field_e);
        param1.addMouseMotionListener(ub.field_e);
        if (!param0) {
            return;
        }
        try {
            param1.addFocusListener(ub.field_e);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "al.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
            field_a = (String[]) null;
        }
        return gh.field_hb;
    }

    final static wk[] a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 72) {
            al.a(-2);
        }
        return SteelSentinels.a(param0, param3, (byte) -62, 1, param2);
    }

    final int a(byte param0, long param1) {
        int var4 = -100 / ((param0 - -28) / 54);
        long var5 = this.a((byte) 120);
        if (-1L > (var5 ^ -1L)) {
            a.a((byte) 121, var5);
        }
        return this.a(param1, (byte) -97);
    }

    final static void a(pn param0, boolean param1, gi param2, int param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            StringBuilder stackIn_41_1 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
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
            ua var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = SteelSentinels.field_G;
            try {
              L0: {
                L1: {
                  if (!param1) {
                    break L1;
                  } else {
                    al.a(-105, (byte) -107, 76, 3);
                    break L1;
                  }
                }
                var18 = new ua();
                var18.field_B = param2.f((byte) -80);
                var18.field_q = param2.i(0);
                var18.field_w = new int[var18.field_B];
                var18.field_F = new byte[var18.field_B][][];
                var18.field_K = new wj[var18.field_B];
                var18.field_A = new int[var18.field_B];
                var18.field_y = new wj[var18.field_B];
                var18.field_s = new int[var18.field_B];
                var5 = 0;
                L2: while (true) {
                  if (var18.field_B <= var5) {
                    rg.field_d.a(3, var18);
                    break L0;
                  } else {
                    try {
                      L3: {
                        L4: {
                          L5: {
                            var6_int = param2.f((byte) -117);
                            if (0 == var6_int) {
                              break L5;
                            } else {
                              if (1 == var6_int) {
                                break L5;
                              } else {
                                if (2 == var6_int) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (-4 == (var6_int ^ -1)) {
                                      break L6;
                                    } else {
                                      if (4 == var6_int) {
                                        break L6;
                                      } else {
                                        var5++;
                                        decompiledRegionSelector0 = 0;
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param2.h(1);
                                  var8 = param2.h(1);
                                  var9 = param2.f((byte) -84);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L7: while (true) {
                                    if (var11_int >= var9) {
                                      L8: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (var6_int != 3) {
                                          break L8;
                                        } else {
                                          var12_int = 0;
                                          L9: while (true) {
                                            if (var9 <= var12_int) {
                                              break L8;
                                            } else {
                                              var13 = param2.i(0);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param2.a(0, var21[var12_int], 28, var13);
                                              var12_int++;
                                              continue L9;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_s[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L10: while (true) {
                                        if (var17 >= var9) {
                                          var18.field_K[var5] = param0.a(var8, (byte) 52, ea.a(10126, var20), var12);
                                          var18.field_F[var5] = var21;
                                          break L4;
                                        } else {
                                          var12[var17] = ea.a(10126, var10[var17]);
                                          var17++;
                                          continue L10;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param2.h(1);
                                      var11_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L11: {
                            var15 = param2.h(1);
                            dupTemp$1 = param2.h(1);
                            var16 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if (1 == var6_int) {
                              var9 = param2.i(0);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var18.field_s[var5] = var6_int;
                          var18.field_w[var5] = var9;
                          var18.field_y[var5] = param0.a(9, ea.a(10126, var15), var16);
                          break L4;
                        }
                        decompiledRegionSelector0 = 1;
                        break L3;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -1;
                        decompiledRegionSelector0 = 1;
                        break L12;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L13: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -2;
                        decompiledRegionSelector0 = 1;
                        break L13;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L14: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -3;
                        decompiledRegionSelector0 = 1;
                        break L14;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_A[var5] = -4;
                        decompiledRegionSelector0 = 1;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_A[var5] = -5;
                        decompiledRegionSelector0 = 1;
                        break L16;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_38_0 = (RuntimeException) (var4);

                stackIn_38_1 = new StringBuilder().append("al.A(");

                if (param0 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L17;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L17;
                }
              }
              L18: {


                stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "null";
                  break L18;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "{...}";
                  break L18;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_39_0), stackIn_42_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int[] param1, int param2, int[][] param3, int param4, int param5, int param6) {
        if (ua.field_p >= 30) {
            ua.field_p = ua.field_p + 1;
            return;
        }
        try {
            ua.field_t[ua.field_p][0] = param4;
            ua.field_t[ua.field_p][1] = param2;
            if (param0 < 44) {
                field_b = (String) null;
            }
            ua.field_t[ua.field_p][2] = param5;
            ua.field_t[ua.field_p][3] = param6;
            ua.field_C[ua.field_p] = param1;
            ua.field_I[ua.field_p] = param3;
            ua.field_p = ua.field_p + 1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "al.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    abstract void c(byte param0);

    final static e b(byte param0) {
        if (param0 != 73) {
            al.a(105, (int[]) null, -49, (int[][]) null, 72, 102, -29);
        }
        if (cb.field_j == mm.field_e) {
            throw new IllegalStateException();
        }
        if (cb.field_j != sn.field_p) {
            return null;
        }
        cb.field_j = mm.field_e;
        return qf.field_d;
    }

    abstract int a(long param0, byte param1);

    public static void b(int param0) {
        if (param0 != 30) {
            al.a(-15);
        }
        field_c = null;
        field_b = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_i = null;
        field_f = null;
    }

    static {
        field_g = 0;
        field_c = "Honour";
        field_e = "Module slots: <%0>";
        field_b = "Press F10 to open Quick Chat.";
        field_f = new String[]{"OK"};
        field_h = "Cannot ordinarily be fired while your sentinel is in the air.";
    }
}
