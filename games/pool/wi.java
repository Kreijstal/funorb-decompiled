/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_b;
    static int field_a;
    static String field_c;
    private int[] field_d;
    static String field_e;

    final static char a(boolean param0, char param1) {
        int var2;
        if (!param0) {
          field_a = -102;
        }
        var2 = param1;
        if (var2 != 32 &&
          160 != var2 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            var2 != 35) {
            if (var2 != 224 &&
              var2 != 225 &&
              226 != var2 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              193 != var2 &&
              var2 != 194 &&
              var2 != 196 &&
              var2 != 195) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                235 != var2 &&
                var2 != 200 &&
                var2 != 201 &&
                var2 != 202 &&
                203 != var2) {
                if (var2 != 237 &&
                  238 != var2 &&
                  var2 != 239 &&
                  205 != var2 &&
                  206 != var2 &&
                  207 != var2) {
                  if (242 != var2 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    246 != var2 &&
                    var2 != 245 &&
                    var2 != 210 &&
                    211 != var2 &&
                    var2 != 212 &&
                    214 != var2 &&
                    213 != var2) {
                    if (var2 != 249 &&
                      var2 != 250 &&
                      251 != var2 &&
                      252 != var2 &&
                      217 != var2 &&
                      var2 != 218 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          376 != var2) {
                          if (241 != var2 &&
                            209 != var2) {
                            if (223 == var2) {
                              return 'b';
                            }
                            return Character.toLowerCase(param1);
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
          return param1;
        }
        return '_';
    }

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, byte param5, int param6) {
        if (param5 != 33) {
          wi.b(-79);
        }
        if (oj.c(-86)) {
          qe.a(param6, param3, -40960, param4);
          if (vl.field_m != null &&
            vl.field_m.a(param2, param1, param4, 25427, param3)) {
            param4 = false;
            wa.m(8421504);
          }
          ii.a(-31668, param3, param4);
          vl.a(true, param0, param4);
          param4 = false;
        }
        return param4;
    }

    final static void a(boolean param0) {
        oc.d(-97);
        sq.b((byte) 118);
        if (!param0) {
          field_e = (String) null;
        }
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -30521) {
          field_a = 23;
        }
        field_e = null;
        field_c = null;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = -1 + (this.field_d.length >> 1);
        var4 = param0 & var3;
        var5 = -20 / ((58 - param1) / 55);
        while (true) {
          var6 = this.field_d[var4 + (var4 + 1)];
          if (var6 == -1) {
            return -1;
          }
          if (this.field_d[var4 + var4] == param0) {
            return var6;
          }
          var4 = var3 & var4 + 1;
        }
    }

    wi(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_d = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_d[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_d[1 + (var4 + var4)] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_d[var4 + var4] = param0[var3Lifetime1];
            this.field_d[var4 + (var4 + 1)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("wi.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fl var4_ref_fl = null;
        oi var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        oq var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Pool.field_O;
        try {
          if (param0 != 199) {
            field_b = (String) null;
          }
          var9 = kn.field_e;
          var2 = var9.g(-125);
          var3 = var9.g(param0 ^ -151);
          if (var2 == 0) {
            var4_ref_fl = (fl) (cq.field_g.c((byte) -124));
            if (var4_ref_fl == null) {
              dn.c(param0 - 79);
              return;
            }
            var5_int = of.field_Pb - var9.field_v;
            var11 = var4_ref_fl.field_r;
            var10 = var11;
            var6 = var10;
            if (var5_int > var11.length << 2) {
              var5_int = var11.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var9.g(-100) << (rb.b(var7, 3) << 8));
            }
            var4_ref_fl.a((byte) -117);
            return;
          }
          if (var2 == 1) {
            var4 = var9.i(param0 - 272);
            var5 = (oi) (qr.field_a.c((byte) 68));
            while (var5 != null) {
              if (var3 != var5.field_t ||
                var4 != var5.field_l) {
                var5 = (oi) (qr.field_a.f((byte) -5));
                continue;
              }
              break;
            }
            if (var5 == null) {
              dn.c(118);
              return;
            }
            var5.a((byte) -117);
            return;
          }
          tc.a((Throwable) null, "LR1: " + t.a(param0 ^ 159), param0 - 8754);
          dn.c(125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "wi.A(" + param0 + ')');
        }
    }

    static {
        field_c = "Rating";
        field_e = "Only show game chat from my friends";
        field_b = "Status";
    }
}
