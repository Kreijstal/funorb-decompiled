/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ln {
    int field_b;
    static dl field_d;
    static am field_f;
    int field_c;
    int field_e;
    String field_a;

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        db var8 = null;
        var7 = CrazyCrystals.field_B;
        try {
          if (param0 != -17512) {
            var8 = (db) null;
            ln.a(46, (db) null);
          }
          var5_int = 0;
          while (true) {
            if (ga.field_J.length <= var5_int) {
              return;
            }
            param1 = ga.field_J[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param1;
              param1--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param4 = gh.field_E[incrementValue$1];
              dupTemp$2 = param2[param4];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              gh.field_E[dupTemp$3] = param4;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ln.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -127) {
          field_f = (am) null;
          field_d = null;
          return;
        }
        field_d = null;
    }

    abstract int a(int param0, byte param1);

    final static void a(int param0, db param1) {
        try {
          if (param0 != 0) {
            db var3 = (db) null;
            ln.a(46, (db) null);
          }
          fm.field_s = bf.a(-1, "sprites_player_death_electrocution_player", "", param1);
          mj.field_f = bf.a(-1, "sprites_player_death_electrocution_skeleton", "", param1);
          ro.field_u = bf.a(~param0, "sprites_player_death_electrocution_halo", "", param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ln.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ln(String param0, int param1, int param2, int param3) {
        try {
          this.field_e = param1;
          this.field_c = param2;
          this.field_a = param0;
          this.field_b = param3;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
