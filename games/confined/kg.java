/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kg extends rk {
    int field_n;
    byte[] field_m;
    static em field_o;

    public static void d(int param0) {
        if (param0 != -4) {
            return;
        }
        try {
            field_o = null;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.V(" + param0 + 41);
        }
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 31) {
                break L1;
              } else {
                ((kg) this).a(-65, 97);
                break L1;
              }
            }
            ((kg) this).field_n = ((kg) this).field_n + 4;
            stackOut_3_0 = (((kg) this).field_m[((kg) this).field_n - 1] & 255) + (((((kg) this).field_m[-4 + ((kg) this).field_n] & 255) << 24) + (((kg) this).field_m[((kg) this).field_n + -3] << 16 & 16711680)) - -(((kg) this).field_m[((kg) this).field_n - 2] << 8 & 65280);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.J(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 58) {
                break L1;
              } else {
                ((kg) this).a(0L, -124);
                break L1;
              }
            }
            var5_int = param0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int >= param0 - -param2) {
                    break L4;
                  } else {
                    int fieldTemp$2 = ((kg) this).field_n;
                    ((kg) this).field_n = ((kg) this).field_n + 1;
                    param3[var5_int] = ((kg) this).field_m[fieldTemp$2];
                    var5_int++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("kg.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static void i(byte param0) {
        RuntimeException var1 = null;
        hb var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        fg var5_ref = null;
        fg var6 = null;
        String var6_ref = null;
        String var7 = null;
        fg var7_ref = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        fg stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        fg stackIn_47_2 = null;
        fg stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        fg stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        fg stackOut_46_2 = null;
        fg stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        fg stackOut_55_2 = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1_ref = e.field_c;
            var2 = var1_ref.c(param0 + 84);
            if (0 != var2) {
              if (1 != var2) {
                if (2 == var2) {
                  L1: {
                    if (1 != rk.field_d) {
                      break L1;
                    } else {
                      rk.field_d = 2;
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (var2 == 3) {
                    L2: {
                      if (rk.field_d != 2) {
                        break L2;
                      } else {
                        rk.field_d = 1;
                        break L2;
                      }
                    }
                    return;
                  } else {
                    if (var2 == 4) {
                      rk.field_d = 1;
                      var3 = var1_ref.d(true);
                      ql.field_t = var3.intern();
                      var4 = var1_ref.c(param0 ^ -20);
                      tm.a(-127, var4);
                      return;
                    } else {
                      mb.a("F1: " + ui.a(10), true, (Throwable) null);
                      if (param0 == -52) {
                        dc.d(111);
                        break L0;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                L3: {
                  if (v.field_Db == null) {
                    v.field_Db = new pb(128);
                    c.field_k = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var3 = var1_ref.d(true);
                  if (!var3.equals((Object) (Object) "")) {
                    break L4;
                  } else {
                    var3 = null;
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1_ref.d(true);
                  var5 = var1_ref.d(true);
                  var6 = pm.a(var4_ref_String, true);
                  if (var6 == null) {
                    var6 = pm.a(var5, true);
                    if (var6 == null) {
                      break L5;
                    } else {
                      v.field_Db.a((long)hh.a(0, (CharSequence) (Object) var4_ref_String).hashCode(), (jl) (Object) var6, 123);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var6 != null) {
                    break L6;
                  } else {
                    var6 = new fg();
                    v.field_Db.a((long)hh.a(0, (CharSequence) (Object) var4_ref_String).hashCode(), (jl) (Object) var6, 117);
                    int fieldTemp$3 = c.field_k;
                    c.field_k = c.field_k + 1;
                    var6.field_lb = fieldTemp$3;
                    il.field_fb.a((rk) (Object) var6, (byte) -103);
                    break L6;
                  }
                }
                L7: {
                  if (null == var3) {
                    break L7;
                  } else {
                    var3 = var3.intern();
                    break L7;
                  }
                }
                var6.field_kb = var3;
                var6.field_ob = var4_ref_String;
                var6.a(true);
                var7_ref = (fg) (Object) il.field_fb.a(56);
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        if (var7_ref == null) {
                          break L11;
                        } else {
                          stackOut_46_0 = (fg) var6;
                          stackOut_46_1 = 200;
                          stackOut_46_2 = (fg) var7_ref;
                          stackIn_57_0 = stackOut_46_0;
                          stackIn_57_1 = stackOut_46_1;
                          stackIn_57_2 = stackOut_46_2;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          if (var8 != 0) {
                            break L10;
                          } else {
                            if (!tb.a(stackIn_47_0, stackIn_47_1, stackIn_47_2)) {
                              break L11;
                            } else {
                              var7_ref = (fg) (Object) il.field_fb.d(param0 ^ -2169);
                              if (var8 == 0) {
                                continue L8;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                      L12: {
                        if (var7_ref != null) {
                          break L12;
                        } else {
                          il.field_fb.a((rk) (Object) var6, (byte) 89);
                          if (var8 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      stackOut_55_0 = (fg) var7_ref;
                      stackOut_55_1 = param0 ^ -52;
                      stackOut_55_2 = (fg) var6;
                      stackIn_57_0 = stackOut_55_0;
                      stackIn_57_1 = stackOut_55_1;
                      stackIn_57_2 = stackOut_55_2;
                      break L10;
                    }
                    ri.a((rk) (Object) stackIn_57_0, stackIn_57_1, (rk) (Object) stackIn_57_2);
                    break L9;
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (null != ij.field_t) {
                  break L13;
                } else {
                  ij.field_t = new pb(128);
                  Confined.field_E = 0;
                  break L13;
                }
              }
              L14: {
                if (1 != var1_ref.c(32)) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L14;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1_ref.d(true);
                if (var3_int != 0) {
                  String discarded$4 = var1_ref.d(true);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var5_ref = nh.a(var4_ref_String, 0);
                var6_ref = var1_ref.d(true);
                var7 = hh.a(0, (CharSequence) (Object) var4_ref_String);
                if (null != var7) {
                  break L16;
                } else {
                  var7 = var4_ref_String;
                  break L16;
                }
              }
              L17: {
                if (var5_ref != null) {
                  break L17;
                } else {
                  var5_ref = nh.a(var6_ref, 0);
                  if (null == var5_ref) {
                    break L17;
                  } else {
                    ij.field_t.a((long)var7.hashCode(), (jl) (Object) var5_ref, 117);
                    break L17;
                  }
                }
              }
              L18: {
                if (null != var5_ref) {
                  break L18;
                } else {
                  var5_ref = new fg();
                  ij.field_t.a((long)var7.hashCode(), (jl) (Object) var5_ref, param0 ^ -71);
                  int fieldTemp$5 = Confined.field_E;
                  Confined.field_E = Confined.field_E + 1;
                  var5_ref.field_lb = fieldTemp$5;
                  vg.field_J.a((rk) (Object) var5_ref, (byte) -97);
                  break L18;
                }
              }
              var5_ref.field_ob = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "kg.L(" + param0 + 41);
        }
    }

    private final void b(long param0, int param1) {
        int fieldTemp$0 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$0] = (byte)(int)(param0 >> 48);
        int fieldTemp$1 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$1] = (byte)(int)(param0 >> 40);
        int fieldTemp$2 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$2] = (byte)(int)(param0 >> 32);
        int fieldTemp$3 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$3] = (byte)(int)(param0 >> 24);
        int fieldTemp$4 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$4] = (byte)(int)(param0 >> 16);
        if (param1 != 17526) {
            return;
        }
        try {
            int fieldTemp$5 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$5] = (byte)(int)(param0 >> 8);
            int fieldTemp$6 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$6] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.T(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
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
            if (param1 > 24) {
              var3_int = param0.indexOf(' ');
              if (var3_int >= 0) {
                throw new IllegalArgumentException("");
              } else {
                int fieldTemp$6 = ((kg) this).field_n;
                ((kg) this).field_n = ((kg) this).field_n + 1;
                ((kg) this).field_m[fieldTemp$6] = (byte) 0;
                ((kg) this).field_n = ((kg) this).field_n + ve.a(((kg) this).field_m, (byte) -116, (CharSequence) (Object) param0, 0, ((kg) this).field_n, param0.length());
                int fieldTemp$7 = ((kg) this).field_n;
                ((kg) this).field_n = ((kg) this).field_n + 1;
                ((kg) this).field_m[fieldTemp$7] = (byte) 0;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("kg.HA(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4_int = ((kg) this).field_n;
            ((kg) this).field_n = 0;
            var5 = new byte[var4_int];
            ((kg) this).a(0, (byte) 77, var4_int, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param0);
            var8 = var7.toByteArray();
            ((kg) this).field_n = 0;
            ((kg) this).c(var8.length, 8);
            ((kg) this).a(var8.length, param1, var8, 115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kg.F(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void d(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              int fieldTemp$8 = ((kg) this).field_n;
              ((kg) this).field_n = ((kg) this).field_n + 1;
              ((kg) this).field_m[fieldTemp$8] = (byte)(param1 >> 24);
              if (param0 < -81) {
                break L1;
              } else {
                ((kg) this).field_n = -111;
                break L1;
              }
            }
            int fieldTemp$9 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$9] = (byte)(param1 >> 16);
            int fieldTemp$10 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$10] = (byte)(param1 >> 8);
            int fieldTemp$11 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$11] = (byte)param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "kg.S(" + param0 + 44 + param1 + 41);
        }
    }

    final int k(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -11) {
              var2_int = 255 & ((kg) this).field_m[((kg) this).field_n];
              if (var2_int < 128) {
                stackOut_6_0 = ((kg) this).c(32);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = ((kg) this).a((byte) 25) + -32768;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.CA(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              ((kg) this).field_n = ((kg) this).field_n + 3;
              if (param0 < -40) {
                break L1;
              } else {
                ((kg) this).field_m = null;
                break L1;
              }
            }
            stackOut_3_0 = (255 & ((kg) this).field_m[((kg) this).field_n + -1]) + (16711680 & ((kg) this).field_m[((kg) this).field_n - 3] << 16) - -((((kg) this).field_m[-2 + ((kg) this).field_n] & 255) << 8);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.IA(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 1647) {
                break L1;
              } else {
                ((kg) this).field_m = null;
                break L1;
              }
            }
            var2_int = ((kg) this).field_m[((kg) this).field_n] & 255;
            if (var2_int < 128) {
              stackOut_6_0 = -64 + ((kg) this).c(32);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = ((kg) this).a((byte) 25) + -49152;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.DA(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    final void a(String param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var3_int = param0.indexOf(' ');
            if (0 <= var3_int) {
              throw new IllegalArgumentException("");
            } else {
              ((kg) this).field_n = ((kg) this).field_n + ve.a(((kg) this).field_m, (byte) -116, (CharSequence) (Object) param0, 0, ((kg) this).field_n, param0.length());
              var4 = -86 % ((param1 - 58) / 63);
              int fieldTemp$3 = ((kg) this).field_n;
              ((kg) this).field_n = ((kg) this).field_n + 1;
              ((kg) this).field_m[fieldTemp$3] = (byte) 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("kg.JA(");
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final void c(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                ((kg) this).a(98, (byte) -62, -35, (byte[]) null);
                break L1;
              }
            }
            int fieldTemp$4 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$4] = (byte)(param0 >> 8);
            int fieldTemp$5 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$5] = (byte)param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "kg.LA(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, int param1) {
        try {
            int fieldTemp$0 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$0] = (byte)(param1 >> 16);
            int var3_int = 24 / ((71 - param0) / 48);
            int fieldTemp$1 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$1] = (byte)(param1 >> 8);
            int fieldTemp$2 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$2] = (byte)param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.G(" + param0 + 44 + param1 + 41);
        }
    }

    final void b(int param0, int param1) {
        ((kg) this).field_m[-2 + (((kg) this).field_n + -param0)] = (byte)(param0 >> 8);
        if (param1 >= -8) {
            return;
        }
        try {
            ((kg) this).field_m[-1 + (((kg) this).field_n - param0)] = (byte)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.U(" + param0 + 44 + param1 + 41);
        }
    }

    final int j(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var2_int = -103 % ((param0 - 47) / 51);
            if (((kg) this).field_m[((kg) this).field_n] >= 0) {
              stackOut_3_0 = ((kg) this).a((byte) 25);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = ((kg) this).f((byte) 37) & 2147483647;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.AA(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 15) {
                break L1;
              } else {
                ((kg) this).field_m = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (param0 <= ((kg) this).field_n) {
                    break L4;
                  } else {
                    int fieldTemp$2 = ((kg) this).field_n;
                    ((kg) this).field_n = ((kg) this).field_n + 1;
                    ((kg) this).field_m[fieldTemp$2] = (byte) 0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "kg.EA(" + param0 + 44 + param1 + 41);
        }
    }

    final long h(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_3_0 = 0L;
        long stackOut_1_0 = 0L;
        try {
          L0: {
            var2_long = 4294967295L & (long)((kg) this).f((byte) 79);
            var4 = 4294967295L & (long)((kg) this).f((byte) 124);
            if (param0 == -68) {
              stackOut_3_0 = var4 + (var2_long << 32);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 94L;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.BA(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(long param0, byte param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            int fieldTemp$8 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$8] = (byte)(int)(param0 >> 56);
            int fieldTemp$9 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$9] = (byte)(int)(param0 >> 48);
            int fieldTemp$10 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$10] = (byte)(int)(param0 >> 40);
            int fieldTemp$11 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$11] = (byte)(int)(param0 >> 32);
            var4_int = -85 / ((param1 - 40) / 62);
            int fieldTemp$12 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$12] = (byte)(int)(param0 >> 24);
            int fieldTemp$13 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$13] = (byte)(int)(param0 >> 16);
            int fieldTemp$14 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$14] = (byte)(int)(param0 >> 8);
            int fieldTemp$15 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$15] = (byte)(int)param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var4, "kg.H(" + param0 + 44 + param1 + 41);
        }
    }

    final void f(int param0, int param1) {
        try {
            int fieldTemp$0 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$0] = (byte)param1;
            if (param0 < 85) {
                field_o = null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.Q(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ((kg) this).field_n / 8;
              ((kg) this).field_n = 0;
              if (param0 == 65280) {
                break L1;
              } else {
                ((kg) this).field_n = 94;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var4 <= ~var3_int) {
                    break L4;
                  } else {
                    var5 = ((kg) this).f((byte) 47);
                    var6 = ((kg) this).f((byte) 56);
                    var7 = 0;
                    var8 = -1640531527;
                    if (var10 != 0) {
                      break L3;
                    } else {
                      var9 = 32;
                      L5: while (true) {
                        L6: {
                          L7: {
                            int incrementValue$1 = var9;
                            var9--;
                            if (incrementValue$1 <= 0) {
                              break L7;
                            } else {
                              var5 = var5 + (var7 - -param1[var7 & 3] ^ var6 + (var6 << 4 ^ var6 >>> 5));
                              var7 = var7 + var8;
                              var6 = var6 + (var5 + (var5 >>> 5 ^ var5 << 4) ^ var7 + param1[var7 >>> 11 & 526385155]);
                              if (var10 != 0) {
                                break L6;
                              } else {
                                if (var10 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          ((kg) this).field_n = ((kg) this).field_n - 8;
                          ((kg) this).d(-127, var5);
                          ((kg) this).d(-102, var6);
                          var4++;
                          break L6;
                        }
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("kg.W(").append(param0).append(44);
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 64) {
              break L0;
            } else {
              if (param1 < -64) {
                break L0;
              } else {
                ((kg) this).f(95, param1 + 64);
                return;
              }
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              ((kg) this).f(-33, 34);
              break L1;
            }
          }
          L2: {
            if (param1 >= 16384) {
              break L2;
            } else {
              if (param1 >= -16384) {
                ((kg) this).c(param1 + 49152, 8);
                return;
              } else {
                break L2;
              }
            }
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "kg.R(" + param0 + 44 + param1 + 41);
        }
    }

    final String e(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 102) {
              if (0 != ((kg) this).field_m[((kg) this).field_n]) {
                stackOut_6_0 = ((kg) this).d(true);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                ((kg) this).field_n = ((kg) this).field_n + 1;
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.I(" + param0 + 41);
        }
        return stackIn_7_0;
    }

    final void a(int param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var13 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = ((kg) this).field_n;
              if (param3 == 72) {
                break L1;
              } else {
                ((kg) this).field_n = 49;
                break L1;
              }
            }
            ((kg) this).field_n = param0;
            var6 = (param2 - param0) / 8;
            var7 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 <= var7) {
                    break L4;
                  } else {
                    var8 = ((kg) this).f((byte) 84);
                    var9 = ((kg) this).f((byte) 51);
                    var10 = -957401312;
                    var11 = -1640531527;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      var12 = 32;
                      L5: while (true) {
                        L6: {
                          L7: {
                            int incrementValue$1 = var12;
                            var12--;
                            if (0 >= incrementValue$1) {
                              break L7;
                            } else {
                              var9 = var9 - (var10 - -param1[(var10 & 7121) >>> 11] ^ (var8 << 4 ^ var8 >>> 5) + var8);
                              var10 = var10 - var11;
                              var8 = var8 - (param1[var10 & 3] + var10 ^ var9 + (var9 << 4 ^ var9 >>> 5));
                              if (var13 != 0) {
                                break L6;
                              } else {
                                if (var13 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          ((kg) this).field_n = ((kg) this).field_n - 8;
                          ((kg) this).d(-107, var8);
                          ((kg) this).d(-115, var9);
                          var7++;
                          break L6;
                        }
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                ((kg) this).field_n = var5_int;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("kg.C(").append(param0).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, String param1) {
        RuntimeException var3 = null;
        long var3_long = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var10 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var3_long = 0L;
            var5 = 0L;
            var7 = param1.length();
            var8 = 19;
            L1: while (true) {
              L2: {
                L3: {
                  if (var8 < 0) {
                    break L3;
                  } else {
                    var3_long = var3_long * 38L;
                    stackOut_3_0 = ~var8;
                    stackOut_3_1 = ~var7;
                    stackIn_31_0 = stackOut_3_0;
                    stackIn_31_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 <= stackIn_4_1) {
                          break L4;
                        } else {
                          L5: {
                            var9 = param1.charAt(var8);
                            if (var9 < 65) {
                              break L5;
                            } else {
                              if (var9 > 90) {
                                break L5;
                              } else {
                                var3_long = var3_long + (long)(-65 + (var9 + 2));
                                if (var10 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          L6: {
                            L7: {
                              if (var9 < 97) {
                                break L7;
                              } else {
                                if (var9 <= 122) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (var9 < 48) {
                                break L8;
                              } else {
                                if (var9 > 57) {
                                  break L8;
                                } else {
                                  var3_long = var3_long + (long)(-20 - -var9);
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            var3_long = var3_long + 1L;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                          var3_long = var3_long + (long)(-95 + var9);
                          break L4;
                        }
                      }
                      L9: {
                        if (var8 != 10) {
                          break L9;
                        } else {
                          var5 = var3_long;
                          var3_long = 0L;
                          break L9;
                        }
                      }
                      var8--;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_30_0 = param0;
                stackOut_30_1 = 11404;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                break L2;
              }
              if (stackIn_31_0 == stackIn_31_1) {
                this.b(var3_long, 17526);
                this.b(var5, param0 ^ 26874);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("kg.KA(").append(param0).append(44);
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 41);
        }
    }

    final boolean e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            ((kg) this).field_n = ((kg) this).field_n - param0;
            var2_int = ah.a(((kg) this).field_m, 0, ((kg) this).field_n, (byte) 68);
            var3 = ((kg) this).f((byte) 36);
            if (~var2_int != ~var3) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.K(" + param0 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final String d(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_10_0 = null;
        String stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        try {
          L0: {
            var2_int = ((kg) this).field_n;
            L1: while (true) {
              int fieldTemp$2 = ((kg) this).field_n;
              ((kg) this).field_n = ((kg) this).field_n + 1;
              if (((kg) this).field_m[fieldTemp$2] == 0) {
                var3 = -var2_int + (((kg) this).field_n - 1);
                if (param0) {
                  if (0 != var3) {
                    stackOut_10_0 = kh.a(((kg) this).field_m, var3, 0, var2_int);
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    stackOut_8_0 = "";
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                } else {
                  stackOut_5_0 = null;
                  stackIn_6_0 = stackOut_5_0;
                  return (String) (Object) stackIn_6_0;
                }
              } else {
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.GA(" + param0 + 41);
        }
        return stackIn_11_0;
    }

    final byte b(boolean param0) {
        RuntimeException var2 = null;
        byte stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            int fieldTemp$2 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            stackOut_3_0 = ((kg) this).field_m[fieldTemp$2];
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.D(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 58) {
                break L1;
              } else {
                ((kg) this).a(60, (byte) -116);
                break L1;
              }
            }
            var5_int = param1;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var5_int <= ~(param0 + param1)) {
                    break L4;
                  } else {
                    int fieldTemp$2 = ((kg) this).field_n;
                    ((kg) this).field_n = ((kg) this).field_n + 1;
                    ((kg) this).field_m[fieldTemp$2] = param2[var5_int];
                    var5_int++;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("kg.FA(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param3 + 41);
        }
    }

    final static void c(boolean param0) {
        try {
            ac.a(param0);
            vl.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.A(" + param0 + 41);
        }
    }

    kg(int param0) {
        try {
            ((kg) this).field_n = 0;
            ((kg) this).field_m = dl.a(param0, -101);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.<init>(" + param0 + 41);
        }
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                int discarded$4 = ((kg) this).e(84, -126);
                break L1;
              }
            }
            int fieldTemp$5 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            stackOut_3_0 = ((kg) this).field_m[fieldTemp$5] & 255;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.M(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final void a(long param0, int param1) {
        int fieldTemp$0 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$0] = (byte)(int)(param0 >> 32);
        int fieldTemp$1 = ((kg) this).field_n;
        ((kg) this).field_n = ((kg) this).field_n + 1;
        ((kg) this).field_m[fieldTemp$1] = (byte)(int)(param0 >> 24);
        if (param1 != 8850) {
            return;
        }
        try {
            int fieldTemp$2 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$2] = (byte)(int)(param0 >> 16);
            int fieldTemp$3 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$3] = (byte)(int)(param0 >> 8);
            int fieldTemp$4 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            ((kg) this).field_m[fieldTemp$4] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kg.B(" + param0 + 44 + param1 + 41);
        }
    }

    kg(byte[] param0) {
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
            ((kg) this).field_n = 0;
            ((kg) this).field_m = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("kg.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              ((kg) this).field_n = ((kg) this).field_n + 2;
              if (param0 == 25) {
                break L1;
              } else {
                ((kg) this).field_m = null;
                break L1;
              }
            }
            stackOut_3_0 = (((kg) this).field_m[((kg) this).field_n + -2] << 8 & 65280) + (((kg) this).field_m[((kg) this).field_n - 1] & 255);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.O(" + param0 + 41);
        }
        return stackIn_4_0;
    }

    final int e(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = ah.a(((kg) this).field_m, param1, ((kg) this).field_n, (byte) 121);
            if (param0 == 26199) {
              ((kg) this).d(param0 ^ -26114, var3_int);
              stackOut_3_0 = var3_int;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -53;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "kg.N(" + param0 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final String g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_16_0 = null;
        try {
          L0: {
            int fieldTemp$4 = ((kg) this).field_n;
            ((kg) this).field_n = ((kg) this).field_n + 1;
            var2_int = ((kg) this).field_m[fieldTemp$4];
            if (var2_int != 0) {
              throw new IllegalStateException("");
            } else {
              var3 = ((kg) this).field_n;
              L1: while (true) {
                int fieldTemp$5 = ((kg) this).field_n;
                ((kg) this).field_n = ((kg) this).field_n + 1;
                if (((kg) this).field_m[fieldTemp$5] == 0) {
                  L2: {
                    if (param0 == 31) {
                      break L2;
                    } else {
                      ((kg) this).field_m = null;
                      break L2;
                    }
                  }
                  var4 = -1 + (((kg) this).field_n + -var3);
                  if (0 == var4) {
                    stackOut_14_0 = "";
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    stackOut_16_0 = kh.a(((kg) this).field_m, var4, 0, var3);
                    stackIn_17_0 = stackOut_16_0;
                    break L0;
                  }
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2, "kg.P(" + param0 + 41);
        }
        return stackIn_17_0;
    }

    final void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 25859) {
                break L1;
              } else {
                kg.c(false);
                break L1;
              }
            }
            ((kg) this).field_m[((kg) this).field_n + (-param1 - 1)] = (byte)param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var3, "kg.MA(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = null;
    }
}
