/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_b;
    private vl field_c;
    private am field_a;
    static String field_d;

    final am a(am param0, boolean param1) {
        am var3 = null;
        RuntimeException var3_ref = null;
        am stackIn_2_0 = null;
        Object stackIn_9_0 = null;
        am stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = (am) null;
            return stackIn_2_0;
          }
          if (param0 == null) {
            var3 = this.field_c.field_b.field_g;
          } else {
            var3 = param0;
          }
          if (this.field_c.field_b == var3) {
            this.field_a = null;
            stackIn_9_0 = null;
            return (am) (stackIn_9_0);
          }
          this.field_a = var3.field_g;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("fl.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -25) {
          return;
        }
        field_b = null;
        field_d = null;
    }

    final static int d(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (sg.field_i < 50) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param0 >= -60) {
            fl.a((byte) 15);
          }
          var1_int = 1;
          while (true) {
            if (pm.field_g.length <= var1_int) {
              stackIn_14_0 = pm.field_g.length - 1;
              return stackIn_14_0;
            }
            if (pm.field_g[var1_int] <= vj.field_s) {
              var1_int++;
              continue;
            }
            break;
          }
          stackIn_11_0 = -1 + var1_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "fl.H(" + param0 + ')');
        }
    }

    final am a(boolean param0) {
        am var2 = this.field_a;
        if (this.field_c.field_b == var2) {
          this.field_a = null;
          return null;
        }
        if (!param0) {
          this.field_a = var2.field_f;
          return var2;
        }
        field_b = (String) null;
        this.field_a = var2.field_f;
        return var2;
    }

    final am a(int param0) {
        if (param0 != 0) {
          return (am) null;
        }
        am var2 = this.field_c.field_b.field_f;
        if (var2 == this.field_c.field_b) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_f;
        return var2;
    }

    final am a(int param0, am param1) {
        am var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        am stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_a = (am) null;
          }
          if (param1 == null) {
            var3 = this.field_c.field_b.field_f;
          } else {
            var3 = param1;
          }
          if (this.field_c.field_b != var3) {
            this.field_a = var3.field_f;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_a = null;
          stackIn_7_0 = null;
          return (am) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("fl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final am c(int param0) {
        am var2 = this.field_a;
        if (var2 == this.field_c.field_b) {
          this.field_a = null;
          return null;
        }
        if (param0 == 0) {
          this.field_a = var2.field_g;
          return var2;
        }
        field_d = (String) null;
        this.field_a = var2.field_g;
        return var2;
    }

    fl(vl param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final am b(int param0) {
        am var2 = this.field_c.field_b.field_g;
        if (this.field_c.field_b == var2) {
          this.field_a = null;
          return null;
        }
        if (param0 == 1) {
          this.field_a = var2.field_g;
          return var2;
        }
        return (am) null;
    }

    static {
        field_d = "Error connecting to server. Please try using a different server.";
    }
}
