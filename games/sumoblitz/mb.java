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

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0.length();
        if (param1 == 32) {
          L0: {
            var3 = new byte[var2];
            var4 = 0;
            if (var2 <= var4) {
              break L0;
            } else {
              L1: {
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
                      L6: {
                        if (8218 == var5) {
                          var3[var4] = (byte)-126;
                          break L6;
                        } else {
                          L7: {
                            if (var5 == 402) {
                              var3[var4] = (byte)-125;
                              break L7;
                            } else {
                              L8: {
                                L9: {
                                  L10: {
                                    L11: {
                                      L12: {
                                        L13: {
                                          L14: {
                                            L15: {
                                              L16: {
                                                L17: {
                                                  L18: {
                                                    L19: {
                                                      L20: {
                                                        L21: {
                                                          L22: {
                                                            L23: {
                                                              L24: {
                                                                L25: {
                                                                  L26: {
                                                                    L27: {
                                                                      L28: {
                                                                        L29: {
                                                                          L30: {
                                                                            L31: {
                                                                              if (var5 != 8222) {
                                                                                if (var5 != 8230) {
                                                                                  if (var5 == 8224) {
                                                                                    var3[var4] = (byte)-122;
                                                                                    break L8;
                                                                                  } else {
                                                                                    if (8225 == var5) {
                                                                                      var3[var4] = (byte)-121;
                                                                                      break L9;
                                                                                    } else {
                                                                                      if (var5 == 710) {
                                                                                        var3[var4] = (byte)-120;
                                                                                        break L10;
                                                                                      } else {
                                                                                        if (var5 == 8240) {
                                                                                          var3[var4] = (byte)-119;
                                                                                          break L11;
                                                                                        } else {
                                                                                          if (var5 == 352) {
                                                                                            var3[var4] = (byte)-118;
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (var5 != 8249) {
                                                                                              if (338 != var5) {
                                                                                                if (381 != var5) {
                                                                                                  if (var5 != 8216) {
                                                                                                    if (var5 != 8217) {
                                                                                                      if (8220 == var5) {
                                                                                                        var3[var4] = (byte)-109;
                                                                                                        break L13;
                                                                                                      } else {
                                                                                                        if (var5 == 8221) {
                                                                                                          var3[var4] = (byte)-108;
                                                                                                          break L14;
                                                                                                        } else {
                                                                                                          if (var5 == 8226) {
                                                                                                            var3[var4] = (byte)-107;
                                                                                                            break L15;
                                                                                                          } else {
                                                                                                            if (var5 == 8211) {
                                                                                                              var3[var4] = (byte)-106;
                                                                                                              break L16;
                                                                                                            } else {
                                                                                                              if (var5 == 8212) {
                                                                                                                var3[var4] = (byte)-105;
                                                                                                                break L17;
                                                                                                              } else {
                                                                                                                if (var5 != 732) {
                                                                                                                  if (8482 == var5) {
                                                                                                                    var3[var4] = (byte)-103;
                                                                                                                    break L18;
                                                                                                                  } else {
                                                                                                                    if (var5 != 353) {
                                                                                                                      if (var5 == 8250) {
                                                                                                                        var3[var4] = (byte)-101;
                                                                                                                        break L19;
                                                                                                                      } else {
                                                                                                                        if (var5 != 339) {
                                                                                                                          if (var5 == 382) {
                                                                                                                            var3[var4] = (byte)-98;
                                                                                                                            break L20;
                                                                                                                          } else {
                                                                                                                            if (var5 != 376) {
                                                                                                                              var3[var4] = (byte)63;
                                                                                                                              break L21;
                                                                                                                            } else {
                                                                                                                              var3[var4] = (byte)-97;
                                                                                                                              break L22;
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          var3[var4] = (byte)-100;
                                                                                                                          break L23;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      var3[var4] = (byte)-102;
                                                                                                                      break L24;
                                                                                                                    }
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  var3[var4] = (byte)-104;
                                                                                                                  break L25;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      var3[var4] = (byte)-110;
                                                                                                      break L26;
                                                                                                    }
                                                                                                  } else {
                                                                                                    var3[var4] = (byte)-111;
                                                                                                    break L27;
                                                                                                  }
                                                                                                } else {
                                                                                                  var3[var4] = (byte)-114;
                                                                                                  break L28;
                                                                                                }
                                                                                              } else {
                                                                                                var3[var4] = (byte)-116;
                                                                                                break L29;
                                                                                              }
                                                                                            } else {
                                                                                              var3[var4] = (byte)-117;
                                                                                              break L30;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  var3[var4] = (byte)-123;
                                                                                  break L31;
                                                                                }
                                                                              } else {
                                                                                var3[var4] = (byte)-124;
                                                                                var4++;
                                                                                break L31;
                                                                              }
                                                                            }
                                                                            var4++;
                                                                            break L30;
                                                                          }
                                                                          var4++;
                                                                          break L29;
                                                                        }
                                                                        var4++;
                                                                        break L28;
                                                                      }
                                                                      var4++;
                                                                      break L27;
                                                                    }
                                                                    var4++;
                                                                    break L26;
                                                                  }
                                                                  var4++;
                                                                  break L25;
                                                                }
                                                                var4++;
                                                                break L24;
                                                              }
                                                              var4++;
                                                              break L23;
                                                            }
                                                            var4++;
                                                            break L22;
                                                          }
                                                          var4++;
                                                          break L21;
                                                        }
                                                        var4++;
                                                        break L20;
                                                      }
                                                      var4++;
                                                      break L19;
                                                    }
                                                    var4++;
                                                    break L18;
                                                  }
                                                  var4++;
                                                  break L17;
                                                }
                                                var4++;
                                                break L16;
                                              }
                                              var4++;
                                              break L15;
                                            }
                                            var4++;
                                            break L14;
                                          }
                                          var4++;
                                          break L13;
                                        }
                                        var4++;
                                        break L12;
                                      }
                                      var4++;
                                      break L11;
                                    }
                                    var4++;
                                    break L10;
                                  }
                                  var4++;
                                  break L9;
                                }
                                var4++;
                                break L8;
                              }
                              var4++;
                              break L7;
                            }
                          }
                          var4++;
                          break L6;
                        }
                      }
                      var4++;
                      break L2;
                    } else {
                      var3[var4] = (byte)-128;
                      var4++;
                      break L1;
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L2;
                }
                var4++;
                break L1;
              }
              var4++;
              var4++;
              break L0;
            }
          }
          return var3;
        } else {
          field_g = null;
          var3 = new byte[var2];
          var4 = 0;
          L32: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              L33: {
                L34: {
                  L35: {
                    var5 = param0.charAt(var4);
                    if (var5 <= 0) {
                      break L35;
                    } else {
                      if (128 > var5) {
                        break L34;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if (var5 < 160) {
                      break L36;
                    } else {
                      if (var5 <= 255) {
                        break L34;
                      } else {
                        break L36;
                      }
                    }
                  }
                  if (var5 != 8364) {
                    if (8218 == var5) {
                      var3[var4] = (byte)-126;
                      break L33;
                    } else {
                      if (var5 == 402) {
                        var3[var4] = (byte)-125;
                        break L33;
                      } else {
                        if (var5 != 8222) {
                          if (var5 != 8230) {
                            if (var5 == 8224) {
                              var3[var4] = (byte)-122;
                              break L33;
                            } else {
                              if (8225 == var5) {
                                var3[var4] = (byte)-121;
                                break L33;
                              } else {
                                if (var5 == 710) {
                                  var3[var4] = (byte)-120;
                                  break L33;
                                } else {
                                  if (var5 == 8240) {
                                    var3[var4] = (byte)-119;
                                    break L33;
                                  } else {
                                    if (var5 == 352) {
                                      var3[var4] = (byte)-118;
                                      break L33;
                                    } else {
                                      if (var5 != 8249) {
                                        if (338 != var5) {
                                          if (381 != var5) {
                                            if (var5 != 8216) {
                                              if (var5 != 8217) {
                                                if (8220 == var5) {
                                                  var3[var4] = (byte)-109;
                                                  break L33;
                                                } else {
                                                  if (var5 == 8221) {
                                                    var3[var4] = (byte)-108;
                                                    break L33;
                                                  } else {
                                                    if (var5 == 8226) {
                                                      var3[var4] = (byte)-107;
                                                      break L33;
                                                    } else {
                                                      if (var5 == 8211) {
                                                        var3[var4] = (byte)-106;
                                                        break L33;
                                                      } else {
                                                        if (var5 == 8212) {
                                                          var3[var4] = (byte)-105;
                                                          break L33;
                                                        } else {
                                                          if (var5 != 732) {
                                                            if (8482 == var5) {
                                                              var3[var4] = (byte)-103;
                                                              break L33;
                                                            } else {
                                                              if (var5 != 353) {
                                                                if (var5 == 8250) {
                                                                  var3[var4] = (byte)-101;
                                                                  break L33;
                                                                } else {
                                                                  if (var5 != 339) {
                                                                    if (var5 == 382) {
                                                                      var3[var4] = (byte)-98;
                                                                      break L33;
                                                                    } else {
                                                                      if (var5 != 376) {
                                                                        var3[var4] = (byte)63;
                                                                        break L33;
                                                                      } else {
                                                                        var3[var4] = (byte)-97;
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-100;
                                                                    break L33;
                                                                  }
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-102;
                                                                break L33;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-104;
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-110;
                                                break L33;
                                              }
                                            } else {
                                              var3[var4] = (byte)-111;
                                              break L33;
                                            }
                                          } else {
                                            var3[var4] = (byte)-114;
                                            break L33;
                                          }
                                        } else {
                                          var3[var4] = (byte)-116;
                                          break L33;
                                        }
                                      } else {
                                        var3[var4] = (byte)-117;
                                        break L33;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var3[var4] = (byte)-123;
                            break L33;
                          }
                        } else {
                          var3[var4] = (byte)-124;
                          break L33;
                        }
                      }
                    }
                  } else {
                    var3[var4] = (byte)-128;
                    var4++;
                    break L33;
                  }
                }
                var3[var4] = (byte)var5;
                break L33;
              }
              var4++;
              continue L32;
            }
          }
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
            return false;
        }
        return -1 != (param2 & 65536 ^ -1) ? true : false;
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
