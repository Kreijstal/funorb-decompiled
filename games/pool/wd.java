/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends vh {
    static volatile boolean field_Sb;
    static int[] field_Qb;
    int field_Mb;
    private vh[] field_Nb;
    private vh[] field_Pb;
    static ph field_Lb;
    static String field_Rb;
    static String field_Ob;
    private vh field_Tb;
    static lq field_Ub;

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Pool.field_O;
        var4 = 0;
        L0: while (true) {
          if (((wd) this).field_Pb.length <= var4) {
            ((wd) this).field_Tb.b(param2, 2147483647, 0, ((wd) this).field_gb, ((wd) this).field_Db + -param2);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (((wd) this).field_Nb.length <= var8) {
                return;
              } else {
                ((wd) this).field_Nb[var8].b(param1, 2147483647, param1, -(param1 * 2) + ((wd) this).field_Tb.field_gb, -(param1 * 2) + ((wd) this).field_Tb.field_Db);
                if (var8 != ((wd) this).field_Mb) {
                  ((wd) this).field_Nb[var8].field_qb = ((wd) this).field_Nb[var8].field_qb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = var4 * ((wd) this).field_gb / ((wd) this).field_Pb.length;
            var6 = ((wd) this).field_gb * (var4 - -1) / ((wd) this).field_Pb.length;
            ((wd) this).field_Pb[var4].field_qb = var5;
            ((wd) this).field_Pb[var4].field_eb = 0;
            ((wd) this).field_Pb[var4].field_gb = var6 - var5;
            ((wd) this).field_Pb[var4].field_Db = param2;
            var4++;
            continue L0;
          }
        }
    }

    public static void f(int param0) {
        field_Lb = null;
        field_Ob = null;
        field_Rb = null;
        field_Qb = null;
        field_Ub = null;
    }

    final static String b(int param0, int param1) {
        if (param1 <= 51) {
            return null;
        }
        return (-1 == (param0 & nd.field_j) ? "" : "cont vis|") + ((sg.field_O & param0) == 0 ? "" : "gv visit+1|") + (-1 == (be.field_I & param0) ? "" : "gv shot+1|") + (0 == (param0 & nr.field_Q) ? "" : "gv BiH anywhere|") + (0 != (nr.field_R & param0) ? "gv BiH kitchen|" : "") + ((nr.field_V & param0) == 0 ? "" : "gv BiH in D|") + ((ag.field_e & param0) != 0 ? "wins|" : "") + ((hm.field_e & param0) == 0 ? "" : "loses|") + ((param0 & oa.field_b) == 0 ? "" : "group choice|") + (0 != (param0 & um.field_c) ? "respot white|" : "") + ((param0 & ob.field_F) == 0 ? "" : "rerack|") + (0 != (ll.field_f & param0) ? "ends turn|" : "");
    }

    wd(long param0, vh param1, String[] param2, vh param3, vh[] param4, int param5) {
        super(param0, (vh) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        vh var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ((wd) this).field_Pb = new vh[param2.length];
            ((wd) this).field_Tb = new vh(0L, param3);
            ((wd) this).field_Nb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                ((wd) this).a(91, ((wd) this).field_Tb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    ((wd) this).field_Mb = param5;
                    ((wd) this).field_Pb[param5].field_Ib = true;
                    break L0;
                  } else {
                    ((wd) this).field_Tb.a(126, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new vh(0L, param1);
                var9.field_nb = param2[var8_int];
                ((wd) this).field_Pb[var8_int] = var9;
                ((wd) this).a(42, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("wd.<init>(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((wd) this).field_Pb.length) {
              return;
            } else {
              if (((wd) this).field_Mb != var2) {
                if (((wd) this).field_Pb[var2].field_R != 0) {
                  ((wd) this).field_Pb[((wd) this).field_Mb].field_Ib = false;
                  ((wd) this).field_Nb[((wd) this).field_Mb].field_qb = ((wd) this).field_Nb[((wd) this).field_Mb].field_qb + 10000;
                  ((wd) this).field_Mb = var2;
                  ((wd) this).field_Pb[var2].field_Ib = true;
                  ((wd) this).field_Nb[var2].field_qb = ((wd) this).field_Nb[var2].field_qb - 10000;
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -37 % ((-50 - param2) / 32);
        ((wd) this).field_gb = param1;
        ((wd) this).field_qb = param0;
        ((wd) this).field_Db = param3;
        ((wd) this).field_eb = param4;
        this.a((byte) -125, param5, param6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = new int[64];
        field_Sb = false;
        field_Rb = "Connection timed out. Please try using a different server.";
        field_Ob = "Fullscreen";
    }
}
