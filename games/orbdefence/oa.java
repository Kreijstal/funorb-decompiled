/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa implements Runnable {
    volatile la[] field_c;
    be field_g;
    static String field_a;
    static im field_d;
    volatile boolean field_h;
    volatile boolean field_b;
    static String[] field_i;
    static String field_e;
    static String field_f;

    final static String a(int param0, byte param1, int param2) {
        if (param1 != -2) {
            return (String) null;
        }
        return param2 + "/" + param0;
    }

    final static df a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        df[] var3 = null;
        int var4 = 0;
        df var5 = null;
        int var6 = 0;
        df stackIn_3_0 = null;
        df stackIn_10_0 = null;
        df stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2 = li.a(param1, "jagex-last-login-method", param0);
            if (var2 != null) {
              var3 = nd.a(-1);
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3.length <= var4) {
                      break L3;
                    } else {
                      var5 = var3[var4];
                      stackIn_13_0 = (df) (var5);

                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (((df) (Object) stackIn_13_0).a(-68, var2)) {
                          stackIn_10_0 = (df) (var5);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var4++;
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = jc.field_a;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = jc.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("oa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        la var2 = null;
        int var4 = 0;
        String var5 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    this.field_b = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_h) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var1_int >= 2) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_c[var1_int];
                        stackIn_11_0 = null;
                        stackIn_6_0 = stackIn_11_0;
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 != var2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2.a();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        hb.a(10L, 116);
                        stackIn_11_0 = null;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        vf.a(stackIn_11_0, 50, this.field_g);
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 12: {
                    this.field_b = false;
                    statePc = 17;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var5 = (String) null;
                        pe.a((byte) -13, (Throwable) ((Object) exception), (String) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    this.field_b = false;
                    return;
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    this.field_b = false;
                    throw oa.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_d = null;
        field_a = null;
        field_f = null;
        if (param0 != 90) {
            field_d = (im) null;
        }
    }

    oa() {
        this.field_c = new la[2];
        this.field_h = false;
        this.field_b = false;
    }

    static {
        field_a = "No highscores";
        field_d = new im();
        field_i = new String[]{"<b>OBJECTIVE:<br><br>The Norbs are coming to attack your orbs and it is up to you to stop them! Build up your defences to push back the Norb advance. If the orbs are lost, you will fail!<br><br><b>CONTROLS:<br><br><img=0> - move your view<br><img=1> - select a turret type<br><img=2> - send in the next Norb wave<br><img=3> - construct or upgrade a turret.<br><img=4> - remove an existing turret.", "<b>ENERGY:<br><br>You gain energy over time from all your remaining orbs. You also gain energy from each Norb you destroy.<br><br>The more powerful turrets use lots of energy to construct, so you will have to save it up. If you manage to destroy one of the Norb bosses, you will be rewarded with a massive energy boost!", "<b>DEFENCES:<br><br><b><%0>Fast blast:<br><%0>Cheap, but weak.<br><b><%0>Chain shot:<br><%0>Short-ranged, yet bounces.<br><b><%0>Big shot:<br><%0>Powerful, with a large area of effect.<br><b><%0>Ice shot:<br><%0>Slows down Norbs.<br><b><%0>Beam blast:<br><%0>The pinnacle of anti-Norb defences!", "<b>NORMAL NORBS:<br><br><b><%0>Normo:<br><%0>Easy energy!<br><b><%0>Swarmo:<br><%0>Massively swarming!<br><b><%0>Zoomo:<br><%0>Fast and spinny!<br><b><%0>Tougho:<br><%0>Lots of health!", "<b>NASTY NORBS:<br><br><b><%0>Flybo:<br><%0>Cannot be hit by big shot or beam blast turrets!<br><b><%0>Bombo:<br><%0>Explodes on death!<br><b><%0>Chompo:<br><%0>Eats your turrets!<br><b><%0>Irono:<br><%0>Immune to big shots and ice shots!", "<b>TIPS:<br><br>If even one Norb reaches one of your orbs, it will be destroyed and become a new spawn point for more Norbs!<br><br>Turrets with a flashing light can be upgraded by clicking on them.<br><br>The Norbs are not as stupid as they might look; they will not always stay on the same route!", "<b>NEW NORBS:<br><br><b><%0>Sneako:<br><%0>Invisible unless hit with an electroshock turret!<br><b><%0>Splitto:<br><%0>Releases a swarm when destroyed!<br><br><b>NEW DEFENCES:<br><br><b><%0>Electroshock:<br><%0>Stuns groups of Norbs (and reveals sneakos)!<br><b><%0>Barrier:<br><%0>Deters Norbs, but takes damage if attacked!"};
        field_e = "Connection restored.";
        field_f = "Use this alternative as your account name";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
