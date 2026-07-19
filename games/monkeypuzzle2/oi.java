/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_d;
    private int field_b;
    private int field_c;
    private boolean field_a;
    static int field_f;
    static String field_g;
    private int[] field_h;
    static String field_i;
    static int[] field_e;

    final void b(int param0, int param1) {
        int discarded$0 = 0;
        this.a((byte) -102, param0, this.field_c + 1);
        if (param1 >= -58) {
            discarded$0 = this.d(6, 81);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          L1: {
            var17 = MonkeyPuzzle2.field_F ? 1 : 0;
            if ((param2 ^ -1) >= (param5 ^ -1)) {
              break L1;
            } else {
              L2: {
                if (param2 < param0) {
                  break L2;
                } else {
                  L3: {
                    if ((param0 ^ -1) < (param5 ^ -1)) {
                      break L3;
                    } else {
                      hk.a(param3, param1, ge.field_i, param11, param2, param10, param13, param15, param8, param7, param6, param9, param0, param5, param12, param14, -972948528);
                      if (var17 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  hk.a(param11, param1, ge.field_i, param3, param2, param7, param13, param14, param8, param10, param9, param6, param5, param0, param12, param15, -972948528);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              hk.a(param1, param11, ge.field_i, param3, param0, param13, param7, param12, param6, param10, param9, param8, param5, param2, param14, param15, param4 + -972948620);
              if (var17 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L4: {
            if (param5 < param0) {
              break L4;
            } else {
              L5: {
                if ((param0 ^ -1) < (param2 ^ -1)) {
                  break L5;
                } else {
                  hk.a(param1, param3, ge.field_i, param11, param5, param13, param10, param12, param9, param7, param6, param8, param0, param2, param15, param14, -972948528);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    break L5;
                  }
                }
              }
              hk.a(param11, param3, ge.field_i, param1, param5, param7, param10, param14, param9, param13, param8, param6, param2, param0, param15, param12, -972948528);
              if (var17 == 0) {
                break L0;
              } else {
                break L4;
              }
            }
          }
          hk.a(param3, param11, ge.field_i, param1, param0, param10, param7, param15, param6, param13, param8, param9, param2, param5, param14, param12, param4 ^ -972948596);
          break L0;
        }
        L6: {
          if (param4 == 92) {
            break L6;
          } else {
            oi.a(-117, 1, -102, -125, (byte) -77, -28, -81, -29, -117, 64, -77, -95, -125, -71, 10, -90);
            break L6;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (!((this.field_c ^ -1) <= (param2 ^ -1))) {
            this.field_c = param2;
        }
        if ((param2 ^ -1) <= (this.field_h.length ^ -1)) {
            this.c(param2, 537);
        }
        if (param0 > -73) {
            field_g = (String) null;
        }
        this.field_h[param2] = param1;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        field_e = null;
        if (param0 >= -78) {
            oi.a(-14);
        }
    }

    final int d(int param0, int param1) {
        if (!(this.field_c >= param1)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 != -22544) {
            return 125;
        }
        return this.field_h[param1];
    }

    private final void c(int param0, int param1) {
        if (param1 != 537) {
            return;
        }
        int[] var4 = new int[this.a(64, param0)];
        int[] var3 = var4;
        gl.a(this.field_h, 0, var4, 0, this.field_h.length);
        this.field_h = var4;
    }

    final int b(int param0) {
        if (param0 != -1) {
            oi.a(-69, 61, -53, 117, (byte) -106, 42, -64, 124, -57, -110, 103, -105, 63, 4, -77, 36);
        }
        return this.field_c - -1;
    }

    final static void a(int param0) {
        hi.field_b = gg.b(-11451);
        wg.field_j = new kj();
        if (param0 != -2) {
            oi.a(-67);
        }
        ll.a((byte) 91, true, true);
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (this.field_c >= param1) {
              L1: {
                if (param1 == this.field_c) {
                  break L1;
                } else {
                  gl.a(this.field_h, param1 - -1, this.field_h, param1, this.field_c + -param1);
                  break L1;
                }
              }
              var3 = -21 / ((2 - param0) / 57);
              this.field_c = this.field_c - 1;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private oi() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        ki var4_ref_ki = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ki var9_ref_ki = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16_ref = null;
        ki var16_ref_ki = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        ki var19_ref = null;
        int var20 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_46_2 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_98_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_97_0 = 0;
        var16_ref = null;
        var19 = null;
        var20 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 148;
            var2 = 1;
            var3 = -42 / ((param0 - -12) / 41);
            var4_ref_ki = (ki) ((Object) wd.field_h.a((byte) -117));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_ref_ki == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var20 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 == 0) {
                            break L5;
                          } else {
                            var2 = 0;
                            var4_ref_ki.field_q = -100.0f;
                            var4_ref_ki.field_B = -100.0f;
                            if (var20 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4_ref_ki.f(-7);
                        var4_ref_ki.field_B = 602.0f;
                        var4_ref_ki.field_q = (float)var1_int;
                        var1_int += 59;
                        if (-7 == (var4_ref_ki.field_w ^ -1)) {
                          h.a(1, true);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4_ref_ki = (ki) ((Object) wd.field_h.d((byte) 63));
                      if (var20 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = -7;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L6: {
                if (stackIn_11_0 >= (wd.field_h.b(-113) ^ -1)) {
                  break L6;
                } else {
                  if (!hd.field_u.e(11253)) {
                    break L6;
                  } else {
                    if (ub.field_a) {
                      break L6;
                    } else {
                      if (lc.field_f) {
                        break L6;
                      } else {
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;
                        var7 = 0;
                        var8 = 0;
                        var9_ref_ki = (ki) ((Object) ok.field_a.a((byte) -117));
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var9_ref_ki == null) {
                                break L9;
                              } else {
                                stackOut_17_0 = 2;
                                stackOut_17_1 = var9_ref_ki.field_l;
                                stackIn_34_0 = stackOut_17_0;
                                stackIn_34_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (var20 != 0) {
                                  break L8;
                                } else {
                                  L10: {
                                    if (stackIn_18_0 != stackIn_18_1) {
                                      break L10;
                                    } else {
                                      var8 = 1;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (4 != var9_ref_ki.field_l) {
                                      break L11;
                                    } else {
                                      var4 = 1;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (var9_ref_ki.field_l != 1) {
                                      break L12;
                                    } else {
                                      var7 = 1;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    if (0 == var9_ref_ki.field_l) {
                                      var6 = 1;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if ((var9_ref_ki.field_l ^ -1) != -4) {
                                      break L14;
                                    } else {
                                      var5 = 1;
                                      break L14;
                                    }
                                  }
                                  var9_ref_ki = (ki) ((Object) ok.field_a.d((byte) 63));
                                  if (var20 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            L15: {
                              if (var8 == 0) {
                                stackOut_32_0 = 0;
                                stackIn_33_0 = stackOut_32_0;
                                break L15;
                              } else {
                                stackOut_31_0 = 1;
                                stackIn_33_0 = stackOut_31_0;
                                break L15;
                              }
                            }
                            stackOut_33_0 = stackIn_33_0;
                            stackOut_33_1 = var5;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            break L8;
                          }
                          L16: {
                            stackOut_34_0 = stackIn_34_0;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (stackIn_34_1 == 0) {
                              stackOut_36_0 = stackIn_36_0;
                              stackOut_36_1 = 0;
                              stackIn_37_0 = stackOut_36_0;
                              stackIn_37_1 = stackOut_36_1;
                              break L16;
                            } else {
                              stackOut_35_0 = stackIn_35_0;
                              stackOut_35_1 = 1;
                              stackIn_37_0 = stackOut_35_0;
                              stackIn_37_1 = stackOut_35_1;
                              break L16;
                            }
                          }
                          L17: {
                            stackOut_37_0 = stackIn_37_0 + stackIn_37_1;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_38_0 = stackOut_37_0;
                            if (var4 != 0) {
                              stackOut_39_0 = stackIn_39_0;
                              stackOut_39_1 = 1;
                              stackIn_40_0 = stackOut_39_0;
                              stackIn_40_1 = stackOut_39_1;
                              break L17;
                            } else {
                              stackOut_38_0 = stackIn_38_0;
                              stackOut_38_1 = 0;
                              stackIn_40_0 = stackOut_38_0;
                              stackIn_40_1 = stackOut_38_1;
                              break L17;
                            }
                          }
                          L18: {
                            stackOut_40_0 = stackIn_40_0 + stackIn_40_1;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_41_0 = stackOut_40_0;
                            if (var7 != 0) {
                              stackOut_42_0 = stackIn_42_0;
                              stackOut_42_1 = 1;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              break L18;
                            } else {
                              stackOut_41_0 = stackIn_41_0;
                              stackOut_41_1 = 0;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              break L18;
                            }
                          }
                          L19: {
                            stackOut_43_0 = stackIn_43_0;
                            stackOut_43_1 = stackIn_43_1;
                            stackIn_45_0 = stackOut_43_0;
                            stackIn_45_1 = stackOut_43_1;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            if (var6 == 0) {
                              stackOut_45_0 = stackIn_45_0;
                              stackOut_45_1 = stackIn_45_1;
                              stackOut_45_2 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              stackIn_46_1 = stackOut_45_1;
                              stackIn_46_2 = stackOut_45_2;
                              break L19;
                            } else {
                              stackOut_44_0 = stackIn_44_0;
                              stackOut_44_1 = stackIn_44_1;
                              stackOut_44_2 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              stackIn_46_1 = stackOut_44_1;
                              stackIn_46_2 = stackOut_44_2;
                              break L19;
                            }
                          }
                          var9 = stackIn_46_0 + (stackIn_46_1 + stackIn_46_2);
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16_ref_ki = (ki) ((Object) wd.field_h.c(-1));
                          L20: while (true) {
                            L21: {
                              L22: {
                                if (var16_ref_ki == null) {
                                  break L22;
                                } else {
                                  stackOut_48_0 = -7;
                                  stackOut_48_1 = var16_ref_ki.field_w ^ -1;
                                  stackIn_76_0 = stackOut_48_0;
                                  stackIn_76_1 = stackOut_48_1;
                                  stackIn_49_0 = stackOut_48_0;
                                  stackIn_49_1 = stackOut_48_1;
                                  if (var20 != 0) {
                                    break L21;
                                  } else {
                                    L23: {
                                      if (stackIn_49_0 == stackIn_49_1) {
                                        var10++;
                                        break L23;
                                      } else {
                                        break L23;
                                      }
                                    }
                                    L24: {
                                      L25: {
                                        L26: {
                                          L27: {
                                            L28: {
                                              L29: {
                                                L30: {
                                                  var17 = var16_ref_ki.field_l;
                                                  if ((var17 ^ -1) != -5) {
                                                    break L30;
                                                  } else {
                                                    if (var20 == 0) {
                                                      break L29;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                if ((var17 ^ -1) == -2) {
                                                  break L28;
                                                } else {
                                                  L31: {
                                                    if (3 != var17) {
                                                      break L31;
                                                    } else {
                                                      if (var20 == 0) {
                                                        break L27;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                  L32: {
                                                    if (-1 != (var17 ^ -1)) {
                                                      break L32;
                                                    } else {
                                                      if (var20 == 0) {
                                                        break L26;
                                                      } else {
                                                        break L32;
                                                      }
                                                    }
                                                  }
                                                  if (2 != var17) {
                                                    break L24;
                                                  } else {
                                                    if (var20 == 0) {
                                                      break L25;
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                }
                                              }
                                              var12++;
                                              if (var20 == 0) {
                                                break L24;
                                              } else {
                                                break L28;
                                              }
                                            }
                                            var11++;
                                            if (var20 == 0) {
                                              break L24;
                                            } else {
                                              break L27;
                                            }
                                          }
                                          var13++;
                                          if (var20 == 0) {
                                            break L24;
                                          } else {
                                            break L26;
                                          }
                                        }
                                        var14++;
                                        if (var20 == 0) {
                                          break L24;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var15++;
                                      break L24;
                                    }
                                    var16_ref_ki = (ki) ((Object) wd.field_h.a(true));
                                    if (var20 == 0) {
                                      continue L20;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                              }
                              stackOut_75_0 = var12;
                              stackOut_75_1 = 2;
                              stackIn_76_0 = stackOut_75_0;
                              stackIn_76_1 = stackOut_75_1;
                              break L21;
                            }
                            L33: {
                              if (stackIn_76_0 <= stackIn_76_1) {
                                break L33;
                              } else {
                                if (var9 > 1) {
                                  var4 = 0;
                                  var9--;
                                  break L33;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            L34: {
                              if (-3 <= (var11 ^ -1)) {
                                break L34;
                              } else {
                                if (1 < var9) {
                                  var7 = 0;
                                  var9--;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            L35: {
                              if ((var15 ^ -1) >= -3) {
                                break L35;
                              } else {
                                if (1 >= var9) {
                                  break L35;
                                } else {
                                  var9--;
                                  var8 = 0;
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              if ((var13 ^ -1) >= -3) {
                                break L36;
                              } else {
                                if ((var9 ^ -1) >= -2) {
                                  break L36;
                                } else {
                                  var9--;
                                  var5 = 0;
                                  break L36;
                                }
                              }
                            }
                            L37: {
                              if (-3 <= (var14 ^ -1)) {
                                break L37;
                              } else {
                                if ((var9 ^ -1) < -2) {
                                  var9--;
                                  var6 = 0;
                                  break L37;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            if (var9 > 0) {
                              stackOut_96_0 = -7;
                              stackIn_98_0 = stackOut_96_0;
                              L38: while (true) {
                                if (stackIn_98_0 >= (wd.field_h.b(-65) ^ -1)) {
                                  break L6;
                                } else {
                                  var16 = -1;
                                  var17 = pf.a((byte) 22, var9);
                                  var18 = -1;
                                  if (var20 != 0) {
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  } else {
                                    L39: {
                                      L40: {
                                        if (var7 == 0) {
                                          break L40;
                                        } else {
                                          var18++;
                                          if ((var17 ^ -1) != (var18 ^ -1)) {
                                            break L40;
                                          } else {
                                            var16 = 1;
                                            if (var20 == 0) {
                                              break L39;
                                            } else {
                                              break L40;
                                            }
                                          }
                                        }
                                      }
                                      L41: {
                                        L42: {
                                          if (var4 == 0) {
                                            break L42;
                                          } else {
                                            var18++;
                                            if ((var17 ^ -1) == (var18 ^ -1)) {
                                              break L41;
                                            } else {
                                              break L42;
                                            }
                                          }
                                        }
                                        L43: {
                                          L44: {
                                            if (var5 == 0) {
                                              break L44;
                                            } else {
                                              var18++;
                                              if (var17 == var18) {
                                                break L43;
                                              } else {
                                                break L44;
                                              }
                                            }
                                          }
                                          L45: {
                                            if (var6 == 0) {
                                              break L45;
                                            } else {
                                              var18++;
                                              if ((var17 ^ -1) != (var18 ^ -1)) {
                                                break L45;
                                              } else {
                                                var16 = 0;
                                                if (var20 == 0) {
                                                  break L39;
                                                } else {
                                                  break L45;
                                                }
                                              }
                                            }
                                          }
                                          if (var8 == 0) {
                                            break L39;
                                          } else {
                                            var18++;
                                            if (var18 != var17) {
                                              break L39;
                                            } else {
                                              var16 = 2;
                                              if (var20 == 0) {
                                                break L39;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                        }
                                        var16 = 3;
                                        if (var20 == 0) {
                                          break L39;
                                        } else {
                                          break L41;
                                        }
                                      }
                                      var16 = 4;
                                      break L39;
                                    }
                                    L46: {
                                      L47: {
                                        var19_ref = (ki) ((Object) ri.field_b.d(4011));
                                        if (Math.random() < 0.95) {
                                          break L47;
                                        } else {
                                          if ((dc.field_c ^ -1) > -4) {
                                            break L47;
                                          } else {
                                            if ((var10 ^ -1) < -2) {
                                              break L47;
                                            } else {
                                              var19_ref.a(6, var16, -1);
                                              h.a(1, true);
                                              if (var20 == 0) {
                                                break L46;
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var19_ref.a(1, var16, -1);
                                      break L46;
                                    }
                                    var19_ref.field_q = -100.0f;
                                    var19_ref.field_B = -100.0f;
                                    wd.field_h.a(-8212, var19_ref);
                                    if (var20 == 0) {
                                      stackOut_97_0 = -7;
                                      stackIn_98_0 = stackOut_97_0;
                                      continue L38;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            } else {
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "oi.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackOut_4_0 = false;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 > 34) {
            break L0;
          } else {
            oi.a(118);
            break L0;
          }
        }
        var3 = this.field_h.length;
        L1: while (true) {
          L2: {
            if (var3 > param1) {
              break L2;
            } else {
              stackOut_4_0 = this.field_a;
              stackIn_11_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var4 != 0) {
                return stackIn_11_0 ? 1 : 0;
              } else {
                L3: {
                  if (!stackIn_5_0) {
                    break L3;
                  } else {
                    L4: {
                      if ((var3 ^ -1) != -1) {
                        break L4;
                      } else {
                        var3 = 1;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = var3 * this.field_b;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                var3 = var3 + this.field_b;
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return var3;
        }
    }

    static {
        field_d = "Just play";
        field_f = -1;
        field_i = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = new int[128];
        field_g = "Create a free Account";
    }
}
