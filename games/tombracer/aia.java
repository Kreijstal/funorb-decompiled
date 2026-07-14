/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aia extends vg {
    private int field_i;
    private int field_w;
    private int field_g;
    private int field_u;
    private int field_m;
    static String field_j;
    static String field_v;
    private boolean field_l;
    static int[] field_t;
    private int field_r;
    private int field_s;
    private int field_n;
    private int field_f;
    private int field_h;
    private int field_p;
    private int field_q;
    private int field_k;
    private int field_o;

    final void a(int param0, int param1, int param2, byte param3) {
        ((aia) this).field_i = 0;
        int var5 = -52 % ((param3 - 44) / 36);
        ((aia) this).field_k = 0;
    }

    final int f(int param0) {
        if (param0 != 0) {
            ((aia) this).field_l = true;
        }
        return ((aia) this).field_r;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, fsa param5, la param6) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qea var17 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        if (((aia) this).field_k > 0) {
          ((aia) this).field_k = ((aia) this).field_k - 1;
          return;
        } else {
          L0: {
            var17 = param6.q(57);
            if (param6.a(-1553494544).f(8, 10915)) {
              ((aia) this).field_o = 100 - -var17.a(50, 0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var9 = ((aia) this).a(0) ? 1 : 0;
            var10 = this.h(21302) ? 1 : 0;
            if (param4 <= -55) {
              break L1;
            } else {
              int discarded$1 = ((aia) this).g(-9);
              break L1;
            }
          }
          L2: {
            var11 = 0;
            if (var9 != 0) {
              break L2;
            } else {
              if (var10 == 0) {
                if (var17.a(500, 0) == 0) {
                  var11 = 1;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (((aia) this).field_h <= 0) {
              break L3;
            } else {
              ((aia) this).field_h = ((aia) this).field_h - 1;
              if (((aia) this).field_h == 0) {
                var11 = 1;
                if (0 >= ((aia) this).field_i) {
                  break L3;
                } else {
                  ((aia) this).field_o = ((aia) this).field_i;
                  ((aia) this).field_i = 0;
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
          L4: {
            if (var11 == 0) {
              break L4;
            } else {
              if (((aia) this).field_l) {
                break L4;
              } else {
                L5: {
                  ((aia) this).field_p = 0;
                  ((aia) this).field_s = 0;
                  if (var10 != 0) {
                    break L5;
                  } else {
                    if (var9 == 0) {
                      this.a(param6, -92);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
                return;
              }
            }
          }
          L6: {
            if (((aia) this).field_l) {
              var12 = 65536;
              ((aia) this).field_s = var12 * ne.field_f[((aia) this).field_f][0];
              ((aia) this).field_p = var12 * ne.field_f[((aia) this).field_f][1];
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (0 != ((aia) this).field_s) {
              break L7;
            } else {
              if (0 == ((aia) this).field_p) {
                L8: {
                  if (var9 == 0) {
                    var13 = var17.a(8, 0);
                    var12 = var17.a(32768, 0) + 32768;
                    break L8;
                  } else {
                    var12 = 196608;
                    var13 = var17.a(8, 0);
                    break L8;
                  }
                }
                L9: {
                  ((aia) this).field_f = var13;
                  ((aia) this).field_s = var12 * ne.field_f[((aia) this).field_f][0];
                  ((aia) this).field_p = ne.field_f[((aia) this).field_f][1] * var12;
                  if (0 < ((aia) this).field_i) {
                    L10: {
                      if (-1 == (((aia) this).field_s ^ -1)) {
                        break L10;
                      } else {
                        if (lw.a(((aia) this).field_s, (byte) -87) == lw.a(-((aia) this).field_n + ((aia) this).field_u, (byte) -87)) {
                          ((aia) this).field_s = -((aia) this).field_s;
                          ((aia) this).field_f = sw.a(((aia) this).field_f, 6);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if (((aia) this).field_p == 0) {
                      break L9;
                    } else {
                      if (lw.a(((aia) this).field_p, (byte) -95) == lw.a(((aia) this).field_m + -((aia) this).field_r, (byte) -93)) {
                        ((aia) this).field_p = -((aia) this).field_p;
                        ((aia) this).field_f = ona.b(0, ((aia) this).field_f);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (0 == ((aia) this).field_s) {
                    break L11;
                  } else {
                    if (-1 != (((aia) this).field_p ^ -1)) {
                      ((aia) this).field_s = 180 * (((aia) this).field_s >> 1518139144);
                      ((aia) this).field_p = 180 * (((aia) this).field_p >> -943094264);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                ((aia) this).field_h = var17.a(75, 0) + 25;
                break L7;
              } else {
                break L7;
              }
            }
          }
          L12: {
            if (0 < ((aia) this).field_i) {
              ((aia) this).field_i = ((aia) this).field_i - 1;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            var12 = ((aia) this).field_n;
            ((aia) this).field_n = ((aia) this).field_n + ((aia) this).field_s;
            var13 = ((aia) this).field_r;
            ((aia) this).field_r = ((aia) this).field_r + ((aia) this).field_p;
            var14 = (-((aia) this).field_q + param1) / 2;
            if (-var14 > ((aia) this).field_n) {
              ((aia) this).field_n = -var14;
              ((aia) this).field_h = 1;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            var15 = (-((aia) this).field_q + param2) / 2;
            if (var14 >= ((aia) this).field_n) {
              break L14;
            } else {
              ((aia) this).field_h = 1;
              ((aia) this).field_n = var14;
              break L14;
            }
          }
          L15: {
            if (-var15 > ((aia) this).field_r) {
              ((aia) this).field_r = -var15;
              ((aia) this).field_h = 1;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (((aia) this).field_r > var15) {
              ((aia) this).field_h = 1;
              ((aia) this).field_r = var15;
              break L16;
            } else {
              break L16;
            }
          }
          L17: {
            L18: {
              if (var12 != ((aia) this).field_n) {
                break L18;
              } else {
                if (((aia) this).field_r != var13) {
                  break L18;
                } else {
                  break L17;
                }
              }
            }
            if (param6.a((ffa) null, ((aia) this).field_q, 2, 1, param3 - -((aia) this).field_r, param0 + ((aia) this).field_n, false, (gma) (Object) param5, ((aia) this).field_q)) {
              ((aia) this).field_o = ((aia) this).field_o + 2;
              ((aia) this).field_o = et.b(75, ((aia) this).field_o, 125);
              if (this.h(21302)) {
                ((aia) this).field_n = (((aia) this).field_n - var12) / 4 + var12;
                ((aia) this).field_r = var13 + (-var13 + ((aia) this).field_r) / 4;
                break L17;
              } else {
                ((aia) this).field_p = 0;
                ((aia) this).field_n = var12;
                ((aia) this).field_r = var13;
                ((aia) this).field_s = 0;
                break L17;
              }
            } else {
              if (-1 > (((aia) this).field_o ^ -1)) {
                ((aia) this).field_o = ((aia) this).field_o - 1;
                break L17;
              } else {
                break L17;
              }
            }
          }
          return;
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
            return -7;
        }
        return ((aia) this).field_q;
    }

    final void c(int param0) {
        int var2 = -1 / ((param0 - 75) / 51);
        ((aia) this).field_s = -((aia) this).field_s;
        ((aia) this).field_n = -((aia) this).field_n;
        ((aia) this).field_u = -((aia) this).field_u;
        ((aia) this).field_f = sw.a(((aia) this).field_f, 6);
    }

    final void a(int param0, boolean param1, int param2, int param3, hca param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        if (param4.q(122)) {
          return;
        } else {
          L0: {
            if (param4.k((byte) -127) <= 0) {
              ((aia) this).field_w = ((aia) this).field_w + 1;
              if (-21 <= (((aia) this).field_w ^ -1)) {
                break L0;
              } else {
                ((aia) this).field_g = 0;
                break L0;
              }
            } else {
              ((aia) this).field_w = 0;
              ((aia) this).field_g = ((aia) this).field_g + 1;
              break L0;
            }
          }
          L1: {
            if ((param4.g(false) ^ -1) > -196609) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var6 = stackIn_8_0;
            if (!param1) {
              break L2;
            } else {
              L3: {
                if (15 > ((aia) this).field_g) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              var7 = stackIn_12_0;
              if (!this.a(-196609, param4, param2, param3)) {
                break L2;
              } else {
                if (var6 == 0) {
                  break L2;
                } else {
                  if (var7 != 0) {
                    param4.a(2, (byte) 97, 7);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L4: {
            ((aia) this).field_l = false;
            if (((aia) this).a(0)) {
              break L4;
            } else {
              if (this.h(21302)) {
                break L4;
              } else {
                if (var6 == 0) {
                  break L4;
                } else {
                  if (!param1) {
                    break L4;
                  } else {
                    if (0 >= ((aia) this).field_g) {
                      break L4;
                    } else {
                      var7 = param3 - -((aia) this).field_n;
                      var8 = ((aia) this).field_r + param2;
                      var9 = -var7 + param4.d(3);
                      var10 = -var8 + param4.e(9648);
                      ((aia) this).field_f = uqa.a(var9, var10, -111);
                      ((aia) this).field_l = true;
                      break L4;
                    }
                  }
                }
              }
            }
          }
          L5: {
            if (param0 > 98) {
              break L5;
            } else {
              int discarded$1 = ((aia) this).d(5);
              break L5;
            }
          }
          return;
        }
    }

    final static int e(int param0) {
        Object var2 = null;
        if (null != baa.field_d.field_i) {
          if ((Object) (Object) kra.field_a == (Object) (Object) baa.field_d.field_i.field_b) {
            return 0;
          } else {
            if ((Object) (Object) nj.field_t != (Object) (Object) baa.field_d.field_i.field_b) {
              if ((Object) (Object) baa.field_d.field_i.field_b != (Object) (Object) paa.field_z) {
                if ((Object) (Object) baa.field_d.field_i.field_b == (Object) (Object) vea.field_c) {
                  return 3;
                } else {
                  if ((Object) (Object) baa.field_d.field_i.field_b != (Object) (Object) laa.field_x) {
                    L0: {
                      if (param0 == 5) {
                        break L0;
                      } else {
                        var2 = null;
                        int discarded$2 = aia.a((byte[]) null, 116, 108, 51);
                        break L0;
                      }
                    }
                    if ((Object) (Object) daa.field_d == (Object) (Object) baa.field_d.field_i.field_b) {
                      return 5;
                    } else {
                      return -1;
                    }
                  } else {
                    return 4;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          kh.a(true, ska.field_r, kva.field_s);
          return 4;
        }
    }

    final int a(byte param0) {
        if (param0 < 32) {
            ((aia) this).field_q = 85;
        }
        return ((aia) this).field_n;
    }

    private final boolean h(int param0) {
        if (param0 != 21302) {
            ((aia) this).field_m = 121;
        }
        return 20 < ((aia) this).field_o ? true : false;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
            Object var6 = null;
            ((aia) this).a(-51, -111, -16, -86, (byte) -10, (fsa) null, (la) null);
        }
        ((aia) this).field_p = 0;
        if (0 == ((aia) this).field_i) {
            ((aia) this).field_s = 0;
        }
        ((aia) this).field_i = 200;
        ((aia) this).field_k = 0;
        ((aia) this).field_u = param0;
        ((aia) this).field_m = param2;
    }

    public static void i(int param0) {
        field_v = null;
        field_t = null;
        int var1 = 12 % ((-7 - param0) / 47);
        field_j = null;
    }

    final int d(int param0) {
        if (param0 != 2) {
            ((aia) this).field_u = 118;
        }
        return ((aia) this).field_f;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4 = -1;
        for (var5 = param3; param1 > var5; var5++) {
            var4 = coa.field_q[(var4 ^ param0[var5]) & 255] ^ var4 >>> 158638696;
        }
        var5 = -75 % ((param2 - -33) / 55);
        var4 = var4 ^ -1;
        return var4;
    }

    private final boolean a(int param0, hca param1, int param2, int param3) {
        if (param0 != -196609) {
            ((aia) this).field_r = 31;
        }
        return io.a(param1.c(-28) / 2, ((aia) this).field_r + param2, (byte) -63, param1.a((byte) 55) / 2, ((aia) this).field_n + param3, param1.e(9648), ((aia) this).field_q / 2, ((aia) this).field_q / 2, param1.d(3));
    }

    private final void a(la param0, int param1) {
        if (param1 > -72) {
            int discarded$0 = ((aia) this).g(-8);
        }
        ((aia) this).field_k = 50 - -param0.q(-120).a(50, 0);
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((aia) this).g(-80);
        }
        return 0 < ((aia) this).field_i ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 180) {
            Object var3 = null;
            ((aia) this).a(79, false, 55, 0, (hca) null);
        }
        return 0 < ((aia) this).field_k ? true : false;
    }

    aia(int param0, int param1, int param2) {
        ((aia) this).field_n = param0;
        ((aia) this).field_q = param2;
        ((aia) this).field_r = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[16384];
        field_v = "You are not currently logged in to the<nbsp>game.";
    }
}
