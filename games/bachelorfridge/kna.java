/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kna extends bw {
    static String field_h;
    static String[] field_g;
    int field_f;

    public static void a(int param0) {
        if (param0 <= 33) {
            Object var2 = null;
            int discarded$0 = kna.a(-6, (CharSequence) null, true, 97);
        }
        field_h = null;
        field_g = null;
    }

    final static int a(int param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = BachelorFridge.field_y;
          if (2 > param0) {
            break L0;
          } else {
            if (param0 <= 36) {
              L1: {
                var4 = 0;
                if (param3 == 24808) {
                  break L1;
                } else {
                  var12 = null;
                  int discarded$1 = kna.a(91, (CharSequence) null, false, -125);
                  break L1;
                }
              }
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (122 < var9) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 >= param0) {
                    throw new NumberFormatException();
                  } else {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var9 + var6 * param0;
                    if (var10 / param0 == var6) {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    final void b(boolean param0) {
        ((kna) this).field_f = ((kna) this).field_f + 1;
        if (!param0) {
            field_g = null;
        }
    }

    final void c(byte param0) {
        ((kna) this).field_f = ((kna) this).field_f - 1;
        int var2 = 66 / ((param0 - -69) / 55);
    }

    kna(int param0, int param1) {
        ((kna) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Normal", "Poison", "Stun", "Protect", "Stamina down", "Speed down", "Fisticuffs down", "Flingstuff down", "Immobilise", "Disarm", "Fatigue", "Ignoring orders", "Strong poison", "Spiky", "Regen", "Knockback", "Stamina up", "Speed up", "Fisticuffs up", "Flingstuff up", "Berserk", "Double duration of effects", "Triple duration of effects", "Pull forward", "Carrying red fly", "Carrying green fly", "Carrying yellow fly", "Carrying blue fly", "Speed capped", "Sleeping", "Damage down", "Martyr", "Levitate", "Invincible", "Disabled", "Zombie", "Stuck", "Smitten", "Losing speed", "Jellied", "Fear", "Reset buffs", "Rage", "Spilling milk", "Dreaming", "Knockback 2 squares", "Knockback 3 squares", "Push aside", "Switch places", "Create poison tile", "Create regen tile", "Confuse", "Panic", "Burning", "Bagpiping"};
        field_h = "Chat is currently disabled.";
    }
}
