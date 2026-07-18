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
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 < -78) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              String discarded$2 = ((nf) this).c((byte) 91);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("nf.W(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, wj param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((nf) this).field_Q = ((nf) this).field_Q + 1;
              super.a(param0, param1, param2, param3);
              if (param3 == 20) {
                break L1;
              } else {
                field_K = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("nf.O(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param3 + ')');
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
        super.a((byte) 86, param1, param2, param3);
        var6 = ((nf) this).field_L.b(-19704);
        var9 = (qka) (Object) ((nf) this).field_f;
        var10 = param3 + ((nf) this).field_s;
        var11 = var9.a((wj) this, param1, (byte) -54) + (var9.b((wj) this, false).a(false) >> 1);
        if (var6 == cq.field_g) {
          var19 = fr.field_q[0];
          var12 = var19.field_n << 1;
          var13 = var19.field_o << 1;
          if (null != ((nf) this).field_N) {
            if (((nf) this).field_N.field_q >= var12) {
              if (var13 > ((nf) this).field_N.field_p) {
                ((nf) this).field_N = new kv(var12, var13);
                bu.a(0, ((nf) this).field_N);
                var19.b(112, 144, var19.field_n << 4, var19.field_o << 4, -((nf) this).field_Q << 10, 4096);
                db.b(120);
                ((nf) this).field_N.d(-(var19.field_n >> 1) + var10, -var19.field_o + var11, 256);
                return;
              } else {
                bu.a(0, ((nf) this).field_N);
                dg.d();
                var19.b(112, 144, var19.field_n << 4, var19.field_o << 4, -((nf) this).field_Q << 10, 4096);
                db.b(120);
                ((nf) this).field_N.d(-(var19.field_n >> 1) + var10, -var19.field_o + var11, 256);
                return;
              }
            } else {
              ((nf) this).field_N = new kv(var12, var13);
              bu.a(0, ((nf) this).field_N);
              var19.b(112, 144, var19.field_n << 4, var19.field_o << 4, -((nf) this).field_Q << 10, 4096);
              db.b(120);
              ((nf) this).field_N.d(-(var19.field_n >> 1) + var10, -var19.field_o + var11, 256);
              return;
            }
          } else {
            ((nf) this).field_N = new kv(var12, var13);
            bu.a(0, ((nf) this).field_N);
            var19.b(112, 144, var19.field_n << 4, var19.field_o << 4, -((nf) this).field_Q << 10, 4096);
            db.b(120);
            ((nf) this).field_N.d(-(var19.field_n >> 1) + var10, -var19.field_o + var11, 256);
            return;
          }
        } else {
          if (var6 != ji.field_f) {
            if (jt.field_f == var6) {
              var16 = fr.field_q[2];
              var16.d(var10, var11 + -(var16.field_p >> 1), 256);
              return;
            } else {
              L4: {
                if (var6 != cm.field_u) {
                  break L4;
                } else {
                  var17 = fr.field_q[1];
                  var17.d(var10, -(var17.field_p >> 1) + var11, 256);
                  break L4;
                }
              }
              return;
            }
          } else {
            var18 = fr.field_q[0];
            var12 = var18.field_n << 1;
            var13 = var18.field_o << 1;
            if (null != ((nf) this).field_N) {
              if (((nf) this).field_N.field_q >= var12) {
                if (var13 > ((nf) this).field_N.field_p) {
                  ((nf) this).field_N = new kv(var12, var13);
                  bu.a(0, ((nf) this).field_N);
                  var18.b(112, 144, var18.field_n << 4, var18.field_o << 4, -((nf) this).field_Q << 10, 4096);
                  db.b(120);
                  ((nf) this).field_N.d(-(var18.field_n >> 1) + var10, -var18.field_o + var11, 256);
                  return;
                } else {
                  bu.a(0, ((nf) this).field_N);
                  dg.d();
                  var18.b(112, 144, var18.field_n << 4, var18.field_o << 4, -((nf) this).field_Q << 10, 4096);
                  db.b(120);
                  ((nf) this).field_N.d(-(var18.field_n >> 1) + var10, -var18.field_o + var11, 256);
                  return;
                }
              } else {
                ((nf) this).field_N = new kv(var12, var13);
                bu.a(0, ((nf) this).field_N);
                var18.b(112, 144, var18.field_n << 4, var18.field_o << 4, -((nf) this).field_Q << 10, 4096);
                db.b(120);
                ((nf) this).field_N.d(-(var18.field_n >> 1) + var10, -var18.field_o + var11, 256);
                return;
              }
            } else {
              ((nf) this).field_N = new kv(var12, var13);
              bu.a(0, ((nf) this).field_N);
              var18.b(112, 144, var18.field_n << 4, var18.field_o << 4, -((nf) this).field_Q << 10, 4096);
              db.b(120);
              ((nf) this).field_N.d(-(var18.field_n >> 1) + var10, -var18.field_o + var11, 256);
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
        super(param1, (qda) (Object) om.b());
        int discarded$0 = 0;
        try {
            ((nf) this).field_L = param0;
            ((nf) this).field_O = param1;
            ((nf) this).a(param2, param5, (byte) 59, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "nf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = true;
    }
}
