/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static String field_a;
    static int[][] field_e;
    static qm[] field_d;
    static ut[] field_c;
    static int field_f;
    static String field_b;

    final static String a(int param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 26300) {
            stackIn_4_0 = hs.field_b + dg.a((byte) -128, 0, (long)param0, true, vv.field_r);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ad.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, boolean param1, int param2) {
        int stackIn_2_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_91_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        try {
          var4 = param0 >> 31;
          if (!param1) {
            stackIn_2_0 = -43;
            return stackIn_2_0;
          }
          param0 = var4 ^ param0 + var4;
          var4Lifetime1 = param2 >> 31;
          param2 = var4Lifetime1 + param2 ^ var4Lifetime1;
          if (param0 < param2) {
            var4Lifetime2 = param0;
            param0 = param2;
            param2 = var4Lifetime2;
          }
          var3_int = 0;
          if (param0 >= 32768) {
            if (param0 >= 1073741824) {
              var3_int += 16;
              param0 = param0 >> 16;
            }
            if (4194304 <= param0) {
              var3_int += 8;
              param0 = param0 >> 8;
            }
            if (param0 >= 262144) {
              param0 = param0 >> 4;
              var3_int += 4;
            }
            if (param0 >= 65536) {
              var3_int += 2;
              param0 = param0 >> 2;
            }
            if (param0 >= 32768) {
              var3_int++;
              param0 = param0 >> 1;
            }
            param2 = param2 >> var3_int;
          }
          if (param0 > (param2 << 5)) {
            stackIn_25_0 = param0 << var3_int;
            return stackIn_25_0;
          }
          param0 = param2 * param2 + param0 * param0;
          if (65536 > param0) {
            if (param0 < 256) {
              if (param0 < 0) {
                stackIn_78_0 = -1;
                return stackIn_78_0;
              }
              stackIn_76_0 = qk.field_I[param0] >> 12;
              return stackIn_76_0;
            }
            if (param0 >= 4096) {
              if (16384 > param0) {
                stackIn_91_0 = qk.field_I[param0 >> 6] >> 9;
                return stackIn_91_0;
              }
              stackIn_89_0 = qk.field_I[param0 >> 8] >> 8;
              return stackIn_89_0;
            }
            if (1024 <= param0) {
              stackIn_86_0 = qk.field_I[param0 >> 4] >> 10;
              return stackIn_86_0;
            }
            stackIn_84_0 = qk.field_I[param0 >> 2] >> 11;
            return stackIn_84_0;
          }
          if (param0 < 16777216) {
            if (1048576 <= param0) {
              if (param0 < 4194304) {
                stackIn_70_0 = qk.field_I[param0 >> 14] >> 5;
                return stackIn_70_0;
              }
              stackIn_68_0 = qk.field_I[param0 >> 16] >> 4;
              return stackIn_68_0;
            }
            if (param0 < 262144) {
              stackIn_65_0 = qk.field_I[param0 >> 10] >> 7;
              return stackIn_65_0;
            }
            stackIn_63_0 = qk.field_I[param0 >> 12] >> 6;
            return stackIn_63_0;
          }
          if (param0 >= 268435456) {
            if (1073741824 <= param0) {
              stackIn_57_0 = qk.field_I[param0 >> 24] << var3_int;
              return stackIn_57_0;
            }
            if (1 > var3_int) {
              stackIn_55_0 = qk.field_I[param0 >> 22] >> -var3_int + 1;
            } else {
              stackIn_55_0 = qk.field_I[param0 >> 22] << -1 + var3_int;
            }
            return stackIn_55_0;
          }
          if (param0 >= 67108864) {
            if (var3_int >= 2) {
              stackIn_47_0 = qk.field_I[param0 >> 20] << -2 + var3_int;
            } else {
              stackIn_47_0 = qk.field_I[param0 >> 20] >> -var3_int + 2;
            }
            return stackIn_47_0;
          }
          if (var3_int < 3) {
            stackIn_42_0 = qk.field_I[param0 >> 18] >> -var3_int + 3;
          } else {
            stackIn_42_0 = qk.field_I[param0 >> 18] << -3 + var3_int;
          }
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ad.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        try {
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = (int[][]) null;
          field_c = null;
          if (param0 != 0) {
            ad.a(15, -14);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ad.D(" + param0 + ')');
        }
    }

    final static void a(sj param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_3808_0;
            StringBuilder stackIn_3808_1;
            String stackIn_3809_2;
            boolean stackIn_3817_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            sj param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(sj initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_3808_0 = null;
                this.stackIn_3808_1 = null;
                this.stackIn_3809_2 = null;
                this.stackIn_3817_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                up.field_m = param0;
                var2 = ib.a("returntotournament", param1 ^ -90);
                if (var2 != null) {
                  jo.field_B = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,0", -112);
                if (var2 != null) {
                  nv.field_I[0] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,1", -99);
                if (var2 != null) {
                  nv.field_I[1] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,2", -84);
                if (null != var2) {
                  nv.field_I[2] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,3", -111);
                if (var2 != null) {
                  nv.field_I[3] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,4", -99);
                if (var2 != null) {
                  nv.field_I[4] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,5", -102);
                if (null != var2) {
                  nv.field_I[5] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,6", -109);
                if (var2 != null) {
                  nv.field_I[6] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,7", -114);
                if (null != var2) {
                  nv.field_I[7] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,8", -128);
                if (var2 != null) {
                  nv.field_I[8] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,9", -116);
                if (var2 != null) {
                  nv.field_I[9] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,10", -110);
                if (null != var2) {
                  nv.field_I[10] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,11", param1 ^ -91);
                if (var2 != null) {
                  nv.field_I[11] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,12", -81);
                if (null != var2) {
                  nv.field_I[12] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,13", -127);
                if (var2 != null) {
                  nv.field_I[13] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,14", -103);
                if (var2 != null) {
                  nv.field_I[14] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,15", -83);
                if (null != var2) {
                  nv.field_I[15] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,16", -124);
                if (null != var2) {
                  nv.field_I[16] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,17", -104);
                if (var2 != null) {
                  nv.field_I[17] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,18", -90);
                if (null != var2) {
                  nv.field_I[18] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,19", -92);
                if (var2 != null) {
                  nv.field_I[19] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,20", -111);
                if (null != var2) {
                  nv.field_I[20] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,21", param1 ^ -124);
                if (null != var2) {
                  nv.field_I[21] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,22", param1 ^ -100);
                if (var2 != null) {
                  nv.field_I[22] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,23", -111);
                if (var2 != null) {
                  nv.field_I[23] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,24", -128);
                if (null != var2) {
                  nv.field_I[24] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,25", param1 ^ -82);
                if (null != var2) {
                  nv.field_I[25] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,26", param1 - 96);
                if (null != var2) {
                  nv.field_I[26] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,27", -109);
                if (null != var2) {
                  nv.field_I[27] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,28", -90);
                if (var2 != null) {
                  nv.field_I[28] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,29", -101);
                if (null != var2) {
                  nv.field_I[29] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,30", param1 - 121);
                if (var2 != null) {
                  nv.field_I[30] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,31", -99);
                if (null != var2) {
                  nv.field_I[31] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,32", -127);
                if (var2 != null) {
                  nv.field_I[32] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,33", -101);
                if (var2 != null) {
                  nv.field_I[33] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,34", param1 - 115);
                if (var2 != null) {
                  nv.field_I[34] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,35", -95);
                if (var2 != null) {
                  nv.field_I[35] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,36", param1 - 127);
                if (var2 != null) {
                  nv.field_I[36] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,37", -113);
                if (var2 != null) {
                  nv.field_I[37] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,38", -109);
                if (null != var2) {
                  nv.field_I[38] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,39", param1 - 112);
                if (null != var2) {
                  nv.field_I[39] = kt.a(var2, true);
                }
                var2 = ib.a("standalone_loading_strings,40", -101);
                if (null != var2) {
                  nv.field_I[40] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,0", param1 - 87);
                if (var2 != null) {
                  kw.field_c[0] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,1", param1 - 113);
                if (null != var2) {
                  kw.field_c[1] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,2", param1 - 89);
                if (null != var2) {
                  kw.field_c[2] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,3", param1 - 129);
                if (null != var2) {
                  kw.field_c[3] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,4", -83);
                if (null != var2) {
                  kw.field_c[4] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,5", param1 - 124);
                if (null != var2) {
                  kw.field_c[5] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,6", param1 - 105);
                if (var2 != null) {
                  kw.field_c[6] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,7", -117);
                if (var2 != null) {
                  kw.field_c[7] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,8", -97);
                if (var2 != null) {
                  kw.field_c[8] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,9", -82);
                if (var2 != null) {
                  kw.field_c[9] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,10", -83);
                if (null != var2) {
                  kw.field_c[10] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,11", param1 - 109);
                if (var2 != null) {
                  kw.field_c[11] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,12", -107);
                if (var2 != null) {
                  kw.field_c[12] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,13", param1 - 82);
                if (var2 != null) {
                  kw.field_c[13] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,14", -102);
                if (null != var2) {
                  kw.field_c[14] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,15", -119);
                if (var2 != null) {
                  kw.field_c[15] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,16", -82);
                if (var2 != null) {
                  kw.field_c[16] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,17", param1 - 128);
                if (null != var2) {
                  kw.field_c[17] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,18", -128);
                if (var2 != null) {
                  kw.field_c[18] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,19", param1 ^ -83);
                if (null != var2) {
                  kw.field_c[19] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,20", param1 - 120);
                if (var2 != null) {
                  kw.field_c[20] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,21", -123);
                if (null != var2) {
                  kw.field_c[21] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,22", param1 ^ -116);
                if (var2 != null) {
                  kw.field_c[22] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,23", param1 - 128);
                if (null != var2) {
                  kw.field_c[23] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,24", -97);
                if (var2 != null) {
                  kw.field_c[24] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,25", -116);
                if (var2 != null) {
                  kw.field_c[25] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,26", -125);
                if (var2 != null) {
                  kw.field_c[26] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,27", -90);
                if (null != var2) {
                  kw.field_c[27] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,28", -94);
                if (var2 != null) {
                  kw.field_c[28] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,29", -92);
                if (var2 != null) {
                  kw.field_c[29] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,30", -104);
                if (null != var2) {
                  kw.field_c[30] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,31", -102);
                if (var2 != null) {
                  kw.field_c[31] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,32", -91);
                if (null != var2) {
                  kw.field_c[32] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,33", -112);
                if (var2 != null) {
                  kw.field_c[33] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,34", -110);
                if (var2 != null) {
                  kw.field_c[34] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,35", -108);
                if (var2 != null) {
                  kw.field_c[35] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,36", -123);
                if (var2 != null) {
                  kw.field_c[36] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,37", -106);
                if (var2 != null) {
                  kw.field_c[37] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,38", -90);
                if (null != var2) {
                  kw.field_c[38] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,39", -95);
                if (null != var2) {
                  kw.field_c[39] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,40", -124);
                if (null != var2) {
                  kw.field_c[40] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,41", -86);
                if (null != var2) {
                  kw.field_c[41] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,42", param1 - 122);
                if (var2 != null) {
                  kw.field_c[42] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,43", param1 - 106);
                if (var2 != null) {
                  kw.field_c[43] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,44", param1 - 96);
                if (null != var2) {
                  kw.field_c[44] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,45", -126);
                if (null != var2) {
                  kw.field_c[45] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,46", -97);
                if (var2 != null) {
                  kw.field_c[46] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,47", -112);
                if (var2 != null) {
                  kw.field_c[47] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,48", -121);
                if (var2 != null) {
                  kw.field_c[48] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,49", -122);
                if (var2 != null) {
                  kw.field_c[49] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,50", -98);
                if (var2 != null) {
                  kw.field_c[50] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,51", param1 - 129);
                if (null != var2) {
                  kw.field_c[51] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,52", param1 ^ -96);
                if (var2 != null) {
                  kw.field_c[52] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,53", param1 - 116);
                if (null != var2) {
                  kw.field_c[53] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,54", param1 - 112);
                if (var2 != null) {
                  kw.field_c[54] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,55", param1 - 101);
                if (null != var2) {
                  kw.field_c[55] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,56", -92);
                if (var2 != null) {
                  kw.field_c[56] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,57", param1 - 115);
                if (var2 != null) {
                  kw.field_c[57] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,58", -82);
                if (var2 != null) {
                  kw.field_c[58] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,59", -82);
                if (null != var2) {
                  kw.field_c[59] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,60", -104);
                if (var2 != null) {
                  kw.field_c[60] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,61", -115);
                if (var2 != null) {
                  kw.field_c[61] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,62", param1 - 94);
                if (null != var2) {
                  kw.field_c[62] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,63", -128);
                if (null != var2) {
                  kw.field_c[63] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,64", -82);
                if (null != var2) {
                  kw.field_c[64] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,65", -99);
                if (var2 != null) {
                  kw.field_c[65] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,66", -83);
                if (var2 != null) {
                  kw.field_c[66] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,67", -80);
                if (null != var2) {
                  kw.field_c[67] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,68", param1 ^ -102);
                if (null != var2) {
                  kw.field_c[68] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,69", param1 ^ -112);
                if (var2 != null) {
                  kw.field_c[69] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,70", -128);
                if (var2 != null) {
                  kw.field_c[70] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,71", -122);
                if (null != var2) {
                  kw.field_c[71] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_names,72", -106);
                if (var2 != null) {
                  kw.field_c[72] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,0", -101);
                if (var2 != null) {
                  lw.field_a[0] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,1", param1 ^ -107);
                if (null != var2) {
                  lw.field_a[1] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,2", -119);
                if (var2 != null) {
                  lw.field_a[2] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,3", param1 ^ -106);
                if (null != var2) {
                  lw.field_a[3] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,4", -123);
                if (var2 != null) {
                  lw.field_a[4] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,5", -114);
                if (null != var2) {
                  lw.field_a[5] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,6", param1 ^ -123);
                if (var2 != null) {
                  lw.field_a[6] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,7", -94);
                if (var2 != null) {
                  lw.field_a[7] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,8", -114);
                if (null != var2) {
                  lw.field_a[8] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,9", -114);
                if (var2 != null) {
                  lw.field_a[9] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,10", -102);
                if (null != var2) {
                  lw.field_a[10] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,11", -114);
                if (null != var2) {
                  lw.field_a[11] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,12", -127);
                if (null != var2) {
                  lw.field_a[12] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,13", -111);
                if (var2 != null) {
                  lw.field_a[13] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,14", -125);
                if (null != var2) {
                  lw.field_a[14] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,15", param1 ^ -112);
                if (var2 != null) {
                  lw.field_a[15] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,16", -108);
                if (null != var2) {
                  lw.field_a[16] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,17", -100);
                if (null != var2) {
                  lw.field_a[17] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,18", -109);
                if (null != var2) {
                  lw.field_a[18] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,19", -120);
                if (var2 != null) {
                  lw.field_a[19] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,20", -100);
                if (var2 != null) {
                  lw.field_a[20] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,21", param1 - 129);
                if (null != var2) {
                  lw.field_a[21] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,22", -124);
                if (null != var2) {
                  lw.field_a[22] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,23", -89);
                if (null != var2) {
                  lw.field_a[23] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,24", -119);
                if (null != var2) {
                  lw.field_a[24] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,25", -84);
                if (var2 != null) {
                  lw.field_a[25] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,26", -82);
                if (null != var2) {
                  lw.field_a[26] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,27", -107);
                if (var2 != null) {
                  lw.field_a[27] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,28", -106);
                if (null != var2) {
                  lw.field_a[28] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,29", -107);
                if (var2 != null) {
                  lw.field_a[29] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,30", -100);
                if (var2 != null) {
                  lw.field_a[30] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,31", -87);
                if (var2 != null) {
                  lw.field_a[31] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,32", param1 ^ -107);
                if (var2 != null) {
                  lw.field_a[32] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,33", -113);
                if (null != var2) {
                  lw.field_a[33] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,34", -111);
                if (var2 != null) {
                  lw.field_a[34] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,35", -100);
                if (var2 != null) {
                  lw.field_a[35] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,36", -96);
                if (null != var2) {
                  lw.field_a[36] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,37", -95);
                if (null != var2) {
                  lw.field_a[37] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,38", -117);
                if (var2 != null) {
                  lw.field_a[38] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,39", -81);
                if (var2 != null) {
                  lw.field_a[39] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,40", param1 ^ -109);
                if (null != var2) {
                  lw.field_a[40] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,41", param1 - 108);
                if (var2 != null) {
                  lw.field_a[41] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,42", param1 - 127);
                if (var2 != null) {
                  lw.field_a[42] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,43", -126);
                if (var2 != null) {
                  lw.field_a[43] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,44", -108);
                if (var2 != null) {
                  lw.field_a[44] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,45", param1 ^ -116);
                if (var2 != null) {
                  lw.field_a[45] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,46", -125);
                if (null != var2) {
                  lw.field_a[46] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,47", param1 - 85);
                if (null != var2) {
                  lw.field_a[47] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,48", -118);
                if (var2 != null) {
                  lw.field_a[48] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,49", -81);
                if (var2 != null) {
                  lw.field_a[49] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,50", param1 ^ -92);
                if (null != var2) {
                  lw.field_a[50] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,51", -100);
                if (var2 != null) {
                  lw.field_a[51] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,52", -93);
                if (null != var2) {
                  lw.field_a[52] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,53", param1 ^ -121);
                if (null != var2) {
                  lw.field_a[53] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,54", -110);
                if (var2 != null) {
                  lw.field_a[54] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,55", -124);
                if (null != var2) {
                  lw.field_a[55] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,56", param1 - 97);
                if (var2 != null) {
                  lw.field_a[56] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,57", -94);
                if (var2 != null) {
                  lw.field_a[57] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,58", param1 - 123);
                if (var2 != null) {
                  lw.field_a[58] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,59", param1 ^ -103);
                if (null != var2) {
                  lw.field_a[59] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,60", -92);
                if (var2 != null) {
                  lw.field_a[60] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,61", -124);
                if (var2 != null) {
                  lw.field_a[61] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,62", -114);
                if (null != var2) {
                  lw.field_a[62] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,63", -119);
                if (null != var2) {
                  lw.field_a[63] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,64", -105);
                if (null != var2) {
                  lw.field_a[64] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,65", -107);
                if (null != var2) {
                  lw.field_a[65] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,66", -99);
                if (var2 != null) {
                  lw.field_a[66] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,67", param1 - 102);
                if (var2 != null) {
                  lw.field_a[67] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,68", -88);
                if (null != var2) {
                  lw.field_a[68] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,69", -94);
                if (null != var2) {
                  lw.field_a[69] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,70", -111);
                if (null != var2) {
                  lw.field_a[70] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,71", -89);
                if (var2 != null) {
                  lw.field_a[71] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_criteria,72", -112);
                if (null != var2) {
                  lw.field_a[72] = kt.a(var2, true);
                }
                var2 = ib.a("money_symbol", param1 ^ -81);
                if (var2 != null) {
                  hs.field_b = kt.a(var2, true);
                }
                var2 = ib.a("text_benefits,0", -117);
                if (var2 != null) {
                  rm.field_A[0] = kt.a(var2, true);
                }
                var2 = ib.a("text_benefits,1", -116);
                if (var2 != null) {
                  rm.field_A[1] = kt.a(var2, true);
                }
                var2 = ib.a("text_benefits,2", param1 ^ -92);
                if (var2 != null) {
                  rm.field_A[2] = kt.a(var2, true);
                }
                var2 = ib.a("gold_league_winner_singular", -120);
                if (null != var2) {
                  cl.field_g = kt.a(var2, true);
                }
                var2 = ib.a("gold_league_winner_plural", -106);
                if (var2 != null) {
                  ka.field_d = kt.a(var2, true);
                }
                var2 = ib.a("no_gold_league_winner", -117);
                if (null != var2) {
                  om.field_zb = kt.a(var2, true);
                }
                var2 = ib.a("class_name,0", -90);
                if (var2 != null) {
                  uf.field_e[0] = kt.a(var2, true);
                }
                var2 = ib.a("class_name,1", param1 ^ -96);
                if (null != var2) {
                  uf.field_e[1] = kt.a(var2, true);
                }
                var2 = ib.a("class_name,2", -94);
                if (null != var2) {
                  uf.field_e[2] = kt.a(var2, true);
                }
                var2 = ib.a("class_name,3", -84);
                if (var2 != null) {
                  uf.field_e[3] = kt.a(var2, true);
                }
                var2 = ib.a("class_name,4", -90);
                if (var2 != null) {
                  uf.field_e[4] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptlabels,0", -109);
                if (var2 != null) {
                  rp.field_y[0] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptlabels,1", param1 ^ -113);
                if (var2 != null) {
                  rp.field_y[1] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptlabels,2", param1 ^ -127);
                if (var2 != null) {
                  rp.field_y[2] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptlabels,3", -116);
                if (null != var2) {
                  rp.field_y[3] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,0,0", -112);
                if (null != var2) {
                  rk.field_e[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,0,1", -91);
                if (null != var2) {
                  rk.field_e[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,0,2", param1 ^ -101);
                if (var2 != null) {
                  rk.field_e[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,1,0", -84);
                if (var2 != null) {
                  rk.field_e[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,1,1", -110);
                if (var2 != null) {
                  rk.field_e[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,2,0", param1 ^ -126);
                if (var2 != null) {
                  rk.field_e[2][0] = kt.a(var2, true);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = ib.a("gameoptnames,2,1", -120);
                if (null != var2) {
                  rk.field_e[2][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,3,0", param1 ^ -83);
                if (var2 != null) {
                  rk.field_e[3][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameoptnames,3,1", param1 ^ -126);
                if (var2 != null) {
                  rk.field_e[3][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,0,0", -124);
                if (var2 != null) {
                  or.field_b[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,0,1", param1 - 91);
                if (null != var2) {
                  or.field_b[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,0,2", -93);
                if (var2 != null) {
                  or.field_b[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,1,0", -125);
                if (var2 != null) {
                  or.field_b[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,1,1", -106);
                if (var2 != null) {
                  or.field_b[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,2,0", -123);
                if (null != var2) {
                  or.field_b[2][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,2,1", -83);
                if (var2 != null) {
                  or.field_b[2][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,3,0", -94);
                if (null != var2) {
                  or.field_b[3][0] = kt.a(var2, true);
                }
                var2 = ib.a("gameopttooltips,3,1", -109);
                if (var2 != null) {
                  or.field_b[3][1] = kt.a(var2, true);
                }
                var2 = ib.a("gameratedoptions,0", -102);
                if (null != var2) {
                  os.field_i[0] = kt.a(var2, true);
                }
                var2 = ib.a("gameratedoptions,1", -100);
                if (var2 != null) {
                  os.field_i[1] = kt.a(var2, true);
                }
                var2 = ib.a("gameratedoptions,2", -124);
                if (null != var2) {
                  os.field_i[2] = kt.a(var2, true);
                }
                var2 = ib.a("gameratedoptions_tooltips,0", -119);
                if (null != var2) {
                  jd.field_i[0] = kt.a(var2, true);
                }
                var2 = ib.a("gameratedoptions_tooltips,1", -87);
                if (var2 != null) {
                  jd.field_i[1] = kt.a(var2, true);
                }
                var2 = ib.a("gameratedoptions_tooltips,2", param1 ^ -127);
                if (var2 != null) {
                  jd.field_i[2] = kt.a(var2, true);
                }
                var2 = ib.a("keycode_left", -97);
                if (null != var2) {
                  uv.field_e = 255 & var2[0];
                }
                var2 = ib.a("keycode_right", -96);
                if (var2 != null) {
                  pb.field_A = var2[0] & 255;
                }
                var2 = ib.a("keycode_up", -94);
                if (null != var2) {
                  rb.field_Kb = var2[0] & 255;
                }
                var2 = ib.a("keycode_down", -107);
                if (var2 != null) {
                  oc.field_e = 255 & var2[0];
                }
                var2 = ib.a("keycode_toggle_chat", -99);
                if (var2 != null) {
                  il.field_h = var2[0] & 255;
                }
                var2 = ib.a("keycode_toggle_map", -120);
                if (var2 != null) {
                  tt.field_b = 255 & var2[0];
                }
                var2 = ib.a("keycode_zoom_in", -86);
                if (null != var2) {
                  f.field_a = var2[0] & 255;
                }
                var2 = ib.a("keycode_zoom_out", -81);
                if (null != var2) {
                  kq.field_Jb = 255 & var2[0];
                }
                var2 = ib.a("title_attached", -100);
                if (null != var2) {
                  iw.field_k = kt.a(var2, true);
                }
                var2 = ib.a("title_detached", -107);
                if (var2 != null) {
                  qd.field_f = kt.a(var2, true);
                }
                var2 = ib.a("controls_attached,0", -95);
                if (var2 != null) {
                  cg.field_G[0] = kt.a(var2, true);
                }
                var2 = ib.a("controls_attached,1", param1 - 85);
                if (null != var2) {
                  cg.field_G[1] = kt.a(var2, true);
                }
                var2 = ib.a("controls_detached,0", -116);
                if (var2 != null) {
                  fn.field_j[0] = kt.a(var2, true);
                }
                var2 = ib.a("controls_detached,1", -102);
                if (null != var2) {
                  fn.field_j[1] = kt.a(var2, true);
                }
                var2 = ib.a("controls_detached,2", param1 - 119);
                if (null != var2) {
                  fn.field_j[2] = kt.a(var2, true);
                }
                var2 = ib.a("controls_attached2,0", -100);
                if (var2 != null) {
                  po.field_a[0] = kt.a(var2, true);
                }
                var2 = ib.a("controls_attached2,1", param1 ^ -126);
                if (var2 != null) {
                  po.field_a[1] = kt.a(var2, true);
                }
                var2 = ib.a("controls_detached2,0", -110);
                if (var2 != null) {
                  w.field_g[0] = kt.a(var2, true);
                }
                var2 = ib.a("controls_detached2,1", -106);
                if (null != var2) {
                  w.field_g[1] = kt.a(var2, true);
                }
                var2 = ib.a("controls_detached2,2", -92);
                if (null != var2) {
                  w.field_g[2] = kt.a(var2, true);
                }
                var2 = ib.a("tutorial", -106);
                if (null != var2) {
                  fb.field_C = kt.a(var2, true);
                }
                var2 = ib.a("sandbox", -88);
                if (var2 != null) {
                  iv.field_n = kt.a(var2, true);
                }
                var2 = ib.a("ok", param1 - 90);
                if (null != var2) {
                  s.field_F = kt.a(var2, true);
                }
                var2 = ib.a("awesome_exclamation", -116);
                if (var2 != null) {
                  gm.field_Q = kt.a(var2, true);
                }
                var2 = ib.a("yes", -88);
                if (null != var2) {
                  ob.field_H = kt.a(var2, true);
                }
                var2 = ib.a("no", -103);
                if (var2 != null) {
                  in.field_a = kt.a(var2, true);
                }
                var2 = ib.a("cancel", -93);
                if (var2 != null) {
                  ku.field_a = kt.a(var2, true);
                }
                var2 = ib.a("gotoauctions", param1 - 121);
                if (null != var2) {
                  lh.field_F = kt.a(var2, true);
                }
                var2 = ib.a("login", -111);
                if (var2 != null) {
                  mc.field_g = kt.a(var2, true);
                }
                var2 = ib.a("formation_standard", -114);
                if (var2 != null) {
                  qs.field_H = kt.a(var2, true);
                }
                var2 = ib.a("formation_forward", -122);
                if (null != var2) {
                  m.field_i = kt.a(var2, true);
                }
                var2 = ib.a("formation_centre", -109);
                if (null != var2) {
                  uq.field_f = kt.a(var2, true);
                }
                var2 = ib.a("formation_inverse_centre", -87);
                if (null != var2) {
                  kr.field_d = kt.a(var2, true);
                }
                var2 = ib.a("formation_defensive", -101);
                if (null != var2) {
                  rl.field_t = kt.a(var2, true);
                }
                var2 = ib.a("formation_slight_stagger", param1 - 111);
                if (var2 != null) {
                  fc.field_e = kt.a(var2, true);
                }
                var2 = ib.a("formation_strong_stagger", -107);
                if (var2 != null) {
                  pq.field_M = kt.a(var2, true);
                }
                var2 = ib.a("formation_diamond", -128);
                if (null != var2) {
                  kr.field_c = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,0", -125);
                if (null != var2) {
                  ql.field_c[0] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,1", -91);
                if (null != var2) {
                  ql.field_c[1] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,2", -90);
                if (var2 != null) {
                  ql.field_c[2] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,3", -101);
                if (var2 != null) {
                  ql.field_c[3] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,4", -115);
                if (null != var2) {
                  ql.field_c[4] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,5", param1 - 99);
                if (var2 != null) {
                  ql.field_c[5] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,6", -114);
                if (null != var2) {
                  ql.field_c[6] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,7", -108);
                if (null != var2) {
                  ql.field_c[7] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,8", param1 - 115);
                if (var2 != null) {
                  ql.field_c[8] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,9", param1 ^ -97);
                if (var2 != null) {
                  ql.field_c[9] = kt.a(var2, true);
                }
                var2 = ib.a("TIME_LEFT,10", -105);
                if (null != var2) {
                  ql.field_c[10] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,0", -110);
                if (var2 != null) {
                  us.field_h[0] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,1", param1 ^ -81);
                if (var2 != null) {
                  us.field_h[1] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,2", -105);
                if (var2 != null) {
                  us.field_h[2] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,3", -100);
                if (var2 != null) {
                  us.field_h[3] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,4", param1 ^ -124);
                if (var2 != null) {
                  us.field_h[4] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,5", -105);
                if (null != var2) {
                  us.field_h[5] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,6", param1 ^ -94);
                if (var2 != null) {
                  us.field_h[6] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,7", -115);
                if (null != var2) {
                  us.field_h[7] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,8", -89);
                if (null != var2) {
                  us.field_h[8] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,9", -104);
                if (var2 != null) {
                  us.field_h[9] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,10", param1 ^ -92);
                if (var2 != null) {
                  us.field_h[10] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,11", -103);
                if (var2 != null) {
                  us.field_h[11] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,12", -121);
                if (var2 != null) {
                  us.field_h[12] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,13", -104);
                if (var2 != null) {
                  us.field_h[13] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,14", -108);
                if (var2 != null) {
                  us.field_h[14] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,15", -111);
                if (var2 != null) {
                  us.field_h[15] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,16", param1 - 111);
                if (null != var2) {
                  us.field_h[16] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,17", param1 ^ -81);
                if (var2 != null) {
                  us.field_h[17] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,18", -121);
                if (null != var2) {
                  us.field_h[18] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,19", -127);
                if (null != var2) {
                  us.field_h[19] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,20", -96);
                if (null != var2) {
                  us.field_h[20] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,21", -114);
                if (null != var2) {
                  us.field_h[21] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,22", param1 ^ -104);
                if (null != var2) {
                  us.field_h[22] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,23", -110);
                if (var2 != null) {
                  us.field_h[23] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,24", param1 - 87);
                if (null != var2) {
                  us.field_h[24] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,25", -126);
                if (null != var2) {
                  us.field_h[25] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,26", -97);
                if (param1 != 1) {
                  ad.a((bb) null, (byte) 104);
                }
                if (null != var2) {
                  us.field_h[26] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,27", -127);
                if (var2 != null) {
                  us.field_h[27] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,28", -106);
                if (var2 != null) {
                  us.field_h[28] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,29", -113);
                if (null != var2) {
                  us.field_h[29] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,30", param1 ^ -110);
                if (null != var2) {
                  us.field_h[30] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,31", param1 ^ -108);
                if (var2 != null) {
                  us.field_h[31] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,32", -126);
                if (var2 != null) {
                  us.field_h[32] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,33", -127);
                if (var2 != null) {
                  us.field_h[33] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,34", -115);
                if (var2 != null) {
                  us.field_h[34] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,35", -95);
                if (var2 != null) {
                  us.field_h[35] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,36", param1 ^ -81);
                if (null != var2) {
                  us.field_h[36] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,37", -85);
                if (var2 != null) {
                  us.field_h[37] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,38", -106);
                if (null != var2) {
                  us.field_h[38] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,39", param1 - 95);
                if (var2 != null) {
                  us.field_h[39] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,40", -82);
                if (var2 != null) {
                  us.field_h[40] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,41", -106);
                if (var2 != null) {
                  us.field_h[41] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,42", -112);
                if (null != var2) {
                  us.field_h[42] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,43", -124);
                if (var2 != null) {
                  us.field_h[43] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,44", -100);
                if (var2 != null) {
                  us.field_h[44] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,45", param1 ^ -90);
                if (var2 != null) {
                  us.field_h[45] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,46", -90);
                if (null != var2) {
                  us.field_h[46] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,47", param1 ^ -79);
                if (null != var2) {
                  us.field_h[47] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,48", param1 ^ -88);
                if (null != var2) {
                  us.field_h[48] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,49", -112);
                if (null != var2) {
                  us.field_h[49] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,50", -96);
                if (null != var2) {
                  us.field_h[50] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,51", -107);
                if (null != var2) {
                  us.field_h[51] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,52", -111);
                if (var2 != null) {
                  us.field_h[52] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,53", -106);
                if (var2 != null) {
                  us.field_h[53] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,54", -115);
                if (var2 != null) {
                  us.field_h[54] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,55", -88);
                if (null != var2) {
                  us.field_h[55] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,56", -113);
                if (null != var2) {
                  us.field_h[56] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,57", -93);
                if (null != var2) {
                  us.field_h[57] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,58", param1 - 126);
                if (null != var2) {
                  us.field_h[58] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,59", param1 ^ -98);
                if (null != var2) {
                  us.field_h[59] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,60", -83);
                if (var2 != null) {
                  us.field_h[60] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,61", -109);
                if (var2 != null) {
                  us.field_h[61] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,62", param1 - 86);
                if (var2 != null) {
                  us.field_h[62] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,63", -90);
                if (null != var2) {
                  us.field_h[63] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,64", param1 - 96);
                if (var2 != null) {
                  us.field_h[64] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,65", -105);
                if (var2 != null) {
                  us.field_h[65] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,66", -100);
                if (var2 != null) {
                  us.field_h[66] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,67", -122);
                if (var2 != null) {
                  us.field_h[67] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,68", -85);
                if (var2 != null) {
                  us.field_h[68] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,69", param1 - 103);
                if (null != var2) {
                  us.field_h[69] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,70", param1 - 84);
                if (null != var2) {
                  us.field_h[70] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,71", -116);
                if (var2 != null) {
                  us.field_h[71] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,72", param1 - 86);
                if (var2 != null) {
                  us.field_h[72] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_description,73", -109);
                if (null != var2) {
                  us.field_h[73] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,0", -120);
                if (var2 != null) {
                  rv.field_b[0] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,1", param1 ^ -91);
                if (var2 != null) {
                  rv.field_b[1] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,2", -128);
                if (var2 != null) {
                  rv.field_b[2] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,3", param1 ^ -87);
                if (null != var2) {
                  rv.field_b[3] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,4", -100);
                if (var2 != null) {
                  rv.field_b[4] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,5", -94);
                if (null != var2) {
                  rv.field_b[5] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,6", -113);
                if (null != var2) {
                  rv.field_b[6] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,7", -86);
                if (var2 != null) {
                  rv.field_b[7] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,8", -107);
                if (var2 != null) {
                  rv.field_b[8] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,9", param1 - 97);
                if (var2 != null) {
                  rv.field_b[9] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,10", -110);
                if (var2 != null) {
                  rv.field_b[10] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,11", -126);
                if (null != var2) {
                  rv.field_b[11] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,12", -92);
                if (var2 != null) {
                  rv.field_b[12] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,13", param1 ^ -112);
                if (var2 != null) {
                  rv.field_b[13] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,14", param1 ^ -89);
                if (null != var2) {
                  rv.field_b[14] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,15", -125);
                if (var2 != null) {
                  rv.field_b[15] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,16", -94);
                if (var2 != null) {
                  rv.field_b[16] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,17", -90);
                if (var2 != null) {
                  rv.field_b[17] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,18", -85);
                if (var2 != null) {
                  rv.field_b[18] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,19", -84);
                if (var2 != null) {
                  rv.field_b[19] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,20", -80);
                if (var2 != null) {
                  rv.field_b[20] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,21", -82);
                if (null != var2) {
                  rv.field_b[21] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,22", -82);
                if (var2 != null) {
                  rv.field_b[22] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,23", -101);
                if (var2 != null) {
                  rv.field_b[23] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,24", -120);
                if (null != var2) {
                  rv.field_b[24] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,25", param1 ^ -90);
                if (null != var2) {
                  rv.field_b[25] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,26", -118);
                if (null != var2) {
                  rv.field_b[26] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,27", -121);
                if (null != var2) {
                  rv.field_b[27] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,28", -96);
                if (null != var2) {
                  rv.field_b[28] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,29", -126);
                if (var2 != null) {
                  rv.field_b[29] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,30", -103);
                if (var2 != null) {
                  rv.field_b[30] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,31", param1 - 128);
                if (null != var2) {
                  rv.field_b[31] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,32", param1 - 124);
                if (var2 != null) {
                  rv.field_b[32] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,33", -83);
                if (null != var2) {
                  rv.field_b[33] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,34", param1 ^ -111);
                if (null != var2) {
                  rv.field_b[34] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,35", -88);
                if (null != var2) {
                  rv.field_b[35] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,36", param1 ^ -122);
                if (var2 != null) {
                  rv.field_b[36] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,37", -111);
                if (null != var2) {
                  rv.field_b[37] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,38", param1 ^ -122);
                if (var2 != null) {
                  rv.field_b[38] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,39", -86);
                if (null != var2) {
                  rv.field_b[39] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,40", param1 - 117);
                if (null != var2) {
                  rv.field_b[40] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,41", -80);
                if (null != var2) {
                  rv.field_b[41] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,42", param1 - 106);
                if (var2 != null) {
                  rv.field_b[42] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,43", -126);
                if (var2 != null) {
                  rv.field_b[43] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,44", -103);
                if (null != var2) {
                  rv.field_b[44] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,45", param1 - 111);
                if (null != var2) {
                  rv.field_b[45] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,46", -98);
                if (null != var2) {
                  rv.field_b[46] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,47", -83);
                if (var2 != null) {
                  rv.field_b[47] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,48", -97);
                if (null != var2) {
                  rv.field_b[48] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,49", -101);
                if (var2 != null) {
                  rv.field_b[49] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,50", -96);
                if (var2 != null) {
                  rv.field_b[50] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,51", -100);
                if (var2 != null) {
                  rv.field_b[51] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,52", -89);
                if (var2 != null) {
                  rv.field_b[52] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,53", param1 ^ -110);
                if (null != var2) {
                  rv.field_b[53] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,54", -116);
                if (null != var2) {
                  rv.field_b[54] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,55", param1 ^ -105);
                if (var2 != null) {
                  rv.field_b[55] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,56", -83);
                if (null != var2) {
                  rv.field_b[56] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,57", -93);
                if (null != var2) {
                  rv.field_b[57] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,58", param1 - 103);
                if (var2 != null) {
                  rv.field_b[58] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,59", -83);
                if (null != var2) {
                  rv.field_b[59] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,60", param1 ^ -106);
                if (null != var2) {
                  rv.field_b[60] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,61", param1 ^ -95);
                if (null != var2) {
                  rv.field_b[61] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,62", -118);
                if (null != var2) {
                  rv.field_b[62] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,63", param1 - 89);
                if (null != var2) {
                  rv.field_b[63] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,64", param1 - 129);
                if (null != var2) {
                  rv.field_b[64] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,65", -81);
                if (var2 != null) {
                  rv.field_b[65] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,66", param1 - 84);
                if (null != var2) {
                  rv.field_b[66] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,67", -95);
                if (var2 != null) {
                  rv.field_b[67] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,68", -102);
                if (var2 != null) {
                  rv.field_b[68] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,69", -86);
                if (null != var2) {
                  rv.field_b[69] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,70", param1 ^ -97);
                if (var2 != null) {
                  rv.field_b[70] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,71", -115);
                if (null != var2) {
                  rv.field_b[71] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,72", -128);
                if (null != var2) {
                  rv.field_b[72] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_names,73", -93);
                if (null != var2) {
                  rv.field_b[73] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gameplay,0", -115);
                if (null != var2) {
                  iq.field_a[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gameplay,1", -101);
                if (var2 != null) {
                  iq.field_a[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gameplay,2", -116);
                if (var2 != null) {
                  iq.field_a[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gameplay,3", param1 ^ -113);
                if (null != var2) {
                  iq.field_a[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gameplay,4", -104);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  iq.field_a[4] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gameplay,5", -90);
                if (null != var2) {
                  iq.field_a[5] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gamemode,0", -100);
                if (null != var2) {
                  uv.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gamemode,1", param1 - 87);
                if (null != var2) {
                  uv.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gamemode,2", -90);
                if (var2 != null) {
                  uv.field_d[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_gamemode,3", -88);
                if (var2 != null) {
                  uv.field_d[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_auctions,0", -105);
                if (null != var2) {
                  pt.field_l[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_auctions,1", -88);
                if (var2 != null) {
                  pt.field_l[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_leagues,0", param1 ^ -110);
                if (var2 != null) {
                  ue.field_g[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_headings_leagues,1", -110);
                if (null != var2) {
                  ue.field_g[1] = kt.a(var2, true);
                }
                var2 = ib.a("menu_training", param1 - 129);
                if (var2 != null) {
                  bo.field_zb = kt.a(var2, true);
                }
                var2 = ib.a("menu_multiplayer", -104);
                if (null != var2) {
                  h.field_c = kt.a(var2, true);
                }
                var2 = ib.a("menu_management", -102);
                if (null != var2) {
                  nb.field_h = kt.a(var2, true);
                }
                var2 = ib.a("menu_management_pitch", param1 - 129);
                if (null != var2) {
                  pr.field_b = kt.a(var2, true);
                }
                var2 = ib.a("menu_back", param1 - 95);
                if (null != var2) {
                  at.field_Fb = kt.a(var2, true);
                }
                var2 = ib.a("menu_options", param1 ^ -85);
                if (var2 != null) {
                  ah.field_f = kt.a(var2, true);
                }
                var2 = ib.a("menu_records", -81);
                if (null != var2) {
                  lg.field_c = kt.a(var2, true);
                }
                var2 = ib.a("menu_by_win_percentage", -112);
                if (var2 != null) {
                  wh.field_h = kt.a(var2, true);
                }
                var2 = ib.a("sound", param1 - 116);
                if (var2 != null) {
                  ea.field_b = kt.a(var2, true);
                }
                var2 = ib.a("music", -103);
                if (var2 != null) {
                  kd.field_A = kt.a(var2, true);
                }
                var2 = ib.a("menu_online_auctions", -109);
                if (null != var2) {
                  kj.field_c = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay", -103);
                if (null != var2) {
                  hh.field_a = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode", -95);
                if (var2 != null) {
                  lo.field_m = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions", -127);
                if (var2 != null) {
                  lj.field_m = kt.a(var2, true);
                }
                var2 = ib.a("instructions_leagues", param1 ^ -104);
                if (var2 != null) {
                  di.field_a = kt.a(var2, true);
                }
                var2 = ib.a("formation_left", param1 ^ -115);
                if (var2 != null) {
                  wq.field_f = kt.a(var2, true);
                }
                var2 = ib.a("formation_right", param1 ^ -85);
                if (var2 != null) {
                  ms.field_a = kt.a(var2, true);
                }
                var2 = ib.a("formation_ok", -120);
                if (null != var2) {
                  lk.field_i = kt.a(var2, true);
                }
                var2 = ib.a("MENU_LABELS_AUTO_PASS,0", -108);
                if (null != var2) {
                  lb.field_K[0] = kt.a(var2, true);
                }
                var2 = ib.a("MENU_LABELS_AUTO_PASS,1", -115);
                if (var2 != null) {
                  lb.field_K[1] = kt.a(var2, true);
                }
                var2 = ib.a("MENU_LABELS_QUALITY,0", param1 ^ -95);
                if (null != var2) {
                  qv.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("MENU_LABELS_QUALITY,1", -81);
                if (null != var2) {
                  qv.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("extra_w1", -113);
                if (null != var2) {
                  os.field_d = kt.a(var2, true);
                }
                var2 = ib.a("extra_w2", -84);
                if (null != var2) {
                  ac.field_e = kt.a(var2, true);
                }
                var2 = ib.a("extra_l1", -81);
                if (null != var2) {
                  kw.field_g = kt.a(var2, true);
                }
                var2 = ib.a("extra_l2", -118);
                if (var2 != null) {
                  bb.field_Ib = kt.a(var2, true);
                }
                var2 = ib.a("loading_menu", -121);
                if (var2 != null) {
                  p.field_a = kt.a(var2, true);
                }
                var2 = ib.a("loading_hud", param1 ^ -87);
                if (null != var2) {
                  sm.field_j = kt.a(var2, true);
                }
                var2 = ib.a("loading_lobby", -123);
                if (null != var2) {
                  pn.field_B = kt.a(var2, true);
                }
                var2 = ib.a("loading_park", -80);
                if (null != var2) {
                  pi.field_c = kt.a(var2, true);
                }
                var2 = ib.a("loading_beach", -119);
                if (null != var2) {
                  th.field_b = kt.a(var2, true);
                }
                var2 = ib.a("loading_street", -121);
                if (null != var2) {
                  h.field_d = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,0", -113);
                if (null != var2) {
                  no.field_K[0] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,1", -98);
                if (null != var2) {
                  no.field_K[1] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,2", -95);
                if (var2 != null) {
                  no.field_K[2] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,3", param1 - 111);
                if (var2 != null) {
                  no.field_K[3] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,4", param1 ^ -90);
                if (null != var2) {
                  no.field_K[4] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,5", param1 - 121);
                if (null != var2) {
                  no.field_K[5] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,6", -108);
                if (null != var2) {
                  no.field_K[6] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,7", param1 - 121);
                if (null != var2) {
                  no.field_K[7] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,8", -116);
                if (null != var2) {
                  no.field_K[8] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,9", param1 ^ -113);
                if (null != var2) {
                  no.field_K[9] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,10", param1 ^ -122);
                if (var2 != null) {
                  no.field_K[10] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,11", -85);
                if (var2 != null) {
                  no.field_K[11] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,12", -108);
                if (var2 != null) {
                  no.field_K[12] = kt.a(var2, true);
                }
                var2 = ib.a("unpack_string,13", -82);
                if (var2 != null) {
                  no.field_K[13] = kt.a(var2, true);
                }
                var2 = ib.a("title_team_selection", -87);
                if (null != var2) {
                  gb.field_H = kt.a(var2, true);
                }
                var2 = ib.a("title_formation", -110);
                if (null != var2) {
                  tl.field_b = kt.a(var2, true);
                }
                var2 = ib.a("title_lineup", param1 - 113);
                if (var2 != null) {
                  k.field_h = kt.a(var2, true);
                }
                var2 = ib.a("ready", -95);
                if (var2 != null) {
                  sl.field_Ab = kt.a(var2, true);
                }
                var2 = ib.a("choose_team_instructions1", -94);
                if (null != var2) {
                  kk.field_A = kt.a(var2, true);
                }
                var2 = ib.a("choose_team_instructions2", param1 ^ -89);
                if (var2 != null) {
                  kp.field_a = kt.a(var2, true);
                }
                var2 = ib.a("formation_instructions1", param1 ^ -99);
                if (null != var2) {
                  b.field_J = kt.a(var2, true);
                }
                var2 = ib.a("formation_instructions2", -110);
                if (var2 != null) {
                  fr.field_I = kt.a(var2, true);
                }
                var2 = ib.a("formation_instructions3", -107);
                if (var2 != null) {
                  br.field_b = kt.a(var2, true);
                }
                var2 = ib.a("formation_instructions4", -128);
                if (var2 != null) {
                  cb.field_a = kt.a(var2, true);
                }
                var2 = ib.a("title_finished", -82);
                if (var2 != null) {
                  mu.field_S = kt.a(var2, true);
                }
                var2 = ib.a("title_finished_alt", -120);
                if (var2 != null) {
                  qq.field_J = kt.a(var2, true);
                }
                var2 = ib.a("title_finished2", -93);
                if (var2 != null) {
                  rl.field_u = kt.a(var2, true);
                }
                var2 = ib.a("gameover_won", -96);
                if (null != var2) {
                  lr.field_l = kt.a(var2, true);
                }
                var2 = ib.a("gameover_lost", -95);
                if (null != var2) {
                  of.field_c = kt.a(var2, true);
                }
                var2 = ib.a("gameover_drew", -82);
                if (null != var2) {
                  ve.field_Q = kt.a(var2, true);
                }
                var2 = ib.a("gameover_left", param1 ^ -96);
                if (null != var2) {
                  vc.field_A = kt.a(var2, true);
                }
                var2 = ib.a("gameover_resigned", -87);
                if (null != var2) {
                  ss.field_g = kt.a(var2, true);
                }
                var2 = ib.a("gameover_offer_rematch", -103);
                if (null != var2) {
                  wq.field_e = kt.a(var2, true);
                }
                var2 = ib.a("home", -125);
                if (null != var2) {
                  he.field_Ub = kt.a(var2, true);
                }
                var2 = ib.a("away", -80);
                if (var2 != null) {
                  nu.field_a = kt.a(var2, true);
                }
                var2 = ib.a("auto_assign", -90);
                if (var2 != null) {
                  wh.field_e = kt.a(var2, true);
                }
                var2 = ib.a("camera_unlocked", -89);
                if (null != var2) {
                  vb.field_f = kt.a(var2, true);
                }
                var2 = ib.a("show", -124);
                if (null != var2) {
                  ag.field_l = kt.a(var2, true);
                }
                var2 = ib.a("hide", -108);
                if (var2 != null) {
                  h.field_a = kt.a(var2, true);
                }
                var2 = ib.a("unread", -107);
                if (null != var2) {
                  vi.field_o = kt.a(var2, true);
                }
                var2 = ib.a("left_management_caps", -111);
                if (var2 != null) {
                  he.field_Bb = kt.a(var2, true);
                }
                var2 = ib.a("left_records_caps", -117);
                if (var2 != null) {
                  ah.field_b = kt.a(var2, true);
                }
                var2 = ib.a("left_instructions_caps", -107);
                if (var2 != null) {
                  uq.field_e = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_name,0", -119);
                if (null != var2) {
                  dk.field_h[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_name,1", -98);
                if (var2 != null) {
                  dk.field_h[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_name,2", -87);
                if (null != var2) {
                  dk.field_h[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_name,3", param1 - 123);
                if (null != var2) {
                  dk.field_h[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_name,4", param1 ^ -96);
                if (null != var2) {
                  dk.field_h[4] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_desc,0", -103);
                if (null != var2) {
                  dr.field_c[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_desc,1", -96);
                if (var2 != null) {
                  dr.field_c[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_desc,2", -94);
                if (var2 != null) {
                  dr.field_c[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_desc,3", -125);
                if (var2 != null) {
                  dr.field_c[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_class_desc,4", -123);
                if (var2 != null) {
                  dr.field_c[4] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league_rules2", -122);
                if (null != var2) {
                  ic.field_b = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_labels,0", -122);
                if (var2 != null) {
                  ml.field_t[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_labels,1", -126);
                if (var2 != null) {
                  ml.field_t[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_labels,2", param1 ^ -110);
                if (null != var2) {
                  ml.field_t[2] = kt.a(var2, true);
                }
                var2 = ib.a("park", -92);
                if (var2 != null) {
                  ca.field_a = kt.a(var2, true);
                }
                var2 = ib.a("beach", -101);
                if (var2 != null) {
                  lr.field_j = kt.a(var2, true);
                }
                var2 = ib.a("street", -87);
                if (var2 != null) {
                  tu.field_C = kt.a(var2, true);
                }
                var2 = ib.a("surface,0", -87);
                if (var2 != null) {
                  ej.field_zb[0] = kt.a(var2, true);
                }
                var2 = ib.a("surface,1", param1 - 99);
                if (null != var2) {
                  ej.field_zb[1] = kt.a(var2, true);
                }
                var2 = ib.a("surface,2", param1 ^ -118);
                if (null != var2) {
                  ej.field_zb[2] = kt.a(var2, true);
                }
                var2 = ib.a("kit_style", -121);
                if (var2 != null) {
                  le.field_c = kt.a(var2, true);
                }
                var2 = ib.a("name_has_left_the_game", param1 ^ -98);
                if (null != var2) {
                  mr.field_F = kt.a(var2, true);
                }
                var2 = ib.a("name_has_resigned", param1 ^ -93);
                if (var2 != null) {
                  nn.field_L = kt.a(var2, true);
                }
                var2 = ib.a("name_is_offering_draw", param1 ^ -99);
                if (var2 != null) {
                  wc.field_q = kt.a(var2, true);
                }
                var2 = ib.a("name_has_resigned_and_left", -121);
                if (null != var2) {
                  r.field_e = kt.a(var2, true);
                }
                var2 = ib.a("mouseover_autopass", -81);
                if (var2 != null) {
                  nv.field_G = kt.a(var2, true);
                }
                var2 = ib.a("click_for_help", -117);
                if (var2 != null) {
                  gl.field_i = kt.a(var2, true);
                }
                var2 = ib.a("create_new_auction", param1 - 113);
                if (var2 != null) {
                  ir.field_B = kt.a(var2, true);
                }
                var2 = ib.a("create_new_auction_mouseover", -116);
                if (var2 != null) {
                  bg.field_v = kt.a(var2, true);
                }
                var2 = ib.a("search_for_team", -98);
                if (var2 != null) {
                  ht.field_a = kt.a(var2, true);
                }
                var2 = ib.a("exp_colon_space", param1 ^ -112);
                if (null != var2) {
                  rg.field_d = kt.a(var2, true);
                }
                var2 = ib.a("total_colon_space", -86);
                if (var2 != null) {
                  ss.field_e = kt.a(var2, true);
                }
                var2 = ib.a("click_to_select_stadium", param1 - 98);
                if (var2 != null) {
                  vj.field_e = kt.a(var2, true);
                }
                var2 = ib.a("current_stadium", -118);
                if (var2 != null) {
                  ja.field_I = kt.a(var2, true);
                }
                var2 = ib.a("click_to_select_a_duration", -109);
                if (var2 != null) {
                  kn.field_H = kt.a(var2, true);
                }
                var2 = ib.a("duration_selected", -90);
                if (null != var2) {
                  jh.field_Jb = kt.a(var2, true);
                }
                var2 = ib.a("click_to_buy_stadium_for_X", -108);
                if (var2 != null) {
                  pe.field_a = kt.a(var2, true);
                }
                var2 = ib.a("reserve_at_max", -122);
                if (null != var2) {
                  vf.field_H = kt.a(var2, true);
                }
                var2 = ib.a("reserve_at_min", -82);
                if (var2 != null) {
                  fd.field_j = kt.a(var2, true);
                }
                var2 = ib.a("duration_name,0", -86);
                if (var2 != null) {
                  ni.field_k[0] = kt.a(var2, true);
                }
                var2 = ib.a("duration_name,1", -90);
                if (var2 != null) {
                  ni.field_k[1] = kt.a(var2, true);
                }
                var2 = ib.a("duration_name,2", -116);
                if (var2 != null) {
                  ni.field_k[2] = kt.a(var2, true);
                }
                var2 = ib.a("duration_name,3", param1 - 106);
                if (null != var2) {
                  ni.field_k[3] = kt.a(var2, true);
                }
                var2 = ib.a("duration_name,4", -103);
                if (var2 != null) {
                  ni.field_k[4] = kt.a(var2, true);
                }
                var2 = ib.a("bank", -84);
                if (null != var2) {
                  qn.field_c = kt.a(var2, true);
                }
                var2 = ib.a("minus", param1 ^ -111);
                if (null != var2) {
                  vl.field_b = kt.a(var2, true);
                }
                var2 = ib.a("plus", param1 ^ -116);
                if (null != var2) {
                  ks.field_b = kt.a(var2, true);
                }
                var2 = ib.a("auctions", param1 - 89);
                if (var2 != null) {
                  ar.field_e = kt.a(var2, true);
                }
                var2 = ib.a("league", -107);
                if (var2 != null) {
                  ss.field_f = kt.a(var2, true);
                }
                var2 = ib.a("rankings", param1 - 82);
                if (var2 != null) {
                  fc.field_b = kt.a(var2, true);
                }
                var2 = ib.a("achievements", -103);
                if (null != var2) {
                  tq.field_C = kt.a(var2, true);
                }
                var2 = ib.a("gameplay", -95);
                if (null != var2) {
                  wd.field_g = kt.a(var2, true);
                }
                var2 = ib.a("gamemodes", -86);
                if (var2 != null) {
                  np.field_Gb = kt.a(var2, true);
                }
                var2 = ib.a("league_points_colon", -108);
                if (null != var2) {
                  bt.field_c = kt.a(var2, true);
                }
                var2 = ib.a("money_colon", param1 ^ -120);
                if (null != var2) {
                  pj.field_D = kt.a(var2, true);
                }
                var2 = ib.a("unrated_game_no_rewards", -80);
                if (null != var2) {
                  mc.field_b = kt.a(var2, true);
                }
                var2 = ib.a("players_earn_25_less_exp", -87);
                if (null != var2) {
                  vk.field_a = kt.a(var2, true);
                }
                var2 = ib.a("you_have_played_X_in_past_hour", -87);
                if (null != var2) {
                  oe.field_m = kt.a(var2, true);
                }
                var2 = ib.a("quickplay_no_reward", -108);
                if (var2 != null) {
                  je.field_p = kt.a(var2, true);
                }
                var2 = ib.a("quickplay_only_money", -105);
                if (var2 != null) {
                  jg.field_I = kt.a(var2, true);
                }
                var2 = ib.a("you_have_X_credits", -122);
                if (null != var2) {
                  oj.field_Z = kt.a(var2, true);
                }
                var2 = ib.a("you_have_earned_X_credits", -113);
                if (null != var2) {
                  ni.field_h = kt.a(var2, true);
                }
                var2 = ib.a("you_have_spent_X_credits", -105);
                if (null != var2) {
                  lc.field_b = kt.a(var2, true);
                }
                var2 = ib.a("leaving_you_with_X_credits", -127);
                if (null != var2) {
                  hg.field_F = kt.a(var2, true);
                }
                var2 = ib.a("bid", -127);
                if (null != var2) {
                  he.field_Eb = kt.a(var2, true);
                }
                var2 = ib.a("buyout", -83);
                if (null != var2) {
                  jc.field_k = kt.a(var2, true);
                }
                var2 = ib.a("no_auctions", -101);
                if (var2 != null) {
                  aa.field_h = kt.a(var2, true);
                }
                var2 = ib.a("search_no_auctions", -111);
                if (null != var2) {
                  bh.field_t = kt.a(var2, true);
                }
                var2 = ib.a("pending", -108);
                if (var2 != null) {
                  ri.field_s = kt.a(var2, true);
                }
                var2 = ib.a("reserve", param1 - 93);
                if (null != var2) {
                  gl.field_f = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,0", -95);
                if (var2 != null) {
                  gd.field_e[0] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,1", -110);
                if (null != var2) {
                  gd.field_e[1] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,2", -119);
                if (var2 != null) {
                  gd.field_e[2] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,3", -121);
                if (var2 != null) {
                  gd.field_e[3] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,4", -114);
                if (null != var2) {
                  gd.field_e[4] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,5", -121);
                if (var2 != null) {
                  gd.field_e[5] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,6", -85);
                if (var2 != null) {
                  gd.field_e[6] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,7", -103);
                if (null != var2) {
                  gd.field_e[7] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,8", -109);
                if (null != var2) {
                  gd.field_e[8] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,9", -119);
                if (var2 != null) {
                  gd.field_e[9] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,10", param1 ^ -121);
                if (null != var2) {
                  gd.field_e[10] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,11", param1 ^ -90);
                if (null != var2) {
                  gd.field_e[11] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,12", param1 ^ -118);
                if (var2 != null) {
                  gd.field_e[12] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,13", -125);
                if (var2 != null) {
                  gd.field_e[13] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,14", -94);
                if (null != var2) {
                  gd.field_e[14] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,15", param1 ^ -100);
                if (null != var2) {
                  gd.field_e[15] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,16", -127);
                if (null != var2) {
                  gd.field_e[16] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,17", -116);
                if (null != var2) {
                  gd.field_e[17] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,18", -118);
                if (null != var2) {
                  gd.field_e[18] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,19", param1 - 99);
                if (var2 != null) {
                  gd.field_e[19] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,20", -80);
                if (var2 != null) {
                  gd.field_e[20] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,21", param1 - 99);
                if (null != var2) {
                  gd.field_e[21] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,22", -121);
                if (var2 != null) {
                  gd.field_e[22] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,23", -124);
                if (null != var2) {
                  gd.field_e[23] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,24", param1 - 108);
                if (var2 != null) {
                  gd.field_e[24] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,25", -112);
                if (null != var2) {
                  gd.field_e[25] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,26", -117);
                if (null != var2) {
                  gd.field_e[26] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,27", -115);
                if (var2 != null) {
                  gd.field_e[27] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,28", -103);
                if (null != var2) {
                  gd.field_e[28] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,29", -88);
                if (var2 != null) {
                  gd.field_e[29] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,30", param1 - 97);
                if (null != var2) {
                  gd.field_e[30] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,31", -113);
                if (var2 != null) {
                  gd.field_e[31] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,32", -94);
                if (null != var2) {
                  gd.field_e[32] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,33", -128);
                if (var2 != null) {
                  gd.field_e[33] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,34", -119);
                if (null != var2) {
                  gd.field_e[34] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,35", -127);
                if (var2 != null) {
                  gd.field_e[35] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,36", -115);
                if (null != var2) {
                  gd.field_e[36] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,37", -94);
                if (null != var2) {
                  gd.field_e[37] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,38", -86);
                if (null != var2) {
                  gd.field_e[38] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,39", param1 ^ -92);
                if (var2 != null) {
                  gd.field_e[39] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,40", param1 - 88);
                if (null != var2) {
                  gd.field_e[40] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,41", -105);
                if (var2 != null) {
                  gd.field_e[41] = kt.a(var2, true);
                }
                var2 = ib.a("popup_text,42", -91);
                if (var2 != null) {
                  gd.field_e[42] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,0", -109);
                if (var2 != null) {
                  pb.field_G[0] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,1", -116);
                if (null != var2) {
                  pb.field_G[1] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,2", -96);
                if (var2 != null) {
                  pb.field_G[2] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,3", -111);
                if (var2 != null) {
                  pb.field_G[3] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,4", -96);
                if (null != var2) {
                  pb.field_G[4] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,5", -80);
                if (null != var2) {
                  pb.field_G[5] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,6", -106);
                if (var2 != null) {
                  pb.field_G[6] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,7", -104);
                if (null != var2) {
                  pb.field_G[7] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,8", -127);
                if (null != var2) {
                  pb.field_G[8] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,9", -95);
                if (null != var2) {
                  pb.field_G[9] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,10", -84);
                if (null != var2) {
                  pb.field_G[10] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,11", param1 - 122);
                if (null != var2) {
                  pb.field_G[11] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,12", param1 - 124);
                if (var2 != null) {
                  pb.field_G[12] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,13", -106);
                if (var2 != null) {
                  pb.field_G[13] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,14", param1 ^ -101);
                if (null != var2) {
                  pb.field_G[14] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,15", -127);
                if (null != var2) {
                  pb.field_G[15] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,16", -92);
                if (null != var2) {
                  pb.field_G[16] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,17", -111);
                if (null != var2) {
                  pb.field_G[17] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,18", -103);
                if (null != var2) {
                  pb.field_G[18] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,19", param1 - 100);
                if (null != var2) {
                  pb.field_G[19] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,20", param1 ^ -87);
                if (var2 != null) {
                  pb.field_G[20] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,21", param1 - 88);
                if (null != var2) {
                  pb.field_G[21] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,22", -80);
                if (var2 != null) {
                  pb.field_G[22] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,23", -107);
                if (var2 != null) {
                  pb.field_G[23] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,24", -128);
                if (var2 != null) {
                  pb.field_G[24] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,25", param1 - 113);
                if (var2 != null) {
                  pb.field_G[25] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,26", -103);
                if (var2 != null) {
                  pb.field_G[26] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,27", -112);
                if (var2 != null) {
                  pb.field_G[27] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,28", -90);
                if (var2 != null) {
                  pb.field_G[28] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,29", -112);
                if (null != var2) {
                  pb.field_G[29] = kt.a(var2, true);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = ib.a("popup_header,30", -121);
                if (null != var2) {
                  pb.field_G[30] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,31", param1 - 84);
                if (null != var2) {
                  pb.field_G[31] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,32", -99);
                if (null != var2) {
                  pb.field_G[32] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,33", -128);
                if (null != var2) {
                  pb.field_G[33] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,34", -117);
                if (var2 != null) {
                  pb.field_G[34] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,35", -114);
                if (var2 != null) {
                  pb.field_G[35] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,36", -80);
                if (null != var2) {
                  pb.field_G[36] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,37", -117);
                if (null != var2) {
                  pb.field_G[37] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,38", -81);
                if (null != var2) {
                  pb.field_G[38] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,39", -95);
                if (var2 != null) {
                  pb.field_G[39] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,40", -111);
                if (null != var2) {
                  pb.field_G[40] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,41", param1 ^ -82);
                if (null != var2) {
                  pb.field_G[41] = kt.a(var2, true);
                }
                var2 = ib.a("popup_header,42", -114);
                if (null != var2) {
                  pb.field_G[42] = kt.a(var2, true);
                }
                var2 = ib.a("duration", -115);
                if (var2 != null) {
                  Kickabout.field_F = kt.a(var2, true);
                }
                var2 = ib.a("you_were_outbidded", -103);
                if (null != var2) {
                  fi.field_b = kt.a(var2, true);
                }
                var2 = ib.a("auction_unsuccessful", -120);
                if (null != var2) {
                  rp.field_C = kt.a(var2, true);
                }
                var2 = ib.a("auction_won", -108);
                if (var2 != null) {
                  lk.field_e = kt.a(var2, true);
                }
                var2 = ib.a("which_trinket", -92);
                if (null != var2) {
                  jw.field_Bb = kt.a(var2, true);
                }
                var2 = ib.a("no_gold_league_winner_justplaymode", -95);
                if (var2 != null) {
                  qh.field_g = kt.a(var2, true);
                }
                var2 = ib.a("training_mouseover_text,0", -105);
                if (null != var2) {
                  wo.field_j[0] = kt.a(var2, true);
                }
                var2 = ib.a("training_mouseover_text,1", param1 - 111);
                if (null != var2) {
                  wo.field_j[1] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,0,0", -91);
                if (null != var2) {
                  h.field_b[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,0,1", -93);
                if (null != var2) {
                  h.field_b[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,0,2", -112);
                if (null != var2) {
                  h.field_b[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,0,3", param1 - 124);
                if (var2 != null) {
                  h.field_b[0][3] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,1,0", param1 ^ -116);
                if (null != var2) {
                  h.field_b[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,1,1", -84);
                if (null != var2) {
                  h.field_b[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,1,2", -84);
                if (var2 != null) {
                  h.field_b[1][2] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,1,3", param1 - 116);
                if (null != var2) {
                  h.field_b[1][3] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,2,0", -101);
                if (null != var2) {
                  h.field_b[2][0] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,2,1", -95);
                if (null != var2) {
                  h.field_b[2][1] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,2,2", param1 - 126);
                if (null != var2) {
                  h.field_b[2][2] = kt.a(var2, true);
                }
                var2 = ib.a("pitch_name,2,3", -108);
                if (var2 != null) {
                  h.field_b[2][3] = kt.a(var2, true);
                }
                var2 = ib.a("player_shop", param1 ^ -90);
                if (null != var2) {
                  us.field_g = kt.a(var2, true);
                }
                var2 = ib.a("loading_pitch", -81);
                if (var2 != null) {
                  mc.field_e = kt.a(var2, true);
                }
                var2 = ib.a("amateur_teams", -115);
                if (null != var2) {
                  lh.field_C = kt.a(var2, true);
                }
                var2 = ib.a("no_one_in_league", -96);
                if (null != var2) {
                  lo.field_k = kt.a(var2, true);
                }
                var2 = ib.a("click_to_view_league_X", -94);
                if (null != var2) {
                  fu.field_f = kt.a(var2, true);
                }
                var2 = ib.a("leagues,0", -90);
                if (null != var2) {
                  q.field_h[0] = kt.a(var2, true);
                }
                var2 = ib.a("leagues,1", param1 ^ -105);
                if (null != var2) {
                  q.field_h[1] = kt.a(var2, true);
                }
                var2 = ib.a("leagues,2", -122);
                if (null != var2) {
                  q.field_h[2] = kt.a(var2, true);
                }
                var2 = ib.a("leagues,3", param1 ^ -116);
                if (null != var2) {
                  q.field_h[3] = kt.a(var2, true);
                }
                var2 = ib.a("leagues,4", -120);
                if (var2 != null) {
                  q.field_h[4] = kt.a(var2, true);
                }
                var2 = ib.a("leagues,5", param1 - 83);
                if (var2 != null) {
                  q.field_h[5] = kt.a(var2, true);
                }
                var2 = ib.a("leagues,6", -111);
                if (null != var2) {
                  q.field_h[6] = kt.a(var2, true);
                }
                var2 = ib.a("stadium_locked_first_buy_X", -125);
                if (null != var2) {
                  li.field_e = kt.a(var2, true);
                }
                var2 = ib.a("reserve_is_buyout", -104);
                if (null != var2) {
                  field_a = kt.a(var2, true);
                }
                var2 = ib.a("buyout_is_reserve", -122);
                if (var2 != null) {
                  sd.field_e = kt.a(var2, true);
                }
                var2 = ib.a("buyout_at_max", -99);
                if (var2 != null) {
                  hm.field_E = kt.a(var2, true);
                }
                var2 = ib.a("buyout_at_min", -82);
                if (var2 != null) {
                  bn.field_C = kt.a(var2, true);
                }
                var2 = ib.a("my_kit", -103);
                if (null != var2) {
                  ii.field_h = kt.a(var2, true);
                }
                var2 = ib.a("my_squad", -105);
                if (null != var2) {
                  oc.field_b = kt.a(var2, true);
                }
                var2 = ib.a("palette_title,0", -102);
                if (var2 != null) {
                  dh.field_j[0] = kt.a(var2, true);
                }
                var2 = ib.a("palette_title,1", -101);
                if (null != var2) {
                  dh.field_j[1] = kt.a(var2, true);
                }
                var2 = ib.a("game_ended_early", param1 - 96);
                if (null != var2) {
                  pe.field_c = kt.a(var2, true);
                }
                var2 = ib.a("team_results", param1 - 89);
                if (var2 != null) {
                  oh.field_g = kt.a(var2, true);
                }
                var2 = ib.a("my_results", -87);
                if (null != var2) {
                  ni.field_e = kt.a(var2, true);
                }
                var2 = ib.a("click_my_results", -121);
                if (null != var2) {
                  ar.field_d = kt.a(var2, true);
                }
                var2 = ib.a("click_my_results_shorter", -119);
                if (var2 != null) {
                  tq.field_E = kt.a(var2, true);
                }
                var2 = ib.a("click_team_results", -115);
                if (null != var2) {
                  gn.field_c = kt.a(var2, true);
                }
                var2 = ib.a("statname,0", -112);
                if (var2 != null) {
                  nn.field_G[0] = kt.a(var2, true);
                }
                var2 = ib.a("statname,1", -80);
                if (var2 != null) {
                  nn.field_G[1] = kt.a(var2, true);
                }
                var2 = ib.a("statname,2", -90);
                if (null != var2) {
                  nn.field_G[2] = kt.a(var2, true);
                }
                var2 = ib.a("statname,3", -95);
                if (var2 != null) {
                  nn.field_G[3] = kt.a(var2, true);
                }
                var2 = ib.a("spend", -90);
                if (var2 != null) {
                  so.field_a = kt.a(var2, true);
                }
                var2 = ib.a("buy", -88);
                if (null != var2) {
                  mc.field_f = kt.a(var2, true);
                }
                var2 = ib.a("filter", -104);
                if (var2 != null) {
                  vq.field_e = kt.a(var2, true);
                }
                var2 = ib.a("increase_stat", param1 - 114);
                if (var2 != null) {
                  ov.field_c = kt.a(var2, true);
                }
                var2 = ib.a("replace", param1 ^ -87);
                if (null != var2) {
                  cj.field_E = kt.a(var2, true);
                }
                var2 = ib.a("sell", -116);
                if (var2 != null) {
                  ja.field_M = kt.a(var2, true);
                }
                var2 = ib.a("profile", -107);
                if (null != var2) {
                  tr.field_g = kt.a(var2, true);
                }
                var2 = ib.a("stats", -119);
                if (null != var2) {
                  q.field_f = kt.a(var2, true);
                }
                var2 = ib.a("experience", -123);
                if (null != var2) {
                  fi.field_d = kt.a(var2, true);
                }
                var2 = ib.a("auction_info", -121);
                if (var2 != null) {
                  ca.field_d = kt.a(var2, true);
                }
                var2 = ib.a("trinkets", -94);
                if (var2 != null) {
                  mp.field_k = kt.a(var2, true);
                }
                var2 = ib.a("name_colon_space", -109);
                if (null != var2) {
                  b.field_O = kt.a(var2, true);
                }
                var2 = ib.a("class_colon_space", -106);
                if (var2 != null) {
                  hg.field_H = kt.a(var2, true);
                }
                var2 = ib.a("player_cant_levelup_auction", -126);
                if (var2 != null) {
                  nq.field_H = kt.a(var2, true);
                }
                var2 = ib.a("player_cant_levelup", -93);
                if (var2 != null) {
                  qr.field_a = kt.a(var2, true);
                }
                var2 = ib.a("cant_use_trinkets_in_auction", -84);
                if (null != var2) {
                  dt.field_e = kt.a(var2, true);
                }
                var2 = ib.a("player_not_inauction", -110);
                if (null != var2) {
                  na.field_Eb = kt.a(var2, true);
                }
                var2 = ib.a("you_are_winning", -103);
                if (var2 != null) {
                  kq.field_Bb = kt.a(var2, true);
                }
                var2 = ib.a("your_auction", param1 - 101);
                if (null != var2) {
                  bs.field_b = kt.a(var2, true);
                }
                var2 = ib.a("no_trinkets", -80);
                if (var2 != null) {
                  io.field_o = kt.a(var2, true);
                }
                var2 = ib.a("must_be_member_for_trinkets", -86);
                if (var2 != null) {
                  wf.field_M = kt.a(var2, true);
                }
                var2 = ib.a("click_player_to_view", -106);
                if (null != var2) {
                  gu.field_Db = kt.a(var2, true);
                }
                var2 = ib.a("none", param1 - 88);
                if (null != var2) {
                  hi.field_w = kt.a(var2, true);
                }
                var2 = ib.a("refresh", -83);
                if (var2 != null) {
                  vd.field_b = kt.a(var2, true);
                }
                var2 = ib.a("filter_auctions", -119);
                if (null != var2) {
                  bi.field_a = kt.a(var2, true);
                }
                var2 = ib.a("kit_lock_achievement1", -122);
                if (var2 != null) {
                  ob.field_R = kt.a(var2, true);
                }
                var2 = ib.a("kit_lock_achievement2", -127);
                if (var2 != null) {
                  qe.field_f = kt.a(var2, true);
                }
                var2 = ib.a("kit_lock_achievement3", -94);
                if (var2 != null) {
                  ja.field_W = kt.a(var2, true);
                }
                var2 = ib.a("kit_lock_coin1", -105);
                if (var2 != null) {
                  mc.field_l = kt.a(var2, true);
                }
                var2 = ib.a("kit_lock_coin2", -113);
                if (null != var2) {
                  bk.field_h = kt.a(var2, true);
                }
                var2 = ib.a("sell_price", param1 ^ -83);
                if (null != var2) {
                  ti.field_g = kt.a(var2, true);
                }
                var2 = ib.a("select_your_pitch", -105);
                if (null != var2) {
                  e.field_o = kt.a(var2, true);
                }
                var2 = ib.a("menu_online_leagues", param1 ^ -97);
                if (null != var2) {
                  tk.field_Bb = kt.a(var2, true);
                }
                var2 = ib.a("search_for_user", param1 - 125);
                if (null != var2) {
                  bi.field_e = kt.a(var2, true);
                }
                var2 = ib.a("sell_player", -125);
                if (var2 != null) {
                  da.field_i = kt.a(var2, true);
                }
                var2 = ib.a("click_player_in_squad", -80);
                if (null != var2) {
                  pn.field_A = kt.a(var2, true);
                }
                var2 = ib.a("new_entry", -116);
                if (null != var2) {
                  eq.field_b = kt.a(var2, true);
                }
                var2 = ib.a("management_mouseover_kit", -128);
                if (null != var2) {
                  iq.field_b = kt.a(var2, true);
                }
                var2 = ib.a("management_mouseover_squad", -126);
                if (var2 != null) {
                  ep.field_a = kt.a(var2, true);
                }
                var2 = ib.a("management_mouseover_pitch", -92);
                if (var2 != null) {
                  rd.field_b = kt.a(var2, true);
                }
                var2 = ib.a("management_mouseover_shop", -124);
                if (var2 != null) {
                  nd.field_a = kt.a(var2, true);
                }
                var2 = ib.a("management_mouseover_auctions", -83);
                if (var2 != null) {
                  pn.field_C = kt.a(var2, true);
                }
                var2 = ib.a("management_squad_in_auction", param1 - 105);
                if (var2 != null) {
                  mp.field_l = kt.a(var2, true);
                }
                var2 = ib.a("auction_lost", -120);
                if (var2 != null) {
                  bd.field_B = kt.a(var2, true);
                }
                var2 = ib.a("trinket_shape,0", -82);
                if (null != var2) {
                  wq.field_a[0] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_shape,1", param1 - 94);
                if (null != var2) {
                  wq.field_a[1] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_shape,2", param1 - 97);
                if (var2 != null) {
                  wq.field_a[2] = kt.a(var2, true);
                }
                var2 = ib.a("trinket_shape,3", -96);
                if (null != var2) {
                  wq.field_a[3] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,0", -92);
                if (var2 != null) {
                  gr.field_l[0] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,1", -108);
                if (null != var2) {
                  gr.field_l[1] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,2", -99);
                if (null != var2) {
                  gr.field_l[2] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,3", -111);
                if (null != var2) {
                  gr.field_l[3] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,4", -105);
                if (null != var2) {
                  gr.field_l[4] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,5", -107);
                if (null != var2) {
                  gr.field_l[5] = kt.a(var2, true);
                }
                var2 = ib.a("auction_column_headers,6", -110);
                if (null != var2) {
                  gr.field_l[6] = kt.a(var2, true);
                }
                var2 = ib.a("shop_column_headers,0", param1 - 109);
                if (var2 != null) {
                  sf.field_D[0] = kt.a(var2, true);
                }
                var2 = ib.a("shop_column_headers,1", param1 - 115);
                if (var2 != null) {
                  sf.field_D[1] = kt.a(var2, true);
                }
                var2 = ib.a("shop_column_headers,2", -124);
                if (var2 != null) {
                  sf.field_D[2] = kt.a(var2, true);
                }
                var2 = ib.a("shop_column_headers,3", -108);
                if (var2 != null) {
                  sf.field_D[3] = kt.a(var2, true);
                }
                var2 = ib.a("shop_column_headers,4", param1 - 96);
                if (var2 != null) {
                  sf.field_D[4] = kt.a(var2, true);
                }
                var2 = ib.a("slot_type", -94);
                if (var2 != null) {
                  kd.field_u = kt.a(var2, true);
                }
                var2 = ib.a("no_buyout", -113);
                if (var2 != null) {
                  im.field_zb = kt.a(var2, true);
                }
                var2 = ib.a("selling", param1 - 84);
                if (var2 != null) {
                  bk.field_g = kt.a(var2, true);
                }
                var2 = ib.a("winning", param1 - 82);
                if (var2 != null) {
                  tf.field_b = kt.a(var2, true);
                }
                var2 = ib.a("outbidded", param1 ^ -119);
                if (null != var2) {
                  fb.field_O = kt.a(var2, true);
                }
                var2 = ib.a("your_auctions", -95);
                if (null != var2) {
                  nc.field_b = kt.a(var2, true);
                }
                var2 = ib.a("all_auctions", -96);
                if (var2 != null) {
                  ko.field_k = kt.a(var2, true);
                }
                var2 = ib.a("click_turn_off_buyout", -111);
                if (null != var2) {
                  pa.field_i = kt.a(var2, true);
                }
                var2 = ib.a("click_turn_on_buyout", param1 - 109);
                if (var2 != null) {
                  hh.field_c = kt.a(var2, true);
                }
                var2 = ib.a("click_to_increase_reserve", -108);
                if (var2 != null) {
                  ij.field_q = kt.a(var2, true);
                }
                var2 = ib.a("click_to_decrease_reserve", -109);
                if (null != var2) {
                  np.field_Ib = kt.a(var2, true);
                }
                var2 = ib.a("click_to_increase_buyout", param1 - 89);
                if (null != var2) {
                  nw.field_c = kt.a(var2, true);
                }
                var2 = ib.a("click_to_decrease_buyout", param1 - 90);
                if (var2 != null) {
                  up.field_d = kt.a(var2, true);
                }
                var2 = ib.a("player_already_in_auction", param1 - 92);
                if (var2 != null) {
                  iw.field_j = kt.a(var2, true);
                }
                var2 = ib.a("increase_stat_max_symbol", -120);
                if (var2 != null) {
                  ne.field_L = kt.a(var2, true);
                }
                var2 = ib.a("management_squad_auctiondata_left,0", -84);
                if (var2 != null) {
                  fk.field_j[0] = kt.a(var2, true);
                }
                var2 = ib.a("management_squad_auctiondata_left,1", -118);
                if (var2 != null) {
                  fk.field_j[1] = kt.a(var2, true);
                }
                var2 = ib.a("management_squad_auctiondata_left,2", param1 ^ -125);
                if (var2 != null) {
                  fk.field_j[2] = kt.a(var2, true);
                }
                var2 = ib.a("management_auctions_no_bids", -118);
                if (null != var2) {
                  gd.field_d = kt.a(var2, true);
                }
                var2 = ib.a("management_auctions_no_buyout", param1 ^ -127);
                if (null != var2) {
                  sp.field_Rb = kt.a(var2, true);
                }
                var2 = ib.a("pitch_cost", param1 - 86);
                if (var2 != null) {
                  fv.field_c = kt.a(var2, true);
                }
                var2 = ib.a("pitch_advice", -119);
                if (null != var2) {
                  we.field_d = kt.a(var2, true);
                }
                var2 = ib.a("mouseover_cant_afford_pitch", -125);
                if (null != var2) {
                  tt.field_d = kt.a(var2, true);
                }
                var2 = ib.a("mouseover_kit_reason1", param1 ^ -116);
                if (null != var2) {
                  el.field_G = kt.a(var2, true);
                }
                var2 = ib.a("mouseover_kit_reason2", -124);
                if (null != var2) {
                  ai.field_C = kt.a(var2, true);
                }
                var2 = ib.a("training_escape", -117);
                if (null != var2) {
                  de.field_a = kt.a(var2, true);
                }
                var2 = ib.a("space_name", -106);
                if (null != var2) {
                  oo.field_a = kt.a(var2, true);
                }
                var2 = ib.a("players_stats_at_max", -120);
                if (var2 != null) {
                  hv.field_b = kt.a(var2, true);
                }
                var2 = ib.a("player_maxed_no_exp", param1 - 81);
                if (null != var2) {
                  ae.field_M = kt.a(var2, true);
                }
                var2 = ib.a("no_user_found", -127);
                if (null != var2) {
                  qh.field_e = kt.a(var2, true);
                }
                var2 = ib.a("auction_successful", -95);
                if (null != var2) {
                  po.field_g = kt.a(var2, true);
                }
                var2 = ib.a("instructions_mouseover_a_player", -124);
                if (null != var2) {
                  bg.field_q = kt.a(var2, true);
                }
                var2 = ib.a("insufficient_funds", -85);
                if (null != var2) {
                  ef.field_n = kt.a(var2, true);
                }
                var2 = ib.a("default_player_name", -100);
                if (var2 != null) {
                  gw.field_b = kt.a(var2, true);
                }
                var2 = ib.a("default_opponent_name", param1 - 82);
                if (var2 != null) {
                  rp.field_D = kt.a(var2, true);
                }
                var2 = ib.a("no_worthless_auctions", -94);
                if (null != var2) {
                  la.field_f = kt.a(var2, true);
                }
                var2 = ib.a("lineup_two_players", param1 ^ -84);
                if (null != var2) {
                  ss.field_i = kt.a(var2, true);
                }
                var2 = ib.a("lineup_one_player", -116);
                if (null != var2) {
                  sm.field_p = kt.a(var2, true);
                }
                var2 = ib.a("lineup_four_players", -80);
                if (var2 != null) {
                  ni.field_q = kt.a(var2, true);
                }
                var2 = ib.a("lineup_spectating", -103);
                if (var2 != null) {
                  ig.field_j = kt.a(var2, true);
                }
                var2 = ib.a("dialog_hidden_ach", param1 ^ -109);
                if (var2 != null) {
                  vu.field_Gb = kt.a(var2, true);
                }
                var2 = ib.a("waiting_for_gamestate", param1 ^ -85);
                if (null != var2) {
                  bm.field_K = kt.a(var2, true);
                }
                var2 = ib.a("keyname_ctrl", -126);
                if (var2 != null) {
                  tn.field_c = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay1", param1 ^ -126);
                if (null != var2) {
                  jr.field_Fb = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay2,0", -112);
                if (null != var2) {
                  sa.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay2,1", -107);
                if (null != var2) {
                  sa.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay3,0", -106);
                if (var2 != null) {
                  cu.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay3,1", -125);
                if (null != var2) {
                  cu.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay4,0", -118);
                if (var2 != null) {
                  sa.field_c[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay4,1", -80);
                if (var2 != null) {
                  sa.field_c[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay5", -108);
                if (var2 != null) {
                  gd.field_g = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay6,0", -121);
                if (null != var2) {
                  qq.field_L[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay6,1", -83);
                if (var2 != null) {
                  qq.field_L[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay7,0,0", -89);
                if (var2 != null) {
                  u.field_e[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay7,0,1", -97);
                if (null != var2) {
                  u.field_e[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay7,1,0", -110);
                if (null != var2) {
                  u.field_e[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay7,1,1", param1 - 90);
                if (var2 != null) {
                  u.field_e[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay8", param1 ^ -118);
                if (null != var2) {
                  gf.field_d = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,0", param1 ^ -127);
                if (var2 != null) {
                  s.field_M[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,1", -115);
                if (null != var2) {
                  s.field_M[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,2", param1 - 119);
                if (null != var2) {
                  s.field_M[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,3", -125);
                if (null != var2) {
                  s.field_M[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,4", param1 - 81);
                if (var2 != null) {
                  s.field_M[4] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,5", -122);
                if (null != var2) {
                  s.field_M[5] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay9,6", -90);
                if (null != var2) {
                  s.field_M[6] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay10", -117);
                if (null != var2) {
                  sh.field_e = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay11,0", -124);
                if (null != var2) {
                  bl.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay11,1", param1 ^ -94);
                if (null != var2) {
                  bl.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay11,2", -112);
                if (var2 != null) {
                  bl.field_d[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay11,3", -84);
                if (null != var2) {
                  bl.field_d[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay12,0", -115);
                if (var2 != null) {
                  ng.field_k[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay12,1", -100);
                if (null != var2) {
                  ng.field_k[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay12,2", -112);
                if (null != var2) {
                  ng.field_k[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay12,3", param1 ^ -103);
                if (var2 != null) {
                  ng.field_k[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay13", param1 ^ -91);
                if (null != var2) {
                  vc.field_H = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay14,0", param1 ^ -98);
                if (null != var2) {
                  gf.field_e[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay14,1", -98);
                if (var2 != null) {
                  gf.field_e[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay15,0,0", param1 ^ -101);
                if (var2 != null) {
                  hv.field_c[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay15,0,1", -104);
                if (null != var2) {
                  hv.field_c[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay15,0,2", -83);
                if (null != var2) {
                  hv.field_c[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay15,1,0", param1 - 98);
                if (null != var2) {
                  hv.field_c[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay15,1,1", -96);
                if (null != var2) {
                  hv.field_c[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gameplay15,1,2", -98);
                if (var2 != null) {
                  hv.field_c[1][2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_leagues1", param1 ^ -84);
                if (null != var2) {
                  cd.field_b = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_header", -107);
                if (var2 != null) {
                  wa.field_b = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_details,0", -106);
                if (var2 != null) {
                  jq.field_a[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_details,1", -96);
                if (null != var2) {
                  jq.field_a[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_details,2", param1 ^ -113);
                if (var2 != null) {
                  jq.field_a[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions1_subheader", -125);
                if (null != var2) {
                  c.field_h = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions3,0,0", -103);
                if (null != var2) {
                  tj.field_w[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions3,0,1", -105);
                if (null != var2) {
                  tj.field_w[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions3,0,2", -87);
                if (null != var2) {
                  tj.field_w[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions3,0,3", -99);
                if (var2 != null) {
                  tj.field_w[0][3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions3,1,0", -108);
                if (null != var2) {
                  tj.field_w[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_auctions3,1,1", -117);
                if (var2 != null) {
                  tj.field_w[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,0,0", param1 ^ -113);
                if (null != var2) {
                  va.field_y[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,0,1", -114);
                if (null != var2) {
                  va.field_y[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,0,2", param1 ^ -103);
            }
            void runChunk4() throws java.lang.RuntimeException {
                if (var2 != null) {
                  va.field_y[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,0,3", param1 ^ -120);
                if (null != var2) {
                  va.field_y[0][3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,1,0", -108);
                if (null != var2) {
                  va.field_y[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,1,1", param1 ^ -87);
                if (null != var2) {
                  va.field_y[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,1,2", -96);
                if (var2 != null) {
                  va.field_y[1][2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes3,1,3", -122);
                if (var2 != null) {
                  va.field_y[1][3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league_diamond_division,0", -86);
                if (var2 != null) {
                  tm.field_q[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league_diamond_division,1", -102);
                if (null != var2) {
                  tm.field_q[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league_diamond_division,2", param1 ^ -113);
                if (null != var2) {
                  tm.field_q[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league_diamond_division,3", -85);
                if (null != var2) {
                  tm.field_q[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league_diamond_division,4", -124);
                if (null != var2) {
                  tm.field_q[4] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league2,0", param1 - 90);
                if (var2 != null) {
                  ns.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league2,1", -85);
                if (null != var2) {
                  ns.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league2,2", param1 - 122);
                if (var2 != null) {
                  ns.field_d[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league2,3", -118);
                if (var2 != null) {
                  ns.field_d[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_league2,4", -116);
                if (var2 != null) {
                  ns.field_d[4] = kt.a(var2, true);
                }
                var2 = ib.a("tutorial_controls,0", -98);
                if (var2 != null) {
                  ao.field_f[0] = kt.a(var2, true);
                }
                var2 = ib.a("tutorial_controls,1", -91);
                if (null != var2) {
                  ao.field_f[1] = kt.a(var2, true);
                }
                var2 = ib.a("done", -119);
                if (var2 != null) {
                  kt.a(var2, true);
                }
                var2 = ib.a("move", -83);
                if (var2 != null) {
                  tj.field_g = kt.a(var2, true);
                }
                var2 = ib.a("sprint", -104);
                if (var2 != null) {
                  nr.field_k = kt.a(var2, true);
                }
                var2 = ib.a("create_new_game", -99);
                if (var2 != null) {
                  ig.field_k = kt.a(var2, true);
                }
                var2 = ib.a("instructions_pageup_pagedown,0", -125);
                if (null != var2) {
                  ip.field_d[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_pageup_pagedown,1", -127);
                if (null != var2) {
                  ip.field_d[1] = kt.a(var2, true);
                }
                var2 = ib.a("MENU_LABELS_LOCK_MOUSE,0", -87);
                if (null != var2) {
                  ai.field_K[0] = kt.a(var2, true);
                }
                var2 = ib.a("MENU_LABELS_LOCK_MOUSE,1", -99);
                if (var2 != null) {
                  ai.field_K[1] = kt.a(var2, true);
                }
                var2 = ib.a("trap_mouse_disabled", -121);
                if (null != var2) {
                  aw.field_K = kt.a(var2, true);
                }
                var2 = ib.a("mouseover_lockmouse", -108);
                if (null != var2) {
                  vs.field_l = kt.a(var2, true);
                }
                var2 = ib.a("search", param1 ^ -86);
                if (null != var2) {
                  ic.field_j = kt.a(var2, true);
                }
                var2 = ib.a("gamestats", -120);
                if (var2 != null) {
                  lw.field_h = kt.a(var2, true);
                }
                var2 = ib.a("tournament_overview", param1 - 96);
                if (null != var2) {
                  ul.field_b = kt.a(var2, true);
                }
                var2 = ib.a("tournament_stats", -117);
                if (var2 != null) {
                  ia.field_h = kt.a(var2, true);
                }
                var2 = ib.a("tournament_returntolobby", -112);
                if (var2 != null) {
                  vp.field_d = kt.a(var2, true);
                }
                var2 = ib.a("tournament_currentgames", param1 ^ -112);
                if (null != var2) {
                  ow.field_a = kt.a(var2, true);
                }
                var2 = ib.a("player_wants_draw", -117);
                if (null != var2) {
                  pj.field_A = kt.a(var2, true);
                }
                var2 = ib.a("game_ended_on_agreed_draw", -127);
                if (null != var2) {
                  jl.field_b = kt.a(var2, true);
                }
                var2 = ib.a("auctions_offline", -124);
                if (null != var2) {
                  ew.field_d = kt.a(var2, true);
                }
                var2 = ib.a("rating_too_low", param1 - 82);
                if (null != var2) {
                  ja.field_L = kt.a(var2, true);
                }
                var2 = ib.a("warning_cannot_use_trinkets", param1 - 81);
                if (null != var2) {
                  mp.field_n = kt.a(var2, true);
                }
                var2 = ib.a("members_expansion", param1 - 89);
                if (var2 != null) {
                  oo.field_h = kt.a(var2, true);
                }
                var2 = ib.a("minprice", -112);
                if (null != var2) {
                  oj.field_T = kt.a(var2, true);
                }
                var2 = ib.a("maxprice", -111);
                if (var2 != null) {
                  tu.field_D = kt.a(var2, true);
                }
                var2 = ib.a("too_low", param1 - 119);
                if (null != var2) {
                  ik.field_E = kt.a(var2, true);
                }
                var2 = ib.a("too_high", param1 ^ -124);
                if (null != var2) {
                  rr.field_d = kt.a(var2, true);
                }
                var2 = ib.a("bid_bigger_than_buy", param1 ^ -121);
                if (null != var2) {
                  jw.field_Eb = kt.a(var2, true);
                }
                var2 = ib.a("buy_smaller_than_bid", -120);
                if (null != var2) {
                  f.field_b = kt.a(var2, true);
                }
                var2 = ib.a("buyout_is_off", -81);
                if (var2 != null) {
                  um.field_f = kt.a(var2, true);
                }
                var2 = ib.a("error_nodisplayname", -118);
                if (var2 != null) {
                  kt.a(var2, true);
                }
                var2 = ib.a("leagues_offline", -96);
                if (var2 != null) {
                  pi.field_d = kt.a(var2, true);
                }
                var2 = ib.a("secretachievement", param1 ^ -114);
                if (null != var2) {
                  fm.field_A = kt.a(var2, true);
                }
                var2 = ib.a("notyetachieved", -82);
                if (null != var2) {
                  bo.field_Db = kt.a(var2, true);
                }
                var2 = ib.a("auctionhouse_commission", -84);
                if (var2 != null) {
                  qa.field_G = kt.a(var2, true);
                }
                var2 = ib.a("facebook_multiui_help", -81);
                if (var2 != null) {
                  kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,0", param1 - 83);
                if (var2 != null) {
                  ep.field_c[0] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,1", -113);
                if (var2 != null) {
                  ep.field_c[1] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,2", -114);
                if (null != var2) {
                  ep.field_c[2] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,3", param1 - 97);
                if (null != var2) {
                  ep.field_c[3] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,4", -107);
                if (null != var2) {
                  ep.field_c[4] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,5", -99);
                if (var2 != null) {
                  ep.field_c[5] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,6", -89);
                if (null != var2) {
                  ep.field_c[6] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,7", -93);
                if (var2 != null) {
                  ep.field_c[7] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,8", -123);
                if (var2 != null) {
                  ep.field_c[8] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,9", param1 - 124);
                if (var2 != null) {
                  ep.field_c[9] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,10", -125);
                if (var2 != null) {
                  ep.field_c[10] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,11", -109);
                if (null != var2) {
                  ep.field_c[11] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,12", param1 ^ -108);
                if (var2 != null) {
                  ep.field_c[12] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,13", param1 - 115);
                if (var2 != null) {
                  ep.field_c[13] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,14", -89);
                if (var2 != null) {
                  ep.field_c[14] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,15", param1 - 120);
                if (var2 != null) {
                  ep.field_c[15] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,16", -104);
                if (var2 != null) {
                  ep.field_c[16] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,17", param1 ^ -86);
                if (null != var2) {
                  ep.field_c[17] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,18", -85);
                if (null != var2) {
                  ep.field_c[18] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,19", param1 ^ -125);
                if (var2 != null) {
                  ep.field_c[19] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_text,20", -104);
                if (var2 != null) {
                  ep.field_c[20] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,0", -86);
                if (var2 != null) {
                  rr.field_g[0] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,1", -94);
                if (var2 != null) {
                  rr.field_g[1] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,2", -92);
                if (var2 != null) {
                  rr.field_g[2] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,3", -119);
                if (var2 != null) {
                  rr.field_g[3] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,4", -95);
                if (var2 != null) {
                  rr.field_g[4] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,5", param1 - 104);
                if (null != var2) {
                  rr.field_g[5] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,6", param1 - 93);
                if (var2 != null) {
                  rr.field_g[6] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,7", -91);
                if (var2 != null) {
                  rr.field_g[7] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,8", -125);
                if (var2 != null) {
                  rr.field_g[8] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,9", -123);
                if (null != var2) {
                  rr.field_g[9] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,10", -95);
                if (null != var2) {
                  rr.field_g[10] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,11", param1 ^ -127);
                if (null != var2) {
                  rr.field_g[11] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,12", -96);
                if (var2 != null) {
                  rr.field_g[12] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,13", -114);
                if (null != var2) {
                  rr.field_g[13] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,14", -105);
                if (var2 != null) {
                  rr.field_g[14] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,15", param1 - 122);
                if (null != var2) {
                  rr.field_g[15] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,16", -84);
                if (null != var2) {
                  rr.field_g[16] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,17", -116);
                if (var2 != null) {
                  rr.field_g[17] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,18", -104);
                if (null != var2) {
                  rr.field_g[18] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,19", -111);
                if (var2 != null) {
                  rr.field_g[19] = kt.a(var2, true);
                }
                var2 = ib.a("dialog_title,20", -124);
                if (null != var2) {
                  rr.field_g[20] = kt.a(var2, true);
                }
                var2 = ib.a("posession_text", -109);
                if (var2 != null) {
                  dw.field_b = kt.a(var2, true);
                }
                var2 = ib.a("percentage_text", -113);
                if (null != var2) {
                  ei.field_c = kt.a(var2, true);
                }
                var2 = ib.a("user_text", -123);
                if (null != var2) {
                  ib.field_H = kt.a(var2, true);
                }
                var2 = ib.a("ball_in_open_percentage", -97);
                if (var2 != null) {
                  kt.a(var2, true);
                }
                var2 = ib.a("goals_text", -101);
                if (var2 != null) {
                  qb.field_Vb = kt.a(var2, true);
                }
                var2 = ib.a("scrollup_text", -93);
                if (var2 != null) {
                  gu.field_Ib = kt.a(var2, true);
                }
                var2 = ib.a("scrolldown_text", -113);
                if (null != var2) {
                  qt.field_h = kt.a(var2, true);
                }
                var2 = ib.a("tackles_and_kicks_text", -90);
                if (null != var2) {
                  rd.field_d = kt.a(var2, true);
                }
                var2 = ib.a("tackles_text", -94);
                if (null != var2) {
                  lw.field_f = kt.a(var2, true);
                }
                var2 = ib.a("kicks_text", -111);
                if (null != var2) {
                  field_b = kt.a(var2, true);
                }
                var2 = ib.a("no_goals_scored_text", param1 ^ -85);
                if (var2 != null) {
                  jl.field_c = kt.a(var2, true);
                }
                var2 = ib.a("type_text", param1 - 93);
                if (var2 != null) {
                  et.field_e = kt.a(var2, true);
                }
                var2 = ib.a("time_text", -123);
                if (null != var2) {
                  lt.field_e = kt.a(var2, true);
                }
                var2 = ib.a("slide_text", -93);
                if (var2 != null) {
                  dn.field_Ab = kt.a(var2, true);
                }
                var2 = ib.a("header_text", param1 ^ -102);
                if (null != var2) {
                  fb.field_S = kt.a(var2, true);
                }
                var2 = ib.a("kick_text", -86);
                if (null != var2) {
                  cu.field_g = kt.a(var2, true);
                }
                var2 = ib.a("nokick_text", -125);
                if (var2 != null) {
                  rb.field_Ib = kt.a(var2, true);
                }
                var2 = ib.a("name_owngoal_text", -115);
                if (null != var2) {
                  ae.field_P = kt.a(var2, true);
                }
                var2 = ib.a("tackle_col_names,0", -82);
                if (null != var2) {
                  qe.field_j[0] = kt.a(var2, true);
                }
                var2 = ib.a("tackle_col_names,1", -113);
                if (null != var2) {
                  qe.field_j[1] = kt.a(var2, true);
                }
                var2 = ib.a("tackle_col_names,2", -101);
                if (null != var2) {
                  qe.field_j[2] = kt.a(var2, true);
                }
                var2 = ib.a("tackle_col_names,3", -122);
                if (var2 != null) {
                  qe.field_j[3] = kt.a(var2, true);
                }
                var2 = ib.a("kick_col_names,0", -122);
                if (var2 != null) {
                  d.field_c[0] = kt.a(var2, true);
                }
                var2 = ib.a("kick_col_names,1", -115);
                if (null != var2) {
                  d.field_c[1] = kt.a(var2, true);
                }
                var2 = ib.a("kick_col_names,2", -86);
                if (null != var2) {
                  d.field_c[2] = kt.a(var2, true);
                }
                var2 = ib.a("kick_col_names,3", param1 ^ -94);
                if (var2 != null) {
                  d.field_c[3] = kt.a(var2, true);
                }
                var2 = ib.a("stage_final", -119);
                if (var2 != null) {
                  lt.field_b = kt.a(var2, true);
                }
                var2 = ib.a("stage_semifinal", -113);
                if (null != var2) {
                  qk.field_G = kt.a(var2, true);
                }
                var2 = ib.a("stage_quarterfinal", param1 ^ -122);
                if (null != var2) {
                  ij.field_n = kt.a(var2, true);
                }
                var2 = ib.a("stage_qualifying", -125);
                if (var2 != null) {
                  qp.field_C = kt.a(var2, true);
                }
                var2 = ib.a("stage_inthefinal", -118);
                if (var2 != null) {
                  at.field_Bb = kt.a(var2, true);
                }
                var2 = ib.a("stage_inthesemifinal", param1 - 110);
                if (null != var2) {
                  wr.field_g = kt.a(var2, true);
                }
                var2 = ib.a("stage_inthequarterfinal", param1 ^ -93);
                if (var2 != null) {
                  mo.field_a = kt.a(var2, true);
                }
                var2 = ib.a("stage_inthequalifying", -88);
                if (null != var2) {
                  op.field_u = kt.a(var2, true);
                }
                var2 = ib.a("stage_tothefinal", param1 - 108);
                if (null != var2) {
                  av.field_d = kt.a(var2, true);
                }
                var2 = ib.a("stage_tothesemifinal", -123);
                if (null != var2) {
                  qa.field_F = kt.a(var2, true);
                }
                var2 = ib.a("stage_tothequarterfinal", -125);
                if (var2 != null) {
                  bb.field_Db = kt.a(var2, true);
                }
                var2 = ib.a("stage_tothequalifying", -116);
                if (null != var2) {
                  bv.field_n = kt.a(var2, true);
                }
                var2 = ib.a("page_names,0", -109);
                if (var2 != null) {
                  jc.field_e[0] = kt.a(var2, true);
                }
                var2 = ib.a("page_names,1", -124);
                if (null != var2) {
                  jc.field_e[1] = kt.a(var2, true);
                }
                var2 = ib.a("page_names,2", -113);
                if (null != var2) {
                  jc.field_e[2] = kt.a(var2, true);
                }
                var2 = ib.a("scheduled_game", param1 - 125);
                if (null != var2) {
                  w.field_d = kt.a(var2, true);
                }
                var2 = ib.a("awaiting_game", -95);
                if (var2 != null) {
                  mc.field_i = kt.a(var2, true);
                }
                var2 = ib.a("concluded_game", param1 ^ -104);
                if (var2 != null) {
                  ci.field_e = kt.a(var2, true);
                }
                var2 = ib.a("winner_string", -117);
                if (null != var2) {
                  eq.field_g = kt.a(var2, true);
                }
                var2 = ib.a("players_text", param1 - 95);
                if (null != var2) {
                  nk.field_g = kt.a(var2, true);
                }
                var2 = ib.a("games_inprogress", -80);
                if (null != var2) {
                  wk.field_e = kt.a(var2, true);
                }
                var2 = ib.a("name_left", param1 - 92);
                if (var2 != null) {
                  ig.field_e = kt.a(var2, true);
                }
                var2 = ib.a("miniview_click_to", param1 ^ -115);
                if (var2 != null) {
                  pp.field_k = kt.a(var2, true);
                }
                var2 = ib.a("miniview_spectate", -106);
                if (null != var2) {
                  du.field_g = kt.a(var2, true);
                }
                var2 = ib.a("goals_and_posession", param1 ^ -101);
                if (var2 != null) {
                  oe.field_j = kt.a(var2, true);
                }
                var2 = ib.a("goals_and_posession_col_names,0", -104);
                if (null != var2) {
                  sr.field_g[0] = kt.a(var2, true);
                }
                var2 = ib.a("goals_and_posession_col_names,1", -100);
                if (var2 != null) {
                  sr.field_g[1] = kt.a(var2, true);
                }
                var2 = ib.a("countdown_text", -94);
                if (null != var2) {
                  kt.a(var2, true);
                }
                var2 = ib.a("tournament_lobby_chat_prefix", param1 ^ -87);
                if (var2 != null) {
                  qr.field_g = kt.a(var2, true);
                }
                var2 = ib.a("tournament_game_chat_prefix", -86);
                if (var2 != null) {
                  wn.field_h = kt.a(var2, true);
                }
                var2 = ib.a("nextround_string", -126);
                if (var2 != null) {
                  ks.field_f = kt.a(var2, true);
                }
                var2 = ib.a("tournament_starts_in_X_seconds", -109);
                if (var2 != null) {
                  rv.field_a = kt.a(var2, true);
                }
                var2 = ib.a("tournament_final_starts_in_X_seconds", -106);
                if (var2 != null) {
                  jo.field_C = kt.a(var2, true);
                }
                var2 = ib.a("tournament_semi_starts_in_X_seconds", -125);
                if (var2 != null) {
                  mt.field_c = kt.a(var2, true);
                }
                var2 = ib.a("tournament_quarter_starts_in_X_seconds", -101);
                if (null != var2) {
                  nr.field_l = kt.a(var2, true);
                }
                var2 = ib.a("tournament_singular_started", -103);
                if (var2 != null) {
                  cp.field_a = kt.a(var2, true);
                }
                var2 = ib.a("tournament_plural_started", -96);
                if (null != var2) {
                  rq.field_B = kt.a(var2, true);
                }
                var2 = ib.a("tournament_goal_closinggap", -94);
                if (null != var2) {
                  i.field_w = kt.a(var2, true);
                }
                var2 = ib.a("tournament_goal_intothelead", param1 ^ -112);
                if (null != var2) {
                  rr.field_a = kt.a(var2, true);
                }
                var2 = ib.a("tournament_goal_drawing", param1 - 124);
                if (var2 != null) {
                  jk.field_o = kt.a(var2, true);
                }
                var2 = ib.a("tournament_legitimatewin", -93);
                if (null != var2) {
                  cg.field_L = kt.a(var2, true);
                }
                var2 = ib.a("tournament_fullwin", param1 - 88);
                if (null != var2) {
                  hm.field_C = kt.a(var2, true);
                }
                var2 = ib.a("tournament_resignquit", -90);
                if (null != var2) {
                  bw.field_c = kt.a(var2, true);
                }
                var2 = ib.a("tournament_resignquit2", -106);
                if (null != var2) {
                  md.field_g = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw", -105);
                if (null != var2) {
                  ld.field_d = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_posession", -93);
                if (var2 != null) {
                  mc.field_c = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_posession2", -105);
                if (var2 != null) {
                  dr.field_f = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_tackles", -90);
                if (var2 != null) {
                  qk.field_F = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_tackles2", param1 - 112);
                if (var2 != null) {
                  gt.field_r = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_passes", param1 - 87);
                if (null != var2) {
                  ef.field_s = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_passes2", param1 - 118);
                if (null != var2) {
                  np.field_yb = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_equal", -103);
                if (null != var2) {
                  gt.field_m = kt.a(var2, true);
                }
                var2 = ib.a("tournament_draw_equal2", -103);
                if (var2 != null) {
                  pf.field_a = kt.a(var2, true);
                }
                var2 = ib.a("tournament_wildcard", -99);
                if (null != var2) {
                  ni.field_n = kt.a(var2, true);
                }
                var2 = ib.a("tournament_wildcard2", -110);
                if (null != var2) {
                  aj.field_d = kt.a(var2, true);
                }
                var2 = ib.a("click", -120);
                if (null != var2) {
                  sk.field_b = kt.a(var2, true);
                }
                var2 = ib.a("quickplay_button", -101);
                if (null != var2) {
                  jd.field_e = kt.a(var2, true);
                }
                var2 = ib.a("quickplay_desc", -80);
                if (var2 != null) {
                  ri.field_v = kt.a(var2, true);
                }
                var2 = ib.a("please_wait", param1 ^ -90);
                if (null != var2) {
                  ct.field_w = kt.a(var2, true);
                }
                var2 = ib.a("leave_button", param1 ^ -81);
                if (var2 != null) {
                  hv.field_d = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode0", -105);
                if (null != var2) {
                  tr.field_c = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode1,0", -97);
                if (null != var2) {
                  ml.field_s[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode1,1", -85);
                if (null != var2) {
                  ml.field_s[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode1,2", -92);
                if (null != var2) {
                  ml.field_s[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode1,3", -85);
                if (null != var2) {
                  ml.field_s[3] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode2", param1 ^ -106);
                if (null != var2) {
                  ll.field_l = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode4,0", -91);
                if (var2 != null) {
                  re.field_b[0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode4,1", -125);
                if (var2 != null) {
                  re.field_b[1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode4,2", -99);
                if (var2 != null) {
                  re.field_b[2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemode5", -89);
                if (var2 != null) {
                  jb.field_h = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes6,0,0", -94);
                if (null != var2) {
                  tn.field_g[0][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes6,0,1", param1 ^ -128);
                if (var2 != null) {
                  tn.field_g[0][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes6,0,2", -126);
                if (var2 != null) {
                  tn.field_g[0][2] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes6,1,0", -126);
                if (null != var2) {
                  tn.field_g[1][0] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes6,1,1", param1 - 104);
                if (null != var2) {
                  tn.field_g[1][1] = kt.a(var2, true);
                }
                var2 = ib.a("instructions_gamemodes6,1,2", -109);
                if (var2 != null) {
                  tn.field_g[1][2] = kt.a(var2, true);
                }
                var2 = ib.a("achievement_description", -103);
                if (null != var2) {
                  rt.field_K = kt.a(var2, true);
                }
                var2 = ib.a("mouseover_clicktospectate", -125);
                if (var2 != null) {
                  ds.field_f = kt.a(var2, true);
                }
                up.field_m = null;
            }
            void run() {
                var3 = Kickabout.field_G;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                  runChunk4();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_3808_0 = (RuntimeException) (var2_ref);
                  stackIn_3808_1 = new StringBuilder().append("ad.E(");
                  if (param0 == null) {
                    stackIn_3809_2 = "null";
                  } else {
                    stackIn_3809_2 = "{...}";
                  }
                  throw nb.a((Throwable) ((Object) stackIn_3808_0), ((StringBuilder) (Object) stackIn_3808_1).append(stackIn_3809_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_3817_0 = (!ah.field_d);
                  ah.field_d = stackIn_3817_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static void a(bb param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == null) {
            return;
          }
          dr.field_g = param0;
          qa.field_E.field_jb.b(22997);
          qa.field_E.a((byte) -105, (hd) (dr.field_g));
          if (param1 >= -33) {
            ad.a(47, false, -60);
          }
          kd.field_s = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ad.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "starting price can't go above buyout";
        field_d = new qm[8];
        field_e = new int[5][3];
        field_e[0][1] = 18124;
        field_e[0][0] = 9011;
        field_e[0][2] = 41662;
        field_e[1][2] = 50489;
        field_e[1][0] = 18227;
        field_e[1][1] = 32322;
        field_e[2][1] = 11183;
        field_e[2][2] = 928;
        field_e[2][0] = 3891;
        field_e[3][1] = 20147;
        field_e[3][0] = 2965;
        field_e[3][2] = 6714;
        field_e[4][0] = 33481;
        field_e[4][2] = 704;
        field_e[4][1] = 21931;
        field_b = "kicks";
    }
}
