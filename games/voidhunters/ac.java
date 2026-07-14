/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    final static void a(float[] param0, int param1, int param2, float param3, int param4, int param5, byte param6, float param7, int param8, float[] param9, int param10, int param11) {
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        param5 = param5 - param1;
        param11 = param11 - param8;
        param4 = param4 - param10;
        var12 = (float)param4 * param0[0] + param0[1] * (float)param5 + param0[2] * (float)param11;
        var13 = (float)param11 * param0[5] + (param0[3] * (float)param4 + (float)param5 * param0[4]);
        var14 = (float)param4 * param0[6] + (float)param5 * param0[7] + (float)param11 * param0[8];
        var15 = 0.5f + (float)Math.atan2((double)var12, (double)var14) / 6.2831854820251465f;
        if (param6 != -52) {
          return;
        } else {
          L0: {
            if (1.0f != param7) {
              var15 = var15 * param7;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            L2: {
              var16 = param3 + (var13 + 0.5f);
              if ((param2 ^ -1) == -2) {
                var17 = var15;
                var15 = -var16;
                var16 = var17;
                break L2;
              } else {
                if ((param2 ^ -1) != -3) {
                  if (param2 == 3) {
                    var17 = var15;
                    var15 = var16;
                    var16 = -var17;
                    break L2;
                  } else {
                    param9[0] = var15;
                    param9[1] = var16;
                    break L1;
                  }
                } else {
                  var15 = -var15;
                  var16 = -var16;
                  break L2;
                }
              }
            }
            param9[0] = var15;
            param9[1] = var16;
            break L1;
          }
          return;
        }
    }

    final static int a(int param0, boolean param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        var6 = -param0 + param2;
        if (param1) {
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
                        var8 = param3.charAt(param0 + var7);
                        if (0 >= var8) {
                          break L5;
                        } else {
                          if (128 > var8) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (160 > var8) {
                        break L3;
                      } else {
                        if (var8 > 255) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    param4[param5 + var7] = (byte)var8;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (var8 == 8364) {
                      break L6;
                    } else {
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
                                      param4[param5 - -var7] = (byte)-123;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var8 == 8224) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var8 != 8225) {
                                          break L12;
                                        } else {
                                          param4[param5 + var7] = (byte)-121;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      L13: {
                                        if (710 != var8) {
                                          break L13;
                                        } else {
                                          param4[var7 + param5] = (byte)-120;
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
                                          param4[param5 - -var7] = (byte)-119;
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
                                            if (var8 == 8249) {
                                              break L16;
                                            } else {
                                              L17: {
                                                if (var8 != 338) {
                                                  break L17;
                                                } else {
                                                  param4[var7 + param5] = (byte)-116;
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
                                                    if (var8 == 8216) {
                                                      break L19;
                                                    } else {
                                                      L20: {
                                                        if (var8 == 8217) {
                                                          break L20;
                                                        } else {
                                                          L21: {
                                                            if (8220 != var8) {
                                                              break L21;
                                                            } else {
                                                              param4[var7 + param5] = (byte)-109;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L21;
                                                              }
                                                            }
                                                          }
                                                          L22: {
                                                            if (8221 != var8) {
                                                              break L22;
                                                            } else {
                                                              param4[var7 + param5] = (byte)-108;
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
                                                              param4[param5 + var7] = (byte)-107;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          L24: {
                                                            if (var8 != 8211) {
                                                              break L24;
                                                            } else {
                                                              param4[var7 + param5] = (byte)-106;
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
                                                                  param4[param5 - -var7] = (byte)-104;
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
                                                                  param4[param5 + var7] = (byte)-103;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              L28: {
                                                                if (var8 != 353) {
                                                                  break L28;
                                                                } else {
                                                                  param4[var7 + param5] = (byte)-102;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                              }
                                                              L29: {
                                                                if (var8 != 8250) {
                                                                  break L29;
                                                                } else {
                                                                  param4[var7 + param5] = (byte)-101;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L29;
                                                                  }
                                                                }
                                                              }
                                                              L30: {
                                                                if (339 == var8) {
                                                                  break L30;
                                                                } else {
                                                                  L31: {
                                                                    if (var8 == 382) {
                                                                      break L31;
                                                                    } else {
                                                                      L32: {
                                                                        if (376 != var8) {
                                                                          break L32;
                                                                        } else {
                                                                          param4[var7 + param5] = (byte)-97;
                                                                          if (0 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L32;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[param5 + var7] = (byte)63;
                                                                      if (0 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L31;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[param5 + var7] = (byte)-98;
                                                                  if (0 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L30;
                                                                  }
                                                                }
                                                              }
                                                              param4[var7 + param5] = (byte)-100;
                                                              if (0 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          param4[var7 + param5] = (byte)-105;
                                                          if (0 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                      }
                                                      param4[param5 + var7] = (byte)-110;
                                                      if (0 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  param4[param5 + var7] = (byte)-111;
                                                  if (0 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              param4[var7 + param5] = (byte)-114;
                                              if (0 == 0) {
                                                break L2;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          param4[var7 + param5] = (byte)-117;
                                          if (0 == 0) {
                                            break L2;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      param4[param5 + var7] = (byte)-118;
                                      if (0 == 0) {
                                        break L2;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param4[var7 + param5] = (byte)-122;
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              param4[var7 + param5] = (byte)-124;
                              if (0 == 0) {
                                break L2;
                              } else {
                                break L8;
                              }
                            }
                          }
                          param4[param5 - -var7] = (byte)-125;
                          if (0 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                      param4[var7 + param5] = (byte)-126;
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  param4[param5 - -var7] = (byte)-128;
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
          return -10;
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        var9 = VoidHunters.field_G;
        if (param0 != 1) {
          return null;
        } else {
          var10 = new StringBuilder();
          var5 = param2;
          L0: while (true) {
            if (var5 >= param2 + param1) {
              return var10.toString();
            } else {
              var6 = param3[var5] & 255;
              StringBuilder discarded$5 = var10.append(eqb.field_a[var6 >>> 1669300322]);
              if (var5 < param1 + -1) {
                var7 = param3[var5 + 1] & 255;
                StringBuilder discarded$6 = var10.append(eqb.field_a[var7 >>> -2033619836 | 48 & var6 << -2098884348]);
                if (param1 - 2 <= var5) {
                  StringBuilder discarded$7 = var10.append(eqb.field_a[60 & var7 << -1614478654]);
                  var5 += 3;
                  continue L0;
                } else {
                  var8 = param3[2 + var5] & 255;
                  StringBuilder discarded$8 = var10.append(eqb.field_a[var8 >>> -1250911162 | var7 << -1519652542 & 60]).append(eqb.field_a[63 & var8]);
                  var5 += 3;
                  continue L0;
                }
              } else {
                StringBuilder discarded$9 = var10.append(eqb.field_a[(3 & var6) << -274148604]);
                var5 += 3;
                continue L0;
              }
            }
          }
        }
    }

    static {
    }
}
