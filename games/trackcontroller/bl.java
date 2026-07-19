/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl {
    static oi field_c;
    private String field_e;
    static String field_d;
    static qj field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 > -106) {
          field_a = (qj) null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final void a(java.applet.Applet param0, int param1) {
        try {
            if (param1 != -4) {
                field_a = (qj) null;
            }
            dh.a(this.field_e, 31536000L, param0, "jagex-last-login-method", param1 + 1004);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "bl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, uf param2, be param3) {
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
            int var12_int = 0;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            String var15 = null;
            String var16 = null;
            int var17 = 0;
            Object var18 = null;
            kj var18_ref = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
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
            var14 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                var18_ref = new kj();
                var18_ref.field_n = param3.h(16383);
                var18_ref.field_w = param3.e((byte) 113);
                var18_ref.field_j = new ce[var18_ref.field_n];
                var18_ref.field_u = new int[var18_ref.field_n];
                var18_ref.field_i = new int[var18_ref.field_n];
                var18_ref.field_m = new int[var18_ref.field_n];
                var18_ref.field_v = new ce[var18_ref.field_n];
                var18_ref.field_p = new byte[var18_ref.field_n][][];
                var5 = param0;
                L1: while (true) {
                  if (var18_ref.field_n <= var5) {
                    si.field_a.a((byte) -121, var18_ref);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param3.h(param0 ^ 16383);
                            if (0 == var6_int) {
                              break L4;
                            } else {
                              if ((var6_int ^ -1) == -2) {
                                break L4;
                              } else {
                                if ((var6_int ^ -1) != -3) {
                                  L5: {
                                    if (3 == var6_int) {
                                      break L5;
                                    } else {
                                      if (-5 != (var6_int ^ -1)) {
                                        break L3;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var20 = param3.g(param0 + 0);
                                  var8 = param3.g(0);
                                  var9 = param3.h(16383);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var9 <= var11_int) {
                                      L7: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (-4 == (var6_int ^ -1)) {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var9 <= var12_int) {
                                              break L7;
                                            } else {
                                              var13 = param3.e((byte) 113);
                                              array$1 = new byte[var13];
                                              var11[var12_int] = array$1;
                                              param3.a(105, var21[var12_int], 0, var13);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        } else {
                                          break L7;
                                        }
                                      }
                                      var18_ref.field_m[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var9 <= var17) {
                                          var18_ref.field_v[var5] = param2.a(var8, var12, 0, ve.a((byte) 11, var20));
                                          var18_ref.field_p[var5] = var21;
                                          break L3;
                                        } else {
                                          var12[var17] = ve.a((byte) 11, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param3.g(0);
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
                            var16 = param3.g(param0 + 0);
                            var7 = var16;
                            var15 = param3.g(param0 ^ 0);
                            var8 = var15;
                            var9 = 0;
                            if (var6_int == 1) {
                              var9 = param3.e((byte) 113);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var18_ref.field_m[var5] = var6_int;
                          var18_ref.field_u[var5] = var9;
                          var18_ref.field_j[var5] = param2.a(ma.a(param0, -26462), var15, ve.a((byte) 11, var16));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18_ref.field_i[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18_ref.field_i[var5] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18_ref.field_i[var5] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18_ref.field_i[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var18_ref.field_i[var5] = -5;
                        break L15;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) (var4);
                stackOut_36_1 = new StringBuilder().append("bl.D(").append(param0).append(',').append(param1).append(',');
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                if (param2 == null) {
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
                if (param3 == null) {
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
              throw sl.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            be var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_38_0 = 0;
            int stackIn_40_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_37_0 = 0;
            if ((rj.field_d.field_e ^ -1) <= -5) {
              if (0 == (rj.field_d.field_b ^ -1)) {
                return 3;
              } else {
                if (1 == (rj.field_d.field_b ^ -1)) {
                  return 4;
                } else {
                  return 1;
                }
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (rf.field_c == 0) {
                      w.field_V = kb.field_d.a(35, ga.field_e, fc.field_g);
                      rf.field_c = rf.field_c + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (1 == rf.field_c) {
                      if (-3 == (w.field_V.field_f ^ -1)) {
                        stackOut_16_0 = ej.a(40, -1);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if (-2 == (w.field_V.field_f ^ -1)) {
                          rf.field_c = rf.field_c + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (param0 <= -84) {
                      break L3;
                    } else {
                      field_a = (qj) null;
                      break L3;
                    }
                  }
                  L4: {
                    if ((rf.field_c ^ -1) != -3) {
                      break L4;
                    } else {
                      ob.field_u = new bc((java.net.Socket) (w.field_V.field_e), kb.field_d);
                      var2 = new be(13);
                      hl.a(kf.field_a, var2, 17, sa.field_T, vk.field_j);
                      var2.a(15, (byte) -100);
                      var2.b(false, gi.field_r);
                      ob.field_u.a(-128, var2.field_j, 13, 0);
                      rf.field_c = rf.field_c + 1;
                      ma.field_b = qg.a(false) + 30000L;
                      break L4;
                    }
                  }
                  L5: {
                    if (-4 != (rf.field_c ^ -1)) {
                      break L5;
                    } else {
                      if (0 >= ob.field_u.b(0)) {
                        if ((ma.field_b ^ -1L) > (qg.a(false) ^ -1L)) {
                          stackOut_34_0 = ej.a(116, -2);
                          stackIn_35_0 = stackOut_34_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = ob.field_u.a(-85);
                        if (0 != var1_int) {
                          stackOut_29_0 = ej.a(39, var1_int);
                          stackIn_30_0 = stackOut_29_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          rf.field_c = rf.field_c + 1;
                          break L5;
                        }
                      }
                    }
                  }
                  if (-5 != (rf.field_c ^ -1)) {
                    stackOut_39_0 = -1;
                    stackIn_40_0 = stackOut_39_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    rj.field_d.a((byte) 121, ai.field_b, ob.field_u);
                    ob.field_u = null;
                    w.field_V = null;
                    rf.field_c = 0;
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ej.a(91, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_30_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_35_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_38_0;
                    } else {
                      return stackIn_40_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bl(String param0) {
        try {
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(String param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
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
            if (!param1) {
              stackOut_3_0 = this.field_e.equals(param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
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
            stackOut_5_1 = new StringBuilder().append("bl.E(");
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
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_d = "(Escape)";
        field_c = new oi();
    }
}
