/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends uf {
    static int field_m;
    byte[] field_j;
    static bg[] field_q;
    static String[] field_l;
    static String field_p;
    static int field_n;
    static String field_o;
    boolean field_i;
    static String field_k;
    static String field_h;

    public static void d(byte param0) {
        field_o = null;
        field_h = null;
        field_l = null;
        field_p = null;
        if (param0 >= -119) {
            jh.b(-53, -35);
        }
        field_q = null;
        field_k = null;
    }

    jh() {
    }

    final static void c(byte param0) {
        if (param0 < 26) {
            Object var2 = null;
            oa discarded$0 = jh.a((byte) 14, (String) null);
        }
        na.a(true, oe.field_a, 89, cg.field_H);
        ok.field_h = true;
    }

    final static void b(int param0, int param1) {
        int var3 = Terraphoenix.field_V;
        vi var4 = (vi) (Object) pd.field_g.d(9272);
        while (var4 != null) {
            qd.a(param0, param1 ^ 24621, var4);
            var4 = (vi) (Object) pd.field_g.e((byte) -119);
        }
        if (param1 != -31890) {
            field_l = null;
        }
        me var5 = (me) (Object) ga.field_r.d(9272);
        while (var5 != null) {
            rj.a(param0, -119, var5);
            var5 = (me) (Object) ga.field_r.e((byte) -119);
        }
    }

    final static oa a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var6 = Terraphoenix.field_V;
        var2 = param1.length();
        if (var2 != 0) {
          if (64 >= var2) {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              if (param0 == 42) {
                var4 = 0;
                L0: while (true) {
                  if (var4 < var2) {
                    var5 = param1.charAt(var4);
                    if (var5 == 46) {
                      L1: {
                        if (0 == var4) {
                          break L1;
                        } else {
                          if (var4 == -1 + var2) {
                            break L1;
                          } else {
                            if (var3 == 0) {
                              var3 = 1;
                              var4++;
                              continue L0;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                      return ge.field_a;
                    } else {
                      if (0 != (nc.field_b.indexOf(var5) ^ -1)) {
                        var3 = 0;
                        var4++;
                        continue L0;
                      } else {
                        return ge.field_a;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return null;
              }
            } else {
              if (param1.charAt(-1 + var2) == 34) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var2 - 1 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L3: {
                        if (var3 != 0) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L3;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L3;
                        }
                      }
                      var3 = stackIn_15_0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (34 != var5) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            return ge.field_a;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return ge.field_a;
              }
            }
          } else {
            return lg.field_j;
          }
        } else {
          return b.field_f;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"January 8th 2028: Without warning, the world was engulfed in a nuclear war.", "The ravaged surface of the earth lay littered with craters.  Radioactive vapours drifted across the sky, turning the sunsets blood red and melting the icecaps, which then flooded vast stretches of the planet.", "As the first bombs fell, the military tried to rush as many people as possible into the safety of the shelters...", "But there was never enough space and nowhere near enough time.", "16 weeks later in a British bunker outside Leyburn, the great steel doors are about to open.  It is time to breathe life from the ashes.  Let operation TERRA PHOENIX begin!", "For weeks the only sound from the remaining radios was an endless static hiss.  Then, from across the Atlantic, a weak message was received.", "~We are under attack from an unknown Alien force.  The nukes, the war, it was them!  They want us, want our planet; they have to be stopped!~", "~ We will do what we can to occupy them, but we can’t hold out for long. Find a way to fight back, while they concentrate on us maybe you can find a weakness.~", "~This is our experimental laser cannon.  It has proven to be very effective in combat against the enemy.  We advise you to start to manufacture these weapons as soon as you can.~", "Congratulations on recovering the research base. With this equipment humanity might have a chance of rebuilding civilization. Subscribe to continue TERRA PHOENIX and save the world!", "Using the information gathered from the alien ship, we have decided on how to fight back.  If an attack on the alien supply lines is carried out, we might be able to find where their primary base of operations is.", "An alien base has been located in the north.  Assaulting it will be hard but it contains information that is vital to the survival of humanity.", "Using the decoded information from the base we have learnt of a massive alien mothership in low orbit that contains the source of the aliens' power.", "The aliens' ships and weaponry are all powered by these pulse maggots that spawn inside a breeding pit within the depths of the mothership.  If it can be destroyed then the aliens would be severely weakened.", "There is an undamaged nuclear bunker that may contain a warhead we need for the plan. After our recent fighting the aliens will most likely be watching our movements so be prepared for anything.", "The alien mothership burns in orbit, giving the armies of the world a fighting chance once again. The aliens are scattered and leaderless, roaming Earth's surface without will or purpose. All that remains is to clean the planet of this filth, before it can organise itself once again…               TO BE CONTINUED", "Your forces lie wounded and scattered.  The gangs come and strip you of your weapons leaving you bleeding in the fading light.  Humanity's future is uncertain, what is sure is that you will not be a part of it.", "The alien infestation spreads over the planet's surface consuming all in its path.  What resistance the human race is able to mount is scattered and leaderless.  There is little hope left for the fate of Mankind.", "Armoured alien warriors crush the remaining human strongholds with ease.  All that remains of our planet is a charred wasteland.  There is nothing left for humanity.", "The mothership descends to earth, consuming the planet's biosphere.  As the atmosphere is siphoned off the last remaining terrestrial life on the planet is obliterated into extinction. Earth as the human race knew it, is no more."};
        field_h = "ACT III: ";
        field_k = "AW-2 FG";
        field_o = "Connection lost - attempting to reconnect";
    }
}
