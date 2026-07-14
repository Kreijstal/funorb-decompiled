/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String[] field_a;
    private int field_d;
    private int field_e;
    static char[] field_f;
    float field_j;
    private bl[] field_i;
    static int field_g;
    static int field_h;
    private int field_c;
    String field_b;

    final boolean a(boolean param0) {
        int var3 = 0;
        bl var5 = null;
        bl var6 = null;
        var3 = DungeonAssault.field_K;
        if (param0) {
          int discarded$1 = wk.a(73, -60);
          L0: while (true) {
            if (((wk) this).field_e > ((wk) this).field_d) {
              var6 = ((wk) this).field_i[((wk) this).field_d];
              if (!var6.field_q.a(-14354)) {
                this.a((byte) 12, 0, var6);
                return false;
              } else {
                L1: {
                  if (0 > var6.field_m) {
                    break L1;
                  } else {
                    if (!var6.field_q.a(false, var6.field_m)) {
                      this.a((byte) 12, var6.field_q.c(-123, var6.field_m), var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (var6.field_h == null) {
                    break L2;
                  } else {
                    if (!var6.field_q.a(false, var6.field_h)) {
                      this.a((byte) 12, var6.field_q.b(var6.field_h, -1), var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6.field_m >= 0) {
                    break L3;
                  } else {
                    if (var6.field_h != null) {
                      break L3;
                    } else {
                      if (null == var6.field_f) {
                        break L3;
                      } else {
                        if (!var6.field_q.a((byte) 59)) {
                          this.a((byte) 12, var6.field_q.b(100), var6);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((wk) this).field_d = ((wk) this).field_d + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (((wk) this).field_e > ((wk) this).field_d) {
              var5 = ((wk) this).field_i[((wk) this).field_d];
              if (!var5.field_q.a(-14354)) {
                this.a((byte) 12, 0, var5);
                return false;
              } else {
                L5: {
                  if (0 > var5.field_m) {
                    break L5;
                  } else {
                    if (!var5.field_q.a(false, var5.field_m)) {
                      this.a((byte) 12, var5.field_q.c(-123, var5.field_m), var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5.field_h == null) {
                    break L6;
                  } else {
                    if (!var5.field_q.a(false, var5.field_h)) {
                      this.a((byte) 12, var5.field_q.b(var5.field_h, -1), var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5.field_m >= 0) {
                    break L7;
                  } else {
                    if (var5.field_h != null) {
                      break L7;
                    } else {
                      if (null == var5.field_f) {
                        break L7;
                      } else {
                        if (!var5.field_q.a((byte) 59)) {
                          this.a((byte) 12, var5.field_q.b(100), var5);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                ((wk) this).field_d = ((wk) this).field_d + 1;
                continue L4;
              }
            } else {
              return true;
            }
          }
        }
    }

    final static void a(int param0, String param1, se param2, int param3, int[] param4, int param5) {
        tf var6 = null;
        if (param5 != 31139) {
          return;
        } else {
          var6 = new tf(param2, param1, param4);
          var6.b(-param2.field_H + param3, 32, -var6.field_i + param0);
          return;
        }
    }

    private final void a(byte param0, int param1, bl param2) {
        float var4 = (float)(((wk) this).field_d + 1) + (float)param1 / 100.0f;
        ((wk) this).field_j = (float)((wk) this).field_c * var4 / (float)(((wk) this).field_e + 1);
        if (param0 != 12) {
            Object var5 = null;
            wk.a(-109, (String) null, (se) null, 89, (int[]) null, -3);
            if (param1 == 0) {
                ((wk) this).field_b = param2.field_g;
            } else {
                ((wk) this).field_b = param2.field_f + " - " + param1 + "%";
                return;
            }
            return;
        }
        if (param1 == 0) {
            ((wk) this).field_b = param2.field_g;
        } else {
            ((wk) this).field_b = param2.field_f + " - " + param1 + "%";
            return;
        }
    }

    public static void b(boolean param0) {
        if (param0) {
            int discarded$0 = wk.a(105, 105);
            field_a = null;
            field_f = null;
            return;
        }
        field_a = null;
        field_f = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
            int discarded$0 = wk.c(true);
            sn.a(66, 17);
            return;
        }
        sn.a(66, 17);
    }

    final static cn[] a(cn[] param0, int param1) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        cn[] var5 = new cn[param0.length];
        cn[] var2 = var5;
        for (var3 = param1; param0.length > var3; var3++) {
            var5[var3] = g.a(param0[var3], (byte) -105);
        }
        return var2;
    }

    final static int c(boolean param0) {
        int var1 = 0;
        int var2 = DungeonAssault.field_K;
        boolean discarded$8 = lg.field_w.a(wo.field_b, (byte) 66, ci.field_m, true);
        lg.field_w.b(true);
        while (ha.b((byte) 47)) {
            boolean discarded$9 = lg.field_w.a(126, mm.field_t, ob.field_Yb);
        }
        if (param0) {
            return 11;
        }
        if (!(0 == (ki.field_f ^ -1))) {
            var1 = ki.field_f;
            sn.a(16, -1);
            return var1;
        }
        if (!(!cd.field_b)) {
            return 3;
        }
        if (wd.field_d == ql.field_f) {
            return 1;
        }
        if (!(im.field_b.b(36))) {
            return 1;
        }
        if (!(ol.field_i != ql.field_f)) {
            return 2;
        }
        return -1;
    }

    private final void a(nh param0, String param1, String param2, boolean param3, int param4, String param5) {
        bl[] var10 = null;
        if (param3) {
            Object var8 = null;
            wk.a(13, (String) null, (se) null, -71, (int[]) null, -117);
        }
        if (!(((wk) this).field_i.length > ((wk) this).field_e)) {
            var10 = new bl[((wk) this).field_e * 2];
            bl[] var7 = var10;
            cj.a((Object[]) (Object) ((wk) this).field_i, 0, (Object[]) (Object) var10, 0, ((wk) this).field_e);
            ((wk) this).field_i = var10;
        }
        bl var9 = new bl();
        bl var11 = var9;
        bl var7_ref = var11;
        var11.field_g = param5;
        var11.field_h = param2;
        var11.field_m = param4;
        var11.field_f = param1;
        var11.field_q = param0;
        ((wk) this).field_e = ((wk) this).field_e + 1;
        ((wk) this).field_i[((wk) this).field_e] = var9;
    }

    final void a(String param0, String param1, String param2, nh param3, int param4) {
        Object var7 = null;
        this.a(param3, param0, param1, false, -1, param2);
        if (param4 < -75) {
          return;
        } else {
          var7 = null;
          cn[] discarded$2 = wk.a((cn[]) null, 114);
          return;
        }
    }

    final void a(String param0, int param1, String param2, nh param3) {
        if (param1 != 237) {
            return;
        }
        this.a(param3, param2, (String) null, false, -1, param0);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (0 == (param0 & 7)) {
            break L0;
          } else {
            var2 = -(param0 & 7) + 8;
            break L0;
          }
        }
        if (param1 != 18605) {
          int discarded$2 = wk.c(true);
          var3 = var2 + param0;
          return var3;
        } else {
          var3 = var2 + param0;
          return var3;
        }
    }

    wk(int param0) {
        ((wk) this).field_i = new bl[16];
        ((wk) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
