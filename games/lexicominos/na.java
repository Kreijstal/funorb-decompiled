/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na {
    private kd[] field_f;
    private kd field_b;
    static db[] field_a;
    private int field_c;
    private int field_d;
    private kd field_e;

    final static void a(int param0, boolean param1) {
        cc var2 = th.field_o[param0];
        if (!param1) {
            return;
        }
        if (var2.a(!param1 ? true : false)) {
            return;
        }
        var2.e(-1);
        var2.c(0);
        if (-1 >= (oc.field_e ^ -1)) {
            var2.f(oc.field_e * 128 / 256);
            if (!Lexicominos.field_L) {
                wj.field_j.a(var2);
                return;
            }
            var2.f(0);
            wj.field_j.a(var2);
            return;
        }
        var2.f(0);
        wj.field_j.a(var2);
    }

    final kd a(long param0, byte param1) {
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        kd var4;
        kd var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 82) {
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param0)];
          this.field_e = var4.field_f;
          L0: while (true) {
            if (this.field_e != var4) {
              stackIn_7_0 = this;

              if (var6 == 0) {
                if (((na) (this)).field_e.field_d != param0) {
                  this.field_e = this.field_e.field_f;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_e = null;
                    return null;
                  }
                } else {
                  var5 = this.field_e;
                  this.field_e = this.field_e.field_f;
                  return var5;
                }
              } else {
                ((na) (this)).field_e = null;
                return null;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        } else {
          field_a = (db[]) null;
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param0)];
          this.field_e = var4.field_f;
          L1: while (true) {
            if (this.field_e != var4) {
              stackIn_16_0 = this;

              if (var6 == 0) {
                if (((na) (this)).field_e.field_d != param0) {
                  this.field_e = this.field_e.field_f;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_e = null;
                    return null;
                  }
                } else {
                  var5 = this.field_e;
                  this.field_e = this.field_e.field_f;
                  return var5;
                }
              } else {
                ((na) (this)).field_e = null;
                return null;
              }
            } else {
              this.field_e = null;
              return null;
            }
          }
        }
    }

    final kd a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        kd var4;
        kd var8;
        kd var11;
        var3 = Lexicominos.field_L ? 1 : 0;
        if ((this.field_c ^ -1) < -1) {
          if (this.field_f[this.field_c - 1] == this.field_b) {
            L0: while (true) {
              L1: {
                if (this.field_d <= this.field_c) {
                  break L1;
                } else {
                  fieldTemp$2 = this.field_c;
                  this.field_c = this.field_c + 1;
                  var8 = this.field_f[fieldTemp$2].field_f;
                  if (var3 == 0) {
                    if (this.field_f[this.field_c - 1] == var8) {
                      if (var3 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    } else {
                      this.field_b = var8.field_f;
                      return var8;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (param0 == -91) {
                return null;
              } else {
                na.a(true);
                return null;
              }
            }
          } else {
            var11 = this.field_b;
            this.field_b = var11.field_f;
            return var11;
          }
        } else {
          L2: while (true) {
            L3: {
              if (this.field_d <= this.field_c) {
                break L3;
              } else {
                fieldTemp$3 = this.field_c;
                this.field_c = this.field_c + 1;
                var4 = this.field_f[fieldTemp$3].field_f;
                if (var3 == 0) {
                  if (this.field_f[this.field_c - 1] == var4) {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    this.field_b = var4.field_f;
                    return var4;
                  }
                } else {
                  return null;
                }
              }
            }
            if (param0 == -91) {
              return null;
            } else {
              na.a(true);
              return null;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = (db[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.length();
                        var3 = 0;
                        if (param0 == 1048576) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_a = (db[]) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2_int <= var4) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_8_0 = -var3 + (var3 << 830945637) + ua.a(true, param1.charAt(var4));
                        stackIn_6_0 = stackIn_8_0;
                        if (var5 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = stackIn_6_0;
                        var4++;
                        if (var5 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_8_0 = var3;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_11_0 = (RuntimeException) (var2);
                    stackIn_10_0 = stackIn_11_0;
                    stackIn_11_1 = new StringBuilder().append("na.D(").append(param0).append(',');
                    stackIn_10_1 = stackIn_11_1;
                    if (param1 == null) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_12_2 = "{...}";
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_12_2 = "null";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw ld.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final kd c(byte param0) {
        this.field_c = 0;
        if (param0 >= -85) {
            this.field_e = (kd) null;
            return this.a((byte) -91);
        }
        return this.a((byte) -91);
    }

    final void a(kd param0, byte param1, long param2) {
        kd var5 = null;
        try {
            if (!(null == param0.field_c)) {
                param0.b((byte) -122);
            }
            var5 = this.field_f[(int)((long)(-1 + this.field_d) & param2)];
            if (param1 >= -46) {
                field_a = (db[]) null;
            }
            param0.field_c = var5.field_c;
            param0.field_f = var5;
            param0.field_c.field_f = param0;
            param0.field_f.field_c = param0;
            param0.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "na.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void b(byte param0) {
        try {
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            Exception var1 = null;
            java.lang.reflect.Method var2 = null;
            Runtime var3 = null;
            Throwable var3_ref = null;
            Long var4 = null;
            Object[] var5 = null;
            try {
              L0: {
                L1: {
                  var1_int = 103 % ((param0 - 25) / 40);
                  var2 = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var2 == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var3 = Runtime.getRuntime();
                        var5 = (Object[]) null;
                        var4 = (Long) (var2.invoke((Object) (var3), (Object[]) null));
                        ia.field_C = (int)(var4.longValue() / 1048576L) - -1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var3_ref = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(int param0) {
        kd dupTemp$0 = null;
        kd var3 = null;
        int var4 = Lexicominos.field_L ? 1 : 0;
        this.field_c = 0;
        this.field_d = param0;
        this.field_f = new kd[param0];
        int var2 = 0;
        do {
            if (var2 >= param0) {
                return;
            }
            dupTemp$0 = new kd();
            var3 = dupTemp$0;
            this.field_f[var2] = dupTemp$0;
            var3.field_f = var3;
            var3.field_c = var3;
            var2++;
            if (var4 != 0) {
                return;
            }
        } while (var4 == 0);
    }

    final static void a(byte param0, wa param1, int param2) {
        int var4 = 0;
        th var5 = ed.field_q;
        var5.h(param2, 0);
        if (param0 > -77) {
            return;
        }
        try {
            var5.field_h = var5.field_h + 1;
            var4 = var5.field_h;
            var5.c(1, -1);
            var5.c(param1.field_o, -1);
            var5.a(108, param1.field_h);
            var5.f(param1.field_i, -32287);
            var5.f(param1.field_m, -32287);
            var5.f(param1.field_n, -32287);
            var5.f(param1.field_l, -32287);
            var5.a(var4, (byte) 71);
            var5.d(-var4 + var5.field_h, (byte) -124);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "na.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new db[15];
    }
}
