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
        try {
            if (!(!param4)) {
                int discarded$0 = 1;
                bl.a(param0.field_m, param3 + param0.field_n, param0.field_p, param1 - -param0.field_i);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "hga.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void b() {
        field_o = null;
        field_n = null;
        int var1 = 1;
    }

    hga(il param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_w, -1, 2147483647, false);
    }

    final static void a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
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
        int var26 = 0;
        String[][] var27 = null;
        String var29 = null;
        String var30 = null;
        String[][] var31 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var26 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
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
            L1: while (true) {
              if (var11_int >= var27[0].length) {
                var11 = new ji(8);
                var12 = 0;
                var13 = 1;
                L2: while (true) {
                  if (var27.length <= var13) {
                    cm.field_a = new qg[var12];
                    rda.field_n = new int[var12];
                    var13 = 0;
                    L3: while (true) {
                      if (var13 >= var12) {
                        break L0;
                      } else {
                        var14 = 0;
                        var15_int = 1;
                        L4: while (true) {
                          if (var31.length <= var15_int) {
                            var15 = new g[var14];
                            rda.field_n[var13] = var14;
                            var16 = 0;
                            var17 = 0;
                            var18 = 1;
                            L5: while (true) {
                              if (var31.length <= var18) {
                                cm.field_a[var13] = new qg(var15, var16 != 0);
                                var13++;
                                continue L3;
                              } else {
                                L6: {
                                  var19 = -1 + Integer.parseInt(var31[var18][var3]);
                                  if (var19 != var13) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var18++;
                                continue L5;
                              }
                            }
                          } else {
                            L7: {
                              var16 = Integer.parseInt(var31[var15_int][var3]) + -1;
                              if (var16 == var13) {
                                var14++;
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            var15_int++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    L8: {
                      var14 = Integer.parseInt(var27[var13][var3]);
                      if (null != var11.a((byte) -100, (long)var14)) {
                        break L8;
                      } else {
                        var11.a((long)var14, 109, new vg());
                        var12++;
                        break L8;
                      }
                    }
                    var13++;
                    continue L2;
                  }
                }
              } else {
                L9: {
                  var29 = var27[0][var11_int];
                  var30 = var29.trim();
                  if (var30.equals((Object) (Object) "World")) {
                    var3 = var11_int;
                    break L9;
                  } else {
                    if (!var30.equals((Object) (Object) "File Name")) {
                      if (var30.equals((Object) (Object) "Group Name")) {
                        var6 = var11_int;
                        break L9;
                      } else {
                        if (!var30.equals((Object) (Object) "Room Id")) {
                          if (!var30.equals((Object) (Object) "Special")) {
                            if (!var30.equals((Object) (Object) "Multiplayer ID")) {
                              if (var30.equals((Object) (Object) "MemLev")) {
                                var9 = var11_int;
                                break L9;
                              } else {
                                if (var30.equals((Object) (Object) "Par Time")) {
                                  var10 = var11_int;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              var8 = var11_int;
                              break L9;
                            }
                          } else {
                            var7 = var11_int;
                            break L9;
                          }
                        } else {
                          var5 = var11_int;
                          break L9;
                        }
                      }
                    } else {
                      var4 = var11_int;
                      break L9;
                    }
                  }
                }
                var11_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var2;
            stackOut_43_1 = new StringBuilder().append("hga.A(").append(1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 41);
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
