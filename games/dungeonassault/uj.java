/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uj {
    static int field_d;
    static String field_a;
    static String field_e;
    static String field_b;
    static cn field_c;

    final static int a(Random param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if ((param2 ^ -1) >= -1) {
          throw new IllegalArgumentException();
        } else {
          if (qh.a(param2, 245)) {
            return (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> 247984800);
          } else {
            var3 = -2147483648 + -(int)(4294967296L % (long)param2);
            if (param1 == 37) {
              L0: while (true) {
                var4 = param0.nextInt();
                if (var3 <= var4) {
                  continue L0;
                } else {
                  return cc.a(param2, var4, (byte) -122);
                }
              }
            } else {
              field_c = null;
              L1: while (true) {
                var4 = param0.nextInt();
                if (var3 <= var4) {
                  continue L1;
                } else {
                  return cc.a(param2, var4, (byte) -122);
                }
              }
            }
          }
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = DungeonAssault.field_K;
        if (-1L > (param0 ^ -1L)) {
          if (6582952005840035281L > param0) {
            if (-1L != (param0 % 37L ^ -1L)) {
              if (param1 != -1) {
                field_d = -60;
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if ((var4 ^ -1L) == -1L) {
                    var12 = new StringBuilder(var3);
                    L1: while (true) {
                      if (0L == param0) {
                        StringBuilder discarded$4 = var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ak.field_j[(int)(-(param0 * 37L) + var7)];
                          if (var9 != 95) {
                            break L2;
                          } else {
                            var10 = -1 + var12.length();
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            var9 = 160;
                            break L2;
                          }
                        }
                        StringBuilder discarded$5 = var12.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var3 = 0;
                var4 = param0;
                L3: while (true) {
                  if ((var4 ^ -1L) == -1L) {
                    var13 = new StringBuilder(var3);
                    L4: while (true) {
                      if (0L == param0) {
                        StringBuilder discarded$6 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L5: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ak.field_j[(int)(-(param0 * 37L) + var7)];
                          if (var9 != 95) {
                            break L5;
                          } else {
                            var10 = -1 + var13.length();
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            var9 = 160;
                            break L5;
                          }
                        }
                        StringBuilder discarded$7 = var13.append(var9);
                        continue L4;
                      }
                    }
                  } else {
                    var4 = var4 / 37L;
                    var3++;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 37) {
          String discarded$2 = uj.a(103L, 16);
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static void a(en param0, int param1) {
        rb.field_O = param0;
        if (param1 == 95) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Renown";
        field_a = "Please check if address is correct";
        field_b = "When entering a monster room, you can choose for your raider to Charge (increases Attack, decreases Defence), Advance (which leaves stats unchanged) or Flee (attempt to retreat from the room without engaging in combat). When combat begins, the raider's Sneak level is rolled against the monster's Detect level to determine who attacks first. In each round of combat, the attacker's Attack level is rolled against the defender's Defence level - if the attacker wins, the defender is defeated, otherwise, if the defender wins, they get a turn to attack. Fleeing works in much the same way, but instead of attacking each round, the raider rolls Dodge against the room's Snare - if successful, the raider escapes.";
    }
}
