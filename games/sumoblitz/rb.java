/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rb {
    static String[] field_d;
    static String field_c;
    static int field_b;
    static hr[] field_a;

    final static void a(int param0) {
        int incrementValue$1 = 0;
        RuntimeException var1 = null;
        double var1_double = 0.0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        var23 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != jg.field_b) {
                break L1;
              } else {
                jg.field_b = new int[65536];
                if (var23 == 0) {
                  L2: {
                    var1_double = 0.7 + (-0.015 + 0.03 * Math.random());
                    var3 = 0;
                    if (param0 == -129) {
                      break L2;
                    } else {
                      field_c = (String) null;
                      break L2;
                    }
                  }
                  var4 = 0;
                  L3: while (true) {
                    stackOut_7_0 = var4 ^ -1;
                    stackIn_8_0 = stackOut_7_0;
                    L4: while (true) {
                      L5: {
                        if (stackIn_8_0 <= -513) {
                          break L5;
                        } else {
                          var5 = (0.0078125f + (float)(var4 >> -591842621) / 64.0f) * 360.0f;
                          var6 = 0.0625f + (float)(var4 & 7) / 8.0f;
                          if (var23 == 0) {
                            var7 = 0;
                            L6: while (true) {
                              L7: {
                                if ((var7 ^ -1) <= -129) {
                                  break L7;
                                } else {
                                  var8 = (float)var7 / 128.0f;
                                  var9 = 0.0f;
                                  var10 = 0.0f;
                                  var11 = 0.0f;
                                  var12 = var5 / 60.0f;
                                  var13 = (int)var12;
                                  var14 = var13 % 6;
                                  var15 = var12 - (float)var13;
                                  var16 = (-var6 + 1.0f) * var8;
                                  var17 = (1.0f - var15 * var6) * var8;
                                  var18 = (-((1.0f - var15) * var6) + 1.0f) * var8;
                                  stackOut_13_0 = var14;
                                  stackIn_8_0 = stackOut_13_0;
                                  stackIn_14_0 = stackOut_13_0;
                                  if (var23 != 0) {
                                    continue L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_14_0 == 0) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (1 == var14) {
                                              break L10;
                                            } else {
                                              L11: {
                                                if ((var14 ^ -1) == -3) {
                                                  break L11;
                                                } else {
                                                  L12: {
                                                    if (var14 != 3) {
                                                      break L12;
                                                    } else {
                                                      var11 = var8;
                                                      var10 = var17;
                                                      var9 = var16;
                                                      if (var23 == 0) {
                                                        break L8;
                                                      } else {
                                                        break L12;
                                                      }
                                                    }
                                                  }
                                                  L13: {
                                                    if (var14 != 4) {
                                                      break L13;
                                                    } else {
                                                      var9 = var18;
                                                      var10 = var16;
                                                      var11 = var8;
                                                      if (var23 == 0) {
                                                        break L8;
                                                      } else {
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                  if (5 != var14) {
                                                    break L8;
                                                  } else {
                                                    var9 = var8;
                                                    var10 = var16;
                                                    var11 = var17;
                                                    if (var23 == 0) {
                                                      break L8;
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                              }
                                              var9 = var16;
                                              var10 = var8;
                                              var11 = var18;
                                              if (var23 == 0) {
                                                break L8;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var9 = var17;
                                          var10 = var8;
                                          var11 = var16;
                                          if (var23 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      var10 = var18;
                                      var9 = var8;
                                      var11 = var16;
                                      break L8;
                                    }
                                    var9 = (float)Math.pow((double)var9, var1_double);
                                    var10 = (float)Math.pow((double)var10, var1_double);
                                    var11 = (float)Math.pow((double)var11, var1_double);
                                    var19 = (int)(256.0f * var9);
                                    var20 = (int)(var10 * 256.0f);
                                    var21 = (int)(256.0f * var11);
                                    var22 = (var20 << -436219704) + (var19 << -1030549680) + (-16777216 - -var21);
                                    incrementValue$1 = var3;
                                    var3++;
                                    jg.field_b[incrementValue$1] = var22;
                                    var7++;
                                    if (var23 == 0) {
                                      continue L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var4++;
                              if (var23 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
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
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "rb.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract sg b(byte param0);

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -45) {
            field_b = -92;
        }
    }

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, boolean param1);

    static {
        field_c = null;
        field_b = 500;
        field_d = new String[]{"Speed Demon", "Get a Grip", "Bounce Master", "Survivalist", "By Skill Alone...", "Need for Speed", "Tractor Factor", "Ping Pong", "Trick Shot", "Detonator", "Sumo Master", "Pinball Wizard", "Manic Multiplier", "Variety", "Super Score", "Big Bursta", "Zapper", "Sparky", "Flashy", "The Blitz", "Peasy!", "Enough?", "Minuteman", "Hard Boiled", "5-a-day", "1 Minute Flat", "Scrambled", "300"};
    }
}
