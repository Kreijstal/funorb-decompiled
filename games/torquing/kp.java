/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    int field_c;
    int[] field_b;
    int field_a;
    static int field_d;

    final static void a(t param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        try {
          tl.field_n = param8;
          hn.field_x = param4;
          Torquing.field_x = param1;
          if (param7) {
            field_d = 19;
          }
          j.field_F = param0;
          gi.field_d = param6;
          wh.field_w = param3;
          lb.field_y = param5;
          up.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kp.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 <= 28) {
          kp.a((t) null, -4, -74, -59, 77, 61, 43, true, -81);
        }
        if (null != this.field_b &&
          this.field_b.length != 0) {
          stackIn_7_0 = this.field_b[-1 + this.field_b.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Torquing.field_u;
        try {
          if (ph.field_k > param2) {
            param0 = param0 - (ph.field_k - param2);
            param2 = ph.field_k;
          }
          if (param5 < ph.field_c) {
            param1 = param1 - (ph.field_c - param5);
            param5 = ph.field_c;
          }
          if (ph.field_a < param2 + param0) {
            param0 = ph.field_a - param2;
          }
          if (ph.field_h < param5 + param1) {
            param1 = -param5 + ph.field_h;
          }
          if (0 < param0 &&
            param1 > 0) {
            if (param3 != 16) {
              field_d = 3;
            }
            var6_int = param5 * ph.field_j + param2;
            var7 = ph.field_j - param0;
            for (param5 = -param1; param5 < 0; param5++) {
              for (param2 = -param0; param2 < 0; param2++) {
                var8 = ph.field_e[var6_int];
                if (param4 < ((var8 & 65280) >> 8) &&
                  (var8 >> 8 & 255) >= (var8 & 16711680) >> 16) {
                  var9 = (510 & var8 >> 15) - 60;
                  if (255 < var9) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = 65280 & -(var10 >> 5) + (var10 >> 1);
                  var11 = (var8 & 255) >> 3;
                  ph.field_e[var6_int] = gm.a(gm.a(var10, var9 << 16), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "kp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    kp(int param0, int param1, int param2) {
        this.field_c = param0;
        this.field_a = param1;
        this.field_b = new int[1 + param2];
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = Torquing.field_u;
        if (this.field_b != null &&
          this.field_b.length != 0) {
          for (var3 = 1; var3 < this.field_b.length; var3++) {
            if (param1 < this.field_b[var3] + this.field_b[var3 - 1] >> 1) {
              return var3 - 1;
            }
          }
          if (param0 != -64) {
            this.a((byte) 25, -123);
          }
          return this.field_b.length - 1;
        }
        return 0;
    }

    final static String a(byte param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Torquing.field_u;
        if (param1 <= 0L) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (param1 % 37L == 0L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (0L != var4) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = bd.field_t[(int)(-(param1 * 37L) + var7)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param0 != -87) {
          return (String) null;
        }
        return var6.toString();
    }

    final static void a(double param0, int param1, double param2, double[] param3, hc param4) {
        try {
          wf.c((byte) 76);
          param4.a(param2, param3, (byte) 37, param0);
          int var7_int = -98 % ((param1 - 5) / 55);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "kp.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
