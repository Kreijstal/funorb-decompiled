/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kna extends bw {
    static String field_h;
    static String[] field_g;
    int field_f;

    public static void a(int param0) {
        int discarded$0 = 0;
        if (param0 <= 33) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = kna.a(-6, (CharSequence) null, true, 97);
        }
        field_h = null;
        field_g = null;
    }

    final static int a(int param0, CharSequence param1, boolean param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (2 > param0) {
                break L1;
              } else {
                if (param0 <= 36) {
                  L2: {
                    var4_int = 0;
                    if (param3 == 24808) {
                      break L2;
                    } else {
                      var12 = (CharSequence) null;
                      discarded$1 = kna.a(91, (CharSequence) null, false, -125);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_40_0 = var6;
                        stackIn_41_0 = stackOut_40_0;
                        break L0;
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (var8 == 0) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (122 < var9) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 >= param0) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param0;
                          if (var10 / param0 == var6) {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("kna.A(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L11;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L11;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_41_0;
    }

    final void b(boolean param0) {
        this.field_f = this.field_f + 1;
        if (!param0) {
            field_g = (String[]) null;
        }
    }

    final void c(byte param0) {
        this.field_f = this.field_f - 1;
        int var2 = 66 / ((param0 - -69) / 55);
    }

    kna(int param0, int param1) {
        this.field_f = param1;
    }

    static {
        field_g = new String[]{"Normal", "Poison", "Stun", "Protect", "Stamina down", "Speed down", "Fisticuffs down", "Flingstuff down", "Immobilise", "Disarm", "Fatigue", "Ignoring orders", "Strong poison", "Spiky", "Regen", "Knockback", "Stamina up", "Speed up", "Fisticuffs up", "Flingstuff up", "Berserk", "Double duration of effects", "Triple duration of effects", "Pull forward", "Carrying red fly", "Carrying green fly", "Carrying yellow fly", "Carrying blue fly", "Speed capped", "Sleeping", "Damage down", "Martyr", "Levitate", "Invincible", "Disabled", "Zombie", "Stuck", "Smitten", "Losing speed", "Jellied", "Fear", "Reset buffs", "Rage", "Spilling milk", "Dreaming", "Knockback 2 squares", "Knockback 3 squares", "Push aside", "Switch places", "Create poison tile", "Create regen tile", "Confuse", "Panic", "Burning", "Bagpiping"};
        field_h = "Chat is currently disabled.";
    }
}
