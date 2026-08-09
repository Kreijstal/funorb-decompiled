/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn {
    static bd[] field_i;
    static bd field_h;
    static int field_b;
    static int field_a;
    private ed field_e;
    private int field_c;
    private int field_f;
    static int field_j;
    static String field_g;
    private ui field_d;

    private final void a(int param0, int param1, Object param2, long param3) {
        lj var9 = null;
        hb var6 = null;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        try {
            if (!(param1 <= this.field_c)) {
                throw new IllegalStateException();
            }
            this.a((byte) 122, param3);
            if (param0 >= -3) {
                CharSequence var8 = (CharSequence) null;
                dn.a((CharSequence) null, 56, -67);
            }
            this.field_f = this.field_f - param1;
            while ((this.field_f ^ -1) > -1) {
                var9 = (lj) ((Object) this.field_d.a(true));
                this.a(var9, (byte) -111);
            }
            var6 = new hb(param2, param1);
            this.field_e.a((byte) 91, param3, var6);
            this.field_d.a(24, var6);
            ((lj) ((Object) var6)).field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "dn.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5) {
        try {
            if (!(10 <= param0)) {
                si.a(param3 << 1021400708, param5 << -478017692, 5 + param0 * 8 << 454615748, (-1 + param2.length) * (-param0 + 10) / 10, param2);
            }
            si.a(param3 << 83206820, param5 << 352834916, -param0 + 20 << 1750905412, param1.length + param4, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "dn.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 != 16) {
            field_h = (bd) null;
        }
        field_g = null;
        field_i = null;
    }

    private final void a(lj param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                param0.b(112);
                param0.c(-1);
                this.field_f = this.field_f + param0.field_s;
                break L1;
              }
            }
            L2: {
              if (param1 <= -100) {
                break L2;
              } else {
                dn.a(53, 84, 84, 69, 81);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("dn.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, long param1) {
        if (param0 < 110) {
            return;
        }
        lj var4 = (lj) ((Object) this.field_e.a(param1, -1));
        this.a(var4, (byte) -107);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bd var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var11 = di.field_b[param2];
              if (param1 < -104) {
                break L1;
              } else {
                dn.a(-84, -125, 40, 39, 44);
                break L1;
              }
            }
            L2: {
              if (16772608 != param4) {
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var11.field_r <= var7) {
                    break L2;
                  } else {
                    var8 = 0;
                    L4: while (true) {
                      if (var8 >= var11.field_u) {
                        var6 = var6 + var11.field_u;
                        var7++;
                        continue L3;
                      } else {
                        L5: {
                          var9 = var11.field_D[var8 + var6];
                          if (0 != var9) {
                            var9 = ((var9 & 16754296) >> 523200656) / 4 * 262401;
                            si.a(param0 - -var8, param3 - -var7, var9);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var8++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                var11.c(param0, param3, 256);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var5), "dn.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(CharSequence param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 106 / ((-24 - param2) / 54);
            stackIn_1_0 = ik.a(param1, true, -6514, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("dn.F(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final Object a(int param0, long param1) {
        hb var6 = null;
        lj var8 = (lj) ((Object) this.field_e.a(param1, -1));
        if (var8 == null) {
            return null;
        }
        Object var5 = var8.c((byte) 103);
        if (param0 != 0) {
            CharSequence var7 = (CharSequence) null;
            dn.a((CharSequence) null, -112, 19);
        }
        if (!(var5 != null)) {
            var8.b(param0 ^ 117);
            var8.c(-1);
            this.field_f = this.field_f + var8.field_s;
            return null;
        }
        if (!var8.e(param0 ^ 10999)) {
            this.field_d.a(24, var8);
            var8.field_h = 0L;
        } else {
            var6 = new hb(var5, var8.field_s);
            this.field_e.a((byte) 108, var8.field_c, var6);
            this.field_d.a(param0 ^ 24, var6);
            ((lj) ((Object) var6)).field_h = 0L;
            var8.b(115);
            var8.c(-1);
        }
        return var5;
    }

    final void a(long param0, int param1, Object param2) {
        if (param1 > -49) {
            return;
        }
        try {
            this.a(-101, 1, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "dn.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private dn() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 0;
        field_a = -1;
        field_j = -1;
        field_g = "Find the exit and flee the base!";
    }
}
