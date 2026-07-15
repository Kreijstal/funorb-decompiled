/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends w {
    private w field_Nb;
    static String field_Pb;
    static ui field_Ub;
    private StringBuilder field_Xb;
    static int field_Wb;
    private w field_Sb;
    private int field_Rb;
    static String[][] field_Qb;
    static String field_Tb;
    static String field_Ob;
    static int[] field_Vb;

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        ((hb) this).a(false, param1);
        if (!param1) {
          ((hb) this).field_Sb.field_Y = ((hb) this).field_Xb.toString();
          if (param1) {
            if (-1 != (ig.field_Yb ^ -1)) {
              if ((((hb) this).field_ob ^ -1) == -1) {
                ((hb) this).field_Rb = 1;
                if (param0 == -63) {
                  return ((hb) this).field_Rb;
                } else {
                  field_Wb = 87;
                  return ((hb) this).field_Rb;
                }
              } else {
                if (param0 == -63) {
                  return ((hb) this).field_Rb;
                } else {
                  field_Wb = 87;
                  return ((hb) this).field_Rb;
                }
              }
            } else {
              if (param0 == -63) {
                return ((hb) this).field_Rb;
              } else {
                field_Wb = 87;
                return ((hb) this).field_Rb;
              }
            }
          } else {
            if (param0 == -63) {
              return ((hb) this).field_Rb;
            } else {
              field_Wb = 87;
              return ((hb) this).field_Rb;
            }
          }
        } else {
          L0: while (true) {
            if (ab.c((byte) -126)) {
              L1: {
                if (85 != wh.field_c) {
                  break L1;
                } else {
                  if (-1 <= (((hb) this).field_Xb.length() ^ -1)) {
                    break L1;
                  } else {
                    StringBuilder discarded$5 = vf.a(((hb) this).field_Xb, -23510, -1 + ((hb) this).field_Xb.length(), ' ');
                    break L1;
                  }
                }
              }
              L2: {
                if (re.a(param0 ^ 9, el.field_G, (CharSequence) (Object) ((hb) this).field_Xb)) {
                  StringBuilder discarded$6 = ((hb) this).field_Xb.append(el.field_G);
                  break L2;
                } else {
                  L3: {
                    if (-1 != (((hb) this).field_Xb.length() ^ -1)) {
                      break L3;
                    } else {
                      if (91 == el.field_G) {
                        StringBuilder discarded$7 = ((hb) this).field_Xb.append(el.field_G);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (((hb) this).field_Xb.length() != 1) {
                      break L4;
                    } else {
                      if (el.field_G == 35) {
                        StringBuilder discarded$8 = ((hb) this).field_Xb.append(el.field_G);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (el.field_G == 93) {
                    StringBuilder discarded$9 = ((hb) this).field_Xb.append(el.field_G);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (wh.field_c == 84) {
                if (((hb) this).field_Xb.length() <= 0) {
                  return 1;
                } else {
                  ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                  return 2;
                }
              } else {
                if (-14 != (wh.field_c ^ -1)) {
                  continue L0;
                } else {
                  return 1;
                }
              }
            } else {
              L5: {
                ((hb) this).field_Sb.field_Y = ((hb) this).field_Xb.toString();
                if (!param1) {
                  break L5;
                } else {
                  if (-1 == (ig.field_Yb ^ -1)) {
                    break L5;
                  } else {
                    if ((((hb) this).field_ob ^ -1) != -1) {
                      break L5;
                    } else {
                      L6: {
                        ((hb) this).field_Rb = 1;
                        if (param0 == -63) {
                          break L6;
                        } else {
                          field_Wb = 87;
                          break L6;
                        }
                      }
                      return ((hb) this).field_Rb;
                    }
                  }
                }
              }
              if (param0 == -63) {
                return ((hb) this).field_Rb;
              } else {
                field_Wb = 87;
                return ((hb) this).field_Rb;
              }
            }
          }
        }
    }

    final boolean f(int param0) {
        int var2 = 0;
        if ((((hb) this).field_Rb ^ -1) == -1) {
          if (wh.field_c == 85) {
            if ((((hb) this).field_Xb.length() ^ -1) < -1) {
              L0: {
                StringBuilder discarded$26 = vf.a(((hb) this).field_Xb, param0 ^ -23249, ((hb) this).field_Xb.length() + -1, ' ');
                if (-13 >= (((hb) this).field_Xb.length() ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var2 = Character.toLowerCase(el.field_G);
                    if (var2 != 32) {
                      break L1;
                    } else {
                      var2 = 95;
                      break L1;
                    }
                  }
                  L2: {
                    if (95 != var2) {
                      break L2;
                    } else {
                      if (0 < ((hb) this).field_Xb.length()) {
                        StringBuilder discarded$27 = ((hb) this).field_Xb.append(var2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (v.a((char) var2, -24380)) {
                    StringBuilder discarded$28 = ((hb) this).field_Xb.append(var2);
                    break L0;
                  } else {
                    if (fl.a((char) var2, (byte) 23)) {
                      L3: {
                        StringBuilder discarded$29 = ((hb) this).field_Xb.append(var2);
                        if (-85 == (wh.field_c ^ -1)) {
                          if (-1 > (((hb) this).field_Xb.length() ^ -1)) {
                            ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                            ((hb) this).field_Rb = 2;
                            break L3;
                          } else {
                            ((hb) this).field_Rb = 1;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if ((wh.field_c ^ -1) != -14) {
                          break L4;
                        } else {
                          ((hb) this).field_Rb = 1;
                          break L4;
                        }
                      }
                      L5: {
                        if (param0 == 261) {
                          break L5;
                        } else {
                          int discarded$30 = ((hb) this).a((byte) 13, false);
                          break L5;
                        }
                      }
                      return true;
                    } else {
                      break L0;
                    }
                  }
                }
              }
              if (-85 == (wh.field_c ^ -1)) {
                if (-1 > (((hb) this).field_Xb.length() ^ -1)) {
                  ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                  ((hb) this).field_Rb = 2;
                  if ((wh.field_c ^ -1) != -14) {
                    if (param0 == 261) {
                      return true;
                    } else {
                      int discarded$31 = ((hb) this).a((byte) 13, false);
                      return true;
                    }
                  } else {
                    ((hb) this).field_Rb = 1;
                    if (param0 == 261) {
                      return true;
                    } else {
                      int discarded$32 = ((hb) this).a((byte) 13, false);
                      return true;
                    }
                  }
                } else {
                  ((hb) this).field_Rb = 1;
                  if ((wh.field_c ^ -1) != -14) {
                    if (param0 == 261) {
                      return true;
                    } else {
                      int discarded$33 = ((hb) this).a((byte) 13, false);
                      return true;
                    }
                  } else {
                    ((hb) this).field_Rb = 1;
                    if (param0 == 261) {
                      return true;
                    } else {
                      int discarded$34 = ((hb) this).a((byte) 13, false);
                      return true;
                    }
                  }
                }
              } else {
                if ((wh.field_c ^ -1) != -14) {
                  if (param0 == 261) {
                    return true;
                  } else {
                    int discarded$35 = ((hb) this).a((byte) 13, false);
                    return true;
                  }
                } else {
                  L6: {
                    ((hb) this).field_Rb = 1;
                    if (param0 == 261) {
                      break L6;
                    } else {
                      int discarded$36 = ((hb) this).a((byte) 13, false);
                      break L6;
                    }
                  }
                  return true;
                }
              }
            } else {
              L7: {
                if (-13 >= (((hb) this).field_Xb.length() ^ -1)) {
                  break L7;
                } else {
                  L8: {
                    var2 = Character.toLowerCase(el.field_G);
                    if (var2 != 32) {
                      break L8;
                    } else {
                      var2 = 95;
                      break L8;
                    }
                  }
                  L9: {
                    if (95 != var2) {
                      break L9;
                    } else {
                      if (0 < ((hb) this).field_Xb.length()) {
                        StringBuilder discarded$37 = ((hb) this).field_Xb.append(var2);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (v.a((char) var2, -24380)) {
                    StringBuilder discarded$38 = ((hb) this).field_Xb.append(var2);
                    break L7;
                  } else {
                    if (fl.a((char) var2, (byte) 23)) {
                      L10: {
                        StringBuilder discarded$39 = ((hb) this).field_Xb.append(var2);
                        if (-85 == (wh.field_c ^ -1)) {
                          if (-1 > (((hb) this).field_Xb.length() ^ -1)) {
                            ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                            ((hb) this).field_Rb = 2;
                            break L10;
                          } else {
                            ((hb) this).field_Rb = 1;
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if ((wh.field_c ^ -1) != -14) {
                          break L11;
                        } else {
                          ((hb) this).field_Rb = 1;
                          break L11;
                        }
                      }
                      L12: {
                        if (param0 == 261) {
                          break L12;
                        } else {
                          int discarded$40 = ((hb) this).a((byte) 13, false);
                          break L12;
                        }
                      }
                      return true;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (-85 == (wh.field_c ^ -1)) {
                if (-1 > (((hb) this).field_Xb.length() ^ -1)) {
                  ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                  ((hb) this).field_Rb = 2;
                  if ((wh.field_c ^ -1) == -14) {
                    ((hb) this).field_Rb = 1;
                    if (param0 != 261) {
                      int discarded$41 = ((hb) this).a((byte) 13, false);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    L13: {
                      if (param0 == 261) {
                        break L13;
                      } else {
                        int discarded$42 = ((hb) this).a((byte) 13, false);
                        break L13;
                      }
                    }
                    return true;
                  }
                } else {
                  L14: {
                    ((hb) this).field_Rb = 1;
                    if ((wh.field_c ^ -1) != -14) {
                      break L14;
                    } else {
                      ((hb) this).field_Rb = 1;
                      break L14;
                    }
                  }
                  L15: {
                    if (param0 == 261) {
                      break L15;
                    } else {
                      int discarded$43 = ((hb) this).a((byte) 13, false);
                      break L15;
                    }
                  }
                  return true;
                }
              } else {
                L16: {
                  if ((wh.field_c ^ -1) != -14) {
                    break L16;
                  } else {
                    ((hb) this).field_Rb = 1;
                    break L16;
                  }
                }
                L17: {
                  if (param0 == 261) {
                    break L17;
                  } else {
                    int discarded$44 = ((hb) this).a((byte) 13, false);
                    break L17;
                  }
                }
                return true;
              }
            }
          } else {
            L18: {
              if (-13 >= (((hb) this).field_Xb.length() ^ -1)) {
                break L18;
              } else {
                L19: {
                  var2 = Character.toLowerCase(el.field_G);
                  if (var2 != 32) {
                    break L19;
                  } else {
                    var2 = 95;
                    break L19;
                  }
                }
                L20: {
                  if (95 != var2) {
                    break L20;
                  } else {
                    if (0 < ((hb) this).field_Xb.length()) {
                      StringBuilder discarded$45 = ((hb) this).field_Xb.append(var2);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                if (v.a((char) var2, -24380)) {
                  StringBuilder discarded$46 = ((hb) this).field_Xb.append(var2);
                  break L18;
                } else {
                  if (fl.a((char) var2, (byte) 23)) {
                    L21: {
                      StringBuilder discarded$47 = ((hb) this).field_Xb.append(var2);
                      if (-85 == (wh.field_c ^ -1)) {
                        if (-1 > (((hb) this).field_Xb.length() ^ -1)) {
                          ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                          ((hb) this).field_Rb = 2;
                          break L21;
                        } else {
                          ((hb) this).field_Rb = 1;
                          break L21;
                        }
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if ((wh.field_c ^ -1) != -14) {
                        break L22;
                      } else {
                        ((hb) this).field_Rb = 1;
                        break L22;
                      }
                    }
                    if (param0 == 261) {
                      return true;
                    } else {
                      int discarded$48 = ((hb) this).a((byte) 13, false);
                      return true;
                    }
                  } else {
                    break L18;
                  }
                }
              }
            }
            if (-85 == (wh.field_c ^ -1)) {
              if (-1 > (((hb) this).field_Xb.length() ^ -1)) {
                L23: {
                  ((hb) this).field_Y = ((hb) this).field_Xb.toString();
                  ((hb) this).field_Rb = 2;
                  if ((wh.field_c ^ -1) != -14) {
                    break L23;
                  } else {
                    ((hb) this).field_Rb = 1;
                    break L23;
                  }
                }
                L24: {
                  if (param0 == 261) {
                    break L24;
                  } else {
                    int discarded$49 = ((hb) this).a((byte) 13, false);
                    break L24;
                  }
                }
                return true;
              } else {
                L25: {
                  ((hb) this).field_Rb = 1;
                  if ((wh.field_c ^ -1) != -14) {
                    break L25;
                  } else {
                    ((hb) this).field_Rb = 1;
                    break L25;
                  }
                }
                L26: {
                  if (param0 == 261) {
                    break L26;
                  } else {
                    int discarded$50 = ((hb) this).a((byte) 13, false);
                    break L26;
                  }
                }
                return true;
              }
            } else {
              L27: {
                if ((wh.field_c ^ -1) != -14) {
                  break L27;
                } else {
                  ((hb) this).field_Rb = 1;
                  break L27;
                }
              }
              L28: {
                if (param0 == 261) {
                  break L28;
                } else {
                  int discarded$51 = ((hb) this).a((byte) 13, false);
                  break L28;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte[] param0, int param1, pi[] param2, ji param3, String[] param4, int param5, int param6, ji param7, String[][] param8, ck[][] param9, boolean param10, int[] param11, ck[][] param12, byte[] param13, String[][] param14, ji param15, int param16, String[] param17, int[] param18, String[] param19) {
        bb.a(false, param15, param2, param11, param7);
        la.a(param15, 32373);
        mf.a(param6, param19, param0, param15, -8894, param8, param9, param1, param14, param17, param4, param12, param16, param13, param18);
        if (param5 == 3) {
          ua.a(46, param15, param10, param3);
          ge.a((byte) 123);
          tj.h((byte) -27);
          f.d(18);
          return;
        } else {
          hb.e(-36);
          ua.a(46, param15, param10, param3);
          ge.a((byte) 123);
          tj.h((byte) -27);
          f.d(18);
          return;
        }
    }

    public static void e(int param0) {
        field_Vb = null;
        field_Qb = null;
        if (param0 >= -48) {
          field_Pb = null;
          field_Ob = null;
          field_Pb = null;
          field_Ub = null;
          field_Tb = null;
          return;
        } else {
          field_Ob = null;
          field_Pb = null;
          field_Ub = null;
          field_Tb = null;
          return;
        }
    }

    hb(int param0, int param1, int param2, int param3, String param4, w param5, w param6, w param7) {
        super(0L, param5);
        ((hb) this).field_Rb = 0;
        ((hb) this).field_Nb = new w(0L, param6, param4);
        ((hb) this).a(((hb) this).field_Nb, -16834);
        ((hb) this).field_Sb = new w(0L, param7);
        ((hb) this).field_Sb.field_G = 16764006;
        ((hb) this).a(((hb) this).field_Sb, -16834);
        ((hb) this).field_Sb.field_T = "|";
        ((hb) this).field_Xb = new StringBuilder(12);
        int var9 = ((hb) this).field_Nb.a(true);
        ((hb) this).field_Nb.a(var9, 0, 3, kf.field_O, 5);
        ((hb) this).field_Sb.a(var9, 0, kf.field_O + 3, kf.field_O, 5);
        int var10 = 10 + var9;
        int var11 = 3 + (3 - -(2 * kf.field_O));
        int var12 = vh.a(param2, -18265, var10, param0);
        int var13 = o.a(param3, 0, var11, param1);
        ((hb) this).a(var10, 0, var13, var11, var12);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = "Players";
        field_Tb = "Please try changing the following settings:  ";
        field_Vb = new int[16384];
    }
}
