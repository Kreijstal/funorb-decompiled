/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vq {
    static int field_a;

    final static void a(ob param0, qb param1, int param2, int param3) {
        try {
            byte[] array$0 = null;
            String dupTemp$1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            StringBuilder stackIn_42_1 = null;
            StringBuilder stackIn_43_1 = null;
            String stackIn_43_2 = null;
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
            eq var18 = null;
            byte[][] var19 = null;
            String var20 = null;
            byte[][] var21 = null;
            var14 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                var18 = new eq();
                var18.field_l = param0.j(param3 ^ 120);
                var18.field_j = param0.a(16711680);
                var18.field_h = new byte[var18.field_l][][];
                var18.field_n = new pb[var18.field_l];
                var18.field_q = new pb[var18.field_l];
                var18.field_p = new int[var18.field_l];
                var18.field_m = new int[var18.field_l];
                var18.field_r = new int[var18.field_l];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var18.field_l) {
                    if (param3 == -3) {
                      kc.field_b.a((byte) -113, var18);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var6_int = param0.j(param3 + -119);
                            if ((var6_int ^ -1) == -1) {
                              break L4;
                            } else {
                              if (1 == var6_int) {
                                break L4;
                              } else {
                                if (-3 == (var6_int ^ -1)) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (3 == var6_int) {
                                      break L5;
                                    } else {
                                      if (-5 == (var6_int ^ -1)) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param0.e(-1);
                                  var8 = param0.e(param3 ^ 2);
                                  var9 = param0.j(-91);
                                  var10 = new String[var9];
                                  var11_int = 0;
                                  L6: while (true) {
                                    if (var11_int >= var9) {
                                      L7: {
                                        var21 = new byte[var9][];
                                        var19 = var21;
                                        var11 = var19;
                                        if (-4 != (var6_int ^ -1)) {
                                          break L7;
                                        } else {
                                          var12_int = 0;
                                          L8: while (true) {
                                            if (var12_int >= var9) {
                                              break L7;
                                            } else {
                                              var13 = param0.a(16711680);
                                              array$0 = new byte[var13];
                                              var11[var12_int] = array$0;
                                              param0.a(var13, 0, 17469032, var21[var12_int]);
                                              var12_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var18.field_m[var5] = var6_int;
                                      var12 = new Class[var9];
                                      var17 = 0;
                                      var13 = var17;
                                      L9: while (true) {
                                        if (var17 >= var9) {
                                          var18.field_n[var5] = param1.a(var12, var8, param3 + 83, ge.a(-134, var20));
                                          var18.field_h[var5] = var21;
                                          break L3;
                                        } else {
                                          var12[var17] = ge.a(-134, var10[var17]);
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var10[var11_int] = param0.e(-1);
                                      var11_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L10: {
                            var15 = param0.e(-1);
                            dupTemp$1 = param0.e(-1);
                            var16 = dupTemp$1;
                            var8 = dupTemp$1;
                            var9 = 0;
                            if ((var6_int ^ -1) == -2) {
                              var9 = param0.a(param3 + 16711683);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var18.field_m[var5] = var6_int;
                          var18.field_r[var5] = var9;
                          var18.field_q[var5] = param1.a(ge.a(-134, var15), (byte) 77, var16);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var6_ref = (SecurityException) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var6_ref3 = (Exception) (Object) decompiledCaughtException;
                        var18.field_p[var5] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var6_ref4 = decompiledCaughtException;
                        var18.field_p[var5] = -5;
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
                stackIn_39_0 = (RuntimeException) (var4);

                stackIn_39_1 = new StringBuilder().append("vq.A(");

                if (param0 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L16;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_42_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

                if (param1 == null) {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "null";
                  break L17;
                } else {
                  stackIn_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
                  stackIn_43_2 = "{...}";
                  break L17;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_40_0), stackIn_43_2 + ',' + param2 + ',' + param3 + ')');
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

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        sl var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            if (!gb.a((byte) -109, var6)) {
              stackIn_3_0 = tm.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (jp.a(param1, (byte) -105)) {
                stackIn_7_0 = wb.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (-3 == (po.field_b ^ -1)) {
                  if (!ti.a(param1, true)) {
                    if (100 <= oi.field_e) {
                      stackIn_17_0 = mi.field_a;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (da.a(param0 + -30108, param1)) {
                        stackIn_21_0 = re.a(qq.field_N, 4371, new String[]{param1});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var5 = js.field_f;
                        var5.h(param2, param0 ^ 253);
                        var5.field_j = var5.field_j + 1;
                        var4 = var5.field_j;
                        var5.c(param0, (byte) -97);
                        var5.a(param1, (byte) 0);
                        var5.b(var5.field_j + -var4, (byte) 119);
                        stackIn_23_0 = null;
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_13_0 = re.a(or.field_c, 4371, new String[]{param1});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = tp.field_d;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("vq.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L1;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    return (String) ((Object) stackIn_23_0);
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
