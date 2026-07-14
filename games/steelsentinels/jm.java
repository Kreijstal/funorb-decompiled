/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends ck {
    static int[] field_p;
    static String field_t;
    static int[] field_r;
    static String[] field_u;
    int field_q;
    static int field_o;
    int field_s;

    public static void d(int param0) {
        field_p = null;
        field_u = null;
        int var1 = 90 % ((param0 - 75) / 51);
        field_t = null;
        field_r = null;
    }

    final static void a(int param0, int param1, wk[] param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var22 = SteelSentinels.field_G;
        var27 = new int[4];
        var26 = var27;
        var25 = var26;
        var24 = var25;
        var23 = var24;
        var6 = var23;
        if (param2 == null) {
          return;
        } else {
          L0: {
            if (param5 <= 0) {
              break L0;
            } else {
              if (param1 <= 0) {
                break L0;
              } else {
                L1: {
                  if (param2[3] == null) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = param2[3].field_z;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                L2: {
                  var7 = stackIn_10_0;
                  if (param2[5] != null) {
                    stackOut_12_0 = param2[5].field_z;
                    stackIn_13_0 = stackOut_12_0;
                    break L2;
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_13_0 = stackOut_11_0;
                    break L2;
                  }
                }
                L3: {
                  var8 = stackIn_13_0;
                  if (null != param2[param3]) {
                    stackOut_15_0 = param2[1].field_B;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                L4: {
                  var9 = stackIn_16_0;
                  if (null == param2[7]) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L4;
                  } else {
                    stackOut_17_0 = param2[7].field_B;
                    stackIn_19_0 = stackOut_17_0;
                    break L4;
                  }
                }
                L5: {
                  var10 = stackIn_19_0;
                  var11 = param5 + param4;
                  var12 = param0 - -param1;
                  var13 = var7 + param4;
                  var14 = var11 - var8;
                  var15 = param0 + var9;
                  var16 = -var10 + var12;
                  var17 = var13;
                  var18 = var14;
                  if (var17 <= var18) {
                    break L5;
                  } else {
                    var18 = param4 + param5 * var7 / (var8 + var7);
                    var17 = param4 + param5 * var7 / (var8 + var7);
                    break L5;
                  }
                }
                L6: {
                  var19 = var15;
                  var20 = var16;
                  if (var19 > var20) {
                    var20 = param1 * var9 / (var9 + var10) + param0;
                    var19 = param1 * var9 / (var9 + var10) + param0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  pb.b(var27);
                  if (param2[0] != null) {
                    pb.h(param4, param0, var17, var19);
                    param2[0].a(param4, param0);
                    pb.a(var27);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null == param2[2]) {
                    break L8;
                  } else {
                    pb.h(var18, param0, var11, var19);
                    param2[2].a(var14, param0);
                    pb.a(var27);
                    break L8;
                  }
                }
                L9: {
                  if (null == param2[6]) {
                    break L9;
                  } else {
                    pb.h(param4, var20, var17, var12);
                    param2[6].a(param4, var16);
                    pb.a(var27);
                    break L9;
                  }
                }
                L10: {
                  if (param2[8] == null) {
                    break L10;
                  } else {
                    pb.h(var18, var20, var11, var12);
                    param2[8].a(var14, var16);
                    pb.a(var27);
                    break L10;
                  }
                }
                L11: {
                  if (null == param2[1]) {
                    break L11;
                  } else {
                    if (-1 == (param2[1].field_z ^ -1)) {
                      break L11;
                    } else {
                      pb.h(var17, param0, var18, var19);
                      var21 = var13;
                      L12: while (true) {
                        L13: {
                          if (var21 >= var14) {
                            break L13;
                          } else {
                            param2[1].a(var21, param0);
                            var21 = var21 + param2[1].field_z;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        pb.a(var27);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (param2[7] == null) {
                    break L14;
                  } else {
                    if (param2[7].field_z != 0) {
                      pb.h(var17, var20, var18, var12);
                      var21 = var13;
                      L15: while (true) {
                        L16: {
                          if (var14 <= var21) {
                            break L16;
                          } else {
                            param2[7].a(var21, var16);
                            var21 = var21 + param2[7].field_z;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        pb.a(var27);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (param2[3] == null) {
                    break L17;
                  } else {
                    if (-1 != (param2[3].field_B ^ -1)) {
                      pb.h(param4, var19, var17, var20);
                      param2[3].c(param4, var15, var7, var16 - var15);
                      pb.a(var27);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                L18: {
                  if (null == param2[5]) {
                    break L18;
                  } else {
                    if (0 != param2[5].field_B) {
                      pb.h(var18, var19, var11, var20);
                      param2[5].c(var14, var15, var8, var16 - var15);
                      pb.a(var27);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                L19: {
                  if (param2[4] == null) {
                    break L19;
                  } else {
                    if (0 == param2[4].field_z) {
                      break L19;
                    } else {
                      if (0 == param2[4].field_B) {
                        break L19;
                      } else {
                        pb.h(var17, var19, var18, var20);
                        param2[4].c(var13, var15, -var13 + var14, -var15 + var16);
                        pb.a(var27);
                        break L19;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        }
    }

    private jm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "W";
        field_p = new int[]{88, 105, 35, 91, 90, 46, 89, 50, 50, 24, 24, 24, 3, 8, 8, 23, 13, 15, -1, -1};
        field_u = new String[]{"Welcome to sentinel configuration. Here you can select and customise the design of the sentinel that you will take out in multiplayer competition. You can also engineer new items to build new and improved sentinels.<br><br>This brief training program will guide you through the process.<br><br>Pressing 'ESC' will exit the program.", "The list on the left shows the chassis available for you to use.<br><br>Click on the Slave chassis to begin building your sentinel.", "You have loaded the default Slave. The right-hand pane shows your current sentinel and the bars underneath show its stats. The Slave is well-armoured and has particularly good jumping ability.<br><br>Point the mouse at the stats to see what they mean.", "Click on the Components tab.", "This screen lists the components attached to your Slave chassis. The Slave's components are the shield head, the armoured arm and the heavy mounting. Every component adds a certain amount of armour to your sentinel, and many have slots for weapons. Point the mouse at any item in the COMPONENTS list to view its information.", "Now click on the Weapons tab.", "On the right are the weapons currently equipped on your sentinel. The list on the left shows all the weapons available to be fitted to your sentinel. Point the mouse at any weapon to view its information.", "Click on the minigun in the list on the left.", "Weapon slots can only hold suitable weapons. For instance, some can hold only heavy weapons and some can hold only rockets.<br>You are holding the minigun, which is a light weapon. Slots in the list on the right where light weapons can be placed are now outlined in blue. Click on each of them to place a minigun in those slots.", "As you replace the default item in a slot with an item chosen yourself, a <col=00ffff>D</col> will appear in the corner of the slot, indicating that there is a different default item for this slot (which can later be restored by holding 'SHIFT' and clicking on the slot).<br><br>You have now made a gun Slave, armed with seven guns and no rockets. This will be more destructive at close range, but without the versatility of the default Slave.", "Now click on the Modules tab.", "Modules provide different abilities for a sentinel or improve its stats. The default Slave's module is AMARDS, which is the system that enables automatic missile defences. Other modules include energy shields, targeting systems and armour plating.<br><br>Point the mouse at any module to view its information.", "Lower in the module list on the left are the modules that you have yet to engineer. More modules will appear in this list as you progress technologically. When you engineer a module, component or weapon, it will be moved to the ENGINEERED list, so you can equip it.<br><br>Click on the engineer button on any module.", "Engineering any component, weapon or module expends solarite. Solarite can be earned from playing multiplayer games.<br><br>Many items can also be unlocked be completing missions in campaign mode.", "Now go back to the Chassis tab.", "Engineering the right set of components and modules will unlock a new chassis. Point the mouse at the engineer button of a locked chassis to see the list of required items.", "This concludes the configuration training program. You can now build your sentinel to your own specifications. Also, you may want to visit the Test Field to try out your sentinel.<br><br>To repeat configuration training in the future, press the HELP button."};
        field_o = 0;
    }
}
