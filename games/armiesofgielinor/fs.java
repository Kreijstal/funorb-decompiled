/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static float[] field_b;
    static int[][] field_d;
    static String[] field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_20_0;
        boolean stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        boolean stackIn_21_5;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        EventPresenter var10_ref_vb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var10Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1) {
            field_a = (String) null;
          }
          if (param2 &&
            null == vs.field_e[param5].occupant) {
            return;
          }
          var9_int = param5 + og.field_p[param5];
          if (vs.field_e[param5].terrainType == 3) {
            eq.$cfr$intArgs$a$de73e65787eb(20 + param0, true, 126, var9_int, param3, false, 40 + param4, param7);
          }
          KingBlackDragonEvent.a(1, param5, param4, false, param0);
          var10_ref_vb = (EventPresenter) (jf.field_C.eventPresenters.first((byte) 122));
          while (var10_ref_vb != null) {
            if (~param5 == ~var10_ref_vb.tileIndex) {
              var10_ref_vb.draw(ug.field_b, 31785, false);
            }
            var10_ref_vb = (EventPresenter) (jf.field_C.eventPresenters.next((byte) 123));
          }
          if (vs.field_e[param5].terrainType == 3) {
            stackIn_20_0 = param0 + 20;
            stackIn_20_1 = false;
            stackIn_20_2 = 126;
            stackIn_20_3 = var9_int;
            stackIn_20_4 = param3;
            stackIn_21_5 = (null != vs.field_e[param5].occupant);
            eq.$cfr$intArgs$a$de73e65787eb(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_20_3, stackIn_20_4, stackIn_21_5, 40 + param4, param7);
          }
          if (vs.field_e[param5].hasExplicitOwner((byte) -79)) {
            var10 = vs.field_e[param5].getExplicitOwner((byte) -56);
            var11 = 0;
            if (param6 == 0 ||
              vs.field_e[param5 - 1].getExplicitOwner((byte) -55) != var10) {
              var11 = var11 | 1;
            }
            if (param8 == 0 ||
              vs.field_e[param5 - ks.field_y].getExplicitOwner((byte) -22) != var10) {
              var11 = var11 | 2;
            }
            if (-1 + ks.field_y == param6 ||
              var10 != vs.field_e[param5 + 1].getExplicitOwner((byte) -90)) {
              var11 = var11 | 4;
            }
            if (param8 == -1 + ef.field_c ||
              var10 != vs.field_e[param5 + ks.field_y].getExplicitOwner((byte) -75)) {
              var11 = var11 | 8;
            }
            dm.a(var10, false, param0 + 20, param4 + 40, var11, false);
          }
          var10Lifetime1 = CipherPacketBuffer.currentBattlefield.getTileEffects(31, param8, param6, -1);
          if ((2 & var10Lifetime1) == 0) {
            return;
          }
          nt.a(894, var9_int, ug.field_b, param4, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var9), "fs.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!hf.field_c) {
            return false;
          }
          if (param0 <= 108) {
            return true;
          }
          if (rs.field_t == 2 &&
            null != wm.field_b) {
            var3 = (CharSequence) ((Object) param1);
            if (wm.field_b.equals(k.a(var3, false))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("fs.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        if (!(0 <= kd.field_X)) {
          return -2;
        }
        if (param2 > param4) {
          return -2;
        }
        if (param5 + param2 <= param4) {
          return -2;
        }
        if (param3 > param0) {
          return -2;
        }
        if (param3 + param6 <= param0) {
          return -2;
        }
        if (param0 - param3 < 44) {
          return -3;
        }
        if (param1 != 24340) {
          String var10 = (String) null;
          fs.a(-51, (String) null, (String) null, 30, 0);
          if (-4 + (param6 - 40) < -param3 + param0) {
            return -3;
          }
          var7 = param3 + (-dd.field_e + 44);
          var8 = param2 + (param5 >> 1);
          var9 = (-var7 + param0) / 80 * 2;
          if (param4 > var8) {
            var9++;
          }
          var9 = var9 + (od.field_c[kd.field_X] ? -1 : 0);
          if (var9 > -2 &&
            var9 < bc.field_j[kd.field_X].length) {
            return var9;
          }
          return -3;
        }
        if (-4 + (param6 - 40) < -param3 + param0) {
          return -3;
        }
        var7Lifetime1 = param3 + (-dd.field_e + 44);
        var8Lifetime1 = param2 + (param5 >> 1);
        var9Lifetime1 = (-var7Lifetime1 + param0) / 80 * 2;
        if (param4 > var8Lifetime1) {
          var9Lifetime1++;
        }
        var9Lifetime1 = var9Lifetime1 + (od.field_c[kd.field_X] ? -1 : 0);
        if (var9Lifetime1 > -2 &&
          var9Lifetime1 < bc.field_j[kd.field_X].length) {
          return var9Lifetime1;
        }
        return -3;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          return wq.field_a == null ? ph.field_f : true;
        }
        fs.a(15, false, true, 64, -122, 113, -41, -38, 58);
        return wq.field_a == null ? ph.field_f : true;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == -1) {
          field_b = null;
          field_c = null;
          field_d = (int[][]) null;
          return;
        }
        String var2 = (String) null;
        fs.a(-83, (String) null, (String) null, 92, 123);
        field_b = null;
        field_c = null;
        field_d = (int[][]) null;
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        try {
          UpkeepEvent.field_z.field_I = param1;
          UpkeepEvent.field_z.field_X = param2;
          UpkeepEvent.field_z.field_N = param0;
          int var5_int = 112 % ((param3 + 51) / 39);
          UpkeepEvent.field_z.field_gb = UpkeepEvent.field_z.field_gb + rb.field_b.field_gb;
          rb.field_b.field_S = rb.field_b.field_S + rb.field_b.field_gb;
          rb.field_b.field_gb = param4;
          UpkeepEvent.field_z.field_gb = UpkeepEvent.field_z.field_gb - rb.field_b.field_gb;
          rb.field_b.field_S = rb.field_b.field_S - rb.field_b.field_gb;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "fs.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = new String[16];
        field_a = "Show players in <%0>'s game";
    }
}
