/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static String[] field_a;
    static String field_d;
    static int field_b;
    static int field_c;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          dl.a((km) null, (byte) -42, (km) null);
          field_a = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          return;
        }
    }

    final static void a(km param0, byte param1, km param2) {
        Object var4 = null;
        L0: {
          if (param0.field_W == null) {
            param0.field_W = new p();
            break L0;
          } else {
            break L0;
          }
        }
        if (null != param2.field_W) {
          L1: {
            if (oa.field_h == null) {
              oa.field_h = new kf(64);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (null == ie.field_a) {
              ie.field_a = new kf(64);
              break L2;
            } else {
              break L2;
            }
          }
          co.field_f = param0.field_W;
          bd.field_c = param2.field_W;
          dc.f((byte) -14);
          if (param1 != -127) {
            var4 = null;
            oj discarded$2 = dl.a((km) null, (km) null, -53, (km) null, (int[]) null);
            return;
          } else {
            return;
          }
        } else {
          L3: {
            param2.field_W = new p();
            if (oa.field_h == null) {
              oa.field_h = new kf(64);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == ie.field_a) {
              ie.field_a = new kf(64);
              break L4;
            } else {
              break L4;
            }
          }
          co.field_f = param0.field_W;
          bd.field_c = param2.field_W;
          dc.f((byte) -14);
          if (param1 == -127) {
            return;
          } else {
            var4 = null;
            oj discarded$3 = dl.a((km) null, (km) null, -53, (km) null, (int[]) null);
            return;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param0) {
          if ((Object) (Object) lg.field_d != this) {
            if (this != (Object) (Object) nf.field_h) {
              if ((Object) (Object) kh.field_c == this) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_a = null;
          if ((Object) (Object) lg.field_d != this) {
            if (this == (Object) (Object) nf.field_h) {
              return true;
            } else {
              L0: {
                if ((Object) (Object) kh.field_c != this) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static oj a(km param0, km param1, int param2, km param3, int[] param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        oj[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        th var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Throwable decompiledCaughtException = null;
        var12 = Virogrid.field_F ? 1 : 0;
        var5 = param4.length;
        var6 = new String[var5];
        var14 = new char[var5];
        var13 = var14;
        var7 = var13;
        var8 = new oj[var5];
        var9 = (char)param2;
        try {
          L0: {
            var10_int = 0;
            L1: while (true) {
              if (var5 <= var10_int) {
                break L0;
              } else {
                var11 = cj.field_s.a((byte) 125, param4[var10_int]);
                var6[var10_int] = var11.d(120);
                var9 = (char)(var9 + 1);
                var7[var10_int] = (char)var9;
                var8[var10_int] = null;
                var10_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = (Exception) (Object) decompiledCaughtException;
          return null;
        }
        return new oj(0L, param1, param0, param3, var8, param4, var6, var14);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Quick Chat lobby";
        field_a = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
