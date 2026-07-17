/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends fd {
    private ci[] field_y;
    private int field_w;
    private int field_u;
    static jj field_s;
    static ci field_t;
    static String[] field_x;
    private int field_v;

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var4 = 126;
        if (!(0 == (7 & param1))) {
            var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        return var3;
    }

    public ic() {
        this(2188450, 2591221, 9543);
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.field_s) {
                if (param1.d(-120)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param1 instanceof eb) {
                param4 = param4 & ((eb) (Object) param1).field_A;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackOut_13_0 = ((ic) this).field_u;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackOut_12_0 = ((ic) this).field_v;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((ic) this).field_w;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            var7 = stackIn_14_0;
            if (param3 == -24381) {
              L4: {
                if (param4) {
                  stackOut_18_0 = 16777215;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_17_0 = 7105644;
                  stackIn_19_0 = stackOut_17_0;
                  break L4;
                }
              }
              var8 = stackIn_19_0;
              int discarded$2 = 0;
              bk.a(param0 - -param1.field_u + (-((ic) this).field_y[0].field_u + param1.field_n >> 1), var7, param1.field_w + param2, param1.field_p, ((ic) this).field_y);
              int discarded$3 = ((ic) this).field_j.a(param1.field_o, param2 - -param1.field_w, param1.field_u + (param0 + -2), param1.field_p, param1.field_n, var8, -1, 1, 1, ((ic) this).field_j.field_s);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("ic.E(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void a() {
        field_s = null;
        field_x = null;
        field_t = null;
    }

    private ic(int param0, int param1, int param2) {
        ((ic) this).field_y = i.field_c;
        ((ic) this).field_w = param1;
        ((ic) this).field_u = param2;
        ((ic) this).field_v = param0;
        ((ic) this).field_j = be.field_x;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[]{"MISSION", "BRIEF", "Your team has been dropped off into a ruined city in search of survivors.  You must remove all violent threats in the area so that the search can begin. Completing this mission will give us access to more supplies to help in the manufacturing of new equipment.", "Objectives:", "- Defeat all hostiles in the area", "Clear the area", "As the leader of Alpha team you have been assigned to secure the location around our bunker.", "It has been a few months since the end of the apocalypse and the landscape is likely to still be charred with the remains of the war so keep your eyes sharp. We have yet to receive any information about other survivors, so you will be operating in the dark.", "- Explore the area around the bunker", "- Keep your squad alive", "Keep your squad alive", "Your squad has arrived at the besieged military base. Your men are being dropped on the eastern edge of the compound to keep out of range from enemy fire.", "From the air it looks like a small squad of men is holding out against the gangs but they are in dire need of your help. Your squad must not fail this mission as we are in dire need of the men and supplies.", "- Get your men into the barracks buildings", "- Defeat the attacking gangs", "Take the barracks buildings", "Defeat the hostile gangs", "In order to get in contact with other survivors, we need to secure a communications building. Your troops are about to land outside a research base that was untouched by the conflict.", "Once again, the building is being held by a anarchist gang who will need to be cleared out. You are strongly advised to deploy in cover and advance to surprise the enemy.", "If we fail in this attack the gang is sure to damage the equipment so we once again must succeed in the first strike.", "- Select your deploy points", "- Take the building", "Take the building", "Now that we know the true situation it is time to change pace. An airbase has been located that still contains a couple of operational fighter craft that we could use to attack the aliens' craft.", "Your squad will be deployed near this air base to remove the threat of the hostile gangs that plague the area.", "Our reconnaissance has spotted that the gang has a strong presence here and have managed to secure some RPGs. They also have snipers within the control tower so be on your guard.", "- Remove the hostile threat", "Neutralise all hostiles", "Now that we know the true situation it is time to change pace. A manufacturing facility has been located that we could utilise to build the American laser cannons and more equipment for our men.", "Your squad will be deployed near this facility to remove the threat of the hostile gangs that plague the area.", "Our reconnaissance has spotted that the gang has a strong presence here and have managed to secure some RPGs. We believe that they are all currently within the facility so deploy your men accordingly.", "Our fighter craft have managed to bring down an alien UFO!", "Our ground based laser cannons have managed to bring down an alien UFO!", "From what information the Americans have managed to provide us, these small UFOs are mainly used for transportation of small groups and scouting missions. Expect a crew of about eight aliens.", "Currently the Americans have been unsuccessful in actually capturing a UFO.  The aliens tend to leave a small number of soldiers outside to delay the attackers while they repair the damage and attempt to escape. Details on their weaponry are sketchy but what reports we have indicate they use bio weapons that spread acid over large areas.", "Unfortunately due to what the Americans have told us, we cannot proceed with caution. You must attempt to get your men on board the aliens' craft before they can escape.", "- Gain entry to the UFO", "- Do not allow the aliens to regain control", "Gain entry to the UFO", "Don't allow aliens to escape", "An alien transporter has been spotted heading directly for a factory base that our auxiliary troops managed to capture!", "An alien transporter has been spotted heading directly for an air base that our auxillary troops managed to capture!", "It is imperative that we do not lose this vital location. Mobilise your soldiers and defend the base at all costs. You are advised to use the structures as cover.", "- Defend the base at all costs", "Defend the base", "We have managed to damage and bring down one of the larger alien UFOs.", "These larger UFOs are used by the aliens to attack important locations and are usually manned by 14 aliens, so expect strong resistance. Beware of aliens on the upper level of the UFO.", "Once again, you must try to take and hold the UFO before they can escape. Be wary of deploying too close, as the aliens will most likely attack you as soon as you land.", "An alien Invader UFO is attacking our research base!", "It is imperative that we do not lose this vital location. Mobilise your soldiers and defend the base at all costs. You are advised to use the structures as cover.", "Using the decoded information from the Invader UFO we have located one of the aliens' bases on the planet.", "Your team is to enter the facility and attempt to reach the command room on the upper deck of the base. Your primary objective is to locate the alien commander, recover its database and escape the base from the evac point.", "Proceed with extreme caution as the base is likely to be heavily defended.", "- Kill the alien commander", "- Escape with the data", "Locate the alien commander on the upper level", "One of the aliens' largest ships has been damaged and forced to land.", "Once again your mission is to infiltrate the vessel, but this time your objective is to assassinate the UFO's navigator and escape with his codes.", "The alien navigator will be guarded by the aliens' best troops so be swift and deadly in your assault. Once again, do not allow the aliens to escape.", "- Locate and kill the alien navigator", "- Escape with the codes", "- Do not allow the aliens to regain control before you access the codes", "Locate the Navigator", "Our recent activity has really aggravated the aliens and they are treating us as a major threat now!  A squadron of three transporter UFOs has been spotted heading on a direct course for our base with the intention of total destruction.", "Defend the base at all costs!", "- Defeat all attacking aliens", "Now we have the aliens' codes from the Dominator UFO we need to access an alien database stored within one of their bases.", "To decode the aliens' database we need to assault one of the largest UFOs in order to access their communication codes.", "To take decisive action on the aliens' mother ship we have acquired a nuclear warhead found within a derelict missile base.", "However, the aliens have spotted our transport and we have reports that the base has been surrounded by alien troops.", "Your mission is to get the warhead out of the compound, away from the aliens' guns so that we can load it on the helicopter and proceed with the next phase of our plan.", "- Evac all soldiers to the edge of the zone", "- Do not lose control of the warhead", "Bring all soldiers to the edge of the zone", "Do not lose control of the warhead", "With the nuke we now need to capture an alien ship.  The location of a second alien base has been found and your task is to infiltrate the base and steal a ship. We will only get one chance to do this so good luck!", "- Get your team to the alien transporter", "Get your team to the alien transporter", "This is it!  You are inside the aliens' mothership.  Locate the pulse maggot spawning pit and take it out!  Once you reach the location, plant the nuke on the control deck above it and fight your way back out to the Transporter ship. Hopefully the distraction of your presence will divert their attention away from the nuke itself. But be quick! the aliens will easily be able to swamp you if you take too long.  Good luck!  Earth and the survival of humanity depend on you now.", "Get the nuke to the charge point", "Get the nuke to the charge point on the top floor above the pulse maggot pit", "Evacuate your team to the entry point"};
        field_s = new jj();
    }
}
