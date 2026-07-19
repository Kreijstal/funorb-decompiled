/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static gu field_e;
    static String[] field_a;
    static String[] field_c;
    static je field_d;
    static bi field_b;

    public static void b(int param0) {
        if (param0 != 256) {
          field_d = (je) null;
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != 25213) {
            return -16;
        }
        return ms.field_r;
    }

    final static int a(int param0, int param1) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != 0) {
          if (0 > param0) {
            throw new IllegalArgumentException("");
          } else {
            if (32768 > param0) {
              L0: {
                L1: {
                  if ((param0 ^ -1) > -129) {
                    break L1;
                  } else {
                    if (param0 < 2048) {
                      if (512 > param0) {
                        var2 = 4;
                        if (var3 != 0) {
                          var2 = 3;
                          if (var3 != 0) {
                            L2: {
                              if (8192 <= param0) {
                                break L2;
                              } else {
                                var2 = 2;
                                if (var3 == 0) {
                                  break L0;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            var2 = 1;
                            if (var3 == 0) {
                              break L0;
                            } else {
                              break L1;
                            }
                          } else {
                            param0 = param0 << (var2 << -1951374751);
                            return jn.field_f[param0 - 32768] >> var2;
                          }
                        } else {
                          param0 = param0 << (var2 << -1951374751);
                          return jn.field_f[param0 - 32768] >> var2;
                        }
                      } else {
                        var2 = 3;
                        if (var3 != 0) {
                          L3: {
                            L4: {
                              if (8192 <= param0) {
                                break L4;
                              } else {
                                var2 = 2;
                                if (var3 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var2 = 1;
                            if (var3 == 0) {
                              break L3;
                            } else {
                              L5: {
                                if (-9 >= (param0 ^ -1)) {
                                  break L5;
                                } else {
                                  if (-3 >= (param0 ^ -1)) {
                                    var2 = 7;
                                    if (var3 == 0) {
                                      break L3;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    return 256;
                                  }
                                }
                              }
                              L6: {
                                if (param0 < 32) {
                                  break L6;
                                } else {
                                  var2 = 5;
                                  if (var3 == 0) {
                                    break L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var2 = 6;
                              break L3;
                            }
                          }
                          param0 = param0 << (var2 << -1951374751);
                          return jn.field_f[param0 - 32768] >> var2;
                        } else {
                          param0 = param0 << (var2 << -1951374751);
                          return jn.field_f[param0 - 32768] >> var2;
                        }
                      }
                    } else {
                      if (8192 > param0) {
                        var2 = 2;
                        if (var3 == 0) {
                          param0 = param0 << (var2 << -1951374751);
                          return jn.field_f[param0 - 32768] >> var2;
                        } else {
                          var2 = 1;
                          if (var3 != 0) {
                            L7: {
                              L8: {
                                if (-9 >= (param0 ^ -1)) {
                                  break L8;
                                } else {
                                  if (-3 >= (param0 ^ -1)) {
                                    var2 = 7;
                                    if (var3 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    return 256;
                                  }
                                }
                              }
                              L9: {
                                if (param0 < 32) {
                                  break L9;
                                } else {
                                  var2 = 5;
                                  if (var3 == 0) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var2 = 6;
                              break L7;
                            }
                            param0 = param0 << (var2 << -1951374751);
                            return jn.field_f[param0 - 32768] >> var2;
                          } else {
                            param0 = param0 << (var2 << -1951374751);
                            return jn.field_f[param0 - 32768] >> var2;
                          }
                        }
                      } else {
                        var2 = 1;
                        if (var3 != 0) {
                          if (-9 < (param0 ^ -1)) {
                            if (-3 < (param0 ^ -1)) {
                              return 256;
                            } else {
                              L10: {
                                var2 = 7;
                                if (var3 == 0) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (param0 < 32) {
                                      break L11;
                                    } else {
                                      var2 = 5;
                                      break L11;
                                    }
                                  }
                                  var2 = 6;
                                  break L10;
                                }
                              }
                              param0 = param0 << (var2 << -1951374751);
                              return jn.field_f[param0 - 32768] >> var2;
                            }
                          } else {
                            L12: {
                              L13: {
                                if (param0 < 32) {
                                  break L13;
                                } else {
                                  var2 = 5;
                                  if (var3 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var2 = 6;
                              break L12;
                            }
                            param0 = param0 << (var2 << -1951374751);
                            return jn.field_f[param0 - 32768] >> var2;
                          }
                        } else {
                          param0 = param0 << (var2 << -1951374751);
                          return jn.field_f[param0 - 32768] >> var2;
                        }
                      }
                    }
                  }
                }
                L14: {
                  if (-9 >= (param0 ^ -1)) {
                    break L14;
                  } else {
                    if (-3 >= (param0 ^ -1)) {
                      var2 = 7;
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L14;
                      }
                    } else {
                      return 256;
                    }
                  }
                }
                L15: {
                  if (param0 < 32) {
                    break L15;
                  } else {
                    var2 = 5;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L15;
                    }
                  }
                }
                var2 = 6;
                break L0;
              }
              param0 = param0 << (var2 << -1951374751);
              return jn.field_f[param0 - 32768] >> var2;
            } else {
              if ((param0 ^ -1) > -131073) {
                if (param1 == -129) {
                  return jn.field_f[-32768 + param0];
                } else {
                  discarded$1 = so.a(105);
                  return jn.field_f[-32768 + param0];
                }
              } else {
                L16: {
                  L17: {
                    if (33554432 <= param0) {
                      break L17;
                    } else {
                      L18: {
                        if (param0 >= 2097152) {
                          break L18;
                        } else {
                          L19: {
                            if ((param0 ^ -1) <= -524289) {
                              break L19;
                            } else {
                              var2 = 1;
                              if (var3 == 0) {
                                break L16;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var2 = 2;
                          if (var3 == 0) {
                            break L16;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L20: {
                        if ((param0 ^ -1) > -8388609) {
                          break L20;
                        } else {
                          var2 = 4;
                          if (var3 == 0) {
                            break L16;
                          } else {
                            break L20;
                          }
                        }
                      }
                      var2 = 3;
                      if (var3 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L21: {
                    if ((param0 ^ -1) > -536870913) {
                      break L21;
                    } else {
                      var2 = 7;
                      if (var3 == 0) {
                        break L16;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (-134217729 >= (param0 ^ -1)) {
                      break L22;
                    } else {
                      var2 = 5;
                      if (var3 == 0) {
                        break L16;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var2 = 6;
                  break L16;
                }
                param0 = param0 >> (var2 << 2392993);
                return jn.field_f[param0 - 32768] << var2;
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        field_e = new gu();
        field_a = new String[]{"Good Learner", "Dawn of Battle", "First Blood", "Saradomin Be With You", "Strength Through Chaos", "Fist of Guthix", "Light of 1,000 Crystals", "Big High War God", "Tumeken Rises This Morn", "Tactically Agnostic", "Bulletproof Monk", "Thinking with Portals", "Armageddon", "Army of Bones", "Got To Get Them All", "Dragonslayer", "Immortal", "Fear of Flying", "Warmonger", "Warlord", "Warmaster", "Tactically Atheistic", "Hail to the Chief", "Fragmentation", "Apocalypse", "Agree to Disagree", "Team Player", "My Sphinx, Therefore, I Can", "Sole Survivor", "Dead Weight", "Multi Faith Society", "Share and Enjoy", "Monster Feast", "Peril of the Plains", "Sire of the Sands", "Wrath of Winter", "Master of the Marshes", "Dread of Destruction", "Zamorak's Supremacy", "Zamorak's Silver", "Zamorak's Gold", "Plucking Feathers", "Push to the East", "Zarosian Purge", "Run, Dwarves, Escape!", "Saradomin's Silver", "Saradomin's Gold", "Peddewa Sieged", "The Brothers March", "Zaros Surrounded", "Beep, Beep", "Guthix's Silver", "Guthix's Gold", "Take a Chair", "Scarecrow", "Twilight of the Gods"};
        field_c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
