/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    int field_h;
    int field_b;
    static ee field_g;
    static String field_d;
    static int field_c;
    static java.awt.Frame field_f;
    static n field_a;
    static java.awt.Frame field_i;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, ed param4, int param5, int param6, int param7) {
        int incrementValue$0 = 0;
        int var17 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        double var15_double = 0.0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        var19 = EscapeVector.field_A;
        try {
          if (param6 > 0) {
            if (20 >= param6) {
              var8_int = 0;
              var9 = param6;
              if (var9 > 20) {
                var9 = 20;
              }
              if (var9 <= 10) {
                var8_int = 0;
              } else {
                var8_int = -10 + var9;
                var8_int = 224 * (var8_int * var8_int) / 100;
                var9 = 20 * var9 / (var8_int + 20);
              }
              var10 = var9 * var9;
              for (var11 = param5 - var9; param5 + var9 > var11; var11++) {
                var12 = param3 + (-var8_int + var11 * 640);
                var13 = (-param5 + var11) * (1 + (var11 - param5));
                for (var14 = -var9; var14 < 0; var14++) {
                  var15 = var13 + var14 * (1 + var14);
                  if (var15 < var10) {
                    var16 = -(var15 * 255 / var10) + 255;
                    em.field_i[var14 + var12] = var16 * 65793;
                  }
                }
                var14 = -(255 * var13 / var10) + 255;
                for (var15Lifetime1 = -var8_int; var15Lifetime1 < var8_int; var15Lifetime1++) {
                  incrementValue$0 = var12;
                  var12++;
                  em.field_i[incrementValue$0] = var14 * 65793;
                }
                for (var14 = 0; var14 < var9; var14++) {
                  var15Lifetime2 = var13 + var14 * (var14 + 1);
                  if (var15Lifetime2 < var10) {
                    var16Lifetime1 = -(255 * var15Lifetime2 / var10) + 255;
                    em.field_i[var14 + var12] = var16Lifetime1 * 65793;
                  }
                }
              }
            } else {
              if (param6 < 30) {
                var8_int = param6 - 20;
                var8_int = param4.field_z / 2 * (var8_int * var8_int) / 100;
                if (0 < var8_int) {
                  var9 = param4.field_z / 2 * 65536 / var8_int;
                  var10 = var9 >> 1;
                  for (var11 = 0; var11 < var8_int + var8_int; var11++) {
                    var12 = var10 >> 16;
                    var10 = var10 + var9;
                    if (var12 >= param4.field_v &&
                      var12 < param4.field_v + param4.field_x) {
                      var13 = param4.field_s * var12;
                      var14 = (var11 - var8_int + param5) * 640 + param7 + param4.field_q;
                      var15_double = 8.0 * Math.sin((double)param1 + (double)((param1 & 7) + 8) * ((double)var12 * 0.001));
                      var15_double = var15_double + Math.sin((double)(param1 + var12) * 0.002 * (double)((5 * param1 & 31) + 16)) * 4.0;
                      var14 = var14 + (int)Math.floor(var15_double + 0.5);
                      for (var17 = 0; param4.field_s > var17; var17++) {
                        incrementValue$1 = var13;
                        var13++;
                        var18 = param4.field_B[incrementValue$1];
                        incrementValue$2 = var14;
                        var14++;
                        em.field_i[incrementValue$2] = var18 - ae.a(4144959, var18 >> 2);
                      }
                    }
                  }
                }
              } else {
                param4.e(param7, param2);
              }
            }
          }
          if (param0 != -1276284702) {
            field_a = (n) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_46_0 = var8;
          stackIn_46_1 = new StringBuilder().append("qj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1;
        int var2;
        ed var3;
        L0: {
          var2 = EscapeVector.field_A;
          var1 = hm.field_o.field_b.field_j ? 1 : 0;
          if (!bj.e((byte) -32) ||
            hm.field_o.field_f == 2) {
            if (aj.b(-119)) {
              if (hm.field_o.field_f == 0) {
                if (bj.e((byte) -122)) {
                  break L0;
                }
                if (aj.b(-126)) {
                  break L0;
                }
                if (1 == hm.field_o.field_f) {
                  break L0;
                }
              }
              hm.field_o = new pf(var1 != 0);
              break L0;
            }
            if ((!bj.e((byte) -122)) &&
              (!aj.b(-126)) &&
              (1 != hm.field_o.field_f)) {
              hm.field_o = new pf(var1 != 0);
            }
          } else {
            hm.field_o = new pf(var1 != 0);
          }
        }
        if (param0 != -883) {
          var3 = (ed) null;
          qj.a(-40, 111, 116, 104, (ed) null, -68, -42, 107);
        }
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 != -38) {
          qj.b(69);
        }
        return ni.a(param2, param1, false, ka.field_d);
    }

    qj(int param0, int param1) {
        this.field_b = param1;
        this.field_h = param0;
    }

    public static void b(int param0) {
        field_i = null;
        field_g = null;
        field_e = null;
        if (param0 != -10497) {
          field_c = -87;
        }
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_g = new ee("");
        field_d = "Ship";
        field_c = 0;
        field_a = new n(256);
        field_e = " - shoot";
    }
}
