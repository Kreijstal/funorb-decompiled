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
        int stackIn_8_0 = 0;
        pf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        pf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        pf stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        pf stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        pf stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_27_2 = 0;
        pf stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        pf stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        pf stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        pf stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        pf stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        pf stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        pf stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        float[] stackIn_56_3;
        pf stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        float[] stackIn_57_3 = null;
        int stackIn_57_4 = 0;
        Object var3;
        eb var4;
        opa var5;
        int var6;
        float[] var7;
        int var8;
        float[] var9;
        eb var11;
        eb var13;
        eb var15;
        eb var17;
        eb var19;
        eb var21;
        eb var22;
        int[] var23;
        int[] var24;
        int[] var25;
        int[] var26;
        int[] var27;
        int[] var28;
        var8 = VoidHunters.field_G;
        var3 = this.field_c.b(0, (long)param1);
        if (var3 != null) {
          return (eb) (var3);
        } else {
          if (this.field_e.a(param1, (byte) -49)) {
            L0: {
              var5 = this.field_e.a(-20292, param1);
              if (var5.field_h) {
                stackIn_8_0 = 64;
                break L0;
              } else {
                stackIn_8_0 = this.field_a.field_n;
                break L0;
              }
            }
            var6 = stackIn_8_0;
            if (var5.field_i) {
              if (this.field_a.s()) {
                L1: {
                  var9 = this.field_e.a(0.699999988079071f, var6, param1, var6, 117, false);
                  var7 = var9;
                  stackIn_56_0 = this.field_a;

                  stackIn_56_1 = var6;

                  stackIn_56_2 = var6;

                  stackIn_56_3 = (float[]) (var9);

                  if (-1 == (var5.field_j ^ -1)) {
                    stackIn_57_0 = (pf) ((Object) stackIn_56_0);
                    stackIn_57_1 = stackIn_56_1;
                    stackIn_57_2 = stackIn_56_2;
                    stackIn_57_3 = (float[]) ((Object) stackIn_56_3);
                    stackIn_57_4 = 0;
                    break L1;
                  } else {
                    stackIn_57_0 = (pf) ((Object) stackIn_56_0);
                    stackIn_57_1 = stackIn_56_1;
                    stackIn_57_2 = stackIn_56_2;
                    stackIn_57_3 = (float[]) ((Object) stackIn_56_3);
                    stackIn_57_4 = 1;
                    break L1;
                  }
                }
                var22 = ((pf) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4 != 0, param0 + 0, qua.field_d);
                if (param0 != -1) {
                  this.a(100, 49);
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
                    stackIn_37_0 = this.field_a;

                    stackIn_37_1 = var6;

                    if (-1 == (var5.field_j ^ -1)) {
                      stackIn_38_0 = (pf) ((Object) stackIn_37_0);
                      stackIn_38_1 = stackIn_37_1;
                      stackIn_38_2 = 0;
                      break L2;
                    } else {
                      stackIn_38_0 = (pf) ((Object) stackIn_37_0);
                      stackIn_38_1 = stackIn_37_1;
                      stackIn_38_2 = 1;
                      break L2;
                    }
                  }
                  L3: {
                    var17 = ((pf) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2 != 0, var6, (byte) -84, var26);
                    if (param0 == -1) {
                      break L3;
                    } else {
                      this.a(100, 49);
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
                      stackIn_49_0 = this.field_a;

                      stackIn_49_1 = var6;

                      if (-1 == (var5.field_j ^ -1)) {
                        stackIn_50_0 = (pf) ((Object) stackIn_49_0);
                        stackIn_50_1 = stackIn_49_1;
                        stackIn_50_2 = 0;
                        break L4;
                      } else {
                        stackIn_50_0 = (pf) ((Object) stackIn_49_0);
                        stackIn_50_1 = stackIn_49_1;
                        stackIn_50_2 = 1;
                        break L4;
                      }
                    }
                    var21 = ((pf) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2 != 0, var6, (byte) -84, var28);
                    if (param0 != -1) {
                      this.a(100, 49);
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
                      stackIn_43_0 = this.field_a;

                      stackIn_43_1 = var6;

                      if (-1 == (var5.field_j ^ -1)) {
                        stackIn_44_0 = (pf) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = 0;
                        break L5;
                      } else {
                        stackIn_44_0 = (pf) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = 1;
                        break L5;
                      }
                    }
                    L6: {
                      var19 = ((pf) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2 != 0, var6, (byte) -84, var27);
                      if (param0 == -1) {
                        break L6;
                      } else {
                        this.a(100, 49);
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
                  stackIn_14_0 = this.field_a;

                  stackIn_14_1 = var6;

                  if (-1 == (var5.field_j ^ -1)) {
                    stackIn_15_0 = (pf) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = 0;
                    break L7;
                  } else {
                    stackIn_15_0 = (pf) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = 1;
                    break L7;
                  }
                }
                L8: {
                  var11 = ((pf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2 != 0, var6, (byte) -84, var23);
                  if (param0 == -1) {
                    break L8;
                  } else {
                    this.a(100, 49);
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
                    stackIn_26_0 = this.field_a;

                    stackIn_26_1 = var6;

                    if (-1 == (var5.field_j ^ -1)) {
                      stackIn_27_0 = (pf) ((Object) stackIn_26_0);
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = 0;
                      break L9;
                    } else {
                      stackIn_27_0 = (pf) ((Object) stackIn_26_0);
                      stackIn_27_1 = stackIn_26_1;
                      stackIn_27_2 = 1;
                      break L9;
                    }
                  }
                  var15 = ((pf) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_27_2 != 0, var6, (byte) -84, var25);
                  var4 = var15;
                  if (param0 != -1) {
                    this.a(100, 49);
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
                    stackIn_20_0 = this.field_a;

                    stackIn_20_1 = var6;

                    if (-1 == (var5.field_j ^ -1)) {
                      stackIn_21_0 = (pf) ((Object) stackIn_20_0);
                      stackIn_21_1 = stackIn_20_1;
                      stackIn_21_2 = 0;
                      break L10;
                    } else {
                      stackIn_21_0 = (pf) ((Object) stackIn_20_0);
                      stackIn_21_1 = stackIn_20_1;
                      stackIn_21_2 = 1;
                      break L10;
                    }
                  }
                  L11: {
                    var13 = ((pf) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2 != 0, var6, (byte) -84, var24);
                    if (param0 == -1) {
                      break L11;
                    } else {
                      this.a(100, 49);
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
