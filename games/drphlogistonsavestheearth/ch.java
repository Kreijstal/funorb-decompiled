/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch extends l {
    static int field_y;
    private kj[] field_v;
    static String field_t;
    static String field_u;
    static int field_B;
    private kj field_x;
    static nh[] field_z;
    static String field_w;
    static int field_A;

    public static void b(byte param0) {
        field_z = null;
        field_u = null;
        field_w = null;
        if (param0 <= 69) {
            field_t = null;
        }
        field_t = null;
    }

    final void a(int param0, nh[] param1) {
        kj[] var3 = null;
        int var4 = 0;
        kj var5 = null;
        int var6 = 0;
        kj[] var7 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var7 = ((ch) this).field_v;
        var3 = var7;
        var4 = param0;
        L0: while (true) {
          if (var4 >= var7.length) {
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

    final static void c(int param0) {
        sh.field_e = false;
        wg.field_h = null;
        if (param0 != 3) {
            field_B = 33;
        }
        ga.field_i = null;
        ng.field_d = null;
        lk.field_i = null;
    }

    public ch() {
        ((ch) this).field_v = new kj[6];
        ((ch) this).field_x = new kj();
        ((ch) this).field_v[0] = new kj();
        kj var1 = new kj();
        var1.b(0);
    }

    final void a(nh[] param0, int param1, int param2) {
        int var4 = param1;
        if (!(((ch) this).field_v[var4] != null)) {
            ((ch) this).field_v[var4] = new kj();
        }
        if (param2 < 116) {
            field_t = null;
        }
        ((ch) this).field_v[param1].field_c = param0;
    }

    ch(ch param0, boolean param1) {
        this();
        param0.a((ch) this, param1, 28905);
    }

    final kj a(byte param0, int param1) {
        if (param0 <= 54) {
            ((ch) this).field_v = null;
        }
        ((ch) this).field_v[param1] = new kj();
        return new kj();
    }

    final void a(int param0, nh param1) {
        kj[] var3 = null;
        int var4 = 0;
        kj var5 = null;
        int var6 = 0;
        Object var7 = null;
        kj[] var8 = null;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var8 = ((ch) this).field_v;
          var3 = var8;
          if (param0 == -32680) {
            break L0;
          } else {
            var7 = null;
            this.a((ch) null, false, 11);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_e = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        kj var7 = null;
        kj var9 = null;
        Object var10 = null;
        hf var11 = null;
        kj var12 = null;
        kj var13 = null;
        kj var14 = null;
        kj var15 = null;
        vg stackIn_3_0 = null;
        vg stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param2 instanceof hf) {
            stackOut_2_0 = (vg) param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (vg) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (hf) (Object) stackIn_3_0;
          ib.a(param3 - -param2.field_m, param2.field_m + (param3 - -param2.field_k), (byte) 16, param4 + param2.field_o + param2.field_w, param4 - -param2.field_o);
          if (var11 == null) {
            break L1;
          } else {
            param0 = param0 & var11.field_E;
            break L1;
          }
        }
        L2: {
          var7 = ((ch) this).field_v[0];
          ((ch) this).field_x.b(0);
          var7.a(param4, (ch) this, true, param3, param2, ((ch) this).field_x);
          if (var11 != null) {
            L3: {
              if (!var11.field_A) {
                break L3;
              } else {
                var12 = ((ch) this).field_v[1];
                if (var12 == null) {
                  break L3;
                } else {
                  var12.a(param4, (ch) this, true, param3, param2, ((ch) this).field_x);
                  break L3;
                }
              }
            }
            if (!var11.field_n) {
              break L2;
            } else {
              L4: {
                var13 = ((ch) this).field_v[3];
                if (var11.field_y == 0) {
                  break L4;
                } else {
                  if (var13 != null) {
                    var13.a(param4, (ch) this, true, param3, param2, ((ch) this).field_x);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var9 = ((ch) this).field_v[2];
              if (var9 != null) {
                var9.a(param4, (ch) this, true, param3, param2, ((ch) this).field_x);
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          if (!param2.a(true)) {
            break L5;
          } else {
            var14 = ((ch) this).field_v[5];
            if (var14 == null) {
              break L5;
            } else {
              var14.a(param4, (ch) this, true, param3, param2, ((ch) this).field_x);
              break L5;
            }
          }
        }
        L6: {
          if (param0) {
            break L6;
          } else {
            var15 = ((ch) this).field_v[4];
            if (var15 != null) {
              var15.a(param4, (ch) this, true, param3, param2, ((ch) this).field_x);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L7: {
          ((ch) this).field_x.a((ch) this, param2, true, param3, param4);
          if (param1 > 94) {
            break L7;
          } else {
            var10 = null;
            ((ch) this).a((nh[]) null, -43, 125);
            break L7;
          }
        }
        cl.d((byte) -110);
    }

    private final void a(ch param0, boolean param1, int param2) {
        int var4 = 0;
        kj var5 = null;
        kj var6 = null;
        int var7 = 0;
        kj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kj stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kj stackIn_9_2 = null;
        kj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        kj stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        kj stackOut_8_2 = null;
        kj stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kj stackOut_7_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        super.a((l) (Object) param0, 117);
        if (param2 == 28905) {
          L0: {
            if (!param1) {
              kg.a((Object[]) (Object) ((ch) this).field_v, 0, (Object[]) (Object) param0.field_v, 0, 6);
              break L0;
            } else {
              var4 = 0;
              L1: while (true) {
                if ((var4 ^ -1) <= -7) {
                  break L0;
                } else {
                  var5 = ((ch) this).field_v[var4];
                  if (var5 == null) {
                    param0.field_v[var4] = null;
                    var4++;
                    continue L1;
                  } else {
                    L2: {
                      var6 = param0.field_v[var4];
                      stackOut_6_0 = (kj) var5;
                      stackOut_6_1 = -7;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var6 == null) {
                        param0.field_v[var4] = new kj();
                        stackOut_8_0 = (kj) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackOut_8_2 = new kj();
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        stackIn_9_2 = stackOut_8_2;
                        break L2;
                      } else {
                        stackOut_7_0 = (kj) (Object) stackIn_7_0;
                        stackOut_7_1 = stackIn_7_1;
                        stackOut_7_2 = (kj) var6;
                        stackIn_9_0 = stackOut_7_0;
                        stackIn_9_1 = stackOut_7_1;
                        stackIn_9_2 = stackOut_7_2;
                        break L2;
                      }
                    }
                    ((kj) (Object) stackIn_9_0).a((byte) stackIn_9_1, stackIn_9_2);
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Suggested names: ";
        field_u = "Type your password again to make sure it's correct";
        field_w = "Select weapon";
    }
}
