/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tv extends jea {
    private jea field_tb;
    jea field_vb;
    static String field_ub;
    static String field_xb;
    static nh field_wb;

    tv(long param0, jea param1, jea param2, jea param3, iu param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((tv) this).field_tb = new jea(0L, param2);
            ((tv) this).field_tb.field_R = param4;
            ((tv) this).b(-124, ((tv) this).field_tb);
        }
        if (param5 != null) {
            ((tv) this).field_vb = new jea(0L, param3, param5);
            ((tv) this).b(-125, ((tv) this).field_vb);
        }
        ((tv) this).a(-10966);
    }

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param2 <= -7) {
          L0: {
            var4 = -param0;
            var5 = -param0;
            if (((tv) this).field_tb != null) {
              var4 = ((tv) this).field_tb.b((byte) 69);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != ((tv) this).field_vb) {
              var5 = ((tv) this).field_vb.a(-param1 + (-var4 + (-param1 + ((tv) this).field_G)) - param0, false);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var6 = param1 + param0 + (var4 + param1) + var5;
            if (var6 <= ((tv) this).field_G) {
              break L2;
            } else {
              var5 = var5 + (((tv) this).field_G - var6);
              var6 = ((tv) this).field_G;
              break L2;
            }
          }
          L3: {
            if (1 == ((tv) this).field_z) {
              param1 = param1 + (-var6 + ((tv) this).field_G) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (2 == ((tv) this).field_z) {
              param1 = param1 + (-var6 + ((tv) this).field_G);
              break L4;
            } else {
              break L4;
            }
          }
          if (null == ((tv) this).field_tb) {
            if (null != ((tv) this).field_vb) {
              ((tv) this).field_vb.a(var5, ((tv) this).field_t, -23776, 0, param0 + param1 - -var4);
              if (((tv) this).field_tb == null) {
                ((tv) this).field_vb.field_z = ((tv) this).field_z;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              } else {
                ((tv) this).field_vb.field_z = 0;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              }
            } else {
              return;
            }
          } else {
            ((tv) this).field_tb.a(var4, ((tv) this).field_t, -23776, 0, param1);
            ((tv) this).field_tb.field_bb = ((tv) this).field_bb;
            if (null != ((tv) this).field_vb) {
              ((tv) this).field_vb.a(var5, ((tv) this).field_t, -23776, 0, param0 + param1 - -var4);
              if (((tv) this).field_tb == null) {
                ((tv) this).field_vb.field_z = ((tv) this).field_z;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              } else {
                ((tv) this).field_vb.field_z = 0;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L5: {
            field_xb = null;
            var4 = -param0;
            var5 = -param0;
            if (((tv) this).field_tb != null) {
              var4 = ((tv) this).field_tb.b((byte) 69);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != ((tv) this).field_vb) {
              var5 = ((tv) this).field_vb.a(-param1 + (-var4 + (-param1 + ((tv) this).field_G)) - param0, false);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var6 = param1 + param0 + (var4 + param1) + var5;
            if (var6 <= ((tv) this).field_G) {
              break L7;
            } else {
              var5 = var5 + (((tv) this).field_G - var6);
              var6 = ((tv) this).field_G;
              break L7;
            }
          }
          L8: {
            if (1 == ((tv) this).field_z) {
              param1 = param1 + (-var6 + ((tv) this).field_G) / 2;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (2 == ((tv) this).field_z) {
              param1 = param1 + (-var6 + ((tv) this).field_G);
              break L9;
            } else {
              break L9;
            }
          }
          if (null != ((tv) this).field_tb) {
            ((tv) this).field_tb.a(var4, ((tv) this).field_t, -23776, 0, param1);
            ((tv) this).field_tb.field_bb = ((tv) this).field_bb;
            if (null != ((tv) this).field_vb) {
              ((tv) this).field_vb.a(var5, ((tv) this).field_t, -23776, 0, param0 + param1 - -var4);
              if (((tv) this).field_tb == null) {
                ((tv) this).field_vb.field_z = ((tv) this).field_z;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              } else {
                ((tv) this).field_vb.field_z = 0;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              }
            } else {
              return;
            }
          } else {
            if (null != ((tv) this).field_vb) {
              ((tv) this).field_vb.a(var5, ((tv) this).field_t, -23776, 0, param0 + param1 - -var4);
              if (((tv) this).field_tb == null) {
                ((tv) this).field_vb.field_z = ((tv) this).field_z;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              } else {
                ((tv) this).field_vb.field_z = 0;
                ((tv) this).field_vb.field_bb = ((tv) this).field_bb;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void f(int param0) {
        field_wb = null;
        field_xb = null;
        if (param0 < 114) {
            field_ub = null;
            field_ub = null;
            return;
        }
        field_ub = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((tv) this).a(param0, param3, param4 + -23776, param6, param1);
        this.a(param2, param5, (byte) -112);
        if (param4 != 0) {
            ((tv) this).a(107, -86, 59, 7, 1, 125, 35);
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = -param2;
          var5 = -param2;
          if (((tv) this).field_tb == null) {
            break L0;
          } else {
            var4 = ((tv) this).field_tb.b((byte) 69);
            break L0;
          }
        }
        if (param1 != 16474) {
          L1: {
            tv.f(-53);
            if (((tv) this).field_vb == null) {
              break L1;
            } else {
              var5 = ((tv) this).field_vb.b((byte) 69);
              break L1;
            }
          }
          return var4 + (param0 - -param2 + var5 + param0);
        } else {
          L2: {
            if (((tv) this).field_vb == null) {
              break L2;
            } else {
              var5 = ((tv) this).field_vb.b((byte) 69);
              break L2;
            }
          }
          return var4 + (param0 - -param2 + var5 + param0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = "Blue Flamer";
        field_xb = "Show game chat from my friends";
    }
}
