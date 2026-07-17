/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends sna {
    gba field_vb;
    static kv[][] field_yb;
    static String field_wb;
    private sna field_xb;
    private gba field_zb;
    private sna field_Ab;

    private wl(long param0, sna param1, sna param2, gba param3) {
        super(param0, (sna) null);
        try {
            ((wl) this).field_xb = new sna(0L, param2);
            ((wl) this).field_vb = new gba(0L, param3, true);
            ((wl) this).field_zb = new gba(0L, param3, false);
            ((wl) this).a(-1, ((wl) this).field_xb);
            ((wl) this).a(-1, (sna) (Object) ((wl) this).field_vb);
            ((wl) this).a(-1, (sna) (Object) ((wl) this).field_zb);
            ((wl) this).field_Ab = param1;
            ((wl) this).field_xb.a(-1, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "wl.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          ((wl) this).field_Ab.field_rb = 0;
          ((wl) this).field_Ab.field_kb = 0;
          ((wl) this).field_xb.field_sb = ((wl) this).field_sb;
          var4 = 18 % ((78 - param2) / 48);
          ((wl) this).field_xb.field_p = ((wl) this).field_p;
          ((wl) this).field_vb.a(false);
          ((wl) this).field_zb.a(false);
          if (((wl) this).field_Ab.field_sb <= ((wl) this).field_xb.field_sb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (((wl) this).field_Ab.field_p <= ((wl) this).field_xb.field_p) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          L3: {
            var6 = stackIn_6_0;
            if (var5 == 0) {
              break L3;
            } else {
              if (var6 == 0) {
                break L3;
              } else {
                ((wl) this).a(-1, (sna) (Object) ((wl) this).field_zb);
                ((wl) this).a(-1, (sna) (Object) ((wl) this).field_vb);
                ((wl) this).field_xb.field_sb = ((wl) this).field_xb.field_sb - (param1 + param0);
                ((wl) this).field_xb.field_p = ((wl) this).field_xb.field_p - (param1 - -param0);
                ((wl) this).field_zb.a(param1, 31407, -param1 + ((wl) this).field_sb, 0, -param1 + ((wl) this).field_p);
                ((wl) this).field_zb.b(((wl) this).field_Ab.field_sb, -((wl) this).field_Ab.field_kb, ((wl) this).field_xb.field_sb, (byte) -117);
                ((wl) this).field_vb.a(-param1 + ((wl) this).field_p, 31407, param1, -param1 + ((wl) this).field_sb, 0);
                ((wl) this).field_vb.b(((wl) this).field_Ab.field_p, -((wl) this).field_Ab.field_rb, ((wl) this).field_xb.field_p, (byte) -117);
                break L2;
              }
            }
          }
          if (var5 == 0) {
            if (var6 != 0) {
              ((wl) this).a(-1, (sna) (Object) ((wl) this).field_vb);
              ((wl) this).field_xb.field_sb = ((wl) this).field_xb.field_sb - (param0 + param1);
              ((wl) this).field_vb.a(((wl) this).field_p, 31407, param1, ((wl) this).field_sb - param1, 0);
              ((wl) this).field_vb.b(((wl) this).field_Ab.field_p, -((wl) this).field_Ab.field_rb, ((wl) this).field_xb.field_p, (byte) -117);
              break L2;
            } else {
              break L2;
            }
          } else {
            ((wl) this).a(-1, (sna) (Object) ((wl) this).field_zb);
            ((wl) this).field_xb.field_p = ((wl) this).field_xb.field_p - (param0 + param1);
            ((wl) this).field_zb.a(param1, 31407, ((wl) this).field_sb, 0, ((wl) this).field_p - param1);
            ((wl) this).field_zb.b(((wl) this).field_Ab.field_sb, -((wl) this).field_Ab.field_kb, ((wl) this).field_xb.field_sb, (byte) -117);
            break L2;
          }
        }
    }

    wl(String param0, sna param1, sna param2, gba param3) {
        this(ew.a((byte) 8, (CharSequence) (Object) param0), param1, param2, param3);
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        ((wl) this).field_p = param4;
        if (param2) {
            ((wl) this).field_vb = null;
        }
        ((wl) this).field_rb = param1;
        ((wl) this).field_kb = param5;
        ((wl) this).field_sb = param6;
        this.a(param0, param3, -50);
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param3 <= 104) {
            this.a(-126, -34, 21);
        }
        int discarded$0 = 0;
        this.a(param1, param0, ((wl) this).field_xb.field_sb, param2, ((wl) this).field_xb.field_p);
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        int var8 = 0;
        L0: {
          var8 = BachelorFridge.field_y;
          if (!((wl) this).field_vb.g(25910)) {
            break L0;
          } else {
            ((wl) this).field_Ab.field_I = ((wl) this).field_Ab.field_I + param3;
            break L0;
          }
        }
        L1: {
          if (((wl) this).field_vb.b(false)) {
            ((wl) this).field_Ab.field_I = ((wl) this).field_Ab.field_I - param3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (!((wl) this).field_vb.f(0)) {
            break L2;
          } else {
            ((wl) this).field_Ab.field_I = ((wl) this).field_Ab.field_I + param2;
            break L2;
          }
        }
        L3: {
          if (!((wl) this).field_vb.h(0)) {
            break L3;
          } else {
            ((wl) this).field_Ab.field_I = ((wl) this).field_Ab.field_I - param2;
            break L3;
          }
        }
        L4: {
          if (!((wl) this).field_zb.g(25910)) {
            break L4;
          } else {
            ((wl) this).field_Ab.field_mb = ((wl) this).field_Ab.field_mb + param3;
            break L4;
          }
        }
        L5: {
          if (((wl) this).field_zb.b(false)) {
            ((wl) this).field_Ab.field_mb = ((wl) this).field_Ab.field_mb - param3;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!((wl) this).field_zb.f(0)) {
            break L6;
          } else {
            ((wl) this).field_Ab.field_mb = ((wl) this).field_Ab.field_mb + param4;
            break L6;
          }
        }
        L7: {
          if (((wl) this).field_zb.h(0)) {
            ((wl) this).field_Ab.field_mb = ((wl) this).field_Ab.field_mb - param4;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (!((wl) this).field_T) {
            break L8;
          } else {
            if (((wl) this).field_xb.field_p > ((wl) this).field_Ab.field_p) {
              ((wl) this).field_Ab.field_mb = ((wl) this).field_Ab.field_mb - param1;
              break L8;
            } else {
              ((wl) this).field_Ab.field_I = ((wl) this).field_Ab.field_I - param1;
              break L8;
            }
          }
        }
        L9: {
          if (!param0) {
            L10: {
              if (-(((wl) this).field_Ab.field_I + ((wl) this).field_Ab.field_rb) <= ((wl) this).field_Ab.field_p + ((wl) this).field_Ab.field_hb + -((wl) this).field_xb.field_p) {
                break L10;
              } else {
                ((wl) this).field_Ab.field_I = -(((wl) this).field_Ab.field_hb + ((wl) this).field_Ab.field_p + -((wl) this).field_xb.field_p) + -((wl) this).field_Ab.field_rb;
                break L10;
              }
            }
            L11: {
              if (((wl) this).field_Ab.field_sb + ((wl) this).field_Ab.field_W + -((wl) this).field_xb.field_sb >= -(((wl) this).field_Ab.field_kb + ((wl) this).field_Ab.field_mb)) {
                break L11;
              } else {
                ((wl) this).field_Ab.field_mb = -((wl) this).field_Ab.field_kb + -(-((wl) this).field_xb.field_sb + ((wl) this).field_Ab.field_W + ((wl) this).field_Ab.field_sb);
                break L11;
              }
            }
            L12: {
              if (-(((wl) this).field_Ab.field_I + ((wl) this).field_Ab.field_rb) >= 0) {
                break L12;
              } else {
                ((wl) this).field_Ab.field_I = -((wl) this).field_Ab.field_rb;
                break L12;
              }
            }
            if (-(((wl) this).field_Ab.field_kb + ((wl) this).field_Ab.field_mb) < 0) {
              ((wl) this).field_Ab.field_mb = -((wl) this).field_Ab.field_kb;
              break L9;
            } else {
              break L9;
            }
          } else {
            L13: {
              if (-(((wl) this).field_Ab.field_I + ((wl) this).field_Ab.field_rb) >= 0) {
                break L13;
              } else {
                ((wl) this).field_Ab.field_I = -((wl) this).field_Ab.field_rb;
                break L13;
              }
            }
            L14: {
              if (((wl) this).field_Ab.field_p - -((wl) this).field_Ab.field_hb + -((wl) this).field_xb.field_p < -(((wl) this).field_Ab.field_I + ((wl) this).field_Ab.field_rb)) {
                ((wl) this).field_Ab.field_I = -((wl) this).field_Ab.field_rb + -(((wl) this).field_Ab.field_hb + (((wl) this).field_Ab.field_p + -((wl) this).field_xb.field_p));
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-(((wl) this).field_Ab.field_mb + ((wl) this).field_Ab.field_kb) < 0) {
                ((wl) this).field_Ab.field_mb = -((wl) this).field_Ab.field_kb;
                break L15;
              } else {
                break L15;
              }
            }
            if (-(((wl) this).field_Ab.field_mb + ((wl) this).field_Ab.field_kb) > ((wl) this).field_Ab.field_W + ((wl) this).field_Ab.field_sb - ((wl) this).field_xb.field_sb) {
              ((wl) this).field_Ab.field_mb = -((wl) this).field_Ab.field_kb + -(-((wl) this).field_xb.field_sb + ((wl) this).field_Ab.field_W + ((wl) this).field_Ab.field_sb);
              break L9;
            } else {
              break L9;
            }
          }
        }
        L16: {
          if (!((wl) this).field_vb.f((byte) -122)) {
            break L16;
          } else {
            ((wl) this).field_Ab.field_rb = -((wl) this).field_vb.a(param0, (byte) 87, ((wl) this).field_xb.field_p, ((wl) this).field_Ab.field_p);
            ((wl) this).field_Ab.field_I = 0;
            break L16;
          }
        }
        L17: {
          if (!((wl) this).field_zb.f((byte) -119)) {
            break L17;
          } else {
            ((wl) this).field_Ab.field_kb = -((wl) this).field_zb.a(-88, param0, ((wl) this).field_xb.field_sb, ((wl) this).field_Ab.field_sb);
            ((wl) this).field_Ab.field_mb = 0;
            break L17;
          }
        }
        ((wl) this).field_vb.b(((wl) this).field_Ab.field_p, -((wl) this).field_Ab.field_rb, ((wl) this).field_xb.field_p, (byte) -117);
        ((wl) this).field_zb.b(((wl) this).field_Ab.field_sb, -((wl) this).field_Ab.field_kb, ((wl) this).field_xb.field_sb, (byte) -117);
    }

    public static void f() {
        field_yb = null;
        field_wb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = "Hide players in <%0>'s game";
    }
}
