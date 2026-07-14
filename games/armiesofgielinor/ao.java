/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends lk {
    private ip[] field_w;
    static String field_u;
    static String field_x;
    private ip field_v;

    final static void a(int param0, int param1, int param2, bv param3, int param4) {
        int var5 = 58 / ((param1 - -86) / 38);
        if (param2 < param4) {
            param3.c(param0, (byte) 0);
            int discarded$0 = ir.a(14, 20, param4, 30, 1, 4, param3);
        }
        param3.d((byte) -83, param4 + param2 + param0);
    }

    final static String a(String param0, boolean param1, String param2, kl param3) {
        if (!(param3.a((byte) 82))) {
            return param0;
        }
        if (!param1) {
            return null;
        }
        return param2 + " - " + param3.a(0) + "%";
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        ip var7 = null;
        ip var9 = null;
        fw var10 = null;
        ip var11 = null;
        ip var12 = null;
        ip var13 = null;
        ip var14 = null;
        kb stackIn_3_0 = null;
        kb stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param0 instanceof fw) {
            stackOut_2_0 = (kb) param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (kb) (Object) stackOut_1_0;
            break L0;
          }
        }
        var10 = (fw) (Object) stackIn_3_0;
        id.a(param1 + param0.field_B, param0.field_l + (param0.field_B + param1), param0.field_p + (param4 - -param0.field_w), param4 - -param0.field_p, (byte) 72);
        if (param2 < -79) {
          L1: {
            if (var10 == null) {
              break L1;
            } else {
              param3 = param3 & var10.field_I;
              break L1;
            }
          }
          L2: {
            var7 = ((ao) this).field_w[0];
            ((ao) this).field_v.a(false);
            var7.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
            if (var10 != null) {
              L3: {
                if (!var10.field_K) {
                  break L3;
                } else {
                  var11 = ((ao) this).field_w[1];
                  if (var11 == null) {
                    break L3;
                  } else {
                    var11.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                    break L3;
                  }
                }
              }
              if (var10.field_t) {
                L4: {
                  var12 = ((ao) this).field_w[3];
                  if (0 == var10.field_q) {
                    break L4;
                  } else {
                    if (var12 != null) {
                      var12.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                var9 = ((ao) this).field_w[2];
                if (var9 != null) {
                  var9.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (!param0.a(false)) {
              break L5;
            } else {
              var13 = ((ao) this).field_w[5];
              if (var13 != null) {
                var13.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (!param3) {
              var14 = ((ao) this).field_w[4];
              if (var14 == null) {
                break L6;
              } else {
                var14.a(-10265, ((ao) this).field_v, param1, (ao) this, param4, param0);
                break L6;
              }
            } else {
              break L6;
            }
          }
          ((ao) this).field_v.a(param0, (byte) 113, param4, param1, (ao) this);
          rf.b(-18862);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, wk param1) {
        ip[] var3 = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
        ip[] var7 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var7 = ((ao) this).field_w;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    ao(ao param0, boolean param1) {
        this();
        param0.a(param1, (ao) this, 6);
    }

    public static void b(byte param0) {
        field_x = null;
        field_u = null;
        int var1 = 101 / ((param0 - -45) / 33);
    }

    public ao() {
        ((ao) this).field_w = new ip[6];
        ((ao) this).field_v = new ip();
        ((ao) this).field_w[0] = new ip();
        ip var1 = new ip();
        var1.a(false);
    }

    final void a(int param0, wk[] param1) {
        ip[] var3 = null;
        int var4 = 0;
        ip var5 = null;
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = ((ao) this).field_w;
          var4 = 0;
          if (param0 < -123) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var4 >= var3.length) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_d = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final ip a(int param0, byte param1) {
        if (param1 >= -69) {
            ip discarded$0 = ((ao) this).a(-22, (byte) -18);
        }
        ((ao) this).field_w[param0] = new ip();
        return new ip();
    }

    final void a(wk[] param0, int param1, int param2) {
        int var4 = param1;
        if (null == ((ao) this).field_w[var4]) {
            ((ao) this).field_w[var4] = new ip();
        }
        if (param2 != -7) {
            Object var5 = null;
            ((ao) this).a((wk[]) null, 15, 64);
        }
        ((ao) this).field_w[param1].field_d = param0;
    }

    private final void a(boolean param0, ao param1, int param2) {
        int var4 = 0;
        ip var5 = null;
        ip var6 = null;
        int var7 = 0;
        Object var8 = null;
        ip stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ip stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ip stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ip stackIn_11_2 = null;
        ip stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ip stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ip stackOut_10_2 = null;
        ip stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ip stackOut_9_2 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 == 6) {
            break L0;
          } else {
            var8 = null;
            this.a(false, (ao) null, 119);
            break L0;
          }
        }
        L1: {
          this.a((lk) (Object) param1, 24978);
          if (param0) {
            var4 = 0;
            L2: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L1;
              } else {
                var5 = ((ao) this).field_w[var4];
                if (var5 != null) {
                  L3: {
                    var6 = param1.field_w[var4];
                    stackOut_8_0 = (ip) var5;
                    stackOut_8_1 = 0;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (var6 == null) {
                      param1.field_w[var4] = new ip();
                      stackOut_10_0 = (ip) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = new ip();
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      break L3;
                    } else {
                      stackOut_9_0 = (ip) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (ip) var6;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      break L3;
                    }
                  }
                  ((ip) (Object) stackIn_11_0).a(stackIn_11_1 != 0, (ip) (Object) stackIn_11_2);
                  var4++;
                  continue L2;
                } else {
                  param1.field_w[var4] = null;
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            vm.a((Object[]) (Object) ((ao) this).field_w, 0, (Object[]) (Object) param1.field_w, 0, 6);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Tonics to strengthen your troops.";
        field_x = "Portals can only be made on open ground";
    }
}
