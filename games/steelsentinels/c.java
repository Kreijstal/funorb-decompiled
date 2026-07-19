/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends ck {
    static gh field_p;
    static String field_r;
    byte[] field_t;
    boolean field_q;
    static wk field_o;
    static String[] field_s;
    static int field_u;

    final static int a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_32_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_31_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            ag.field_u = ag.field_u + 65536;
            L1: while (true) {
              if (-65537 < (wa.a(ag.field_u, hh.field_j, (byte) -27) ^ -1)) {
                L2: {
                  var2_int = -1;
                  if (null == jb.field_S) {
                    if (null != bm.field_R) {
                      var2_int = bm.field_R.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var2_int = jb.field_S.length;
                    break L2;
                  }
                }
                L3: {
                  if (0 != (var2_int ^ -1)) {
                    L4: {
                      if (ul.field_g >= hh.field_f) {
                        break L4;
                      } else {
                        L5: {
                          ul.field_g = ul.field_g + 1;
                          if (ul.field_g <= hh.field_i) {
                            break L5;
                          } else {
                            L6: {
                              if (jb.field_S == null) {
                                break L6;
                              } else {
                                if (null == jb.field_S[lh.field_r]) {
                                  break L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            ul.field_g = ul.field_g - 1;
                            break L4;
                          }
                        }
                        if (ul.field_g < hh.field_f) {
                          break L4;
                        } else {
                          if (null != jb.field_S[(1 + lh.field_r) % var2_int]) {
                            break L4;
                          } else {
                            ul.field_g = ul.field_g - 1;
                            break L4;
                          }
                        }
                      }
                    }
                    L7: {
                      if (hh.field_f > ul.field_g) {
                        break L7;
                      } else {
                        oe.field_e = lh.field_r;
                        ul.field_g = ul.field_g - hh.field_f;
                        if (!rf.field_b) {
                          lh.field_r = lh.field_r - 1;
                          if (lh.field_r < 0) {
                            lh.field_r = lh.field_r + var2_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        } else {
                          lh.field_r = lh.field_r + 1;
                          if (var2_int <= lh.field_r) {
                            lh.field_r = lh.field_r - var2_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (ul.field_g <= hh.field_i) {
                      break L3;
                    } else {
                      rf.field_b = true;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                if (param1 == 269) {
                  L8: {
                    if (null != jc.field_b) {
                      L9: {
                        var3 = 357 + -(jc.field_b.field_B / 2);
                        var4 = 0;
                        if (lb.field_gc == 0) {
                          break L9;
                        } else {
                          if (var3 >= rj.field_j) {
                            break L9;
                          } else {
                            if (jc.field_b.field_F + var3 <= rj.field_j) {
                              break L9;
                            } else {
                              L10: {
                                if (269 - jc.field_b.field_A >= oa.field_S) {
                                  break L10;
                                } else {
                                  if ((oa.field_S ^ -1) <= -270) {
                                    break L10;
                                  } else {
                                    rf.field_b = false;
                                    ul.field_g = hh.field_f;
                                    var4 = 1;
                                    break L10;
                                  }
                                }
                              }
                              if (oa.field_S <= 586) {
                                break L9;
                              } else {
                                if (oa.field_S >= jc.field_b.field_A + 586) {
                                  break L9;
                                } else {
                                  var4 = 1;
                                  rf.field_b = true;
                                  ul.field_g = hh.field_f;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L8;
                      } else {
                        if (hh.field_i >= ul.field_g) {
                          break L8;
                        } else {
                          if (var3 >= pi.field_c) {
                            break L8;
                          } else {
                            if (jc.field_b.field_F + var3 <= pi.field_c) {
                              break L8;
                            } else {
                              L11: {
                                if (oh.field_f <= -jc.field_b.field_A + 269) {
                                  break L11;
                                } else {
                                  if (269 <= oh.field_f) {
                                    break L11;
                                  } else {
                                    ul.field_g = hh.field_i;
                                    break L11;
                                  }
                                }
                              }
                              if (oh.field_f <= 586) {
                                break L8;
                              } else {
                                if (586 - -jc.field_b.field_A <= oh.field_f) {
                                  break L8;
                                } else {
                                  ul.field_g = hh.field_i;
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  L12: {
                    if (!param0) {
                      break L12;
                    } else {
                      L13: {
                        jh.field_i.a(param1 + -145, ei.a(pi.field_c, oh.field_f, true), ei.a(rj.field_j, oa.field_S, true));
                        if (jh.field_i.c(param1 ^ 269)) {
                          if (0 != jh.field_i.field_e) {
                            if (-2 != (jh.field_i.field_e ^ -1)) {
                              break L13;
                            } else {
                              stackOut_61_0 = 2;
                              stackIn_62_0 = stackOut_61_0;
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          } else {
                            stackOut_58_0 = 3;
                            stackIn_59_0 = stackOut_58_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          break L13;
                        }
                      }
                      L14: while (true) {
                        if (!dl.f(22759)) {
                          break L12;
                        } else {
                          L15: {
                            jh.field_i.a(true, 0);
                            if (jh.field_i.c(0)) {
                              if (0 != jh.field_i.field_e) {
                                if (1 != jh.field_i.field_e) {
                                  break L15;
                                } else {
                                  stackOut_70_0 = 1;
                                  stackIn_71_0 = stackOut_70_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              } else {
                                stackOut_67_0 = 3;
                                stackIn_68_0 = stackOut_67_0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              break L15;
                            }
                          }
                          if (ei.field_q == 13) {
                            stackOut_74_0 = 1;
                            stackIn_75_0 = stackOut_74_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  stackOut_76_0 = 0;
                  stackIn_77_0 = stackOut_76_0;
                  decompiledRegionSelector0 = 6;
                  break L0;
                } else {
                  stackOut_31_0 = -13;
                  stackIn_32_0 = stackOut_31_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                ag.field_u = ag.field_u - hh.field_j;
                ik.field_e = ik.field_e + 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "c.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_32_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_59_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_62_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_68_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_71_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_75_0;
                  } else {
                    return stackIn_77_0;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(byte param0, int param1) {
        if (param0 < -12) {
          if (param1 != 10) {
            if (-7 != (param1 ^ -1)) {
              if (param1 != 7) {
                if (-10 != (param1 ^ -1)) {
                  if (-9 == (param1 ^ -1)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_p = (gh) null;
          if (param1 != 10) {
            if (-7 != (param1 ^ -1)) {
              if (param1 != 7) {
                if (-10 != (param1 ^ -1)) {
                  if (-9 == (param1 ^ -1)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 != 127) {
          field_p = (gh) null;
          field_r = null;
          field_s = null;
          return;
        } else {
          field_r = null;
          field_s = null;
          return;
        }
    }

    c() {
    }

    static {
        field_r = "The <%0> is now available for you to use. You can select this chassis in the 'Configuration' screen.";
        field_s = new String[]{"Welcome, <%0>, to the first training mission.<br><br>In this mission you will be using a stripped-down version of one of our staple sentinels, the Slave-class chassis. You will be taught how to operate its movement systems and try your skills in a simple combat exercise.<br>There is much you need to know before you can be trusted on the battlefield. Once you prove your skills in this campaign, you will be able to pit your skills against other sentinel commanders from around the universe.<br><br>On to victory!", "Welcome to the second training mission, <%0>.<br><br>In this mission you will be using a Slave with an extended array of piercer rockets. You will learn about weapon trajectories and automatic rocket defence.<br><br>On to victory!", "Your training is proceeding well, <%0>.<br><br>You have completed initial training, but before you are fully cleared to use the Slave-class sentinel, you must be tested in battle.<br><br>Take the Slave to the warzone and destroy the enemy sentinels.<br><br>On to victory!", "Welcome, <%0>, to the training for the Aquila-class sentinel.<br><br>The Aquila is a fast, lightweight sentinel capable of flight. You will learn about using thrust, energy management, and lasers.<br><br>On to victory!", "The next phase of your Aquila training is live combat, <%0>.<br><br>Take the Aquila to the warzone and destroy our enemies.<br><br>Remember your training on energy management. If you run out of energy while in battle, you will be very vulnerable to attack.<br><br>On to victory!", "Welcome to targeting and missile training, <%0>.<br><br>In this mission you will be using a full Aquila, and learning to use its targeting systems and missiles.<br><br>On to victory!", "Your skills are progressing well, <%0>.<br><br>The last part of Aquila training is a field assessment. On a nearby world is a ruined city in which enemy sentinels have been reported. Proceed down to the city with the Aquila and do battle.<br><br>On to victory!", "Welcome, <%0>, to the training for the Golem-class sentinel.<br><br>The Golem is formidable in the control of a skilled pilot. Its cannon and heavy rocket can inflict severe explosive damage, and its scanner module allows it to aim long-range weapons with lethal accuracy.<br><br>On to victory!", "The next mission is a field test, <%0>.<br><br>You will be using a Golem, armed with a heavy rocket, cannon, and gun. Return to the warzone and destroy the enemy forces there.<br><br>On to victory!", "Welcome to the flak training mission, <%0>.<br><br>The standard Golem is armed with a flak repeater and airburst rockets. Using them effectively is a key part of the Golem's defences.<br><br>Once this mission is complete, you will be clear to take the Golem out into battle.<br><br>On to victory!", "The Lost World is a planet being battled over by orbiting star cruisers. While they destroy each other, sentinels battle on the surface.<br><br><%1>, take the Slave-class sentinel, drop it down to the surface and destroy all enemies.<br><br>On to riches and victory!", "<%1>, your mission to the Lost World has led to intelligence that our enemies are deploying ground sentinels with powerful artillery weapons. Take an Aquila back to the Lost World and destroy any new sentinel models you encounter.<br><br>On to riches and victory!", "<%1>, our work on the Turtle-class sentinel is leading to valuable new developments. Although our Turtle prototype is unfinished, we need you to return to the Lost World and try out its armaments against enemy sentinels.<br><br>On to riches and victory!", "Good news, <%0>. Thanks to your work with the new sentinel model, our engineering on the Turtle is complete. Take it down to the Lost World and try it out. Once the Turtle has passed this final field test, we will begin mass production.<br><br>On to riches and victory!", "Things on the front line have developed not necessarily to our advantage, <%0>. Our enemies have developed an enhanced bipedal sentinel with plasma and close-combat weapons. We urgently need you to return to the war zone and take out these new threats.<br><br>We hope that the Slave-class sentinel will give you the firepower and agility necessary to compete with these new adversaries.<br><br>On to riches and victory!", "We are trying to reproduce the technology of the Commando-class sentinel, <%0>, but we need it field tested before we can finish. Take this work-in-progress sentinel down to the war zone and test it out in battle.<br><br>On to riches and victory!", "Excellent news, <%0>. Owing to your field test, we have developed a fully functional Commando-class sentinel of our own. Not a moment too soon: the situation on the Lost World has reached a critical point, and we need you to take the Commando down there and destroy the enemy forces.<br><br>On to riches and victory!", "We need your help again, <%0>. Reports are coming in of a new sentinel in urban areas, swooping down and destroying our forces with barrages of rockets and accelerated kinetic weapons. We urgently need intelligence from someone who can face these new adversaries in battle.<br><br>Take the Turtle-class sentinel to the city and defeat the enemy forces there.<br><br>On to riches and victory!", "The new flying sentinels are devastating our war effort, <%0>. We are working on engineering our own version, but, in the meantime, we need you to go back to the city and fend off their attacks. You can take the Commando-class sentinel.<br><br>On to riches and victory!", "Superlative news, <%0>. We have completed work on the Hurricane-class sentinel. We haven't got time to test it: the situation in the city has become untenable. Squadrons of Hurricanes and worse are taking out all our forces.<br><br>You will be taking our prototype Hurricane-class sentinel. The probability of survival is slim, but do the best you can.<br><br>On to riches and victory, <%0>!", "Welcome back, <%0>. We need your expertise in the field. Take this Commando-class sentinel down to the ruined city and clear out the enemy forces.<br><br>On to riches and victory!", "<%1>, the ruined city is being overrun by Aquila-class sentinels. Take the Hurricane and destroy all the enemy Aquilas, and any other enemies that you encounter.<br><br>On to riches and victory!", "<%1>, the enemy is using a new anti-air sentinel, designated Scorpion-class. There are multiple Scorpions reported on the Lost World.<br><br>We don't have a strategy to defeat them yet, but take the Hurricane and do the best you can.<br><br>On to riches and victory!", "<%1>, the data from your battles with the Scorpions was invaluable. We have developed a working Scorpion of our own, but it needs to be tried out in combat.<br><br>Take the Scorpion to the war zone and defeat the enemy forces there.<br><br>On to riches and victory!", "Now we have our own working line of Scorpions, it's time to take back the Lost World. <%1>, go down there, take out the enemies, and report back on any new sentinels you face.<br><br>On to riches and victory!", "Worrying news, <%0>. The enemy's new heavy bipedal sentinel, designated Crusher-class, threatens to turn the tide of the war against us, and it's taking all of our resources to combat it.<br><br>We need more intel to develop our own, but all we can spare for this mission is an Aquila-class. Fortunately, the city should provide you with relatively safe vantage points, so you can avoid frontal attacks. We expect to see the combat skills that have made you famous.<br><br>On to riches and victory!", "Marvellous news, <%0>. From your intelligence we have developed our version of the Crusher-class sentinel. We have high hopes for it.<br><br>A star cruiser has crashed on the moon and our enemies are making forays to salvage it. Take the Crusher and fend them off. Be aware that the low gravity will affect the manoeuvring capabilities of all sentinels.<br><br>On to riches and victory!", "We have our enemies on the run, <%0>. Our superior skills have forced them to resort to their older models of sentinel. These are not as sophisticated as modern classes, but when they are fitted with increasingly powerful weapons, they pose a formidable threat.<br><br>Take the Scorpion back to the moon and take out the enemies.<br><br>On to riches and victory!", "The Bertha-class sentinel is not as obsolete as we thought, <%0>. Take it down to the Lost World and clear out the enemy forces.<br><br>On to riches and victory!", "The war has reached a critical juncture. The enemy is nearly defeated, but they are using experimental technology that we cannot defend against.<br><br>Take the Hurricane down to the Lost World and engage in combat. When you have taken out the rest of the enemy forces, they will send out their experimental models. You will have to use all the skills that have made you a legend to destroy them.<br><br>On to glory, <%0>!"};
    }
}
