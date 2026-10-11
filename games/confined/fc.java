/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int field_c;
    static mn field_a;
    private int[] field_e;
    private int field_i;
    private int field_g;
    private int[] field_b;
    static od field_d;
    static volatile boolean field_f;
    private int field_h;

    private final void a(byte param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Confined.field_J ? 1 : 0;
        var4 = 46 / ((param0 + 56) / 40);
        int fieldTemp$0 = this.field_c + 1;
        this.field_c = this.field_c + 1;
        this.field_h = this.field_h + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_e[var2];
          if ((var2 & 2) != 0) {
            if (0 == (var2 & 1)) {
              this.field_i = this.field_i ^ this.field_i << 2;
            } else {
              this.field_i = this.field_i ^ this.field_i >>> 16;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_i = this.field_i ^ this.field_i >>> 6;
            } else {
              this.field_i = this.field_i ^ this.field_i << 13;
            }
          }
          this.field_i = this.field_i + this.field_e[255 & 128 + var2];
          dupTemp$1 = this.field_e[va.a(255, var3 >> 2)] - (-this.field_i - this.field_h);
          var5 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          dupTemp$2 = this.field_e[va.a(var5 >> 8 >> 2, 255)] + var3;
          this.field_h = dupTemp$2;
          this.field_b[var2] = dupTemp$2;
        }
    }

    final static void a(boolean param0, mn param1) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi var2 = null;
        RuntimeException var2_ref = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = 0;
        oi var2Lifetime1;
        oi var3Lifetime1;
        int var4Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          while (true) {
            var2 = (oi) (param1.a(false));
            if (var2 == null) {
              return;
            }
            var3 = (oi) (param1.a((byte) -124));
            var4 = 1;
            while (var3 != null) {
              if (var3.field_p + var3.field_n < var2.field_n + var2.field_p) {
                var4 = 0;
                ri.a(var3, 0, var2);
              } else {
                var2 = var3;
              }
              var3 = (oi) (param1.a((byte) -127));
            }
            if (var4 != 0) {
              return;
            }
            var3Lifetime1 = (oi) (param1.a(-113));
            var2Lifetime1 = (oi) (param1.d(2123));
            var4Lifetime1 = 1;
            while (var2Lifetime1 != null) {
              if (var2Lifetime1.field_n + var2Lifetime1.field_p > var3Lifetime1.field_n + var3Lifetime1.field_p) {
                var4Lifetime1 = 0;
                ri.a(var3Lifetime1, 0, var2Lifetime1);
              } else {
                var3Lifetime1 = var2Lifetime1;
              }
              var2Lifetime1 = (oi) (param1.d(2123));
            }
            if (var4Lifetime1 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int[] param2, int param3, byte[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != -1257536924) {
            return;
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= vb.field_e.length) {
              return;
            }
            param3 = vb.field_e[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = tl.field_i[incrementValue$1];
              dupTemp$2 = param4[param1];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              tl.field_i[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("fc.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param1 == ~param3) {
            var10 = param0[param2];
            var4 = var10;
            if (var4 != null) {
              stackIn_9_0 = var10.toString();
              return stackIn_9_0;
            }
            stackIn_7_0 = "null";
            return stackIn_7_0;
          }
          var4_int = param3 + param2;
          var5 = 0;
          for (var6_int = param2; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var4_int > var7; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("fc.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var11 = Confined.field_J ? 1 : 0;
        int var3 = -1640531527;
        int var10 = -1640531527;
        int var4 = -1640531527;
        int var8 = -1640531527;
        int var5 = -1640531527;
        int var7 = -1640531527;
        int var9 = -1640531527;
        int var6 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != -4) {
          return;
        }
        for (var2 = 0; var2 < 4; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var8 = var8 + this.field_b[var2Lifetime1 + 5];
          var3 = var3 + this.field_b[var2Lifetime1];
          var5 = var5 + this.field_b[var2Lifetime1 + 2];
          var4 = var4 + this.field_b[1 + var2Lifetime1];
          var7 = var7 + this.field_b[var2Lifetime1 + 4];
          var10 = var10 + this.field_b[var2Lifetime1 + 7];
          var6 = var6 + this.field_b[3 + var2Lifetime1];
          var9 = var9 + this.field_b[var2Lifetime1 + 6];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_e[var2Lifetime1] = var3;
          this.field_e[var2Lifetime1 + 1] = var4;
          this.field_e[var2Lifetime1 + 2] = var5;
          this.field_e[var2Lifetime1 + 3] = var6;
          this.field_e[var2Lifetime1 + 4] = var7;
          this.field_e[var2Lifetime1 + 5] = var8;
          this.field_e[6 + var2Lifetime1] = var9;
          this.field_e[7 + var2Lifetime1] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var4 = var4 + this.field_e[var2Lifetime2 + 1];
          var3 = var3 + this.field_e[var2Lifetime2];
          var7 = var7 + this.field_e[4 + var2Lifetime2];
          var6 = var6 + this.field_e[3 + var2Lifetime2];
          var10 = var10 + this.field_e[var2Lifetime2 + 7];
          var5 = var5 + this.field_e[var2Lifetime2 + 2];
          var9 = var9 + this.field_e[6 + var2Lifetime2];
          var8 = var8 + this.field_e[var2Lifetime2 + 5];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
          this.field_e[var2Lifetime2] = var3;
          this.field_e[1 + var2Lifetime2] = var4;
          this.field_e[var2Lifetime2 + 2] = var5;
          this.field_e[3 + var2Lifetime2] = var6;
          this.field_e[var2Lifetime2 + 4] = var7;
          this.field_e[var2Lifetime2 + 5] = var8;
          this.field_e[var2Lifetime2 + 6] = var9;
          this.field_e[var2Lifetime2 + 7] = var10;
        }
        this.a((byte) -118);
        this.field_g = 256;
    }

    final static void a(mn param0, byte param1) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        oi var2 = null;
        RuntimeException var2_ref = null;
        oi var3 = null;
        int var4 = 0;
        int var5 = 0;
        oi var2Lifetime1;
        oi var3Lifetime1;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (param1 < 13) {
            return;
          }
          do {
            var2 = (oi) (param0.a(false));
            if (var2 == null) {
              return;
            }
            var3 = (oi) (param0.a((byte) -30));
            var4 = 1;
            while (var3 != null) {
              if (!(var3.field_p - var3.field_n < -var2.field_n + var2.field_p)) {
                var2 = var3;
              } else {
                ri.a(var3, 0, var2);
                var4 = 0;
              }
              var3 = (oi) (param0.a((byte) -96));
            }
            if (var4 != 0) {
              return;
            }
            var3Lifetime1 = (oi) (param0.a(59));
            var2Lifetime1 = (oi) (param0.d(2123));
            var4 = 1;
            while (var2Lifetime1 != null) {
              if (!(var3Lifetime1.field_p - var3Lifetime1.field_n < -var2Lifetime1.field_n + var2Lifetime1.field_p)) {
                var3Lifetime1 = var2Lifetime1;
              } else {
                var4 = 0;
                ri.a(var3Lifetime1, 0, var2Lifetime1);
              }
              var2Lifetime1 = (oi) (param0.d(2123));
            }
          } while (var4 == 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("fc.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -1) {
          field_f = false;
        }
    }

    final int c(int param0) {
        if (param0 != 256) {
          return 2;
        }
        if (this.field_g == 0) {
          this.a((byte) -105);
          this.field_g = 256;
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        return this.field_b[fieldTemp$0];
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -7212) {
            field_f = false;
          }
          if (null != ki.field_b) {
            ki.field_b.field_O.a((byte) -127, param1);
          }
          if (null != hb.field_u) {
            hb.field_u.field_H.a((byte) -127, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("fc.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    fc(int[] param0) {
        int var2_int = 0;
        try {
          this.field_b = new int[256];
          this.field_e = new int[256];
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            this.field_b[var2_int] = param0[var2_int];
          }
          this.b(-4);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new mn();
        field_f = true;
    }
}
