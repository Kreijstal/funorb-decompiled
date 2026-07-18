/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends kc {
    static co field_Gb;
    static String field_Bb;
    kc field_Eb;
    static String field_Ib;
    static String field_Hb;
    dn field_Db;
    kc field_Jb;
    kc field_Lb;
    static eg field_Fb;
    static double field_Cb;
    static int field_Kb;

    hb(long param0, kc param1, kc param2, in param3, kc param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((hb) this).field_Eb = new kc(0L, (kc) null);
            ((hb) this).field_Db = new dn(0L, ((hb) this).field_Eb, param2, param3);
            ((hb) this).field_Jb = new kc(0L, param4);
            ((hb) this).field_Lb = new kc(0L, param4);
            ((hb) this).field_Jb.field_rb = param5;
            ((hb) this).field_Lb.field_rb = param6;
            ((hb) this).a((kc) (Object) ((hb) this).field_Db, 84);
            ((hb) this).a(((hb) this).field_Jb, 38);
            ((hb) this).a(((hb) this).field_Lb, 31);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        wk var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var9 = new wk(param1);
              var3 = var9.e((byte) 73);
              var4 = var9.d(-10674);
              if (var4 < 0) {
                break L1;
              } else {
                L2: {
                  if (ub.field_a == 0) {
                    break L2;
                  } else {
                    if (~ub.field_a > ~var4) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var9.d(-10674);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (ub.field_a == 0) {
                          break L4;
                        } else {
                          if (var5 > ub.field_a) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        var17 = new byte[var5];
                        var15 = var17;
                        var13 = var15;
                        var11 = var13;
                        var6 = var11;
                        if (var3 != 1) {
                          var7 = (Object) (Object) wj.field_a;
                          synchronized (var7) {
                            L6: {
                              wj.field_a.a(122, var17, var9);
                              break L6;
                            }
                          }
                          break L5;
                        } else {
                          int discarded$2 = 9;
                          int discarded$3 = bf.a(var6, var5, param1, var4);
                          break L5;
                        }
                      }
                      stackOut_20_0 = (byte[]) var6;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var16 = new byte[var4];
                  var14 = var16;
                  var12 = var14;
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a((byte) 114, 0, var16, var4);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("hb.B(").append(false).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = (param0 + ((hb) this).field_x) / 2;
        int var6 = ((hb) this).field_I - param1;
        ((hb) this).field_Db.a(0, param2, ((hb) this).field_x, param3, 0, -param0 + var6, param0);
        ((hb) this).field_Jb.field_T = 0;
        ((hb) this).field_Jb.field_db = var6;
        ((hb) this).field_Jb.field_x = -param0 + var5;
        ((hb) this).field_Jb.field_I = param1;
        ((hb) this).field_Lb.field_T = var5;
        ((hb) this).field_Lb.field_db = var6;
        ((hb) this).field_Lb.field_I = param1;
        ((hb) this).field_Lb.field_x = -var5 + ((hb) this).field_x;
    }

    final static void a(cm param0, int param1, byte param2) {
        ab var6 = null;
        int var4 = 0;
        try {
            var6 = he.field_e;
            var6.b((byte) -123, param1);
            var6.field_g = var6.field_g + 1;
            var4 = var6.field_g;
            var6.f(1, (byte) -21);
            var6.f(param0.field_g, (byte) -80);
            var6.f(param0.field_i, (byte) -7);
            int var5 = 1 / ((22 - param2) / 57);
            var6.a(param0.field_m, (byte) -101);
            var6.a(param0.field_n, (byte) -101);
            var6.a(param0.field_o, (byte) -101);
            var6.a(param0.field_k, (byte) -101);
            int discarded$0 = var6.a(true, var4);
            var6.b(-var4 + var6.field_g, (byte) 43);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "hb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void f() {
        mo.field_p = -1;
        cb.field_c = null;
        oh.field_i = false;
        int var1 = -28;
        jh.field_f = 0;
        ka.field_p = -1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        Object var10 = null;
        ((hb) this).field_T = param5;
        ((hb) this).field_db = param4;
        ((hb) this).field_I = param2;
        ((hb) this).field_x = param3;
        if (param6 != -16624) {
          var10 = null;
          hb.a((cm) null, -57, (byte) -106);
          ((hb) this).a(param1, param0, param7, false);
          return;
        } else {
          ((hb) this).a(param1, param0, param7, false);
          return;
        }
    }

    hb(long param0, hb param1, String param2, String param3) {
        this(param0, (kc) (Object) param1, param1.field_Db.field_Hb, param1.field_Db.field_Eb, param1.field_Jb, param2, param3);
    }

    public static void e() {
        field_Ib = null;
        field_Gb = null;
        field_Hb = null;
        field_Fb = null;
        field_Bb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "Name";
        field_Hb = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Cb = 0.0;
        field_Ib = "All games";
        field_Kb = 2;
    }
}
