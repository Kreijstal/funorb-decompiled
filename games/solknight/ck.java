/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    private nc field_b;
    private gg field_a;

    final static void a(boolean param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param1 != 66) {
          return;
        }
        if (0 < ob.field_l) {
          if (null == fc.field_l) {
            dj.field_k = g.a(480, 0, wh.field_c, 640, (byte) -81, 0);
          } else {
            dj.field_k = fc.field_l.b(false);
            jh.a(2, param1 + 1);
          }
          if (null == dj.field_k) {
            var2 = 3;
          } else {
            var2 = 2;
            th.a((byte) -50, dj.field_k);
          }
          if (null != fc.field_l) {
            return;
          }
          if (sf.field_j) {
            hc.a(param0, true, var2);
          }
          return;
        }
        if (!il.b(507)) {
          var2Lifetime1 = 1;
          if (null != fc.field_l) {
            return;
          }
          if (!sf.field_j) {
            return;
          }
          hc.a(param0, true, var2Lifetime1);
          return;
        }
        var2Lifetime2 = 0;
        if (null != fc.field_l) {
          return;
        }
        if (!sf.field_j) {
          return;
        }
        hc.a(param0, true, var2Lifetime2);
    }

    final gg a(gg param0, int param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 108) {
            ck.a(false, (byte) -115);
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_b.field_e.field_a;
          }
          if (this.field_b.field_e == var3) {
            this.field_a = null;
            stackIn_8_0 = null;
            return (gg) (stackIn_8_0);
          }
          this.field_a = var3.field_a;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ck.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final gg a(byte param0) {
        int var2 = -121 % ((param0 - 30) / 44);
        gg var3 = this.field_b.field_e.field_d;
        if (var3 != this.field_b.field_e) {
          this.field_a = var3.field_d;
          return var3;
        }
        this.field_a = null;
        return null;
    }

    final gg b(int param0) {
        gg var2 = this.field_a;
        if (var2 == this.field_b.field_e) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2.field_a;
        if (param0 == 640) {
          return var2;
        }
        this.c(19);
        return var2;
    }

    final gg a(int param0, gg param1) {
        gg var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        gg stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_b.field_e.field_d;
          } else {
            var3 = param1;
          }
          if (var3 == this.field_b.field_e) {
            this.field_a = null;
            stackIn_6_0 = null;
            return (gg) (stackIn_6_0);
          }
          this.field_a = var3.field_d;
          if (param0 != 26229) {
            this.field_a = (gg) null;
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ck.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final gg a(int param0) {
        gg var2 = null;
        gg var2Lifetime1;
        if (param0 != -25119) {
          this.field_b = (nc) null;
          var2 = this.field_b.field_e.field_a;
          if (this.field_b.field_e == var2) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_b.field_e.field_a;
        if (this.field_b.field_e == var2Lifetime1) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
          ck.a('=', true);
          if (160 == param0) {
            return true;
          }
          if (param0 == 32) {
            return true;
          }
          if (param0 == 95) {
            return true;
          }
          if (param0 != 45) {
            return false;
          }
          return true;
        }
        if (160 == param0) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param0 != 45) {
          return false;
        }
        return true;
    }

    ck(nc param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final gg c(int param0) {
        gg var2 = this.field_a;
        if (this.field_b.field_e == var2) {
          this.field_a = null;
          return null;
        }
        if (param0 > 111) {
          this.field_a = var2.field_d;
          return var2;
        }
        return (gg) null;
    }

    static {
    }
}
