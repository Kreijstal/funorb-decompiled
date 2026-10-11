/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qma implements d {
    private int field_a;
    static boolean field_c;
    private dw[] field_b;
    static String field_f;
    private pea field_e;
    private cn field_d;
    private cn field_g;

    public static void a(byte param0) {
        field_f = null;
        if (param0 < 10) {
          java.awt.Component var2 = (java.awt.Component) null;
          qma.a((java.awt.Component) null, 70);
        }
    }

    public boolean a(int param0, byte param1) {
        km var3;
        boolean stackIn_6_0 = false;
        if (param1 < 10) {
          return true;
        }
        var3 = this.a(param0, 0);
        stackIn_6_0 = (var3 != null) && (var3.a(this.field_d, (d) (this), 0));
        return stackIn_6_0;
    }

    public final int a(int param0) {
        if (param0 != -15061) {
          return 75;
        }
        return this.field_a;
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.setFocusTraversalKeysEnabled(false);
        param0.addKeyListener(nfa.field_n);
        if (param1 > -4) {
          return;
        }
        try {
          param0.addFocusListener(nfa.field_n);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qma.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final dw a(byte param0, int param1) {
        int var3 = -28 % ((55 - param0) / 41);
        return this.field_b[param1];
    }

    public final int[] a(int param0, int param1, boolean param2, int param3, float param4, int param5) {
        if (param0 != 14907) {
          this.field_d = (cn) null;
        }
        return this.a(param1, 0).a(param5, this.field_d, param2, (double)param4, (d) (this), (byte) 104, param3, this.field_b[param1].field_e);
    }

    private final km a(int param0, int param1) {
        od var3 = this.field_e.a(param1 + param1, (long)param0);
        if (var3 != null) {
          return (km) (var3);
        }
        byte[] var4 = this.field_g.f(param0, -109);
        if (var4 == null) {
          return null;
        }
        km var5 = new km(new uia(var4));
        this.field_e.a(var5, (byte) 96, (long)param0);
        return var5;
    }

    public final float[] a(int param0, int param1, int param2, int param3, float param4, boolean param5) {
        if (param0 <= 114) {
          field_f = (String) null;
        }
        return this.a(param3, 0).a((d) (this), (byte) -127, param1, param2, this.field_b[param3].field_e, this.field_d);
    }

    qma(cn param0, cn param1, cn param2) {
        dw stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        dw stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        dw stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        dw stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        dw stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        dw stackIn_91_0 = null;
        boolean stackIn_92_1 = false;
        dw stackIn_99_0 = null;
        boolean stackIn_100_1 = false;
        dw stackIn_107_0 = null;
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
        uia var7 = null;
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
        this.field_e = new pea(256);
        try {
          this.field_d = param2;
          this.field_g = param1;
          var7 = new uia(param0.a(false, 0, 0));
          this.field_a = var7.d(123);
          this.field_b = new dw[this.field_a];
          for (var5 = 0; var5 < this.field_a; var5++) {
            if (var7.h(255) == 1) {
              this.field_b[var5] = new dw();
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_a; var5Lifetime1++) {
            if (null != this.field_b[var5Lifetime1]) {
              stackIn_11_0 = this.field_b[var5Lifetime1];
              stackIn_12_1 = (var7.h(255) == 0);
              stackIn_11_0.field_p = stackIn_12_1;
            }
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < this.field_a; var5Lifetime2++) {
            if (null != this.field_b[var5Lifetime2]) {
              stackIn_19_0 = this.field_b[var5Lifetime2];
              stackIn_20_1 = (var7.h(255) == 1);
              stackIn_19_0.field_g = stackIn_20_1;
            }
          }
          for (var5Lifetime3 = 0; var5Lifetime3 < this.field_a; var5Lifetime3++) {
            if (null != this.field_b[var5Lifetime3]) {
              stackIn_27_0 = this.field_b[var5Lifetime3];
              stackIn_28_1 = (var7.h(255) == 1);
              stackIn_27_0.field_f = stackIn_28_1;
            }
          }
          for (var5Lifetime4 = 0; var5Lifetime4 < this.field_a; var5Lifetime4++) {
            if (this.field_b[var5Lifetime4] != null) {
              this.field_b[var5Lifetime4].field_i = var7.c((byte) 90);
            }
          }
          for (var5Lifetime5 = 0; var5Lifetime5 < this.field_a; var5Lifetime5++) {
            if (null != this.field_b[var5Lifetime5]) {
              this.field_b[var5Lifetime5].field_c = var7.c((byte) 91);
            }
          }
          for (var5Lifetime6 = 0; var5Lifetime6 < this.field_a; var5Lifetime6++) {
            if (this.field_b[var5Lifetime6] != null) {
              this.field_b[var5Lifetime6].field_h = var7.c((byte) 85);
            }
          }
          for (var5Lifetime7 = 0; var5Lifetime7 < this.field_a; var5Lifetime7++) {
            if (null != this.field_b[var5Lifetime7]) {
              this.field_b[var5Lifetime7].field_a = var7.c((byte) 126);
            }
          }
          for (var5Lifetime8 = 0; var5Lifetime8 < this.field_a; var5Lifetime8++) {
            if (null != this.field_b[var5Lifetime8]) {
              this.field_b[var5Lifetime8].field_m = (short)var7.d(124);
            }
          }
          for (var5Lifetime9 = 0; var5Lifetime9 < this.field_a; var5Lifetime9++) {
            if (null != this.field_b[var5Lifetime9]) {
              this.field_b[var5Lifetime9].field_s = var7.c((byte) 45);
            }
          }
          for (var5Lifetime10 = 0; var5Lifetime10 < this.field_a; var5Lifetime10++) {
            if (null != this.field_b[var5Lifetime10]) {
              this.field_b[var5Lifetime10].field_o = var7.c((byte) 70);
            }
          }
          for (var5Lifetime11 = 0; this.field_a > var5Lifetime11; var5Lifetime11++) {
            if (this.field_b[var5Lifetime11] != null) {
              stackIn_70_0 = this.field_b[var5Lifetime11];
              stackIn_71_1 = (var7.h(255) == 1);
              stackIn_70_0.field_k = stackIn_71_1;
            }
          }
          for (var5Lifetime12 = 0; var5Lifetime12 < this.field_a; var5Lifetime12++) {
            if (this.field_b[var5Lifetime12] != null) {
              stackIn_78_0 = this.field_b[var5Lifetime12];
              stackIn_79_1 = (var7.h(255) == 1);
              stackIn_78_0.field_e = stackIn_79_1;
            }
          }
          for (var5Lifetime13 = 0; this.field_a > var5Lifetime13; var5Lifetime13++) {
            if (null != this.field_b[var5Lifetime13]) {
              this.field_b[var5Lifetime13].field_r = var7.c((byte) 39);
            }
          }
          for (var5Lifetime14 = 0; var5Lifetime14 < this.field_a; var5Lifetime14++) {
            if (this.field_b[var5Lifetime14] != null) {
              stackIn_91_0 = this.field_b[var5Lifetime14];
              stackIn_92_1 = (var7.h(255) == 1);
              stackIn_91_0.field_b = stackIn_92_1;
            }
          }
          for (var5Lifetime15 = 0; var5Lifetime15 < this.field_a; var5Lifetime15++) {
            if (this.field_b[var5Lifetime15] != null) {
              stackIn_99_0 = this.field_b[var5Lifetime15];
              stackIn_100_1 = (var7.h(255) == 1);
              stackIn_99_0.field_n = stackIn_100_1;
            }
          }
          for (var5Lifetime16 = 0; this.field_a > var5Lifetime16; var5Lifetime16++) {
            if (this.field_b[var5Lifetime16] != null) {
              stackIn_107_0 = this.field_b[var5Lifetime16];
              stackIn_108_1 = (1 == var7.h(255));
              stackIn_107_0.field_l = stackIn_108_1;
            }
          }
          for (var5Lifetime17 = 0; var5Lifetime17 < this.field_a; var5Lifetime17++) {
            if (this.field_b[var5Lifetime17] != null) {
              this.field_b[var5Lifetime17].field_q = var7.h(255);
            }
          }
          for (var5Lifetime18 = 0; var5Lifetime18 < this.field_a; var5Lifetime18++) {
            if (this.field_b[var5Lifetime18] != null) {
              this.field_b[var5Lifetime18].field_t = var7.e(-106);
            }
          }
          for (var5Lifetime19 = 0; this.field_a > var5Lifetime19; var5Lifetime19++) {
            if (this.field_b[var5Lifetime19] != null) {
              this.field_b[var5Lifetime19].field_d = var7.h(255);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_128_0 = var4;
          stackIn_128_1 = new StringBuilder().append("qma.<init>(");
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
          throw tba.a((Throwable) ((Object) stackIn_128_0), ((StringBuilder) (Object) stackIn_134_1).append(stackIn_135_2).append(')').toString());
        }
    }

    public final int[] a(byte param0, int param1, float param2, int param3, boolean param4, int param5) {
        if (param0 != 40) {
          qma.a((byte) 28, 0.7337705479498259);
        }
        return this.a(param3, 0).a(param1, this.field_b[param3].field_e, param5, (double)param2, this.field_d, (d) (this), false);
    }

    final static int a(byte param0, double param1) {
        if (param0 != 123) {
          field_f = (String) null;
        }
        if (!(0.0 < param1)) {
          if (0.0 > param1) {
            return (int)(param1 - 0.5);
          }
          return 0;
        }
        return (int)(0.5 + param1);
    }

    static {
        field_c = false;
        field_f = "That name is not available";
    }
}
