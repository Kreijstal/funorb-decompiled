/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tb implements ka {
    private int field_f;
    private r field_i;
    static String field_c;
    private la field_h;
    private ui[] field_g;
    static boolean field_b;
    private r field_e;
    static cr field_a;
    static er field_d;

    public final ui e(int param0, int param1) {
        if (param1 != -1) {
          tb.a(12);
        }
        return this.field_g[param0];
    }

    public final int[] a(int param0, float param1, int param2, boolean param3, int param4, int param5) {
        if (param0 != -9718) {
          tb.a(26);
        }
        return this.g(param0 ^ -28760, param2).a(this.field_e, (double)param1, param3, this.field_g[param2].field_i, param5, 27127, param4, (ka) (this));
    }

    he g(int param0, int param1) {
        gp var3 = this.field_h.a((long)param1, false);
        if (var3 != null) {
          return (he) (var3);
        }
        byte[] var4 = this.field_i.a(true, param1);
        if (param0 != 21922) {
          this.e(-77, -84);
        }
        if (var4 == null) {
          return null;
        }
        he var5 = new he(new ed(var4));
        this.field_h.a(-1, var5, (long)param1);
        return var5;
    }

    public final boolean f(int param0, int param1) {
        he var3;
        boolean stackIn_6_0 = false;
        var3 = this.g(21922, param1);
        if (param0 != 0) {
          field_d = (er) null;
        }
        stackIn_6_0 = (var3 != null) && (var3.a(this.field_e, (ka) (this), param0 ^ 0));
        return stackIn_6_0;
    }

    final static boolean a(byte param0) {
        if (param0 <= 112) {
          tb.a((byte) 109);
        }
        return ha.field_a != null ? true : false;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 30272) {
          return;
        }
        field_c = null;
        field_a = null;
    }

    tb(r param0, r param1, r param2) {
        ui stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        ui stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        ui stackIn_72_0 = null;
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
        ed var7 = null;
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
        this.field_h = new la(256);
        try {
          this.field_e = param2;
          this.field_i = param1;
          var7 = new ed(param0.a(0, 0, (byte) -74));
          this.field_f = var7.a((byte) -11);
          this.field_g = new ui[this.field_f];
          for (var5 = 0; var5 < this.field_f; var5++) {
            if (var7.h(-11) == 1) {
              this.field_g[var5] = new ui();
            }
          }
          for (var5Lifetime1 = 0; var5Lifetime1 < this.field_f; var5Lifetime1++) {
            if (null != this.field_g[var5Lifetime1]) {
              stackIn_11_0 = this.field_g[var5Lifetime1];
              stackIn_12_1 = (var7.h(-11) == 0);
              stackIn_11_0.field_a = stackIn_12_1;
            }
          }
          for (var5Lifetime2 = 0; var5Lifetime2 < this.field_f; var5Lifetime2++) {
            if (null != this.field_g[var5Lifetime2]) {
              stackIn_19_0 = this.field_g[var5Lifetime2];
              stackIn_20_1 = (var7.h(-11) == 1);
              stackIn_19_0.field_c = stackIn_20_1;
            }
          }
          for (var5Lifetime3 = 0; var5Lifetime3 < this.field_f; var5Lifetime3++) {
            if (this.field_g[var5Lifetime3] != null) {
              var7.h(-11);
            }
          }
          for (var5Lifetime4 = 0; this.field_f > var5Lifetime4; var5Lifetime4++) {
            if (null != this.field_g[var5Lifetime4]) {
              var7.g(111);
            }
          }
          for (var5Lifetime5 = 0; this.field_f > var5Lifetime5; var5Lifetime5++) {
            if (null != this.field_g[var5Lifetime5]) {
              var7.g(87);
            }
          }
          for (var5Lifetime6 = 0; var5Lifetime6 < this.field_f; var5Lifetime6++) {
            if (this.field_g[var5Lifetime6] != null) {
              var7.g(101);
            }
          }
          for (var5Lifetime7 = 0; this.field_f > var5Lifetime7; var5Lifetime7++) {
            if (null != this.field_g[var5Lifetime7]) {
              var7.g(105);
            }
          }
          for (var5Lifetime8 = 0; this.field_f > var5Lifetime8; var5Lifetime8++) {
            if (null != this.field_g[var5Lifetime8]) {
              this.field_g[var5Lifetime8].field_f = (short)var7.a((byte) -11);
            }
          }
          for (var5Lifetime9 = 0; var5Lifetime9 < this.field_f; var5Lifetime9++) {
            if (null != this.field_g[var5Lifetime9]) {
              var7.g(110);
            }
          }
          for (var5Lifetime10 = 0; this.field_f > var5Lifetime10; var5Lifetime10++) {
            if (null != this.field_g[var5Lifetime10]) {
              var7.g(93);
            }
          }
          for (var5Lifetime11 = 0; var5Lifetime11 < this.field_f; var5Lifetime11++) {
            if (null != this.field_g[var5Lifetime11]) {
              var7.h(-11);
            }
          }
          for (var5Lifetime12 = 0; this.field_f > var5Lifetime12; var5Lifetime12++) {
            if (this.field_g[var5Lifetime12] != null) {
              stackIn_72_0 = this.field_g[var5Lifetime12];
              stackIn_73_1 = (1 == var7.h(-11));
              stackIn_72_0.field_i = stackIn_73_1;
            }
          }
          for (var5Lifetime13 = 0; var5Lifetime13 < this.field_f; var5Lifetime13++) {
            if (null != this.field_g[var5Lifetime13]) {
              var7.g(84);
            }
          }
          for (var5Lifetime14 = 0; this.field_f > var5Lifetime14; var5Lifetime14++) {
            if (this.field_g[var5Lifetime14] != null) {
              var7.h(-11);
            }
          }
          for (var5Lifetime15 = 0; var5Lifetime15 < this.field_f; var5Lifetime15++) {
            if (this.field_g[var5Lifetime15] != null) {
              var7.h(-11);
            }
          }
          for (var5Lifetime16 = 0; this.field_f > var5Lifetime16; var5Lifetime16++) {
            if (null != this.field_g[var5Lifetime16]) {
              var7.h(-11);
            }
          }
          for (var5Lifetime17 = 0; this.field_f > var5Lifetime17; var5Lifetime17++) {
            if (this.field_g[var5Lifetime17] != null) {
              var7.h(-11);
            }
          }
          for (var5Lifetime18 = 0; this.field_f > var5Lifetime18; var5Lifetime18++) {
            if (null != this.field_g[var5Lifetime18]) {
              var7.b(true);
            }
          }
          for (var5Lifetime19 = 0; var5Lifetime19 < this.field_f; var5Lifetime19++) {
            if (this.field_g[var5Lifetime19] != null) {
              this.field_g[var5Lifetime19].field_h = var7.h(-11);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_113_0 = var4;
          stackIn_113_1 = new StringBuilder().append("tb.<init>(");
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
          throw wn.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_119_1).append(stackIn_120_2).append(')').toString());
        }
    }

    static {
        field_c = "Mute this player for 48 hours";
    }
}
