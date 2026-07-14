/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends hd {
    private hd field_Cb;
    private hd field_Db;
    private int field_Fb;
    static boolean field_Eb;
    private StringBuilder field_yb;
    static String field_zb;
    static String field_Ab;
    static String field_Bb;

    sl(int param0, int param1, int param2, int param3, String param4, hd param5, hd param6, hd param7) {
        super(0L, param5);
        ((sl) this).field_Fb = 0;
        ((sl) this).field_Cb = new hd(0L, param6, param4);
        ((sl) this).a((byte) -124, ((sl) this).field_Cb);
        ((sl) this).field_Db = new hd(0L, param7);
        ((sl) this).field_Db.field_y = 16764006;
        ((sl) this).a((byte) -116, ((sl) this).field_Db);
        ((sl) this).field_Db.field_V = "|";
        ((sl) this).field_yb = new StringBuilder(12);
        int var9 = ((sl) this).field_Cb.g((byte) 116);
        ((sl) this).field_Cb.a(true, var9, 5, 3, sh.field_c);
        ((sl) this).field_Db.a(true, var9, 5, sh.field_c + 3, sh.field_c);
        int var10 = 5 + var9 + 5;
        int var11 = 3 + (sh.field_c * 2 + 3);
        int var12 = ou.b(var10, param0, param2, 127);
        int var13 = nj.a(param1, param3, var11, 29079);
        ((sl) this).a(true, var10, var12, var13, var11);
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        var4 = Kickabout.field_G;
        ((sl) this).b(0, param1);
        if (!param1) {
          if (param0 != 84) {
            L0: {
              ((sl) this).field_Fb = 41;
              ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
              if (!param1) {
                break L0;
              } else {
                if (-1 == (wj.field_A ^ -1)) {
                  break L0;
                } else {
                  if (((sl) this).field_sb == 0) {
                    ((sl) this).field_Fb = 1;
                    break L0;
                  } else {
                    return ((sl) this).field_Fb;
                  }
                }
              }
            }
            return ((sl) this).field_Fb;
          } else {
            L1: {
              ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
              if (!param1) {
                break L1;
              } else {
                if (-1 == (wj.field_A ^ -1)) {
                  break L1;
                } else {
                  if (((sl) this).field_sb == 0) {
                    ((sl) this).field_Fb = 1;
                    break L1;
                  } else {
                    return ((sl) this).field_Fb;
                  }
                }
              }
            }
            return ((sl) this).field_Fb;
          }
        } else {
          L2: while (true) {
            if (!nk.b((byte) -59)) {
              if (param0 == 84) {
                ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
                if (param1) {
                  if (-1 != (wj.field_A ^ -1)) {
                    if (((sl) this).field_sb == 0) {
                      ((sl) this).field_Fb = 1;
                      return ((sl) this).field_Fb;
                    } else {
                      return ((sl) this).field_Fb;
                    }
                  } else {
                    return ((sl) this).field_Fb;
                  }
                } else {
                  return ((sl) this).field_Fb;
                }
              } else {
                ((sl) this).field_Fb = 41;
                ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
                if (-1 != (wj.field_A ^ -1)) {
                  if (((sl) this).field_sb != 0) {
                    return ((sl) this).field_Fb;
                  } else {
                    ((sl) this).field_Fb = 1;
                    return ((sl) this).field_Fb;
                  }
                } else {
                  return ((sl) this).field_Fb;
                }
              }
            } else {
              L3: {
                if ((cc.field_e ^ -1) != -86) {
                  break L3;
                } else {
                  if (0 < ((sl) this).field_yb.length()) {
                    StringBuilder discarded$5 = dj.a(-1 + ((sl) this).field_yb.length(), ' ', -11407, ((sl) this).field_yb);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (id.a(false, (CharSequence) (Object) ((sl) this).field_yb, il.field_c)) {
                  StringBuilder discarded$6 = ((sl) this).field_yb.append(il.field_c);
                  break L4;
                } else {
                  L5: {
                    if (-1 != (((sl) this).field_yb.length() ^ -1)) {
                      break L5;
                    } else {
                      if (91 == il.field_c) {
                        StringBuilder discarded$7 = ((sl) this).field_yb.append(il.field_c);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (((sl) this).field_yb.length() != 1) {
                      break L6;
                    } else {
                      if (35 == il.field_c) {
                        StringBuilder discarded$8 = ((sl) this).field_yb.append(il.field_c);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (93 != il.field_c) {
                    break L4;
                  } else {
                    StringBuilder discarded$9 = ((sl) this).field_yb.append(il.field_c);
                    break L4;
                  }
                }
              }
              if ((cc.field_e ^ -1) == -85) {
                if (0 >= ((sl) this).field_yb.length()) {
                  return 1;
                } else {
                  ((sl) this).field_E = ((sl) this).field_yb.toString();
                  return 2;
                }
              } else {
                if (-14 != (cc.field_e ^ -1)) {
                  continue L2;
                } else {
                  return 1;
                }
              }
            }
          }
        }
    }

    public static void i(byte param0) {
        field_Bb = null;
        field_zb = null;
        field_Ab = null;
        if (param0 == 39) {
            return;
        }
        sl.i((byte) 36);
    }

    final boolean h(byte param0) {
        int var2 = 0;
        if (((sl) this).field_Fb == 0) {
          if (cc.field_e == 85) {
            if (-1 > ((sl) this).field_yb.length()) {
              StringBuilder discarded$13 = dj.a(((sl) this).field_yb.length() + -1, ' ', -11407, ((sl) this).field_yb);
              if (-13 < (((sl) this).field_yb.length() ^ -1)) {
                L0: {
                  var2 = Character.toLowerCase(il.field_c);
                  if (32 != var2) {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if ((((sl) this).field_yb.length() ^ -1) >= -1) {
                        break L0;
                      } else {
                        StringBuilder discarded$14 = ((sl) this).field_yb.append(var2);
                        break L0;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if ((((sl) this).field_yb.length() ^ -1) >= -1) {
                        break L0;
                      } else {
                        StringBuilder discarded$15 = ((sl) this).field_yb.append(var2);
                        break L0;
                      }
                    }
                  }
                }
                if (!se.a((byte) -118, (char) var2)) {
                  if (gn.a(12105, (char) var2)) {
                    StringBuilder discarded$16 = ((sl) this).field_yb.append(var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if ((cc.field_e ^ -1) == -85) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        if (cc.field_e != 13) {
                          return true;
                        } else {
                          ((sl) this).field_Fb = 1;
                          return true;
                        }
                      } else {
                        L1: {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          if (cc.field_e != 13) {
                            break L1;
                          } else {
                            ((sl) this).field_Fb = 1;
                            break L1;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (cc.field_e != 13) {
                        return true;
                      } else {
                        ((sl) this).field_Fb = 1;
                        return true;
                      }
                    }
                  } else {
                    var2 = -60 % ((-76 - param0) / 48);
                    if ((cc.field_e ^ -1) == -85) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        if (cc.field_e != 13) {
                          return true;
                        } else {
                          ((sl) this).field_Fb = 1;
                          return true;
                        }
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        if (cc.field_e != 13) {
                          return true;
                        } else {
                          ((sl) this).field_Fb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (cc.field_e == 13) {
                        ((sl) this).field_Fb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  L2: {
                    StringBuilder discarded$17 = ((sl) this).field_yb.append(var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if ((cc.field_e ^ -1) == -85) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        break L2;
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (cc.field_e != 13) {
                      break L3;
                    } else {
                      ((sl) this).field_Fb = 1;
                      break L3;
                    }
                  }
                  return true;
                }
              } else {
                var2 = -60 % ((-76 - param0) / 48);
                if ((cc.field_e ^ -1) == -85) {
                  if (0 >= ((sl) this).field_yb.length()) {
                    ((sl) this).field_Fb = 1;
                    if (cc.field_e != 13) {
                      return true;
                    } else {
                      ((sl) this).field_Fb = 1;
                      return true;
                    }
                  } else {
                    ((sl) this).field_E = ((sl) this).field_yb.toString();
                    ((sl) this).field_Fb = 2;
                    if (cc.field_e != 13) {
                      return true;
                    } else {
                      ((sl) this).field_Fb = 1;
                      return true;
                    }
                  }
                } else {
                  if (cc.field_e != 13) {
                    return true;
                  } else {
                    ((sl) this).field_Fb = 1;
                    return true;
                  }
                }
              }
            } else {
              if (-13 > ((sl) this).field_yb.length()) {
                L4: {
                  var2 = Character.toLowerCase(il.field_c);
                  if (32 != var2) {
                    if (var2 != 95) {
                      break L4;
                    } else {
                      if ((((sl) this).field_yb.length() ^ -1) >= -1) {
                        break L4;
                      } else {
                        StringBuilder discarded$18 = ((sl) this).field_yb.append(var2);
                        break L4;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L4;
                    } else {
                      if ((((sl) this).field_yb.length() ^ -1) >= -1) {
                        break L4;
                      } else {
                        StringBuilder discarded$19 = ((sl) this).field_yb.append(var2);
                        break L4;
                      }
                    }
                  }
                }
                if (!se.a((byte) -118, (char) var2)) {
                  if (gn.a(12105, (char) var2)) {
                    L5: {
                      StringBuilder discarded$20 = ((sl) this).field_yb.append(var2);
                      var2 = -60 % ((-76 - param0) / 48);
                      if ((cc.field_e ^ -1) == -85) {
                        if (0 >= ((sl) this).field_yb.length()) {
                          ((sl) this).field_Fb = 1;
                          break L5;
                        } else {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    if (cc.field_e != 13) {
                      return true;
                    } else {
                      ((sl) this).field_Fb = 1;
                      return true;
                    }
                  } else {
                    var2 = -60 % ((-76 - param0) / 48);
                    if ((cc.field_e ^ -1) == -85) {
                      if (0 < ((sl) this).field_yb.length()) {
                        L6: {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          if (cc.field_e != 13) {
                            break L6;
                          } else {
                            ((sl) this).field_Fb = 1;
                            break L6;
                          }
                        }
                        return true;
                      } else {
                        L7: {
                          ((sl) this).field_Fb = 1;
                          if (cc.field_e != 13) {
                            break L7;
                          } else {
                            ((sl) this).field_Fb = 1;
                            break L7;
                          }
                        }
                        return true;
                      }
                    } else {
                      L8: {
                        if (cc.field_e != 13) {
                          break L8;
                        } else {
                          ((sl) this).field_Fb = 1;
                          break L8;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  L9: {
                    StringBuilder discarded$21 = ((sl) this).field_yb.append(var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if ((cc.field_e ^ -1) == -85) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        break L9;
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (cc.field_e != 13) {
                      break L10;
                    } else {
                      ((sl) this).field_Fb = 1;
                      break L10;
                    }
                  }
                  return true;
                }
              } else {
                var2 = -60 % ((-76 - param0) / 48);
                if ((cc.field_e ^ -1) == -85) {
                  if (0 < ((sl) this).field_yb.length()) {
                    L11: {
                      ((sl) this).field_E = ((sl) this).field_yb.toString();
                      ((sl) this).field_Fb = 2;
                      if (cc.field_e != 13) {
                        break L11;
                      } else {
                        ((sl) this).field_Fb = 1;
                        break L11;
                      }
                    }
                    return true;
                  } else {
                    L12: {
                      ((sl) this).field_Fb = 1;
                      if (cc.field_e != 13) {
                        break L12;
                      } else {
                        ((sl) this).field_Fb = 1;
                        break L12;
                      }
                    }
                    return true;
                  }
                } else {
                  L13: {
                    if (cc.field_e != 13) {
                      break L13;
                    } else {
                      ((sl) this).field_Fb = 1;
                      break L13;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L14: {
              if (-13 < (((sl) this).field_yb.length() ^ -1)) {
                L15: {
                  var2 = Character.toLowerCase(il.field_c);
                  if (32 != var2) {
                    if (var2 != 95) {
                      break L15;
                    } else {
                      if ((((sl) this).field_yb.length() ^ -1) >= -1) {
                        break L15;
                      } else {
                        StringBuilder discarded$22 = ((sl) this).field_yb.append(var2);
                        break L15;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L15;
                    } else {
                      if ((((sl) this).field_yb.length() ^ -1) >= -1) {
                        break L15;
                      } else {
                        StringBuilder discarded$23 = ((sl) this).field_yb.append(var2);
                        break L15;
                      }
                    }
                  }
                }
                if (se.a((byte) -118, (char) var2)) {
                  L16: {
                    StringBuilder discarded$24 = ((sl) this).field_yb.append(var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if ((cc.field_e ^ -1) == -85) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        break L16;
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  if (cc.field_e == 13) {
                    ((sl) this).field_Fb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (!gn.a(12105, (char) var2)) {
                    break L14;
                  } else {
                    L17: {
                      StringBuilder discarded$25 = ((sl) this).field_yb.append(var2);
                      var2 = -60 % ((-76 - param0) / 48);
                      if ((cc.field_e ^ -1) == -85) {
                        if (0 >= ((sl) this).field_yb.length()) {
                          ((sl) this).field_Fb = 1;
                          break L17;
                        } else {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (cc.field_e != 13) {
                        break L18;
                      } else {
                        ((sl) this).field_Fb = 1;
                        break L18;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L14;
              }
            }
            var2 = -60 % ((-76 - param0) / 48);
            if ((cc.field_e ^ -1) == -85) {
              if (0 < ((sl) this).field_yb.length()) {
                L19: {
                  ((sl) this).field_E = ((sl) this).field_yb.toString();
                  ((sl) this).field_Fb = 2;
                  if (cc.field_e != 13) {
                    break L19;
                  } else {
                    ((sl) this).field_Fb = 1;
                    break L19;
                  }
                }
                return true;
              } else {
                L20: {
                  ((sl) this).field_Fb = 1;
                  if (cc.field_e != 13) {
                    break L20;
                  } else {
                    ((sl) this).field_Fb = 1;
                    break L20;
                  }
                }
                return true;
              }
            } else {
              L21: {
                if (cc.field_e != 13) {
                  break L21;
                } else {
                  ((sl) this).field_Fb = 1;
                  break L21;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = true;
        field_Bb = "To report a player, right-click on their name and select the option to report abuse.";
        field_zb = "Rankings";
        field_Ab = "ready";
    }
}
