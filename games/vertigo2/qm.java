/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm extends cj implements ij {
    private d field_F;
    static ba field_G;
    private d field_E;
    private d field_H;

    public qm() {
        super(0, 0, 476, 225, (ur) null);
        this.field_F = new d(pk.field_r, (uf) null);
        this.field_E = new d(tc.field_a, (uf) null);
        this.field_H = new d(fd.field_o, (uf) null);
        vo var1 = new vo();
        this.field_F.field_B = (ur) ((Object) var1);
        this.field_E.field_B = (ur) ((Object) var1);
        this.field_H.field_B = (ur) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1234022113;
        this.field_E.a(false, -var3 + this.field_n >> 945809441, -48 + this.field_s + -var2, 30, var4);
        this.field_H.a(false, var2 + (-var3 + this.field_n >> 148084577) + var4, -var2 + (this.field_s - 48), 30, var4);
        this.field_F.a(false, -var3 + this.field_n >> 1595309921, -(var2 * 2) + this.field_s - 78, 30, var3);
        this.field_E.field_v = (uf) (this);
        this.field_F.field_v = (uf) (this);
        this.field_H.field_v = (uf) (this);
        this.field_F.field_q = ni.field_h;
        this.field_H.field_q = he.field_z;
        this.c((byte) -30, this.field_E);
        this.c((byte) 113, this.field_F);
        this.c((byte) -29, this.field_H);
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 13) {
              if (!super.a(param0, param1 + 0, param2, param3)) {
                if (98 == param2) {
                  stackIn_9_0 = this.a(32345, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param2 != 99) {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = this.b((byte) -124, param3);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("qm.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0 != 0;
              }
            }
          }
        }
    }

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        int var7 = Vertigo2.field_L ? 1 : 0;
        try {
            if (this.field_E == param1) {
                sd.f((byte) -1);
            } else {
                if (param1 == this.field_F || param1 == this.field_H) {
                    ff.b((byte) -104);
                }
            }
            int var6_int = 21 % ((param2 - -63) / 51);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "qm.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -104) {
            return 123;
        }
        return (60 & param0) >> -801510430;
    }

    final static boolean a(int[] param0, String param1, byte param2, int param3, long param4) {
        aa var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 76) {
                break L1;
              } else {
                field_G = (ba) null;
                break L1;
              }
            }
            if (!lk.a(1, param4, param1, param3, param0)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if ((param3 ^ -1) != -2) {
                  break L2;
                } else {
                  param3 = 0;
                  break L2;
                }
              }
              ui.field_g = param3;
              ea.field_b = param1;
              var7 = (CharSequence) ((Object) param1);
              sm.field_Kb = rc.a(var7, 320);
              ie.field_Nb = param4;
              var6 = ag.a(fo.field_c, mp.field_g, 40, param0, va.field_h);
              hh.a(-42, var6);
              stackIn_9_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var6_ref);

            stackIn_12_1 = new StringBuilder().append("qm.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = this.field_o - -param2;
        int var6 = this.field_t + param3;
        qc.field_x.a(kl.field_Jb, var5 - -20, var6 + 20, -40 + this.field_n, -50 + this.field_s, 16777215, -1, 1, 0, qc.field_x.field_z);
        super.a(param0, param1, param2, param3);
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 > -80) {
            field_G = (ba) null;
        }
    }

    static {
        field_G = new ba();
    }
}
