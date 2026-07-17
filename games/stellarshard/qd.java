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
        if (~((qd) this).field_i < ~param0) {
          if (~((qd) this).field_i < ~param1) {
            L0: {
              ((qd) this).field_b = 0;
              ((qd) this).field_c = 0;
              if (0 == gh.field_c) {
                break L0;
              } else {
                ((qd) this).field_g = true;
                ((qd) this).field_d = gh.field_c;
                ((qd) this).field_f = param1;
                ((qd) this).field_a = bf.field_b;
                ((qd) this).field_c = gh.field_c;
                break L0;
              }
            }
            L1: {
              if (((qd) this).field_d == 0) {
                break L1;
              } else {
                if (fb.field_n != 0) {
                  L2: {
                    if (((qd) this).field_a <= 0) {
                      ((qd) this).field_a = rc.field_m;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((qd) this).field_a = ((qd) this).field_a - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (0 != gh.field_c) {
                break L3;
              } else {
                if (fb.field_n != 0) {
                  break L3;
                } else {
                  ((qd) this).field_d = 0;
                  break L3;
                }
              }
            }
            L4: {
              if (~((qd) this).field_d != param2) {
                break L4;
              } else {
                L5: {
                  if (((qd) this).field_g) {
                    break L5;
                  } else {
                    if (qc.field_a) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                if (param0 >= 0) {
                  L6: {
                    if (~param0 != ~((qd) this).field_f) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((qd) this).field_g = true;
                  ((qd) this).field_f = param0;
                  break L4;
                } else {
                  if (!((qd) this).field_g) {
                    break L4;
                  } else {
                    ((qd) this).field_f = -1;
                    break L4;
                  }
                }
              }
            }
            return;
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            Object var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
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
                    var3 = null;
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
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("qd.C(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b() {
        field_e = null;
        field_j = null;
        int var1 = 38;
    }

    final static pb a(pf param0, String param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        pb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        pb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.b(param2, (byte) -118);
              if (param3 >= 41) {
                break L1;
              } else {
                var6 = null;
                qd.a((java.applet.Applet) null, (byte) -109);
                break L1;
              }
            }
            var5 = param0.a(var4_int, param1, (byte) -11);
            int discarded$2 = -2;
            stackOut_2_0 = vc.a(param0, var5, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qd.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, boolean param2, boolean param3) {
        ((qd) this).field_d = 0;
        ((qd) this).field_g = param2 ? true : false;
        if (param3) {
            return;
        }
        if (!((qd) this).field_g) {
            ((qd) this).field_f = param1;
        } else {
            ((qd) this).field_f = param0;
        }
    }

    final void a(int param0) {
        ((qd) this).field_c = 0;
        ((qd) this).field_b = param0;
        if (((qd) this).field_d == 0) {
            if (!(gi.field_f != 98)) {
                if (((qd) this).field_f <= 0) {
                    ((qd) this).field_f = ((qd) this).field_i;
                }
                ((qd) this).field_f = ((qd) this).field_f - 1;
                ((qd) this).field_g = false;
            }
        }
        if (!(((qd) this).field_d != 0)) {
            ((qd) this).field_b = gi.field_f;
        }
        if (((qd) this).field_d == 0) {
            if (99 == gi.field_f) {
                ((qd) this).field_f = ((qd) this).field_f + 1;
                if (!(((qd) this).field_f < ((qd) this).field_i)) {
                    ((qd) this).field_f = 0;
                }
                ((qd) this).field_g = false;
            }
        }
    }

    final boolean c(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -9) {
            break L0;
          } else {
            ((qd) this).field_a = 75;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((qd) this).field_c) {
              break L2;
            } else {
              if (84 == ((qd) this).field_b) {
                break L2;
              } else {
                if (((qd) this).field_b != 83) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static pb[] a() {
        int var9 = 0;
        pb[] var10 = null;
        pb[] var11_ref_pb__ = null;
        int var11 = 0;
        int var12 = 0;
        pb var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = stellarshard.field_B;
        var9 = 3;
        var10 = new pb[]{new pb(var9, var9), new pb(3, var9), new pb(var9, var9), new pb(var9, 3), new pb(64, 64), new pb(var9, 3), new pb(var9, var9), new pb(3, var9), new pb(var9, var9)};
        var11_ref_pb__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_pb__.length) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 < 1) {
                                var10[1].field_z[var11 + (var9 + (-var12 + -1)) * 3] = 65793;
                                var10[3].field_z[var11 * var9 + (-var12 + -1) + var9] = 65793;
                                var10[7].field_z[var12 * 3 + var11] = 65793;
                                var10[5].field_z[var12 + var9 * var11] = 65793;
                                var12++;
                                continue L5;
                              } else {
                                var11++;
                                continue L4;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (1 > var12) {
                            var10[7].field_z[(-1 + (-var12 + var9)) * 3 - -var11] = 0;
                            var10[5].field_z[var11 * var9 - -var9 - (1 + var12)] = 0;
                            var10[1].field_z[3 * var12 - -var11] = 0;
                            var10[3].field_z[var12 + var11 * var9] = 0;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_z[var12 + var11 * var9] = 0;
                        var10[0].field_z[var9 * var12 + var11] = 0;
                        if (-var11 + var9 > var12) {
                          var10[2].field_z[var12 - -(var9 * var11)] = 0;
                          var10[6].field_z[var11 + var9 * var12] = 0;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var9 > var12) {
                    var10[6].field_z[var12 + var9 * (-1 + -var11 + var9)] = 0;
                    var10[8].field_z[var12 + (-1 + (var9 + -var11)) * var9] = 0;
                    var10[2].field_z[var9 * var12 + var9 - (1 - -var11)] = 0;
                    var10[8].field_z[-1 - -var9 + (-var11 + var12 * var9)] = 0;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_pb__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_z.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_z[var14] = 0;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final void a(int param0, int param1) {
        L0: {
          ((qd) this).field_b = 0;
          if (param1 == 84) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          ((qd) this).field_c = 0;
          if (-1 != ((qd) this).field_d) {
            break L1;
          } else {
            ((qd) this).field_b = gi.field_f;
            break L1;
          }
        }
        L2: {
          if (0 != ((qd) this).field_d) {
            break L2;
          } else {
            if (96 == gi.field_f) {
              L3: {
                if (-1 >= ((qd) this).field_f) {
                  ((qd) this).field_f = ((qd) this).field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
              ((qd) this).field_g = false;
              ((qd) this).field_f = ((qd) this).field_f - 1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L4: {
          if (((qd) this).field_d != 0) {
            break L4;
          } else {
            if (gi.field_f != 97) {
              break L4;
            } else {
              L5: {
                ((qd) this).field_f = ((qd) this).field_f + 1;
                if (((qd) this).field_i > ((qd) this).field_f) {
                  break L5;
                } else {
                  ((qd) this).field_f = 0;
                  break L5;
                }
              }
              ((qd) this).field_g = false;
              break L4;
            }
          }
        }
        L6: {
          if (((qd) this).field_d != 0) {
            break L6;
          } else {
            L7: {
              if (gi.field_f == 98) {
                break L7;
              } else {
                if (gi.field_f == 99) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            ((qd) this).field_g = false;
            if (0 > ((qd) this).field_f) {
              ((qd) this).field_f = param0;
              break L6;
            } else {
              break L6;
            }
          }
        }
    }

    qd(int param0) {
        ((qd) this).field_f = 0;
        ((qd) this).field_g = false;
        ((qd) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Loading music";
    }
}
