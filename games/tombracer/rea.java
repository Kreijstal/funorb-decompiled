/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rea extends nv {
    private int field_s;
    private int field_q;
    private boolean field_u;
    private boolean field_p;
    private int field_o;
    private int field_v;
    private int field_n;
    private int field_w;
    static String field_r;
    private int field_x;
    private up field_t;

    final boolean l(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -5) {
          L0: {
            ((rea) this).field_t = null;
            if (-5 != ((rea) this).field_n) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-5 != ((rea) this).field_n) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(int param0) {
        int var2 = 97 / ((param0 - 2) / 62);
        return -2 == (((rea) this).field_n ^ -1) ? true : false;
    }

    final boolean r(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -31) {
          L0: {
            ((rea) this).field_o = 10;
            if (((rea) this).field_n != 2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((rea) this).field_n != 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, fsa param1) {
        L0: {
          super.a(param0, param1);
          if (4 > ((rea) this).b(true).field_E) {
            param1.h(3, 0);
            break L0;
          } else {
            break L0;
          }
        }
        param1.b((byte) -62, 8);
        if (0 == ((rea) this).field_q) {
          param1.b((byte) 17, true);
          ((rea) this).field_q = param1.b(73);
          param1.a((byte) -3, 0);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        param1.a((byte) 116, ((rea) this).field_v, 8);
        param1.a((byte) -128, ((rea) this).field_o, 8);
        param1.a((byte) 107, ((rea) this).field_s, 8);
        param1.a((byte) -20, ((rea) this).field_x, 8);
        param1.a((byte) -126, ((rea) this).field_u ? 1 : 0, 1);
        param1.a((byte) -23, ((rea) this).field_p ? 1 : 0, 1);
        ((rea) this).field_t.a(param1, (byte) 125);
    }

    rea(la param0, boolean param1) {
        super(param0, param1);
        ((rea) this).field_u = false;
        ((rea) this).field_p = false;
        ((rea) this).field_s = 25;
        ((rea) this).field_x = 50;
        ((rea) this).field_v = 50;
        ((rea) this).field_o = 25;
        ((rea) this).field_t = new up(0, 100);
        ((rea) this).field_t.b(1, 4);
        this.k((byte) -106);
    }

    private final void k(byte param0) {
        int var2 = 0;
        if (0 < ((rea) this).field_s) {
          L0: {
            if (0 >= ((rea) this).field_v) {
              ((rea) this).field_v = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 <= (((rea) this).field_o ^ -1)) {
              ((rea) this).field_o = 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (((rea) this).field_x <= 0) {
            ((rea) this).field_x = 1;
            var2 = 7 % ((-26 - param0) / 56);
            return;
          } else {
            var2 = 7 % ((-26 - param0) / 56);
            return;
          }
        } else {
          L2: {
            ((rea) this).field_s = 1;
            if (0 >= ((rea) this).field_v) {
              ((rea) this).field_v = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (-1 <= (((rea) this).field_o ^ -1)) {
              ((rea) this).field_o = 1;
              break L3;
            } else {
              break L3;
            }
          }
          if (((rea) this).field_x > 0) {
            var2 = 7 % ((-26 - param0) / 56);
            return;
          } else {
            ((rea) this).field_x = 1;
            var2 = 7 % ((-26 - param0) / 56);
            return;
          }
        }
    }

    final int j(byte param0) {
        if (param0 != 90) {
            field_r = null;
            return ((rea) this).field_o;
        }
        return ((rea) this).field_o;
    }

    final void b(byte param0, boolean param1) {
        ((rea) this).field_u = param1 ? true : false;
        if (param0 <= 64) {
            ((rea) this).field_q = -123;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((rea) this).a(109, 0, 65, 72, 73);
            return 2;
        }
        return 2;
    }

    final boolean s(int param0) {
        int var2 = -108 % ((param0 - -19) / 49);
        return (((rea) this).field_n ^ -1) == -4 ? true : false;
    }

    rea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ((rea) this).field_u = false;
        ((rea) this).field_p = false;
        if (-4 >= (param0.field_E ^ -1)) {
          L0: {
            ((rea) this).field_v = param1.b((byte) 44, 8);
            ((rea) this).field_o = param1.b((byte) 44, 8);
            if ((param0.field_E ^ -1) > -21) {
              break L0;
            } else {
              ((rea) this).field_s = param1.b((byte) 44, 8);
              break L0;
            }
          }
          L1: {
            ((rea) this).field_x = param1.b((byte) 44, 8);
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          L2: {
            ((rea) this).field_u = stackIn_11_1 != 0;
            if (param0.field_E < 20) {
              break L2;
            } else {
              L3: {
                stackOut_12_0 = this;
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L3;
                } else {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L3;
                }
              }
              ((rea) this).field_p = stackIn_15_1 != 0;
              break L2;
            }
          }
          if (16 <= param0.field_E) {
            ((rea) this).field_t = ad.a((byte) 87, param1);
            this.k((byte) -101);
          } else {
            ((rea) this).field_t = new up(0, 100);
            this.k((byte) -101);
          }
        } else {
          ((rea) this).field_o = 25;
          ((rea) this).field_u = false;
          ((rea) this).field_v = 50;
          ((rea) this).field_x = 50;
          if (16 <= param0.field_E) {
            ((rea) this).field_t = ad.a((byte) 87, param1);
            this.k((byte) -101);
          } else {
            ((rea) this).field_t = new up(0, 100);
            this.k((byte) -101);
          }
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            return true;
        }
        return true;
    }

    final void k(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        la var6 = null;
        int var7 = 0;
        hca var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = ((rea) this).field_g.H(param0 + -5537);
          var3 = ((rea) this).field_p ? 1 : 0;
          var4 = ((rea) this).field_g.d(3);
          var5 = ((rea) this).field_g.e(param0 + 4230);
          if (var3 == 0) {
            if (-1 != (((rea) this).field_n ^ -1)) {
              if (1 != ((rea) this).field_n) {
                break L0;
              } else {
                var3 = ck.a(var8.d(3), 1, var4, ((rea) this).field_g.c(param0 + -5496), ((rea) this).field_g.a((byte) 55), var8.e(9648), (byte) 82, var5, 1) ? 1 : 0;
                break L0;
              }
            } else {
              var3 = ck.a(var8.d(3), var8.a((byte) 55), var4, ((rea) this).field_g.c(-23), ((rea) this).field_g.a((byte) 55), var8.e(9648), (byte) 69, var5, var8.c(param0 + -5519)) ? 1 : 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var6_int = ((rea) this).field_n;
        if (-1 != (var6_int ^ -1)) {
          L1: {
            if (var6_int != 1) {
              if (2 == var6_int) {
                ((rea) this).field_w = ((rea) this).field_w + 1;
                if (((rea) this).field_w <= ((rea) this).field_o) {
                  break L1;
                } else {
                  var6 = ((rea) this).b(true);
                  int discarded$1 = var6.a(123, var5, ((rea) this).field_t, ((rea) this).field_g.a((byte) 55), ((rea) this).field_g.c(-79), var4);
                  this.b(0, 3);
                  ((rea) this).field_g.a((byte) -3, ((rea) this).field_q);
                  ((rea) this).field_g.b((byte) 17, false);
                  if (param0 == 5418) {
                    return;
                  } else {
                    ((rea) this).field_v = -69;
                    return;
                  }
                }
              } else {
                if (3 != var6_int) {
                  if ((var6_int ^ -1) == -5) {
                    ((rea) this).field_w = ((rea) this).field_w + 1;
                    if (((rea) this).field_w > ((rea) this).field_x) {
                      this.b(param0 + -5418, 1);
                      ((rea) this).field_g.L(127);
                      break L1;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        ((rea) this).field_v = -69;
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  ((rea) this).field_w = ((rea) this).field_w + 1;
                  if (((rea) this).field_s >= ((rea) this).field_w) {
                    break L1;
                  } else {
                    this.b(param0 + -5418, 4);
                    ((rea) this).field_g.a((byte) -3, 0);
                    ((rea) this).field_g.b((byte) 17, true);
                    if (param0 == 5418) {
                      return;
                    } else {
                      ((rea) this).field_v = -69;
                      return;
                    }
                  }
                }
              }
            } else {
              if (var3 == 0) {
                this.b(0, 0);
                if (!((rea) this).field_u) {
                  break L1;
                } else {
                  ((rea) this).field_g.L(-31);
                  if (param0 != 5418) {
                    ((rea) this).field_v = -69;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((rea) this).field_n = 1;
                if (((rea) this).field_u) {
                  ((rea) this).field_g.G(121);
                  ((rea) this).field_w = ((rea) this).field_w + 1;
                  if (((rea) this).field_v < ((rea) this).field_w) {
                    this.b(param0 ^ 5418, 2);
                    if (!((rea) this).field_u) {
                      ((rea) this).field_g.G(121);
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 != 5418) {
                      ((rea) this).field_v = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  ((rea) this).field_w = ((rea) this).field_w + 1;
                  if (((rea) this).field_v < ((rea) this).field_w) {
                    this.b(param0 ^ 5418, 2);
                    if (!((rea) this).field_u) {
                      ((rea) this).field_g.G(121);
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 != 5418) {
                      ((rea) this).field_v = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
          if (param0 == 5418) {
            return;
          } else {
            ((rea) this).field_v = -69;
            return;
          }
        } else {
          L2: {
            if (var3 == 0) {
              this.b(0, 0);
              if (!((rea) this).field_u) {
                break L2;
              } else {
                L3: {
                  ((rea) this).field_g.L(-31);
                  if (param0 == 5418) {
                    break L3;
                  } else {
                    ((rea) this).field_v = -69;
                    break L3;
                  }
                }
                return;
              }
            } else {
              L4: {
                ((rea) this).field_n = 1;
                if (!((rea) this).field_u) {
                  break L4;
                } else {
                  ((rea) this).field_g.G(121);
                  break L4;
                }
              }
              ((rea) this).field_w = ((rea) this).field_w + 1;
              if (((rea) this).field_v < ((rea) this).field_w) {
                this.b(param0 ^ 5418, 2);
                if (!((rea) this).field_u) {
                  L5: {
                    ((rea) this).field_g.G(121);
                    if (param0 == 5418) {
                      break L5;
                    } else {
                      ((rea) this).field_v = -69;
                      break L5;
                    }
                  }
                  return;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          if (param0 != 5418) {
            ((rea) this).field_v = -69;
            return;
          } else {
            return;
          }
        }
    }

    final static hja[] a(cn param0, int param1, int param2, byte param3) {
        if (jna.a(false, param2, param1, param0)) {
          if (param3 <= 20) {
            field_r = null;
            return uj.a(0);
          } else {
            return uj.a(0);
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 12134) {
            boolean discarded$0 = rea.a(85, 105, 55, -55, 43, true, 103);
        }
    }

    private final void b(int param0, int param1) {
        ((rea) this).field_n = param1;
        ((rea) this).field_w = param0;
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 49, param0, ((rea) this).field_n);
        if (param1 >= -48) {
            return -52;
        }
        return param0;
    }

    final int d(boolean param0) {
        if (param0) {
            int discarded$0 = ((rea) this).g((byte) -41);
            return ((rea) this).field_x;
        }
        return ((rea) this).field_x;
    }

    final int g(byte param0) {
        if (param0 > -36) {
            field_r = null;
            return ((rea) this).field_w;
        }
        return ((rea) this).field_w;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (!param5) {
          if (param2 <= param3) {
            if (param1 + param2 <= param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param6 > param0) {
                    break L1;
                  } else {
                    if (param4 + param6 <= param0) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$11 = rea.a(-44, -75, 109, 115, -67, true, -126);
          if (param2 <= param3) {
            if (param1 + param2 > param3) {
              if (param6 <= param0) {
                if (param4 + param6 <= param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != 1) {
          L0: {
            int discarded$10 = ((rea) this).g((byte) 48);
            if ((((rea) this).field_n ^ -1) != -4) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((rea) this).field_n ^ -1) != -4) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((rea) this).field_o = param1;
        if (param2 != 1) {
          ((rea) this).field_q = -90;
          ((rea) this).field_v = param4;
          ((rea) this).field_x = param3;
          ((rea) this).field_s = param0;
          return;
        } else {
          ((rea) this).field_v = param4;
          ((rea) this).field_x = param3;
          ((rea) this).field_s = param0;
          return;
        }
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        Object var6 = null;
        if (3 != ((rea) this).field_n) {
          return false;
        } else {
          if (param1 != 1) {
            var6 = null;
            boolean discarded$2 = ((rea) this).a(-121, -9, (pc) null, -81);
            param2.a(param3, (byte) 47);
            return true;
          } else {
            param2.a(param3, (byte) 47);
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Player Name: ";
    }
}
