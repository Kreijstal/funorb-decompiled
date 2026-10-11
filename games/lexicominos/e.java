/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    int[] field_a;
    static db field_u;
    static String field_g;
    static String[] field_p;
    private int[] field_l;
    int[] field_m;
    el field_b;
    int field_i;
    private byte[] field_v;
    static String field_h;
    int[][] field_n;
    int[] field_f;
    el[] field_c;
    static String field_e;
    private int field_k;
    int[] field_r;
    int field_s;
    int[] field_t;
    static int field_q;
    int field_d;
    byte[][] field_o;
    private int[][] field_j;

    public static void a(int param0) {
        if (param0 != 1) {
          field_q = 62;
        }
        field_g = null;
        field_p = null;
        field_e = null;
        field_h = null;
        field_u = null;
    }

    final static tf a(String param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        tf var7 = null;
        int var8 = 0;
        tf stackIn_4_0 = null;
        tf stackIn_7_0 = null;
        tf stackIn_10_0 = null;
        tf stackIn_14_0 = null;
        tf stackIn_20_0 = null;
        tf stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = w.field_k;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = vi.field_l;
            return stackIn_7_0;
          }
          if (param1 >= -69) {
            stackIn_10_0 = (tf) null;
            return stackIn_10_0;
          }
          var3 = dc.a(param0, '.', (byte) -125);
          if (2 > var3.length) {
            stackIn_14_0 = w.field_k;
            return stackIn_14_0;
          }
          var4 = var3;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            var7 = nc.a(63, var6);
            if (var7 != null) {
              stackIn_20_0 = var7;
              return stackIn_20_0;
            }
          }
          stackIn_23_0 = bg.a(var3[var3.length - 1], -21637);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("e.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte[] a(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = th.field_u.a((byte) 127, param0, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("e.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(boolean param0, byte[] param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        wf stackIn_5_0 = null;
        boolean stackIn_6_1 = false;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        wf var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param0) {
            this.field_m = (int[]) null;
          }
          var17 = new wf(qk.a(-121, param1));
          stackIn_5_0 = var17;
          stackIn_6_1 = !(param0);
          var4 = ((wf) (Object) stackIn_5_0).d(stackIn_6_1);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_s = 0;
            } else {
              this.field_s = var17.d((byte) 19);
            }
            var5 = var17.d(true);
            stackIn_16_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_16_0;
            stackIn_19_0 = (0 == (2 & var5)) ? 0 : 1;
            var7 = stackIn_19_0;
            if (var4 >= 7) {
              this.field_k = var17.a((byte) 50);
            } else {
              this.field_k = var17.b(-1698573656);
            }
            var8 = 0;
            var9 = -1;
            this.field_f = new int[this.field_k];
            if (var4 < 7) {
              for (var10 = 0; var10 < this.field_k; var10++) {
                dupTemp$0 = var8 + var17.b(-1698573656);
                var8 = dupTemp$0;
                this.field_f[var10] = dupTemp$0;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_k > var10; var10++) {
                dupTemp$1 = var8 + var17.a((byte) 50);
                var8 = dupTemp$1;
                this.field_f[var10] = dupTemp$1;
                if (this.field_f[var10] > var9) {
                  var9 = this.field_f[var10];
                }
              }
            }
            this.field_d = 1 + var9;
            this.field_n = new int[this.field_d][];
            this.field_t = new int[this.field_d];
            if (var7 != 0) {
              this.field_o = new byte[this.field_d][];
            }
            this.field_r = new int[this.field_d];
            this.field_a = new int[this.field_d];
            this.field_m = new int[this.field_d];
            if (var6 != 0) {
              this.field_l = new int[this.field_d];
              for (var10Lifetime1 = 0; this.field_d > var10Lifetime1; var10Lifetime1++) {
                this.field_l[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_k; var10Lifetime1Lifetime1++) {
                this.field_l[this.field_f[var10Lifetime1Lifetime1]] = var17.d((byte) 19);
              }
              this.field_b = new el(this.field_l);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_k; var10Lifetime2++) {
              this.field_r[this.field_f[var10Lifetime2]] = var17.d((byte) 19);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_k; var10Lifetime3++) {
                this.field_t[this.field_f[var10Lifetime3]] = var17.d((byte) 19);
              }
            } else {
              for (var10Lifetime3 = 0; this.field_k > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(110, 64, 0, var21);
                this.field_o[this.field_f[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_k; var10Lifetime3++) {
                this.field_t[this.field_f[var10Lifetime3]] = var17.d((byte) 19);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; this.field_k > var10Lifetime4; var10Lifetime4++) {
                this.field_m[this.field_f[var10Lifetime4]] = var17.a((byte) 50);
              }
              for (var10Lifetime4 = 0; this.field_k > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_f[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.field_n[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.a((byte) 50);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_n[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_a[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_n[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_k; var10Lifetime4++) {
                this.field_m[this.field_f[var10Lifetime4]] = var17.b(-1698573656);
              }
              for (var10Lifetime4 = 0; this.field_k > var10Lifetime4; var10Lifetime4++) {
                var11 = this.field_f[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_m[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_n[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.b(-1698573656);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_n[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_a[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_n[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_j = new int[1 + var9][];
              this.field_c = new el[1 + var9];
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_k; var10Lifetime5++) {
                var11Lifetime1 = this.field_f[var10Lifetime5];
                var12Lifetime1 = this.field_m[var11Lifetime1];
                array$8 = new int[this.field_a[var11Lifetime1]];
                this.field_j[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_a[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_j[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_n[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_n[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_j[var11Lifetime1][var14Lifetime1] = var17.d((byte) 19);
                }
                this.field_c[var11Lifetime1] = new el(this.field_j[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_108_0 = var3;
          stackIn_108_1 = new StringBuilder().append("e.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
        }
    }

    e(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_i = oe.a(101, param0, param0.length);
          if (param1 != this.field_i) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_v = si.a(0, param0, -110, param0.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_v[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(false, param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_p = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_h = "Waiting for sound effects";
        field_e = "Return to game";
        field_q = 4;
    }
}
