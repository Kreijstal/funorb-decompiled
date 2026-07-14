/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends gm {
    private sm field_t;
    static String field_s;
    static int field_p;
    static int field_n;
    static byte[][] field_o;
    private sm[] field_q;
    static ri[] field_r;

    public static void b(int param0) {
        field_r = null;
        if (param0 != 0) {
            field_s = null;
        }
        field_o = null;
        field_s = null;
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4 = 0;
        if (!(!param2)) {
            var4 += 4;
        }
        if (!(!param1)) {
            var4 += 2;
        }
        if (param3 != 63) {
            field_n = 124;
        }
        if (!(!param0)) {
            var4++;
        }
        return pl.field_r[var4];
    }

    fl(fl param0, boolean param1) {
        this();
        param0.a((fl) this, param1, -26407);
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        sm var7 = null;
        sm var9 = null;
        Object var10 = null;
        wp var11 = null;
        sm var12 = null;
        sm var13 = null;
        sm var14 = null;
        sm var15 = null;
        pk stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof wp)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (pk) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (pk) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (wp) (Object) stackIn_3_0;
          kw.a(param1 - -param0.field_v + param0.field_p, param1 - -param0.field_v, 1, param4 - -param0.field_r, param0.field_r + (param4 - -param0.field_q));
          if (var11 != null) {
            param3 = param3 & var11.field_x;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((fl) this).field_q[0];
          ((fl) this).field_t.a(true);
          var7.a(param4, param0, -28, (fl) this, param1, ((fl) this).field_t);
          if (var11 != null) {
            L3: {
              if (!var11.field_C) {
                break L3;
              } else {
                var12 = ((fl) this).field_q[1];
                if (var12 != null) {
                  var12.a(param4, param0, -75, (fl) this, param1, ((fl) this).field_t);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (!var11.field_k) {
              break L2;
            } else {
              L4: {
                var13 = ((fl) this).field_q[3];
                if (-1 == (var11.field_l ^ -1)) {
                  break L4;
                } else {
                  if (var13 == null) {
                    break L4;
                  } else {
                    var13.a(param4, param0, param2 ^ -5592346, (fl) this, param1, ((fl) this).field_t);
                    break L2;
                  }
                }
              }
              var9 = ((fl) this).field_q[2];
              if (var9 != null) {
                var9.a(param4, param0, -97, (fl) this, param1, ((fl) this).field_t);
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
          if (param2 == 5592405) {
            break L5;
          } else {
            var10 = null;
            ((fl) this).a((wb[]) null, -110);
            break L5;
          }
        }
        L6: {
          if (param0.d(-1)) {
            var14 = ((fl) this).field_q[5];
            if (var14 == null) {
              break L6;
            } else {
              var14.a(param4, param0, param2 ^ -5592417, (fl) this, param1, ((fl) this).field_t);
              break L6;
            }
          } else {
            break L6;
          }
        }
        L7: {
          if (!param3) {
            var15 = ((fl) this).field_q[4];
            if (var15 != null) {
              var15.a(param4, param0, -66, (fl) this, param1, ((fl) this).field_t);
              break L7;
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        ((fl) this).field_t.a(param1, (fl) this, param4, -66, param0);
        su.a((byte) -70);
    }

    private final void a(fl param0, boolean param1, int param2) {
        int var4 = 0;
        sm var5 = null;
        sm var6 = null;
        int var7 = 0;
        sm stackIn_8_0 = null;
        sm stackIn_9_0 = null;
        sm stackIn_10_0 = null;
        sm stackIn_10_1 = null;
        sm stackOut_7_0 = null;
        sm stackOut_9_0 = null;
        sm stackOut_9_1 = null;
        sm stackOut_8_0 = null;
        sm stackOut_8_1 = null;
        L0: {
          var7 = Sumoblitz.field_L ? 1 : 0;
          super.a((gm) (Object) param0, -123);
          if (param2 == -26407) {
            break L0;
          } else {
            field_p = -38;
            break L0;
          }
        }
        L1: {
          if (param1) {
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -7) {
                break L1;
              } else {
                var5 = ((fl) this).field_q[var4];
                if (var5 == null) {
                  param0.field_q[var4] = null;
                  var4++;
                  continue L2;
                } else {
                  L3: {
                    var6 = param0.field_q[var4];
                    stackOut_7_0 = (sm) var5;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var6 == null) {
                      param0.field_q[var4] = new sm();
                      stackOut_9_0 = (sm) (Object) stackIn_9_0;
                      stackOut_9_1 = new sm();
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L3;
                    } else {
                      stackOut_8_0 = (sm) (Object) stackIn_8_0;
                      stackOut_8_1 = (sm) var6;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L3;
                    }
                  }
                  ((sm) (Object) stackIn_10_0).a(stackIn_10_1, (byte) 94);
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            la.a((Object[]) (Object) ((fl) this).field_q, 0, (Object[]) (Object) param0.field_q, 0, 6);
            break L1;
          }
        }
    }

    public fl() {
        ((fl) this).field_q = new sm[6];
        ((fl) this).field_t = new sm();
        ((fl) this).field_q[0] = new sm();
        sm var1 = new sm();
        var1.a(true);
    }

    final void a(wb[] param0, int param1) {
        sm[] var3 = null;
        int var4 = 0;
        sm var5 = null;
        int var6 = 0;
        sm[] var7 = null;
        L0: {
          var6 = Sumoblitz.field_L ? 1 : 0;
          var7 = ((fl) this).field_q;
          var3 = var7;
          if (param1 == 28715) {
            break L0;
          } else {
            sm discarded$2 = ((fl) this).a(false, 37);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, wb param1) {
        sm[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        sm var6 = null;
        int var7 = 0;
        sm[] var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = ((fl) this).field_q;
        var3 = var8;
        var4 = -50 % ((param0 - 68) / 36);
        var5 = 0;
        L0: while (true) {
          if (var5 >= var8.length) {
            return;
          } else {
            var6 = var8[var5];
            if (var6 != null) {
              var6.field_i = param1;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final sm a(boolean param0, int param1) {
        if (param0) {
            Object var4 = null;
            ((fl) this).a((byte) -126, (wb[]) null, -97);
        }
        ((fl) this).field_q[param1] = new sm();
        return new sm();
    }

    final void a(byte param0, wb[] param1, int param2) {
        int var4 = param2;
        if (!(null != ((fl) this).field_q[var4])) {
            ((fl) this).field_q[var4] = new sm();
        }
        ((fl) this).field_q[param2].field_j = param1;
        var4 = -9 % ((param0 - 57) / 52);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Waiting for extra data";
        field_n = 0;
        field_p = -1;
    }
}
