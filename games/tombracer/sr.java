/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr extends b implements tsa {
    private ij field_y;
    private int field_z;
    private String field_C;
    private rj[] field_x;
    private il field_B;
    private int[] field_w;

    final rj a(String param0, byte param1, qc param2) {
        rj var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        rj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new rj(param0, param2);
          var4.field_r = (isa) ((Object) new td());
          var5 = this.field_p - 2;
          if (param1 != -102) {
            this.field_B = (il) null;
          }
          this.a((byte) -31, this.field_m, 34 + this.field_p, 0, 0);
          var4.a((byte) -31, -14 + this.field_m, 30, 7, var5);
          this.a(var4, -1);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("sr.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = TombRacer.field_G ? 1 : 0;
        try {
          for (var6_int = 0; this.field_z > var6_int; var6_int++) {
            if (this.field_x[var6_int] == param2) {
              var7 = this.field_w[var6_int];
              if (var7 == -1) {
                this.field_y.i((byte) -1);
                break;
              }
              jsa.a(false, this.field_w[var6_int]);
              break;
            }
          }
          if (param4 < 44) {
            this.field_C = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sr.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    sr(ij param0, il param1, String param2) {
        super(0, 0, 288, 0, (isa) null);
        int var4_int = 0;
        this.field_z = 0;
        try {
          this.field_y = param0;
          this.field_C = param2;
          this.field_B = param1;
          var4_int = null == this.field_C ? 0 : this.field_B.a(this.field_C, 260, this.field_B.field_w);
          this.a((byte) -31, 288, 22 + var4_int, 0, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_z;
          this.b(var4_int + 1, (byte) 104);
          int var5 = -11 % ((-15 - param2) / 38);
          this.field_x[var4_int] = this.a(param0, (byte) -102, (qc) (this));
          this.field_w[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sr.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_z >= param0) {
          return;
        }
        rj[] var7 = new rj[param0];
        rj[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; this.field_z > var5; var5++) {
          var7[var5] = this.field_x[var5];
          var4[var5] = this.field_w[var5];
        }
        this.field_x = var3;
        this.field_z = param0;
        if (param1 >= 86) {
          this.field_w = var4;
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 >= 115) {
          return ub.field_c != ub.field_h ? true : false;
        }
        sr.a(-111);
        return ub.field_c != ub.field_h ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        this.field_B.a(this.field_C, 14 + (param0 + this.field_i), 10 + this.field_n + param1, -28 + this.field_m, this.field_p, 16777215, -1, 0, 0, this.field_B.field_w);
    }

    static {
    }
}
