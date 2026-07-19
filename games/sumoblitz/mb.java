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
        field_e = (String[][]) null;
        if (param0) {
          return;
        } else {
          field_g = null;
          field_d = null;
          return;
        }
    }

    final static byte[] a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_97_0 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_96_0 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (param1 == 32) {
                break L1;
              } else {
                field_g = (String[]) null;
                break L1;
              }
            }
            var3 = new byte[var2_int];
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      L6: {
                        var5 = param0.charAt(var4);
                        if (var5 <= 0) {
                          break L6;
                        } else {
                          if (128 > var5) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var5 < 160) {
                          break L7;
                        } else {
                          if (var5 <= 255) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var5 != 8364) {
                          break L8;
                        } else {
                          var3[var4] = (byte)-128;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (8218 == var5) {
                          break L9;
                        } else {
                          L10: {
                            if (var5 == 402) {
                              break L10;
                            } else {
                              L11: {
                                if (var5 != 8222) {
                                  break L11;
                                } else {
                                  var3[var4] = (byte)-124;
                                  if (var6 == 0) {
                                    break L4;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var5 != 8230) {
                                  break L12;
                                } else {
                                  var3[var4] = (byte)-123;
                                  if (var6 == 0) {
                                    break L4;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if (var5 == 8224) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (8225 == var5) {
                                      break L14;
                                    } else {
                                      L15: {
                                        if (var5 == 710) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (var5 == 8240) {
                                              break L16;
                                            } else {
                                              L17: {
                                                if (var5 == 352) {
                                                  break L17;
                                                } else {
                                                  L18: {
                                                    if (var5 != 8249) {
                                                      break L18;
                                                    } else {
                                                      var3[var4] = (byte)-117;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  L19: {
                                                    if (338 != var5) {
                                                      break L19;
                                                    } else {
                                                      var3[var4] = (byte)-116;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  L20: {
                                                    if (381 != var5) {
                                                      break L20;
                                                    } else {
                                                      var3[var4] = (byte)-114;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (var5 != 8216) {
                                                      break L21;
                                                    } else {
                                                      var3[var4] = (byte)-111;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  L22: {
                                                    if (var5 != 8217) {
                                                      break L22;
                                                    } else {
                                                      var3[var4] = (byte)-110;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  L23: {
                                                    if (8220 == var5) {
                                                      break L23;
                                                    } else {
                                                      L24: {
                                                        if (var5 == 8221) {
                                                          break L24;
                                                        } else {
                                                          L25: {
                                                            if (var5 == 8226) {
                                                              break L25;
                                                            } else {
                                                              L26: {
                                                                if (var5 == 8211) {
                                                                  break L26;
                                                                } else {
                                                                  L27: {
                                                                    if (var5 == 8212) {
                                                                      break L27;
                                                                    } else {
                                                                      L28: {
                                                                        if (var5 != 732) {
                                                                          break L28;
                                                                        } else {
                                                                          var3[var4] = (byte)-104;
                                                                          if (var6 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L28;
                                                                          }
                                                                        }
                                                                      }
                                                                      L29: {
                                                                        if (8482 == var5) {
                                                                          break L29;
                                                                        } else {
                                                                          L30: {
                                                                            if (var5 != 353) {
                                                                              break L30;
                                                                            } else {
                                                                              var3[var4] = (byte)-102;
                                                                              if (var6 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L30;
                                                                              }
                                                                            }
                                                                          }
                                                                          L31: {
                                                                            if (var5 == 8250) {
                                                                              break L31;
                                                                            } else {
                                                                              L32: {
                                                                                if (var5 != 339) {
                                                                                  break L32;
                                                                                } else {
                                                                                  var3[var4] = (byte)-100;
                                                                                  if (var6 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L32;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L33: {
                                                                                if (var5 == 382) {
                                                                                  break L33;
                                                                                } else {
                                                                                  L34: {
                                                                                    if (var5 != 376) {
                                                                                      break L34;
                                                                                    } else {
                                                                                      var3[var4] = (byte)-97;
                                                                                      if (var6 == 0) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        break L34;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var3[var4] = (byte)63;
                                                                                  if (var6 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              var3[var4] = (byte)-98;
                                                                              if (var6 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          var3[var4] = (byte)-101;
                                                                          if (var6 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      var3[var4] = (byte)-103;
                                                                      if (var6 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  var3[var4] = (byte)-105;
                                                                  if (var6 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L26;
                                                                  }
                                                                }
                                                              }
                                                              var3[var4] = (byte)-106;
                                                              if (var6 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          var3[var4] = (byte)-107;
                                                          if (var6 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      var3[var4] = (byte)-108;
                                                      if (var6 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var3[var4] = (byte)-109;
                                                  if (var6 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              var3[var4] = (byte)-118;
                                              if (var6 == 0) {
                                                break L4;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          var3[var4] = (byte)-119;
                                          if (var6 == 0) {
                                            break L4;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      var3[var4] = (byte)-120;
                                      if (var6 == 0) {
                                        break L4;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var3[var4] = (byte)-121;
                                  if (var6 == 0) {
                                    break L4;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var3[var4] = (byte)-122;
                              if (var6 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var3[var4] = (byte)-125;
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var3[var4] = (byte)-126;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                    var3[var4] = (byte)var5;
                    break L4;
                  }
                  var4++;
                  if (var6 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_96_0 = (byte[]) (var3);
              stackIn_97_0 = stackOut_96_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var2 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var2);
            stackOut_98_1 = new StringBuilder().append("mb.A(");
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param0 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L35;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L35;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ',' + param1 + ')');
        }
        return stackIn_97_0;
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
            return false;
        }
        return -1 != (param2 & 65536 ^ -1) ? true : false;
    }

    static {
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
