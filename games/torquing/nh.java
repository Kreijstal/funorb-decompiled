/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends q {
    static sm field_l;
    static String field_q;
    static String field_p;
    boolean field_n;
    int field_m;
    static int field_k;
    static String[] field_j;
    static String field_o;
    int[] field_r;

    final static void a(vh param0, int param1, fj param2, byte param3) {
        try {
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
            pm var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            Throwable decompiledCaughtException = null;
            var15 = Torquing.field_u;
            var19 = new pm();
            var19.field_l = param2.i((byte) -101);
            var19.field_j = param2.c((byte) -121);
            var19.field_t = new int[var19.field_l];
            var19.field_n = new rc[var19.field_l];
            var19.field_k = new int[var19.field_l];
            var19.field_u = new rc[var19.field_l];
            var19.field_q = new int[var19.field_l];
            var19.field_o = new byte[var19.field_l][][];
            var6 = 31 / ((param3 - -71) / 33);
            var5 = 0;
            L0: while (true) {
              if (var5 >= var19.field_l) {
                ul.field_e.a((byte) 54, (q) (Object) var19);
                return;
              } else {
                try {
                  L1: {
                    L2: {
                      L3: {
                        var7_int = param2.i((byte) -101);
                        if (0 == var7_int) {
                          break L3;
                        } else {
                          if (1 == var7_int) {
                            break L3;
                          } else {
                            if (-3 != (var7_int ^ -1)) {
                              L4: {
                                if (3 == var7_int) {
                                  break L4;
                                } else {
                                  if ((var7_int ^ -1) == -5) {
                                    break L4;
                                  } else {
                                    var5++;
                                    break L2;
                                  }
                                }
                              }
                              var21 = param2.h((byte) 116);
                              var9 = param2.h((byte) 115);
                              var10 = param2.i((byte) -101);
                              var11 = new String[var10];
                              var12_int = 0;
                              L5: while (true) {
                                if (var10 <= var12_int) {
                                  L6: {
                                    var24 = new byte[var10][];
                                    var23 = var24;
                                    var22 = var23;
                                    var20 = var22;
                                    var12 = var20;
                                    if (3 != var7_int) {
                                      break L6;
                                    } else {
                                      var13_int = 0;
                                      L7: while (true) {
                                        if (var10 <= var13_int) {
                                          break L6;
                                        } else {
                                          var14 = param2.c((byte) -81);
                                          var12[var13_int] = new byte[var14];
                                          param2.a(48, var14, var24[var13_int], 0);
                                          var13_int++;
                                          continue L7;
                                        }
                                      }
                                    }
                                  }
                                  var19.field_q[var5] = var7_int;
                                  var13 = new Class[var10];
                                  var18 = 0;
                                  var14 = var18;
                                  L8: while (true) {
                                    if (var18 >= var10) {
                                      var19.field_n[var5] = param0.a(var13, -30475, var9, ei.a((byte) -117, var21));
                                      var19.field_o[var5] = var24;
                                      var5++;
                                      break L2;
                                    } else {
                                      var13[var18] = ei.a((byte) -112, var11[var18]);
                                      var18++;
                                      continue L8;
                                    }
                                  }
                                } else {
                                  var11[var12_int] = param2.h((byte) 123);
                                  var12_int++;
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
                        var16 = param2.h((byte) 119);
                        var8 = var16;
                        var17 = param2.h((byte) 127);
                        var9 = var17;
                        var10 = 0;
                        if ((var7_int ^ -1) == -2) {
                          var10 = param2.c((byte) -73);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var19.field_q[var5] = var7_int;
                      var19.field_k[var5] = var10;
                      var19.field_u[var5] = param0.a(ei.a((byte) -116, var16), true, var17);
                      var5++;
                      break L2;
                    }
                    break L1;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L10: {
                    var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    var19.field_t[var5] = -1;
                    var5++;
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var7_ref3 = (Exception) (Object) decompiledCaughtException;
                    var19.field_t[var5] = -4;
                    var5++;
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  L14: {
                    var7_ref4 = decompiledCaughtException;
                    var19.field_t[var5] = -5;
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

    public static void a(boolean param0) {
        field_o = null;
        field_l = null;
        field_q = null;
        field_p = null;
        field_j = null;
        if (param0) {
            Object var2 = null;
            nh.a((vh) null, -6, (fj) null, (byte) -36);
        }
    }

    final static boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 <= -90) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ki.field_D) {
              break L2;
            } else {
              if (!ki.field_D.c((byte) -19)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    nh() {
        ((nh) this).field_n = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Mouse over an icon for details";
        field_q = "Passwords can only contain letters and numbers";
        field_j = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_k = 0;
        field_o = "This password is part of your Player Name, and would be easy to guess";
    }
}
