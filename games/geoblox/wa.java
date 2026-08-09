/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private boolean field_o;
    int field_f;
    m field_m;
    dh field_j;
    int field_h;
    int field_p;
    dh field_g;
    static int field_a;
    dh field_c;
    dh field_l;
    int field_d;
    private int field_k;
    dh field_b;
    int field_e;
    int field_i;
    int field_n;

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_m.a(param2);
              var6 = this.field_m.field_q + this.field_m.field_y;
              var7 = param1;
              if (vb.field_f < 6 + var7 - -var5_int) {
                var7 = -6 + vb.field_f - var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = -this.field_m.field_y + (param3 + 32);
              if (vb.field_b < 6 + (var8 - -var6)) {
                var8 = vb.field_b - var6 + -6;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              vb.d(var7, var8, 6 + var5_int, var6 - -6, this.field_k);
              if (param0 == 69) {
                break L3;
              } else {
                var9 = (String) null;
                this.a(-83, false, 61, (String) null);
                break L3;
              }
            }
            vb.a(1 + var7, var8 - -1, var5_int - -4, 4 + var6, this.field_f);
            this.field_m.a(param2, 3 + var7, this.field_m.field_y + 3 + var8, this.field_k, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, m param1) {
        ff var17 = null;
        rd var4 = null;
        dm[] var5 = null;
        il var16 = null;
        il var18 = null;
        int var7_int = 0;
        rd var6 = null;
        rd var7 = null;
        hb discarded$0 = null;
        jf discarded$1 = null;
        rd var8 = null;
        dm[] var9 = null;
        dm[] var10 = null;
        dm dupTemp$2 = null;
        rd var11 = null;
        rd var12 = null;
        dm var13 = null;
        rd var14 = null;
        rd var19 = null;
        int var15 = Geoblox.field_C;
        try {
            var17 = new ff(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_o + param1.field_q));
            this.field_b = (dh) ((Object) var17);
            var17.field_o = 16777215;
            var4 = new rd();
            var17.a(var4, true);
            this.field_n = 15658734;
            var4.field_h = 11711154;
            var4.field_c = 15658734;
            this.field_f = 5592405;
            this.field_e = 3;
            this.field_p = 3;
            this.field_k = 15658734;
            this.field_h = -1;
            this.field_d = 3;
            this.field_i = 3;
            this.field_m = param1;
            var4.a(param0 + -126, 0).b(256, 15658734).a(wa.a(10066329, 8947848, 7829367, 1), true);
            var4.a(-106, 1).a(wa.a(10066329, 11184810, 13421772, 1), true);
            var4.a(param0 ^ -100, 3).a(wa.a(7829367, 8947848, 10066329, param0 + -8), true).b((byte) -53, 1).a(param0 + -9, 1);
            var5 = new dm[9];
            var16 = new il(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.field_v.length > var7_int; var7_int++) {
                var16.field_v[var7_int] = 1077952576;
            }
            var5[4] = (dm) ((Object) var18);
            var4.a(-127, 4).a(true, (byte) 73).a(var5, true);
            var4.a(-101, 5).a(tf.a(0, 0, 116, 0, 65793), true).a(true, (byte) 73).b(256, -1);
            this.field_j = (dh) ((Object) var4);
            var6 = new rd(var4, true);
            var6.field_g = 0;
            var7 = new rd(var4, true);
            var7.field_g = 0;
            var7.a((byte) 124, va.a(8947848, (byte) -112));
            var7.a(-116, 1).a(va.a(11184810, (byte) -112), true).b(256, 2236962);
            this.field_c = (dh) ((Object) new bi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new hb(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new jf(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new rd();
            var17.a(var8, true);
            var8.a(-124, 0).a(wa.a(7829367, 15658734, 10066329, 1), true).b(256, 1118481).a((byte) 16, -1);
            var8.a(-105, 4).a(true, (byte) 73).a(var5, true);
            this.field_g = (dh) ((Object) var8);
            var9 = new dm[param0];
            var10 = new dm[9];
            var9[4] = new dm(2, 1);
            var10[4] = new dm(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_v = new int[]{6710886, 7829367};
            var10[4].field_v = new int[]{6710886, 7829367};
            var11 = new rd();
            var12 = new rd();
            var11.a(var9, 0, (byte) 57);
            var12.a(var10, 0, (byte) 108);
            var13 = new dm(7, 4);
            var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new rd(var4, true);
            var14.a(0, var13.b());
            var13.a();
            var14 = new rd(var4, true);
            var14.a(param0 ^ 9, var13.b());
            var13.a();
            var14 = new rd(var4, true);
            var14.a(0, var13.b());
            var13.a();
            var19 = new rd(var4, true);
            var19.a(param0 ^ 9, var13);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "wa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
        int var15 = 0;
        var15 = Geoblox.field_C;
        try {
          L0: {
            var5_int = this.field_e + this.field_d;
            var6 = this.field_p + this.field_i;
            var7 = this.field_h;
            if (param3 == -3140) {
              L1: {
                if (-1 != var7) {
                  break L1;
                } else {
                  var7 = this.field_m.field_q + this.field_m.field_o;
                  break L1;
                }
              }
              L2: {
                L3: {
                  var8 = vb.field_f >> 994128514;
                  var9 = this.field_m.a(param1);
                  var10 = this.field_m.field_q + this.field_m.field_o;
                  var11 = 1;
                  if (var8 < var9) {
                    break L3;
                  } else {
                    if (-1 != param1.indexOf("<br>")) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (dd.field_E != null) {
                    break L4;
                  } else {
                    dd.field_E = new String[16];
                    break L4;
                  }
                }
                L5: {
                  if (var8 >= var9) {
                    var12 = var8;
                    break L5;
                  } else {
                    var13 = var9 / var8;
                    var12 = (var9 % var8 - -var13 - 1) / var13 * 2 + var8;
                    break L5;
                  }
                }
                var11 = this.field_m.a(param1, new int[]{var12}, dd.field_E);
                var9 = 0;
                var10 = var10 + (var11 + -1) * var7;
                var13 = 0;
                L6: while (true) {
                  if (var13 >= var11) {
                    break L2;
                  } else {
                    var14 = this.field_m.a(dd.field_E[var13]);
                    if (var14 > var9) {
                      var9 = var14;
                      var13++;
                      continue L6;
                    } else {
                      var13++;
                      continue L6;
                    }
                  }
                }
              }
              L7: {
                var12 = param2;
                if (var5_int + var9 + var12 > vb.field_f) {
                  var12 = -var5_int + (vb.field_f + -var9);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                var13 = 32 + (-this.field_m.field_y + param0);
                if (vb.field_b >= var10 + (var13 - -var6)) {
                  break L8;
                } else {
                  var13 = param0 - var10 - var6;
                  break L8;
                }
              }
              vb.d(var12, var13, var5_int + var9, var10 + var6, this.field_n);
              vb.a(1 + var12, 1 + var13, var9 + (var5_int - 2), -2 + (var10 + var6), this.field_f);
              this.field_m.a(param1, this.field_d + var12, this.field_i + var13, var9, var10, this.field_k, -1, 0, 0, var7);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("wa.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, String param3) {
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
              if (!this.field_o) {
                this.a((byte) 69, param2, param3, param0);
                break L1;
              } else {
                this.a(param0, param3, param2, -3140);
                break L1;
              }
            }
            L2: {
              if (param1) {
                break L2;
              } else {
                this.field_c = (dh) null;
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

            stackIn_8_1 = new StringBuilder().append("wa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final static dm[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            wa.a(-34, 65, 52, 47);
        }
        return dj.a(param0, (byte) -70, param2, param1, 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 15658734) {
            return;
        }
        vb.b(param6, param0, param2, param1, param5, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        vb.g(param4, param3, param1, param0, param2);
        if (param5 != 8947848) {
            this.field_p = 22;
        }
    }

    public wa() {
        this.field_o = true;
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        me var2 = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var1_int = 0;
              if (param0 == -25866) {
                break L1;
              } else {
                wa.a(53, -56, 122, 126);
                break L1;
              }
            }
            var2 = (me) ((Object) md.field_a.b((byte) -121));
            L2: while (true) {
              if (var2 == null) {
                stackIn_7_0 = var1_int;
                break L0;
              } else {
                var1_int = var1_int + var2.field_f;
                var2 = (me) ((Object) md.field_a.b((byte) -99));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "wa.H(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_a = 0;
    }
}
