/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    private boolean field_g;
    private int field_b;
    int field_f;
    static java.awt.Canvas field_j;
    int field_i;
    private int field_c;
    private int field_a;
    static boolean field_h;
    private int field_d;
    static String field_e;

    final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (~((qd) this).field_i < ~param0) {
              if (~((qd) this).field_i < ~param1) {
                L1: {
                  ((qd) this).field_b = 0;
                  ((qd) this).field_c = 0;
                  if (0 == gh.field_c) {
                    break L1;
                  } else {
                    ((qd) this).field_g = true;
                    ((qd) this).field_d = gh.field_c;
                    ((qd) this).field_f = param1;
                    ((qd) this).field_a = bf.field_b;
                    ((qd) this).field_c = gh.field_c;
                    break L1;
                  }
                }
                L2: {
                  if (((qd) this).field_d == 0) {
                    break L2;
                  } else {
                    if (fb.field_n != 0) {
                      L3: {
                        if (((qd) this).field_a <= 0) {
                          ((qd) this).field_a = rc.field_m;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((qd) this).field_a = ((qd) this).field_a - 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (0 != gh.field_c) {
                    break L4;
                  } else {
                    if (fb.field_n != 0) {
                      break L4;
                    } else {
                      ((qd) this).field_d = 0;
                      break L4;
                    }
                  }
                }
                L5: {
                  if (~((qd) this).field_d != param2) {
                    break L5;
                  } else {
                    L6: {
                      if (((qd) this).field_g) {
                        break L6;
                      } else {
                        if (qc.field_a) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      if (param0 >= 0) {
                        break L7;
                      } else {
                        if (!((qd) this).field_g) {
                          break L5;
                        } else {
                          ((qd) this).field_f = -1;
                          if (stellarshard.field_B == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    L8: {
                      if (~param0 != ~((qd) this).field_f) {
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    ((qd) this).field_g = true;
                    ((qd) this).field_f = param0;
                    break L5;
                  }
                }
                break L0;
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var4, "qd.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                    param0.getAppletContext().showDocument(lk.a(param0, var2, 114), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 == -30) {
                    break L3;
                  } else {
                    qd.a((java.applet.Applet) null, (byte) 50);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var2_ref2;
                stackOut_7_1 = new StringBuilder().append("qd.C(");
                stackIn_10_0 = stackOut_7_0;
                stackIn_10_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = stackOut_8_1;
                  stackIn_11_2 = stackOut_8_2;
                  break L4;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        try {
            field_e = null;
            field_j = null;
            int var1_int = 114 / ((param0 - -85) / 39);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "qd.H(" + param0 + ')');
        }
    }

    final static pb a(pf param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        pb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(param2, (byte) -118);
              if (param3 >= 41) {
                break L1;
              } else {
                qd.a((java.applet.Applet) null, (byte) -109);
                break L1;
              }
            }
            var5 = param0.a(var4_int, param1, (byte) -11);
            stackOut_3_0 = vc.a(param0, var5, var4_int, -2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("qd.A(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, boolean param2, boolean param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((qd) this).field_d = 0;
            ((qd) this).field_g = param2;
            if (!param3) {
              L1: {
                L2: {
                  if (((qd) this).field_g) {
                    break L2;
                  } else {
                    ((qd) this).field_f = param1;
                    if (stellarshard.field_B == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((qd) this).field_f = param0;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5, "qd.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((qd) this).field_c = 0;
              ((qd) this).field_b = param0;
              if (((qd) this).field_d != 0) {
                break L1;
              } else {
                if (gi.field_f == 98) {
                  L2: {
                    if (((qd) this).field_f > 0) {
                      break L2;
                    } else {
                      ((qd) this).field_f = ((qd) this).field_i;
                      break L2;
                    }
                  }
                  ((qd) this).field_f = ((qd) this).field_f - 1;
                  ((qd) this).field_g = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (((qd) this).field_d == 0) {
                ((qd) this).field_b = gi.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (((qd) this).field_d != 0) {
                break L4;
              } else {
                if (99 != gi.field_f) {
                  break L4;
                } else {
                  L5: {
                    ((qd) this).field_f = ((qd) this).field_f + 1;
                    if (((qd) this).field_f >= ((qd) this).field_i) {
                      ((qd) this).field_f = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((qd) this).field_g = false;
                  break L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "qd.I(" + param0 + ')');
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -9) {
                break L1;
              } else {
                ((qd) this).field_a = 75;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 != ((qd) this).field_c) {
                  break L3;
                } else {
                  if (84 == ((qd) this).field_b) {
                    break L3;
                  } else {
                    if (((qd) this).field_b != 83) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_10_0 = 1;
              stackIn_13_0 = stackOut_10_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "qd.F(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static pb[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        pb[] var10 = null;
        pb[] var11_ref_pb__ = null;
        int var11 = 0;
        int var12 = 0;
        pb var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_52_0 = 0;
        pb[] stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        pb[] stackOut_62_0 = null;
        var15 = stellarshard.field_B;
        try {
          L0: {
            var9_int = param1 + param5 - -param7;
            var10 = new pb[]{new pb(var9_int, var9_int), new pb(param8, var9_int), new pb(var9_int, var9_int), new pb(var9_int, param8), new pb(64, 64), new pb(var9_int, param8), new pb(var9_int, var9_int), new pb(param8, var9_int), new pb(var9_int, var9_int)};
            var11_ref_pb__ = var10;
            var12 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var12 <= ~var11_ref_pb__.length) {
                    break L3;
                  } else {
                    var13 = var11_ref_pb__[var12];
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
                            if (var13.field_z.length <= var14) {
                              break L6;
                            } else {
                              var13.field_z[var14] = param4;
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
              L7: {
                var11 = stackIn_13_0;
                if (param6 == -1) {
                  break L7;
                } else {
                  pb discarded$1 = qd.a((pf) null, (String) null, (String) null, (byte) 11);
                  break L7;
                }
              }
              L8: while (true) {
                L9: {
                  L10: {
                    if (var11 >= param5) {
                      break L10;
                    } else {
                      stackOut_17_0 = 0;
                      stackIn_27_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var15 != 0) {
                        break L9;
                      } else {
                        var12 = stackIn_18_0;
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (~var9_int >= ~var12) {
                                break L13;
                              } else {
                                var10[6].field_z[var12 + var9_int * (-1 + -var11 + var9_int)] = param2;
                                var10[8].field_z[var12 + (-1 + (var9_int + -var11)) * var9_int] = param2;
                                var10[2].field_z[var9_int * var12 + var9_int - (1 - -var11)] = param2;
                                var10[8].field_z[-1 - -var9_int + (-var11 + var12 * var9_int)] = param2;
                                var12++;
                                if (var15 != 0) {
                                  break L12;
                                } else {
                                  if (var15 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            var11++;
                            break L12;
                          }
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L9;
                }
                var11 = stackIn_27_0;
                L14: while (true) {
                  stackOut_28_0 = ~param5;
                  stackOut_28_1 = ~var11;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  L15: while (true) {
                    L16: {
                      L17: {
                        if (stackIn_29_0 >= stackIn_29_1) {
                          break L17;
                        } else {
                          stackOut_30_0 = 0;
                          stackIn_40_0 = stackOut_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          if (var15 != 0) {
                            break L16;
                          } else {
                            var12 = stackIn_31_0;
                            L18: while (true) {
                              L19: {
                                if (~var9_int >= ~var12) {
                                  break L19;
                                } else {
                                  var10[0].field_z[var12 + var11 * var9_int] = param0;
                                  var10[0].field_z[var9_int * var12 + var11] = param0;
                                  stackOut_33_0 = -var11 + var9_int;
                                  stackOut_33_1 = var12;
                                  stackIn_29_0 = stackOut_33_0;
                                  stackIn_29_1 = stackOut_33_1;
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  if (var15 != 0) {
                                    continue L15;
                                  } else {
                                    L20: {
                                      if (stackIn_34_0 <= stackIn_34_1) {
                                        break L20;
                                      } else {
                                        var10[2].field_z[var12 - -(var9_int * var11)] = param0;
                                        var10[6].field_z[var11 + var9_int * var12] = param0;
                                        break L20;
                                      }
                                    }
                                    var12++;
                                    if (var15 == 0) {
                                      continue L18;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              var11++;
                              if (var15 == 0) {
                                continue L14;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                      }
                      stackOut_39_0 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      break L16;
                    }
                    var11 = stackIn_40_0;
                    L21: while (true) {
                      L22: {
                        L23: {
                          if (var11 >= param8) {
                            break L23;
                          } else {
                            stackOut_42_0 = 0;
                            stackIn_52_0 = stackOut_42_0;
                            stackIn_43_0 = stackOut_42_0;
                            if (var15 != 0) {
                              break L22;
                            } else {
                              var12 = stackIn_43_0;
                              L24: while (true) {
                                L25: {
                                  L26: {
                                    if (param5 <= var12) {
                                      break L26;
                                    } else {
                                      var10[7].field_z[(-1 + (-var12 + var9_int)) * param8 - -var11] = param2;
                                      var10[5].field_z[var11 * var9_int - -var9_int - (1 + var12)] = param2;
                                      var10[1].field_z[param8 * var12 - -var11] = param0;
                                      var10[3].field_z[var12 + var11 * var9_int] = param0;
                                      var12++;
                                      if (var15 != 0) {
                                        break L25;
                                      } else {
                                        if (var15 == 0) {
                                          continue L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  break L25;
                                }
                                if (var15 == 0) {
                                  continue L21;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                        }
                        stackOut_51_0 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        break L22;
                      }
                      var11 = stackIn_52_0;
                      L27: while (true) {
                        L28: {
                          if (var11 >= param8 >> -688875967) {
                            break L28;
                          } else {
                            var12 = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (~var12 <= ~param7) {
                                    break L31;
                                  } else {
                                    var10[1].field_z[var11 + (var9_int + (-var12 + -1)) * param8] = param3;
                                    var10[3].field_z[var11 * var9_int + (-var12 + -1) + var9_int] = param3;
                                    var10[7].field_z[var12 * param8 + var11] = param3;
                                    var10[5].field_z[var12 + var9_int * var11] = param3;
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
                        stackOut_62_0 = (pb[]) var10;
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
          throw ma.a((Throwable) (Object) var9, "qd.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_63_0;
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((qd) this).field_b = 0;
              if (param1 == 84) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            L2: {
              ((qd) this).field_c = 0;
              if (((qd) this).field_d != 0) {
                break L2;
              } else {
                ((qd) this).field_b = gi.field_f;
                break L2;
              }
            }
            L3: {
              if (0 != ((qd) this).field_d) {
                break L3;
              } else {
                if (96 == gi.field_f) {
                  L4: {
                    if (((qd) this).field_f <= 0) {
                      ((qd) this).field_f = ((qd) this).field_i;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((qd) this).field_g = false;
                  ((qd) this).field_f = ((qd) this).field_f - 1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (((qd) this).field_d != 0) {
                break L5;
              } else {
                if (gi.field_f != 97) {
                  break L5;
                } else {
                  L6: {
                    ((qd) this).field_f = ((qd) this).field_f + 1;
                    if (~((qd) this).field_i < ~((qd) this).field_f) {
                      break L6;
                    } else {
                      ((qd) this).field_f = 0;
                      break L6;
                    }
                  }
                  ((qd) this).field_g = false;
                  break L5;
                }
              }
            }
            L7: {
              if (((qd) this).field_d != 0) {
                break L7;
              } else {
                L8: {
                  if (gi.field_f == 98) {
                    break L8;
                  } else {
                    if (gi.field_f == 99) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                ((qd) this).field_g = false;
                if (0 > ((qd) this).field_f) {
                  ((qd) this).field_f = param0;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "qd.B(" + param0 + ',' + param1 + ')');
        }
    }

    qd(int param0) {
        ((qd) this).field_f = 0;
        ((qd) this).field_g = false;
        try {
            ((qd) this).field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "qd.<init>(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading music";
    }
}
