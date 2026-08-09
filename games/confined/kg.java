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
            throw sd.a((Throwable) ((Object) runtimeException), "kg.V(" + param0 + ')');
        }
    }

    final int f(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 31) {
                break L1;
              } else {
                this.a(-65, 97);
                break L1;
              }
            }
            this.field_n = this.field_n + 4;
            stackIn_4_0 = (this.field_m[this.field_n - 1] & 255) + (((this.field_m[-4 + this.field_n] & 255) << 66763768) + (this.field_m[this.field_n + -3] << -1741991600 & 16711680)) - -(this.field_m[this.field_n - 2] << -1539204536 & 65280);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.J(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, byte param1, int param2, byte[] param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 > 58) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(0L, -124);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5_int >= param0 - -param2) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        fieldTemp$1 = this.field_n;
                        this.field_n = this.field_n + 1;
                        param3[var5_int] = this.field_m[fieldTemp$1];
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var5);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("kg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_12_1 = stackIn_14_1;
                    if (param3 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void i(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_11_0 = 0;
        fg stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        fg stackIn_57_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hb var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        fg var5_ref = null;
        fg var6 = null;
        String var6_ref = null;
        fg var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1 = e.field_c;
            var2 = var1.c(param0 + 84);
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
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var2 == 3) {
                    L2: {
                      if (-3 != (rk.field_d ^ -1)) {
                        break L2;
                      } else {
                        rk.field_d = 1;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-5 == (var2 ^ -1)) {
                      rk.field_d = 1;
                      var3 = var1.d(true);
                      ql.field_t = ((String) (var3)).intern();
                      var4 = var1.c(param0 ^ -20);
                      tm.a(-127, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      mb.a("F1: " + ui.a(10), true, (Throwable) null);
                      if (param0 == -52) {
                        dc.d(111);
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 5;
                        break L0;
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
                  var3 = var1.d(true);
                  if (!((String) (var3)).equals("")) {
                    break L4;
                  } else {
                    var3 = null;
                    break L4;
                  }
                }
                L5: {
                  var4_ref_String = var1.d(true);
                  var5 = var1.d(true);
                  var6 = pm.a(var4_ref_String, true);
                  if (var6 == null) {
                    var6 = pm.a(var5, true);
                    if (var6 == null) {
                      break L5;
                    } else {
                      v.field_Db.a((long)hh.a(0, (CharSequence) ((Object) var4_ref_String)).hashCode(), var6, 123);
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
                    v.field_Db.a((long)hh.a(0, (CharSequence) ((Object) var4_ref_String)).hashCode(), var6, 117);
                    fieldTemp$0 = c.field_k;
                    c.field_k = c.field_k + 1;
                    var6.field_lb = fieldTemp$0;
                    il.field_fb.a((rk) (var6), (byte) -103);
                    break L6;
                  }
                }
                L7: {
                  if (null == var3) {
                    break L7;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L7;
                  }
                }
                var6.field_kb = (String) (var3);
                var6.field_ob = var4_ref_String;
                var6.a(true);
                var7 = (fg) ((Object) il.field_fb.a(56));
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        if (var7 == null) {
                          break L11;
                        } else {
                          stackIn_57_0 = (fg) (var6);

                          stackIn_57_1 = 200;

                          stackIn_57_2 = (fg) (var7);

                          if (var8 != 0) {
                            break L10;
                          } else {
                            if (!tb.a(stackIn_57_0, stackIn_57_1, stackIn_57_2)) {
                              break L11;
                            } else {
                              var7 = (fg) ((Object) il.field_fb.d(param0 ^ -2169));
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
                        if (var7 != null) {
                          break L12;
                        } else {
                          il.field_fb.a((rk) (var6), (byte) 89);
                          if (var8 == 0) {
                            break L9;
                          } else {
                            break L12;
                          }
                        }
                      }
                      stackIn_57_0 = (fg) (var7);
                      stackIn_57_1 = param0 ^ -52;
                      stackIn_57_2 = (fg) (var6);
                      break L10;
                    }
                    ri.a(stackIn_57_0, stackIn_57_1, stackIn_57_2);
                    break L9;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
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
                if (1 != var1.c(32)) {
                  stackIn_11_0 = 0;
                  break L14;
                } else {
                  stackIn_11_0 = 1;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1.d(true);
                if (var3_int != 0) {
                  var1.d(true);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var5_ref = nh.a(var4_ref_String, 0);
                var6_ref = var1.d(true);
                var7_ref = hh.a(0, (CharSequence) ((Object) var4_ref_String));
                if (null != var7_ref) {
                  break L16;
                } else {
                  var7_ref = var4_ref_String;
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
                    ij.field_t.a((long)var7_ref.hashCode(), var5_ref, 117);
                    break L17;
                  }
                }
              }
              L18: {
                if (null != var5_ref) {
                  break L18;
                } else {
                  var5_ref = new fg();
                  ij.field_t.a((long)var7_ref.hashCode(), var5_ref, param0 ^ -71);
                  fieldTemp$1 = Confined.field_E;
                  Confined.field_E = Confined.field_E + 1;
                  var5_ref.field_lb = fieldTemp$1;
                  vg.field_J.a((rk) (var5_ref), (byte) -97);
                  break L18;
                }
              }
              var5_ref.field_ob = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1_ref), "kg.L(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    private final void b(long param0, int param1) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$0] = (byte)(int)(param0 >> -185897040);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$1] = (byte)(int)(param0 >> -1918586712);
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$2] = (byte)(int)(param0 >> -477576864);
        int fieldTemp$3 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$3] = (byte)(int)(param0 >> 2063400408);
        int fieldTemp$4 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$4] = (byte)(int)(param0 >> -196409584);
        if (param1 != 17526) {
            return;
        }
        try {
            fieldTemp$5 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$5] = (byte)(int)(param0 >> -304845752);
            fieldTemp$6 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$6] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(String param0, byte param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 24) {
              var3_int = param0.indexOf(' ');
              if ((var3_int ^ -1) <= -1) {
                throw new IllegalArgumentException("");
              } else {
                fieldTemp$4 = this.field_n;
                this.field_n = this.field_n + 1;
                this.field_m[fieldTemp$4] = (byte) 0;
                this.field_n = this.field_n + ve.a(this.field_m, (byte) -116, (CharSequence) ((Object) param0), 0, this.field_n, param0.length());
                fieldTemp$5 = this.field_n;
                this.field_n = this.field_n + 1;
                this.field_m[fieldTemp$5] = (byte) 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("kg.HA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        byte[] var5 = null;
        java.math.BigInteger var6 = null;
        java.math.BigInteger var7 = null;
        byte[] var8 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = this.field_n;
            this.field_n = 0;
            var5 = new byte[var4_int];
            this.a(0, (byte) 77, var4_int, var5);
            var6 = new java.math.BigInteger(var5);
            var7 = var6.modPow(param2, param0);
            var8 = var7.toByteArray();
            this.field_n = 0;
            this.c(var8.length, 8);
            this.a(var8.length, param1, var8, 115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kg.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ')');
        }
    }

    final void d(int param0, int param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              fieldTemp$4 = this.field_n;
              this.field_n = this.field_n + 1;
              this.field_m[fieldTemp$4] = (byte)(param1 >> 2050146744);
              if (param0 < -81) {
                break L1;
              } else {
                this.field_n = -111;
                break L1;
              }
            }
            fieldTemp$5 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$5] = (byte)(param1 >> -4146832);
            fieldTemp$6 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$6] = (byte)(param1 >> -481940536);
            fieldTemp$7 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$7] = (byte)param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.S(" + param0 + ',' + param1 + ')');
        }
    }

    final int k(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -11) {
              var2_int = 255 & this.field_m[this.field_n];
              if ((var2_int ^ -1) > -129) {
                stackIn_7_0 = this.c(32);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = this.a((byte) 25) + -32768;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 6;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.CA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int f(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_n = this.field_n + 3;
              if (param0 < -40) {
                break L1;
              } else {
                this.field_m = (byte[]) null;
                break L1;
              }
            }
            stackIn_4_0 = (255 & this.field_m[this.field_n + -1]) + (16711680 & this.field_m[this.field_n - 3] << -1603816944) - -((this.field_m[-2 + this.field_n] & 255) << -1034845784);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.IA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1647) {
                break L1;
              } else {
                this.field_m = (byte[]) null;
                break L1;
              }
            }
            var2_int = this.field_m[this.field_n] & 255;
            if (var2_int < 128) {
              stackIn_7_0 = -64 + this.c(32);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = this.a((byte) 25) + -49152;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(String param0, int param1) {
        int fieldTemp$2 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param0.indexOf(' ');
            if (0 <= var3_int) {
              throw new IllegalArgumentException("");
            } else {
              this.field_n = this.field_n + ve.a(this.field_m, (byte) -116, (CharSequence) ((Object) param0), 0, this.field_n, param0.length());
              var4 = -86 % ((param1 - 58) / 63);
              fieldTemp$2 = this.field_n;
              this.field_n = this.field_n + 1;
              this.field_m[fieldTemp$2] = (byte) 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (runtimeException);

            stackIn_9_1 = new StringBuilder().append("kg.JA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final void c(int param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == 8) {
                break L1;
              } else {
                this.a(98, (byte) -62, -35, (byte[]) null);
                break L1;
              }
            }
            fieldTemp$2 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$2] = (byte)(param0 >> -419425656);
            fieldTemp$3 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$3] = (byte)param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        try {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$0] = (byte)(param1 >> 1391867152);
            int var3_int = 24 / ((71 - param0) / 48);
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$1] = (byte)(param1 >> -1634243864);
            fieldTemp$2 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$2] = (byte)param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_m[-2 + (this.field_n + -param0)] = (byte)(param0 >> -762683832);
        if (param1 >= -8) {
            return;
        }
        try {
            this.field_m[-1 + (this.field_n - param0)] = (byte)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.U(" + param0 + ',' + param1 + ')');
        }
    }

    final int j(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -103 % ((param0 - 47) / 51);
            if ((this.field_m[this.field_n] ^ -1) <= -1) {
              stackIn_4_0 = this.a((byte) 25);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = this.f((byte) 37) & 2147483647;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, byte param1) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 > 15) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_m = (byte[]) null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 <= this.field_n) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fieldTemp$1 = this.field_n;
                        this.field_n = this.field_n + 1;
                        this.field_m[fieldTemp$1] = (byte) 0;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw sd.a((Throwable) ((Object) var3), "kg.EA(" + param0 + ',' + param1 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final long h(byte param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = 4294967295L & (long)this.f((byte) 79);
            var4 = 4294967295L & (long)this.f((byte) 124);
            if (param0 == -68) {
              stackIn_4_0 = var4 + (var2_long << 521986272);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 94L;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.BA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(long param0, byte param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        try {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$0] = (byte)(int)(param0 >> 1157207480);
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$1] = (byte)(int)(param0 >> -545494096);
            fieldTemp$2 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$2] = (byte)(int)(param0 >> -605213976);
            fieldTemp$3 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$3] = (byte)(int)(param0 >> 1754237280);
            int var4_int = -85 / ((param1 - 40) / 62);
            fieldTemp$4 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$4] = (byte)(int)(param0 >> 594611736);
            fieldTemp$5 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$5] = (byte)(int)(param0 >> -907947184);
            fieldTemp$6 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$6] = (byte)(int)(param0 >> -1561113400);
            fieldTemp$7 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$7] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = 0;
        try {
            fieldTemp$0 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$0] = (byte)param1;
            if (param0 < 85) {
                field_o = (em) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.Q(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = this.field_n / 8;
                        this.field_n = 0;
                        if (param0 == 65280) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_n = 94;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var4 ^ -1) <= (var3_int ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = this.f((byte) 47);
                        var6 = this.f((byte) 56);
                        var7 = 0;
                        var8 = -1640531527;
                        if (var10 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = 32;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$0 = var9;
                        var9--;
                        if (incrementValue$0 <= 0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = var5 + (var7 - -param1[var7 & 3] ^ var6 + (var6 << 2051514276 ^ var6 >>> 1845041861));
                        var7 = var7 + var8;
                        var6 = var6 + (var5 + (var5 >>> 1568216805 ^ var5 << 847089252) ^ var7 + param1[var7 >>> -1005194421 & 526385155]);
                        if (var10 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_n = this.field_n - 8;
                        this.d(-127, var5);
                        this.d(-102, var6);
                        var4++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var10 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var3);
                    stackIn_17_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("kg.W(").append(param0).append(',');
                    stackIn_17_1 = stackIn_19_1;
                    if (param1 == null) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw sd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) <= -65) {
                break L1;
              } else {
                if ((param1 ^ -1) > 63) {
                  break L1;
                } else {
                  this.f(95, param1 + 64);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                this.f(-33, 34);
                break L2;
              }
            }
            L3: {
              if ((param1 ^ -1) <= -16385) {
                break L3;
              } else {
                if (param1 >= -16384) {
                  this.c(param1 + 49152, 8);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            throw new IllegalArgumentException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.R(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final String e(byte param0) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 102) {
              if (0 != this.field_m[this.field_n]) {
                stackIn_7_0 = this.d(true);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_n = this.field_n + 1;
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    final void a(int param0, int[] param1, int param2, byte param3) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_n;
                        if (param3 == 72) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.field_n = 49;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_n = param0;
                        var6 = (param2 - param0) / 8;
                        var7 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6 <= var7) {
                            statePc = 15;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = this.f((byte) 84);
                        var9 = this.f((byte) 51);
                        var10 = -957401312;
                        var11 = -1640531527;
                        if (var13 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var12 = 32;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        incrementValue$0 = var12;
                        var12--;
                        if (0 >= incrementValue$0) {
                            statePc = 13;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = var9 - (var10 - -param1[(var10 & 7121) >>> 1336248907] ^ (var8 << 1029726564 ^ var8 >>> 1715265349) + var8);
                        var10 = var10 - var11;
                        var8 = var8 - (param1[var10 & 3] + var10 ^ var9 + (var9 << 1846516004 ^ var9 >>> -1291301243));
                        if (var13 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var13 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_n = this.field_n - 8;
                        this.d(-107, var8);
                        this.d(-115, var9);
                        var7++;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var13 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.field_n = var5_int;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var5);
                    stackIn_18_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("kg.C(").append(param0).append(',');
                    stackIn_18_1 = stackIn_20_1;
                    if (param1 == null) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw sd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, String param1) {
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
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
                    stackIn_31_0 = var8 ^ -1;

                    stackIn_31_1 = var7 ^ -1;

                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_31_0 <= stackIn_31_1) {
                          break L4;
                        } else {
                          L5: {
                            var9 = param1.charAt(var8);
                            if (var9 < 65) {
                              break L5;
                            } else {
                              if (-91 > (var9 ^ -1)) {
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
                              if (-98 < (var9 ^ -1)) {
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
                              if ((var9 ^ -1) > -49) {
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
                        if ((var8 ^ -1) != -11) {
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
                stackIn_31_0 = param0;
                stackIn_31_1 = 11404;
                break L2;
              }
              if (stackIn_31_0 == stackIn_31_1) {
                this.b(var3_long, 17526);
                this.b(var5, param0 ^ 26874);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("kg.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L10;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L10;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean e(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_n = this.field_n - param0;
            var2_int = ah.a(this.field_m, 0, this.field_n, (byte) 68);
            var3 = this.f((byte) 36);
            if ((var2_int ^ -1) != (var3 ^ -1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    final String d(boolean param0) {
        int fieldTemp$1 = 0;
        int var2_int = 0;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          L0: {
            var2_int = this.field_n;
            L1: while (true) {
              fieldTemp$1 = this.field_n;
              this.field_n = this.field_n + 1;
              if (-1 == (this.field_m[fieldTemp$1] ^ -1)) {
                var3 = -var2_int + (this.field_n - 1);
                if (param0) {
                  if (0 != var3) {
                    stackIn_11_0 = kh.a(this.field_m, var3, 0, var2_int);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_9_0 = "";
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_6_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.GA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final byte b(boolean param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        byte stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_o = (em) null;
                break L1;
              }
            }
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            stackIn_4_0 = this.field_m[fieldTemp$1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Confined.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 > 58) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        this.a(60, (byte) -116);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5_int = param1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var5_int ^ -1) <= (param0 + param1 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        fieldTemp$1 = this.field_n;
                        this.field_n = this.field_n + 1;
                        this.field_m[fieldTemp$1] = param2[var5_int];
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var5);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("kg.FA(").append(param0).append(',').append(param1).append(',');
                    stackIn_12_1 = stackIn_14_1;
                    if (param2 == null) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw sd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ')');
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void c(boolean param0) {
        try {
            ac.a(param0);
            vl.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.A(" + param0 + ')');
        }
    }

    kg(int param0) {
        try {
            this.field_n = 0;
            this.field_m = dl.a(param0, -101);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.<init>(" + param0 + ')');
        }
    }

    final int c(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 32) {
                break L1;
              } else {
                this.e(84, -126);
                break L1;
              }
            }
            fieldTemp$1 = this.field_n;
            this.field_n = this.field_n + 1;
            stackIn_4_0 = this.field_m[fieldTemp$1] & 255;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.M(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void a(long param0, int param1) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$0] = (byte)(int)(param0 >> 764497568);
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$1] = (byte)(int)(param0 >> -109175592);
        if (param1 != 8850) {
            return;
        }
        try {
            fieldTemp$2 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$2] = (byte)(int)(param0 >> 1455563024);
            fieldTemp$3 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$3] = (byte)(int)(param0 >> -1443154552);
            fieldTemp$4 = this.field_n;
            this.field_n = this.field_n + 1;
            this.field_m[fieldTemp$4] = (byte)(int)param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "kg.B(" + param0 + ',' + param1 + ')');
        }
    }

    kg(byte[] param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_n = 0;
            this.field_m = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("kg.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_n = this.field_n + 2;
              if (param0 == 25) {
                break L1;
              } else {
                this.field_m = (byte[]) null;
                break L1;
              }
            }
            stackIn_4_0 = (this.field_m[this.field_n + -2] << 2085600552 & 65280) + (this.field_m[this.field_n - 1] & 255);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2), "kg.O(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final int e(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = ah.a(this.field_m, param1, this.field_n, (byte) 121);
            if (param0 == 26199) {
              this.d(param0 ^ -26114, var3_int);
              stackIn_4_0 = var3_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -53;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final String g(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2_int = 0;
        int var3 = 0;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4 = 0;
        try {
          L0: {
            fieldTemp$2 = this.field_n;
            this.field_n = this.field_n + 1;
            var2_int = this.field_m[fieldTemp$2];
            if ((var2_int ^ -1) != -1) {
              throw new IllegalStateException("");
            } else {
              var3 = this.field_n;
              L1: while (true) {
                fieldTemp$3 = this.field_n;
                this.field_n = this.field_n + 1;
                if ((this.field_m[fieldTemp$3] ^ -1) == -1) {
                  L2: {
                    if (param0 == 31) {
                      break L2;
                    } else {
                      this.field_m = (byte[]) null;
                      break L2;
                    }
                  }
                  var4 = -1 + (this.field_n + -var3);
                  if (0 == var4) {
                    stackIn_15_0 = "";
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    stackIn_17_0 = kh.a(this.field_m, var4, 0, var3);
                    decompiledRegionSelector0 = 1;
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
          throw sd.a((Throwable) ((Object) var2), "kg.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            this.field_m[this.field_n + (-param1 - 1)] = (byte)param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var3), "kg.MA(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_o = null;
    }
}
