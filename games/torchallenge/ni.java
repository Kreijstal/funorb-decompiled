/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    String field_e;
    int field_c;
    String field_j;
    static boolean field_b;
    static int field_i;
    static int field_f;
    static ka[] field_h;
    lj field_a;
    static bc field_d;
    String field_g;

    final static String a(String[] args, int param1, String param2) {
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
        var11 = TorChallenge.field_F ? 1 : 0;
        var3 = param2.length();
        var4 = var3;
        var5 = param1;
        L0: while (true) {
          var6_int = param2.indexOf("<%", var5);
          if (var6_int < 0) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L1: while (true) {
              var8 = param2.indexOf("<%", var5);
              if (var8 >= 0) {
                var5 = 2 + var8;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3) {
                      break L3;
                    } else {
                      if (!qb.a(param2.charAt(var5), true)) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var9 = param2.substring(2 + var8, var5);
                  if (!ei.a((byte) -117, (CharSequence) (Object) var9)) {
                    continue L1;
                  } else {
                    if (var3 <= var5) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) == 62) {
                        var5++;
                        var10 = qh.a((CharSequence) (Object) var9, (byte) -96);
                        StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
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
                StringBuilder discarded$5 = var6.append(param2.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = 2 + var6_int;
            L4: while (true) {
              L5: {
                if (var5 >= var3) {
                  break L5;
                } else {
                  if (!qb.a(param2.charAt(var5), true)) {
                    break L5;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
              var7_ref = param2.substring(2 + var6_int, var5);
              if (!ei.a((byte) -117, (CharSequence) (Object) var7_ref)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param2.charAt(var5) == 62) {
                    var5++;
                    var8 = qh.a((CharSequence) (Object) var7_ref, (byte) -68);
                    var4 = var4 + (args[var8].length() - (-var6_int + var5));
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = TorChallenge.field_F ? 1 : 0;
        if (param2 < 0) {
          return;
        } else {
          if (oc.field_e > param0) {
            L0: {
              if (param7 >= 0) {
                break L0;
              } else {
                if (param4 >= 0) {
                  break L0;
                } else {
                  if (param8 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (param7 < oc.field_d) {
                break L1;
              } else {
                if (param4 < oc.field_d) {
                  break L1;
                } else {
                  if (oc.field_d > param8) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              L3: {
                var12 = 90 / ((0 - param1) / 55);
                var15 = -param0 + param2;
                if (param0 == param5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var10 = param7 << -747181648;
                      var9 = param7 << -747181648;
                      var16 = -param0 + param5;
                      var13 = (-param7 + param8 << 1716356112) / var15;
                      var11 = (param4 + -param7 << -286958416) / var16;
                      if (var11 < var13) {
                        break L5;
                      } else {
                        var17 = var11;
                        var11 = var13;
                        var13 = var17;
                        var14 = 1;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = 0;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (param0 >= 0) {
                        var17 = oc.field_b[param0];
                        L8: while (true) {
                          if (param0 >= param5) {
                            break L6;
                          } else {
                            L9: {
                              var18 = var9 >> -350197488;
                              if ((oc.field_d ^ -1) >= (var18 ^ -1)) {
                                break L9;
                              } else {
                                L10: {
                                  var19 = -(var9 >> -417198224) + (var10 >> -333887408);
                                  if (var19 != 0) {
                                    break L10;
                                  } else {
                                    if (0 > var18) {
                                      break L9;
                                    } else {
                                      if (var18 < oc.field_d) {
                                        kc.a(param3, param6, (byte) -39, var17 + var18, var19);
                                        if (0 == 0) {
                                          break L9;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                L11: {
                                  if (oc.field_d > var19 + var18) {
                                    break L11;
                                  } else {
                                    var19 = oc.field_d + (-var18 + -1);
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (var18 < 0) {
                                    break L12;
                                  } else {
                                    kc.a(param3, param6, (byte) -39, var18 - -var17, var19);
                                    if (0 == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                kc.a(param3, param6, (byte) -39, var17, var18 + var19);
                                break L9;
                              }
                            }
                            param0++;
                            if (oc.field_e > param0) {
                              var9 = var9 + var11;
                              var10 = var10 + var13;
                              var17 = var17 + qg.field_g;
                              if (0 == 0) {
                                continue L8;
                              } else {
                                break L7;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      } else {
                        L13: {
                          if (param5 >= 0) {
                            break L13;
                          } else {
                            param0 = param5 - param0;
                            var9 = var9 + param0 * var11;
                            var10 = var10 + param0 * var13;
                            param0 = param5;
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L13;
                            }
                          }
                        }
                        param0 = -param0;
                        var10 = var10 + param0 * var13;
                        var9 = var9 + param0 * var11;
                        param0 = 0;
                        break L7;
                      }
                    }
                    var17 = oc.field_b[param0];
                    L14: while (true) {
                      if (param0 >= param5) {
                        break L6;
                      } else {
                        L15: {
                          var18 = var9 >> -350197488;
                          if ((oc.field_d ^ -1) >= (var18 ^ -1)) {
                            break L15;
                          } else {
                            L16: {
                              var19 = -(var9 >> -417198224) + (var10 >> -333887408);
                              if (var19 != 0) {
                                break L16;
                              } else {
                                if (0 > var18) {
                                  break L15;
                                } else {
                                  if (var18 < oc.field_d) {
                                    kc.a(param3, param6, (byte) -39, var17 + var18, var19);
                                    if (0 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            L17: {
                              if (oc.field_d > var19 + var18) {
                                break L17;
                              } else {
                                var19 = oc.field_d + (-var18 + -1);
                                break L17;
                              }
                            }
                            L18: {
                              if (var18 < 0) {
                                break L18;
                              } else {
                                kc.a(param3, param6, (byte) -39, var18 - -var17, var19);
                                if (0 == 0) {
                                  break L15;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            kc.a(param3, param6, (byte) -39, var17, var18 + var19);
                            break L15;
                          }
                        }
                        param0++;
                        if (oc.field_e > param0) {
                          var9 = var9 + var11;
                          var10 = var10 + var13;
                          var17 = var17 + qg.field_g;
                          if (0 == 0) {
                            continue L14;
                          } else {
                            break L6;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L19: {
                    L20: {
                      var17 = param2 - param5;
                      if (0 == var17) {
                        break L20;
                      } else {
                        L21: {
                          L22: {
                            if (var14 == 0) {
                              break L22;
                            } else {
                              var10 = param4 << 913093552;
                              if (0 == 0) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          var9 = param4 << -1867823536;
                          break L21;
                        }
                        var18 = param8 << 516465616;
                        var11 = (-var9 + var18) / var17;
                        var13 = (-var10 + var18) / var17;
                        if (0 == 0) {
                          break L19;
                        } else {
                          break L20;
                        }
                      }
                    }
                    var13 = 0;
                    var11 = 0;
                    break L19;
                  }
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L23: {
                L24: {
                  if (param2 == param0) {
                    break L24;
                  } else {
                    L25: {
                      L26: {
                        var16 = -param5 + param2;
                        if (param7 >= param4) {
                          break L26;
                        } else {
                          var9 = param7 << -1147974992;
                          var10 = param4 << 1926445808;
                          var13 = (-param4 + param8 << 1709599376) / var16;
                          var11 = (param8 + -param7 << 1074753744) / var15;
                          if (0 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var11 = (-param4 + param8 << -538785584) / var16;
                      var9 = param4 << -1695711120;
                      var13 = (param8 + -param7 << 1585804784) / var15;
                      var10 = param7 << -262643760;
                      break L25;
                    }
                    if (0 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                var11 = 0;
                var9 = param7 << 1057128336;
                var10 = param4 << -1907608016;
                var13 = 0;
                break L23;
              }
              var14 = 0;
              if (param0 < 0) {
                param0 = Math.min(-param0, param5 - param0);
                var10 = var10 + var13 * param0;
                var9 = var9 + param0 * var11;
                param0 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L27: {
              if (param0 >= 0) {
                break L27;
              } else {
                param0 = -param0;
                var9 = var9 + var11 * param0;
                var10 = var10 + var13 * param0;
                param0 = 0;
                break L27;
              }
            }
            var16 = oc.field_b[param0];
            L28: while (true) {
              L29: {
                if (param2 <= param0) {
                  break L29;
                } else {
                  L30: {
                    var17 = var9 >> -836326832;
                    if (oc.field_d > var17) {
                      L31: {
                        var18 = -(var9 >> 996965072) + (var10 >> -1530251568);
                        if (0 == var18) {
                          break L31;
                        } else {
                          L32: {
                            if (oc.field_d <= var18 + var17) {
                              var18 = -var17 + (oc.field_d + -1);
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if (var17 >= 0) {
                              break L33;
                            } else {
                              kc.a(param3, param6, (byte) -39, var16, var18 - -var17);
                              if (0 == 0) {
                                break L30;
                              } else {
                                break L33;
                              }
                            }
                          }
                          kc.a(param3, param6, (byte) -39, var16 + var17, var18);
                          if (0 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                      if (0 > var17) {
                        break L30;
                      } else {
                        if (oc.field_d <= var17) {
                          break L30;
                        } else {
                          kc.a(param3, param6, (byte) -39, var16 + var17, var18);
                          break L30;
                        }
                      }
                    } else {
                      break L30;
                    }
                  }
                  param0++;
                  if (oc.field_e <= param0) {
                    return;
                  } else {
                    var10 = var10 + var13;
                    var16 = var16 + qg.field_g;
                    var9 = var9 + var11;
                    if (0 == 0) {
                      continue L28;
                    } else {
                      break L29;
                    }
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        ji var5 = (ji) (Object) wf.field_g.c((byte) 113);
        while (var5 != null) {
            ul.a(-18261, var5, param0);
            var5 = (ji) (Object) wf.field_g.c(-270);
        }
        ae var6 = (ae) (Object) bk.field_t.c((byte) 122);
        int var3 = -23 % ((param1 - 23) / 38);
        while (var6 != null) {
            bg.a(param0, (byte) 26, var6);
            var6 = (ae) (Object) bk.field_t.c(-270);
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_d = null;
        if (!param0) {
            ni.a(true);
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
