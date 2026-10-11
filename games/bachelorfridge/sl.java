/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends pp {
    static du field_j;
    static kv[] field_k;
    int field_i;
    int field_l;

    final void a(lu param0, byte param1) {
        try {
          int var3_int = -112 % ((34 - param1) / 58);
          super.a(param0, (byte) -32);
          param0.b(this.field_f, -114);
          param0.d(this.field_i, 0);
          param0.d(this.field_l, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "sl.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        if (param0 >= -67) {
          return;
        }
        System.out.println("Error: " + ig.a(-19384, param1, "%0a", "\n"));
    }

    final static boolean a(boolean param0, byte param1, CharSequence param2) {
        int var7 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var5 = 28 % ((78 - param1) / 34);
            var4 = fq.a(0, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!mp.a(true, var4.charAt(0)) &&
                !mp.a(true, var4.charAt(var4.length() - 1))) {
                var6 = 0;
                for (var7 = 0; var7 < param2.length(); var7++) {
                  var8 = param2.charAt(var7);
                  if (mp.a(true, (char) var8)) {
                    var6++;
                  } else {
                    var6 = 0;
                  }
                  if (2 <= var6 &&
                    !param0) {
                    return false;
                  }
                }
                if (var6 <= 0) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("sl.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    sl(int param0, int param1, int param2) {
        this.field_l = param2;
        this.field_f = param0;
        this.field_i = param1;
    }

    final void a(aga param0, op param1, int param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        wia var4 = null;
        RuntimeException var4_ref = null;
        wia var5 = null;
        wia var6 = null;
        try {
          var5 = param1.field_a[this.field_i][this.field_l];
          var6 = var5;
          var4 = var6;
          if (var4 == null) {
            return;
          }
          if (!var6.b((byte) -113)) {
            return;
          }
          if (param0 != null) {
            param1.field_T.field_f[param0.field_D] = param1.field_T.field_f[param0.field_D] + var5.field_h;
          }
          if (param2 != 12) {
            return;
          }
          var6.field_h = var6.field_h - this.field_f;
          if (0 > var6.field_h) {
            var4.field_h = 0;
            param1.b((byte) -56, param1.field_L.field_o[this.field_i][this.field_l].field_n, this.field_i, this.field_l);
            param1.field_e = param1.field_e - 1;
            if (param0 != null) {
              param1.field_T.field_w[param0.field_D] = param1.field_T.field_w[param0.field_D] + 1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("sl.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_k = null;
        int var1 = 13 % ((param0 - 53) / 61);
        field_j = null;
    }

    static {
        field_j = new du(1, 2, 2, 0);
    }
}
