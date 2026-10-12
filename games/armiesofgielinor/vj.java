/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static int field_g;
    static int field_a;
    private int field_d;
    private qb[] field_l;
    private int[] field_k;
    private int field_h;
    static String field_n;
    boolean field_c;
    int field_i;
    static at field_b;
    int field_m;
    private int field_e;
    private qb field_f;
    static byte[][] field_j;

    public static void b(int param0) {
        field_n = null;
        field_b = null;
        field_j = (byte[][]) null;
        int var1 = 20 % ((param0 + 44) / 51);
    }

    final boolean a(int param0) {
        int dupTemp$0 = 0;
        int var2;
        this.field_c = false;
        if (null == this.field_l) {
          if (this.field_f == null) {
            return true;
          }
          this.field_e = this.field_e - 1;
          if (param0 < -72) {
            if (this.field_e <= 0) {
              return this.a((byte) -33);
            }
            return false;
          }
          this.field_f = (qb) null;
          if (this.field_e > 0) {
            return false;
          }
          return this.a((byte) -33);
        }
        if (0 > this.field_h) {
          if (this.field_f == null) {
            return true;
          }
          this.field_e = this.field_e - 1;
          if (param0 >= -72) {
            this.field_f = (qb) null;
          }
          if (this.field_e <= 0) {
            return this.a((byte) -33);
          }
          return false;
        }
        dupTemp$0 = this.field_k[this.field_h];
        this.field_k[this.field_h] = dupTemp$0 - 1;
        if (0 <= dupTemp$0) {
          if (this.field_f == null) {
            return true;
          }
          this.field_e = this.field_e - 1;
          if (param0 >= -72) {
            this.field_f = (qb) null;
          }
          if (this.field_e <= 0) {
            return this.a((byte) -33);
          }
          return false;
        }
        var2 = this.field_h;
        this.a(-1, this.field_l[this.field_h]);
        this.field_h = var2;
        this.field_l[this.field_h] = null;
        this.field_h = this.field_h + 1;
        if (this.field_l.length == this.field_h) {
          this.field_h = 0;
        }
        if (this.field_l[this.field_h] == null) {
          this.field_h = -1;
        }
        if (this.field_f == null) {
          return true;
        }
        this.field_e = this.field_e - 1;
        if (param0 >= -72) {
          this.field_f = (qb) null;
        }
        if (this.field_e <= 0) {
          return this.a((byte) -33);
        }
        return false;
    }

    private final void a(boolean param0) {
        this.field_c = param0 ? true : false;
        this.field_m = 0;
        this.field_i = 0;
        this.field_d = 0;
        this.field_e = 0;
    }

    final kk a(boolean param0, boolean param1, boolean param2, kk param3) {
        kk var5 = null;
        RuntimeException var5_ref = null;
        kk stackIn_2_0 = null;
        kk stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        boolean stackIn_5_2 = false;
        boolean stackIn_6_3;
        kk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (kk) null;
            return stackIn_2_0;
          }
          stackIn_5_0 = (kk) (param3);
          stackIn_5_1 = param0;
          stackIn_5_2 = false;
          stackIn_6_3 = !(param2);
          var5 = ((kk) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_6_3);
          var5.a(ft.field_q, this.field_i, (wp) null, -1, 0, 0, param2);
          stackIn_7_0 = var5;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean a(byte param0) {
        this.field_m = this.field_m + 1;
        this.field_c = true;
        if (this.field_f.field_a.length <= this.field_m) {
          this.field_d = this.field_d + 1;
          if (!this.field_f.field_b &&
            this.field_f.field_j <= this.field_d) {
            return true;
          }
          if (0 > this.field_f.field_g) {
            this.field_m = 0;
          } else {
            if (this.field_f.field_a.length <= this.field_f.field_g) {
              this.field_m = 0;
            } else {
              this.field_m = this.field_f.field_g;
            }
          }
        }
        this.field_i = this.field_f.field_a[this.field_m];
        this.field_e = this.field_f.field_d[this.field_m];
        if (param0 == -33) {
          return false;
        }
        this.a(-91);
        return false;
    }

    final void a(int param0, qb param1) {
        try {
          this.a(false);
          this.field_f = param1;
          this.field_i = this.field_f.field_a[this.field_m];
          this.field_e = this.field_f.field_d[this.field_m];
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "vj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public vj() {
        this.field_c = false;
    }

    vj(int param0) {
        this.field_c = false;
        this.field_h = -1;
        this.field_k = new int[param0];
        this.field_l = new qb[param0];
    }

    static {
        field_n = "Red_Team";
    }
}
