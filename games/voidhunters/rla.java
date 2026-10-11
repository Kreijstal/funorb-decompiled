/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends dqa implements oo {
    private htb field_w;
    private htb field_z;
    private htb field_y;
    static dja field_v;
    static int field_x;

    final static boolean c(boolean param0) {
        if (param0) {
          rla.i((byte) -52);
          if (!upa.field_a) {
            return false;
          }
          if (pk.field_o != -1) {
            return true;
          }
          if (-1 != noa.field_q) {
            return true;
          }
          return false;
        }
        if (!upa.field_a) {
          return false;
        }
        if (pk.field_o != -1) {
          return true;
        }
        if (-1 == noa.field_q) {
          return false;
        }
        return true;
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var5 = param0 + this.field_g;
        int var6Lifetime1;
        if (param2 > 47) {
          var6 = param3 + this.field_r;
          loa.field_o.a(dkb.field_a, 20 + var5, var6 + 20, this.field_h - 40, this.field_f - 50, 16777215, -1, 1, 0, loa.field_o.field_k);
          super.b(param0, param1, 94, param3);
          return;
        }
        this.field_z = (htb) null;
        var6Lifetime1 = param3 + this.field_r;
        loa.field_o.a(dkb.field_a, 20 + var5, var6Lifetime1 + 20, this.field_h - 40, this.field_f - 50, 16777215, -1, 1, 0, loa.field_o.field_k);
        super.b(param0, param1, 94, param3);
    }

    public static void i(byte param0) {
        if (param0 < 45) {
          return;
        }
        field_v = null;
    }

    public rla() {
        super(0, 0, 476, 225, (wwa) null);
        this.field_w = new htb(gqb.field_b, (sba) null);
        this.field_y = new htb(gsa.field_p, (sba) null);
        this.field_z = new htb(cjb.field_a, (sba) null);
        vva var1 = new vva();
        this.field_w.field_q = (wwa) ((Object) var1);
        this.field_y.field_q = (wwa) ((Object) var1);
        this.field_z.field_q = (wwa) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_y.a(this.field_h - var3 >> 1, var4, 30, 1, -48 + this.field_f - var2);
        this.field_z.a(var4 + ((this.field_h - var3 >> 1) + var2), var4, 30, 1, -var2 - 48 + this.field_f);
        this.field_w.a(this.field_h - var3 >> 1, var3, 30, 1, -78 + (this.field_f - var2 * 2));
        this.field_y.field_l = (sba) (this);
        this.field_w.field_l = (sba) (this);
        this.field_z.field_l = (sba) (this);
        this.field_w.field_p = tt.field_a;
        this.field_z.field_p = dqa.field_u;
        this.b(-18756, this.field_y);
        this.b(-18756, this.field_w);
        this.b(-18756, this.field_z);
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0 + 0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a(param2, param0 ^ -15834);
            return stackIn_7_0;
          }
          if (param1 == 99) {
            stackIn_10_0 = this.a(true, param2);
            return stackIn_10_0;
          }
          if (param0 == -15834) {
            return false;
          }
          field_x = -28;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("rla.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (this.field_y == param3) {
            ot.a(-96);
          } else {
            if (this.field_w == param3) {
              kga.a(70);
            } else {
              if (param3 == this.field_z) {
                pr.a(17496);
              }
            }
          }
          if (param0 == 11) {
            return;
          }
          this.field_y = (htb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("rla.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_v = (dja) ((Object) new eoa());
        field_x = 1;
    }
}
