/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static float field_c;
    static String field_e;
    static String[] field_f;
    static v field_d;
    static r field_a;
    static String[] field_b;

    public static void a(int param0) {
        field_f = null;
        if (param0 < -78) {
          field_b = null;
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          em.a((byte) -63, 112);
          field_b = null;
          field_a = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        hg var2 = null;
        int var3 = 0;
        var2 = gk.field_g;
        var2.g(param1, 8);
        var2.field_l = var2.field_l + 1;
        var3 = var2.field_l;
        var2.a(2, -124);
        var2.a(kn.field_E, kn.field_E.length, 0, (byte) -121);
        var2.a(aa.field_e, -111);
        var2.a(qc.field_c, 77);
        if (param0 == -55) {
          var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
          var2.b(var2.field_l - var3, -1);
          return;
        } else {
          field_b = null;
          var2.a(pm.field_p, pm.field_p.length, 0, (byte) -105);
          var2.b(var2.field_l - var3, -1);
          return;
        }
    }

    final static void b(int param0) {
        int var4 = Virogrid.field_F ? 1 : 0;
        int[] var5 = ph.field_o;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    final static v a(int param0, int param1, eh param2, boolean param3, eh param4) {
        if (hn.a(param2, param0, param1, (byte) 109)) {
          if (!param3) {
            return pm.a(-9618, param4.a(param0, param1, 0));
          } else {
            em.b(20);
            return pm.a(-9618, param4.a(param0, param1, 0));
          }
        } else {
          return null;
        }
    }

    final static void a(boolean param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_24_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_209_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_163_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        wa.field_F = wa.field_F + 1;
        if (-1 == uh.field_c) {
          if (sk.field_d == -1) {
            L0: {
              L1: {
                uh.field_c = nl.field_u;
                sk.field_d = hk.field_Jb;
                if (param1 != null) {
                  if (param1.equals((Object) (Object) od.field_l)) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (od.field_l != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!ei.field_a) {
                  if (wa.field_F >= ed.field_a) {
                    if (wa.field_F >= nb.field_y + ed.field_a) {
                      stackOut_207_0 = 0;
                      stackIn_209_0 = stackOut_207_0;
                      break L2;
                    } else {
                      stackOut_206_0 = 1;
                      stackIn_209_0 = stackOut_206_0;
                      break L2;
                    }
                  } else {
                    stackOut_204_0 = 0;
                    stackIn_209_0 = stackOut_204_0;
                    break L2;
                  }
                } else {
                  stackOut_202_0 = 0;
                  stackIn_209_0 = stackOut_202_0;
                  break L2;
                }
              }
              L3: {
                var2 = stackIn_209_0;
                if (param1 == null) {
                  wa.field_F = 0;
                  break L3;
                } else {
                  L4: {
                    if (ei.field_a) {
                      break L4;
                    } else {
                      if (var2 != 0) {
                        break L4;
                      } else {
                        if (var2 == 0) {
                          break L0;
                        } else {
                          ei.field_a = true;
                          break L0;
                        }
                      }
                    }
                  }
                  wa.field_F = ed.field_a;
                  break L3;
                }
              }
              ge.field_b = sk.field_d;
              mc.field_a = uh.field_c;
              if (param1 == null) {
                if (var2 == 0) {
                  break L0;
                } else {
                  ei.field_a = true;
                  break L0;
                }
              } else {
                ei.field_a = false;
                break L0;
              }
            }
            L5: {
              od.field_l = param1;
              if (ei.field_a) {
                break L5;
              } else {
                if (ed.field_a <= wa.field_F) {
                  break L5;
                } else {
                  if (w.field_J) {
                    mc.field_a = uh.field_c;
                    wa.field_F = 0;
                    ge.field_b = sk.field_d;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              uh.field_c = -1;
              if (param0) {
                break L6;
              } else {
                field_b = null;
                break L6;
              }
            }
            L7: {
              sk.field_d = -1;
              if (!ei.field_a) {
                break L7;
              } else {
                if (wa.field_F == kl.field_E) {
                  ei.field_a = false;
                  wa.field_F = 0;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            return;
          } else {
            L8: {
              L9: {
                L10: {
                  if (param1 != null) {
                    if (param1.equals((Object) (Object) od.field_l)) {
                      break L9;
                    } else {
                      break L10;
                    }
                  } else {
                    if (od.field_l != null) {
                      break L9;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  if (!ei.field_a) {
                    if (wa.field_F >= ed.field_a) {
                      if (wa.field_F < nb.field_y + ed.field_a) {
                        stackOut_168_0 = 1;
                        stackIn_170_0 = stackOut_168_0;
                        break L11;
                      } else {
                        stackOut_167_0 = 0;
                        stackIn_170_0 = stackOut_167_0;
                        break L11;
                      }
                    } else {
                      stackOut_165_0 = 0;
                      stackIn_170_0 = stackOut_165_0;
                      break L11;
                    }
                  } else {
                    stackOut_163_0 = 0;
                    stackIn_170_0 = stackOut_163_0;
                    break L11;
                  }
                }
                var2 = stackIn_170_0;
                if (param1 == null) {
                  wa.field_F = 0;
                  uh.field_c = -1;
                  if (param0) {
                    break L8;
                  } else {
                    field_b = null;
                    break L8;
                  }
                } else {
                  L12: {
                    if (!ei.field_a) {
                      if (var2 == 0) {
                        wa.field_F = 0;
                        break L12;
                      } else {
                        wa.field_F = ed.field_a;
                        break L12;
                      }
                    } else {
                      wa.field_F = ed.field_a;
                      break L12;
                    }
                  }
                  ge.field_b = sk.field_d;
                  mc.field_a = uh.field_c;
                  if (param1 == null) {
                    if (var2 == 0) {
                      break L9;
                    } else {
                      ei.field_a = true;
                      break L9;
                    }
                  } else {
                    ei.field_a = false;
                    break L9;
                  }
                }
              }
              L13: {
                od.field_l = param1;
                if (ei.field_a) {
                  break L13;
                } else {
                  if (ed.field_a <= wa.field_F) {
                    break L13;
                  } else {
                    if (w.field_J) {
                      mc.field_a = uh.field_c;
                      wa.field_F = 0;
                      ge.field_b = sk.field_d;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              uh.field_c = -1;
              if (param0) {
                break L8;
              } else {
                field_b = null;
                break L8;
              }
            }
            L14: {
              sk.field_d = -1;
              if (!ei.field_a) {
                break L14;
              } else {
                if (wa.field_F == kl.field_E) {
                  ei.field_a = false;
                  wa.field_F = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
            }
            return;
          }
        } else {
          if (param1 != null) {
            if (!param1.equals((Object) (Object) od.field_l)) {
              L15: {
                if (!ei.field_a) {
                  if (wa.field_F >= ed.field_a) {
                    if (wa.field_F < nb.field_y + ed.field_a) {
                      stackOut_98_0 = 1;
                      stackIn_100_0 = stackOut_98_0;
                      break L15;
                    } else {
                      stackOut_97_0 = 0;
                      stackIn_100_0 = stackOut_97_0;
                      break L15;
                    }
                  } else {
                    stackOut_95_0 = 0;
                    stackIn_100_0 = stackOut_95_0;
                    break L15;
                  }
                } else {
                  stackOut_93_0 = 0;
                  stackIn_100_0 = stackOut_93_0;
                  break L15;
                }
              }
              L16: {
                var2 = stackIn_100_0;
                if (param1 != null) {
                  if (!ei.field_a) {
                    if (var2 != 0) {
                      wa.field_F = ed.field_a;
                      break L16;
                    } else {
                      wa.field_F = 0;
                      break L16;
                    }
                  } else {
                    wa.field_F = ed.field_a;
                    break L16;
                  }
                } else {
                  wa.field_F = 0;
                  break L16;
                }
              }
              L17: {
                ge.field_b = sk.field_d;
                mc.field_a = uh.field_c;
                if (param1 == null) {
                  if (var2 == 0) {
                    break L17;
                  } else {
                    ei.field_a = true;
                    break L17;
                  }
                } else {
                  ei.field_a = false;
                  break L17;
                }
              }
              L18: {
                od.field_l = param1;
                if (ei.field_a) {
                  break L18;
                } else {
                  if (ed.field_a <= wa.field_F) {
                    break L18;
                  } else {
                    if (w.field_J) {
                      mc.field_a = uh.field_c;
                      wa.field_F = 0;
                      ge.field_b = sk.field_d;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              uh.field_c = -1;
              if (!param0) {
                field_b = null;
                uh.field_c = -1;
                if (!param0) {
                  field_b = null;
                  L19: {
                    sk.field_d = -1;
                    if (!ei.field_a) {
                      break L19;
                    } else {
                      if (wa.field_F == kl.field_E) {
                        ei.field_a = false;
                        wa.field_F = 0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                  }
                  return;
                } else {
                  L20: {
                    sk.field_d = -1;
                    if (!ei.field_a) {
                      break L20;
                    } else {
                      if (wa.field_F == kl.field_E) {
                        ei.field_a = false;
                        wa.field_F = 0;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  return;
                }
              } else {
                L21: {
                  sk.field_d = -1;
                  if (!ei.field_a) {
                    break L21;
                  } else {
                    if (wa.field_F == kl.field_E) {
                      ei.field_a = false;
                      wa.field_F = 0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                return;
              }
            } else {
              L22: {
                od.field_l = param1;
                if (ei.field_a) {
                  break L22;
                } else {
                  if (ed.field_a <= wa.field_F) {
                    break L22;
                  } else {
                    if (w.field_J) {
                      mc.field_a = uh.field_c;
                      wa.field_F = 0;
                      ge.field_b = sk.field_d;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L23: {
                uh.field_c = -1;
                if (param0) {
                  break L23;
                } else {
                  field_b = null;
                  break L23;
                }
              }
              L24: {
                sk.field_d = -1;
                if (!ei.field_a) {
                  break L24;
                } else {
                  if (wa.field_F == kl.field_E) {
                    ei.field_a = false;
                    wa.field_F = 0;
                    break L24;
                  } else {
                    break L24;
                  }
                }
              }
              return;
            }
          } else {
            if (od.field_l == null) {
              L25: {
                if (!ei.field_a) {
                  if (wa.field_F >= ed.field_a) {
                    if (wa.field_F < nb.field_y + ed.field_a) {
                      stackOut_22_0 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      break L25;
                    } else {
                      stackOut_21_0 = 0;
                      stackIn_24_0 = stackOut_21_0;
                      break L25;
                    }
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_24_0 = stackOut_19_0;
                    break L25;
                  }
                } else {
                  stackOut_17_0 = 0;
                  stackIn_24_0 = stackOut_17_0;
                  break L25;
                }
              }
              L26: {
                var2 = stackIn_24_0;
                if (param1 != null) {
                  break L26;
                } else {
                  break L26;
                }
              }
              wa.field_F = 0;
              L27: {
                ge.field_b = sk.field_d;
                mc.field_a = uh.field_c;
                if (param1 == null) {
                  if (var2 == 0) {
                    L28: {
                      od.field_l = param1;
                      if (ei.field_a) {
                        break L28;
                      } else {
                        if (ed.field_a <= wa.field_F) {
                          break L28;
                        } else {
                          if (w.field_J) {
                            mc.field_a = uh.field_c;
                            wa.field_F = 0;
                            ge.field_b = sk.field_d;
                            break L28;
                          } else {
                            uh.field_c = -1;
                            if (param0) {
                              break L27;
                            } else {
                              field_b = null;
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    uh.field_c = -1;
                    if (param0) {
                      break L27;
                    } else {
                      field_b = null;
                      break L27;
                    }
                  } else {
                    ei.field_a = true;
                    mc.field_a = uh.field_c;
                    wa.field_F = 0;
                    ge.field_b = sk.field_d;
                    uh.field_c = -1;
                    if (param0) {
                      break L27;
                    } else {
                      field_b = null;
                      break L27;
                    }
                  }
                } else {
                  ei.field_a = false;
                  uh.field_c = -1;
                  if (param0) {
                    break L27;
                  } else {
                    field_b = null;
                    break L27;
                  }
                }
              }
              sk.field_d = -1;
              if (ei.field_a) {
                if (wa.field_F != kl.field_E) {
                  uh.field_c = -1;
                  if (!param0) {
                    field_b = null;
                    L29: {
                      sk.field_d = -1;
                      if (!ei.field_a) {
                        break L29;
                      } else {
                        if (wa.field_F == kl.field_E) {
                          ei.field_a = false;
                          wa.field_F = 0;
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                    }
                    return;
                  } else {
                    L30: {
                      sk.field_d = -1;
                      if (!ei.field_a) {
                        break L30;
                      } else {
                        if (wa.field_F == kl.field_E) {
                          ei.field_a = false;
                          wa.field_F = 0;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  ei.field_a = false;
                  wa.field_F = 0;
                  return;
                }
              } else {
                return;
              }
            } else {
              L31: {
                L32: {
                  od.field_l = param1;
                  if (ei.field_a) {
                    break L32;
                  } else {
                    if (ed.field_a <= wa.field_F) {
                      break L32;
                    } else {
                      if (w.field_J) {
                        mc.field_a = uh.field_c;
                        wa.field_F = 0;
                        ge.field_b = sk.field_d;
                        break L32;
                      } else {
                        uh.field_c = -1;
                        if (param0) {
                          break L31;
                        } else {
                          field_b = null;
                          break L31;
                        }
                      }
                    }
                  }
                }
                uh.field_c = -1;
                if (param0) {
                  break L31;
                } else {
                  field_b = null;
                  break L31;
                }
              }
              L33: {
                sk.field_d = -1;
                if (!ei.field_a) {
                  break L33;
                } else {
                  if (wa.field_F == kl.field_E) {
                    ei.field_a = false;
                    wa.field_F = 0;
                    break L33;
                  } else {
                    break L33;
                  }
                }
              }
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_e = "White";
        field_b = new String[]{"Dominate the grid to achieve victory!<br><br>Players take turns to select a piece and either clone it into an adjacent space, or jump it two spaces.<br><br>If a piece is cloned or jumped into a space that is next to one or more opposing pieces, it will automatically capture those pieces.<br><br>If the grid is filled before either player wipes out the other, the player with the most pieces on the grid wins.", "Each player has a limited amount of time to perform their move. If the timer ever reaches zero, a move is played for them by the easy AI. After three strikes in an online game, that player forfeits the game.<br><br>To rotate the board in game, use the arrow keys or the control panel at the lower-right-hand corner of the screen, or hold down the right mouse button while moving the mouse.<br><br>The circle button in the control panel will restore the default view.<br><br>You can zoom the camera in and out with the mouse wheel or with the up and down arrow keys."};
    }
}
