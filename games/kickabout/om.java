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
          ((om) this).field_Cb.a(true, ((om) this).field_Cb.g((byte) -2), 0, 0, ((om) this).field_mb);
          var3 = param0 + ((om) this).field_Cb.field_q;
          ((om) this).field_Db.a(true, ((om) this).field_q - var3, var3, 0, ((om) this).field_mb);
          return;
        } else {
          ((om) this).field_Cb.a(true, ((om) this).field_Cb.g((byte) -2), 0, 0, ((om) this).field_mb);
          var3 = param0 + ((om) this).field_Cb.field_q;
          ((om) this).field_Db.a(true, ((om) this).field_q - var3, var3, 0, ((om) this).field_mb);
          return;
        }
    }

    om(long param0, om param1, String param2) {
        this(param0, param1.field_Cb, param1.field_Db, param2);
    }

    public static void b(int param0) {
        field_Eb = null;
        if (param0 != 0) {
          field_Ab = null;
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
          ((om) this).field_Db = null;
          return ((om) this).field_Cb.g((byte) -24) - (-param1 - ((om) this).field_Db.g((byte) 113));
        } else {
          return ((om) this).field_Cb.g((byte) -24) - (-param1 - ((om) this).field_Db.g((byte) 113));
        }
    }

    om(long param0, ut param1, ut param2, int param3, hd param4, String param5) {
        this(param0, (hd) null, param4, param5);
        ((om) this).field_Cb.field_N = param2;
        ((om) this).field_Cb.field_p = param3;
        ((om) this).field_Cb.field_W = param1;
    }

    final static void a(int param0) {
        int var2 = 0;
        k var3_ref_k = null;
        int var3 = 0;
        mp var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        ml var8 = null;
        byte[] var12 = null;
        var6 = Kickabout.field_G;
        var8 = un.field_e;
        var2 = var8.h((byte) -114);
        if (param0 != var2) {
          if (var2 == 1) {
            var3 = var8.k(4);
            var4 = (mp) (Object) le.field_d.g(24009);
            L0: while (true) {
              if (var4 == null) {
                if (var4 == null) {
                  lr.b((byte) -116);
                  return;
                } else {
                  var4.c((byte) -109);
                  return;
                }
              } else {
                if (var4.field_m != var3) {
                  var4 = (mp) (Object) le.field_d.c(33);
                  continue L0;
                } else {
                  if (var4 == null) {
                    lr.b((byte) -116);
                    return;
                  } else {
                    var4.c((byte) -109);
                    return;
                  }
                }
              }
            }
          } else {
            bd.a("A1: " + tr.b(0), (Throwable) null, param0 + 1);
            lr.b((byte) -116);
            return;
          }
        } else {
          var3_ref_k = (k) (Object) ci.field_f.g(param0 ^ 24009);
          if (var3_ref_k == null) {
            lr.b((byte) -116);
            return;
          } else {
            L1: {
              var4_int = var8.h((byte) -112);
              if (0 != var4_int) {
                var12 = new byte[var4_int];
                var8.a(var12, 0, (byte) -6, var4_int);
                break L1;
              } else {
                var5 = null;
                break L1;
              }
            }
            var8.field_n = var8.field_n + 4;
            if (!var8.h(param0 + 0)) {
              lr.b((byte) -116);
              return;
            } else {
              var3_ref_k.c((byte) -109);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((om) this).a(true, param3, param4, param1, param2);
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
        if (param2 > -59) {
          field_Ab = null;
          ta.a(param1, param4, param3.field_n, 0, param3.field_f, 10, param0);
          return;
        } else {
          ta.a(param1, param4, param3.field_n, 0, param3.field_f, 10, param0);
          return;
        }
    }

    private om(long param0, hd param1, hd param2, String param3) {
        super(param0, (hd) null);
        ((om) this).field_Cb = new hd(0L, param1);
        ((om) this).field_Db = new hd(0L, param2);
        ((om) this).field_Db.field_E = param3;
        ((om) this).a((byte) -107, ((om) this).field_Cb);
        ((om) this).a((byte) -114, ((om) this).field_Db);
        ((om) this).b(false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = "End Game";
        field_Ab = "Accept <%0> into this game";
        field_yb = new ff(1, 2, 2, 0);
        field_zb = "nobody won the Diamond Division last week";
    }
}
