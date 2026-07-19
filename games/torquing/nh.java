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
            pm var19_ref = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
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
            var15 = Torquing.field_u;
            try {
              L0: {
                var19_ref = new pm();
                var19_ref.field_l = param2.i((byte) -101);
                var19_ref.field_j = param2.c((byte) -121);
                var19_ref.field_t = new int[var19_ref.field_l];
                var19_ref.field_n = new rc[var19_ref.field_l];
                var19_ref.field_k = new int[var19_ref.field_l];
                var19_ref.field_u = new rc[var19_ref.field_l];
                var19_ref.field_q = new int[var19_ref.field_l];
                var19_ref.field_o = new byte[var19_ref.field_l][][];
                var6 = 31 / ((param3 - -71) / 33);
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var19_ref.field_l) {
                    ul.field_e.a((byte) 54, var19_ref);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param2.i((byte) -101);
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
                                        break L3;
                                      }
                                    }
                                  }
                                  var21 = param2.h((byte) 116);
                                  var9 = param2.h((byte) 115);
                                  var10 = param2.i((byte) -101);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var10 <= var12_int) {
                                      L7: {
                                        var22 = new byte[var10][];
                                        var20 = var22;
                                        var12 = var20;
                                        if (3 != var7_int) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var10 <= var13_int) {
                                              break L7;
                                            } else {
                                              var14 = param2.c((byte) -81);
                                              array$1 = new byte[var14];
                                              var12[var13_int] = array$1;
                                              param2.a(48, var14, var22[var13_int], 0);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var19_ref.field_q[var5] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          var19_ref.field_n[var5] = param0.a(var13, -30475, var9, ei.a((byte) -117, var21));
                                          var19_ref.field_o[var5] = var22;
                                          break L3;
                                        } else {
                                          var13[var18] = ei.a((byte) -112, var11[var18]);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param2.h((byte) 123);
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
                            var16 = param2.h((byte) 119);
                            var8 = var16;
                            var17 = param2.h((byte) 127);
                            var9 = var17;
                            var10 = 0;
                            if ((var7_int ^ -1) == -2) {
                              var10 = param2.c((byte) -73);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var19_ref.field_q[var5] = var7_int;
                          var19_ref.field_k[var5] = var10;
                          var19_ref.field_u[var5] = param0.a(ei.a((byte) -116, var16), true, var17);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19_ref.field_t[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19_ref.field_t[var5] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19_ref.field_t[var5] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19_ref.field_t[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var19_ref.field_t[var5] = -5;
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
                stackOut_34_0 = (RuntimeException) (var4);
                stackOut_34_1 = new StringBuilder().append("nh.C(");
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param0 == null) {
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
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param2 == null) {
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
              throw rb.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param3 + ')');
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
            fj var2 = (fj) null;
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
            field_l = (sm) null;
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
        this.field_n = false;
    }

    static {
        field_p = "Mouse over an icon for details";
        field_q = "Passwords can only contain letters and numbers";
        field_j = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_k = 0;
        field_o = "This password is part of your Player Name, and would be easy to guess";
    }
}
