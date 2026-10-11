/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;
    static oi field_b;
    static String[] field_c;

    final static void a(boolean param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = DungeonAssault.field_K;
        if (nl.field_d < 0) {
          return;
        }
        var3 = param1 - 135;
        var4 = -35 + param2;
        var5 = 256;
        if (nl.field_d < 75) {
          var5 = (nl.field_d << 8) / 75;
        }
        if (nl.field_d > 200) {
          var5 = (-nl.field_d + 250 << 8) / 50;
        }
        if (param0) {
          ah.a(-19);
        }
        lm.a(hc.field_a, (byte) -91);
        re.b();
        gf.a();
        id.a(439027688);
        if (var5 < 256) {
          gf.b(0, 0, gf.field_i, gf.field_c, 0, 256 - var5);
        }
        ti.c(true);
        if (nl.field_d < 150) {
          hc.field_a.a(var3, var4);
        } else {
          dm.field_g.d(15 + var3, var4 + 10, var5);
        }
        var6 = -125 + nl.field_d;
        if (var6 > 0 &&
          var6 < 50) {
          if (20 <= var6) {
            if (30 <= var6) {
              var7 = (-(var6 * 256) + 12800) / 20;
              ie.field_l.b(var3, var4, var7);
            } else {
              ie.field_l.b(var3, var4, 256);
            }
          } else {
            var7 = var6 * 256 / 20;
            ie.field_l.b(var3, var4, var7);
          }
        }
        var6Lifetime1 = -140 + nl.field_d;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          lb.field_C.d(var3 + 15, 10 + var4, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, byte param3) {
        int var8 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = DungeonAssault.field_K;
        try {
          if (param1 >= 2 &&
            param1 <= 36) {
            var4_int = 0;
            if (param3 != -42) {
              return true;
            }
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (var9 < 97) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (var9 >= param1) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param1 * var6 + var9;
                if (var10 / param1 != var6) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_45_0 = var5;
            return stackIn_45_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_48_0 = var4;
          stackIn_48_1 = new StringBuilder().append("ah.B(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static gp a(nh param0, int param1, String param2, String param3, nh param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        nh var7 = null;
        gp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param3, 1000);
          if (param1 != 200) {
            var7 = (nh) null;
            ah.a((nh) null, 14, (String) null, (String) null, (nh) null);
          }
          var6 = param4.a(0, param2, var5_int);
          stackIn_3_0 = hh.a(param0, param4, var5_int, (byte) 124, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("ah.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -37) {
          field_a = (String) null;
        }
    }

    final static void a(boolean param0, int param1) {
        ri.field_g = ec.field_j[param1].a();
        String var5 = ce.field_o[param1];
        int var3 = 40 + ne.field_c.b(var5);
        cn var4 = new cn(var3, 32);
        jh.c();
        if (!param0) {
          field_a = (String) null;
        }
        var4.e();
        ri.field_g.c(0, 0, 32, 32);
        ne.field_c.b(var5, 40, ne.field_c.field_H + 32 >> 1, 16777215, -1);
        var4.d(16777215);
        var4.e();
        ri.field_g.b(0, 0, 32, 32, 0);
        ne.field_c.b(var5, 40, 32 + ne.field_c.field_H >> 1, 0, -1);
        jh.b();
        ke.field_e = 0;
        pa.field_a = var4;
        sl.field_b = new rh(12 + (var3 >> 1), 32, 8 + var3, 32, 16711680, 768, 224);
    }

    static {
        field_a = "Raider was trapped by guardian, which alerted the monsters of the dungeon.";
        field_c = new String[255];
    }
}
