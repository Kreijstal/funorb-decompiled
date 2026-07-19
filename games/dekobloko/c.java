/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    int field_q;
    static ck field_i;
    int field_h;
    private boolean field_e;
    int field_o;
    mm field_p;
    int field_c;
    static vj field_r;
    gl field_b;
    int field_d;
    int field_n;
    gl field_l;
    int field_f;
    gl field_g;
    gl field_a;
    gl field_k;
    private int field_j;
    static ck[] field_m;

    public static void a(int param0) {
        field_m = null;
        field_r = null;
        field_i = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        hk.a(param6, param1, param3, param4, param5, param2);
        int var8 = -40 / ((param0 - -68) / 42);
    }

    final static void a(byte param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                L1: {
                  if (!fd.field_d.startsWith("win")) {
                    break L1;
                  } else {
                    if (fc.a((byte) -19, param1)) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                try {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    if (param0 > 72) {
                      break L2;
                    } else {
                      field_m = (ck[]) null;
                      return;
                    }
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  qb.a((Throwable) null, 16408, "MGR1: " + param1);
                  return;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var4_ref);
                stackOut_9_1 = new StringBuilder().append("c.A(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              L4: {
                stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L4;
                } else {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L4;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, mm param1) {
        sn discarded$10 = null;
        sn discarded$11 = null;
        sn discarded$12 = null;
        sn discarded$13 = null;
        sn discarded$14 = null;
        sn discarded$15 = null;
        al discarded$16 = null;
        qj discarded$17 = null;
        sn discarded$18 = null;
        sn discarded$19 = null;
        RuntimeException var3 = null;
        bc var4 = null;
        ck[] var5 = null;
        bc var6 = null;
        int var7_int = 0;
        bc var7 = null;
        bc var8 = null;
        ck[] var9 = null;
        ck[] var10 = null;
        bc var11 = null;
        bc var12 = null;
        ck var13 = null;
        bc var14 = null;
        int var15 = 0;
        ld var16 = null;
        a var17 = null;
        ld var18 = null;
        bc var19 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            var17 = new a(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_K + param1.field_R);
            var17.field_q = 16777215;
            this.field_k = (gl) ((Object) var17);
            var4 = new bc();
            var17.a(-12253, var4);
            var4.field_c = 11711154;
            var4.field_v = 15658734;
            this.field_h = 3;
            this.field_p = param1;
            this.field_j = 15658734;
            this.field_n = -1;
            this.field_c = 3;
            this.field_f = 5592405;
            this.field_o = 15658734;
            this.field_d = 3;
            this.field_q = 3;
            discarded$10 = var4.a(0, 117).a(15658734, (byte) 106).a(120, fl.a(7829367, 8947848, 10066329, 32140));
            discarded$11 = var4.a(1, param0 ^ 13421780).a(-50, fl.a(13421772, 11184810, 10066329, 32140));
            discarded$12 = var4.a(3, 101).a(121, fl.a(10066329, 8947848, 7829367, 32140)).c(-1, 1).a(1, -2147483648);
            var5 = new ck[9];
            var16 = new ld(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              if (var18.field_D.length <= var7_int) {
                var5[4] = (ck) ((Object) var18);
                discarded$13 = var4.a(4, 25).a(param0 + -13438370, true).a(113, var5);
                discarded$14 = var4.a(5, 44).a(param0 ^ 13421739, ta.a(false, 0, 65793, 0, 0)).a(param0 + -13438370, true).a(-1, (byte) 106);
                this.field_b = (gl) ((Object) var4);
                var6 = new bc(var4, true);
                var6.field_f = 0;
                var7 = new bc(var4, true);
                var7.field_f = 0;
                var7.a(qm.a(9, 8947848), false);
                discarded$15 = var7.a(1, 95).a(-128, qm.a(9, 11184810)).a(2236962, (byte) 106);
                this.field_a = (gl) ((Object) new kk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
                discarded$16 = new al(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
                discarded$17 = new qj(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
                var8 = new bc();
                var17.a(-12253, var8);
                discarded$18 = var8.a(0, 78).a(param0 ^ -13421740, fl.a(10066329, 15658734, 7829367, param0 + -13389632)).a(1118481, (byte) 106).b(-83, -1);
                discarded$19 = var8.a(4, param0 ^ 13421812).a(-16598, true).a(-27, var5);
                this.field_l = (gl) ((Object) var8);
                var9 = new ck[9];
                var9[4] = new ck(2, 1);
                var10 = new ck[9];
                var10[4] = new ck(1, 2);
                var9[4].field_D = new int[]{6710886, 7829367};
                var10[4].field_D = new int[]{6710886, 7829367};
                var11 = new bc();
                var12 = new bc();
                var11.a(119, var9, 0);
                var12.a(param0 ^ 13421750, var10, 0);
                var13 = new ck(7, 4);
                var13.field_D = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
                var14 = new bc(var4, true);
                var14.a(var13.c(), 2);
                var13.d();
                var14 = new bc(var4, true);
                var14.a(var13.c(), 2);
                var13.d();
                var14 = new bc(var4, true);
                var14.a(var13.c(), 2);
                var13.d();
                var19 = new bc(var4, true);
                var19.a(var13, 2);
                break L0;
              } else {
                var16.field_D[var7_int] = 1077952576;
                var7_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("c.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (param0 >= 50) {
              L1: {
                var5_int = this.field_p.a(param1);
                var6 = this.field_p.field_K + this.field_p.field_C;
                var7 = param2;
                if (hk.field_j < var7 + (var5_int - -6)) {
                  var7 = -var5_int + (hk.field_j + -6);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var8 = 32 + (-this.field_p.field_C + param3);
                if (hk.field_i >= var8 - (-var6 + -6)) {
                  break L2;
                } else {
                  var8 = -6 + hk.field_i - var6;
                  break L2;
                }
              }
              hk.f(var7, var8, var5_int + 6, 6 + var6, this.field_j);
              hk.a(1 + var7, var8 - -1, var5_int - -4, 4 + var6, this.field_f);
              this.field_p.a(param1, var7 + 3, var8 - (-3 + -this.field_p.field_C), this.field_j, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("c.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var7 = 111 % ((param4 - -23) / 54);
        hk.b(param2, param1, param0, param5, param3);
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int discarded$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_c + this.field_d;
              var6 = this.field_h + this.field_q;
              var7 = this.field_n;
              if (var7 == -1) {
                var7 = this.field_p.field_K + this.field_p.field_R;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = hk.field_j >> 2;
                var9 = this.field_p.a(param2);
                var10 = this.field_p.field_R + this.field_p.field_K;
                var11 = 1;
                if (var9 > var8) {
                  break L3;
                } else {
                  if (-1 == param2.indexOf("<br>")) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var8 < var9) {
                  var13 = var9 / var8;
                  var12 = var8 + 2 * ((-1 + (var9 % var8 - -var13)) / var13);
                  break L4;
                } else {
                  var12 = var8;
                  break L4;
                }
              }
              L5: {
                if (el.field_L == null) {
                  el.field_L = new String[16];
                  break L5;
                } else {
                  break L5;
                }
              }
              var11 = this.field_p.a(param2, new int[]{var12}, el.field_L);
              var10 = var10 + (-1 + var11) * var7;
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var11 <= var13) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_p.a(el.field_L[var13]);
                    if (var14 <= var9) {
                      break L7;
                    } else {
                      var9 = var14;
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
              if (var5_int + var12 + var9 > hk.field_j) {
                var12 = hk.field_j + (-var9 + -var5_int);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var13 = 32 + param3 + -this.field_p.field_C;
              if (hk.field_i >= var13 - (-var10 + -var6)) {
                break L9;
              } else {
                var13 = -var6 + (param3 - var10);
                break L9;
              }
            }
            hk.f(var12, var13, var5_int + var9, var10 - -var6, this.field_o);
            hk.a(1 + var12, 1 + var13, var5_int + (var9 - 2), var10 - (-var6 + 2), this.field_f);
            discarded$1 = this.field_p.a(param2, this.field_c + var12, this.field_q + var13, var9, var10, this.field_j, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var5);
            stackOut_27_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(16521).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ')');
        }
    }

    public c() {
        this.field_e = true;
    }

    final void a(String param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_e) {
                this.a(param1 ^ -55, param0, param3, param2);
                break L1;
              } else {
                this.a(param3, 16521, param0, param2);
                break L1;
              }
            }
            if (param1 == -1) {
              break L0;
            } else {
              this.a(124, 123, -118, 6, (byte) -71, 127);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("c.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_r = new vj();
    }
}
