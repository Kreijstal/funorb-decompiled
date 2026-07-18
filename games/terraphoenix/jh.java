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

    public static void d() {
        field_o = null;
        field_h = null;
        field_l = null;
        field_p = null;
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

    final static void b() {
        RuntimeException var2 = null;
        int var3 = 0;
        vi var4 = null;
        me var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            var4 = (vi) (Object) pd.field_g.d(9272);
            L1: while (true) {
              if (var4 == null) {
                var5 = (me) (Object) ga.field_r.d(9272);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    rj.a(5, -119, var5);
                    var5 = (me) (Object) ga.field_r.e((byte) -119);
                    continue L2;
                  }
                }
              } else {
                qd.a(5, -7357, var4);
                var4 = (vi) (Object) pd.field_g.e((byte) -119);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var2, "jh.B(" + 5 + ',' + -31890 + ')');
        }
    }

    final static oa a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oa stackIn_3_0 = null;
        oa stackIn_6_0 = null;
        oa stackIn_10_0 = null;
        int stackIn_19_0 = 0;
        oa stackIn_24_0 = null;
        Object stackIn_30_0 = null;
        oa stackIn_41_0 = null;
        oa stackIn_45_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        oa stackOut_40_0 = null;
        oa stackOut_44_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        oa stackOut_23_0 = null;
        oa stackOut_9_0 = null;
        oa stackOut_5_0 = null;
        oa stackOut_2_0 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (64 >= var2_int) {
              if (param1.charAt(0) != 34) {
                var3 = 0;
                if (param0 == 42) {
                  var4 = 0;
                  L0: while (true) {
                    if (var4 < var2_int) {
                      L1: {
                        var5 = param1.charAt(var4);
                        if (var5 == 46) {
                          L2: {
                            if (0 == var4) {
                              break L2;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L2;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L1;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          }
                          stackOut_40_0 = ge.field_a;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0;
                        } else {
                          if (nc.field_b.indexOf(var5) != -1) {
                            var3 = 0;
                            break L1;
                          } else {
                            stackOut_44_0 = ge.field_a;
                            stackIn_45_0 = stackOut_44_0;
                            return stackIn_45_0;
                          }
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_29_0 = null;
                  stackIn_30_0 = stackOut_29_0;
                  return (oa) (Object) stackIn_30_0;
                }
              } else {
                if (param1.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L3: while (true) {
                    if (var2_int - 1 > var4) {
                      L4: {
                        var5 = param1.charAt(var4);
                        if (var5 == 92) {
                          L5: {
                            if (var3 != 0) {
                              stackOut_18_0 = 0;
                              stackIn_19_0 = stackOut_18_0;
                              break L5;
                            } else {
                              stackOut_17_0 = 1;
                              stackIn_19_0 = stackOut_17_0;
                              break L5;
                            }
                          }
                          var3 = stackIn_19_0;
                          break L4;
                        } else {
                          L6: {
                            if (34 != var5) {
                              break L6;
                            } else {
                              if (var3 == 0) {
                                stackOut_23_0 = ge.field_a;
                                stackIn_24_0 = stackOut_23_0;
                                return stackIn_24_0;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      var4++;
                      continue L3;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = ge.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_5_0 = lg.field_j;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          } else {
            stackOut_2_0 = b.field_f;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("jh.A(").append(param0).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param1 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L7;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + ')');
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
