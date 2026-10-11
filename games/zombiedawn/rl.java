/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private int[] field_c;
    private boolean field_d;
    static volatile boolean field_f;
    private int field_e;
    private int field_b;
    static String field_a;

    final static void c(int param0) {
        e.field_S.j(-636330975);
        if (param0 == 9) {
          if (vi.field_c == null) {
            vi.field_c = new sa(e.field_S, ed.field_c);
          }
          e.field_S.a(vi.field_c, true);
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param0 > this.field_b) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param1 < -91) {
          return this.field_c[param0];
        }
        this.field_e = -60;
        return this.field_c[param0];
    }

    private final void a(byte param0, int param1, int param2) {
        if (param1 > this.field_b) {
          this.field_b = param1;
          if (this.field_c.length <= param1) {
            this.a(true, param1);
          }
          this.field_c[param1] = param2;
          if (param0 != 93) {
            this.field_e = -58;
            return;
          }
          return;
        }
        if (this.field_c.length <= param1) {
          this.a(true, param1);
        }
        this.field_c[param1] = param2;
        if (param0 == 93) {
          return;
        }
        this.field_e = -58;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, boolean param6, byte param7, int[] param8) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        try {
          if (param5 != 1 &&
            param5 != 14) {
            if (param5 == 3) {
              qk.field_Jb[param5] = (al) ((Object) new vj(param5, param6, param0, param2, param1, param3, param8));
            } else if (param5 == 4) {
              qk.field_Jb[param5] = (al) ((Object) new fg(param5, param6, param0, param2, param1, param3, param8));
            } else if (param5 != 5 &&
              param5 != 6) {
              if (param5 == 10) {
                qk.field_Jb[param5] = (al) ((Object) new ap(param5, param6, param0, param2, param1, param3, param8));
              } else if (9 == param5) {
                qk.field_Jb[param5] = (al) ((Object) new pl(param5, param6, param0, param2, param1, param3, param8, param4));
              } else if (13 == param5) {
                qk.field_Jb[param5] = (al) ((Object) new ac(param5, param6, param0, param2, param1, param3, param8, param4));
              } else if (param5 != 12) {
                qk.field_Jb[param5] = new al(param5, param6, param0, param2, param1, param3, param8);
              } else {
                qk.field_Jb[param5] = (al) ((Object) new kl(param5, param6, param0, param2, param1, param3, param8));
              }
            } else {
              qk.field_Jb[param5] = (al) ((Object) new nl(param5, param6, param0, param2, param1, param3, param8));
            }
          } else {
            qk.field_Jb[param5] = (al) ((Object) new pg(param5, param6, param0, param2, param1, param3, param8));
          }
          var9_int = 124 / ((param7 + 57) / 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_25_0 = var9;
          stackIn_25_1 = new StringBuilder().append("rl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        if (param0 < 0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (this.field_b < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
        if (param0 != this.field_b) {
          gp.a(this.field_c, param0 + 1, this.field_c, param0, this.field_b - param0);
          if (param1 == 1) {
            this.field_b = this.field_b - 1;
            return;
          }
          return;
        }
        if (param1 == 1) {
          this.field_b = this.field_b - 1;
          return;
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 62 / ((param0 - 17) / 40);
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        var4 = 121 % ((7 - param1) / 41);
        var3 = this.field_c.length;
        while (param0 >= var3) {
          if (!this.field_d) {
            var3 = var3 + this.field_e;
            continue;
          }
          if (0 == var3) {
            var3 = 1;
            continue;
          }
          var3 = var3 * this.field_e;
        }
        return var3;
    }

    private final void a(boolean param0, int param1) {
        int[] var4 = new int[this.a(param1, -103)];
        int[] var3 = var4;
        gp.a(this.field_c, 0, var4, 0, this.field_c.length);
        this.field_c = var4;
        if (param0) {
          return;
        }
        this.a(9, (byte) 60);
    }

    final int a(int param0) {
        if (param0 != 12) {
          this.field_e = 102;
          return this.field_b + 1;
        }
        return this.field_b + 1;
    }

    final void b(int param0, byte param1) {
        if (param1 != -3) {
          return;
        }
        this.a((byte) 93, 1 + this.field_b, param0);
    }

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        field_f = false;
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
