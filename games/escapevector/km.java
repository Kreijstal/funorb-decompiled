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
            field_j = (int[]) null;
        }
        byte[] var3 = new byte[this.field_m.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$0 = this.field_m.position(0);
        java.nio.ByteBuffer discarded$1 = this.field_m.get(var3);
        return var3;
    }

    public static void c(int param0) {
        field_j = null;
        field_k = null;
        field_o = null;
        field_n = null;
        field_l = null;
        if (param0 != -4) {
            km.a(111, 74);
        }
    }

    final void a(boolean param0, byte[] param1) {
        java.nio.Buffer discarded$6 = null;
        java.nio.ByteBuffer discarded$7 = null;
        try {
            this.field_m = java.nio.ByteBuffer.allocateDirect(param1.length);
            discarded$6 = this.field_m.position(0);
            if (!param0) {
                this.field_m = (java.nio.ByteBuffer) null;
            }
            discarded$7 = this.field_m.put(param1);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "km.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        boolean discarded$0 = false;
        if (param0 != -59) {
            return;
        }
        if (!ce.field_f.field_h) {
            if (!(ce.field_f.field_c)) {
                ce.field_f.b((byte) -126);
                ce.field_f.e(param0 ^ 19593);
            }
        }
        if (!(ua.field_c.a(-19836))) {
            discarded$0 = ua.field_c.g(-9949);
        }
        hk.b(param0 ^ -57);
        fg.b(0);
    }

    final static void a(n param0, lk param1, int param2, int param3) {
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
            mn var17_ref = null;
            byte[][] var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            RuntimeException stackOut_41_0 = null;
            StringBuilder stackOut_41_1 = null;
            String stackOut_41_2 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            var14 = EscapeVector.field_A;
            try {
              L0: {
                if (param3 == -24183) {
                  var17_ref = new mn();
                  var17_ref.field_i = param0.e(0);
                  var17_ref.field_g = param0.g(param3 + 19130);
                  var17_ref.field_p = new la[var17_ref.field_i];
                  var17_ref.field_m = new int[var17_ref.field_i];
                  var17_ref.field_o = new int[var17_ref.field_i];
                  var17_ref.field_j = new int[var17_ref.field_i];
                  var17_ref.field_l = new byte[var17_ref.field_i][][];
                  var17_ref.field_r = new la[var17_ref.field_i];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var17_ref.field_i) {
                      je.field_a.a(-12328, var17_ref);
                      decompiledRegionSelector1 = 1;
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
                                if (-2 == (var6_int ^ -1)) {
                                  break L4;
                                } else {
                                  if (-3 != (var6_int ^ -1)) {
                                    L5: {
                                      if (var6_int == 3) {
                                        break L5;
                                      } else {
                                        if (-5 == (var6_int ^ -1)) {
                                          break L5;
                                        } else {
                                          var5++;
                                          decompiledRegionSelector0 = 1;
                                          break L2;
                                        }
                                      }
                                    }
                                    var19 = param0.c(false);
                                    var8 = param0.c(false);
                                    var9 = param0.e(param3 + 24183);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var11_int >= var9) {
                                        L7: {
                                          var20 = new byte[var9][];
                                          var18 = var20;
                                          var11 = var18;
                                          if (-4 != (var6_int ^ -1)) {
                                            break L7;
                                          } else {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var12_int >= var9) {
                                                break L7;
                                              } else {
                                                var13 = param0.g(param3 ^ 19914);
                                                array$1 = new byte[var13];
                                                var11[var12_int] = array$1;
                                                param0.a(var20[var12_int], (byte) -96, 0, var13);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          }
                                        }
                                        var17_ref.field_m[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var16 = 0;
                                        var13 = var16;
                                        L9: while (true) {
                                          if (var16 >= var9) {
                                            var17_ref.field_p[var5] = param1.a(var8, n.a(param3, -24074), en.a(var19, (byte) 38), var12);
                                            var17_ref.field_l[var5] = var20;
                                            break L3;
                                          } else {
                                            var12[var16] = en.a(var10[var16], (byte) 38);
                                            var16++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param0.c(false);
                                        var11_int++;
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
                              var15 = param0.c(false);
                              var7 = var15;
                              var8 = param0.c(false);
                              var9 = 0;
                              if (var6_int != 1) {
                                break L10;
                              } else {
                                var9 = param0.g(-5053);
                                break L10;
                              }
                            }
                            var17_ref.field_m[var5] = var6_int;
                            var17_ref.field_j[var5] = var9;
                            var17_ref.field_r[var5] = param1.a(var8, en.a(var15, (byte) 38), n.a(param3, 24120));
                            break L3;
                          }
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var17_ref.field_o[var5] = -1;
                          decompiledRegionSelector0 = 0;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var17_ref.field_o[var5] = -2;
                          decompiledRegionSelector0 = 0;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var17_ref.field_o[var5] = -3;
                          decompiledRegionSelector0 = 0;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var17_ref.field_o[var5] = -4;
                          decompiledRegionSelector0 = 0;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var17_ref.field_o[var5] = -5;
                          decompiledRegionSelector0 = 0;
                          break L15;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        var5++;
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) (var4);
                stackOut_36_1 = new StringBuilder().append("km.F(");
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param0 == null) {
                  stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackOut_38_2 = "null";
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  break L16;
                } else {
                  stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackOut_37_2 = "{...}";
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  break L16;
                }
              }
              L17: {
                stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param1 == null) {
                  stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
                  stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackOut_41_2 = "null";
                  stackIn_42_0 = stackOut_41_0;
                  stackIn_42_1 = stackOut_41_1;
                  stackIn_42_2 = stackOut_41_2;
                  break L17;
                } else {
                  stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackOut_40_2 = "{...}";
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_42_1 = stackOut_40_1;
                  stackIn_42_2 = stackOut_40_2;
                  break L17;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ')');
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

    final static void a(n param0, int param1) {
        int var2_int = 0;
        try {
            hk.field_n = param0.f(param1 + -1238557701) << 1238559653;
            var2_int = param0.e(0);
            hk.field_n = hk.field_n + (var2_int >> -8258493);
            wk.field_d = 1835008 & var2_int << 1755770738;
            wk.field_d = wk.field_d + (param0.f(1952) << 942425122);
            var2_int = param0.e(param1 + -1238559653);
            wk.field_d = wk.field_d + (var2_int >> -964320506);
            oc.field_u = (63 & var2_int) << 14076911;
            oc.field_u = oc.field_u + (param0.e(param1 + -1238559653) << -1075165273);
            var2_int = param0.e(param1 ^ param1);
            bk.field_s = (var2_int & 1) << -625386768;
            oc.field_u = oc.field_u + (var2_int >> -1955580831);
            bk.field_s = bk.field_s + param0.f(1952);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "km.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_o = "Retrieval objectives";
        field_j = new int[8192];
        field_n = null;
    }
}
