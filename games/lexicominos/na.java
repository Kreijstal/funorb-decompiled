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
        cc var2 = null;
        cc stackIn_3_0 = null;
        cc stackIn_4_0 = null;
        cc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        cc stackOut_2_0 = null;
        cc stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        cc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var2 = th.field_o[param0];
        if (param1) {
          L0: {
            stackOut_2_0 = (cc) var2;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param1) {
              stackOut_4_0 = (cc) (Object) stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = (cc) (Object) stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if (((cc) (Object) stackIn_5_0).a(stackIn_5_1 == 0)) {
            var2.e(-1);
            var2.c(0);
            if (-1 < (oc.field_e ^ -1)) {
              var2.f(0);
              wj.field_j.a((lk) (Object) var2);
              return;
            } else {
              var2.f(oc.field_e * 128 / 256);
              wj.field_j.a((lk) (Object) var2);
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
        kd var4 = null;
        kd var5 = null;
        int var6 = 0;
        kd var7 = null;
        kd var8 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 82) {
          var7 = ((na) this).field_f[(int)((long)(((na) this).field_d - 1) & param0)];
          var4 = var7;
          ((na) this).field_e = var7.field_f;
          L0: while (true) {
            if (((na) this).field_e == var4) {
              ((na) this).field_e = null;
              return null;
            } else {
              if (((na) this).field_e.field_d != param0) {
                ((na) this).field_e = ((na) this).field_e.field_f;
                continue L0;
              } else {
                var5 = ((na) this).field_e;
                ((na) this).field_e = ((na) this).field_e.field_f;
                return var5;
              }
            }
          }
        } else {
          field_a = null;
          var8 = ((na) this).field_f[(int)((long)(((na) this).field_d - 1) & param0)];
          var4 = var8;
          ((na) this).field_e = var8.field_f;
          L1: while (true) {
            if (((na) this).field_e == var4) {
              ((na) this).field_e = null;
              return null;
            } else {
              if (((na) this).field_e.field_d != param0) {
                ((na) this).field_e = ((na) this).field_e.field_f;
                continue L1;
              } else {
                var5 = ((na) this).field_e;
                ((na) this).field_e = ((na) this).field_e.field_f;
                return var5;
              }
            }
          }
        }
    }

    final kd a(byte param0) {
        int var3 = 0;
        kd var4 = null;
        kd var8 = null;
        kd var11 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        if ((((na) this).field_c ^ -1) < -1) {
          if (((na) this).field_f[((na) this).field_c - 1] != ((na) this).field_b) {
            var11 = ((na) this).field_b;
            ((na) this).field_b = var11.field_f;
            return var11;
          } else {
            L0: while (true) {
              if (((na) this).field_d <= ((na) this).field_c) {
                if (param0 != -91) {
                  na.a(true);
                  return null;
                } else {
                  return null;
                }
              } else {
                ((na) this).field_c = ((na) this).field_c + 1;
                var8 = ((na) this).field_f[((na) this).field_c].field_f;
                if (((na) this).field_f[((na) this).field_c - 1] == var8) {
                  continue L0;
                } else {
                  ((na) this).field_b = var8.field_f;
                  return var8;
                }
              }
            }
          }
        } else {
          L1: while (true) {
            if (((na) this).field_d <= ((na) this).field_c) {
              if (param0 != -91) {
                na.a(true);
                return null;
              } else {
                return null;
              }
            } else {
              ((na) this).field_c = ((na) this).field_c + 1;
              var4 = ((na) this).field_f[((na) this).field_c].field_f;
              if (((na) this).field_f[((na) this).field_c - 1] == var4) {
                continue L1;
              } else {
                ((na) this).field_b = var4.field_f;
                return var4;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        if (param0 != 1048576) {
            field_a = null;
            for (var4 = 0; var2 > var4; var4++) {
                var3 = -var3 + (var3 << 830945637) + ua.a(true, param1.charAt(var4));
            }
            return var3;
        }
        for (var4 = 0; var2 > var4; var4++) {
            var3 = -var3 + (var3 << 830945637) + ua.a(true, param1.charAt(var4));
        }
        return var3;
    }

    final kd c(byte param0) {
        ((na) this).field_c = 0;
        if (param0 >= -85) {
            ((na) this).field_e = null;
            return ((na) this).a((byte) -91);
        }
        return ((na) this).a((byte) -91);
    }

    final void a(kd param0, byte param1, long param2) {
        if (!(null == param0.field_c)) {
            param0.b((byte) -122);
        }
        kd var5 = ((na) this).field_f[(int)((long)(-1 + ((na) this).field_d) & param2)];
        if (param1 >= -46) {
            field_a = null;
            param0.field_c = var5.field_c;
            param0.field_f = var5;
            param0.field_c.field_f = param0;
            param0.field_f.field_c = param0;
            param0.field_d = param2;
            return;
        }
        param0.field_c = var5.field_c;
        param0.field_f = var5;
        param0.field_c.field_f = param0;
        param0.field_f.field_c = param0;
        param0.field_d = param2;
    }

    final static void b(byte param0) {
        try {
            int var1_int = 0;
            Exception var1 = null;
            java.lang.reflect.Method var2 = null;
            Throwable var3 = null;
            Runtime var3_ref = null;
            Long var4 = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var1_int = 103 % ((param0 - 25) / 40);
                var2 = Runtime.class.getMethod("maxMemory", new Class[0]);
                if (var2 == null) {
                  break L0;
                } else {
                  try {
                    var3_ref = Runtime.getRuntime();
                    var5 = null;
                    var4 = (Long) var2.invoke((Object) (Object) var3_ref, (Object[]) null);
                    ia.field_C = (int)(var4.longValue() / 1048576L) - -1;
                  } catch (java.lang.Throwable decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  break L0;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var3 = decompiledCaughtException;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    na(int param0) {
        int var2 = 0;
        kd var3 = null;
        ((na) this).field_c = 0;
        ((na) this).field_d = param0;
        ((na) this).field_f = new kd[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new kd();
            ((na) this).field_f[var2] = new kd();
            var3.field_f = var3;
            var3.field_c = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final static void a(byte param0, wa param1, int param2) {
        th var5 = ed.field_q;
        var5.h(param2, 0);
        if (param0 > -77) {
            return;
        }
        var5.field_h = var5.field_h + 1;
        int var4 = var5.field_h;
        var5.c(1, -1);
        var5.c(param1.field_o, -1);
        var5.a(108, param1.field_h);
        var5.f(param1.field_i, -32287);
        var5.f(param1.field_m, -32287);
        var5.f(param1.field_n, -32287);
        var5.f(param1.field_l, -32287);
        int discarded$0 = var5.a(var4, (byte) 71);
        var5.d(-var4 + var5.field_h, (byte) -124);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new db[15];
    }
}
