/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class re {
    static int field_a;
    static int field_f;
    static boolean field_b;
    static String field_d;
    static boolean field_c;
    static String[] field_e;

    public static void a(int param0) {
        if (param0 != -17053) {
            return;
        }
        field_d = null;
        field_e = null;
    }

    final static String a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            String stackIn_8_0 = null;
            Object stackIn_12_0 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = (String) (mo.a((byte) 126, "getcookies", param2));
                      var4 = jc.a(param0 ^ -9075, var3, ';');
                      if (param0 == -21721) {
                        break L2;
                      } else {
                        re.a(38);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length > var5) {
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param1)) {
                              break L4;
                            } else {
                              stackIn_8_0 = var4[var5].substring(var6 + 1).trim();
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      } else {
                        return null;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = decompiledCaughtException;
                  stackIn_12_0 = null;
                  return (String) ((Object) stackIn_12_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var3_ref2);

                stackIn_15_1 = new StringBuilder().append("re.G(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

                if (param2 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L6;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
            return stackIn_8_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        if (!(null == sm.field_C)) {
            sm.field_C.a((byte) -79, param1);
        }
        if (param0 >= -81) {
            String var3 = (String) null;
            re.a(false, (String) null, -73);
        }
    }

    final static void a(byte param0) {
        int stackIn_16_0;
        int stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_16_4;
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_17_5;
        int stackIn_23_0;
        int stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_24_0;
        int stackIn_24_1;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_30_0;
        int stackIn_30_1;
        int stackIn_30_2;
        int stackIn_30_3;
        int stackIn_30_4;
        int stackIn_31_0;
        int stackIn_31_1;
        int stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_31_5;
        int stackIn_37_0;
        int stackIn_37_1;
        int stackIn_37_2;
        int stackIn_37_3;
        int stackIn_37_4;
        int stackIn_38_0;
        int stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        int stackIn_38_4;
        int stackIn_38_5;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        ij var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == 121) {
                break L1;
              } else {
                var4 = (String) null;
                re.a(true, (String) null, 27);
                break L1;
              }
            }
            L2: {
              L3: {
                if (nd.field_i.c(0)) {
                  break L3;
                } else {
                  if ((kg.field_m ^ -1) > -1) {
                    break L3;
                  } else {
                    L4: {
                      var5 = (ij) ((Object) nd.field_i.c((byte) 108));
                      if (var5.field_E == 0) {
                        if ((var5.field_w ^ -1) != -257) {
                          var5.field_K.a(-(var5.field_K.field_z / 2) + var5.field_J, var5.field_C - var5.field_K.field_A / 2, var5.field_w);
                          break L4;
                        } else {
                          var5.field_K.c(var5.field_J - var5.field_K.field_z / 2, -(var5.field_K.field_A / 2) + var5.field_C);
                          break L4;
                        }
                      } else {
                        var2 = var5.field_E * var5.field_K.field_z >> -724862708;
                        var3 = var5.field_E * var5.field_K.field_A >> -968552820;
                        var5.field_K.b(var5.field_J + -(var2 >> 1460186721), -(var3 >> -1199511967) + var5.field_C, var2, var3, var5.field_w);
                        break L4;
                      }
                    }
                    if (-1L != (pd.field_i ^ -1L)) {
                      var2 = 0;
                      L5: while (true) {
                        L6: {
                          if (10 <= var2) {
                            break L6;
                          } else {
                            if (var2 >= ok.field_pb.length) {
                              break L6;
                            } else {
                              L7: {
                                stackIn_16_0 = 160 - -(32 * var2);

                                stackIn_16_1 = 60;

                                stackIn_16_2 = 30;

                                stackIn_16_3 = 9;

                                stackIn_16_4 = 4;

                                if (0L != ((long)(1 << var2) & pd.field_i)) {
                                  stackIn_17_0 = stackIn_16_0;
                                  stackIn_17_1 = stackIn_16_1;
                                  stackIn_17_2 = stackIn_16_2;
                                  stackIn_17_3 = stackIn_16_3;
                                  stackIn_17_4 = stackIn_16_4;
                                  stackIn_17_5 = 3407667;
                                  break L7;
                                } else {
                                  stackIn_17_0 = stackIn_16_0;
                                  stackIn_17_1 = stackIn_16_1;
                                  stackIn_17_2 = stackIn_16_2;
                                  stackIn_17_3 = stackIn_16_3;
                                  stackIn_17_4 = stackIn_16_4;
                                  stackIn_17_5 = 3355443;
                                  break L7;
                                }
                              }
                              qh.a(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5, var5.field_w / 2 + 128);
                              var2++;
                              continue L5;
                            }
                          }
                        }
                        var2 = 10;
                        L8: while (true) {
                          L9: {
                            if (-21 >= (var2 ^ -1)) {
                              break L9;
                            } else {
                              if (var2 >= ok.field_pb.length) {
                                break L9;
                              } else {
                                L10: {
                                  stackIn_23_0 = -320 + 32 * var2 + 160;

                                  stackIn_23_1 = 70;

                                  stackIn_23_2 = 30;

                                  stackIn_23_3 = 9;

                                  stackIn_23_4 = 4;

                                  if ((pd.field_i & (long)(1 << var2)) == 0L) {
                                    stackIn_24_0 = stackIn_23_0;
                                    stackIn_24_1 = stackIn_23_1;
                                    stackIn_24_2 = stackIn_23_2;
                                    stackIn_24_3 = stackIn_23_3;
                                    stackIn_24_4 = stackIn_23_4;
                                    stackIn_24_5 = 3355443;
                                    break L10;
                                  } else {
                                    stackIn_24_0 = stackIn_23_0;
                                    stackIn_24_1 = stackIn_23_1;
                                    stackIn_24_2 = stackIn_23_2;
                                    stackIn_24_3 = stackIn_23_3;
                                    stackIn_24_4 = stackIn_23_4;
                                    stackIn_24_5 = 3407667;
                                    break L10;
                                  }
                                }
                                qh.a(stackIn_24_0, stackIn_24_1, stackIn_24_2, stackIn_24_3, stackIn_24_4, stackIn_24_5, var5.field_w / 2 + 128);
                                var2++;
                                continue L8;
                              }
                            }
                          }
                          var2 = 20;
                          L11: while (true) {
                            L12: {
                              if (var2 >= 30) {
                                break L12;
                              } else {
                                if (var2 >= ok.field_pb.length) {
                                  break L12;
                                } else {
                                  L13: {
                                    stackIn_30_0 = 32 * var2 + -640 + 160;

                                    stackIn_30_1 = 80;

                                    stackIn_30_2 = 30;

                                    stackIn_30_3 = 9;

                                    stackIn_30_4 = 4;

                                    if (((long)(1 << var2) & pd.field_i) != 0L) {
                                      stackIn_31_0 = stackIn_30_0;
                                      stackIn_31_1 = stackIn_30_1;
                                      stackIn_31_2 = stackIn_30_2;
                                      stackIn_31_3 = stackIn_30_3;
                                      stackIn_31_4 = stackIn_30_4;
                                      stackIn_31_5 = 3407667;
                                      break L13;
                                    } else {
                                      stackIn_31_0 = stackIn_30_0;
                                      stackIn_31_1 = stackIn_30_1;
                                      stackIn_31_2 = stackIn_30_2;
                                      stackIn_31_3 = stackIn_30_3;
                                      stackIn_31_4 = stackIn_30_4;
                                      stackIn_31_5 = 3355443;
                                      break L13;
                                    }
                                  }
                                  qh.a(stackIn_31_0, stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, var5.field_w / 2 + 128);
                                  var2++;
                                  continue L11;
                                }
                              }
                            }
                            var2 = 30;
                            L14: while (true) {
                              if (var2 >= 40) {
                                break L3;
                              } else {
                                if (ok.field_pb.length <= var2) {
                                  break L3;
                                } else {
                                  L15: {
                                    stackIn_37_0 = (-30 + var2) * 32 + 160;

                                    stackIn_37_1 = 90;

                                    stackIn_37_2 = 30;

                                    stackIn_37_3 = 9;

                                    stackIn_37_4 = 4;

                                    if ((pd.field_i & (long)(1 << var2)) == 0L) {
                                      stackIn_38_0 = stackIn_37_0;
                                      stackIn_38_1 = stackIn_37_1;
                                      stackIn_38_2 = stackIn_37_2;
                                      stackIn_38_3 = stackIn_37_3;
                                      stackIn_38_4 = stackIn_37_4;
                                      stackIn_38_5 = 3355443;
                                      break L15;
                                    } else {
                                      stackIn_38_0 = stackIn_37_0;
                                      stackIn_38_1 = stackIn_37_1;
                                      stackIn_38_2 = stackIn_37_2;
                                      stackIn_38_3 = stackIn_37_3;
                                      stackIn_38_4 = stackIn_37_4;
                                      stackIn_38_5 = 3407667;
                                      break L15;
                                    }
                                  }
                                  qh.a(stackIn_38_0, stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, var5.field_w / 2 + 128);
                                  var2++;
                                  continue L14;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "re.E(" + param0 + ')');
        }
    }

    abstract tf b(byte param0);

    abstract void a(byte param0, ge param1);

    final static void a(boolean param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  wo.field_c = false;
                  ep.field_z = false;
                  if (null == d.field_d) {
                    break L2;
                  } else {
                    if (!d.field_d.field_R) {
                      break L2;
                    } else {
                      L3: {
                        if (8 != param2) {
                          break L3;
                        } else {
                          L4: {
                            if (ro.field_e) {
                              param1 = ng.field_v;
                              break L4;
                            } else {
                              param1 = eh.field_n;
                              break L4;
                            }
                          }
                          param2 = 2;
                          vj.field_j.a(8, qo.field_x);
                          break L3;
                        }
                      }
                      L5: {
                        var3_int = 1;
                        if (param2 == 10) {
                          ta.a(-984040272);
                          var3_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (var3_int != 0) {
                          L7: {
                            if (!wo.field_c) {
                              break L7;
                            } else {
                              param1 = nr.a(new String[]{param1}, -1, lq.field_U);
                              break L7;
                            }
                          }
                          L8: {
                            if (to.field_q) {
                              param1 = ir.field_i;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          d.field_d.a(param1, param2, -257);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if ((param2 ^ -1) == -257) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) == -11) {
                          break L2;
                        } else {
                          if (!ro.field_e) {
                            vj.field_j.g((byte) -108);
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("re.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_a = 576;
        field_b = false;
        field_c = false;
    }
}
