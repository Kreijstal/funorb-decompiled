/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends gh {
    static String field_Zb;
    static wk field_Ub;
    static wk field_ac;
    private int field_Yb;
    static byte[][] field_Sb;
    static String[] field_Vb;
    private gh field_Xb;
    private gh field_Tb;
    private StringBuilder field_Wb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final boolean d(byte param0) {
        int var2 = 0;
        if (param0 == 76) {
          if (((el) this).field_Yb == 0) {
            if (ei.field_q == 85) {
              L0: {
                if (0 < ((el) this).field_Wb.length()) {
                  StringBuilder discarded$7 = dm.a(' ', 200, ((el) this).field_Wb, ((el) this).field_Wb.length() + -1);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-13 < ((el) this).field_Wb.length()) {
                L1: {
                  var2 = Character.toLowerCase(de.field_c);
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
                    if ((((el) this).field_Wb.length() ^ -1) < -1) {
                      StringBuilder discarded$8 = ((el) this).field_Wb.append(var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (kf.a((char) var2, (byte) 120)) {
                  L3: {
                    StringBuilder discarded$9 = ((el) this).field_Wb.append(var2);
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        break L3;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (13 != ei.field_q) {
                      break L4;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L4;
                    }
                  }
                  return true;
                } else {
                  if (!oa.a(-4278, (char) var2)) {
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          ((el) this).field_Yb = 1;
                          return true;
                        }
                      } else {
                        ((el) this).field_Yb = 1;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          ((el) this).field_Yb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (13 != ei.field_q) {
                        return true;
                      } else {
                        ((el) this).field_Yb = 1;
                        return true;
                      }
                    }
                  } else {
                    StringBuilder discarded$10 = ((el) this).field_Wb.append(var2);
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        if (13 == ei.field_q) {
                          ((el) this).field_Yb = 1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          ((el) this).field_Yb = 1;
                          if (13 != ei.field_q) {
                            break L5;
                          } else {
                            ((el) this).field_Yb = 1;
                            break L5;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (13 == ei.field_q) {
                        ((el) this).field_Yb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              } else {
                if (-85 == ei.field_q) {
                  if (0 >= ((el) this).field_Wb.length()) {
                    L6: {
                      ((el) this).field_Yb = 1;
                      if (13 != ei.field_q) {
                        break L6;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L6;
                      }
                    }
                    return true;
                  } else {
                    L7: {
                      ((el) this).field_S = ((el) this).field_Wb.toString();
                      ((el) this).field_Yb = 2;
                      if (13 != ei.field_q) {
                        break L7;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L7;
                      }
                    }
                    return true;
                  }
                } else {
                  L8: {
                    if (13 != ei.field_q) {
                      break L8;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L8;
                    }
                  }
                  return true;
                }
              }
            } else {
              if (-13 < ((el) this).field_Wb.length()) {
                L9: {
                  var2 = Character.toLowerCase(de.field_c);
                  if (var2 != 32) {
                    break L9;
                  } else {
                    var2 = 95;
                    break L9;
                  }
                }
                L10: {
                  if (95 != var2) {
                    break L10;
                  } else {
                    if ((((el) this).field_Wb.length() ^ -1) < -1) {
                      StringBuilder discarded$11 = ((el) this).field_Wb.append(var2);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (!kf.a((char) var2, (byte) 120)) {
                  if (!oa.a(-4278, (char) var2)) {
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 >= ((el) this).field_Wb.length()) {
                        L11: {
                          ((el) this).field_Yb = 1;
                          if (13 != ei.field_q) {
                            break L11;
                          } else {
                            ((el) this).field_Yb = 1;
                            break L11;
                          }
                        }
                        return true;
                      } else {
                        L12: {
                          ((el) this).field_S = ((el) this).field_Wb.toString();
                          ((el) this).field_Yb = 2;
                          if (13 != ei.field_q) {
                            break L12;
                          } else {
                            ((el) this).field_Yb = 1;
                            break L12;
                          }
                        }
                        return true;
                      }
                    } else {
                      L13: {
                        if (13 != ei.field_q) {
                          break L13;
                        } else {
                          ((el) this).field_Yb = 1;
                          break L13;
                        }
                      }
                      return true;
                    }
                  } else {
                    L14: {
                      StringBuilder discarded$12 = ((el) this).field_Wb.append(var2);
                      if (-85 == (ei.field_q ^ -1)) {
                        if (0 < ((el) this).field_Wb.length()) {
                          ((el) this).field_S = ((el) this).field_Wb.toString();
                          ((el) this).field_Yb = 2;
                          break L14;
                        } else {
                          ((el) this).field_Yb = 1;
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (13 != ei.field_q) {
                        break L15;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L15;
                      }
                    }
                    return true;
                  }
                } else {
                  L16: {
                    StringBuilder discarded$13 = ((el) this).field_Wb.append(var2);
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        break L16;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (13 != ei.field_q) {
                      break L17;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L17;
                    }
                  }
                  return true;
                }
              } else {
                if (-85 == ei.field_q) {
                  if (0 >= ((el) this).field_Wb.length()) {
                    L18: {
                      ((el) this).field_Yb = 1;
                      if (13 != ei.field_q) {
                        break L18;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L18;
                      }
                    }
                    return true;
                  } else {
                    L19: {
                      ((el) this).field_S = ((el) this).field_Wb.toString();
                      ((el) this).field_Yb = 2;
                      if (13 != ei.field_q) {
                        break L19;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L19;
                      }
                    }
                    return true;
                  }
                } else {
                  if (13 == ei.field_q) {
                    ((el) this).field_Yb = 1;
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        ((el) this).a((byte) 108, param1);
        if (!param1) {
          if (param0 == -2) {
            L0: {
              ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
              if (!param1) {
                break L0;
              } else {
                if (lb.field_gc == 0) {
                  break L0;
                } else {
                  if (((el) this).field_Eb != 0) {
                    break L0;
                  } else {
                    ((el) this).field_Yb = 1;
                    return ((el) this).field_Yb;
                  }
                }
              }
            }
            return ((el) this).field_Yb;
          } else {
            field_Vb = null;
            ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
            if (param1) {
              if (lb.field_gc != 0) {
                if (((el) this).field_Eb != 0) {
                  return ((el) this).field_Yb;
                } else {
                  ((el) this).field_Yb = 1;
                  return ((el) this).field_Yb;
                }
              } else {
                return ((el) this).field_Yb;
              }
            } else {
              return ((el) this).field_Yb;
            }
          }
        } else {
          L1: while (true) {
            if (dl.f(22759)) {
              L2: {
                if (85 != ei.field_q) {
                  break L2;
                } else {
                  if (-1 > (((el) this).field_Wb.length() ^ -1)) {
                    StringBuilder discarded$5 = dm.a(' ', 200, ((el) this).field_Wb, -1 + ((el) this).field_Wb.length());
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (fj.a(de.field_c, (CharSequence) (Object) ((el) this).field_Wb, -99)) {
                  StringBuilder discarded$6 = ((el) this).field_Wb.append(de.field_c);
                  break L3;
                } else {
                  L4: {
                    if (((el) this).field_Wb.length() != 0) {
                      break L4;
                    } else {
                      if (91 == de.field_c) {
                        StringBuilder discarded$7 = ((el) this).field_Wb.append(de.field_c);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((((el) this).field_Wb.length() ^ -1) != -2) {
                      break L5;
                    } else {
                      if (35 == de.field_c) {
                        StringBuilder discarded$8 = ((el) this).field_Wb.append(de.field_c);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (de.field_c != 93) {
                    break L3;
                  } else {
                    StringBuilder discarded$9 = ((el) this).field_Wb.append(de.field_c);
                    break L3;
                  }
                }
              }
              if (-85 != ei.field_q) {
                if (13 != ei.field_q) {
                  continue L1;
                } else {
                  return 1;
                }
              } else {
                if (-1 < ((el) this).field_Wb.length()) {
                  ((el) this).field_S = ((el) this).field_Wb.toString();
                  return 2;
                } else {
                  return 1;
                }
              }
            } else {
              if (param0 == -2) {
                ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
                if (lb.field_gc != 0) {
                  if (((el) this).field_Eb == 0) {
                    ((el) this).field_Yb = 1;
                    return ((el) this).field_Yb;
                  } else {
                    return ((el) this).field_Yb;
                  }
                } else {
                  return ((el) this).field_Yb;
                }
              } else {
                L6: {
                  field_Vb = null;
                  ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
                  if (lb.field_gc == 0) {
                    break L6;
                  } else {
                    if (((el) this).field_Eb != 0) {
                      break L6;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L6;
                    }
                  }
                }
                return ((el) this).field_Yb;
              }
            }
          }
        }
    }

    el(int param0, int param1, int param2, int param3, String param4, gh param5, gh param6, gh param7) {
        super(0L, param5);
        ((el) this).field_Yb = 0;
        ((el) this).field_Xb = new gh(0L, param6, param4);
        ((el) this).a(((el) this).field_Xb, 124);
        ((el) this).field_Tb = new gh(0L, param7);
        ((el) this).field_Tb.field_nb = 16764006;
        ((el) this).a(((el) this).field_Tb, 123);
        ((el) this).field_Tb.field_Db = "|";
        ((el) this).field_Wb = new StringBuilder(12);
        int var9 = ((el) this).field_Xb.g(-2147483648);
        ((el) this).field_Xb.a(0, 3, db.field_b, 5, var9);
        ((el) this).field_Tb.a(0, 3 - -db.field_b, db.field_b, 5, var9);
        int var10 = var9 + 10;
        int var11 = 3 + (2 * db.field_b - -3);
        int var12 = dl.a(param2, 127, param0, var10);
        int var13 = ol.a(param1, 0, param3, var11);
        ((el) this).a(0, var13, var11, var12, var10);
    }

    public static void b(boolean param0) {
        field_Sb = null;
        if (!param0) {
            return;
        }
        field_Zb = null;
        field_ac = null;
        field_Vb = null;
        field_Ub = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "Passwords must be between 5 and 20 characters long";
        field_Vb = new String[]{"YES", "NO"};
        field_Sb = new byte[][]{new byte[8], new byte[6], new byte[8], new byte[8], new byte[8], new byte[10], new byte[8], new byte[8], new byte[8], new byte[8], new byte[8], new byte[8], new byte[6], new byte[6], new byte[8], new byte[6], new byte[8], new byte[8], new byte[10], new byte[8], new byte[8], new byte[8], new byte[0], new byte[0], new byte[0], new byte[0], new byte[6], new byte[8], new byte[8], new byte[8], new byte[8], new byte[10], new byte[10], new byte[8], new byte[8], new byte[8]};
    }
}
