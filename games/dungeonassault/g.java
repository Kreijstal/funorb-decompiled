/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends ok {
    static int field_Hb;
    static cn field_Ib;
    static wh field_Lb;
    static cn[] field_Gb;
    static String field_Jb;
    static String field_Kb;

    final static cn a(cn param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        cn var22 = null;
        cn stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var21 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 != null) {
              if (param0.field_y != 0) {
                if (param0.field_v != 0) {
                  var22 = new cn(64, 48);
                  var3 = 0;
                  L1: while (true) {
                    if (48 <= var3) {
                      var22.field_A = 17;
                      stackOut_32_0 = (cn) var22;
                      stackIn_33_0 = stackOut_32_0;
                      break L0;
                    } else {
                      var4 = 0;
                      L2: while (true) {
                        if (var4 >= 64) {
                          var3++;
                          continue L1;
                        } else {
                          L3: {
                            var5 = (var4 * 3 - var3 * 4 << 4) / 6 + 256;
                            var6 = (4 * var3 + 3 * var4 << 4) / 6 - 256;
                            var7 = var5 >> 4;
                            var8 = var5 & 15;
                            var9 = var6 >> 4;
                            var10 = var6 & 15;
                            if (0 > var7) {
                              break L3;
                            } else {
                              if (var9 < 0) {
                                break L3;
                              } else {
                                if (var7 >= 32) {
                                  break L3;
                                } else {
                                  if (var9 < 32) {
                                    L4: {
                                      L5: {
                                        var11 = 32 * var9 - -var7;
                                        var12 = param0.field_B[var11];
                                        var13 = 16711935 & var12;
                                        var14 = var12 & 65280;
                                        if (0 >= var8) {
                                          break L5;
                                        } else {
                                          if (var7 >= 31) {
                                            break L5;
                                          } else {
                                            L6: {
                                              var15 = param0.field_B[var11 - -1];
                                              var16 = 16711935 & var15;
                                              var13 = (-var8 + 16) * var13 + var16 * var8;
                                              var17 = 65280 & var15;
                                              var14 = (-var8 + 16) * var14 - -(var17 * var8);
                                              var13 = var13 >> 4 & 16711935;
                                              var14 = (1044489 & var14) >> 4;
                                              if (0 >= var10) {
                                                break L6;
                                              } else {
                                                if (var9 < 31) {
                                                  var15 = param0.field_B[32 + var11];
                                                  var17 = 65280 & var15;
                                                  var16 = 16711935 & var15;
                                                  var18 = param0.field_B[33 + var11];
                                                  var19 = 16711935 & var18;
                                                  var20 = var18 & 65280;
                                                  var16 = (-var8 + 16) * var16 + var19 * var8;
                                                  var17 = var17 * (-var8 + 16) + var8 * var20;
                                                  var16 = (267390963 & var16) >> 4;
                                                  var13 = var10 * var16 + var13 * (16 - var10);
                                                  var17 = 65280 & var17 >> 4;
                                                  var13 = 16711935 & var13 >> 4;
                                                  var14 = var14 * (16 + -var10) - -(var17 * var10);
                                                  var14 = (1044481 & var14) >> 4;
                                                  break L6;
                                                } else {
                                                  var15 = var3 * 64 - -var4;
                                                  var22.field_B[var15] = mp.a(var14, var13);
                                                  var4++;
                                                  continue L2;
                                                }
                                              }
                                            }
                                            break L4;
                                          }
                                        }
                                      }
                                      if (var10 <= 0) {
                                        break L4;
                                      } else {
                                        if (var9 >= 31) {
                                          break L4;
                                        } else {
                                          var15 = param0.field_B[var11 - -32];
                                          var16 = 16711935 & var15;
                                          var13 = (16 - var10) * var13 - -(var16 * var10);
                                          var17 = var15 & 65280;
                                          var14 = (-var10 + 16) * var14 - -(var17 * var10);
                                          var13 = (267390970 & var13) >> 4;
                                          var14 = 65280 & var14 >> 4;
                                          break L4;
                                        }
                                      }
                                    }
                                    var15 = var3 * 64 - -var4;
                                    var22.field_B[var15] = mp.a(var14, var13);
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                          var4++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("g.D(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + -105 + ')');
        }
        return stackIn_33_0;
    }

    public static void g() {
        field_Jb = null;
        field_Kb = null;
        field_Gb = null;
        field_Lb = null;
        field_Ib = null;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        try {
            if (11 == kh.field_n) {
                to.b(113);
            }
            if (param1 != 18131) {
                field_Hb = -115;
            }
            kj.a(lj.field_e, u.field_O, -2958, lc.field_e);
            int discarded$0 = 0;
            ob.a(0, -102, param0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "g.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private g() throws Throwable {
        super(0L, (ok) null);
        throw new Error();
    }

    final static String a(boolean param0, boolean param1, byte param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        return oa.field_c[var4];
    }

    final static void a(int param0, ak param1) {
        wj var3 = null;
        int var4 = 0;
        try {
            var3 = ac.field_B;
            var3.d((byte) -118, 4);
            var3.field_o = var3.field_o + 1;
            var4 = var3.field_o;
            var3.a(6, 1);
            var3.a(6, param1.field_q);
            var3.a(6, param1.field_t);
            var3.a((byte) 63, param1.field_r);
            var3.a((byte) 63, param1.field_l);
            var3.a((byte) 63, param1.field_s);
            var3.a((byte) 63, param1.field_i);
            int discarded$0 = var3.c((byte) -106, var4);
            var3.c(var3.field_o - var4, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "g.B(" + 4 + ',' + (param1 != null ? "{...}" : "null") + ',' + 50 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "(Ready)";
        field_Kb = "Rabid Wolf";
    }
}
