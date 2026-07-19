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
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_17_0 = 0;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var7 = HoldTheLine.field_D;
            try {
              L0: {
                if (kd.field_d) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
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
                                stackOut_9_0 = 1;
                                stackIn_10_0 = stackOut_9_0;
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
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L6;
                      } else {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
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
                stackOut_20_0 = (RuntimeException) (var2_ref);
                stackOut_20_1 = new StringBuilder().append("ao.D(");
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param0 == null) {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "null";
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  break L7;
                } else {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "{...}";
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
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
        wd discarded$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
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
        ei stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
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
                            discarded$1 = ao.a(0.2928012013435364f, false, (wd) null, -0.7333778142929077f);
                            break L6;
                          }
                        }
                        L7: while (true) {
                          if (var4_int >= var7.field_e + -1) {
                            var4_int = 0;
                            L8: while (true) {
                              if (var13.field_e <= var4_int) {
                                stackOut_39_0 = (ei) (var13);
                                stackIn_40_0 = stackOut_39_0;
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
            stackOut_41_0 = (RuntimeException) (var4);
            stackOut_41_1 = new StringBuilder().append("ao.C(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          L12: {
            stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
            stackOut_44_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_44_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        return stackIn_40_0;
    }

    final static wd a(float param0, boolean param1, wd param2, float param3) {
        wd discarded$2 = null;
        RuntimeException var4 = null;
        wd var5 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        wd stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = (wd) null;
                discarded$2 = ao.a(1.1313912868499756f, true, (wd) null, -1.3016173839569092f);
                break L1;
              }
            }
            stackOut_2_0 = wc.a(param2, param0, param3, (byte) -115);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("ao.A(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
