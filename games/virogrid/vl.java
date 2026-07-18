/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements kj {
    static lc field_f;
    private p field_j;
    private tb[] field_b;
    static String field_g;
    static int[] field_i;
    static String field_e;
    static String field_k;
    static boolean field_d;
    static String field_m;
    private int field_c;
    private int field_a;
    private int field_h;
    private eh field_l;

    public final int a(byte param0, int param1) {
        if (param0 > -61) {
            return -51;
        }
        if (((vl) this).field_b[param1].field_n) {
            return 0;
        }
        return 1;
    }

    final static boolean a(byte param0, int param1, int param2) {
        if (!(13 != um.field_Gb)) {
            nf.a((byte) -126);
            return true;
        }
        int var3 = 39;
        if (!(102 != um.field_Gb)) {
            dk.field_v.h(1026);
            return true;
        }
        if (null == dk.field_v) {
            return false;
        }
        if (!dk.field_v.a(true, param2, param1)) {
            return false;
        }
        return true;
    }

    public final int[] a(float param0, byte param1, int param2) {
        tb var7 = null;
        tb var9 = null;
        tb var10 = null;
        tb var11 = null;
        tb var12 = null;
        tb var13 = null;
        tb var14 = null;
        if (param1 < -77) {
          var12 = ((vl) this).field_b[param2];
          var13 = var12;
          var13 = var12;
          if (var12 != null) {
            L0: {
              if (var12.field_l == null) {
                break L0;
              } else {
                if (param0 != var12.field_h) {
                  var12.a(false);
                  var12.a();
                  ((vl) this).field_c = ((vl) this).field_c + 1;
                  break L0;
                } else {
                  ((vl) this).field_j.b((l) (Object) var12, (byte) -45);
                  return var12.field_l;
                }
              }
            }
            if (var12.a(param0, ((vl) this).field_h, ((vl) this).field_l)) {
              L1: {
                if (((vl) this).field_c == 0) {
                  var14 = (tb) (Object) ((vl) this).field_j.b(-92);
                  var14.a();
                  break L1;
                } else {
                  ((vl) this).field_c = ((vl) this).field_c - 1;
                  break L1;
                }
              }
              ((vl) this).field_j.b((l) (Object) var12, (byte) -45);
              return var12.field_l;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          vl.a(-69);
          var9 = ((vl) this).field_b[param2];
          var10 = var9;
          var10 = var9;
          var7 = var9;
          if (var9 != null) {
            L2: {
              if (var9.field_l == null) {
                break L2;
              } else {
                if (param0 != var9.field_h) {
                  var9.a(false);
                  var9.a();
                  ((vl) this).field_c = ((vl) this).field_c + 1;
                  break L2;
                } else {
                  ((vl) this).field_j.b((l) (Object) var9, (byte) -45);
                  return var9.field_l;
                }
              }
            }
            if (var9.a(param0, ((vl) this).field_h, ((vl) this).field_l)) {
              L3: {
                if (((vl) this).field_c == 0) {
                  var11 = (tb) (Object) ((vl) this).field_j.b(-92);
                  var11.a();
                  break L3;
                } else {
                  ((vl) this).field_c = ((vl) this).field_c - 1;
                  break L3;
                }
              }
              ((vl) this).field_j.b((l) (Object) var9, (byte) -45);
              return var9.field_l;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_i = null;
        field_m = null;
        field_k = null;
        field_g = null;
    }

    public final boolean b(int param0, byte param1) {
        if (param1 < 104) {
            ((vl) this).field_b = null;
            return true;
        }
        return true;
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != 11864) {
            vl.a(-125);
            if (32 >= c.field_a) {
                bm.d(0, 0);
            } else {
                var1 = c.field_a % 32;
                if (var1 == 0) {
                    var1 = 32;
                }
                bm.d(-var1 + c.field_a, 0);
            }
            return;
        }
        if (32 >= c.field_a) {
            bm.d(0, 0);
        } else {
            var1 = c.field_a % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            bm.d(-var1 + c.field_a, 0);
        }
    }

    public final int a(int param0, byte param1) {
        int var3 = -101 / ((param1 - 57) / 59);
        if (((vl) this).field_b[param0] == null) {
            return 0;
        }
        return ((vl) this).field_b[param0].field_i;
    }

    public final boolean a(int param0, int param1) {
        if (param1 != 0) {
            ((vl) this).field_h = -1;
            return ((vl) this).field_h == 64 ? true : false;
        }
        return ((vl) this).field_h == 64 ? true : false;
    }

    vl(eh param0, eh param1, int param2, int param3) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        jc var8 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((vl) this).field_j = new p();
        ((vl) this).field_c = 0;
        ((vl) this).field_h = 128;
        try {
          L0: {
            ((vl) this).field_a = param2;
            ((vl) this).field_l = param1;
            ((vl) this).field_c = ((vl) this).field_a;
            ((vl) this).field_h = param3;
            var14 = param0.e((byte) 125, 0);
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var5 = var10;
            var6 = var14.length;
            ((vl) this).field_b = new tb[param0.d((byte) 43, 0)];
            var7 = 0;
            L1: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = new jc(param0.a(0, var14[var7], 0));
                ((vl) this).field_b[var14[var7]] = new tb(var8);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("vl.<init>(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new lc(14, 0, 4, 1);
        field_g = "Chat is currently disabled.";
        field_e = "Create";
        field_m = "Loading textures";
    }
}
