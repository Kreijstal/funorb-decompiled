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
        df stackIn_7_0 = null;
        df stackIn_10_0 = null;
        df stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        df stackOut_6_0 = null;
        df stackOut_9_0 = null;
        df stackOut_12_0 = null;
        df stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
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
                      stackOut_6_0 = (df) (var5);
                      stackIn_13_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (((df) (Object) stackIn_7_0).a(-68, var2)) {
                          stackOut_9_0 = (df) (var5);
                          stackIn_10_0 = stackOut_9_0;
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
                  stackOut_12_0 = jc.field_a;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = jc.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var2_ref);
            stackOut_14_1 = new StringBuilder().append("oa.C(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
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
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        Object stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_5_0 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        this.field_b = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_h) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            if (var1_int >= 2) {
                              hb.a(10L, 116);
                              stackOut_10_0 = null;
                              stackIn_11_0 = stackOut_10_0;
                              break L5;
                            } else {
                              var2 = this.field_c[var1_int];
                              stackOut_5_0 = null;
                              stackIn_11_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var4 != 0) {
                                break L5;
                              } else {
                                L6: {
                                  if (stackIn_6_0 != var2) {
                                    var2.a();
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var1_int++;
                                continue L4;
                              }
                            }
                          }
                          vf.a(stackIn_11_0, 50, this.field_g);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var5 = (String) null;
              pe.a((byte) -13, (Throwable) ((Object) exception), (String) null);
              this.field_b = false;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw oa.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L7: {
          if (decompiledRegionSelector1 == 0) {
            this.field_b = false;
            break L7;
          } else {
            break L7;
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
