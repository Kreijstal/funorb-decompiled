/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    final static String a(String param0, byte param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = HoldTheLine.field_D;
          try {
            try {
              var3 = (String) (eo.a(21896, "getcookies", param2));
              var4 = fl.a(var3, (byte) -126, ';');
              var5 = 0;
              if (param1 < 4) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              while (var4.length > var5) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param0)) {
                  stackIn_9_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_9_0;
                }
                var5++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("ph.C(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        th var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          var9 = new th(param1);
          var3 = var9.f((byte) -100);
          var4 = var9.a(-93);
          if (param0 != -1) {
            stackIn_2_0 = (byte[]) null;
            return stackIn_2_0;
          }
          if (var4 >= 0 && (ec.field_C == 0 ||
            !(var4 > ec.field_C))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.a(var4, 0, (byte) 101, var13);
              stackIn_24_0 = var5;
              return stackIn_24_0;
            }
            var5_int = var9.a(-76);
            if (var5_int >= 0 && (ec.field_C == 0 ||
              !(var5_int > ec.field_C))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (var3 == 1) {
                bh.a(var12, var5_int, param1, var4, 9);
              } else {
                var7 = pc.field_n;
                synchronized (var7) {
                  pc.field_n.a((byte) -117, var9, var12);
                }
              }
              stackIn_22_0 = var6;
              return stackIn_22_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("ph.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static void a(gn param0, byte param1, gn param2) {
        oa discarded$0 = null;
        oa discarded$1 = null;
        oa discarded$2 = null;
        oa discarded$3 = null;
        jh.field_a = new ld(param2, param0);
        kn.field_r = i.a(-113, 2000, 60, "f1", 60);
        qj.field_G = i.a(param1 ^ 51, 1000, 50, "porshe", 50);
        hm.field_a = i.a(-108, 1000, 55, "dragster", 55);
        if (param1 != -66) {
          return;
        }
        try {
          te.field_c = i.a(-113, 2000, 64, "dunebuggy", 64);
          he.field_G = i.a(param1 - 57, 2000, 60, "snowcat", 60);
          gg.field_H = i.a(param1 ^ 50, 2000, 70, "snowmobile", 70);
          ec.field_s = i.a(param1 - 55, 2000, 40, "bmw", 40);
          ch.field_n = i.a(param1 ^ 49, 2000, 60, "suv", 60);
          discarded$0 = new oa("engine_start", 70);
          cf.field_s = new oa("turbo_whistle", 140);
          pe.field_b = new oa("afterburner", 80);
          qm.field_c = new oa("tyre_squeal", 100);
          rc.field_a = new oa("off_the_track", 768);
          kl.field_t = new oa("off_the_track_alpine", 768);
          pf.field_g = new oa("alarm_test", 100);
          ic.field_i = new oa("mine_landing_and_armed", 256);
          oa.field_p = new oa("mine_explosion", 256);
          vd.field_b = new oa("machine_gun_1070ms_loop", 40);
          jb.field_T = new oa("missile_launch", 256);
          discarded$1 = new oa("homing_missile_beeps", 100);
          u.field_O = new oa("explosion_and_shrapnel", 256);
          sj.field_K = new oa("vehicle-barrier_collision", 100);
          discarded$2 = new oa("vehicle-vehicle_collision", 120);
          vn.field_h = new oa("shield_bounce", 140);
          ij.field_g = new oa("powerup_collect_low", 92);
          jf.field_d = new oa("powerup_collect_high", 88);
          ji.field_i = new oa("powerup_drop", 100);
          rg.field_b = jh.field_a.a(param1 - 32594, "wacky_boom_kick");
          cf.field_r = jh.field_a.a("menu_low_beep", (byte) 77);
          jh.field_a.a("menu_high_beep", (byte) 9);
          qd.field_j = new oa("ZD_update_lightning_strike");
          se.field_m = new oa("ZD_update_thunder_roll_1");
          uj.field_a = new oa("ZD_update_thunder_roll_2");
          discarded$3 = new oa("ZD_update_rain_loop");
          j.field_c = new td("car_pass");
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "ph.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          String stackIn_17_0 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = HoldTheLine.field_D;
          try {
            try {
              var9 = param1.getParameter("cookieprefix");
              if (param0 > -43) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var3 = var9 + "settings";
              var4 = (String) (eo.a(21896, "getcookies", param1));
              var5 = fl.a(var4, (byte) -98, ';');
              for (var6 = 0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_10_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (il.field_a == null) {
              return param1.getParameter("settings");
            }
            stackIn_17_0 = il.field_a;
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("ph.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
