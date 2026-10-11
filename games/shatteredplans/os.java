/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class os extends vd {
    jk field_v;
    static bi[] field_u;

    final static char a(char param0, int param1) {
        int var2;
        int var3;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 != -31024) {
          field_u = (bi[]) null;
        }
        var2 = param0;
        if (var2 != 32 &&
          var2 != 160 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (224 != var2 &&
              var2 != 225 &&
              var2 != 226 &&
              var2 != 228 &&
              var2 != 227 &&
              var2 != 192 &&
              193 != var2 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                var2 != 203) {
                if (237 != var2 &&
                  238 != var2 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  206 != var2 &&
                  207 != var2) {
                  if (242 != var2 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      var2 != 252 &&
                      var2 != 217 &&
                      var2 != 218 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        199 != var2) {
                        if (var2 != 255 &&
                          376 != var2) {
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (var2 != 223) {
                              return Character.toLowerCase(param0);
                            }
                            return 'b';
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return param0;
        }
        return '_';
    }

    final static void a(int param0, int param1, boolean param2) {
        sl var3 = js.field_f;
        var3.h(param1, 255);
        var3.c(3, (byte) -68);
        var3.c(10, (byte) -98);
        if (!param2) {
          field_u = (bi[]) null;
        }
        var3.d(param0, 255);
    }

    os(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final static ks a(int param0, String param1) {
        RuntimeException var2 = null;
        ks stackIn_2_0 = null;
        ks stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 202) {
            stackIn_2_0 = (ks) null;
            return stackIn_2_0;
          }
          if (wh.field_a.b(14) &&
            !param1.equals(wh.field_a.a(-103))) {
            wh.field_a = tf.a(param1, param0 ^ -12121);
          }
          stackIn_7_0 = wh.field_a;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("os.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static String a(byte param0, int param1, String param2, String param3) {
        RuntimeException var4 = null;
        sl var5 = null;
        int var6 = 0;
        ve var7 = null;
        CharSequence var8 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = (CharSequence) ((Object) param3);
          if (!gb.a((byte) -80, var8)) {
            stackIn_3_0 = tm.field_j;
            return stackIn_3_0;
          }
          if (po.field_b != 2) {
            stackIn_7_0 = qh.field_C;
            return stackIn_7_0;
          }
          var7 = di.a(param2, param0 ^ 12);
          if (var7 == null) {
            stackIn_10_0 = re.a(af.field_d, param0 + 4254, new String[]{param2});
            return stackIn_10_0;
          }
          var7.b((byte) -74);
          var7.a(16);
          oi.field_e = oi.field_e - 1;
          var5 = js.field_f;
          var5.h(param1, 255);
          var5.field_j = var5.field_j + 1;
          var6 = var5.field_j;
          if (param0 != 117) {
            field_u = (bi[]) null;
          }
          var5.c(3, (byte) -57);
          var5.a(param3, (byte) 0);
          var5.b(var5.field_j - var6, (byte) 127);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("os.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        vm.field_Bb = (50 & param1) >> 4;
        if (vm.field_Bb > 2) {
          vm.field_Bb = 2;
        }
        sq.field_a = param1 >> 2 & 3;
        if (param0 >= -76) {
          String var3 = (String) null;
          os.a(-15, (String) null);
        }
        ul.field_Hb = 3 & param1;
        if (!(2 >= sq.field_a)) {
          sq.field_a = 2;
        }
        if (!(ul.field_Hb <= 2)) {
          ul.field_Hb = 2;
        }
    }

    final void a(int param0) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_s) {
          return;
        }
        int[] var10 = new int[4];
        int[] var9 = var10;
        int[] var7 = var9;
        int[] var2 = var7;
        gf.a(var10);
        gf.a(this.field_k, this.field_t, this.field_m, this.field_i, 10, 0, 200);
        er.a(-119, this.field_k, this.field_i, -10 + this.field_m, this.field_t);
        gf.f(10 + this.field_k, this.field_t, -20 + this.field_m, 2052949);
        gf.f(this.field_k + 10, this.field_t + this.field_i, -20 + this.field_m, 0);
        gf.i(this.field_k, this.field_t, this.field_k + 10, this.field_t + 10);
        gf.b(10 + this.field_k, 10 + this.field_t, 10, 2052949);
        gf.b(var10);
        gf.i(this.field_m + (this.field_k - 10), this.field_t, this.field_m + this.field_k, this.field_t + 10);
        gf.b(this.field_m + (this.field_k - 10 - 1), this.field_t + 10, 10, 2052949);
        gf.b(var10);
        gf.i(this.field_k, this.field_i + this.field_t - 10, this.field_k + 10, this.field_t + this.field_i);
        gf.b(this.field_k + 10, this.field_t - (-this.field_i + 10 + 1), 10, 0);
        gf.b(var10);
        gf.i(this.field_m + (this.field_k - 10), -10 + (this.field_i + this.field_t), this.field_k + this.field_m, this.field_t + this.field_i);
        gf.b(-1 + this.field_k - (-this.field_m + 10), this.field_t - (-this.field_i + 10) - 1, 10, 0);
        gf.b(var10);
        int var3 = 0;
        int var4 = 39 % ((param0 - 67) / 47);
        while (var3 < 3 * (-10 + this.field_i) / 4) {
          var5 = ui.a(2052949, 0, -95, 256 * var3 / (3 * (-10 + this.field_i) / 4));
          gf.a(this.field_k, var3 + 10 + this.field_t, var5);
          gf.a(-1 + (this.field_m + this.field_k), var3 + (this.field_t + 10), var5);
          var3++;
        }
        vd var8 = (vd) (this.field_l.f(3725));
        while (var8 != null) {
          var8.a(-101);
          var8 = (vd) (this.field_l.b(-128));
        }
    }

    final vd b(byte param0, int param1, int param2) {
        if (!this.field_s) {
          return null;
        }
        vd var4 = as.a(this.field_l, param1, (byte) 118, param2);
        if (param0 < 51) {
          return (vd) null;
        }
        if (var4 != null) {
          return var4;
        }
        return super.b((byte) 69, param1, param2);
    }

    public static void d(boolean param0) {
        field_u = null;
        if (!param0) {
          field_u = (bi[]) null;
        }
    }

    static {
    }
}
