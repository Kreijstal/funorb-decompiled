/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends pg {
    static qb[] field_i;
    int field_g;
    static String field_n;
    static boolean field_p;
    static String field_l;
    static String field_j;
    static String field_r;
    static int field_o;
    byte[] field_k;
    static String field_s;
    static int field_h;
    long field_q;
    static kc field_m;

    final static String a(String param0, int param1, eg param2, String param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param1 >= 68) {
                break L1;
              } else {
                var5 = null;
                String discarded$2 = qe.a((String) null, -87, (eg) null, (String) null);
                break L1;
              }
            }
            if (!param2.c(-10923)) {
              stackOut_4_0 = (String) param3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              stackOut_6_0 = param0 + " - " + param2.a((byte) 96) + "%";
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("qe.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(dl param0, int param1, wk param2) {
        try {
            RuntimeException var4 = null;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            int var6_int = 0;
            String var7 = null;
            String var8 = null;
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
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
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
            var14 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                var18 = (Object) (Object) new oh();
                ((oh) var18).field_s = param2.e((byte) 99);
                ((oh) var18).field_m = param2.d(-10674);
                ((oh) var18).field_p = new int[((oh) var18).field_s];
                ((oh) var18).field_o = new int[((oh) var18).field_s];
                ((oh) var18).field_l = new byte[((oh) var18).field_s][][];
                ((oh) var18).field_n = new og[((oh) var18).field_s];
                ((oh) var18).field_g = new og[((oh) var18).field_s];
                ((oh) var18).field_j = new int[((oh) var18).field_s];
                var5 = 0;
                L1: while (true) {
                  if (~var5 <= ~((oh) var18).field_s) {
                    la.field_b.b((pg) var18, -1);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param2.e((byte) -120);
                            if (var6_int == 0) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (2 != var6_int) {
                                  L5: {
                                    L6: {
                                      if (var6_int == 3) {
                                        break L6;
                                      } else {
                                        if (var6_int != 4) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var20 = param2.l(-1);
                                    var8 = param2.l(-1);
                                    var9 = param2.e((byte) 53);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L7: while (true) {
                                      if (~var9 >= ~var11_int) {
                                        L8: {
                                          var23 = new byte[var9][];
                                          var22 = var23;
                                          var21 = var22;
                                          var19 = var21;
                                          var11 = var19;
                                          if (var6_int != 3) {
                                            break L8;
                                          } else {
                                            var12_int = 0;
                                            L9: while (true) {
                                              if (var12_int >= var9) {
                                                break L8;
                                              } else {
                                                var13 = param2.d(-10674);
                                                var11[var12_int] = new byte[var13];
                                                param2.a((byte) 92, 0, var23[var12_int], var13);
                                                var12_int++;
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                        ((oh) var18).field_o[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L10: while (true) {
                                          if (~var9 >= ~var17) {
                                            ((oh) var18).field_g[var5] = param0.a(-30176, var8, var12, jl.a(var20, -110));
                                            ((oh) var18).field_l[var5] = var23;
                                            break L5;
                                          } else {
                                            var12[var17] = jl.a(var10[var17], 33);
                                            var17++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param2.l(hh.a(0, -1));
                                        var11_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param2.l(-1);
                            var7 = var16;
                            var15 = param2.l(-1);
                            var8 = var15;
                            var9 = 0;
                            if (1 != var6_int) {
                              break L11;
                            } else {
                              var9 = param2.d(-10674);
                              break L11;
                            }
                          }
                          ((oh) var18).field_o[var5] = var6_int;
                          ((oh) var18).field_p[var5] = var9;
                          ((oh) var18).field_n[var5] = param0.a((byte) -95, var15, jl.a(var16, -100));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((oh) var18).field_j[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((oh) var18).field_j[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((oh) var18).field_j[var5] = -5;
                        break L16;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_33_0 = (RuntimeException) var4;
                stackOut_33_1 = new StringBuilder().append("qe.A(");
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
                  break L17;
                } else {
                  stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                  stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                  stackOut_34_2 = "{...}";
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  break L17;
                }
              }
              L18: {
                stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(',');
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param2 == null) {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L18;
                } else {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L18;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + 0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        ab var3 = he.field_e;
        var3.b((byte) -49, param2);
        var3.f(3, (byte) -76);
        var3.f(10, (byte) -105);
        var3.c(param0, (byte) -85);
    }

    final static qb[] a(eg param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb[] stackIn_3_0 = null;
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
        qb[] stackOut_2_0 = null;
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
              var4_int = param0.c(param2, 109);
              var5 = param0.a(param1, (byte) 39, var4_int);
              if (param3 >= 40) {
                break L1;
              } else {
                field_p = true;
                break L1;
              }
            }
            stackOut_2_0 = of.a(var4_int, (byte) -38, param0, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qe.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static java.awt.Container a() {
        if (gk.field_c != null) {
            return (java.awt.Container) (Object) gk.field_c;
        }
        return (java.awt.Container) (Object) cd.e(113);
    }

    public static void c() {
        field_l = null;
        field_r = null;
        field_j = null;
        field_s = null;
        field_n = null;
        field_m = null;
        field_i = null;
    }

    qe(long param0, int param1, byte[] param2) {
        try {
            ((qe) this).field_k = param2;
            ((qe) this).field_g = param1;
            ((qe) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "qe.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "This members-only spell will be unavailable in multiplayer games";
        field_l = "Creating your account";
        field_j = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_p = true;
        field_s = "The game has started!<br>Click 'Start' to enter.";
        field_n = "Now that the basic spells have been mastered, it is time to learn how to walk around the map.";
    }
}
