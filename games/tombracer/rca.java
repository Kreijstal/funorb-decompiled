/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rca extends me {
    private bua field_o;
    private taa field_m;
    private boolean field_k;
    static int field_n;
    static boolean field_p;
    private boolean field_j;
    static boolean field_l;

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return true;
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = 0;
        var4 = -94 % ((29 - param2) / 57);
        if (param0 != 83) {
          if (param0 != 84) {
            if (param0 != 82) {
              if (param0 != 13) {
                if (param0 == 81) {
                  ((rca) this).field_j = true;
                  return true;
                } else {
                  if (83 != param0) {
                    return false;
                  } else {
                    ((rca) this).field_j = true;
                    return true;
                  }
                }
              } else {
                ((rca) this).field_j = true;
                return true;
              }
            } else {
              ((rca) this).field_j = true;
              return true;
            }
          } else {
            ((rca) this).field_j = true;
            return true;
          }
        } else {
          ((rca) this).field_j = true;
          return true;
        }
    }

    final boolean d(byte param0) {
        if (param0 != -75) {
            boolean discarded$0 = ((rca) this).a(false);
            return ((rca) this).field_j;
        }
        return ((rca) this).field_j;
    }

    final void a(byte param0) {
        if (param0 > -107) {
          L0: {
            ((rca) this).b((byte) 103);
            if (!((rca) this).field_k) {
              vb discarded$2 = v.a(100, (byte) -76, 128, 222, 0, 96);
              ((rca) this).field_k = true;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (hf.field_b == 1) {
              ((rca) this).field_j = true;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (((rca) this).field_o != null) {
              ((rca) this).field_o.a(0);
              ((rca) this).field_o.a(((rca) this).field_m.a(-13939), false, 0, 37, false);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (!((rca) this).field_k) {
              vb discarded$3 = v.a(100, (byte) -76, 128, 222, 0, 96);
              ((rca) this).field_k = true;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (hf.field_b == 1) {
              ((rca) this).field_j = true;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (((rca) this).field_o != null) {
              ((rca) this).field_o.a(0);
              ((rca) this).field_o.a(((rca) this).field_m.a(-13939), false, 0, 37, false);
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    rca(qh param0, taa param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((rca) this).field_k = false;
        try {
          L0: {
            L1: {
              ((rca) this).field_m = param1;
              if (0 != param1.c(16)) {
                break L1;
              } else {
                ((rca) this).field_o = new bua(0, param1.a(-13939), 1);
                ((rca) this).field_o.a(param1.a(-13939), false, 0, 37, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("rca.<init>(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        ik.field_h.a(0, 0);
        if (param0 <= -13) {
          var2 = aaa.a(false) - kq.field_a.a() >> 1;
          var3 = koa.b(0) - kq.field_a.c() >> 1;
          if (((rca) this).field_m.c(16) != 0) {
            if (((rca) this).field_m.c(16) != 1) {
              return;
            } else {
              var4 = ((rca) this).field_m.a(-13939);
              oka.a(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
              cb.field_i[var4].a((aaa.a(false) >> 1) - cb.field_i[var4].a() / 2, (koa.b(0) >> 1) + -(cb.field_i[var4].c() / 2) - 20);
              kq.field_a.a(var2, var3 + 60);
              oka.a(vj.field_d[var4].toUpperCase(), 65793, eda.field_f, -1, 92 + var3, aaa.a(false) >> 1, -1);
              return;
            }
          } else {
            var8 = gv.field_v;
            var9 = la.field_m[((rca) this).field_m.a(-13939)];
            oka.a(var8.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            ura.a(-10985);
            hp.a(1024, 0, 0, ((rca) this).field_o.b((byte) 74), -1918106173, 300, 320);
            int discarded$3 = -6;
            se.f();
            kq.field_a.a(var2, var3 + 85);
            oka.a(var9.toUpperCase(), 65793, eda.field_f, -1, (koa.b(0) >> 1) - -92, aaa.a(false) >> 1, -1);
            return;
          }
        } else {
          boolean discarded$4 = ((rca) this).d((byte) 83);
          var2 = aaa.a(false) - kq.field_a.a() >> 1;
          var3 = koa.b(0) - kq.field_a.c() >> 1;
          if (((rca) this).field_m.c(16) != 0) {
            if (((rca) this).field_m.c(16) != 1) {
              return;
            } else {
              var4 = ((rca) this).field_m.a(-13939);
              oka.a(r.field_k.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
              cb.field_i[var4].a((aaa.a(false) >> 1) - cb.field_i[var4].a() / 2, (koa.b(0) >> 1) + -(cb.field_i[var4].c() / 2) - 20);
              kq.field_a.a(var2, var3 + 60);
              oka.a(vj.field_d[var4].toUpperCase(), 65793, eda.field_f, -1, 92 + var3, aaa.a(false) >> 1, -1);
              return;
            }
          } else {
            var6 = gv.field_v;
            var7 = la.field_m[((rca) this).field_m.a(-13939)];
            oka.a(var6.toUpperCase(), 2431750, eda.field_f, -1, 100, 320, -1);
            ura.a(-10985);
            hp.a(1024, 0, 0, ((rca) this).field_o.b((byte) 74), -1918106173, 300, 320);
            int discarded$5 = -6;
            se.f();
            kq.field_a.a(var2, var3 + 85);
            oka.a(var7.toUpperCase(), 65793, eda.field_f, -1, (koa.b(0) >> 1) - -92, aaa.a(false) >> 1, -1);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 0;
        field_p = true;
    }
}
