/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eja extends ana {
    private nb field_v;
    static kv field_w;

    final boolean c(byte param0) {
        ad var2 = ((eja) this).field_v.field_l.a(-27449, ((eja) this).field_q);
        int var3 = 61 / ((param0 - 71) / 47);
        int fieldTemp$0 = ((eja) this).field_l - 1;
        ((eja) this).field_l = ((eja) this).field_l - 1;
        if (!(0 > fieldTemp$0)) {
            if (!(((eja) this).field_l != 25)) {
                int discarded$1 = 94;
                this.e();
            }
            if (((eja) this).field_l != 45) {
                return false;
            }
            var2.b(-1, 20);
            id.e(49, var2.field_s.field_o.field_e);
            return false;
        }
        this.d(107);
        return true;
    }

    private final void d(int param0) {
    }

    private final void e() {
        aga var2 = null;
        pp var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var2 = ((eja) this).field_v.field_l.a(73, ((eja) this).field_q.field_h);
        if (var2.i(82)) {
          return;
        } else {
          var3 = (pp) (Object) ((eja) this).field_v.field_o.b((byte) 90);
          oha discarded$8 = al.a(99, ((eja) this).field_v.field_k);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              var3.a(var2, ((eja) this).field_q.field_h, 12);
              var3 = (pp) (Object) ((eja) this).field_v.field_o.c(0);
              continue L0;
            }
          }
        }
    }

    eja(gj param0, nb param1) {
        super(param0, (bca) (Object) param1);
        try {
            ((eja) this).field_v = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "eja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var35 = null;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        var25 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              gp.a(true, param1);
              var7_int = 0;
              var8 = -param2 + param1;
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var9 = param1;
            var10 = -param1;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            var14 = -1;
            var35 = tj.field_b[param3];
            var16 = param6 + -var8;
            hba.a(param4, param6 - param1, var35, 7, var16);
            var17 = param6 - -var8;
            hba.a(param5, var16, var35, 7, var17);
            hba.a(param4, var17, var35, 7, param1 + param6);
            L2: while (true) {
              if (var9 <= var7_int) {
                break L0;
              } else {
                L3: {
                  var13 += 2;
                  var14 += 2;
                  var12 = var12 + var14;
                  var10 = var10 + var13;
                  if (0 > var12) {
                    break L3;
                  } else {
                    if (var11 >= 1) {
                      it.field_l[var11] = var7_int;
                      var11--;
                      var12 = var12 - (var11 << 1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  var7_int++;
                  if (var10 >= 0) {
                    var9--;
                    var10 = var10 - (var9 << 1);
                    if (var8 > var9) {
                      var29 = tj.field_b[param3 + var9];
                      var30 = tj.field_b[-var9 + param3];
                      var20 = it.field_l[var9];
                      var21 = param6 - -var7_int;
                      var22 = -var7_int + param6;
                      var23 = var20 + param6;
                      var24 = -var20 + param6;
                      hba.a(param4, var22, var29, 7, var24);
                      hba.a(param5, var24, var29, 7, var23);
                      hba.a(param4, var23, var29, 7, var21);
                      hba.a(param4, var22, var30, 7, var24);
                      hba.a(param5, var24, var30, 7, var23);
                      hba.a(param4, var23, var30, 7, var21);
                      break L4;
                    } else {
                      var27 = tj.field_b[param3 + var9];
                      var28 = tj.field_b[-var9 + param3];
                      var20 = var7_int + param6;
                      var21 = param6 - var7_int;
                      hba.a(param4, var21, var27, 7, var20);
                      hba.a(param4, var21, var28, 7, var20);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                var31 = tj.field_b[var7_int + param3];
                var32 = tj.field_b[-var7_int + param3];
                var20 = param6 + var9;
                var21 = -var9 + param6;
                if (var7_int < var8) {
                  L5: {
                    if (var11 < var7_int) {
                      stackOut_19_0 = it.field_l[var7_int];
                      stackIn_20_0 = stackOut_19_0;
                      break L5;
                    } else {
                      stackOut_18_0 = var11;
                      stackIn_20_0 = stackOut_18_0;
                      break L5;
                    }
                  }
                  var22 = stackIn_20_0;
                  var23 = var22 + param6;
                  var24 = -var22 + param6;
                  hba.a(param4, var21, var31, 7, var24);
                  hba.a(param5, var24, var31, 7, var23);
                  hba.a(param4, var23, var31, 7, var20);
                  hba.a(param4, var21, var32, 7, var24);
                  hba.a(param5, var24, var32, 7, var23);
                  hba.a(param4, var23, var32, 7, var20);
                  continue L2;
                } else {
                  hba.a(param4, var21, var31, 7, var20);
                  hba.a(param4, var21, var32, 7, var20);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var7, "eja.C(" + -60 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void e(int param0) {
        field_w = null;
    }

    static {
    }
}
