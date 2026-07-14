/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends bca {
    static int field_s;
    static String[] field_q;
    static boolean field_r;

    final void a(op param0, int param1) {
        ((jl) this).a(param0, (byte) -2);
        int var3 = -128 % ((12 - param1) / 35);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var19 = null;
        int[] var20 = null;
        var14 = BachelorFridge.field_y;
        var9 = param3 - param0;
        var8 = param5 + param0;
        var12 = param5;
        L0: while (true) {
          if (var8 <= var12) {
            if (param4 != -1) {
              jl.d(62);
              var10 = param1 + param0;
              var12 = param3;
              L1: while (true) {
                if (var12 <= var9) {
                  var11 = param6 + -param0;
                  var12 = var8;
                  L2: while (true) {
                    if (var9 < var12) {
                      return;
                    } else {
                      var19 = tj.field_b[var12];
                      hba.a(param7, param1, var19, param4 + 8, var10);
                      hba.a(param2, var10, var19, 7, var11);
                      hba.a(param7, var11, var19, param4 ^ -8, param6);
                      var12++;
                      continue L2;
                    }
                  }
                } else {
                  hba.a(param7, param1, tj.field_b[var12], 7, param6);
                  var12--;
                  continue L1;
                }
              }
            } else {
              var10 = param1 + param0;
              var12 = param3;
              L3: while (true) {
                if (var12 <= var9) {
                  var11 = param6 + -param0;
                  var12 = var8;
                  L4: while (true) {
                    if (var9 < var12) {
                      return;
                    } else {
                      var20 = tj.field_b[var12];
                      hba.a(param7, param1, var20, param4 + 8, var10);
                      hba.a(param2, var10, var20, 7, var11);
                      hba.a(param7, var11, var20, param4 ^ -8, param6);
                      var12++;
                      continue L4;
                    }
                  }
                } else {
                  hba.a(param7, param1, tj.field_b[var12], 7, param6);
                  var12--;
                  continue L3;
                }
              }
            }
          } else {
            hba.a(param7, param1, tj.field_b[var12], 7, param6);
            var12++;
            continue L0;
          }
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((jl) this).a((op) null, -117);
          return (at) (Object) new maa(param1, (jl) this);
        } else {
          return (at) (Object) new maa(param1, (jl) this);
        }
    }

    jl(lu param0) {
        super(param0);
        ((jl) this).field_k = param0.e((byte) 78);
        ((jl) this).field_o = new eaa();
        int var2 = param0.b(16711935);
        while (true) {
            var2--;
            if (var2 < 0) {
                break;
            }
            ((jl) this).field_o.a((bw) (Object) dca.a((byte) 102, param0), true);
        }
    }

    jl(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(int param0) {
        if (param0 != -17509) {
            field_r = false;
            field_q = null;
            return;
        }
        field_q = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_q = new String[]{"attack", "move", "passive", "special"};
    }
}
