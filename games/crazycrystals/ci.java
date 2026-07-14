/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends se {
    static gb field_k;
    static String field_j;
    static db field_i;

    ci(ga param0) {
        super(param0);
    }

    final oi a(String param0, byte param1) {
        int var3 = 0;
        CharSequence var4 = null;
        CharSequence var5 = null;
        var4 = (CharSequence) (Object) param0;
        if (cd.a(var4, (byte) -117)) {
          var5 = (CharSequence) (Object) param0;
          var3 = ti.a(param1 ^ -30, var5);
          if (var3 > 0) {
            if (-131 <= (var3 ^ -1)) {
              if (param1 != -122) {
                return null;
              } else {
                return ih.field_b;
              }
            } else {
              return rk.field_c;
            }
          } else {
            return rk.field_c;
          }
        } else {
          return rk.field_c;
        }
    }

    final static dl[] a(int param0, int param1, byte param2, int param3, int param4) {
        if (param2 != -70) {
          field_j = null;
          return rc.a(3, 1, param1, param3, 1, param0, param4, param2 ^ -3020, 1);
        } else {
          return rc.a(3, 1, param1, param3, 1, param0, param4, param2 ^ -3020, 1);
        }
    }

    final static String a(String[] args, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (-1 < (var6_int ^ -1)) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            if (param2 != 3) {
              return null;
            } else {
              var5 = 0;
              L1: while (true) {
                var8 = param1.indexOf("<%", var5);
                if (0 <= var8) {
                  var5 = var8 + 2;
                  L2: while (true) {
                    L3: {
                      if (var3 <= var5) {
                        break L3;
                      } else {
                        if (!ag.a(param1.charAt(var5), 48)) {
                          break L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    var9 = param1.substring(var8 - -2, var5);
                    if (!cd.a((CharSequence) (Object) var9, (byte) -112)) {
                      continue L1;
                    } else {
                      if (var3 <= var5) {
                        continue L1;
                      } else {
                        if (param1.charAt(var5) == 62) {
                          var5++;
                          var10 = ti.a(100, (CharSequence) (Object) var9);
                          StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$4 = var6.append(args[var10]);
                          continue L1;
                        } else {
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  StringBuilder discarded$5 = var6.append(param1.substring(var7));
                  return var6.toString();
                }
              }
            }
          } else {
            var5 = var6_int - -2;
            L4: while (true) {
              L5: {
                if (var3 <= var5) {
                  break L5;
                } else {
                  if (!ag.a(param1.charAt(var5), 48)) {
                    break L5;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
              var7_ref = param1.substring(2 + var6_int, var5);
              if (!cd.a((CharSequence) (Object) var7_ref, (byte) -109)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param1.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = ti.a(param2 ^ 103, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (args[var8].length() + (var6_int + -var5));
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final String a(String param0, int param1) {
        if (((ci) this).a(param0, (byte) -122) == rk.field_c) {
            return bh.field_d;
        }
        int var3 = 14 / ((41 - param1) / 49);
        return null;
    }

    public static void d(int param0) {
        int var1 = -12 % ((param0 - -6) / 48);
        field_i = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var13 = CrazyCrystals.field_B;
          var5 = param4 + param0;
          var6 = param1 - -param3;
          if (param0 > kh.field_c) {
            stackOut_2_0 = param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = kh.field_c;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param1 > kh.field_b) {
            stackOut_5_0 = param1;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = kh.field_b;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (var5 >= kh.field_g) {
            stackOut_8_0 = kh.field_g;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = var5;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (var6 >= kh.field_j) {
            stackOut_11_0 = kh.field_j;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = var6;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param0 >= kh.field_c) {
          if (kh.field_g > param0) {
            var11 = param0 + kh.field_l * var8;
            var12 = 1 + var10 + -var8 >> 690746817;
            L4: while (true) {
              var12--;
              if (-1 < (var12 ^ -1)) {
                L5: {
                  if (kh.field_b > param1) {
                    break L5;
                  } else {
                    if (kh.field_j > var6) {
                      var11 = param1 * kh.field_l + var7;
                      var12 = -var7 + 1 - -var9 >> -1089102623;
                      L6: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L5;
                        } else {
                          kh.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L6;
                        }
                      }
                    } else {
                      if (!param2) {
                        L7: {
                          if (var5 < kh.field_c) {
                            break L7;
                          } else {
                            if (var5 < kh.field_g) {
                              var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                              var12 = -var8 + 1 + var10 >> 1275402529;
                              L8: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L7;
                                } else {
                                  kh.field_i[var11] = 16777215;
                                  var11 = var11 + 2 * kh.field_l;
                                  continue L8;
                                }
                              }
                            } else {
                              L9: {
                                if (kh.field_b > param1) {
                                  break L9;
                                } else {
                                  if (var6 < kh.field_j) {
                                    var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                                    var12 = -var7 + var9 + 1 >> 1887266785;
                                    L10: while (true) {
                                      var12--;
                                      if (var12 > -1) {
                                        break L9;
                                      } else {
                                        kh.field_i[var11] = 16777215;
                                        var11 += 2;
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        if (kh.field_b <= param1) {
                          if (var6 < kh.field_j) {
                            var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                            var12 = -var7 + var9 + 1 >> 1887266785;
                            L11: while (true) {
                              var12--;
                              if (var12 > -1) {
                                return;
                              } else {
                                kh.field_i[var11] = 16777215;
                                var11 += 2;
                                continue L11;
                              }
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        L12: {
                          field_i = null;
                          if (var5 < kh.field_c) {
                            break L12;
                          } else {
                            if (var5 < kh.field_g) {
                              var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                              var12 = -var8 + 1 + var10 >> 1275402529;
                              L13: while (true) {
                                var12--;
                                if (-1 < (var12 ^ -1)) {
                                  break L12;
                                } else {
                                  kh.field_i[var11] = 16777215;
                                  var11 = var11 + 2 * kh.field_l;
                                  continue L13;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                        }
                        L14: {
                          if (kh.field_b > param1) {
                            break L14;
                          } else {
                            if (var6 < kh.field_j) {
                              var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                              var12 = -var7 + var9 + 1 >> 1887266785;
                              L15: while (true) {
                                var12--;
                                if (var12 > -1) {
                                  break L14;
                                } else {
                                  kh.field_i[var11] = 16777215;
                                  var11 += 2;
                                  continue L15;
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (!param2) {
                  L16: {
                    if (var5 < kh.field_c) {
                      break L16;
                    } else {
                      if (var5 < kh.field_g) {
                        var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                        var12 = -var8 + 1 + var10 >> 1275402529;
                        L17: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L16;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 = var11 + 2 * kh.field_l;
                            continue L17;
                          }
                        }
                      } else {
                        L18: {
                          if (kh.field_b > param1) {
                            break L18;
                          } else {
                            if (var6 < kh.field_j) {
                              var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                              var12 = -var7 + var9 + 1 >> 1887266785;
                              L19: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L18;
                                } else {
                                  kh.field_i[var11] = 16777215;
                                  var11 += 2;
                                  continue L19;
                                }
                              }
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L20: {
                    if (kh.field_b > param1) {
                      break L20;
                    } else {
                      if (var6 < kh.field_j) {
                        var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                        var12 = -var7 + var9 + 1 >> 1887266785;
                        L21: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L20;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L21;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L22: {
                    field_i = null;
                    if (var5 < kh.field_c) {
                      break L22;
                    } else {
                      if (var5 < kh.field_g) {
                        var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                        var12 = -var8 + 1 + var10 >> 1275402529;
                        L23: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L22;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 = var11 + 2 * kh.field_l;
                            continue L23;
                          }
                        }
                      } else {
                        L24: {
                          if (kh.field_b > param1) {
                            break L24;
                          } else {
                            if (var6 < kh.field_j) {
                              var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                              var12 = -var7 + var9 + 1 >> 1887266785;
                              L25: while (true) {
                                var12--;
                                if ((var12 ^ -1) > -1) {
                                  break L24;
                                } else {
                                  kh.field_i[var11] = 16777215;
                                  var11 += 2;
                                  continue L25;
                                }
                              }
                            } else {
                              break L24;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L26: {
                    if (kh.field_b > param1) {
                      break L26;
                    } else {
                      if (var6 < kh.field_j) {
                        var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                        var12 = -var7 + var9 + 1 >> 1887266785;
                        L27: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L26;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L27;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                kh.field_i[var11] = 16777215;
                var11 = var11 + kh.field_l * 2;
                continue L4;
              }
            }
          } else {
            L28: {
              if (kh.field_b > param1) {
                break L28;
              } else {
                if (kh.field_j > var6) {
                  var11 = param1 * kh.field_l + var7;
                  var12 = -var7 + 1 - -var9 >> -1089102623;
                  L29: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L28;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L29;
                    }
                  }
                } else {
                  L30: {
                    if (!param2) {
                      break L30;
                    } else {
                      field_i = null;
                      break L30;
                    }
                  }
                  L31: {
                    if (var5 < kh.field_c) {
                      break L31;
                    } else {
                      if (var5 < kh.field_g) {
                        var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                        var12 = -var8 + 1 + var10 >> 1275402529;
                        L32: while (true) {
                          var12--;
                          if (-1 < (var12 ^ -1)) {
                            break L31;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 = var11 + 2 * kh.field_l;
                            continue L32;
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                  }
                  L33: {
                    if (kh.field_b > param1) {
                      break L33;
                    } else {
                      if (var6 < kh.field_j) {
                        var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                        var12 = -var7 + var9 + 1 >> 1887266785;
                        L34: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L33;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L34;
                          }
                        }
                      } else {
                        break L33;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (!param2) {
              L35: {
                if (var5 < kh.field_c) {
                  break L35;
                } else {
                  if (var5 < kh.field_g) {
                    var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                    var12 = -var8 + 1 + var10 >> 1275402529;
                    L36: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L35;
                      } else {
                        kh.field_i[var11] = 16777215;
                        var11 = var11 + 2 * kh.field_l;
                        continue L36;
                      }
                    }
                  } else {
                    L37: {
                      if (kh.field_b > param1) {
                        break L37;
                      } else {
                        if (var6 < kh.field_j) {
                          var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                          var12 = -var7 + var9 + 1 >> 1887266785;
                          L38: while (true) {
                            var12--;
                            if ((var12 ^ -1) > -1) {
                              break L37;
                            } else {
                              kh.field_i[var11] = 16777215;
                              var11 += 2;
                              continue L38;
                            }
                          }
                        } else {
                          break L37;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (kh.field_b <= param1) {
                if (var6 >= kh.field_j) {
                  return;
                } else {
                  var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                  var12 = -var7 + var9 + 1 >> 1887266785;
                  L39: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      return;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L39;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              L40: {
                field_i = null;
                if (var5 < kh.field_c) {
                  break L40;
                } else {
                  if (var5 < kh.field_g) {
                    var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                    var12 = -var8 + 1 + var10 >> 1275402529;
                    L41: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L40;
                      } else {
                        kh.field_i[var11] = 16777215;
                        var11 = var11 + 2 * kh.field_l;
                        continue L41;
                      }
                    }
                  } else {
                    break L40;
                  }
                }
              }
              L42: {
                if (kh.field_b > param1) {
                  break L42;
                } else {
                  if (var6 < kh.field_j) {
                    var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                    var12 = -var7 + var9 + 1 >> 1887266785;
                    L43: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L42;
                      } else {
                        kh.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L43;
                      }
                    }
                  } else {
                    break L42;
                  }
                }
              }
              return;
            }
          }
        } else {
          L44: {
            if (kh.field_b > param1) {
              break L44;
            } else {
              if (kh.field_j > var6) {
                var11 = param1 * kh.field_l + var7;
                var12 = -var7 + 1 - -var9 >> -1089102623;
                L45: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L44;
                  } else {
                    kh.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L45;
                  }
                }
              } else {
                L46: {
                  if (!param2) {
                    break L46;
                  } else {
                    field_i = null;
                    break L46;
                  }
                }
                L47: {
                  if (var5 < kh.field_c) {
                    break L47;
                  } else {
                    if (var5 < kh.field_g) {
                      var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                      var12 = -var8 + 1 + var10 >> 1275402529;
                      L48: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L47;
                        } else {
                          kh.field_i[var11] = 16777215;
                          var11 = var11 + 2 * kh.field_l;
                          continue L48;
                        }
                      }
                    } else {
                      break L47;
                    }
                  }
                }
                L49: {
                  if (kh.field_b > param1) {
                    break L49;
                  } else {
                    if (var6 < kh.field_j) {
                      var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                      var12 = -var7 + var9 + 1 >> 1887266785;
                      L50: while (true) {
                        var12--;
                        if ((var12 ^ -1) > -1) {
                          break L49;
                        } else {
                          kh.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L50;
                        }
                      }
                    } else {
                      break L49;
                    }
                  }
                }
                return;
              }
            }
          }
          if (!param2) {
            L51: {
              if (var5 < kh.field_c) {
                break L51;
              } else {
                if (var5 < kh.field_g) {
                  var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                  var12 = -var8 + 1 + var10 >> 1275402529;
                  L52: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L51;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 = var11 + 2 * kh.field_l;
                      continue L52;
                    }
                  }
                } else {
                  L53: {
                    if (kh.field_b > param1) {
                      break L53;
                    } else {
                      if (var6 < kh.field_j) {
                        var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                        var12 = -var7 + var9 + 1 >> 1887266785;
                        L54: while (true) {
                          var12--;
                          if ((var12 ^ -1) > -1) {
                            break L53;
                          } else {
                            kh.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L54;
                          }
                        }
                      } else {
                        break L53;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (kh.field_b <= param1) {
              if (var6 >= kh.field_j) {
                return;
              } else {
                var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                var12 = -var7 + var9 + 1 >> 1887266785;
                L55: while (true) {
                  var12--;
                  if ((var12 ^ -1) > -1) {
                    return;
                  } else {
                    kh.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L55;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            L56: {
              field_i = null;
              if (var5 < kh.field_c) {
                break L56;
              } else {
                if (var5 < kh.field_g) {
                  var11 = (var8 + (1 & -param0 + var5)) * kh.field_l + var5;
                  var12 = -var8 + 1 + var10 >> 1275402529;
                  L57: while (true) {
                    var12--;
                    if (-1 < (var12 ^ -1)) {
                      break L56;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 = var11 + 2 * kh.field_l;
                      continue L57;
                    }
                  }
                } else {
                  break L56;
                }
              }
            }
            L58: {
              if (kh.field_b > param1) {
                break L58;
              } else {
                if (var6 < kh.field_j) {
                  var11 = var7 + (var6 * kh.field_l - -(var6 + -param1 & 1));
                  var12 = -var7 + var9 + 1 >> 1887266785;
                  L59: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L58;
                    } else {
                      kh.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L59;
                    }
                  }
                } else {
                  break L58;
                }
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
