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
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (dl.field_h != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (null == ud.field_P) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ud.field_P = new ja(512, 512);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ud.field_P.a();
                        var1_int = param0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (0 < var1_int) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        dl.field_h.b((byte) 125);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        oo.d(256, 256, var1_int, -var1_int + 256);
                        var1_int--;
                        if (var2 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var2 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        dl.field_h.b((byte) 125);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1), "ih.C(" + param0 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        RuntimeException runtimeException = null;
        int var4 = 0;
        ga var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var5.f(var4, 121);
            var5.field_j = var5.field_j - 4;
            param0.field_h = var5.i(-1478490344);
            var5.e(41, -var4 + var5.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("ih.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, ab param1, int param2) {
        ga var6 = null;
        int var4 = 0;
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
            var6.f(var4, 117);
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
