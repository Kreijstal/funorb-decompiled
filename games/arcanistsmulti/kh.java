/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kh {
    static String field_e;
    static String field_a;
    static u field_g;
    static String field_c;
    vd[] field_f;
    static boolean field_b;
    static ll field_d;

    final int a(String param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = param1 ? 1 : 0;
          var7 = param0.length();
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param0.charAt(var8);
            if (var9 != 60) {
              if (var9 != 62) {
                if (var6 == 0 &&
                  32 == var9) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            stackIn_19_0 = 0;
            return stackIn_19_0;
          }
          stackIn_16_0 = param2 - param3 << 8;
          stackIn_16_1 = var5_int;
          stackIn_17_0 = stackIn_16_0 / stackIn_16_1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("kh.L(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final static void a(ec param0, ec param1, int param2, int param3, int param4, int param5) {
        kg.field_h = param1;
        vf.field_s = param0;
        ic.field_a = param5;
        if (param4 != -1) {
          return;
        }
        try {
          uk.field_d = param2;
          f.field_h = param3;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "kh.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int a(byte param0) {
        int var2;
        int stackIn_5_0 = 0;
        var2 = 20 % ((param0 - 4) / 53);
        if (this.field_f != null &&
          this.field_f.length > 0) {
          stackIn_5_0 = this.field_f[this.field_f.length - 1].field_e - this.field_f[0].field_g;
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        vd var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        int var3 = 65 % ((param0 - 1) / 45);
        for (var4 = 0; this.field_f.length > var4; var4++) {
          var5 = this.field_f[var4];
          if (var5.field_f.length > param1) {
            return var4;
          }
          param1 = param1 - (-1 + var5.field_f.length);
        }
        return this.field_f.length;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3_int = 0;
        int var4 = 0;
        java.awt.Canvas var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 != 14) {
            var5 = (java.awt.Canvas) null;
            kh.a((byte) 126, (java.awt.Canvas) null, true);
          }
          if (10 <= ih.field_f) {
            if (!rl.d(true)) {
              de.b();
              n.a(320, 240, param0 - 13);
              kn.a(param1, (byte) -101, 0, 0);
            } else {
              if (fj.field_j != 0) {
                eg.a(param1, (byte) -39);
              } else {
                la.a(param2, false, (byte) -72);
                kn.a(param1, (byte) -97, 0, 0);
              }
            }
          } else {
            var3_int = 0;
            if (hj.field_d) {
              var3_int = 1;
              hj.field_d = false;
            }
            io.a(qj.field_h, bb.b((byte) -126), var3_int != 0, tl.c((byte) -77), -6885);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("kh.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        vd[] var3;
        vd var5;
        int var7;
        int var6;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 < 13) {
          field_g = (u) null;
        }
        var2 = -1;
        if (null != this.field_f) {
          var3 = this.field_f;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.b(-121);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          de.f(param1, param2, param0 + 1, 10000536);
          de.f(param1, param3 + param2, param0 + 1, 12105912);
          var5_int = 1;
          if (var5_int + param2 < de.field_c) {
            var5_int = -param2 + de.field_c;
          }
          var7 = 63 / ((param4 - 26) / 52);
          var6 = param3;
          if (var6 + param2 > de.field_k) {
            var6 = de.field_k - param2;
          }
          for (var8 = var5_int; var6 > var8; var8++) {
            var9 = 152 + var8 * 48 / param3;
            var10 = var9 << 8 | var9 << 16 | var9;
            de.field_l[param1 + de.field_e * (param2 + var8)] = var10;
            de.field_l[de.field_e * (param2 + var8) + param1 + param0] = var10;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var5), "kh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(int param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 6481) {
          field_g = (u) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, ec param9, int param10, int param11, dj param12, int param13, ec param14, int param15, dj param16, int param17, ec param18, int param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          if (!param8) {
            field_e = (String) null;
          }
          vd.field_c = param12;
          ob.field_T = param16;
          ib.a(param4, param6, param10, param11, 109);
          sk.a(param14, -28995, param2, param17);
          kh.a(param9, param18, param7, param3, -1, param1);
          ho.a((byte) 101, param0, param5);
          kn.a(param13, param19, param15, (byte) -43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("kh.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param19).append(')').toString());
        }
    }

    final int a(int param0, int param1, boolean param2) {
        int var5 = 0;
        vd var6 = null;
        int var7 = 0;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_f ||
          this.field_f.length == 0 ||
          this.field_f[0].field_g > param0) {
          return -1;
        }
        if (!(param0 <= this.field_f[this.field_f.length - 1].field_e)) {
          return -1;
        }
        if (this.field_f.length == 1) {
          return this.field_f[0].a(param1, 122);
        }
        int var4 = 0;
        if (!param2) {
          field_e = (String) null;
        }
        for (var5 = 0; var5 < this.field_f.length; var5++) {
          var6 = this.field_f[var5];
          if (param0 >= var6.field_g &&
            !(var6.field_e < param0)) {
            var7 = var6.a(param1, 31);
            if (var7 == -1) {
              return -1;
            }
            return var4 + var7;
          }
          var4 = var4 + (var6.field_f.length - 1);
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        vd var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        vd[] var7 = this.field_f;
        vd[] var3 = var7;
        for (var4 = param1; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (!(param0 >= var5.field_f.length)) {
            return var5.field_f[param0];
          }
          param0 = param0 - (var5.field_f.length - 1);
        }
        return 0;
    }

    static {
        field_e = "Waiting for music";
        field_a = "Elapsed time";
    }
}
