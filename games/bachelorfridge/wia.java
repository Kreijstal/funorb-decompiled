/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wia {
    static boolean field_e;
    static String field_c;
    boolean field_d;
    static sna field_f;
    int field_j;
    int field_n;
    boolean field_m;
    boolean field_i;
    boolean field_g;
    int field_k;
    aga field_l;
    static vr field_b;
    int field_a;
    int field_h;

    final boolean b(byte param0) {
        if (param0 == -113) {
          return this.field_h > 0 ? true : false;
        }
        op var3 = (op) null;
        this.a(true, (op) null);
        return this.field_h > 0 ? true : false;
    }

    final int a(int param0) {
        if (param0 != -36) {
          return -8;
        }
        if (6 == this.field_n) {
          return 16;
        }
        if (7 == this.field_n) {
          return 4;
        }
        if (8 == this.field_n) {
          return 17;
        }
        if (this.field_n == 9) {
          return 5;
        }
        if (this.field_n == 10) {
          return 18;
        }
        if (this.field_n == 11) {
          return 6;
        }
        if (this.field_n == 12) {
          return 19;
        }
        if (this.field_n == 13) {
          return 7;
        }
        if (this.field_n == 23) {
          return 24;
        }
        if (this.field_n == 24) {
          return 25;
        }
        if (this.field_n == 25) {
          return 26;
        }
        if (this.field_n == 26) {
          return 27;
        }
        if (this.field_n != 29) {
          return -1;
        }
        return 12;
    }

    final boolean a(int param0, op param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != this.field_n) {
            return true;
          }
          if (this.a(param1, (byte) 77)) {
            return true;
          }
          if (this.field_m) {
            return true;
          }
          if (param0 != -27864) {
            field_f = (sna) null;
          }
          if (this.field_l == null) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("wia.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, byte param1) {
        if (lb.g((byte) -52)) {
          param0 = false;
        }
        fa.a(param0, param1 + 26412);
        if (param1 == 31) {
          if (ad.field_i) {
            dg.g(pf.field_n.field_a.field_kb, pf.field_n.field_a.field_rb, pf.field_n.field_a.field_sb, pf.field_n.field_a.field_p);
            pf.field_n.field_a.a(param0, 7802);
          }
          hl.a(0, param0);
          return;
        }
        wia.a(true, (byte) 28);
        if (ad.field_i) {
          dg.g(pf.field_n.field_a.field_kb, pf.field_n.field_a.field_rb, pf.field_n.field_a.field_sb, pf.field_n.field_a.field_p);
          pf.field_n.field_a.a(param0, 7802);
        }
        hl.a(0, param0);
    }

    final int d(int param0) {
        int var2 = this.field_n * 77421;
        if (this.field_i) {
          var2 = var2 ^ 98381;
        }
        if (null != this.field_l) {
          var2 = var2 ^ 87 * (this.field_l.field_D * 71 + this.field_l.field_u);
          var2 = var2 << 17 | var2 >>> 15;
        }
        if (param0 == 1446291025) {
          if (this.field_a != -1) {
            var2 = var2 ^ 857521 * this.field_a;
            var2 = var2 >>> 25 | var2 << 7;
          }
          if (this.field_m) {
            var2 = var2 ^ 56748912;
          }
          var2 = var2 ^ this.field_j * 788454;
          return var2;
        }
        field_c = (String) null;
        if (this.field_a != -1) {
          var2 = var2 ^ 857521 * this.field_a;
          var2 = var2 >>> 25 | var2 << 7;
        }
        if (this.field_m) {
          var2 = var2 ^ 56748912;
        }
        var2 = var2 ^ this.field_j * 788454;
        return var2;
    }

    private final boolean a(op param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(false, param0)) {
            return true;
          }
          if (this.field_n == 27) {
            return true;
          }
          if (this.field_n == 35) {
            return true;
          }
          if (this.field_n == 37) {
            return true;
          }
          if (this.field_n == 33) {
            return true;
          }
          var3_int = 64 % ((param1 + 4) / 49);
          if (od.field_w[this.field_n].field_b &&
            !this.field_m) {
            return true;
          }
          if (38 != this.field_n) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("wia.H(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, rha param2, op param3, int param4) {
        boolean discarded$0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        op var7 = null;
        try {
          param2.a("tile: " + od.field_w[this.field_n].field_a, 4819);
          param2.a(104, 2);
          param2.a("x: " + param1 + " y: " + param4, 4819);
          if (null != this.field_l) {
            param2.a("occupied: " + this.field_l.b(52), 4819);
          }
          if (this.field_a != -1) {
            param2.a("object id: " + this.field_a, 4819);
          }
          if (this.field_m) {
            param2.a("powerup present", 4819);
          }
          if (this.a(param3, (byte) -125)) {
            param2.a("counter: " + this.field_j, 4819);
          }
          param2.a(-116, -2);
          if (param0 <= -88) {
            return;
          }
          var7 = (op) null;
          discarded$0 = this.a((op) null, (byte) -107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("wia.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 788454) {
          wia.b(-90);
          field_f = null;
          return;
        }
        field_f = null;
    }

    final boolean e(int param0) {
        if (param0 > -24) {
          return false;
        }
        return ju.c(23745, this.field_n);
    }

    final boolean c(int param0) {
        op var3;
        if (param0 <= -81) {
          if (this.field_n == 6) {
            return true;
          }
          if (this.field_n == 7) {
            return true;
          }
          if (8 == this.field_n) {
            return true;
          }
          if (9 == this.field_n) {
            return true;
          }
          if (10 == this.field_n) {
            return true;
          }
          if (this.field_n == 11) {
            return true;
          }
          if (12 == this.field_n) {
            return true;
          }
          if (13 == this.field_n) {
            return true;
          }
          return false;
        }
        var3 = (op) null;
        this.a(false, (op) null);
        if (this.field_n == 6) {
          return true;
        }
        if (this.field_n == 7) {
          return true;
        }
        if (8 == this.field_n) {
          return true;
        }
        if (9 == this.field_n) {
          return true;
        }
        if (10 == this.field_n) {
          return true;
        }
        if (this.field_n == 11) {
          return true;
        }
        if (12 == this.field_n) {
          return true;
        }
        if (13 == this.field_n) {
          return true;
        }
        return false;
    }

    final boolean a(byte param0) {
        boolean discarded$2 = false;
        if (param0 != -63) {
          op var3 = (op) null;
          discarded$2 = this.a((op) null, (byte) -3);
          if (this.field_n != 0) {
            return false;
          }
          if (!this.field_i) {
            return true;
          }
          return false;
        }
        if (this.field_n != 0) {
          return false;
        }
        if (!this.field_i) {
          return true;
        }
        return false;
    }

    final boolean a(boolean param0, op param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.field_a = -64;
          }
          stackIn_6_0 = (param1.field_E == 2) && (this.a((byte) -63));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("wia.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    wia(int param0) {
        this.field_n = param0;
        this.field_a = -1;
    }

    static {
        field_c = "<%0> has entered another game.";
        field_e = true;
    }
}
