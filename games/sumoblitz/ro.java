/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    static vq field_a;
    static int field_c;
    static int field_d;
    private pj field_e;
    private pj field_b;

    final pj d(int param0) {
        pj var2 = ((ro) this).field_b;
        if (!(var2 != ((ro) this).field_e)) {
            ((ro) this).field_b = null;
            return null;
        }
        if (param0 != -2) {
            return null;
        }
        ((ro) this).field_b = var2.field_m;
        return var2;
    }

    final int a(byte param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 2) {
            return 62;
        }
        int var2 = 0;
        pj var3 = ((ro) this).field_e.field_m;
        while (var3 != ((ro) this).field_e) {
            var2++;
            var3 = var3.field_m;
        }
        return var2;
    }

    final static void a(byte param0, fs param1, wi param2, int param3) {
        try {
            RuntimeException var4 = null;
            int var4_int = 0;
            Object var5 = null;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            Class[] var13 = null;
            int var13_int = 0;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var15 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                var4_int = -32;
                var5 = (Object) (Object) new rd();
                ((rd) var5).field_p = param1.e(-31302);
                ((rd) var5).field_t = param1.c(true);
                ((rd) var5).field_o = new jr[((rd) var5).field_p];
                ((rd) var5).field_k = new int[((rd) var5).field_p];
                ((rd) var5).field_u = new byte[((rd) var5).field_p][][];
                ((rd) var5).field_s = new jr[((rd) var5).field_p];
                ((rd) var5).field_n = new int[((rd) var5).field_p];
                ((rd) var5).field_r = new int[((rd) var5).field_p];
                var6 = 0;
                L1: while (true) {
                  if (var6 >= ((rd) var5).field_p) {
                    qr.field_c.a((ms) var5, (byte) 39);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param1.e(-31302);
                            if (var7_int == 0) {
                              break L4;
                            } else {
                              if (1 == var7_int) {
                                break L4;
                              } else {
                                if (var7_int != 2) {
                                  L5: {
                                    if (3 == var7_int) {
                                      break L5;
                                    } else {
                                      if (var7_int == 4) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  var20 = param1.d(-1);
                                  var21 = param1.d(-1);
                                  var10 = param1.e(-31302);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var10 <= var12_int) {
                                      L7: {
                                        var24 = new byte[var10][];
                                        var23 = var24;
                                        var22 = var23;
                                        var19 = var22;
                                        var12 = var19;
                                        if (var7_int != 3) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var13_int >= var10) {
                                              break L7;
                                            } else {
                                              var14 = param1.c(true);
                                              var12[var13_int] = new byte[var14];
                                              param1.a(var24[var13_int], var14, 0, (byte) -33);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      ((rd) var5).field_r[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          ((rd) var5).field_s[var6] = param2.a(0, pk.a((byte) -24, var20), var21, var13);
                                          ((rd) var5).field_u[var6] = var24;
                                          break L3;
                                        } else {
                                          var13[var18] = pk.a((byte) -24, var11[var18]);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param1.d(-1);
                                      var12_int++;
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
                            var17 = param1.d(-1);
                            var8 = var17;
                            var16 = param1.d(-1);
                            var9 = var16;
                            var10 = 0;
                            if (var7_int == 1) {
                              var10 = param1.c(true);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          ((rd) var5).field_r[var6] = var7_int;
                          ((rd) var5).field_n[var6] = var10;
                          ((rd) var5).field_o[var6] = param2.a(0, var16, pk.a((byte) -24, var17));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((rd) var5).field_k[var6] = -1;
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((rd) var5).field_k[var6] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        ((rd) var5).field_k[var6] = -5;
                        break L15;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("ro.K(").append(127).append(',');
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param1 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L16;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L16;
                }
              }
              L17: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param2 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L17;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L17;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b() {
        ks.field_x = fw.c(false);
        rf.field_a = new dg();
        sm.a((byte) 127, true, true);
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_c = -79;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int var9 = 0;
        L0: {
          L1: {
            param8 = param8 - param0;
            param3 = param3 - param0;
            param2 = param2 - param4;
            param6 = param6 - param4;
            if (param3 > param8) {
              if (param3 < -param7) {
                break L0;
              } else {
                if (param8 <= param7) {
                  break L1;
                } else {
                  break L0;
                }
              }
            } else {
              if (param8 < -param7) {
                break L0;
              } else {
                if (param3 <= param7) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            L3: {
              if (param6 > param2) {
                if (-param7 > param6) {
                  break L2;
                } else {
                  if (param7 < param2) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              } else {
                if (-param7 > param2) {
                  break L2;
                } else {
                  if (param7 >= param6) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L4: {
              var9 = -12 + rm.b(42, param7 >> 31 ^ param7 | (param6 >> 31 ^ param6 | (param2 ^ param2 >> 31 | param8 >> 31 ^ param8 | param3 ^ param3 >> 31)));
              if (var9 > 0) {
                param3 = param3 >> var9;
                param2 = param2 >> var9;
                param7 = param7 >> var9;
                param6 = param6 >> var9;
                param8 = param8 >> var9;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (!param5) {
                break L5;
              } else {
                int discarded$1 = ro.a(67, -70, -24, 44, 33, true, -93, 8, -123);
                break L5;
              }
            }
            if (param7 <= 0) {
              return -1;
            } else {
              L6: {
                var9 = param7 * param7;
                if (param8 * param8 + param2 * param2 >= var9) {
                  break L6;
                } else {
                  if (param6 * param6 + param3 * param3 < var9) {
                    return 1 + (1 << param1);
                  } else {
                    break L6;
                  }
                }
              }
              param6 = param6 - param2;
              param3 = param3 - param8;
              return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1, param6 * param6 + param3 * param3 << 1, param1);
            }
          }
          return -1;
        }
        return -1;
    }

    final void a(pj param0, byte param1) {
        try {
            if (param0.field_o != null) {
                param0.c(-5106);
            }
            param0.field_o = ((ro) this).field_e.field_o;
            if (param1 > -100) {
                int discarded$0 = ((ro) this).a((byte) 78);
            }
            param0.field_m = ((ro) this).field_e;
            param0.field_o.field_m = param0;
            param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ro.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pj a(int param0) {
        pj var2 = ((ro) this).field_e.field_m;
        if (param0 < 8) {
            ((ro) this).field_e = null;
        }
        if (((ro) this).field_e == var2) {
            ((ro) this).field_b = null;
            return null;
        }
        ((ro) this).field_b = var2.field_m;
        return var2;
    }

    final void a(pj param0, int param1) {
        try {
            if (param0.field_o != null) {
                param0.c(-5106);
            }
            param0.field_o = ((ro) this).field_e;
            param0.field_m = ((ro) this).field_e.field_m;
            if (param1 != -4) {
                ro.c(-24);
            }
            param0.field_o.field_m = param0;
            param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ro.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pj b(byte param0) {
        if (param0 != 72) {
            return null;
        }
        pj var2 = ((ro) this).field_e.field_m;
        if (var2 == ((ro) this).field_e) {
            return null;
        }
        var2.c(-5106);
        return var2;
    }

    final static void a(ah param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0.a(true)) {
              return;
            } else {
              L1: {
                param0.l((byte) 0);
                bn.f(2);
                ct.a(6510, param0);
                tq.a((byte) -106, param0);
                if (param0.field_P != 0) {
                  break L1;
                } else {
                  if (!param0.field_R) {
                    break L1;
                  } else {
                    ew.field_e = ew.field_e + 1;
                    if (ps.field_e[9] == ew.field_e) {
                      th.b(24753, 246, 9);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("ro.J(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + 113 + ')');
        }
    }

    final pj c(byte param0) {
        if (param0 != 126) {
            ((ro) this).field_e = null;
        }
        pj var2 = ((ro) this).field_e.field_o;
        if (var2 == ((ro) this).field_e) {
            return null;
        }
        var2.c(param0 + -5232);
        return var2;
    }

    public ro() {
        ((ro) this).field_e = new pj();
        ((ro) this).field_e.field_o = ((ro) this).field_e;
        ((ro) this).field_e.field_m = ((ro) this).field_e;
    }

    static {
    }
}
