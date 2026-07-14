/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends gg implements nk {
    static String field_j;
    static int field_l;
    static String field_k;
    private c field_m;

    public final void a(int param0, c param1) {
        if (param0 != -31825) {
            String discarded$0 = ((r) this).b((byte) 39);
        }
    }

    final static void a(dd param0, int param1) {
        we.a(-68);
        if (param1 != 45) {
          field_l = 45;
          gb.a(param0.field_B, param0.field_x, param0.field_r);
          return;
        } else {
          gb.a(param0.field_B, param0.field_x, param0.field_r);
          return;
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 0) {
            Object var2 = null;
            r.a((dd) null, -96);
        }
    }

    public final void b(int param0, c param1) {
        Object var4 = null;
        if (param0 != 40) {
          var4 = null;
          ((r) this).b(-35, (c) null);
          ((r) this).a(param0 ^ -1323);
          return;
        } else {
          ((r) this).a(param0 ^ -1323);
          return;
        }
    }

    final wd a(byte param0) {
        if (param0 != -8) {
          field_k = null;
          return ((r) this).a(160, ((r) this).field_m.field_i);
        } else {
          return ((r) this).a(160, ((r) this).field_m.field_i);
        }
    }

    final String b(byte param0) {
        if (param0 <= 62) {
          field_l = -35;
          return ((r) this).a((byte) 109, ((r) this).field_m.field_i);
        } else {
          return ((r) this).a((byte) 109, ((r) this).field_m.field_i);
        }
    }

    final static kc a(boolean param0, long param1, byte param2, String param3, String param4) {
        Object var7 = null;
        if (param1 != 0L) {
          if (!param0) {
            if (param2 != 84) {
              var7 = null;
              r.a((dd) null, -52);
              return (kc) (Object) new ef(param1, param4);
            } else {
              return (kc) (Object) new ef(param1, param4);
            }
          } else {
            return (kc) (Object) new rg(param1, param4);
          }
        } else {
          if (param3 == null) {
            if (!param0) {
              if (param2 == 84) {
                return (kc) (Object) new ef(param1, param4);
              } else {
                var7 = null;
                r.a((dd) null, -52);
                return (kc) (Object) new ef(param1, param4);
              }
            } else {
              return (kc) (Object) new rg(param1, param4);
            }
          } else {
            return (kc) (Object) new rj(param3, param4);
          }
        }
    }

    abstract wd a(int param0, String param1);

    public final boolean b(boolean param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((r) this).field_m.field_i) {
            if (((r) this).field_m.field_i.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    abstract String a(byte param0, String param1);

    r(c param0) {
        ((r) this).field_m = param0;
    }

    final static boolean a(char param0, int param1) {
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = 45 / ((7 - param1) / 50);
        if (param0 != 160) {
          if (param0 != 32) {
            if (param0 != 95) {
              if (param0 == 45) {
                return true;
              } else {
                return false;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "This game has been updated! Please reload this page.";
        field_k = "Continue";
    }
}
