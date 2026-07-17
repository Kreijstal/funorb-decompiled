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
                ((oc) this).field_Kb = 1;
                if (param0) {
                  return ((oc) this).field_Kb;
                } else {
                  int discarded$11 = ((oc) this).b(false, true);
                  return ((oc) this).field_Kb;
                }
              } else {
                if (param0) {
                  return ((oc) this).field_Kb;
                } else {
                  int discarded$12 = ((oc) this).b(false, true);
                  return ((oc) this).field_Kb;
                }
              }
            } else {
              if (param0) {
                return ((oc) this).field_Kb;
              } else {
                int discarded$13 = ((oc) this).b(false, true);
                return ((oc) this).field_Kb;
              }
            }
          } else {
            if (param0) {
              return ((oc) this).field_Kb;
            } else {
              int discarded$14 = ((oc) this).b(false, true);
              return ((oc) this).field_Kb;
            }
          }
        } else {
          L0: while (true) {
            if (!jd.i((byte) -51)) {
              L1: {
                ((oc) this).field_Mb.field_X = ((oc) this).field_Qb.toString();
                if (!param1) {
                  break L1;
                } else {
                  if (0 == tr.field_A) {
                    break L1;
                  } else {
                    if (((oc) this).field_yb != 0) {
                      break L1;
                    } else {
                      ((oc) this).field_Kb = 1;
                      if (param0) {
                        return ((oc) this).field_Kb;
                      } else {
                        int discarded$15 = ((oc) this).b(false, true);
                        return ((oc) this).field_Kb;
                      }
                    }
                  }
                }
              }
              if (param0) {
                return ((oc) this).field_Kb;
              } else {
                int discarded$16 = ((oc) this).b(false, true);
                return ((oc) this).field_Kb;
              }
            } else {
              L2: {
                if (rs.field_q != 85) {
                  break L2;
                } else {
                  if (((oc) this).field_Qb.length() <= 0) {
                    break L2;
                  } else {
                    StringBuilder discarded$17 = up.a(' ', -1 + ((oc) this).field_Qb.length(), ((oc) this).field_Qb, true);
                    break L2;
                  }
                }
              }
              L3: {
                if (kv.a(false, (CharSequence) (Object) ((oc) this).field_Qb, ui.field_i)) {
                  StringBuilder discarded$18 = ((oc) this).field_Qb.append(ui.field_i);
                  break L3;
                } else {
                  L4: {
                    if (((oc) this).field_Qb.length() != 0) {
                      break L4;
                    } else {
                      if (91 == ui.field_i) {
                        StringBuilder discarded$19 = ((oc) this).field_Qb.append(ui.field_i);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (((oc) this).field_Qb.length() != 1) {
                      break L5;
                    } else {
                      if (ui.field_i == 35) {
                        StringBuilder discarded$20 = ((oc) this).field_Qb.append(ui.field_i);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (ui.field_i == 93) {
                    StringBuilder discarded$21 = ((oc) this).field_Qb.append(ui.field_i);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (rs.field_q != 84) {
                if (rs.field_q != 13) {
                  continue L0;
                } else {
                  return 1;
                }
              } else {
                if (((oc) this).field_Qb.length() > 0) {
                  ((oc) this).field_X = ((oc) this).field_Qb.toString();
                  return 2;
                } else {
                  return 1;
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
            if (((oc) this).field_Qb.length() > 0) {
              StringBuilder discarded$10 = up.a(' ', ((oc) this).field_Qb.length() - 1, ((oc) this).field_Qb, true);
              if (((oc) this).field_Qb.length() < 12) {
                L0: {
                  var2 = Character.toLowerCase(ui.field_i);
                  if (var2 != 32) {
                    break L0;
                  } else {
                    var2 = 95;
                    break L0;
                  }
                }
                L1: {
                  if (var2 != 95) {
                    break L1;
                  } else {
                    if (((oc) this).field_Qb.length() <= 0) {
                      break L1;
                    } else {
                      StringBuilder discarded$11 = ((oc) this).field_Qb.append(var2);
                      break L1;
                    }
                  }
                }
                if (ni.a((byte) -125, (char) var2)) {
                  StringBuilder discarded$12 = ((oc) this).field_Qb.append(var2);
                  if (84 == rs.field_q) {
                    if (((oc) this).field_Qb.length() <= 0) {
                      L2: {
                        ((oc) this).field_Kb = 1;
                        if (rs.field_q == 13) {
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
                    } else {
                      L3: {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        if (rs.field_q == 13) {
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
                    L4: {
                      if (rs.field_q == 13) {
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
                  }
                } else {
                  if (mu.a(28799, (char) var2)) {
                    StringBuilder discarded$13 = ((oc) this).field_Qb.append(var2);
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        L5: {
                          ((oc) this).field_Kb = 1;
                          if (rs.field_q == 13) {
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
                      } else {
                        L6: {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          if (rs.field_q == 13) {
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
                        if (rs.field_q == 13) {
                          ((oc) this).field_Kb = 1;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (param0 == -101) {
                        return true;
                      } else {
                        return false;
                      }
                    }
                  } else {
                    L8: {
                      if (84 == rs.field_q) {
                        if (((oc) this).field_Qb.length() <= 0) {
                          ((oc) this).field_Kb = 1;
                          break L8;
                        } else {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (rs.field_q == 13) {
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
                  }
                }
              } else {
                if (84 == rs.field_q) {
                  if (((oc) this).field_Qb.length() <= 0) {
                    L10: {
                      ((oc) this).field_Kb = 1;
                      if (rs.field_q == 13) {
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
                  } else {
                    L11: {
                      ((oc) this).field_X = ((oc) this).field_Qb.toString();
                      ((oc) this).field_Kb = 2;
                      if (rs.field_q == 13) {
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
                } else {
                  L12: {
                    if (rs.field_q == 13) {
                      ((oc) this).field_Kb = 1;
                      break L12;
                    } else {
                      break L12;
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
              if (((oc) this).field_Qb.length() < 12) {
                L13: {
                  var2 = Character.toLowerCase(ui.field_i);
                  if (var2 != 32) {
                    break L13;
                  } else {
                    var2 = 95;
                    break L13;
                  }
                }
                L14: {
                  if (var2 != 95) {
                    break L14;
                  } else {
                    if (((oc) this).field_Qb.length() <= 0) {
                      break L14;
                    } else {
                      StringBuilder discarded$14 = ((oc) this).field_Qb.append(var2);
                      break L14;
                    }
                  }
                }
                if (ni.a((byte) -125, (char) var2)) {
                  L15: {
                    StringBuilder discarded$15 = ((oc) this).field_Qb.append(var2);
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
                    if (rs.field_q == 13) {
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
                  if (mu.a(28799, (char) var2)) {
                    L17: {
                      StringBuilder discarded$16 = ((oc) this).field_Qb.append(var2);
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
                      if (rs.field_q == 13) {
                        ((oc) this).field_Kb = 1;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    L19: {
                      if (84 == rs.field_q) {
                        if (((oc) this).field_Qb.length() <= 0) {
                          ((oc) this).field_Kb = 1;
                          break L19;
                        } else {
                          ((oc) this).field_X = ((oc) this).field_Qb.toString();
                          ((oc) this).field_Kb = 2;
                          break L19;
                        }
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (rs.field_q == 13) {
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
                }
              } else {
                if (84 == rs.field_q) {
                  if (((oc) this).field_Qb.length() <= 0) {
                    L21: {
                      ((oc) this).field_Kb = 1;
                      if (rs.field_q == 13) {
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
                  } else {
                    L22: {
                      ((oc) this).field_X = ((oc) this).field_Qb.toString();
                      ((oc) this).field_Kb = 2;
                      if (rs.field_q == 13) {
                        ((oc) this).field_Kb = 1;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    if (param0 == -101) {
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  L23: {
                    if (rs.field_q == 13) {
                      ((oc) this).field_Kb = 1;
                      break L23;
                    } else {
                      break L23;
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
            if (((oc) this).field_Qb.length() < 12) {
              L24: {
                var2 = Character.toLowerCase(ui.field_i);
                if (var2 != 32) {
                  break L24;
                } else {
                  var2 = 95;
                  break L24;
                }
              }
              L25: {
                if (var2 != 95) {
                  break L25;
                } else {
                  if (((oc) this).field_Qb.length() <= 0) {
                    break L25;
                  } else {
                    StringBuilder discarded$17 = ((oc) this).field_Qb.append(var2);
                    break L25;
                  }
                }
              }
              if (ni.a((byte) -125, (char) var2)) {
                L26: {
                  StringBuilder discarded$18 = ((oc) this).field_Qb.append(var2);
                  if (84 == rs.field_q) {
                    if (((oc) this).field_Qb.length() <= 0) {
                      ((oc) this).field_Kb = 1;
                      break L26;
                    } else {
                      ((oc) this).field_X = ((oc) this).field_Qb.toString();
                      ((oc) this).field_Kb = 2;
                      break L26;
                    }
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (rs.field_q == 13) {
                    ((oc) this).field_Kb = 1;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                if (param0 == -101) {
                  return true;
                } else {
                  return false;
                }
              } else {
                if (mu.a(28799, (char) var2)) {
                  L28: {
                    StringBuilder discarded$19 = ((oc) this).field_Qb.append(var2);
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        ((oc) this).field_Kb = 1;
                        break L28;
                      } else {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        break L28;
                      }
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (rs.field_q == 13) {
                      ((oc) this).field_Kb = 1;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  L30: {
                    if (84 == rs.field_q) {
                      if (((oc) this).field_Qb.length() <= 0) {
                        ((oc) this).field_Kb = 1;
                        break L30;
                      } else {
                        ((oc) this).field_X = ((oc) this).field_Qb.toString();
                        ((oc) this).field_Kb = 2;
                        break L30;
                      }
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (rs.field_q == 13) {
                      ((oc) this).field_Kb = 1;
                      break L31;
                    } else {
                      break L31;
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
                  L32: {
                    ((oc) this).field_Kb = 1;
                    if (rs.field_q == 13) {
                      ((oc) this).field_Kb = 1;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  L33: {
                    ((oc) this).field_X = ((oc) this).field_Qb.toString();
                    ((oc) this).field_Kb = 2;
                    if (rs.field_q == 13) {
                      ((oc) this).field_Kb = 1;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                  if (param0 == -101) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                L34: {
                  if (rs.field_q == 13) {
                    ((oc) this).field_Kb = 1;
                    break L34;
                  } else {
                    break L34;
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
        }
    }

    oc(int param0, int param1, int param2, int param3, String param4, je param5, je param6, je param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((oc) this).field_Kb = 0;
        try {
          L0: {
            ((oc) this).field_Lb = new je(0L, param6, param4);
            ((oc) this).a(((oc) this).field_Lb, 112);
            ((oc) this).field_Mb = new je(0L, param7);
            ((oc) this).field_Mb.field_N = 16764006;
            ((oc) this).a(((oc) this).field_Mb, 74);
            ((oc) this).field_Mb.field_I = "|";
            ((oc) this).field_Qb = new StringBuilder(12);
            var9_int = ((oc) this).field_Lb.j(122);
            ((oc) this).field_Lb.a(jn.field_d, -20500, var9_int, 3, 5);
            ((oc) this).field_Mb.a(jn.field_d, -20500, var9_int, 3 + jn.field_d, 5);
            var10 = var9_int + 10;
            var11 = 3 + (2 * jn.field_d + 3);
            int discarded$1 = -1;
            var12 = jp.a(param0, param2, var10);
            var13 = pd.a(var11, 0, param1, param3);
            ((oc) this).a(var11, -20500, var10, var13, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("oc.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
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
