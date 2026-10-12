/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TickCounter {
    static String field_e;
    static String field_c;
    int limit;
    static String field_b;
    int elapsedTicks;
    static String field_d;

    final boolean advanceAndCheck(int obfuscationGuard) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < ~this.limit) {
            return false;
          }
          this.elapsedTicks = this.elapsedTicks + 1;
          if (this.limit <= this.elapsedTicks) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "em.D(" + obfuscationGuard + ')');
        }
    }

    final void reset(int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (obfuscationGuard != 17) {
            field_c = (String) null;
          }
          this.elapsedTicks = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "em.F(" + obfuscationGuard + ')');
        }
    }

    final static void loadClientAssets(kl archive, int obfuscationGuard) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_4826_0;
            StringBuilder stackIn_4826_1;
            String stackIn_4827_2;
            boolean stackIn_4835_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            kl param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(kl initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_4826_0 = null;
                this.stackIn_4826_1 = null;
                this.stackIn_4827_2 = null;
                this.stackIn_4835_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                sb.field_e = param0;
                var2 = fk.a(false, "player_config_login_free");
                if (var2 != null) {
                  uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "achievement_names,0");
                if (null != var2) {
                  so.field_a[0] = uu.a(var2, (byte) 48);
                }
                var2 = fk.a(false, "achievement_names,1");
                if (null != var2) {
                  so.field_a[1] = uu.a(var2, (byte) 32);
                }
                var2 = fk.a(false, "achievement_names,2");
                if (null != var2) {
                  so.field_a[2] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "achievement_names,3");
                if (var2 != null) {
                  so.field_a[3] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "achievement_names,4");
                if (null != var2) {
                  so.field_a[4] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "achievement_names,5");
                if (null != var2) {
                  so.field_a[5] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "achievement_names,6");
                if (var2 != null) {
                  so.field_a[6] = uu.a(var2, (byte) 76);
                }
                var2 = fk.a(false, "achievement_names,7");
                if (null != var2) {
                  so.field_a[7] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "achievement_names,8");
                if (var2 != null) {
                  so.field_a[8] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "achievement_names,9");
                if (var2 != null) {
                  so.field_a[9] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "achievement_names,10");
                if (null != var2) {
                  so.field_a[10] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "achievement_names,11");
                if (null != var2) {
                  so.field_a[11] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "achievement_names,12");
                if (var2 != null) {
                  so.field_a[12] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "achievement_names,13");
                if (null != var2) {
                  so.field_a[13] = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "achievement_names,14");
                if (var2 != null) {
                  so.field_a[14] = uu.a(var2, (byte) 49);
                }
                var2 = fk.a(false, "achievement_names,15");
                if (var2 != null) {
                  so.field_a[15] = uu.a(var2, (byte) 118);
                }
                var2 = fk.a(false, "achievement_names,16");
                if (null != var2) {
                  so.field_a[16] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "achievement_names,17");
                if (var2 != null) {
                  so.field_a[17] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "achievement_names,18");
                if (null != var2) {
                  so.field_a[18] = uu.a(var2, (byte) 74);
                }
                var2 = fk.a(false, "achievement_names,19");
                if (var2 != null) {
                  so.field_a[19] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "achievement_names,20");
                if (null != var2) {
                  so.field_a[20] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "achievement_names,21");
                if (null != var2) {
                  so.field_a[21] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "achievement_names,22");
                if (var2 != null) {
                  so.field_a[22] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "achievement_names,23");
                if (null != var2) {
                  so.field_a[23] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "achievement_names,24");
                if (var2 != null) {
                  so.field_a[24] = uu.a(var2, (byte) 58);
                }
                var2 = fk.a(false, "achievement_names,25");
                if (var2 != null) {
                  so.field_a[25] = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "achievement_names,26");
                if (var2 != null) {
                  so.field_a[26] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "achievement_names,27");
                if (var2 != null) {
                  so.field_a[27] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "achievement_names,28");
                if (null != var2) {
                  so.field_a[28] = uu.a(var2, (byte) 44);
                }
                var2 = fk.a(false, "achievement_names,29");
                if (var2 != null) {
                  so.field_a[29] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "achievement_names,30");
                if (var2 != null) {
                  so.field_a[30] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "achievement_names,31");
                if (var2 != null) {
                  so.field_a[31] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "achievement_names,32");
                if (var2 != null) {
                  so.field_a[32] = uu.a(var2, (byte) 9);
                }
                var2 = fk.a(false, "achievement_names,33");
                if (var2 != null) {
                  so.field_a[33] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "achievement_names,34");
                if (var2 != null) {
                  so.field_a[34] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "achievement_names,35");
                if (null != var2) {
                  so.field_a[35] = uu.a(var2, (byte) 74);
                }
                var2 = fk.a(false, "achievement_names,36");
                if (var2 != null) {
                  so.field_a[36] = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "achievement_names,37");
                if (var2 != null) {
                  so.field_a[37] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "achievement_names,38");
                if (null != var2) {
                  so.field_a[38] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "achievement_names,39");
                if (null != var2) {
                  so.field_a[39] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "achievement_names,40");
                if (var2 != null) {
                  so.field_a[40] = uu.a(var2, (byte) 2);
                }
                var2 = fk.a(false, "achievement_names,41");
                if (var2 != null) {
                  so.field_a[41] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "achievement_names,42");
                if (null != var2) {
                  so.field_a[42] = uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "achievement_names,43");
                if (null != var2) {
                  so.field_a[43] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "achievement_names,44");
                if (null != var2) {
                  so.field_a[44] = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "achievement_names,45");
                if (null != var2) {
                  so.field_a[45] = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "achievement_names,46");
                if (var2 != null) {
                  so.field_a[46] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "achievement_names,47");
                if (var2 != null) {
                  so.field_a[47] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "achievement_names,48");
                if (null != var2) {
                  so.field_a[48] = uu.a(var2, (byte) 47);
                }
                var2 = fk.a(false, "achievement_names,49");
                if (var2 != null) {
                  so.field_a[49] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "achievement_names,50");
                if (null != var2) {
                  so.field_a[50] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "achievement_names,51");
                if (var2 != null) {
                  so.field_a[51] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "achievement_names,52");
                if (null != var2) {
                  so.field_a[52] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "achievement_names,53");
                if (null != var2) {
                  so.field_a[53] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "achievement_names,54");
                if (null != var2) {
                  so.field_a[54] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "achievement_names,55");
                if (null != var2) {
                  so.field_a[55] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "achievement_criteria,0");
                if (var2 != null) {
                  oi.field_a[0] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "achievement_criteria,1");
                if (var2 != null) {
                  oi.field_a[1] = uu.a(var2, (byte) 39);
                }
                var2 = fk.a(false, "achievement_criteria,2");
                if (null != var2) {
                  oi.field_a[2] = uu.a(var2, (byte) 64);
                }
                var2 = fk.a(false, "achievement_criteria,3");
                if (null != var2) {
                  oi.field_a[3] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "achievement_criteria,4");
                if (null != var2) {
                  oi.field_a[4] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "achievement_criteria,5");
                if (var2 != null) {
                  oi.field_a[5] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "achievement_criteria,6");
                if (null != var2) {
                  oi.field_a[6] = uu.a(var2, (byte) 47);
                }
                var2 = fk.a(false, "achievement_criteria,7");
                if (null != var2) {
                  oi.field_a[7] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "achievement_criteria,8");
                if (null != var2) {
                  oi.field_a[8] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "achievement_criteria,9");
                if (var2 != null) {
                  oi.field_a[9] = uu.a(var2, (byte) 37);
                }
                var2 = fk.a(false, "achievement_criteria,10");
                if (var2 != null) {
                  oi.field_a[10] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "achievement_criteria,11");
                if (null != var2) {
                  oi.field_a[11] = uu.a(var2, (byte) 62);
                }
                var2 = fk.a(false, "achievement_criteria,12");
                if (var2 != null) {
                  oi.field_a[12] = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "achievement_criteria,13");
                if (var2 != null) {
                  oi.field_a[13] = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "achievement_criteria,14");
                if (var2 != null) {
                  oi.field_a[14] = uu.a(var2, (byte) 55);
                }
                var2 = fk.a(false, "achievement_criteria,15");
                if (null != var2) {
                  oi.field_a[15] = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "achievement_criteria,16");
                if (var2 != null) {
                  oi.field_a[16] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "achievement_criteria,17");
                if (null != var2) {
                  oi.field_a[17] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "achievement_criteria,18");
                if (var2 != null) {
                  oi.field_a[18] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "achievement_criteria,19");
                if (null != var2) {
                  oi.field_a[19] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "achievement_criteria,20");
                if (var2 != null) {
                  oi.field_a[20] = uu.a(var2, (byte) 2);
                }
                var2 = fk.a(false, "achievement_criteria,21");
                if (null != var2) {
                  oi.field_a[21] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "achievement_criteria,22");
                if (var2 != null) {
                  oi.field_a[22] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "achievement_criteria,23");
                if (null != var2) {
                  oi.field_a[23] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "achievement_criteria,24");
                if (null != var2) {
                  oi.field_a[24] = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "achievement_criteria,25");
                if (null != var2) {
                  oi.field_a[25] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "achievement_criteria,26");
                if (var2 != null) {
                  oi.field_a[26] = uu.a(var2, (byte) 38);
                }
                var2 = fk.a(false, "achievement_criteria,27");
                if (null != var2) {
                  oi.field_a[27] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "achievement_criteria,28");
                if (null != var2) {
                  oi.field_a[28] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "achievement_criteria,29");
                if (var2 != null) {
                  oi.field_a[29] = uu.a(var2, (byte) 118);
                }
                var2 = fk.a(false, "achievement_criteria,30");
                if (var2 != null) {
                  oi.field_a[30] = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "achievement_criteria,31");
                if (var2 != null) {
                  oi.field_a[31] = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "achievement_criteria,32");
                if (null != var2) {
                  oi.field_a[32] = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "achievement_criteria,33");
                if (null != var2) {
                  oi.field_a[33] = uu.a(var2, (byte) 65);
                }
                var2 = fk.a(false, "achievement_criteria,34");
                if (var2 != null) {
                  oi.field_a[34] = uu.a(var2, (byte) 84);
                }
                var2 = fk.a(false, "achievement_criteria,35");
                if (var2 != null) {
                  oi.field_a[35] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "achievement_criteria,36");
                if (var2 != null) {
                  oi.field_a[36] = uu.a(var2, (byte) 3);
                }
                var2 = fk.a(false, "achievement_criteria,37");
                if (null != var2) {
                  oi.field_a[37] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "achievement_criteria,38");
                if (var2 != null) {
                  oi.field_a[38] = uu.a(var2, (byte) 34);
                }
                var2 = fk.a(false, "achievement_criteria,39");
                if (var2 != null) {
                  oi.field_a[39] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "achievement_criteria,40");
                if (null != var2) {
                  oi.field_a[40] = uu.a(var2, (byte) 120);
                }
                var2 = fk.a(false, "achievement_criteria,41");
                if (null != var2) {
                  oi.field_a[41] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "achievement_criteria,42");
                if (var2 != null) {
                  oi.field_a[42] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "achievement_criteria,43");
                if (null != var2) {
                  oi.field_a[43] = uu.a(var2, (byte) 81);
                }
                var2 = fk.a(false, "achievement_criteria,44");
                if (null != var2) {
                  oi.field_a[44] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "achievement_criteria,45");
                if (var2 != null) {
                  oi.field_a[45] = uu.a(var2, (byte) 15);
                }
                var2 = fk.a(false, "achievement_criteria,46");
                if (var2 != null) {
                  oi.field_a[46] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "achievement_criteria,47");
                if (var2 != null) {
                  oi.field_a[47] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "achievement_criteria,48");
                if (null != var2) {
                  oi.field_a[48] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "achievement_criteria,49");
                if (null != var2) {
                  oi.field_a[49] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "achievement_criteria,50");
                if (var2 != null) {
                  oi.field_a[50] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "achievement_criteria,51");
                if (null != var2) {
                  oi.field_a[51] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "achievement_criteria,52");
                if (var2 != null) {
                  oi.field_a[52] = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "achievement_criteria,53");
                if (null != var2) {
                  oi.field_a[53] = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "achievement_criteria,54");
                if (null != var2) {
                  oi.field_a[54] = uu.a(var2, (byte) 65);
                }
                var2 = fk.a(false, "achievement_criteria,55");
                if (var2 != null) {
                  oi.field_a[55] = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "text_config_pleaselogin_free");
                if (var2 != null) {
                  r.field_G = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "text_campaign_pleaselogin_free");
                if (null != var2) {
                  bi.field_e = uu.a(var2, (byte) 4);
                }
                var2 = fk.a(false, "TXT_REQUIRES");
                if (null != var2) {
                  co.field_s = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "TXT_REQUIRESPRESTIGE");
                if (var2 != null) {
                  ll.field_Jb = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "TXT_AND");
                if (var2 != null) {
                  gk.field_L = uu.a(var2, (byte) 101);
                }
                var2 = fk.a(false, "PANTHEON_REQUIRED");
                if (var2 != null) {
                  vs.field_i = uu.a(var2, (byte) 31);
                }
                var2 = fk.a(false, "maptypes,0");
                if (null != var2) {
                  dj.field_c[0] = uu.a(var2, (byte) 29);
                }
                var2 = fk.a(false, "maptypes,1");
                if (null != var2) {
                  dj.field_c[1] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "maptypes,2");
                if (var2 != null) {
                  dj.field_c[2] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "maptypes,3");
                if (null != var2) {
                  dj.field_c[3] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "maptypes,4");
                if (var2 != null) {
                  dj.field_c[4] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "gameoptlabels,0");
                if (var2 != null) {
                  pf.field_a[0] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "gameoptlabels,1");
                if (var2 != null) {
                  pf.field_a[1] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "gameoptlabels,2");
                if (null != var2) {
                  pf.field_a[2] = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "gameoptlabels,3");
                if (var2 != null) {
                  pf.field_a[3] = uu.a(var2, (byte) 51);
                }
                var2 = fk.a(false, "gameoptlabels,4");
                if (null != var2) {
                  pf.field_a[4] = uu.a(var2, (byte) 76);
                }
                var2 = fk.a(false, "gameoptlabels,5");
                if (null != var2) {
                  pf.field_a[5] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "gameoptnames,0,0");
                if (null != var2) {
                  ku.field_L[0][0] = uu.a(var2, (byte) 56);
                }
                var2 = fk.a(false, "gameoptnames,0,1");
                if (null != var2) {
                  ku.field_L[0][1] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "gameoptnames,0,2");
                if (var2 != null) {
                  ku.field_L[0][2] = uu.a(var2, (byte) 64);
                }
                var2 = fk.a(false, "gameoptnames,0,3");
                if (var2 != null) {
                  ku.field_L[0][3] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "gameoptnames,0,4");
                if (null != var2) {
                  ku.field_L[0][4] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "gameoptnames,0,5");
                if (null != var2) {
                  ku.field_L[0][5] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "gameoptnames,0,6");
                if (null != var2) {
                  ku.field_L[0][6] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "gameoptnames,1,0");
                if (var2 != null) {
                  ku.field_L[1][0] = uu.a(var2, (byte) 39);
                }
                var2 = fk.a(false, "gameoptnames,1,1");
                if (var2 != null) {
                  ku.field_L[1][1] = uu.a(var2, (byte) 51);
                }
                var2 = fk.a(false, "gameoptnames,1,2");
                if (null != var2) {
                  ku.field_L[1][2] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "gameoptnames,1,3");
                if (var2 != null) {
                  ku.field_L[1][3] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "gameoptnames,2,0");
                if (null != var2) {
                  ku.field_L[2][0] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "gameoptnames,2,1");
                if (null != var2) {
                  ku.field_L[2][1] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "gameoptnames,2,2");
                if (null != var2) {
                  ku.field_L[2][2] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "gameoptnames,2,3");
                if (var2 != null) {
                  ku.field_L[2][3] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "gameoptnames,4,0");
                if (null != var2) {
                  ku.field_L[4][0] = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "gameoptnames,4,1");
                if (null != var2) {
                  ku.field_L[4][1] = uu.a(var2, (byte) 104);
                }
                var2 = fk.a(false, "gameoptnames,5,0");
                if (var2 != null) {
                  ku.field_L[5][0] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "gameoptnames,5,1");
                if (var2 != null) {
                  ku.field_L[5][1] = uu.a(var2, (byte) 87);
                }
                var2 = fk.a(false, "gameoptnames,5,2");
                if (var2 != null) {
                  ku.field_L[5][2] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "gameoptnames,5,3");
                if (null != var2) {
                  ku.field_L[5][3] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "gameoptnames,5,4");
                if (null != var2) {
                  ku.field_L[5][4] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "gameopttooltips,0,0");
                if (var2 != null) {
                  ki.field_d[0][0] = uu.a(var2, (byte) 105);
                }
                var2 = fk.a(false, "gameopttooltips,0,1");
                if (null != var2) {
                  ki.field_d[0][1] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "gameopttooltips,0,2");
                if (var2 != null) {
                  ki.field_d[0][2] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "gameopttooltips,0,3");
                if (null != var2) {
                  ki.field_d[0][3] = uu.a(var2, (byte) 96);
                }
                var2 = fk.a(false, "gameopttooltips,0,4");
                if (var2 != null) {
                  ki.field_d[0][4] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "gameopttooltips,0,5");
                if (var2 != null) {
                  ki.field_d[0][5] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "gameopttooltips,0,6");
                if (var2 != null) {
                  ki.field_d[0][6] = uu.a(var2, (byte) 56);
                }
                var2 = fk.a(false, "gameopttooltips,1,0");
                if (var2 != null) {
                  ki.field_d[1][0] = uu.a(var2, (byte) 31);
                }
                var2 = fk.a(false, "gameopttooltips,1,1");
                if (null != var2) {
                  ki.field_d[1][1] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "gameopttooltips,1,2");
                if (null != var2) {
                  ki.field_d[1][2] = uu.a(var2, (byte) 76);
                }
                var2 = fk.a(false, "gameopttooltips,1,3");
                if (null != var2) {
                  ki.field_d[1][3] = uu.a(var2, (byte) 24);
                }
                var2 = fk.a(false, "gameopttooltips,2,0");
                if (null != var2) {
                  ki.field_d[2][0] = uu.a(var2, (byte) 126);
                }
                var2 = fk.a(false, "gameopttooltips,2,1");
                if (null != var2) {
                  ki.field_d[2][1] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "gameopttooltips,2,2");
                if (var2 != null) {
                  ki.field_d[2][2] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "gameopttooltips,2,3");
                if (var2 != null) {
                  ki.field_d[2][3] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "gameopttooltips,3,0");
                if (null != var2) {
                  ki.field_d[3][0] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "gameopttooltips,3,1");
                if (null != var2) {
                  ki.field_d[3][1] = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "gameopttooltips,3,2");
                if (var2 != null) {
                  ki.field_d[3][2] = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "gameopttooltips,3,3");
                if (var2 != null) {
                  ki.field_d[3][3] = uu.a(var2, (byte) 64);
                }
                var2 = fk.a(false, "gameopttooltips,3,4");
                if (var2 != null) {
                  ki.field_d[3][4] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "gameopttooltips,4,0");
                if (var2 != null) {
                  ki.field_d[4][0] = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "gameopttooltips,4,1");
                if (null != var2) {
                  ki.field_d[4][1] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "gameopttooltips,5,0");
                if (null != var2) {
                  ki.field_d[5][0] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "gameopttooltips,5,1");
                if (var2 != null) {
                  ki.field_d[5][1] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "gameopttooltips,5,2");
                if (null != var2) {
                  ki.field_d[5][2] = uu.a(var2, (byte) 24);
                }
                var2 = fk.a(false, "gameopttooltips,5,3");
                if (var2 != null) {
                  ki.field_d[5][3] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "gameopttooltips,5,4");
                if (null != var2) {
                  ki.field_d[5][4] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "instructions_titles,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[0][0] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "instructions_titles,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[1][0] = uu.a(var2, (byte) 20);
                }
                var2 = fk.a(false, "instructions_titles,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[3][0] = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "instructions_titles,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[4][0] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "instructions_titles,5,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[5][0] = uu.a(var2, (byte) 53);
                }
                var2 = fk.a(false, "instructions_titles,6,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[6][0] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "instructions_titles,7,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[7][0] = uu.a(var2, (byte) 78);
                }
                var2 = fk.a(false, "instructions_titles,8,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[8][0] = uu.a(var2, (byte) 111);
                }
                var2 = fk.a(false, "instructions_titles,9,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[9][0] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "instructions_titles,9,1");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[9][1] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "instructions_titles,11,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[11][0] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "instructions_titles,12,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[12][0] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "instructions_titles,14,0");
                if (var2 != null) {
                  PortalLossCondition.instructionSectionTitles[14][0] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "instructions_titles,15,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[15][0] = uu.a(var2, (byte) 124);
                }
                var2 = fk.a(false, "instructions_titles,16,0");
                if (null != var2) {
                  PortalLossCondition.instructionSectionTitles[16][0] = uu.a(var2, (byte) 8);
                }
                var2 = fk.a(false, "instructions_subtitles,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[0][0][0] = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "instructions_subtitles,6,0,1");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[6][0][1] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "instructions_subtitles,6,0,2");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[6][0][2] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "instructions_subtitles,6,0,3");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[6][0][3] = uu.a(var2, (byte) 13);
                }
                var2 = fk.a(false, "instructions_subtitles,7,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[7][0][1] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "instructions_subtitles,7,0,2");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[7][0][2] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "instructions_subtitles,7,0,3");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[7][0][3] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "instructions_subtitles,8,0,3");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[8][0][3] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "instructions_subtitles,9,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[9][0][1] = uu.a(var2, (byte) -99);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = fk.a(false, "instructions_subtitles,9,0,2");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[9][0][2] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "instructions_subtitles,9,0,3");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[9][0][3] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "instructions_subtitles,9,0,4");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[9][0][4] = uu.a(var2, (byte) 20);
                }
                var2 = fk.a(false, "instructions_subtitles,11,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[11][0][1] = uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "instructions_subtitles,11,0,2");
                if (var2 != null) {
                  PortalLossCondition.instructionRowHeadings[11][0][2] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "instructions_subtitles,11,0,3");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[11][0][3] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "instructions_subtitles,14,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[14][0][0] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "instructions_subtitles,14,0,1");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[14][0][1] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "instructions_subtitles,14,0,2");
                if (null != var2) {
                  PortalLossCondition.instructionRowHeadings[14][0][2] = uu.a(var2, (byte) 27);
                }
                var2 = fk.a(false, "instructions_paragraphs,0,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[0][0][1][0] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "instructions_paragraphs,0,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[0][0][2][0] = uu.a(var2, (byte) 46);
                }
                var2 = fk.a(false, "instructions_paragraphs,0,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[0][0][3][0] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "instructions_paragraphs,1,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][0][0] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "instructions_paragraphs,1,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][1][0] = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "instructions_paragraphs,1,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][2][0] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "instructions_paragraphs,1,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[1][0][3][0] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "instructions_paragraphs,2,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[2][0][0][0] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "instructions_paragraphs,2,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[2][0][1][0] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "instructions_paragraphs,2,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[2][0][2][0] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "instructions_paragraphs,3,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][0][0] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "instructions_paragraphs,3,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][1][0] = uu.a(var2, (byte) 15);
                }
                var2 = fk.a(false, "instructions_paragraphs,3,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][2][0] = uu.a(var2, (byte) 114);
                }
                var2 = fk.a(false, "instructions_paragraphs,3,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[3][0][3][0] = uu.a(var2, (byte) 101);
                }
                var2 = fk.a(false, "instructions_paragraphs,3,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[3][0][4][0] = uu.a(var2, (byte) 111);
                }
                var2 = fk.a(false, "instructions_paragraphs,4,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][0][0] = uu.a(var2, (byte) 81);
                }
                var2 = fk.a(false, "instructions_paragraphs,4,0,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][1][0] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "instructions_paragraphs,4,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][2][0] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "instructions_paragraphs,4,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][3][0] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "instructions_paragraphs,4,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[4][0][4][0] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "instructions_paragraphs,5,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[5][0][0][0] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "instructions_paragraphs,5,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[5][0][1][0] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "instructions_paragraphs,5,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[5][0][2][0] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "instructions_paragraphs,5,0,5,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[5][0][5][0] = uu.a(var2, (byte) 84);
                }
                var2 = fk.a(false, "instructions_paragraphs,6,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[6][0][0][0] = uu.a(var2, (byte) 32);
                }
                var2 = fk.a(false, "instructions_paragraphs,6,0,4,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[6][0][4][0] = uu.a(var2, (byte) 111);
                }
                var2 = fk.a(false, "instructions_paragraphs,6,0,5,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[6][0][5][0] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "instructions_paragraphs,7,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[7][0][0][0] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "instructions_paragraphs,7,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[7][0][4][0] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "instructions_paragraphs,8,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[8][0][0][0] = uu.a(var2, (byte) 67);
                }
                var2 = fk.a(false, "instructions_paragraphs,8,0,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[8][0][1][0] = uu.a(var2, (byte) 8);
                }
                var2 = fk.a(false, "instructions_paragraphs,8,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[8][0][2][0] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "instructions_paragraphs,9,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][0][0][0] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "instructions_paragraphs,9,1,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][1][0][0] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "instructions_paragraphs,9,1,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][1][1][0] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "instructions_paragraphs,9,1,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[9][1][2][0] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "instructions_paragraphs,9,1,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[9][1][3][0] = uu.a(var2, (byte) 33);
                }
                var2 = fk.a(false, "instructions_paragraphs,10,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[10][0][0][0] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "instructions_paragraphs,10,0,1,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[10][0][1][0] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "instructions_paragraphs,10,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[10][0][2][0] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "instructions_paragraphs,10,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[10][0][3][0] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "instructions_paragraphs,10,0,4,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[10][0][4][0] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "instructions_paragraphs,10,0,5,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[10][0][5][0] = uu.a(var2, (byte) 29);
                }
                var2 = fk.a(false, "instructions_paragraphs,11,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][0][0] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "instructions_paragraphs,11,0,4,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][4][0] = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "instructions_paragraphs,11,0,5,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][5][0] = uu.a(var2, (byte) 25);
                }
                var2 = fk.a(false, "instructions_paragraphs,11,0,6,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[11][0][6][0] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "instructions_paragraphs,12,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[12][0][0][0] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "instructions_paragraphs,12,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[12][0][1][0] = uu.a(var2, (byte) 124);
                }
                var2 = fk.a(false, "instructions_paragraphs,12,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[12][0][2][0] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "instructions_paragraphs,12,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[12][0][3][0] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "instructions_paragraphs,13,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[13][0][0][0] = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "instructions_paragraphs,13,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[13][0][1][0] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "instructions_paragraphs,13,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[13][0][2][0] = uu.a(var2, (byte) 56);
                }
                var2 = fk.a(false, "instructions_paragraphs,13,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[13][0][3][0] = uu.a(var2, (byte) 66);
                }
                var2 = fk.a(false, "instructions_paragraphs,14,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[14][0][0][0] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "instructions_paragraphs,14,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[14][0][1][0] = uu.a(var2, (byte) 110);
                }
                var2 = fk.a(false, "instructions_paragraphs,14,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[14][0][2][0] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "instructions_paragraphs,15,0,0,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[15][0][0][0] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "instructions_paragraphs,15,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[15][0][1][0] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "instructions_paragraphs,15,0,2,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[15][0][2][0] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "instructions_paragraphs,15,0,3,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[15][0][3][0] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "instructions_paragraphs,16,0,0,0");
                if (null != var2) {
                  PortalLossCondition.instructionParagraphs[16][0][0][0] = uu.a(var2, (byte) 72);
                }
                var2 = fk.a(false, "instructions_paragraphs,16,0,1,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[16][0][1][0] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "instructions_paragraphs,16,0,2,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[16][0][2][0] = uu.a(var2, (byte) 71);
                }
                var2 = fk.a(false, "instructions_paragraphs,16,0,3,0");
                if (var2 != null) {
                  PortalLossCondition.instructionParagraphs[16][0][3][0] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "TEXT_SKIP");
                if (var2 != null) {
                  field_c = uu.a(var2, (byte) 33);
                }
                var2 = fk.a(false, "LABEL_AWARD_BUILDINGS");
                if (null != var2) {
                  tg.field_l = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "LABEL_AWARD_FIRSTTOWERS");
                if (var2 != null) {
                  gk.field_N = uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "LABEL_AWARD_FIRSTHOUSES");
                if (null != var2) {
                  tv.field_c = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "LABEL_AWARD_FIRSTPORTALS");
                if (null != var2) {
                  tv.field_b = uu.a(var2, (byte) 85);
                }
                var2 = fk.a(false, "LABEL_AWARD_KILLS");
                if (null != var2) {
                  CombatSandbox.field_g = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "LABEL_AWARD_SUMMONS");
                if (null != var2) {
                  dn.field_Kb = uu.a(var2, (byte) 28);
                }
                var2 = fk.a(false, "LABEL_AWARD_UNITBEATUP");
                if (null != var2) {
                  qu.field_r = uu.a(var2, (byte) 38);
                }
                var2 = fk.a(false, "LABEL_AWARD_UNITBULLY");
                if (null != var2) {
                  r.field_I = uu.a(var2, (byte) 122);
                }
                var2 = fk.a(false, "LABEL_AWARD_UNITTOUGHEST");
                if (null != var2) {
                  we.field_h = uu.a(var2, (byte) 115);
                }
                var2 = fk.a(false, "LABEL_AWARD_KBDSUMMONER");
                if (null != var2) {
                  kd.field_Q = uu.a(var2, (byte) 54);
                }
                var2 = fk.a(false, "LABEL_AWARD_MANASPEND");
                if (var2 != null) {
                  og.field_t = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "LABEL_AWARD_HEALTHLOST");
                if (null != var2) {
                  mg.field_c = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "LABEL_AWARD_HEALTHGAINED");
                if (null != var2) {
                  fg.field_l = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "LABEL_AWARD_MOSTUNITS");
                if (null != var2) {
                  pi.field_P = uu.a(var2, (byte) 5);
                }
                var2 = fk.a(false, "LABEL_AWARD_MOSTHONOURABLE");
                if (var2 != null) {
                  StateChangeEvent.field_H = uu.a(var2, (byte) 85);
                }
                var2 = fk.a(false, "LABEL_AWARD_MOSTCRUEL");
                if (null != var2) {
                  ut.field_ib = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "BONUS_MANA_DESCRIPTION");
                if (null != var2) {
                  SummonRequest.field_D = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "BONUS_MANA_TITLE");
                if (var2 != null) {
                  hf.field_b = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "DIFFICULTY");
                if (null != var2) {
                  k.field_b = uu.a(var2, (byte) 66);
                }
                var2 = fk.a(false, "BESTSCORE");
                if (null != var2) {
                  uh.field_c = uu.a(var2, (byte) 100);
                }
                var2 = fk.a(false, "START_MISSION");
                if (var2 != null) {
                  ul.field_j = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "REPLAY_MISSION");
                if (var2 != null) {
                  pn.field_k = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "REWARD");
                if (null != var2) {
                  IntPair.field_l = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "REWARD_TITLE");
                if (null != var2) {
                  InstructionsPanel.field_gb = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "QUICKSAVE_TITLE");
                if (var2 != null) {
                  SummonAction.field_A = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "QUICKSAVE_PROGRESS");
                if (var2 != null) {
                  wd.field_e = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "QUICKSAVING");
                if (var2 != null) {
                  PacketBuffer.field_p = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "SAVE_AND_QUIT");
                if (null != var2) {
                  jn.field_a = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "PLAY_CAMPAIGN");
                if (null != var2) {
                  io.field_o = uu.a(var2, (byte) 111);
                }
                var2 = fk.a(false, "LOAD_QUICKSAVE");
                if (var2 != null) {
                  es.field_b = uu.a(var2, (byte) 87);
                }
                var2 = fk.a(false, "COMING_SOON");
                if (null != var2) {
                  uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "CAMPAIGNS");
                if (var2 != null) {
                  ai.field_V = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "BACK");
                if (null != var2) {
                  lb.field_c = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "INPROGRESS");
                if (var2 != null) {
                  qf.field_a = uu.a(var2, (byte) 97);
                }
                var2 = fk.a(false, "OVERWRITE");
                if (var2 != null) {
                  hi.field_h = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "HAVEONGOINGMISSION");
                if (null != var2) {
                  sb.field_f = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "CONTINUEMISSION");
                if (var2 != null) {
                  kd.field_Y = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "RESTARTMISSION");
                if (null != var2) {
                  PacketBuffer.field_r = uu.a(var2, (byte) 66);
                }
                var2 = fk.a(false, "STALEMATEWARNIGN");
                if (null != var2) {
                  DeployRequest.field_x = uu.a(var2, (byte) 33);
                }
                var2 = fk.a(false, "mapsizes,0");
                if (var2 != null) {
                  h.field_e[0] = uu.a(var2, (byte) 64);
                }
                var2 = fk.a(false, "mapsizes,1");
                if (var2 != null) {
                  h.field_e[1] = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "mapsizes,2");
                if (null != var2) {
                  h.field_e[2] = uu.a(var2, (byte) 87);
                }
                var2 = fk.a(false, "mapsizes,3");
                if (var2 != null) {
                  h.field_e[3] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "godnames,0");
                if (null != var2) {
                  wf.field_q[0] = uu.a(var2, (byte) 5);
                }
                var2 = fk.a(false, "godnames,1");
                if (null != var2) {
                  wf.field_q[1] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "godnames,2");
                if (null != var2) {
                  wf.field_q[2] = uu.a(var2, (byte) 99);
                }
                var2 = fk.a(false, "godnames,3");
                if (null != var2) {
                  wf.field_q[3] = uu.a(var2, (byte) 114);
                }
                var2 = fk.a(false, "godnames,4");
                if (var2 != null) {
                  wf.field_q[4] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "godnames,5");
                if (var2 != null) {
                  wf.field_q[5] = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "godnames,6");
                if (var2 != null) {
                  wf.field_q[6] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "goddescriptions,0");
                if (var2 != null) {
                  GlobalSpell.field_l[0] = uu.a(var2, (byte) 22);
                }
                var2 = fk.a(false, "goddescriptions,1");
                if (var2 != null) {
                  GlobalSpell.field_l[1] = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "goddescriptions,2");
                if (null != var2) {
                  GlobalSpell.field_l[2] = uu.a(var2, (byte) 6);
                }
                var2 = fk.a(false, "goddescriptions,3");
                if (var2 != null) {
                  GlobalSpell.field_l[3] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "goddescriptions,4");
                if (var2 != null) {
                  GlobalSpell.field_l[4] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "goddescriptions,5");
                if (var2 != null) {
                  GlobalSpell.field_l[5] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "goddescriptions,6");
                if (var2 != null) {
                  GlobalSpell.field_l[6] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "ACTION_VINE");
                if (null != var2) {
                  fn.field_S = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "ACTION_CANNON");
                if (null != var2) {
                  lq.field_f = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "ACTION_PRIEST");
                if (null != var2) {
                  de.field_b = uu.a(var2, (byte) 23);
                }
                var2 = fk.a(false, "ACTION_BARRIER");
                if (var2 != null) {
                  aj.field_p = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "ACTION_PORTAL");
                if (var2 != null) {
                  uf.field_g = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "ACTION_SPHINX");
                if (null != var2) {
                  np.field_Ob = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "ACTION_PORTALMAGE");
                if (var2 != null) {
                  fp.field_Ib = uu.a(var2, (byte) 76);
                }
                var2 = fk.a(false, "ACTION_MOVE");
                if (var2 != null) {
                  wn.field_gb = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "ACTION_TOOFAR");
                if (var2 != null) {
                  fo.field_a = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "ACTION_ATTACK");
                if (null != var2) {
                  wf.field_A = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "ACTION_NEEDMOVEFIRST");
                if (null != var2) {
                  op.field_g = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "ACTION_NOATTACK");
                if (var2 != null) {
                  ui.field_a = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "ACTION_SUMMON");
                if (null != var2) {
                  ub.field_a = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "ACTION_TIRED");
                if (null != var2) {
                  j.field_d = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "ACTION_NONE");
                if (null != var2) {
                  kv.field_J = uu.a(var2, (byte) 34);
                }
                var2 = fk.a(false, "ACTION_NOTYOURS");
                if (null != var2) {
                  IndexedSpriteBase.field_a = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "ACTION_FIXED");
                if (null != var2) {
                  ui.field_k = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "WRONG_GROUND_PORTAL");
                if (var2 != null) {
                  ao.field_x = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "WRONG_GROUND_CANNON");
                if (null != var2) {
                  jv.field_e = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "GROUND_TIP_PORTAL");
                if (var2 != null) {
                  wp.field_F = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "GROUND_TIP_TOWER");
                if (var2 != null) {
                  og.field_n = uu.a(var2, (byte) 47);
                }
                var2 = fk.a(false, "GROUND_TIP_TEMPLE");
                if (null != var2) {
                  dg.field_a = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "GROUND_TIP_VILLAGE");
                if (var2 != null) {
                  on.field_p = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "EMPTY_TILE_ERROR");
                if (null != var2) {
                  ij.field_A = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "STATUS_NORANGE");
                if (var2 != null) {
                  uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "STATUS_RANGE");
                if (null != var2) {
                  ud.field_Y = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "STATUS_RANGES");
                if (null != var2) {
                  cw.field_a = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "STATUSTEXT,0");
                if (var2 != null) {
                  fh.field_f[0] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "STATUSTEXT,1");
                if (null != var2) {
                  fh.field_f[1] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "STATUSTEXT,2");
                if (var2 != null) {
                  fh.field_f[2] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "STATUSTEXT,3");
                if (var2 != null) {
                  fh.field_f[3] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "STATUSTEXT,4");
                if (var2 != null) {
                  fh.field_f[4] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "STATUSTEXT,5");
                if (var2 != null) {
                  fh.field_f[5] = uu.a(var2, (byte) 80);
                }
                var2 = fk.a(false, "STATUSTEXT,6");
                if (var2 != null) {
                  fh.field_f[6] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "STATUSTEXT,7");
                if (null != var2) {
                  fh.field_f[7] = uu.a(var2, (byte) 85);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,0");
                if (var2 != null) {
                  PaletteRegionMap.field_a[0] = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,1");
                if (null != var2) {
                  PaletteRegionMap.field_a[1] = uu.a(var2, (byte) 80);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,2");
                if (null != var2) {
                  PaletteRegionMap.field_a[2] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,3");
                if (var2 != null) {
                  PaletteRegionMap.field_a[3] = uu.a(var2, (byte) 83);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,4");
                if (null != var2) {
                  PaletteRegionMap.field_a[4] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,5");
                if (null != var2) {
                  PaletteRegionMap.field_a[5] = uu.a(var2, (byte) 127);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,6");
                if (var2 != null) {
                  PaletteRegionMap.field_a[6] = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "STATUS_ARMOUR,7");
                if (null != var2) {
                  PaletteRegionMap.field_a[7] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "STATUS_STUN,0");
                if (null != var2) {
                  ba.field_E[0] = uu.a(var2, (byte) 57);
                }
                var2 = fk.a(false, "STATUS_STUN,1");
                if (null != var2) {
                  ba.field_E[1] = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "STATUS_EFFECTEXPAND");
                if (var2 != null) {
                  qc.field_f = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "STATUS_VAMPIRE");
                if (var2 != null) {
                  c.field_f = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "STATUS_MITOSE");
                if (var2 != null) {
                  td.field_h = uu.a(var2, (byte) 82);
                }
                var2 = fk.a(false, "STATUS_ACCESSORY,0");
                if (var2 != null) {
                  gs.field_c[0] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "STATUS_ACCESSORY,1");
                if (var2 != null) {
                  gs.field_c[1] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "STATUS_ACCESSORY,2");
                if (null != var2) {
                  gs.field_c[2] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "STATUS_ACCESSORY,3");
                if (null != var2) {
                  gs.field_c[3] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "STATUS_ACCESSORY,4");
                if (null != var2) {
                  gs.field_c[4] = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "STATUS_ACCESSORY,5");
                if (var2 != null) {
                  gs.field_c[5] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "WEAPON_TYPES,0");
                if (null != var2) {
                  pg.field_b[0] = uu.a(var2, (byte) 44);
                }
                var2 = fk.a(false, "WEAPON_TYPES,1");
                if (null != var2) {
                  pg.field_b[1] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "WEAPON_TYPES,2");
                if (null != var2) {
                  pg.field_b[2] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "WEAPON_TYPES,3");
                if (null != var2) {
                  pg.field_b[3] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "WEAPON_TYPES,4");
                if (var2 != null) {
                  pg.field_b[4] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,0");
                if (null != var2) {
                  ManaEvent.field_y[0] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,1");
                if (null != var2) {
                  ManaEvent.field_y[1] = uu.a(var2, (byte) 5);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,2");
                if (var2 != null) {
                  ManaEvent.field_y[2] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,3");
                if (var2 != null) {
                  ManaEvent.field_y[3] = uu.a(var2, (byte) 28);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,4");
                if (var2 != null) {
                  ManaEvent.field_y[4] = uu.a(var2, (byte) 9);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,5");
                if (null != var2) {
                  ManaEvent.field_y[5] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "WEAPON_CLASSES,6");
                if (null != var2) {
                  ManaEvent.field_y[6] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "BUTTON_CHATTAB");
                if (null != var2) {
                  pq.field_e = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "BUTTON_ENDTURN");
                if (null != var2) {
                  fg.field_k = uu.a(var2, (byte) 11);
                }
                var2 = fk.a(false, "BUTTON_TOGGLEMAP");
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  ep.field_a = uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "BUTTON_ANNOUNCE");
                if (null != var2) {
                  mo.field_o = uu.a(var2, (byte) 37);
                }
                var2 = fk.a(false, "BUTTON_TEAMCHATON");
                if (var2 != null) {
                  or.field_e = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "BUTTON_TEAMCHATOFF");
                if (var2 != null) {
                  kd.field_E = uu.a(var2, (byte) 34);
                }
                var2 = fk.a(false, "BUTTON_EQUIPMENT");
                if (null != var2) {
                  MatchSetupPanel.field_x = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "HOVER_GOD");
                if (var2 != null) {
                  pq.field_c = uu.a(var2, (byte) 82);
                }
                var2 = fk.a(false, "HOVER_ANNOUNCE");
                if (null != var2) {
                  uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "HOVER_ANNOUNCEYOU");
                if (var2 != null) {
                  ce.field_H = uu.a(var2, (byte) 50);
                }
                var2 = fk.a(false, "ANNOUNCE_WINNER");
                if (var2 != null) {
                  p.field_i = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "ANNOUNCE_WINNERYOU");
                if (var2 != null) {
                  DeployEvent.field_y = uu.a(var2, (byte) 89);
                }
                var2 = fk.a(false, "ANNOUNCE_DRAW");
                if (var2 != null) {
                  r.field_J = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "GAME_STATS,0");
                if (null != var2) {
                  vo.field_f[0] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "GAME_STATS,1");
                if (null != var2) {
                  vo.field_f[1] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "GAME_STATS,2");
                if (null != var2) {
                  vo.field_f[2] = uu.a(var2, (byte) 48);
                }
                var2 = fk.a(false, "GAME_STATS,3");
                if (var2 != null) {
                  vo.field_f[3] = uu.a(var2, (byte) 97);
                }
                var2 = fk.a(false, "GAME_STATS,5");
                if (var2 != null) {
                  vo.field_f[5] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "GAME_STATS,6");
                if (null != var2) {
                  vo.field_f[6] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "GAME_STATS,7");
                if (var2 != null) {
                  vo.field_f[7] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "GAME_STATS,8");
                if (null != var2) {
                  vo.field_f[8] = uu.a(var2, (byte) 57);
                }
                var2 = fk.a(false, "MANA_INCREASE");
                if (null != var2) {
                  dr.field_w = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "MANA_COUNTER");
                if (var2 != null) {
                  lu.field_v = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "MANA_COUNTER_VICTORY");
                if (var2 != null) {
                  cr.field_bb = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "MANA_COUNTER_VICTORY2");
                if (null != var2) {
                  TutorialLayout.field_c = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "TERRAIN_BONUS");
                if (null != var2) {
                  uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "CLASSES,0");
                if (null != var2) {
                  hi.field_m[0] = uu.a(var2, (byte) 65);
                }
                var2 = fk.a(false, "CLASSES,1");
                if (null != var2) {
                  hi.field_m[1] = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "CLASSES,2");
                if (null != var2) {
                  hi.field_m[2] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "CLASSES,3");
                if (null != var2) {
                  hi.field_m[3] = uu.a(var2, (byte) 117);
                }
                var2 = fk.a(false, "CLASSES,4");
                if (null != var2) {
                  hi.field_m[4] = uu.a(var2, (byte) 53);
                }
                var2 = fk.a(false, "CLASSES,5");
                if (null != var2) {
                  hi.field_m[5] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "CLASSES,6");
                if (var2 != null) {
                  hi.field_m[6] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "CLASSES,7");
                if (null != var2) {
                  hi.field_m[7] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "BARBARIAN_CHIEF");
                if (null != var2) {
                  ov.field_a = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "groundnames,0");
                if (var2 != null) {
                  jj.field_a[0] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "groundnames,1");
                if (null != var2) {
                  jj.field_a[1] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "groundnames,2");
                if (null != var2) {
                  jj.field_a[2] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "groundnames,3");
                if (null != var2) {
                  jj.field_a[3] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "groundnames,4");
                if (var2 != null) {
                  jj.field_a[4] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "groundnames,5");
                if (null != var2) {
                  jj.field_a[5] = uu.a(var2, (byte) 34);
                }
                var2 = fk.a(false, "groundnames,6");
                if (null != var2) {
                  jj.field_a[6] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "groundnames,7");
                if (null != var2) {
                  jj.field_a[7] = uu.a(var2, (byte) 52);
                }
                var2 = fk.a(false, "groundnames,8");
                if (var2 != null) {
                  jj.field_a[8] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "groundnames,9");
                if (var2 != null) {
                  jj.field_a[9] = uu.a(var2, (byte) 51);
                }
                var2 = fk.a(false, "groundnames,10");
                if (null != var2) {
                  jj.field_a[10] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "groundnames,11");
                if (null != var2) {
                  jj.field_a[11] = uu.a(var2, (byte) 22);
                }
                var2 = fk.a(false, "groundnames,12");
                if (var2 != null) {
                  jj.field_a[12] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "groundnames,13");
                if (var2 != null) {
                  jj.field_a[13] = uu.a(var2, (byte) 79);
                }
                var2 = fk.a(false, "groundnames,14");
                if (null != var2) {
                  jj.field_a[14] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "groundnames,15");
                if (null != var2) {
                  jj.field_a[15] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "burntgroundnames,4");
                if (var2 != null) {
                  dj.field_d[4] = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "burntgroundnames,6");
                if (null != var2) {
                  dj.field_d[6] = uu.a(var2, (byte) 83);
                }
                var2 = fk.a(false, "LEADER");
                if (var2 != null) {
                  og.field_r = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "GUARD");
                if (null != var2) {
                  fa.field_f = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "EXIT");
                if (null != var2) {
                  ce.field_P = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "UN_OWNED");
                if (var2 != null) {
                  rn.field_b = uu.a(var2, (byte) 65);
                }
                var2 = fk.a(false, "UN_OWNABLE");
                if (null != var2) {
                  GlobalSpell.field_k = uu.a(var2, (byte) 104);
                }
                var2 = fk.a(false, "OWNED_BY");
                if (null != var2) {
                  m.field_h = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "OWNED_BY_YOU");
                if (null != var2) {
                  GlobalSpell.field_e = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "MANA_SCORE");
                if (null != var2) {
                  vg.field_t = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "NO_MANA");
                if (null != var2) {
                  ps.field_x = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "terrainicontext,0,0");
                if (var2 != null) {
                  ek.field_b[0][0] = uu.a(var2, (byte) 52);
                }
                var2 = fk.a(false, "terrainicontext,0,1");
                if (null != var2) {
                  ek.field_b[0][1] = uu.a(var2, (byte) 46);
                }
                var2 = fk.a(false, "terrainicontext,0,2");
                if (var2 != null) {
                  ek.field_b[0][2] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "terrainicontext,0,3");
                if (var2 != null) {
                  ek.field_b[0][3] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "terrainicontext,0,4");
                if (var2 != null) {
                  ek.field_b[0][4] = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "terrainicontext,0,5");
                if (null != var2) {
                  ek.field_b[0][5] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "terrainicontext,0,6");
                if (var2 != null) {
                  ek.field_b[0][6] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "terrainicontext,0,7");
                if (var2 != null) {
                  ek.field_b[0][7] = uu.a(var2, (byte) 58);
                }
                var2 = fk.a(false, "terrainicontext,0,8");
                if (null != var2) {
                  ek.field_b[0][8] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "terrainicontext,0,9");
                if (null != var2) {
                  ek.field_b[0][9] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "terrainicontext,0,10");
                if (null != var2) {
                  ek.field_b[0][10] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "terrainicontext,0,11");
                if (var2 != null) {
                  ek.field_b[0][11] = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "terrainicontext,0,12");
                if (var2 != null) {
                  ek.field_b[0][12] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "terrainicontext,0,13");
                if (null != var2) {
                  ek.field_b[0][13] = uu.a(var2, (byte) 111);
                }
                var2 = fk.a(false, "terrainicontext,0,14");
                if (var2 != null) {
                  ek.field_b[0][14] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "terrainicontext,0,15");
                if (null != var2) {
                  ek.field_b[0][15] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "terrainicontext,0,16");
                if (null != var2) {
                  ek.field_b[0][16] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "terrainicontext,0,17");
                if (null != var2) {
                  ek.field_b[0][17] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "terrainicontext,1,1");
                if (null != var2) {
                  ek.field_b[1][1] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "terrainicontext,1,2");
                if (null != var2) {
                  ek.field_b[1][2] = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "terrainicontext,1,4");
                if (var2 != null) {
                  ek.field_b[1][4] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "terrainicontext,1,5");
                if (null != var2) {
                  ek.field_b[1][5] = uu.a(var2, (byte) 122);
                }
                var2 = fk.a(false, "terrainicontext,1,6");
                if (null != var2) {
                  ek.field_b[1][6] = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "terrainicontext,1,7");
                if (null != var2) {
                  ek.field_b[1][7] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "terrainicontext,1,8");
                if (null != var2) {
                  ek.field_b[1][8] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "terrainicontext,1,9");
                if (null != var2) {
                  ek.field_b[1][9] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "terrainicontext,1,17");
                if (null != var2) {
                  ek.field_b[1][17] = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "terrainicontext,2,2");
                if (null != var2) {
                  ek.field_b[2][2] = uu.a(var2, (byte) 35);
                }
                var2 = fk.a(false, "unitnames,0");
                if (null != var2) {
                  dn.unitDisplayNames[0] = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "unitnames,1");
                if (null != var2) {
                  dn.unitDisplayNames[1] = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "unitnames,2");
                if (var2 != null) {
                  dn.unitDisplayNames[2] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "unitnames,3");
                if (var2 != null) {
                  dn.unitDisplayNames[3] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "unitnames,4");
                if (null != var2) {
                  dn.unitDisplayNames[4] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "unitnames,5");
                if (var2 != null) {
                  dn.unitDisplayNames[5] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "unitnames,6");
                if (null != var2) {
                  dn.unitDisplayNames[6] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "unitnames,7");
                if (null != var2) {
                  dn.unitDisplayNames[7] = uu.a(var2, (byte) 125);
                }
                var2 = fk.a(false, "unitnames,8");
                if (var2 != null) {
                  dn.unitDisplayNames[8] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "unitnames,9");
                if (var2 != null) {
                  dn.unitDisplayNames[9] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "unitnames,10");
                if (null != var2) {
                  dn.unitDisplayNames[10] = uu.a(var2, (byte) 23);
                }
                var2 = fk.a(false, "unitnames,11");
                if (var2 != null) {
                  dn.unitDisplayNames[11] = uu.a(var2, (byte) 32);
                }
                var2 = fk.a(false, "unitnames,12");
                if (null != var2) {
                  dn.unitDisplayNames[12] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "unitnames,13");
                if (null != var2) {
                  dn.unitDisplayNames[13] = uu.a(var2, (byte) 117);
                }
                var2 = fk.a(false, "unitnames,14");
                if (null != var2) {
                  dn.unitDisplayNames[14] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "unitnames,15");
                if (var2 != null) {
                  dn.unitDisplayNames[15] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "unitnames,16");
                if (null != var2) {
                  dn.unitDisplayNames[16] = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "unitnames,17");
                if (null != var2) {
                  dn.unitDisplayNames[17] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "unitnames,18");
                if (null != var2) {
                  dn.unitDisplayNames[18] = uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "unitnames,19");
                if (null != var2) {
                  dn.unitDisplayNames[19] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "unitnames,20");
                if (var2 != null) {
                  dn.unitDisplayNames[20] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "unitnames,21");
                if (var2 != null) {
                  dn.unitDisplayNames[21] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "unitnames,22");
                if (null != var2) {
                  dn.unitDisplayNames[22] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "unitnames,23");
                if (var2 != null) {
                  dn.unitDisplayNames[23] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "unitnames,24");
                if (null != var2) {
                  dn.unitDisplayNames[24] = uu.a(var2, (byte) 125);
                }
                var2 = fk.a(false, "unitnames,25");
                if (var2 != null) {
                  dn.unitDisplayNames[25] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "unitnames,26");
                if (var2 != null) {
                  dn.unitDisplayNames[26] = uu.a(var2, (byte) 92);
                }
                var2 = fk.a(false, "unitnames,27");
                if (null != var2) {
                  dn.unitDisplayNames[27] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "unitnames,28");
                if (var2 != null) {
                  dn.unitDisplayNames[28] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "unitnames,29");
                if (var2 != null) {
                  dn.unitDisplayNames[29] = uu.a(var2, (byte) 20);
                }
                var2 = fk.a(false, "unitnames,30");
                if (null != var2) {
                  dn.unitDisplayNames[30] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "unitnames,31");
                if (null != var2) {
                  dn.unitDisplayNames[31] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "unitnames,32");
                if (var2 != null) {
                  dn.unitDisplayNames[32] = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "unitnames,33");
                if (var2 != null) {
                  dn.unitDisplayNames[33] = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "unitnames,34");
                if (null != var2) {
                  dn.unitDisplayNames[34] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "unitnames,35");
                if (null != var2) {
                  dn.unitDisplayNames[35] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "unitnames,36");
                if (null != var2) {
                  dn.unitDisplayNames[36] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "unitnames,37");
                if (var2 != null) {
                  dn.unitDisplayNames[37] = uu.a(var2, (byte) 11);
                }
                var2 = fk.a(false, "unitnames,38");
                if (null != var2) {
                  dn.unitDisplayNames[38] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "unitnames,39");
                if (var2 != null) {
                  dn.unitDisplayNames[39] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "unitnames,40");
                if (null != var2) {
                  dn.unitDisplayNames[40] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "unitnames,41");
                if (var2 != null) {
                  dn.unitDisplayNames[41] = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "unitnames,42");
                if (null != var2) {
                  dn.unitDisplayNames[42] = uu.a(var2, (byte) 90);
                }
                var2 = fk.a(false, "unitnames,43");
                if (var2 != null) {
                  dn.unitDisplayNames[43] = uu.a(var2, (byte) 107);
                }
                var2 = fk.a(false, "unitnames,44");
                if (var2 != null) {
                  dn.unitDisplayNames[44] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "unitnames,45");
                if (var2 != null) {
                  dn.unitDisplayNames[45] = uu.a(var2, (byte) 62);
                }
                var2 = fk.a(false, "unitnames,46");
                if (var2 != null) {
                  dn.unitDisplayNames[46] = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "unitnames,47");
                if (var2 != null) {
                  dn.unitDisplayNames[47] = uu.a(var2, (byte) 35);
                }
                var2 = fk.a(false, "unitnames,48");
                if (null != var2) {
                  dn.unitDisplayNames[48] = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "unitnames,49");
                if (null != var2) {
                  dn.unitDisplayNames[49] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "unitnames,50");
                if (null != var2) {
                  dn.unitDisplayNames[50] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "unitnames,51");
                if (null != var2) {
                  dn.unitDisplayNames[51] = uu.a(var2, (byte) 54);
                }
                var2 = fk.a(false, "unitnames,52");
                if (null != var2) {
                  dn.unitDisplayNames[52] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "unitnames,53");
                if (var2 != null) {
                  dn.unitDisplayNames[53] = uu.a(var2, (byte) 18);
                }
                var2 = fk.a(false, "unitnames,54");
                if (var2 != null) {
                  dn.unitDisplayNames[54] = uu.a(var2, (byte) 18);
                }
                var2 = fk.a(false, "unitnames,55");
                if (var2 != null) {
                  dn.unitDisplayNames[55] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "unitnames,56");
                if (null != var2) {
                  dn.unitDisplayNames[56] = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "unitnames,57");
                if (null != var2) {
                  dn.unitDisplayNames[57] = uu.a(var2, (byte) 107);
                }
                var2 = fk.a(false, "unitnames,58");
                if (null != var2) {
                  dn.unitDisplayNames[58] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "unitnames,59");
                if (null != var2) {
                  dn.unitDisplayNames[59] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "unitnames,60");
                if (null != var2) {
                  dn.unitDisplayNames[60] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "unitnames,61");
                if (null != var2) {
                  dn.unitDisplayNames[61] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "unitnames,62");
                if (var2 != null) {
                  dn.unitDisplayNames[62] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "unitnames,63");
                if (var2 != null) {
                  dn.unitDisplayNames[63] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "unitnames,64");
                if (null != var2) {
                  dn.unitDisplayNames[64] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "unitnames,65");
                if (var2 != null) {
                  dn.unitDisplayNames[65] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "unitnames,66");
                if (var2 != null) {
                  dn.unitDisplayNames[66] = uu.a(var2, (byte) 35);
                }
                var2 = fk.a(false, "unitnames,67");
                if (var2 != null) {
                  dn.unitDisplayNames[67] = uu.a(var2, (byte) 56);
                }
                var2 = fk.a(false, "unitnames,68");
                if (var2 != null) {
                  dn.unitDisplayNames[68] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "unitnames,69");
                if (null != var2) {
                  dn.unitDisplayNames[69] = uu.a(var2, (byte) 118);
                }
                var2 = fk.a(false, "unitnames,70");
                if (var2 != null) {
                  dn.unitDisplayNames[70] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "unitnames,71");
                if (null != var2) {
                  dn.unitDisplayNames[71] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "unitnames,72");
                if (var2 != null) {
                  dn.unitDisplayNames[72] = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "unitnames,73");
                if (null != var2) {
                  dn.unitDisplayNames[73] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "unitnames,74");
                if (var2 != null) {
                  dn.unitDisplayNames[74] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "unitnames,75");
                if (var2 != null) {
                  dn.unitDisplayNames[75] = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "unitnames,76");
                if (null != var2) {
                  dn.unitDisplayNames[76] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "unitnames,77");
                if (var2 != null) {
                  dn.unitDisplayNames[77] = uu.a(var2, (byte) 72);
                }
                var2 = fk.a(false, "unitnames,78");
                if (var2 != null) {
                  dn.unitDisplayNames[78] = uu.a(var2, (byte) 113);
                }
                var2 = fk.a(false, "unitnames,79");
                if (var2 != null) {
                  dn.unitDisplayNames[79] = uu.a(var2, (byte) 124);
                }
                var2 = fk.a(false, "unitnames,80");
                if (var2 != null) {
                  dn.unitDisplayNames[80] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "unitnames,81");
                if (var2 != null) {
                  dn.unitDisplayNames[81] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "unitnames,82");
                if (var2 != null) {
                  dn.unitDisplayNames[82] = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "unitnames,83");
                if (null != var2) {
                  dn.unitDisplayNames[83] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "unitnames,84");
                if (var2 != null) {
                  dn.unitDisplayNames[84] = uu.a(var2, (byte) 31);
                }
                var2 = fk.a(false, "unitnames,85");
                if (var2 != null) {
                  dn.unitDisplayNames[85] = uu.a(var2, (byte) 69);
                }
                var2 = fk.a(false, "unitnames,86");
                if (var2 != null) {
                  dn.unitDisplayNames[86] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "unitnames,87");
                if (var2 != null) {
                  dn.unitDisplayNames[87] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "unitnames,88");
                if (var2 != null) {
                  dn.unitDisplayNames[88] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "STATS_MULTIRANGE");
                if (var2 != null) {
                  ContextualRuntimeException.field_e = uu.a(var2, (byte) 67);
                }
                var2 = fk.a(false, "STATS_SINGLERANGE");
                if (var2 != null) {
                  Unit.field_y = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "STATS_CANNONRANGE");
                if (null != var2) {
                  vl.field_l = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "TXT_RANGES");
                if (var2 != null) {
                  td.field_a = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "TXT_RANGES2");
                if (null != var2) {
                  AiPlanningStrategy.field_e = uu.a(var2, (byte) 78);
                }
                var2 = fk.a(false, "TXT_RANGE");
                if (null != var2) {
                  vk.field_d = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "TXT_STRENGTH");
                if (var2 != null) {
                  mk.field_i = uu.a(var2, (byte) 101);
                }
                var2 = fk.a(false, "TXT_SPEED");
                if (var2 != null) {
                  lq.field_a = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "TXT_LEVEL");
                if (var2 != null) {
                  UiSelectionState.field_d = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "TXT_MANA");
                if (var2 != null) {
                  bt.field_d = uu.a(var2, (byte) 96);
                }
                var2 = fk.a(false, "LABEL_ENDTURN");
                if (var2 != null) {
                  GrowthEvent.field_I = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "LABEL_ALIGNMENTS");
                if (var2 != null) {
                  SummonAction.field_F = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "ROLLOVER_MANA");
                if (null != var2) {
                  vs.field_h = uu.a(var2, (byte) 99);
                }
                var2 = fk.a(false, "ROLLOVER_CHAT");
                if (var2 != null) {
                  uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "ROLLOVER_STRENGTH");
                if (null != var2) {
                  CoatOfArms.field_c = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "ROLLOVER_BONUS");
                if (var2 != null) {
                  ki.field_c = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "CAMPAIGN_PROGRESS");
                if (var2 != null) {
                  og.field_l = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,0");
                if (var2 != null) {
                  jm.field_w[0] = uu.a(var2, (byte) 13);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,1");
                if (var2 != null) {
                  jm.field_w[1] = uu.a(var2, (byte) 21);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,2");
                if (var2 != null) {
                  jm.field_w[2] = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,3");
                if (null != var2) {
                  jm.field_w[3] = uu.a(var2, (byte) 49);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,4");
                if (var2 != null) {
                  jm.field_w[4] = uu.a(var2, (byte) 55);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,5");
                if (var2 != null) {
                  jm.field_w[5] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,6");
                if (null != var2) {
                  jm.field_w[6] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "HOTSEAT_NAMES,7");
                if (var2 != null) {
                  jm.field_w[7] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "TUT_PLAYER");
                if (var2 != null) {
                  ei.field_i = uu.a(var2, (byte) 4);
                }
                var2 = fk.a(false, "TUT_ENEMY");
                if (null != var2) {
                  vs.field_b = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "TEAM_RED");
                if (var2 != null) {
                  AnimationPlayer.field_n = uu.a(var2, (byte) 34);
                }
                var2 = fk.a(false, "TEAM_BLUE");
                if (null != var2) {
                  CampaignMission.field_p = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "SPACE");
                if (null != var2) {
                  uu.a(var2, (byte) 22);
                }
                var2 = fk.a(false, "KBD_SUMMON_DESCRIPTION");
                if (null != var2) {
                  uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "unitspecials,0");
                if (null != var2) {
                  bh.field_M[0] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "unitspecials,3");
                if (null != var2) {
                  bh.field_M[3] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "unitspecials,4");
                if (null != var2) {
                  bh.field_M[4] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "unitspecials,6");
                if (null != var2) {
                  bh.field_M[6] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "unitspecials,7");
                if (var2 != null) {
                  bh.field_M[7] = uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "unitspecials,10");
                if (null != var2) {
                  bh.field_M[10] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "unitspecials,17");
                if (null != var2) {
                  bh.field_M[17] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "unitspecials,18");
                if (null != var2) {
                  bh.field_M[18] = uu.a(var2, (byte) 28);
                }
                var2 = fk.a(false, "unitspecials,20");
                if (null != var2) {
                  bh.field_M[20] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "unitspecials,21");
                if (null != var2) {
                  bh.field_M[21] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "unitspecials,27");
                if (var2 != null) {
                  bh.field_M[27] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "unitspecials,28");
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (null != var2) {
                  bh.field_M[28] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "unitspecials,29");
                if (null != var2) {
                  bh.field_M[29] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "unitspecials,32");
                if (var2 != null) {
                  bh.field_M[32] = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "unitspecials,34");
                if (null != var2) {
                  bh.field_M[34] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "unitspecials,39");
                if (null != var2) {
                  bh.field_M[39] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "unitspecials,40");
                if (null != var2) {
                  bh.field_M[40] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "unitspecials,43");
                if (var2 != null) {
                  bh.field_M[43] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "unitspecials,51");
                if (null != var2) {
                  bh.field_M[51] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "unitspecials,53");
                if (var2 != null) {
                  bh.field_M[53] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "unitspecials,56");
                if (var2 != null) {
                  bh.field_M[56] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "unitspecials,57");
                if (null != var2) {
                  bh.field_M[57] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "unitspecials,58");
                if (null != var2) {
                  bh.field_M[58] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "unitspecials,59");
                if (null != var2) {
                  bh.field_M[59] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "unitspecials,62");
                if (null != var2) {
                  bh.field_M[62] = uu.a(var2, (byte) 80);
                }
                var2 = fk.a(false, "unitspecials,63");
                if (var2 != null) {
                  bh.field_M[63] = uu.a(var2, (byte) 89);
                }
                var2 = fk.a(false, "unitspecials,65");
                if (null != var2) {
                  bh.field_M[65] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "unitspecials,66");
                if (var2 != null) {
                  bh.field_M[66] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "unitspecials,70");
                if (null != var2) {
                  bh.field_M[70] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "unitspecials,71");
                if (var2 != null) {
                  bh.field_M[71] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "unitspecials,72");
                if (var2 != null) {
                  bh.field_M[72] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "unitspecials,73");
                if (var2 != null) {
                  bh.field_M[73] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "unitspecials,74");
                if (var2 != null) {
                  bh.field_M[74] = uu.a(var2, (byte) 33);
                }
                var2 = fk.a(false, "unitspecials,81");
                if (var2 != null) {
                  bh.field_M[81] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "descriptions,0");
                if (var2 != null) {
                  ut.field_cb[0] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "descriptions,1");
                if (var2 != null) {
                  ut.field_cb[1] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "descriptions,2");
                if (var2 != null) {
                  ut.field_cb[2] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "descriptions,3");
                if (null != var2) {
                  ut.field_cb[3] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "descriptions,4");
                if (var2 != null) {
                  ut.field_cb[4] = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "descriptions,5");
                if (null != var2) {
                  ut.field_cb[5] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "descriptions,6");
                if (null != var2) {
                  ut.field_cb[6] = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "descriptions,7");
                if (null != var2) {
                  ut.field_cb[7] = uu.a(var2, (byte) 61);
                }
                var2 = fk.a(false, "descriptions,8");
                if (null != var2) {
                  ut.field_cb[8] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "descriptions,9");
                if (null != var2) {
                  ut.field_cb[9] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "descriptions,10");
                if (null != var2) {
                  ut.field_cb[10] = uu.a(var2, (byte) 126);
                }
                var2 = fk.a(false, "descriptions,11");
                if (var2 != null) {
                  ut.field_cb[11] = uu.a(var2, (byte) 85);
                }
                var2 = fk.a(false, "descriptions,12");
                if (var2 != null) {
                  ut.field_cb[12] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "descriptions,13");
                if (null != var2) {
                  ut.field_cb[13] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "descriptions,14");
                if (null != var2) {
                  ut.field_cb[14] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "descriptions,15");
                if (null != var2) {
                  ut.field_cb[15] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "descriptions,16");
                if (null != var2) {
                  ut.field_cb[16] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "descriptions,17");
                if (null != var2) {
                  ut.field_cb[17] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "descriptions,18");
                if (null != var2) {
                  ut.field_cb[18] = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "descriptions,19");
                if (var2 != null) {
                  ut.field_cb[19] = uu.a(var2, (byte) 95);
                }
                var2 = fk.a(false, "descriptions,20");
                if (null != var2) {
                  ut.field_cb[20] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "descriptions,21");
                if (null != var2) {
                  ut.field_cb[21] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "descriptions,22");
                if (null != var2) {
                  ut.field_cb[22] = uu.a(var2, (byte) 86);
                }
                var2 = fk.a(false, "descriptions,23");
                if (null != var2) {
                  ut.field_cb[23] = uu.a(var2, (byte) 86);
                }
                var2 = fk.a(false, "descriptions,24");
                if (null != var2) {
                  ut.field_cb[24] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "descriptions,25");
                if (null != var2) {
                  ut.field_cb[25] = uu.a(var2, (byte) 49);
                }
                var2 = fk.a(false, "descriptions,26");
                if (null != var2) {
                  ut.field_cb[26] = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "descriptions,27");
                if (null != var2) {
                  ut.field_cb[27] = uu.a(var2, (byte) 21);
                }
                var2 = fk.a(false, "descriptions,28");
                if (var2 != null) {
                  ut.field_cb[28] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "descriptions,29");
                if (var2 != null) {
                  ut.field_cb[29] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "descriptions,30");
                if (null != var2) {
                  ut.field_cb[30] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "descriptions,31");
                if (null != var2) {
                  ut.field_cb[31] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "descriptions,32");
                if (null != var2) {
                  ut.field_cb[32] = uu.a(var2, (byte) 38);
                }
                var2 = fk.a(false, "descriptions,33");
                if (null != var2) {
                  ut.field_cb[33] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "descriptions,34");
                if (null != var2) {
                  ut.field_cb[34] = uu.a(var2, (byte) 113);
                }
                var2 = fk.a(false, "descriptions,35");
                if (null != var2) {
                  ut.field_cb[35] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "descriptions,36");
                if (var2 != null) {
                  ut.field_cb[36] = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "descriptions,37");
                if (null != var2) {
                  ut.field_cb[37] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "descriptions,38");
                if (var2 != null) {
                  ut.field_cb[38] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "descriptions,39");
                if (var2 != null) {
                  ut.field_cb[39] = uu.a(var2, (byte) 15);
                }
                var2 = fk.a(false, "descriptions,40");
                if (var2 != null) {
                  ut.field_cb[40] = uu.a(var2, (byte) 99);
                }
                var2 = fk.a(false, "descriptions,41");
                if (null != var2) {
                  ut.field_cb[41] = uu.a(var2, (byte) 84);
                }
                var2 = fk.a(false, "descriptions,42");
                if (null != var2) {
                  ut.field_cb[42] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "descriptions,43");
                if (var2 != null) {
                  ut.field_cb[43] = uu.a(var2, (byte) 32);
                }
                var2 = fk.a(false, "descriptions,44");
                if (null != var2) {
                  ut.field_cb[44] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "descriptions,45");
                if (null != var2) {
                  ut.field_cb[45] = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "descriptions,46");
                if (null != var2) {
                  ut.field_cb[46] = uu.a(var2, (byte) 46);
                }
                var2 = fk.a(false, "descriptions,47");
                if (var2 != null) {
                  ut.field_cb[47] = uu.a(var2, (byte) 2);
                }
                var2 = fk.a(false, "descriptions,48");
                if (var2 != null) {
                  ut.field_cb[48] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "descriptions,49");
                if (var2 != null) {
                  ut.field_cb[49] = uu.a(var2, (byte) 24);
                }
                var2 = fk.a(false, "descriptions,50");
                if (var2 != null) {
                  ut.field_cb[50] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "descriptions,51");
                if (var2 != null) {
                  ut.field_cb[51] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "descriptions,52");
                if (var2 != null) {
                  ut.field_cb[52] = uu.a(var2, (byte) 115);
                }
                var2 = fk.a(false, "descriptions,53");
                if (var2 != null) {
                  ut.field_cb[53] = uu.a(var2, (byte) 5);
                }
                var2 = fk.a(false, "descriptions,54");
                if (var2 != null) {
                  ut.field_cb[54] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "descriptions,55");
                if (null != var2) {
                  ut.field_cb[55] = uu.a(var2, (byte) 90);
                }
                var2 = fk.a(false, "descriptions,56");
                if (var2 != null) {
                  ut.field_cb[56] = uu.a(var2, (byte) 120);
                }
                var2 = fk.a(false, "descriptions,57");
                if (var2 != null) {
                  ut.field_cb[57] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "descriptions,58");
                if (null != var2) {
                  ut.field_cb[58] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "descriptions,59");
                if (var2 != null) {
                  ut.field_cb[59] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "descriptions,60");
                if (null != var2) {
                  ut.field_cb[60] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "descriptions,61");
                if (var2 != null) {
                  ut.field_cb[61] = uu.a(var2, (byte) 22);
                }
                var2 = fk.a(false, "descriptions,62");
                if (null != var2) {
                  ut.field_cb[62] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "descriptions,63");
                if (null != var2) {
                  ut.field_cb[63] = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "descriptions,64");
                if (var2 != null) {
                  ut.field_cb[64] = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "descriptions,65");
                if (null != var2) {
                  ut.field_cb[65] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "descriptions,66");
                if (var2 != null) {
                  ut.field_cb[66] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "descriptions,67");
                if (var2 != null) {
                  ut.field_cb[67] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "descriptions,68");
                if (null != var2) {
                  ut.field_cb[68] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "descriptions,69");
                if (var2 != null) {
                  ut.field_cb[69] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "descriptions,70");
                if (null != var2) {
                  ut.field_cb[70] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "descriptions,71");
                if (null != var2) {
                  ut.field_cb[71] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "descriptions,72");
                if (null != var2) {
                  ut.field_cb[72] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "descriptions,73");
                if (null != var2) {
                  ut.field_cb[73] = uu.a(var2, (byte) 87);
                }
                var2 = fk.a(false, "descriptions,74");
                if (null != var2) {
                  ut.field_cb[74] = uu.a(var2, (byte) 97);
                }
                var2 = fk.a(false, "NO_PASSIVE");
                if (null != var2) {
                  du.field_f = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "passivespecials,0");
                if (var2 != null) {
                  cj.field_n[0] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "passivespecials,1");
                if (var2 != null) {
                  cj.field_n[1] = uu.a(var2, (byte) 74);
                }
                var2 = fk.a(false, "passivespecials,2");
                if (null != var2) {
                  cj.field_n[2] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "passivespecials,3");
                if (var2 != null) {
                  cj.field_n[3] = uu.a(var2, (byte) 114);
                }
                var2 = fk.a(false, "passivespecials,4");
                if (var2 != null) {
                  cj.field_n[4] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "passivespecials,5");
                if (null != var2) {
                  cj.field_n[5] = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "passivespecials,6");
                if (null != var2) {
                  cj.field_n[6] = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "passivespecials,7");
                if (null != var2) {
                  cj.field_n[7] = uu.a(var2, (byte) 48);
                }
                var2 = fk.a(false, "passivespecials,8");
                if (null != var2) {
                  cj.field_n[8] = uu.a(var2, (byte) 13);
                }
                var2 = fk.a(false, "passivespecials,9");
                if (var2 != null) {
                  cj.field_n[9] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "passivespecials,10");
                if (var2 != null) {
                  cj.field_n[10] = uu.a(var2, (byte) 51);
                }
                var2 = fk.a(false, "passivespecials,11");
                if (var2 != null) {
                  cj.field_n[11] = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "passivespecials,12");
                if (var2 != null) {
                  cj.field_n[12] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "passivespecials,13");
                if (null != var2) {
                  cj.field_n[13] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "passivespecials,14");
                if (var2 != null) {
                  cj.field_n[14] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "passivespecials,15");
                if (var2 != null) {
                  cj.field_n[15] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "passivespecials,16");
                if (var2 != null) {
                  cj.field_n[16] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "passivespecials,17");
                if (null != var2) {
                  cj.field_n[17] = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "passivespecials,18");
                if (null != var2) {
                  cj.field_n[18] = uu.a(var2, (byte) 25);
                }
                var2 = fk.a(false, "passivespecials,19");
                if (null != var2) {
                  cj.field_n[19] = uu.a(var2, (byte) 32);
                }
                var2 = fk.a(false, "passivespecials,20");
                if (null != var2) {
                  cj.field_n[20] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "passivespecials,21");
                if (var2 != null) {
                  cj.field_n[21] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "passivespecials,22");
                if (var2 != null) {
                  cj.field_n[22] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "SUMMON_ERRORS,0");
                if (null != var2) {
                  TeamRoster.field_c[0] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "SUMMON_ERRORS,1");
                if (null != var2) {
                  TeamRoster.field_c[1] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "SUMMON_ERRORS,2");
                if (var2 != null) {
                  TeamRoster.field_c[2] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "SUMMON_ERRORS,3");
                if (null != var2) {
                  TeamRoster.field_c[3] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "SUMMON_ERRORS,4");
                if (null != var2) {
                  TeamRoster.field_c[4] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "directions,0");
                if (null != var2) {
                  k.field_a[0] = uu.a(var2, (byte) 82);
                }
                var2 = fk.a(false, "directions,1");
                if (null != var2) {
                  k.field_a[1] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "directions,2");
                if (var2 != null) {
                  k.field_a[2] = uu.a(var2, (byte) 8);
                }
                var2 = fk.a(false, "directions,3");
                if (var2 != null) {
                  k.field_a[3] = uu.a(var2, (byte) 48);
                }
                var2 = fk.a(false, "SLASH");
                if (var2 != null) {
                  hs.field_I = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "QUIT_MULTI");
                if (var2 != null) {
                  IntrusiveNode.field_g = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "QUIT_HOTSEAT");
                if (var2 != null) {
                  vq.field_f = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "QUIT_MISSION");
                if (null != var2) {
                  pv.field_d = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "PLACE_FIRST");
                if (var2 != null) {
                  uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "PLACE_SECOND");
                if (var2 != null) {
                  uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "PLACE_THIRD");
                if (null != var2) {
                  uu.a(var2, (byte) 126);
                }
                var2 = fk.a(false, "PLACE_OTHERS");
                if (var2 != null) {
                  uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "placedrawn");
                if (null != var2) {
                  sp.field_g = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "placenames,0");
                if (var2 != null) {
                  ph.field_b[0] = uu.a(var2, (byte) 69);
                }
                var2 = fk.a(false, "placenames,1");
                if (var2 != null) {
                  ph.field_b[1] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "placenames,2");
                if (null != var2) {
                  ph.field_b[2] = uu.a(var2, (byte) 23);
                }
                var2 = fk.a(false, "placenames,3");
                if (null != var2) {
                  ph.field_b[3] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "placenames,4");
                if (null != var2) {
                  ph.field_b[4] = uu.a(var2, (byte) 56);
                }
                var2 = fk.a(false, "placenames,5");
                if (var2 != null) {
                  ph.field_b[5] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "placenames,6");
                if (var2 != null) {
                  ph.field_b[6] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "placenames,7");
                if (null != var2) {
                  ph.field_b[7] = uu.a(var2, (byte) 23);
                }
                var2 = fk.a(false, "QUALITY_HIGH");
                if (var2 != null) {
                  dc.field_s = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "QUALITY_LOW");
                if (null != var2) {
                  uk.field_k = uu.a(var2, (byte) 26);
                }
                var2 = fk.a(false, "SKIP_ON");
                if (var2 != null) {
                  CombatPresentation.field_N = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "SKIP_OFF");
                if (null != var2) {
                  fk.field_a = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "LABEL_CAMPAIGNS");
                if (var2 != null) {
                  qk.field_f = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "LABEL_NEWGAME");
                if (var2 != null) {
                  od.field_g = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "LABEL_UNITS");
                if (var2 != null) {
                  ma.field_Y = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "LABEL_CONFIG");
                if (null != var2) {
                  uu.a(var2, (byte) 54);
                }
                var2 = fk.a(false, "LABEL_TUTORIAL");
                if (null != var2) {
                  ig.field_m = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "LABEL_SANDBOX");
                if (null != var2) {
                  bj.field_l = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "LABEL_STARTGAME");
                if (null != var2) {
                  NodeHashTable.field_b = uu.a(var2, (byte) 126);
                }
                var2 = fk.a(false, "LABEL_PLAYERS");
                if (null != var2) {
                  wf.field_s = uu.a(var2, (byte) 89);
                }
                var2 = fk.a(false, "LABEL_NUM_AI_PLAYERS");
                if (var2 != null) {
                  hc.field_d = uu.a(var2, (byte) 87);
                }
                var2 = fk.a(false, "LABEL_MAPTYPE");
                if (var2 != null) {
                  field_e = uu.a(var2, (byte) 33);
                }
                var2 = fk.a(false, "LABEL_MAPSIZE");
                if (null != var2) {
                  qm.field_I = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "LABEL_MODEL_VIEWER");
                if (var2 != null) {
                  ij.field_C = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "LABEL_BATTLE_VIEWER");
                if (null != var2) {
                  ActionRequest.field_r = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "LABEL_FOG_SELECT");
                if (null != var2) {
                  gv.field_b = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "LABEL_COATOFARMS");
                if (null != var2) {
                  pf.field_e = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "LABEL_OPTIONS");
                if (var2 != null) {
                  wd.field_j = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "LABEL_QUALITY");
                if (null != var2) {
                  rj.field_G = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "LABEL_SKIPBATTLES");
                if (null != var2) {
                  lg.field_c = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "LABEL_WALKSPEED");
                if (var2 != null) {
                  PortalLossCondition.field_f = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "LABEL_MORE_OPTIONS");
                if (var2 != null) {
                  kg.field_c = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "LABEL_SLOW");
                if (null != var2) {
                  on.field_o = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "LABEL_MEDIUM");
                if (var2 != null) {
                  uh.field_b = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "LABEL_FAST");
                if (null != var2) {
                  uq.field_v = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "LABEL_INGAME_SINGLE");
                if (var2 != null) {
                  cb.field_d = uu.a(var2, (byte) 81);
                }
                var2 = fk.a(false, "LABEL_INGAME_MULTI");
                if (var2 != null) {
                  cw.field_b = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "LABEL_INGAME_MULTI_FINISHED");
                if (null != var2) {
                  l.field_g = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "LABEL_INGAME_MULTI_SPECTATING");
                if (var2 != null) {
                  gg.field_H = uu.a(var2, (byte) 82);
                }
                var2 = fk.a(false, "LABEL_MISSION_SELECTION");
                if (var2 != null) {
                  ni.field_b = uu.a(var2, (byte) 84);
                }
                var2 = fk.a(false, "LABEL_CAMPAIGN_SELECTION");
                if (var2 != null) {
                  og.field_u = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "LABEL_HOTSEAT");
                if (null != var2) {
                  nl.field_F = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "LABEL_INSTRUCTIONS");
                if (var2 != null) {
                  kw.field_N = uu.a(var2, (byte) 8);
                }
                var2 = fk.a(false, "LABEL_ACHIEVEMENTS");
                if (var2 != null) {
                  pu.field_h = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "LABEL_GAME_ACHIEVEMENTS");
                if (null != var2) {
                  jn.field_e = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "LABEL_INVITE_LOGIN");
                if (var2 != null) {
                  DamageEvent.field_z = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "LABEL_ERROR");
                if (var2 != null) {
                  nh.field_J = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "LABEL_SPELLBOOK");
                if (null != var2) {
                  bk.field_b = uu.a(var2, (byte) 11);
                }
                var2 = fk.a(false, "LABEL_COA");
                if (null != var2) {
                  ar.field_y = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "LABEL_SETTINGS");
                if (var2 != null) {
                  ov.field_d = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "LABEL_BENEFITS");
                if (var2 != null) {
                  hc.field_w = uu.a(var2, (byte) 93);
                }
                var2 = fk.a(false, "LABEL_SETTINGS_INGAME");
                if (null != var2) {
                  ke.field_f = uu.a(var2, (byte) 24);
                }
                var2 = fk.a(false, "LABEL_TRINKETS");
                if (null != var2) {
                  dd.field_g = uu.a(var2, (byte) 119);
                }
                var2 = fk.a(false, "LABEL_RETURN_COFNIRM");
                if (null != var2) {
                  PlayerProfile.field_e = uu.a(var2, (byte) 26);
                }
                var2 = fk.a(false, "LABEL_RETURN_QUESTION");
                if (var2 != null) {
                  mu.field_e = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "LABEL_RESTART_QUESTION");
                if (null != var2) {
                  vd.field_a = uu.a(var2, (byte) 127);
                }
                var2 = fk.a(false, "LABEL_PRESTIGE");
                if (null != var2) {
                  CorpseConditionMarker.field_x = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "LABEL_MEMBERS");
                if (null != var2) {
                  od.field_f = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "LABEL_NONMEMBERS");
                if (null != var2) {
                  vg.field_l = uu.a(var2, (byte) 117);
                }
                var2 = fk.a(false, "LABEL_YES");
                if (null != var2) {
                  nt.field_p = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "LABEL_NO");
                if (null != var2) {
                  oa.field_G = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "LABEL_STATS");
                if (var2 != null) {
                  lw.field_lb = uu.a(var2, (byte) 110);
                }
                var2 = fk.a(false, "LABEL_ZAMORAK_HIGHSCORE");
                if (var2 != null) {
                  lb.field_d = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "LABEL_SARADOMIN_HIGHSCORE");
                if (null != var2) {
                  gk.field_P = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "LABEL_GUTHIX_HIGHSCORE");
                if (null != var2) {
                  mh.field_d = uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "RESULTS_PERFORMANCE");
                if (null != var2) {
                  cs.field_eb = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "RESULTS_TURNSUSED");
                if (null != var2) {
                  fg.field_m = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "RESULTS_DAMAGETAKEN");
                if (null != var2) {
                  OwnerChangeEvent.field_y = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "RESULTS_FINALSCORE");
                if (var2 != null) {
                  qf.field_g = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "INTRO_0");
                if (var2 != null) {
                  ts.field_b = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "INTRO_1");
                if (null != var2) {
                  wi.field_a = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "INTRO_2");
                if (null != var2) {
                  rf.field_e = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "INTRO_3");
                if (null != var2) {
                  je.field_lb = uu.a(var2, (byte) 55);
                }
                var2 = fk.a(false, "INTRO_4");
                if (var2 != null) {
                  ob.field_P = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "TEXT_ON");
                if (var2 != null) {
                  dn.field_Mb = uu.a(var2, (byte) 78);
                }
                var2 = fk.a(false, "TEXT_OFF");
                if (var2 != null) {
                  qd.field_J = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "TUT_TEXT,0");
                if (null != var2) {
                  TutorialController.field_f[0] = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "TUT_TEXT,1");
                if (null != var2) {
                  TutorialController.field_f[1] = uu.a(var2, (byte) -102);
                }
            }
            void runChunk4() throws java.lang.RuntimeException {
                var2 = fk.a(false, "TUT_TEXT,2");
                if (var2 != null) {
                  TutorialController.field_f[2] = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "TUT_TEXT,3");
                if (null != var2) {
                  TutorialController.field_f[3] = uu.a(var2, (byte) 106);
                }
                var2 = fk.a(false, "TUT_TEXT,4");
                if (null != var2) {
                  TutorialController.field_f[4] = uu.a(var2, (byte) 83);
                }
                var2 = fk.a(false, "TUT_TEXT,5");
                if (null != var2) {
                  TutorialController.field_f[5] = uu.a(var2, (byte) 80);
                }
                var2 = fk.a(false, "TUT_TEXT,6");
                if (var2 != null) {
                  TutorialController.field_f[6] = uu.a(var2, (byte) 106);
                }
                var2 = fk.a(false, "TUT_TEXT,7");
                if (var2 != null) {
                  TutorialController.field_f[7] = uu.a(var2, (byte) 93);
                }
                var2 = fk.a(false, "TUT_TEXT,8");
                if (var2 != null) {
                  TutorialController.field_f[8] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "TUT_TEXT,9");
                if (var2 != null) {
                  TutorialController.field_f[9] = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "TUT_TEXT,10");
                if (var2 != null) {
                  TutorialController.field_f[10] = uu.a(var2, (byte) 35);
                }
                var2 = fk.a(false, "TUT_TEXT,11");
                if (var2 != null) {
                  TutorialController.field_f[11] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "TUT_TEXT,12");
                if (null != var2) {
                  TutorialController.field_f[12] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "TUT_TEXT,13");
                if (null != var2) {
                  TutorialController.field_f[13] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "TUT_TEXT,14");
                if (var2 != null) {
                  TutorialController.field_f[14] = uu.a(var2, (byte) 28);
                }
                var2 = fk.a(false, "TUT_TEXT,15");
                if (var2 != null) {
                  TutorialController.field_f[15] = uu.a(var2, (byte) 13);
                }
                var2 = fk.a(false, "TUT_TEXT,16");
                if (var2 != null) {
                  TutorialController.field_f[16] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "TUT_TEXT,17");
                if (null != var2) {
                  TutorialController.field_f[17] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "TUT_TEXT,18");
                if (var2 != null) {
                  TutorialController.field_f[18] = uu.a(var2, (byte) 48);
                }
                var2 = fk.a(false, "TUT_TEXT,19");
                if (var2 != null) {
                  TutorialController.field_f[19] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "TUT_TEXT,20");
                if (var2 != null) {
                  TutorialController.field_f[20] = uu.a(var2, (byte) 69);
                }
                var2 = fk.a(false, "TUT_TEXT,21");
                if (null != var2) {
                  TutorialController.field_f[21] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "TUT_TEXT,22");
                if (null != var2) {
                  TutorialController.field_f[22] = uu.a(var2, (byte) 26);
                }
                var2 = fk.a(false, "TUT_TEXT,23");
                if (var2 != null) {
                  TutorialController.field_f[23] = uu.a(var2, (byte) 96);
                }
                var2 = fk.a(false, "TUT_TEXT,24");
                if (var2 != null) {
                  TutorialController.field_f[24] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "TUT_TEXT,25");
                if (null != var2) {
                  TutorialController.field_f[25] = uu.a(var2, (byte) 62);
                }
                var2 = fk.a(false, "TUT_TEXT,26");
                if (var2 != null) {
                  TutorialController.field_f[26] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "TUT_TEXT,27");
                if (null != var2) {
                  TutorialController.field_f[27] = uu.a(var2, (byte) 15);
                }
                var2 = fk.a(false, "DEFEATLEADER");
                if (null != var2) {
                  qt.field_a = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "CAPTUREGOAL");
                if (var2 != null) {
                  jj.field_f = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "CAPTUREGOALORDEFEATLEADER");
                if (var2 != null) {
                  pp.field_Y = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "PREVENTSUMMONING");
                if (null != var2) {
                  bk.field_c = uu.a(var2, (byte) 9);
                }
                var2 = fk.a(false, "DEFEATALLENEMIES");
                if (var2 != null) {
                  DeployAction.field_C = uu.a(var2, (byte) 18);
                }
                var2 = fk.a(false, "ESCORTLEADER");
                if (var2 != null) {
                  fa.field_g = uu.a(var2, (byte) 81);
                }
                var2 = fk.a(false, "CLOSE");
                if (var2 != null) {
                  GlobalSpell.field_m = uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "CONTINUE");
                if (null != var2) {
                  qf.field_c = uu.a(var2, (byte) 101);
                }
                var2 = fk.a(false, "OBJHIDE");
                if (var2 != null) {
                  SkeletonLimitMarker.field_t = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "OBJSHOW");
                if (null != var2) {
                  vg.field_k = uu.a(var2, (byte) 49);
                }
                var2 = fk.a(false, "TUTHIDE");
                if (null != var2) {
                  jk.field_a = uu.a(var2, (byte) 53);
                }
                var2 = fk.a(false, "TUTSHOW");
                if (var2 != null) {
                  DeployAction.field_z = uu.a(var2, (byte) 79);
                }
                var2 = fk.a(false, "TUTWAIT");
                if (null != var2) {
                  bc.field_f = uu.a(var2, (byte) 82);
                }
                var2 = fk.a(false, "TUTEND");
                if (var2 != null) {
                  ac.field_u = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "MANA_LOTS");
                if (var2 != null) {
                  uu.a(var2, (byte) 107);
                }
                var2 = fk.a(false, "SPELLBOOK_PURCHASE");
                if (null != var2) {
                  wv.field_e = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "SPELLBOOK_OWNED");
                if (var2 != null) {
                  CampaignMenuButton.field_b = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "SPELLBOOK_FREE");
                if (var2 != null) {
                  IntrusiveNode.field_d = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "SPELLBOOK_RUNES");
                if (null != var2) {
                  lm.field_f = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "SPELLBOOK_RUNE");
                if (null != var2) {
                  bt.field_b = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "SPELLBOOK_PURSE");
                if (var2 != null) {
                  ov.field_f = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "TRINKET_HAVE");
                if (var2 != null) {
                  me.field_a = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "MESSAGE_LOADING");
                if (var2 != null) {
                  ManaEvent.field_A = uu.a(var2, (byte) 78);
                }
                var2 = fk.a(false, "MESSAGE_QUIT");
                if (null != var2) {
                  wd.field_g = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "MESSAGE_DEAD");
                if (var2 != null) {
                  mq.field_Mb = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "MESSAGE_DRAW");
                if (null != var2) {
                  bk.field_h = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "MESSAGE_UNDRAW");
                if (null != var2) {
                  TelepopEvent.field_y = uu.a(var2, (byte) 113);
                }
                var2 = fk.a(false, "trinketnames,0");
                if (null != var2) {
                  fq.field_f[0] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "trinketnames,1");
                if (var2 != null) {
                  fq.field_f[1] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "trinketnames,2");
                if (null != var2) {
                  fq.field_f[2] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "trinketnames,3");
                if (null != var2) {
                  fq.field_f[3] = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "trinketnames,4");
                if (var2 != null) {
                  fq.field_f[4] = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "trinketnames,5");
                if (var2 != null) {
                  fq.field_f[5] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "trinketnames,6");
                if (var2 != null) {
                  fq.field_f[6] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "trinketnames,7");
                if (null != var2) {
                  fq.field_f[7] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "trinketnames,8");
                if (null != var2) {
                  fq.field_f[8] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "trinketnames,9");
                if (var2 != null) {
                  fq.field_f[9] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "trinketnames,10");
                if (var2 != null) {
                  fq.field_f[10] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketnames,11");
                if (null != var2) {
                  fq.field_f[11] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "trinketnames,12");
                if (null != var2) {
                  fq.field_f[12] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "trinketnames,13");
                if (var2 != null) {
                  fq.field_f[13] = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "trinketnames,14");
                if (var2 != null) {
                  fq.field_f[14] = uu.a(var2, (byte) 11);
                }
                var2 = fk.a(false, "trinketnames,15");
                if (var2 != null) {
                  fq.field_f[15] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "trinketnames,16");
                if (null != var2) {
                  fq.field_f[16] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "trinketnames,17");
                if (var2 != null) {
                  fq.field_f[17] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "trinketnames,18");
                if (null != var2) {
                  fq.field_f[18] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "trinketnames,19");
                if (null != var2) {
                  fq.field_f[19] = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "trinketnames,20");
                if (var2 != null) {
                  fq.field_f[20] = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "trinketnames,21");
                if (var2 != null) {
                  fq.field_f[21] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "trinketnames,22");
                if (null != var2) {
                  fq.field_f[22] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "trinketnames,23");
                if (null != var2) {
                  fq.field_f[23] = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "trinketnames,24");
                if (var2 != null) {
                  fq.field_f[24] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "trinketnames,25");
                if (var2 != null) {
                  fq.field_f[25] = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "trinketnames,26");
                if (var2 != null) {
                  fq.field_f[26] = uu.a(var2, (byte) 105);
                }
                var2 = fk.a(false, "trinketnames,27");
                if (null != var2) {
                  fq.field_f[27] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketnames,28");
                if (var2 != null) {
                  fq.field_f[28] = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "trinketnames,29");
                if (var2 != null) {
                  fq.field_f[29] = uu.a(var2, (byte) 89);
                }
                var2 = fk.a(false, "trinketnames,30");
                if (var2 != null) {
                  fq.field_f[30] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketnames,31");
                if (null != var2) {
                  fq.field_f[31] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "trinketnames,32");
                if (var2 != null) {
                  fq.field_f[32] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "trinketnames,33");
                if (null != var2) {
                  fq.field_f[33] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketnames,34");
                if (var2 != null) {
                  fq.field_f[34] = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "trinketnames,35");
                if (null != var2) {
                  fq.field_f[35] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketnames,36");
                if (null != var2) {
                  fq.field_f[36] = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "trinketnames,37");
                if (null != var2) {
                  fq.field_f[37] = uu.a(var2, (byte) 9);
                }
                var2 = fk.a(false, "trinketnames,38");
                if (null != var2) {
                  fq.field_f[38] = uu.a(var2, (byte) 28);
                }
                var2 = fk.a(false, "trinketnames,39");
                if (var2 != null) {
                  fq.field_f[39] = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "trinketnames,40");
                if (var2 != null) {
                  fq.field_f[40] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "trinketnames,41");
                if (var2 != null) {
                  fq.field_f[41] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketnames,42");
                if (var2 != null) {
                  fq.field_f[42] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "trinketnames,43");
                if (var2 != null) {
                  fq.field_f[43] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "trinketnames,44");
                if (null != var2) {
                  fq.field_f[44] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "trinketnames,45");
                if (null != var2) {
                  fq.field_f[45] = uu.a(var2, (byte) 116);
                }
                var2 = fk.a(false, "trinketnames,46");
                if (null != var2) {
                  fq.field_f[46] = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "trinketnames,47");
                if (var2 != null) {
                  fq.field_f[47] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "trinketnames,48");
                if (var2 != null) {
                  fq.field_f[48] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "trinketnames,49");
                if (null != var2) {
                  fq.field_f[49] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketnames,50");
                if (null != var2) {
                  fq.field_f[50] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "trinketnames,51");
                if (var2 != null) {
                  fq.field_f[51] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "trinketnames,52");
                if (var2 != null) {
                  fq.field_f[52] = uu.a(var2, (byte) 4);
                }
                var2 = fk.a(false, "trinketnames,53");
                if (null != var2) {
                  fq.field_f[53] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "trinketnames,54");
                if (null != var2) {
                  fq.field_f[54] = uu.a(var2, (byte) 110);
                }
                var2 = fk.a(false, "trinketnames,55");
                if (var2 != null) {
                  fq.field_f[55] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "trinketnames,56");
                if (var2 != null) {
                  fq.field_f[56] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "trinketnames,57");
                if (var2 != null) {
                  fq.field_f[57] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "trinketnames,58");
                if (var2 != null) {
                  fq.field_f[58] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "trinketnames,59");
                if (var2 != null) {
                  fq.field_f[59] = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "trinketnames,60");
                if (null != var2) {
                  fq.field_f[60] = uu.a(var2, (byte) 20);
                }
                var2 = fk.a(false, "trinketnames,61");
                if (var2 != null) {
                  fq.field_f[61] = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "trinketnames,62");
                if (null != var2) {
                  fq.field_f[62] = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "trinketnames,63");
                if (null != var2) {
                  fq.field_f[63] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "trinketnames,64");
                if (var2 != null) {
                  fq.field_f[64] = uu.a(var2, (byte) 62);
                }
                var2 = fk.a(false, "trinketnames,65");
                if (null != var2) {
                  fq.field_f[65] = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "trinketnames,66");
                if (var2 != null) {
                  fq.field_f[66] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "trinketnames,67");
                if (null != var2) {
                  fq.field_f[67] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "trinketnames,68");
                if (null != var2) {
                  fq.field_f[68] = uu.a(var2, (byte) 56);
                }
                var2 = fk.a(false, "trinketnames,69");
                if (null != var2) {
                  fq.field_f[69] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "trinketnames,70");
                if (var2 != null) {
                  fq.field_f[70] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "trinketnames,71");
                if (null != var2) {
                  fq.field_f[71] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "trinketnames,72");
                if (var2 != null) {
                  fq.field_f[72] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "trinketnames,73");
                if (null != var2) {
                  fq.field_f[73] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketnames,74");
                if (null != var2) {
                  fq.field_f[74] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketnames,75");
                if (null != var2) {
                  fq.field_f[75] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "trinketnames,76");
                if (null != var2) {
                  fq.field_f[76] = uu.a(var2, (byte) 61);
                }
                var2 = fk.a(false, "trinketnames,77");
                if (null != var2) {
                  fq.field_f[77] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "trinketnames,78");
                if (var2 != null) {
                  fq.field_f[78] = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "trinketnames,79");
                if (null != var2) {
                  fq.field_f[79] = uu.a(var2, (byte) 8);
                }
                var2 = fk.a(false, "trinketnames,80");
                if (null != var2) {
                  fq.field_f[80] = uu.a(var2, (byte) 3);
                }
                var2 = fk.a(false, "trinketnames,81");
                if (null != var2) {
                  fq.field_f[81] = uu.a(var2, (byte) 67);
                }
                var2 = fk.a(false, "trinketnames,82");
                if (null != var2) {
                  fq.field_f[82] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "trinketnames,83");
                if (null != var2) {
                  fq.field_f[83] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "trinketnames,84");
                if (null != var2) {
                  fq.field_f[84] = uu.a(var2, (byte) 126);
                }
                var2 = fk.a(false, "trinketnames,85");
                if (null != var2) {
                  fq.field_f[85] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "trinketnames,86");
                if (var2 != null) {
                  fq.field_f[86] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "trinketnames,87");
                if (var2 != null) {
                  fq.field_f[87] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "trinketnames,88");
                if (var2 != null) {
                  fq.field_f[88] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "trinketnames,89");
                if (null != var2) {
                  fq.field_f[89] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketnames,90");
                if (null != var2) {
                  fq.field_f[90] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "trinketnames,91");
                if (null != var2) {
                  fq.field_f[91] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "trinketnames,92");
                if (var2 != null) {
                  fq.field_f[92] = uu.a(var2, (byte) 20);
                }
                var2 = fk.a(false, "trinketnames,93");
                if (var2 != null) {
                  fq.field_f[93] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "trinketnames,94");
                if (null != var2) {
                  fq.field_f[94] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "trinketnames,95");
                if (null != var2) {
                  fq.field_f[95] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "trinketnames,96");
                if (var2 != null) {
                  fq.field_f[96] = uu.a(var2, (byte) 76);
                }
                var2 = fk.a(false, "trinketnames,97");
                if (var2 != null) {
                  fq.field_f[97] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "trinketnames,98");
                if (var2 != null) {
                  fq.field_f[98] = uu.a(var2, (byte) 126);
                }
                var2 = fk.a(false, "trinketnames,99");
                if (null != var2) {
                  fq.field_f[99] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "trinketnames,100");
                if (var2 != null) {
                  fq.field_f[100] = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "trinketnames,101");
                if (null != var2) {
                  fq.field_f[101] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketnames,102");
                if (var2 != null) {
                  fq.field_f[102] = uu.a(var2, (byte) 92);
                }
                var2 = fk.a(false, "trinketnames,103");
                if (null != var2) {
                  fq.field_f[103] = uu.a(var2, (byte) 103);
                }
                var2 = fk.a(false, "trinketnames,104");
                if (null != var2) {
                  fq.field_f[104] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketnames,105");
                if (null != var2) {
                  fq.field_f[105] = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "trinketnames,106");
                if (var2 != null) {
                  fq.field_f[106] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "trinketnames,107");
                if (var2 != null) {
                  fq.field_f[107] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "trinketnames,108");
                if (null != var2) {
                  fq.field_f[108] = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "trinketnames,109");
                if (var2 != null) {
                  fq.field_f[109] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketnames,110");
                if (null != var2) {
                  fq.field_f[110] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "trinketnames,111");
                if (var2 != null) {
                  fq.field_f[111] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "trinketnames,112");
                if (null != var2) {
                  fq.field_f[112] = uu.a(var2, (byte) 66);
                }
                var2 = fk.a(false, "trinketnames,113");
                if (null != var2) {
                  fq.field_f[113] = uu.a(var2, (byte) 93);
                }
                var2 = fk.a(false, "trinketnames,114");
                if (null != var2) {
                  fq.field_f[114] = uu.a(var2, (byte) 61);
                }
                var2 = fk.a(false, "trinketnames,115");
                if (var2 != null) {
                  fq.field_f[115] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "trinketnames,116");
                if (var2 != null) {
                  fq.field_f[116] = uu.a(var2, (byte) 18);
                }
                var2 = fk.a(false, "trinketnames,117");
                if (null != var2) {
                  fq.field_f[117] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "trinketnames,118");
                if (null != var2) {
                  fq.field_f[118] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "trinketnames,119");
                if (var2 != null) {
                  fq.field_f[119] = uu.a(var2, (byte) 75);
                }
                var2 = fk.a(false, "trinketnames,120");
                if (var2 != null) {
                  fq.field_f[120] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "trinketnames,121");
                if (null != var2) {
                  fq.field_f[121] = uu.a(var2, (byte) 85);
                }
                var2 = fk.a(false, "trinketnames,122");
                if (null != var2) {
                  fq.field_f[122] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "trinketnames,123");
                if (null != var2) {
                  fq.field_f[123] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "trinketnames,124");
                if (var2 != null) {
                  fq.field_f[124] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "trinketnames,125");
                if (null != var2) {
                  fq.field_f[125] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "trinketnames,126");
                if (var2 != null) {
                  fq.field_f[126] = uu.a(var2, (byte) 69);
                }
                var2 = fk.a(false, "trinketnames,127");
                if (null != var2) {
                  fq.field_f[127] = uu.a(var2, (byte) 38);
                }
                var2 = fk.a(false, "trinketnames,128");
                if (var2 != null) {
                  fq.field_f[128] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "trinketnames,129");
                if (null != var2) {
                  fq.field_f[129] = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "trinketnames,130");
                if (null != var2) {
                  fq.field_f[130] = uu.a(var2, (byte) 99);
                }
                var2 = fk.a(false, "trinketnames,131");
                if (null != var2) {
                  fq.field_f[131] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketnames,132");
                if (null != var2) {
                  fq.field_f[132] = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "trinketnames,133");
                if (var2 != null) {
                  fq.field_f[133] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketnames,134");
                if (var2 != null) {
                  fq.field_f[134] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "trinketdescriptions,0");
                if (var2 != null) {
                  ActionRequest.field_l[0] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "trinketdescriptions,1");
                if (var2 != null) {
                  ActionRequest.field_l[1] = uu.a(var2, (byte) 46);
                }
                var2 = fk.a(false, "trinketdescriptions,2");
                if (var2 != null) {
                  ActionRequest.field_l[2] = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "trinketdescriptions,3");
                if (null != var2) {
                  ActionRequest.field_l[3] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "trinketdescriptions,4");
                if (var2 != null) {
                  ActionRequest.field_l[4] = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "trinketdescriptions,5");
                if (null != var2) {
                  ActionRequest.field_l[5] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "trinketdescriptions,6");
                if (null != var2) {
                  ActionRequest.field_l[6] = uu.a(var2, (byte) 80);
                }
                var2 = fk.a(false, "trinketdescriptions,7");
                if (null != var2) {
                  ActionRequest.field_l[7] = uu.a(var2, (byte) 27);
                }
                var2 = fk.a(false, "trinketdescriptions,8");
                if (var2 != null) {
                  ActionRequest.field_l[8] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "trinketdescriptions,9");
                if (var2 != null) {
                  ActionRequest.field_l[9] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketdescriptions,10");
                if (null != var2) {
                  ActionRequest.field_l[10] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "trinketdescriptions,11");
                if (var2 != null) {
                  ActionRequest.field_l[11] = uu.a(var2, (byte) 116);
                }
                var2 = fk.a(false, "trinketdescriptions,12");
                if (var2 != null) {
                  ActionRequest.field_l[12] = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "trinketdescriptions,13");
                if (var2 != null) {
                  ActionRequest.field_l[13] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "trinketdescriptions,14");
                if (null != var2) {
                  ActionRequest.field_l[14] = uu.a(var2, (byte) 35);
                }
                var2 = fk.a(false, "trinketdescriptions,15");
                if (var2 != null) {
                  ActionRequest.field_l[15] = uu.a(var2, (byte) 28);
                }
                var2 = fk.a(false, "trinketdescriptions,16");
                if (null != var2) {
                  ActionRequest.field_l[16] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "trinketdescriptions,17");
                if (null != var2) {
                  ActionRequest.field_l[17] = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "trinketdescriptions,18");
                if (var2 != null) {
                  ActionRequest.field_l[18] = uu.a(var2, (byte) 112);
                }
                var2 = fk.a(false, "trinketdescriptions,19");
                if (var2 != null) {
                  ActionRequest.field_l[19] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketdescriptions,20");
                if (null != var2) {
                  ActionRequest.field_l[20] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "trinketdescriptions,21");
                if (null != var2) {
                  ActionRequest.field_l[21] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "trinketdescriptions,22");
                if (null != var2) {
                  ActionRequest.field_l[22] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "trinketdescriptions,23");
                if (null != var2) {
                  ActionRequest.field_l[23] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "trinketdescriptions,24");
                if (null != var2) {
                  ActionRequest.field_l[24] = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "trinketdescriptions,25");
                if (null != var2) {
                  ActionRequest.field_l[25] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "trinketdescriptions,26");
                if (var2 != null) {
                  ActionRequest.field_l[26] = uu.a(var2, (byte) -126);
                }
            }
            void runChunk5() throws java.lang.RuntimeException {
                var2 = fk.a(false, "trinketdescriptions,27");
                if (null != var2) {
                  ActionRequest.field_l[27] = uu.a(var2, (byte) 82);
                }
                var2 = fk.a(false, "trinketdescriptions,28");
                if (var2 != null) {
                  ActionRequest.field_l[28] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "trinketdescriptions,29");
                if (null != var2) {
                  ActionRequest.field_l[29] = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "trinketdescriptions,30");
                if (null != var2) {
                  ActionRequest.field_l[30] = uu.a(var2, (byte) 65);
                }
                var2 = fk.a(false, "trinketdescriptions,31");
                if (null != var2) {
                  ActionRequest.field_l[31] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "trinketdescriptions,32");
                if (null != var2) {
                  ActionRequest.field_l[32] = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "trinketdescriptions,33");
                if (null != var2) {
                  ActionRequest.field_l[33] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "trinketdescriptions,34");
                if (null != var2) {
                  ActionRequest.field_l[34] = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "trinketdescriptions,35");
                if (null != var2) {
                  ActionRequest.field_l[35] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "trinketdescriptions,36");
                if (var2 != null) {
                  ActionRequest.field_l[36] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "trinketdescriptions,37");
                if (var2 != null) {
                  ActionRequest.field_l[37] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "trinketdescriptions,38");
                if (null != var2) {
                  ActionRequest.field_l[38] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "trinketdescriptions,39");
                if (null != var2) {
                  ActionRequest.field_l[39] = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "trinketdescriptions,40");
                if (null != var2) {
                  ActionRequest.field_l[40] = uu.a(var2, (byte) 46);
                }
                var2 = fk.a(false, "trinketdescriptions,41");
                if (null != var2) {
                  ActionRequest.field_l[41] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "trinketdescriptions,42");
                if (null != var2) {
                  ActionRequest.field_l[42] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "trinketdescriptions,43");
                if (null != var2) {
                  ActionRequest.field_l[43] = uu.a(var2, (byte) 31);
                }
                var2 = fk.a(false, "trinketdescriptions,44");
                if (var2 != null) {
                  ActionRequest.field_l[44] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "trinketdescriptions,45");
                if (var2 != null) {
                  ActionRequest.field_l[45] = uu.a(var2, (byte) 4);
                }
                var2 = fk.a(false, "trinketdescriptions,46");
                if (null != var2) {
                  ActionRequest.field_l[46] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "trinketdescriptions,47");
                if (null != var2) {
                  ActionRequest.field_l[47] = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "trinketdescriptions,48");
                if (null != var2) {
                  ActionRequest.field_l[48] = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "trinketdescriptions,49");
                if (null != var2) {
                  ActionRequest.field_l[49] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "trinketdescriptions,50");
                if (null != var2) {
                  ActionRequest.field_l[50] = uu.a(var2, (byte) 124);
                }
                var2 = fk.a(false, "trinketdescriptions,51");
                if (var2 != null) {
                  ActionRequest.field_l[51] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "trinketdescriptions,52");
                if (null != var2) {
                  ActionRequest.field_l[52] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "trinketdescriptions,53");
                if (var2 != null) {
                  ActionRequest.field_l[53] = uu.a(var2, (byte) 97);
                }
                var2 = fk.a(false, "trinketdescriptions,54");
                if (null != var2) {
                  ActionRequest.field_l[54] = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "trinketdescriptions,55");
                if (var2 != null) {
                  ActionRequest.field_l[55] = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "trinketdescriptions,56");
                if (null != var2) {
                  ActionRequest.field_l[56] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "trinketdescriptions,57");
                if (null != var2) {
                  ActionRequest.field_l[57] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "trinketdescriptions,58");
                if (null != var2) {
                  ActionRequest.field_l[58] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketdescriptions,59");
                if (var2 != null) {
                  ActionRequest.field_l[59] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketdescriptions,60");
                if (null != var2) {
                  ActionRequest.field_l[60] = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "trinketdescriptions,61");
                if (null != var2) {
                  ActionRequest.field_l[61] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "trinketdescriptions,62");
                if (null != var2) {
                  ActionRequest.field_l[62] = uu.a(var2, (byte) 47);
                }
                var2 = fk.a(false, "trinketdescriptions,63");
                if (var2 != null) {
                  ActionRequest.field_l[63] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "trinketdescriptions,64");
                if (null != var2) {
                  ActionRequest.field_l[64] = uu.a(var2, (byte) 119);
                }
                var2 = fk.a(false, "trinketdescriptions,65");
                if (var2 != null) {
                  ActionRequest.field_l[65] = uu.a(var2, (byte) 85);
                }
                var2 = fk.a(false, "trinketdescriptions,66");
                if (var2 != null) {
                  ActionRequest.field_l[66] = uu.a(var2, (byte) 34);
                }
                var2 = fk.a(false, "trinketdescriptions,67");
                if (null != var2) {
                  ActionRequest.field_l[67] = uu.a(var2, (byte) -92);
                }
                var2 = fk.a(false, "trinketdescriptions,68");
                if (null != var2) {
                  ActionRequest.field_l[68] = uu.a(var2, (byte) 116);
                }
                var2 = fk.a(false, "trinketdescriptions,69");
                if (var2 != null) {
                  ActionRequest.field_l[69] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "trinketdescriptions,70");
                if (var2 != null) {
                  ActionRequest.field_l[70] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "trinketdescriptions,71");
                if (null != var2) {
                  ActionRequest.field_l[71] = uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "trinketdescriptions,72");
                if (var2 != null) {
                  ActionRequest.field_l[72] = uu.a(var2, (byte) 13);
                }
                var2 = fk.a(false, "trinketdescriptions,73");
                if (var2 != null) {
                  ActionRequest.field_l[73] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "trinketdescriptions,74");
                if (null != var2) {
                  ActionRequest.field_l[74] = uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "trinketdescriptions,75");
                if (null != var2) {
                  ActionRequest.field_l[75] = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "trinketdescriptions,76");
                if (var2 != null) {
                  ActionRequest.field_l[76] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketdescriptions,77");
                if (null != var2) {
                  ActionRequest.field_l[77] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "trinketdescriptions,78");
                if (var2 != null) {
                  ActionRequest.field_l[78] = uu.a(var2, (byte) 14);
                }
                var2 = fk.a(false, "trinketdescriptions,79");
                if (null != var2) {
                  ActionRequest.field_l[79] = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "trinketdescriptions,80");
                if (null != var2) {
                  ActionRequest.field_l[80] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "trinketdescriptions,81");
                if (var2 != null) {
                  ActionRequest.field_l[81] = uu.a(var2, (byte) 57);
                }
                var2 = fk.a(false, "trinketdescriptions,82");
                if (var2 != null) {
                  ActionRequest.field_l[82] = uu.a(var2, (byte) 98);
                }
                var2 = fk.a(false, "trinketdescriptions,83");
                if (null != var2) {
                  ActionRequest.field_l[83] = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "trinketdescriptions,84");
                if (var2 != null) {
                  ActionRequest.field_l[84] = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "trinketdescriptions,85");
                if (var2 != null) {
                  ActionRequest.field_l[85] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "trinketdescriptions,86");
                if (var2 != null) {
                  ActionRequest.field_l[86] = uu.a(var2, (byte) 43);
                }
                var2 = fk.a(false, "trinketdescriptions,87");
                if (null != var2) {
                  ActionRequest.field_l[87] = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "trinketdescriptions,88");
                if (null != var2) {
                  ActionRequest.field_l[88] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "trinketdescriptions,89");
                if (var2 != null) {
                  ActionRequest.field_l[89] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "trinketdescriptions,90");
                if (null != var2) {
                  ActionRequest.field_l[90] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "trinketdescriptions,91");
                if (null != var2) {
                  ActionRequest.field_l[91] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "trinketdescriptions,92");
                if (null != var2) {
                  ActionRequest.field_l[92] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "trinketdescriptions,93");
                if (var2 != null) {
                  ActionRequest.field_l[93] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "trinketdescriptions,94");
                if (null != var2) {
                  ActionRequest.field_l[94] = uu.a(var2, (byte) 67);
                }
                var2 = fk.a(false, "trinketdescriptions,95");
                if (null != var2) {
                  ActionRequest.field_l[95] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "trinketdescriptions,96");
                if (var2 != null) {
                  ActionRequest.field_l[96] = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "trinketdescriptions,97");
                if (null != var2) {
                  ActionRequest.field_l[97] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketdescriptions,98");
                if (null != var2) {
                  ActionRequest.field_l[98] = uu.a(var2, (byte) 44);
                }
                var2 = fk.a(false, "trinketdescriptions,99");
                if (var2 != null) {
                  ActionRequest.field_l[99] = uu.a(var2, (byte) 54);
                }
                var2 = fk.a(false, "trinketdescriptions,100");
                if (var2 != null) {
                  ActionRequest.field_l[100] = uu.a(var2, (byte) 69);
                }
                var2 = fk.a(false, "trinketdescriptions,101");
                if (var2 != null) {
                  ActionRequest.field_l[101] = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "trinketdescriptions,102");
                if (var2 != null) {
                  ActionRequest.field_l[102] = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "trinketdescriptions,103");
                if (null != var2) {
                  ActionRequest.field_l[103] = uu.a(var2, (byte) 79);
                }
                var2 = fk.a(false, "trinketdescriptions,104");
                if (null != var2) {
                  ActionRequest.field_l[104] = uu.a(var2, (byte) 97);
                }
                var2 = fk.a(false, "trinketdescriptions,105");
                if (null != var2) {
                  ActionRequest.field_l[105] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "trinketdescriptions,106");
                if (var2 != null) {
                  ActionRequest.field_l[106] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketdescriptions,107");
                if (null != var2) {
                  ActionRequest.field_l[107] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "trinketdescriptions,108");
                if (null != var2) {
                  ActionRequest.field_l[108] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketdescriptions,109");
                if (null != var2) {
                  ActionRequest.field_l[109] = uu.a(var2, (byte) 113);
                }
                var2 = fk.a(false, "trinketdescriptions,110");
                if (null != var2) {
                  ActionRequest.field_l[110] = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "trinketdescriptions,111");
                if (null != var2) {
                  ActionRequest.field_l[111] = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "trinketdescriptions,112");
                if (var2 != null) {
                  ActionRequest.field_l[112] = uu.a(var2, (byte) 58);
                }
                var2 = fk.a(false, "trinketdescriptions,113");
                if (var2 != null) {
                  ActionRequest.field_l[113] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "trinketdescriptions,114");
                if (var2 != null) {
                  ActionRequest.field_l[114] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "trinketdescriptions,115");
                if (var2 != null) {
                  ActionRequest.field_l[115] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "trinketdescriptions,116");
                if (null != var2) {
                  ActionRequest.field_l[116] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "trinketdescriptions,117");
                if (null != var2) {
                  ActionRequest.field_l[117] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "trinketdescriptions,118");
                if (null != var2) {
                  ActionRequest.field_l[118] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketdescriptions,119");
                if (null != var2) {
                  ActionRequest.field_l[119] = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "trinketdescriptions,120");
                if (null != var2) {
                  ActionRequest.field_l[120] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "trinketdescriptions,121");
                if (var2 != null) {
                  ActionRequest.field_l[121] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "trinketdescriptions,122");
                if (var2 != null) {
                  ActionRequest.field_l[122] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketdescriptions,123");
                if (var2 != null) {
                  ActionRequest.field_l[123] = uu.a(var2, (byte) 96);
                }
                var2 = fk.a(false, "trinketdescriptions,124");
                if (null != var2) {
                  ActionRequest.field_l[124] = uu.a(var2, (byte) 84);
                }
                var2 = fk.a(false, "trinketdescriptions,125");
                if (var2 != null) {
                  ActionRequest.field_l[125] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketdescriptions,126");
                if (var2 != null) {
                  ActionRequest.field_l[126] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "trinketdescriptions,127");
                if (null != var2) {
                  ActionRequest.field_l[127] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "trinketdescriptions,128");
                if (null != var2) {
                  ActionRequest.field_l[128] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketdescriptions,129");
                if (var2 != null) {
                  ActionRequest.field_l[129] = uu.a(var2, (byte) 96);
                }
                var2 = fk.a(false, "trinketdescriptions,130");
                if (null != var2) {
                  ActionRequest.field_l[130] = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "trinketdescriptions,131");
                if (null != var2) {
                  ActionRequest.field_l[131] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "trinketdescriptions,132");
                if (null != var2) {
                  ActionRequest.field_l[132] = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "trinketdescriptions,133");
                if (null != var2) {
                  ActionRequest.field_l[133] = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "trinketdescriptions,134");
                if (var2 != null) {
                  ActionRequest.field_l[134] = uu.a(var2, (byte) 27);
                }
                var2 = fk.a(false, "TXT_BACKTO");
                if (var2 != null) {
                  rr.field_a = uu.a(var2, (byte) 12);
                }
                var2 = fk.a(false, "TTREEN_INVENTORY");
                if (null != var2) {
                  or.field_j = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "TTREEN_EQUIPMENT");
                if (var2 != null) {
                  qc.field_i = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "TTREEN_SPELLS");
                if (null != var2) {
                  na.field_I = uu.a(var2, (byte) 17);
                }
                var2 = fk.a(false, "TTREEN_POTIONS");
                if (var2 != null) {
                  fd.field_o = uu.a(var2, (byte) 92);
                }
                var2 = fk.a(false, "TTREEN_ARMOUR");
                if (var2 != null) {
                  dn.field_Lb = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "TTREEN_WEAPONS");
                if (null != var2) {
                  sa.field_d = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "TTREEN_ACCESSORIES");
                if (var2 != null) {
                  jm.field_d = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "TTREEN_PLATE");
                if (null != var2) {
                  SummonRequest.field_x = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "TTREEN_PADDED");
                if (var2 != null) {
                  TutorialController.field_b = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "TTREEN_ENCHANTED");
                if (null != var2) {
                  r.field_w = uu.a(var2, (byte) -103);
                }
                var2 = fk.a(false, "TTREEN_DRAGONSCALE");
                if (null != var2) {
                  oh.field_F = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "TTREEN_CAMOUFLAGE");
                if (null != var2) {
                  ms.field_p = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "TTREEN_RUNIC");
                if (var2 != null) {
                  tl.field_f = uu.a(var2, (byte) 29);
                }
                var2 = fk.a(false, "TTREEN_SACRIFICIAL");
                if (null != var2) {
                  UnitInfoPopup.field_l = uu.a(var2, (byte) 49);
                }
                var2 = fk.a(false, "TTREEN_MELEE");
                if (var2 != null) {
                  on.field_k = uu.a(var2, (byte) 23);
                }
                var2 = fk.a(false, "TTREEN_RANGED");
                if (null != var2) {
                  hl.field_Lb = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "TTREEN_MAGIC");
                if (null != var2) {
                  hf.field_g = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "TTREEN_AERIAL");
                if (null != var2) {
                  ms.field_n = uu.a(var2, (byte) 59);
                }
                var2 = fk.a(false, "TTREEN_FLAME");
                if (var2 != null) {
                  nl.field_D = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "TTREEN_HEALING");
                if (var2 != null) {
                  mi.field_C = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "TTREEN_HARMING");
                if (null != var2) {
                  nl.field_G = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "TTREEN_MOVES");
                if (var2 != null) {
                  dr.field_y = uu.a(var2, (byte) 118);
                }
                var2 = fk.a(false, "TTREEN_INSTANTS");
                if (var2 != null) {
                  TeamRoster.field_h = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "TTREEN_LANDSCAPE");
                if (var2 != null) {
                  BattleCamera.field_f = uu.a(var2, (byte) 77);
                }
                var2 = fk.a(false, "TTREEN_INFLUENCE");
                if (null != var2) {
                  fq.field_a = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "TTREEN_RAYS");
                if (null != var2) {
                  vv.field_a = uu.a(var2, (byte) 55);
                }
                var2 = fk.a(false, "TTREEN_AURAS");
                if (var2 != null) {
                  ij.field_v = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "TTREEN_BOLTS");
                if (null != var2) {
                  AnimationSequence.field_l = uu.a(var2, (byte) 120);
                }
                var2 = fk.a(false, "TTREEN_RAINS");
                if (var2 != null) {
                  vv.field_c = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "TTREEN_CURSE");
                if (null != var2) {
                  iv.field_m = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "TTREEN_SOURCERY");
                if (var2 != null) {
                  dv.field_i = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "TTREEN_PRAYER");
                if (var2 != null) {
                  kp.field_j = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "TTREEN_TONICS");
                if (null != var2) {
                  c.field_b = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "TTREEN_TOXINS");
                if (null != var2) {
                  vf.field_h = uu.a(var2, (byte) -93);
                }
                var2 = fk.a(false, "TTREEN_POLYMORPHICS");
                if (var2 != null) {
                  ov.field_c = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "TTREEN_MUTAGENS");
                if (null != var2) {
                  SpellMenuGroup.field_d = uu.a(var2, (byte) 50);
                }
                var2 = fk.a(false, "TTREED_INVENTORY");
                if (null != var2) {
                  ck.field_d = uu.a(var2, (byte) 19);
                }
                var2 = fk.a(false, "TTREED_EQUIPMENT");
                if (null != var2) {
                  ma.field_X = uu.a(var2, (byte) 25);
                }
                var2 = fk.a(false, "TTREED_SPELLS");
                if (null != var2) {
                  ea.field_b = uu.a(var2, (byte) 13);
                }
                var2 = fk.a(false, "TTREED_POTIONS");
                if (null != var2) {
                  vq.field_e = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "TTREED_ARMOUR");
                if (var2 != null) {
                  qu.field_n = uu.a(var2, (byte) 25);
                }
                var2 = fk.a(false, "TTREED_WEAPONS");
                if (null != var2) {
                  ed.field_a = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "TTREED_ACCESSORIES");
                if (null != var2) {
                  dq.field_d = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "TTREED_PLATE");
                if (null != var2) {
                  wh.field_e = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "TTREED_PADDED");
                if (var2 != null) {
                  ki.field_f = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "TTREED_ENCHANTED");
                if (var2 != null) {
                  nh.field_H = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "TTREED_DRAGONSCALE");
                if (null != var2) {
                  AiActionCandidate.field_n = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "TTREED_CAMOUFLAGE");
                if (null != var2) {
                  ai.field_J = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "TTREED_RUNIC");
                if (var2 != null) {
                  ll.field_Kb = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "TTREED_SACRIFICIAL");
                if (null != var2) {
                  UnitLossCondition.field_c = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "TTREED_MELEE");
                if (var2 != null) {
                  nv.field_J = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "TTREED_RANGED");
                if (var2 != null) {
                  dq.field_j = uu.a(var2, (byte) 114);
                }
                var2 = fk.a(false, "TTREED_MAGIC");
                if (null != var2) {
                  fm.field_b = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "TTREED_AERIAL");
                if (var2 != null) {
                  bl.field_a = uu.a(var2, (byte) 41);
                }
                var2 = fk.a(false, "TTREED_FLAME");
                if (null != var2) {
                  ActionRequest.field_q = uu.a(var2, (byte) 24);
                }
                var2 = fk.a(false, "TTREED_HEALING");
                if (var2 != null) {
                  bh.field_L = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "TTREED_HARMING");
                if (var2 != null) {
                  fj.field_u = uu.a(var2, (byte) 52);
                }
                var2 = fk.a(false, "TTREED_MOVES");
                if (var2 != null) {
                  hg.field_c = uu.a(var2, (byte) 104);
                }
                var2 = fk.a(false, "TTREED_INSTANTS");
                if (var2 != null) {
                  TurnEffectEvent.field_A = uu.a(var2, (byte) -106);
                }
                var2 = fk.a(false, "TTREED_LANDSCAPE");
                if (null != var2) {
                  nf.field_Pb = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "TTREED_INFLUENCE");
                if (var2 != null) {
                  rd.field_a = uu.a(var2, (byte) 61);
                }
                var2 = fk.a(false, "TTREED_RAYS");
                if (var2 != null) {
                  cn.field_q = uu.a(var2, (byte) 89);
                }
                var2 = fk.a(false, "TTREED_AURAS");
                if (var2 != null) {
                  cn.field_s = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "TTREED_BOLTS");
                if (var2 != null) {
                  ja.field_o = uu.a(var2, (byte) 124);
                }
                var2 = fk.a(false, "TTREED_RAINS");
                if (null != var2) {
                  ng.field_s = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "TTREED_CURSE");
                if (null != var2) {
                  m.field_g = uu.a(var2, (byte) 22);
                }
                var2 = fk.a(false, "TTREED_SOURCERY");
                if (null != var2) {
                  BattleCharacter.field_v = uu.a(var2, (byte) -101);
                }
                var2 = fk.a(false, "TTREED_PRAYER");
                if (var2 != null) {
                  AiInfluenceMap.field_l = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "TTREED_TONICS");
                if (var2 != null) {
                  ao.field_u = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "TTREED_TOXINS");
                if (var2 != null) {
                  gi.field_a = uu.a(var2, (byte) 91);
                }
                var2 = fk.a(false, "TTREED_POLYMORPHICS");
                if (null != var2) {
                  p.field_c = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "TTREED_MUTAGENS");
                if (var2 != null) {
                  CampaignQuicksave.field_a = uu.a(var2, (byte) 101);
                }
                var2 = fk.a(false, "TERROR_NOTMYTURN");
                if (null != var2) {
                  sj.field_g = uu.a(var2, (byte) 36);
                }
                var2 = fk.a(false, "TERROR_NOTYET");
                if (var2 != null) {
                  kv.field_I = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "TERROR_NOTENOUGHRUNES");
                if (null != var2) {
                  MovementPlanner.field_v = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "TERROR_NOGOD");
                if (var2 != null) {
                  RegionAnchor.field_n = uu.a(var2, (byte) 49);
                }
                var2 = fk.a(false, "TERROR_GODMAXED");
                if (var2 != null) {
                  rr.field_b = uu.a(var2, (byte) 96);
                }
                var2 = fk.a(false, "TERROR_NOKBD");
                if (var2 != null) {
                  ij.field_B = uu.a(var2, (byte) 117);
                }
                var2 = fk.a(false, "TERROR_NOTARGET");
                if (var2 != null) {
                  MoveAttackAction.field_G = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "TERROR_NOPORTALS");
                if (null != var2) {
                  kp.field_c = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "TERROR_NOUNIT");
                if (null != var2) {
                  ai.field_N = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "TERROR_NOTALLY");
                if (var2 != null) {
                  gp.field_a = uu.a(var2, (byte) 11);
                }
                var2 = fk.a(false, "TERROR_NOTMINE");
                if (var2 != null) {
                  ji.field_a = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "TERROR_NOTENEMY");
                if (null != var2) {
                  MovementPresentation.field_r = uu.a(var2, (byte) 84);
                }
                var2 = fk.a(false, "TERROR_NOTKQUEEN");
                if (var2 != null) {
                  eq.field_k = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "TERROR_NOTSONGSTRESS");
                if (var2 != null) {
                  fg.field_n = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "TERROR_NOTCYCLOPS");
                if (var2 != null) {
                  SpellCastEvent.field_A = uu.a(var2, (byte) -119);
                }
                var2 = fk.a(false, "TERROR_NOTOGRE");
                if (var2 != null) {
                  GlobalSpell.field_i = uu.a(var2, (byte) 115);
                }
                var2 = fk.a(false, "TERROR_NOTGOBLIN");
                if (null != var2) {
                  cs.field_X = uu.a(var2, (byte) 110);
                }
                var2 = fk.a(false, "TERROR_NOTMOVED");
                if (var2 != null) {
                  eq.field_g = uu.a(var2, (byte) 108);
                }
                var2 = fk.a(false, "TERROR_LOWLEVEL");
                if (var2 != null) {
                  sq.field_s = uu.a(var2, (byte) 65);
                }
                var2 = fk.a(false, "TERROR_NOTOTHER");
                if (var2 != null) {
                  na.field_N = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "TERROR_NOTFLAT");
                if (var2 != null) {
                  qt.field_d = uu.a(var2, (byte) 83);
                }
                var2 = fk.a(false, "TERROR_NOTVILLAGE");
                if (null != var2) {
                  TextCursor.field_g = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "TERROR_NOTYOURS");
                if (null != var2) {
                  ActionSpell.field_k = uu.a(var2, (byte) 29);
                }
                var2 = fk.a(false, "TERROR_NOREVOLT");
                if (null != var2) {
                  tv.field_d = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "TERROR_NOTOWNED");
                if (var2 != null) {
                  uc.field_c = uu.a(var2, (byte) 70);
                }
                var2 = fk.a(false, "TERROR_NOTRINKET");
                if (null != var2) {
                  StateChangeEvent.field_A = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "TERROR_GOTONE");
                if (var2 != null) {
                  ti.field_b = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "TERROR_CLONING");
                if (var2 != null) {
                  lb.field_b = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "TERROR_CLONEIMMOBILE");
                if (var2 != null) {
                  CampaignParticipant.field_l = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "TERROR_CLONEJADEVINE");
                if (var2 != null) {
                  oi.field_b = uu.a(var2, (byte) 56);
                }
            }
            void runChunk6() throws java.lang.RuntimeException {
                var2 = fk.a(false, "TERROR_ACCESSORYFAIL");
                if (var2 != null) {
                  sp.field_d = uu.a(var2, (byte) 44);
                }
                var2 = fk.a(false, "TERROR_IRREGULARMOVE");
                if (var2 != null) {
                  TaggedMapData.field_i = uu.a(var2, (byte) -98);
                }
                var2 = fk.a(false, "TERROR_ALREADYMOVED");
                if (null != var2) {
                  vg.field_o = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "TERROR_ALREADYUSED");
                if (null != var2) {
                  po.field_a = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "TERROR_NOSOULSTONELEADER");
                if (null != var2) {
                  AiUnitPlanner.field_w = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "TERROR_BLADEFLYER");
                if (var2 != null) {
                  ah.field_c = uu.a(var2, (byte) 123);
                }
                var2 = fk.a(false, "TERROR_BLADEMAGE");
                if (var2 != null) {
                  qa.field_E = uu.a(var2, (byte) 48);
                }
                var2 = fk.a(false, "TERROR_BOWNORANGE");
                if (var2 != null) {
                  wn.field_bb = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "TERROR_HATNOMAGIC");
                if (null != var2) {
                  hv.field_O = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "TERROR_TALONSGROUNDED");
                if (var2 != null) {
                  bc.field_h = uu.a(var2, (byte) 22);
                }
                var2 = fk.a(false, "TERROR_FIRENOFLAME");
                if (var2 != null) {
                  CampaignParticipant.field_r = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "TERROR_CANNONFIREONLY");
                if (null != var2) {
                  fc.field_c = uu.a(var2, (byte) -116);
                }
                var2 = fk.a(false, "TERROR_POISONWEAPON");
                if (null != var2) {
                  iu.field_r = uu.a(var2, (byte) -122);
                }
                var2 = fk.a(false, "TERROR_POISONED");
                if (var2 != null) {
                  Unit.field_T = uu.a(var2, (byte) 73);
                }
                var2 = fk.a(false, "TRINKET_WORTH");
                if (null != var2) {
                  lt.field_f = uu.a(var2, (byte) -102);
                }
                var2 = fk.a(false, "TRT_TEXT,0");
                if (var2 != null) {
                  r.field_E[0] = uu.a(var2, (byte) -114);
                }
                var2 = fk.a(false, "TRT_TEXT,1");
                if (null != var2) {
                  r.field_E[1] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "TRT_TEXT,2");
                if (null != var2) {
                  r.field_E[2] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "TRT_TEXT,3");
                if (var2 != null) {
                  r.field_E[3] = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "TRT_TEXT,4");
                if (null != var2) {
                  r.field_E[4] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "TRT_TEXT,5");
                if (var2 != null) {
                  r.field_E[5] = uu.a(var2, (byte) 101);
                }
                var2 = fk.a(false, "TRT_TEXT,6");
                if (null != var2) {
                  r.field_E[6] = uu.a(var2, (byte) -113);
                }
                if (param1 != 10207) {
                  finished = true; return;
                }
                var2 = fk.a(false, "TRT_TEXT,7");
                if (var2 != null) {
                  r.field_E[7] = uu.a(var2, (byte) -118);
                }
                var2 = fk.a(false, "TRT_TEXT,8");
                if (var2 != null) {
                  r.field_E[8] = uu.a(var2, (byte) 100);
                }
                var2 = fk.a(false, "TRT_TEXT,9");
                if (null != var2) {
                  r.field_E[9] = uu.a(var2, (byte) -96);
                }
                var2 = fk.a(false, "TRT_TEXT,10");
                if (var2 != null) {
                  r.field_E[10] = uu.a(var2, (byte) 121);
                }
                var2 = fk.a(false, "TRT_TEXT,11");
                if (null != var2) {
                  r.field_E[11] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "TRT_TEXT,12");
                if (null != var2) {
                  r.field_E[12] = uu.a(var2, (byte) -97);
                }
                var2 = fk.a(false, "TRT_TEXT,13");
                if (var2 != null) {
                  r.field_E[13] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "TRT_TEXT,14");
                if (null != var2) {
                  r.field_E[14] = uu.a(var2, (byte) -124);
                }
                var2 = fk.a(false, "TRT_TEXT,15");
                if (var2 != null) {
                  r.field_E[15] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "TRT_TEXT,16");
                if (var2 != null) {
                  r.field_E[16] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "TRT_TEXT,17");
                if (var2 != null) {
                  r.field_E[17] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "TRT_TEXT,18");
                if (var2 != null) {
                  r.field_E[18] = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "TRT_TEXT,19");
                if (var2 != null) {
                  r.field_E[19] = uu.a(var2, (byte) 86);
                }
                var2 = fk.a(false, "TRT_TEXT,20");
                if (var2 != null) {
                  r.field_E[20] = uu.a(var2, (byte) 16);
                }
                var2 = fk.a(false, "TRT_TEXT,21");
                if (null != var2) {
                  r.field_E[21] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "TRT_TEXT,22");
                if (var2 != null) {
                  r.field_E[22] = uu.a(var2, (byte) 127);
                }
                var2 = fk.a(false, "TRT_TEXT,23");
                if (var2 != null) {
                  r.field_E[23] = uu.a(var2, (byte) 3);
                }
                var2 = fk.a(false, "TRT_TEXT,24");
                if (null != var2) {
                  r.field_E[24] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "TRT_TEXT,25");
                if (var2 != null) {
                  r.field_E[25] = uu.a(var2, (byte) 102);
                }
                var2 = fk.a(false, "TRT_TEXT,26");
                if (var2 != null) {
                  r.field_E[26] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "TRT_TEXT,27");
                if (var2 != null) {
                  r.field_E[27] = uu.a(var2, (byte) 60);
                }
                var2 = fk.a(false, "TRT_TEXT,28");
                if (var2 != null) {
                  r.field_E[28] = uu.a(var2, (byte) -127);
                }
                var2 = fk.a(false, "TRT_TEXT,29");
                if (null != var2) {
                  r.field_E[29] = uu.a(var2, (byte) -120);
                }
                var2 = fk.a(false, "TRT_TEXT,30");
                if (null != var2) {
                  r.field_E[30] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "TRT_TEXT,31");
                if (var2 != null) {
                  r.field_E[31] = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "TRT_TEXT,32");
                if (var2 != null) {
                  r.field_E[32] = uu.a(var2, (byte) -110);
                }
                var2 = fk.a(false, "TRT_TEXT,33");
                if (var2 != null) {
                  r.field_E[33] = uu.a(var2, (byte) 95);
                }
                var2 = fk.a(false, "trinketcongratulations,0");
                if (null != var2) {
                  us.field_b[0] = uu.a(var2, (byte) -128);
                }
                var2 = fk.a(false, "trinketcongratulations,1");
                if (var2 != null) {
                  us.field_b[1] = uu.a(var2, (byte) 88);
                }
                var2 = fk.a(false, "trinketcongratulations,2");
                if (var2 != null) {
                  us.field_b[2] = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "trinketcongratulations,3");
                if (null != var2) {
                  us.field_b[3] = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "trinketcongratulations,4");
                if (var2 != null) {
                  us.field_b[4] = uu.a(var2, (byte) -94);
                }
                var2 = fk.a(false, "trinketcongratulations,5");
                if (null != var2) {
                  us.field_b[5] = uu.a(var2, (byte) 40);
                }
                var2 = fk.a(false, "trinketcongratulations,6");
                if (var2 != null) {
                  us.field_b[6] = uu.a(var2, (byte) 105);
                }
                var2 = fk.a(false, "trinketcongratulations,7");
                if (null != var2) {
                  us.field_b[7] = uu.a(var2, (byte) 58);
                }
                var2 = fk.a(false, "trinketcongratulations,8");
                if (var2 != null) {
                  us.field_b[8] = uu.a(var2, (byte) 7);
                }
                var2 = fk.a(false, "trinketcongratulations,9");
                if (var2 != null) {
                  us.field_b[9] = uu.a(var2, (byte) -95);
                }
                var2 = fk.a(false, "trinketcongratulations,10");
                if (var2 != null) {
                  us.field_b[10] = uu.a(var2, (byte) 57);
                }
                var2 = fk.a(false, "trinketcongratulations,11");
                if (null != var2) {
                  us.field_b[11] = uu.a(var2, (byte) 47);
                }
                var2 = fk.a(false, "trinketcongratulations,12");
                if (null != var2) {
                  us.field_b[12] = uu.a(var2, (byte) -125);
                }
                var2 = fk.a(false, "trinketcongratulations,13");
                if (null != var2) {
                  us.field_b[13] = uu.a(var2, (byte) 68);
                }
                var2 = fk.a(false, "trinketcongratulations,14");
                if (null != var2) {
                  us.field_b[14] = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "trinketcongratulations,15");
                if (null != var2) {
                  us.field_b[15] = uu.a(var2, (byte) -115);
                }
                var2 = fk.a(false, "trinketcongratulations,16");
                if (null != var2) {
                  us.field_b[16] = uu.a(var2, (byte) 46);
                }
                var2 = fk.a(false, "trinketcongratulations,17");
                if (null != var2) {
                  us.field_b[17] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "trinketcongratulations,18");
                if (null != var2) {
                  us.field_b[18] = uu.a(var2, (byte) 93);
                }
                var2 = fk.a(false, "trinketcongratulations,19");
                if (var2 != null) {
                  us.field_b[19] = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "trinketcongratulations,20");
                if (null != var2) {
                  us.field_b[20] = uu.a(var2, (byte) 95);
                }
                var2 = fk.a(false, "trinketcongratulations,21");
                if (null != var2) {
                  us.field_b[21] = uu.a(var2, (byte) 79);
                }
                var2 = fk.a(false, "trinketcongratulations,22");
                if (null != var2) {
                  us.field_b[22] = uu.a(var2, (byte) -104);
                }
                var2 = fk.a(false, "trinketcongratulations,23");
                if (null != var2) {
                  us.field_b[23] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "trinketcongratulations,24");
                if (var2 != null) {
                  us.field_b[24] = uu.a(var2, (byte) -105);
                }
                var2 = fk.a(false, "trinketcongratulations,25");
                if (var2 != null) {
                  us.field_b[25] = uu.a(var2, (byte) 42);
                }
                var2 = fk.a(false, "trinketcongratulations,26");
                if (null != var2) {
                  us.field_b[26] = uu.a(var2, (byte) -121);
                }
                var2 = fk.a(false, "trinketcongratulations,27");
                if (var2 != null) {
                  us.field_b[27] = uu.a(var2, (byte) 111);
                }
                var2 = fk.a(false, "trinketcongratulations,28");
                if (null != var2) {
                  us.field_b[28] = uu.a(var2, (byte) 31);
                }
                var2 = fk.a(false, "LABEL_EQUIPMENTSELECT");
                if (var2 != null) {
                  uu.a(var2, (byte) 58);
                }
                var2 = fk.a(false, "LABEL_EQUIPMENTNAVIGATE");
                if (var2 != null) {
                  ae.field_x = uu.a(var2, (byte) 109);
                }
                var2 = fk.a(false, "LABEL_EQUIPMENTSTOCK");
                if (var2 != null) {
                  ar.field_x = uu.a(var2, (byte) 63);
                }
                var2 = fk.a(false, "LABEL_STOCK");
                if (null != var2) {
                  ou.field_j = uu.a(var2, (byte) 20);
                }
                var2 = fk.a(false, "LABEL_STORE");
                if (var2 != null) {
                  l.field_e = uu.a(var2, (byte) 23);
                }
                var2 = fk.a(false, "LABEL_EQUIPPED");
                if (null != var2) {
                  cp.field_c = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "LABEL_STOCKBUTTON");
                if (null != var2) {
                  CampaignRewardPreview.field_b = uu.a(var2, (byte) 94);
                }
                var2 = fk.a(false, "LABEL_STOREBUTTON");
                if (var2 != null) {
                  nu.field_w = uu.a(var2, (byte) -113);
                }
                var2 = fk.a(false, "LABEL_EQUIP");
                if (var2 != null) {
                  wi.field_h = uu.a(var2, (byte) -117);
                }
                var2 = fk.a(false, "LABEL_DEQUIP");
                if (null != var2) {
                  ni.field_c = uu.a(var2, (byte) 45);
                }
                var2 = fk.a(false, "caption1");
                if (null != var2) {
                  hi.field_a = uu.a(var2, (byte) -109);
                }
                var2 = fk.a(false, "caption2");
                if (var2 != null) {
                  LeaderEscortCondition.field_b = uu.a(var2, (byte) 119);
                }
                var2 = fk.a(false, "caption3");
                if (null != var2) {
                  IntPair.field_o = uu.a(var2, (byte) -112);
                }
                var2 = fk.a(false, "caption4");
                if (var2 != null) {
                  pp.field_S = uu.a(var2, (byte) 10);
                }
                var2 = fk.a(false, "caption5");
                if (null != var2) {
                  bj.field_q = uu.a(var2, (byte) 107);
                }
                var2 = fk.a(false, "membersExpanionTitle");
                if (null != var2) {
                  bi.field_c = uu.a(var2, (byte) -99);
                }
                var2 = fk.a(false, "PRESTIGE_LEVEL");
                if (var2 != null) {
                  hf.field_e = uu.a(var2, (byte) 30);
                }
                var2 = fk.a(false, "PRESTIGE_GOT");
                if (null != var2) {
                  gt.field_g = uu.a(var2, (byte) -100);
                }
                var2 = fk.a(false, "PRESTIGE_DETAILS");
                if (var2 != null) {
                  SummonRequest.field_w = uu.a(var2, (byte) 66);
                }
                var2 = fk.a(false, "PRESTIGE_REFUNDING");
                if (var2 != null) {
                  qf.field_b = uu.a(var2, (byte) 47);
                }
                var2 = fk.a(false, "TRINKET_USE_MESSAGE");
                if (null != var2) {
                  jr.field_e = uu.a(var2, (byte) 67);
                }
                var2 = fk.a(false, "TRINKET_ACCESSORY_CONFIRM");
                if (var2 != null) {
                  io.field_u = uu.a(var2, (byte) 11);
                }
                var2 = fk.a(false, "TRINKET_ARMOUR_CONFIRM");
                if (null != var2) {
                  oo.field_o = uu.a(var2, (byte) -123);
                }
                var2 = fk.a(false, "TRINKET_WEAPON_CONFIRM");
                if (null != var2) {
                  rb.field_c = uu.a(var2, (byte) -108);
                }
                var2 = fk.a(false, "TRINKET_TURN_LIMIT");
                if (var2 != null) {
                  ae.field_w = uu.a(var2, (byte) 118);
                }
                var2 = fk.a(false, "TRINKET_EMPTY");
                if (null != var2) {
                  TurnEffectEvent.field_y = uu.a(var2, (byte) -111);
                }
                var2 = fk.a(false, "TRINKET_SCROLL");
                if (null != var2) {
                  dq.field_g = uu.a(var2, (byte) -126);
                }
                var2 = fk.a(false, "MEMBERS_ONLY");
                if (var2 != null) {
                  bn.field_g = uu.a(var2, (byte) -107);
                }
                var2 = fk.a(false, "ZERO");
                if (var2 != null) {
                  dv.field_g = uu.a(var2, (byte) -111);
                }
                sb.field_e = null;
            }
            void run() {
                var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
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
                  runChunk5();
                  if (finished) return;
                  runChunk6();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_4826_0 = (RuntimeException) (var2_ref);
                  stackIn_4826_1 = new StringBuilder().append("em.C(");
                  if (param0 == null) {
                    stackIn_4827_2 = "null";
                  } else {
                    stackIn_4827_2 = "{...}";
                  }
                  throw ig.addExceptionContext((Throwable) ((Object) stackIn_4826_0), ((StringBuilder) (Object) stackIn_4826_1).append(stackIn_4827_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_4835_0 = (!iv.field_k);
                  iv.field_k = stackIn_4835_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(archive, obfuscationGuard);
        decompiledBody.run();
    }

    final static void readCampaignUnitOverride(CampaignDefinition campaign, byte obfuscationGuard, CipherPacketBuffer packet) {
        int fieldTemp$0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        CampaignUnitOverride var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CampaignParticipant var7 = null;
        CampaignUnitOverride[] var8 = null;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = new CampaignUnitOverride();
          var3.unitType = packet.readUnsignedByte(0);
          var3.displayName = packet.readNullCircumfixedString((byte) 121);
          var3.strength = packet.readUnsignedShort((byte) -104);
          if (obfuscationGuard != -7) {
            return;
          }
          var4 = packet.readUnsignedByte(0);
          var5 = 0;
          while (var5 < var4) {
            var6 = packet.readUnsignedByte(obfuscationGuard + 7);
            var7 = campaign.participants[var6];
            fieldTemp$0 = var7.overrideCount;
            var7.overrideCount = var7.overrideCount + 1;
            var7.unitOverrides[fieldTemp$0] = var3;
            if (var9 != 0) {
              return;
            }
            if (~var7.overrideCount == ~var7.unitOverrides.length) {
              var8 = var7.unitOverrides;
              var7.unitOverrides = new CampaignUnitOverride[10 + var8.length];
              vm.a(var8, 0, var7.unitOverrides, 0, var8.length);
            }
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("em.A(");
          if (campaign == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (gs.field_a) {
            var9_int = param4 + og.field_p[param4];
            if (vs.field_e[param4].hasExplicitOwner((byte) -79)) {
              var10 = vs.field_e[param4].getExplicitOwner((byte) -102);
              var11 = 0;
              if (param6 == 0 ||
                var10 != vs.field_e[param4 - 1].getExplicitOwner((byte) -34)) {
                var11 = var11 | 1;
              }
              if (0 == param2 ||
                vs.field_e[-ks.field_y + param4].getExplicitOwner((byte) -96) != var10) {
                var11 = var11 | 2;
              }
              if (param6 == -1 + ks.field_y ||
                ~vs.field_e[param4 + 1].getExplicitOwner((byte) -95) != ~var10) {
                var11 = var11 | 4;
              }
              if (~(ef.field_c - 1) == ~param2 ||
                vs.field_e[ks.field_y + param4].getExplicitOwner((byte) -55) != var10) {
                var11 = var11 | 8;
              }
              MatchSetupPanel.a(var10, false, 20 + param3, param7 + 40, var11, true);
            }
            regionExit1: {
              var10 = fn.field_Q[vs.field_e[param4].terrainType];
              if (var10 > -1) {
                var11 = vs.field_e[param4].ownerPlayer;
                if (CipherPacketBuffer.currentBattlefield != null) {
                  var11 = CipherPacketBuffer.currentBattlefield.getPlayerTeamIndex(var11, -1);
                }
                if (var10 == 2) {
                  l.field_b[17].b(param7, -40 + param3, param0, param8);
                  mv.a(param7 + 20, (byte) -95, ug.field_b + param4, var11, param3);
                  if (var11 > -1) {
                    ks.a(ActionRequest.unitModels[76][var11], false, -40 + param3, PaletteRegionMap.field_g, 128, 150, param7, (js) null, -10374);
                  }
                  l.field_b[16].b(param7, -40 + param3, param0, param8);
                }
                if (var10 == 3) {
                  if (var11 > -1) {
                    mv.a(param7 + 20, (byte) -74, param4 + ug.field_b, var11, param3);
                  }
                  ks.a(ActionRequest.unitModels[76][var11], false, param3 - 40, PaletteRegionMap.field_g, 128, 150, param7, (js) null, -10374);
                }
                if ((var10 != 3 ||
                  var13 != 0) &&
                  (!param1)) {
                  if (var10 == 1) {
                    l.field_b[8 + var9_int % 3].b(param7, -50 + param3, param0, param8);
                    if (var11 <= -1) {
                      break regionExit1;
                    }
                    wb.a(7816226, 21 + param7, var11, param4 + ug.field_b, param3 - 30);
                  }
                  if (var10 != 1 ||
                    var13 != 0) {
                    if (8 != var10) {
                      switch (var10) {
                        case 9:
                          l.field_b[var9_int % 2 + 14].draw(param7, -40 + param3);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                          break;
                        case 0:
                          l.field_b[0 + var9_int % 8].b(param7, param3 - 40, param0, param8);
                          if (var11 <= -1) {
                            break regionExit1;
                          }
                          wb.a(7816226, 20 + param7, var11, param4 + ug.field_b, param3 + 10);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                          break;
                        case 4:
                          la.a(param3 + 20, og.field_p[param4] + param4, param8, 40 + param7, param0, false);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                        default:
                          break regionExit1;
                        case 6:
                          ui.a(param2, param7, (byte) -107, param6, param3);
                          if (var13 == 0) {
                            break regionExit1;
                          }
                          break;
                      }
                    }
                    var12 = -15;
                    if (bt.field_f == 4) {
                      var12 -= 22;
                      if (var13 != 0) {
                        var12 -= 10;
                      }
                    } else {
                      var12 -= 10;
                    }
                    l.field_b[var9_int % 2 + 11].b(param7, -50 + param3, param0, param8);
                    if (var11 > -1) {
                      wb.a(7816226, param7 + 22, var11, param4 + ug.field_b, param3 + var12);
                    }
                  }}}
            }
            if (vs.field_e[param4].hasCorpse(-26)) {
              es.field_d[var9_int % 4].b(param7, -25 + param3, param0, param8);
            }
            var11 = CipherPacketBuffer.currentBattlefield.getTileEffects(param5 + 31, param2, param6, -1);
            var12 = vs.field_e[param4].terrainType;
            if (4 != var12 &&
              var12 != 6 &&
              var12 != 2 &&
              0 != (var11 & 1)) {
              jr.a(var9_int, param5 ^ 117, param3, ug.field_b, param7);
            }
          }
          if (param5 != 0) {
            TickCounter.readCampaignUnitOverride((CampaignDefinition) null, (byte) -46, (CipherPacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var9), "em.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          if (param0 != 1) {
            field_c = (String) null;
          }
          field_e = null;
          field_c = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1), "em.B(" + param0 + ')');
        }
    }

    TickCounter(int limit) {
        try {
          this.limit = limit;
          this.elapsedTicks = 0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "em.<init>(" + limit + ')');
        }
    }

    static {
        field_e = "Theme: ";
        field_c = "Skip";
        field_d = "Invite players";
        field_b = "<%0> is not a member, and cannot play with the current options.";
    }
}
