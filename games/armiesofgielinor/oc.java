/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends je {
    private int field_Kb;
    static String[] field_Pb;
    static String field_Nb;
    private je field_Lb;
    private StringBuilder field_Qb;
    private je field_Mb;
    static String field_Ib;
    static String field_Jb;
    static String field_Ob;

    public static void k(int param0) {
        field_Jb = null;
        field_Pb = null;
        field_Ib = null;
        field_Nb = null;
        if (param0 != 0) {
          field_Jb = null;
          field_Ob = null;
          return;
        } else {
          field_Ob = null;
          return;
        }
    }

    final int b(boolean param0, boolean param1) {
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((oc) this).a(param0, param1);
        if (!param1) {
          ((oc) this).field_Mb.field_X = ((oc) this).field_Qb.toString();
          if (param1) {
            if (0 != tr.field_A) {
              if (((oc) this).field_yb == 0) {
                L0: {
                  ((oc) this).field_Kb = 1;
                  if (param0) {
                    break L0;
                  } else {
                    int discarded$11 = ((oc) this).b(false, true);
                    break L0;
                  }
                }
                return ((oc) this).field_Kb;
              } else {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    int discarded$12 = ((oc) this).b(false, true);
                    break L1;
                  }
                }
                return ((oc) this).field_Kb;
              }
            } else {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  int discarded$13 = ((oc) this).b(false, true);
                  break L2;
                }
              }
              return ((oc) this).field_Kb;
            }
          } else {
            L3: {
              if (param0) {
                break L3;
              } else {
                int discarded$14 = ((oc) this).b(false, true);
                break L3;
              }
            }
            return ((oc) this).field_Kb;
          }
        } else {
          L4: while (true) {
            if (!jd.i((byte) -51)) {
              L5: {
                ((oc) this).field_Mb.field_X = ((oc) this).field_Qb.toString();
                if (0 == tr.field_A) {
                  break L5;
                } else {
                  if (((oc) this).field_yb != 0) {
                    break L5;
                  } else {
                    ((oc) this).field_Kb = 1;
                    if (!param0) {
                      int discarded$15 = ((oc) this).b(false, true);
                      return ((oc) this).field_Kb;
                    } else {
                      return ((oc) this).field_Kb;
                    }
                  }
                }
              }
              if (!param0) {
                int discarded$16 = ((oc) this).b(false, true);
                return ((oc) this).field_Kb;
              } else {
                return ((oc) this).field_Kb;
              }
            } else {
              L6: {
                if (-86 != (rs.field_q ^ -1)) {
                  break L6;
                } else {
                  if ((((oc) this).field_Qb.length() ^ -1) >= -1) {
                    break L6;
                  } else {
                    StringBuilder discarded$17 = up.a(' ', -1 + ((oc) this).field_Qb.length(), ((oc) this).field_Qb, true);
                    break L6;
                  }
                }
              }
              L7: {
                if (kv.a(false, (CharSequence) (Object) ((oc) this).field_Qb, ui.field_i)) {
                  StringBuilder discarded$18 = ((oc) this).field_Qb.append(ui.field_i);
                  break L7;
                } else {
                  L8: {
                    if (((oc) this).field_Qb.length() != 0) {
                      break L8;
                    } else {
                      if (91 == ui.field_i) {
                        StringBuilder discarded$19 = ((oc) this).field_Qb.append(ui.field_i);
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (-2 != (((oc) this).field_Qb.length() ^ -1)) {
                      break L9;
                    } else {
                      if (ui.field_i == 35) {
                        StringBuilder discarded$20 = ((oc) this).field_Qb.append(ui.field_i);
                        break L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (ui.field_i == 93) {
                    StringBuilder discarded$21 = ((oc) this).field_Qb.append(ui.field_i);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              if (rs.field_q != -85) {
                if ((rs.field_q ^ -1) != -14) {
                  continue L4;
                } else {
                  return 1;
                }
              } else {
                if (-1 >= ((oc) this).field_Qb.length()) {
                  return 1;
                } else {
                  ((oc) this).field_X = ((oc) this).field_Qb.toString();
                  return 2;
                }
              }
            }
          }
        }
    }

    final boolean d(byte param0) {
        int var2 = 0;
        if (0 != ((oc) this).field_Kb) {
          return false;
        } else {
          if (rs.field_q == 85) {
            if ((((oc) this).field_Qb.length() ^ -1) < -1) {
              StringBuilder discarded$13 = up.a(' ', ((oc) this).field_Qb.length() - 1, ((oc) this).field_Qb, true);
              if (((oc) this).field_Qb.length() > -13) {
                L0: {
                  var2 = Character.toLowerCase(ui.field_i);
                  if (var2 != 32) {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if (-1 <= ((oc) this).field_Qb.length()) {
                        break L0;
                      } else {
                        StringBuilder discarded$14 = ((oc) this).field_Qb.append(var2);
                        break L0;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if (-1 >= ((oc) this).field_Qb.length()) {
                        break L0;
                      } else {
                        StringBuilder discarded$15 = ((oc) this).field_Qb.append(var2);
                        break L0;
                      }
                    }
                  }
                }
                if (ni.a((byte) -125, (char) var2)) {
                  StringBuilder discarded$16 = ((oc) this).field_Qb.append(var2);
                  if (84 == rs.field_q) {
                    if (((oc) this).field_Qb.length() <= 0) {
                      L1: {
                        ((oc) this).field_Kb = 1;
                        if (-14 == rs.field_q) {
                          ((oc) this).field_Kb = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L2: {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        if (-14 == rs.field_q) {
                          ((oc) this).field_Kb = 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L3: {
                      if (-14 == (rs.field_q ^ -1)) {
                        ((oc) this).field_Kb = 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  if (mu.a(28799, (char) var2)) {
                    StringBuilder discarded$17 = ((oc) this).field_Qb.append(var2);
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        L4: {
                          ((oc) this).field_Kb = 1;
                          if (-14 == rs.field_q) {
                            ((oc) this).field_Kb = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        if (param0 == -101) {
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        L5: {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          if (-14 == rs.field_q) {
                            ((oc) this).field_Kb = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        if (param0 == -101) {
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      L6: {
                        if (-14 == (rs.field_q ^ -1)) {
                          ((oc) this).field_Kb = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L7: {
                      if (84 == rs.field_q) {
                        if (((oc) this).field_Qb.length() <= 0) {
                          ((oc) this).field_Kb = 1;
                          break L7;
                        } else {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (-14 == (rs.field_q ^ -1)) {
                        ((oc) this).field_Kb = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              } else {
                if (84 == rs.field_q) {
                  if (((oc) this).field_Qb.length() <= 0) {
                    L9: {
                      ((oc) this).field_Kb = 1;
                      if (-14 == rs.field_q) {
                        ((oc) this).field_Kb = 1;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L10: {
                      ((oc) this).field_X = ((oc) this).field_Qb.toString();
                      ((oc) this).field_Kb = 2;
                      if (-14 == rs.field_q) {
                        ((oc) this).field_Kb = 1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L11: {
                    if (-14 == (rs.field_q ^ -1)) {
                      ((oc) this).field_Kb = 1;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            } else {
              if (((oc) this).field_Qb.length() > -13) {
                L12: {
                  var2 = Character.toLowerCase(ui.field_i);
                  if (var2 != 32) {
                    if (var2 != 95) {
                      break L12;
                    } else {
                      if (-1 <= ((oc) this).field_Qb.length()) {
                        break L12;
                      } else {
                        StringBuilder discarded$18 = ((oc) this).field_Qb.append(var2);
                        break L12;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L12;
                    } else {
                      if (-1 >= ((oc) this).field_Qb.length()) {
                        break L12;
                      } else {
                        StringBuilder discarded$19 = ((oc) this).field_Qb.append(var2);
                        break L12;
                      }
                    }
                  }
                }
                if (ni.a((byte) -125, (char) var2)) {
                  L13: {
                    StringBuilder discarded$20 = ((oc) this).field_Qb.append(var2);
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        ((oc) this).field_Kb = 1;
                        break L13;
                      } else {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-14 == (rs.field_q ^ -1)) {
                      ((oc) this).field_Kb = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  if (mu.a(28799, (char) var2)) {
                    L15: {
                      StringBuilder discarded$21 = ((oc) this).field_Qb.append(var2);
                      if (84 == rs.field_q) {
                        if (((oc) this).field_Qb.length() <= 0) {
                          ((oc) this).field_Kb = 1;
                          break L15;
                        } else {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (-14 == rs.field_q) {
                        ((oc) this).field_Kb = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L17: {
                      if (84 == rs.field_q) {
                        if (((oc) this).field_Qb.length() <= 0) {
                          ((oc) this).field_Kb = 1;
                          break L17;
                        } else {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (-14 == (rs.field_q ^ -1)) {
                        ((oc) this).field_Kb = 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    if (param0 != -101) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                if (84 == rs.field_q) {
                  if (((oc) this).field_Qb.length() <= 0) {
                    L19: {
                      ((oc) this).field_Kb = 1;
                      if (-14 == rs.field_q) {
                        ((oc) this).field_Kb = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L20: {
                      ((oc) this).field_X = ((oc) this).field_Qb.toString();
                      ((oc) this).field_Kb = 2;
                      if (-14 == rs.field_q) {
                        ((oc) this).field_Kb = 1;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L21: {
                    if (-14 == rs.field_q) {
                      ((oc) this).field_Kb = 1;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
          } else {
            if (((oc) this).field_Qb.length() > -13) {
              L22: {
                var2 = Character.toLowerCase(ui.field_i);
                if (var2 != 32) {
                  if (var2 != 95) {
                    break L22;
                  } else {
                    if (-1 <= ((oc) this).field_Qb.length()) {
                      break L22;
                    } else {
                      StringBuilder discarded$22 = ((oc) this).field_Qb.append(var2);
                      break L22;
                    }
                  }
                } else {
                  if (var2 != 95) {
                    break L22;
                  } else {
                    if (-1 >= ((oc) this).field_Qb.length()) {
                      break L22;
                    } else {
                      StringBuilder discarded$23 = ((oc) this).field_Qb.append(var2);
                      break L22;
                    }
                  }
                }
              }
              if (ni.a((byte) -125, (char) var2)) {
                L23: {
                  StringBuilder discarded$24 = ((oc) this).field_Qb.append(var2);
                  if (84 == rs.field_q) {
                    if (((oc) this).field_Qb.length() <= 0) {
                      ((oc) this).field_Kb = 1;
                      break L23;
                    } else {
                      ((oc) this).field_X = ((oc) this).field_Qb.toString();
                      ((oc) this).field_Kb = 2;
                      break L23;
                    }
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (-14 == (rs.field_q ^ -1)) {
                    ((oc) this).field_Kb = 1;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                if (param0 != -101) {
                  return false;
                } else {
                  return true;
                }
              } else {
                if (mu.a(28799, (char) var2)) {
                  L25: {
                    StringBuilder discarded$25 = ((oc) this).field_Qb.append(var2);
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        ((oc) this).field_Kb = 1;
                        break L25;
                      } else {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-14 == rs.field_q) {
                      ((oc) this).field_Kb = 1;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  L27: {
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        ((oc) this).field_Kb = 1;
                        break L27;
                      } else {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (-14 == (rs.field_q ^ -1)) {
                      ((oc) this).field_Kb = 1;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              if (84 == rs.field_q) {
                if (((oc) this).field_Qb.length() <= 0) {
                  L29: {
                    ((oc) this).field_Kb = 1;
                    if (-14 == rs.field_q) {
                      ((oc) this).field_Kb = 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  L30: {
                    ((oc) this).field_X = ((oc) this).field_Qb.toString();
                    ((oc) this).field_Kb = 2;
                    if (-14 == rs.field_q) {
                      ((oc) this).field_Kb = 1;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  if (param0 != -101) {
                    return false;
                  } else {
                    return true;
                  }
                }
              } else {
                L31: {
                  if (-14 == rs.field_q) {
                    ((oc) this).field_Kb = 1;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                if (param0 != -101) {
                  return false;
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    oc(int param0, int param1, int param2, int param3, String param4, je param5, je param6, je param7) {
        super(0L, param5);
        ((oc) this).field_Kb = 0;
        ((oc) this).field_Lb = new je(0L, param6, param4);
        ((oc) this).a(((oc) this).field_Lb, 112);
        ((oc) this).field_Mb = new je(0L, param7);
        ((oc) this).field_Mb.field_N = 16764006;
        ((oc) this).a(((oc) this).field_Mb, 74);
        ((oc) this).field_Mb.field_I = "|";
        ((oc) this).field_Qb = new StringBuilder(12);
        int var9 = ((oc) this).field_Lb.j(122);
        ((oc) this).field_Lb.a(jn.field_d, -20500, var9, 3, 5);
        ((oc) this).field_Mb.a(jn.field_d, -20500, var9, 3 + jn.field_d, 5);
        int var10 = var9 + 5 + 5;
        int var11 = 3 + (2 * jn.field_d + 3);
        int var12 = jp.a(param0, param2, var10, -1);
        int var13 = pd.a(var11, 0, param1, param3);
        ((oc) this).a(var11, -20500, var10, var13, var12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "<%0> has declined the invitation.";
        field_Jb = "Type your email address again to make sure it's correct";
        field_Ib = "<%0> must play <%1> more rated games before playing with the current options.";
        field_Pb = new String[]{"All scores", "My scores", "Best each"};
        field_Ob = "That name is not available";
    }
}
