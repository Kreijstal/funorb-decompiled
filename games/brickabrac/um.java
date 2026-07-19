/*
 * Decompiled by CFR-JS 0.4.0.
 */
class um implements ub, qe {
    static int[] field_j;
    int field_q;
    static int[] field_u;
    int field_a;
    dh field_k;
    int field_h;
    int field_c;
    static mh field_b;
    static jp field_p;
    static boolean field_t;
    int field_r;
    int field_m;
    int field_i;
    static dc[] field_o;
    private int field_g;
    static boolean field_e;
    int field_f;
    int field_s;
    int field_d;
    static jp[] field_l;
    private boolean field_n;

    final static void a(int param0, wq param1, byte param2, tg param3) {
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
            String var8 = null;
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
            bg var19_ref = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
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
            int decompiledRegionSelector0 = 0;
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
            var15 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                var19_ref = new bg();
                var19_ref.field_s = param1.l(255);
                var19_ref.field_i = param1.e(255);
                var19_ref.field_q = new int[var19_ref.field_s];
                var19_ref.field_k = new int[var19_ref.field_s];
                var19_ref.field_t = new int[var19_ref.field_s];
                var5 = 24 / ((-6 - param2) / 53);
                var19_ref.field_l = new ql[var19_ref.field_s];
                var19_ref.field_m = new byte[var19_ref.field_s][][];
                var19_ref.field_j = new ql[var19_ref.field_s];
                var6 = 0;
                L1: while (true) {
                  if (var19_ref.field_s <= var6) {
                    mf.field_i.a(var19_ref, (byte) 3);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param1.l(255);
                            if (0 == var7_int) {
                              break L4;
                            } else {
                              if (1 == var7_int) {
                                break L4;
                              } else {
                                if (-3 != (var7_int ^ -1)) {
                                  L5: {
                                    if (3 == var7_int) {
                                      break L5;
                                    } else {
                                      if ((var7_int ^ -1) == -5) {
                                        break L5;
                                      } else {
                                        var6++;
                                        decompiledRegionSelector0 = 1;
                                        break L2;
                                      }
                                    }
                                  }
                                  var21 = param1.d(-1);
                                  var22 = param1.d(-1);
                                  var10 = param1.l(255);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var12_int >= var10) {
                                      L7: {
                                        var23 = new byte[var10][];
                                        var20 = var23;
                                        var12 = var20;
                                        if (var7_int != 3) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var10 <= var13_int) {
                                              break L7;
                                            } else {
                                              var14 = param1.e(255);
                                              array$1 = new byte[var14];
                                              var12[var13_int] = array$1;
                                              param1.a(0, var23[var13_int], 115, var14);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var19_ref.field_t[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var10 <= var18) {
                                          var19_ref.field_l[var6] = param3.a(23311, pj.a(var21, true), var13, var22);
                                          var19_ref.field_m[var6] = var23;
                                          break L3;
                                        } else {
                                          var13[var18] = pj.a(var11[var18], true);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param1.d(-1);
                                      var12_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param1.d(-1);
                            var8 = var16;
                            var17 = param1.d(-1);
                            var9 = var17;
                            var10 = 0;
                            if (var7_int != 1) {
                              break L10;
                            } else {
                              var10 = param1.e(255);
                              break L10;
                            }
                          }
                          var19_ref.field_t[var6] = var7_int;
                          var19_ref.field_q[var6] = var10;
                          var19_ref.field_j[var6] = param3.a(124, pj.a(var16, true), var17);
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19_ref.field_k[var6] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19_ref.field_k[var6] = -2;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19_ref.field_k[var6] = -3;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19_ref.field_k[var6] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var19_ref.field_k[var6] = -5;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var6++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) (var4);
                stackOut_34_1 = new StringBuilder().append("um.BA(").append(param0).append(',');
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param1 == null) {
                  stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L16;
                } else {
                  stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                  stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L16;
                }
              }
              L17: {
                stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param2).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param3 == null) {
                  stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final int a(oc param0, byte param1, int param2) {
        int discarded$2 = 0;
        RuntimeException var4 = null;
        oc var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 40) {
                break L1;
              } else {
                var5 = (oc) null;
                discarded$2 = this.a((oc) null, (byte) -5, -108);
                break L1;
              }
            }
            stackOut_2_0 = this.a(0, param0, 65263, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("um.T(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    um(dh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void a(int param0, int param1, int param2, oc param3) {
        try {
            int var5_int = 64 / ((param0 - 64) / 58);
            this.a(0, 0, this.field_g, param2, this.field_r, (byte) -56, param1, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "um.R(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, oc param1) {
        jp discarded$2 = null;
        RuntimeException var3 = null;
        mf var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 61823) {
                break L1;
              } else {
                var4 = (mf) null;
                discarded$2 = um.a((String) null, (String) null, -49, (mf) null);
                break L1;
              }
            }
            stackOut_2_0 = -this.field_d + (param1.field_t + -this.field_i);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("um.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(oc param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        ml var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ep var13 = null;
        ep var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0.f(-83)) {
                L2: {
                  var13 = this.c(param0, 121);
                  var14 = var13;
                  var7 = var14.a(param2, true);
                  var8 = var13.field_c[var7];
                  var9 = var14.a(param2, (byte) -72);
                  var10 = this.a(var9, param0, 65263, param1);
                  var11 = this.a(param3, (byte) -116, param0) + Math.max(0, var8.field_d);
                  stackOut_2_0 = this.a(param3, (byte) -96, param0);
                  stackOut_2_1 = this.b(16265, param0);
                  stackOut_2_2 = var8.field_a;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  stackIn_3_2 = stackOut_2_2;
                  if (1 + var7 >= var14.field_c.length) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = stackIn_4_2;
                    stackOut_4_3 = var8.field_a;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    break L2;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = stackIn_3_2;
                    stackOut_3_3 = var13.field_c[1 + var7].field_d;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_5_3 = stackOut_3_3;
                    break L2;
                  }
                }
                var12 = stackIn_5_0 - -Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
                vi.a((byte) 125, param0.field_t + param1 - -param0.field_o, param0.field_o + param1, param3 - -param0.field_w, param0.field_s + param3 - -param0.field_w);
                bj.field_T.a(this.field_s, var10, var11, 91, var12, var10);
                sc.b(-94);
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param4 > 118) {
                break L3;
              } else {
                this.field_d = -19;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("um.B(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, oc param1, int param2, int param3) {
        int discarded$2 = 0;
        RuntimeException var5 = null;
        oc var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 65263) {
                break L1;
              } else {
                var6 = (oc) null;
                discarded$2 = this.a(41, (oc) null);
                break L1;
              }
            }
            stackOut_2_0 = param0 + param1.field_r + param3 + (param1.field_o + this.field_d);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("um.U(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    public final ep c(oc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ep stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ep stackOut_5_0 = null;
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
              if (param0.field_j != null) {
                break L1;
              } else {
                param0.field_j = (ep) ((Object) new oj());
                break L1;
              }
            }
            L2: {
              var3_int = -14 / ((param1 - 49) / 43);
              if (this.field_n) {
                ((oj) ((Object) param0.field_j)).a(this.a(param0, true), this.field_f, 122, this.b(16265, param0), this.field_h, this.a(61823, param0), this.field_m, this.field_k);
                break L2;
              } else {
                this.a((byte) 6, param0);
                break L2;
              }
            }
            stackOut_5_0 = param0.field_j;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("um.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    public final int a(oc param0, int param1, boolean param2, int param3, int param4, int param5) {
        ep discarded$2 = null;
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param2) {
              discarded$2 = this.c(param0, 121);
              stackOut_3_0 = param0.field_j.a(-this.a(param0, (byte) 48, param5) + param1, false, param4 - this.a(param3, (byte) -122, param0));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 64;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var7);
            stackOut_5_1 = new StringBuilder().append("um.O(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 200) {
            field_b = (mh) null;
        }
        pi var2 = k.field_h;
        var2.e(param0 ^ -13485, param1);
        var2.a(87, 1);
        var2.a(-121, 3);
    }

    final static boolean b(byte param0) {
        if (0 == (ga.field_j ^ -1)) {
            if (!(vd.a(20, 1))) {
                return false;
            }
            ga.field_j = jl.field_e.l(255);
            jl.field_e.field_l = 0;
        }
        if (param0 > -40) {
            field_l = (jp[]) null;
        }
        if (-2 == ga.field_j) {
            if (!vd.a(20, 2)) {
                return false;
            }
            ga.field_j = jl.field_e.i(65280);
            jl.field_e.field_l = 0;
        }
        return vd.a(20, ga.field_j);
    }

    public final int b(oc param0, int param1) {
        ep discarded$7 = null;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            discarded$7 = this.c(param0, -118);
            if (param1 > 24) {
              stackOut_3_0 = param0.field_j.b(31458) - (-this.field_d + -this.field_i);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 74;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("um.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(byte param0, int param1, int param2, oc param3) {
        RuntimeException var5 = null;
        oc var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 103) {
                break L1;
              } else {
                var6 = (oc) null;
                this.a((byte) -127, (oc) null);
                break L1;
              }
            }
            stackOut_2_0 = param3.field_B + param1 - (-param3.field_w + -this.field_q) - -param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("um.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param3 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, um param1) {
        try {
            param1.field_r = this.field_r;
            param1.field_h = this.field_h;
            param1.field_m = this.field_m;
            param1.field_c = this.field_c;
            param1.field_d = this.field_d;
            param1.field_q = this.field_q;
            param1.field_g = this.field_g;
            param1.field_i = this.field_i;
            param1.field_f = this.field_f;
            param1.field_a = this.field_a;
            if (param0 > -7) {
                field_u = (int[]) null;
            }
            param1.field_k = this.field_k;
            param1.field_n = this.field_n;
            param1.field_s = this.field_s;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "um.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static jp a(String param0, String param1, int param2, mf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param3.a(param0, false);
              if (param2 == 1593955777) {
                break L1;
              } else {
                field_p = (jp) null;
                break L1;
              }
            }
            var5 = param3.a(var4_int, param2 + -1593955846, param1);
            stackOut_2_0 = ml.a(param3, var4_int, var5, 1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("um.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    private final int b(int param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 16265) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            stackOut_2_0 = -this.field_a + (param1.field_s + -this.field_q);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("um.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public void a(boolean param0, int param1, int param2, oc param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (null == this.field_k) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.a(-94, param2, param4, param3);
                if (param1 == -20618) {
                  break L1;
                } else {
                  field_j = (int[]) null;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("um.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, oc param5) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ml var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ep var17 = null;
        ep var18 = null;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param4 == param3) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == -15964) {
                L1: {
                  if (param5.f(-76)) {
                    L2: {
                      var17 = this.c(param5, 106);
                      var18 = var17;
                      if (param3 < param4) {
                        var8 = param3;
                        var9 = param4;
                        break L2;
                      } else {
                        var8 = param4;
                        var9 = param3;
                        break L2;
                      }
                    }
                    var10 = var18.a(var8, true);
                    var11 = var18.a(var9, true);
                    vi.a((byte) 127, param5.field_o + param2 - -param5.field_t, param2 - -param5.field_o, param5.field_w + param1, param5.field_s + (param5.field_w + param1));
                    var12 = var10;
                    L3: while (true) {
                      if (var12 > var11) {
                        sc.b(-98);
                        break L1;
                      } else {
                        L4: {
                          var13 = var17.field_c[var12];
                          if (var10 != var12) {
                            stackOut_15_0 = var13.field_g[0];
                            stackIn_16_0 = stackOut_15_0;
                            break L4;
                          } else {
                            stackOut_14_0 = var18.a(var8, (byte) -61);
                            stackIn_16_0 = stackOut_14_0;
                            break L4;
                          }
                        }
                        L5: {
                          var14 = stackIn_16_0;
                          if (var12 == var11) {
                            stackOut_20_0 = var18.a(var9, (byte) -102);
                            stackIn_21_0 = stackOut_20_0;
                            break L5;
                          } else {
                            if (var13 == null) {
                              stackOut_19_0 = 0;
                              stackIn_21_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = var13.field_g[var13.field_g.length + -1];
                              stackIn_21_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                        }
                        var15 = stackIn_21_0;
                        bj.field_T.a(var13.field_d + this.field_q + (param5.field_w + (param1 + param5.field_B)), this.field_c >>> 1690426872, this.field_c, this.a(var14, param5, 65263, param2), var13.field_a, (byte) 55, var15 - var14);
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var7);
            stackOut_24_1 = new StringBuilder().append("um.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param5 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void a(byte param0, oc param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oc var8 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param1.field_j) {
                param1.field_j = (ep) ((Object) new oj());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = this.a(61823, param1);
              var4 = this.b(16265, param1);
              if (param0 == 6) {
                break L2;
              } else {
                var8 = (oc) null;
                discarded$1 = this.a((oc) null, (byte) 6, -90);
                break L2;
              }
            }
            L3: {
              var6 = this.field_m;
              if (var6 != 0) {
                if (2 != var6) {
                  L4: {
                    if (-4 == (var6 ^ -1)) {
                      break L4;
                    } else {
                      if (var6 == 1) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var5 = (-this.field_k.field_P + var4 + -this.field_k.field_F >> -1950225151) + this.field_k.field_F;
                  break L3;
                } else {
                  var5 = var4 - this.field_k.field_P;
                  break L3;
                }
              } else {
                var5 = this.field_k.field_F;
                break L3;
              }
            }
            L5: {
              L6: {
                var6 = this.field_f;
                if (var6 != 0) {
                  if ((var6 ^ -1) == -4) {
                    break L6;
                  } else {
                    if (1 != var6) {
                      if (-3 != (var6 ^ -1)) {
                        break L5;
                      } else {
                        if (!(param1.field_j instanceof oj)) {
                          break L5;
                        } else {
                          ((oj) ((Object) param1.field_j)).a(this.a(param1, true), this.field_k, var3_int, (byte) -115, var5);
                          break L5;
                        }
                      }
                    } else {
                      if (param1.field_j instanceof oj) {
                        ((oj) ((Object) param1.field_j)).a(this.a(param1, true), var5, this.field_k, var3_int >> -1724541599, 1);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              if (!(param1.field_j instanceof oj)) {
                break L5;
              } else {
                ((oj) ((Object) param1.field_j)).a(this.field_k, var5, 0, this.a(param1, true), 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("um.M(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5, byte param6) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        vl var8 = null;
        long var9 = 0L;
        Object var11 = null;
        int var12 = 0;
        om var13 = null;
        int var14 = 0;
        int var15 = 0;
        mh var19 = null;
        int var19_int = 0;
        mh var20 = null;
        mh var21 = null;
        mh var22 = null;
        int var23_int = 0;
        mh var23 = null;
        mh var24 = null;
        mh var25 = null;
        mh var26 = null;
        mh var27 = null;
        mh var28 = null;
        mh var29 = null;
        mh var30 = null;
        mh var31 = null;
        int var32 = 0;
        String var33 = null;
        String var34 = null;
        int var34_int = 0;
        String var35 = null;
        int var35_int = 0;
        Object var36 = null;
        int var37 = 0;
        int var38_int = 0;
        StringBuilder var38 = null;
        int var39_int = 0;
        String var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        jp var43 = null;
        mh var44 = null;
        mh var45 = null;
        mh var46 = null;
        mh var47 = null;
        mh var48 = null;
        mh var49 = null;
        mh var50 = null;
        Object var51 = null;
        jp var51_ref = null;
        Object var52 = null;
        jp var52_ref = null;
        Object var53 = null;
        jp var53_ref = null;
        Object var54 = null;
        jp var54_ref = null;
        jp var55 = null;
        mm stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        boolean stackIn_2_5 = false;
        mm stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        boolean stackIn_3_5 = false;
        mm stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        boolean stackIn_4_5 = false;
        int stackIn_4_6 = 0;
        om stackIn_8_0 = null;
        mh stackIn_8_1 = null;
        mh stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        om stackIn_9_0 = null;
        mh stackIn_9_1 = null;
        mh stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        om stackIn_10_0 = null;
        mh stackIn_10_1 = null;
        mh stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        mh stackIn_10_4 = null;
        om stackIn_25_0 = null;
        mh stackIn_25_1 = null;
        mh stackIn_25_2 = null;
        long stackIn_25_3 = 0L;
        om stackIn_26_0 = null;
        mh stackIn_26_1 = null;
        mh stackIn_26_2 = null;
        long stackIn_26_3 = 0L;
        om stackIn_27_0 = null;
        mh stackIn_27_1 = null;
        mh stackIn_27_2 = null;
        long stackIn_27_3 = 0L;
        mh stackIn_27_4 = null;
        int stackIn_31_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_76_0 = 0;
        jp[] stackIn_77_0 = null;
        jp[] stackIn_78_0 = null;
        jp[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        jp[] stackIn_85_0 = null;
        jp[] stackIn_86_0 = null;
        jp[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_146_0 = null;
        String stackIn_156_0 = null;
        String stackIn_162_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        mm stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        boolean stackOut_1_5 = false;
        mm stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        boolean stackOut_3_5 = false;
        int stackOut_3_6 = 0;
        mm stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        boolean stackOut_2_5 = false;
        int stackOut_2_6 = 0;
        om stackOut_7_0 = null;
        mh stackOut_7_1 = null;
        mh stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        om stackOut_9_0 = null;
        mh stackOut_9_1 = null;
        mh stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        mh stackOut_9_4 = null;
        om stackOut_8_0 = null;
        mh stackOut_8_1 = null;
        mh stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        mh stackOut_8_4 = null;
        om stackOut_24_0 = null;
        mh stackOut_24_1 = null;
        mh stackOut_24_2 = null;
        long stackOut_24_3 = 0L;
        om stackOut_26_0 = null;
        mh stackOut_26_1 = null;
        mh stackOut_26_2 = null;
        long stackOut_26_3 = 0L;
        mh stackOut_26_4 = null;
        om stackOut_25_0 = null;
        mh stackOut_25_1 = null;
        mh stackOut_25_2 = null;
        long stackOut_25_3 = 0L;
        mh stackOut_25_4 = null;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        jp[] stackOut_76_0 = null;
        jp[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        jp[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        jp[] stackOut_84_0 = null;
        jp[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        jp[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_145_0 = null;
        String stackOut_144_0 = null;
        String stackOut_155_0 = null;
        String stackOut_154_0 = null;
        String stackOut_152_0 = null;
        String stackOut_161_0 = null;
        String stackOut_160_0 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var54 = null;
        var42 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = rl.field_e;
              stackOut_1_1 = 2;
              stackOut_1_2 = (np.field_a * 4 + 8) * param3;
              stackOut_1_3 = 2 * (2 + np.field_a);
              stackOut_1_4 = 22676;
              stackOut_1_5 = param2;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_3_5 = stackOut_1_5;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              stackIn_2_5 = stackOut_1_5;
              if (rl.field_e != o.field_b) {
                stackOut_3_0 = (mm) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = stackIn_3_5;
                stackOut_3_6 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                stackIn_4_6 = stackOut_3_6;
                break L1;
              } else {
                stackOut_2_0 = (mm) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = stackIn_2_5;
                stackOut_2_6 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                stackIn_4_6 = stackOut_2_6;
                break L1;
              }
            }
            var7_int = ((mm) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6 != 0) ? 1 : 0;
            var8 = rl.field_e.field_Rb.field_bb;
            var9 = ue.a(false);
            var12 = -30 / ((param6 - -26) / 55);
            var11 = null;
            var13 = (om) ((Object) var8.d(-64));
            L2: while (true) {
              if (var13 == null) {
                break L0;
              } else {
                L3: {
                  var14 = 0;
                  if (null != var13.field_bb) {
                    break L3;
                  } else {
                    L4: {
                      var13.field_Ac = new mh(0L, fp.field_v);
                      var15 = param1 | param5;
                      var13.a(var13.field_Ac, 0);
                      var13.field_Ac.field_S = 1;
                      var13.field_Vb = new mh(0L, vb.field_K);
                      var13.a(var13.field_Vb, 0);
                      var13.field_tc = new mh(0L, fp.field_v);
                      var13.a(var13.field_tc, 0);
                      var13.field_tc.field_V = 0;
                      var13.field_Cc = new mh(0L, fp.field_v);
                      var13.a(var13.field_Cc, 0);
                      var13.field_Cc.field_V = 0;
                      var13.field_mc = new mh(0L, vb.field_K);
                      var13.a(var13.field_mc, 0);
                      var13.field_mc.field_S = 2;
                      stackOut_7_0 = (om) (var13);
                      stackOut_7_1 = null;
                      stackOut_7_2 = null;
                      stackOut_7_3 = 0L;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      stackIn_9_3 = stackOut_7_3;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      if (vd.field_e) {
                        stackOut_9_0 = (om) ((Object) stackIn_9_0);
                        stackOut_9_1 = null;
                        stackOut_9_2 = null;
                        stackOut_9_3 = stackIn_9_3;
                        stackOut_9_4 = fp.field_v;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        stackIn_10_2 = stackOut_9_2;
                        stackIn_10_3 = stackOut_9_3;
                        stackIn_10_4 = stackOut_9_4;
                        break L4;
                      } else {
                        stackOut_8_0 = (om) ((Object) stackIn_8_0);
                        stackOut_8_1 = null;
                        stackOut_8_2 = null;
                        stackOut_8_3 = stackIn_8_3;
                        stackOut_8_4 = vb.field_K;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        stackIn_10_2 = stackOut_8_2;
                        stackIn_10_3 = stackOut_8_3;
                        stackIn_10_4 = stackOut_8_4;
                        break L4;
                      }
                    }
                    L5: {
                      stackIn_10_0.field_ec = new mh(stackIn_10_3, stackIn_10_4);
                      var13.a(var13.field_ec, 0);
                      var13.field_Ec = new mh[cq.field_p];
                      var13.field_sc = new mh(0L, (mh) null);
                      if (-1 == (1 << fd.field_c & var15 ^ -1)) {
                        break L5;
                      } else {
                        var13.field_ec.a(var13.field_sc, 0);
                        break L5;
                      }
                    }
                    L6: {
                      var13.field_Yb = new mh(0L, (mh) null);
                      if ((1 << ee.field_q & var15) == 0) {
                        break L6;
                      } else {
                        var13.field_ec.a(var13.field_Yb, 0);
                        break L6;
                      }
                    }
                    L7: {
                      var13.field_Bc = new mh(0L, (mh) null);
                      if (-1 != (1 << u.field_a & var15 ^ -1)) {
                        var13.field_ec.a(var13.field_Bc, 0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var13.field_lc = new mh(0L, (mh) null);
                      if ((1 << mm.field_Pb & var15) == 0) {
                        break L8;
                      } else {
                        var13.field_ec.a(var13.field_lc, 0);
                        break L8;
                      }
                    }
                    var46 = var13.field_sc;
                    var45 = var13.field_lc;
                    var44 = var13.field_Yb;
                    var13.field_Bc.field_Q = 1;
                    var44.field_Q = 1;
                    var45.field_Q = 1;
                    var46.field_Q = 1;
                    var19_int = 0;
                    L9: while (true) {
                      if (cq.field_p <= var19_int) {
                        L10: {
                          stackOut_24_0 = (om) (var13);
                          stackOut_24_1 = null;
                          stackOut_24_2 = null;
                          stackOut_24_3 = 0L;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_26_1 = stackOut_24_1;
                          stackIn_26_2 = stackOut_24_2;
                          stackIn_26_3 = stackOut_24_3;
                          stackIn_25_0 = stackOut_24_0;
                          stackIn_25_1 = stackOut_24_1;
                          stackIn_25_2 = stackOut_24_2;
                          stackIn_25_3 = stackOut_24_3;
                          if (vd.field_e) {
                            stackOut_26_0 = (om) ((Object) stackIn_26_0);
                            stackOut_26_1 = null;
                            stackOut_26_2 = null;
                            stackOut_26_3 = stackIn_26_3;
                            stackOut_26_4 = vb.field_K;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            stackIn_27_2 = stackOut_26_2;
                            stackIn_27_3 = stackOut_26_3;
                            stackIn_27_4 = stackOut_26_4;
                            break L10;
                          } else {
                            stackOut_25_0 = (om) ((Object) stackIn_25_0);
                            stackOut_25_1 = null;
                            stackOut_25_2 = null;
                            stackOut_25_3 = stackIn_25_3;
                            stackOut_25_4 = fp.field_v;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            stackIn_27_2 = stackOut_25_2;
                            stackIn_27_3 = stackOut_25_3;
                            stackIn_27_4 = stackOut_25_4;
                            break L10;
                          }
                        }
                        stackIn_27_0.field_zc = new mh(stackIn_27_3, stackIn_27_4);
                        var13.a(var13.field_zc, 0);
                        var13.field_zc.field_S = 2;
                        var13.field_Ub = new mh(0L, vb.field_K);
                        var13.a(var13.field_Ub, 0);
                        var13.field_ic = new mh(0L, tk.field_t);
                        var13.a(var13.field_ic, 0);
                        var13.field_Sb = new mh(0L, tk.field_t);
                        var13.a(var13.field_Sb, 0);
                        var13.field_gc = new mh(0L, ad.field_l);
                        var13.a(var13.field_gc, 0);
                        var13.c(true);
                        var13.field_nc = new mh(0L, ok.field_d);
                        var14 = 1;
                        var13.a(var13.field_nc, 0);
                        break L3;
                      } else {
                        L11: {
                          var13.field_Ec[var19_int] = new mh(0L, (mh) null);
                          if (-1 == (var15 & 1 << jc.field_K + var19_int ^ -1)) {
                            break L11;
                          } else {
                            var13.field_ec.a(var13.field_Ec[var19_int], 0);
                            break L11;
                          }
                        }
                        var13.field_Ec[var19_int].field_Q = 1;
                        var19_int++;
                        continue L9;
                      }
                    }
                  }
                }
                L12: {
                  var13.field_Ac.field_Mb = null;
                  if (!var13.field_Rb) {
                    stackOut_30_0 = param5;
                    stackIn_31_0 = stackOut_30_0;
                    break L12;
                  } else {
                    stackOut_29_0 = param1;
                    stackIn_31_0 = stackOut_29_0;
                    break L12;
                  }
                }
                var15 = stackIn_31_0;
                var13.field_Ac.field_cb = 0;
                var47 = var13.field_Ac;
                var47.field_Ib = 0;
                var13.field_nc.field_Mb = null;
                var13.field_nc.field_cb = 0;
                var48 = var13.field_nc;
                var48.field_Ib = 0;
                var13.field_Vb.field_Mb = null;
                var49 = var13.field_Vb;
                var13.field_Vb.field_cb = 0;
                var49.field_Ib = 0;
                var13.field_tc.field_Mb = null;
                var19 = var13.field_tc;
                var13.field_tc.field_cb = 0;
                var13.field_Cc.field_Mb = null;
                var19.field_Ib = 0;
                var13.field_Cc.field_cb = 0;
                var20 = var13.field_Cc;
                var13.field_mc.field_Mb = null;
                var20.field_Ib = 0;
                var13.field_mc.field_cb = 0;
                var21 = var13.field_mc;
                var21.field_Ib = 0;
                var13.field_ec.field_Mb = null;
                var22 = var13.field_ec;
                var13.field_ec.field_cb = 0;
                var22.field_Ib = 0;
                var23_int = 0;
                L13: while (true) {
                  if (cq.field_p <= var23_int) {
                    L14: {
                      var13.field_sc.field_wb = null;
                      var23 = var13.field_sc;
                      var13.field_sc.field_cb = 0;
                      var13.field_lc.field_wb = null;
                      var23.field_Ib = 0;
                      var50 = var13.field_lc;
                      var13.field_lc.field_cb = 0;
                      var50.field_Ib = 0;
                      var13.field_Yb.field_wb = null;
                      var13.field_Yb.field_cb = 0;
                      var25 = var13.field_Yb;
                      var13.field_Bc.field_wb = null;
                      var25.field_Ib = 0;
                      var26 = var13.field_Bc;
                      var13.field_Bc.field_cb = 0;
                      var26.field_Ib = 0;
                      var13.field_zc.field_Mb = null;
                      var27 = var13.field_zc;
                      var13.field_zc.field_cb = 0;
                      var27.field_Ib = 0;
                      var13.field_Ub.field_Mb = null;
                      var13.field_Ub.field_cb = 0;
                      var28 = var13.field_Ub;
                      var28.field_Ib = 0;
                      var13.field_ic.field_Mb = null;
                      var29 = var13.field_ic;
                      var13.field_ic.field_cb = 0;
                      var29.field_Ib = 0;
                      var13.field_Sb.field_Mb = null;
                      var30 = var13.field_Sb;
                      var13.field_Sb.field_cb = 0;
                      var30.field_Ib = 0;
                      var13.field_gc.field_Mb = null;
                      var31 = var13.field_gc;
                      var13.field_gc.field_cb = 0;
                      var31.field_Ib = 0;
                      var13.field_Ib = rl.field_e.field_Rb.field_Ib;
                      var32 = 0;
                      var33 = var13.field_Fc;
                      if (var13.h(107)) {
                        break L14;
                      } else {
                        L15: {
                          if (!var13.field_Rb) {
                            L16: {
                              if (var13.field_uc) {
                                break L16;
                              } else {
                                if (var13.field_Pb) {
                                  break L16;
                                } else {
                                  if (!var13.field_bc) {
                                    var13.field_Ac.field_Mb = hm.field_a;
                                    break L15;
                                  } else {
                                    var13.field_Ac.field_Mb = pe.field_p;
                                    break L15;
                                  }
                                }
                              }
                            }
                            var13.field_nc.field_Mb = nq.field_k;
                            break L15;
                          } else {
                            if (var13.field_yc < 0) {
                              L17: {
                                if (!var13.field_Dc) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (var13.field_uc) {
                                      break L18;
                                    } else {
                                      if (var13.field_Pb) {
                                        break L18;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  var13.field_nc.field_Mb = nq.field_k;
                                  break L15;
                                }
                              }
                              if ((var13.field_wc ^ -1) != -3) {
                                var13.field_Ac.field_Mb = qn.field_o;
                                break L15;
                              } else {
                                var13.field_nc.field_Mb = ag.field_I;
                                break L15;
                              }
                            } else {
                              var13.field_Ac.field_Mb = id.field_Sb;
                              break L15;
                            }
                          }
                        }
                        L19: {
                          if (null == var13.field_nc.field_Mb) {
                            var13.field_Ac.a(np.field_a, var32, 0, 68, (byte) 64);
                            break L19;
                          } else {
                            var13.field_nc.a(np.field_a, var32, 0, 68, (byte) 64);
                            break L19;
                          }
                        }
                        L20: {
                          var13.field_Vb.field_Mb = dh.a(var13.field_Vb.field_O, var33, 78);
                          var13.field_Vb.a(np.field_a, var32, 70, 78, (byte) 64);
                          if (!var13.field_Vb.field_kb) {
                            break L20;
                          } else {
                            if (!var13.field_Vb.field_Mb.equals(var33)) {
                              ep.field_e = var33;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                        L21: {
                          var13.field_tc.field_Mb = Integer.toString(var13.field_cc);
                          if (!var13.field_Dc) {
                            var13.field_tc.field_S = 1;
                            var13.field_tc.a(np.field_a, var32, 150, 48, (byte) 64);
                            break L21;
                          } else {
                            var13.field_Cc.field_Mb = "/" + var13.field_jc;
                            var13.field_tc.field_S = 2;
                            var34_int = (348 + -var13.field_Cc.field_O.c("/")) / 2;
                            var13.field_tc.a(np.field_a, var32, 150, -150 + var34_int, (byte) 64);
                            var13.field_Cc.a(np.field_a, var32, var34_int, 198 + -var34_int, (byte) 64);
                            break L21;
                          }
                        }
                        L22: {
                          var13.field_mc.field_Mb = Integer.toString(var13.field_vc);
                          var13.field_mc.a(np.field_a, var32, 200, 48, (byte) 64);
                          if (!vd.field_e) {
                            stackOut_64_0 = 200;
                            stackIn_65_0 = stackOut_64_0;
                            break L22;
                          } else {
                            stackOut_63_0 = 250;
                            stackIn_65_0 = stackOut_63_0;
                            break L22;
                          }
                        }
                        L23: {
                          var34_int = stackIn_65_0;
                          var13.field_ec.a(np.field_a, var32, var34_int, -2 + (365 + -var34_int), (byte) 64);
                          var35_int = kn.field_z;
                          if (-1 != (var15 & 1 << fd.field_c ^ -1)) {
                            var51_ref = dj.field_f[var13.field_kc];
                            var13.field_sc.field_wb = var51_ref;
                            var13.field_sc.a(var13.field_ec.field_cb, 0, var35_int, var51_ref.field_x, (byte) 64);
                            var35_int = var35_int + (var51_ref.field_x + kn.field_z);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if ((var15 & 1 << ee.field_q) != 0) {
                            L25: {
                              if (!var13.field_uc) {
                                if (var13.field_Pb) {
                                  stackOut_74_0 = 1;
                                  stackIn_76_0 = stackOut_74_0;
                                  break L25;
                                } else {
                                  stackOut_73_0 = 0;
                                  stackIn_76_0 = stackOut_73_0;
                                  break L25;
                                }
                              } else {
                                stackOut_71_0 = 1;
                                stackIn_76_0 = stackOut_71_0;
                                break L25;
                              }
                            }
                            L26: {
                              var37 = stackIn_76_0;
                              stackOut_76_0 = uo.field_c;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_77_0 = stackOut_76_0;
                              if (var37 == 0) {
                                stackOut_78_0 = (jp[]) ((Object) stackIn_78_0);
                                stackOut_78_1 = 0;
                                stackIn_79_0 = stackOut_78_0;
                                stackIn_79_1 = stackOut_78_1;
                                break L26;
                              } else {
                                stackOut_77_0 = (jp[]) ((Object) stackIn_77_0);
                                stackOut_77_1 = 1;
                                stackIn_79_0 = stackOut_77_0;
                                stackIn_79_1 = stackOut_77_1;
                                break L26;
                              }
                            }
                            var52_ref = stackIn_79_0[stackIn_79_1];
                            var13.field_Yb.field_wb = var52_ref;
                            var13.field_Yb.a(var13.field_ec.field_cb, 0, var35_int, var52_ref.field_x, (byte) 64);
                            var35_int = var35_int + (var52_ref.field_x - -kn.field_z);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L27: {
                          if ((1 << u.field_a & var15) == 0) {
                            break L27;
                          } else {
                            var53_ref = vn.field_K[var13.field_wc + -1];
                            var13.field_Bc.field_wb = var53_ref;
                            var13.field_Bc.a(var13.field_ec.field_cb, 0, var35_int, var53_ref.field_x, (byte) 64);
                            var35_int = var35_int + (var53_ref.field_x + kn.field_z);
                            break L27;
                          }
                        }
                        L28: {
                          if ((var15 & 1 << mm.field_Pb) != 0) {
                            L29: {
                              stackOut_84_0 = bq.field_c;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_85_0 = stackOut_84_0;
                              if (var13.field_ac) {
                                stackOut_86_0 = (jp[]) ((Object) stackIn_86_0);
                                stackOut_86_1 = 1;
                                stackIn_87_0 = stackOut_86_0;
                                stackIn_87_1 = stackOut_86_1;
                                break L29;
                              } else {
                                stackOut_85_0 = (jp[]) ((Object) stackIn_85_0);
                                stackOut_85_1 = 0;
                                stackIn_87_0 = stackOut_85_0;
                                stackIn_87_1 = stackOut_85_1;
                                break L29;
                              }
                            }
                            var54_ref = stackIn_87_0[stackIn_87_1];
                            var13.field_lc.field_wb = var54_ref;
                            var13.field_lc.a(var13.field_ec.field_cb, 0, var35_int, var54_ref.field_x, (byte) 64);
                            var35_int = var35_int + (kn.field_z + var54_ref.field_x);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L30: {
                          if (null == aj.field_c) {
                            break L30;
                          } else {
                            var37 = 0;
                            L31: while (true) {
                              if (var37 >= cq.field_p) {
                                break L30;
                              } else {
                                if (null != aj.field_c[var37]) {
                                  L32: {
                                    if ((1 << var37 + jc.field_K & var15) != 0) {
                                      var43 = aj.field_c[var37][255 & var13.field_Tb[var37]];
                                      var55 = var43;
                                      var13.field_Ec[var37].field_wb = var43;
                                      var13.field_Ec[var37].a(var13.field_ec.field_cb, 0, var35_int, var55.field_x, (byte) 64);
                                      var35_int = var35_int + (kn.field_z + var55.field_x);
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var37++;
                                  continue L31;
                                } else {
                                  var37++;
                                  continue L31;
                                }
                              }
                            }
                          }
                        }
                        L33: {
                          var37 = (var13.field_ec.field_Ib + -var35_int) / 2;
                          if ((var37 ^ -1) < -1) {
                            var13.field_sc.field_P = var13.field_sc.field_P + var37;
                            var13.field_Yb.field_P = var13.field_Yb.field_P + var37;
                            var13.field_Bc.field_P = var13.field_Bc.field_P + var37;
                            var13.field_lc.field_P = var13.field_lc.field_P + var37;
                            var38_int = 0;
                            L34: while (true) {
                              if (cq.field_p <= var38_int) {
                                break L33;
                              } else {
                                var13.field_Ec[var38_int].field_P = var13.field_Ec[var38_int].field_P + var37;
                                var38_int++;
                                continue L34;
                              }
                            }
                          } else {
                            break L33;
                          }
                        }
                        L35: {
                          if (!var13.field_Rb) {
                            break L35;
                          } else {
                            L36: {
                              var38_int = var13.field_yc;
                              if (0 <= var38_int) {
                                break L36;
                              } else {
                                var38_int = (int)(-var13.field_qc + var9);
                                break L36;
                              }
                            }
                            var39_int = var38_int / 1000;
                            var40 = var39_int / 60;
                            var39_int = var39_int % 60;
                            if (-61 >= (var40 ^ -1)) {
                              var41 = var40 / 60;
                              var40 = var40 % 60;
                              var13.field_zc.field_Mb = var41 + ":" + var40 / 10 + var40 % 10 + ":" + var39_int / 10 + var39_int % 10;
                              break L35;
                            } else {
                              var13.field_zc.field_Mb = var40 + ":" + var39_int / 10 + var39_int % 10;
                              break L35;
                            }
                          }
                        }
                        L37: {
                          var13.field_zc.a(np.field_a, var32, 365, var13.field_Ib + -365, (byte) 64);
                          var32 = var32 + np.field_a;
                          if (var13.field_Qb == null) {
                            break L37;
                          } else {
                            var32 += 2;
                            var38 = new StringBuilder(64);
                            discarded$4 = var38.append(th.field_f);
                            discarded$5 = var38.append(var13.field_Qb[0]);
                            var39_int = 1;
                            L38: while (true) {
                              if (var13.field_cc <= var39_int) {
                                var39 = var38.toString();
                                var13.field_Ub.field_Mb = var39;
                                var40 = var13.field_Ub.field_O.a(var39, var13.field_Ib - var13.field_Ub.field_V * 2);
                                var13.field_Ub.a(np.field_a * var40, var32, 0, var13.field_Ib, (byte) 64);
                                var32 = var32 + np.field_a * var40;
                                break L37;
                              } else {
                                discarded$6 = var38.append(", ");
                                discarded$7 = var38.append(var13.field_Qb[var39_int]);
                                var39_int++;
                                continue L38;
                              }
                            }
                          }
                        }
                        L39: {
                          if (var13.field_Pb) {
                            var13.field_ic.field_Mb = rd.a(r.field_y, new String[]{var33}, (byte) 103);
                            var13.field_ic.a(np.field_a, var32, om.field_oc, -(om.field_oc * 2) + var13.field_Ib, (byte) 64);
                            var32 = var32 + np.field_a;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        if (!var13.field_dc) {
                          break L14;
                        } else {
                          var13.field_Sb.field_Mb = rd.a(aj.field_b, new String[]{var33}, (byte) 103);
                          var13.field_Sb.a(np.field_a, var32, om.field_oc, -(om.field_oc * 2) + var13.field_Ib, (byte) 64);
                          var32 = var32 + np.field_a;
                          break L14;
                        }
                      }
                    }
                    L40: {
                      var34 = vl.a(var13.field_Zb, var33, -15);
                      var35 = var34;
                      var35 = var34;
                      if (var34 == null) {
                        break L40;
                      } else {
                        var35_int = var13.field_gc.field_O.a(var34, -om.field_oc + (var13.field_Ib + -om.field_oc));
                        var13.field_gc.field_Mb = var34;
                        var13.field_gc.field_jb = var13.field_Wb * 256 / cm.field_o;
                        var13.field_gc.a(np.field_a * var35_int, var32, om.field_oc, var13.field_Ib - 2 * om.field_oc, (byte) 64);
                        var32 = var32 + np.field_a * var35_int;
                        break L40;
                      }
                    }
                    L41: {
                      if (var7_int != 0) {
                        break L41;
                      } else {
                        var13.field_C = -var13.field_cb + var32;
                        break L41;
                      }
                    }
                    L42: {
                      if (var14 != 0) {
                        rl.field_e.field_Rb.a((mh) (var11), 2, var13, 17290);
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    var35_int = 0;
                    L43: while (true) {
                      if (cq.field_p <= var35_int) {
                        L44: {
                          if (!var13.field_sc.field_kb) {
                            break L44;
                          } else {
                            L45: {
                              if (-2 != (var13.field_kc ^ -1)) {
                                var35 = bl.field_H[var13.field_kc];
                                break L45;
                              } else {
                                var35 = wp.field_b;
                                break L45;
                              }
                            }
                            ep.field_e = qb.field_s + " - " + var35;
                            break L44;
                          }
                        }
                        L46: {
                          if (!var13.field_lc.field_kb) {
                            break L46;
                          } else {
                            L47: {
                              if (var13.field_ac) {
                                stackOut_145_0 = pg.field_n;
                                stackIn_146_0 = stackOut_145_0;
                                break L47;
                              } else {
                                stackOut_144_0 = rl.field_b;
                                stackIn_146_0 = stackOut_144_0;
                                break L47;
                              }
                            }
                            ep.field_e = stackIn_146_0;
                            break L46;
                          }
                        }
                        L48: {
                          if (var13.field_Yb.field_kb) {
                            L49: {
                              L50: {
                                if (var13.field_uc) {
                                  break L50;
                                } else {
                                  if (!var13.field_Pb) {
                                    if (!var13.field_Dc) {
                                      stackOut_155_0 = bl.field_K;
                                      stackIn_156_0 = stackOut_155_0;
                                      break L49;
                                    } else {
                                      stackOut_154_0 = be.field_n;
                                      stackIn_156_0 = stackOut_154_0;
                                      break L49;
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              stackOut_152_0 = bc.field_d;
                              stackIn_156_0 = stackOut_152_0;
                              break L49;
                            }
                            ep.field_e = stackIn_156_0;
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        L51: {
                          if (var13.field_Bc.field_kb) {
                            L52: {
                              if (2 != var13.field_wc) {
                                stackOut_161_0 = cm.field_q;
                                stackIn_162_0 = stackOut_161_0;
                                break L52;
                              } else {
                                stackOut_160_0 = id.field_jc;
                                stackIn_162_0 = stackOut_160_0;
                                break L52;
                              }
                            }
                            ep.field_e = stackIn_162_0;
                            break L51;
                          } else {
                            break L51;
                          }
                        }
                        L53: {
                          if (var13.field_L == 0) {
                            break L53;
                          } else {
                            if (!var13.h(109)) {
                              if (var13.field_nc.field_L == 0) {
                                tf.a(var13, param0, (byte) -71, var33);
                                break L53;
                              } else {
                                L54: {
                                  if (!var13.field_Rb) {
                                    break L54;
                                  } else {
                                    L55: {
                                      if (!var13.field_Dc) {
                                        break L55;
                                      } else {
                                        if (var13.field_uc) {
                                          break L54;
                                        } else {
                                          if (var13.field_Pb) {
                                            break L54;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    dn.b(var13.e((byte) -107), -85, param4);
                                    break L53;
                                  }
                                }
                                jb.b(var13.e((byte) -34), param4, 11912);
                                break L53;
                              }
                            } else {
                              var13 = (om) ((Object) var8.a((byte) 116));
                              continue L2;
                            }
                          }
                        }
                        var13 = (om) ((Object) var8.a((byte) 116));
                        continue L2;
                      } else {
                        L56: {
                          if (!var13.field_Ec[var35_int].field_kb) {
                            break L56;
                          } else {
                            L57: {
                              if (null == ff.field_i) {
                                var36 = null;
                                break L57;
                              } else {
                                if (ff.field_i[var35_int] != null) {
                                  var36 = ff.field_i[var35_int][var13.field_Tb[var35_int] & 255];
                                  break L57;
                                } else {
                                  var36 = null;
                                  break L57;
                                }
                              }
                            }
                            if (var36 == null) {
                              ep.field_e = rg.field_b[var35_int];
                              break L56;
                            } else {
                              ep.field_e = rg.field_b[var35_int] + " - " + (String) (var36);
                              break L56;
                            }
                          }
                        }
                        var35_int++;
                        continue L43;
                      }
                    }
                  } else {
                    var13.field_Ec[var23_int].field_wb = null;
                    var24 = var13.field_Ec[var23_int];
                    var13.field_Ec[var23_int].field_cb = 0;
                    var24.field_Ib = 0;
                    var23_int++;
                    continue L13;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var7), "um.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    String a(oc param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1) {
              stackOut_3_0 = param0.field_A;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("um.Q(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, oc param7) {
        int discarded$1 = 0;
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            vi.a((byte) 81, param7.field_t + param7.field_o + param6, param6 - -param7.field_o, param7.field_w + param3, param3 - -param7.field_w - -param7.field_s);
            if (param5 < -45) {
              L1: {
                var9_int = this.a(61823, param7);
                var10 = this.b(16265, param7);
                if (this.field_n) {
                  discarded$1 = this.field_k.a(this.a(param7, true), this.a(param0, param7, 65263, param6), this.a((byte) 117, param3, param1, param7), var9_int, var10, param4, param2, this.field_f, this.field_m, this.field_h);
                  break L1;
                } else {
                  L2: {
                    var12 = this.field_m;
                    if (-1 != (var12 ^ -1)) {
                      if ((var12 ^ -1) != -3) {
                        L3: {
                          if (var12 == 3) {
                            break L3;
                          } else {
                            if (-2 != (var12 ^ -1)) {
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var11 = this.field_k.field_F + (-this.field_k.field_P + -this.field_k.field_F + var10 >> 1797374529);
                        break L2;
                      } else {
                        var11 = -this.field_k.field_P + var10;
                        break L2;
                      }
                    } else {
                      var11 = this.field_k.field_F;
                      break L2;
                    }
                  }
                  L4: {
                    var12 = this.field_f;
                    if (0 == var12) {
                      break L4;
                    } else {
                      if (-4 == (var12 ^ -1)) {
                        break L4;
                      } else {
                        if (1 != var12) {
                          if (-3 != (var12 ^ -1)) {
                            break L1;
                          } else {
                            this.field_k.a(this.a(param7, true), this.a(param0, param7, 65263, param6) + var9_int, var11 + this.a((byte) 127, param3, param1, param7), param4, param2);
                            break L1;
                          }
                        } else {
                          this.field_k.b(this.a(param7, true), (var9_int >> 1593955777) + this.a(param0, param7, 65263, param6), this.a((byte) 118, param3, param1, param7) - -var11, param4, param2);
                          break L1;
                        }
                      }
                    }
                  }
                  this.field_k.c(this.a(param7, true), this.a(param0, param7, 65263, param6), this.a((byte) 105, param3, param1, param7) + var11, param4, param2);
                  break L1;
                }
              }
              sc.b(-103);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var9 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var9);
            stackOut_26_1 = new StringBuilder().append("um.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param7 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int a(int param0, byte param1, oc param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -92) {
                break L1;
              } else {
                this.field_k = (dh) null;
                break L1;
              }
            }
            stackOut_2_0 = this.a((byte) 125, param0, 0, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("um.S(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(byte param0) {
        if (param0 < 64) {
            this.field_h = -89;
        }
        return this.field_k.field_P + this.field_k.field_F;
    }

    public final int a(oc param0, int param1) {
        ep discarded$8 = null;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            discarded$8 = this.c(param0, 109);
            if (param1 == 46695) {
              stackOut_3_0 = param0.field_j.a(param1 ^ 46695) + this.field_q - -this.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 99;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("um.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_j = null;
        if (param0 != 31292) {
            field_b = (mh) null;
        }
        field_u = null;
        field_o = null;
        field_b = null;
        field_l = null;
    }

    protected um() {
    }

    um(dh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_n = param12 ? true : false;
            this.field_r = param5;
            this.field_h = param9;
            this.field_k = param0;
            this.field_a = param4;
            this.field_q = param3;
            this.field_c = param11;
            this.field_m = param8;
            this.field_s = param10;
            this.field_i = param2;
            this.field_d = param1;
            this.field_f = param7;
            this.field_g = param6;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "um.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_u = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_e = true;
        field_j = new int[]{0, 50, 101, 151, 201, 251, 302, 352, 402, 452, 503, 553, 603, 653, 704, 754, 804, 854, 905, 955, 1005, 1056, 1106, 1156, 1206, 1257, 1307, 1357, 1407, 1458, 1508, 1558, 1608, 1659, 1709, 1759, 1809, 1860, 1910, 1960, 2010, 2061, 2111, 2161, 2211, 2261, 2312, 2362, 2412, 2462, 2513, 2563, 2613, 2663, 2714, 2764, 2814, 2864, 2914, 2965, 3015, 3065, 3115, 3165, 3216, 3266, 3316, 3366, 3417, 3467, 3517, 3567, 3617, 3667, 3718, 3768, 3818, 3868, 3918, 3969, 4019, 4069, 4119, 4169, 4219, 4270, 4320, 4370, 4420, 4470, 4520, 4570, 4621, 4671, 4721, 4771, 4821, 4871, 4921, 4972, 5022, 5072, 5122, 5172, 5222, 5272, 5322, 5372, 5422, 5473, 5523, 5573, 5623, 5673, 5723, 5773, 5823, 5873, 5923, 5973, 6023, 6073, 6123, 6173, 6224, 6274, 6324, 6374, 6424, 6474, 6524, 6574, 6624, 6674, 6724, 6774, 6824, 6874, 6924, 6974, 7024, 7074, 7124, 7174, 7224, 7273, 7323, 7373, 7423, 7473, 7523, 7573, 7623, 7673, 7723, 7773, 7823, 7873, 7923, 7972, 8022, 8072, 8122, 8172, 8222, 8272, 8322, 8371, 8421, 8471, 8521, 8571, 8621, 8670, 8720, 8770, 8820, 8870, 8919, 8969, 9019, 9069, 9119, 9168, 9218, 9268, 9318, 9367, 9417, 9467, 9517, 9566, 9616, 9666, 9716, 9765, 9815, 9865, 9914, 9964, 10014, 10063, 10113, 10163, 10212, 10262, 10312, 10361, 10411, 10461, 10510, 10560, 10609, 10659, 10709, 10758, 10808, 10857, 10907, 10956, 11006, 11056, 11105, 11155, 11204, 11254, 11303, 11353, 11402, 11452, 11501, 11551, 11600, 11650, 11699, 11749, 11798, 11847, 11897, 11946, 11996, 12045, 12095, 12144, 12193, 12243, 12292, 12341, 12391, 12440, 12490, 12539, 12588, 12638, 12687, 12736, 12785, 12835, 12884, 12933, 12983, 13032, 13081, 13130, 13180, 13229, 13278, 13327, 13376, 13426, 13475, 13524, 13573, 13622, 13672, 13721, 13770, 13819, 13868, 13917, 13966, 14016, 14065, 14114, 14163, 14212, 14261, 14310, 14359, 14408, 14457, 14506, 14555, 14604, 14653, 14702, 14751, 14800, 14849, 14898, 14947, 14996, 15045, 15094, 15143, 15192, 15240, 15289, 15338, 15387, 15436, 15485, 15534, 15582, 15631, 15680, 15729, 15778, 15826, 15875, 15924, 15973, 16021, 16070, 16119, 16168, 16216, 16265, 16314, 16362, 16411, 16460, 16508, 16557, 16606, 16654, 16703, 16751, 16800, 16849, 16897, 16946, 16994, 17043, 17091, 17140, 17188, 17237, 17285, 17334, 17382, 17431, 17479, 17528, 17576, 17625, 17673, 17721, 17770, 17818, 17867, 17915, 17963, 18012, 18060, 18108, 18156, 18205, 18253, 18301, 18350, 18398, 18446, 18494, 18543, 18591, 18639, 18687, 18735, 18783, 18832, 18880, 18928, 18976, 19024, 19072, 19120, 19168, 19216, 19264, 19313, 19361, 19409, 19457, 19505, 19553, 19600, 19648, 19696, 19744, 19792, 19840, 19888, 19936, 19984, 20032, 20080, 20127, 20175, 20223, 20271, 20319, 20366, 20414, 20462, 20510, 20557, 20605, 20653, 20701, 20748, 20796, 20844, 20891, 20939, 20987, 21034, 21082, 21129, 21177, 21224, 21272, 21320, 21367, 21415, 21462, 21510, 21557, 21604, 21652, 21699, 21747, 21794, 21842, 21889, 21936, 21984, 22031, 22078, 22126, 22173, 22220, 22268, 22315, 22362, 22409, 22457, 22504, 22551, 22598, 22645, 22693, 22740, 22787, 22834, 22881, 22928, 22975, 23022, 23069, 23116, 23163, 23210, 23257, 23304, 23351, 23398, 23445, 23492, 23539, 23586, 23633, 23680, 23727, 23774, 23820, 23867, 23914, 23961, 24008, 24054, 24101, 24148, 24195, 24241, 24288, 24335, 24381, 24428, 24475, 24521, 24568, 24614, 24661, 24708, 24754, 24801, 24847, 24894, 24940, 24987, 25033, 25080, 25126, 25172, 25219, 25265, 25312, 25358, 25404, 25451, 25497, 25543, 25589, 25636, 25682, 25728, 25774, 25821, 25867, 25913, 25959, 26005, 26051, 26098, 26144, 26190, 26236, 26282, 26328, 26374, 26420, 26466, 26512, 26558, 26604, 26650, 26696, 26742, 26787, 26833, 26879, 26925, 26971, 27017, 27062, 27108, 27154, 27200, 27245, 27291, 27337, 27382, 27428, 27474, 27519, 27565, 27611, 27656, 27702, 27747, 27793, 27838, 27884, 27929, 27975, 28020, 28066, 28111, 28156, 28202, 28247, 28293, 28338, 28383, 28429, 28474, 28519, 28564, 28610, 28655, 28700, 28745, 28790, 28835, 28881, 28926, 28971, 29016, 29061, 29106, 29151, 29196, 29241, 29286, 29331, 29376, 29421, 29466, 29511, 29555, 29600, 29645, 29690, 29735, 29780, 29824, 29869, 29914, 29959, 30003, 30048, 30093, 30137, 30182, 30226, 30271, 30316, 30360, 30405, 30449, 30494, 30538, 30583, 30627, 30672, 30716, 30760, 30805, 30849, 30893, 30938, 30982, 31026, 31071, 31115, 31159, 31203, 31248, 31292, 31336, 31380, 31424, 31468, 31512, 31556, 31600, 31644, 31688, 31732, 31776, 31820, 31864, 31908, 31952, 31996, 32040, 32084, 32127, 32171, 32215, 32259, 32303, 32346, 32390, 32434, 32477, 32521, 32565, 32608, 32652, 32695, 32739, 32783, 32826, 32870, 32913, 32956, 33000, 33043, 33087, 33130, 33173, 33217, 33260, 33303, 33347, 33390, 33433, 33476, 33520, 33563, 33606, 33649, 33692, 33735, 33778, 33821, 33865, 33908, 33951, 33994, 34037, 34079, 34122, 34165, 34208, 34251, 34294, 34337, 34380, 34422, 34465, 34508, 34551, 34593, 34636, 34679, 34721, 34764, 34806, 34849, 34892, 34934, 34977, 35019, 35062, 35104, 35146, 35189, 35231, 35274, 35316, 35358, 35401, 35443, 35485, 35527, 35570, 35612, 35654, 35696, 35738, 35781, 35823, 35865, 35907, 35949, 35991, 36033, 36075, 36117, 36159, 36201, 36243, 36284, 36326, 36368, 36410, 36452, 36493, 36535, 36577, 36619, 36660, 36702, 36744, 36785, 36827, 36868, 36910, 36951, 36993, 37034, 37076, 37117, 37159, 37200, 37241, 37283, 37324, 37365, 37407, 37448, 37489, 37530, 37572, 37613, 37654, 37695, 37736, 37777, 37818, 37859, 37900, 37941, 37982, 38023, 38064, 38105, 38146, 38187, 38228, 38269, 38309, 38350, 38391, 38432, 38472, 38513, 38554, 38594, 38635, 38675, 38716, 38757, 38797, 38838, 38878, 38919, 38959, 38999, 39040, 39080, 39120, 39161, 39201, 39241, 39282, 39322, 39362, 39402, 39442, 39482, 39523, 39563, 39603, 39643, 39683, 39723, 39763, 39803, 39843, 39882, 39922, 39962, 40002, 40042, 40082, 40121, 40161, 40201, 40241, 40280, 40320, 40359, 40399, 40439, 40478, 40518, 40557, 40597, 40636, 40675, 40715, 40754, 40794, 40833, 40872, 40912, 40951, 40990, 41029, 41068, 41108, 41147, 41186, 41225, 41264, 41303, 41342, 41381, 41420, 41459, 41498, 41537, 41576, 41614, 41653, 41692, 41731, 41770, 41808, 41847, 41886, 41924, 41963, 42002, 42040, 42079, 42117, 42156, 42194, 42233, 42271, 42309, 42348, 42386, 42424, 42463, 42501, 42539, 42578, 42616, 42654, 42692, 42730, 42768, 42806, 42844, 42882, 42920, 42958, 42996, 43034, 43072, 43110, 43148, 43186, 43223, 43261, 43299, 43337, 43374, 43412, 43450, 43487, 43525, 43562, 43600, 43638, 43675, 43713, 43750, 43787, 43825, 43862, 43899, 43937, 43974, 44011, 44049, 44086, 44123, 44160, 44197, 44234, 44271, 44308, 44345, 44382, 44419, 44456, 44493, 44530, 44567, 44604, 44641, 44677, 44714, 44751, 44788, 44824, 44861, 44898, 44934, 44971, 45007, 45044, 45080, 45117, 45153, 45190, 45226, 45262, 45299, 45335, 45371, 45408, 45444, 45480, 45516, 45552, 45589, 45625, 45661, 45697, 45733, 45769, 45805, 45841, 45877, 45912, 45948, 45984, 46020, 46056, 46091, 46127, 46163, 46199, 46234, 46270, 46305, 46341, 46376, 46412, 46447, 46483, 46518, 46554, 46589, 46624, 46660, 46695, 46730, 46765, 46801, 46836, 46871, 46906, 46941, 46976, 47011, 47046, 47081, 47116, 47151, 47186, 47221, 47256, 47291, 47325, 47360, 47395, 47430, 47464, 47499, 47534, 47568, 47603, 47637, 47672, 47706, 47741, 47775, 47809, 47844, 47878, 47912, 47947, 47981, 48015, 48049, 48084, 48118, 48152, 48186, 48220, 48254, 48288, 48322, 48356, 48390, 48424, 48458, 48491, 48525, 48559, 48593, 48626, 48660, 48694, 48727, 48761, 48795, 48828, 48862, 48895, 48929, 48962, 48995, 49029, 49062, 49095, 49129, 49162, 49195, 49228, 49262, 49295, 49328, 49361, 49394, 49427, 49460, 49493, 49526, 49559, 49592, 49624, 49657, 49690, 49723, 49756, 49788, 49821, 49854, 49886, 49919, 49951, 49984, 50016, 50049, 50081, 50114, 50146, 50178, 50211, 50243, 50275, 50307, 50340, 50372, 50404, 50436, 50468, 50500, 50532, 50564, 50596, 50628, 50660, 50692, 50724, 50756, 50787, 50819, 50851, 50882, 50914, 50946, 50977, 51009, 51041, 51072, 51104, 51135, 51166, 51198, 51229, 51260, 51292, 51323, 51354, 51386, 51417, 51448, 51479, 51510, 51541, 51572, 51603, 51634, 51665, 51696, 51727, 51758, 51789, 51819, 51850, 51881, 51911, 51942, 51973, 52003, 52034, 52065, 52095, 52126, 52156, 52186, 52217, 52247, 52277, 52308, 52338, 52368, 52398, 52429, 52459, 52489, 52519, 52549, 52579, 52609, 52639, 52669, 52699, 52729, 52759, 52788, 52818, 52848, 52878, 52907, 52937, 52967, 52996, 53026, 53055, 53085, 53114, 53144, 53173, 53202, 53232, 53261, 53290, 53319, 53349, 53378, 53407, 53436, 53465, 53494, 53523, 53552, 53581, 53610, 53639, 53668, 53697, 53726, 53754, 53783, 53812, 53840, 53869, 53898, 53926, 53955, 53983, 54012, 54040, 54069, 54097, 54125, 54154, 54182, 54210, 54239, 54267, 54295, 54323, 54351, 54379, 54407, 54435, 54463, 54491, 54519, 54547, 54575, 54603, 54630, 54658, 54686, 54714, 54741, 54769, 54796, 54824, 54852, 54879, 54906, 54934, 54961, 54989, 55016, 55043, 55071, 55098, 55125, 55152, 55179, 55206, 55233, 55260, 55288, 55314, 55341, 55368, 55395, 55422, 55449, 55476, 55502, 55529, 55556, 55582, 55609, 55636, 55662, 55689, 55715, 55742, 55768, 55794, 55821, 55847, 55873, 55900, 55926, 55952, 55978, 56004, 56030, 56056, 56082, 56108, 56134, 56160, 56186, 56212, 56238, 56264, 56289, 56315, 56341, 56367, 56392, 56418, 56443, 56469, 56494, 56520, 56545, 56571, 56596, 56621, 56647, 56672, 56697, 56722, 56747, 56773, 56798, 56823, 56848, 56873, 56898, 56923, 56948, 56972, 56997, 57022, 57047, 57072, 57096, 57121, 57145, 57170, 57195, 57219, 57244, 57268, 57293, 57317, 57341, 57366, 57390, 57414, 57438, 57463, 57487, 57511, 57535, 57559, 57583, 57607, 57631, 57655, 57679, 57703, 57726, 57750, 57774, 57798, 57821, 57845, 57869, 57892, 57916, 57939, 57963, 57986, 58009, 58033, 58056, 58079, 58103, 58126, 58149, 58172, 58195, 58219, 58242, 58265, 58288, 58311, 58334, 58356, 58379, 58402, 58425, 58448, 58470, 58493, 58516, 58538, 58561, 58583, 58606, 58628, 58651, 58673, 58696, 58718, 58740, 58763, 58785, 58807, 58829, 58851, 58873, 58896, 58918, 58940, 58962, 58983, 59005, 59027, 59049, 59071, 59093, 59114, 59136, 59158, 59179, 59201, 59222, 59244, 59265, 59287, 59308, 59330, 59351, 59372, 59393, 59415, 59436, 59457, 59478, 59499, 59520, 59541, 59562, 59583, 59604, 59625, 59646, 59667, 59687, 59708, 59729, 59750, 59770, 59791, 59811, 59832, 59852, 59873, 59893, 59914, 59934, 59954, 59975, 59995, 60015, 60035, 60055, 60075, 60096, 60116, 60136, 60156, 60175, 60195, 60215, 60235, 60255, 60275, 60294, 60314, 60334, 60353, 60373, 60392, 60412, 60431, 60451, 60470, 60490, 60509, 60528, 60547, 60567, 60586, 60605, 60624, 60643, 60662, 60681, 60700, 60719, 60738, 60757, 60776, 60794, 60813, 60832, 60851, 60869, 60888, 60906, 60925, 60943, 60962, 60980, 60999, 61017, 61035, 61054, 61072, 61090, 61108, 61127, 61145, 61163, 61181, 61199, 61217, 61235, 61253, 61270, 61288, 61306, 61324, 61341, 61359, 61377, 61394, 61412, 61429, 61447, 61464, 61482, 61499, 61517, 61534, 61551, 61568, 61586, 61603, 61620, 61637, 61654, 61671, 61688, 61705, 61722, 61739, 61756, 61772, 61789, 61806, 61823, 61839, 61856, 61873, 61889, 61906, 61922, 61939, 61955, 61971, 61988, 62004, 62020, 62036, 62053, 62069, 62085, 62101, 62117, 62133, 62149, 62165, 62181, 62197, 62212, 62228, 62244, 62260, 62275, 62291, 62307, 62322, 62338, 62353, 62369, 62384, 62400, 62415, 62430, 62445, 62461, 62476, 62491, 62506, 62521, 62536, 62551, 62566, 62581, 62596, 62611, 62626, 62641, 62655, 62670, 62685, 62699, 62714, 62729, 62743, 62758, 62772, 62787, 62801, 62815, 62830, 62844, 62858, 62872, 62886, 62901, 62915, 62929, 62943, 62957, 62971, 62985, 62998, 63012, 63026, 63040, 63054, 63067, 63081, 63095, 63108, 63122, 63135, 63149, 63162, 63175, 63189, 63202, 63215, 63229, 63242, 63255, 63268, 63281, 63294, 63307, 63320, 63333, 63346, 63359, 63372, 63385, 63397, 63410, 63423, 63435, 63448, 63461, 63473, 63486, 63498, 63510, 63523, 63535, 63547, 63560, 63572, 63584, 63596, 63608, 63621, 63633, 63645, 63657, 63668, 63680, 63692, 63704, 63716, 63728, 63739, 63751, 63763, 63774, 63786, 63797, 63809, 63820, 63832, 63843, 63854, 63866, 63877, 63888, 63899, 63910, 63922, 63933, 63944, 63955, 63966, 63976, 63987, 63998, 64009, 64020, 64031, 64041, 64052, 64062, 64073, 64084, 64094, 64105, 64115, 64125, 64136, 64146, 64156, 64167, 64177, 64187, 64197, 64207, 64217, 64227, 64237, 64247, 64257, 64267, 64277, 64287, 64296, 64306, 64316, 64325, 64335, 64344, 64354, 64363, 64373, 64382, 64392, 64401, 64410, 64420, 64429, 64438, 64447, 64456, 64465, 64474, 64483, 64492, 64501, 64510, 64519, 64528, 64536, 64545, 64554, 64563, 64571, 64580, 64588, 64597, 64605, 64614, 64622, 64630, 64639, 64647, 64655, 64663, 64672, 64680, 64688, 64696, 64704, 64712, 64720, 64728, 64735, 64743, 64751, 64759, 64766, 64774, 64782, 64789, 64797, 64804, 64812, 64819, 64827, 64834, 64841, 64849, 64856, 64863, 64870, 64877, 64884, 64892, 64899, 64905, 64912, 64919, 64926, 64933, 64940, 64947, 64953, 64960, 64967, 64973, 64980, 64986, 64993, 64999, 65006, 65012, 65018, 65025, 65031, 65037, 65043, 65049, 65055, 65061, 65067, 65073, 65079, 65085, 65091, 65097, 65103, 65109, 65114, 65120, 65126, 65131, 65137, 65142, 65148, 65153, 65159, 65164, 65169, 65175, 65180, 65185, 65190, 65195, 65200, 65205, 65210, 65215, 65220, 65225, 65230, 65235, 65240, 65245, 65249, 65254, 65259, 65263, 65268, 65272, 65277, 65281, 65286, 65290, 65294, 65299, 65303, 65307, 65311, 65315, 65320, 65324, 65328, 65332, 65336, 65339, 65343, 65347, 65351, 65355, 65358, 65362, 65366, 65369, 65373, 65376, 65380, 65383, 65387, 65390, 65393, 65397, 65400, 65403, 65406, 65410, 65413, 65416, 65419, 65422, 65425, 65428, 65430, 65433, 65436, 65439, 65442, 65444, 65447, 65449, 65452, 65455, 65457, 65460, 65462, 65464, 65467, 65469, 65471, 65473, 65476, 65478, 65480, 65482, 65484, 65486, 65488, 65490, 65492, 65493, 65495, 65497, 65499, 65500, 65502, 65504, 65505, 65507, 65508, 65510, 65511, 65512, 65514, 65515, 65516, 65517, 65519, 65520, 65521, 65522, 65523, 65524, 65525, 65526, 65527, 65527, 65528, 65529, 65530, 65530, 65531, 65532, 65532, 65533, 65533, 65534, 65534, 65534, 65535, 65535, 65535, 65536, 65536, 65536, 65536, 65536, 65536};
    }
}
