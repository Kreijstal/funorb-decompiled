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

    final static cn a(cn param0, byte param1) {
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
        cn stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
                      L2: {
                        if (param1 == -105) {
                          break L2;
                        } else {
                          field_Hb = -114;
                          break L2;
                        }
                      }
                      var22.field_A = 17;
                      stackOut_34_0 = (cn) (var22);
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    } else {
                      var4 = 0;
                      L3: while (true) {
                        if ((var4 ^ -1) <= -65) {
                          var3++;
                          continue L1;
                        } else {
                          var5 = (var4 * 3 - var3 * 4 << -1071213564) / 6 + 256;
                          var6 = (4 * var3 + 3 * var4 << -1035870044) / 6 - 256;
                          var7 = var5 >> 54488420;
                          var8 = var5 & 15;
                          var9 = var6 >> -1244924348;
                          var10 = var6 & 15;
                          if (0 <= var7) {
                            if (-1 >= (var9 ^ -1)) {
                              if (-33 < (var7 ^ -1)) {
                                L4: {
                                  if ((var9 ^ -1) > -33) {
                                    L5: {
                                      L6: {
                                        var11 = 32 * var9 - -var7;
                                        var12 = param0.field_B[var11];
                                        var13 = 16711935 & var12;
                                        var14 = var12 & 65280;
                                        if (0 >= var8) {
                                          break L6;
                                        } else {
                                          if ((var7 ^ -1) <= -32) {
                                            break L6;
                                          } else {
                                            var15 = param0.field_B[var11 - -1];
                                            var16 = 16711935 & var15;
                                            var13 = (-var8 + 16) * var13 + var16 * var8;
                                            var17 = 65280 & var15;
                                            var14 = (-var8 + 16) * var14 - -(var17 * var8);
                                            var13 = var13 >> 2077525924 & 16711935;
                                            var14 = (1044489 & var14) >> 1685679940;
                                            if (0 >= var10) {
                                              break L5;
                                            } else {
                                              if (-32 < (var9 ^ -1)) {
                                                var15 = param0.field_B[32 + var11];
                                                var17 = 65280 & var15;
                                                var16 = 16711935 & var15;
                                                var18 = param0.field_B[33 + var11];
                                                var19 = 16711935 & var18;
                                                var20 = var18 & 65280;
                                                var16 = (-var8 + 16) * var16 + var19 * var8;
                                                var17 = var17 * (-var8 + 16) + var8 * var20;
                                                var16 = (267390963 & var16) >> -807443100;
                                                var13 = var10 * var16 + var13 * (16 - var10);
                                                var17 = 65280 & var17 >> -92810236;
                                                var13 = 16711935 & var13 >> 1667785924;
                                                var14 = var14 * (16 + -var10) - -(var17 * var10);
                                                var14 = (1044481 & var14) >> -262438908;
                                                break L5;
                                              } else {
                                                var15 = var3 * 64 - -var4;
                                                var22.field_B[var15] = mp.a(var14, var13);
                                                var4++;
                                                continue L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (-1 <= (var10 ^ -1)) {
                                        break L5;
                                      } else {
                                        if (-32 >= (var9 ^ -1)) {
                                          break L5;
                                        } else {
                                          var15 = param0.field_B[var11 - -32];
                                          var16 = 16711935 & var15;
                                          var13 = (16 - var10) * var13 - -(var16 * var10);
                                          var17 = var15 & 65280;
                                          var14 = (-var10 + 16) * var14 - -(var17 * var10);
                                          var13 = (267390970 & var13) >> -1102136988;
                                          var14 = 65280 & var14 >> -598654012;
                                          break L5;
                                        }
                                      }
                                    }
                                    var15 = var3 * 64 - -var4;
                                    var22.field_B[var15] = mp.a(var14, var13);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                                var4++;
                                continue L3;
                              } else {
                                var4++;
                                continue L3;
                              }
                            } else {
                              var4++;
                              continue L3;
                            }
                          } else {
                            var4++;
                            continue L3;
                          }
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
            stackOut_36_0 = (RuntimeException) (var2);
            stackOut_36_1 = new StringBuilder().append("g.D(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L7;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        return stackIn_35_0;
    }

    public static void g(int param0) {
        field_Jb = null;
        field_Kb = null;
        field_Gb = null;
        field_Lb = null;
        if (param0 > -4) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            g.a((java.awt.Canvas) null, -103);
        }
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
            ob.a(0, -102, param0, 0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "g.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        if (param1) {
            var4 += 2;
        }
        if (param2 > -104) {
            return (String) null;
        }
        if (!(!param0)) {
            var4++;
        }
        return oa.field_c[var4];
    }

    final static void a(int param0, ak param1, byte param2) {
        wj var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = ac.field_B;
            var5.d((byte) -118, param0);
            var5.field_o = var5.field_o + 1;
            var4 = var5.field_o;
            var5.a(6, 1);
            var5.a(6, param1.field_q);
            var5.a(6, param1.field_t);
            var5.a((byte) 63, param1.field_r);
            var5.a((byte) 63, param1.field_l);
            if (param2 != 50) {
                field_Ib = (cn) null;
            }
            var5.a((byte) 63, param1.field_s);
            var5.a((byte) 63, param1.field_i);
            discarded$0 = var5.c((byte) -106, var4);
            var5.c(var5.field_o - var4, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "g.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Jb = "(Ready)";
        field_Kb = "Rabid Wolf";
    }
}
