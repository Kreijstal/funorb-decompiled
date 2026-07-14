/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu extends gn {
    static int field_i;
    static String field_e;
    static boolean field_j;
    static ut field_k;
    bc field_g;
    static boolean field_h;
    int field_f;

    final static boolean a(int param0, int param1, int param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (-4 == (param2 ^ -1)) {
          return mt.a((byte) -43);
        } else {
          L0: {
            var3 = "";
            var4 = 0;
            var5 = -71 / ((param0 - -58) / 61);
            if (-3 != param2) {
              if (-2 == param2) {
                var4 = 3;
                var3 = "goal_pipe";
                break L0;
              } else {
                L1: {
                  if (-1 == (param1 ^ -1)) {
                    var3 = "goal_park";
                    var4 = 6;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (1 != param1) {
                    break L2;
                  } else {
                    var4 = 5;
                    var3 = "goal_beach";
                    break L2;
                  }
                }
                if ((param1 ^ -1) == -3) {
                  var3 = "goal_street";
                  var4 = 4;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              var3 = "goal_rusty";
              var4 = 2;
              break L0;
            }
          }
          if (kc.field_g[var4] != null) {
            return true;
          } else {
            if (!bo.field_Cb.a("scenery", var3, (byte) -10)) {
              return false;
            } else {
              kc.field_g[var4] = bg.a("scenery", bo.field_Cb, (byte) 76, var3);
              return true;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -123) {
            Object var2 = null;
            int discarded$0 = iu.a(92, (CharSequence) null, 36, (byte[]) null, 126, 18);
        }
        field_k = null;
        field_e = null;
    }

    final static int a(int param0, CharSequence param1, int param2, byte[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        var6 = -param4 + param0;
        var7 = 0;
        if (param5 > 39) {
          L0: while (true) {
            L1: {
              if (var7 >= var6) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param1.charAt(var7 + param4);
                      if ((var8 ^ -1) >= -1) {
                        break L4;
                      } else {
                        if (128 > var8) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var8) {
                        break L5;
                      } else {
                        if (255 >= var8) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 == 8364) {
                        break L6;
                      } else {
                        L7: {
                          if (8218 != var8) {
                            break L7;
                          } else {
                            param3[var7 + param2] = (byte)-126;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (402 != var8) {
                            break L8;
                          } else {
                            param3[param2 + var7] = (byte)-125;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (var8 == 8222) {
                            break L9;
                          } else {
                            L10: {
                              if (var8 == 8230) {
                                break L10;
                              } else {
                                L11: {
                                  if (8224 == var8) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (var8 != 8225) {
                                        break L12;
                                      } else {
                                        param3[var7 + param2] = (byte)-121;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (710 == var8) {
                                        break L13;
                                      } else {
                                        L14: {
                                          if (var8 == 8240) {
                                            break L14;
                                          } else {
                                            L15: {
                                              if (var8 != 352) {
                                                break L15;
                                              } else {
                                                param3[var7 + param2] = (byte)-118;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            L16: {
                                              if (var8 != 8249) {
                                                break L16;
                                              } else {
                                                param3[var7 + param2] = (byte)-117;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            L17: {
                                              if (var8 != 338) {
                                                break L17;
                                              } else {
                                                param3[var7 + param2] = (byte)-116;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            L18: {
                                              if (var8 == 381) {
                                                break L18;
                                              } else {
                                                L19: {
                                                  if (var8 != 8216) {
                                                    break L19;
                                                  } else {
                                                    param3[param2 - -var7] = (byte)-111;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                                L20: {
                                                  if (var8 == 8217) {
                                                    break L20;
                                                  } else {
                                                    L21: {
                                                      if (var8 != 8220) {
                                                        break L21;
                                                      } else {
                                                        param3[param2 - -var7] = (byte)-109;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    L22: {
                                                      if (var8 == 8221) {
                                                        break L22;
                                                      } else {
                                                        L23: {
                                                          if (8226 != var8) {
                                                            break L23;
                                                          } else {
                                                            param3[param2 - -var7] = (byte)-107;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        L24: {
                                                          if (8211 != var8) {
                                                            break L24;
                                                          } else {
                                                            param3[param2 - -var7] = (byte)-106;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L24;
                                                            }
                                                          }
                                                        }
                                                        L25: {
                                                          if (var8 == 8212) {
                                                            break L25;
                                                          } else {
                                                            L26: {
                                                              if (var8 != 732) {
                                                                break L26;
                                                              } else {
                                                                param3[param2 - -var7] = (byte)-104;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                            L27: {
                                                              if (var8 != 8482) {
                                                                break L27;
                                                              } else {
                                                                param3[var7 + param2] = (byte)-103;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L27;
                                                                }
                                                              }
                                                            }
                                                            L28: {
                                                              if (353 != var8) {
                                                                break L28;
                                                              } else {
                                                                param3[var7 + param2] = (byte)-102;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L28;
                                                                }
                                                              }
                                                            }
                                                            L29: {
                                                              if (8250 == var8) {
                                                                break L29;
                                                              } else {
                                                                L30: {
                                                                  if (var8 == 339) {
                                                                    break L30;
                                                                  } else {
                                                                    L31: {
                                                                      if (var8 != 382) {
                                                                        break L31;
                                                                      } else {
                                                                        param3[param2 - -var7] = (byte)-98;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    L32: {
                                                                      if (var8 != 376) {
                                                                        break L32;
                                                                      } else {
                                                                        param3[var7 + param2] = (byte)-97;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L32;
                                                                        }
                                                                      }
                                                                    }
                                                                    param3[var7 + param2] = (byte)63;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                }
                                                                param3[var7 + param2] = (byte)-100;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            param3[var7 + param2] = (byte)-101;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                        param3[var7 + param2] = (byte)-105;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    param3[param2 + var7] = (byte)-108;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                param3[param2 + var7] = (byte)-110;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            param3[param2 + var7] = (byte)-114;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        param3[param2 + var7] = (byte)-119;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    param3[var7 + param2] = (byte)-120;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                param3[var7 + param2] = (byte)-122;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param3[var7 + param2] = (byte)-123;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param3[var7 + param2] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    param3[var7 + param2] = (byte)-128;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  param3[param2 + var7] = (byte)var8;
                  break L2;
                }
                var7++;
                if (0 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var6;
          }
        } else {
          return 23;
        }
    }

    final static void a(int param0, int param1) {
        int discarded$0 = hg.g(-88);
        int var2 = -23 / ((param0 - -81) / 34);
    }

    iu(bc param0, int param1) {
        ((iu) this).field_f = param1;
        ((iu) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> has declined the invitation.";
    }
}
