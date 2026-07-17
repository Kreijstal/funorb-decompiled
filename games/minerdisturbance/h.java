/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static ea field_c;
    static int field_b;
    static int[] field_a;
    static wh field_d;

    final static String[] a(char param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            var10 = (CharSequence) (Object) param2;
            var3_int = fe.a((byte) 74, param0, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3_int) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                var4[var3_int] = param2.substring(var6);
                stackOut_9_0 = (String[]) var4;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var8 = var6;
                L3: while (true) {
                  if (param2.charAt(var8) == param0) {
                    int incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param2.substring(var6, var8);
                    var6 = var8 - -1;
                    var7++;
                    continue L1;
                  } else {
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("h.F(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    public static void b(boolean param0) {
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        ri.a((byte) -112, bm.c(-125));
        if (param0) {
            h.b(true);
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var19 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param4 < 0) {
                break L1;
              } else {
                if (param1 >= dj.field_f) {
                  break L1;
                } else {
                  L2: {
                    if (param8 >= 0) {
                      break L2;
                    } else {
                      if (param3 >= 0) {
                        break L2;
                      } else {
                        if (param5 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (dj.field_b > param8) {
                      break L3;
                    } else {
                      if (dj.field_b > param3) {
                        break L3;
                      } else {
                        if (param5 >= dj.field_b) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param4 - param1;
                    if (param1 != param0) {
                      L5: {
                        var10 = param8 << 16;
                        var9_int = param8 << 16;
                        var15 = param0 - param1;
                        var12 = (-param8 + param5 << 16) / var14;
                        var11 = (-param8 + param3 << 16) / var15;
                        if (var12 > var11) {
                          var13 = 0;
                          break L5;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param1 >= 0) {
                            break L7;
                          } else {
                            if (param0 < 0) {
                              param1 = -param1 + param0;
                              var9_int = var9_int + var11 * param1;
                              var10 = var10 + param1 * var12;
                              param1 = param0;
                              break L6;
                            } else {
                              param1 = -param1;
                              var9_int = var9_int + var11 * param1;
                              var10 = var10 + var12 * param1;
                              param1 = 0;
                              break L7;
                            }
                          }
                        }
                        var16 = dj.field_a[param1];
                        L8: while (true) {
                          if (param1 >= param0) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> 16;
                              if (dj.field_b > var17) {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (var18 != 0) {
                                  L10: {
                                    if (dj.field_b <= var18 + var17) {
                                      var18 = -var17 + (dj.field_b - 1);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  if (0 > var17) {
                                    s.a(param2, -1, var16, param7, var17 + var18);
                                    break L9;
                                  } else {
                                    s.a(param2, -1, var17 - -var16, param7, var18);
                                    break L9;
                                  }
                                } else {
                                  if (var17 < 0) {
                                    break L9;
                                  } else {
                                    if (var17 >= dj.field_b) {
                                      break L9;
                                    } else {
                                      s.a(param2, param6 ^ 13611, var17 - -var16, param7, var18);
                                      break L9;
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param1++;
                            if (param1 < dj.field_f) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + eh.field_g;
                              continue L8;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = -param0 + param4;
                      if (var16 != 0) {
                        L11: {
                          if (var13 != 0) {
                            var10 = param3 << 16;
                            break L11;
                          } else {
                            var9_int = param3 << 16;
                            break L11;
                          }
                        }
                        var17 = param5 << 16;
                        var11 = (var17 - var9_int) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param1 != param4) {
                          var15 = param4 + -param0;
                          if (param8 >= param3) {
                            var11 = (param5 - param3 << 16) / var15;
                            var12 = (-param8 + param5 << 16) / var14;
                            var10 = param8 << 16;
                            var9_int = param3 << 16;
                            break L12;
                          } else {
                            var12 = (-param3 + param5 << 16) / var15;
                            var11 = (param5 - param8 << 16) / var14;
                            var10 = param3 << 16;
                            var9_int = param8 << 16;
                            break L12;
                          }
                        } else {
                          var11 = 0;
                          var12 = 0;
                          var10 = param3 << 16;
                          var9_int = param8 << 16;
                          break L12;
                        }
                      }
                      var13 = 0;
                      if (param1 < 0) {
                        param1 = Math.min(-param1, param0 + -param1);
                        var10 = var10 + var12 * param1;
                        var9_int = var9_int + var11 * param1;
                        param1 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param6 == -13612) {
                    L13: {
                      if (0 > param1) {
                        param1 = -param1;
                        var10 = var10 + param1 * var12;
                        var9_int = var9_int + param1 * var11;
                        param1 = 0;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var15 = dj.field_a[param1];
                    L14: while (true) {
                      if (param4 <= param1) {
                        break L0;
                      } else {
                        L15: {
                          var16 = var9_int >> 16;
                          if (var16 < dj.field_b) {
                            var17 = (var10 >> 16) - (var9_int >> 16);
                            if (var17 == 0) {
                              if (var16 < 0) {
                                break L15;
                              } else {
                                if (var16 >= dj.field_b) {
                                  break L15;
                                } else {
                                  s.a(param2, param6 + 13611, var16 - -var15, param7, var17);
                                  break L15;
                                }
                              }
                            } else {
                              L16: {
                                if (var16 + var17 >= dj.field_b) {
                                  var17 = -1 + (dj.field_b - var16);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if (0 <= var16) {
                                s.a(param2, -1, var15 + var16, param7, var17);
                                break L15;
                              } else {
                                s.a(param2, -1, var15, param7, var17 - -var16);
                                break L15;
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        param1++;
                        if (param1 >= dj.field_f) {
                          return;
                        } else {
                          var15 = var15 + eh.field_g;
                          var10 = var10 + var12;
                          var9_int = var9_int + var11;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var9;
            stackOut_78_1 = new StringBuilder().append("h.E(").append(param0).append(44).append(param1).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L17;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static void a(int param0) {
        if (!oc.d(63)) {
            return;
        }
        qd.a(126, false, 4);
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        hf var4_ref_hf = null;
        byte[] var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        af var8 = null;
        ld var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var9 = kj.field_a;
              var2 = var9.d((byte) -54);
              if (0 == var2) {
                var8 = (af) (Object) ag.field_b.b(108);
                if (var8 != null) {
                  L2: {
                    var4 = var9.d((byte) -54);
                    if (0 != var4) {
                      var13 = new byte[var4];
                      var12 = var13;
                      var11 = var12;
                      var10 = var11;
                      var7 = var10;
                      var5 = var7;
                      var9.a(var13, (byte) -120, 0, var4);
                      break L2;
                    } else {
                      var5 = null;
                      break L2;
                    }
                  }
                  var9.field_o = var9.field_o + 4;
                  if (!var9.f(0)) {
                    si.a(-56);
                    return;
                  } else {
                    var8.field_t = var5;
                    var8.field_q = true;
                    var8.b(34);
                    break L1;
                  }
                } else {
                  si.a(-37);
                  return;
                }
              } else {
                if (var2 == 1) {
                  var3 = var9.b((byte) 119);
                  var4_ref_hf = (hf) (Object) kk.field_a.b(109);
                  L3: while (true) {
                    L4: {
                      if (var4_ref_hf == null) {
                        break L4;
                      } else {
                        if (var3 != var4_ref_hf.field_o) {
                          var4_ref_hf = (hf) (Object) kk.field_a.b((byte) 56);
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var4_ref_hf == null) {
                      si.a(-60);
                      return;
                    } else {
                      var4_ref_hf.b(34);
                      break L1;
                    }
                  }
                } else {
                  di.a((Throwable) null, 1, "A1: " + hj.a((byte) 118));
                  si.a(-56);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "h.D(" + 115 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = new int[8192];
    }
}
