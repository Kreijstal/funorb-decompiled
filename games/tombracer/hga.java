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
                bl.a(param0.field_m, param3 + param0.field_n, param0.field_p, param1 - -param0.field_i, 1);
            }
            super.a(param0, param1, param2 + 0, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "hga.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
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
        RuntimeException var2 = null;
        String[][] var2_array = null;
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
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
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
            var2_array = var27;
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
              L2: {
                if (var11_int >= var27[0].length) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var29 = var27[0][var11_int];
                      var30 = var29.trim();
                      if (var30.equals("World")) {
                        break L4;
                      } else {
                        L5: {
                          if (!var30.equals("File Name")) {
                            break L5;
                          } else {
                            var4 = var11_int;
                            if (var26 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (var30.equals("Group Name")) {
                            break L6;
                          } else {
                            L7: {
                              if (!var30.equals("Room Id")) {
                                break L7;
                              } else {
                                var5 = var11_int;
                                if (var26 == 0) {
                                  break L3;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if (!var30.equals("Special")) {
                                break L8;
                              } else {
                                var7 = var11_int;
                                if (var26 == 0) {
                                  break L3;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            L9: {
                              if (!var30.equals("Multiplayer ID")) {
                                break L9;
                              } else {
                                var8 = var11_int;
                                if (var26 == 0) {
                                  break L3;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            L10: {
                              if (var30.equals("MemLev")) {
                                break L10;
                              } else {
                                if (var30.equals("Par Time")) {
                                  var10 = var11_int;
                                  if (var26 == 0) {
                                    break L3;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var9 = var11_int;
                            if (var26 == 0) {
                              break L3;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6 = var11_int;
                        if (var26 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = var11_int;
                    break L3;
                  }
                  var11_int++;
                  if (var26 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var11 = new ji(8);
              var12 = 0;
              var13 = 1;
              L11: while (true) {
                L12: {
                  L13: {
                    if (var27.length <= var13) {
                      break L13;
                    } else {
                      var14 = Integer.parseInt(var27[var13][var3]);
                      if (var26 != 0) {
                        break L12;
                      } else {
                        L14: {
                          if (null != var11.a((byte) -100, (long)var14)) {
                            break L14;
                          } else {
                            var11.a((long)var14, 109, new vg());
                            var12++;
                            break L14;
                          }
                        }
                        var13++;
                        if (var26 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  cm.field_a = new qg[var12];
                  rda.field_n = new int[var12];
                  break L12;
                }
                if (param0) {
                  var13 = 0;
                  L15: while (true) {
                    stackOut_31_0 = var13;
                    stackOut_31_1 = var12;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    L16: while (true) {
                      L17: {
                        if (stackIn_32_0 >= stackIn_32_1) {
                          break L17;
                        } else {
                          var14 = 0;
                          if (var26 == 0) {
                            var15_int = 1;
                            if (var27.length <= var15_int) {
                              var15 = new g[var14];
                              rda.field_n[var13] = var14;
                              var16 = 0;
                              var17 = 0;
                              var18 = 1;
                              if (var27.length <= var18) {
                                cm.field_a[var13] = new qg(var15, var16 != 0);
                                var13++;
                                if (var26 == 0) {
                                  continue L15;
                                } else {
                                  break L17;
                                }
                              } else {
                                var19 = -1 + Integer.parseInt(var27[var18][var3]);
                                stackOut_39_0 = var19;
                                stackOut_39_1 = var13;
                                stackIn_32_0 = stackOut_39_0;
                                stackIn_32_1 = stackOut_39_1;
                                continue L16;
                              }
                            } else {
                              var16 = Integer.parseInt(var27[var15_int][var3]) + -1;
                              stackOut_36_0 = var16;
                              stackOut_36_1 = var13;
                              stackIn_32_0 = stackOut_36_0;
                              stackIn_32_1 = stackOut_36_1;
                              continue L16;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var2);
            stackOut_43_1 = new StringBuilder().append("hga.A(").append(param0).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L18;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L18;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_n = "Create your own free Jagex account";
        field_o = new String[2];
        field_o[0] = "Finish";
        field_o[1] = "Ignore Fall";
    }
}
