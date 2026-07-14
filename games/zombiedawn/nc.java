/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends le {
    private int field_l;
    int field_m;
    static fn field_r;
    static int field_j;
    private int field_i;
    static vn field_k;
    private int field_s;
    private int field_n;
    int field_q;
    private fn field_o;
    static tp field_p;
    private int field_h;

    final boolean c(int param0) {
        if (param0 >= 81) {
          if (-751 >= (((nc) this).field_n ^ -1)) {
            if (((nc) this).field_l != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0) {
        sl.field_b = new be(so.field_a.nextInt(), 3, 256, 256, 256, 2.0f, true);
        if (param0 != 11800) {
          return;
        } else {
          na.field_c = sl.field_b.c(256, 256, param0 + -11827);
          return;
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != -2135443998) {
            nc.d(30);
            field_r = null;
            field_k = null;
            return;
        }
        field_r = null;
        field_k = null;
    }

    final void a(boolean param0) {
        fb var2 = null;
        ah var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (!((nc) this).c(116)) {
          ((nc) this).field_s = ((nc) this).field_s + 1;
          if (((nc) this).field_s > 10) {
            ((nc) this).field_s = 0;
            var2 = (fb) (Object) dj.field_e.field_R.b((byte) 26);
            L0: while (true) {
              if (var2 != null) {
                L1: {
                  if (var2 instanceof ah) {
                    var3 = (ah) (Object) var2;
                    var3.a((nc) this, -26246);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = (fb) (Object) dj.field_e.field_R.a(false);
                continue L0;
              } else {
                ((nc) this).field_i = ((nc) this).field_i + 7;
                if (!param0) {
                  if (256 >= ((nc) this).field_i) {
                    if (((nc) this).field_n <= -751) {
                      L2: {
                        ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                        if ((((nc) this).field_l ^ -1) >= -257) {
                          break L2;
                        } else {
                          ((nc) this).field_l = 256;
                          break L2;
                        }
                      }
                      L3: {
                        if (0 <= ((nc) this).field_l) {
                          break L3;
                        } else {
                          ((nc) this).field_l = 0;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      L4: {
                        if (-257 > ((nc) this).field_l) {
                          ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        ((nc) this).field_n = ((nc) this).field_n + 1;
                        if ((((nc) this).field_l ^ -1) >= -257) {
                          break L5;
                        } else {
                          ((nc) this).field_l = 256;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 <= ((nc) this).field_l) {
                          break L6;
                        } else {
                          ((nc) this).field_l = 0;
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      ((nc) this).field_i = 0;
                      if (((nc) this).field_n <= -751) {
                        ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                        break L7;
                      } else {
                        L8: {
                          if (-257 > ((nc) this).field_l) {
                            ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        ((nc) this).field_n = ((nc) this).field_n + 1;
                        break L7;
                      }
                    }
                    L9: {
                      if ((((nc) this).field_l ^ -1) >= -257) {
                        break L9;
                      } else {
                        ((nc) this).field_l = 256;
                        break L9;
                      }
                    }
                    L10: {
                      if (0 <= ((nc) this).field_l) {
                        break L10;
                      } else {
                        ((nc) this).field_l = 0;
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            ((nc) this).field_i = ((nc) this).field_i + 7;
            if (!param0) {
              if (256 >= ((nc) this).field_i) {
                if (((nc) this).field_n <= -751) {
                  ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                  if ((((nc) this).field_l ^ -1) >= -257) {
                    if (0 <= ((nc) this).field_l) {
                      return;
                    } else {
                      ((nc) this).field_l = 0;
                      return;
                    }
                  } else {
                    ((nc) this).field_l = 256;
                    if (0 <= ((nc) this).field_l) {
                      return;
                    } else {
                      ((nc) this).field_l = 0;
                      return;
                    }
                  }
                } else {
                  L11: {
                    if (-257 > ((nc) this).field_l) {
                      ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((nc) this).field_n = ((nc) this).field_n + 1;
                  if ((((nc) this).field_l ^ -1) >= -257) {
                    if (0 > ((nc) this).field_l) {
                      ((nc) this).field_l = 0;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L12: {
                      ((nc) this).field_l = 256;
                      if (0 <= ((nc) this).field_l) {
                        break L12;
                      } else {
                        ((nc) this).field_l = 0;
                        break L12;
                      }
                    }
                    return;
                  }
                }
              } else {
                L13: {
                  ((nc) this).field_i = 0;
                  if (((nc) this).field_n <= -751) {
                    ((nc) this).field_l = ((nc) this).field_l - ((nc) this).field_h;
                    break L13;
                  } else {
                    L14: {
                      if (-257 > ((nc) this).field_l) {
                        ((nc) this).field_l = ((nc) this).field_l + ((nc) this).field_h;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((nc) this).field_n = ((nc) this).field_n + 1;
                    break L13;
                  }
                }
                if ((((nc) this).field_l ^ -1) >= -257) {
                  if (0 > ((nc) this).field_l) {
                    ((nc) this).field_l = 0;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L15: {
                    ((nc) this).field_l = 256;
                    if (0 <= ((nc) this).field_l) {
                      break L15;
                    } else {
                      ((nc) this).field_l = 0;
                      break L15;
                    }
                  }
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        ((nc) this).field_n = 750;
        if (param0 != -64) {
            return;
        }
        ((nc) this).field_l = 0;
    }

    final static void d(byte param0) {
        int var1 = 0;
        if ((fl.field_a ^ -1) != -11) {
          if (nm.c(-23022)) {
            ma.field_p = true;
            var1 = 39 / ((46 - param0) / 34);
            return;
          } else {
            gf.a((byte) 41);
            fl.field_a = 11;
            ma.field_p = true;
            var1 = 39 / ((46 - param0) / 34);
            return;
          }
        } else {
          gf.a((byte) 41);
          fl.field_a = 11;
          ma.field_p = true;
          var1 = 39 / ((46 - param0) / 34);
          return;
        }
    }

    final void a(wk param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var3 = param0.a(((nc) this).field_m, (byte) -61);
        var4 = param0.a(((nc) this).field_q, 0);
        ((nc) this).field_o.h(pj.a(var4, 51, var3));
        if (param1) {
          if (255 >= (var3 ^ -1)) {
            if (-256 <= var4) {
              if (var3 <= bd.field_e - -256) {
                if (256 + nh.field_P < var4) {
                  return;
                } else {
                  L0: {
                    if ((((nc) this).field_l ^ -1) > -257) {
                      stackOut_11_0 = (-((nc) this).field_i + 256) * ((nc) this).field_l >> -243899286;
                      stackIn_12_0 = stackOut_11_0;
                      break L0;
                    } else {
                      stackOut_10_0 = -((nc) this).field_i + 256 >> -2135443998;
                      stackIn_12_0 = stackOut_10_0;
                      break L0;
                    }
                  }
                  var5 = stackIn_12_0;
                  bi.d(var3, var4, ((nc) this).field_i, 0, var5);
                  so.b(wk.field_o, -256 + var3, -256 + var4, ((nc) this).field_l);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    nc(int param0, int param1) {
        ((nc) this).field_s = 0;
        ((nc) this).field_o = null;
        ((nc) this).field_i = 0;
        ((nc) this).field_l = 0;
        ((nc) this).field_q = param1;
        ((nc) this).field_n = 0;
        ((nc) this).field_h = 3;
        ((nc) this).field_m = param0;
        ((nc) this).field_o = kh.a(17, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = null;
        field_j = 0;
    }
}
