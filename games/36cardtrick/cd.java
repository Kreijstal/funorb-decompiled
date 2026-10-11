/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_h;
    private he field_d;
    static String field_f;
    static long field_a;
    static bk field_b;
    private he field_c;
    static int field_e;
    static String field_g;

    final he b(byte param0) {
        he var2 = this.field_c;
        if (param0 != -122) {
          return (he) null;
        }
        if (this.field_d == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final static void a(kc[] param0, int param1, byte param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          if (param0 != null &&
            param1 > 0) {
            var5_int = param0[0].field_l;
            var6 = param0[2].field_l;
            var7 = param0[1].field_l;
            param0[0].d(param3, param4);
            param0[2].d(param1 + param3 - var6, param4);
            vj.a(sg.field_c);
            vj.f(var5_int + param3, param4, -var6 + param1 + param3, param4 + param0[1].field_k);
            if (param2 != -94) {
              return;
            }
            var8 = var5_int + param3;
            var9 = -var6 + param3 + param1;
            for (param3 = var8; var9 > param3; param3 = param3 + var7) {
              param0[1].d(param3, param4);
            }
            vj.b(sg.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("cd.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int b(int param0) {
        int var4 = Main.field_T;
        int var2 = 0;
        he var3 = this.field_d.field_h;
        if (param0 != 1) {
          field_h = 96;
          while (this.field_d != var3) {
            var3 = var3.field_h;
            var2++;
          }
          return var2;
        }
        while (this.field_d != var3) {
          var3 = var3.field_h;
          var2++;
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = Main.field_T;
        if (param0 >= param2) {
          if (param1 > param0) {
            w.a(vj.field_j, param6, param0, param5, true, param4, param7, param2, param1);
          } else {
            if (param1 > param2) {
              w.a(vj.field_j, param6, param1, param5, true, param7, param4, param2, param0);
            } else {
              w.a(vj.field_j, param6, param2, param7, true, param5, param4, param1, param0);
            }
          }
        } else {
          if (param2 < param1) {
            w.a(vj.field_j, param6, param2, param4, true, param5, param7, param0, param1);
          } else {
            if (param0 >= param1) {
              w.a(vj.field_j, param6, param0, param7, true, param4, param5, param1, param2);
            } else {
              w.a(vj.field_j, param6, param1, param4, true, param7, param5, param0, param2);
            }
          }
        }
        if (param3 == -1) {
          return;
        }
        field_f = (String) null;
    }

    final he a(int param0) {
        he var2 = this.field_d.field_h;
        if (this.field_d != var2) {
          var2.d(12);
          int var3 = -95 % ((param0 - 87) / 34);
          return var2;
        }
        return null;
    }

    final he c(byte param0) {
        if (param0 > -96) {
          return (he) null;
        }
        he var2 = this.field_d.field_h;
        if (var2 != this.field_d) {
          this.field_c = var2.field_h;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final void a(byte param0, he param1) {
        if (null != param1.field_i) {
          param1.d(12);
        }
        param1.field_i = this.field_d.field_i;
        if (param0 >= -62) {
          return;
        }
        try {
          param1.field_h = this.field_d;
          param1.field_i.field_h = param1;
          param1.field_h.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "cd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public cd() {
        this.field_d = new he();
        this.field_d.field_i = this.field_d;
        this.field_d.field_h = this.field_d;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 46 % ((-45 - param0) / 58);
        field_g = null;
        field_f = null;
    }

    static {
        field_f = "FPS:";
    }
}
