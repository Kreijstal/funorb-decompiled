/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static vc field_d;
    static int field_e;
    static int field_c;
    static String field_g;
    static int field_f;
    static ui field_a;
    static String[] field_b;

    final static void a(int param0, ll param1, int param2) {
        ih var3 = null;
        var3 = ud.field_b;
        var3.e(8, param2);
        if (param0 != -14722) {
          return;
        } else {
          var3.a(-11, 5);
          var3.a(-11, 0);
          var3.b((byte) 112, param1.field_k);
          var3.a(-11, param1.field_q);
          var3.a(-11, param1.field_t);
          return;
        }
    }

    final static String a(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_16_0 = null;
        String stackOut_5_0 = null;
        String stackOut_15_0 = null;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var1 = "(" + hc.field_j + " " + rj.field_k + " " + vi.field_a + ") " + be.field_a;
            if ((pd.field_l ^ -1) >= -1) {
              break L2;
            } else {
              var1 = var1 + ":";
              var2 = 0;
              L3: while (true) {
                if (pd.field_l <= var2) {
                  break L2;
                } else {
                  stackOut_5_0 = var1 + 32;
                  stackIn_16_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L4: {
                      L5: {
                        var1 = stackIn_6_0;
                        var3 = 255 & ae.field_a.field_k[var2];
                        var4 = var3 >> -383249756;
                        if (var4 < 10) {
                          break L5;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var4 += 48;
                      break L4;
                    }
                    L6: {
                      L7: {
                        var3 = var3 & 15;
                        var1 = var1 + (char)var4;
                        if (var3 >= 10) {
                          break L7;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var3 += 55;
                      break L6;
                    }
                    var1 = var1 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackOut_15_0 = (String) var1;
          stackIn_16_0 = stackOut_15_0;
          break L1;
        }
        return stackIn_16_0;
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
            return;
        }
        field_g = null;
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param1 == 67) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param0 < 65) {
                break L3;
              } else {
                if (param0 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param0 < 97) {
                break L4;
              } else {
                if (param0 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static int a(int param0, int param1, boolean param2, ad param3, int param4, String param5, ad param6) {
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        CharSequence var14 = null;
        ni stackIn_15_0 = null;
        ni stackIn_16_0 = null;
        ni stackIn_17_0 = null;
        String stackIn_17_1 = null;
        ni stackIn_18_0 = null;
        ni stackIn_19_0 = null;
        ni stackIn_20_0 = null;
        String stackIn_20_1 = null;
        ni stackOut_14_0 = null;
        ni stackOut_16_0 = null;
        String stackOut_16_1 = null;
        ni stackOut_15_0 = null;
        String stackOut_15_1 = null;
        ni stackOut_17_0 = null;
        ni stackOut_19_0 = null;
        String stackOut_19_1 = null;
        ni stackOut_18_0 = null;
        String stackOut_18_1 = null;
        L0: {
          var13 = fleas.field_A ? 1 : 0;
          var7 = param3.b(param1 ^ -15051);
          var11_ref_String = var7;
          var11_ref_String = var7;
          var8 = param6.b(-127);
          var11_ref_String = var8;
          var11_ref_String = var8;
          if (null == sg.field_h) {
            if (id.a(false, false)) {
              break L0;
            } else {
              return -1;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == 15021) {
            break L1;
          } else {
            field_c = -74;
            break L1;
          }
        }
        L2: {
          if (rh.field_k == d.field_O) {
            L3: {
              L4: {
                bb.field_A = null;
                ud.field_b.field_i = 0;
                if (param5 == null) {
                  break L4;
                } else {
                  L5: {
                    var9 = 0;
                    sd.field_i.field_i = 0;
                    if (!param2) {
                      break L5;
                    } else {
                      var9 = var9 | 1;
                      break L5;
                    }
                  }
                  L6: {
                    sd.field_i.a(jj.field_R.nextInt(), (byte) -63);
                    sd.field_i.a(jj.field_R.nextInt(), (byte) -15);
                    sd.field_i.a(var7, (byte) 61);
                    sd.field_i.a(var8, (byte) -113);
                    var14 = (CharSequence) (Object) param5;
                    sd.field_i.a(qb.a(var14, (byte) -76), (byte) 75);
                    sd.field_i.b((byte) 111, param4);
                    sd.field_i.a(param1 + -15032, param0);
                    sd.field_i.a(-11, var9);
                    ud.field_b.a(-11, 18);
                    ud.field_b.field_i = ud.field_b.field_i + 2;
                    var10 = ud.field_b.field_i;
                    var11_ref_String = w.a(0, rl.a((byte) -62));
                    if (var11_ref_String != null) {
                      break L6;
                    } else {
                      var11_ref_String = "";
                      break L6;
                    }
                  }
                  ud.field_b.a(param1 + -15147, var11_ref_String);
                  cg.a(fj.field_c, -126, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
                  ud.field_b.a((byte) 121, -var10 + ud.field_b.field_i);
                  if (var13 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                sd.field_i.field_i = 0;
                sd.field_i.a(jj.field_R.nextInt(), (byte) -102);
                sd.field_i.a(jj.field_R.nextInt(), (byte) -98);
                stackOut_14_0 = sd.field_i;
                stackIn_16_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (!param3.a(47)) {
                  stackOut_16_0 = (ni) (Object) stackIn_16_0;
                  stackOut_16_1 = "";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L7;
                } else {
                  stackOut_15_0 = (ni) (Object) stackIn_15_0;
                  stackOut_15_1 = (String) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  break L7;
                }
              }
              L8: {
                ((ni) (Object) stackIn_17_0).a(stackIn_17_1, (byte) -109);
                stackOut_17_0 = sd.field_i;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (!param6.a(42)) {
                  stackOut_19_0 = (ni) (Object) stackIn_19_0;
                  stackOut_19_1 = "";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L8;
                } else {
                  stackOut_18_0 = (ni) (Object) stackIn_18_0;
                  stackOut_18_1 = (String) var8;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L8;
                }
              }
              ((ni) (Object) stackIn_20_0).a(stackIn_20_1, (byte) -124);
              ud.field_b.a(-11, 16);
              ud.field_b.field_i = ud.field_b.field_i + 1;
              var9 = ud.field_b.field_i;
              cg.a(fj.field_c, -120, sd.field_i, (ni) (Object) ud.field_b, de.field_k);
              ud.field_b.c((byte) -31, ud.field_b.field_i - var9);
              break L3;
            }
            dk.b((byte) 41, -1);
            rh.field_k = ue.field_c;
            break L2;
          } else {
            break L2;
          }
        }
        L9: {
          if (rh.field_k == ue.field_c) {
            if (!gi.a(1, true)) {
              break L9;
            } else {
              L10: {
                var9 = ae.field_a.e(false);
                ae.field_a.field_i = 0;
                if (100 > var9) {
                  break L10;
                } else {
                  if (-106 <= (var9 ^ -1)) {
                    rh.field_k = u.field_b;
                    tc.field_e = new String[var9 - 100];
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if (248 == var9) {
                  break L11;
                } else {
                  L12: {
                    if (var9 != 99) {
                      break L12;
                    } else {
                      boolean discarded$1 = gi.a(cm.b(param1 ^ 15059), true);
                      bb.field_A = new Boolean(sd.a((ni) (Object) ae.field_a, 16448));
                      ae.field_a.field_i = 0;
                      if (var13 == 0) {
                        break L9;
                      } else {
                        break L12;
                      }
                    }
                  }
                  rh.field_k = gd.field_b;
                  pd.field_l = -1;
                  be.field_a = var9;
                  break L11;
                }
              }
              bj.a(14, rl.a((byte) -80));
              fh.field_a = rf.field_q;
              k.c(-28354);
              aa.field_q = false;
              return var9;
            }
          } else {
            break L9;
          }
        }
        L13: {
          if (u.field_b != rh.field_k) {
            break L13;
          } else {
            var9 = 2;
            if (gi.a(var9, true)) {
              var10 = ae.field_a.d((byte) -111);
              ae.field_a.field_i = 0;
              if (gi.a(var10, true)) {
                var11 = tc.field_e.length;
                var12 = 0;
                L14: while (true) {
                  L15: {
                    if (var12 >= var11) {
                      k.c(-28354);
                      aa.field_q = false;
                      break L15;
                    } else {
                      tc.field_e[var12] = ae.field_a.e(-84);
                      var12++;
                      if (var13 != 0) {
                        break L15;
                      } else {
                        continue L14;
                      }
                    }
                  }
                  return 100 + var11;
                }
              } else {
                break L13;
              }
            } else {
              break L13;
            }
          }
        }
        L16: {
          if (rh.field_k == gd.field_b) {
            if (gf.b(param1 + -14911)) {
              L17: {
                L18: {
                  if ((be.field_a ^ -1) != -256) {
                    break L18;
                  } else {
                    L19: {
                      var9_ref_String = ae.field_a.a((byte) -115);
                      if (var9_ref_String != null) {
                        ea.a(376, rl.a((byte) -93), var9_ref_String);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (var13 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                fh.field_a = ae.field_a.h(param1 + -15021);
                break L17;
              }
              k.c(param1 ^ -21613);
              aa.field_q = false;
              return be.field_a;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        if (sg.field_h == null) {
          if (aa.field_q) {
            L20: {
              L21: {
                if (h.b(param1 ^ 15050) <= 30000L) {
                  break L21;
                } else {
                  fh.field_a = ok.field_B;
                  if (var13 == 0) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              fh.field_a = jc.field_d;
              break L20;
            }
            aa.field_q = false;
            return 249;
          } else {
            var9 = be.field_b;
            be.field_b = ab.field_d;
            ab.field_d = var9;
            aa.field_q = true;
            return -1;
          }
        } else {
          return -1;
        }
    }

    final static void a(int param0) {
        ic.n(-125);
        cg.a((byte) -105, 4);
        if (param0 <= 37) {
            ak.a(50);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new vc();
        field_e = 0;
        field_g = "<%0>Wall:<%1> Fleas can walk on these, but can't climb up the sides.";
        field_c = 0;
        field_b = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
