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
        Object var4 = null;
        var3 = aa.field_f;
        var3.g(param0, 15514);
        if (param2 != 65536) {
          var4 = null;
          uj.a(-62, (ue) null, 81);
          var3.e(160, 5);
          var3.e(160, 0);
          var3.b(1276387944, param1.field_o);
          var3.e(160, param1.field_m);
          var3.e(160, param1.field_s);
          return;
        } else {
          var3.e(160, 5);
          var3.e(160, 0);
          var3.b(1276387944, param1.field_o);
          var3.e(160, param1.field_m);
          var3.e(160, param1.field_s);
          return;
        }
    }

    uj(String param0, String param1, long param2) {
        super(0L, (ak) null);
        ((uj) this).field_Nb = param2;
        ((uj) this).field_Fb = param1;
        ((uj) this).field_Ub = param0;
        CharSequence var6 = (CharSequence) (Object) ((uj) this).field_Ub;
        String discarded$0 = dh.a(var6, (byte) 77);
    }

    final static aa a(boolean param0, byte param1) {
        pc var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        pc var8 = null;
        kp var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param1 > 84) {
          L0: {
            var8 = vi.field_o;
            var2 = var8;
            var3 = var8.f(255);
            fk.field_o = var3 & 127;
            if (0 == (128 & var3)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
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
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
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
            pb.field_j = lj.a(80, -57, (we) (Object) var8);
            oh.field_g = null;
            return new aa(param0);
          } else {
            var5 = var8.a((byte) 127);
            try {
              L5: {
                L6: {
                  var9 = jd.field_k.a(-21209, var5);
                  pb.field_j = var9.a((byte) -54);
                  if (op.field_t.equals((Object) (Object) kn.field_J)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                    break L6;
                  } else {
                    stackOut_22_0 = var9.field_u;
                    stackIn_24_0 = stackOut_22_0;
                    break L6;
                  }
                }
                oh.field_g = stackIn_24_0;
                break L5;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              jo.a(1, "CC1", (Throwable) (Object) var6);
              oh.field_g = null;
              pb.field_j = null;
              return new aa(param0);
            }
            return new aa(param0);
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, String param1) {
        Object var3 = null;
        if (param0 != -1710418464) {
          var3 = null;
          wg discarded$2 = uj.a((ae) null, 99, -60);
          kh.a(false, param1);
          ko.a(false, rl.field_e, -26027);
          return;
        } else {
          kh.a(false, param1);
          ko.a(false, rl.field_e, -26027);
          return;
        }
    }

    final boolean a(uj param0, byte param1) {
        int var3 = 89 % ((param1 - 8) / 62);
        if ((!param0.field_Jb ? 1 : 0) != (!((uj) this).field_Jb ? 1 : 0)) {
            return ((uj) this).field_Jb;
        }
        if (!(((uj) this).field_Vb == param0.field_Vb)) {
            return ((uj) this).field_Vb;
        }
        return ((uj) this).field_Pb < param0.field_Pb ? true : false;
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
        return !((uj) this).f(0) ? true : false;
    }

    final static wg a(ae param0, int param1, int param2) {
        long var3 = 0L;
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
        Object var20 = null;
        var3 = (long)param0.field_h;
        var5 = (long)param0.field_g;
        var7 = (long)param0.field_i;
        var9 = mi.d(-4096, param1);
        var10 = th.a(param1, 8191);
        var11 = (int)((long)var9 * var3 >> -1357951408);
        var12 = (int)(var5 * (long)var9 >> -20185072);
        var13 = (int)((long)var9 * var7 >> 675454736);
        var14 = (int)(var3 * (var3 * (long)(65536 - var10)) >> -1542885472);
        if (param2 != 0) {
          var20 = null;
          int discarded$1 = uj.a((byte) -55, (sc) null, (sc) null);
          var15 = (int)((long)(65536 + -var10) * var5 * var3 >> -1710418464);
          var16 = (int)((long)(65536 - var10) * (var3 * var7) >> -1905296800);
          var17 = (int)((long)(65536 - var10) * var5 * var5 >> -705633312);
          var18 = (int)((long)(-var10 + 65536) * var5 * var7 >> -1643120224);
          var19 = (int)(var7 * (var7 * (long)(-var10 + 65536)) >> 1115146208);
          return new wg(var14 + var10, var15 + var13, var16 + -var12, var15 + -var13, var10 - -var17, var11 - -var18, var12 + var16, var18 + -var11, var19 + var10);
        } else {
          var15 = (int)((long)(65536 + -var10) * var5 * var3 >> -1710418464);
          var16 = (int)((long)(65536 - var10) * (var3 * var7) >> -1905296800);
          var17 = (int)((long)(65536 - var10) * var5 * var5 >> -705633312);
          var18 = (int)((long)(-var10 + 65536) * var5 * var7 >> -1643120224);
          var19 = (int)(var7 * (var7 * (long)(-var10 + 65536)) >> 1115146208);
          return new wg(var14 + var10, var15 + var13, var16 + -var12, var15 + -var13, var10 - -var17, var11 - -var18, var12 + var16, var18 + -var11, var19 + var10);
        }
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
        Object var4 = null;
        if (param0 > -116) {
          field_Wb = false;
          var4 = null;
          return cn.a((String) null, 0, -127, false, param1, 0, param2);
        } else {
          var4 = null;
          return cn.a((String) null, 0, -127, false, param1, 0, param2);
        }
    }

    final void a(String param0, String param1, boolean param2) {
        ((uj) this).field_Ub = param1;
        if (param2) {
            return;
        }
        ((uj) this).field_Fb = param0;
        CharSequence var5 = (CharSequence) (Object) ((uj) this).field_Ub;
        String discarded$0 = dh.a(var5, (byte) 125);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "This option cannot be combined with the current settings for:  ";
    }
}
