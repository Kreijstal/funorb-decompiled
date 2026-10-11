/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends ta implements ai {
    private s field_B;
    static int field_C;
    private s field_E;
    private s field_D;

    public hm() {
        super(0, 0, 476, 225, (td) null);
        this.field_D = new s(ki.field_h, (ag) null);
        this.field_B = new s(bi.field_b, (ag) null);
        this.field_E = new s(gl.field_k, (ag) null);
        vk var1 = new vk();
        this.field_D.field_j = (td) ((Object) var1);
        this.field_B.field_j = (td) ((Object) var1);
        this.field_E.field_j = (td) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_B.a(-var3 + this.field_m >> 1, this.field_r - 48 - var2, 30, (byte) -90, var4);
        this.field_E.a(var2 + (var4 + (-var3 + this.field_m >> 1)), -var2 - 48 + this.field_r, 30, (byte) -90, var4);
        this.field_D.a(this.field_m - var3 >> 1, -(2 * var2) - 78 + this.field_r, 30, (byte) -90, var3);
        this.field_B.field_h = (ag) (this);
        this.field_D.field_h = (ag) (this);
        this.field_D.field_i = ec.field_J;
        this.field_E.field_h = (ag) (this);
        this.field_E.field_i = og.field_j;
        this.a(this.field_B, (byte) 74);
        this.a(this.field_D, (byte) 74);
        this.a(this.field_E, (byte) 74);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_s + param3;
        int var6 = this.field_n + param0;
        lm.field_f.a(bm.field_b, var5 + 20, 20 + var6, this.field_m - 40, this.field_r - 50, 16777215, -1, 1, 0, lm.field_f.field_H);
        super.a(param0, param1, param2, param3);
    }

    final static ki a(int param0, boolean param1, boolean param2, int param3, int param4) {
        if (param0 == 48) {
          return al.a(param1, 5200, param3, param4, param2, false);
        }
        String var6 = (String) null;
        hm.$cfr$intArgs$a$e5d4dced95c1((String) null, 56, false, true);
        return al.a(param1, 5200, param3, param4, param2, false);
    }

    final static void a(String param0, byte param1, boolean param2, boolean param3) {
        try {
          bg.a(false);
          bm.field_d.n(7920);
          ig.field_ib = new pk(vh.field_k, (String) null, vh.field_j, param3, param2);
          kg.field_j = new pc(bm.field_d, ig.field_ib);
          if (param1 != 33) {
            hm.a(-114, false, true, 50, -56);
          }
          bm.field_d.b((byte) 74, (pj) (kg.field_j));
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "hm.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param0 != -20625) {
          String var3 = (String) null;
          hm.$cfr$intArgs$a$e5d4dced95c1((String) null, -28, true, true);
          if (48 > param1) {
            return false;
          }
          if (param1 <= 57) {
            return true;
          }
          return false;
        }
        if (48 > param1) {
          return false;
        }
        if (param1 <= 57) {
          return true;
        }
        return false;
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3 ^ param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(param2, false);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(param2, false);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("hm.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3) {
        try {
          pc.$cfr$intArgs$a$c64d0b17f51c(53, 0, 160, 0, param2, 120, ul.field_b, 0, 0, param3, 1920, param0);
          jl.a(0, 160, param1, 0, -1, 120, 0, 0, ul.field_b, 0);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "hm.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param3 == this.field_B) {
            sg.k(-16);
          } else {
            if (this.field_D != param3) {
              if (this.field_E == param3) {
                kj.j(4);
              }
            } else {
              d.c((byte) -126);
            }
          }
          var6_int = -128 % ((param0 + 3) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("hm.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$e5d4dced95c1(String param0, int param1, boolean param2, boolean param3) {
        try {
          bg.a(false);
          bm.field_d.n(7920);
          ig.field_ib = new pk(vh.field_k, (String) null, vh.field_j, param3, param2);
          kg.field_j = new pc(bm.field_d, ig.field_ib);
          if (param1 != 33) {
            hm.a(-114, false, true, 50, -56);
          }
          bm.field_d.b((byte) 74, (pj) (kg.field_j));
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "hm.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }
}
