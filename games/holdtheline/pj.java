/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends rd {
    static int field_m;
    static boolean field_n;
    static int field_o;

    final static boolean b(byte param0) {
        if (param0 <= 78) {
            boolean discarded$0 = pj.b((byte) -61);
        }
        return mn.field_a;
    }

    final void a(int[] param0, int param1, byte param2, int[] param3) {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        if (param2 >= -49) {
            field_n = true;
        }
        int[] var8 = new int[param0.length + param3.length];
        int[] var13 = var8;
        int[] var12 = var13;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var5 = var10;
        for (var6 = 0; param0.length > var6; var6++) {
            var8[var6] = param0[var6];
        }
        int var9 = 0;
        var6 = var9;
        while (param3.length / 2 > var9) {
            var5[param0.length + var9 * 2] = param3[-(2 * var9) + param3.length - 2];
            var5[1 + param0.length - -(2 * var9)] = param3[-1 + (param3.length - 2 * var9)];
            var9++;
        }
        lj.a(0, 128, 5, var13, (byte) -32, 5);
    }

    final static void a(byte param0) {
        dm.field_a = 0;
        if (param0 > -21) {
            Object var2 = null;
            float discarded$0 = pj.a((wc[]) null, (byte) -53, 0.8636131286621094f, -0.5086926817893982f);
        }
        em.field_l = -1;
        ac.field_e = -1;
        sk.field_h = false;
        n.field_s = null;
    }

    final static int a(CharSequence param0, int param1, int param2, byte[] param3, int param4, byte param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        if (param5 == 29) {
          var6 = param2 - param4;
          var7 = 0;
          L0: while (true) {
            L1: {
              if (var6 <= var7) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param0.charAt(var7 + param4);
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
                      if (var8 < 160) {
                        break L5;
                      } else {
                        if (var8 <= 255) {
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
                        param3[var7 + param1] = (byte)-128;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var8 != 8218) {
                        break L7;
                      } else {
                        param3[param1 - -var7] = (byte)-126;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var8 == 402) {
                        break L8;
                      } else {
                        L9: {
                          if (8222 == var8) {
                            break L9;
                          } else {
                            L10: {
                              if (8230 == var8) {
                                break L10;
                              } else {
                                L11: {
                                  if (var8 == 8224) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (var8 == 8225) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (710 != var8) {
                                            break L13;
                                          } else {
                                            param3[var7 + param1] = (byte)-120;
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
                                            param3[var7 + param1] = (byte)-119;
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
                                                param3[param1 + var7] = (byte)-117;
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
                                                      if (var8 == 8216) {
                                                        break L19;
                                                      } else {
                                                        L20: {
                                                          if (var8 != 8217) {
                                                            break L20;
                                                          } else {
                                                            param3[param1 - -var7] = (byte)-110;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L20;
                                                            }
                                                          }
                                                        }
                                                        L21: {
                                                          if (var8 != 8220) {
                                                            break L21;
                                                          } else {
                                                            param3[param1 + var7] = (byte)-109;
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
                                                              if (var8 != 8226) {
                                                                break L23;
                                                              } else {
                                                                param3[var7 + param1] = (byte)-107;
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
                                                                param3[param1 - -var7] = (byte)-106;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            L25: {
                                                              if (var8 != 8212) {
                                                                break L25;
                                                              } else {
                                                                param3[param1 + var7] = (byte)-105;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L25;
                                                                }
                                                              }
                                                            }
                                                            L26: {
                                                              if (732 == var8) {
                                                                break L26;
                                                              } else {
                                                                L27: {
                                                                  if (var8 != 8482) {
                                                                    break L27;
                                                                  } else {
                                                                    param3[param1 - -var7] = (byte)-103;
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
                                                                    param3[var7 + param1] = (byte)-102;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                                L29: {
                                                                  if (var8 == 8250) {
                                                                    break L29;
                                                                  } else {
                                                                    L30: {
                                                                      if (var8 != 339) {
                                                                        break L30;
                                                                      } else {
                                                                        param3[param1 + var7] = (byte)-100;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                    }
                                                                    L31: {
                                                                      if (var8 == 382) {
                                                                        break L31;
                                                                      } else {
                                                                        L32: {
                                                                          if (var8 == 376) {
                                                                            break L32;
                                                                          } else {
                                                                            param3[param1 + var7] = (byte)63;
                                                                            if (0 == 0) {
                                                                              break L2;
                                                                            } else {
                                                                              break L32;
                                                                            }
                                                                          }
                                                                        }
                                                                        param3[param1 - -var7] = (byte)-97;
                                                                        if (0 == 0) {
                                                                          break L2;
                                                                        } else {
                                                                          break L31;
                                                                        }
                                                                      }
                                                                    }
                                                                    param3[var7 + param1] = (byte)-98;
                                                                    if (0 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                }
                                                                param3[param1 + var7] = (byte)-101;
                                                                if (0 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L26;
                                                                }
                                                              }
                                                            }
                                                            param3[var7 + param1] = (byte)-104;
                                                            if (0 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L22;
                                                            }
                                                          }
                                                        }
                                                        param3[var7 + param1] = (byte)-108;
                                                        if (0 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    param3[param1 - -var7] = (byte)-111;
                                                    if (0 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                }
                                                param3[var7 + param1] = (byte)-114;
                                                if (0 == 0) {
                                                  break L2;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            param3[var7 + param1] = (byte)-116;
                                            if (0 == 0) {
                                              break L2;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        param3[param1 + var7] = (byte)-118;
                                        if (0 == 0) {
                                          break L2;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    param3[param1 + var7] = (byte)-121;
                                    if (0 == 0) {
                                      break L2;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                param3[param1 + var7] = (byte)-122;
                                if (0 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            param3[param1 + var7] = (byte)-123;
                            if (0 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param3[param1 + var7] = (byte)-124;
                        if (0 == 0) {
                          break L2;
                        } else {
                          break L8;
                        }
                      }
                    }
                    param3[var7 + param1] = (byte)-125;
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  param3[var7 + param1] = (byte)var8;
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
          return 5;
        }
    }

    pj(int param0, float param1) {
        ((pj) this).field_h = param0;
        ((pj) this).field_k = param1;
        ((pj) this).field_c = 0;
        ((pj) this).field_i = 1;
    }

    final static float a(wc[] param0, byte param1, float param2, float param3) {
        float var4 = 0.0f;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        float stackIn_27_0 = 0.0f;
        float stackOut_26_0 = 0.0f;
        float stackOut_25_0 = 0.0f;
        L0: {
          var8 = HoldTheLine.field_D;
          var4 = 0.0f;
          var5 = (int)param2;
          var6 = (int)param3;
          if (param1 == -105) {
            break L0;
          } else {
            pj.a((byte) -116);
            break L0;
          }
        }
        L1: {
          if (var6 == var5) {
            L2: {
              var4 = -param2 + param3;
              if (var4 >= 0.0f) {
                stackOut_26_0 = var4;
                stackIn_27_0 = stackOut_26_0;
                break L2;
              } else {
                stackOut_25_0 = -var4;
                stackIn_27_0 = stackOut_25_0;
                break L2;
              }
            }
            var4 = stackIn_27_0;
            break L1;
          } else {
            if (var6 > var5) {
              L3: {
                if (param2 != (float)var5) {
                  var4 = param0[var5].f(param1 + 155) * ((float)(var5 + 1) - param2);
                  break L3;
                } else {
                  break L3;
                }
              }
              var7 = 1 + var5;
              L4: while (true) {
                if (var7 >= var6) {
                  if (param3 == (float)var6) {
                    break L1;
                  } else {
                    var4 = var4 + (param3 - (float)var6) * param0[var6].f(param1 + 155);
                    break L1;
                  }
                } else {
                  var4 = var4 + param0[var7].f(param1 + 155);
                  var7++;
                  continue L4;
                }
              }
            } else {
              L5: {
                if ((float)var5 != param2) {
                  var4 = param0[var5].f(param1 ^ -91) * ((float)(1 + var5) - param2);
                  break L5;
                } else {
                  break L5;
                }
              }
              var7 = 1 + var5;
              L6: while (true) {
                if (var7 >= param0.length) {
                  var7 = 0;
                  L7: while (true) {
                    if (var7 >= var6) {
                      if ((float)var6 != param3) {
                        var4 = var4 + ((float)(-var6) + param3) * param0[var6].f(50);
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      var4 = var4 + param0[var7].f(50);
                      var7++;
                      continue L7;
                    }
                  }
                } else {
                  var4 = var4 + param0[var7].f(50);
                  var7++;
                  continue L6;
                }
              }
            }
          }
        }
        return var4;
    }

    static {
    }
}
