/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends ci {
    private ci field_Fb;
    private StringBuilder field_Jb;
    private int field_Gb;
    static String field_Eb;
    static int field_Hb;
    private ci field_Ib;

    public static void l(int param0) {
        if (param0 != -4403) {
            return;
        }
        field_Eb = null;
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        var4 = Chess.field_G;
        ((kd) this).a(param1, (byte) 88);
        if (param0 == 3) {
          if (!param1) {
            ((kd) this).field_Fb.field_db = ((kd) this).field_Jb.toString();
            if (param1) {
              L0: {
                if (th.field_d == 0) {
                  break L0;
                } else {
                  if (((kd) this).field_L == 0) {
                    ((kd) this).field_Gb = 1;
                    break L0;
                  } else {
                    return ((kd) this).field_Gb;
                  }
                }
              }
              return ((kd) this).field_Gb;
            } else {
              return ((kd) this).field_Gb;
            }
          } else {
            L1: while (true) {
              if (!kf.d(18954)) {
                ((kd) this).field_Fb.field_db = ((kd) this).field_Jb.toString();
                if (param1) {
                  if (th.field_d != 0) {
                    if (((kd) this).field_L == 0) {
                      ((kd) this).field_Gb = 1;
                      return ((kd) this).field_Gb;
                    } else {
                      return ((kd) this).field_Gb;
                    }
                  } else {
                    return ((kd) this).field_Gb;
                  }
                } else {
                  return ((kd) this).field_Gb;
                }
              } else {
                L2: {
                  if (85 != vg.field_a) {
                    break L2;
                  } else {
                    if (((kd) this).field_Jb.length() > 0) {
                      StringBuilder discarded$5 = rb.a(' ', ((kd) this).field_Jb, ((kd) this).field_Jb.length() - 1, (byte) -105);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (p.a((CharSequence) (Object) ((kd) this).field_Jb, d.field_Ib, -13)) {
                    StringBuilder discarded$6 = ((kd) this).field_Jb.append(d.field_Ib);
                    break L3;
                  } else {
                    L4: {
                      if (0 != ((kd) this).field_Jb.length()) {
                        break L4;
                      } else {
                        if (d.field_Ib == 91) {
                          StringBuilder discarded$7 = ((kd) this).field_Jb.append(d.field_Ib);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-2 != (((kd) this).field_Jb.length() ^ -1)) {
                        break L5;
                      } else {
                        if (35 == d.field_Ib) {
                          StringBuilder discarded$8 = ((kd) this).field_Jb.append(d.field_Ib);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (93 != d.field_Ib) {
                      break L3;
                    } else {
                      StringBuilder discarded$9 = ((kd) this).field_Jb.append(d.field_Ib);
                      break L3;
                    }
                  }
                }
                if (-85 != (vg.field_a ^ -1)) {
                  if (vg.field_a != 13) {
                    continue L1;
                  } else {
                    return 1;
                  }
                } else {
                  if ((((kd) this).field_Jb.length() ^ -1) >= -1) {
                    return 1;
                  } else {
                    ((kd) this).field_db = ((kd) this).field_Jb.toString();
                    return 2;
                  }
                }
              }
            }
          }
        } else {
          return -12;
        }
    }

    final boolean k(int param0) {
        int var2 = 0;
        if ((((kd) this).field_Gb ^ -1) == param0) {
          if (85 == vg.field_a) {
            L0: {
              if (-1 > (((kd) this).field_Jb.length() ^ -1)) {
                StringBuilder discarded$9 = rb.a(' ', ((kd) this).field_Jb, ((kd) this).field_Jb.length() + -1, (byte) 116);
                break L0;
              } else {
                break L0;
              }
            }
            if (12 <= ((kd) this).field_Jb.length()) {
              if (84 != vg.field_a) {
                if (13 != vg.field_a) {
                  return true;
                } else {
                  ((kd) this).field_Gb = 1;
                  return true;
                }
              } else {
                if (0 >= ((kd) this).field_Jb.length()) {
                  ((kd) this).field_Gb = 1;
                  if (13 != vg.field_a) {
                    return true;
                  } else {
                    ((kd) this).field_Gb = 1;
                    return true;
                  }
                } else {
                  ((kd) this).field_db = ((kd) this).field_Jb.toString();
                  ((kd) this).field_Gb = 2;
                  if (13 != vg.field_a) {
                    return true;
                  } else {
                    ((kd) this).field_Gb = 1;
                    return true;
                  }
                }
              }
            } else {
              L1: {
                var2 = Character.toLowerCase(d.field_Ib);
                if (var2 == 32) {
                  var2 = 95;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (var2 == 95) {
                L2: {
                  if (((kd) this).field_Jb.length() <= 0) {
                    break L2;
                  } else {
                    StringBuilder discarded$10 = ((kd) this).field_Jb.append(var2);
                    break L2;
                  }
                }
                if (b.a((char) var2, (byte) 104)) {
                  L3: {
                    StringBuilder discarded$11 = ((kd) this).field_Jb.append(var2);
                    if (84 != vg.field_a) {
                      break L3;
                    } else {
                      if (0 >= ((kd) this).field_Jb.length()) {
                        ((kd) this).field_Gb = 1;
                        break L3;
                      } else {
                        ((kd) this).field_db = ((kd) this).field_Jb.toString();
                        ((kd) this).field_Gb = 2;
                        break L3;
                      }
                    }
                  }
                  if (13 == vg.field_a) {
                    ((kd) this).field_Gb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (di.a(param0 ^ 48, (char) var2)) {
                    StringBuilder discarded$12 = ((kd) this).field_Jb.append(var2);
                    if (84 != vg.field_a) {
                      if (13 != vg.field_a) {
                        return true;
                      } else {
                        ((kd) this).field_Gb = 1;
                        return true;
                      }
                    } else {
                      if (0 >= ((kd) this).field_Jb.length()) {
                        ((kd) this).field_Gb = 1;
                        if (13 != vg.field_a) {
                          return true;
                        } else {
                          ((kd) this).field_Gb = 1;
                          return true;
                        }
                      } else {
                        ((kd) this).field_db = ((kd) this).field_Jb.toString();
                        ((kd) this).field_Gb = 2;
                        if (13 != vg.field_a) {
                          return true;
                        } else {
                          ((kd) this).field_Gb = 1;
                          return true;
                        }
                      }
                    }
                  } else {
                    L4: {
                      if (84 != vg.field_a) {
                        break L4;
                      } else {
                        if (0 >= ((kd) this).field_Jb.length()) {
                          ((kd) this).field_Gb = 1;
                          break L4;
                        } else {
                          ((kd) this).field_db = ((kd) this).field_Jb.toString();
                          ((kd) this).field_Gb = 2;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (13 != vg.field_a) {
                        break L5;
                      } else {
                        ((kd) this).field_Gb = 1;
                        break L5;
                      }
                    }
                    return true;
                  }
                }
              } else {
                if (b.a((char) var2, (byte) 104)) {
                  StringBuilder discarded$13 = ((kd) this).field_Jb.append(var2);
                  if (84 == vg.field_a) {
                    L6: {
                      if (0 >= ((kd) this).field_Jb.length()) {
                        ((kd) this).field_Gb = 1;
                        break L6;
                      } else {
                        ((kd) this).field_db = ((kd) this).field_Jb.toString();
                        ((kd) this).field_Gb = 2;
                        break L6;
                      }
                    }
                    if (13 != vg.field_a) {
                      return true;
                    } else {
                      ((kd) this).field_Gb = 1;
                      return true;
                    }
                  } else {
                    L7: {
                      if (13 != vg.field_a) {
                        break L7;
                      } else {
                        ((kd) this).field_Gb = 1;
                        break L7;
                      }
                    }
                    return true;
                  }
                } else {
                  if (!di.a(param0 ^ 48, (char) var2)) {
                    L8: {
                      if (84 != vg.field_a) {
                        break L8;
                      } else {
                        if (0 >= ((kd) this).field_Jb.length()) {
                          ((kd) this).field_Gb = 1;
                          break L8;
                        } else {
                          ((kd) this).field_db = ((kd) this).field_Jb.toString();
                          ((kd) this).field_Gb = 2;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (13 != vg.field_a) {
                        break L9;
                      } else {
                        ((kd) this).field_Gb = 1;
                        break L9;
                      }
                    }
                    return true;
                  } else {
                    L10: {
                      StringBuilder discarded$14 = ((kd) this).field_Jb.append(var2);
                      if (84 != vg.field_a) {
                        break L10;
                      } else {
                        if (0 >= ((kd) this).field_Jb.length()) {
                          ((kd) this).field_Gb = 1;
                          break L10;
                        } else {
                          ((kd) this).field_db = ((kd) this).field_Jb.toString();
                          ((kd) this).field_Gb = 2;
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (13 != vg.field_a) {
                        break L11;
                      } else {
                        ((kd) this).field_Gb = 1;
                        break L11;
                      }
                    }
                    return true;
                  }
                }
              }
            }
          } else {
            if (12 <= ((kd) this).field_Jb.length()) {
              if (84 != vg.field_a) {
                if (13 == vg.field_a) {
                  ((kd) this).field_Gb = 1;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (0 < ((kd) this).field_Jb.length()) {
                  L12: {
                    ((kd) this).field_db = ((kd) this).field_Jb.toString();
                    ((kd) this).field_Gb = 2;
                    if (13 != vg.field_a) {
                      break L12;
                    } else {
                      ((kd) this).field_Gb = 1;
                      break L12;
                    }
                  }
                  return true;
                } else {
                  L13: {
                    ((kd) this).field_Gb = 1;
                    if (13 != vg.field_a) {
                      break L13;
                    } else {
                      ((kd) this).field_Gb = 1;
                      break L13;
                    }
                  }
                  return true;
                }
              }
            } else {
              L14: {
                var2 = Character.toLowerCase(d.field_Ib);
                if (var2 == 32) {
                  var2 = 95;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var2 != 95) {
                  break L15;
                } else {
                  if (((kd) this).field_Jb.length() <= 0) {
                    break L15;
                  } else {
                    StringBuilder discarded$15 = ((kd) this).field_Jb.append(var2);
                    break L15;
                  }
                }
              }
              if (!b.a((char) var2, (byte) 104)) {
                if (!di.a(param0 ^ 48, (char) var2)) {
                  L16: {
                    if (84 != vg.field_a) {
                      break L16;
                    } else {
                      if (0 >= ((kd) this).field_Jb.length()) {
                        ((kd) this).field_Gb = 1;
                        break L16;
                      } else {
                        ((kd) this).field_db = ((kd) this).field_Jb.toString();
                        ((kd) this).field_Gb = 2;
                        break L16;
                      }
                    }
                  }
                  if (13 == vg.field_a) {
                    ((kd) this).field_Gb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  L17: {
                    StringBuilder discarded$16 = ((kd) this).field_Jb.append(var2);
                    if (84 != vg.field_a) {
                      break L17;
                    } else {
                      if (0 >= ((kd) this).field_Jb.length()) {
                        ((kd) this).field_Gb = 1;
                        break L17;
                      } else {
                        ((kd) this).field_db = ((kd) this).field_Jb.toString();
                        ((kd) this).field_Gb = 2;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (13 != vg.field_a) {
                      break L18;
                    } else {
                      ((kd) this).field_Gb = 1;
                      break L18;
                    }
                  }
                  return true;
                }
              } else {
                L19: {
                  StringBuilder discarded$17 = ((kd) this).field_Jb.append(var2);
                  if (84 != vg.field_a) {
                    break L19;
                  } else {
                    if (0 >= ((kd) this).field_Jb.length()) {
                      ((kd) this).field_Gb = 1;
                      break L19;
                    } else {
                      ((kd) this).field_db = ((kd) this).field_Jb.toString();
                      ((kd) this).field_Gb = 2;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (13 != vg.field_a) {
                    break L20;
                  } else {
                    ((kd) this).field_Gb = 1;
                    break L20;
                  }
                }
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0, sn param1) {
        cg.field_c = param1;
        if (param0 == -90) {
            return;
        }
        Object var3 = null;
        kd.a((byte) 123, (sn) null);
    }

    kd(int param0, int param1, int param2, int param3, String param4, ci param5, ci param6, ci param7) {
        super(0L, param5);
        ((kd) this).field_Gb = 0;
        ((kd) this).field_Ib = new ci(0L, param6, param4);
        ((kd) this).a((byte) 125, ((kd) this).field_Ib);
        ((kd) this).field_Fb = new ci(0L, param7);
        ((kd) this).field_Fb.field_ib = 16764006;
        ((kd) this).a((byte) 126, ((kd) this).field_Fb);
        ((kd) this).field_Fb.field_S = "|";
        ((kd) this).field_Jb = new StringBuilder(12);
        int var9 = ((kd) this).field_Ib.e((byte) 94);
        ((kd) this).field_Ib.a(5, var9, -2147483648, fe.field_g, 3);
        ((kd) this).field_Fb.a(5, var9, -2147483648, fe.field_g, 3 - -fe.field_g);
        int var10 = 5 - -var9 + 5;
        int var11 = 3 + fe.field_g * 2 + 3;
        int var12 = ao.a(var10, true, param0, param2);
        int var13 = sg.a(param1, var11, param3, 0);
        ((kd) this).a(var12, var10, -2147483648, var11, var13);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "If you are not, please change your password to something more obscure!";
    }
}
