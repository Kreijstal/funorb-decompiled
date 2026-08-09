/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends hl {
    static db field_Qb;
    hl field_Sb;
    hl field_Kb;
    hl field_Pb;
    rb field_Rb;
    static String field_Mb;
    static boolean field_Nb;
    static String field_Ob;
    static String field_Ub;
    static String field_Vb;
    static int field_Tb;
    static String field_Lb;

    final static String a(String param0, ah param1, String param2, String param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1.c(103)) {
              L1: {
                if (param4 == 1152753825) {
                  break L1;
                } else {
                  ji.d((byte) 23);
                  break L1;
                }
              }
              stackIn_6_0 = param0 + " - " + param1.a(param3, true) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ji.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_10_0), stackIn_19_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param1 + this.field_Hb) / param3;
        int var6 = this.field_R + -param0;
        this.field_Rb.a(this.field_Hb, param2, var6 + -param1, true, 0, 0, param1);
        this.field_Sb.field_Hb = var5 - param1;
        this.field_Sb.field_R = param0;
        this.field_Sb.field_M = 0;
        this.field_Sb.field_yb = var6;
        this.field_Pb.field_R = param0;
        this.field_Pb.field_yb = var6;
        this.field_Pb.field_Hb = this.field_Hb + -var5;
        this.field_Pb.field_M = var5;
    }

    ji(long param0, hl param1, hl param2, bl param3, hl param4, String param5, String param6) {
        super(param0, param1);
        try {
            this.field_Kb = new hl(0L, (hl) null);
            this.field_Rb = new rb(0L, this.field_Kb, param2, param3);
            this.field_Sb = new hl(0L, param4);
            this.field_Pb = new hl(0L, param4);
            this.field_Sb.field_jb = param5;
            this.field_Pb.field_jb = param6;
            this.a((byte) -110, this.field_Rb);
            this.a((byte) -117, this.field_Sb);
            this.a((byte) 47, this.field_Pb);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_yb = param6;
        this.field_R = param3;
        this.field_M = param1;
        if (param0 != -2328) {
            String var10 = (String) null;
            ji.a((String) null, (ah) null, (String) null, (String) null, 48);
        }
        this.field_Hb = param4;
        this.a(param2, param5, param7, 2);
    }

    final static void a(ah param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        id var5 = null;
        int[] var6 = null;
        int var7 = 0;
        bc var8 = null;
        int var9 = 0;
        bc var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var8 = new bc(param0.a("logo.fo3d", "", true));
              var10 = var8;
              var3 = var10.d((byte) -99);
              var10.e(true);
              dh.field_n = lj.a(var10, 0);
              wa.field_f = new id[var3];
              da.field_b = new int[var3][];
              if (param1 == 1) {
                break L1;
              } else {
                field_Nb = false;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3) {
                var10.i((byte) 123);
                var9 = 0;
                var4 = var9;
                L3: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = wa.field_f[var9];
                    var5.a(1, 6, true, 6, 6);
                    var5.b(false);
                    var6 = new int[]{var5.field_a - -var5.field_j >> -1002815199, var5.field_L + var5.field_f >> 1152753825, var5.field_P + var5.field_m >> -1191472959};
                    da.field_b[var9] = var6;
                    var5.a(-var6[2], param1 ^ 5337, -var6[0], -var6[1]);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                wa.field_f[var4] = lj.a(param1 + -16484, var8);
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("ji.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void b(int param0, boolean param1) {
        if (re.field_P != null) {
            ua.a(7918, re.field_P);
        }
        if (!(null == hd.field_s)) {
            hd.field_s.a(param1, 15163);
        }
        uf.a(param1, -123);
        if (param0 != -1002815199) {
            field_Mb = (String) null;
        }
        if (null != mm.field_y) {
            mm.field_y.a(param1, 256);
        }
        gl.a(param1, (byte) 24);
    }

    ji(long param0, ji param1, String param2, String param3) {
        this(param0, param1, param1.field_Rb.field_Ob, param1.field_Rb.field_Qb, param1.field_Sb, param2, param3);
    }

    public static void d(byte param0) {
        if (param0 != 116) {
            field_Mb = (String) null;
        }
        field_Qb = null;
        field_Ub = null;
        field_Mb = null;
        field_Vb = null;
        field_Ob = null;
        field_Lb = null;
    }

    final static void h(int param0) {
        gb var1 = null;
        int var2 = TetraLink.field_J;
        try {
            ul.field_e = null;
            qi.field_q = 0;
            ca.field_c = param0;
            og.field_j.b(1);
            mm.field_s.b(1);
            var1 = wb.field_f.b(107);
            while (var1 != null) {
                var1.e(param0 ^ 0);
                var1 = wb.field_f.d(-1);
            }
            var1 = sd.field_nb.b(-127);
            while (var1 != null) {
                var1.e(param0 + 0);
                var1 = sd.field_nb.d(-1);
            }
            field_Tb = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ji.E(" + param0 + ')');
        }
    }

    static {
        field_Mb = "Options";
        field_Qb = new db(8, 0, 4, 1);
        field_Ub = "Unpacking sound effects";
        field_Ob = "Show all game chat";
        field_Vb = "Please remove <%0> from your friend list first.";
    }
}
