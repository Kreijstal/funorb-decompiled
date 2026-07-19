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
        pj var2 = null;
        var2 = this.field_b;
        if (var2 == this.field_e) {
          this.field_b = null;
          return null;
        } else {
          if (param0 != -2) {
            return (pj) null;
          } else {
            this.field_b = var2.field_m;
            return var2;
          }
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 2) {
          return 62;
        } else {
          var2 = 0;
          var3 = this.field_e.field_m;
          L0: while (true) {
            L1: {
              if (var3 == this.field_e) {
                break L1;
              } else {
                var2++;
                var3 = var3.field_m;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        }
    }

    final static void a(byte param0, fs param1, wi param2, int param3) {
        try {
            byte[] array$1 = null;
            RuntimeException var4 = null;
            int var4_int = 0;
            Object var5 = null;
            rd var5_ref = null;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
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
            byte[][] var17 = null;
            String var18 = null;
            String var19 = null;
            byte[][] var20 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            var15 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                var4_int = 65 / ((9 - param0) / 55);
                var5_ref = new rd();
                var5_ref.field_p = param1.e(-31302);
                var5_ref.field_t = param1.c(true);
                var5_ref.field_o = new jr[var5_ref.field_p];
                var5_ref.field_k = new int[var5_ref.field_p];
                var5_ref.field_u = new byte[var5_ref.field_p][][];
                var5_ref.field_s = new jr[var5_ref.field_p];
                var5_ref.field_n = new int[var5_ref.field_p];
                var5_ref.field_r = new int[var5_ref.field_p];
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var6 >= var5_ref.field_p) {
                        break L3;
                      } else {
                        try {
                          L4: {
                            var7_int = param1.e(-31302);
                            if (var15 != 0) {
                              decompiledRegionSelector0 = 0;
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  L7: {
                                    if (-1 == (var7_int ^ -1)) {
                                      break L7;
                                    } else {
                                      if (1 == var7_int) {
                                        break L7;
                                      } else {
                                        if (var7_int != 2) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  L8: {
                                    var16 = param1.d(-1);
                                    var9 = param1.d(-1);
                                    var10 = 0;
                                    if (var7_int == 1) {
                                      var10 = param1.c(true);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  var5_ref.field_r[var6] = var7_int;
                                  var5_ref.field_n[var6] = var10;
                                  var5_ref.field_o[var6] = param2.a(0, var9, pk.a((byte) -24, var16));
                                  if (var15 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                                L9: {
                                  if (3 == var7_int) {
                                    break L9;
                                  } else {
                                    if (-5 == (var7_int ^ -1)) {
                                      break L9;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                var18 = param1.d(-1);
                                var19 = param1.d(-1);
                                var10 = param1.e(-31302);
                                var11 = new String[var10];
                                var12_int = 0;
                                L10: while (true) {
                                  if (var10 <= var12_int) {
                                    L11: {
                                      L12: {
                                        var20 = new byte[var10][];
                                        var17 = var20;
                                        var12 = var17;
                                        if ((var7_int ^ -1) != -4) {
                                          break L12;
                                        } else {
                                          var13_int = 0;
                                          L13: while (true) {
                                            if (var13_int >= var10) {
                                              break L12;
                                            } else {
                                              var14 = param1.c(true);
                                              array$1 = new byte[var14];
                                              var12[var13_int] = array$1;
                                              param1.a(var20[var13_int], var14, 0, (byte) -33);
                                              var13_int++;
                                              if (var15 != 0) {
                                                break L11;
                                              } else {
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var5_ref.field_r[var6] = var7_int;
                                      break L11;
                                    }
                                    var13 = new Class[var10];
                                    var14 = 0;
                                    L14: while (true) {
                                      L15: {
                                        if (var14 >= var10) {
                                          var5_ref.field_s[var6] = param2.a(0, pk.a((byte) -24, var18), var19, var13);
                                          break L15;
                                        } else {
                                          var13[var14] = pk.a((byte) -24, var11[var14]);
                                          var14++;
                                          if (var15 != 0) {
                                            break L15;
                                          } else {
                                            continue L14;
                                          }
                                        }
                                      }
                                      var5_ref.field_u[var6] = var20;
                                      break L5;
                                    }
                                  } else {
                                    var11[var12_int] = param1.d(-1);
                                    var12_int++;
                                    if (var15 != 0) {
                                      break L5;
                                    } else {
                                      continue L10;
                                    }
                                  }
                                }
                              }
                              decompiledRegionSelector0 = 1;
                              break L4;
                            }
                          }
                        } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L16: {
                            var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                            var5_ref.field_k[var6] = -1;
                            decompiledRegionSelector0 = 1;
                            break L16;
                          }
                        } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L17: {
                            var7_ref = (SecurityException) (Object) decompiledCaughtException;
                            var5_ref.field_k[var6] = -2;
                            decompiledRegionSelector0 = 1;
                            break L17;
                          }
                        } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                          decompiledCaughtException = decompiledCaughtParameter2;
                          L18: {
                            var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                            var5_ref.field_k[var6] = -3;
                            decompiledRegionSelector0 = 1;
                            break L18;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter3) {
                          decompiledCaughtException = decompiledCaughtParameter3;
                          L19: {
                            var7_ref3 = (Exception) (Object) decompiledCaughtException;
                            var5_ref.field_k[var6] = -4;
                            decompiledRegionSelector0 = 1;
                            break L19;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter4) {
                          decompiledCaughtException = decompiledCaughtParameter4;
                          L20: {
                            var7_ref4 = decompiledCaughtException;
                            var5_ref.field_k[var6] = -5;
                            decompiledRegionSelector0 = 1;
                            break L20;
                          }
                        }
                        if (decompiledRegionSelector0 == 0) {
                          break L2;
                        } else {
                          var6++;
                          if (var15 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    qr.field_c.a((ms) (var5_ref), (byte) 39);
                    break L2;
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L21: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) (var4);
                stackOut_43_1 = new StringBuilder().append("ro.K(").append(param0).append(',');
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param1 == null) {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L21;
                } else {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L21;
                }
              }
              L22: {
                stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param2 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L22;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L22;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        int discarded$0 = 0;
        ks.field_x = fw.c(false);
        rf.field_a = new dg();
        sm.a((byte) 127, true, true);
        if (param0 != 246) {
            discarded$0 = ro.a(22, 45, -112, 42, -110, true, -91, 8, 90);
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_c = -79;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var9 = 0;
        L0: {
          param8 = param8 - param0;
          param3 = param3 - param0;
          param2 = param2 - param4;
          param6 = param6 - param4;
          if (param3 > param8) {
            if (param3 >= -param7) {
              if (param8 <= param7) {
                break L0;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            if (param8 >= -param7) {
              if (param3 <= param7) {
                break L0;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
        if (param6 > param2) {
          if (-param7 <= param6) {
            if (param7 >= param2) {
              L1: {
                var9 = -12 + rm.b(42, param7 >> -1319724769 ^ param7 | (param6 >> 1192438111 ^ param6 | (param2 ^ param2 >> 872310591 | param8 >> 2056917695 ^ param8 | param3 ^ param3 >> 1388706335)));
                if (var9 > 0) {
                  param3 = param3 >> var9;
                  param2 = param2 >> var9;
                  param7 = param7 >> var9;
                  param6 = param6 >> var9;
                  param8 = param8 >> var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (!param5) {
                if ((param7 ^ -1) >= -1) {
                  return -1;
                } else {
                  var9 = param7 * param7;
                  if (param8 * param8 + param2 * param2 < var9) {
                    if (param6 * param6 + param3 * param3 >= var9) {
                      param6 = param6 - param2;
                      param3 = param3 - param8;
                      return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                    } else {
                      return 1 + (1 << param1);
                    }
                  } else {
                    param6 = param6 - param2;
                    param3 = param3 - param8;
                    return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                  }
                }
              } else {
                discarded$2 = ro.a(67, -70, -24, 44, 33, true, -93, 8, -123);
                if ((param7 ^ -1) >= -1) {
                  return -1;
                } else {
                  var9 = param7 * param7;
                  if (param8 * param8 + param2 * param2 < var9) {
                    if (param6 * param6 + param3 * param3 < var9) {
                      return 1 + (1 << param1);
                    } else {
                      param6 = param6 - param2;
                      param3 = param3 - param8;
                      return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                    }
                  } else {
                    param6 = param6 - param2;
                    param3 = param3 - param8;
                    return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                  }
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          if (-param7 <= param2) {
            if (param7 >= param6) {
              L2: {
                var9 = -12 + rm.b(42, param7 >> -1319724769 ^ param7 | (param6 >> 1192438111 ^ param6 | (param2 ^ param2 >> 872310591 | param8 >> 2056917695 ^ param8 | param3 ^ param3 >> 1388706335)));
                if (var9 > 0) {
                  param3 = param3 >> var9;
                  param2 = param2 >> var9;
                  param7 = param7 >> var9;
                  param6 = param6 >> var9;
                  param8 = param8 >> var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (!param5) {
                if ((param7 ^ -1) >= -1) {
                  return -1;
                } else {
                  var9 = param7 * param7;
                  if (param8 * param8 + param2 * param2 < var9) {
                    if (param6 * param6 + param3 * param3 < var9) {
                      return 1 + (1 << param1);
                    } else {
                      param6 = param6 - param2;
                      param3 = param3 - param8;
                      return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                    }
                  } else {
                    param6 = param6 - param2;
                    param3 = param3 - param8;
                    return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                  }
                }
              } else {
                discarded$3 = ro.a(67, -70, -24, 44, 33, true, -93, 8, -123);
                if ((param7 ^ -1) >= -1) {
                  return -1;
                } else {
                  var9 = param7 * param7;
                  if (param8 * param8 + param2 * param2 < var9) {
                    if (param6 * param6 + param3 * param3 >= var9) {
                      param6 = param6 - param2;
                      param3 = param3 - param8;
                      return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                    } else {
                      return 1 + (1 << param1);
                    }
                  } else {
                    param6 = param6 - param2;
                    param3 = param3 - param8;
                    return vt.a(-var9 + param2 * param2 + param8 * param8, -103, param2 * param6 + param8 * param3 << 1407911617, param6 * param6 + param3 * param3 << 423050401, param1);
                  }
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final void a(pj param0, byte param1) {
        int discarded$0 = 0;
        try {
            if (param0.field_o != null) {
                param0.c(-5106);
            }
            param0.field_o = this.field_e.field_o;
            if (param1 > -100) {
                discarded$0 = this.a((byte) 78);
            }
            param0.field_m = this.field_e;
            param0.field_o.field_m = param0;
            param0.field_m.field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ro.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final pj a(int param0) {
        pj var2 = null;
        var2 = this.field_e.field_m;
        if (param0 >= 8) {
          if (this.field_e == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_m;
            return var2;
          }
        } else {
          this.field_e = (pj) null;
          if (this.field_e == var2) {
            this.field_b = null;
            return null;
          } else {
            this.field_b = var2.field_m;
            return var2;
          }
        }
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
        pj var2 = null;
        if (param0 == 72) {
          var2 = this.field_e.field_m;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.c(-5106);
            return var2;
          }
        } else {
          return (pj) null;
        }
    }

    final static void a(ah param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                ct.a(6510, param0);
                tq.a((byte) -106, param0);
                if (param0.field_P != 0) {
                  break L2;
                } else {
                  if (!param0.field_R) {
                    break L2;
                  } else {
                    ew.field_e = ew.field_e + 1;
                    if (ps.field_e[9] == ew.field_e) {
                      th.b(24753, 246, 9);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("ro.J(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
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
        pj var2 = null;
        if (param0 == 126) {
          var2 = this.field_e.field_o;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.c(param0 + -5232);
            return var2;
          }
        } else {
          this.field_e = (pj) null;
          var2 = this.field_e.field_o;
          if (var2 == this.field_e) {
            return null;
          } else {
            var2.c(param0 + -5232);
            return var2;
          }
        }
    }

    public ro() {
        this.field_e = new pj();
        this.field_e.field_o = this.field_e;
        this.field_e.field_m = this.field_e;
    }

    static {
    }
}
