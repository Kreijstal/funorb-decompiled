/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g extends RuntimeException {
    static tv field_c;
    static String field_e;
    Throwable field_b;
    static java.awt.Frame field_f;
    String field_g;
    static String field_a;
    static String field_d;

    public static void c(int param0) {
        field_f = null;
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != 1) {
          field_a = (String) null;
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        if (param0 != -85) {
            return;
        }
        lm.field_g = param2;
        bt.field_g = param1;
    }

    final static int a(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -1) {
          if ((param1 ^ -1) <= -4097) {
            L0: {
              if (-6145 >= (param1 ^ -1)) {
                stackOut_18_0 = e.field_a[-6144 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -e.field_a[-param1 + 6144];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param1 ^ -1) > -2049) {
                stackOut_14_0 = e.field_a[2048 + -param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = -e.field_a[-2048 + param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          g.a((byte) 1, -105, -40);
          if ((param1 ^ -1) <= -4097) {
            L2: {
              if (-6145 >= (param1 ^ -1)) {
                stackOut_8_0 = e.field_a[-6144 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -e.field_a[-param1 + 6144];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param1 ^ -1) > -2049) {
                stackOut_4_0 = e.field_a[2048 + -param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = -e.field_a[-2048 + param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void a(int param0, kl param1) {
        RuntimeException var2 = null;
        je var3 = null;
        kl var4 = null;
        je var6 = null;
        je var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              tl.field_e = ic.a("display_name_changed", (byte) 51, "basic", param1);
              mw.field_E = new mp(0L, br.field_g, h.field_b, wp.field_y);
              sc.field_g = new mp(0L, br.field_g, lm.field_a, jm.field_u);
              su.field_d = new je(0L, (je) null);
              bn.field_c = new je(0L, eq.field_h);
              bn.field_c.field_Eb = 1;
              wn.field_kb = new je(0L, te.field_p, su.field_b);
              ek.field_a = new je(0L, br.field_e, nl.field_C);
              hm.field_f = new je(0L, ms.field_k);
              su.field_d.a(bn.field_c, 49);
              su.field_d.a(wn.field_kb, 109);
              su.field_d.a(ek.field_a, 49);
              su.field_d.a(mw.field_E, 105);
              su.field_d.a(hm.field_f, 56);
              mw.field_E.field_Kb.field_Nb.a(param0 + 6145, eq.field_h);
              mw.field_E.field_Kb.field_Nb.field_Fb = 1;
              var6 = mw.field_E.field_Kb.field_Nb;
              var7 = var6;
              var7.field_Eb = 1;
              sc.field_g.field_Kb.field_Nb.a(0, eq.field_h);
              if (param0 == -6145) {
                break L1;
              } else {
                var4 = (kl) null;
                g.a(-105, (kl) null);
                break L1;
              }
            }
            sc.field_g.field_Kb.field_Nb.field_Fb = 1;
            var3 = sc.field_g.field_Kb.field_Nb;
            var3.field_Eb = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("g.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (0 < gk.field_J) {
          L0: {
            gk.field_J = gk.field_J - 1;
            if (-1 > (gk.field_J ^ -1)) {
              bh.d(false);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 > (bd.field_r ^ -1)) {
              qb.a(bd.field_r, -71);
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 != -6145) {
            return;
          } else {
            L2: {
              if (-1 <= (rk.field_D ^ -1)) {
                break L2;
              } else {
                qb.a(rk.field_D, param0 + 6255);
                break L2;
              }
            }
            return;
          }
        } else {
          if (-1 <= (bd.field_r ^ -1)) {
            if ((rk.field_D ^ -1) < -1) {
              rk.field_D = rk.field_D - 1;
              if (var2 != 0) {
                L3: {
                  gk.field_J = gk.field_J - 1;
                  if (-1 > (gk.field_J ^ -1)) {
                    bh.d(false);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-1 > (bd.field_r ^ -1)) {
                    qb.a(bd.field_r, -71);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param0 != -6145) {
                  return;
                } else {
                  L5: {
                    if (-1 <= (rk.field_D ^ -1)) {
                      break L5;
                    } else {
                      qb.a(rk.field_D, param0 + 6255);
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                L6: {
                  if (-1 > (gk.field_J ^ -1)) {
                    bh.d(false);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 > (bd.field_r ^ -1)) {
                    qb.a(bd.field_r, -71);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (param0 != -6145) {
                  return;
                } else {
                  L8: {
                    if (-1 <= (rk.field_D ^ -1)) {
                      break L8;
                    } else {
                      qb.a(rk.field_D, param0 + 6255);
                      break L8;
                    }
                  }
                  return;
                }
              }
            } else {
              L9: {
                if (-1 > (gk.field_J ^ -1)) {
                  bh.d(false);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (-1 > (bd.field_r ^ -1)) {
                  qb.a(bd.field_r, -71);
                  break L10;
                } else {
                  break L10;
                }
              }
              if (param0 != -6145) {
                return;
              } else {
                L11: {
                  if (-1 <= (rk.field_D ^ -1)) {
                    break L11;
                  } else {
                    qb.a(rk.field_D, param0 + 6255);
                    break L11;
                  }
                }
                return;
              }
            }
          } else {
            bd.field_r = bd.field_r - 1;
            if (var2 != 0) {
              if ((rk.field_D ^ -1) < -1) {
                rk.field_D = rk.field_D - 1;
                if (var2 == 0) {
                  L12: {
                    if (-1 > (gk.field_J ^ -1)) {
                      bh.d(false);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (-1 > (bd.field_r ^ -1)) {
                      qb.a(bd.field_r, -71);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  if (param0 != -6145) {
                    return;
                  } else {
                    L14: {
                      if (-1 <= (rk.field_D ^ -1)) {
                        break L14;
                      } else {
                        qb.a(rk.field_D, param0 + 6255);
                        break L14;
                      }
                    }
                    return;
                  }
                } else {
                  L15: {
                    gk.field_J = gk.field_J - 1;
                    if (-1 > (gk.field_J ^ -1)) {
                      bh.d(false);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (-1 > (bd.field_r ^ -1)) {
                      qb.a(bd.field_r, -71);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  if (param0 != -6145) {
                    return;
                  } else {
                    L17: {
                      if (-1 <= (rk.field_D ^ -1)) {
                        break L17;
                      } else {
                        qb.a(rk.field_D, param0 + 6255);
                        break L17;
                      }
                    }
                    return;
                  }
                }
              } else {
                L18: {
                  if (-1 > (gk.field_J ^ -1)) {
                    bh.d(false);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-1 > (bd.field_r ^ -1)) {
                    qb.a(bd.field_r, -71);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (param0 != -6145) {
                  return;
                } else {
                  L20: {
                    if (-1 <= (rk.field_D ^ -1)) {
                      break L20;
                    } else {
                      qb.a(rk.field_D, param0 + 6255);
                      break L20;
                    }
                  }
                  return;
                }
              }
            } else {
              L21: {
                if (-1 > (gk.field_J ^ -1)) {
                  bh.d(false);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (-1 > (bd.field_r ^ -1)) {
                  qb.a(bd.field_r, -71);
                  break L22;
                } else {
                  break L22;
                }
              }
              if (param0 != -6145) {
                return;
              } else {
                L23: {
                  if (-1 <= (rk.field_D ^ -1)) {
                    break L23;
                  } else {
                    qb.a(rk.field_D, param0 + 6255);
                    break L23;
                  }
                }
                return;
              }
            }
          }
        }
    }

    g(Throwable param0, String param1) {
        this.field_b = param0;
        this.field_g = param1;
    }

    final static boolean a(int param0) {
        dc var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        dc var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_21_0 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (dc) ((Object) tp.field_e.e((byte) 115));
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -17211) {
                  break L1;
                } else {
                  field_e = (String) null;
                  break L1;
                }
              }
              var2 = 0;
              L2: while (true) {
                L3: {
                  if (var2 >= var1.field_p) {
                    break L3;
                  } else {
                    L4: {
                      if (var4.field_k[var2] != null) {
                        if (-1 == (var4.field_k[var2].field_g ^ -1)) {
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var4.field_r[var2] == null) {
                        break L5;
                      } else {
                        if (0 == var4.field_r[var2].field_g) {
                          stackOut_18_0 = 0;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_21_0 = 1;
                stackIn_22_0 = stackOut_21_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "g.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_22_0 != 0;
            }
          }
        }
    }

    static {
        field_c = new tv();
        field_e = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4>-<%5></col>  Cost:<nbsp><col=ff0000><%6></col>";
        field_a = "If you are not, please change your password to something more obscure!";
        field_d = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
