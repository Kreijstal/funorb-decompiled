/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq {
    static String field_h;
    private int[] field_a;
    private int field_d;
    private int[] field_i;
    private int field_e;
    private int field_g;
    static int[] field_f;
    static int field_c;
    private int field_b;

    final int b(byte param0) {
        int var2 = 102 / ((2 - param0) / 62);
        if (this.field_e == 0) {
          this.a(256);
          this.field_e = 256;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_a[fieldTemp$0];
    }

    final static int a(int param0, int param1, ml param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -30273) {
            field_f = (int[]) null;
          }
          stackIn_3_0 = (param2.l(param0, 59) ^ 1 << param0 - 1) - (1 << param0 - 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aq.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String c(int param0) {
        int var1 = 55 / ((3 - param0) / 40);
        return ek.field_M;
    }

    private final void a(byte param0) {
        int var11 = Kickabout.field_G;
        int var6 = -1640531527;
        int var8 = -1640531527;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var5 = -1640531527;
        int var3 = -1640531527;
        int var7 = -1640531527;
        int var4 = -1640531527;
        int var2 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 > -65) {
          field_f = (int[]) null;
        }
        while (var2 < 4) {
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
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
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          var2++;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var3 = var3 + this.field_a[var2Lifetime1];
          var4 = var4 + this.field_a[1 + var2Lifetime1];
          var10 = var10 + this.field_a[var2Lifetime1 + 7];
          var6 = var6 + this.field_a[var2Lifetime1 + 3];
          var8 = var8 + this.field_a[5 + var2Lifetime1];
          var9 = var9 + this.field_a[var2Lifetime1 + 6];
          var5 = var5 + this.field_a[var2Lifetime1 + 2];
          var7 = var7 + this.field_a[var2Lifetime1 + 4];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_i[var2Lifetime1] = var3;
          this.field_i[var2Lifetime1 + 1] = var4;
          this.field_i[2 + var2Lifetime1] = var5;
          this.field_i[3 + var2Lifetime1] = var6;
          this.field_i[var2Lifetime1 + 4] = var7;
          this.field_i[var2Lifetime1 + 5] = var8;
          this.field_i[6 + var2Lifetime1] = var9;
          this.field_i[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var4 = var4 + this.field_i[1 + var2Lifetime2];
          var3 = var3 + this.field_i[var2Lifetime2];
          var8 = var8 + this.field_i[5 + var2Lifetime2];
          var10 = var10 + this.field_i[var2Lifetime2 + 7];
          var7 = var7 + this.field_i[var2Lifetime2 + 4];
          var9 = var9 + this.field_i[var2Lifetime2 + 6];
          var5 = var5 + this.field_i[var2Lifetime2 + 2];
          var6 = var6 + this.field_i[3 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var5 = var5 + var6;
          var7 = var7 + var4;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var8 = var8 + var9;
          var10 = var10 + var7;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_i[var2Lifetime2] = var3;
          this.field_i[var2Lifetime2 + 1] = var4;
          this.field_i[var2Lifetime2 + 2] = var5;
          this.field_i[3 + var2Lifetime2] = var6;
          this.field_i[var2Lifetime2 + 4] = var7;
          this.field_i[var2Lifetime2 + 5] = var8;
          this.field_i[6 + var2Lifetime2] = var9;
          this.field_i[7 + var2Lifetime2] = var10;
        }
        this.a(256);
        this.field_e = 256;
    }

    final static String a(String param0, int param1) {
        int var4 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_8_0 = 0;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk[] var2 = null;
        RuntimeException var2_ref = null;
        StringBuilder var3 = null;
        lk var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        lk[] var11 = null;
        var9 = Kickabout.field_G;
        try {
          var11 = w.a(param0, (byte) -21);
          var2 = var11;
          if (param1 < 103) {
            var10 = (String) null;
            aq.a((String) null, -9);
          }
          var3 = new StringBuilder();
          for (var4 = 0; var11.length > var4; var4++) {
            var5 = var11[var4];
            var6 = var5.field_f;
            if (var4 != var11.length - 1) {
              stackIn_8_0 = var2[var4 + 1].field_f;
            } else {
              stackIn_8_0 = param0.length();
            }
            var7 = stackIn_8_0;
            var8 = param0.substring(var6, var7);
            if (rb.field_Mb == var5.field_k) {
              discarded$0 = var3.append("<col=66ffff>").append(var8).append("</col>");
            } else {
              if (var5.field_k != v.field_d) {
                if (vu.field_Ab != var5.field_k) {
                  if (pv.field_H == var5.field_k) {
                    discarded$1 = var3.append("<col=ffaaff>").append(var8).append("</col>");
                  } else {
                    if (var5.field_k != ra.field_N) {
                      discarded$2 = var3.append(var8);
                    } else {
                      discarded$3 = var3.append("<col=33ffaa>").append(var8).append("</col>");
                    }
                  }
                } else {
                  discarded$4 = var3.append("<col=ffff99>").append(var8).append("</col>");
                }
              } else {
                discarded$5 = var3.append("<col=33bbff>").append(var8).append("</col>");
              }
            }
          }
          stackIn_21_0 = var3.toString();
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("aq.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != 1) {
          ml var2 = (ml) null;
          aq.a(-123, -53, (ml) null);
        }
        field_h = null;
    }

    final static int a(boolean param0) {
        if (!param0) {
          return 17;
        }
        return (int)jr.field_Gb;
    }

    private final void a(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = Kickabout.field_G;
        if (param0 != 256) {
          field_h = (String) null;
        }
        int fieldTemp$0 = this.field_b + 1;
        this.field_b = this.field_b + 1;
        this.field_d = this.field_d + fieldTemp$0;
        for (var2 = 0; var2 < 256; var2++) {
          var3 = this.field_i[var2];
          if ((2 & var2) == 0) {
            if ((1 & var2) == 0) {
              this.field_g = this.field_g ^ this.field_g << 13;
            } else {
              this.field_g = this.field_g ^ this.field_g >>> 6;
            }
          } else {
            if ((1 & var2) != 0) {
              this.field_g = this.field_g ^ this.field_g >>> 16;
            } else {
              this.field_g = this.field_g ^ this.field_g << 2;
            }
          }
          this.field_g = this.field_g + this.field_i[var2 + 128 & 255];
          dupTemp$1 = this.field_d + this.field_g + this.field_i[qj.b(255, var3 >> 2)];
          var4 = dupTemp$1;
          this.field_i[var2] = dupTemp$1;
          dupTemp$2 = this.field_i[qj.b(var4 >> 8 >> 2, 255)] + var3;
          this.field_d = dupTemp$2;
          this.field_a[var2] = dupTemp$2;
        }
    }

    final static void c(byte param0) {
        cb.field_d.a(sk.field_d);
        if (param0 > -91) {
          return;
        }
        nm.field_k = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    aq(int[] param0) {
        int var2_int = 0;
        try {
          this.field_i = new int[256];
          this.field_a = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_a[var2_int] = param0[var2_int];
          }
          this.a((byte) -113);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "aq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_c = 5;
    }
}
