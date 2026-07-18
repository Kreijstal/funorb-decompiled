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
        this.a((byte) -102, param0, ((oi) this).field_c + 1);
        if (param1 >= -58) {
            int discarded$0 = ((oi) this).d(6, 81);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param2 <= param5) {
            if (param5 < param0) {
              hk.a(param3, param11, ge.field_i, param1, param0, param10, param7, param15, param6, param13, param8, param9, param2, param5, param14, param12, param4 ^ -972948596);
              break L0;
            } else {
              if (param0 > param2) {
                hk.a(param11, param3, ge.field_i, param1, param5, param7, param10, param14, param9, param13, param8, param6, param2, param0, param15, param12, -972948528);
                break L0;
              } else {
                hk.a(param1, param3, ge.field_i, param11, param5, param13, param10, param12, param9, param7, param6, param8, param0, param2, param15, param14, -972948528);
                break L0;
              }
            }
          } else {
            if (param2 < param0) {
              hk.a(param1, param11, ge.field_i, param3, param0, param13, param7, param12, param6, param10, param9, param8, param5, param2, param14, param15, param4 + -972948620);
              break L0;
            } else {
              if (param0 > param5) {
                hk.a(param11, param1, ge.field_i, param3, param2, param7, param13, param14, param8, param10, param9, param6, param5, param0, param12, param15, -972948528);
                break L0;
              } else {
                hk.a(param3, param1, ge.field_i, param11, param2, param10, param13, param15, param8, param7, param6, param9, param0, param5, param12, param14, -972948528);
                break L0;
              }
            }
          }
        }
        L1: {
          if (param4 == 92) {
            break L1;
          } else {
            oi.a(-117, 1, -102, -125, (byte) -77, -28, -81, -29, -117, 64, -77, -95, -125, -71, 10, -90);
            break L1;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (!(((oi) this).field_c >= param2)) {
            ((oi) this).field_c = param2;
        }
        if (param2 >= ((oi) this).field_h.length) {
            this.c(param2, 537);
        }
        ((oi) this).field_h[param2] = param1;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        field_e = null;
    }

    final int d(int param0, int param1) {
        if (((oi) this).field_c < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          if (param0 != -22544) {
            return 125;
          } else {
            return ((oi) this).field_h[param1];
          }
        }
    }

    private final void c(int param0, int param1) {
        int[] var4 = new int[this.a(64, param0)];
        int[] var3 = var4;
        gl.a(((oi) this).field_h, 0, var4, 0, ((oi) this).field_h.length);
        ((oi) this).field_h = var4;
    }

    final int b(int param0) {
        if (param0 != -1) {
            oi.a(-69, 61, -53, 117, (byte) -106, 42, -64, 124, -57, -110, 103, -105, 63, 4, -77, 36);
        }
        return ((oi) this).field_c - -1;
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
        if (param1 >= 0) {
          if (((oi) this).field_c < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            L0: {
              if (param1 == ((oi) this).field_c) {
                break L0;
              } else {
                gl.a(((oi) this).field_h, param1 - -1, ((oi) this).field_h, param1, ((oi) this).field_c + -param1);
                break L0;
              }
            }
            var3 = -21 / ((2 - param0) / 57);
            ((oi) this).field_c = ((oi) this).field_c - 1;
            return;
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
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
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        var16_ref = null;
        var19 = null;
        var20 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 148;
            var2 = 1;
            var3 = -21;
            var4_ref_ki = (ki) (Object) wd.field_h.a((byte) -117);
            L1: while (true) {
              if (var4_ref_ki == null) {
                L2: {
                  if (wd.field_h.b(-113) >= 6) {
                    break L2;
                  } else {
                    if (!hd.field_u.e(11253)) {
                      break L2;
                    } else {
                      if (ub.field_a) {
                        break L2;
                      } else {
                        if (lc.field_f) {
                          break L2;
                        } else {
                          var4 = 0;
                          var5 = 0;
                          var6 = 0;
                          var7 = 0;
                          var8 = 0;
                          var9_ref_ki = (ki) (Object) ok.field_a.a((byte) -117);
                          L3: while (true) {
                            if (var9_ref_ki == null) {
                              L4: {
                                if (var8 == 0) {
                                  stackOut_29_0 = 0;
                                  stackIn_30_0 = stackOut_29_0;
                                  break L4;
                                } else {
                                  stackOut_28_0 = 1;
                                  stackIn_30_0 = stackOut_28_0;
                                  break L4;
                                }
                              }
                              L5: {
                                stackOut_30_0 = stackIn_30_0;
                                stackIn_32_0 = stackOut_30_0;
                                stackIn_31_0 = stackOut_30_0;
                                if (var5 == 0) {
                                  stackOut_32_0 = stackIn_32_0;
                                  stackOut_32_1 = 0;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  break L5;
                                } else {
                                  stackOut_31_0 = stackIn_31_0;
                                  stackOut_31_1 = 1;
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  break L5;
                                }
                              }
                              L6: {
                                stackOut_33_0 = stackIn_33_0 + stackIn_33_1;
                                stackIn_35_0 = stackOut_33_0;
                                stackIn_34_0 = stackOut_33_0;
                                if (var4 != 0) {
                                  stackOut_35_0 = stackIn_35_0;
                                  stackOut_35_1 = 1;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  break L6;
                                } else {
                                  stackOut_34_0 = stackIn_34_0;
                                  stackOut_34_1 = 0;
                                  stackIn_36_0 = stackOut_34_0;
                                  stackIn_36_1 = stackOut_34_1;
                                  break L6;
                                }
                              }
                              L7: {
                                stackOut_36_0 = stackIn_36_0 + stackIn_36_1;
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_37_0 = stackOut_36_0;
                                if (var7 != 0) {
                                  stackOut_38_0 = stackIn_38_0;
                                  stackOut_38_1 = 1;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  break L7;
                                } else {
                                  stackOut_37_0 = stackIn_37_0;
                                  stackOut_37_1 = 0;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_39_1 = stackOut_37_1;
                                  break L7;
                                }
                              }
                              L8: {
                                stackOut_39_0 = stackIn_39_0;
                                stackOut_39_1 = stackIn_39_1;
                                stackIn_41_0 = stackOut_39_0;
                                stackIn_41_1 = stackOut_39_1;
                                stackIn_40_0 = stackOut_39_0;
                                stackIn_40_1 = stackOut_39_1;
                                if (var6 == 0) {
                                  stackOut_41_0 = stackIn_41_0;
                                  stackOut_41_1 = stackIn_41_1;
                                  stackOut_41_2 = 0;
                                  stackIn_42_0 = stackOut_41_0;
                                  stackIn_42_1 = stackOut_41_1;
                                  stackIn_42_2 = stackOut_41_2;
                                  break L8;
                                } else {
                                  stackOut_40_0 = stackIn_40_0;
                                  stackOut_40_1 = stackIn_40_1;
                                  stackOut_40_2 = 1;
                                  stackIn_42_0 = stackOut_40_0;
                                  stackIn_42_1 = stackOut_40_1;
                                  stackIn_42_2 = stackOut_40_2;
                                  break L8;
                                }
                              }
                              var9 = stackIn_42_0 + (stackIn_42_1 + stackIn_42_2);
                              var10 = 0;
                              var11 = 0;
                              var12 = 0;
                              var13 = 0;
                              var14 = 0;
                              var15 = 0;
                              var16_ref_ki = (ki) (Object) wd.field_h.c(-1);
                              L9: while (true) {
                                if (var16_ref_ki == null) {
                                  L10: {
                                    if (var12 <= 2) {
                                      break L10;
                                    } else {
                                      if (var9 > 1) {
                                        var4 = 0;
                                        var9--;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var11 <= 2) {
                                      break L11;
                                    } else {
                                      if (1 < var9) {
                                        var7 = 0;
                                        var9--;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var15 <= 2) {
                                      break L12;
                                    } else {
                                      if (1 >= var9) {
                                        break L12;
                                      } else {
                                        var9--;
                                        var8 = 0;
                                        break L12;
                                      }
                                    }
                                  }
                                  L13: {
                                    if (var13 <= 2) {
                                      break L13;
                                    } else {
                                      if (var9 <= 1) {
                                        break L13;
                                      } else {
                                        var9--;
                                        var5 = 0;
                                        break L13;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var14 <= 2) {
                                      break L14;
                                    } else {
                                      if (var9 > 1) {
                                        var9--;
                                        var6 = 0;
                                        break L14;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  if (var9 > 0) {
                                    L15: while (true) {
                                      if (wd.field_h.b(-65) >= 6) {
                                        break L2;
                                      } else {
                                        L16: {
                                          L17: {
                                            var16 = -1;
                                            var17 = pf.a((byte) 22, var9);
                                            var18 = -1;
                                            if (var7 == 0) {
                                              break L17;
                                            } else {
                                              var18++;
                                              if (~var17 != ~var18) {
                                                break L17;
                                              } else {
                                                var16 = 1;
                                                break L16;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var4 == 0) {
                                              break L18;
                                            } else {
                                              var18++;
                                              if (~var17 == ~var18) {
                                                var16 = 4;
                                                break L16;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var5 == 0) {
                                              break L19;
                                            } else {
                                              var18++;
                                              if (var17 == var18) {
                                                var16 = 3;
                                                break L16;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            if (var6 == 0) {
                                              break L20;
                                            } else {
                                              var18++;
                                              if (~var17 != ~var18) {
                                                break L20;
                                              } else {
                                                var16 = 0;
                                                break L16;
                                              }
                                            }
                                          }
                                          if (var8 == 0) {
                                            break L16;
                                          } else {
                                            var18++;
                                            if (var18 != var17) {
                                              break L16;
                                            } else {
                                              var16 = 2;
                                              break L16;
                                            }
                                          }
                                        }
                                        L21: {
                                          L22: {
                                            var19_ref = (ki) (Object) ri.field_b.d(4011);
                                            if (Math.random() < 0.95) {
                                              break L22;
                                            } else {
                                              if (dc.field_c < 3) {
                                                break L22;
                                              } else {
                                                if (var10 > 1) {
                                                  break L22;
                                                } else {
                                                  var19_ref.a(6, var16, -1);
                                                  h.a(1, true);
                                                  break L21;
                                                }
                                              }
                                            }
                                          }
                                          var19_ref.a(1, var16, -1);
                                          break L21;
                                        }
                                        var19_ref.field_q = -100.0f;
                                        var19_ref.field_B = -100.0f;
                                        wd.field_h.a(-8212, (ug) (Object) var19_ref);
                                        continue L15;
                                      }
                                    }
                                  } else {
                                    return;
                                  }
                                } else {
                                  L23: {
                                    if (var16_ref_ki.field_w == 6) {
                                      var10++;
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    var17 = var16_ref_ki.field_l;
                                    if (var17 != 4) {
                                      if (var17 == 1) {
                                        var11++;
                                        break L24;
                                      } else {
                                        if (3 != var17) {
                                          if (var17 != 0) {
                                            if (2 != var17) {
                                              break L24;
                                            } else {
                                              var15++;
                                              break L24;
                                            }
                                          } else {
                                            var14++;
                                            break L24;
                                          }
                                        } else {
                                          var13++;
                                          break L24;
                                        }
                                      }
                                    } else {
                                      var12++;
                                      break L24;
                                    }
                                  }
                                  var16_ref_ki = (ki) (Object) wd.field_h.a(true);
                                  continue L9;
                                }
                              }
                            } else {
                              L25: {
                                if (2 != var9_ref_ki.field_l) {
                                  break L25;
                                } else {
                                  var8 = 1;
                                  break L25;
                                }
                              }
                              L26: {
                                if (4 != var9_ref_ki.field_l) {
                                  break L26;
                                } else {
                                  var4 = 1;
                                  break L26;
                                }
                              }
                              L27: {
                                if (var9_ref_ki.field_l != 1) {
                                  break L27;
                                } else {
                                  var7 = 1;
                                  break L27;
                                }
                              }
                              L28: {
                                if (0 == var9_ref_ki.field_l) {
                                  var6 = 1;
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              L29: {
                                if (var9_ref_ki.field_l != 3) {
                                  break L29;
                                } else {
                                  var5 = 1;
                                  break L29;
                                }
                              }
                              var9_ref_ki = (ki) (Object) ok.field_a.d((byte) 63);
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                L30: {
                  if (var2 == 0) {
                    var4_ref_ki.f(-7);
                    var4_ref_ki.field_B = 602.0f;
                    var4_ref_ki.field_q = (float)var1_int;
                    var1_int += 59;
                    if (var4_ref_ki.field_w == 6) {
                      h.a(1, true);
                      break L30;
                    } else {
                      break L30;
                    }
                  } else {
                    var2 = 0;
                    var4_ref_ki.field_q = -100.0f;
                    var4_ref_ki.field_B = -100.0f;
                    break L30;
                  }
                }
                var4_ref_ki = (ki) (Object) wd.field_h.d((byte) 63);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "oi.J(" + 106 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3 = ((oi) this).field_h.length;
        L0: while (true) {
          if (var3 > param1) {
            return var3;
          } else {
            if (!((oi) this).field_a) {
              var3 = var3 + ((oi) this).field_b;
              continue L0;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((oi) this).field_b;
                continue L0;
              } else {
                var3 = 1;
                continue L0;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Just play";
        field_f = -1;
        field_i = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = new int[128];
        field_g = "Create a free Account";
    }
}
