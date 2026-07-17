/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class er extends fe {
    static int field_W;
    static String field_N;
    int field_P;
    int field_Y;
    int field_V;
    int field_U;
    int field_O;
    static String field_Q;
    static int field_X;
    int field_Z;
    static int field_S;
    static String field_T;
    static int field_R;

    public static void g(byte param0) {
        field_T = null;
        field_N = null;
        field_Q = null;
        int var1 = 0;
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Pool.field_O;
        if (im.field_fc < 0) {
          return;
        } else {
          if (!param1) {
            L0: {
              var3 = 185;
              var4 = param0 - 35;
              var5 = 256;
              if (im.field_fc >= 75) {
                break L0;
              } else {
                var5 = (im.field_fc << 8) / 75;
                break L0;
              }
            }
            L1: {
              if (im.field_fc > 200) {
                var5 = (-im.field_fc + 250 << 8) / 50;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              kj.a(63, un.field_c);
              fb.a();
              qh.d();
              gi.a(-21818);
              if (var5 < 256) {
                qh.c(0, 0, qh.field_l, qh.field_f, 0, -var5 + 256);
                break L2;
              } else {
                break L2;
              }
            }
            oc.a(112);
            if (im.field_fc >= 150) {
              qf.field_k.a(var3 + 15, 10 + var4, var5);
              var6 = -125 + im.field_fc;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (20 <= var6) {
                    if (var6 >= 30) {
                      var7 = (-var6 + 50) * 256 / 20;
                      ci.field_h.c(var3, var4, var7);
                      var6 = im.field_fc + -140;
                      if (0 < var6) {
                        L3: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ci.field_h.c(var3, var4, 256);
                      var6 = im.field_fc + -140;
                      if (0 < var6) {
                        L4: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    ci.field_h.c(var3, var4, var7);
                    var6 = im.field_fc + -140;
                    if (0 >= var6) {
                      return;
                    } else {
                      L5: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                      return;
                    }
                  }
                } else {
                  var6 = im.field_fc + -140;
                  if (0 >= var6) {
                    return;
                  } else {
                    L6: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                    return;
                  }
                }
              } else {
                var6 = im.field_fc + -140;
                if (0 >= var6) {
                  return;
                } else {
                  L7: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                  return;
                }
              }
            } else {
              un.field_c.b(var3, var4);
              var6 = -125 + im.field_fc;
              if (var6 > 0) {
                if (var6 < 50) {
                  if (20 <= var6) {
                    if (var6 >= 30) {
                      var7 = (-var6 + 50) * 256 / 20;
                      ci.field_h.c(var3, var4, var7);
                      var6 = im.field_fc + -140;
                      if (0 >= var6) {
                        return;
                      } else {
                        L8: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                        return;
                      }
                    } else {
                      ci.field_h.c(var3, var4, 256);
                      var6 = im.field_fc + -140;
                      if (0 >= var6) {
                        return;
                      } else {
                        L9: {
                          var7 = 256;
                          if (var6 < 20) {
                            var7 = 256 * var6 / 20;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                        return;
                      }
                    }
                  } else {
                    var7 = var6 * 256 / 20;
                    ci.field_h.c(var3, var4, var7);
                    var6 = im.field_fc + -140;
                    if (0 >= var6) {
                      return;
                    } else {
                      L10: {
                        var7 = 256;
                        if (var6 < 20) {
                          var7 = 256 * var6 / 20;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                      return;
                    }
                  }
                } else {
                  var6 = im.field_fc + -140;
                  if (0 >= var6) {
                    return;
                  } else {
                    L11: {
                      var7 = 256;
                      if (var6 < 20) {
                        var7 = 256 * var6 / 20;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                    return;
                  }
                }
              } else {
                var6 = im.field_fc + -140;
                if (0 >= var6) {
                  return;
                } else {
                  L12: {
                    var7 = 256;
                    if (var6 < 20) {
                      var7 = 256 * var6 / 20;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  we.field_k.a(var3 - -15, var4 + 10, var7 * var5 >> 8);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final static void a(im param0, int param1) {
        im var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var3 = Pool.field_O;
        try {
          L0: {
            param0.a((byte) -117);
            if (param1 < -89) {
              var2 = (im) (Object) ma.field_i.c((byte) 124);
              L1: while (true) {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    if (!var2.a(param0, (byte) -97)) {
                      break L2;
                    } else {
                      var2 = (im) (Object) ma.field_i.f((byte) -5);
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (var2 == null) {
                    ma.field_i.b((byte) -11, (ma) (Object) param0);
                    break L3;
                  } else {
                    vj.a((ma) (Object) param0, (byte) -119, (ma) (Object) var2);
                    break L3;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2_ref;
            stackOut_11_1 = new StringBuilder().append("er.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, String param1, int param2, int param3, lr param4, boolean param5, int param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              var7_int = param4.b(param1) + 6;
              var8 = param4.field_w + param4.field_C - -6;
              var9 = param2 + -(var7_int / 2);
              if (var9 >= 0) {
                if (var9 + var7_int <= 640) {
                  break L1;
                } else {
                  param2 = param2 - (-640 + (var7_int + var9));
                  var9 = -var7_int + 640;
                  break L1;
                }
              } else {
                param2 = param2 - var9;
                var9 = 0;
                break L1;
              }
            }
            L2: {
              if (param5) {
                break L2;
              } else {
                field_X = 49;
                break L2;
              }
            }
            L3: {
              var10 = -3 + (-param4.field_C + param0);
              if (var10 < 0) {
                param0 = param0 - var10;
                var10 = 0;
                break L3;
              } else {
                if (480 < var10 - -var8) {
                  param0 = param0 - (var10 + (var8 + -480));
                  var10 = 480 + -var8;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            qh.a(var9, var10, var7_int, var8, 3, 0, 128);
            param4.b(param1, param2, param0, param6, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var7;
            stackOut_13_1 = new StringBuilder().append("er.B(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param5 + 44 + param6 + 41);
        }
    }

    private er() throws Throwable {
        throw new Error();
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var12 = Pool.field_O;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((er) this).field_U + (-((er) this).field_C + -param1 + param6);
                var9 = -((er) this).field_P + -((er) this).field_D + -param5 + param4;
                if (((er) this).field_O * ((er) this).field_O <= var8_int * var8_int + var9 * var9) {
                  break L1;
                } else {
                  L2: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - pp.field_d;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((er) this).field_Z;
                      break L2;
                    } else {
                      if (var10 <= 0.0) {
                        break L2;
                      } else {
                        var10 = var10 + 3.141592653589793 / (double)((er) this).field_Z;
                        break L2;
                      }
                    }
                  }
                  ((er) this).field_Y = (int)((double)((er) this).field_Z * var10 / 6.283185307179586);
                  L3: while (true) {
                    if (((er) this).field_Z > ((er) this).field_Y) {
                      L4: while (true) {
                        if (((er) this).field_Y >= 0) {
                          break L1;
                        } else {
                          ((er) this).field_Y = ((er) this).field_Y + ((er) this).field_Z;
                          continue L4;
                        }
                      }
                    } else {
                      ((er) this).field_Y = ((er) this).field_Y - ((er) this).field_Z;
                      continue L3;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var8;
            stackOut_15_1 = new StringBuilder().append("er.AA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_14_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Accept rematch";
        field_Q = "Error connecting to server. Please try using a different server.";
        field_T = "Mute this player for 48 hours";
    }
}
