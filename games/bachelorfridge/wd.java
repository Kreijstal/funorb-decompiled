/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gha {
    private tc[] field_u;
    private tc field_y;
    static int[] field_x;
    static eaa field_t;
    static sna field_v;
    static kv[] field_w;

    wd(wd param0, boolean param1) {
        this();
        param0.a((wd) this, (byte) 110, param1);
    }

    final void a(int param0, int param1, kv[] param2) {
        int var4 = param0;
        if (param1 <= 62) {
            field_t = null;
        }
        if (!(null != ((wd) this).field_u[var4])) {
            ((wd) this).field_u[var4] = new tc();
        }
        ((wd) this).field_u[param0].field_c = param2;
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        tc var7 = null;
        tc var9 = null;
        hf var10 = null;
        tc var11 = null;
        tc var12 = null;
        tc var13 = null;
        tc var14 = null;
        wj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        wj stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof hf)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (wj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (wj) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (hf) (Object) stackIn_3_0;
          ah.a(param0 + param1.field_s + param1.field_p, (byte) 110, param3 + param1.field_v, param0 - -param1.field_s, param1.field_q + param3 + param1.field_v);
          if (var10 == null) {
            break L1;
          } else {
            param4 = param4 & var10.field_z;
            break L1;
          }
        }
        var7 = ((wd) this).field_u[0];
        if (param2 == 32679) {
          L2: {
            ((wd) this).field_y.a(11);
            var7.a((wd) this, param0, param1, (byte) -105, ((wd) this).field_y, param3);
            if (var10 == null) {
              break L2;
            } else {
              L3: {
                if (!var10.field_B) {
                  break L3;
                } else {
                  var11 = ((wd) this).field_u[1];
                  if (var11 == null) {
                    break L3;
                  } else {
                    var11.a((wd) this, param0, param1, (byte) -58, ((wd) this).field_y, param3);
                    break L3;
                  }
                }
              }
              if (var10.field_t) {
                L4: {
                  var12 = ((wd) this).field_u[3];
                  if (var10.field_u == 0) {
                    break L4;
                  } else {
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a((wd) this, param0, param1, (byte) -60, ((wd) this).field_y, param3);
                      break L2;
                    }
                  }
                }
                var9 = ((wd) this).field_u[2];
                if (var9 != null) {
                  var9.a((wd) this, param0, param1, (byte) -58, ((wd) this).field_y, param3);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (!param1.e(1023)) {
              break L5;
            } else {
              var13 = ((wd) this).field_u[5];
              if (var13 != null) {
                var13.a((wd) this, param0, param1, (byte) -124, ((wd) this).field_y, param3);
                break L5;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (param4) {
              break L6;
            } else {
              var14 = ((wd) this).field_u[4];
              if (var14 == null) {
                break L6;
              } else {
                var14.a((wd) this, param0, param1, (byte) 74, ((wd) this).field_y, param3);
                break L6;
              }
            }
          }
          ((wd) this).field_y.a(param3, (wd) this, param1, param2 + -32752, param0);
          db.b(83);
          return;
        } else {
          return;
        }
    }

    final tc a(int param0, byte param1) {
        if (param1 != 78) {
            Object var4 = null;
            wd.a((byte) -9, (java.awt.Canvas) null);
        }
        ((wd) this).field_u[param0] = new tc();
        return new tc();
    }

    public static void c(int param0) {
        field_w = null;
        field_x = null;
        field_v = null;
        field_t = null;
        if (param0 != 1) {
            Object var2 = null;
            wd.a((java.math.BigInteger) null, (byte) 93, (lu) null, (lu) null, (java.math.BigInteger) null);
        }
    }

    private final void a(wd param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        tc var6 = null;
        tc var7 = null;
        int var8 = 0;
        tc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        tc stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        tc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        tc stackIn_7_2 = null;
        tc stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        tc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        tc stackOut_6_2 = null;
        tc stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        tc stackOut_5_2 = null;
        L0: {
          var8 = BachelorFridge.field_y;
          var4 = 99 / ((param1 - 76) / 34);
          this.a(-85, (gha) (Object) param0);
          if (!param2) {
            bl.a((Object[]) (Object) ((wd) this).field_u, 0, (Object[]) (Object) param0.field_u, 0, 6);
            break L0;
          } else {
            var5 = 0;
            L1: while (true) {
              if (-7 >= (var5 ^ -1)) {
                break L0;
              } else {
                var6 = ((wd) this).field_u[var5];
                if (var6 == null) {
                  param0.field_u[var5] = null;
                  var5++;
                  continue L1;
                } else {
                  L2: {
                    var7 = param0.field_u[var5];
                    stackOut_4_0 = (tc) var6;
                    stackOut_4_1 = 8;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var7 == null) {
                      param0.field_u[var5] = new tc();
                      stackOut_6_0 = (tc) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = new tc();
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (tc) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = (tc) var7;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((tc) (Object) stackIn_7_0).a(stackIn_7_1, (tc) (Object) stackIn_7_2);
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(kv param0, int param1) {
        tc[] var3 = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        tc[] var7 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param1 < -73) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        var7 = ((wd) this).field_u;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    public wd() {
        ((wd) this).field_u = new tc[6];
        ((wd) this).field_y = new tc();
        ((wd) this).field_u[0] = new tc();
        tc var1 = new tc();
        var1.a(11);
    }

    final static void a(java.math.BigInteger param0, byte param1, lu param2, lu param3, java.math.BigInteger param4) {
        fn.a((byte) -68, 0, param0, param4, param2, param3.field_h, param3.field_g);
        if (param1 >= -50) {
            wd.c(36);
        }
    }

    final void a(byte param0, kv[] param1) {
        tc[] var3 = null;
        int var4 = 0;
        tc var5 = null;
        int var6 = 0;
        Object var7 = null;
        tc[] var8 = null;
        var6 = BachelorFridge.field_y;
        var8 = ((wd) this).field_u;
        var3 = var8;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var8.length) {
            L1: {
              if (param0 == 95) {
                break L1;
              } else {
                var7 = null;
                wd.a((byte) -81, (java.awt.Canvas) null);
                break L1;
              }
            }
            return;
          } else {
            var5 = var8[var4];
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

    final static void a(byte param0, java.awt.Canvas param1) {
        hl.a((byte) -67, (java.awt.Component) (Object) param1);
        gda.a(-99, (java.awt.Component) (Object) param1);
        if (param0 != 70) {
            field_w = null;
        }
        if (!(sd.field_c == null)) {
            sd.field_c.a((java.awt.Component) (Object) param1, true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new int[128];
        field_t = new eaa();
    }
}
