/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends tc {
    boolean field_m;
    static la field_n;
    int[] field_l;
    static int field_k;

    final static void a(byte[] param0, int param1) {
        byte dupTemp$2 = 0;
        byte dupTemp$3 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        vh var16 = null;
        vh var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_77_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_85_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_61_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_76_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var16 = new vh(param0);
            var17 = var16;
            var17.field_q = param0.length - 2;
            iw.field_n = var17.e((byte) -104);
            j.field_e = new int[iw.field_n];
            c.field_e = new int[iw.field_n];
            iq.field_g = new int[iw.field_n];
            ne.field_e = new boolean[iw.field_n];
            qm.field_K = new int[iw.field_n];
            vj.field_j = new byte[iw.field_n][];
            cq.field_z = new byte[iw.field_n][];
            var17.field_q = -(iw.field_n * 8) + -7 + param0.length;
            lg.field_d = var17.e((byte) -104);
            wr.field_J = var17.e((byte) -104);
            var3 = 1 + (255 & var17.k(param1 + 1));
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((iw.field_n ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    j.field_e[var4] = var16.e((byte) -104);
                    var4++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if ((var4 ^ -1) <= (iw.field_n ^ -1)) {
                      break L6;
                    } else {
                      iq.field_g[var4] = var16.e((byte) -104);
                      var4++;
                      if (var15 != 0) {
                        break L5;
                      } else {
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if ((iw.field_n ^ -1) >= (var4 ^ -1)) {
                        break L9;
                      } else {
                        qm.field_K[var4] = var16.e((byte) -104);
                        var4++;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L8;
                  }
                  L10: while (true) {
                    L11: {
                      L12: {
                        if ((var4 ^ -1) <= (iw.field_n ^ -1)) {
                          break L12;
                        } else {
                          c.field_e[var4] = var16.e((byte) -104);
                          var4++;
                          if (var15 != 0) {
                            break L11;
                          } else {
                            if (var15 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      L13: {
                        if (param1 == -1) {
                          break L13;
                        } else {
                          field_n = (la) null;
                          break L13;
                        }
                      }
                      var17.field_q = 3 + (-(var3 * 3) + (-(8 * iw.field_n) + -7) + param0.length);
                      qv.field_j = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L14: while (true) {
                      L15: {
                        L16: {
                          L17: {
                            if ((var4 ^ -1) <= (var3 ^ -1)) {
                              break L17;
                            } else {
                              qv.field_j[var4] = var16.d((byte) -13);
                              stackOut_29_0 = qv.field_j[var4] ^ -1;
                              stackOut_29_1 = -1;
                              stackIn_37_0 = stackOut_29_0;
                              stackIn_37_1 = stackOut_29_1;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (var15 != 0) {
                                L18: while (true) {
                                  if (stackIn_37_0 <= stackIn_37_1) {
                                    break L15;
                                  } else {
                                    var5 = qm.field_K[var4];
                                    var6 = c.field_e[var4];
                                    var7 = var6 * var5;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    vj.field_j[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    cq.field_z[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.k(0);
                                    if (var15 != 0) {
                                      break L16;
                                    } else {
                                      L19: {
                                        L20: {
                                          L21: {
                                            L22: {
                                              if ((1 & var11 ^ -1) == -1) {
                                                break L22;
                                              } else {
                                                var12 = 0;
                                                L23: while (true) {
                                                  L24: {
                                                    L25: {
                                                      if ((var5 ^ -1) >= (var12 ^ -1)) {
                                                        break L25;
                                                      } else {
                                                        stackOut_42_0 = 0;
                                                        stackIn_51_0 = stackOut_42_0;
                                                        stackIn_43_0 = stackOut_42_0;
                                                        if (var15 != 0) {
                                                          break L24;
                                                        } else {
                                                          var13 = stackIn_43_0;
                                                          L26: while (true) {
                                                            L27: {
                                                              L28: {
                                                                if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                                  break L28;
                                                                } else {
                                                                  var8[var13 * var5 + var12] = var16.a((byte) -106);
                                                                  var13++;
                                                                  if (var15 != 0) {
                                                                    break L27;
                                                                  } else {
                                                                    if (var15 == 0) {
                                                                      continue L26;
                                                                    } else {
                                                                      break L28;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                              var12++;
                                                              break L27;
                                                            }
                                                            if (var15 == 0) {
                                                              continue L23;
                                                            } else {
                                                              break L25;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_50_0 = 2 & var11 ^ -1;
                                                    stackIn_51_0 = stackOut_50_0;
                                                    break L24;
                                                  }
                                                  if (stackIn_51_0 != -1) {
                                                    var12 = 0;
                                                    L29: while (true) {
                                                      stackOut_54_0 = var12 ^ -1;
                                                      stackOut_54_1 = var5 ^ -1;
                                                      stackIn_55_0 = stackOut_54_0;
                                                      stackIn_55_1 = stackOut_54_1;
                                                      L30: while (true) {
                                                        L31: {
                                                          if (stackIn_55_0 <= stackIn_55_1) {
                                                            break L31;
                                                          } else {
                                                            stackOut_56_0 = 0;
                                                            stackIn_35_0 = stackOut_56_0;
                                                            stackIn_57_0 = stackOut_56_0;
                                                            if (var15 != 0) {
                                                              break L20;
                                                            } else {
                                                              var13 = stackIn_57_0;
                                                              L32: while (true) {
                                                                L33: {
                                                                  if (var6 <= var13) {
                                                                    break L33;
                                                                  } else {
                                                                    dupTemp$2 = var16.a((byte) -67);
                                                                    var9[var12 - -(var5 * var13)] = dupTemp$2;
                                                                    var14 = dupTemp$2;
                                                                    stackOut_59_0 = var10;
                                                                    stackOut_59_1 = var14 ^ -1;
                                                                    stackIn_55_0 = stackOut_59_0;
                                                                    stackIn_55_1 = stackOut_59_1;
                                                                    stackIn_60_0 = stackOut_59_0;
                                                                    stackIn_60_1 = stackOut_59_1;
                                                                    if (var15 != 0) {
                                                                      continue L30;
                                                                    } else {
                                                                      L34: {
                                                                        stackOut_60_0 = stackIn_60_0;
                                                                        stackIn_62_0 = stackOut_60_0;
                                                                        stackIn_61_0 = stackOut_60_0;
                                                                        if (stackIn_60_1 == 0) {
                                                                          stackOut_62_0 = stackIn_62_0;
                                                                          stackOut_62_1 = 0;
                                                                          stackIn_63_0 = stackOut_62_0;
                                                                          stackIn_63_1 = stackOut_62_1;
                                                                          break L34;
                                                                        } else {
                                                                          stackOut_61_0 = stackIn_61_0;
                                                                          stackOut_61_1 = 1;
                                                                          stackIn_63_0 = stackOut_61_0;
                                                                          stackIn_63_1 = stackOut_61_1;
                                                                          break L34;
                                                                        }
                                                                      }
                                                                      var10 = stackIn_63_0 | stackIn_63_1;
                                                                      var13++;
                                                                      if (var15 == 0) {
                                                                        continue L32;
                                                                      } else {
                                                                        break L33;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var12++;
                                                                if (var15 == 0) {
                                                                  continue L29;
                                                                } else {
                                                                  break L31;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        if (var15 == 0) {
                                                          break L21;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                            }
                                            var12 = 0;
                                            L35: while (true) {
                                              L36: {
                                                L37: {
                                                  if (var12 >= var7) {
                                                    break L37;
                                                  } else {
                                                    var8[var12] = var16.a((byte) -90);
                                                    var12++;
                                                    if (var15 != 0) {
                                                      break L36;
                                                    } else {
                                                      if (var15 == 0) {
                                                        continue L35;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                  }
                                                }
                                                if (-1 != (var11 & 2 ^ -1)) {
                                                  break L36;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              var12 = 0;
                                              L38: while (true) {
                                                if (var12 >= var7) {
                                                  break L21;
                                                } else {
                                                  dupTemp$3 = var16.a((byte) 102);
                                                  var9[var12] = dupTemp$3;
                                                  var13 = dupTemp$3;
                                                  stackOut_75_0 = var10;
                                                  stackOut_75_1 = var13;
                                                  stackOut_75_2 = -1;
                                                  stackIn_36_0 = stackOut_75_0;
                                                  stackIn_36_1 = stackOut_75_1;
                                                  stackIn_36_2 = stackOut_75_2;
                                                  stackIn_76_0 = stackOut_75_0;
                                                  stackIn_76_1 = stackOut_75_1;
                                                  stackIn_76_2 = stackOut_75_2;
                                                  if (var15 != 0) {
                                                    break L19;
                                                  } else {
                                                    L39: {
                                                      stackOut_76_0 = stackIn_76_0;
                                                      stackIn_78_0 = stackOut_76_0;
                                                      stackIn_77_0 = stackOut_76_0;
                                                      if (stackIn_76_1 == stackIn_76_2) {
                                                        stackOut_78_0 = stackIn_78_0;
                                                        stackOut_78_1 = 0;
                                                        stackIn_79_0 = stackOut_78_0;
                                                        stackIn_79_1 = stackOut_78_1;
                                                        break L39;
                                                      } else {
                                                        stackOut_77_0 = stackIn_77_0;
                                                        stackOut_77_1 = 1;
                                                        stackIn_79_0 = stackOut_77_0;
                                                        stackIn_79_1 = stackOut_77_1;
                                                        break L39;
                                                      }
                                                    }
                                                    var10 = stackIn_79_0 | stackIn_79_1;
                                                    var12++;
                                                    if (var15 == 0) {
                                                      continue L38;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          ne.field_e[var4] = var10 != 0;
                                          var4++;
                                          if (var15 == 0) {
                                            stackOut_34_0 = var4 ^ -1;
                                            stackIn_35_0 = stackOut_34_0;
                                            break L20;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        stackOut_35_0 = stackIn_35_0;
                                        stackOut_35_1 = iw.field_n;
                                        stackOut_35_2 = -1;
                                        stackIn_36_0 = stackOut_35_0;
                                        stackIn_36_1 = stackOut_35_1;
                                        stackIn_36_2 = stackOut_35_2;
                                        break L19;
                                      }
                                      stackOut_36_0 = stackIn_36_0;
                                      stackOut_36_1 = stackIn_36_1 ^ stackIn_36_2;
                                      stackIn_37_0 = stackOut_36_0;
                                      stackIn_37_1 = stackOut_36_1;
                                      continue L18;
                                    }
                                  }
                                }
                              } else {
                                L40: {
                                  if (stackIn_30_0 != stackIn_30_1) {
                                    break L40;
                                  } else {
                                    qv.field_j[var4] = 1;
                                    break L40;
                                  }
                                }
                                var4++;
                                if (var15 == 0) {
                                  continue L14;
                                } else {
                                  break L17;
                                }
                              }
                            }
                          }
                          var17.field_q = 0;
                          var4 = 0;
                          L41: while (true) {
                            stackOut_34_0 = var4 ^ -1;
                            stackIn_35_0 = stackOut_34_0;
                            L42: while (true) {
                              stackOut_35_0 = stackIn_35_0;
                              stackOut_35_1 = iw.field_n;
                              stackOut_35_2 = -1;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              stackIn_36_2 = stackOut_35_2;
                              L43: while (true) {
                                stackOut_36_0 = stackIn_36_0;
                                stackOut_36_1 = stackIn_36_1 ^ stackIn_36_2;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                if (stackIn_37_0 <= stackIn_37_1) {
                                  break L15;
                                } else {
                                  var5 = qm.field_K[var4];
                                  var6 = c.field_e[var4];
                                  var7 = var6 * var5;
                                  var20 = new byte[var7];
                                  var18 = var20;
                                  var8 = var18;
                                  vj.field_j[var4] = var20;
                                  var21 = new byte[var7];
                                  var19 = var21;
                                  var9 = var19;
                                  cq.field_z[var4] = var21;
                                  var10 = 0;
                                  var11 = var17.k(0);
                                  if (var15 != 0) {
                                    break L16;
                                  } else {
                                    L44: {
                                      L45: {
                                        if ((1 & var11 ^ -1) == -1) {
                                          break L45;
                                        } else {
                                          var12 = 0;
                                          L46: while (true) {
                                            L47: {
                                              L48: {
                                                if ((var5 ^ -1) >= (var12 ^ -1)) {
                                                  break L48;
                                                } else {
                                                  stackOut_42_0 = 0;
                                                  stackIn_51_0 = stackOut_42_0;
                                                  stackIn_43_0 = stackOut_42_0;
                                                  if (var15 != 0) {
                                                    break L47;
                                                  } else {
                                                    var13 = stackIn_43_0;
                                                    L49: while (true) {
                                                      L50: {
                                                        L51: {
                                                          if ((var6 ^ -1) >= (var13 ^ -1)) {
                                                            break L51;
                                                          } else {
                                                            var8[var13 * var5 + var12] = var16.a((byte) -106);
                                                            var13++;
                                                            if (var15 != 0) {
                                                              break L50;
                                                            } else {
                                                              if (var15 == 0) {
                                                                continue L49;
                                                              } else {
                                                                break L51;
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var12++;
                                                        break L50;
                                                      }
                                                      if (var15 == 0) {
                                                        continue L46;
                                                      } else {
                                                        break L48;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              stackOut_50_0 = 2 & var11 ^ -1;
                                              stackIn_51_0 = stackOut_50_0;
                                              break L47;
                                            }
                                            if (stackIn_51_0 != -1) {
                                              var12 = 0;
                                              L52: while (true) {
                                                stackOut_54_0 = var12 ^ -1;
                                                stackOut_54_1 = var5 ^ -1;
                                                stackIn_55_0 = stackOut_54_0;
                                                stackIn_55_1 = stackOut_54_1;
                                                L53: while (true) {
                                                  L54: {
                                                    if (stackIn_55_0 <= stackIn_55_1) {
                                                      break L54;
                                                    } else {
                                                      stackOut_56_0 = 0;
                                                      stackIn_35_0 = stackOut_56_0;
                                                      stackIn_57_0 = stackOut_56_0;
                                                      if (var15 != 0) {
                                                        continue L42;
                                                      } else {
                                                        var13 = stackIn_57_0;
                                                        L55: while (true) {
                                                          L56: {
                                                            if (var6 <= var13) {
                                                              break L56;
                                                            } else {
                                                              dupTemp$2 = var16.a((byte) -67);
                                                              var9[var12 - -(var5 * var13)] = dupTemp$2;
                                                              var14 = dupTemp$2;
                                                              stackOut_59_0 = var10;
                                                              stackOut_59_1 = var14 ^ -1;
                                                              stackIn_55_0 = stackOut_59_0;
                                                              stackIn_55_1 = stackOut_59_1;
                                                              stackIn_60_0 = stackOut_59_0;
                                                              stackIn_60_1 = stackOut_59_1;
                                                              if (var15 != 0) {
                                                                continue L53;
                                                              } else {
                                                                L57: {
                                                                  stackOut_60_0 = stackIn_60_0;
                                                                  stackIn_62_0 = stackOut_60_0;
                                                                  stackIn_61_0 = stackOut_60_0;
                                                                  if (stackIn_60_1 == 0) {
                                                                    stackOut_62_0 = stackIn_62_0;
                                                                    stackOut_62_1 = 0;
                                                                    stackIn_63_0 = stackOut_62_0;
                                                                    stackIn_63_1 = stackOut_62_1;
                                                                    break L57;
                                                                  } else {
                                                                    stackOut_61_0 = stackIn_61_0;
                                                                    stackOut_61_1 = 1;
                                                                    stackIn_63_0 = stackOut_61_0;
                                                                    stackIn_63_1 = stackOut_61_1;
                                                                    break L57;
                                                                  }
                                                                }
                                                                var10 = stackIn_63_0 | stackIn_63_1;
                                                                var13++;
                                                                if (var15 == 0) {
                                                                  continue L55;
                                                                } else {
                                                                  break L56;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          var12++;
                                                          if (var15 == 0) {
                                                            continue L52;
                                                          } else {
                                                            break L54;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (var15 == 0) {
                                                    break L44;
                                                  } else {
                                                    break L45;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L44;
                                            }
                                          }
                                        }
                                      }
                                      var12 = 0;
                                      L58: while (true) {
                                        L59: {
                                          L60: {
                                            if (var12 >= var7) {
                                              break L60;
                                            } else {
                                              var8[var12] = var16.a((byte) -90);
                                              var12++;
                                              if (var15 != 0) {
                                                break L59;
                                              } else {
                                                if (var15 == 0) {
                                                  continue L58;
                                                } else {
                                                  break L60;
                                                }
                                              }
                                            }
                                          }
                                          if (-1 != (var11 & 2 ^ -1)) {
                                            break L59;
                                          } else {
                                            break L44;
                                          }
                                        }
                                        var12 = 0;
                                        L61: while (true) {
                                          if (var12 >= var7) {
                                            break L44;
                                          } else {
                                            dupTemp$3 = var16.a((byte) 102);
                                            var9[var12] = dupTemp$3;
                                            var13 = dupTemp$3;
                                            stackOut_75_0 = var10;
                                            stackOut_75_1 = var13;
                                            stackOut_75_2 = -1;
                                            stackIn_36_0 = stackOut_75_0;
                                            stackIn_36_1 = stackOut_75_1;
                                            stackIn_36_2 = stackOut_75_2;
                                            stackIn_76_0 = stackOut_75_0;
                                            stackIn_76_1 = stackOut_75_1;
                                            stackIn_76_2 = stackOut_75_2;
                                            if (var15 != 0) {
                                              continue L43;
                                            } else {
                                              L62: {
                                                stackOut_76_0 = stackIn_76_0;
                                                stackIn_78_0 = stackOut_76_0;
                                                stackIn_77_0 = stackOut_76_0;
                                                if (stackIn_76_1 == stackIn_76_2) {
                                                  stackOut_78_0 = stackIn_78_0;
                                                  stackOut_78_1 = 0;
                                                  stackIn_79_0 = stackOut_78_0;
                                                  stackIn_79_1 = stackOut_78_1;
                                                  break L62;
                                                } else {
                                                  stackOut_77_0 = stackIn_77_0;
                                                  stackOut_77_1 = 1;
                                                  stackIn_79_0 = stackOut_77_0;
                                                  stackIn_79_1 = stackOut_77_1;
                                                  break L62;
                                                }
                                              }
                                              var10 = stackIn_79_0 | stackIn_79_1;
                                              var12++;
                                              if (var15 == 0) {
                                                continue L61;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    ne.field_e[var4] = var10 != 0;
                                    var4++;
                                    if (var15 == 0) {
                                      continue L41;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L63: {
            var2 = decompiledCaughtException;
            stackOut_82_0 = (RuntimeException) (var2);
            stackOut_82_1 = new StringBuilder().append("b.B(");
            stackIn_84_0 = stackOut_82_0;
            stackIn_84_1 = stackOut_82_1;
            stackIn_83_0 = stackOut_82_0;
            stackIn_83_1 = stackOut_82_1;
            if (param0 == null) {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "null";
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              stackIn_85_2 = stackOut_84_2;
              break L63;
            } else {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "{...}";
              stackIn_85_0 = stackOut_83_0;
              stackIn_85_1 = stackOut_83_1;
              stackIn_85_2 = stackOut_83_2;
              break L63;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_85_0), stackIn_85_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        int discarded$0 = 0;
        field_n = null;
        if (!param0) {
            discarded$0 = b.a(94, 33, -110, (byte) 28, -37);
        }
    }

    final static int a(int param0, int param1, int param2, byte param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (-1 == (param0 ^ -1)) {
          return 1;
        } else {
          if (param1 != 0) {
            if (param3 == 25) {
              L0: {
                var5 = (-param4 + param0 * 2) * 500 / param0;
                var5 = Math.max(0, var5);
                if (-501 > (var5 ^ -1)) {
                  var6 = var5 - 500;
                  var5 = var6 / 3 + 500;
                  if ((var5 ^ -1) < -1001) {
                    var5 = 1000;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L1: {
                var6 = (2 * param1 - param2) * 500 / param1;
                var6 = Math.max(0, var6);
                if (var6 > 500) {
                  var7 = var6 + -500;
                  var6 = 500 + var7 / 2;
                  if ((var6 ^ -1) >= -1001) {
                    break L1;
                  } else {
                    var6 = 1000;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              return Math.max(100, Math.min(var5 - -var6, 2000));
            } else {
              return -81;
            }
          } else {
            return 1;
          }
        }
    }

    b() {
        this.field_m = false;
    }

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_n = (la) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              stackOut_4_0 = var2_int ^ -1;
              stackOut_4_1 = wp.field_H.length ^ -1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_5_0 <= stackIn_5_1) {
                      break L5;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_17_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        var3 = stackIn_7_0;
                        L6: while (true) {
                          L7: {
                            if ((wp.field_H[var2_int].length ^ -1) >= (var3 ^ -1)) {
                              break L7;
                            } else {
                              stackOut_9_0 = wp.field_H[var2_int][var3] ^ -1;
                              stackOut_9_1 = param1 ^ -1;
                              stackIn_5_0 = stackOut_9_0;
                              stackIn_5_1 = stackOut_9_1;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              if (var4 != 0) {
                                continue L3;
                              } else {
                                if (stackIn_10_0 == stackIn_10_1) {
                                  stackOut_12_0 = var3;
                                  stackIn_13_0 = stackOut_12_0;
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  var3++;
                                  if (var4 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "b.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
    }
}
