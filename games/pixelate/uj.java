/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends ak {
    boolean field_Vb;
    long field_Nb;
    String field_Fb;
    static int field_Ob;
    String field_Ub;
    ak field_Sb;
    int field_Ib;
    int field_Yb;
    ak field_Mb;
    ak field_Gb;
    long field_Pb;
    boolean field_Xb;
    static boolean field_Wb;
    static boolean field_Lb;
    ak field_Hb;
    int field_Eb;
    int field_Rb;
    int field_Qb;
    ak field_Zb;
    static String field_Kb;
    int field_Tb;
    boolean field_Jb;

    final static void a(int param0, ue param1, int param2) {
        pc var3 = null;
        try {
            var3 = aa.field_f;
            var3.g(param0, 15514);
            if (param2 != 65536) {
                ue var4 = (ue) null;
                uj.a(-62, (ue) null, 81);
            }
            var3.e(160, 5);
            var3.e(160, 0);
            var3.b(1276387944, param1.field_o);
            var3.e(160, param1.field_m);
            var3.e(160, param1.field_s);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "uj.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    uj(String param0, String param1, long param2) {
        super(0L, (ak) null);
        CharSequence var6 = null;
        try {
            this.field_Nb = param2;
            this.field_Fb = param1;
            this.field_Ub = param0;
            var6 = (CharSequence) ((Object) this.field_Ub);
            dh.a(var6, (byte) 77);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "uj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static aa a(boolean param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        pc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pc var8 = null;
        kp var9 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param1 > 84) {
          L0: {
            var8 = vi.field_o;
            var2 = var8;
            var3 = var8.f(255);
            fk.field_o = var3 & 127;
            if (0 == (128 & var3)) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          L1: {
            uc.field_n = stackIn_5_0 != 0;
            lj.field_d = var8.f(255);
            cd.field_g = var8.a(false);
            if ((fk.field_o ^ -1) == -3) {
              qf.field_b = var8.a((byte) 2);
              kn.field_I = var8.c((byte) 13);
              break L1;
            } else {
              qf.field_b = 0;
              kn.field_I = 0;
              break L1;
            }
          }
          L2: {
            if ((var8.f(255) ^ -1) != -2) {
              stackIn_11_0 = 0;
              break L2;
            } else {
              stackIn_11_0 = 1;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_11_0;
            dd.field_a = var8.h(5);
            if (var4 == 0) {
              op.field_t = dd.field_a;
              break L3;
            } else {
              op.field_t = var8.h(5);
              break L3;
            }
          }
          L4: {
            if ((fk.field_o ^ -1) == -2) {
              op.field_s = var8.a((byte) -4);
              cl.field_h = var8.h(5);
              break L4;
            } else {
              if (-5 == (fk.field_o ^ -1)) {
                op.field_s = var8.a((byte) -4);
                cl.field_h = var8.h(5);
                break L4;
              } else {
                op.field_s = 0;
                cl.field_h = null;
                break L4;
              }
            }
          }
          if (!param0) {
            pb.field_j = lj.a(80, -57, var8);
            oh.field_g = null;
            return new aa(param0);
          } else {
            var5 = var8.a((byte) 127);
            try {
              L5: {
                L6: {
                  var9 = jd.field_k.a(-21209, var5);
                  pb.field_j = var9.a((byte) -54);
                  if (op.field_t.equals(kn.field_J)) {
                    stackIn_24_0 = null;
                    break L6;
                  } else {
                    stackIn_24_0 = var9.field_u;
                    break L6;
                  }
                }
                oh.field_g = stackIn_24_0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              jo.a(1, "CC1", (Throwable) ((Object) var6));
              oh.field_g = null;
              pb.field_j = null;
              return new aa(param0);
            }
            return new aa(param0);
          }
        } else {
          return (aa) null;
        }
    }

    final static void a(int param0, String param1) {
        try {
            if (param0 != -1710418464) {
                ae var3 = (ae) null;
                uj.a((ae) null, 99, -60);
            }
            kh.a(false, param1);
            ko.a(false, rl.field_e, -26027);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "uj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(uj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 89 % ((param1 - 8) / 62);
              if (param0.field_Jb) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (this.field_Jb) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            if (stackIn_3_0 == stackIn_6_1) {
              if (this.field_Vb != param0.field_Vb) {
                stackIn_12_0 = this.field_Vb;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (this.field_Pb >= param0.field_Pb) {
                    stackIn_16_0 = 0;
                    break L3;
                  } else {
                    stackIn_16_0 = 1;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_8_0 = this.field_Jb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("uj.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    final static void j(int param0) {
        to.field_s = false;
        dk.field_c = false;
        te.a(-1, -2671);
        qo.field_n = wm.field_a;
        tm.field_X = wm.field_a;
        if (param0 != -705633312) {
            uj.j(-5);
        }
    }

    final boolean b(byte param0) {
        int var2 = 92 % ((-23 - param0) / 35);
        return !this.f(0) ? true : false;
    }

    final static wg a(ae param0, int param1, int param2) {
        long var3_long = 0L;
        RuntimeException var3 = null;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        sc var20 = null;
        wg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_long = (long)param0.field_h;
              var5 = (long)param0.field_g;
              var7 = (long)param0.field_i;
              var9 = mi.d(-4096, param1);
              var10 = th.a(param1, 8191);
              var11 = (int)((long)var9 * var3_long >> -1357951408);
              var12 = (int)(var5 * (long)var9 >> -20185072);
              var13 = (int)((long)var9 * var7 >> 675454736);
              var14 = (int)(var3_long * (var3_long * (long)(65536 - var10)) >> -1542885472);
              if (param2 == 0) {
                break L1;
              } else {
                var20 = (sc) null;
                uj.a((byte) -55, (sc) null, (sc) null);
                break L1;
              }
            }
            var15 = (int)((long)(65536 + -var10) * var5 * var3_long >> -1710418464);
            var16 = (int)((long)(65536 - var10) * (var3_long * var7) >> -1905296800);
            var17 = (int)((long)(65536 - var10) * var5 * var5 >> -705633312);
            var18 = (int)((long)(-var10 + 65536) * var5 * var7 >> -1643120224);
            var19 = (int)(var7 * (var7 * (long)(-var10 + 65536)) >> 1115146208);
            stackIn_3_0 = new wg(var14 + var10, var15 + var13, var16 + -var12, var15 + -var13, var10 - -var17, var11 - -var18, var12 + var16, var18 + -var11, var19 + var10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("uj.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void d(boolean param0) {
        if (!param0) {
            uj.j(49);
            field_Kb = null;
            return;
        }
        field_Kb = null;
    }

    final static int a(byte param0, sc param1, sc param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -116) {
                break L1;
              } else {
                field_Wb = false;
                break L1;
              }
            }
            var4 = (String) null;
            stackIn_3_0 = cn.a((String) null, 0, -127, false, param1, 0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("uj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(String param0, String param1, boolean param2) {
        CharSequence var5 = null;
        this.field_Ub = param1;
        if (param2) {
            return;
        }
        try {
            this.field_Fb = param0;
            var5 = (CharSequence) ((Object) this.field_Ub);
            dh.a(var5, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "uj.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_Kb = "This option cannot be combined with the current settings for:  ";
    }
}
