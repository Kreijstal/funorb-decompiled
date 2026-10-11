/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jc {
    int field_f;
    int field_a;
    static String[] field_j;
    int field_d;
    int field_b;
    int field_g;
    int field_e;
    static ka field_i;
    static int field_c;
    static volatile int field_h;

    abstract void a(int param0, int param1);

    final static ge[] b(int param0) {
        int var2 = 0;
        int var3 = TorChallenge.field_F ? 1 : 0;
        ge[] var1 = new ge[vl.field_b];
        if (param0 >= -33) {
          field_j = (String[]) null;
        }
        for (var2 = 0; var2 < vl.field_b; var2++) {
          var1[var2] = new ge(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], h.field_a[var2], td.field_m);
        }
        p.a(0);
        return var1;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
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
        var13 = TorChallenge.field_F ? 1 : 0;
        try {
          var5_int = param3 + param1;
          var6 = param4 + param2;
          if (param1 <= qg.field_a) {
            stackIn_4_0 = qg.field_a;
          } else {
            stackIn_4_0 = param1;
          }
          var7 = stackIn_4_0;
          if (param4 <= qg.field_k) {
            stackIn_7_0 = qg.field_k;
          } else {
            stackIn_7_0 = param4;
          }
          var8 = stackIn_7_0;
          if (var5_int >= qg.field_c) {
            stackIn_10_0 = qg.field_c;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (var6 < qg.field_l) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = qg.field_l;
          }
          var10 = stackIn_13_0;
          if (param0 >= -114) {
            field_i = (ka) null;
          }
          if (param1 >= qg.field_a &&
            param1 < qg.field_c) {
            var11 = param1 + var8 * qg.field_g;
            var12 = 1 - (-var10 + var8) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              qg.field_i[var11] = 16777215;
              var11 = var11 + 2 * qg.field_g;
            }
          }
          if (param4 >= qg.field_k &&
            qg.field_l > var6) {
            var11Lifetime1 = qg.field_g * param4 + var7;
            var12Lifetime1 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              qg.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (qg.field_a <= var5_int &&
            qg.field_c > var5_int) {
            var11Lifetime2 = qg.field_g * ((var5_int - param1 & 1) + var8) + var5_int;
            var12Lifetime2 = -var8 + (var10 + 1) >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              qg.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + qg.field_g * 2;
            }
          }
          if (param4 >= qg.field_k) {
            if (qg.field_l <= var6) {
              return;
            }
            var11Lifetime3 = var7 + (var6 * qg.field_g + (1 & -param4 + var6));
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (0 > var12Lifetime3) {
                break;
              }
              qg.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var5), "jc.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -88) {
          field_j = (String[]) null;
        }
        field_i = null;
        field_j = null;
    }

    final static void b(int param0, int param1, int param2) {
        int var3;
        int var4;
        if (param1 != 1) {
          field_i = (ka) null;
        }
        if (0 <= param2 &&
          param2 < 9) {
          var3 = rf.field_hb[param2];
          if (0 <= var3 &&
            var3 < 5) {
            var4 = cl.field_u[var3];
            if (kd.field_k[var3] > var4) {
              kd.field_k[var3] = var4;
            }
            if (kd.field_k[var3] < 0) {
              mg.a(true, param2, param0);
              kd.field_k[var3] = var4;
            }
            return;
          }
          return;
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 26691) {
            field_h = -48;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = td.field_i.equals(il.a(var3, (byte) 21));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jc.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_j = new String[]{"Collect every coin on a tower, including those dropped by defeated enemies", "Kill every enemy on any tower but the first", "Collect a jade coin", "Collect all 3 jade coins with one character", "Collect all 3 jade coins with all three characters", "Get a x2 score multiplier", "Get a x4 score multiplier", "Get a x6 score multiplier", "Defeat the first master monk", "Defeat 2 master monks with one character", "Defeat all 3 master monks with one character", "Defeat all 3 master monks with all three characters", "Collect 20 seals with one character", "Collect all 30 seals with one character", "Collect all 30 seals with all three characters", "Collect a seal without taking damage since the last seal, on any tower but the first", "Defeat 150 skull heads during Hallowe'en"};
        field_i = new ka(96, 96);
        field_h = 0;
    }
}
