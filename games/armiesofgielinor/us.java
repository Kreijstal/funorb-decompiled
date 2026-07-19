/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class us {
    static int field_a;
    static int field_c;
    static String[] field_b;

    final static boolean b(int param0) {
        if (param0 <= 74) {
            return true;
        }
        return oi.field_c.a((byte) 14);
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            us.a(125);
            if (null == jl.field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == jl.field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var2 = -69 % ((param1 - -61) / 59);
        if (null != jf.field_C.field_T) {
          if ((4 & jf.field_C.field_vb.field_e[param0]) == 0) {
            return 0;
          } else {
            if (!jf.field_C.field_vb.field_w) {
              if (!jf.field_C.field_T.field_s) {
                if ((2 & jf.field_C.field_vb.field_e[param0]) == 0) {
                  return 0;
                } else {
                  L0: {
                    if (bv.field_w.field_gb != jf.field_C.field_q) {
                      stackOut_21_0 = 128;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    } else {
                      stackOut_20_0 = 256;
                      stackIn_22_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  return stackIn_22_0;
                }
              } else {
                if (-1 == (jf.field_C.field_T.field_B ^ -1)) {
                  L1: {
                    if (0 == (jf.field_C.field_vb.field_e[param0] & 2)) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L1;
                    } else {
                      stackOut_14_0 = 128;
                      stackIn_16_0 = stackOut_14_0;
                      break L1;
                    }
                  }
                  return stackIn_16_0;
                } else {
                  L2: {
                    if (-1 == (jf.field_C.field_vb.field_e[param0] & 1 ^ -1)) {
                      stackOut_11_0 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_10_0 = 256;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    }
                  }
                  return stackIn_12_0;
                }
              }
            } else {
              return 0;
            }
          }
        } else {
          return 0;
        }
    }

    public static void a(int param0) {
        if (param0 >= -60) {
            return;
        }
        field_b = null;
    }

    static {
        field_c = 0;
        field_b = new String[]{"Ouch, that has to hurt! Keep in mind this is magic damage, so magic robes help to defend against it.", "Mana from the gods, indeed! A quick boost at the right moment can make all the difference.", "To see if a unit has been given some equipment, check the status effects in its description at the top of the screen. If you move your mouse over the equipment icon it will tell you what effect the equipped item has.", "That ought to perk your troops up a bit - this increase in strength is permanent.", "Ooh, I bet they're not feeling so good now. This is more than just damage, it also permanently decreases an enemy unit's maximum strength.", "An army of bones at your command. Now, anywhere the dead lie, they may be raised to march under your banner.", "That's the same kind of barrier a Saradomin priest generates. It will absorb some of the damage directed at any of your units within it.", "Power to the people! That structure won't be delivering any Mana to the enemy anymore.", "Looks like it did nothing, didn't it? But next time that unit moves, you'll get quite a surprise...", "Pop! Just like that. Perhaps not as dramatic as the crystalline shape-shifter, but more immediate.", "Now, there's a betrayal they weren't expecting. Send that unit to attack its allies, or just lead it into battle with your fiercest warrior. The choice is yours.", "The gods have answered us! This can be used at any time. It's useful both as a quick, early boost, or later on to quickly reach maximum favour.", "Stronger, taller, well-defended and far more productive, but keep in mind that it can still be captured by the enemy.", "Wide stretches of water need no longer be a problem with this spell.", "Now another King Black Dragon can be teleported into the battle. Be wary not to use this power hastily, though, as it can be called upon by anyone. Before using this chant, be sure to have enough Mana to bring in the King Black Dragon yourself.", "Ready to march on and battle again. Perfect for those tight spots where one more move makes all the difference.", "Kaboom! Keep in mind that fire will do damage even to your own troops. If an allied unit is going to be in the target area where you rain down fire, you might want to kit it out with dragonhide armour first.", "It looks like those troops will live to fight another day. ", "Such good energy. Keep in mind that this spell will heal both allied and enemy units in its area of effect.", "That unit isn't looking so good. From now on it will lose health every turn until it is healed.", "You can check out the ring of life accessory on the information panel at the top. When this unit dies, it will respawn with full health at the nearest unoccupied allied structure.", "To check the details of a unit's armour, look at its status effects in the top information panel.", "To check the details of a unit's weaponry, look at its status effects in the top information panel.", "As well as an icon in the top information panel, units carrying a flag are identified in-game by a little flag symbol below them.", "Look at it go! This is handy for closing gaps and getting to key locations quickly.", "Changing the face of Gielinor like this is quite a feat. Use it wisely and you can change the state of the battle too.", "You can see the widened area of effect on the ground around this unit. This can be very handy in a large army.", "Now, when this unit attacks an enemy unit in melee combat, it will be healed by an amount equivalent to the damage it inflicts.", "That unit will be totally immobilised until it recovers from the spell. Use this time wisely."};
    }
}
