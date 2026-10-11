/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr {
    static Boolean field_a;
    static jj field_b;

    final static void b(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = as.field_b;
        synchronized (var1) {
          cf.field_a = cf.field_a + 1;
          q.field_v = cl.field_f;
          ed.field_n = ja.field_h;
          gb.field_d = ca.field_c;
          wo.field_s = ej.field_f;
          ej.field_f = param0;
          kf.field_c = kc.field_a;
          sd.field_N = hn.field_o;
          no.field_e = gf.field_e;
          kc.field_a = 0;
        }
    }

    final static void a(byte param0) {
        if (ol.field_B != 1) {
          ol.field_B = 1;
          if (param0 > -40) {
            field_a = (Boolean) null;
            return;
          }
          return;
        }
        ol.field_B = -1;
        if (param0 > -40) {
          field_a = (Boolean) null;
          return;
        }
    }

    public static void c(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
          mr.b(false);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = param4 + param0;
          var6 = param2 + param1;
          if (param3 != 0) {
            field_b = (jj) null;
          }
          if (param4 > bi.field_d) {
            stackIn_6_0 = param4;
          } else {
            stackIn_6_0 = bi.field_d;
          }
          var7 = stackIn_6_0;
          if (param1 <= bi.field_f) {
            stackIn_9_0 = bi.field_f;
          } else {
            stackIn_9_0 = param1;
          }
          var8 = stackIn_9_0;
          if (bi.field_i > var5_int) {
            stackIn_12_0 = var5_int;
          } else {
            stackIn_12_0 = bi.field_i;
          }
          var9 = stackIn_12_0;
          if (bi.field_c > var6) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = bi.field_c;
          }
          var10 = stackIn_15_0;
          if (bi.field_d <= param4 &&
            param4 < bi.field_i) {
            var11 = param4 + var8 * bi.field_e;
            var12 = var10 + 1 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              bi.field_l[var11] = 16777215;
              var11 = var11 + 2 * bi.field_e;
            }
          }
          if (param1 >= bi.field_f &&
            bi.field_c > var6) {
            var11Lifetime1 = param1 * bi.field_e + var7;
            var12Lifetime1 = 1 + (var9 - var7) >> 1;
            while (true) {
              var12Lifetime1--;
              if (0 > var12Lifetime1) {
                break;
              }
              bi.field_l[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (bi.field_d <= var5_int &&
            bi.field_i > var5_int) {
            var11Lifetime2 = var5_int + bi.field_e * ((-param4 + var5_int & 1) + var8);
            var12Lifetime2 = -var8 + 1 + var10 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              bi.field_l[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + bi.field_e * 2;
            }
          }
          if (bi.field_f <= param1) {
            if (bi.field_c <= var6) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
            var12Lifetime3 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              bi.field_l[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "mr.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        fk.a(ob.e((byte) 99), 11514);
        if (param0) {
          field_a = (Boolean) null;
        }
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        if (param1 == -48) {
          var4 = param3.indexOf(param0);
          while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param0.length());
            var4 = param3.indexOf(param0, var4 + param2.length());
          }
          return param3;
        }
        return (String) null;
    }

    static {
    }
}
