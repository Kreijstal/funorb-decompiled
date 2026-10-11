/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jia extends rqa {
    static int field_o;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          var6_int = 493 + param3 + (8 + (2 + param5));
          kea.field_a.a(3, -18, var6_int - 6, 3, hca.field_o.field_G - 6);
          var7 = -5 + kea.field_a.field_G;
          jba.field_b.a(5, -73, param5 + (param3 + 487), var7 - param1, param1);
          bpa.field_c.a(param3, -55, -fgb.field_l.field_hb + jba.field_b.field_hb - param3, 0, param1);
          var7 = var7 - (2 + param1);
          fgb.field_l.a(param3 + bpa.field_c.field_hb, 122, fgb.field_l.field_hb, 0, param1);
          vea.field_p.a(487 + (param3 + param5), 2, -1, -5 + var7, 5, 5, param5);
          if (null != ada.field_b) {
            ada.field_b.a(vea.field_p.field_L, vea.field_p.field_hb, vea.field_p.field_G, 1, vea.field_p.field_K);
          }
          if (param2 <= 91) {
            return;
          }
          var8 = -var6_int - param3 + hca.field_o.field_hb;
          var9 = var8 / 2;
          var10 = param3 + param0 + var9;
          var11 = 0;
          for (var12 = 0; 6 > var12; var12++) {
            if (var12 >= 5 ||
              ul.field_b[var12] != null) {
              var13 = var11 * (-4 + hca.field_o.field_G) / (1 + fb.field_o) + 3;
              var11++;
              var7Lifetime1 = 3 + (var11 * (2 + (hca.field_o.field_G - 6)) / (1 + fb.field_o) - 2) - var13;
              if (var12 < 5) {
                ul.field_b[var12].a(var6_int, -100, var8, var13, var7Lifetime1);
                hpa.field_o[var12].a(param3, -110, -param3 + var9, 0, var7Lifetime1);
                vh.field_c[var12].a(var9, -27, param0, param4, -param4 + (var7Lifetime1 - param4));
                lob.field_c[var12].a(var10, 127, -var10 + (-param3 + var8), param4, var7Lifetime1 - (param4 + param4));
              } else {
                nlb.field_o.a(var6_int, -120, var8, var13, var7Lifetime1);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "jia.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ama.field_o = param0[0].d(0);
          if (param1 <= -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jia.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    jia(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 == 0) {
          var2 = kib.field_d;
        }
        if (param0 == 1) {
          var2 = idb.field_p;
        }
        if (param1 == 19) {
          if (param0 == 2) {
            var2 = lla.field_h;
          }
          return var2;
        }
        field_o = -2;
        if (param0 == 2) {
          var2 = lla.field_h;
        }
        return var2;
    }

    final static int a(int param0, int param1) {
        int var3 = VoidHunters.field_G;
        ija.field_b = null;
        gob.field_c = 0;
        eu.field_h = null;
        int var2 = esa.field_p;
        esa.field_p = vwa.field_p;
        ff.field_o.field_g = ff.field_o.field_g + 1;
        if (param0 >= -60) {
          field_o = -4;
          vwa.field_p = var2;
          if (param1 == 51) {
            ff.field_o.field_k = 2;
            if (2 > ff.field_o.field_g) {
              if (ff.field_o.field_g >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (!(ff.field_o.field_g < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (ff.field_o.field_g < 2) {
              if (!(ff.field_o.field_g < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 50) {
              return 5;
            }
            if (!(ff.field_o.field_g < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 != 50) {
            ff.field_o.field_k = 1;
            if (2 > ff.field_o.field_g) {
              if (ff.field_o.field_g >= 2 &&
                param1 == 50) {
                return 5;
              }
              if (!(ff.field_o.field_g < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 51) {
              return 2;
            }
            if (ff.field_o.field_g < 2) {
              if (!(ff.field_o.field_g < 4)) {
                return 1;
              }
              return -1;
            }
            if (param1 == 50) {
              return 5;
            }
            if (!(ff.field_o.field_g < 4)) {
              return 1;
            }
            return -1;
          }
          ff.field_o.field_k = 5;
          if (2 > ff.field_o.field_g) {
            if (ff.field_o.field_g >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(ff.field_o.field_g < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (ff.field_o.field_g < 2) {
            if (!(ff.field_o.field_g < 4)) {
              return 1;
            }
            return -1;
          }
          if (param1 == 50) {
            return 5;
          }
          if (!(ff.field_o.field_g < 4)) {
            return 1;
          }
          return -1;
        }
        vwa.field_p = var2;
        if (param1 == 51) {
          ff.field_o.field_k = 2;
          if (2 <= ff.field_o.field_g) {
            if (param1 == 51) {
              return 2;
            }
            if (ff.field_o.field_g >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(ff.field_o.field_g < 4)) {
              return 1;
            }
            return -1;
          }
          if (ff.field_o.field_g >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(ff.field_o.field_g < 4)) {
            return 1;
          }
          return -1;
        }
        if (param1 != 50) {
          ff.field_o.field_k = 1;
          if (2 <= ff.field_o.field_g) {
            if (param1 == 51) {
              return 2;
            }
            if (ff.field_o.field_g >= 2 &&
              param1 == 50) {
              return 5;
            }
            if (!(ff.field_o.field_g < 4)) {
              return 1;
            }
            return -1;
          }
          if (ff.field_o.field_g >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(ff.field_o.field_g < 4)) {
            return 1;
          }
          return -1;
        }
        ff.field_o.field_k = 5;
        if (2 <= ff.field_o.field_g) {
          if (param1 == 51) {
            return 2;
          }
          if (ff.field_o.field_g >= 2 &&
            param1 == 50) {
            return 5;
          }
          if (!(ff.field_o.field_g < 4)) {
            return 1;
          }
          return -1;
        }
        if (ff.field_o.field_g >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (!(ff.field_o.field_g < 4)) {
          return 1;
        }
        return -1;
    }

    static {
    }
}
