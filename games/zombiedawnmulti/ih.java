/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String[] field_e;
    static cj field_d;
    static String field_b;
    static String field_c;
    static String field_a;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (dl.field_h != null) {
              L1: {
                if (null == ud.field_P) {
                  ud.field_P = new ja(512, 512);
                  break L1;
                } else {
                  break L1;
                }
              }
              ud.field_P.a();
              var1_int = param0;
              L2: while (true) {
                L3: {
                  if (0 < var1_int) {
                    oo.d(256, 256, var1_int, -var1_int + 256);
                    var1_int--;
                    if (var2 != 0) {
                      break L3;
                    } else {
                      if (var2 == 0) {
                        continue L2;
                      } else {
                        dl.field_h.b((byte) 125);
                        break L3;
                      }
                    }
                  } else {
                    dl.field_h.b((byte) 125);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ih.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, ug param2) {
        try {
            nc.a(param0, param1, 92, param2);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ih.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 < 40) {
          ih.a(-3);
          field_b = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        L0: {
          if (cr.a((byte) -115)) {
            L1: {
              cn.a(param0, param5, param6, (byte) -120);
              if (pk.field_b == null) {
                break L1;
              } else {
                if (pk.field_b.a(param3, param4, (byte) -8, param5, param0)) {
                  param5 = false;
                  q.b(89);
                  break L1;
                } else {
                  m.a(param5, 0, param0);
                  cf.a(param2, param5, true);
                  param5 = false;
                  if (param1 == 4) {
                    return param5;
                  } else {
                    ih.a(29);
                    return param5;
                  }
                }
              }
            }
            m.a(param5, 0, param0);
            cf.a(param2, param5, true);
            param5 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != 4) {
          ih.a(29);
          return param5;
        } else {
          return param5;
        }
    }

    final static void a(n param0, int param1, int param2) {
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        int var4 = 0;
        ga var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var5 = ma.field_a;
                var5.b((byte) -35, param2);
                var5.field_j = var5.field_j + 1;
                var4 = var5.field_j;
                var5.a(param1 ^ 112, param1);
                if (null != param0.field_f) {
                  break L2;
                } else {
                  var5.a(-92, 0);
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5.a(-33, param0.field_f.length);
              var5.a(param0.field_f, param0.field_f.length, 0, 115);
              break L1;
            }
            discarded$2 = var5.f(var4, 121);
            var5.field_j = var5.field_j - 4;
            param0.field_h = var5.i(-1478490344);
            var5.e(41, -var4 + var5.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("ih.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, ab param1, int param2) {
        ga var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var6 = ma.field_a;
            var6.b((byte) -35, param2);
            int var5 = -62 / ((20 - param0) / 57);
            var6.field_j = var6.field_j + 1;
            var4 = var6.field_j;
            var6.a(118, 1);
            var6.a(-128, param1.field_i);
            var6.a(-109, param1.field_f);
            var6.b(-104, param1.field_m);
            var6.b(91, param1.field_l);
            var6.b(43, param1.field_g);
            var6.b(-99, param1.field_n);
            discarded$0 = var6.f(var4, 117);
            var6.e(35, var6.field_j - var4);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ih.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_e = new String[]{"Win a Rated game", "Win 10 Rated games", "Win 50 Rated games", "Win 100 Rated games", "Win a game using only one kind of powerup, having a Rating of at least 1500", "Win without equipping any powerups, having a Rating of at least 2000", "Win a game having captured more humans than zombies (at least 10)", "Master the entire Zombie research tree", "Master the entire Overlord research tree", "Master the entire Planetary research tree", "Curse back a cursed zombie", "Have an enemy overlord target one of your phantoms with a powerup", "Win a game with no traits equipped, having a Rating of at least 2500", "Spread the zombie virus by defeating someone who has this Achievement, while having a Rating of at least 1337", "Lose 30 of your zombies, but still win", "Win a four-player match, having a Rating of at least 2000", "Win a game having captured a live pumpkin-head", "Kill 80 enemy zombies in one match", "Kill the enemy's last zombie", "Capture a human that was near an enemy's portal", "Zombify 10 humans using a single super-sped zombie", "Master half of all research items", "Breach an enemy's Miasma", "Win a battle on every map"};
        field_d = new cj();
        field_b = "Your science will advance more from any humans you capture alive.";
        field_c = "Rematch!";
    }
}
