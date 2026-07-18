/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    static int field_h;
    private he field_d;
    static String field_f;
    static long field_a;
    static bk field_b;
    private he field_c;
    static int field_e;
    static String field_g;

    final he b(byte param0) {
        he var2 = ((cd) this).field_c;
        if (param0 != -122) {
            return null;
        }
        if (!(((cd) this).field_d != var2)) {
            ((cd) this).field_c = null;
            return null;
        }
        ((cd) this).field_c = var2.field_h;
        return var2;
    }

    final static void a(kc[] param0, int param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param1 <= 0) {
                  break L1;
                } else {
                  var5_int = param0[0].field_l;
                  var6 = param0[2].field_l;
                  var7 = param0[1].field_l;
                  param0[0].d(param3, param4);
                  param0[2].d(param1 + param3 + -var6, param4);
                  vj.a(sg.field_c);
                  vj.f(var5_int + param3, param4, -var6 + param1 + param3, param4 - -param0[1].field_k);
                  var8 = var5_int + param3;
                  var9 = -var6 + param3 - -param1;
                  param3 = var8;
                  L2: while (true) {
                    if (var9 <= param3) {
                      vj.b(sg.field_c);
                      break L0;
                    } else {
                      param0[1].d(param3, param4);
                      param3 = param3 + var7;
                      continue L2;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("cd.E(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + -94 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int b(int param0) {
        int var2 = 0;
        he var3 = null;
        int var4 = 0;
        var4 = Main.field_T;
        var2 = 0;
        var3 = ((cd) this).field_d.field_h;
        if (param0 == 1) {
          L0: while (true) {
            if (((cd) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L0;
            }
          }
        } else {
          field_h = 96;
          L1: while (true) {
            if (((cd) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_h;
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = Main.field_T;
        if (param0 >= param2) {
          if (param1 <= param0) {
            if (param1 <= param2) {
              w.a(vj.field_j, param6, param2, param7, true, param5, param4, param1, param0);
              return;
            } else {
              w.a(vj.field_j, param6, param1, param5, true, param7, param4, param2, param0);
              return;
            }
          } else {
            w.a(vj.field_j, param6, param0, param5, true, param4, param7, param2, param1);
            return;
          }
        } else {
          if (param2 >= param1) {
            if (param0 >= param1) {
              w.a(vj.field_j, param6, param0, param7, true, param4, param5, param1, param2);
              return;
            } else {
              w.a(vj.field_j, param6, param1, param4, true, param7, param5, param0, param2);
              return;
            }
          } else {
            w.a(vj.field_j, param6, param2, param4, true, param5, param7, param0, param1);
            return;
          }
        }
    }

    final he a(int param0) {
        he var2 = null;
        int var3 = 0;
        var2 = ((cd) this).field_d.field_h;
        if (((cd) this).field_d == var2) {
          return null;
        } else {
          var2.d(12);
          var3 = -95 % ((param0 - 87) / 34);
          return var2;
        }
    }

    final he c(byte param0) {
        he var2 = null;
        if (param0 <= -96) {
          var2 = ((cd) this).field_d.field_h;
          if (var2 == ((cd) this).field_d) {
            ((cd) this).field_c = null;
            return null;
          } else {
            ((cd) this).field_c = var2.field_h;
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, he param1) {
        if (!(null == param1.field_i)) {
            param1.d(12);
        }
        param1.field_i = ((cd) this).field_d.field_i;
        if (param0 >= -62) {
            return;
        }
        try {
            param1.field_h = ((cd) this).field_d;
            param1.field_i.field_h = param1;
            param1.field_h.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "cd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public cd() {
        ((cd) this).field_d = new he();
        ((cd) this).field_d.field_i = ((cd) this).field_d;
        ((cd) this).field_d.field_h = ((cd) this).field_d;
    }

    public static void a() {
        field_b = null;
        int var1 = 0;
        field_g = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "FPS:";
    }
}
