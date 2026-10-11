/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static String field_e;
    static bm field_d;
    static bd field_b;
    static ub field_a;
    static String field_g;
    static String field_f;
    static gb field_h;
    static String[] field_c;

    final static void a(int param0, int param1, int[] param2, int param3) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oj var8 = null;
        Object var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          var4_int = 0;
          if (param1 != -457) {
            bi.a(false);
          }
          while (rc.field_e > var4_int) {
            var8 = re.field_n[var4_int];
            var5 = (int)(24.0 * ((double)(-1 + var8.field_j.field_e) + var8.field_l.field_f)) - param3;
            var6 = -param0 + (int)(24.0 * (var8.field_l.field_a + (double)var8.field_j.field_g));
            if (var5 >= -96 &&
              var6 >= -96 &&
              var5 <= 736 &&
              var6 <= 576) {
              var9 = null;
              var10 = var8.field_i;
              if (var10 != 16) {
                if (var10 != 229) {
                  if (17 != var10) {
                    if (227 != var10) {
                      if (var10 != 226) {
                        if (var10 != 228) {
                          if (232 == var10) {
                            var9 = ta.field_jb;
                          }
                        } else {
                          var9 = tb.field_I;
                        }
                      } else {
                        var9 = rh.field_x;
                      }
                    } else {
                      var9 = fk.field_c;
                    }
                  } else {
                    var9 = d.field_s;
                  }
                } else {
                  var9 = lm.field_y;
                }
              } else {
                var9 = ee.field_g;
              }
              if (var9 != null) {
                var7 = 128;
                if (ta.field_jb == var9) {
                  var6 += 10;
                  var5 += 10;
                  if (var8.field_e >= 240) {
                    var9 = wg.field_zb;
                  }
                }
                if (var8.field_e < 0) {
                  var7 = (384000 + 128 * var8.field_e) / 3000;
                }
                ((bd) (var9)).a(true, var7, (int)var8.field_c, var5, var6);
              }
            }
            var4_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_44_0 = var4;
          stackIn_44_1 = new StringBuilder().append("bi.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_g = null;
        field_a = null;
        if (param0) {
          field_c = null;
          field_e = null;
          field_f = null;
          field_h = null;
          return;
        }
        field_f = (String) null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_h = null;
    }

    final static void a(p param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        p var5 = null;
        bd stackIn_2_0;
        double stackIn_2_1;
        double stackIn_2_2;
        boolean stackIn_2_3;
        int stackIn_3_4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = Math.min(param0.field_e, 90);
          var4_int = (3 * var4_int - var4_int * var4_int / 60) % te.field_G.length;
          stackIn_2_0 = te.field_G[var4_int];
          stackIn_2_1 = (double)param1;
          stackIn_2_2 = (double)param2;
          stackIn_2_3 = false;
          if (param0.field_f) {
            stackIn_3_4 = 128;
          } else {
            stackIn_3_4 = 0;
          }
          ((bd) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_2_2, stackIn_2_3, (double)stackIn_3_4 + param0.field_c, 128);
          if (param3 <= -4) {
            return;
          }
          var5 = (p) null;
          bi.a((p) null, 117, 10, -118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("bi.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_e = "Finally! I must be nearly at the exit now.";
        field_d = new bm();
        field_a = new ub();
        field_c = new String[]{"Civilian", "Draftee", "Rookie", "Technician", "Squaddie", "Engineer", "Sergeant", "Marine", "Commando", "Elite Soldier", "Lone Wolf", "Elite Wolf", "Hero of the UFE", "Elite Hero", "Slayer of the Spawn", "Slayer Elite", "Scourge of the Spawn", "Scourge Elite", "Spirit of the Hammerhead", "Spirit of Vengeance"};
        field_f = "Total aliens killed: <col=ffffff><%0>";
    }
}
