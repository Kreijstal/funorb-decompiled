/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class hi {
    static boolean field_a;
    static String field_b;

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        field_b = null;
    }

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_41_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            var9 = Main.field_T;
            var5 = param1.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                    break L2;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L2;
                    } else {
                      if ((param3 ^ -1) > -1) {
                        break L1;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    }
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (-1 >= (var7_int ^ -1)) {
                      break L1;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (-1 >= (var7_int ^ -1)) {
                      if (param0 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L6;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L5;
                  } else {
                    if (param2 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L7: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (param3 <= 0) {
                    break L7;
                  } else {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                    break L7;
                  }
                }
                L8: {
                  if (param0 == null) {
                    break L8;
                  } else {
                    if (param0.length() <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param0);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param2 == null) {
                    break L9;
                  } else {
                    if ((param2.length() ^ -1) < -1) {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param2);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (var5.length() > var6) {
                    StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L10;
                  }
                }
                if (param4 == 353) {
                  try {
                    L11: {
                      stackOut_40_0 = new java.net.URL(param1, var7.toString());
                      stackIn_41_0 = stackOut_40_0;
                      break L11;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var8 = (Exception) (Object) decompiledCaughtException;
                    var8.printStackTrace();
                    return param1;
                  }
                  return stackIn_41_0;
                } else {
                  return null;
                }
              }
              var6 = var7_int;
              continue L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        L0: {
          var3 = Main.field_T;
          Main.field_G = Main.field_G + 1;
          if (0 != (ca.field_a ^ -1)) {
            break L0;
          } else {
            if ((ug.field_h ^ -1) != 0) {
              break L0;
            } else {
              ca.field_a = eg.field_b;
              ug.field_h = ij.field_e;
              break L0;
            }
          }
        }
        L1: {
          if (param0 != null) {
            if (!param0.equals((Object) (Object) t.field_e)) {
              L2: {
                if (!k.field_b) {
                  if (Main.field_G >= ek.field_e) {
                    if (ek.field_e - -ra.field_e > Main.field_G) {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    } else {
                      stackOut_24_0 = 0;
                      stackIn_27_0 = stackOut_24_0;
                      break L2;
                    }
                  } else {
                    stackOut_22_0 = 0;
                    stackIn_27_0 = stackOut_22_0;
                    break L2;
                  }
                } else {
                  stackOut_20_0 = 0;
                  stackIn_27_0 = stackOut_20_0;
                  break L2;
                }
              }
              L3: {
                var2 = stackIn_27_0;
                if (param0 != null) {
                  if (!k.field_b) {
                    if (var2 == 0) {
                      Main.field_G = 0;
                      break L3;
                    } else {
                      Main.field_G = ek.field_e;
                      break L3;
                    }
                  } else {
                    Main.field_G = ek.field_e;
                    break L3;
                  }
                } else {
                  Main.field_G = 0;
                  break L3;
                }
              }
              L4: {
                ti.field_a = ug.field_h;
                p.field_k = ca.field_a;
                if (param0 == null) {
                  if (var2 != 0) {
                    k.field_b = true;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  k.field_b = false;
                  break L4;
                }
              }
              t.field_e = param0;
              if (k.field_b) {
                break L1;
              } else {
                if (ek.field_e <= Main.field_G) {
                  break L1;
                } else {
                  if (!d.field_s) {
                    break L1;
                  } else {
                    ti.field_a = ug.field_h;
                    Main.field_G = 0;
                    p.field_k = ca.field_a;
                    break L1;
                  }
                }
              }
            } else {
              t.field_e = param0;
              if (k.field_b) {
                break L1;
              } else {
                if (ek.field_e <= Main.field_G) {
                  break L1;
                } else {
                  if (!d.field_s) {
                    break L1;
                  } else {
                    ti.field_a = ug.field_h;
                    Main.field_G = 0;
                    p.field_k = ca.field_a;
                    break L1;
                  }
                }
              }
            }
          } else {
            if (t.field_e == null) {
              t.field_e = param0;
              if (k.field_b) {
                break L1;
              } else {
                if (ek.field_e <= Main.field_G) {
                  break L1;
                } else {
                  if (!d.field_s) {
                    break L1;
                  } else {
                    ti.field_a = ug.field_h;
                    Main.field_G = 0;
                    p.field_k = ca.field_a;
                    break L1;
                  }
                }
              }
            } else {
              t.field_e = param0;
              if (k.field_b) {
                break L1;
              } else {
                if (ek.field_e <= Main.field_G) {
                  break L1;
                } else {
                  if (!d.field_s) {
                    break L1;
                  } else {
                    ti.field_a = ug.field_h;
                    Main.field_G = 0;
                    p.field_k = ca.field_a;
                    break L1;
                  }
                }
              }
            }
          }
        }
        L5: {
          ca.field_a = -1;
          ug.field_h = -1;
          if (!k.field_b) {
            break L5;
          } else {
            if (id.field_b != Main.field_G) {
              break L5;
            } else {
              Main.field_G = 0;
              k.field_b = false;
              break L5;
            }
          }
        }
        L6: {
          if (param1 < -32) {
            break L6;
          } else {
            field_a = true;
            break L6;
          }
        }
    }

    final static int a(int param0, int param1, byte[] param2, CharSequence param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Main.field_T;
        var6 = -param1 + param0;
        var7 = 0;
        L0: while (true) {
          L1: {
            if (var6 <= var7) {
              break L1;
            } else {
              L2: {
                L3: {
                  L4: {
                    var8 = param3.charAt(param1 + var7);
                    if ((var8 ^ -1) >= -1) {
                      break L4;
                    } else {
                      if (var8 < 128) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var8 < 160) {
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
                    if (var8 != 8364) {
                      break L6;
                    } else {
                      param2[param4 + var7] = (byte)-128;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (8218 != var8) {
                      break L7;
                    } else {
                      param2[param4 - -var7] = (byte)-126;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var8 != 402) {
                      break L8;
                    } else {
                      param2[param4 + var7] = (byte)-125;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var8 != 8222) {
                      break L9;
                    } else {
                      param2[param4 - -var7] = (byte)-124;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var8 == 8230) {
                      break L10;
                    } else {
                      L11: {
                        if (var8 != 8224) {
                          break L11;
                        } else {
                          param2[var7 + param4] = (byte)-122;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L12: {
                        if (8225 != var8) {
                          break L12;
                        } else {
                          param2[var7 + param4] = (byte)-121;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (var8 != 710) {
                          break L13;
                        } else {
                          param2[param4 + var7] = (byte)-120;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (var8 != 8240) {
                          break L14;
                        } else {
                          param2[param4 - -var7] = (byte)-119;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (var8 == 352) {
                          break L15;
                        } else {
                          L16: {
                            if (var8 != 8249) {
                              break L16;
                            } else {
                              param2[param4 - -var7] = (byte)-117;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (var8 == 338) {
                              break L17;
                            } else {
                              L18: {
                                if (var8 == 381) {
                                  break L18;
                                } else {
                                  L19: {
                                    if (var8 != 8216) {
                                      break L19;
                                    } else {
                                      param2[var7 + param4] = (byte)-111;
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
                                        if (var8 == 8220) {
                                          break L21;
                                        } else {
                                          L22: {
                                            if (var8 != 8221) {
                                              break L22;
                                            } else {
                                              param2[param4 - -var7] = (byte)-108;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          L23: {
                                            if (var8 == 8226) {
                                              break L23;
                                            } else {
                                              L24: {
                                                if (var8 != 8211) {
                                                  break L24;
                                                } else {
                                                  param2[var7 + param4] = (byte)-106;
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
                                                    if (732 != var8) {
                                                      break L26;
                                                    } else {
                                                      param2[param4 - -var7] = (byte)-104;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                  }
                                                  L27: {
                                                    if (var8 == 8482) {
                                                      break L27;
                                                    } else {
                                                      L28: {
                                                        if (var8 != 353) {
                                                          break L28;
                                                        } else {
                                                          param2[param4 + var7] = (byte)-102;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      L29: {
                                                        if (8250 != var8) {
                                                          break L29;
                                                        } else {
                                                          param2[param4 + var7] = (byte)-101;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L29;
                                                          }
                                                        }
                                                      }
                                                      L30: {
                                                        if (var8 == 339) {
                                                          break L30;
                                                        } else {
                                                          L31: {
                                                            if (var8 != 382) {
                                                              break L31;
                                                            } else {
                                                              param2[var7 + param4] = (byte)-98;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L31;
                                                              }
                                                            }
                                                          }
                                                          L32: {
                                                            if (var8 == 376) {
                                                              break L32;
                                                            } else {
                                                              param2[param4 + var7] = (byte)63;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L32;
                                                              }
                                                            }
                                                          }
                                                          param2[var7 + param4] = (byte)-97;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                      }
                                                      param2[var7 + param4] = (byte)-100;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                  }
                                                  param2[var7 + param4] = (byte)-103;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L25;
                                                  }
                                                }
                                              }
                                              param2[param4 + var7] = (byte)-105;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          param2[param4 - -var7] = (byte)-107;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      param2[var7 + param4] = (byte)-109;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  param2[param4 + var7] = (byte)-110;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              param2[var7 + param4] = (byte)-114;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L17;
                              }
                            }
                          }
                          param2[param4 + var7] = (byte)-116;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L15;
                          }
                        }
                      }
                      param2[var7 + param4] = (byte)-118;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L10;
                      }
                    }
                  }
                  param2[param4 - -var7] = (byte)-123;
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                param2[var7 + param4] = (byte)var8;
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
          if (!param5) {
            return var6;
          } else {
            return 14;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static boolean a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        var2 = param1;
        L0: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!cf.a((byte) 112, (char) var3)) {
              if (!Main.a(param1 ^ -49, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
