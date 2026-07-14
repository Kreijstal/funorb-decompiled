/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends ana {
    static kv field_v;
    static wba field_x;
    private lca field_A;
    static kv field_y;
    static sna field_z;
    static int field_w;

    final boolean c(byte param0) {
        int var2 = 0;
        ((bna) this).field_l = ((bna) this).field_l - 1;
        if (-1 >= (((bna) this).field_l - 1 ^ -1)) {
          if (((bna) this).field_l == 25) {
            this.e((byte) -86);
            return false;
          } else {
            return false;
          }
        } else {
          var2 = -58 / ((71 - param0) / 47);
          this.f((byte) -85);
          return true;
        }
    }

    public static void d(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 11 % ((param0 - 66) / 32);
        field_y = null;
    }

    bna(gj param0, lca param1) {
        super(param0, (bca) (Object) param1);
        ((bna) this).field_A = param1;
    }

    final static nea b(int param0, String param1) {
        String var2 = null;
        Object var3 = null;
        nea var3_ref = null;
        int var5 = 0;
        Object var6 = null;
        String var7 = null;
        String var8 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = BachelorFridge.field_y;
        if (null != wja.field_m) {
          if (param1 != null) {
            if (param1.length() != 0) {
              var11 = (CharSequence) (Object) param1;
              var2 = fq.a(0, var11);
              if (var2 != null) {
                if (param0 <= -19) {
                  var3_ref = (nea) (Object) wja.field_m.a((long)var2.hashCode(), (byte) -87);
                  L0: while (true) {
                    if (var3_ref != null) {
                      var12 = (CharSequence) (Object) var3_ref.field_xb;
                      var7 = fq.a(0, var12);
                      if (var7.equals((Object) (Object) var2)) {
                        return var3_ref;
                      } else {
                        var3_ref = (nea) (Object) wja.field_m.a((byte) -31);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  var6 = null;
                  boolean discarded$1 = bna.a((byte) -52, (String) null);
                  var3_ref = (nea) (Object) wja.field_m.a((long)var2.hashCode(), (byte) -87);
                  L1: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_xb;
                      var8 = fq.a(0, var13);
                      if (var8.equals((Object) (Object) var2)) {
                        return var3_ref;
                      } else {
                        var3_ref = (nea) (Object) wja.field_m.a((byte) -31);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
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
    }

    private final void e(byte param0) {
        if (param0 >= -69) {
          field_v = null;
          boolean discarded$4 = dha.a(-108, (bca) (Object) ((bna) this).field_A, ((bna) this).field_q);
          return;
        } else {
          boolean discarded$5 = dha.a(-108, (bca) (Object) ((bna) this).field_A, ((bna) this).field_q);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = -50 / ((13 - param0) / 40);
    }

    final static kv[] a(int param0, vr param1, int param2, int param3) {
        if (g.a(param0, param3, -30744, param1)) {
          if (param2 >= -20) {
            field_x = null;
            return vma.c(22);
          } else {
            return vma.c(22);
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0, String param1) {
        Object var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 5) {
          L0: {
            var3 = null;
            nea discarded$6 = bna.b(65, (String) null);
            if (null == di.a(param1, -125)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null == di.a(param1, -125)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new wba(2);
    }
}
