/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hga extends vpa {
    static String field_n;
    private static String[] field_o;

    hga(int param0) {
        this(mj.field_J, param0);
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        if (param2 != 16777215) {
            return;
        }
        if (!(!param4)) {
            bl.a(param0.field_m, param3 + param0.field_n, param0.field_p, param1 - -param0.field_i, 1);
        }
        super.a(param0, param1, param2 + 0, param3, param4);
    }

    public static void b(byte param0) {
        field_o = null;
        field_n = null;
        int var1 = 71 % ((param0 - 38) / 42);
    }

    hga(il param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_w, -1, 2147483647, false);
    }

    final static void a(boolean param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        ji var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        g[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        String[][] var27 = null;
        String var28 = null;
        String var29 = null;
        String var30 = null;
        String[][] var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        int stackIn_42_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        var26 = TombRacer.field_G ? 1 : 0;
        var27 = sra.a((byte) 43, new uia(param1));
        var31 = var27;
        var3 = -1;
        var4 = -1;
        var5 = -1;
        var6 = -1;
        var7 = -1;
        var8 = -1;
        var9 = -1;
        var10 = -1;
        var11_int = 0;
        L0: while (true) {
          if (var11_int >= var27[0].length) {
            var11 = new ji(8);
            var12 = 0;
            var13 = 1;
            L1: while (true) {
              if (var27.length <= var13) {
                cm.field_a = new qg[var12];
                rda.field_n = new int[var12];
                if (param0) {
                  var13 = 0;
                  L2: while (true) {
                    if (var13 >= var12) {
                      return;
                    } else {
                      var14 = 0;
                      var15_int = 1;
                      L3: while (true) {
                        if (var31.length <= var15_int) {
                          var15 = new g[var14];
                          rda.field_n[var13] = var14;
                          var16 = 0;
                          var17 = 0;
                          var18 = 1;
                          L4: while (true) {
                            if (var31.length <= var18) {
                              cm.field_a[var13] = new qg(var15, var16 != 0);
                              var13++;
                              continue L2;
                            } else {
                              var19 = -1 + Integer.parseInt(var31[var18][var3]);
                              if (var19 == var13) {
                                L5: {
                                  var32 = var31[var18][var5];
                                  if (-1 <= (var32.length() ^ -1)) {
                                    stackOut_41_0 = -1;
                                    stackIn_42_0 = stackOut_41_0;
                                    break L5;
                                  } else {
                                    stackOut_40_0 = Integer.parseInt(var32) - 1;
                                    stackIn_42_0 = stackOut_40_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  var21 = stackIn_42_0;
                                  var28 = var31[var18][var8];
                                  var33 = var28;
                                  if (0 < var33.length()) {
                                    stackOut_44_0 = Integer.parseInt(var28) - 1;
                                    stackIn_45_0 = stackOut_44_0;
                                    break L6;
                                  } else {
                                    stackOut_43_0 = -1;
                                    stackIn_45_0 = stackOut_43_0;
                                    break L6;
                                  }
                                }
                                L7: {
                                  var22 = stackIn_45_0;
                                  var34 = var31[var18][var9];
                                  if ((var34.length() ^ -1) < -1) {
                                    if (!var34.equalsIgnoreCase("FALSE")) {
                                      stackOut_49_0 = 1;
                                      stackIn_51_0 = stackOut_49_0;
                                      break L7;
                                    } else {
                                      stackOut_48_0 = 0;
                                      stackIn_51_0 = stackOut_48_0;
                                      break L7;
                                    }
                                  } else {
                                    stackOut_46_0 = 1;
                                    stackIn_51_0 = stackOut_46_0;
                                    break L7;
                                  }
                                }
                                L8: {
                                  var23 = stackIn_51_0;
                                  var35 = var31[var18][var10];
                                  if (-1 <= (var35.length() ^ -1)) {
                                    stackOut_53_0 = 0;
                                    stackIn_54_0 = stackOut_53_0;
                                    break L8;
                                  } else {
                                    stackOut_52_0 = Integer.parseInt(var35);
                                    stackIn_54_0 = stackOut_52_0;
                                    break L8;
                                  }
                                }
                                var24 = stackIn_54_0;
                                var17++;
                                var15[var17] = new g(var31[var18][var6], var31[var18][var4], var21, var22, var23 != 0, var24);
                                var25 = var31[var18][var7].equalsIgnoreCase("Tutorial") ? 1 : 0;
                                var16 = var25;
                                boolean discarded$1 = var31[var18][var7].equalsIgnoreCase("Corridor");
                                var18++;
                                continue L4;
                              } else {
                                var18++;
                                continue L4;
                              }
                            }
                          }
                        } else {
                          var16 = Integer.parseInt(var31[var15_int][var3]) + -1;
                          if (var16 == var13) {
                            var14++;
                            var15_int++;
                            continue L3;
                          } else {
                            var15_int++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                var14 = Integer.parseInt(var27[var13][var3]);
                if (null == var11.a((byte) -100, (long)var14)) {
                  var11.a((long)var14, 109, new vg());
                  var12++;
                  var13++;
                  continue L1;
                } else {
                  var13++;
                  continue L1;
                }
              }
            }
          } else {
            var29 = var27[0][var11_int];
            var30 = var29.trim();
            if (var30.equals((Object) (Object) "World")) {
              var3 = var11_int;
              var11_int++;
              continue L0;
            } else {
              if (!var30.equals((Object) (Object) "File Name")) {
                if (var30.equals((Object) (Object) "Group Name")) {
                  var6 = var11_int;
                  var11_int++;
                  continue L0;
                } else {
                  if (!var30.equals((Object) (Object) "Room Id")) {
                    if (!var30.equals((Object) (Object) "Special")) {
                      if (!var30.equals((Object) (Object) "Multiplayer ID")) {
                        if (var30.equals((Object) (Object) "MemLev")) {
                          var9 = var11_int;
                          var11_int++;
                          continue L0;
                        } else {
                          if (var30.equals((Object) (Object) "Par Time")) {
                            var10 = var11_int;
                            var11_int++;
                            continue L0;
                          } else {
                            var11_int++;
                            continue L0;
                          }
                        }
                      } else {
                        var8 = var11_int;
                        var11_int++;
                        continue L0;
                      }
                    } else {
                      var7 = var11_int;
                      var11_int++;
                      continue L0;
                    }
                  } else {
                    var5 = var11_int;
                    var11_int++;
                    continue L0;
                  }
                }
              } else {
                var4 = var11_int;
                var11_int++;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Create your own free Jagex account";
        field_o = new String[2];
        field_o[0] = "Finish";
        field_o[1] = "Ignore Fall";
    }
}
