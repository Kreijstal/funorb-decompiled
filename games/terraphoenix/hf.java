/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf extends fd {
    static cm field_s;
    private bd field_v;
    private bd[] field_A;
    static int[] field_B;
    static String field_z;
    static String field_u;
    static boolean field_x;
    static ci field_y;
    static ci[] field_w;
    static boolean field_t;

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        bd var7 = null;
        bd var9 = null;
        eb var10 = null;
        bd var11 = null;
        bd var12 = null;
        bd var13 = null;
        bd var14 = null;
        gl stackIn_5_0 = null;
        gl stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        L0: {
          if (param3 == -24381) {
            break L0;
          } else {
            field_t = false;
            break L0;
          }
        }
        L1: {
          if (param1 instanceof eb) {
            stackOut_4_0 = (gl) param1;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackIn_5_0 = (gl) (Object) stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var10 = (eb) (Object) stackIn_5_0;
          di.a(param1.field_p + param1.field_w + param2, param0 + param1.field_u, 16105, param1.field_n + param1.field_u + param0, param1.field_w + param2);
          if (var10 == null) {
            break L2;
          } else {
            param4 = param4 & var10.field_A;
            break L2;
          }
        }
        L3: {
          var7 = ((hf) this).field_A[0];
          ((hf) this).field_v.a(param3 ^ -24369);
          var7.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -127, param2);
          if (var10 != null) {
            L4: {
              if (var10.field_C) {
                var11 = ((hf) this).field_A[1];
                if (var11 == null) {
                  break L4;
                } else {
                  var11.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -128, param2);
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (!var10.field_s) {
              break L3;
            } else {
              L5: {
                var12 = ((hf) this).field_A[3];
                if (var10.field_j == 0) {
                  break L5;
                } else {
                  if (var12 == null) {
                    break L5;
                  } else {
                    var12.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -126, param2);
                    break L3;
                  }
                }
              }
              var9 = ((hf) this).field_A[2];
              if (var9 != null) {
                var9.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -126, param2);
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L6: {
          if (param1.d(-111)) {
            var13 = ((hf) this).field_A[5];
            if (var13 != null) {
              var13.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -127, param2);
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (param4) {
            break L7;
          } else {
            var14 = ((hf) this).field_A[4];
            if (var14 == null) {
              break L7;
            } else {
              var14.a(param1, ((hf) this).field_v, (hf) this, param0, (byte) -127, param2);
              break L7;
            }
          }
        }
        ((hf) this).field_v.a(param0, param1, param2, 1, (hf) this);
        ij.a(false);
    }

    hf(hf param0, boolean param1) {
        this();
        param0.a(param1, (hf) this, (byte) -126);
    }

    final void a(int param0, int param1, ci[] param2) {
        if (param0 != -26108) {
            return;
        }
        int var4 = param1;
        if (((hf) this).field_A[var4] == null) {
            ((hf) this).field_A[var4] = new bd();
        }
        ((hf) this).field_A[param1].field_b = param2;
    }

    final static ok a(int param0, byte param1) {
        ok var2 = new ok();
        vc.field_g.a((uf) (Object) var2, -16611);
        eb.a(param0, (byte) 126);
        int var3 = 116 % ((param1 - -59) / 35);
        return var2;
    }

    final void a(int param0, ci param1) {
        bd[] var3 = null;
        int var4 = 0;
        bd var5 = null;
        int var6 = 0;
        bd[] var7 = null;
        var6 = Terraphoenix.field_V;
        var7 = ((hf) this).field_A;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_c = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static String a(CharSequence param0, byte param1) {
        if (param1 >= -11) {
            Object var3 = null;
            String discarded$0 = hf.a((CharSequence) null, (byte) 93);
        }
        return im.a(param0, (byte) -14, false);
    }

    public hf() {
        ((hf) this).field_A = new bd[6];
        ((hf) this).field_v = new bd();
        ((hf) this).field_A[0] = new bd();
        bd var1 = new bd();
        var1.a(15);
    }

    public static void a(byte param0) {
        field_z = null;
        field_u = null;
        field_s = null;
        field_w = null;
        field_y = null;
        field_B = null;
        int var1 = 40 / ((-66 - param0) / 44);
    }

    final void a(ci[] param0, byte param1) {
        bd[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        bd var6 = null;
        int var7 = 0;
        bd[] var8 = null;
        var7 = Terraphoenix.field_V;
        var8 = ((hf) this).field_A;
        var3 = var8;
        var5 = -100 % ((param1 - 63) / 62);
        var4 = 0;
        L0: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var6 = var8[var4];
            if (var6 != null) {
              var6.field_b = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, hf param1, byte param2) {
        int var4 = 0;
        bd var5 = null;
        bd var6 = null;
        bd var6_ref = null;
        int var7 = 0;
        bd stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        bd stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        bd stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        bd stackIn_9_2 = null;
        bd stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        bd stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        bd stackOut_8_2 = null;
        bd stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        bd stackOut_7_2 = null;
        L0: {
          var7 = Terraphoenix.field_V;
          super.a((fd) (Object) param1, -111);
          if (param0) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 6) {
                break L0;
              } else {
                var5 = ((hf) this).field_A[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L2: {
                    var6_ref = param1.field_A[var4];
                    stackOut_6_0 = (bd) var5;
                    stackOut_6_1 = -46;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var6_ref != null) {
                      stackOut_8_0 = (bd) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = (bd) var6_ref;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      stackIn_9_2 = stackOut_8_2;
                      break L2;
                    } else {
                      param1.field_A[var4] = new bd();
                      stackOut_7_0 = (bd) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = new bd();
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      stackIn_9_2 = stackOut_7_2;
                      break L2;
                    }
                  }
                  ((bd) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2);
                  var4++;
                  continue L1;
                } else {
                  param1.field_A[var4] = null;
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            ka.a((Object[]) (Object) ((hf) this).field_A, 0, (Object[]) (Object) param1.field_A, 0, 6);
            break L0;
          }
        }
        L3: {
          if (param2 <= -113) {
            break L3;
          } else {
            ((hf) this).field_A = null;
            break L3;
          }
        }
    }

    final bd a(int param0, int param1) {
        if (param1 != 3) {
            hf.a((byte) -125);
        }
        ((hf) this).field_A[param0] = new bd();
        return new bd();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new cm(2);
        field_u = "Reload game";
        field_t = true;
        field_z = "Not yet achieved";
    }
}
