/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    int field_s;
    int field_d;
    kh field_i;
    private int field_v;
    int field_x;
    ka field_m;
    static h field_u;
    kh field_j;
    static int field_e;
    kh field_k;
    int field_c;
    int field_a;
    private boolean field_g;
    int field_n;
    kh field_w;
    kh field_t;
    int field_h;
    int field_b;
    int field_o;
    kh field_p;
    static String field_l;
    int field_r;
    kh field_q;
    static int[] field_f;

    final static void a(ha param0, int param1) {
        try {
            if (param1 >= -107) {
                field_f = (int[]) null;
            }
            hf.a(param0, (byte) 9, true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param3 < 44) {
          this.a(69, 37, 82, 84, -66);
          qn.h(param2, param4, param5, param1, param0);
          return;
        } else {
          qn.h(param2, param4, param5, param1, param0);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var5_int = this.field_m.a(param3);
            var6 = this.field_m.field_z + this.field_m.field_L;
            var7 = param1;
            if (var5_int + (var7 - param0) > qn.field_l) {
                var7 = -6 + -var5_int + qn.field_l;
            }
            var8 = 32 + (param2 - this.field_m.field_z);
            if (qn.field_g < var6 + (var8 + 6)) {
                var8 = -6 + -var6 + qn.field_g;
            }
            qn.b(var7, var8, 6 + var5_int, var6 + 6, this.field_v);
            qn.f(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, this.field_c);
            this.field_m.b(param3, var7 + 3, this.field_m.field_z + var8 - -3, this.field_v, -1);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        ha var2 = null;
        field_f = null;
        field_u = null;
        if (param0 <= 75) {
          var2 = (ha) null;
          fl.a((ha) null, -110);
          field_l = null;
          return;
        } else {
          field_l = null;
          return;
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_g) {
                  break L2;
                } else {
                  this.a(true, param0, param3, param2);
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(-6, param3, param0, param2);
              break L1;
            }
            if (param1 < -99) {
              break L0;
            } else {
              this.field_d = 107;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("fl.D(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
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
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_r + this.field_x;
              var6 = this.field_d + this.field_h;
              var7 = this.field_o;
              if ((var7 ^ -1) != 0) {
                break L1;
              } else {
                var7 = this.field_m.field_H + this.field_m.field_L;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  L5: {
                    var8 = qn.field_l >> -1638260958;
                    var9 = this.field_m.a(param3);
                    var10 = this.field_m.field_L + this.field_m.field_H;
                    var11 = 1;
                    if (var9 > var8) {
                      break L5;
                    } else {
                      if ((param3.indexOf("<br>") ^ -1) != 0) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (null != tt.field_a) {
                      break L6;
                    } else {
                      tt.field_a = new String[16];
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (var8 >= var9) {
                        break L8;
                      } else {
                        var13 = var9 / var8;
                        var12 = var8 - -((-1 + var9 % var8 + var13) / var13 * 2);
                        if (var15 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var12 = var8;
                    break L7;
                  }
                  var11 = this.field_m.a(param3, new int[]{var12}, tt.field_a);
                  var10 = var10 + (-1 + var11) * var7;
                  var9 = 0;
                  var13 = 0;
                  L9: while (true) {
                    if (var11 <= var13) {
                      break L4;
                    } else {
                      var14 = this.field_m.a(tt.field_a[var13]);
                      var17 = var14;
                      var16 = var9;
                      if (var15 != 0) {
                        if (var16 <= var17) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L10: {
                          if (var16 >= var17) {
                            break L10;
                          } else {
                            var9 = var14;
                            break L10;
                          }
                        }
                        var13++;
                        continue L9;
                      }
                    }
                  }
                }
                var12 = param2;
                if (qn.field_l >= var5_int + var9 + var12) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var12 = -var5_int + (qn.field_l + -var9);
              break L2;
            }
            L11: {
              if (param0) {
                break L11;
              } else {
                this.field_w = (kh) null;
                break L11;
              }
            }
            L12: {
              var13 = 32 + param1 - this.field_m.field_z;
              if (qn.field_g < var6 + var13 - -var10) {
                var13 = -var10 + (param1 + -var6);
                break L12;
              } else {
                break L12;
              }
            }
            qn.b(var12, var13, var9 - -var5_int, var10 + var6, this.field_s);
            qn.f(var12 - -1, 1 + var13, var5_int + (var9 + -2), -2 + (var10 + var6), this.field_c);
            discarded$1 = this.field_m.a(param3, var12 + this.field_x, this.field_h + var13, var9, var10, this.field_v, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var5);
            stackOut_29_1 = new StringBuilder().append("fl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L13;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L13;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        id.a(param4, param1, param0, param2, (byte) 83);
        int var6 = 26 / ((param3 - -48) / 53);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        qn.b(param1, param2, param5, param4, param6, param0);
        if (!param3) {
            fl.a((byte) 3);
        }
    }

    final void a(int param0) {
        rf.b(-18862);
        if (param0 < 15) {
            field_l = (String) null;
        }
    }

    final void a(int param0, ka param1) {
        ip discarded$10 = null;
        ip discarded$11 = null;
        ip discarded$12 = null;
        ip discarded$13 = null;
        ip discarded$14 = null;
        ip discarded$15 = null;
        or discarded$16 = null;
        kp discarded$17 = null;
        ip discarded$18 = null;
        ip discarded$19 = null;
        RuntimeException var3 = null;
        ao var4 = null;
        wk[] var5 = null;
        ao var6 = null;
        int var7_int = 0;
        ao var7 = null;
        ao var8 = null;
        wk[] var9 = null;
        wk[] var10 = null;
        ao var11 = null;
        ao var12 = null;
        wk var13 = null;
        ao var14 = null;
        int var15 = 0;
        nj var16 = null;
        lk var17 = null;
        nj var18 = null;
        ao var19 = null;
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
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var17 = new lk(param1, 2, 2, 2236962, 1, 1, 1, param1.field_L + (param1.field_H - -2));
            this.field_t = (kh) ((Object) var17);
            var17.field_d = 16777215;
            var4 = new ao();
            var17.a(var4, 24978);
            this.field_o = -1;
            this.field_x = 3;
            this.field_h = 3;
            this.field_m = param1;
            var4.field_l = 11711154;
            this.field_s = 15658734;
            this.field_d = 3;
            this.field_c = 5592405;
            this.field_v = 15658734;
            this.field_r = 3;
            var4.field_o = 15658734;
            discarded$10 = var4.a(0, (byte) -102).a(15658734, (byte) -108).a(ue.a(10066329, 8947848, 1, 7829367), 53);
            discarded$11 = var4.a(1, (byte) -119).a(ue.a(10066329, 11184810, 1, 13421772), 31);
            discarded$12 = var4.a(3, (byte) -128).a(ue.a(7829367, 8947848, 1, 10066329), -128).a(1, 1).a((byte) 81, 1);
            var5 = new wk[9];
            var16 = new nj(32, 32);
            var18 = var16;
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7_int >= var18.field_B.length) {
                    break L3;
                  } else {
                    var16.field_B[var7_int] = 1077952576;
                    var7_int++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5[4] = (wk) ((Object) var16);
                discarded$13 = var4.a(4, (byte) -105).a(true, (byte) 66).a(var5, param0 + -13421900);
                discarded$14 = var4.a(5, (byte) -113).a(mg.a(65793, 0, (byte) -125, 0, 0), -126).a(true, (byte) 121).a(-1, (byte) -109);
                this.field_j = (kh) ((Object) var4);
                break L2;
              }
              var6 = new ao(var4, true);
              var6.field_n = 0;
              var7 = new ao(var4, true);
              var7.field_n = 0;
              var7.a(-128, ak.b(8947848, 5));
              discarded$15 = var7.a(1, (byte) -85).a(ak.b(11184810, 5), 67).a(2236962, (byte) -127);
              this.field_i = (kh) ((Object) new tk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
              discarded$16 = new or(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
              discarded$17 = new kp(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
              var8 = new ao();
              var17.a(var8, param0 ^ 13413726);
              discarded$18 = var8.a(0, (byte) -128).a(ue.a(7829367, 15658734, param0 ^ 13421773, 10066329), 36).a(1118481, (byte) 27).b(-1, param0 ^ 13421751);
              discarded$19 = var8.a(4, (byte) -108).a(true, (byte) 104).a(var5, -126);
              this.field_w = (kh) ((Object) var8);
              var9 = new wk[9];
              var10 = new wk[9];
              var9[4] = new wk(2, 1);
              var10[4] = new wk(1, 2);
              var9[4].field_B = new int[]{6710886, 7829367};
              var10[4].field_B = new int[]{6710886, 7829367};
              var11 = new ao();
              var12 = new ao();
              var11.a(var9, 0, param0 + -13421779);
              var12.a(var10, 0, param0 + -13421779);
              this.field_k = (kh) ((Object) var12);
              this.field_p = (kh) ((Object) var4);
              var13 = new wk(7, 4);
              var13.field_B = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
              this.field_a = 10;
              var14 = new ao(var4, true);
              var14.a(0, var13.g());
              var13.d();
              var14 = new ao(var4, true);
              var14.a(0, var13.g());
              var13.d();
              var14 = new ao(var4, true);
              var14.a(0, var13.g());
              var13.d();
              var19 = new ao(var4, true);
              var19.a(0, var13);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("fl.C(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public fl() {
        this.field_g = true;
    }

    static {
        field_u = new h(2);
        field_l = "Join";
        field_f = new int[8192];
    }
}
