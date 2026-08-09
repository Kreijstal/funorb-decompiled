/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class f implements nn {
    static bd field_d;
    static String[][] field_a;
    static String field_c;
    static bd field_b;

    final static void a(int param0, int param1, p param2, int param3) {
        try {
            dn.a(param2.field_e / param3, uf.field_e, uf.field_d, param0, -1, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "f.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -90) {
            return;
        }
        field_d = null;
        field_b = null;
        field_a = (String[][]) null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        int var6_int = 0;
        int var7 = 0;
        bd var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (param2 == 15430) {
              L1: {
                var6_int = param3.field_v + param1;
                var7 = param0 + param3.field_m;
                ij.a(param3.field_x, param3.field_s, var7, var6_int, false);
                var8 = cf.field_u[1];
                if (!(param3 instanceof ph)) {
                  break L1;
                } else {
                  if (((ph) ((Object) param3)).field_A) {
                    var8.c(var6_int + (1 + (param3.field_s - var8.field_u >> -661236991)), (-var8.field_r + param3.field_x >> -1156139647) + (var7 + 1), 256);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!param3.g(-9015)) {
                  break L2;
                } else {
                  bh.a(param3.field_x - 4, 2 + var7, (byte) 65, 2 + var6_int, param3.field_s + -4);
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("f.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(byte param0) {
        if (rc.field_c == null) {
            return false;
        }
        if (param0 != 119) {
            vi var2 = (vi) null;
            f.a(74, (vi) null);
        }
        eh.field_c.a(rc.field_c);
        rc.field_c = null;
        return true;
    }

    final static void a(int param0, vi param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            var5 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                L1: {
                  var6 = new byte[param0];
                  var2 = var6;
                  if (q.field_b == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        q.field_b.a(0L, (byte) 117);
                        q.field_b.a(var6, (byte) -117);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (0 == var2[var3_int]) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (var3_int < 24) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= 24) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                param1.a(24, var2, true, 0);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (runtimeException);

                stackIn_18_1 = new StringBuilder().append("f.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new String[][]{new String[]{"You have boarded the Hammerhead. Your task is to locate the command deck, secure the black box and evac back to your shuttle. Scanners have confirmed that the ship's primary power is offline. Head to the reactor room and reactivate the power supply to the lift, then proceed up to the flight deck. Scanners have also detected movement on the vessel. Your standard issue auto gun should see you through any hostile situation.<br><br>Good luck, marine.", "The flight deck of the Hammerhead seems to be full of life signatures. Fight your way to the bridge at the front of the ship, then return to the lift with the black box.<br>The ship's sensor array has picked up a large object moving towards the vessel, so be quick.<br><br>Sensors have also detected a powerful close-range assault gun (C.R.A.G.) - try to locate this, if possible.", "The black box has provided the location of the spawn's hive on the planet surface. Before dealing with that, though, we cannot allow the derelict Hammerhead to drift into populated space. You must destroy the ship by damaging its reactor. After taking it out, make your way back to your shuttle. You will only have a short amount of time before the ship explodes, so be quick.<br><br>There is also a large alien object heading for the ship - it must have detected the reactor coming back online. Expect high resistance.", "Your shuttle was caught in the Hammerhead's explosion and has crash-landed. The crash has also damaged your weapons and ammunition supply, so you will have to make do with the standard issue auto gun stored in the backup locker. A surface scan has revealed some ammunition caches scattered around the crash site. These are shown as yellow dots on your scanner readout.<br><br>Due to the number of hostile aliens on the surface, it is important that you reach the lift into the base as quickly as possible.", "Your task now is to seal the entrance to the base, so the aliens on the surface cannot get in. Head to the reactor and take it out. This should protect your back as you make your way towards the hive. As on the Hammerhead, the reactor will detonate a short time after being damaged, so be quick to get out.<br><br>Sensors have also picked up a C.R.A.G. close to the deck lift - try to find it to help combat the enemy.", "Watch out while you try to make your way to the lift on this level. The base's security systems have malfunctioned due to the spawn.<br><br>The turrets are slow tracking, but powerful, so it is a bad idea to run past them. Use E.M.P. rockets to disrupt them, allowing you to pass by safely. There is a rocket launcher and a cache of rockets in the weapon storage area. Head there first.", "You are reaching the entrance to the hive, so resistance is likely to be strong. Be on your guard for security turrets and heavy spawn activity. Your scanners have also picked up information regarding the location of a railgun on this level. This advanced weapon is capable of penetrating multiple hostiles in one shot.<br><br>If things become too hot to handle, blow the level's reactor to turn off the turrets' power, then run for the lift.", "You have reached the hive. Locate and destroy the clusters of spawn eggs hidden around the area. Their locations are indicated on your scanner by red dots. After destroying the eggs, head back to the lift.<br><br>Don't rely on your initial scans of this area's layout, as the spawn are known to create tunnels and block passages for their own purposes.<br><br>Good luck, marine.", "The queen has been located. This is your chance to destroy the source of the spawn eggs.<br><br>Fight your way to the queen's nest and terminate her with extreme prejudice. Once she has been killed, get out of there. Her death will definitely aggravate the hive.", "The death of the spawn queen has caused the hive to erupt in furious anger. The turmoil must have damaged the base's primary reactors and the whole area is about to explode.<br><br>Find an exit to the surface and get out as fast as possible. It is unlikely that you will have enough ammo to defeat the whole hive.<br><br>Flee while you can!", "Your shuttle has crash-landed on Kerrus. The crash has also damaged your weapons and ammunition supply, so you will have to make do with the standard issue auto gun stored in the backup locker. A surface scan has revealed some ammunition caches scattered around the crash site. These are shown as yellow dots on your scanner readout.<br><br>Due to the number of hostile aliens on the surface, it is important that you reach the lift into the base as quickly as possible."}, new String[]{"After escaping from the infested research base on Kerrus, you awake in a hospital bed. Explore and find out why there is no one here. You rue the loss of your weapons; but at least you have your trusty pistol.", "The lift abruptly halts. The security systems have shut it down. A helpful sign in the lift says that in the event of lockdown, the lift can be reactivated by overriding the security systems at five consoles on this level.<br>They could have made this simpler.", "There is a hull breach on this level. You'll have to deal with it before you continue. If you activate the reactor on this level it will strengthen the breach shields. Alternatively, you could divert the oxygen distribution and seal off the affected area from the environmental console.", "Scanners indicate a large alien presence on this level, but you'll have to pass through it to reach the lift to the lower levels.", "The station is too heavily infested to be saved. Reach the nav controls on the bridge, and set a course to crash on the planet.", "The infestation on this level is worse than ever, but you have to pass through it again. Hopefully you will not encounter any more giant guard aliens before you can reach the lift.", "The alien infestation has completely taken over this level. You need to halt the incursion or you won't make it off the station. According to the manifest, this level has explosive charges that should be sufficient to block off the points where the aliens are getting onto the station. Find enough charges and set them to destroy the points of ingress before you leave the level.", "This level has two shuttle bays, each of which may provide you with a means of escape, if the alien infection has not already taken over the shuttles.", "You touch down safely on the only planet in range: the infested world of Kerrus. You cannot stay long on the surface; you will have to find your way back into the research base and hope that the alien spawn has diminished since your last visit.", "Your scans of this level explain why the spawn population has climbed so high: there is a spawn queen on this level. You may be trapped on this planet without hope of escape, but you know you must at least destroy the queen before the inevitable end.", "The station is too heavily infested to be saved. You have fought your way to the bridge, and set a course to crash on the planet. Now you have to escape."}};
        field_c = "Retry mission";
    }
}
