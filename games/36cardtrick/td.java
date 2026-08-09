/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static le field_b;
    static String field_a;
    static kc[] field_c;

    final static void a(pb param0, byte param1, int param2, le param3) {
        try {
            byte[] array$0 = null;
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
            fd var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = Main.field_T;
            try {
              L0: {
                if (param1 < -101) {
                  var18 = new fd();
                  var18.field_o = param0.f(38);
                  var18.field_j = param0.e((byte) 126);
                  var18.field_l = new byte[var18.field_o][][];
                  var18.field_k = new int[var18.field_o];
                  var18.field_p = new vi[var18.field_o];
                  var18.field_i = new int[var18.field_o];
                  var18.field_m = new int[var18.field_o];
                  var18.field_r = new vi[var18.field_o];
                  var5 = 0;
                  L1: while (true) {
                    if (var18.field_o <= var5) {
                      vb.field_e.a(var18, 27362);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      try {
                        L2: {
                          L3: {
                            L4: {
                              var6_int = param0.f(-95);
                              if (var6_int == 0) {
                                break L4;
                              } else {
                                if (-2 == (var6_int ^ -1)) {
                                  break L4;
                                } else {
                                  if (2 != var6_int) {
                                    L5: {
                                      if (-4 == (var6_int ^ -1)) {
                                        break L5;
                                      } else {
                                        if (var6_int == 4) {
                                          break L5;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    var20 = param0.c(false);
                                    var21 = param0.c(false);
                                    var9 = param0.f(-101);
                                    var10 = new String[var9];
                                    var11_int = 0;
                                    L6: while (true) {
                                      if (var11_int >= var9) {
                                        L7: {
                                          var22 = new byte[var9][];
                                          var19 = var22;
                                          var11 = var19;
                                          if (-4 == (var6_int ^ -1)) {
                                            var12_int = 0;
                                            L8: while (true) {
                                              if (var12_int >= var9) {
                                                break L7;
                                              } else {
                                                var13 = param0.e((byte) 124);
                                                array$0 = new byte[var13];
                                                var11[var12_int] = array$0;
                                                param0.a(93, var22[var12_int], 0, var13);
                                                var12_int++;
                                                continue L8;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                        var18.field_k[var5] = var6_int;
                                        var12 = new Class[var9];
                                        var17 = 0;
                                        var13 = var17;
                                        L9: while (true) {
                                          if (var17 >= var9) {
                                            var18.field_r[var5] = param3.a((byte) 99, t.a(var20, -122), var21, var12);
                                            var18.field_l[var5] = var22;
                                            break L3;
                                          } else {
                                            var12[var17] = t.a(var10[var17], -56);
                                            var17++;
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
                              var16 = param0.c(false);
                              var8 = var16;
                              var9 = 0;
                              if ((var6_int ^ -1) != -2) {
                                break L10;
                              } else {
                                var9 = param0.e((byte) 125);
                                break L10;
                              }
                            }
                            var18.field_k[var5] = var6_int;
                            var18.field_m[var5] = var9;
                            var18.field_p[var5] = param3.a(t.a(var15, -107), var16, 115);
                            break L3;
                          }
                          break L2;
                        }
                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L11: {
                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                          var18.field_i[var5] = -1;
                          break L11;
                        }
                      } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L12: {
                          var6_ref = (SecurityException) (Object) decompiledCaughtException;
                          var18.field_i[var5] = -2;
                          break L12;
                        }
                      } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        L13: {
                          var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                          var18.field_i[var5] = -3;
                          break L13;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter3) {
                        decompiledCaughtException = decompiledCaughtParameter3;
                        L14: {
                          var6_ref3 = (Exception) (Object) decompiledCaughtException;
                          var18.field_i[var5] = -4;
                          break L14;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L15: {
                          var6_ref4 = decompiledCaughtException;
                          var18.field_i[var5] = -5;
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
                stackIn_38_0 = (RuntimeException) (var4);

                stackIn_38_1 = new StringBuilder().append("td.C(");

                if (param0 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "null";
                  break L16;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
                  stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
                  stackIn_39_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "null";
                  break L17;
                } else {
                  stackIn_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                  stackIn_42_2 = "{...}";
                  break L17;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_39_0), stackIn_42_2 + ')');
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

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(byte param0) {
        field_b = null;
        int var1 = 96 % ((-46 - param0) / 61);
        field_a = null;
        field_c = null;
    }

    final static String a(int param0) {
        if (jc.field_P == hh.field_g) {
            return ri.field_b;
        }
        if (param0 != -2) {
            return (String) null;
        }
        return ja.field_a;
    }

    final static void a(byte param0) {
        if (param0 != -11) {
            td.a(64);
        }
        gh.a(4, 31888);
    }

    static {
        field_a = "Sound: ";
        field_c = new kc[6];
    }
}
