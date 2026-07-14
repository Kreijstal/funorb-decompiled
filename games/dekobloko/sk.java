/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static w field_c;
    static String field_i;
    private int field_p;
    boolean field_o;
    private int field_j;
    static int field_k;
    static ei[][] field_a;
    private boolean field_n;
    private int field_d;
    static int field_e;
    static ck field_g;
    static String field_m;
    int field_h;
    private int field_q;
    int field_l;
    static ji field_f;
    static String field_b;

    final void a(int param0, byte param1) {
        if (-1 == (((sk) this).field_q ^ -1)) {
            ((sk) this).field_h = param0;
            ((sk) this).field_o = true;
            ((sk) this).field_n = false;
        }
        if (param1 >= -53) {
            field_b = null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            sk.e(-70);
        }
        return (((sk) this).field_q ^ -1) != -1 ? true : false;
    }

    final boolean c(int param0) {
        if (param0 <= 111) {
            field_g = null;
        }
        return (((sk) this).field_d ^ -1) == -103 ? true : false;
    }

    final void a(boolean param0, int param1, int param2) {
        ((sk) this).field_q = 0;
        ((sk) this).field_n = param0 ? true : false;
        if (!(!((sk) this).field_n)) {
            ((sk) this).field_h = param2;
        }
        int var4 = -68 / ((54 - param1) / 44);
    }

    final boolean a(byte param0) {
        if (param0 != -51) {
            return false;
        }
        return (((sk) this).field_d ^ -1) == -104 ? true : false;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            return true;
        }
        return ((sk) this).field_d == 96 ? true : false;
    }

    final void a(byte param0, int param1) {
        L0: {
          if (param0 == 58) {
            break L0;
          } else {
            ((sk) this).field_h = 111;
            break L0;
          }
        }
        L1: {
          ((sk) this).field_d = 0;
          ((sk) this).field_p = 0;
          ((sk) this).field_o = false;
          if (0 != ((sk) this).field_q) {
            break L1;
          } else {
            ((sk) this).field_d = wh.field_c;
            break L1;
          }
        }
        L2: {
          if (0 == ((sk) this).field_q) {
            if (-1 != (((sk) this).field_q ^ -1)) {
              break L2;
            } else {
              if (wh.field_c != 97) {
                break L2;
              } else {
                ((sk) this).field_h = ((sk) this).field_h + 1;
                ((sk) this).field_n = false;
                ((sk) this).field_o = true;
                if (((sk) this).field_l > ((sk) this).field_h) {
                  break L2;
                } else {
                  ((sk) this).field_h = 0;
                  break L2;
                }
              }
            }
          } else {
            if (-1 != (((sk) this).field_q ^ -1)) {
              break L2;
            } else {
              if (wh.field_c != 97) {
                break L2;
              } else {
                ((sk) this).field_h = ((sk) this).field_h + 1;
                ((sk) this).field_n = false;
                ((sk) this).field_o = true;
                if (((sk) this).field_l > ((sk) this).field_h) {
                  break L2;
                } else {
                  ((sk) this).field_h = 0;
                  break L2;
                }
              }
            }
          }
        }
        L3: {
          if (((sk) this).field_q != 0) {
            break L3;
          } else {
            L4: {
              if (98 == wh.field_c) {
                break L4;
              } else {
                if (wh.field_c == -100) {
                  break L4;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              if (-1 > ((sk) this).field_h) {
                ((sk) this).field_h = param1;
                break L5;
              } else {
                break L5;
              }
            }
            ((sk) this).field_n = false;
            ((sk) this).field_o = true;
            break L3;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 90 % ((31 - param0) / 42);
        return ((sk) this).field_d == 97 ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        ((sk) this).field_n = param3 ? true : false;
        ((sk) this).field_q = param1;
        if (((sk) this).field_n) {
            ((sk) this).field_h = param2;
        } else {
            ((sk) this).field_h = param0;
        }
    }

    final void a(int param0) {
        ((sk) this).field_o = false;
        ((sk) this).field_p = 0;
        if (param0 > -24) {
            return;
        }
        ((sk) this).field_d = 0;
        if (0 == ((sk) this).field_q) {
            if (wh.field_c == 98) {
                if (!(((sk) this).field_h > 0)) {
                    ((sk) this).field_h = ((sk) this).field_l;
                }
                ((sk) this).field_h = ((sk) this).field_h - 1;
                ((sk) this).field_n = false;
                ((sk) this).field_o = true;
            }
        }
        if (!(((sk) this).field_q != -1)) {
            ((sk) this).field_d = wh.field_c;
        }
        if (0 == ((sk) this).field_q) {
            if (!(-100 != wh.field_c)) {
                ((sk) this).field_h = ((sk) this).field_h + 1;
                ((sk) this).field_n = false;
                if (((sk) this).field_h >= ((sk) this).field_l) {
                    ((sk) this).field_h = 0;
                }
                ((sk) this).field_o = true;
            }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = client.field_A ? 1 : 0;
          if (param3 < 2) {
            break L0;
          } else {
            if (param3 > 36) {
              break L0;
            } else {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param1.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      field_b = null;
                      break L2;
                    }
                  }
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (0 == var8) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L1;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (57 < var9) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param3) {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var9 + var6 * param3;
                    if (var10 / param3 == var6) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L1;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final static int a(int param0, int param1) {
        if (param1 >= -52) {
            field_k = -122;
        }
        param0 = param0 & 8191;
        if (-4097 < param0) {
            return param0 < 2048 ? pd.field_i[param0] : pd.field_i[4096 - param0];
        }
        return -6145 <= param0 ? -pd.field_i[-param0 + 8192] : -pd.field_i[-4096 + param0];
    }

    final void d(int param0) {
        ((sk) this).field_d = 0;
        ((sk) this).field_p = param0;
        ((sk) this).field_o = false;
        if (((sk) this).field_q == 0) {
            ((sk) this).field_d = wh.field_c;
        }
    }

    public static void e(int param0) {
        field_c = null;
        field_i = null;
        field_m = null;
        field_f = null;
        field_g = null;
        if (param0 != -28610) {
            sk.e(69);
        }
        field_a = null;
        field_b = null;
    }

    final void a(int param0, int param1, int param2) {
        if (((sk) this).field_l <= param0) {
          throw new IllegalArgumentException();
        } else {
          if (param2 >= ((sk) this).field_l) {
            throw new IllegalArgumentException();
          } else {
            L0: {
              ((sk) this).field_d = 0;
              ((sk) this).field_p = 0;
              ((sk) this).field_o = false;
              if (-1 == (ig.field_Yb ^ -1)) {
                break L0;
              } else {
                ((sk) this).field_n = true;
                ((sk) this).field_q = ig.field_Yb;
                ((sk) this).field_p = ig.field_Yb;
                ((sk) this).field_h = param2;
                ((sk) this).field_j = ib.field_kb;
                break L0;
              }
            }
            L1: {
              if (((sk) this).field_q == 0) {
                break L1;
              } else {
                if (be.field_n == 0) {
                  break L1;
                } else {
                  L2: {
                    if (((sk) this).field_j > 0) {
                      break L2;
                    } else {
                      ((sk) this).field_j = qd.field_Ob;
                      break L2;
                    }
                  }
                  ((sk) this).field_j = ((sk) this).field_j - 1;
                  break L1;
                }
              }
            }
            if (param1 == -20563) {
              L3: {
                if (-1 != ig.field_Yb) {
                  break L3;
                } else {
                  if (-1 == be.field_n) {
                    ((sk) this).field_q = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 != (((sk) this).field_q ^ -1)) {
                  break L4;
                } else {
                  L5: {
                    if (((sk) this).field_n) {
                      break L5;
                    } else {
                      if (pm.field_b) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param0 >= 0) {
                    L6: {
                      if (((sk) this).field_h == param0) {
                        break L6;
                      } else {
                        ((sk) this).field_o = true;
                        break L6;
                      }
                    }
                    ((sk) this).field_n = true;
                    ((sk) this).field_h = param0;
                    break L4;
                  } else {
                    if (!((sk) this).field_n) {
                      break L4;
                    } else {
                      ((sk) this).field_h = -1;
                      break L4;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        }
    }

    final boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 114) {
          L0: {
            L1: {
              if (0 != ((sk) this).field_p) {
                break L1;
              } else {
                if (84 == ((sk) this).field_d) {
                  break L1;
                } else {
                  if (-84 != (((sk) this).field_d ^ -1)) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    public sk() {
        ((sk) this).field_n = false;
        ((sk) this).field_h = 0;
    }

    sk(int param0) {
        ((sk) this).field_n = false;
        ((sk) this).field_h = 0;
        ((sk) this).field_l = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "START!";
        field_a = new ei[2][8];
        field_m = "Private";
        field_b = "Draw?";
    }
}
