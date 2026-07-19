/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at extends hd {
    pu field_Cb;
    static String field_Jb;
    static String field_Kb;
    static String field_Ib;
    static String field_Ab;
    static String field_Bb;
    static int field_Hb;
    int field_yb;
    static String field_Fb;
    static String field_Gb;
    String field_Eb;
    private String field_zb;
    int field_Db;

    final int c(boolean param0) {
        if (!param0) {
            sj var3 = (sj) null;
            at.a((hu) null, (sj) null, (byte) 38);
        }
        return ic.field_h.field_x >= this.field_Db ? 16777215 : 16711680;
    }

    final static void a(hu param0, sj param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        tc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        hu var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            var3_int = vv.field_r;
            qa.field_E = new hd(0L, (hd) null);
            if (param1 != null) {
              L1: {
                param1.field_c = 0;
                param1.field_b = false;
                vc.field_x = new bt(var3_int, param1, param1);
                lm.field_j = new an(var3_int, param1, param1, new ka());
                if (param2 == -32) {
                  break L1;
                } else {
                  at.h((byte) -19);
                  break L1;
                }
              }
              var4 = al.h((byte) 124);
              if (var4 != null) {
                oe.a((byte) -45, var4);
                var12 = (hu) null;
                ve.field_S = su.a(5138823, 2245737, 1513239, true, 65793, (hu) null, 65793, 65793, 4020342, 8947848, 0, 1513239, 1127256);
                ic.field_a = su.a(0, 0, 0, true, 0, param0, 0, 0, 0, 0, 16764006, 0, 0);
                fr.field_E = su.a(0, 0, 0, true, 0, param0, 0, 0, 0, 0, 16777215, 0, 0);
                var5 = on.field_g;
                var6 = on.field_f;
                var16 = on.field_a;
                ci.field_g = new ut(10, 14);
                ci.field_g.e();
                var8 = 2;
                L2: while (true) {
                  if (var8 >= 7) {
                    on.a(var16, var5, var6);
                    gk.field_h = h.a(param2 ^ -32, var4, ve.field_S, fr.field_E, ic.field_a);
                    qa.field_E.field_jb = new tf();
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    on.a(var8, 1 + var8, -(var8 << 1015207777) + 14, 16777215);
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var11 = (Throwable) null;
                bd.a("QC2", (Throwable) null, 1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              var10 = (Throwable) null;
              bd.a("QC1", (Throwable) null, 1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("at.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void h(byte param0) {
        field_Fb = null;
        field_Kb = null;
        field_Bb = null;
        if (param0 >= -106) {
            return;
        }
        field_Ib = null;
        field_Jb = null;
        field_Gb = null;
        field_Ab = null;
    }

    at(int param0) {
        this.field_yb = param0;
        fn var3 = pa.field_g[this.field_yb];
        this.field_Cb = new pu(new fn(var3.field_k, var3.field_h, var3.field_e), false);
        this.field_q = 5 + (this.field_Cb.field_q - -143);
        this.field_mb = 5 + this.field_Cb.field_mb + 5;
        this.field_Db = var3.field_e;
        this.field_B = 5;
        this.field_D = 5;
        this.field_Eb = ad.a(this.field_Db, 26300);
        this.field_zb = var3.f((byte) -1).toLowerCase();
        this.a((byte) -115, (hd) (this.field_Cb));
        this.field_Cb.field_s = 8;
        this.field_Cb.field_J = this.field_mb + -this.field_Cb.field_mb >> -1039644223;
    }

    final void i(byte param0) {
        L0: {
          if (this.field_mb + this.field_T < on.field_e) {
            break L0;
          } else {
            if (on.field_h >= this.field_T) {
              L1: {
                un.field_d.a(this.field_zb, this.field_F + 50, (this.field_mb >> -1864076159) + this.field_T, 16777215, -1);
                if (param0 == -76) {
                  break L1;
                } else {
                  this.field_Db = 84;
                  break L1;
                }
              }
              pb.field_C.c(this.field_Eb, this.field_F + 160, -6 + this.field_T + this.field_mb, this.c(true), -1);
              return;
            } else {
              break L0;
            }
          }
        }
    }

    static {
        field_Ab = "Year";
        field_Jb = "Ignore";
        field_Fb = "Back";
        field_Gb = "Please remove <%0> from your ignore list first.";
        field_Bb = "in the Final";
        field_Ib = "Password: ";
    }
}
