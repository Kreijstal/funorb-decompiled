/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static wd field_e;
    static pa field_i;
    static String field_f;
    static int field_g;
    private wt field_b;
    static vd[] field_a;
    private er field_d;
    private int field_c;
    private ph field_h;

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              rs.field_x = param0;
              oi.a(12, 20665);
              if (!param1) {
                break L1;
              } else {
                field_g = 25;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qk.E(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static ll[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        ll[] var10 = null;
        ll[] var11_ref_ll__ = null;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        ll[] stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_49_0 = 0;
        ll[] stackOut_62_0 = null;
        var15 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var9_int = param4 + (param1 + param5);
            var10 = new ll[]{new ll(var9_int, var9_int), new ll(param0, var9_int), new ll(var9_int, var9_int), new ll(var9_int, param0), new ll(64, 64), new ll(var9_int, param0), new ll(var9_int, var9_int), new ll(param0, var9_int), new ll(var9_int, var9_int)};
            var11_ref_ll__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var12 >= var11_ref_ll__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_ll__[var12];
                    stackOut_3_0 = 0;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      var14 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (~var14 <= ~var13.field_x.length) {
                              break L6;
                            } else {
                              var13.field_x[var14] = param8;
                              var14++;
                              if (var15 != 0) {
                                break L5;
                              } else {
                                if (var15 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var12++;
                          break L5;
                        }
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              var11 = stackIn_13_0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (var11 >= param4) {
                      break L9;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_25_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (var15 != 0) {
                        break L8;
                      } else {
                        var12 = stackIn_16_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (~var12 <= ~var9_int) {
                                break L12;
                              } else {
                                var10[6].field_x[var9_int * (-var11 + (var9_int + -1)) + var12] = param2;
                                var10[8].field_x[(-var11 + (var9_int - 1)) * var9_int + var12] = param2;
                                var10[2].field_x[-var11 - -var9_int + (-1 + var12 * var9_int)] = param2;
                                var10[8].field_x[-var11 - (-var9_int + 1) + var12 * var9_int] = param2;
                                var12++;
                                if (var15 != 0) {
                                  break L11;
                                } else {
                                  if (var15 == 0) {
                                    continue L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L11;
                          }
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L8;
                }
                var11 = stackIn_25_0;
                L13: while (true) {
                  stackOut_26_0 = var11;
                  stackOut_26_1 = param4;
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_27_0 >= stackIn_27_1) {
                          break L16;
                        } else {
                          stackOut_28_0 = 0;
                          stackIn_38_0 = stackOut_28_0;
                          stackIn_29_0 = stackOut_28_0;
                          if (var15 != 0) {
                            break L15;
                          } else {
                            var12 = stackIn_29_0;
                            L17: while (true) {
                              L18: {
                                if (~var9_int >= ~var12) {
                                  break L18;
                                } else {
                                  var10[0].field_x[var11 * var9_int + var12] = param3;
                                  var10[0].field_x[var11 + var12 * var9_int] = param3;
                                  stackOut_31_0 = ~(var9_int + -var11);
                                  stackOut_31_1 = ~var12;
                                  stackIn_27_0 = stackOut_31_0;
                                  stackIn_27_1 = stackOut_31_1;
                                  stackIn_32_0 = stackOut_31_0;
                                  stackIn_32_1 = stackOut_31_1;
                                  if (var15 != 0) {
                                    continue L14;
                                  } else {
                                    L19: {
                                      if (stackIn_32_0 < stackIn_32_1) {
                                        var10[2].field_x[var11 * var9_int + var12] = param3;
                                        var10[6].field_x[var11 + var9_int * var12] = param3;
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      break L15;
                    }
                    var11 = stackIn_38_0;
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (~param0 >= ~var11) {
                            break L22;
                          } else {
                            stackOut_40_0 = 0;
                            stackIn_50_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var15 != 0) {
                              break L21;
                            } else {
                              var12 = stackIn_41_0;
                              L23: while (true) {
                                L24: {
                                  L25: {
                                    if (~param4 >= ~var12) {
                                      break L25;
                                    } else {
                                      var10[7].field_x[(-1 + -var12 + var9_int) * param0 + var11] = param2;
                                      var10[5].field_x[-var12 - (-var9_int + 1 - var11 * var9_int)] = param2;
                                      var10[1].field_x[var12 * param0 - -var11] = param3;
                                      var10[3].field_x[var9_int * var11 + var12] = param3;
                                      var12++;
                                      if (var15 != 0) {
                                        break L24;
                                      } else {
                                        if (var15 == 0) {
                                          continue L23;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L24;
                                }
                                if (var15 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        var11 = 0;
                        stackOut_49_0 = param7;
                        stackIn_50_0 = stackOut_49_0;
                        break L21;
                      }
                      L26: {
                        if (stackIn_50_0 <= -89) {
                          break L26;
                        } else {
                          ll[] discarded$1 = qk.a(-50, 101, 116, 1, 33, 12, 71, 24, -27);
                          break L26;
                        }
                      }
                      L27: while (true) {
                        L28: {
                          if (~(param0 >> -1258547807) >= ~var11) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (param5 <= var12) {
                                    break L31;
                                  } else {
                                    var10[1].field_x[var11 + (-1 + (-var12 + var9_int)) * param0] = param6;
                                    var10[3].field_x[var9_int * var11 + -1 + (var9_int - var12)] = param6;
                                    var10[7].field_x[var12 * param0 - -var11] = param6;
                                    var10[5].field_x[var9_int * var11 + var12] = param6;
                                    var12++;
                                    if (var15 != 0) {
                                      break L30;
                                    } else {
                                      if (var15 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var11++;
                                break L30;
                              }
                              if (var15 == 0) {
                                continue L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        stackOut_62_0 = (ll[]) var10;
                        stackIn_63_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var9, "qk.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_63_0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_e = null;
            field_f = null;
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "qk.C(" + param0 + ')');
        }
    }

    final void a(wt param0, int param1, long param2) {
        wt var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((qk) this).field_c == 0) {
                  break L2;
                } else {
                  ((qk) this).field_c = ((qk) this).field_c - 1;
                  if (!AceOfSkies.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = ((qk) this).field_d.b(param1 + -18522);
              var5.c(-126);
              var5.d(-119);
              if (((qk) this).field_b != var5) {
                break L1;
              } else {
                var5 = ((qk) this).field_d.b(param1 + -18522);
                var5.c(-128);
                var5.d(param1 + -125);
                break L1;
              }
            }
            ((qk) this).field_h.a(125, param2, (wf) (Object) param0);
            ((qk) this).field_d.a(param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("qk.A(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        wo var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1 = (wo) (Object) pu.field_b.b(param0 + 4187);
              if (null != var1) {
                break L1;
              } else {
                var1 = new wo();
                break L1;
              }
            }
            L2: {
              var1.a(vp.field_i, 251, vp.field_c, vp.field_f, vp.field_b, vp.field_d, vp.field_j, vp.field_k);
              bo.field_i.a(104, (wf) (Object) var1);
              if (param0 == -92) {
                break L2;
              } else {
                field_e = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "qk.D(" + param0 + ')');
        }
    }

    final wt a(byte param0, long param1) {
        wt var4 = null;
        RuntimeException var4_ref = null;
        wt stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        wt stackOut_7_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -27) {
                break L1;
              } else {
                field_g = 50;
                break L1;
              }
            }
            L2: {
              var4 = (wt) (Object) ((qk) this).field_h.a((byte) 106, param1);
              if (null != var4) {
                ((qk) this).field_d.a(2, var4);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_7_0 = (wt) var4;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var4_ref, "qk.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    qk(int param0) {
        int var2_int = 0;
        ((qk) this).field_b = new wt();
        ((qk) this).field_d = new er();
        try {
            ((qk) this).field_c = param0;
            var2_int = 1;
            while (~param0 < ~(var2_int + var2_int)) {
                var2_int = var2_int + var2_int;
            }
            ((qk) this).field_h = new ph(var2_int);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "qk.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You have 1 unread message!";
    }
}
