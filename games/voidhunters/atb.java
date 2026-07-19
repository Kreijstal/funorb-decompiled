/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class atb {
    static int field_d;
    static phb[] field_b;
    private pfb field_c;
    private pf field_a;
    private d field_e;

    public static void a(boolean param0) {
        if (!param0) {
            atb.a(false);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final eb a(int param0, int param1) {
        eb discarded$7 = null;
        eb discarded$8 = null;
        eb discarded$9 = null;
        eb discarded$10 = null;
        eb discarded$11 = null;
        eb discarded$12 = null;
        eb discarded$13 = null;
        Object var3 = null;
        eb var4 = null;
        opa var5 = null;
        int var6 = 0;
        float[] var7 = null;
        int var8 = 0;
        float[] var9 = null;
        eb var11 = null;
        eb var13 = null;
        eb var15 = null;
        eb var17 = null;
        eb var19 = null;
        eb var21 = null;
        eb var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int stackIn_8_0 = 0;
        pf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        pf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        pf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        pf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        pf stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        pf stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        pf stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        pf stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        pf stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        pf stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        pf stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        pf stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        pf stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        pf stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        pf stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        pf stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        pf stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        pf stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        float[] stackIn_55_3 = null;
        pf stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        float[] stackIn_56_3 = null;
        pf stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        float[] stackIn_57_3 = null;
        int stackIn_57_4 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        pf stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        float[] stackOut_54_3 = null;
        pf stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        float[] stackOut_56_3 = null;
        int stackOut_56_4 = 0;
        pf stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        float[] stackOut_55_3 = null;
        int stackOut_55_4 = 0;
        pf stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        pf stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        pf stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        pf stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        pf stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        pf stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        pf stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        pf stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        pf stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        pf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        pf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        pf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        pf stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        pf stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        pf stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        pf stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        pf stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        pf stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        var8 = VoidHunters.field_G;
        var3 = this.field_c.b(0, (long)param1);
        if (var3 != null) {
          return (eb) (var3);
        } else {
          if (this.field_e.a(param1, (byte) -49)) {
            L0: {
              var5 = this.field_e.a(-20292, param1);
              if (var5.field_h) {
                stackOut_7_0 = 64;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_6_0 = this.field_a.field_n;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              }
            }
            var6 = stackIn_8_0;
            if (var5.field_i) {
              if (this.field_a.s()) {
                L1: {
                  var9 = this.field_e.a(0.699999988079071f, var6, param1, var6, 117, false);
                  var7 = var9;
                  stackOut_54_0 = this.field_a;
                  stackOut_54_1 = var6;
                  stackOut_54_2 = var6;
                  stackOut_54_3 = (float[]) (var9);
                  stackIn_56_0 = stackOut_54_0;
                  stackIn_56_1 = stackOut_54_1;
                  stackIn_56_2 = stackOut_54_2;
                  stackIn_56_3 = stackOut_54_3;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  stackIn_55_2 = stackOut_54_2;
                  stackIn_55_3 = stackOut_54_3;
                  if (-1 == (var5.field_j ^ -1)) {
                    stackOut_56_0 = (pf) ((Object) stackIn_56_0);
                    stackOut_56_1 = stackIn_56_1;
                    stackOut_56_2 = stackIn_56_2;
                    stackOut_56_3 = (float[]) ((Object) stackIn_56_3);
                    stackOut_56_4 = 0;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    stackIn_57_3 = stackOut_56_3;
                    stackIn_57_4 = stackOut_56_4;
                    break L1;
                  } else {
                    stackOut_55_0 = (pf) ((Object) stackIn_55_0);
                    stackOut_55_1 = stackIn_55_1;
                    stackOut_55_2 = stackIn_55_2;
                    stackOut_55_3 = (float[]) ((Object) stackIn_55_3);
                    stackOut_55_4 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    stackIn_57_1 = stackOut_55_1;
                    stackIn_57_2 = stackOut_55_2;
                    stackIn_57_3 = stackOut_55_3;
                    stackIn_57_4 = stackOut_55_4;
                    break L1;
                  }
                }
                var22 = ((pf) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4 != 0, param0 + 0, qua.field_d);
                if (param0 != -1) {
                  discarded$7 = this.a(100, 49);
                  var22.a(var5.field_k, (byte) -98, var5.field_s);
                  this.field_c.a(var22, (long)param1, (byte) -117);
                  return var22;
                } else {
                  var22.a(var5.field_k, (byte) -98, var5.field_s);
                  this.field_c.a(var22, (long)param1, (byte) -117);
                  return var22;
                }
              } else {
                if (-3 == (var5.field_q ^ -1)) {
                  L2: {
                    var26 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
                    stackOut_35_0 = this.field_a;
                    stackOut_35_1 = var6;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_37_1 = stackOut_35_1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    if (-1 == (var5.field_j ^ -1)) {
                      stackOut_37_0 = (pf) ((Object) stackIn_37_0);
                      stackOut_37_1 = stackIn_37_1;
                      stackOut_37_2 = 0;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      stackIn_38_2 = stackOut_37_2;
                      break L2;
                    } else {
                      stackOut_36_0 = (pf) ((Object) stackIn_36_0);
                      stackOut_36_1 = stackIn_36_1;
                      stackOut_36_2 = 1;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      stackIn_38_2 = stackOut_36_2;
                      break L2;
                    }
                  }
                  L3: {
                    var17 = ((pf) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2 != 0, var6, (byte) -84, var26);
                    if (param0 == -1) {
                      break L3;
                    } else {
                      discarded$8 = this.a(100, 49);
                      break L3;
                    }
                  }
                  var17.a(var5.field_k, (byte) -98, var5.field_s);
                  this.field_c.a(var17, (long)param1, (byte) -117);
                  return var17;
                } else {
                  if (tka.a(param0 ^ 2, (int) var5.field_c)) {
                    L4: {
                      var28 = this.field_e.a(var6, 0.699999988079071f, true, param1, var6, true);
                      stackOut_47_0 = this.field_a;
                      stackOut_47_1 = var6;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (-1 == (var5.field_j ^ -1)) {
                        stackOut_49_0 = (pf) ((Object) stackIn_49_0);
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L4;
                      } else {
                        stackOut_48_0 = (pf) ((Object) stackIn_48_0);
                        stackOut_48_1 = stackIn_48_1;
                        stackOut_48_2 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        break L4;
                      }
                    }
                    var21 = ((pf) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, var6, (byte) -84, var28);
                    if (param0 != -1) {
                      discarded$9 = this.a(100, 49);
                      var21.a(var5.field_k, (byte) -98, var5.field_s);
                      this.field_c.a(var21, (long)param1, (byte) -117);
                      return var21;
                    } else {
                      var21.a(var5.field_k, (byte) -98, var5.field_s);
                      this.field_c.a(var21, (long)param1, (byte) -117);
                      return var21;
                    }
                  } else {
                    L5: {
                      var27 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
                      stackOut_41_0 = this.field_a;
                      stackOut_41_1 = var6;
                      stackIn_43_0 = stackOut_41_0;
                      stackIn_43_1 = stackOut_41_1;
                      stackIn_42_0 = stackOut_41_0;
                      stackIn_42_1 = stackOut_41_1;
                      if (-1 == (var5.field_j ^ -1)) {
                        stackOut_43_0 = (pf) ((Object) stackIn_43_0);
                        stackOut_43_1 = stackIn_43_1;
                        stackOut_43_2 = 0;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        stackIn_44_2 = stackOut_43_2;
                        break L5;
                      } else {
                        stackOut_42_0 = (pf) ((Object) stackIn_42_0);
                        stackOut_42_1 = stackIn_42_1;
                        stackOut_42_2 = 1;
                        stackIn_44_0 = stackOut_42_0;
                        stackIn_44_1 = stackOut_42_1;
                        stackIn_44_2 = stackOut_42_2;
                        break L5;
                      }
                    }
                    L6: {
                      var19 = ((pf) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2 != 0, var6, (byte) -84, var27);
                      if (param0 == -1) {
                        break L6;
                      } else {
                        discarded$10 = this.a(100, 49);
                        break L6;
                      }
                    }
                    var19.a(var5.field_k, (byte) -98, var5.field_s);
                    this.field_c.a(var19, (long)param1, (byte) -117);
                    return var19;
                  }
                }
              }
            } else {
              if (-3 == (var5.field_q ^ -1)) {
                L7: {
                  var23 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
                  stackOut_12_0 = this.field_a;
                  stackOut_12_1 = var6;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (-1 == (var5.field_j ^ -1)) {
                    stackOut_14_0 = (pf) ((Object) stackIn_14_0);
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L7;
                  } else {
                    stackOut_13_0 = (pf) ((Object) stackIn_13_0);
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L7;
                  }
                }
                L8: {
                  var11 = ((pf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, var6, (byte) -84, var23);
                  if (param0 == -1) {
                    break L8;
                  } else {
                    discarded$11 = this.a(100, 49);
                    break L8;
                  }
                }
                var11.a(var5.field_k, (byte) -98, var5.field_s);
                this.field_c.a(var11, (long)param1, (byte) -117);
                return var11;
              } else {
                if (tka.a(param0 ^ 2, (int) var5.field_c)) {
                  L9: {
                    var25 = this.field_e.a(var6, 0.699999988079071f, true, param1, var6, true);
                    stackOut_24_0 = this.field_a;
                    stackOut_24_1 = var6;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (-1 == (var5.field_j ^ -1)) {
                      stackOut_26_0 = (pf) ((Object) stackIn_26_0);
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      break L9;
                    } else {
                      stackOut_25_0 = (pf) ((Object) stackIn_25_0);
                      stackOut_25_1 = stackIn_25_1;
                      stackOut_25_2 = 1;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      break L9;
                    }
                  }
                  var15 = ((pf) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2 != 0, var6, (byte) -84, var25);
                  var4 = var15;
                  if (param0 != -1) {
                    discarded$12 = this.a(100, 49);
                    var15.a(var5.field_k, (byte) -98, var5.field_s);
                    this.field_c.a(var15, (long)param1, (byte) -117);
                    return var15;
                  } else {
                    var15.a(var5.field_k, (byte) -98, var5.field_s);
                    this.field_c.a(var15, (long)param1, (byte) -117);
                    return var15;
                  }
                } else {
                  L10: {
                    var24 = this.field_e.a(103, var6, var6, false, param1, 0.699999988079071f);
                    stackOut_18_0 = this.field_a;
                    stackOut_18_1 = var6;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    if (-1 == (var5.field_j ^ -1)) {
                      stackOut_20_0 = (pf) ((Object) stackIn_20_0);
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      break L10;
                    } else {
                      stackOut_19_0 = (pf) ((Object) stackIn_19_0);
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      break L10;
                    }
                  }
                  L11: {
                    var13 = ((pf) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2 != 0, var6, (byte) -84, var24);
                    if (param0 == -1) {
                      break L11;
                    } else {
                      discarded$13 = this.a(100, 49);
                      break L11;
                    }
                  }
                  var13.a(var5.field_k, (byte) -98, var5.field_s);
                  this.field_c.a(var13, (long)param1, (byte) -117);
                  return var13;
                }
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(byte param0) {
        if (param0 != -106) {
          this.field_a = (pf) null;
          this.field_c.a(true, 5);
          return;
        } else {
          this.field_c.a(true, 5);
          return;
        }
    }

    atb(pf param0, d param1) {
        this.field_c = new pfb(256);
        try {
            this.field_e = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "atb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
