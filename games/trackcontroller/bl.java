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
          field_a = null;
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
        if (param1 != -4) {
          field_a = null;
          dh.a(((bl) this).field_e, 31536000L, param0, "jagex-last-login-method", param1 + 1004);
          return;
        } else {
          dh.a(((bl) this).field_e, 31536000L, param0, "jagex-last-login-method", param1 + 1004);
          return;
        }
    }

    final static void a(int param0, int param1, uf param2, be param3) {
        try {
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
            kj var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            Throwable decompiledCaughtException = null;
            var14 = TrackController.field_F ? 1 : 0;
            var18 = new kj();
            var18.field_n = param3.h(16383);
            var18.field_w = param3.e((byte) 113);
            var18.field_j = new ce[var18.field_n];
            var18.field_u = new int[var18.field_n];
            var18.field_i = new int[var18.field_n];
            var18.field_m = new int[var18.field_n];
            var18.field_v = new ce[var18.field_n];
            var18.field_p = new byte[var18.field_n][][];
            var5 = param0;
            L0: while (true) {
              if (var18.field_n <= var5) {
                si.field_a.a((byte) -121, (fc) (Object) var18);
                return;
              } else {
                try {
                  L1: {
                    L2: {
                      L3: {
                        var6_int = param3.h(param0 ^ 16383);
                        if (0 == var6_int) {
                          break L3;
                        } else {
                          if ((var6_int ^ -1) == -2) {
                            break L3;
                          } else {
                            if ((var6_int ^ -1) != -3) {
                              L4: {
                                if (3 == var6_int) {
                                  break L4;
                                } else {
                                  if (-5 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    var5++;
                                    break L2;
                                  }
                                }
                              }
                              var20 = param3.g(param0 + 0);
                              var8 = param3.g(0);
                              var9 = param3.h(16383);
                              var10 = new String[var9];
                              var11_int = 0;
                              L5: while (true) {
                                if (var9 <= var11_int) {
                                  L6: {
                                    var23 = new byte[var9][];
                                    var22 = var23;
                                    var21 = var22;
                                    var19 = var21;
                                    var11 = var19;
                                    if (-4 == (var6_int ^ -1)) {
                                      var12_int = 0;
                                      L7: while (true) {
                                        if (var9 <= var12_int) {
                                          break L6;
                                        } else {
                                          var13 = param3.e((byte) 113);
                                          var11[var12_int] = new byte[var13];
                                          param3.a(105, var23[var12_int], 0, var13);
                                          var12_int++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      break L6;
                                    }
                                  }
                                  var18.field_m[var5] = var6_int;
                                  var12 = new Class[var9];
                                  var17 = 0;
                                  var13 = var17;
                                  L8: while (true) {
                                    if (var9 <= var17) {
                                      var18.field_v[var5] = param2.a(var8, var12, 0, ve.a((byte) 11, var20));
                                      var18.field_p[var5] = var23;
                                      var5++;
                                      break L2;
                                    } else {
                                      var12[var17] = ve.a((byte) 11, var10[var17]);
                                      var17++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var10[var11_int] = param3.g(0);
                                  var11_int++;
                                  continue L5;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L9: {
                        var16 = param3.g(param0 + 0);
                        var7 = var16;
                        var15 = param3.g(param0 ^ 0);
                        var8 = var15;
                        var9 = 0;
                        if (var6_int == 1) {
                          var9 = param3.e((byte) 113);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var18.field_m[var5] = var6_int;
                      var18.field_u[var5] = var9;
                      var18.field_j[var5] = param2.a(ma.a(param0, -26462), var15, ve.a((byte) 11, var16));
                      var5++;
                      break L2;
                    }
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L10: {
                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    var18.field_i[var5] = -1;
                    var5++;
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var6_ref3 = (Exception) (Object) decompiledCaughtException;
                    var18.field_i[var5] = -4;
                    var5++;
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L14: {
                    var6_ref4 = decompiledCaughtException;
                    var18.field_i[var5] = -5;
                    var5++;
                    break L14;
                  }
                }
                continue L0;
              }
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
            int stackIn_16_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_37_0 = 0;
            int stackIn_39_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_38_0 = 0;
            int stackOut_36_0 = 0;
            if ((rj.field_d.field_e ^ -1) <= -5) {
              if (0 == (rj.field_d.field_b ^ -1)) {
                return 3;
              } else {
                if (1 != (rj.field_d.field_b ^ -1)) {
                  return 1;
                } else {
                  return 4;
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
                        stackOut_15_0 = ej.a(40, -1);
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
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
                      field_a = null;
                      break L3;
                    }
                  }
                  L4: {
                    if ((rf.field_c ^ -1) != -3) {
                      break L4;
                    } else {
                      ob.field_u = new bc((java.net.Socket) w.field_V.field_e, kb.field_d);
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
                          stackOut_33_0 = ej.a(116, -2);
                          stackIn_34_0 = stackOut_33_0;
                          return stackIn_34_0;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = ob.field_u.a(-85);
                        if (0 != var1_int) {
                          stackOut_28_0 = ej.a(39, var1_int);
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0;
                        } else {
                          rf.field_c = rf.field_c + 1;
                          break L5;
                        }
                      }
                    }
                  }
                  if (-5 != (rf.field_c ^ -1)) {
                    stackOut_38_0 = -1;
                    stackIn_39_0 = stackOut_38_0;
                    break L0;
                  } else {
                    rj.field_d.a((byte) 121, ai.field_b, (Object) (Object) ob.field_u);
                    ob.field_u = null;
                    w.field_V = null;
                    rf.field_c = 0;
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    return stackIn_37_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ej.a(91, -3);
              }
              return stackIn_39_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    bl(String param0) {
        ((bl) this).field_e = param0;
    }

    final boolean a(String param0, boolean param1) {
        if (param1) {
            return false;
        }
        return ((bl) this).field_e.equals((Object) (Object) param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "(Escape)";
        field_c = new oi();
    }
}
