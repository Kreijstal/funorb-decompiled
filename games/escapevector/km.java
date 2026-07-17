/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends fh {
    static ed field_k;
    static String field_o;
    static int[] field_j;
    static String field_l;
    private java.nio.ByteBuffer field_m;
    static pk field_n;

    final byte[] a(int param0) {
        if (param0 != 4) {
            field_j = null;
        }
        byte[] var3 = new byte[((km) this).field_m.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = ((km) this).field_m.position(0);
        java.nio.ByteBuffer discarded$1 = ((km) this).field_m.get(var3);
        return var3;
    }

    public static void c(int param0) {
        field_j = null;
        field_k = null;
        field_o = null;
        field_n = null;
        field_l = null;
    }

    final void a(boolean param0, byte[] param1) {
        try {
            ((km) this).field_m = java.nio.ByteBuffer.allocateDirect(param1.length);
            java.nio.Buffer discarded$6 = ((km) this).field_m.position(0);
            if (!param0) {
                ((km) this).field_m = null;
            }
            java.nio.ByteBuffer discarded$7 = ((km) this).field_m.put(param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "km.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        c var2 = om.field_c;
        var2.a(param0, true);
        var2.f(1, -123);
        int var3 = -50 % ((61 - param1) / 57);
        var2.f(2, -123);
    }

    km() {
    }

    final static void b(byte param0) {
        if (!ce.field_f.field_h) {
            if (!(ce.field_f.field_c)) {
                ce.field_f.b((byte) -126);
                ce.field_f.e(-19636);
            }
        }
        if (!(ua.field_c.a(-19836))) {
            boolean discarded$0 = ua.field_c.g(-9949);
        }
        hk.b(2);
        fg.b(0);
    }

    final static void a(n param0, lk param1, int param2, int param3) {
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
            int var16 = 0;
            Object var17 = null;
            byte[][] var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var14 = EscapeVector.field_A;
            try {
              L0: {
                var17 = (Object) (Object) new mn();
                ((mn) var17).field_i = param0.e(0);
                ((mn) var17).field_g = param0.g(-5053);
                ((mn) var17).field_p = new la[((mn) var17).field_i];
                ((mn) var17).field_m = new int[((mn) var17).field_i];
                ((mn) var17).field_o = new int[((mn) var17).field_i];
                ((mn) var17).field_j = new int[((mn) var17).field_i];
                ((mn) var17).field_l = new byte[((mn) var17).field_i][][];
                ((mn) var17).field_r = new la[((mn) var17).field_i];
                var5 = 0;
                L1: while (true) {
                  if (~var5 <= ~((mn) var17).field_i) {
                    je.field_a.a(-12328, (hg) var17);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param0.e(0);
                            if (0 == var6_int) {
                              break L4;
                            } else {
                              if (var6_int == 1) {
                                break L4;
                              } else {
                                if (var6_int != 2) {
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
                                    var19 = param0.c(false);
                                    var8 = param0.c(false);
                                    var9 = param0.e(0);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L7: while (true) {
                                      if (~var11_int <= ~var9) {
                                        L8: {
                                          var22 = new byte[var9][];
                                          var21 = var22;
                                          var20 = var21;
                                          var18 = var20;
                                          var11 = var18;
                                          if (var6_int != 3) {
                                            break L8;
                                          } else {
                                            var12_int = 0;
                                            L9: while (true) {
                                              if (var12_int >= var9) {
                                                break L8;
                                              } else {
                                                var13 = param0.g(-5053);
                                                var11[var12_int] = new byte[var13];
                                                param0.a(var22[var12_int], (byte) -96, 0, var13);
                                                var12_int++;
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                        ((mn) var17).field_m[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var16 = 0;
                                        var13 = var16;
                                        L10: while (true) {
                                          if (var16 >= var9) {
                                            ((mn) var17).field_p[var5] = param1.a(var8, n.a(-24183, -24074), en.a(var19, (byte) 38), var12);
                                            ((mn) var17).field_l[var5] = var22;
                                            break L5;
                                          } else {
                                            var12[var16] = en.a(var10[var16], (byte) 38);
                                            var16++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.c(false);
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
                            var15 = param0.c(false);
                            var7 = var15;
                            var8 = param0.c(false);
                            var9 = 0;
                            if (var6_int != 1) {
                              break L11;
                            } else {
                              var9 = param0.g(-5053);
                              break L11;
                            }
                          }
                          ((mn) var17).field_m[var5] = var6_int;
                          ((mn) var17).field_j[var5] = var9;
                          ((mn) var17).field_r[var5] = param1.a(var8, en.a(var15, (byte) 38), n.a(-24183, 24120));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((mn) var17).field_o[var5] = -1;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((mn) var17).field_o[var5] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var6_ref4 = decompiledCaughtException;
                        ((mn) var17).field_o[var5] = -5;
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
                stackOut_35_0 = (RuntimeException) var4;
                stackOut_35_1 = new StringBuilder().append("km.F(");
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param0 == null) {
                  stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                  stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L17;
                } else {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L17;
                }
              }
              L18: {
                stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param1 == null) {
                  stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                  stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L18;
                } else {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L18;
                }
              }
              throw t.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + param2 + 44 + -24183 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(n param0, int param1) {
        int var2_int = 0;
        try {
            hk.field_n = param0.f(1952) << 5;
            var2_int = param0.e(0);
            hk.field_n = hk.field_n + (var2_int >> 3);
            wk.field_d = 1835008 & var2_int << 18;
            wk.field_d = wk.field_d + (param0.f(1952) << 2);
            var2_int = param0.e(0);
            wk.field_d = wk.field_d + (var2_int >> 6);
            oc.field_u = (63 & var2_int) << 15;
            oc.field_u = oc.field_u + (param0.e(0) << 7);
            var2_int = param0.e(0);
            bk.field_s = (var2_int & 1) << 16;
            oc.field_u = oc.field_u + (var2_int >> 1);
            bk.field_s = bk.field_s + param0.f(1952);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "km.H(" + (param0 != null ? "{...}" : "null") + 44 + 1238559653 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_o = "Retrieval objectives";
        field_j = new int[8192];
        field_n = null;
    }
}
