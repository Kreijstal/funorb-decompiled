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
        vh dupTemp$0 = null;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var7 = Pool.field_O;
        var4 = 0;
        L0: while (true) {
          if (this.field_Pb.length <= var4) {
            L1: {
              this.field_Tb.b(param2, 2147483647, 0, this.field_gb, this.field_Db + -param2);
              if (param0 <= -99) {
                break L1;
              } else {
                field_Rb = (String) null;
                break L1;
              }
            }
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (this.field_Nb.length <= var8) {
                return;
              } else {
                this.field_Nb[var8].b(param1, 2147483647, param1, -(param1 * 2) + this.field_Tb.field_gb, -(param1 * 2) + this.field_Tb.field_Db);
                if (var8 != this.field_Mb) {
                  dupTemp$0 = this.field_Nb[var8];
                  dupTemp$0.field_qb = dupTemp$0.field_qb + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * this.field_gb / this.field_Pb.length;
            var6 = this.field_gb * (var4 - -1) / this.field_Pb.length;
            this.field_Pb[var4].field_qb = var5;
            this.field_Pb[var4].field_eb = 0;
            this.field_Pb[var4].field_gb = var6 - var5;
            this.field_Pb[var4].field_Db = param2;
            var4++;
            continue L0;
          }
        }
    }

    public static void f(int param0) {
        field_Lb = null;
        field_Ob = null;
        field_Rb = null;
        if (param0 != -1) {
            field_Rb = (String) null;
        }
        field_Qb = null;
        field_Ub = null;
    }

    final static String b(int param0, int param1) {
        if (param1 <= 51) {
            return (String) null;
        }
        return (-1 == (param0 & nd.field_j ^ -1) ? "" : "cont vis|") + ((sg.field_O & param0) == 0 ? "" : "gv visit+1|") + (-1 == (be.field_I & param0 ^ -1) ? "" : "gv shot+1|") + (0 == (param0 & nr.field_Q) ? "" : "gv BiH anywhere|") + (0 != (nr.field_R & param0) ? "gv BiH kitchen|" : "") + ((nr.field_V & param0) == 0 ? "" : "gv BiH in D|") + (-1 != (ag.field_e & param0 ^ -1) ? "wins|" : "") + ((hm.field_e & param0) == 0 ? "" : "loses|") + ((param0 & oa.field_b) == 0 ? "" : "group choice|") + (0 != (param0 & um.field_c) ? "respot white|" : "") + ((param0 & ob.field_F) == 0 ? "" : "rerack|") + (0 != (ll.field_f & param0) ? "ends turn|" : "");
    }

    wd(long param0, vh param1, String[] param2, vh param3, vh[] param4, int param5) {
        super(param0, (vh) null);
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        vh var9 = null;
        int var11 = 0;
        try {
          L0: {
            this.field_Pb = new vh[param2.length];
            this.field_Tb = new vh(0L, param3);
            this.field_Nb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                this.a(91, this.field_Tb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    this.field_Mb = param5;
                    this.field_Pb[param5].field_Ib = true;
                    break L0;
                  } else {
                    this.field_Tb.a(126, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new vh(0L, param1);
                var9.field_nb = param2[var8_int];
                this.field_Pb[var8_int] = var9;
                this.a(42, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var8);

            stackIn_11_1 = new StringBuilder().append("wd.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param4 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final void c(boolean param0) {
        vh dupTemp$0 = null;
        vh dupTemp$1 = null;
        int var2;
        if (param0) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= this.field_Pb.length) {
              return;
            } else {
              if (this.field_Mb != var2) {
                if (this.field_Pb[var2].field_R != 0) {
                  this.field_Pb[this.field_Mb].field_Ib = false;
                  dupTemp$0 = this.field_Nb[this.field_Mb];
                  dupTemp$0.field_qb = dupTemp$0.field_qb + 10000;
                  this.field_Mb = var2;
                  this.field_Pb[var2].field_Ib = true;
                  dupTemp$1 = this.field_Nb[var2];
                  dupTemp$1.field_qb = dupTemp$1.field_qb - 10000;
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
        this.field_gb = param1;
        this.field_qb = param0;
        this.field_Db = param3;
        this.field_eb = param4;
        this.a((byte) -125, param5, param6);
    }

    static {
        field_Qb = new int[64];
        field_Sb = false;
        field_Rb = "Connection timed out. Please try using a different server.";
        field_Ob = "Fullscreen";
    }
}
