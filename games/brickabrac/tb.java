/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends bj {
    private boolean field_hb;
    private String field_jb;
    static int field_fb;
    private boolean field_gb;
    private cr field_bb;
    private String field_ib;
    static String field_eb;
    static String field_db;
    static String field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1 ^ 0, param2);
        wm.field_a.b(((tb) this).field_jb, param0 - -(((tb) this).field_t >> 98628481), param2 - -103, 16777215, -1);
        if (param1 != 274) {
          L0: {
            ((tb) this).field_gb = false;
            if (((tb) this).field_ib != null) {
              lb.c(20 + param0, 120 + param2 - 7, 260, 8421504);
              int discarded$2 = wm.field_a.a(((tb) this).field_ib, param0 - -20, 8 + param2 - -120, 260, 100, 16777215, -1, 1, 0, wm.field_a.field_F);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((tb) this).field_ib != null) {
              lb.c(20 + param0, 120 + param2 - 7, 260, 8421504);
              int discarded$3 = wm.field_a.a(((tb) this).field_ib, param0 - -20, 8 + param2 - -120, 260, 100, 16777215, -1, 1, 0, wm.field_a.field_F);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static mb a(int param0, int param1, mf param2, mf param3, int param4) {
        if (param0 > 111) {
          if (!ln.a(-104, param4, param2, param1)) {
            return null;
          } else {
            return jm.a(param3.a(param4, param1, 4), (byte) -14);
          }
        } else {
          field_fb = -88;
          if (!ln.a(-104, param4, param2, param1)) {
            return null;
          } else {
            return jm.a(param3.a(param4, param1, 4), (byte) -14);
          }
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        var4 = param1.length();
        var5 = param3.length();
        var6 = param0.length();
        if (var5 != 0) {
          var7 = var4;
          if (param2) {
            var8 = var6 - var5;
            if (var8 != 0) {
              var9_int = 0;
              L0: while (true) {
                var9_int = param1.indexOf(param3, var9_int);
                if (0 <= var9_int) {
                  var9_int = var9_int + var5;
                  var7 = var7 + var8;
                  continue L0;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L1: while (true) {
                    var11 = param1.indexOf(param3, var10);
                    if ((var11 ^ -1) > -1) {
                      StringBuilder discarded$13 = var9.append(param1.substring(var10));
                      return var9.toString();
                    } else {
                      StringBuilder discarded$14 = var9.append(param1.substring(var10, var11));
                      var10 = var11 + var5;
                      StringBuilder discarded$15 = var9.append(param0);
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L2: while (true) {
                var11 = param1.indexOf(param3, var10);
                if ((var11 ^ -1) > -1) {
                  StringBuilder discarded$16 = var9.append(param1.substring(var10));
                  return var9.toString();
                } else {
                  StringBuilder discarded$17 = var9.append(param1.substring(var10, var11));
                  var10 = var11 + var5;
                  StringBuilder discarded$18 = var9.append(param0);
                  continue L2;
                }
              }
            }
          } else {
            var13 = null;
            mb discarded$19 = tb.a(95, -81, (mf) null, (mf) null, -12);
            var8 = var6 - var5;
            if (var8 != 0) {
              var9_int = 0;
              L3: while (true) {
                var9_int = param1.indexOf(param3, var9_int);
                if (0 <= var9_int) {
                  var9_int = var9_int + var5;
                  var7 = var7 + var8;
                  continue L3;
                } else {
                  var9 = new StringBuilder(var7);
                  var10 = 0;
                  L4: while (true) {
                    var11 = param1.indexOf(param3, var10);
                    if ((var11 ^ -1) > -1) {
                      StringBuilder discarded$20 = var9.append(param1.substring(var10));
                      return var9.toString();
                    } else {
                      StringBuilder discarded$21 = var9.append(param1.substring(var10, var11));
                      var10 = var11 + var5;
                      StringBuilder discarded$22 = var9.append(param0);
                      continue L4;
                    }
                  }
                }
              }
            } else {
              var9 = new StringBuilder(var7);
              var10 = 0;
              L5: while (true) {
                var11 = param1.indexOf(param3, var10);
                if ((var11 ^ -1) > -1) {
                  StringBuilder discarded$23 = var9.append(param1.substring(var10));
                  return var9.toString();
                } else {
                  StringBuilder discarded$24 = var9.append(param1.substring(var10, var11));
                  var10 = var11 + var5;
                  StringBuilder discarded$25 = var9.append(param0);
                  continue L5;
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException("Key cannot have zero length");
        }
    }

    final void a(float param0, String param1, boolean param2, byte param3) {
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackOut_0_0;
        boolean stackOut_2_0;
        int stackOut_2_1;
        boolean stackOut_1_0;
        int stackOut_1_1;
        Object stackOut_8_0;
        Object stackOut_10_0;
        int stackOut_10_1;
        Object stackOut_9_0;
        int stackOut_9_1;
        L0: {
          stackOut_0_0 = ((tb) this).field_hb;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param2) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
          L1: {
            stackOut_8_0 = this;
            stackIn_10_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (!param2) {
              stackOut_10_0 = this;
              stackOut_10_1 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L1;
            } else {
              stackOut_9_0 = this;
              stackOut_9_1 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              break L1;
            }
          }
          ((tb) this).field_hb = stackIn_11_1 != 0;
          if (((tb) this).field_hb) {
            ((tb) this).field_bb.b(8405024, 4210752, 2);
            ((tb) this).field_bb.field_J = true;
            ((tb) this).field_bb.field_L = (int)(param0 / 100.0f * 65536.0f);
            if (param3 != 86) {
              return;
            } else {
              ((tb) this).field_jb = param1;
              return;
            }
          } else {
            ((tb) this).field_bb.b(2113632, 4210752, param3 + -84);
            if (!((tb) this).field_gb) {
              ((tb) this).field_bb.field_L = (int)(param0 / 100.0f * 65536.0f);
              if (param3 != 86) {
                return;
              } else {
                ((tb) this).field_jb = param1;
                return;
              }
            } else {
              ((tb) this).field_bb.field_J = false;
              ((tb) this).field_bb.field_L = (int)(param0 / 100.0f * 65536.0f);
              if (param3 != 86) {
                return;
              } else {
                ((tb) this).field_jb = param1;
                return;
              }
            }
          }
        } else {
          ((tb) this).field_bb.field_L = (int)(param0 / 100.0f * 65536.0f);
          if (param3 != 86) {
            return;
          } else {
            ((tb) this).field_jb = param1;
            return;
          }
        }
    }

    final void l(int param0) {
        if (param0 != 6457) {
          ((tb) this).l(88);
          ((tb) this).field_bb.field_J = false;
          ((tb) this).field_gb = true;
          return;
        } else {
          ((tb) this).field_bb.field_J = false;
          ((tb) this).field_gb = true;
          return;
        }
    }

    tb(cp param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((tb) this).field_ib = param1;
        if (null != ((tb) this).field_ib) {
            var3 = wm.field_a.b(((tb) this).field_ib, 260, wm.field_a.field_F);
            ((tb) this).a(true, 150 - -var3, 300);
        }
        ((tb) this).field_bb = new cr(13, 50, 274, 30, 15, 2113632, 4210752);
        ((tb) this).field_hb = false;
        ((tb) this).field_gb = false;
        ((tb) this).field_bb.field_J = true;
        ((tb) this).a((oc) (Object) ((tb) this).field_bb, true);
    }

    public static void m(int param0) {
        field_cb = null;
        field_db = null;
        if (param0 > -26) {
            field_db = null;
            field_eb = null;
            return;
        }
        field_eb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = "Catch this with your paddle.<br><br>A positive power-up is worth 100 points and will help you. A negative one will hinder you, but is worth 500 points!";
        field_fb = 0;
    }
}
