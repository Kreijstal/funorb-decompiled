/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends ne {
    int field_r;
    static int field_t;
    static int field_q;
    int field_i;
    static String field_s;
    int field_n;
    static String field_m;
    int field_l;
    int field_o;
    static boolean field_k;
    static String field_j;
    int field_p;

    final static di a(ec param0, boolean param1) {
        di var2 = null;
        RuntimeException var2_ref = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        di stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new di();
            var2.a(param0, -1);
            stackOut_0_0 = (di) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("mm.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        field_s = null;
    }

    private mm() throws Throwable {
        throw new Error();
    }

    final static int a(CharSequence param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param2 < 2) {
                break L1;
              } else {
                if (param2 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L2: while (true) {
                    if (~var7 >= ~var8) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_41_0 = var6;
                        stackIn_42_0 = stackOut_41_0;
                        break L0;
                      }
                    } else {
                      L3: {
                        var9 = param0.charAt(var8);
                        if (var8 != 0) {
                          break L3;
                        } else {
                          if (45 != var9) {
                            if (var9 != 43) {
                              break L3;
                            } else {
                              if (param1) {
                                var8++;
                                var8++;
                                continue L2;
                              } else {
                                break L3;
                              }
                            }
                          } else {
                            var4_int = 1;
                            var8++;
                            var8++;
                            continue L2;
                          }
                        }
                      }
                      L4: {
                        L5: {
                          if (var9 < 48) {
                            break L5;
                          } else {
                            if (var9 > 57) {
                              break L5;
                            } else {
                              var9 -= 48;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (var9 < 65) {
                            break L6;
                          } else {
                            if (var9 <= 90) {
                              var9 -= 55;
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var9 < 97) {
                            break L7;
                          } else {
                            if (122 < var9) {
                              break L7;
                            } else {
                              var9 -= 87;
                              break L4;
                            }
                          }
                        }
                        throw new NumberFormatException();
                      }
                      if (~var9 <= ~param2) {
                        throw new NumberFormatException();
                      } else {
                        L8: {
                          if (var4_int != 0) {
                            var9 = -var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var10 = var9 + var6 * param2;
                        if (~(var10 / param2) == ~var6) {
                          var5 = 1;
                          var6 = var10;
                          var8++;
                          continue L2;
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("mm.B(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L9;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 44 + param2 + 44 + 3703 + 41);
        }
        return stackIn_42_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Venturing down from the northern mountains in search of food and combat, the goblin cleaver's wooden shield and hatchet will give a dungeon's lesser denziens cause to think.";
        field_s = "PLAN: ";
        field_j = "Highest: <col=DB0100><%0></col>";
        field_q = -1;
    }
}
