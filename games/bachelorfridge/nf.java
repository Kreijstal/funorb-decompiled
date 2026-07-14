/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends aha {
    static volatile boolean field_K;
    static kv[] field_P;
    private int field_Q;
    private kv field_N;
    static boolean field_M;
    private qu field_L;
    private String field_O;

    public static void d(byte param0) {
        if (param0 > -110) {
            nf.d((byte) 95);
            field_P = null;
            return;
        }
        field_P = null;
    }

    final boolean a(wj param0, int param1) {
        if (param1 >= -78) {
            String discarded$0 = ((nf) this).c((byte) 91);
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, wj param2, int param3) {
        ((nf) this).field_Q = ((nf) this).field_Q + 1;
        this.a(param0, param1, param2, param3 ^ 0);
        if (param3 != 20) {
            field_K = false;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        String var5 = null;
        jg var6 = null;
        int var7 = 0;
        qka var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        kv var16 = null;
        kv var17 = null;
        kv var18 = null;
        kv var19 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var14 = BachelorFridge.field_y;
                var6 = ((nf) this).field_L.b(-19704);
                if (cq.field_g == var6) {
                  break L3;
                } else {
                  if (var6 != ji.field_f) {
                    var5 = ((nf) this).field_L.a((byte) 110);
                    if (var5 == null) {
                      var5 = ((nf) this).field_O;
                      break L2;
                    } else {
                      if (!var5.equals((Object) (Object) ((nf) this).field_w)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = mr.field_h;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((nf) this).field_w)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((nf) this).field_w = var5;
          ((nf) this).a(21646);
          break L0;
        }
        var7 = -39 / ((param0 - -20) / 54);
        this.a((byte) 86, param1, param2, param3);
        var6 = ((nf) this).field_L.b(-19704);
        var9 = (qka) (Object) ((nf) this).field_f;
        var10 = param3 + ((nf) this).field_s;
        var11 = var9.a((wj) this, param1, (byte) -54) + (var9.b((wj) this, false).a(false) >> -1752275039);
        if (var6 == cq.field_g) {
          var19 = fr.field_q[0];
          var12 = var19.field_n << -219429183;
          var13 = var19.field_o << -1850025471;
          if (null != ((nf) this).field_N) {
            if (((nf) this).field_N.field_q >= var12) {
              if (var13 > ((nf) this).field_N.field_p) {
                ((nf) this).field_N = new kv(var12, var13);
                bu.a(0, ((nf) this).field_N);
                var19.b(112, 144, var19.field_n << -1729988540, var19.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
                db.b(120);
                ((nf) this).field_N.d(-(var19.field_n >> 622384193) + var10, -var19.field_o + var11, 256);
                return;
              } else {
                bu.a(0, ((nf) this).field_N);
                dg.d();
                var19.b(112, 144, var19.field_n << -1729988540, var19.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
                db.b(120);
                ((nf) this).field_N.d(-(var19.field_n >> 622384193) + var10, -var19.field_o + var11, 256);
                return;
              }
            } else {
              ((nf) this).field_N = new kv(var12, var13);
              bu.a(0, ((nf) this).field_N);
              var19.b(112, 144, var19.field_n << -1729988540, var19.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
              db.b(120);
              ((nf) this).field_N.d(-(var19.field_n >> 622384193) + var10, -var19.field_o + var11, 256);
              return;
            }
          } else {
            ((nf) this).field_N = new kv(var12, var13);
            bu.a(0, ((nf) this).field_N);
            var19.b(112, 144, var19.field_n << -1729988540, var19.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
            db.b(120);
            ((nf) this).field_N.d(-(var19.field_n >> 622384193) + var10, -var19.field_o + var11, 256);
            return;
          }
        } else {
          if (var6 != ji.field_f) {
            if (jt.field_f == var6) {
              var16 = fr.field_q[2];
              var16.d(var10, var11 + -(var16.field_p >> 1953208449), 256);
              return;
            } else {
              L4: {
                if (var6 != cm.field_u) {
                  break L4;
                } else {
                  var17 = fr.field_q[1];
                  var17.d(var10, -(var17.field_p >> -1383057695) + var11, 256);
                  break L4;
                }
              }
              return;
            }
          } else {
            var18 = fr.field_q[0];
            var12 = var18.field_n << -219429183;
            var13 = var18.field_o << -1850025471;
            if (null != ((nf) this).field_N) {
              if (((nf) this).field_N.field_q >= var12) {
                if (var13 > ((nf) this).field_N.field_p) {
                  ((nf) this).field_N = new kv(var12, var13);
                  bu.a(0, ((nf) this).field_N);
                  var18.b(112, 144, var18.field_n << -1729988540, var18.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
                  db.b(120);
                  ((nf) this).field_N.d(-(var18.field_n >> 622384193) + var10, -var18.field_o + var11, 256);
                  return;
                } else {
                  bu.a(0, ((nf) this).field_N);
                  dg.d();
                  var18.b(112, 144, var18.field_n << -1729988540, var18.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
                  db.b(120);
                  ((nf) this).field_N.d(-(var18.field_n >> 622384193) + var10, -var18.field_o + var11, 256);
                  return;
                }
              } else {
                ((nf) this).field_N = new kv(var12, var13);
                bu.a(0, ((nf) this).field_N);
                var18.b(112, 144, var18.field_n << -1729988540, var18.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
                db.b(120);
                ((nf) this).field_N.d(-(var18.field_n >> 622384193) + var10, -var18.field_o + var11, 256);
                return;
              }
            } else {
              ((nf) this).field_N = new kv(var12, var13);
              bu.a(0, ((nf) this).field_N);
              var18.b(112, 144, var18.field_n << -1729988540, var18.field_o << 1405850532, -((nf) this).field_Q << -1468065814, 4096);
              db.b(120);
              ((nf) this).field_N.d(-(var18.field_n >> 622384193) + var10, -var18.field_o + var11, 256);
              return;
            }
          }
        }
    }

    final String c(byte param0) {
        if (param0 == 16) {
            return null;
        }
        return null;
    }

    nf(qu param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (qda) (Object) om.b(false));
        ((nf) this).field_L = param0;
        ((nf) this).field_O = param1;
        ((nf) this).a(param2, param5, (byte) 59, param4, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = true;
    }
}
