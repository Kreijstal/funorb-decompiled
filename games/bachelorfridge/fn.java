/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends k {
    private int field_l;
    private int[] field_p;
    private int field_o;
    private int field_q;
    static cf field_m;
    static int[] field_k;
    static pia field_n;

    final static void a(byte param0, int param1, java.math.BigInteger param2, java.math.BigInteger param3, lu param4, byte[] param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = BachelorFridge.field_y;
          var7 = vn.a(-9938, param6);
          if (null != fj.field_i) {
            break L0;
          } else {
            fj.field_i = new java.security.SecureRandom();
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = 0;
        L1: while (true) {
          if (var9 >= 4) {
            L2: {
              L3: {
                if (null == rl.field_p) {
                  break L3;
                } else {
                  if (var7 > rl.field_p.field_h.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              rl.field_p = new lu(var7);
              break L2;
            }
            L4: {
              rl.field_p.field_g = 0;
              if (param0 == -68) {
                break L4;
              } else {
                field_k = null;
                break L4;
              }
            }
            L5: {
              L6: {
                rl.field_p.a(param1, -108, param6, param5);
                rl.field_p.a(var7, false);
                rl.field_p.a(var15, 0);
                if (null == gu.field_a) {
                  break L6;
                } else {
                  if (-101 < (gu.field_a.field_h.length ^ -1)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              gu.field_a = new lu(100);
              break L5;
            }
            gu.field_a.field_g = 0;
            gu.field_a.d(10, param0 + 68);
            var11 = 0;
            var9 = var11;
            L7: while (true) {
              if ((var11 ^ -1) <= -5) {
                gu.field_a.b(param6, param0 ^ 53);
                gu.field_a.a(param3, 0, param2);
                param4.a(0, -82, gu.field_a.field_g, gu.field_a.field_h);
                param4.a(0, param0 ^ 35, rl.field_p.field_g, rl.field_p.field_h);
                return;
              } else {
                gu.field_a.e(var15[var11], -1615464796);
                var11++;
                continue L7;
              }
            }
          } else {
            var8[var9] = fj.field_i.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final void a(byte param0, lu param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          var4 = param2;
          if (-1 == var4) {
            ((fn) this).field_l = param1.e((byte) 87);
            break L0;
          } else {
            if (1 != var4) {
              if (-3 != var4) {
                break L0;
              } else {
                ((fn) this).field_o = param1.e((byte) 117);
                break L0;
              }
            } else {
              ((fn) this).field_q = param1.e((byte) 81);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -71) {
            break L1;
          } else {
            field_k = null;
            break L1;
          }
        }
    }

    public static void f(byte param0) {
        if (param0 < 75) {
            Object var2 = null;
            fn.a(-79, (byte) 41, 48, -26, -58, (kv) null);
        }
        field_k = null;
        field_n = null;
        field_m = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, kv param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        param4 -= 3;
        var6 = 0;
        if (param1 == 11) {
          var7 = 0;
          L0: while (true) {
            if (var7 >= param5.field_p) {
              return;
            } else {
              var8 = 0;
              L1: while (true) {
                if (var8 >= param2) {
                  var6 = var6 + (param5.field_q + -param2);
                  var7++;
                  continue L0;
                } else {
                  if (param5.field_v[var6] > 0) {
                    tla.a(param3 + var8, param1 + -1898743715, param0, param4 - -var7, 255 & param5.field_v[var6]);
                    var6++;
                    var8++;
                    continue L1;
                  } else {
                    var6++;
                    var8++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int[] a(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var17 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            ((fn) this).field_o = 4;
            break L0;
          }
        }
        L1: {
          var18 = ((fn) this).field_j.a(param0, param1 + -1);
          var3 = var18;
          if (!((fn) this).field_j.field_m) {
            break L1;
          } else {
            var7 = ((fn) this).field_l * qna.field_k >> 1872123404;
            var26 = ((fn) this).a(0, param0 + -1 & it.field_r, (byte) 125);
            var9 = ((fn) this).a(0, param0, (byte) 120);
            var25 = ((fn) this).a(0, it.field_r & param0 - -1, (byte) 109);
            var11 = 0;
            L2: while (true) {
              if (hh.field_d <= var11) {
                break L1;
              } else {
                L3: {
                  var12 = var7 * (var25[var11] - var26[var11]) >> -1387512916;
                  var13 = var7 * (-var9[1 + var11 & wp.field_r] + var9[wp.field_r & -1 + var11]) >> 730152556;
                  var14 = var13 >> 735982212;
                  if (-1 >= var14) {
                    break L3;
                  } else {
                    var14 = -var14;
                    break L3;
                  }
                }
                L4: {
                  var15 = var12 >> 2135606116;
                  if (-256 >= var14) {
                    break L4;
                  } else {
                    var14 = 255;
                    break L4;
                  }
                }
                L5: {
                  if ((var15 ^ -1) <= -1) {
                    break L5;
                  } else {
                    var15 = -var15;
                    break L5;
                  }
                }
                L6: {
                  if (255 >= var15) {
                    break L6;
                  } else {
                    var15 = 255;
                    break L6;
                  }
                }
                var16 = ti.field_a[(var15 * (var15 + 1) >> -1070155391) + var14] & 255;
                var5 = var12 * var16 >> -179356376;
                var4 = var16 * var13 >> 796510792;
                var6 = var16 * 4096 >> 1846738056;
                var4 = var4 * ((fn) this).field_p[0] >> 1651688748;
                var6 = ((fn) this).field_p[2] * var6 >> 1823238316;
                var5 = var5 * ((fn) this).field_p[1] >> 838917548;
                var18[var11] = var5 + var4 + var6;
                var11++;
                continue L2;
              }
            }
          }
        }
        return var18;
    }

    public fn() {
        super(1, true);
        ((fn) this).field_l = 4096;
        ((fn) this).field_p = new int[3];
        ((fn) this).field_q = 3216;
        ((fn) this).field_o = 3216;
    }

    private final void e(byte param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var2 = Math.cos((double)((float)((fn) this).field_o / 4096.0f));
          ((fn) this).field_p[0] = (int)(var2 * Math.sin((double)((float)((fn) this).field_q / 4096.0f)) * 4096.0);
          ((fn) this).field_p[1] = (int)(var2 * Math.cos((double)((float)((fn) this).field_q / 4096.0f)) * 4096.0);
          ((fn) this).field_p[2] = (int)(Math.sin((double)((float)((fn) this).field_o / 4096.0f)) * 4096.0);
          var4 = ((fn) this).field_p[0] * ((fn) this).field_p[0] >> 1923460748;
          var5 = ((fn) this).field_p[1] * ((fn) this).field_p[1] >> 701249580;
          var6 = ((fn) this).field_p[2] * ((fn) this).field_p[2] >> -963988980;
          var8 = -28 % ((param0 - -21) / 62);
          var7 = (int)(Math.sqrt((double)(var4 - (-var5 - var6) >> -1945478004)) * 4096.0);
          if (-1 == (var7 ^ -1)) {
            break L0;
          } else {
            ((fn) this).field_p[2] = (((fn) this).field_p[2] << -1214957588) / var7;
            ((fn) this).field_p[0] = (((fn) this).field_p[0] << 225587212) / var7;
            ((fn) this).field_p[1] = (((fn) this).field_p[1] << -789247220) / var7;
            break L0;
          }
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
            Object var3 = null;
            fn.a(90, (byte) 41, -54, -20, 63, (kv) null);
        }
        this.e((byte) -97);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new cf();
    }
}
