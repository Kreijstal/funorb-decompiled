/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends ii {
    String field_bb;
    static int field_cb;
    static int field_eb;
    static int[] field_fb;
    String field_db;
    int field_gb;
    static String[] field_hb;

    final static int c(byte param0) {
        L0: {
          if (param0 >= 5) {
            break L0;
          } else {
            rb.h(-39);
            break L0;
          }
        }
        if ((mc.field_a ^ -1) <= -3) {
          L1: {
            if (fe.field_h != 0) {
              L2: {
                if (ec.field_a != null) {
                  if (ec.field_a.a(-58)) {
                    if (!ec.field_a.b("", (byte) -102)) {
                      return 29;
                    } else {
                      if (!ec.field_a.a(0, "")) {
                        return 29;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L2;
                }
              }
              if (!fj.field_B.a(93)) {
                return 43;
              } else {
                if (fj.field_B.a(0, "commonui")) {
                  if (hf.field_a.a(-90)) {
                    if (hf.field_a.a(0, "commonui")) {
                      if (!ii.field_m.a(-47)) {
                        return 82;
                      } else {
                        if (ii.field_m.b(0)) {
                          break L1;
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              }
            } else {
              if (fj.field_B.a(-46)) {
                if (fj.field_B.a(0, "commonui")) {
                  if (hf.field_a.a(-59)) {
                    if (hf.field_a.a(0, "commonui")) {
                      if (ii.field_m.a(107)) {
                        if (ii.field_m.b(0)) {
                          break L1;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            }
          }
          return 100;
        } else {
          return 0;
        }
    }

    final static void a(int param0, byte param1) {
        int[] array$2 = null;
        int[] array$3 = null;
        RuntimeException var2 = null;
        byte[] var2_array = null;
        gk var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var8 = 0;
        ki var9_ref_ki = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        Object var20 = null;
        ki var20_ref = null;
        int[] var21 = null;
        byte[] var22 = null;
        int[] var23 = null;
        int stackIn_6_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        byte stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        var20 = null;
        var16 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var22 = wc.field_d.a("level" + param0, "", param1 + 49);
            var19 = var22;
            var18 = var19;
            var2_array = var18;
            if (var18 != null) {
              L1: {
                var3 = new gk(var22);
                if (var3.a((byte) 114) != el.field_a) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var4 = stackIn_6_0;
                el.a(true, var3.a((byte) 114));
                var5 = var3.j(17277);
                if (var4 != 0) {
                  var6_int = 0;
                  L3: while (true) {
                    L4: {
                      if ((var5 ^ -1) >= (var6_int ^ -1)) {
                        break L4;
                      } else {
                        var20_ref = (ki) ((Object) ri.field_b.d(param1 + 4069));
                        var20_ref.a((byte) 126, var3);
                        ri.field_b.a(-8212, var20_ref);
                        var6_int++;
                        if (var16 != 0) {
                          break L2;
                        } else {
                          if (var16 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var5 = var3.j(17277);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              var23 = new int[var5];
              var21 = var23;
              var6 = var21;
              gb.field_o = 0;
              var17 = new int[var5];
              var8 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if ((var5 ^ -1) >= (var8 ^ -1)) {
                      break L7;
                    } else {
                      var9_ref_ki = (ki) ((Object) ri.field_b.d(4011));
                      var9_ref_ki.a((byte) 116, var3);
                      stackOut_16_0 = -3;
                      stackOut_16_1 = var9_ref_ki.field_w ^ -1;
                      stackIn_30_0 = stackOut_16_0;
                      stackIn_30_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (var16 != 0) {
                        break L6;
                      } else {
                        L8: {
                          L9: {
                            if (stackIn_17_0 == stackIn_17_1) {
                              break L9;
                            } else {
                              L10: {
                                if (3 != var9_ref_ki.field_w) {
                                  break L10;
                                } else {
                                  h.a(4, true);
                                  if (var16 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (5 != var9_ref_ki.field_w) {
                                break L8;
                              } else {
                                h.a(2, true);
                                if (var16 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                          h.a(3, true);
                          break L8;
                        }
                        L11: {
                          var9_ref_ki.c((byte) -113);
                          var6[var8] = (int)var9_ref_ki.field_B;
                          var17[var8] = (int)var9_ref_ki.field_q;
                          if ((var9_ref_ki.field_w ^ -1) == -1) {
                            gb.field_o = gb.field_o + 1;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ok.field_a.a(-8212, var9_ref_ki);
                        var8++;
                        if (var16 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  stackOut_29_0 = param1;
                  stackOut_29_1 = -58;
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  break L6;
                }
                L12: {
                  if (stackIn_30_0 == stackIn_30_1) {
                    break L12;
                  } else {
                    field_hb = (String[]) null;
                    break L12;
                  }
                }
                var8 = 1;
                L13: while (true) {
                  stackOut_33_0 = var5 ^ -1;
                  stackOut_33_1 = var8 ^ -1;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  L14: while (true) {
                    L15: {
                      L16: {
                        if (stackIn_34_0 >= stackIn_34_1) {
                          break L16;
                        } else {
                          var9 = var8 + -1;
                          var10 = var23[var8];
                          stackOut_35_0 = var17[var8];
                          stackIn_44_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (var16 != 0) {
                            break L15;
                          } else {
                            var11 = stackIn_36_0;
                            L17: while (true) {
                              L18: {
                                if (var9 < 0) {
                                  break L18;
                                } else {
                                  stackOut_38_0 = var10;
                                  stackOut_38_1 = var23[var9];
                                  stackIn_34_0 = stackOut_38_0;
                                  stackIn_34_1 = stackOut_38_1;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  if (var16 != 0) {
                                    continue L14;
                                  } else {
                                    if (stackIn_39_0 >= stackIn_39_1) {
                                      break L18;
                                    } else {
                                      var6[var9 + 1] = var23[var9];
                                      var17[1 + var9] = var17[var9];
                                      var9--;
                                      if (var16 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                              var6[1 + var9] = var10;
                              var17[1 + var9] = var11;
                              var8++;
                              if (var16 == 0) {
                                continue L13;
                              } else {
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      var8 = 15;
                      var9 = var23[0];
                      var10 = var23[0];
                      pd.field_f = new int[32];
                      ib.field_c = 0;
                      mc.field_e = new int[32][4];
                      stackOut_43_0 = var17[0];
                      stackIn_44_0 = stackOut_43_0;
                      break L15;
                    }
                    var11 = stackIn_44_0;
                    var12 = 0;
                    var13 = 1;
                    L19: while (true) {
                      L20: {
                        L21: {
                          if ((var13 ^ -1) <= (var5 ^ -1)) {
                            break L21;
                          } else {
                            stackOut_46_0 = var8;
                            stackOut_46_1 = var23[var13] - var9;
                            stackIn_59_0 = stackOut_46_0;
                            stackIn_59_1 = stackOut_46_1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            if (var16 != 0) {
                              break L20;
                            } else {
                              L22: {
                                if (stackIn_47_0 >= stackIn_47_1) {
                                  break L22;
                                } else {
                                  pd.field_f[var12] = (var9 + var10) / 2;
                                  var14 = var11 / dj.field_a[0].field_n - -1;
                                  array$2 = new int[var14];
                                  mc.field_e[var12] = array$2;
                                  var15 = 0;
                                  L23: while (true) {
                                    L24: {
                                      L25: {
                                        if (var14 <= var15) {
                                          break L25;
                                        } else {
                                          mc.field_e[var12][var15] = pf.a((byte) -128, 16);
                                          var15++;
                                          if (var16 != 0) {
                                            break L24;
                                          } else {
                                            if (var16 == 0) {
                                              continue L23;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                      }
                                      var11 = var17[var13];
                                      var12++;
                                      break L24;
                                    }
                                    var9 = var23[var13];
                                    break L22;
                                  }
                                }
                              }
                              L26: {
                                if ((var11 ^ -1) <= (var17[var13] ^ -1)) {
                                  break L26;
                                } else {
                                  var11 = var17[var13];
                                  break L26;
                                }
                              }
                              var10 = var23[var13];
                              var13++;
                              if (var16 == 0) {
                                continue L19;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        pd.field_f[var12] = (var10 - -var9) / 2;
                        stackOut_58_0 = var11 / dj.field_a[0].field_n;
                        stackOut_58_1 = -1;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        break L20;
                      }
                      var13 = stackIn_59_0 - stackIn_59_1;
                      array$3 = new int[var13];
                      mc.field_e[var12] = array$3;
                      var14 = 0;
                      L27: while (true) {
                        L28: {
                          L29: {
                            if ((var14 ^ -1) <= (var13 ^ -1)) {
                              break L29;
                            } else {
                              mc.field_e[var12][var14] = pf.a((byte) 92, 16);
                              var14++;
                              if (var16 != 0) {
                                break L28;
                              } else {
                                if (var16 == 0) {
                                  continue L27;
                                } else {
                                  break L29;
                                }
                              }
                            }
                          }
                          var12++;
                          ib.field_c = var12;
                          break L28;
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "rb.B(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_fb = null;
        field_hb = null;
        if (param0 > -114) {
            field_eb = -20;
        }
    }

    final static void h(int param0) {
        vh.a(ba.field_f, (byte) -125);
        if (param0 != 3591) {
            field_eb = -116;
        }
        ba.field_f.a((byte) -107, rc.field_k);
        ie.field_e.requestFocus();
        ba.field_f = null;
    }

    rb() {
        super(0L, (ii) null);
    }

    static {
        field_hb = new String[]{"Explorer in the Mist", "King of the Jungle", "Nut Cracker", "See No Monkey", "Hear No Monkey", "Speak No Monkey", "Monkeying Around", "Bad Monkey", "Naughty Monkey", "Cheeky Monkey"};
    }
}
