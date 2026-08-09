/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao {
    static int[] field_d;
    static int field_a;
    static ud field_c;
    static fg field_f;
    static String field_e;
    static int field_b;

    final static boolean a(java.applet.Applet param0, boolean param1) {
        try {
            String var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref2 = null;
            var7 = HoldTheLine.field_D;
            try {
              L0: {
                if (kd.field_d) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (eo.a(21896, "getcookies", param0));
                      var4 = fl.a(var3, (byte) -125, ';');
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          L3: {
                            if (!param1) {
                              break L3;
                            } else {
                              ao.a(-7);
                              break L3;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackIn_10_0 = 1;
                                decompiledRegionSelector0 = 0;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 1;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  } else {
                    L6: {
                      if (null == param0.getParameter("tuhstatbut")) {
                        stackIn_19_0 = 0;
                        break L6;
                      } else {
                        stackIn_19_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref);

                stackIn_22_1 = new StringBuilder().append("ao.D(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_10_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_c = null;
        if (param0 != 0) {
            field_d = (int[]) null;
        }
        field_d = null;
    }

    final static ei a(ei param0, byte param1, boolean param2, ei param3) {
        ei stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_46_1 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ei var5 = null;
        ei var6 = null;
        ei var7 = null;
        ei var8 = null;
        int var11 = 0;
        wd var12 = null;
        ei var13 = null;
        ei var14 = null;
        ha var15 = null;
        ei var16 = null;
        Object var17 = null;
        ha var17_ref = null;
        ei var18 = null;
        var17 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            var5 = new ei();
            var6 = new ei();
            var7 = new ei();
            ul.a(param3, true, var7, 0, param3, var6);
            ul.a(param3, true, var7, 1, param0, var6);
            ul.a(param0, true, var7, 2, param0, var6);
            var6.a(false);
            var7.a(false);
            var4_int = 0;
            L1: while (true) {
              if (var6.field_e <= var4_int) {
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= var7.field_e) {
                    L3: {
                      var13 = new ei();
                      kj.field_r = false;
                      var8 = bb.a(0, param0, 0.0f, param3, true, (byte) -59, var7, var6);
                      if (-2 < (var8.field_e ^ -1)) {
                        break L3;
                      } else {
                        if (!qh.a((byte) -63, var8)) {
                          break L3;
                        } else {
                          var13.a(var8, (byte) 6);
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (!kj.field_r) {
                        var14 = bb.a(var6.field_e + -1, param0, (float)param3.field_e, param3, false, (byte) -46, var7, var6);
                        if (1 > var14.field_e) {
                          break L4;
                        } else {
                          if (!qh.a((byte) -63, var8)) {
                            break L4;
                          } else {
                            var13.a(var14, (byte) 6);
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var4_int = -1 + var6.field_e;
                    L5: while (true) {
                      if (var4_int < 0) {
                        L6: {
                          var4_int = 0;
                          if (param1 == 21) {
                            break L6;
                          } else {
                            var12 = (wd) null;
                            ao.a(0.2928012013435364f, false, (wd) null, -0.7333778142929077f);
                            break L6;
                          }
                        }
                        L7: while (true) {
                          if (var4_int >= var7.field_e + -1) {
                            var4_int = 0;
                            L8: while (true) {
                              if (var13.field_e <= var4_int) {
                                stackIn_40_0 = (ei) (var13);
                                break L0;
                              } else {
                                var13.field_b[var4_int] = mk.a((ei) (var13.field_b[var4_int]), (byte) -127);
                                if (((ei) (var13.field_b[var4_int])).field_e != 0) {
                                  var4_int++;
                                  continue L8;
                                } else {
                                  var13.a(true, var4_int);
                                  continue L8;
                                }
                              }
                            }
                          } else {
                            L9: {
                              var17_ref = (ha) (var7.field_b[var4_int]);
                              if (!var17_ref.field_l) {
                                var17_ref.field_l = true;
                                var17_ref.field_s.field_l = true;
                                var18 = bb.a((var4_int + 1) % var7.field_e, param0, var17_ref.field_m, param3, true, (byte) -94, var7, var6);
                                if (1 > var18.field_e) {
                                  break L9;
                                } else {
                                  if (!qh.a((byte) -63, var18)) {
                                    break L9;
                                  } else {
                                    var13.a(var18, (byte) 6);
                                    break L9;
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            var4_int++;
                            continue L7;
                          }
                        }
                      } else {
                        var15 = (ha) (var6.field_b[var4_int]);
                        if (!var15.field_l) {
                          var15.field_l = true;
                          var15.field_s.field_l = true;
                          var16 = bb.a((-1 + (var4_int - -var6.field_e)) % var6.field_e, param0, var15.field_m, param3, false, (byte) -81, var7, var6);
                          if (var16.field_e >= 1) {
                            L10: {
                              if (qh.a((byte) -63, var16)) {
                                var13.a(var16, (byte) 6);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var4_int--;
                            continue L5;
                          } else {
                            var4_int--;
                            continue L5;
                          }
                        } else {
                          var4_int--;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ((ha) (var7.field_b[var4_int])).field_q = var4_int;
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                ((ha) (var6.field_b[var4_int])).field_q = var4_int;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var4);

            stackIn_43_1 = new StringBuilder().append("ao.C(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L11;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_46_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L12;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_44_0), stackIn_47_2 + ')');
        }
        return stackIn_40_0;
    }

    final static wd a(float param0, boolean param1, wd param2, float param3) {
        RuntimeException var4 = null;
        wd var5 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (wd) null;
                ao.a(1.1313912868499756f, true, (wd) null, -1.3016173839569092f);
                break L1;
              }
            }
            stackIn_3_0 = wc.a(param2, param0, param3, (byte) -115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ao.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = fc.a(-6, 5, 4);
        field_e = "Names should contain a maximum of 12 characters";
    }
}
