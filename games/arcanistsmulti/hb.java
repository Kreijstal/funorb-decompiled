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
            this.field_Eb = new kc(0L, (kc) null);
            this.field_Db = new dn(0L, this.field_Eb, param2, param3);
            this.field_Jb = new kc(0L, param4);
            this.field_Lb = new kc(0L, param4);
            this.field_Jb.field_rb = param5;
            this.field_Lb.field_rb = param6;
            this.a(this.field_Db, 84);
            this.a(this.field_Jb, 38);
            this.a(this.field_Lb, 31);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int discarded$1 = 0;
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
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_22_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              var9 = new wk(param1);
              var3 = var9.e((byte) 73);
              if (!param0) {
                break L1;
              } else {
                hb.e(127);
                break L1;
              }
            }
            L2: {
              var4 = var9.d(-10674);
              if (-1 < (var4 ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (-1 == (ub.field_a ^ -1)) {
                    break L3;
                  } else {
                    if (ub.field_a < var4) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var3 != 0) {
                  L4: {
                    var5 = var9.d(-10674);
                    if (-1 < (var5 ^ -1)) {
                      break L4;
                    } else {
                      L5: {
                        if (-1 == (ub.field_a ^ -1)) {
                          break L5;
                        } else {
                          if (var5 > ub.field_a) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        var13 = new byte[var5];
                        var11 = var13;
                        var6 = var11;
                        if (-2 != (var3 ^ -1)) {
                          var7 = wj.field_a;
                          synchronized (var7) {
                            L7: {
                              wj.field_a.a(122, var13, var9);
                              break L7;
                            }
                          }
                          break L6;
                        } else {
                          discarded$1 = bf.a(var13, var5, param1, var4, 9);
                          break L6;
                        }
                      }
                      stackOut_22_0 = (byte[]) (var6);
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var12 = new byte[var4];
                  var10 = var12;
                  var5_ref_byte__ = var10;
                  var9.a((byte) 114, 0, var12, var4);
                  stackOut_8_0 = (byte[]) (var5_ref_byte__);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2);
            stackOut_24_1 = new StringBuilder().append("hb.B(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_23_0;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        int var5 = (param0 + this.field_x) / 2;
        int var6 = this.field_I - param1;
        this.field_Db.a(0, param2, this.field_x, param3, 0, -param0 + var6, param0);
        this.field_Jb.field_T = 0;
        this.field_Jb.field_db = var6;
        this.field_Jb.field_x = -param0 + var5;
        this.field_Jb.field_I = param1;
        this.field_Lb.field_T = var5;
        this.field_Lb.field_db = var6;
        this.field_Lb.field_I = param1;
        this.field_Lb.field_x = -var5 + this.field_x;
    }

    final static void a(cm param0, int param1, byte param2) {
        ab var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
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
            discarded$0 = var6.a(true, var4);
            var6.b(-var4 + var6.field_g, (byte) 43);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hb.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void f(byte param0) {
        mo.field_p = -1;
        cb.field_c = null;
        oh.field_i = false;
        int var1 = 57 / ((param0 - -19) / 41);
        jh.field_f = 0;
        ka.field_p = -1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        cm var10 = null;
        this.field_T = param5;
        this.field_db = param4;
        this.field_I = param2;
        this.field_x = param3;
        if (param6 != -16624) {
          var10 = (cm) null;
          hb.a((cm) null, -57, (byte) -106);
          this.a(param1, param0, param7, false);
          return;
        } else {
          this.a(param1, param0, param7, false);
          return;
        }
    }

    hb(long param0, hb param1, String param2, String param3) {
        this(param0, param1, param1.field_Db.field_Hb, param1.field_Db.field_Eb, param1.field_Jb, param2, param3);
    }

    public static void e(int param0) {
        field_Ib = null;
        field_Gb = null;
        if (param0 != 0) {
            return;
        }
        field_Hb = null;
        field_Fb = null;
        field_Bb = null;
    }

    static {
        field_Bb = "Name";
        field_Hb = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_Cb = 0.0;
        field_Ib = "All games";
        field_Kb = 2;
    }
}
