/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private cn field_l;
    private bl field_f;
    static String field_h;
    private int field_c;
    static String field_b;
    static gm field_e;
    static c field_k;
    static int field_m;
    static int field_d;
    private int field_g;
    static km field_i;
    static c field_j;
    static long field_a;

    private final void a(int param0, Object param1, int param2, long param3) {
        el var6 = null;
        cm var6_ref = null;
        int var7 = 0;
        var7 = Chess.field_G;
        if (param0 <= ((v) this).field_g) {
          this.a(param3, (byte) 91);
          ((v) this).field_c = ((v) this).field_c - param0;
          if (param2 == -10043) {
            L0: while (true) {
              if (((v) this).field_c >= 0) {
                var6 = new el(param1, param0);
                ((v) this).field_f.a((o) (Object) var6, param3, 31313);
                ((v) this).field_l.a((l) (Object) var6, false);
                ((cm) (Object) var6).field_l = 0L;
                return;
              } else {
                var6_ref = (cm) (Object) ((v) this).field_l.c(-14336);
                this.a(1, var6_ref);
                continue L0;
              }
            }
          } else {
            return;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final void a(int param0, cm param1) {
        Object var4 = null;
        L0: {
          if (param1 != null) {
            param1.c(-2193);
            param1.d(param0 + -2);
            ((v) this).field_c = ((v) this).field_c + param1.field_q;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          return;
        } else {
          var4 = null;
          this.a(-33, (cm) null);
          return;
        }
    }

    v(int param0) {
        this(param0, param0);
    }

    final Object a(byte param0, long param1) {
        Object var5 = null;
        el var6 = null;
        cm var7 = null;
        var7 = (cm) (Object) ((v) this).field_f.a(param1, (byte) -127);
        if (var7 != null) {
          var5 = var7.f(param0 + 67);
          if (var5 == null) {
            var7.c(param0 + -2116);
            var7.d(-1);
            ((v) this).field_c = ((v) this).field_c + var7.field_q;
            return null;
          } else {
            if (param0 != -77) {
              return null;
            } else {
              L0: {
                if (var7.g(-113)) {
                  var6 = new el(var5, var7.field_q);
                  ((v) this).field_f.a((o) (Object) var6, var7.field_e, 31313);
                  ((v) this).field_l.a((l) (Object) var6, false);
                  ((cm) (Object) var6).field_l = 0L;
                  var7.c(-2193);
                  var7.d(-1);
                  break L0;
                } else {
                  ((v) this).field_l.a((l) (Object) var7, false);
                  var7.field_l = 0L;
                  break L0;
                }
              }
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_i = null;
        field_e = null;
        field_h = null;
        field_j = null;
        if (param0 >= -87) {
            return;
        }
        field_k = null;
    }

    private v(int param0, int param1) {
        int var3 = 0;
        ((v) this).field_l = new cn();
        ((v) this).field_g = param0;
        ((v) this).field_c = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (var3 < param1) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((v) this).field_f = new bl(var3);
            }
          } else {
            ((v) this).field_f = new bl(var3);
          }
        }
    }

    private final void a(long param0, byte param1) {
        Object var4 = null;
        Object var5 = null;
        cm var6 = null;
        var4 = null;
        if (param1 <= 55) {
          var5 = null;
          this.a(-68, (cm) null);
          var6 = (cm) (Object) ((v) this).field_f.a(param0, (byte) 112);
          this.a(1, var6);
          return;
        } else {
          var6 = (cm) (Object) ((v) this).field_f.a(param0, (byte) 112);
          this.a(1, var6);
          return;
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = Chess.field_G;
        vl.field_A = kn.field_D;
        if (param0 == 31689) {
          if (-256 != param1) {
            if (100 <= param1) {
              if (param1 <= 105) {
                var8 = param3;
                jc.a((byte) 111, var8);
                kf.field_j = a.a(param3, -101);
                return;
              } else {
                kf.field_j = sc.a(param2, param1, (byte) 113);
                return;
              }
            } else {
              kf.field_j = sc.a(param2, param1, (byte) 113);
              return;
            }
          } else {
            L0: {
              stackOut_14_0 = param0 ^ 13172;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (-14 <= cn.field_f) {
                stackOut_16_0 = stackIn_16_0;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L0;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L0;
              }
            }
            kf.field_j = cf.b(stackIn_17_0, stackIn_17_1 != 0);
            var6 = null;
            jc.a((byte) 98, (String[]) null);
            return;
          }
        } else {
          field_e = null;
          if (-256 != param1) {
            if (100 <= param1) {
              if (param1 <= 105) {
                var7 = param3;
                jc.a((byte) 111, var7);
                kf.field_j = a.a(param3, -101);
                return;
              } else {
                kf.field_j = sc.a(param2, param1, (byte) 113);
                return;
              }
            } else {
              kf.field_j = sc.a(param2, param1, (byte) 113);
              return;
            }
          } else {
            L1: {
              stackOut_2_0 = param0 ^ 13172;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (-14 <= cn.field_f) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L1;
              }
            }
            kf.field_j = cf.b(stackIn_5_0, stackIn_5_1 != 0);
            var6 = null;
            jc.a((byte) 98, (String[]) null);
            return;
          }
        }
    }

    final void a(long param0, int param1, Object param2) {
        this.a(param1, param2, -10043, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = 0;
        field_d = 2;
        field_h = "Email address is unavailable";
    }
}
