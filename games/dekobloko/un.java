/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static String field_c;
    static String field_b;
    static String field_a;

    final static void a(byte param0) {
        kf.field_I = null;
        int var1 = -59 / ((-91 - param0) / 32);
        ce.field_C = null;
    }

    final static cd a(int param0, String param1, int param2) {
        cd var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cd stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new cd(false);
          var3.field_f = param1;
          var4 = -78 % ((param2 - 59) / 32);
          var3.field_h = param0;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("un.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static char a(int param0, char param1) {
        int var2;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (param0 != 228) {
          return 'N';
        }
        var2 = param1;
        if (var2 != 32 &&
          var2 != 160 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (var2 != 224 &&
              var2 != 225 &&
              226 != var2 &&
              228 != var2 &&
              var2 != 227 &&
              var2 != 192 &&
              var2 != 193 &&
              var2 != 194 &&
              var2 != 196 &&
              195 != var2) {
              if (var2 != 232 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                200 != var2 &&
                var2 != 201 &&
                var2 != 202 &&
                var2 != 203) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  205 != var2 &&
                  var2 != 206 &&
                  var2 != 207) {
                  if (var2 != 242 &&
                    243 != var2 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    245 != var2 &&
                    var2 != 210 &&
                    var2 != 211 &&
                    var2 != 212 &&
                    var2 != 214 &&
                    213 != var2) {
                    if (249 != var2 &&
                      var2 != 250 &&
                      var2 != 251 &&
                      252 != var2 &&
                      217 != var2 &&
                      var2 != 218 &&
                      219 != var2 &&
                      var2 != 220) {
                      if (231 != var2 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          var2 != 376) {
                          if (var2 != 241 &&
                            209 != var2) {
                            if (var2 == 223) {
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

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$1 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          var4 = new char[param3];
          var5 = 0;
          for (var6 = param1; var6 < param3; var6++) {
            var7 = param0[var6 + param2] & 255;
            if (0 != var7) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = nh.field_l[-128 + var7];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var7;
            }
          }
          stackIn_13_0 = new String(var4, 0, var5);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("un.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (param3 != 52) {
          field_a = (String) null;
        }
        if (0 <= param1 &&
          param1 <= 11) {
          if (param2 >= 1 &&
            param2 <= gk.c(param0, 1, param1)) {
            return true;
          }
          return false;
        }
        return false;
    }

    final static vg a(int param0, uf param1) {
        int var7 = 0;
        vg stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var8 = 0;
        uf var9 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          var2_int = param1.a(8, (byte) 87);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = wg.a(param1, (byte) -127) ? 1 : 0;
          if (param0 != -128) {
            var9 = (uf) null;
            un.a(36, (uf) null);
          }
          var4 = wg.a(param1, (byte) -112) ? 1 : 0;
          var5 = new vg();
          var5.field_l = (short)param1.a(16, (byte) 103);
          var5.field_J = v.a(param1, true, var5.field_J, 16);
          var5.field_o = v.a(param1, true, var5.field_o, 16);
          var5.field_e = v.a(param1, true, var5.field_e, 16);
          var5.field_L = (short)param1.a(16, (byte) 55);
          var5.field_M = v.a(param1, true, var5.field_M, 16);
          var5.field_c = v.a(param1, true, var5.field_c, 16);
          var5.field_A = v.a(param1, true, var5.field_A, 16);
          if (var3 != 0) {
            var5.field_D = (short)param1.a(16, (byte) 90);
            var5.field_k = v.a(param1, true, var5.field_k, 16);
            var5.field_u = v.a(param1, true, var5.field_u, 16);
            var5.field_O = v.a(param1, true, var5.field_O, 16);
            var5.field_F = v.a(param1, true, var5.field_F, 16);
            var5.field_t = v.a(param1, true, var5.field_t, 16);
            var5.field_r = v.a(param1, true, var5.field_r, 16);
          }
          if (var4 != 0) {
            param1.a(16, (byte) 125);
            var5.field_y = v.a(param1, true, var5.field_y, 16);
            var5.field_z = v.a(param1, true, var5.field_z, 16);
            var5.field_C = v.a(param1, true, var5.field_C, 16);
            var5.field_N = v.a(param1, true, var5.field_N, 16);
            var5.field_P = v.a(param1, true, var5.field_P, 16);
          }
          if (wg.a(param1, (byte) -123)) {
            var5.field_j = v.a(param1, true, var5.field_j, 16);
          }
          if (wg.a(param1, (byte) -115)) {
            var5.field_Q = he.a((byte) 5, var5.field_Q, 16, param1);
            var6 = 0;
            for (var7 = 0; var5.field_Q.length > var7; var7++) {
              if (var6 < (var5.field_Q[var7] & 255)) {
                var6 = var5.field_Q[var7] & 255;
              }
            }
            if (var6 != 0) {
              var5.field_B = (byte)(var6 + 1);
            } else {
              var5.field_Q = null;
            }
          }
          stackIn_26_0 = var5;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("un.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 < 84) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Names cannot contain consecutive spaces";
        field_a = "Loading fonts";
        field_c = "Kick <%0> from this game";
    }
}
