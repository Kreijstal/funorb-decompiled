/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String[] field_c;
    static int field_b;
    static int[] field_h;
    static gf field_f;
    static hv field_k;
    static String[] field_g;
    static String[] field_d;
    static String[][] field_e;
    static String[] field_j;
    static String[] field_a;
    static String[] field_i;

    public static void a(boolean param0) {
        field_a = null;
        field_f = null;
        field_j = null;
        field_c = null;
        field_h = null;
        field_k = null;
        field_i = null;
        field_e = null;
        if (param0) {
          return;
        } else {
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static byte[] a(CharSequence param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_67_0 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_67_0 = (byte[]) var3;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var5 = param0.charAt(var4);
                      if (var5 <= 0) {
                        break L4;
                      } else {
                        if (128 > var5) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var5 < 160) {
                        break L5;
                      } else {
                        if (var5 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var5 != 8364) {
                      if (8218 == var5) {
                        var3[var4] = (byte) -126;
                        break L2;
                      } else {
                        if (var5 == 402) {
                          var3[var4] = (byte) -125;
                          break L2;
                        } else {
                          if (var5 != 8222) {
                            if (var5 != 8230) {
                              if (var5 == 8224) {
                                var3[var4] = (byte) -122;
                                break L2;
                              } else {
                                if (8225 == var5) {
                                  var3[var4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var5 == 710) {
                                    var3[var4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (var5 == 352) {
                                        var3[var4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var5 != 8249) {
                                          if (338 != var5) {
                                            if (381 != var5) {
                                              if (var5 != 8216) {
                                                if (var5 != 8217) {
                                                  if (8220 == var5) {
                                                    var3[var4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var5 == 8211) {
                                                          var3[var4] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8212) {
                                                            var3[var4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 732) {
                                                              if (8482 == var5) {
                                                                var3[var4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 353) {
                                                                  if (var5 == 8250) {
                                                                    var3[var4] = (byte) -101;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 != 339) {
                                                                      if (var5 == 382) {
                                                                        var3[var4] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var5 != 376) {
                                                                          var3[var4] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          var3[var4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte) -102;
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte) -110;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte) -111;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte) -114;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          var3[var4] = (byte) -117;
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte) -123;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte) -124;
                            break L2;
                          }
                        }
                      }
                    } else {
                      var3[var4] = (byte) -128;
                      var4++;
                      break L2;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) var2;
            stackOut_69_1 = new StringBuilder().append("mb.A(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L6;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_72_0, stackIn_72_2 + 44 + 32 + 41);
        }
        return stackIn_68_0;
    }

    final static boolean a(boolean param0, int param1, int param2) {
        return (param2 & 65536) != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[16];
        field_b = -1;
        field_h = new int[1];
        field_f = new gf();
        field_k = new hv();
        field_g = new String[]{"<b>Upgrades", "At the end of each level, GyojiBot will reward you with Powerup Points. Assign points to Speed, Traction and Bounce to upgrade your Sumo Drone.", "Soup-up your speed for superior swiftness.", "Top up your traction for terrific tenacity.", "Boost your bounce to better bump baddies.", "Occasionally, GyojiBot will drop temporary upgrades into the arena. He hopes you will accept his generous gifts."};
        field_d = new String[]{"<b>Drones", "HyoujunBot", "He's eager to fight, but he has only normal eyesight. It is possible to hide from him.", "SuiminBot", "Wake him up with a bump. He's slower than HyoujunBot, but he has better traction.", "KosokuBot", "He's lighter than HyoujunBot, but faster, with very little traction."};
        field_j = new String[]{"<b>Drones", "BunkatBot", "On death, he splits into smaller versions of himself.", "SosakuBot", "With high traction and a very long sight range, he'll hunt you down from far away."};
        field_i = new String[]{"<b>Objective", "Force enemy Sumo Drones into the energy barrier surrounding the arena. Use obstacles to your advantage.", "GyojiBot bestows points multipliers upon those who destroy multiple drones quickly - but what GyojiBot giveth, GyojiBot also taketh away."};
        field_a = new String[]{"<b>Controls", "MOUSE CONTROLS: ", "Use your left mouse button to direct your drone.", "KEYBOARD CONTROLS: ", "Use the WASD keys to direct your drone. Use Space to deploy an Energy Blast when the red Recharge Meter is full.", "Do not bore GyojiBot by remaining in one place for too long. For this, he will destroy your drone.", "GyojiBot wants you to know that this hurts him more than it hurts you."};
        field_e = new String[5][];
    }
}
