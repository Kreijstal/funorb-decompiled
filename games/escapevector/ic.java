/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends hg {
    int field_p;
    int field_o;
    int field_j;
    static int[] field_n;
    int field_h;
    tl field_m;
    int field_q;
    static String[] field_k;
    int field_l;
    hl field_g;
    int field_i;

    final static int a(String param0, int param1, ih param2) {
        int var3 = 0;
        int var4 = 0;
        var3 = hn.a(param2, param1 + -16777215);
        var4 = 4 * var3 + param2.b(param0);
        if (param1 != 16777215) {
          return 56;
        } else {
          return var4;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 > -97) {
            ic.a((byte) 51, false);
            ve.a(-58, param1, false);
            return;
        }
        ve.a(-58, param1, false);
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
            ic.a(false, 19, -31, -11, -87);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(int param0, int param1) {
        if (param0 > -97) {
            return;
        }
        oe.c((byte) -14);
        hi.field_q = param1;
    }

    final static boolean a(String param0, byte param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param1 <= 108) {
          ic.a(true);
          var3 = (CharSequence) (Object) param0;
          return cc.field_k.equals((Object) (Object) sf.a(-67, var3));
        } else {
          var4 = (CharSequence) (Object) param0;
          return cc.field_k.equals((Object) (Object) sf.a(-67, var4));
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var13 = EscapeVector.field_A;
          var5 = param1 + param2;
          var6 = param4 + param3;
          if (param2 <= em.field_a) {
            stackOut_2_0 = em.field_a;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (em.field_k >= param4) {
            stackOut_5_0 = em.field_k;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = param4;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var8 = stackIn_6_0;
        if (!param0) {
          L2: {
            if (em.field_b > var5) {
              stackOut_68_0 = var5;
              stackIn_69_0 = stackOut_68_0;
              break L2;
            } else {
              stackOut_67_0 = em.field_b;
              stackIn_69_0 = stackOut_67_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_69_0;
            if (var6 >= em.field_j) {
              stackOut_71_0 = em.field_j;
              stackIn_72_0 = stackOut_71_0;
              break L3;
            } else {
              stackOut_70_0 = var6;
              stackIn_72_0 = stackOut_70_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_72_0;
            if (param2 < em.field_a) {
              break L4;
            } else {
              if (param2 < em.field_b) {
                var11 = param2 + em.field_l * var8;
                var12 = -var8 + (1 - -var10) >> -571096095;
                L5: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L4;
                  } else {
                    em.field_i[var11] = 16777215;
                    var11 = var11 + em.field_l * 2;
                    continue L5;
                  }
                }
              } else {
                L6: {
                  if (param4 < em.field_k) {
                    break L6;
                  } else {
                    if (var6 >= em.field_j) {
                      break L6;
                    } else {
                      var11 = var7 + em.field_l * param4;
                      var12 = -var7 + var9 + 1 >> -823102751;
                      L7: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L6;
                        } else {
                          em.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L7;
                        }
                      }
                    }
                  }
                }
                if (em.field_a <= var5) {
                  if (var5 < em.field_b) {
                    var11 = em.field_l * (var8 - -(1 & var5 - param2)) - -var5;
                    var12 = 1 - (-var10 - -var8) >> 851503265;
                    L8: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        L9: {
                          if (em.field_k > param4) {
                            break L9;
                          } else {
                            if (var6 >= em.field_j) {
                              break L9;
                            } else {
                              var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                              var12 = -var7 + (var9 + 1) >> 535621697;
                              L10: while (true) {
                                var12--;
                                if (var12 < 0) {
                                  break L9;
                                } else {
                                  em.field_i[var11] = 16777215;
                                  var11 += 2;
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        em.field_i[var11] = 16777215;
                        var11 = var11 + 2 * em.field_l;
                        continue L8;
                      }
                    }
                  } else {
                    L11: {
                      if (em.field_k > param4) {
                        break L11;
                      } else {
                        if (var6 >= em.field_j) {
                          break L11;
                        } else {
                          var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                          var12 = -var7 + (var9 + 1) >> 535621697;
                          L12: while (true) {
                            var12--;
                            if (var12 < 0) {
                              break L11;
                            } else {
                              em.field_i[var11] = 16777215;
                              var11 += 2;
                              continue L12;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L13: {
                    if (em.field_k > param4) {
                      break L13;
                    } else {
                      if (var6 >= em.field_j) {
                        break L13;
                      } else {
                        var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                        var12 = -var7 + (var9 + 1) >> 535621697;
                        L14: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L13;
                          } else {
                            em.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L14;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          L15: {
            if (param4 < em.field_k) {
              break L15;
            } else {
              if (var6 >= em.field_j) {
                break L15;
              } else {
                var11 = var7 + em.field_l * param4;
                var12 = -var7 + var9 + 1 >> -823102751;
                L16: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L15;
                  } else {
                    em.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L16;
                  }
                }
              }
            }
          }
          if (em.field_a <= var5) {
            if (var5 < em.field_b) {
              var11 = em.field_l * (var8 - -(1 & var5 - param2)) - -var5;
              var12 = 1 - (-var10 - -var8) >> 851503265;
              L17: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  L18: {
                    if (em.field_k > param4) {
                      break L18;
                    } else {
                      if (var6 >= em.field_j) {
                        break L18;
                      } else {
                        var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                        var12 = -var7 + (var9 + 1) >> 535621697;
                        L19: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L18;
                          } else {
                            em.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L19;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  em.field_i[var11] = 16777215;
                  var11 = var11 + 2 * em.field_l;
                  continue L17;
                }
              }
            } else {
              L20: {
                if (em.field_k > param4) {
                  break L20;
                } else {
                  if (var6 >= em.field_j) {
                    break L20;
                  } else {
                    var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                    var12 = -var7 + (var9 + 1) >> 535621697;
                    L21: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L20;
                      } else {
                        em.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L21;
                      }
                    }
                  }
                }
              }
              return;
            }
          } else {
            L22: {
              if (em.field_k > param4) {
                break L22;
              } else {
                if (var6 >= em.field_j) {
                  break L22;
                } else {
                  var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                  var12 = -var7 + (var9 + 1) >> 535621697;
                  L23: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L22;
                    } else {
                      em.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L23;
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          L24: {
            field_k = null;
            if (em.field_b > var5) {
              stackOut_9_0 = var5;
              stackIn_10_0 = stackOut_9_0;
              break L24;
            } else {
              stackOut_8_0 = em.field_b;
              stackIn_10_0 = stackOut_8_0;
              break L24;
            }
          }
          L25: {
            var9 = stackIn_10_0;
            if (var6 >= em.field_j) {
              stackOut_12_0 = em.field_j;
              stackIn_13_0 = stackOut_12_0;
              break L25;
            } else {
              stackOut_11_0 = var6;
              stackIn_13_0 = stackOut_11_0;
              break L25;
            }
          }
          L26: {
            var10 = stackIn_13_0;
            if (param2 < em.field_a) {
              break L26;
            } else {
              if (param2 < em.field_b) {
                var11 = param2 + em.field_l * var8;
                var12 = -var8 + (1 - -var10) >> -571096095;
                L27: while (true) {
                  var12--;
                  if (-1 < (var12 ^ -1)) {
                    break L26;
                  } else {
                    em.field_i[var11] = 16777215;
                    var11 = var11 + em.field_l * 2;
                    continue L27;
                  }
                }
              } else {
                L28: {
                  if (param4 < em.field_k) {
                    break L28;
                  } else {
                    if (var6 >= em.field_j) {
                      break L28;
                    } else {
                      var11 = var7 + em.field_l * param4;
                      var12 = -var7 + var9 + 1 >> -823102751;
                      L29: while (true) {
                        var12--;
                        if (0 > var12) {
                          break L28;
                        } else {
                          em.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L29;
                        }
                      }
                    }
                  }
                }
                L30: {
                  if (em.field_a > var5) {
                    break L30;
                  } else {
                    if (var5 < em.field_b) {
                      var11 = em.field_l * (var8 - -(1 & var5 - param2)) - -var5;
                      var12 = 1 - (-var10 - -var8) >> 851503265;
                      L31: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L30;
                        } else {
                          em.field_i[var11] = 16777215;
                          var11 = var11 + 2 * em.field_l;
                          continue L31;
                        }
                      }
                    } else {
                      break L30;
                    }
                  }
                }
                L32: {
                  if (em.field_k > param4) {
                    break L32;
                  } else {
                    if (var6 >= em.field_j) {
                      break L32;
                    } else {
                      var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                      var12 = -var7 + (var9 + 1) >> 535621697;
                      L33: while (true) {
                        var12--;
                        if (var12 < 0) {
                          break L32;
                        } else {
                          em.field_i[var11] = 16777215;
                          var11 += 2;
                          continue L33;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
          L34: {
            if (param4 < em.field_k) {
              break L34;
            } else {
              if (var6 >= em.field_j) {
                break L34;
              } else {
                var11 = var7 + em.field_l * param4;
                var12 = -var7 + var9 + 1 >> -823102751;
                L35: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L34;
                  } else {
                    em.field_i[var11] = 16777215;
                    var11 += 2;
                    continue L35;
                  }
                }
              }
            }
          }
          if (em.field_a <= var5) {
            if (var5 >= em.field_b) {
              L36: {
                if (em.field_k > param4) {
                  break L36;
                } else {
                  if (var6 >= em.field_j) {
                    break L36;
                  } else {
                    var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                    var12 = -var7 + (var9 + 1) >> 535621697;
                    L37: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L36;
                      } else {
                        em.field_i[var11] = 16777215;
                        var11 += 2;
                        continue L37;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              var11 = em.field_l * (var8 - -(1 & var5 - param2)) - -var5;
              var12 = 1 - (-var10 - -var8) >> 851503265;
              L38: while (true) {
                var12--;
                if (-1 < (var12 ^ -1)) {
                  L39: {
                    if (em.field_k > param4) {
                      break L39;
                    } else {
                      if (var6 >= em.field_j) {
                        break L39;
                      } else {
                        var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                        var12 = -var7 + (var9 + 1) >> 535621697;
                        L40: while (true) {
                          var12--;
                          if (var12 < 0) {
                            break L39;
                          } else {
                            em.field_i[var11] = 16777215;
                            var11 += 2;
                            continue L40;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  em.field_i[var11] = 16777215;
                  var11 = var11 + 2 * em.field_l;
                  continue L38;
                }
              }
            }
          } else {
            L41: {
              if (em.field_k > param4) {
                break L41;
              } else {
                if (var6 >= em.field_j) {
                  break L41;
                } else {
                  var11 = var7 + var6 * em.field_l - -(1 & -param4 + var6);
                  var12 = -var7 + (var9 + 1) >> 535621697;
                  L42: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L41;
                    } else {
                      em.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L42;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    ic() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[]{23, 1, 2, 3, 4, 24, 6, 7, 9, 10};
        field_k = new String[]{"Welcome to the mothership's practice area.", "Press the 'UP' arrow to blast off. Easy does it.", "", "Now land again.", "Keep tapping the 'UP' arrow to limit your speed and land softly.", "", "Blast off and use the 'LEFT' and 'RIGHT' arrow keys to rotate your ship. Try thrusting in different directions.", "Your ship has momentum. To stop moving, thrust against the direction of movement.", "When you are comfortable and confident, proceed upwards.", "Use the 'LEFT' and 'RIGHT' arrow keys to rotate your ship. Try thrusting in different directions.", "Your ship has momentum. To stop moving, thrust against the direction of movement.", "When you are comfortable and confident, proceed upwards.", "Press 'SPACE' or 'SHIFT' to activate your shield. The mothership will power your shield for you.", "Warning: after you leave the mothership, you only have three seconds' worth of shield per level!", "", "Land next to the container to attach your tether.", "", "", "Now blast off, and keep the container away from any walls!", "Practise managing the container's momentum as well as your own in the auto-shield area.", "When you are ready to start the first mission, fly up and out into space.", "Shoot the barrier to open the exit.", "Press 'CTRL' to shoot.", "", "If you are ready to start the first mission, fly up and out into space.", "", "", "Practise managing the container's momentum as well as your own in the auto-shield area.", "When you are ready to start the first mission, fly up and out into space.", ""};
    }
}
