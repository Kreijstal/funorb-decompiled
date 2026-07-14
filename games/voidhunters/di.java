/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends le {
    private boolean field_n;
    private boolean field_o;
    static String field_k;
    static kda field_l;
    static jra field_i;
    static String field_m;
    static String field_j;
    static int field_p;

    public static void e(byte param0) {
        field_j = null;
        if (param0 < 106) {
            di.e((byte) 85);
        }
        field_m = null;
        field_i = null;
        field_k = null;
        field_l = null;
    }

    public di() {
        super(1, false);
        ((di) this).field_n = true;
        ((di) this).field_o = true;
    }

    final int[] a(int param0, boolean param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int[] var7 = ((di) this).field_f.a((byte) -90, param0);
        int[] var3 = var7;
        if (!((di) this).field_f.field_e) {
        } else {
            var4 = ((di) this).a(0, !((di) this).field_n ? param0 : -param0 + wf.field_d, 255);
            if (!((di) this).field_o) {
                cua.a(var4, 0, var7, 0, hob.field_d);
            } else {
                for (var5 = 0; hob.field_d > var5; var5++) {
                    var3[var5] = var4[gbb.field_q - var5];
                }
            }
        }
        if (!param1) {
            return null;
        }
        return var3;
    }

    final void a(int param0, int param1, ds param2) {
        int var4 = 0;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var4 = param0;
          if (var4 == -1) {
            L1: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (-2 != param2.e((byte) -96)) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L1;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L1;
              }
            }
            ((di) this).field_o = stackIn_7_1 != 0;
            break L0;
          } else {
            if (1 == var4) {
              L2: {
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (1 != param2.e((byte) -105)) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L2;
                }
              }
              ((di) this).field_n = stackIn_11_1 != 0;
              break L0;
            } else {
              if (2 != var4) {
                break L0;
              } else {
                L3: {
                  stackOut_12_0 = this;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (param2.e((byte) -89) != 1) {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L3;
                  } else {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L3;
                  }
                }
                ((di) this).field_g = stackIn_15_1 != 0;
                break L0;
              }
            }
          }
        }
        L4: {
          if (param1 < -60) {
            break L4;
          } else {
            int[] discarded$1 = ((di) this).a(-9, true);
            break L4;
          }
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int var14 = 0;
        int[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[][] var30 = null;
        int[][] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        L0: {
          var12 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            di.e((byte) -54);
            break L0;
          }
        }
        L1: {
          var31 = ((di) this).field_d.a(param1, (byte) -113);
          var26 = var31;
          var21 = var26;
          var16 = var21;
          var13 = var16;
          var3 = var13;
          if (((di) this).field_d.field_g) {
            L2: {
              stackOut_4_0 = this;
              stackOut_4_1 = 62;
              stackOut_4_2 = 0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (((di) this).field_n) {
                stackOut_6_0 = this;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = wf.field_d + -param1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = param1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L2;
              }
            }
            var30 = ((di) this).a((byte) stackIn_7_1, stackIn_7_2, stackIn_7_3);
            var32 = var30[0];
            var27 = var32;
            var22 = var27;
            var17 = var22;
            var5 = var17;
            var33 = var30[1];
            var28 = var33;
            var23 = var28;
            var18 = var23;
            var6 = var18;
            var34 = var30[2];
            var29 = var34;
            var24 = var29;
            var19 = var24;
            var7 = var19;
            var8 = var31[0];
            var9 = var31[1];
            var10 = var31[2];
            if (((di) this).field_o) {
              var14 = 0;
              var11 = var14;
              L3: while (true) {
                if (hob.field_d <= var14) {
                  break L1;
                } else {
                  var8[var14] = var5[-var14 + gbb.field_q];
                  var9[var14] = var6[gbb.field_q + -var14];
                  var10[var14] = var7[gbb.field_q - var14];
                  var14++;
                  continue L3;
                }
              }
            } else {
              var11 = 0;
              L4: while (true) {
                if (var11 >= hob.field_d) {
                  break L1;
                } else {
                  var8[var11] = var32[var11];
                  var9[var11] = var33[var11];
                  var10[var11] = var34[var11];
                  var11++;
                  continue L4;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static vu a(String param0, int param1) {
        String var2 = null;
        vu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = VoidHunters.field_G;
        if (null != ae.field_f) {
          if (param0 != null) {
            if (0 != param0.length()) {
              var6 = (CharSequence) (Object) param0;
              var2 = jwa.a(false, var6);
              if (var2 != null) {
                var3 = (vu) (Object) ae.field_f.a(-1, (long)var2.hashCode());
                if (param1 == 0) {
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Fb;
                      var4 = jwa.a(false, var7);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (vu) (Object) ae.field_f.e(-116);
                        continue L0;
                      } else {
                        return var3;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Message lobby";
        field_m = "Add action (Set team of a body)";
        field_i = new jra();
        field_j = "Join";
        field_p = 0;
    }
}
