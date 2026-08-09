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
        pj var2 = this.field_b;
        if (!(var2 != this.field_e)) {
            this.field_b = null;
            return null;
        }
        if (param0 != -2) {
            return (pj) null;
        }
        this.field_b = var2.field_m;
        return var2;
    }

    final int a(byte param0) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 2) {
            return 62;
        }
        int var2 = 0;
        pj var3 = this.field_e.field_m;
        while (var3 != this.field_e) {
            var2++;
            var3 = var3.field_m;
        }
        return var2;
    }

    final static void a(byte param0, fs param1, wi param2, int param3) {
        try {
            byte[] array$0 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            StringBuilder stackIn_39_1 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            Throwable decompiledCaughtException = null;
            int var4_int = 0;
            RuntimeException var4 = null;
            rd var5 = null;
            int var6 = 0;
            int var7_int = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            int var13_int = 0;
            Class[] var13 = null;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            byte[][] var19 = null;
            String var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var15 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                var4_int = 65 / ((9 - param0) / 55);
                var5 = new rd();
                var5.field_p = param1.e(-31302);
                var5.field_t = param1.c(true);
                var5.field_o = new jr[var5.field_p];
                var5.field_k = new int[var5.field_p];
                var5.field_u = new byte[var5.field_p][][];
                var5.field_s = new jr[var5.field_p];
                var5.field_n = new int[var5.field_p];
                var5.field_r = new int[var5.field_p];
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var5.field_p) {
                    qr.field_c.a((ms) (var5), (byte) 39);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param1.e(-31302);
                            if (-1 == (var7_int ^ -1)) {
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
                                      if (-5 == (var7_int ^ -1)) {
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
                                        var22 = new byte[var10][];
                                        var19 = var22;
                                        var12 = var19;
                                        if ((var7_int ^ -1) != -4) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var13_int >= var10) {
                                              break L7;
                                            } else {
                                              var14 = param1.c(true);
                                              array$0 = new byte[var14];
                                              var12[var13_int] = array$0;
                                              param1.a(var22[var13_int], var14, 0, (byte) -33);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var5.field_r[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          var5.field_s[var6] = param2.a(0, pk.a((byte) -24, var20), var21, var13);
                                          var5.field_u[var6] = var22;
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
                          var5.field_r[var6] = var7_int;
                          var5.field_n[var6] = var10;
                          var5.field_o[var6] = param2.a(0, var16, pk.a((byte) -24, var17));
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var5.field_k[var6] = -1;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var5.field_k[var6] = -2;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var5.field_k[var6] = -3;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var5.field_k[var6] = -4;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var5.field_k[var6] = -5;
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
                stackIn_36_0 = (RuntimeException) (var4);

                stackIn_36_1 = new StringBuilder().append("ro.K(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "null";
                  break L16;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackIn_37_2 = "{...}";
                  break L16;
                }
              }
              L17: {


                stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');

                if (param2 == null) {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "null";
                  break L17;
                } else {
                  stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackIn_40_2 = "{...}";
                  break L17;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        ks.field_x = fw.c(false);
        rf.field_a = new dg();
        sm.a((byte) 127, true, true);
        if (param0 != 246) {
            ro.a(22, 45, -112, 42, -110, true, -91, 8, 90);
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_c = -79;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int var9;
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
              var9 = -12 + rm.b(42, param7 >> -1319724769 ^ param7 | (param6 >> 1192438111 ^ param6 | (param2 ^ param2 >> 872310591 | param8 >> 2056917695 ^ param8 | param3 ^ param3 >> 1388706335)));
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
                ro.a(67, -70, -24, 44, 33, true, -93, 8, -123);
                break L5;
              }
            }
            if ((param7 ^ -1) >= -1) {
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
              return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
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
            param0.field_o = this.field_e.field_o;
            if (param1 > -100) {
                this.a((byte) 78);
            }
            param0.field_m = this.field_e;
            param0.field_o.field_m = param0;
            param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ro.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pj a(int param0) {
        pj var2 = this.field_e.field_m;
        if (param0 < 8) {
            this.field_e = (pj) null;
        }
        if (this.field_e == var2) {
            this.field_b = null;
            return null;
        }
        this.field_b = var2.field_m;
        return var2;
    }

    final void a(pj param0, int param1) {
        try {
            if (param0.field_o != null) {
                param0.c(-5106);
            }
            param0.field_o = this.field_e;
            param0.field_m = this.field_e.field_m;
            if (param1 != -4) {
                ro.c(-24);
            }
            param0.field_o.field_m = param0;
            param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ro.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pj b(byte param0) {
        if (param0 != 72) {
            return (pj) null;
        }
        pj var2 = this.field_e.field_m;
        if (var2 == this.field_e) {
            return null;
        }
        var2.c(-5106);
        return var2;
    }

    final static void a(ah param0, byte param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0.a(true)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param0.l((byte) 0);
                bn.f(param1 + -111);
                if (param1 == 113) {
                  break L1;
                } else {
                  field_d = 68;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ct.a(6510, param0);
                  tq.a((byte) -106, param0);
                  if (param0.field_P != 0) {
                    break L3;
                  } else {
                    if (!param0.field_R) {
                      break L3;
                    } else {
                      ew.field_e = ew.field_e + 1;
                      if (ps.field_e[9] == ew.field_e) {
                        th.b(24753, 246, 9);
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ro.J(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final pj c(byte param0) {
        if (param0 != 126) {
            this.field_e = (pj) null;
        }
        pj var2 = this.field_e.field_o;
        if (var2 == this.field_e) {
            return null;
        }
        var2.c(param0 + -5232);
        return var2;
    }

    public ro() {
        this.field_e = new pj();
        this.field_e.field_o = this.field_e;
        this.field_e.field_m = this.field_e;
    }

    static {
    }
}
