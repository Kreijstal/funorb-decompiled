/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static qb field_a;
    static String field_e;
    static String field_b;
    static String field_f;
    static String field_c;
    static int[] field_d;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_c = null;
          field_b = null;
          field_f = null;
          field_d = null;
          field_e = null;
          if (param0 != 35) {
            rg.a(59);
          }
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "rg.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (~vn.field_d == param1) {
            uc.c(3);
            return true;
          }
          if (102 == vn.field_d) {
            nn.field_q.e(param1 ^ -89);
            return true;
          }
          stackIn_13_0 = (null != nn.field_q) && (nn.field_q.b(param1 ^ -122, param0, param2));
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "rg.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int stackIn_23_0 = 0;
        boolean stackIn_35_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (param2 != 13) {
            rg.a(-21, -66, -84, -38);
          }
          if (pm.field_b != null &&
            13 == vn.field_d) {
            pm.field_b = null;
            return true;
          }
          if (!ef.field_r) {
            if (!oj.field_i &&
              vn.field_d != 9 &&
              vn.field_d != 10 &&
              vn.field_d != 11) {
              if (80 == vn.field_d &&
                tn.g((byte) 111)) {
                ef.field_r = true;
                return true;
              }
              return false;
            }
            stackIn_35_0 = rg.a(param1, -14, param3);
            return stackIn_35_0;
          }
          if (!tn.g((byte) -40)) {
            return false;
          }
          var4_int = ko.a(param2 - 121, param0, param3) ? 1 : 0;
          if (vn.field_d == 80 ||
            vn.field_d == 84) {
            var4_int = 1;
            ef.field_r = false;
          }
          if (vn.field_d == 13) {
            ue.b(10);
            var4_int = 1;
            ef.field_r = false;
          }
          stackIn_23_0 = var4_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "rg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(eg param0, byte param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_3095_0;
            StringBuilder stackIn_3095_1;
            String stackIn_3096_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            eg param0;
            byte param1;
            boolean finished;
            $CfrPartitionedBody(eg initialParam0, byte initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_3095_0 = null;
                this.stackIn_3095_1 = null;
                this.stackIn_3096_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                gn.field_e = param0;
                var2 = tj.a("text_game_name", param1 ^ -75);
                if (null != var2) {
                  sc.a((byte) 92, var2);
                }
                var2 = tj.a("text_benefits,0", -106);
                if (var2 != null) {
                  ij.field_Ub[0] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("text_benefits,1", -88);
                if (null != var2) {
                  ij.field_Ub[1] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("text_benefits,2", -74);
                if (var2 != null) {
                  ij.field_Ub[2] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("receiving_game", -108);
                if (var2 != null) {
                  rb.field_l = sc.a((byte) 104, var2);
                }
                var2 = tj.a("exp_1_title", -98);
                if (null != var2) {
                  be.field_i = sc.a((byte) 97, var2);
                }
                var2 = tj.a("exp1inst", -101);
                if (null != var2) {
                  wj.field_e = sc.a((byte) 90, var2);
                }
                var2 = tj.a("exp_1_cap,0", -76);
                if (null != var2) {
                  dh.field_Kb[0] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("exp_1_cap,1", -82);
                if (var2 != null) {
                  dh.field_Kb[1] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("exp_1_cap,2", -128);
                if (null != var2) {
                  dh.field_Kb[2] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("exp_1_cap,3", -102);
                if (var2 != null) {
                  dh.field_Kb[3] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("exp_1_cap,4", -116);
                if (var2 != null) {
                  dh.field_Kb[4] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("exp_1_cap,5", -94);
                if (null != var2) {
                  dh.field_Kb[5] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("ai1", -70);
                if (var2 != null) {
                  ga.field_n = sc.a((byte) 94, var2);
                }
                var2 = tj.a("ai2", -91);
                if (null != var2) {
                  rf.field_l = sc.a((byte) 105, var2);
                }
                var2 = tj.a("ai3", -123);
                if (null != var2) {
                  field_c = sc.a((byte) 117, var2);
                }
                var2 = tj.a("text_x_hasbeendefeated", param1 ^ -75);
                if (var2 != null) {
                  jl.field_i = sc.a((byte) 88, var2);
                }
                var2 = tj.a("youcanchangeyourcharacter", -75);
                if (null != var2) {
                  io.field_x = sc.a((byte) 118, var2);
                }
                var2 = tj.a("smittenmessage", -94);
                if (var2 != null) {
                  co.field_d = sc.a((byte) 102, var2);
                }
                var2 = tj.a("spellstrings,0", -108);
                if (null != var2) {
                  vm.field_d[0] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,1", -122);
                if (var2 != null) {
                  vm.field_d[1] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellstrings,2", -91);
                if (var2 != null) {
                  vm.field_d[2] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellstrings,3", -73);
                if (null != var2) {
                  vm.field_d[3] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellstrings,4", -71);
                if (var2 != null) {
                  vm.field_d[4] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,5", -119);
                if (var2 != null) {
                  vm.field_d[5] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("spellstrings,6", param1 - 142);
                if (var2 != null) {
                  vm.field_d[6] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellstrings,7", param1 - 122);
                if (var2 != null) {
                  vm.field_d[7] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellstrings,8", -110);
                if (var2 != null) {
                  vm.field_d[8] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellstrings,9", -108);
                if (null != var2) {
                  vm.field_d[9] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellstrings,10", -87);
                if (var2 != null) {
                  vm.field_d[10] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellstrings,11", -122);
                if (null != var2) {
                  vm.field_d[11] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("spellstrings,12", -95);
                if (var2 != null) {
                  vm.field_d[12] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("spellstrings,13", -119);
                if (null != var2) {
                  vm.field_d[13] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("spellstrings,14", param1 - 106);
                if (null != var2) {
                  vm.field_d[14] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellstrings,15", -98);
                if (null != var2) {
                  vm.field_d[15] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,16", -90);
                if (null != var2) {
                  vm.field_d[16] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("spellstrings,17", -113);
                if (var2 != null) {
                  vm.field_d[17] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("spellstrings,18", -113);
                if (var2 != null) {
                  vm.field_d[18] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellstrings,19", -113);
                if (var2 != null) {
                  vm.field_d[19] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("spellstrings,20", -74);
                if (var2 != null) {
                  vm.field_d[20] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("spellstrings,21", -97);
                if (var2 != null) {
                  vm.field_d[21] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellstrings,22", -87);
                if (null != var2) {
                  vm.field_d[22] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("spellstrings,23", -97);
                if (null != var2) {
                  vm.field_d[23] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellstrings,24", -96);
                if (var2 != null) {
                  vm.field_d[24] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellstrings,25", -75);
                if (null != var2) {
                  vm.field_d[25] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellstrings,26", -93);
                if (null != var2) {
                  vm.field_d[26] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("spellstrings,27", -83);
                if (null != var2) {
                  vm.field_d[27] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellstrings,28", -91);
                if (var2 != null) {
                  vm.field_d[28] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellstrings,29", -80);
                if (var2 != null) {
                  vm.field_d[29] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellstrings,30", -124);
                if (var2 != null) {
                  vm.field_d[30] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellstrings,31", -126);
                if (var2 != null) {
                  vm.field_d[31] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellstrings,32", -84);
                if (null != var2) {
                  vm.field_d[32] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("spellstrings,33", -77);
                if (var2 != null) {
                  vm.field_d[33] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellstrings,34", -124);
                if (null != var2) {
                  vm.field_d[34] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellstrings,35", -100);
                if (null != var2) {
                  vm.field_d[35] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("spellstrings,36", param1 - 120);
                if (var2 != null) {
                  vm.field_d[36] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellstrings,37", param1 - 116);
                if (null != var2) {
                  vm.field_d[37] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellstrings,38", -80);
                if (null != var2) {
                  vm.field_d[38] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellstrings,39", -87);
                if (var2 != null) {
                  vm.field_d[39] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellstrings,40", -128);
                if (null != var2) {
                  vm.field_d[40] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,41", -122);
                if (var2 != null) {
                  vm.field_d[41] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellstrings,42", -81);
                if (var2 != null) {
                  vm.field_d[42] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellstrings,43", -80);
                if (null != var2) {
                  vm.field_d[43] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellstrings,44", -104);
                if (null != var2) {
                  vm.field_d[44] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellstrings,45", param1 - 147);
                if (null != var2) {
                  vm.field_d[45] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellstrings,46", -85);
                if (var2 != null) {
                  vm.field_d[46] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,47", param1 ^ -108);
                if (var2 != null) {
                  vm.field_d[47] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("spellstrings,48", -123);
                if (var2 != null) {
                  vm.field_d[48] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellstrings,49", -86);
                if (null != var2) {
                  vm.field_d[49] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellstrings,50", param1 ^ -104);
                if (var2 != null) {
                  vm.field_d[50] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellstrings,51", -107);
                if (null != var2) {
                  vm.field_d[51] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellstrings,52", -128);
                if (var2 != null) {
                  vm.field_d[52] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellstrings,53", param1 ^ -128);
                if (null != var2) {
                  vm.field_d[53] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellstrings,54", param1 - 103);
                if (var2 != null) {
                  vm.field_d[54] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellstrings,55", -77);
                if (null != var2) {
                  vm.field_d[55] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,56", -104);
                if (var2 != null) {
                  vm.field_d[56] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellstrings,57", param1 ^ -126);
                if (null != var2) {
                  vm.field_d[57] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("spellstrings,58", param1 - 117);
                if (null != var2) {
                  vm.field_d[58] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellstrings,59", param1 ^ -128);
                if (var2 != null) {
                  vm.field_d[59] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellstrings,60", -87);
                if (var2 != null) {
                  vm.field_d[60] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("spellstrings,61", -112);
                if (var2 != null) {
                  vm.field_d[61] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellstrings,62", -72);
                if (var2 != null) {
                  vm.field_d[62] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellstrings,63", -85);
                if (var2 != null) {
                  vm.field_d[63] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("spellstrings,64", -75);
                if (var2 != null) {
                  vm.field_d[64] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,65", -95);
                if (var2 != null) {
                  vm.field_d[65] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,66", param1 ^ -71);
                if (var2 != null) {
                  vm.field_d[66] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellstrings,67", -80);
                if (null != var2) {
                  vm.field_d[67] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellstrings,68", -112);
                if (null != var2) {
                  vm.field_d[68] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellstrings,69", -102);
                if (null != var2) {
                  vm.field_d[69] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellstrings,70", -108);
                if (null != var2) {
                  vm.field_d[70] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,71", -90);
                if (var2 != null) {
                  vm.field_d[71] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellstrings,72", -123);
                if (null != var2) {
                  vm.field_d[72] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellstrings,73", -93);
                if (null != var2) {
                  vm.field_d[73] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellstrings,74", -100);
                if (null != var2) {
                  vm.field_d[74] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellstrings,75", -121);
                if (var2 != null) {
                  vm.field_d[75] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,76", -123);
                if (null != var2) {
                  vm.field_d[76] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellstrings,77", param1 - 116);
                if (null != var2) {
                  vm.field_d[77] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellstrings,78", -124);
                if (var2 != null) {
                  vm.field_d[78] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellstrings,79", param1 ^ -124);
                if (var2 != null) {
                  vm.field_d[79] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellstrings,80", -113);
                if (null != var2) {
                  vm.field_d[80] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("spellstrings,81", -127);
                if (var2 != null) {
                  vm.field_d[81] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellstrings,82", -81);
                if (null != var2) {
                  vm.field_d[82] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("spellstrings,83", -89);
                if (var2 != null) {
                  vm.field_d[83] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellstrings,84", -114);
                if (var2 != null) {
                  vm.field_d[84] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("spellstrings,85", -92);
                if (var2 != null) {
                  vm.field_d[85] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellstrings,86", -101);
                if (var2 != null) {
                  vm.field_d[86] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellstrings,87", -123);
                if (var2 != null) {
                  vm.field_d[87] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,88", param1 ^ -77);
                if (null != var2) {
                  vm.field_d[88] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellstrings,89", -124);
                if (null != var2) {
                  vm.field_d[89] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellstrings,90", -83);
                if (null != var2) {
                  vm.field_d[90] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellstrings,91", param1 ^ -79);
                if (null != var2) {
                  vm.field_d[91] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellstrings,92", -99);
                if (var2 != null) {
                  vm.field_d[92] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellstrings,93", -107);
                if (var2 != null) {
                  vm.field_d[93] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellstrings,94", -76);
                if (var2 != null) {
                  vm.field_d[94] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellstrings,95", -86);
                if (var2 != null) {
                  vm.field_d[95] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("spellstrings,96", param1 - 101);
                if (null != var2) {
                  vm.field_d[96] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellstrings,97", -88);
                if (null != var2) {
                  vm.field_d[97] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,98", -117);
                if (var2 != null) {
                  vm.field_d[98] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellstrings,99", param1 - 122);
                if (null != var2) {
                  vm.field_d[99] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellstrings,100", -105);
                if (var2 != null) {
                  vm.field_d[100] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellstrings,101", -78);
                if (null != var2) {
                  vm.field_d[101] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellstrings,102", -93);
                if (var2 != null) {
                  vm.field_d[102] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellstrings,103", -127);
                if (var2 != null) {
                  vm.field_d[103] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellstrings,104", -111);
                if (null != var2) {
                  vm.field_d[104] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellstrings,105", -77);
                if (var2 != null) {
                  vm.field_d[105] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,106", -127);
                if (null != var2) {
                  vm.field_d[106] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("spellstrings,107", -79);
                if (null != var2) {
                  vm.field_d[107] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,108", param1 ^ -110);
                if (null != var2) {
                  vm.field_d[108] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("spellstrings,109", -84);
                if (null != var2) {
                  vm.field_d[109] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellstrings,110", -75);
                if (null != var2) {
                  vm.field_d[110] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellstrings,111", -123);
                if (var2 != null) {
                  vm.field_d[111] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,112", -108);
                if (null != var2) {
                  vm.field_d[112] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellstrings,113", -104);
                if (var2 != null) {
                  vm.field_d[113] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,114", -128);
                if (null != var2) {
                  vm.field_d[114] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellstrings,115", -122);
                if (null != var2) {
                  vm.field_d[115] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellstrings,116", -126);
                if (null != var2) {
                  vm.field_d[116] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,117", param1 ^ -65);
                if (null != var2) {
                  vm.field_d[117] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellstrings,118", -72);
                if (null != var2) {
                  vm.field_d[118] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellstrings,119", -82);
                if (var2 != null) {
                  vm.field_d[119] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellstrings,120", -101);
                if (null != var2) {
                  vm.field_d[120] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("spellstrings,121", -107);
                if (null != var2) {
                  vm.field_d[121] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellstrings,122", param1 - 94);
                if (null != var2) {
                  vm.field_d[122] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellstrings,123", -122);
                if (var2 != null) {
                  vm.field_d[123] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellstrings,124", param1 - 129);
                if (var2 != null) {
                  vm.field_d[124] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellstrings,125", -80);
                if (var2 != null) {
                  vm.field_d[125] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellstrings,126", param1 ^ -105);
                if (null != var2) {
                  vm.field_d[126] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("spellstrings,127", -114);
                if (null != var2) {
                  vm.field_d[127] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("spellstrings,128", param1 - 133);
                if (null != var2) {
                  vm.field_d[128] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellstrings,129", -127);
                if (var2 != null) {
                  vm.field_d[129] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellstrings,130", -86);
                if (var2 != null) {
                  vm.field_d[130] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellstrings,131", -127);
                if (null != var2) {
                  vm.field_d[131] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellstrings,132", param1 - 108);
                if (var2 != null) {
                  vm.field_d[132] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellstrings,133", param1 - 106);
                if (null != var2) {
                  vm.field_d[133] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellstrings,134", -74);
                if (var2 != null) {
                  vm.field_d[134] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("spellstrings,135", -95);
                if (null != var2) {
                  vm.field_d[135] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellstrings,136", param1 ^ -74);
                if (var2 != null) {
                  vm.field_d[136] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellstrings,137", -74);
                if (null != var2) {
                  vm.field_d[137] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellstrings,138", -108);
                if (var2 != null) {
                  vm.field_d[138] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellstrings,139", -97);
                if (var2 != null) {
                  vm.field_d[139] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellstrings,140", -96);
                if (var2 != null) {
                  vm.field_d[140] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,141", -110);
                if (null != var2) {
                  vm.field_d[141] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellstrings,142", -94);
                if (var2 != null) {
                  vm.field_d[142] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,143", param1 ^ -75);
                if (null != var2) {
                  vm.field_d[143] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellstrings,144", param1 - 122);
                if (null != var2) {
                  vm.field_d[144] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("spellstrings,145", param1 - 93);
                if (null != var2) {
                  vm.field_d[145] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellstrings,146", -119);
                if (var2 != null) {
                  vm.field_d[146] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellstrings,147", param1 - 107);
                if (null != var2) {
                  vm.field_d[147] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("spellstrings,148", -83);
                if (null != var2) {
                  vm.field_d[148] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellstrings,149", param1 - 96);
                if (var2 != null) {
                  vm.field_d[149] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellstrings,150", -114);
                if (null != var2) {
                  vm.field_d[150] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,151", -119);
                if (var2 != null) {
                  vm.field_d[151] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("spellstrings,152", -118);
                if (null != var2) {
                  vm.field_d[152] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellstrings,153", -71);
                if (null != var2) {
                  vm.field_d[153] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellstrings,154", -124);
                if (null != var2) {
                  vm.field_d[154] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellstrings,155", -85);
                if (null != var2) {
                  vm.field_d[155] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellstrings,156", -117);
                if (null != var2) {
                  vm.field_d[156] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("spellstrings,157", -125);
                if (null != var2) {
                  vm.field_d[157] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("reqachievement", param1 - 128);
                if (null != var2) {
                  kl.field_y = sc.a((byte) 119, var2);
                }
                var2 = tj.a("needthetimebook", -125);
                if (null != var2) {
                  vg.field_n = sc.a((byte) 120, var2);
                }
                var2 = tj.a("needhatsfortime", param1 ^ -114);
                if (null != var2) {
                  vn.field_j = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellnames,0", param1 - 136);
                if (var2 != null) {
                  tc.field_w[0] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,1", -117);
                if (var2 != null) {
                  tc.field_w[1] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("spellnames,2", -109);
                if (var2 != null) {
                  tc.field_w[2] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellnames,3", -78);
                if (var2 != null) {
                  tc.field_w[3] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("spellnames,4", param1 ^ -115);
                if (var2 != null) {
                  tc.field_w[4] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellnames,5", -70);
                if (var2 != null) {
                  tc.field_w[5] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellnames,6", -124);
                if (var2 != null) {
                  tc.field_w[6] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,7", -77);
                if (null != var2) {
                  tc.field_w[7] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellnames,8", -110);
                if (var2 != null) {
                  tc.field_w[8] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,9", -92);
                if (var2 != null) {
                  tc.field_w[9] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("spellnames,10", -87);
                if (var2 != null) {
                  tc.field_w[10] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellnames,11", -109);
                if (null != var2) {
                  tc.field_w[11] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,12", param1 ^ -66);
                if (var2 != null) {
                  tc.field_w[12] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellnames,13", -123);
                if (var2 != null) {
                  tc.field_w[13] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,14", -108);
                if (var2 != null) {
                  tc.field_w[14] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellnames,15", -84);
                if (var2 != null) {
                  tc.field_w[15] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellnames,16", -82);
                if (var2 != null) {
                  tc.field_w[16] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellnames,17", -71);
                if (var2 != null) {
                  tc.field_w[17] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellnames,18", -120);
                if (var2 != null) {
                  tc.field_w[18] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellnames,19", -79);
                if (null != var2) {
                  tc.field_w[19] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellnames,20", -115);
                if (var2 != null) {
                  tc.field_w[20] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellnames,21", param1 - 101);
                if (null != var2) {
                  tc.field_w[21] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellnames,22", param1 - 129);
                if (null != var2) {
                  tc.field_w[22] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellnames,23", param1 ^ -78);
                if (null != var2) {
                  tc.field_w[23] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,24", -100);
                if (null != var2) {
                  tc.field_w[24] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("spellnames,25", param1 ^ -95);
                if (null != var2) {
                  tc.field_w[25] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellnames,26", -76);
                if (null != var2) {
                  tc.field_w[26] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,27", -112);
                if (var2 != null) {
                  tc.field_w[27] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellnames,28", -119);
                if (var2 != null) {
                  tc.field_w[28] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("spellnames,29", -110);
                if (var2 != null) {
                  tc.field_w[29] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("spellnames,30", -102);
                if (null != var2) {
                  tc.field_w[30] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,31", param1 - 97);
                if (var2 != null) {
                  tc.field_w[31] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellnames,32", -89);
                if (null != var2) {
                  tc.field_w[32] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellnames,33", -96);
                if (var2 != null) {
                  tc.field_w[33] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,34", param1 ^ -79);
                if (null != var2) {
                  tc.field_w[34] = sc.a((byte) 103, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = tj.a("spellnames,35", param1 - 134);
                if (null != var2) {
                  tc.field_w[35] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellnames,36", -99);
                if (null != var2) {
                  tc.field_w[36] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("spellnames,37", -116);
                if (null != var2) {
                  tc.field_w[37] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellnames,38", -87);
                if (null != var2) {
                  tc.field_w[38] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,39", -113);
                if (null != var2) {
                  tc.field_w[39] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,40", -101);
                if (null != var2) {
                  tc.field_w[40] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellnames,41", param1 ^ -70);
                if (null != var2) {
                  tc.field_w[41] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellnames,42", -128);
                if (null != var2) {
                  tc.field_w[42] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellnames,43", -110);
                if (var2 != null) {
                  tc.field_w[43] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,44", -96);
                if (var2 != null) {
                  tc.field_w[44] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellnames,45", -90);
                if (null != var2) {
                  tc.field_w[45] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellnames,46", -103);
                if (null != var2) {
                  tc.field_w[46] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellnames,47", -105);
                if (null != var2) {
                  tc.field_w[47] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellnames,48", param1 - 145);
                if (null != var2) {
                  tc.field_w[48] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellnames,49", -124);
                if (null != var2) {
                  tc.field_w[49] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellnames,50", param1 - 124);
                if (var2 != null) {
                  tc.field_w[50] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,51", -108);
                if (null != var2) {
                  tc.field_w[51] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellnames,52", -122);
                if (var2 != null) {
                  tc.field_w[52] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellnames,53", -97);
                if (null != var2) {
                  tc.field_w[53] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,54", param1 ^ -74);
                if (null != var2) {
                  tc.field_w[54] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellnames,55", -124);
                if (null != var2) {
                  tc.field_w[55] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,56", -99);
                if (null != var2) {
                  tc.field_w[56] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellnames,57", param1 - 143);
                if (null != var2) {
                  tc.field_w[57] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellnames,58", -119);
                if (var2 != null) {
                  tc.field_w[58] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,59", -124);
                if (var2 != null) {
                  tc.field_w[59] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("spellnames,60", -128);
                if (var2 != null) {
                  tc.field_w[60] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellnames,61", -93);
                if (var2 != null) {
                  tc.field_w[61] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,62", -76);
                if (null != var2) {
                  tc.field_w[62] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellnames,63", param1 ^ -96);
                if (var2 != null) {
                  tc.field_w[63] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellnames,64", -108);
                if (var2 != null) {
                  tc.field_w[64] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellnames,65", -115);
                if (null != var2) {
                  tc.field_w[65] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellnames,66", -118);
                if (var2 != null) {
                  tc.field_w[66] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellnames,67", -91);
                if (var2 != null) {
                  tc.field_w[67] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellnames,68", param1 ^ -118);
                if (var2 != null) {
                  tc.field_w[68] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("spellnames,69", -99);
                if (null != var2) {
                  tc.field_w[69] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellnames,70", param1 ^ -114);
                if (var2 != null) {
                  tc.field_w[70] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellnames,71", -109);
                if (null != var2) {
                  tc.field_w[71] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellnames,72", -80);
                if (var2 != null) {
                  tc.field_w[72] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("spellnames,73", param1 - 140);
                if (null != var2) {
                  tc.field_w[73] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,74", param1 ^ -75);
                if (null != var2) {
                  tc.field_w[74] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("spellnames,75", param1 - 120);
                if (var2 != null) {
                  tc.field_w[75] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellnames,76", param1 ^ -100);
                if (null != var2) {
                  tc.field_w[76] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellnames,77", -75);
                if (null != var2) {
                  tc.field_w[77] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellnames,78", param1 ^ -110);
                if (var2 != null) {
                  tc.field_w[78] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,79", -123);
                if (null != var2) {
                  tc.field_w[79] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellnames,80", param1 ^ -91);
                if (null != var2) {
                  tc.field_w[80] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("spellnames,81", param1 ^ -122);
                if (null != var2) {
                  tc.field_w[81] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellnames,82", param1 ^ -118);
                if (var2 != null) {
                  tc.field_w[82] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("spellnames,83", param1 ^ -105);
                if (null != var2) {
                  tc.field_w[83] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("spellnames,84", -77);
                if (var2 != null) {
                  tc.field_w[84] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spellnames,85", -70);
                if (var2 != null) {
                  tc.field_w[85] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellnames,86", -80);
                if (var2 != null) {
                  tc.field_w[86] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("spellnames,87", param1 ^ -84);
                if (var2 != null) {
                  tc.field_w[87] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellnames,88", -95);
                if (var2 != null) {
                  tc.field_w[88] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellnames,89", -74);
                if (var2 != null) {
                  tc.field_w[89] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellnames,90", -96);
                if (var2 != null) {
                  tc.field_w[90] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellnames,91", -118);
                if (var2 != null) {
                  tc.field_w[91] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellnames,92", -87);
                if (null != var2) {
                  tc.field_w[92] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("spellnames,93", param1 - 146);
                if (null != var2) {
                  tc.field_w[93] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,94", param1 - 139);
                if (null != var2) {
                  tc.field_w[94] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,95", -108);
                if (var2 != null) {
                  tc.field_w[95] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellnames,96", -80);
                if (null != var2) {
                  tc.field_w[96] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("spellnames,97", -122);
                if (var2 != null) {
                  tc.field_w[97] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellnames,98", -93);
                if (null != var2) {
                  tc.field_w[98] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellnames,99", -119);
                if (null != var2) {
                  tc.field_w[99] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("spellnames,100", param1 - 99);
                if (var2 != null) {
                  tc.field_w[100] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellnames,101", param1 ^ -96);
                if (null != var2) {
                  tc.field_w[101] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellnames,102", -75);
                if (var2 != null) {
                  tc.field_w[102] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellnames,103", -96);
                if (var2 != null) {
                  tc.field_w[103] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,104", -113);
                if (null != var2) {
                  tc.field_w[104] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellnames,105", -104);
                if (var2 != null) {
                  tc.field_w[105] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("spellnames,106", param1 ^ -70);
                if (null != var2) {
                  tc.field_w[106] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,107", -80);
                if (var2 != null) {
                  tc.field_w[107] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellnames,108", -98);
                if (null != var2) {
                  tc.field_w[108] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellnames,109", param1 ^ -76);
                if (null != var2) {
                  tc.field_w[109] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,110", -88);
                if (null != var2) {
                  tc.field_w[110] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("spellnames,111", -122);
                if (null != var2) {
                  tc.field_w[111] = sc.a((byte) 112, var2);
                }
                var2 = tj.a("spellnames,112", -83);
                if (null != var2) {
                  tc.field_w[112] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("spellnames,113", -126);
                if (var2 != null) {
                  tc.field_w[113] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,114", -110);
                if (var2 != null) {
                  tc.field_w[114] = sc.a((byte) 112, var2);
                }
                var2 = tj.a("spellnames,115", -95);
                if (var2 != null) {
                  tc.field_w[115] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellnames,116", param1 - 142);
                if (null != var2) {
                  tc.field_w[116] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("spellnames,117", -110);
                if (var2 != null) {
                  tc.field_w[117] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellnames,118", param1 ^ -98);
                if (null != var2) {
                  tc.field_w[118] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellnames,119", -101);
                if (null != var2) {
                  tc.field_w[119] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellnames,120", param1 - 118);
                if (null != var2) {
                  tc.field_w[120] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("spellnames,121", -116);
                if (null != var2) {
                  tc.field_w[121] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellnames,122", -76);
                if (var2 != null) {
                  tc.field_w[122] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellnames,123", -108);
                if (var2 != null) {
                  tc.field_w[123] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellnames,124", -124);
                if (null != var2) {
                  tc.field_w[124] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellnames,125", -110);
                if (null != var2) {
                  tc.field_w[125] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,126", -81);
                if (var2 != null) {
                  tc.field_w[126] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("spellnames,127", -125);
                if (null != var2) {
                  tc.field_w[127] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("spellnames,128", -106);
                if (null != var2) {
                  tc.field_w[128] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("spellnames,129", -91);
                if (null != var2) {
                  tc.field_w[129] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("spellnames,130", -124);
                if (var2 != null) {
                  tc.field_w[130] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("spellnames,131", -70);
                if (null != var2) {
                  tc.field_w[131] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellnames,132", -118);
                if (var2 != null) {
                  tc.field_w[132] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellnames,133", param1 ^ -104);
                if (null != var2) {
                  tc.field_w[133] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("spellnames,134", -80);
                if (null != var2) {
                  tc.field_w[134] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellnames,135", -126);
                if (var2 != null) {
                  tc.field_w[135] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("spellnames,136", param1 - 103);
                if (null != var2) {
                  tc.field_w[136] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellnames,137", param1 - 126);
                if (var2 != null) {
                  tc.field_w[137] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellnames,138", param1 - 97);
                if (null != var2) {
                  tc.field_w[138] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("spellnames,139", -80);
                if (null != var2) {
                  tc.field_w[139] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("spellnames,140", -100);
                if (null != var2) {
                  tc.field_w[140] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellnames,141", param1 - 93);
                if (var2 != null) {
                  tc.field_w[141] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spellnames,142", -88);
                if (var2 != null) {
                  tc.field_w[142] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spellnames,143", -112);
                if (var2 != null) {
                  tc.field_w[143] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellnames,144", -100);
                if (null != var2) {
                  tc.field_w[144] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellnames,145", param1 ^ -105);
                if (var2 != null) {
                  tc.field_w[145] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("spellnames,146", -109);
                if (null != var2) {
                  tc.field_w[146] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("spellnames,147", -114);
                if (null != var2) {
                  tc.field_w[147] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("spellnames,148", param1 ^ -91);
                if (var2 != null) {
                  tc.field_w[148] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("spellnames,149", param1 - 142);
                if (var2 != null) {
                  tc.field_w[149] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("spellnames,150", -107);
                if (var2 != null) {
                  tc.field_w[150] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("spellnames,151", -107);
                if (var2 != null) {
                  tc.field_w[151] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("spellnames,152", param1 - 141);
                if (null != var2) {
                  tc.field_w[152] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellnames,153", -97);
                if (var2 != null) {
                  tc.field_w[153] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("spellnames,154", -77);
                if (null != var2) {
                  tc.field_w[154] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("spellnames,155", param1 - 107);
                if (null != var2) {
                  tc.field_w[155] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("spellnames,156", -127);
                if (var2 != null) {
                  tc.field_w[156] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellnames,157", -126);
                if (var2 != null) {
                  tc.field_w[157] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("achievement_names,0", -74);
                if (var2 != null) {
                  rb.field_n[0] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("achievement_names,1", -123);
                if (var2 != null) {
                  rb.field_n[1] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,2", param1 - 106);
                if (null != var2) {
                  rb.field_n[2] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("achievement_names,3", -109);
                if (null != var2) {
                  rb.field_n[3] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("achievement_names,4", -75);
                if (var2 != null) {
                  rb.field_n[4] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("achievement_names,5", param1 - 127);
                if (null != var2) {
                  rb.field_n[5] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("achievement_names,6", param1 ^ -70);
                if (var2 != null) {
                  rb.field_n[6] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("achievement_names,7", -79);
                if (null != var2) {
                  rb.field_n[7] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("achievement_names,8", param1 ^ -108);
                if (null != var2) {
                  rb.field_n[8] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("achievement_names,9", -91);
                if (var2 != null) {
                  rb.field_n[9] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("achievement_names,10", -112);
                if (null != var2) {
                  rb.field_n[10] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("achievement_names,11", -92);
                if (var2 != null) {
                  rb.field_n[11] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("achievement_names,12", -115);
                if (null != var2) {
                  rb.field_n[12] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("achievement_names,13", -110);
                if (var2 != null) {
                  rb.field_n[13] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("achievement_names,14", -79);
                if (var2 != null) {
                  rb.field_n[14] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("achievement_names,15", -105);
                if (var2 != null) {
                  rb.field_n[15] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("achievement_names,16", -101);
                if (null != var2) {
                  rb.field_n[16] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_names,17", -86);
                if (var2 != null) {
                  rb.field_n[17] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("achievement_names,18", param1 - 126);
                if (var2 != null) {
                  rb.field_n[18] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("achievement_names,19", -128);
                if (var2 != null) {
                  rb.field_n[19] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("achievement_names,20", -87);
                if (null != var2) {
                  rb.field_n[20] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("achievement_names,21", param1 ^ -120);
                if (var2 != null) {
                  rb.field_n[21] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("achievement_names,22", param1 ^ -98);
                if (var2 != null) {
                  rb.field_n[22] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("achievement_names,23", -93);
                if (var2 != null) {
                  rb.field_n[23] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("achievement_names,24", -73);
                if (null != var2) {
                  rb.field_n[24] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,25", -72);
                if (null != var2) {
                  rb.field_n[25] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,26", -118);
                if (var2 != null) {
                  rb.field_n[26] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("achievement_names,27", param1 ^ -89);
                if (var2 != null) {
                  rb.field_n[27] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("achievement_names,28", -84);
                if (null != var2) {
                  rb.field_n[28] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("achievement_names,29", -114);
                if (null != var2) {
                  rb.field_n[29] = sc.a((byte) 112, var2);
                }
                var2 = tj.a("achievement_names,30", -106);
                if (null != var2) {
                  rb.field_n[30] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("achievement_names,31", param1 - 115);
                if (null != var2) {
                  rb.field_n[31] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_names,32", -111);
                if (var2 != null) {
                  rb.field_n[32] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_names,33", -101);
                if (var2 != null) {
                  rb.field_n[33] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("achievement_names,34", -107);
                if (null != var2) {
                  rb.field_n[34] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_names,35", -99);
                if (var2 != null) {
                  rb.field_n[35] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("achievement_names,36", -83);
                if (null != var2) {
                  rb.field_n[36] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_names,37", param1 ^ -94);
                if (var2 != null) {
                  rb.field_n[37] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("achievement_names,38", param1 - 141);
                if (var2 != null) {
                  rb.field_n[38] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("achievement_names,39", -106);
                if (null != var2) {
                  rb.field_n[39] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("achievement_names,40", -112);
                if (var2 != null) {
                  rb.field_n[40] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("achievement_names,41", -109);
                if (null != var2) {
                  rb.field_n[41] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("achievement_names,42", -79);
                if (var2 != null) {
                  rb.field_n[42] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("achievement_names,43", -117);
                if (var2 != null) {
                  rb.field_n[43] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("achievement_names,44", param1 ^ -109);
                if (var2 != null) {
                  rb.field_n[44] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("achievement_names,45", param1 ^ -101);
                if (var2 != null) {
                  rb.field_n[45] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("achievement_names,46", -127);
                if (null != var2) {
                  rb.field_n[46] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("achievement_names,47", -111);
                if (var2 != null) {
                  rb.field_n[47] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_names,48", -118);
                if (var2 != null) {
                  rb.field_n[48] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_names,49", -125);
                if (var2 != null) {
                  rb.field_n[49] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("achievement_names,50", -112);
                if (var2 != null) {
                  rb.field_n[50] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("achievement_names,51", -113);
                if (var2 != null) {
                  rb.field_n[51] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("achievement_names,52", -125);
                if (var2 != null) {
                  rb.field_n[52] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_names,53", -81);
                if (var2 != null) {
                  rb.field_n[53] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("achievement_names,54", param1 - 103);
                if (null != var2) {
                  rb.field_n[54] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_names,55", -80);
                if (null != var2) {
                  rb.field_n[55] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,56", -82);
                if (null != var2) {
                  rb.field_n[56] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("achievement_names,57", -115);
                if (null != var2) {
                  rb.field_n[57] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("achievement_names,58", -98);
                if (null != var2) {
                  rb.field_n[58] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("achievement_names,59", -125);
                if (null != var2) {
                  rb.field_n[59] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("achievement_names,60", -120);
                if (null != var2) {
                  rb.field_n[60] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_names,61", -77);
                if (null != var2) {
                  rb.field_n[61] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("achievement_names,62", -88);
                if (null != var2) {
                  rb.field_n[62] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("achievement_names,63", param1 - 142);
                if (var2 != null) {
                  rb.field_n[63] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("achievement_names,64", -74);
                if (var2 != null) {
                  rb.field_n[64] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("achievement_names,65", param1 - 115);
                if (var2 != null) {
                  rb.field_n[65] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_names,66", param1 ^ -108);
                if (var2 != null) {
                  rb.field_n[66] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("achievement_names,67", param1 - 123);
                if (var2 != null) {
                  rb.field_n[67] = sc.a((byte) 104, var2);
                }
                var2 = tj.a("achievement_names,68", -111);
                if (null != var2) {
                  rb.field_n[68] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_names,69", -117);
                if (null != var2) {
                  rb.field_n[69] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("achievement_names,70", -126);
                if (null != var2) {
                  rb.field_n[70] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("achievement_names,71", -94);
                if (null != var2) {
                  rb.field_n[71] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("achievement_names,72", -97);
                if (null != var2) {
                  rb.field_n[72] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("achievement_names,73", -120);
                if (var2 != null) {
                  rb.field_n[73] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,74", param1 ^ -108);
                if (var2 != null) {
                  rb.field_n[74] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("achievement_names,75", -84);
                if (var2 != null) {
                  rb.field_n[75] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("achievement_names,76", param1 ^ -103);
                if (null != var2) {
                  rb.field_n[76] = sc.a((byte) 100, var2);
                }
                var2 = tj.a("achievement_names,77", -85);
                if (var2 != null) {
                  rb.field_n[77] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("achievement_names,78", -118);
                if (var2 != null) {
                  rb.field_n[78] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_names,79", -117);
                if (var2 != null) {
                  rb.field_n[79] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("achievement_names,80", -84);
                if (var2 != null) {
                  rb.field_n[80] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,81", -98);
                if (null != var2) {
                  rb.field_n[81] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_names,82", -78);
                if (var2 != null) {
                  rb.field_n[82] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("achievement_names,83", -96);
                if (var2 != null) {
                  rb.field_n[83] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("achievement_names,84", -102);
                if (null != var2) {
                  rb.field_n[84] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("achievement_names,85", -112);
                if (null != var2) {
                  rb.field_n[85] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_names,86", -81);
                if (null != var2) {
                  rb.field_n[86] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("achievement_names,87", -80);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  rb.field_n[87] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_names,88", param1 ^ -101);
                if (var2 != null) {
                  rb.field_n[88] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("achievement_names,89", param1 - 104);
                if (var2 != null) {
                  rb.field_n[89] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("achievement_names,90", -118);
                if (var2 != null) {
                  rb.field_n[90] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("achievement_names,91", param1 - 106);
                if (null != var2) {
                  rb.field_n[91] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("achievement_names,92", -80);
                if (var2 != null) {
                  rb.field_n[92] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("achievement_names,93", -101);
                if (null != var2) {
                  rb.field_n[93] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("achievement_names,94", -117);
                if (null != var2) {
                  rb.field_n[94] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_criteria,0", param1 ^ -119);
                if (null != var2) {
                  af.field_Bb[0] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("achievement_criteria,1", -105);
                if (var2 != null) {
                  af.field_Bb[1] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("achievement_criteria,2", -98);
                if (null != var2) {
                  af.field_Bb[2] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("achievement_criteria,3", -116);
                if (var2 != null) {
                  af.field_Bb[3] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_criteria,4", -70);
                if (null != var2) {
                  af.field_Bb[4] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_criteria,5", param1 - 141);
                if (null != var2) {
                  af.field_Bb[5] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("achievement_criteria,6", -119);
                if (null != var2) {
                  af.field_Bb[6] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("achievement_criteria,7", -82);
                if (var2 != null) {
                  af.field_Bb[7] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("achievement_criteria,8", -75);
                if (var2 != null) {
                  af.field_Bb[8] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("achievement_criteria,9", -100);
                if (null != var2) {
                  af.field_Bb[9] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_criteria,10", -125);
                if (var2 != null) {
                  af.field_Bb[10] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("achievement_criteria,11", -112);
                if (null != var2) {
                  af.field_Bb[11] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("achievement_criteria,12", param1 - 142);
                if (var2 != null) {
                  af.field_Bb[12] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_criteria,13", -79);
                if (null != var2) {
                  af.field_Bb[13] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_criteria,14", param1 - 125);
                if (null != var2) {
                  af.field_Bb[14] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("achievement_criteria,15", param1 ^ -119);
                if (null != var2) {
                  af.field_Bb[15] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("achievement_criteria,16", param1 - 130);
                if (var2 != null) {
                  af.field_Bb[16] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("achievement_criteria,17", -73);
                if (var2 != null) {
                  af.field_Bb[17] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("achievement_criteria,18", -101);
                if (var2 != null) {
                  af.field_Bb[18] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("achievement_criteria,19", -97);
                if (null != var2) {
                  af.field_Bb[19] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("achievement_criteria,20", -101);
                if (var2 != null) {
                  af.field_Bb[20] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("achievement_criteria,21", -106);
                if (var2 != null) {
                  af.field_Bb[21] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("achievement_criteria,22", param1 - 126);
                if (var2 != null) {
                  af.field_Bb[22] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_criteria,23", -124);
                if (null != var2) {
                  af.field_Bb[23] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("achievement_criteria,24", -125);
                if (null != var2) {
                  af.field_Bb[24] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("achievement_criteria,25", -103);
                if (null != var2) {
                  af.field_Bb[25] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_criteria,26", param1 - 97);
                if (null != var2) {
                  af.field_Bb[26] = sc.a((byte) 112, var2);
                }
                var2 = tj.a("achievement_criteria,27", -110);
                if (var2 != null) {
                  af.field_Bb[27] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("achievement_criteria,28", -75);
                if (var2 != null) {
                  af.field_Bb[28] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("achievement_criteria,29", -100);
                if (null != var2) {
                  af.field_Bb[29] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("achievement_criteria,30", -94);
                if (var2 != null) {
                  af.field_Bb[30] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("achievement_criteria,31", -108);
                if (var2 != null) {
                  af.field_Bb[31] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("achievement_criteria,32", -85);
                if (var2 != null) {
                  af.field_Bb[32] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("achievement_criteria,33", -122);
                if (null != var2) {
                  af.field_Bb[33] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("achievement_criteria,34", -88);
                if (null != var2) {
                  af.field_Bb[34] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("achievement_criteria,35", param1 ^ -115);
                if (var2 != null) {
                  af.field_Bb[35] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("achievement_criteria,36", -122);
                if (null != var2) {
                  af.field_Bb[36] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("achievement_criteria,37", -88);
                if (null != var2) {
                  af.field_Bb[37] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("achievement_criteria,38", -81);
                if (null != var2) {
                  af.field_Bb[38] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("achievement_criteria,39", -97);
                if (var2 != null) {
                  af.field_Bb[39] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("achievement_criteria,40", param1 ^ -71);
                if (var2 != null) {
                  af.field_Bb[40] = sc.a((byte) 113, var2);
                }
                var2 = tj.a("achievement_criteria,41", -121);
                if (var2 != null) {
                  af.field_Bb[41] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("achievement_criteria,42", -86);
                if (null != var2) {
                  af.field_Bb[42] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("achievement_criteria,43", -79);
                if (var2 != null) {
                  af.field_Bb[43] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_criteria,44", -96);
                if (var2 != null) {
                  af.field_Bb[44] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("achievement_criteria,45", -115);
                if (null != var2) {
                  af.field_Bb[45] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_criteria,46", param1 - 144);
                if (var2 != null) {
                  af.field_Bb[46] = sc.a((byte) 114, var2);
                }
                var2 = tj.a("achievement_criteria,47", -80);
                if (null != var2) {
                  af.field_Bb[47] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("achievement_criteria,48", param1 ^ -107);
                if (var2 != null) {
                  af.field_Bb[48] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_criteria,49", -118);
                if (var2 != null) {
                  af.field_Bb[49] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_criteria,50", -115);
                if (var2 != null) {
                  af.field_Bb[50] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("achievement_criteria,51", -86);
                if (var2 != null) {
                  af.field_Bb[51] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("achievement_criteria,52", -71);
                if (var2 != null) {
                  af.field_Bb[52] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("achievement_criteria,53", -96);
                if (var2 != null) {
                  af.field_Bb[53] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_criteria,54", param1 ^ -123);
                if (null != var2) {
                  af.field_Bb[54] = sc.a((byte) 92, var2);
                }
                var2 = tj.a("achievement_criteria,55", -83);
                if (var2 != null) {
                  af.field_Bb[55] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_criteria,56", param1 ^ -111);
                if (null != var2) {
                  af.field_Bb[56] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("achievement_criteria,57", -103);
                if (var2 != null) {
                  af.field_Bb[57] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("achievement_criteria,58", -120);
                if (var2 != null) {
                  af.field_Bb[58] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("achievement_criteria,59", -103);
                if (var2 != null) {
                  af.field_Bb[59] = sc.a((byte) 98, var2);
                }
                var2 = tj.a("achievement_criteria,60", param1 ^ -90);
                if (var2 != null) {
                  af.field_Bb[60] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("achievement_criteria,61", -91);
                if (var2 != null) {
                  af.field_Bb[61] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("achievement_criteria,62", -110);
                if (null != var2) {
                  af.field_Bb[62] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("achievement_criteria,63", -76);
                if (var2 != null) {
                  af.field_Bb[63] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("achievement_criteria,64", -127);
                if (null != var2) {
                  af.field_Bb[64] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("achievement_criteria,65", -108);
                if (null != var2) {
                  af.field_Bb[65] = sc.a((byte) 124, var2);
                }
                var2 = tj.a("achievement_criteria,66", -96);
                if (null != var2) {
                  af.field_Bb[66] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("achievement_criteria,67", param1 ^ -105);
                if (null != var2) {
                  af.field_Bb[67] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_criteria,68", -115);
                if (var2 != null) {
                  af.field_Bb[68] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("achievement_criteria,69", -72);
                if (var2 != null) {
                  af.field_Bb[69] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("achievement_criteria,70", -97);
                if (var2 != null) {
                  af.field_Bb[70] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("achievement_criteria,71", -121);
                if (null != var2) {
                  af.field_Bb[71] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("achievement_criteria,72", -114);
                if (var2 != null) {
                  af.field_Bb[72] = sc.a((byte) 99, var2);
                }
                var2 = tj.a("achievement_criteria,73", -94);
                if (var2 != null) {
                  af.field_Bb[73] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("achievement_criteria,74", -98);
                if (var2 != null) {
                  af.field_Bb[74] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("achievement_criteria,75", param1 - 110);
                if (var2 != null) {
                  af.field_Bb[75] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("achievement_criteria,76", -89);
                if (var2 != null) {
                  af.field_Bb[76] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("achievement_criteria,77", -126);
                if (var2 != null) {
                  af.field_Bb[77] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_criteria,78", param1 - 124);
                if (null != var2) {
                  af.field_Bb[78] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("achievement_criteria,79", -75);
                if (null != var2) {
                  af.field_Bb[79] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("achievement_criteria,80", -100);
                if (var2 != null) {
                  af.field_Bb[80] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("achievement_criteria,81", param1 ^ -81);
                if (var2 != null) {
                  af.field_Bb[81] = sc.a((byte) 96, var2);
                }
                var2 = tj.a("achievement_criteria,82", -92);
                if (var2 != null) {
                  af.field_Bb[82] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("achievement_criteria,83", -105);
                if (null != var2) {
                  af.field_Bb[83] = sc.a((byte) 88, var2);
                }
                var2 = tj.a("achievement_criteria,84", -111);
                if (null != var2) {
                  af.field_Bb[84] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("achievement_criteria,85", -79);
                if (null != var2) {
                  af.field_Bb[85] = sc.a((byte) 119, var2);
                }
                var2 = tj.a("achievement_criteria,86", -124);
                if (null != var2) {
                  af.field_Bb[86] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_criteria,87", param1 - 137);
                if (null != var2) {
                  af.field_Bb[87] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("achievement_criteria,88", -119);
                if (var2 != null) {
                  af.field_Bb[88] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_criteria,89", param1 - 126);
                if (null != var2) {
                  af.field_Bb[89] = sc.a((byte) 126, var2);
                }
                var2 = tj.a("achievement_criteria,90", -122);
                if (null != var2) {
                  af.field_Bb[90] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("achievement_criteria,91", param1 ^ -125);
                if (var2 != null) {
                  af.field_Bb[91] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("achievement_criteria,92", -122);
                if (null != var2) {
                  af.field_Bb[92] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("achievement_criteria,93", -81);
                if (var2 != null) {
                  af.field_Bb[93] = sc.a((byte) 120, var2);
                }
                var2 = tj.a("achievement_criteria,94", -90);
                if (var2 != null) {
                  af.field_Bb[94] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("keycode_walkleft1", -72);
                if (null != var2) {
                  ig.field_g = var2[0] & 255;
                }
                var2 = tj.a("keycode_walkright1", -72);
                if (var2 != null) {
                  im.field_g = var2[0] & 255;
                }
                var2 = tj.a("keycode_walkleft2", -123);
                if (null != var2) {
                  ko.field_k = var2[0] & 255;
                }
                var2 = tj.a("keycode_walkright2", -100);
                if (null != var2) {
                  ud.field_w = 255 & var2[0];
                }
                var2 = tj.a("keycode_scrollup", -102);
                if (var2 != null) {
                  fi.field_e = 255 & var2[0];
                }
                var2 = tj.a("keycode_scrolldown", -93);
                if (null != var2) {
                  cm.field_j = 255 & var2[0];
                }
                var2 = tj.a("keycode_scrollleft", param1 - 119);
                if (var2 != null) {
                  p.field_a = var2[0] & 255;
                }
                var2 = tj.a("keycode_scrollright", -105);
                if (null != var2) {
                  qo.field_b = 255 & var2[0];
                }
                var2 = tj.a("keycode_q", -96);
                if (var2 != null) {
                  bg.field_c = var2[0] & 255;
                }
                var2 = tj.a("keycode_c", param1 ^ -104);
                if (null != var2) {
                  ao.field_f = 255 & var2[0];
                }
                var2 = tj.a("text_login_or_discard", -86);
                if (var2 != null) {
                  sc.a((byte) 90, var2);
                }
                var2 = tj.a("charcreate", -110);
                if (var2 != null) {
                  ie.field_Lb = sc.a((byte) 124, var2);
                }
                var2 = tj.a("spelselect", -82);
                if (null != var2) {
                  ji.field_l = sc.a((byte) 104, var2);
                }
                var2 = tj.a("multiplayer", -101);
                if (null != var2) {
                  ol.field_a = sc.a((byte) 117, var2);
                }
                var2 = tj.a("text_randomize", -72);
                if (var2 != null) {
                  nj.field_l = sc.a((byte) 93, var2);
                }
                var2 = tj.a("text_offeringrematch", -113);
                if (var2 != null) {
                  hf.field_b = sc.a((byte) 114, var2);
                }
                var2 = tj.a("text_waiting", -72);
                if (null != var2) {
                  lc.field_r = sc.a((byte) 95, var2);
                }
                var2 = tj.a("text_declined", -104);
                if (var2 != null) {
                  ea.field_I = sc.a((byte) 96, var2);
                }
                var2 = tj.a("gameoptlabels,0", -125);
                if (null != var2) {
                  aj.field_a[0] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("gameoptlabels,1", -75);
                if (var2 != null) {
                  aj.field_a[1] = sc.a((byte) 97, var2);
                }
                var2 = tj.a("gameoptlabels,2", -110);
                if (null != var2) {
                  aj.field_a[2] = sc.a((byte) 123, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,0", -75);
                if (null != var2) {
                  rm.field_l[0][0] = sc.a((byte) 89, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,1", -127);
                if (null != var2) {
                  rm.field_l[0][1] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,2", param1 - 142);
                if (null != var2) {
                  rm.field_l[0][2] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,3", -72);
                if (null != var2) {
                  rm.field_l[0][3] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,4", -99);
                if (null != var2) {
                  rm.field_l[0][4] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,5", param1 - 112);
                if (null != var2) {
                  rm.field_l[0][5] = sc.a((byte) 95, var2);
                }
                var2 = tj.a("gameopt_buttonnames,0,6", -92);
                if (var2 != null) {
                  rm.field_l[0][6] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("gameopt_buttonnames,2,0", -83);
                if (null != var2) {
                  rm.field_l[2][0] = sc.a((byte) 94, var2);
                }
                var2 = tj.a("gameopt_buttonnames,2,1", -121);
                if (var2 != null) {
                  rm.field_l[2][1] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,0", param1 - 92);
                if (var2 != null) {
                  jh.field_d[0][0] = sc.a((byte) 91, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,1", param1 ^ -123);
                if (null != var2) {
                  jh.field_d[0][1] = sc.a((byte) 111, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,2", -114);
                if (var2 != null) {
                  jh.field_d[0][2] = sc.a((byte) 101, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,3", param1 - 140);
                if (null != var2) {
                  jh.field_d[0][3] = sc.a((byte) 102, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,4", -73);
                if (var2 != null) {
                  jh.field_d[0][4] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,5", -119);
                if (null != var2) {
                  jh.field_d[0][5] = sc.a((byte) 118, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,0,6", -127);
                if (null != var2) {
                  jh.field_d[0][6] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,0", param1 ^ -84);
                if (null != var2) {
                  jh.field_d[1][0] = sc.a((byte) 115, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,1", -95);
                if (var2 != null) {
                  jh.field_d[1][1] = sc.a((byte) 90, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,2", -90);
                if (var2 != null) {
                  jh.field_d[1][2] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,3", -78);
                if (null != var2) {
                  jh.field_d[1][3] = sc.a((byte) 108, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,4", param1 ^ -71);
                if (var2 != null) {
                  jh.field_d[1][4] = sc.a((byte) 116, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,5", -105);
                if (null != var2) {
                  jh.field_d[1][5] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,6", param1 - 132);
                if (null != var2) {
                  jh.field_d[1][6] = sc.a((byte) 105, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,7", -76);
                if (null != var2) {
                  jh.field_d[1][7] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,8", -115);
                if (null != var2) {
                  jh.field_d[1][8] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,1,9", -86);
                if (var2 != null) {
                  jh.field_d[1][9] = sc.a((byte) 107, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,2,0", -86);
                if (null != var2) {
                  jh.field_d[2][0] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("gameopt_tooltipnames,2,1", -80);
                if (var2 != null) {
                  jh.field_d[2][1] = sc.a((byte) 127, var2);
                }
                var2 = tj.a("instructions_pages,0", param1 ^ -121);
                if (null != var2) {
                  gd.field_kb[0] = sc.a((byte) 117, var2);
                }
                var2 = tj.a("instructions_pages,1", -99);
                if (null != var2) {
                  gd.field_kb[1] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("instructions_pages,2", -71);
                if (null != var2) {
                  gd.field_kb[2] = sc.a((byte) 121, var2);
                }
                var2 = tj.a("instructions_pages,3", param1 - 146);
                if (null != var2) {
                  gd.field_kb[3] = sc.a((byte) 109, var2);
                }
                var2 = tj.a("instructions_pages,4", -113);
                if (null != var2) {
                  gd.field_kb[4] = sc.a((byte) 93, var2);
                }
                var2 = tj.a("instructions_pages,5", param1 ^ -124);
                if (var2 != null) {
                  gd.field_kb[5] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("instructions_pages,6", -107);
                if (null != var2) {
                  gd.field_kb[6] = sc.a((byte) 87, var2);
                }
                var2 = tj.a("instructions_pages,7", param1 ^ -114);
                if (var2 != null) {
                  gd.field_kb[7] = sc.a((byte) 106, var2);
                }
                var2 = tj.a("instructions_pages,8", -79);
                if (null != var2) {
                  gd.field_kb[8] = sc.a((byte) 125, var2);
                }
                var2 = tj.a("instructions_pages,9", -96);
                if (var2 != null) {
                  gd.field_kb[9] = sc.a((byte) 86, var2);
                }
                var2 = tj.a("instructions_pages,10", -76);
                if (var2 != null) {
                  gd.field_kb[10] = sc.a((byte) 103, var2);
                }
                var2 = tj.a("instructions_pages,11", param1 ^ -101);
                if (var2 != null) {
                  gd.field_kb[11] = sc.a((byte) 110, var2);
                }
                var2 = tj.a("instructions_pages,12", -121);
                if (var2 != null) {
                  gd.field_kb[12] = sc.a((byte) 122, var2);
                }
                var2 = tj.a("yourname", param1 ^ -76);
                if (null != var2) {
                  k.field_p = sc.a((byte) 107, var2);
                }
                var2 = tj.a("castingspace", param1 - 97);
                if (var2 != null) {
                  li.field_I = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellbook_membersonly", -73);
                if (null != var2) {
                  qe.field_r = sc.a((byte) 107, var2);
                }
                var2 = tj.a("rated_membersonly", -127);
                if (var2 != null) {
                  dg.field_t = sc.a((byte) 118, var2);
                }
                var2 = tj.a("wands_membersonly", -101);
                if (var2 != null) {
                  tk.field_o = sc.a((byte) 91, var2);
                }
                var2 = tj.a("youhavenoplatipusesavailaible", param1 ^ -113);
                if (null != var2) {
                  aa.field_j = sc.a((byte) 114, var2);
                }
                var2 = tj.a("playratedgamesgoshdarnit", -109);
                if (null != var2) {
                  rl.field_i = sc.a((byte) 94, var2);
                }
                var2 = tj.a("wandsavail", -87);
                if (var2 != null) {
                  ug.field_l = sc.a((byte) 89, var2);
                }
                var2 = tj.a("playmoregames", -115);
                if (null != var2) {
                  ic.field_b = sc.a((byte) 124, var2);
                }
                var2 = tj.a("nowands", param1 ^ -104);
                if (null != var2) {
                  jl.field_l = sc.a((byte) 109, var2);
                }
                var2 = tj.a("wandsspace", -80);
                if (var2 != null) {
                  mh.field_I = sc.a((byte) 97, var2);
                }
                var2 = tj.a("timetickingdown", -113);
                if (null != var2) {
                  im.field_i = sc.a((byte) 119, var2);
                }
                var2 = tj.a("dsc7", -98);
                if (var2 != null) {
                  kj.field_d = sc.a((byte) 126, var2);
                }
                var2 = tj.a("tit7", -114);
                if (null != var2) {
                  bm.field_c = sc.a((byte) 105, var2);
                }
                var2 = tj.a("dsc6", -124);
                if (null != var2) {
                  na.field_lc = sc.a((byte) 86, var2);
                }
                var2 = tj.a("tit6", param1 ^ -93);
                if (var2 != null) {
                  gn.field_j = sc.a((byte) 125, var2);
                }
                var2 = tj.a("dsc5", -113);
                if (var2 != null) {
                  bj.field_pb = sc.a((byte) 125, var2);
                }
                var2 = tj.a("tit5", -121);
                if (null != var2) {
                  ih.field_a = sc.a((byte) 110, var2);
                }
                var2 = tj.a("dsc4", param1 - 117);
                if (var2 != null) {
                  lm.field_h = sc.a((byte) 94, var2);
                }
                var2 = tj.a("tit4", -90);
                if (null != var2) {
                  gj.field_b = sc.a((byte) 118, var2);
                }
                var2 = tj.a("dsc3", -70);
                if (null != var2) {
                  gi.field_h = sc.a((byte) 99, var2);
                }
                var2 = tj.a("tit3", param1 - 94);
                if (null != var2) {
                  hn.field_c = sc.a((byte) 111, var2);
                }
                var2 = tj.a("dsc2", -109);
                if (null != var2) {
                  pc.field_f = sc.a((byte) 89, var2);
                }
                var2 = tj.a("tit2", param1 ^ -82);
                if (var2 != null) {
                  mg.field_F = sc.a((byte) 123, var2);
                }
                var2 = tj.a("dsc1", -128);
                if (null != var2) {
                  gm.field_b = sc.a((byte) 126, var2);
                }
                var2 = tj.a("tit1", param1 ^ -66);
                if (var2 != null) {
                  rj.field_d = sc.a((byte) 96, var2);
                }
                var2 = tj.a("dsc0", -115);
                if (null != var2) {
                  jo.field_d = sc.a((byte) 124, var2);
                }
                var2 = tj.a("tit0", -85);
                if (null != var2) {
                  aj.field_f = sc.a((byte) 92, var2);
                }
                var2 = tj.a("clicktobuybook", -87);
                if (var2 != null) {
                  ij.field_Ob = sc.a((byte) 97, var2);
                }
                var2 = tj.a("getmorewands", -115);
                if (null != var2) {
                  mb.field_R = sc.a((byte) 124, var2);
                }
                var2 = tj.a("getmorewands_free", -76);
                if (var2 != null) {
                  nf.field_yb = sc.a((byte) 111, var2);
                }
                var2 = tj.a("wandstobuy5", param1 - 95);
                if (var2 != null) {
                  aj.field_b = sc.a((byte) 92, var2);
                }
                var2 = tj.a("overdisc2", -117);
                if (var2 != null) {
                  wd.field_k = sc.a((byte) 108, var2);
                }
                var2 = tj.a("underdisc2", -71);
                if (var2 != null) {
                  jk.field_v = sc.a((byte) 122, var2);
                }
                var2 = tj.a("frostdisc2", -111);
                if (var2 != null) {
                  ie.field_Jb = sc.a((byte) 96, var2);
                }
                var2 = tj.a("stormdisc2", -75);
                if (null != var2) {
                  ec.field_h = sc.a((byte) 110, var2);
                }
                var2 = tj.a("stonedisc2", -119);
                if (var2 != null) {
                  sb.field_d = sc.a((byte) 90, var2);
                }
                var2 = tj.a("naturedisc2", -84);
                if (var2 != null) {
                  dg.field_q = sc.a((byte) 107, var2);
                }
                var2 = tj.a("oceandisc2", -104);
                if (null != var2) {
                  q.field_H = sc.a((byte) 121, var2);
                }
                var2 = tj.a("level3locked", -124);
                if (null != var2) {
                  vl.field_k = sc.a((byte) 104, var2);
                }
                var2 = tj.a("thisislevel2locked", -113);
                if (null != var2) {
                  jf.field_f = sc.a((byte) 95, var2);
                }
                var2 = tj.a("overdisc", param1 - 120);
                if (null != var2) {
                  gi.field_f = sc.a((byte) 116, var2);
                }
                var2 = tj.a("overbook", -104);
                if (null != var2) {
                  ej.field_M = sc.a((byte) 86, var2);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = tj.a("underidsc", -73);
                if (null != var2) {
                  pk.field_g = sc.a((byte) 86, var2);
                }
                var2 = tj.a("underbook", param1 ^ -127);
                if (null != var2) {
                  ad.field_g = sc.a((byte) 92, var2);
                }
                var2 = tj.a("frostdisc", -113);
                if (var2 != null) {
                  tk.field_r = sc.a((byte) 103, var2);
                }
                var2 = tj.a("frostbook", -70);
                if (null != var2) {
                  fh.field_d = sc.a((byte) 126, var2);
                }
                var2 = tj.a("stormdisc", -100);
                if (var2 != null) {
                  hm.field_d = sc.a((byte) 88, var2);
                }
                var2 = tj.a("stormbook", -101);
                if (var2 != null) {
                  df.field_x = sc.a((byte) 120, var2);
                }
                var2 = tj.a("stonedisc", -99);
                if (var2 != null) {
                  ri.field_d = sc.a((byte) 91, var2);
                }
                var2 = tj.a("stonebook", param1 - 93);
                if (var2 != null) {
                  io.field_z = sc.a((byte) 97, var2);
                }
                var2 = tj.a("flamedisc", -88);
                if (null != var2) {
                  j.field_b = sc.a((byte) 114, var2);
                }
                var2 = tj.a("flamebook", -82);
                if (var2 != null) {
                  gd.field_qb = sc.a((byte) 101, var2);
                }
                var2 = tj.a("arcanedisc", -82);
                if (null != var2) {
                  ld.field_k = sc.a((byte) 113, var2);
                }
                var2 = tj.a("arcanebook", -98);
                if (null != var2) {
                  ee.field_c = sc.a((byte) 90, var2);
                }
                var2 = tj.a("naturedisc", param1 ^ -124);
                if (null != var2) {
                  tk.field_w = sc.a((byte) 123, var2);
                }
                if (param1 != 22) {
                  field_e = (String) null;
                }
                var2 = tj.a("naturebook", param1 - 93);
                if (null != var2) {
                  nf.field_e = sc.a((byte) 101, var2);
                }
                var2 = tj.a("oceandisc", -93);
                if (null != var2) {
                  mi.field_s = sc.a((byte) 95, var2);
                }
                var2 = tj.a("oceanbook", -92);
                if (null != var2) {
                  oo.field_r = sc.a((byte) 117, var2);
                }
                var2 = tj.a("cogsdisc", param1 ^ -101);
                if (var2 != null) {
                  uk.field_f = sc.a((byte) 89, var2);
                }
                var2 = tj.a("cogsbook", -107);
                if (var2 != null) {
                  j.field_c = sc.a((byte) 102, var2);
                }
                var2 = tj.a("choosespellsmoredetail", -84);
                if (var2 != null) {
                  tn.field_Ib = sc.a((byte) 94, var2);
                }
                var2 = tj.a("choosespells", -111);
                if (null != var2) {
                  vl.field_l = sc.a((byte) 121, var2);
                }
                var2 = tj.a("buyfor3", -86);
                if (null != var2) {
                  ej.field_P = sc.a((byte) 117, var2);
                }
                var2 = tj.a("buyfor2", -116);
                if (null != var2) {
                  gi.field_l = sc.a((byte) 99, var2);
                }
                var2 = tj.a("notenoughwands", param1 - 137);
                if (null != var2) {
                  jk.field_d = sc.a((byte) 104, var2);
                }
                var2 = tj.a("buyasmember", param1 ^ -107);
                if (var2 != null) {
                  gg.field_g = sc.a((byte) 88, var2);
                }
                var2 = tj.a("spellbooknotpur", param1 - 94);
                if (null != var2) {
                  ra.field_i = sc.a((byte) 90, var2);
                }
                var2 = tj.a("spellbooknotaquired", -118);
                if (var2 != null) {
                  vf.field_h = sc.a((byte) 125, var2);
                }
                var2 = tj.a("chosesspells", -115);
                if (var2 != null) {
                  tc.field_F = sc.a((byte) 118, var2);
                }
                var2 = tj.a("sort1", -74);
                if (null != var2) {
                  ij.field_Cb = sc.a((byte) 125, var2);
                }
                var2 = tj.a("sort0", -96);
                if (var2 != null) {
                  me.field_N = sc.a((byte) 112, var2);
                }
                var2 = tj.a("waitingforawards", -99);
                if (var2 != null) {
                  nj.field_b = sc.a((byte) 117, var2);
                }
                var2 = tj.a("mostbounce", -76);
                if (var2 != null) {
                  gk.field_a = sc.a((byte) 107, var2);
                }
                var2 = tj.a("mostfit", -108);
                if (var2 != null) {
                  rk.field_S = sc.a((byte) 108, var2);
                }
                var2 = tj.a("mosthonor", -109);
                if (var2 != null) {
                  nj.field_i = sc.a((byte) 98, var2);
                }
                var2 = tj.a("mostcruel", -98);
                if (null != var2) {
                  gi.field_i = sc.a((byte) 115, var2);
                }
                var2 = tj.a("mostresil", -111);
                if (var2 != null) {
                  co.field_b = sc.a((byte) 95, var2);
                }
                var2 = tj.a("minionmaster", -101);
                if (var2 != null) {
                  ao.field_a = sc.a((byte) 98, var2);
                }
                var2 = tj.a("dragonmaster", -108);
                if (var2 != null) {
                  ob.field_X = sc.a((byte) 118, var2);
                }
                var2 = tj.a("impmaster", param1 ^ -76);
                if (var2 != null) {
                  ed.field_Eb = sc.a((byte) 109, var2);
                }
                var2 = tj.a("mostcrap", -72);
                if (var2 != null) {
                  wk.field_h = sc.a((byte) 125, var2);
                }
                var2 = tj.a("mostwet", param1 - 147);
                if (null != var2) {
                  q.field_J = sc.a((byte) 119, var2);
                }
                var2 = tj.a("mostskill", -107);
                if (var2 != null) {
                  be.field_a = sc.a((byte) 111, var2);
                }
                var2 = tj.a("mostkill", -86);
                if (var2 != null) {
                  tl.field_e = sc.a((byte) 90, var2);
                }
                var2 = tj.a("mostminion", -124);
                if (null != var2) {
                  ej.field_N = sc.a((byte) 124, var2);
                }
                var2 = tj.a("mostannoying", param1 ^ -110);
                if (null != var2) {
                  qa.field_p = sc.a((byte) 103, var2);
                }
                var2 = tj.a("mostpower", -103);
                if (null != var2) {
                  tm.field_e = sc.a((byte) 109, var2);
                }
                var2 = tj.a("mostdamage", param1 - 131);
                if (var2 != null) {
                  lo.field_v = sc.a((byte) 120, var2);
                }
                var2 = tj.a("mostzombiemonkies", -72);
                if (null != var2) {
                  lj.field_q = sc.a((byte) 101, var2);
                }
                var2 = tj.a("gameoutoftime", param1 - 141);
                if (null != var2) {
                  ff.field_d = sc.a((byte) 114, var2);
                }
                var2 = tj.a("drawgame", -98);
                if (null != var2) {
                  th.field_a = sc.a((byte) 109, var2);
                }
                var2 = tj.a("winnerdash", -84);
                if (null != var2) {
                  rn.field_K = sc.a((byte) 116, var2);
                }
                var2 = tj.a("pressstart", -94);
                if (null != var2) {
                  qe.field_s = sc.a((byte) 115, var2);
                }
                var2 = tj.a("currentlyyourturnpressstart", -74);
                if (null != var2) {
                  ae.field_d = sc.a((byte) 118, var2);
                }
                var2 = tj.a("ins55", param1 - 95);
                if (var2 != null) {
                  ao.field_b = sc.a((byte) 95, var2);
                }
                var2 = tj.a("ins54", -72);
                if (null != var2) {
                  lo.field_t = sc.a((byte) 108, var2);
                }
                var2 = tj.a("ins53", -123);
                if (var2 != null) {
                  lm.field_d = sc.a((byte) 112, var2);
                }
                var2 = tj.a("ins52", -111);
                if (var2 != null) {
                  wn.field_A = sc.a((byte) 127, var2);
                }
                var2 = tj.a("ins51", param1 ^ -93);
                if (null != var2) {
                  sc.field_S = sc.a((byte) 110, var2);
                }
                var2 = tj.a("ins50", -122);
                if (var2 != null) {
                  oo.field_q = sc.a((byte) 94, var2);
                }
                var2 = tj.a("ins49", param1 ^ -75);
                if (null != var2) {
                  dn.field_Bb = sc.a((byte) 101, var2);
                }
                var2 = tj.a("ins48", -83);
                if (null != var2) {
                  hn.field_o = sc.a((byte) 93, var2);
                }
                var2 = tj.a("ins47", param1 - 120);
                if (var2 != null) {
                  ah.field_e = sc.a((byte) 90, var2);
                }
                var2 = tj.a("ins46", -119);
                if (var2 != null) {
                  rk.field_J = sc.a((byte) 93, var2);
                }
                var2 = tj.a("ins45", -124);
                if (var2 != null) {
                  kn.field_pb = sc.a((byte) 119, var2);
                }
                var2 = tj.a("ins44", -97);
                if (null != var2) {
                  na.field_Tb = sc.a((byte) 103, var2);
                }
                var2 = tj.a("ins43", -105);
                if (var2 != null) {
                  ne.field_j = sc.a((byte) 100, var2);
                }
                var2 = tj.a("ins42", -109);
                if (null != var2) {
                  an.field_m = sc.a((byte) 95, var2);
                }
                var2 = tj.a("ins41", -108);
                if (null != var2) {
                  fo.field_j = sc.a((byte) 122, var2);
                }
                var2 = tj.a("ins40", -125);
                if (var2 != null) {
                  an.field_n = sc.a((byte) 117, var2);
                }
                var2 = tj.a("spacewands", -124);
                if (var2 != null) {
                  dk.field_g = sc.a((byte) 86, var2);
                }
                var2 = tj.a("spacewand", param1 - 97);
                if (null != var2) {
                  wn.field_x = sc.a((byte) 118, var2);
                }
                var2 = tj.a("ins39", param1 - 122);
                if (null != var2) {
                  hh.field_a = sc.a((byte) 102, var2);
                }
                var2 = tj.a("ins38", -103);
                if (var2 != null) {
                  km.field_b = sc.a((byte) 91, var2);
                }
                var2 = tj.a("ins37", -75);
                if (var2 != null) {
                  i.field_h = sc.a((byte) 110, var2);
                }
                var2 = tj.a("ins36", -115);
                if (var2 != null) {
                  tn.field_Kb = sc.a((byte) 121, var2);
                }
                var2 = tj.a("ins35", -77);
                if (null != var2) {
                  tk.field_m = sc.a((byte) 121, var2);
                }
                var2 = tj.a("ins34", -119);
                if (var2 != null) {
                  oa.field_b = sc.a((byte) 100, var2);
                }
                var2 = tj.a("ins33", param1 - 111);
                if (null != var2) {
                  hc.field_a = sc.a((byte) 106, var2);
                }
                var2 = tj.a("ins32", -106);
                if (null != var2) {
                  u.field_m = sc.a((byte) 89, var2);
                }
                var2 = tj.a("ins31", -117);
                if (var2 != null) {
                  lh.field_h = sc.a((byte) 107, var2);
                }
                var2 = tj.a("ins30", -87);
                if (null != var2) {
                  ue.field_a = sc.a((byte) 110, var2);
                }
                var2 = tj.a("ins29", -92);
                if (null != var2) {
                  n.field_e = sc.a((byte) 93, var2);
                }
                var2 = tj.a("ins28", param1 ^ -68);
                if (null != var2) {
                  jd.field_e = sc.a((byte) 86, var2);
                }
                var2 = tj.a("ins27", -76);
                if (var2 != null) {
                  me.field_P = sc.a((byte) 126, var2);
                }
                var2 = tj.a("ins26", -120);
                if (var2 != null) {
                  gb.field_e = sc.a((byte) 124, var2);
                }
                var2 = tj.a("ins26b", -114);
                if (var2 != null) {
                  jn.field_b = sc.a((byte) 112, var2);
                }
                var2 = tj.a("ins25", -88);
                if (var2 != null) {
                  om.field_L = sc.a((byte) 96, var2);
                }
                var2 = tj.a("ins24", -121);
                if (var2 != null) {
                  sn.field_J = sc.a((byte) 106, var2);
                }
                var2 = tj.a("ins23", -108);
                if (var2 != null) {
                  rc.field_f = sc.a((byte) 122, var2);
                }
                var2 = tj.a("ins22", -103);
                if (var2 != null) {
                  hn.field_i = sc.a((byte) 110, var2);
                }
                var2 = tj.a("ins21", -103);
                if (var2 != null) {
                  qj.field_b = sc.a((byte) 106, var2);
                }
                var2 = tj.a("ins20", -127);
                if (null != var2) {
                  jf.field_i = sc.a((byte) 113, var2);
                }
                var2 = tj.a("ins19", param1 - 147);
                if (var2 != null) {
                  am.field_b = sc.a((byte) 99, var2);
                }
                var2 = tj.a("ins18", -111);
                if (null != var2) {
                  mn.field_q = sc.a((byte) 125, var2);
                }
                var2 = tj.a("ins17", -97);
                if (var2 != null) {
                  oj.field_a = sc.a((byte) 115, var2);
                }
                var2 = tj.a("ins16", -105);
                if (null != var2) {
                  ma.field_S = sc.a((byte) 121, var2);
                }
                var2 = tj.a("ins15", -91);
                if (null != var2) {
                  lc.field_o = sc.a((byte) 124, var2);
                }
                var2 = tj.a("ins14", -123);
                if (var2 != null) {
                  p.field_h = sc.a((byte) 116, var2);
                }
                var2 = tj.a("ins13", -85);
                if (var2 != null) {
                  pm.field_g = sc.a((byte) 106, var2);
                }
                var2 = tj.a("ins12", param1 - 108);
                if (null != var2) {
                  cf.field_e = sc.a((byte) 123, var2);
                }
                var2 = tj.a("ins11", -111);
                if (null != var2) {
                  lf.field_d = sc.a((byte) 108, var2);
                }
                var2 = tj.a("ins10", -78);
                if (null != var2) {
                  vf.field_p = sc.a((byte) 127, var2);
                }
                var2 = tj.a("ins9", param1 ^ -76);
                if (var2 != null) {
                  ch.field_e = sc.a((byte) 103, var2);
                }
                var2 = tj.a("ins8", -90);
                if (var2 != null) {
                  cc.field_b = sc.a((byte) 126, var2);
                }
                var2 = tj.a("ins7", -79);
                if (var2 != null) {
                  qm.field_l = sc.a((byte) 105, var2);
                }
                var2 = tj.a("ins6", -94);
                if (var2 != null) {
                  md.field_e = sc.a((byte) 99, var2);
                }
                var2 = tj.a("ins5", -97);
                if (null != var2) {
                  fj.field_g = sc.a((byte) 103, var2);
                }
                var2 = tj.a("ins4", -99);
                if (var2 != null) {
                  fd.field_c = sc.a((byte) 119, var2);
                }
                var2 = tj.a("ins3", -77);
                if (var2 != null) {
                  cn.field_J = sc.a((byte) 115, var2);
                }
                var2 = tj.a("ins3_free", param1 - 112);
                if (var2 != null) {
                  cb.field_d = sc.a((byte) 117, var2);
                }
                var2 = tj.a("ins2", -120);
                if (null != var2) {
                  ud.field_u = sc.a((byte) 94, var2);
                }
                var2 = tj.a("ins1", -76);
                if (var2 != null) {
                  nj.field_j = sc.a((byte) 107, var2);
                }
                var2 = tj.a("ins0", -112);
                if (null != var2) {
                  wm.field_J = sc.a((byte) 118, var2);
                }
                var2 = tj.a("skincolour", param1 - 99);
                if (var2 != null) {
                  ka.field_l = sc.a((byte) 91, var2);
                }
                var2 = tj.a("haircolour", param1 - 133);
                if (var2 != null) {
                  th.field_j = sc.a((byte) 94, var2);
                }
                var2 = tj.a("secondarycolour", param1 ^ -103);
                if (null != var2) {
                  ce.field_j = sc.a((byte) 98, var2);
                }
                var2 = tj.a("primarycolour", -116);
                if (var2 != null) {
                  gg.field_f = sc.a((byte) 111, var2);
                }
                var2 = tj.a("pressentertocont", -116);
                if (var2 != null) {
                  sk.field_c = sc.a((byte) 91, var2);
                }
                var2 = tj.a("rechargespell", -104);
                if (null != var2) {
                  mj.field_x = sc.a((byte) 121, var2);
                }
                var2 = tj.a("chargeleft", -100);
                if (null != var2) {
                  tc.field_z = sc.a((byte) 88, var2);
                }
                var2 = tj.a("chargesleft", -91);
                if (var2 != null) {
                  tk.field_s = sc.a((byte) 107, var2);
                }
                var2 = tj.a("turnleft", param1 - 105);
                if (var2 != null) {
                  tg.field_g = sc.a((byte) 122, var2);
                }
                var2 = tj.a("turnsleft", -72);
                if (var2 != null) {
                  ki.field_x = sc.a((byte) 110, var2);
                }
                var2 = tj.a("licheblocks", -128);
                if (var2 != null) {
                  oi.field_a = sc.a((byte) 102, var2);
                }
                var2 = tj.a("unitcapreached", -108);
                if (var2 != null) {
                  tk.field_p = sc.a((byte) 104, var2);
                }
                var2 = tj.a("shiningpowerblocks", -106);
                if (var2 != null) {
                  bj.field_sb = sc.a((byte) 116, var2);
                }
                var2 = tj.a("alreadycastled", -94);
                if (null != var2) {
                  qa.field_k = sc.a((byte) 111, var2);
                }
                var2 = tj.a("togglehelp", -116);
                if (null != var2) {
                  mk.field_L = sc.a((byte) 109, var2);
                }
                var2 = tj.a("verses", param1 - 123);
                if (var2 != null) {
                  sb.field_c = sc.a((byte) 95, var2);
                }
                var2 = tj.a("tut53", -82);
                if (null != var2) {
                  q.field_F = sc.a((byte) 97, var2);
                }
                var2 = tj.a("tut52", -107);
                if (var2 != null) {
                  oc.field_h = sc.a((byte) 123, var2);
                }
                var2 = tj.a("tut51", param1 - 121);
                if (var2 != null) {
                  vd.field_j = sc.a((byte) 88, var2);
                }
                var2 = tj.a("tut50", -111);
                if (var2 != null) {
                  mo.field_l = sc.a((byte) 120, var2);
                }
                var2 = tj.a("tut49", -112);
                if (var2 != null) {
                  bb.field_d = sc.a((byte) 119, var2);
                }
                var2 = tj.a("tut48", param1 - 123);
                if (null != var2) {
                  jl.field_e = sc.a((byte) 110, var2);
                }
                var2 = tj.a("tut47", -102);
                if (null != var2) {
                  fk.field_i = sc.a((byte) 97, var2);
                }
                var2 = tj.a("tut46", -93);
                if (var2 != null) {
                  bh.field_a = sc.a((byte) 108, var2);
                }
                var2 = tj.a("tut45", -79);
                if (null != var2) {
                  dc.field_g = sc.a((byte) 102, var2);
                }
                var2 = tj.a("tut44", param1 - 143);
                if (null != var2) {
                  tc.field_y = sc.a((byte) 114, var2);
                }
                var2 = tj.a("tut43", param1 - 144);
                if (null != var2) {
                  r.field_c = sc.a((byte) 118, var2);
                }
                var2 = tj.a("tut42", -70);
                if (null != var2) {
                  pa.field_f = sc.a((byte) 108, var2);
                }
                var2 = tj.a("tut41", -126);
                if (null != var2) {
                  ol.field_e = sc.a((byte) 88, var2);
                }
                var2 = tj.a("tut40", param1 ^ -124);
                if (var2 != null) {
                  to.field_o = sc.a((byte) 96, var2);
                }
                var2 = tj.a("tut39", -78);
                if (null != var2) {
                  tc.field_E = sc.a((byte) 111, var2);
                }
                var2 = tj.a("tut38", -110);
                if (null != var2) {
                  va.field_b = sc.a((byte) 121, var2);
                }
                var2 = tj.a("tut37", -101);
                if (null != var2) {
                  af.field_Cb = sc.a((byte) 113, var2);
                }
                var2 = tj.a("tut36", param1 - 136);
                if (null != var2) {
                  mk.field_M = sc.a((byte) 126, var2);
                }
                var2 = tj.a("tut35", -93);
                if (var2 != null) {
                  bm.field_a = sc.a((byte) 92, var2);
                }
                var2 = tj.a("tut34", -109);
                if (var2 != null) {
                  io.field_u = sc.a((byte) 108, var2);
                }
                var2 = tj.a("tut33", param1 - 122);
                if (var2 != null) {
                  uj.field_b = sc.a((byte) 121, var2);
                }
                var2 = tj.a("tut32", -96);
                if (null != var2) {
                  jd.field_c = sc.a((byte) 122, var2);
                }
                var2 = tj.a("tut31", param1 - 108);
                if (var2 != null) {
                  eb.field_c = sc.a((byte) 112, var2);
                }
                var2 = tj.a("tut30", -92);
                if (null != var2) {
                  ui.field_u = sc.a((byte) 114, var2);
                }
                var2 = tj.a("tut29", param1 - 137);
                if (var2 != null) {
                  ub.field_f = sc.a((byte) 109, var2);
                }
                var2 = tj.a("tut28", param1 ^ -106);
                if (var2 != null) {
                  gh.field_o = sc.a((byte) 113, var2);
                }
                var2 = tj.a("tut27", param1 - 147);
                if (var2 != null) {
                  e.field_D = sc.a((byte) 104, var2);
                }
                var2 = tj.a("tut26", -107);
                if (null != var2) {
                  gn.field_f = sc.a((byte) 105, var2);
                }
                var2 = tj.a("tut25", -115);
                if (null != var2) {
                  ag.field_x = sc.a((byte) 110, var2);
                }
                var2 = tj.a("tut24", -88);
                if (var2 != null) {
                  qe.field_n = sc.a((byte) 119, var2);
                }
                var2 = tj.a("tut23", param1 - 97);
                if (var2 != null) {
                  be.field_h = sc.a((byte) 108, var2);
                }
                var2 = tj.a("tut22", -99);
                if (null != var2) {
                  qn.field_jb = sc.a((byte) 90, var2);
                }
                var2 = tj.a("tut21", -119);
                if (null != var2) {
                  nb.field_f = sc.a((byte) 115, var2);
                }
                var2 = tj.a("tut20", -71);
                if (null != var2) {
                  lh.field_d = sc.a((byte) 96, var2);
                }
                var2 = tj.a("tut19", param1 ^ -128);
                if (var2 != null) {
                  ra.field_g = sc.a((byte) 92, var2);
                }
                var2 = tj.a("tut18", -84);
                if (null != var2) {
                  tf.field_h = sc.a((byte) 122, var2);
                }
                var2 = tj.a("tut17", param1 - 96);
                if (var2 != null) {
                  ub.field_d = sc.a((byte) 119, var2);
                }
                var2 = tj.a("tut16", -121);
                if (null != var2) {
                  nj.field_h = sc.a((byte) 94, var2);
                }
                var2 = tj.a("tut15", -92);
                if (var2 != null) {
                  mk.field_N = sc.a((byte) 111, var2);
                }
                var2 = tj.a("tut14", -92);
                if (null != var2) {
                  td.field_D = sc.a((byte) 120, var2);
                }
                var2 = tj.a("tut13", param1 - 124);
                if (var2 != null) {
                  wi.field_i = sc.a((byte) 115, var2);
                }
                var2 = tj.a("tut12", -90);
                if (null != var2) {
                  vi.field_D = sc.a((byte) 97, var2);
                }
                var2 = tj.a("tut11", param1 - 146);
                if (var2 != null) {
                  ke.field_E = sc.a((byte) 109, var2);
                }
                var2 = tj.a("tut10", -77);
                if (var2 != null) {
                  mk.field_R = sc.a((byte) 86, var2);
                }
                var2 = tj.a("tut9", -116);
                if (null != var2) {
                  ie.field_Mb = sc.a((byte) 110, var2);
                }
                var2 = tj.a("tut8", -122);
                if (null != var2) {
                  re.field_m = sc.a((byte) 118, var2);
                }
                var2 = tj.a("tut7", -123);
                if (null != var2) {
                  kj.field_f = sc.a((byte) 100, var2);
                }
                var2 = tj.a("tut6", -75);
                if (null != var2) {
                  oi.field_b = sc.a((byte) 90, var2);
                }
                var2 = tj.a("tut5", param1 ^ -79);
                if (null != var2) {
                  sk.field_i = sc.a((byte) 121, var2);
                }
                var2 = tj.a("tut4", -96);
                if (null != var2) {
                  ej.field_Q = sc.a((byte) 114, var2);
                }
                var2 = tj.a("tut3", -99);
                if (var2 != null) {
                  we.field_a = sc.a((byte) 117, var2);
                }
                var2 = tj.a("tut2", -125);
                if (null != var2) {
                  ic.field_c = sc.a((byte) 110, var2);
                }
                var2 = tj.a("tut1", param1 ^ -106);
                if (null != var2) {
                  ab.field_s = sc.a((byte) 99, var2);
                }
                var2 = tj.a("tut0", -102);
                if (var2 != null) {
                  vc.field_f = sc.a((byte) 99, var2);
                }
                var2 = tj.a("youfallenintowater4", -85);
                if (null != var2) {
                  bc.field_a = sc.a((byte) 115, var2);
                }
                var2 = tj.a("youfallenintowater3", param1 - 145);
                if (null != var2) {
                  ck.field_g = sc.a((byte) 92, var2);
                }
                var2 = tj.a("youfallenintowater2", -108);
                if (var2 != null) {
                  ml.field_K = sc.a((byte) 105, var2);
                }
                var2 = tj.a("youfallenintowater", -106);
                if (null != var2) {
                  in.field_Kb = sc.a((byte) 107, var2);
                }
                var2 = tj.a("timeleftcolon", param1 - 111);
                if (var2 != null) {
                  co.field_i = sc.a((byte) 86, var2);
                }
                var2 = tj.a("unpack10", param1 ^ -78);
                if (var2 != null) {
                  md.field_d = sc.a((byte) 112, var2);
                }
                var2 = tj.a("unpack9", param1 - 120);
                if (null != var2) {
                  mn.field_v = sc.a((byte) 120, var2);
                }
                var2 = tj.a("unpack8", -79);
                if (null != var2) {
                  fl.field_c = sc.a((byte) 86, var2);
                }
                var2 = tj.a("unpack7", -103);
                if (null != var2) {
                  ld.field_j = sc.a((byte) 119, var2);
                }
                var2 = tj.a("unpack6", -74);
                if (var2 != null) {
                  fe.field_m = sc.a((byte) 91, var2);
                }
                var2 = tj.a("unpack5", -125);
                if (null != var2) {
                  wh.field_j = sc.a((byte) 97, var2);
                }
                var2 = tj.a("unpack4", -126);
                if (var2 != null) {
                  ba.field_b = sc.a((byte) 88, var2);
                }
                var2 = tj.a("unpack3", -80);
                if (var2 != null) {
                  go.field_h = sc.a((byte) 126, var2);
                }
                var2 = tj.a("unpacknature", param1 ^ -96);
                if (null != var2) {
                  tl.field_g = sc.a((byte) 100, var2);
                }
                var2 = tj.a("unpackocean", -99);
                if (var2 != null) {
                  lo.field_s = sc.a((byte) 101, var2);
                }
                var2 = tj.a("unpackcogs", -83);
                if (null != var2) {
                  ma.field_I = sc.a((byte) 118, var2);
                }
                var2 = tj.a("unpack2", -85);
                if (null != var2) {
                  vm.field_f = sc.a((byte) 112, var2);
                }
                var2 = tj.a("unpace1", -98);
                if (var2 != null) {
                  ee.field_a = sc.a((byte) 107, var2);
                }
                var2 = tj.a("unpack0", -89);
                if (var2 != null) {
                  vi.field_Q = sc.a((byte) 97, var2);
                }
                var2 = tj.a("hahahiddenisthis", -118);
                if (var2 != null) {
                  wk.field_k = sc.a((byte) 123, var2);
                }
                var2 = tj.a("blueteam", param1 - 142);
                if (var2 != null) {
                  cn.field_I = sc.a((byte) 87, var2);
                }
                var2 = tj.a("redteam", -121);
                if (null != var2) {
                  b.field_d = sc.a((byte) 94, var2);
                }
                var2 = tj.a("rumrumrum", -100);
                if (null != var2) {
                  uh.field_l = sc.a((byte) 114, var2);
                }
                var2 = tj.a("mosletitle", -119);
                if (var2 != null) {
                  b.field_c = sc.a((byte) 126, var2);
                }
                var2 = tj.a("skycastlepower", param1 - 109);
                if (null != var2) {
                  qj.field_f = sc.a((byte) 109, var2);
                }
                var2 = tj.a("skycastletitle", -119);
                if (null != var2) {
                  ck.field_c = sc.a((byte) 102, var2);
                }
                var2 = tj.a("summonclickonscreen", -87);
                if (null != var2) {
                  vn.field_a = sc.a((byte) 87, var2);
                }
                var2 = tj.a("timetimetime", -111);
                if (null != var2) {
                  mf.field_e = sc.a((byte) 101, var2);
                }
                var2 = tj.a("yaywecanswim", param1 ^ -103);
                if (null != var2) {
                  fg.field_i = sc.a((byte) 104, var2);
                }
                var2 = tj.a("natureisgoodaswell", -128);
                if (null != var2) {
                  dk.field_f = sc.a((byte) 87, var2);
                }
                var2 = tj.a("morehealingwtf", param1 - 112);
                if (var2 != null) {
                  pb.field_l = sc.a((byte) 97, var2);
                }
                var2 = tj.a("respawnpoint", -108);
                if (null != var2) {
                  sl.field_M = sc.a((byte) 96, var2);
                }
                var2 = tj.a("bouncyminions", -114);
                if (var2 != null) {
                  pk.field_b = sc.a((byte) 124, var2);
                }
                var2 = tj.a("speedsrecharges", -128);
                if (var2 != null) {
                  lc.field_p = sc.a((byte) 103, var2);
                }
                var2 = tj.a("damageresist", -82);
                if (null != var2) {
                  ik.field_a = sc.a((byte) 123, var2);
                }
                var2 = tj.a("flamup", param1 - 121);
                if (var2 != null) {
                  uh.field_q = sc.a((byte) 121, var2);
                }
                var2 = tj.a("familarpowers", -85);
                if (var2 != null) {
                  nb.field_c = sc.a((byte) 100, var2);
                }
                var2 = tj.a("mustbeamemeberforanimals", param1 ^ -78);
                if (var2 != null) {
                  kc.field_M = sc.a((byte) 114, var2);
                }
                var2 = tj.a("famtitle", param1 ^ -67);
                if (null != var2) {
                  db.field_d = sc.a((byte) 119, var2);
                }
                var2 = tj.a("tp4", -87);
                if (null != var2) {
                  va.field_a = sc.a((byte) 89, var2);
                }
                var2 = tj.a("tp3", -123);
                if (null != var2) {
                  nm.field_d = sc.a((byte) 127, var2);
                }
                var2 = tj.a("tp2", -95);
                if (null != var2) {
                  jl.field_f = sc.a((byte) 117, var2);
                }
                var2 = tj.a("tp0", -96);
                if (null != var2) {
                  hl.field_i = sc.a((byte) 88, var2);
                }
                var2 = tj.a("tptitle", -97);
                if (var2 != null) {
                  gl.field_a = sc.a((byte) 119, var2);
                }
                var2 = tj.a("earnlessnowhehe", param1 - 110);
                if (var2 != null) {
                  ck.field_e = sc.a((byte) 92, var2);
                }
                var2 = tj.a("tradeinnowdammit", -85);
                if (var2 != null) {
                  vh.field_h = sc.a((byte) 104, var2);
                }
                var2 = tj.a("earnedlotstradeinnow", param1 ^ -75);
                if (null != var2) {
                  ti.field_F = sc.a((byte) 117, var2);
                }
                var2 = tj.a("youaredamagedhahaha", -72);
                if (var2 != null) {
                  qn.field_kb = sc.a((byte) 90, var2);
                }
                var2 = tj.a("sorryonlyonceperturn", -70);
                if (var2 != null) {
                  hc.field_g = sc.a((byte) 110, var2);
                }
                var2 = tj.a("nocastwhileflying", -81);
                if (var2 != null) {
                  sc.field_T = sc.a((byte) 117, var2);
                }
                var2 = tj.a("nocastvinewhileflying", -99);
                if (null != var2) {
                  rc.field_l = sc.a((byte) 109, var2);
                }
                var2 = tj.a("wateronlyspell", param1 - 150);
                if (var2 != null) {
                  bj.field_jb = sc.a((byte) 116, var2);
                }
                var2 = tj.a("arcanzeroblocks", -82);
                if (null != var2) {
                  s.field_a = sc.a((byte) 104, var2);
                }
                var2 = tj.a("youareentangled", -82);
            }
            void runChunk4() throws java.lang.RuntimeException {
                if (null != var2) {
                  sc.a((byte) 118, var2);
                }
                var2 = tj.a("levelx", -125);
                if (null != var2) {
                  bk.field_H = sc.a((byte) 121, var2);
                }
                var2 = tj.a("alreadyatmax", -108);
                if (var2 != null) {
                  rc.field_i = sc.a((byte) 98, var2);
                }
                var2 = tj.a("notenoughhp", param1 - 141);
                if (null != var2) {
                  hm.field_b = sc.a((byte) 108, var2);
                }
                var2 = tj.a("poweringupfamiliar", -75);
                if (null != var2) {
                  kj.field_b = sc.a((byte) 105, var2);
                }
                var2 = tj.a("starttut", -77);
                if (var2 != null) {
                  me.field_Q = sc.a((byte) 127, var2);
                }
                var2 = tj.a("gotosandbox", -103);
                if (var2 != null) {
                  mo.field_d = sc.a((byte) 120, var2);
                }
                var2 = tj.a("brats", -74);
                if (null != var2) {
                  ui.field_q = sc.a((byte) 119, var2);
                }
                var2 = tj.a("bwins", param1 ^ -117);
                if (var2 != null) {
                  mj.field_y = sc.a((byte) 117, var2);
                }
                var2 = tj.a("cogscaps", param1 ^ -80);
                if (var2 != null) {
                  ie.field_Rb = sc.a((byte) 106, var2);
                }
                var2 = tj.a("oceancaps", param1 - 121);
                if (null != var2) {
                  fo.field_i = sc.a((byte) 114, var2);
                }
                var2 = tj.a("naturecaps", -88);
                if (null != var2) {
                  ra.field_e = sc.a((byte) 111, var2);
                }
                var2 = tj.a("overcaps", -95);
                if (var2 != null) {
                  go.field_f = sc.a((byte) 122, var2);
                }
                var2 = tj.a("underdarkcaps", -89);
                if (null != var2) {
                  di.field_b = sc.a((byte) 127, var2);
                }
                var2 = tj.a("frostcaps", -80);
                if (var2 != null) {
                  pc.field_a = sc.a((byte) 107, var2);
                }
                var2 = tj.a("stonecaps", -85);
                if (null != var2) {
                  ra.field_b = sc.a((byte) 87, var2);
                }
                var2 = tj.a("stormcaps", -99);
                if (null != var2) {
                  hm.field_a = sc.a((byte) 90, var2);
                }
                var2 = tj.a("flamecaps", -116);
                if (var2 != null) {
                  ve.field_s = sc.a((byte) 87, var2);
                }
                var2 = tj.a("whensummoning", -121);
                if (var2 != null) {
                  kl.field_F = sc.a((byte) 109, var2);
                }
                var2 = tj.a("optionscreen", param1 - 110);
                if (var2 != null) {
                  jk.field_j = sc.a((byte) 116, var2);
                }
                gn.field_e = null;
            }
            void run() {
                var3 = ArcanistsMulti.field_G ? 1 : 0;
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
                  stackIn_3095_0 = (RuntimeException) (var2_ref);
                  stackIn_3095_1 = new StringBuilder().append("rg.A(");
                  if (param0 == null) {
                    stackIn_3096_2 = "null";
                  } else {
                    stackIn_3096_2 = "{...}";
                  }
                  throw aa.a((Throwable) ((Object) stackIn_3095_0), ((StringBuilder) (Object) stackIn_3095_1).append(stackIn_3096_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = dc.field_b;
                  var4++;
                  dc.field_b = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
        field_b = "If you are not, please change your password to something more obscure!";
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_c = "Moe";
        field_e = "Your friend list is full. Max of 100 for free users, and 200 for members.";
    }
}
