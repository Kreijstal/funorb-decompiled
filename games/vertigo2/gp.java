/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gp extends li {
    gp field_p;
    long field_n;
    gp field_o;
    static r field_s;
    static String field_r;
    static String field_q;

    public static void g(int param0) {
        field_s = null;
        int var1 = 11 % ((param0 - -49) / 44);
        field_r = null;
        field_q = null;
    }

    final long f(int param0) {
        int var2 = 51 / ((56 - param0) / 35);
        return this.field_n;
    }

    final void a(int param0) {
        if (param0 >= -96) {
            return;
        }
        if (this.field_o == null) {
            return;
        }
        this.field_o.field_p = this.field_p;
        this.field_p.field_o = this.field_o;
        this.field_o = null;
        this.field_p = null;
    }

    final void a(int param0, long param1) {
        if (!(null == this.field_o)) {
            throw new RuntimeException();
        }
        this.field_n = param1;
        if (param0 != -1) {
            field_s = (r) null;
        }
    }

    protected gp() {
    }

    final boolean e(int param0) {
        if (!(null != this.field_o)) {
            return false;
        }
        if (param0 >= -12) {
            return true;
        }
        return true;
    }

    final static void a(jj param0, int param1, ed param2, int param3) {
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
            oc var18_ref = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
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
            var14 = Vertigo2.field_L ? 1 : 0;
            try {
              L0: {
                var18_ref = new oc();
                var18_ref.field_n = param2.h(-11);
                var18_ref.field_p = param2.b(true);
                if (param1 < -71) {
                  var18_ref.field_q = new byte[var18_ref.field_n][][];
                  var18_ref.field_t = new wk[var18_ref.field_n];
                  var18_ref.field_o = new int[var18_ref.field_n];
                  var18_ref.field_w = new wk[var18_ref.field_n];
                  var18_ref.field_y = new int[var18_ref.field_n];
                  var18_ref.field_u = new int[var18_ref.field_n];
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var18_ref.field_n) {
                      mg.field_N.a(var18_ref, false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              var6_int = param2.h(-11);
                              if (-1 == (var6_int ^ -1)) {
                                break L4;
                              } else {
                                if (1 == var6_int) {
                                  break L4;
                                } else {
                                  if (-3 == (var6_int ^ -1)) {
                                    break L4;
                                  } else {
                                    L5: {
                                      if (var6_int == 3) {
                                        break L5;
                                      } else {
                                        if (var6_int == 4) {
                                          break L5;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    var20 = param2.f(128);
                                    var21 = param2.f(128);
                                    var9 = param2.h(-11);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var11_int >= var9) {
                                        L7: {
                                          var22 = new byte[var9][];
                                          var19 = var22;
                                          var11 = var19;
                                          if (3 == var6_int) {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var12_int >= var9) {
                                                break L7;
                                              } else {
                                                var13 = param2.b(true);
                                                array$1 = new byte[var13];
                                                var11[var12_int] = array$1;
                                                param2.a(0, var22[var12_int], var13, 105);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        var18_ref.field_o[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var9 <= var17) {
                                            var18_ref.field_w[var5] = param0.a(var12, 38, eh.a(-1147375319, var20), var21);
                                            var18_ref.field_q[var5] = var22;
                                            break L3;
                                          } else {
                                            var12[var17] = eh.a(-1147375319, var10[var17]);
                                            var17++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        var10[var11_int] = param2.f(128);
                                        var11_int++;
                                        continue L6;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L10: {
                              var15 = param2.f(128);
                              var16 = param2.f(128);
                              var9 = 0;
                              if (var6_int == 1) {
                                var9 = param2.b(true);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var18_ref.field_o[var5] = var6_int;
                            var18_ref.field_u[var5] = var9;
                            var18_ref.field_t[var5] = param0.a(-67, eh.a(-1147375319, var15), var16);
                            break L3;
                          }
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var18_ref.field_y[var5] = -1;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var18_ref.field_y[var5] = -2;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var18_ref.field_y[var5] = -3;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var18_ref.field_y[var5] = -4;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var18_ref.field_y[var5] = -5;
                          break L15;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_36_0 = (RuntimeException) (var4);
                stackOut_36_1 = new StringBuilder().append("gp.GA(");
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
                stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',');
                stackIn_41_0 = stackOut_39_0;
                stackIn_41_1 = stackOut_39_1;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                if (param2 == null) {
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
              throw wn.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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

    static {
        field_r = "Enter name of player to add to list";
        field_q = "<%0>% of the map was <%1>";
    }
}
