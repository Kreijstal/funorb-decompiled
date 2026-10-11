/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends nb implements jk {
    private String[] field_D;
    private ag field_L;
    private kf[] field_G;
    static m field_J;
    static volatile int field_I;
    static String field_K;
    static String[] field_F;
    static db field_C;

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        le var5 = ql.field_Q;
        if (null != this.field_D) {
          var5.a(ka.field_a, this.field_t + param2, param1 + this.field_o, this.field_j, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_E);
        }
    }

    final void a(String[] param0, boolean param1) {
        int var4_int = 0;
        int var5 = 0;
        kf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        boolean stackIn_16_3;
        kf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        boolean stackIn_20_3;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        uj var4 = null;
        int var6 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_A.g(-81);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_D = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_D[var4_int] = pj.a((CharSequence) ((Object) param0[var4_int]), (byte) -126).replace(' ', ' ');
            }
            if (param1) {
              field_J = (m) null;
            }
            var4 = new uj(ql.field_Q, 0, 1);
            this.field_G = new kf[1 + var3_int];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_G[var5] = new kf(this.field_D[var5], (vd) (this));
              this.field_G[var5].field_i = (rd) ((Object) var4);
              this.field_G[var5].field_q = cb.field_A;
              stackIn_15_0 = this.field_G[var5];
              stackIn_15_1 = 15;
              stackIn_15_2 = 80;
              stackIn_16_3 = !(param1);
              ((kf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_16_3, 20 + 16 * var5, 0);
              this.b((byte) 112, this.field_G[var5]);
            }
            this.field_G[var3_int] = new kf(bc.field_J, (vd) (this));
            this.field_G[var3_int].field_i = (rd) ((Object) var4);
            stackIn_19_0 = this.field_G[var3_int];
            stackIn_19_1 = 15;
            stackIn_19_2 = 100;
            stackIn_20_3 = !(param1);
            ((kf) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_20_3, (1 + var3_int) * 16 + 20, 0);
            this.b((byte) -80, this.field_G[var3_int]);
            return;
          }
          this.field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("bb.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(char param0, int param1, w param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 120 % ((param3 + 13) / 55);
          if (super.a(param0, param1, param2, (byte) 42)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.a(0, param2);
            return stackIn_7_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_11_0 = this.c((byte) 119, param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("bb.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.field_D.length; var6_int++) {
            if (this.field_G[var6_int] == param4) {
              this.field_L.a(this.field_D[var6_int], (byte) 110);
            }
          }
          if (this.field_G[this.field_D.length] == param4) {
            this.field_L.a((byte) -12);
          }
          if (param2 != 215535458) {
            field_F = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("bb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, boolean param1, int param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0 == null) {
            return false;
          }
          var3_int = param0.length();
          if (1 <= var3_int &&
            var3_int <= 12) {
            var4 = ck.a(param0, (byte) -48);
            if (var4 == null) {
              return false;
            }
            if (var4.length() < 1) {
              return false;
            }
            if (!cf.a(var4.charAt(0), (byte) 78) &&
              !cf.a(var4.charAt(-1 + var4.length()), (byte) 78)) {
              var5 = 0;
              for (var6 = 0; var6 < param0.length(); var6++) {
                var7 = param0.charAt(var6);
                if (!cf.a((char) var7, (byte) 78)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (2 <= var5 &&
                  !param1) {
                  return false;
                }
              }
              if (~var5 >= param2) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("bb.D(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_F = null;
        field_C = null;
        field_K = null;
        if (param0 != -26) {
          field_C = (db) null;
        }
        field_J = null;
    }

    bb(ag param0) {
        super(0, 0, 0, 0, (rd) null);
        try {
          this.field_L = param0;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = 0;
        field_J = new m("email");
        field_K = "Create";
        field_F = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_C = new db(311, 450);
    }
}
