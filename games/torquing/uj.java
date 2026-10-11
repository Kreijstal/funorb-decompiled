/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uj {
    static ei field_a;
    static o[] field_b;
    kp[] field_c;

    final static void a(String param0, int param1, String param2) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (gn.field_m != null) {
            gn.field_m.b(true);
          }
          un.field_k = new pe(param2, param0, false, true, true);
          hb.field_x.c(un.field_k, param1 + 32115);
          if (param1 != -32082) {
            uj.a((byte) 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uj.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        kp var5 = null;
        int var6 = Torquing.field_u;
        kp[] var7 = this.field_c;
        kp[] var3 = var7;
        if (param1 > -104) {
          return 123;
        }
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (!(param0 >= var5.field_b.length)) {
            return var5.field_b[param0];
          }
          param0 = param0 - (var5.field_b.length - 1);
        }
        return 0;
    }

    final int b(int param0, byte param1) {
        kp var4 = null;
        int var5 = Torquing.field_u;
        int var3 = 0;
        if (param1 != 110) {
          return 110;
        }
        while (this.field_c.length > var3) {
          var4 = this.field_c[var3];
          if (param0 < var4.field_b.length) {
            return var3;
          }
          param0 = param0 - (-1 + var4.field_b.length);
          var3++;
        }
        return this.field_c.length;
    }

    final static int a(da param0, byte param1, da param2) {
        RuntimeException var3 = null;
        da var4 = null;
        String var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 75) {
            var4 = (da) null;
            uj.a((da) null, (byte) 17, (da) null);
          }
          var5 = (String) null;
          stackIn_3_0 = na.a(param2, (String) null, -25978, param0, 0, false, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uj.E(");
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
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int b(boolean param0) {
        int stackIn_6_0 = 0;
        if (param0) {
          this.field_c = (kp[]) null;
        }
        if (this.field_c != null &&
          this.field_c.length > 0) {
          stackIn_6_0 = -this.field_c[0].field_c + this.field_c[-1 + this.field_c.length].field_a;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Torquing.field_u;
        try {
          if (param0 >= -107) {
            field_b = (o[]) null;
          }
          var5_int = 0;
          var6 = 0;
          var7 = param2.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param2.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (62 != var9) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int <= 0) {
            stackIn_22_0 = 0;
            return stackIn_22_0;
          }
          stackIn_20_0 = (-param1 + param3 << 8) / var5_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("uj.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0) {
        int var4 = 0;
        int var2;
        kp[] var3;
        kp var5;
        int var7;
        int var6;
        var7 = Torquing.field_u;
        if (!param0) {
          field_a = (ei) null;
        }
        var2 = -1;
        if (this.field_c != null) {
          var3 = this.field_c;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 115);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        int var4;
        kp var6;
        int var7;
        int var8;
        var8 = Torquing.field_u;
        if (this.field_c != null &&
          0 != this.field_c.length &&
          this.field_c[0].field_c <= param0) {
          if (this.field_c[-1 + this.field_c.length].field_a < param0) {
            return -1;
          }
          if (this.field_c.length == 1) {
            return this.field_c[0].a((byte) -64, param2);
          }
          var4 = 0;
          if (param1 > -14) {
            this.a(-4, (byte) 109);
          }
          for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6 = this.field_c[var5];
            if (var6.field_c <= param0 &&
              var6.field_a >= param0) {
              var7 = var6.a((byte) -64, param2);
              if (var7 != -1) {
                return var4 + var7;
              }
              return -1;
            }
            var4 = var4 + (var6.field_b.length - 1);
          }
          return -1;
        }
        return -1;
    }

    public static void a(byte param0) {
        if (param0 != -54) {
          uj.a((byte) -113);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_a = new ei();
    }
}
