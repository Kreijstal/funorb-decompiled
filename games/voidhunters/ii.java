/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii implements d {
    static String field_g;
    static dja field_d;
    private opa[] field_b;
    private ehb field_f;
    private asb field_e;
    private asb field_c;
    static boolean field_h;
    private int field_i;
    static String field_a;

    public final float[] a(float param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 121 / ((param4 - 31) / 41);
        return this.b(-2, param2).a(2, param3, (d) (this), this.field_b[param2].field_e, this.field_e, param1);
    }

    public final int a(int param0) {
        if (param0 != 11316) {
          this.a(51, 52);
        }
        return this.field_i;
    }

    public final int[] a(int param0, int param1, int param2, boolean param3, int param4, float param5) {
        if (param0 <= 78) {
          this.field_e = (asb) null;
        }
        return this.b(-2, param4).a(param1, false, param2, this.field_b[param4].field_e, this.field_e, (d) (this), (double)param5);
    }

    public final opa a(int param0, int param1) {
        if (param0 != -20292) {
          this.field_c = (asb) null;
        }
        return this.field_b[param1];
    }

    private final lra b(int param0, int param1) {
        fh var3 = this.field_f.a((long)param1, 77);
        if (param0 != -2) {
          this.a(-32, (byte) 119);
        }
        if (var3 != null) {
          return (lra) (var3);
        }
        byte[] var4 = this.field_c.c((byte) 9, param1);
        if (var4 == null) {
          return null;
        }
        lra var5 = new lra(new ds(var4));
        this.field_f.a((long)param1, (byte) -22, var5);
        return var5;
    }

    public final boolean a(int param0, byte param1) {
        lra var3;
        boolean stackIn_6_0 = false;
        var3 = this.b(-2, param0);
        if (param1 > -30) {
          return false;
        }
        stackIn_6_0 = (var3 != null) && (var3.a(0, this.field_e, (d) (this)));
        return stackIn_6_0;
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 25498) {
          ii.b(116);
        }
    }

    public final int[] a(int param0, float param1, boolean param2, int param3, int param4, boolean param5) {
        if (!param2) {
          field_h = true;
        }
        return this.b(-2, param3).a(param5, (d) (this), this.field_e, 0, this.field_b[param3].field_e, param4, (double)param1, param0);
    }

    ii(asb param0, asb param1, asb param2) {
        opa stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        opa stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        opa stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        opa stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        opa stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        opa stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        opa stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        opa stackIn_107_0 = null;
        boolean stackIn_108_1 = false;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_129_2 = null;
        StringBuilder stackIn_131_1 = null;
        String stackIn_132_2 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_135_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ds var7 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var5Lifetime8;
        int var5Lifetime9;
        int var5Lifetime10;
        int var5Lifetime11;
        int var5Lifetime12;
        int var5Lifetime13;
        int var5Lifetime14;
        int var5Lifetime15;
        int var5Lifetime16;
        int var5Lifetime17;
        int var5Lifetime18;
        int var5Lifetime19;
        this.field_f = new ehb(256);
        try {
          this.field_e = param2;
          this.field_c = param1;
          var7 = new ds(param0.a(0, 0, (byte) 13));
          this.field_i = var7.e(1869);
          this.field_b = new opa[this.field_i];
          for (var5 = 0; var5 < this.field_i; var5++) {
            if (var7.e((byte) -99) == 1) {
              this.field_b[var5] = new opa();
            }
          }
          for (var5Lifetime1 = 0; this.field_i > var5Lifetime1; var5Lifetime1++) {
            if (null != this.field_b[var5Lifetime1]) {
              stackIn_11_0 = this.field_b[var5Lifetime1];
              stackIn_12_1 = (0 == var7.e((byte) -119));
              stackIn_11_0.field_r = stackIn_12_1;
            }
          }
          for (var5Lifetime2 = 0; this.field_i > var5Lifetime2; var5Lifetime2++) {
            if (null != this.field_b[var5Lifetime2]) {
              stackIn_19_0 = this.field_b[var5Lifetime2];
              stackIn_20_1 = (var7.e((byte) -123) == 1);
              stackIn_19_0.field_h = stackIn_20_1;
            }
          }
          for (var5Lifetime3 = 0; this.field_i > var5Lifetime3; var5Lifetime3++) {
            if (null != this.field_b[var5Lifetime3]) {
              stackIn_27_0 = this.field_b[var5Lifetime3];
              stackIn_28_1 = (1 == var7.e((byte) -87));
              stackIn_27_0.field_m = stackIn_28_1;
            }
          }
          for (var5Lifetime4 = 0; var5Lifetime4 < this.field_i; var5Lifetime4++) {
            if (this.field_b[var5Lifetime4] != null) {
              this.field_b[var5Lifetime4].field_g = var7.d((byte) -114);
            }
          }
          for (var5Lifetime5 = 0; var5Lifetime5 < this.field_i; var5Lifetime5++) {
            if (this.field_b[var5Lifetime5] != null) {
              this.field_b[var5Lifetime5].field_b = var7.d((byte) -114);
            }
          }
          for (var5Lifetime6 = 0; var5Lifetime6 < this.field_i; var5Lifetime6++) {
            if (this.field_b[var5Lifetime6] != null) {
              this.field_b[var5Lifetime6].field_c = var7.d((byte) -114);
            }
          }
          for (var5Lifetime7 = 0; this.field_i > var5Lifetime7; var5Lifetime7++) {
            if (null != this.field_b[var5Lifetime7]) {
              this.field_b[var5Lifetime7].field_n = var7.d((byte) -114);
            }
          }
          for (var5Lifetime8 = 0; var5Lifetime8 < this.field_i; var5Lifetime8++) {
            if (this.field_b[var5Lifetime8] != null) {
              this.field_b[var5Lifetime8].field_l = (short)var7.e(1869);
            }
          }
          for (var5Lifetime9 = 0; this.field_i > var5Lifetime9; var5Lifetime9++) {
            if (null != this.field_b[var5Lifetime9]) {
              this.field_b[var5Lifetime9].field_p = var7.d((byte) -114);
            }
          }
          for (var5Lifetime10 = 0; this.field_i > var5Lifetime10; var5Lifetime10++) {
            if (null != this.field_b[var5Lifetime10]) {
              this.field_b[var5Lifetime10].field_d = var7.d((byte) -114);
            }
          }
          for (var5Lifetime11 = 0; var5Lifetime11 < this.field_i; var5Lifetime11++) {
            if (null != this.field_b[var5Lifetime11]) {
              stackIn_70_0 = this.field_b[var5Lifetime11];
              stackIn_71_1 = (var7.e((byte) -122) == 1);
              stackIn_70_0.field_a = stackIn_71_1;
            }
          }
          for (var5Lifetime12 = 0; var5Lifetime12 < this.field_i; var5Lifetime12++) {
            if (null != this.field_b[var5Lifetime12]) {
              stackIn_78_0 = this.field_b[var5Lifetime12];
              stackIn_79_1 = (var7.e((byte) -87) == 1);
              stackIn_78_0.field_e = stackIn_79_1;
            }
          }
          for (var5Lifetime13 = 0; this.field_i > var5Lifetime13; var5Lifetime13++) {
            if (this.field_b[var5Lifetime13] != null) {
              this.field_b[var5Lifetime13].field_j = var7.d((byte) -114);
            }
          }
          for (var5Lifetime14 = 0; this.field_i > var5Lifetime14; var5Lifetime14++) {
            if (this.field_b[var5Lifetime14] != null) {
              stackIn_91_0 = this.field_b[var5Lifetime14];
              stackIn_92_1 = (var7.e((byte) -95) == 1);
              stackIn_91_0.field_k = stackIn_92_1;
            }
          }
          for (var5Lifetime15 = 0; this.field_i > var5Lifetime15; var5Lifetime15++) {
            if (this.field_b[var5Lifetime15] != null) {
              stackIn_99_0 = this.field_b[var5Lifetime15];
              stackIn_100_1 = (var7.e((byte) -121) == 1);
              stackIn_99_0.field_s = stackIn_100_1;
            }
          }
          for (var5Lifetime16 = 0; var5Lifetime16 < this.field_i; var5Lifetime16++) {
            if (null != this.field_b[var5Lifetime16]) {
              stackIn_107_0 = this.field_b[var5Lifetime16];
              stackIn_108_1 = (1 == var7.e((byte) -115));
              stackIn_107_0.field_i = stackIn_108_1;
            }
          }
          for (var5Lifetime17 = 0; var5Lifetime17 < this.field_i; var5Lifetime17++) {
            if (null != this.field_b[var5Lifetime17]) {
              this.field_b[var5Lifetime17].field_f = var7.e((byte) -101);
            }
          }
          for (var5Lifetime18 = 0; var5Lifetime18 < this.field_i; var5Lifetime18++) {
            if (null != this.field_b[var5Lifetime18]) {
              this.field_b[var5Lifetime18].field_o = var7.h(36);
            }
          }
          for (var5Lifetime19 = 0; var5Lifetime19 < this.field_i; var5Lifetime19++) {
            if (null != this.field_b[var5Lifetime19]) {
              this.field_b[var5Lifetime19].field_q = var7.e((byte) -98);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_128_0 = var4;
          stackIn_128_1 = new StringBuilder().append("ii.<init>(");
          if (param0 == null) {
            stackIn_129_2 = "null";
          } else {
            stackIn_129_2 = "{...}";
          }
          stackIn_131_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',');
          if (param1 == null) {
            stackIn_132_2 = "null";
          } else {
            stackIn_132_2 = "{...}";
          }
          stackIn_134_1 = ((StringBuilder) (Object) stackIn_131_1).append(stackIn_132_2).append(',');
          if (param2 == null) {
            stackIn_135_2 = "null";
          } else {
            stackIn_135_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_128_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(')').toString());
        }
    }

    static {
        field_g = "Next event";
        field_d = (dja) ((Object) new upa());
        field_a = "Assault";
    }
}
