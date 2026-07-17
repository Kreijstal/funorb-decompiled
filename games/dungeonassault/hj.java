/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends gd {
    static String field_Q;
    static String field_U;
    static String[] field_O;
    static int[] field_W;
    static nh field_Z;
    private pj field_R;
    static cn field_T;
    hb field_V;
    static int field_S;
    boolean field_Y;
    static String field_X;
    static String field_ab;
    static String[] field_P;

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        Object var7 = null;
        int[] var11 = null;
        if (((hj) this).field_F) {
          L0: {
            var4 = param0 + ((hj) this).field_t;
            var5 = ((hj) this).field_i - -param2;
            if (!((hj) this).field_R.b(0, ((hj) this).field_V)) {
              break L0;
            } else {
              this.a(var4, var5, ((hj) this).field_z, (byte) 105);
              break L0;
            }
          }
          L1: {
            if (((hj) this).field_R.field_u != ((hj) this).field_V) {
              break L1;
            } else {
              if ((6 & ((hj) this).field_V.field_o) != 0) {
                break L1;
              } else {
                this.a(var4, var5, ((hj) this).field_H, (byte) 112);
                break L1;
              }
            }
          }
          L2: {
            if ((Object) (Object) wi.field_ob != this) {
              break L2;
            } else {
              if (((hj) this).field_Y) {
                this.a(var4, var5, ((hj) this).field_I, (byte) -12);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (param1 == 8187) {
              break L3;
            } else {
              var7 = null;
              this.a(-8, 106, (cn) null, (byte) 40);
              break L3;
            }
          }
          L4: {
            var11 = new int[4];
            gf.a(var11);
            gf.e(var4 - -5, 5 + var5, 40 + var4 - 5, 40 + var5 + -5);
            if (k.field_c != ((hj) this).field_V.field_b.field_n) {
              ((hj) this).field_V.field_b.a(60, var5, (byte) 102, -10 + var4, 60);
              break L4;
            } else {
              ((hj) this).field_V.field_b.a(40, var5, (byte) 102, var4, 40);
              break L4;
            }
          }
          L5: {
            gf.b(var11);
            if (((hj) this).field_V.field_i != null) {
              qe.a(var4 + 38, -2 + (40 + var5), 2, ((hj) this).field_V.field_i, ((hj) this).field_V.field_i.length);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (((hj) this).field_F) {
          L0: {
            var4 = ((hj) this).field_t - -param0;
            var6 = 77 % ((41 - param2) / 61);
            var5 = param1 + ((hj) this).field_i;
            if (0 != (4 & ((hj) this).field_V.field_o)) {
              gf.b(var4 - -5, var5 - -5, ((hj) this).field_q + -10, ((hj) this).field_x + -10, 16711680, 64);
              break L0;
            } else {
              if ((2 & ((hj) this).field_V.field_o) == 0) {
                break L0;
              } else {
                gf.b(var4 - -5, 5 + var5, ((hj) this).field_q - 10, -10 + ((hj) this).field_x, 16776960, 64);
                break L0;
              }
            }
          }
          gf.e(var4, var5, 40, 40, 0);
          gf.e(4 + var4, 4 + var5, 32, 32, 0);
          rp.a(6, 32, (byte) 108, 4 + var4, 32, kc.field_S, 4 + var5);
          return;
        } else {
          return;
        }
    }

    final static cn[] a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 6 / ((param2 - 62) / 33);
        int discarded$0 = 1;
        return ba.a(param0, 3, -102, param3, param4, 1, 1, param1);
    }

    public static void f() {
        field_ab = null;
        field_Z = null;
        field_U = null;
        field_W = null;
        field_O = null;
        field_X = null;
        field_T = null;
        field_P = null;
        field_Q = null;
    }

    final static void g() {
        fe.field_k = new md();
        int var1 = 29;
    }

    hj(pj param0, hb param1, int param2, int param3) {
        super(param2, param3, 40, 40, 0);
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            ((hj) this).field_V = param1;
            ((hj) this).field_R = param0;
            var5_int = 20;
            var6 = 2 * var5_int + 40;
            var7 = 40 - -(var5_int * 2);
            jh.c();
            ((hj) this).field_I = this.a(var6, var5_int, 16777088, 3, var7);
            ((hj) this).field_z = this.a(var6, var5_int, 8421631, 3, var7);
            ((hj) this).field_H = this.a(var6, var5_int, 16744448, 3, var7);
            jh.b();
            ((hj) this).field_Y = true;
            ((hj) this).field_n = (en) (Object) new fc(((hj) this).field_R, ((hj) this).field_V);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 16711935 & param3;
        param3 = param3 & 65280;
        int var5 = param1 & 16711935;
        param1 = param1 & 65280;
        var5 = var5 * param2;
        param3 = param3 * (-param2 + 256);
        var4 = var4 * (-param2 + 256);
        param1 = param1 * param2;
        var4 = var4 & -16711936;
        var5 = var5 & -16711936;
        if (param0 < 21) {
            cn[] discarded$0 = hj.a(31, 105, (byte) -117, -94, 121);
        }
        param3 = param3 & 16711680;
        param1 = param1 & 16711680;
        return (param1 + param3 | var4 + var5) >>> 8;
    }

    private final cn a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        int var12 = 0;
        int var13 = 0;
        cn var15 = null;
        var13 = DungeonAssault.field_K;
        var15 = new cn(80, param4);
        var15.field_w = -20;
        var15.field_A = -20;
        var7 = param2 & 16711935;
        jh.a(var15);
        var8 = param2 & 65280;
        var9 = 0;
        L0: while (true) {
          if (var9 >= param4) {
            jh.b();
            return var15;
          } else {
            var10 = 0;
            L1: while (true) {
              if (80 <= var10) {
                var9++;
                continue L0;
              } else {
                var11 = -(float)Math.sqrt((double)((float)((var9 + -(param4 >> 1)) * (var9 + -(param4 >> 1)) + (-40 + var10) * (var10 - 40)) / (float)1600)) + 1.0f;
                var12 = (int)(512.0f * var11);
                if (var12 <= -1) {
                  L2: {
                    if (-257 < var12) {
                      var12 = 256;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param2 = (var8 * var12 & 16711680 | -16711936 & var7 * var12) >>> 8;
                  var15.field_B[80 * var9 - -var10] = param2;
                  var10++;
                  continue L1;
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, cn param2, byte param3) {
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var21 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var8 = -(param2.field_v >> 1);
              var14 = 0;
              var15 = param2.field_y;
              var16 = 0;
              if (param2.field_A + param1 < 0) {
                var16 = var16 - (param1 + param2.field_A);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var17 = param2.field_v;
              if (param2.field_w + (param0 + param2.field_y) <= 640) {
                break L2;
              } else {
                var15 = 640 - param0 - param2.field_w;
                break L2;
              }
            }
            L3: {
              var18 = -98 % ((param3 - 53) / 48);
              if (-481 <= param1 - -param2.field_A - -param2.field_v) {
                break L3;
              } else {
                var17 = -param1 + 480 - param2.field_A;
                break L3;
              }
            }
            L4: {
              if (-1 <= param0 + param2.field_w) {
                break L4;
              } else {
                var14 = var14 - (param0 - -param2.field_w);
                break L4;
              }
            }
            var15 = -var15 + var14;
            var19 = var16;
            L5: while (true) {
              if (var19 >= var17) {
                break L0;
              } else {
                var6 = param2.field_w + (param0 + (var14 + 640 * (param1 - (-var19 + -param2.field_A))));
                var7 = var14 + -(param2.field_y >> 1);
                var5_int = var19 * param2.field_y + var14;
                var20 = var15;
                L6: while (true) {
                  if (var20 >= 0) {
                    var8++;
                    var19++;
                    continue L5;
                  } else {
                    L7: {
                      var11 = 11 * u.a(var7, var8, true) >> 6;
                      var9 = (int)(128.0 * (1.0 + te.c(mo.field_a + ((Object) (Object) param2).hashCode(), var11, 0.0078125)));
                      if (var9 <= 0) {
                        break L7;
                      } else {
                        L8: {
                          var10 = param2.field_B[var5_int];
                          if (var9 >= 256) {
                            break L8;
                          } else {
                            var12 = var9 * (16711935 & var10);
                            var10 = (var12 & -16711936) + (-var12 + var10 * var9 & 16711680) >>> 8;
                            break L8;
                          }
                        }
                        var12 = gf.field_b[var6];
                        var13 = var10 - -var12;
                        var10 = (16711935 & var10) + (var12 & 16711935);
                        var12 = (16777472 & var10) - -(65536 & -var10 + var13);
                        gf.field_b[var6] = mp.a(var13 - var12, var12 + -(var12 >>> 8));
                        break L7;
                      }
                    }
                    var7++;
                    var5_int++;
                    var6++;
                    var20++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5;
            stackOut_21_1 = new StringBuilder().append("hj.B(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Create your own free Jagex account";
        field_S = 0;
        field_O = new String[]{"Victory", "<%highlight>Your raider has sucessfully overcome <%lastroom></col>. After a room has been defeated, it will <%highlight>remain safe for the rest of the raid</col>. You can now move onwards, and change your party leader if you wish.<br><br><%command>Click on an accessible room (surrounded by an orange glow) to move on.</col>"};
        field_P = new String[]{"Glamour", "With the powers of illusion at her command, the <%0> is able to enchant a raider, causing them to glow brilliantly; any monster the raider encounters in the next room will be blinded and fight at a severe disadvantage. (Single use)"};
        field_ab = "Tempted by the promise of gold from the cities and wars of the humans in the west, the mercenary knight is a master swordsman, but lacks the patience to deal with traps.";
        field_X = "CONTINUE";
    }
}
