/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    io field_d;
    io field_b;
    io field_m;
    private boolean field_l;
    int field_r;
    int field_q;
    int field_f;
    int field_k;
    int field_e;
    int field_t;
    int field_p;
    io field_g;
    io field_a;
    rb field_c;
    io field_n;
    io field_s;
    private int field_j;
    int field_h;
    int field_o;
    int field_i;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        g.a(param3, (byte) 99, param1, param4, param0);
        if (param2 > -60) {
            this.field_k = 55;
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        bi.e(param3, param4, param5, param0, param1);
        if (param2 != -14) {
            this.field_f = 122;
        }
    }

    final static vk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        vk var7 = null;
        int var8 = 0;
        vk stackIn_3_0 = null;
        vk stackIn_6_0 = null;
        vk stackIn_9_0 = null;
        vk stackIn_13_0 = null;
        vk stackIn_18_0 = null;
        vk stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (param1 == 8947848) {
              var2_int = param0.length();
              if (var2_int != 0) {
                if ((var2_int ^ -1) >= -256) {
                  var3 = de.a('.', param0, -124);
                  if (2 > var3.length) {
                    stackIn_13_0 = bg.field_l;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      if (var4.length <= var5) {
                        stackIn_21_0 = wh.a(var3[-1 + var3.length], false);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = tg.a(-126, var6);
                        if (var7 == null) {
                          var5++;
                          continue L1;
                        } else {
                          stackIn_18_0 = (vk) (var7);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = fg.field_m;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = bg.field_l;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (vk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2);

            stackIn_24_1 = new StringBuilder().append("of.G(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  return stackIn_21_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (vo.field_a == null) {
                break L1;
              } else {
                if (vo.field_a[0] != null) {
                  var1_int = vo.field_a[0].field_w;
                  vo.field_a[0].e(0, 0);
                  vo.field_a[1].e(-var1_int + bd.field_e, 0);
                  vo.field_a[2].e(0, nh.field_P - var1_int);
                  vo.field_a[3].e(-var1_int + bd.field_e, -var1_int + nh.field_P);
                  g.a(0, (byte) 99, -var1_int + bd.field_e, nh.field_P, var1_int);
                  if (param0 == 11690) {
                    var3 = nh.field_P + -var1_int;
                    var2 = var1_int;
                    L2: while (true) {
                      if (var2 >= bi.field_b) {
                        bi.f(0, var1_int, bd.field_e, nh.field_P - var1_int);
                        var2 = -var1_int + bd.field_e;
                        var3 = var1_int;
                        L3: while (true) {
                          if (bi.field_d <= var3) {
                            pa.a(-21189);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            hi.field_x.e(0, var3);
                            hi.field_x.c(var2, var3);
                            var3 = var3 + hi.field_x.field_t;
                            continue L3;
                          }
                        }
                      } else {
                        ch.field_a.e(var2, 0);
                        ch.field_a.f(var2, var3);
                        var2 = var2 + ch.field_a.field_w;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "of.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param3 < -100) {
              L1: {
                if (this.field_l) {
                  this.a(param1, param2, param0, 0);
                  break L1;
                } else {
                  this.a(param2, param1, param0, (byte) 53);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("of.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(String param0, int param1, int param2, byte param3) {
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
              var5_int = this.field_c.b(param0);
              var6 = this.field_c.field_x + this.field_c.field_w;
              if (param3 == 53) {
                break L1;
              } else {
                this.a(60, -58, (byte) 14, 69, -115);
                break L1;
              }
            }
            L2: {
              var7 = param1;
              if (bi.field_f >= 6 + (var5_int + var7)) {
                break L2;
              } else {
                var7 = -6 + (-var5_int + bi.field_f);
                break L2;
              }
            }
            L3: {
              var8 = param2 - (this.field_c.field_w + -32);
              if (bi.field_a < var8 - -var6 - -6) {
                var8 = -6 + (-var6 + bi.field_a);
                break L3;
              } else {
                break L3;
              }
            }
            bi.c(var7, var8, 6 + var5_int, 6 + var6, this.field_j);
            bi.b(var7 + 1, var8 - -1, var5_int - -4, var6 + 4, this.field_k);
            this.field_c.c(param0, var7 - -3, this.field_c.field_w + 3 + var8, this.field_j, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("of.J(");

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
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, rb param1) {
        vf var17 = null;
        qo var4 = null;
        vn[] var5 = null;
        cd var16 = null;
        cd var18 = null;
        int var7_int = 0;
        qo var6 = null;
        qo var7 = null;
        t discarded$0 = null;
        el discarded$1 = null;
        qo var8 = null;
        vn[] var9 = null;
        vn[] var10 = null;
        vn dupTemp$2 = null;
        qo var11 = null;
        qo var12 = null;
        vn var13 = null;
        qo var14 = null;
        qo var19 = null;
        int var15 = ZombieDawn.field_J;
        try {
            var17 = new vf(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_I + param1.field_x);
            this.field_n = (io) ((Object) var17);
            var17.field_l = 16777215;
            var4 = new qo();
            var17.a(var4, (byte) 106);
            this.field_h = 3;
            this.field_q = 3;
            var4.field_j = 11711154;
            var4.field_a = 15658734;
            this.field_k = 5592405;
            this.field_c = param1;
            this.field_r = 3;
            this.field_e = 3;
            this.field_i = 15658734;
            this.field_j = 15658734;
            this.field_t = -1;
            var4.a((byte) 73, 0).b((byte) -21, 15658734).a(tb.c(10066329, 8947848, -2967, 7829367), param0 ^ 37);
            var4.a((byte) 73, 1).a(tb.c(10066329, 11184810, -2967, 13421772), 33);
            var4.a((byte) 73, 3).a(tb.c(7829367, 8947848, param0 + -2971, 10066329), param0 ^ 37).a((byte) 126, 1).a(1, (byte) 57);
            var5 = new vn[9];
            var16 = new cd(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.field_z.length > var7_int; var7_int++) {
                var16.field_z[var7_int] = 1077952576;
            }
            var5[4] = (vn) ((Object) var18);
            var4.a((byte) 73, 4).a(true, (byte) 74).a(var5, 33);
            var4.a((byte) 73, 5).a(ab.a(0, (byte) -36, 0, 0, 65793), 33).a(true, (byte) -113).b((byte) -21, -1);
            this.field_a = (io) ((Object) var4);
            var6 = new qo(var4, true);
            var6.field_h = 0;
            var7 = new qo(var4, true);
            var7.field_h = 0;
            var7.a(69, bm.a((byte) -75, 8947848));
            var7.a((byte) 73, 1).a(bm.a((byte) -107, 11184810), param0 ^ 37).b((byte) -21, 2236962);
            this.field_g = (io) ((Object) new vl(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new t(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new el(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new qo();
            var17.a(var8, (byte) -57);
            var8.a((byte) 73, 0).a(tb.c(7829367, 15658734, param0 ^ -2963, 10066329), param0 + 29).b((byte) -21, 1118481).a(-1, param0 ^ -107);
            var8.a((byte) 73, param0).a(true, (byte) 72).a(var5, param0 + 29);
            this.field_b = (io) ((Object) var8);
            var9 = new vn[9];
            var10 = new vn[9];
            var9[4] = new vn(2, 1);
            var10[4] = new vn(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_z = new int[]{6710886, 7829367};
            var10[4].field_z = new int[]{6710886, 7829367};
            var11 = new qo();
            var12 = new qo();
            var11.a(1, var9, 0);
            var12.a(1, var10, 0);
            this.field_m = (io) ((Object) var4);
            this.field_s = (io) ((Object) var12);
            var13 = new vn(7, 4);
            var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            this.field_p = 10;
            var14 = new qo(var4, true);
            var14.a(var13.e(), 0);
            var13.b();
            var14 = new qo(var4, true);
            var14.a(var13.e(), param0 + -4);
            var13.b();
            var14 = new qo(var4, true);
            var14.a(var13.e(), 0);
            var13.b();
            var19 = new qo(var4, true);
            var19.a(var13, 0);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "of.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        if (param0 != 3) {
            return;
        }
        pa.a(-21189);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
        int var15 = 0;
        var15 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var5_int = this.field_e + this.field_r;
              var6 = this.field_q - -this.field_h;
              var7 = this.field_t;
              if ((var7 ^ -1) != 0) {
                break L1;
              } else {
                var7 = this.field_c.field_I + this.field_c.field_x;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = bi.field_f >> -853117534;
                var9 = this.field_c.b(param1);
                var10 = this.field_c.field_I + this.field_c.field_x;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (-1 == param1.indexOf("<br>")) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (kb.field_j == null) {
                  kb.field_j = new String[16];
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 <= var8) {
                  var12 = var8;
                  break L5;
                } else {
                  var13 = var9 / var8;
                  var12 = 2 * ((var9 % var8 - -var13 - 1) / var13) + var8;
                  break L5;
                }
              }
              var11 = this.field_c.a(param1, new int[]{var12}, kb.field_j);
              var9 = 0;
              var10 = var10 + var7 * (-1 + var11);
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_c.b(kb.field_j[var13]);
                    if ((var9 ^ -1) > (var14 ^ -1)) {
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
              var12 = param0;
              if (var5_int + (var9 + var12) <= bi.field_f) {
                break L8;
              } else {
                var12 = -var9 + bi.field_f - var5_int;
                break L8;
              }
            }
            L9: {
              var13 = -this.field_c.field_w + (param2 - -32);
              if (bi.field_a < var13 - (-var10 - var6)) {
                var13 = -var6 + -var10 + param2;
                break L9;
              } else {
                break L9;
              }
            }
            bi.c(var12, var13, var5_int + var9, var10 + var6, this.field_i);
            bi.b(var12 - -1, var13 + 1, -2 + var9 - -var5_int, var10 - -var6 + -2, this.field_k);
            this.field_c.a(param1, var12 - -this.field_r, this.field_q + var13, var9, var10, this.field_j, -1, 0, param3, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("of.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        bi.a(param3, param0, param2, param1, param6, param4);
        if (param5 > -88) {
            String var9 = (String) null;
            of.a((String) null, -19);
        }
    }

    public of() {
        this.field_l = true;
    }

    static {
    }
}
