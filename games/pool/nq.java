/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq {
    fp field_l;
    int field_m;
    fp field_k;
    int field_d;
    int field_b;
    fp field_j;
    int field_g;
    fp field_c;
    fp field_o;
    int field_a;
    private boolean field_f;
    private int field_n;
    int field_h;
    lr field_i;
    int field_e;

    final static boolean a(byte param0, int param1) {
        aa var2 = null;
        RuntimeException var2_ref = null;
        ij var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var2 = new aa(nd.field_i);
            var3 = (ij) ((Object) var2.b((byte) -92));
            L1: while (true) {
              if (var3 == null) {
                var4 = 116 / ((param0 - -61) / 60);
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var3.field_m ^ -1) != (param1 ^ -1)) {
                  var3 = (ij) ((Object) var2.b(-100));
                  continue L1;
                } else {
                  stackIn_5_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2_ref), "nq.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        qh.d(param1, param5, param4, param2, param3);
        if (param0 != -1) {
            this.field_f = true;
        }
    }

    final void a(byte param0, int param1, int param2, String param3) {
        java.awt.Component var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_f) {
                this.a(param3, param2, (byte) -94, param1);
                break L1;
              } else {
                this.a(param1, 10066329, param3, param2);
                break L1;
              }
            }
            L2: {
              if (param0 <= -42) {
                break L2;
              } else {
                var6 = (java.awt.Component) null;
                nq.a((vk) null, (sj) null, (java.awt.Component) null, -58, true, 17, true, -29);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("nq.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_m + this.field_d;
              var6 = this.field_h + this.field_b;
              var7 = this.field_g;
              if (0 != (var7 ^ -1)) {
                break L1;
              } else {
                var7 = this.field_i.field_C - -this.field_i.field_w;
                break L1;
              }
            }
            var8 = qh.field_l >> 1032375010;
            var9 = this.field_i.b(param2);
            if (param1 == 10066329) {
              L2: {
                L3: {
                  var10 = this.field_i.field_w + this.field_i.field_C;
                  var11 = 1;
                  if (var9 > var8) {
                    break L3;
                  } else {
                    if (-1 != param2.indexOf("<br>")) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (var9 <= var8) {
                    var12 = var8;
                    break L4;
                  } else {
                    var13 = var9 / var8;
                    var12 = 2 * ((var13 + (var9 % var8 - 1)) / var13) + var8;
                    break L4;
                  }
                }
                L5: {
                  if (null == w.field_k) {
                    w.field_k = new String[16];
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var11 = this.field_i.a(param2, new int[]{var12}, w.field_k);
                var9 = 0;
                var10 = var10 + var7 * (var11 + -1);
                var13 = 0;
                L6: while (true) {
                  if (var11 <= var13) {
                    break L2;
                  } else {
                    L7: {
                      var14 = this.field_i.b(w.field_k[var13]);
                      if (var14 > var9) {
                        var9 = var14;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var13++;
                    continue L6;
                  }
                }
              }
              L8: {
                var12 = param3;
                if (var5_int + var12 - -var9 > qh.field_l) {
                  var12 = -var5_int + -var9 + qh.field_l;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                var13 = -this.field_i.field_L + (param0 - -32);
                if (qh.field_f >= var6 + var13 - -var10) {
                  break L9;
                } else {
                  var13 = -var6 + -var10 + param0;
                  break L9;
                }
              }
              qh.b(var12, var13, var9 - -var5_int, var6 + var10, this.field_e);
              qh.f(var12 - -1, 1 + var13, -2 + (var5_int + var9), -2 + var6 + var10, this.field_a);
              this.field_i.a(param2, var12 + this.field_m, var13 + this.field_h, var9, var10, this.field_n, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("nq.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        qh.c(param6, param3, param0, param2, param4, param1);
        if (param5 < 69) {
            this.field_g = 36;
        }
    }

    final static boolean a(char param0, byte param1) {
        L0: {
          if (param0 < 32) {
            break L0;
          } else {
            if (param0 <= 126) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (160 > param0) {
            break L1;
          } else {
            if (param0 <= 255) {
              return true;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0 == 8364) {
            break L2;
          } else {
            if (param0 == 338) {
              break L2;
            } else {
              if (8212 == param0) {
                break L2;
              } else {
                if (param0 == 339) {
                  break L2;
                } else {
                  if (param0 == 376) {
                    break L2;
                  } else {
                    if (param1 == -125) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return true;
    }

    private final void a(String param0, int param1, byte param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_i.b(param0);
              var6 = this.field_i.field_w + this.field_i.field_L;
              if (param2 <= -62) {
                break L1;
              } else {
                this.field_a = -110;
                break L1;
              }
            }
            L2: {
              var7 = param1;
              if (6 + var5_int + var7 > qh.field_l) {
                var7 = -6 + -var5_int + qh.field_l;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var8 = -this.field_i.field_L + (param3 - -32);
              if (qh.field_f >= 6 + var8 + var6) {
                break L3;
              } else {
                var8 = qh.field_f + (-var6 - 6);
                break L3;
              }
            }
            qh.b(var7, var8, 6 + var5_int, 6 + var6, this.field_n);
            qh.f(1 + var7, var8 + 1, var5_int + 4, var6 + 4, this.field_a);
            this.field_i.d(param0, var7 - -3, this.field_i.field_L + (var8 + 3), this.field_n, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("nq.I(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(lr param0, int param1) {
        int var7_int = 0;
        lg var19 = null;
        int var15 = Pool.field_O;
        am var17 = new am(param0, 2, 2, 2236962, 1, 1, 1, param0.field_w + param0.field_C - -2);
        var17.field_d = 16777215;
        this.field_c = (fp) ((Object) var17);
        lg var4 = new lg();
        var17.a(-1177150015, var4);
        this.field_d = 3;
        this.field_b = 3;
        this.field_h = 3;
        var4.field_c = 11711154;
        this.field_n = 15658734;
        this.field_a = 5592405;
        this.field_m = 3;
        this.field_i = param0;
        var4.field_k = 15658734;
        this.field_e = 15658734;
        this.field_g = -1;
        var4.b(0, 0).c(15658734, 57).a(fj.a(8947848, 10066329, 7829367, false), (byte) 67);
        var4.b(1, 0).a(fj.a(11184810, 10066329, 13421772, false), (byte) 76);
        var4.b(3, 0).a(fj.a(8947848, 7829367, 10066329, false), (byte) 64).a(1, -1).a(1, (byte) 90);
        dd[] var5 = new dd[9];
        lp var16 = new lp(32, 32);
        lp var18 = var16;
        for (var7_int = 0; var7_int < var18.field_D.length; var7_int++) {
            var16.field_D[var7_int] = 1077952576;
        }
        var5[4] = (dd) ((Object) var18);
        var4.b(4, 0).a(-15359, true).a(var5, (byte) 126);
        var4.b(5, 0).a(rg.a(0, 0, -119, 65793, 0), (byte) 90).a(-15359, true).c(-1, 71);
        this.field_l = (fp) ((Object) var4);
        lg var6 = new lg(var4, true);
        var6.field_m = 0;
        lg var7 = new lg(var4, true);
        var7.field_m = 0;
        var7.a(ei.a((byte) 83, 8947848), 6);
        var7.b(1, 0).a(ei.a((byte) 32, 11184810), (byte) 120).c(2236962, 51);
        this.field_o = (fp) ((Object) new hl(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
        vd discarded$0 = new vd(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        nd discarded$1 = new nd(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
        lg var8 = new lg();
        var17.a(-1177150015, var8);
        var8.b(0, 0).a(fj.a(15658734, 7829367, 10066329, false), (byte) 74).c(1118481, 72).b(true, -1);
        var8.b(4, 0).a(-15359, true).a(var5, (byte) 77);
        this.field_j = (fp) ((Object) var8);
        dd[] var9 = new dd[9];
        var9[4] = new dd(2, 1);
        dd[] var10 = new dd[9];
        var10[4] = new dd(1, 2);
        dd dupTemp$2 = var9[4];
        dupTemp$2.field_D = new int[]{6710886, 7829367};
        var10[4].field_D = new int[]{6710886, 7829367};
        lg var11 = new lg();
        lg var12 = new lg();
        var11.a((byte) -79, 0, var9);
        var12.a((byte) -79, 0, var10);
        dd var13 = new dd(7, 4);
        var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        lg var14 = new lg(var4, true);
        var14.a(var13.d(), 117);
        var13.f();
        var14 = new lg(var4, true);
        var14.a(var13.d(), 114);
        var13.f();
        if (param1 > -8) {
            return;
        }
        try {
            var14 = new lg(var4, true);
            var14.a(var13.d(), -37);
            var13.f();
            var19 = new lg(var4, true);
            var19.a(var13, -107);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "nq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(vk param0, sj param1, java.awt.Component param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        try {
            bp.a(param7, param6, 10);
            ib.field_s = bp.a(param1, param2, 0, param3);
            kk.field_D = bp.a(param1, param2, 1, param5);
            qf.field_d = new ai();
            or.field_b = param5 * 1000 / param7;
            kk.field_D.a(qf.field_d);
            tl.field_N = param0;
            tl.field_N.a(nk.field_h, (byte) -26);
            ib.field_s.a(tl.field_N);
            if (param4) {
                nq.a('`', (byte) -1);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "nq.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public nq() {
        this.field_f = true;
    }

    static {
    }
}
