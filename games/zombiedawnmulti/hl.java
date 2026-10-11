/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static int[] field_c;
    static db field_b;
    static int[] field_e;
    static ug[] field_d;
    static int field_a;
    static int[] field_f;

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
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
        var13 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = param3 + param1;
          var6 = param0 + param4;
          if (oo.field_f >= param1) {
            stackIn_4_0 = oo.field_f;
          } else {
            stackIn_4_0 = param1;
          }
          var7 = stackIn_4_0;
          if (oo.field_e < param0) {
            stackIn_7_0 = param0;
          } else {
            stackIn_7_0 = oo.field_e;
          }
          var8 = stackIn_7_0;
          if (var5_int < oo.field_g) {
            stackIn_10_0 = var5_int;
          } else {
            stackIn_10_0 = oo.field_g;
          }
          var9 = stackIn_10_0;
          if (oo.field_d > var6) {
            stackIn_13_0 = var6;
          } else {
            stackIn_13_0 = oo.field_d;
          }
          var10 = stackIn_13_0;
          if (param1 >= oo.field_f &&
            oo.field_g > param1) {
            var11 = param1 + oo.field_b * var8;
            var12 = var10 + 1 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              oo.field_i[var11] = 16777215;
              var11 = var11 + oo.field_b * 2;
            }
          }
          if (param0 >= oo.field_e &&
            var6 < oo.field_d) {
            var11Lifetime1 = oo.field_b * param0 + var7;
            var12Lifetime1 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              oo.field_i[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (param2 < 82) {
            return;
          }
          if (var5_int >= oo.field_f &&
            var5_int < oo.field_g) {
            var11Lifetime2 = var5_int + ((var5_int - param1 & 1) + var8) * oo.field_b;
            var12Lifetime2 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              oo.field_i[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + oo.field_b * 2;
            }
          }
          if (oo.field_e <= param0 &&
            oo.field_d > var6) {
            var11Lifetime3 = (1 & var6 - param0) + (var7 + oo.field_b * var6);
            var12Lifetime3 = var9 + 1 - var7 >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              oo.field_i[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "hl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte[] param0, byte param1, cj param2, int param3, cj param4, int param5, int param6, cj param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          ie.field_sb = -1L;
          od.field_Gb = param0;
          qa.field_h = param5;
          kj.field_h = param0.length;
          la.field_k = false;
          fg.field_k = new byte[(qa.field_h + 7) / 8];
          mh.field_c = null;
          ej.field_n = null;
          var10_int = 0;
          for (var11 = 0; var11 < od.field_Gb.length; var11++) {
            var10_int = var10_int + (255 & od.field_Gb[var11]);
          }
          var10_int = (7 + var10_int) / 8;
          tg.field_a = new byte[var10_int];
          if (null == param2.field_Cb) {
            param2.field_Cb = new th();
          }
          cg.field_i = param2.field_Cb;
          cg.field_i.e(-30986);
          hq.field_c = new sc(param8);
          ao.field_e = 0;
          if (param1 != 75) {
            return;
          }
          dm.field_Zb = -1;
          cb.field_i = 0;
          bc.field_e = -1;
          if (null == param7.field_Cb) {
            param7.field_Cb = new th();
          }
          tn.field_C = param7.field_Cb;
          tn.field_C.e(-30986);
          af.field_h = new sc(param9);
          if (param4.field_Cb == null) {
            param4.field_Cb = new th();
          }
          nh.field_g = param4.field_Cb;
          nh.field_g.e(param1 - 31061);
          kp.field_o = new sc(param6);
          so.field_r = param3;
          qi.field_c = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_16_0 = var10;
          stackIn_16_1 = new StringBuilder().append("hl.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 16777215) {
          field_e = (int[]) null;
        }
        field_c = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        if (param0 != 0) {
          field_b = (db) null;
        }
        return ie.field_sb == mh.field_c.field_nc ? true : false;
    }

    static {
        field_e = new int[1024];
        field_b = new db();
        field_d = new ug[15];
        field_a = -1;
        field_f = new int[8192];
    }
}
