/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mda extends c implements fo, ffa, gma {
    private int field_i;
    private la field_q;
    private int field_n;
    static jea field_v;
    private int field_k;
    private int field_l;
    private int field_r;
    private int field_t;
    private boolean field_o;
    private int field_u;
    private int field_p;
    private int field_s;
    private int field_j;
    private int field_m;
    private int field_w;

    final static void b(int param0, byte param1) {
        int var3 = 0;
        upa var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param1 <= -101) {
          var4 = (upa) (Object) ina.field_d.f(-80);
          L0: while (true) {
            if (var4 == null) {
              return;
            } else {
              ip.a(var4, param0, 2147);
              var4 = (upa) (Object) ina.field_d.e(121);
              continue L0;
            }
          }
        } else {
          mda.b(-10, (byte) -8);
          var4 = (upa) (Object) ina.field_d.f(-80);
          L1: while (true) {
            if (var4 == null) {
              return;
            } else {
              ip.a(var4, param0, 2147);
              var4 = (upa) (Object) ina.field_d.e(121);
              continue L1;
            }
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return true;
        }
        return ((mda) this).field_o;
    }

    private final void a(int param0, int param1, int param2, la param3, int param4, int param5) {
        ((mda) this).field_o = false;
        ((mda) this).field_q = param3;
        ((mda) this).field_l = param4 * 2;
        ((mda) this).field_m = 0;
        ((mda) this).field_n = param2;
        ((mda) this).field_s = param0;
        ((mda) this).field_i = iia.d(param1 * param5, 786432, 2);
        ((mda) this).field_t = 0;
        ((mda) this).field_k = ((mda) this).field_l;
        this.s(0);
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (((mda) this).field_s != 1) {
          return 0;
        } else {
          var6 = 80 / ((-23 - param1) / 56);
          return ((mda) this).field_q.a((ffa) this, (gma) this, 1, ((mda) this).field_k, param3, 12, ((mda) this).field_k, ((mda) this).field_p, param4, param0, ((mda) this).field_j, param2, true);
        }
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5 = 0;
        int var6 = 0;
        if (!((((mda) this).field_s ^ -1) == -2)) {
            return false;
        }
        if (param0 != -1) {
            ((mda) this).field_i = 97;
            var5 = eha.a(((mda) this).field_k, 12, ((mda) this).field_j, ((mda) this).field_k, param3, ((mda) this).field_p, 2);
            if (!(0 != (var5 ^ -1))) {
                return false;
            }
            var6 = wm.a(4096, var5, 108);
            param3.a(var6, (byte) 47);
            return true;
        }
        var5 = eha.a(((mda) this).field_k, 12, ((mda) this).field_j, ((mda) this).field_k, param3, ((mda) this).field_p, 2);
        if (!(0 != (var5 ^ -1))) {
            return false;
        }
        var6 = wm.a(4096, var5, 108);
        param3.a(var6, (byte) 47);
        return true;
    }

    final void a(la param0, int param1) {
        ((mda) this).field_p = param0.a(((mda) this).field_p, (byte) 71);
        if (param1 >= -16) {
            boolean discarded$0 = mda.b(-115, (byte) 124, 61, -21);
        }
    }

    public final int b(int param0) {
        int var2 = 0;
        var2 = -50 % ((param0 - 1) / 45);
        if (((mda) this).field_s == 1) {
          return ((mda) this).field_k >> -986743375;
        } else {
          return 0;
        }
    }

    public final int d(int param0) {
        if (param0 != 3) {
            return -56;
        }
        return ((mda) this).field_p;
    }

    final void a(uw param0, int param1) {
        if (param1 != 5465) {
            ((mda) this).field_m = -24;
            param0.a((byte) 111, 6, (fo) this);
            return;
        }
        param0.a((byte) 111, 6, (fo) this);
    }

    public final int a(up param0, int param1, pc param2) {
        if (!((eha.a(((mda) this).field_k, param1, ((mda) this).field_j, ((mda) this).field_k, param2, ((mda) this).field_p, 2) ^ -1) <= -1)) {
            return 0;
        }
        return this.a(param0, -6);
    }

    public final boolean a(byte param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -55) {
          L0: {
            if (((mda) this).field_s == 1) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!param1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        if (1 == ((mda) this).field_s) {
          if (!((mda) this).a((byte) 110, param4, param6, param0, param3)) {
            if (param2 < 55) {
              return false;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (param2 < 55) {
            return false;
          } else {
            return false;
          }
        }
    }

    private final boolean a(gma param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 61) {
          L0: {
            ((mda) this).field_l = -102;
            if (-2 != ((mda) this).field_s) {
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
            if (-2 != ((mda) this).field_s) {
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

    public final int a(up param0, ep param1, int param2) {
        int var4 = 0;
        var4 = param1.i(-1);
        if (param2 >= -97) {
          ((mda) this).field_q = null;
          return ((mda) this).a(param0, var4, param1.d(3), 0, param1.e(9648), var4);
        } else {
          return ((mda) this).a(param0, var4, param1.d(3), 0, param1.e(9648), var4);
        }
    }

    public final int b(byte param0) {
        int var2 = 12 % ((param0 - -23) / 53);
        return ((mda) this).field_p;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            return 2;
        }
        return 0;
    }

    public final int g(byte param0) {
        if (param0 != 115) {
            la discarded$0 = ((mda) this).f((byte) -93);
            return 0;
        }
        return 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        Object var6 = null;
        if (param1 != -78) {
          var6 = null;
          int discarded$2 = ((mda) this).a((up) null, (ep) null, -22);
          ((mda) this).field_j = param2;
          ((mda) this).field_p = param0;
          return;
        } else {
          ((mda) this).field_j = param2;
          ((mda) this).field_p = param0;
          return;
        }
    }

    final static boolean b(int param0, byte param1, int param2, int param3) {
        if (!fua.field_g) {
          if (vo.field_b) {
            return mj.c(param1 + 2097196, param0, param3);
          } else {
            if (!dfa.a(param0, false, param3)) {
              if (ok.field_s) {
                return false;
              } else {
                if (param1 != -44) {
                  mda.j((byte) -121);
                  return eqa.a(param2, true, param0);
                } else {
                  return eqa.a(param2, true, param0);
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return apa.field_c.a((byte) -121, fna.field_h, kda.field_td);
        }
    }

    public final int e(int param0) {
        Object var3 = null;
        if (param0 != 9648) {
          var3 = null;
          boolean discarded$2 = ((mda) this).a(-103, (gma) null, -104, -49, -55, (ffa) null, -28, -39);
          return ((mda) this).field_j;
        } else {
          return ((mda) this).field_j;
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((mda) this).field_r = 45;
            return ((mda) this).field_j;
        }
        return ((mda) this).field_j;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
            ((mda) this).field_j = 118;
            return 0;
        }
        return 0;
    }

    private final int a(up param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (param1 == -6) {
          if (0 == ((mda) this).field_s) {
            if (param0.field_j != -4) {
              if (-6 == param0.field_j) {
                this.i((byte) -127);
                boolean discarded$2 = ((mda) this).field_q.b(param1 + 30103, ((mda) this).field_k / 2, 1, ((mda) this).field_j, ((mda) this).field_p);
                var3 = param0.field_b;
                return var3;
              } else {
                return var3;
              }
            } else {
              ((mda) this).field_m = ((mda) this).field_m + 25;
              return var3;
            }
          } else {
            if (-2 == ((mda) this).field_s) {
              if (param0.field_j != 3) {
                if (-6 != param0.field_j) {
                  if (-1 != (param0.field_j ^ -1)) {
                    return var3;
                  } else {
                    ((mda) this).field_k = ((mda) this).field_k - 262144;
                    this.n(786432);
                    var3 = param0.field_b;
                    return var3;
                  }
                } else {
                  return var3;
                }
              } else {
                this.i((byte) -126);
                boolean discarded$3 = ((mda) this).field_q.b(30097, ((mda) this).field_k / 2, 0, ((mda) this).field_j, ((mda) this).field_p);
                var3 = param0.field_b;
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return 114;
        }
    }

    private final void i(byte param0) {
        ((mda) this).field_o = true;
        if (param0 > -120) {
            return;
        }
        ((mda) this).field_q.field_u.a((ffa) this, (byte) 82);
    }

    public final int a(boolean param0) {
        if (!param0) {
            return 18;
        }
        return 11 * (1 + ((mda) this).field_w);
    }

    public static void j(byte param0) {
        if (param0 != 87) {
            boolean discarded$0 = mda.b(-56, (byte) 104, -90, 106);
            field_v = null;
            return;
        }
        field_v = null;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int stackIn_17_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        if (param0 > 68) {
          if (((mda) this).a((byte) -55, param1)) {
            if (param4 == -1) {
              if (-1 != param3) {
                L0: {
                  L1: {
                    this.s(0);
                    this.a(param3, (byte) -36, param2, param4, param5);
                    if (((mda) this).field_u - -param4 != ((mda) this).field_p) {
                      break L1;
                    } else {
                      if (((mda) this).field_j != ((mda) this).field_r - -param3) {
                        break L1;
                      } else {
                        stackOut_32_0 = 1;
                        stackIn_34_0 = stackOut_32_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_33_0 = 0;
                  stackIn_34_0 = stackOut_33_0;
                  break L0;
                }
                return stackIn_34_0 != 0;
              } else {
                return true;
              }
            } else {
              L2: {
                L3: {
                  this.s(0);
                  this.a(param3, (byte) -36, param2, param4, param5);
                  if (((mda) this).field_u - -param4 != ((mda) this).field_p) {
                    break L3;
                  } else {
                    if (((mda) this).field_j != ((mda) this).field_r - -param3) {
                      break L3;
                    } else {
                      stackOut_25_0 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                }
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                break L2;
              }
              return stackIn_27_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          ((mda) this).field_t = -15;
          if (((mda) this).a((byte) -55, param1)) {
            if (param4 == 0) {
              if (-1 == (param3 ^ -1)) {
                return true;
              } else {
                this.s(0);
                this.a(param3, (byte) -36, param2, param4, param5);
                if (((mda) this).field_u - -param4 != ((mda) this).field_p) {
                  return false;
                } else {
                  L4: {
                    if (((mda) this).field_j != ((mda) this).field_r - -param3) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    }
                  }
                  return stackIn_17_0 != 0;
                }
              }
            } else {
              this.s(0);
              this.a(param3, (byte) -36, param2, param4, param5);
              if (((mda) this).field_u - -param4 == ((mda) this).field_p) {
                if (((mda) this).field_j != ((mda) this).field_r - -param3) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
          ((mda) this).f(-11);
          return io.a(param4, ((mda) this).field_j, (byte) -70, param3, ((mda) this).field_p, param1, ((mda) this).field_k, ((mda) this).field_k, param2);
        } else {
          return io.a(param4, ((mda) this).field_j, (byte) -70, param3, ((mda) this).field_p, param1, ((mda) this).field_k, ((mda) this).field_k, param2);
        }
    }

    public final int i(int param0) {
        if (param0 <= 90) {
            boolean discarded$0 = mda.b(122, (byte) -32, 39, 92);
            return ((mda) this).field_u;
        }
        return ((mda) this).field_u;
    }

    public final boolean l(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        if (param0 <= 103) {
          int discarded$2 = ((mda) this).b(-91);
          dea.field_a.a((mda) this, 95, param1);
          return;
        } else {
          dea.field_a.a((mda) this, 95, param1);
          return;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (1 == ((mda) this).field_s) {
          this.s(0);
          var6 = 0;
          if (param1 <= -11) {
            L0: {
              if (-1 != (param3 ^ -1)) {
                var6 = 1;
                ((mda) this).field_p = ((mda) this).field_p + param3;
                break L0;
              } else {
                break L0;
              }
            }
            if (var6 != 0) {
              if (2 == this.a(((mda) this).field_p + -((mda) this).field_u, -104, param4, 0, param2)) {
                L1: {
                  ((mda) this).field_p = ((mda) this).field_u;
                  var6 = 0;
                  if (0 != param0) {
                    ((mda) this).field_j = ((mda) this).field_j + param0;
                    var6 = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var6 == 0) {
                    break L2;
                  } else {
                    if ((this.a(0, -103, param4, ((mda) this).e(9648) - ((mda) this).field_r, param2) ^ -1) == -3) {
                      ((mda) this).field_j = ((mda) this).field_r;
                      break L2;
                    } else {
                      if (((mda) this).field_j == ((mda) this).field_r) {
                        if (((mda) this).field_p != ((mda) this).field_u) {
                          ((mda) this).field_q.field_u.a((ffa) this, -123);
                          ((mda) this).field_q.field_u.b((ffa) this, 7073);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((mda) this).field_q.field_u.a((ffa) this, -123);
                        ((mda) this).field_q.field_u.b((ffa) this, 7073);
                        return;
                      }
                    }
                  }
                }
                if (((mda) this).field_j == ((mda) this).field_r) {
                  if (((mda) this).field_p != ((mda) this).field_u) {
                    ((mda) this).field_q.field_u.a((ffa) this, -123);
                    ((mda) this).field_q.field_u.b((ffa) this, 7073);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((mda) this).field_q.field_u.a((ffa) this, -123);
                  ((mda) this).field_q.field_u.b((ffa) this, 7073);
                  return;
                }
              } else {
                L3: {
                  var6 = 0;
                  if (0 != param0) {
                    ((mda) this).field_j = ((mda) this).field_j + param0;
                    var6 = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var6 == 0) {
                    break L4;
                  } else {
                    if ((this.a(0, -103, param4, ((mda) this).e(9648) - ((mda) this).field_r, param2) ^ -1) == -3) {
                      ((mda) this).field_j = ((mda) this).field_r;
                      break L4;
                    } else {
                      if (((mda) this).field_j == ((mda) this).field_r) {
                        if (((mda) this).field_p == ((mda) this).field_u) {
                          return;
                        } else {
                          ((mda) this).field_q.field_u.a((ffa) this, -123);
                          ((mda) this).field_q.field_u.b((ffa) this, 7073);
                          return;
                        }
                      } else {
                        ((mda) this).field_q.field_u.a((ffa) this, -123);
                        ((mda) this).field_q.field_u.b((ffa) this, 7073);
                        return;
                      }
                    }
                  }
                }
                if (((mda) this).field_j == ((mda) this).field_r) {
                  if (((mda) this).field_p == ((mda) this).field_u) {
                    return;
                  } else {
                    ((mda) this).field_q.field_u.a((ffa) this, -123);
                    ((mda) this).field_q.field_u.b((ffa) this, 7073);
                    return;
                  }
                } else {
                  ((mda) this).field_q.field_u.a((ffa) this, -123);
                  ((mda) this).field_q.field_u.b((ffa) this, 7073);
                  return;
                }
              }
            } else {
              L5: {
                var6 = 0;
                if (0 != param0) {
                  ((mda) this).field_j = ((mda) this).field_j + param0;
                  var6 = 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (var6 == 0) {
                  break L6;
                } else {
                  if ((this.a(0, -103, param4, ((mda) this).e(9648) - ((mda) this).field_r, param2) ^ -1) == -3) {
                    ((mda) this).field_j = ((mda) this).field_r;
                    break L6;
                  } else {
                    if (((mda) this).field_j == ((mda) this).field_r) {
                      if (((mda) this).field_p == ((mda) this).field_u) {
                        return;
                      } else {
                        ((mda) this).field_q.field_u.a((ffa) this, -123);
                        ((mda) this).field_q.field_u.b((ffa) this, 7073);
                        return;
                      }
                    } else {
                      ((mda) this).field_q.field_u.a((ffa) this, -123);
                      ((mda) this).field_q.field_u.b((ffa) this, 7073);
                      return;
                    }
                  }
                }
              }
              if (((mda) this).field_j == ((mda) this).field_r) {
                if (((mda) this).field_p == ((mda) this).field_u) {
                  return;
                } else {
                  ((mda) this).field_q.field_u.a((ffa) this, -123);
                  ((mda) this).field_q.field_u.b((ffa) this, 7073);
                  return;
                }
              } else {
                ((mda) this).field_q.field_u.a((ffa) this, -123);
                ((mda) this).field_q.field_u.b((ffa) this, 7073);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int r(int param0) {
        int var2 = -27 % ((param0 - 55) / 55);
        return ((mda) this).field_s;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            return -104;
        }
        return ((mda) this).field_k;
    }

    private final void s(int param0) {
        ((mda) this).field_u = ((mda) this).field_p;
        if (param0 != 0) {
          ((mda) this).field_j = -105;
          ((mda) this).field_r = ((mda) this).field_j;
          return;
        } else {
          ((mda) this).field_r = ((mda) this).field_j;
          return;
        }
    }

    public final la f(byte param0) {
        int var2 = 38 / ((param0 - 0) / 61);
        return ((mda) this).field_q;
    }

    final void a(la param0, int param1, int param2, int param3, int param4, int param5) {
        qea var7 = null;
        int var8 = 0;
        L0: {
          var7 = param0.q(-79);
          if (param4 != 0) {
            var8 = 0;
            break L0;
          } else {
            var8 = 200 - -var7.a(100, 0);
            break L0;
          }
        }
        if (param2 <= 36) {
          ((mda) this).field_t = -51;
          this.a(param4, 1, var8, param0, param5, 2);
          return;
        } else {
          this.a(param4, 1, var8, param0, param5, 2);
          return;
        }
    }

    final int t(int param0) {
        if (param0 != 1) {
            ((mda) this).field_m = -125;
            return ((mda) this).field_k;
        }
        return ((mda) this).field_k;
    }

    final void h(byte param0) {
        ((mda) this).field_k = ((mda) this).field_l;
        if (param0 != -1) {
          int discarded$2 = ((mda) this).c((byte) 100);
          ((mda) this).field_m = 0;
          return;
        } else {
          ((mda) this).field_m = 0;
          return;
        }
    }

    public final boolean a(int param0) {
        int var2 = 7 % ((param0 - 6) / 46);
        return 1 == ((mda) this).field_s ? true : false;
    }

    final c d(boolean param0) {
        if (!param0) {
            int discarded$0 = ((mda) this).k(117);
            return (c) (Object) new mda();
        }
        return (c) (Object) new mda();
    }

    private final void n(int param0) {
        if (param0 > ((mda) this).field_k) {
            this.i((byte) -121);
        }
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            return true;
        }
        return ((mda) this).field_o;
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
            return 75;
        }
        return 0;
    }

    final void a(int param0, boolean param1) {
        float var3 = 0.0f;
        hca var5 = null;
        hca var6 = null;
        hca var7 = null;
        if (!((mda) this).field_o) {
          if (!param1) {
            L0: {
              if (((mda) this).field_t > 0) {
                ((mda) this).field_t = ((mda) this).field_t - 1;
                break L0;
              } else {
                if (-1 <= (((mda) this).field_n ^ -1)) {
                  break L0;
                } else {
                  ((mda) this).field_m = ((mda) this).field_m + 1;
                  if (((mda) this).field_n > ((mda) this).field_m) {
                    L1: {
                      ((mda) this).field_q.field_u.a((ffa) this, -50);
                      if (0 < ((mda) this).field_n) {
                        var3 = (float)((mda) this).field_m / (float)((mda) this).field_n;
                        ((mda) this).field_k = (int)((float)(((mda) this).field_i - ((mda) this).field_l) * var3 + (float)((mda) this).field_l);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    this.n(param0 ^ -786433);
                    ((mda) this).field_q.field_u.b((ffa) this, 7073);
                    if ((((mda) this).field_s ^ -1) == param0) {
                      L2: {
                        var6 = ((mda) this).field_q.u(-37);
                        if (((mda) this).a((byte) 110, var6.e(9648), var6.d(3), var6.a((byte) 55), var6.c(param0 ^ 104))) {
                          var6.G(31027);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.i((byte) -126);
                    return;
                  }
                }
              }
            }
            L3: {
              ((mda) this).field_q.field_u.a((ffa) this, -50);
              if (0 < ((mda) this).field_n) {
                var3 = (float)((mda) this).field_m / (float)((mda) this).field_n;
                ((mda) this).field_k = (int)((float)(((mda) this).field_i - ((mda) this).field_l) * var3 + (float)((mda) this).field_l);
                break L3;
              } else {
                break L3;
              }
            }
            this.n(param0 ^ -786433);
            ((mda) this).field_q.field_u.b((ffa) this, 7073);
            if ((((mda) this).field_s ^ -1) == param0) {
              L4: {
                var7 = ((mda) this).field_q.u(-37);
                if (((mda) this).a((byte) 110, var7.e(9648), var7.d(3), var7.a((byte) 55), var7.c(param0 ^ 104))) {
                  var7.G(31027);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L5: {
              ((mda) this).field_q.field_u.a((ffa) this, -50);
              if (0 < ((mda) this).field_n) {
                var3 = (float)((mda) this).field_m / (float)((mda) this).field_n;
                ((mda) this).field_k = (int)((float)(((mda) this).field_i - ((mda) this).field_l) * var3 + (float)((mda) this).field_l);
                break L5;
              } else {
                break L5;
              }
            }
            this.n(param0 ^ -786433);
            ((mda) this).field_q.field_u.b((ffa) this, 7073);
            if ((((mda) this).field_s ^ -1) == param0) {
              L6: {
                var5 = ((mda) this).field_q.u(-37);
                if (((mda) this).a((byte) 110, var5.e(9648), var5.d(3), var5.a((byte) 55), var5.c(param0 ^ 104))) {
                  var5.G(31027);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public final boolean a(gma param0, int param1) {
        if (param1 != 0) {
            ((mda) this).field_q = null;
            return this.a(param0, (byte) 61);
        }
        return this.a(param0, (byte) 61);
    }

    public final boolean a(int param0, gma param1) {
        if (!this.a(param1, (byte) 61)) {
          return false;
        } else {
          if (param0 > -77) {
            ((mda) this).field_n = -69;
            this.i((byte) -128);
            return true;
          } else {
            this.i((byte) -128);
            return true;
          }
        }
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((mda) this).field_s = 113;
        }
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            ((mda) this).field_m = -67;
            return ((mda) this).field_r;
        }
        return ((mda) this).field_r;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        if (((mda) this).a((byte) 110, param4, param2, param5, param1)) {
          if (param3 != 0) {
            ((mda) this).field_q = null;
            return this.a(param0, -6);
          } else {
            return this.a(param0, -6);
          }
        } else {
          return 0;
        }
    }

    mda() {
        ui.field_a = ui.field_a + 1;
        ((mda) this).field_w = ui.field_a;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            ((mda) this).field_l = 88;
            return ((mda) this).field_k;
        }
        return ((mda) this).field_k;
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ((mda) this).a((byte) -105, false);
            return false;
        }
        return false;
    }

    public final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((mda) this).field_w = -99;
            if ((((mda) this).field_s ^ -1) != -2) {
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
            if ((((mda) this).field_s ^ -1) != -2) {
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

    static {
    }
}
