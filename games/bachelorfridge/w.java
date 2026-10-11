/*
 * Decompiled by CFR-JS 0.4.0.
 */
class w implements q {
    private vi field_a;
    private vr field_b;
    static long field_g;
    static int[][] field_h;
    static boolean field_e;
    private gma[] field_c;
    private vr field_d;
    private int field_f;

    on d(int param0, int param1) {
        eo var3 = this.field_a.a(param1 ^ -23159, (long)param0);
        if (var3 != null) {
          return (on) (var3);
        }
        byte[] var4 = this.field_d.b(param0, 0);
        if (var4 == null) {
          return null;
        }
        on var5 = new on(new lu(var4));
        this.field_a.a(var5, (long)param0, 97);
        if (param1 != -23060) {
          field_h = (int[][]) null;
        }
        return var5;
    }

    public final gma c(int param0, int param1) {
        if (param1 != 0) {
          return (gma) null;
        }
        return this.field_c[param0];
    }

    final static void a(boolean param0) {
        int var3 = 0;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_1 = false;
        lda stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        lda var9 = null;
        int var10 = 0;
        var10 = BachelorFridge.field_y;
        try {
          if (!param0) {
            w.a(true);
          }
          var1_int = dfa.field_b - rs.field_a;
          rs.field_a = sd.field_a - (var1_int >> 1);
          vka.field_q = -(ula.field_f >> 1) + jfa.field_w;
          dfa.field_b = var1_int + rs.field_a;
          var2 = vka.field_q;
          for (var3 = 0; pt.field_a.length > var3; var3++) {
            var4 = gn.field_l[var3];
            if (var4 >= 0) {
              if (var4 != fw.field_i.field_g) {
                var5 = mt.field_v;
              } else {
                var5 = ru.field_c;
              }
            } else {
              var5 = wk.field_f;
            }
            var6 = pt.field_a[var3];
            stackIn_12_0 = true;
            stackIn_13_1 = !(var4 < 0);
            var7 = hka.a(stackIn_12_0, stackIn_13_1, var6);
            var8 = -(var7 >> 1) + sd.field_a;
            if (var4 >= 0) {
              if (fw.field_i.field_g == var4) {
                stackIn_18_0 = nj.field_j;
              } else {
                stackIn_18_0 = aka.field_x;
              }
              var9 = stackIn_18_0;
              var2 = var2 + raa.field_J;
              if (var9 != null) {
                var9.a(jo.field_t + (pba.field_r << 1), 28, -hna.field_k + var8, var2, var7 + (hna.field_k << 1));
              }
              var2 = var2 + pba.field_r;
            }
            if (0 <= var4) {
              lha.field_b.c(var6, var8, var2 + mha.field_g, var5, -1);
              var2 = var2 + (pba.field_r + (raa.field_J + jo.field_t));
            } else {
              qm.field_a.c(var6, var8, ah.field_l + var2, var5, -1);
              var2 = var2 + un.field_i;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "w.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_h = (int[][]) null;
        if (param0 <= 29) {
          w.a(true);
        }
    }

    w(vr param0, vr param1, vr param2) {
        gma stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        gma stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        gma stackIn_72_0 = null;
        boolean stackIn_73_1 = false;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        String stackIn_114_2 = null;
        StringBuilder stackIn_116_1 = null;
        String stackIn_117_2 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_120_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        lu var7 = null;
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
        this.field_a = new vi(256);
        try {
          this.field_d = param1;
          this.field_b = param2;
          var7 = new lu(param0.b(-38, 0, 0));
          this.field_f = var7.e((byte) 103);
          this.field_c = new gma[this.field_f];
          for (var5 = 0; this.field_f > var5; var5++) {
            if (var7.b(16711935) == 1) {
              this.field_c[var5] = new gma();
            }
          }
          for (var5Lifetime1 = 0; this.field_f > var5Lifetime1; var5Lifetime1++) {
            if (this.field_c[var5Lifetime1] != null) {
              stackIn_11_0 = this.field_c[var5Lifetime1];
              stackIn_12_1 = (var7.b(16711935) == 0);
              stackIn_11_0.field_f = stackIn_12_1;
            }
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < this.field_f; var5Lifetime2++) {
            if (null != this.field_c[var5Lifetime2]) {
              stackIn_19_0 = this.field_c[var5Lifetime2];
              stackIn_20_1 = (var7.b(16711935) == 1);
              stackIn_19_0.field_d = stackIn_20_1;
            }
          }
          for (var5Lifetime3 = 0; this.field_f > var5Lifetime3; var5Lifetime3++) {
            if (null != this.field_c[var5Lifetime3]) {
              var7.b(16711935);
            }
          }
          for (var5Lifetime4 = 0; var5Lifetime4 < this.field_f; var5Lifetime4++) {
            if (this.field_c[var5Lifetime4] != null) {
              var7.b(true);
            }
          }
          for (var5Lifetime5 = 0; var5Lifetime5 < this.field_f; var5Lifetime5++) {
            if (this.field_c[var5Lifetime5] != null) {
              var7.b(true);
            }
          }
          for (var5Lifetime6 = 0; this.field_f > var5Lifetime6; var5Lifetime6++) {
            if (null != this.field_c[var5Lifetime6]) {
              var7.b(true);
            }
          }
          for (var5Lifetime7 = 0; this.field_f > var5Lifetime7; var5Lifetime7++) {
            if (this.field_c[var5Lifetime7] != null) {
              var7.b(true);
            }
          }
          for (var5Lifetime8 = 0; var5Lifetime8 < this.field_f; var5Lifetime8++) {
            if (this.field_c[var5Lifetime8] != null) {
              this.field_c[var5Lifetime8].field_g = (short)var7.e((byte) 77);
            }
          }
          for (var5Lifetime9 = 0; this.field_f > var5Lifetime9; var5Lifetime9++) {
            if (null != this.field_c[var5Lifetime9]) {
              var7.b(true);
            }
          }
          for (var5Lifetime10 = 0; var5Lifetime10 < this.field_f; var5Lifetime10++) {
            if (null != this.field_c[var5Lifetime10]) {
              var7.b(true);
            }
          }
          for (var5Lifetime11 = 0; this.field_f > var5Lifetime11; var5Lifetime11++) {
            if (null != this.field_c[var5Lifetime11]) {
              var7.b(16711935);
            }
          }
          for (var5Lifetime12 = 0; var5Lifetime12 < this.field_f; var5Lifetime12++) {
            if (this.field_c[var5Lifetime12] != null) {
              stackIn_72_0 = this.field_c[var5Lifetime12];
              stackIn_73_1 = (var7.b(16711935) == 1);
              stackIn_72_0.field_a = stackIn_73_1;
            }
          }
          for (var5Lifetime13 = 0; var5Lifetime13 < this.field_f; var5Lifetime13++) {
            if (this.field_c[var5Lifetime13] != null) {
              var7.b(true);
            }
          }
          for (var5Lifetime14 = 0; var5Lifetime14 < this.field_f; var5Lifetime14++) {
            if (null != this.field_c[var5Lifetime14]) {
              var7.b(16711935);
            }
          }
          for (var5Lifetime15 = 0; var5Lifetime15 < this.field_f; var5Lifetime15++) {
            if (this.field_c[var5Lifetime15] != null) {
              var7.b(16711935);
            }
          }
          for (var5Lifetime16 = 0; var5Lifetime16 < this.field_f; var5Lifetime16++) {
            if (null != this.field_c[var5Lifetime16]) {
              var7.b(16711935);
            }
          }
          for (var5Lifetime17 = 0; var5Lifetime17 < this.field_f; var5Lifetime17++) {
            if (this.field_c[var5Lifetime17] != null) {
              var7.b(16711935);
            }
          }
          for (var5Lifetime18 = 0; var5Lifetime18 < this.field_f; var5Lifetime18++) {
            if (null != this.field_c[var5Lifetime18]) {
              var7.f(57);
            }
          }
          for (var5Lifetime19 = 0; this.field_f > var5Lifetime19; var5Lifetime19++) {
            if (null != this.field_c[var5Lifetime19]) {
              this.field_c[var5Lifetime19].field_b = var7.b(16711935);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_113_0 = var4;
          stackIn_113_1 = new StringBuilder().append("w.<init>(");
          if (param0 == null) {
            stackIn_114_2 = "null";
          } else {
            stackIn_114_2 = "{...}";
          }
          stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',');
          if (param1 == null) {
            stackIn_117_2 = "null";
          } else {
            stackIn_117_2 = "{...}";
          }
          stackIn_119_1 = ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(',');
          if (param2 == null) {
            stackIn_120_2 = "null";
          } else {
            stackIn_120_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    public final int[] a(int param0, boolean param1, int param2, float param3, int param4, int param5) {
        if (param0 != 0) {
          return (int[]) null;
        }
        return this.d(param4, param0 ^ -23060).a((double)param3, this.field_c[param4].field_a, (q) (this), param5, param2, this.field_b, param1, -1);
    }

    public final boolean c(byte param0, int param1) {
        on var3;
        boolean stackIn_6_0 = false;
        var3 = this.d(param1, -23060);
        if (param0 >= -45) {
          this.c(-79, 92);
        }
        stackIn_6_0 = (var3 != null) && (var3.a((q) (this), this.field_b, -63));
        return stackIn_6_0;
    }

    static {
    }
}
