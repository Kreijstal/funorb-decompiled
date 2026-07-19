/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends hd {
    static String field_Eb;
    private hd field_Cb;
    private hd field_Db;
    static ff field_yb;
    static String field_Ab;
    static int field_Bb;
    static String field_zb;

    private final void a(int param0, byte param1) {
        int var3 = 0;
        if (param1 != 14) {
          this.a(-123, (byte) 90);
          this.field_Cb.a(true, this.field_Cb.g((byte) -2), 0, 0, this.field_mb);
          var3 = param0 + this.field_Cb.field_q;
          this.field_Db.a(true, this.field_q - var3, var3, 0, this.field_mb);
          return;
        } else {
          this.field_Cb.a(true, this.field_Cb.g((byte) -2), 0, 0, this.field_mb);
          var3 = param0 + this.field_Cb.field_q;
          this.field_Db.a(true, this.field_q - var3, var3, 0, this.field_mb);
          return;
        }
    }

    om(long param0, om param1, String param2) {
        this(param0, param1.field_Cb, param1.field_Db, param2);
    }

    public static void b(int param0) {
        field_Eb = null;
        if (param0 != 0) {
          field_Ab = (String) null;
          field_zb = null;
          field_yb = null;
          field_Ab = null;
          return;
        } else {
          field_zb = null;
          field_yb = null;
          field_Ab = null;
          return;
        }
    }

    final int b(int param0, int param1) {
        if (param0 != 0) {
          this.field_Db = (hd) null;
          return this.field_Cb.g((byte) -24) - (-param1 - this.field_Db.g((byte) 113));
        } else {
          return this.field_Cb.g((byte) -24) - (-param1 - this.field_Db.g((byte) 113));
        }
    }

    om(long param0, ut param1, ut param2, int param3, hd param4, String param5) {
        this(param0, (hd) null, param4, param5);
        try {
            this.field_Cb.field_N = param2;
            this.field_Cb.field_p = param3;
            this.field_Cb.field_W = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        k var3_ref_k = null;
        int var3 = 0;
        mp var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        ml var8 = null;
        byte[] var12 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var8 = un.field_e;
            var2 = var8.h((byte) -114);
            if (param0 != var2) {
              if (var2 == 1) {
                var3 = var8.k(4);
                var4 = (mp) ((Object) le.field_d.g(24009));
                L1: while (true) {
                  L2: {
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var4.field_m != var3) {
                        var4 = (mp) ((Object) le.field_d.c(33));
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (var4 != null) {
                    var4.c((byte) -109);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    lr.b((byte) -116);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                bd.a("A1: " + tr.b(0), (Throwable) null, param0 + 1);
                lr.b((byte) -116);
                return;
              }
            } else {
              var3_ref_k = (k) ((Object) ci.field_f.g(param0 ^ 24009));
              if (var3_ref_k == null) {
                lr.b((byte) -116);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L3: {
                  var4_int = var8.h((byte) -112);
                  if (0 != var4_int) {
                    var12 = new byte[var4_int];
                    var8.a(var12, 0, (byte) -6, var4_int);
                    break L3;
                  } else {
                    var5 = null;
                    break L3;
                  }
                }
                var8.field_n = var8.field_n + 4;
                if (!var8.h(param0 + 0)) {
                  lr.b((byte) -116);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_ref_k.c((byte) -109);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "om.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.a(true, param3, param4, param1, param2);
        if (param5 != -10481) {
          om.a(89);
          this.a(param0, (byte) 14);
          return;
        } else {
          this.a(param0, (byte) 14);
          return;
        }
    }

    final static void a(java.math.BigInteger param0, iw param1, byte param2, iw param3, java.math.BigInteger param4) {
        try {
            if (param2 > -59) {
                field_Ab = (String) null;
            }
            ta.a(param1, param4, param3.field_n, 0, param3.field_f, 10, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "om.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private om(long param0, hd param1, hd param2, String param3) {
        super(param0, (hd) null);
        try {
            this.field_Cb = new hd(0L, param1);
            this.field_Db = new hd(0L, param2);
            this.field_Db.field_E = param3;
            this.a((byte) -107, this.field_Cb);
            this.a((byte) -114, this.field_Db);
            this.b(false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "om.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Eb = "End Game";
        field_Ab = "Accept <%0> into this game";
        field_yb = new ff(1, 2, 2, 0);
        field_zb = "nobody won the Diamond Division last week";
    }
}
