/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static int[] field_b;
    static int[] field_d;
    static int field_c;
    static bd field_a;

    public static void a(byte param0) {
        field_d = null;
        int var1 = 0 % ((param0 - -77) / 41);
        field_a = null;
        field_b = null;
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          if (param1 <= 0) {
            break L1;
          } else {
            if (param1 < 128) {
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param1 < 160) {
            break L2;
          } else {
            if (param1 > 255) {
              break L2;
            } else {
              return true;
            }
          }
        }
        L3: {
          if (param1 == 0) {
            break L3;
          } else {
            var6 = kh.field_hb;
            var2 = var6;
            var3 = 0;
            L4: while (true) {
              if (var3 >= var6.length) {
                break L3;
              } else {
                var4 = var6[var3];
                if (param1 == var4) {
                  return true;
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          }
        }
        return false;
    }

    final static int a(int param0, int param1, int param2, byte param3, byte[] param4, CharSequence param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        var6 = param0 - param2;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var7 >= var6) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var8 = param5.charAt(var7 + param2);
                      if (-1 <= (var8 ^ -1)) {
                        break L5;
                      } else {
                        if (128 > var8) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 < 160) {
                      break L3;
                    } else {
                      if (var8 > 255) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  param4[param1 - -var7] = (byte)var8;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (var8 != 8364) {
                    break L6;
                  } else {
                    param4[param1 - -var7] = (byte)-128;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var8 == 8218) {
                    break L7;
                  } else {
                    L8: {
                      if (var8 == 402) {
                        break L8;
                      } else {
                        L9: {
                          if (var8 == 8222) {
                            break L9;
                          } else {
                            L10: {
                              if (var8 != 8230) {
                                break L10;
                              } else {
                                param4[var7 + param1] = (byte)-123;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (8224 != var8) {
                                break L11;
                              } else {
                                param4[param1 - -var7] = (byte)-122;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (var8 == 8225) {
                                break L12;
                              } else {
                                L13: {
                                  if (var8 != 710) {
                                    break L13;
                                  } else {
                                    param4[param1 - -var7] = (byte)-120;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                L14: {
                                  if (8240 == var8) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (var8 == 352) {
                                        break L15;
                                      } else {
                                        L16: {
                                          if (var8 == 8249) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (var8 == 338) {
                                                break L17;
                                              } else {
                                                L18: {
                                                  if (var8 == 381) {
                                                    break L18;
                                                  } else {
                                                    L19: {
                                                      if (8216 != var8) {
                                                        break L19;
                                                      } else {
                                                        param4[var7 + param1] = (byte)-111;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    L20: {
                                                      if (8217 == var8) {
                                                        break L20;
                                                      } else {
                                                        L21: {
                                                          if (var8 == 8220) {
                                                            break L21;
                                                          } else {
                                                            L22: {
                                                              if (var8 != 8221) {
                                                                break L22;
                                                              } else {
                                                                param4[param1 - -var7] = (byte)-108;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L22;
                                                                }
                                                              }
                                                            }
                                                            L23: {
                                                              if (8226 != var8) {
                                                                break L23;
                                                              } else {
                                                                param4[var7 + param1] = (byte)-107;
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
                                                                param4[param1 - -var7] = (byte)-106;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            L25: {
                                                              if (8212 == var8) {
                                                                break L25;
                                                              } else {
                                                                L26: {
                                                                  if (var8 == 732) {
                                                                    break L26;
                                                                  } else {
                                                                    L27: {
                                                                      if (var8 != 8482) {
                                                                        break L27;
                                                                      } else {
                                                                        param4[var7 + param1] = (byte)-103;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L27;
                                                                        }
                                                                      }
                                                                    }
                                                                    L28: {
                                                                      if (353 == var8) {
                                                                        break L28;
                                                                      } else {
                                                                        L29: {
                                                                          if (var8 == 8250) {
                                                                            break L29;
                                                                          } else {
                                                                            L30: {
                                                                              if (var8 == 339) {
                                                                                break L30;
                                                                              } else {
                                                                                L31: {
                                                                                  if (var8 == 382) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    L32: {
                                                                                      if (var8 != 376) {
                                                                                        break L32;
                                                                                      } else {
                                                                                        param4[param1 - -var7] = (byte)-97;
                                                                                        if (0 == 0) {
                                                                                          break L2;
                                                                                        } else {
                                                                                          break L32;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    param4[param1 - -var7] = (byte)63;
                                                                                    if (0 == 0) {
                                                                                      break L2;
                                                                                    } else {
                                                                                      break L31;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                param4[param1 - -var7] = (byte)-98;
                                                                                if (0 == 0) {
                                                                                  break L2;
                                                                                } else {
                                                                                  break L30;
                                                                                }
                                                                              }
                                                                            }
                                                                            param4[var7 + param1] = (byte)-100;
                                                                            if (0 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L29;
                                                                            }
                                                                          }
                                                                        }
                                                                        param4[var7 + param1] = (byte)-101;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L28;
                                                                        }
                                                                      }
                                                                    }
                                                                    param4[param1 - -var7] = (byte)-102;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L26;
                                                                    }
                                                                  }
                                                                }
                                                                param4[var7 + param1] = (byte)-104;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              }
                                                            }
                                                            param4[param1 + var7] = (byte)-105;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L21;
                                                            }
                                                          }
                                                        }
                                                        param4[var7 + param1] = (byte)-109;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                    param4[param1 - -var7] = (byte)-110;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                param4[param1 + var7] = (byte)-114;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            param4[var7 + param1] = (byte)-116;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        param4[param1 + var7] = (byte)-117;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    param4[var7 + param1] = (byte)-118;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                param4[var7 + param1] = (byte)-119;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            param4[param1 - -var7] = (byte)-121;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param4[param1 + var7] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param4[var7 + param1] = (byte)-125;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L7;
                    }
                  }
                }
                param4[param1 - -var7] = (byte)-126;
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
          L33: {
            if (param3 == -125) {
              break L33;
            } else {
              var10 = null;
              int discarded$1 = j.a(-82, -13, -122, (byte) 122, (byte[]) null, (CharSequence) null);
              break L33;
            }
          }
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{1, 2, 5, 5, 10, 1, 1, 1, 1, 1, 1, 2, 3, 3, 5, 5, 10, 3, 10, 2, 5, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 5, 3, 1, 1, 2, 2, 2, 3, 3, 5, 10};
        field_b = new int[]{24, 27, 5};
        field_c = 0;
    }
}
