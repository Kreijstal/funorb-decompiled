/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static aj field_b;
    static String[] field_a;
    static boolean field_c;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        nl var4 = null;
        if (param1 != -74) {
            return null;
        }
        if (param0 == null) {
            return null;
        }
        if (param0 instanceof byte[]) {
            var3 = (byte[]) param0;
            if (!param2) {
                return var3;
            }
            return ld.a(120, var3);
        }
        if (!(!(param0 instanceof nl))) {
            var4 = (nl) param0;
            return var4.a((byte) -121);
        }
        throw new IllegalArgumentException();
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 > -107) {
            field_a = null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = Lexicominos.field_L ? 1 : 0;
        if (param0 > param1) {
          L0: {
            if (param3 <= -73) {
              break L0;
            } else {
              field_b = null;
              break L0;
            }
          }
          if (1 + param1 >= param6) {
            return;
          } else {
            L1: {
              if (5 + param1 >= param6) {
                break L1;
              } else {
                if (param5 != param4) {
                  var7 = (param5 >> 10292033) + (param4 >> -535788159) + (1 & (param5 & param4));
                  var8 = param1;
                  var9 = param4;
                  var10 = param5;
                  var11 = param1;
                  L2: while (true) {
                    if (param6 <= var11) {
                      nl.a(param0, param1, param2, -86, param4, var9, var8);
                      nl.a(param0, var8, param2, -122, var10, param5, param6);
                      return;
                    } else {
                      L3: {
                        var12 = ff.field_a[var11];
                        if (param2) {
                          stackOut_24_0 = we.field_g[var12];
                          stackIn_25_0 = stackOut_24_0;
                          break L3;
                        } else {
                          stackOut_23_0 = oj.field_j[var12];
                          stackIn_25_0 = stackOut_23_0;
                          break L3;
                        }
                      }
                      var13 = stackIn_25_0;
                      if (var13 <= var7) {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      } else {
                        ff.field_a[var11] = ff.field_a[var8];
                        var8++;
                        ff.field_a[var8] = var12;
                        if (var13 < var9) {
                          var9 = var13;
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            var7 = param6 + -1;
            L4: while (true) {
              if (param1 >= var7) {
                return;
              } else {
                var8 = param1;
                L5: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L4;
                  } else {
                    var9 = ff.field_a[var8];
                    var10 = ff.field_a[1 + var8];
                    if (cb.a((byte) 63, param2, var10, var9)) {
                      ff.field_a[var8] = var10;
                      ff.field_a[1 + var8] = var9;
                      var8++;
                      continue L5;
                    } else {
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          bk.field_c = c.field_o;
          if (param1 == -6258) {
            break L0;
          } else {
            field_c = true;
            break L0;
          }
        }
        L1: {
          if (param0 == -256) {
            L2: {
              if ((cg.field_l ^ -1) <= -14) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            li.field_T = mc.b(stackIn_10_0 != 0, param1 ^ -6168);
            break L1;
          } else {
            L3: {
              if (-101 > param0) {
                break L3;
              } else {
                if (param0 > 105) {
                  break L3;
                } else {
                  li.field_T = oe.a(124, param3);
                  break L1;
                }
              }
            }
            li.field_T = wi.a(param0, (byte) -65, param2);
            break L1;
          }
        }
    }

    abstract byte[] a(byte param0);

    abstract void a(byte[] param0, boolean param1);

    final static int a(int param0, int param1, byte param2, byte[] param3, CharSequence param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Lexicominos.field_L ? 1 : 0;
          if (param2 < -79) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        var6 = -param1 + param0;
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var6 <= var7) {
              break L2;
            } else {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      var8 = param4.charAt(param1 + var7);
                      if ((var8 ^ -1) >= -1) {
                        break L6;
                      } else {
                        if (var8 < 128) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 < 160) {
                      break L4;
                    } else {
                      if (var8 > 255) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param3[param5 + var7] = (byte)var8;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (8364 == var8) {
                    break L7;
                  } else {
                    L8: {
                      if (var8 == 8218) {
                        break L8;
                      } else {
                        L9: {
                          if (var8 != 402) {
                            break L9;
                          } else {
                            param3[var7 + param5] = (byte)-125;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (var8 != 8222) {
                            break L10;
                          } else {
                            param3[param5 - -var7] = (byte)-124;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          if (8230 == var8) {
                            break L11;
                          } else {
                            L12: {
                              if (var8 != 8224) {
                                break L12;
                              } else {
                                param3[param5 - -var7] = (byte)-122;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            L13: {
                              if (var8 != 8225) {
                                break L13;
                              } else {
                                param3[var7 + param5] = (byte)-121;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              if (710 == var8) {
                                break L14;
                              } else {
                                L15: {
                                  if (8240 == var8) {
                                    break L15;
                                  } else {
                                    L16: {
                                      if (var8 != 352) {
                                        break L16;
                                      } else {
                                        param3[var7 + param5] = (byte)-118;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    L17: {
                                      if (var8 == 8249) {
                                        break L17;
                                      } else {
                                        L18: {
                                          if (var8 == 338) {
                                            break L18;
                                          } else {
                                            L19: {
                                              if (var8 == 381) {
                                                break L19;
                                              } else {
                                                L20: {
                                                  if (var8 == 8216) {
                                                    break L20;
                                                  } else {
                                                    L21: {
                                                      if (8217 != var8) {
                                                        break L21;
                                                      } else {
                                                        param3[var7 + param5] = (byte)-110;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    L22: {
                                                      if (var8 != 8220) {
                                                        break L22;
                                                      } else {
                                                        param3[var7 + param5] = (byte)-109;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    L23: {
                                                      if (8221 != var8) {
                                                        break L23;
                                                      } else {
                                                        param3[param5 - -var7] = (byte)-108;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (var8 != 8226) {
                                                        break L24;
                                                      } else {
                                                        param3[var7 + param5] = (byte)-107;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (var8 != 8211) {
                                                        break L25;
                                                      } else {
                                                        param3[var7 + param5] = (byte)-106;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    L26: {
                                                      if (var8 == 8212) {
                                                        break L26;
                                                      } else {
                                                        L27: {
                                                          if (var8 != 732) {
                                                            break L27;
                                                          } else {
                                                            param3[var7 + param5] = (byte)-104;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L27;
                                                            }
                                                          }
                                                        }
                                                        L28: {
                                                          if (var8 == 8482) {
                                                            break L28;
                                                          } else {
                                                            L29: {
                                                              if (353 == var8) {
                                                                break L29;
                                                              } else {
                                                                L30: {
                                                                  if (var8 == 8250) {
                                                                    break L30;
                                                                  } else {
                                                                    L31: {
                                                                      if (var8 == 339) {
                                                                        break L31;
                                                                      } else {
                                                                        L32: {
                                                                          if (var8 != 382) {
                                                                            break L32;
                                                                          } else {
                                                                            param3[var7 + param5] = (byte)-98;
                                                                            if (0 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        L33: {
                                                                          if (var8 == 376) {
                                                                            break L33;
                                                                          } else {
                                                                            param3[param5 - -var7] = (byte)63;
                                                                            if (0 == 0) {
                                                                              break L3;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                        }
                                                                        param3[param5 - -var7] = (byte)-97;
                                                                        if (0 == 0) {
                                                                          break L3;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    param3[param5 - -var7] = (byte)-100;
                                                                    if (0 == 0) {
                                                                      break L3;
                                                                    } else {
                                                                      break L30;
                                                                    }
                                                                  }
                                                                }
                                                                param3[param5 + var7] = (byte)-101;
                                                                if (0 == 0) {
                                                                  break L3;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            param3[param5 + var7] = (byte)-102;
                                                            if (0 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                        }
                                                        param3[param5 - -var7] = (byte)-103;
                                                        if (0 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    param3[param5 + var7] = (byte)-105;
                                                    if (0 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                param3[var7 + param5] = (byte)-111;
                                                if (0 == 0) {
                                                  break L3;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            param3[var7 + param5] = (byte)-114;
                                            if (0 == 0) {
                                              break L3;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                        param3[param5 - -var7] = (byte)-116;
                                        if (0 == 0) {
                                          break L3;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    param3[param5 + var7] = (byte)-117;
                                    if (0 == 0) {
                                      break L3;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                param3[var7 + param5] = (byte)-119;
                                if (0 == 0) {
                                  break L3;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            param3[var7 + param5] = (byte)-120;
                            if (0 == 0) {
                              break L3;
                            } else {
                              break L11;
                            }
                          }
                        }
                        param3[var7 + param5] = (byte)-123;
                        if (0 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param3[param5 - -var7] = (byte)-126;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  }
                }
                param3[param5 - -var7] = (byte)-128;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new aj(10, 2, 2, 0);
    }
}
