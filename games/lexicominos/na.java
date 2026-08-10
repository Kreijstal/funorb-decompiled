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
        cc var2;
        cc stackIn_4_0 = null;
        cc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        var2 = th.field_o[param0];
        if (param1) {
          L0: {
            stackIn_4_0 = (cc) (var2);

            if (param1) {
              stackIn_5_0 = (cc) ((Object) stackIn_4_0);
              stackIn_5_1 = 0;
              break L0;
            } else {
              stackIn_5_0 = (cc) ((Object) stackIn_4_0);
              stackIn_5_1 = 1;
              break L0;
            }
          }
          if (!((cc) (Object) stackIn_5_0).a(stackIn_5_1 != 0)) {
            var2.e(-1);
            var2.c(0);
            if (-1 < (oc.field_e ^ -1)) {
              var2.f(0);
              wj.field_j.a(var2);
              return;
            } else {
              var2.f(oc.field_e * 128 / 256);
              wj.field_j.a(var2);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final kd a(long param0, byte param1) {
        kd var4;
        kd var5;
        int var6;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 82) {
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param0)];
          this.field_e = var4.field_f;
          L0: while (true) {
            if (this.field_e == var4) {
              this.field_e = null;
              return null;
            } else {
              if (this.field_e.field_d != param0) {
                this.field_e = this.field_e.field_f;
                continue L0;
              } else {
                var5 = this.field_e;
                this.field_e = this.field_e.field_f;
                return var5;
              }
            }
          }
        } else {
          field_a = (db[]) null;
          var4 = this.field_f[(int)((long)(this.field_d - 1) & param0)];
          this.field_e = var4.field_f;
          L1: while (true) {
            if (this.field_e == var4) {
              this.field_e = null;
              return null;
            } else {
              if (this.field_e.field_d != param0) {
                this.field_e = this.field_e.field_f;
                continue L1;
              } else {
                var5 = this.field_e;
                this.field_e = this.field_e.field_f;
                return var5;
              }
            }
          }
        }
    }

    final kd a(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        Object var4;
        kd var4_ref;
        Object var8;
        kd var8_ref;
        kd var11;
        var3 = Lexicominos.field_L ? 1 : 0;
        if ((this.field_c ^ -1) < -1) {
          if (this.field_f[this.field_c - 1] != this.field_b) {
            var11 = this.field_b;
            this.field_b = var11.field_f;
            return var11;
          } else {
            L0: while (true) {
              if (this.field_d <= this.field_c) {
                if (param0 != -91) {
                  na.a(true);
                  return null;
                } else {
                  return null;
                }
              } else {
                fieldTemp$2 = this.field_c;
                this.field_c = this.field_c + 1;
                var8_ref = this.field_f[fieldTemp$2].field_f;
                if (this.field_f[this.field_c - 1] == var8_ref) {
                  continue L0;
                } else {
                  this.field_b = var8_ref.field_f;
                  return var8_ref;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_d <= this.field_c) {
              if (param0 != -91) {
                na.a(true);
                return null;
              } else {
                return null;
              }
            } else {
              fieldTemp$3 = this.field_c;
              this.field_c = this.field_c + 1;
              var4_ref = this.field_f[fieldTemp$3].field_f;
              if (this.field_f[this.field_c - 1] == var4_ref) {
                continue L1;
              } else {
                this.field_b = var4_ref.field_f;
                return var4_ref;
              }
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
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = 0;
              if (param0 == 1048576) {
                break L1;
              } else {
                field_a = (db[]) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_7_0 = var3;
                break L0;
              } else {
                var3 = -var3 + (var3 << 830945637) + ua.a(true, param1.charAt(var4));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("na.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
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
            int decompiledRegionSelector0 = 0;
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
                  L2: {
                    var1_int = 103 % ((param0 - 25) / 40);
                    var2 = Runtime.class.getMethod("maxMemory", new Class[]{});
                    if (var2 == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          var3 = Runtime.getRuntime();
                          var5 = (Object[]) null;
                          var4 = (Long) (var2.invoke((Object) (var3), (Object[]) null));
                          ia.field_C = (int)(var4.longValue() / 1048576L) - -1;
                          decompiledRegionSelector0 = 0;
                          break L3;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var3_ref = decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                          break L4;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(int param0) {
        kd dupTemp$1 = null;
        int var2;
        kd var3;
        this.field_c = 0;
        this.field_d = param0;
        this.field_f = new kd[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$1 = new kd();
            var3 = dupTemp$1;
            this.field_f[var2] = dupTemp$1;
            var3.field_f = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
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
