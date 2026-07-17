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
                Object var4 = null;
                uj.a(-62, (ue) null, 81);
            }
            var3.e(160, 5);
            var3.e(160, 0);
            var3.b(1276387944, param1.field_o);
            var3.e(160, param1.field_m);
            var3.e(160, param1.field_s);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uj.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    uj(String param0, String param1, long param2) {
        super(0L, (ak) null);
        CharSequence var6 = null;
        try {
            ((uj) this).field_Nb = param2;
            ((uj) this).field_Fb = param1;
            ((uj) this).field_Ub = param0;
            var6 = (CharSequence) (Object) ((uj) this).field_Ub;
            String discarded$0 = dh.a(var6, (byte) 77);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          var8 = vi.field_o;
          var2 = var8;
          var3 = var8.f(255);
          fk.field_o = var3 & 127;
          if (0 == (128 & var3)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          uc.field_n = stackIn_3_0 != 0;
          lj.field_d = var8.f(255);
          cd.field_g = var8.a(false);
          if (fk.field_o == 2) {
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
          if (var8.f(255) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
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
          if (fk.field_o == 1) {
            op.field_s = var8.a((byte) -4);
            cl.field_h = var8.h(5);
            break L4;
          } else {
            if (fk.field_o == 4) {
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
                  stackOut_21_0 = null;
                  stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                } else {
                  stackOut_20_0 = var9.field_u;
                  stackIn_22_0 = stackOut_20_0;
                  break L6;
                }
              }
              oh.field_g = stackIn_22_0;
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
    }

    final static void a(int param0, String param1) {
        try {
            kh.a(false, param1);
            ko.a(false, rl.field_e, -26027);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uj.I(" + -1710418464 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(uj param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_7_0 = false;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var3_int = 89 % ((param1 - 8) / 62);
              if (param0.field_Jb) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((uj) this).field_Jb) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            if (stackIn_6_0 == stackIn_6_1) {
              if (((uj) this).field_Vb != param0.field_Vb) {
                stackOut_11_0 = ((uj) this).field_Vb;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                L3: {
                  if (((uj) this).field_Pb >= param0.field_Pb) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                break L0;
              }
            } else {
              stackOut_7_0 = ((uj) this).field_Jb;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("uj.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 41);
        }
        return stackIn_16_0 != 0;
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

    final static wg a(ae param0, int param1) {
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
        wg stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        wg stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_long = (long)param0.field_h;
            var5 = (long)param0.field_g;
            var7 = (long)param0.field_i;
            var9 = mi.d(-4096, param1);
            var10 = th.a(param1, 8191);
            var11 = (int)((long)var9 * var3_long >> 16);
            var12 = (int)(var5 * (long)var9 >> 16);
            var13 = (int)((long)var9 * var7 >> 16);
            var14 = (int)(var3_long * (var3_long * (long)(65536 - var10)) >> 32);
            var15 = (int)((long)(65536 + -var10) * var5 * var3_long >> 32);
            var16 = (int)((long)(65536 - var10) * (var3_long * var7) >> 32);
            var17 = (int)((long)(65536 - var10) * var5 * var5 >> 32);
            var18 = (int)((long)(-var10 + 65536) * var5 * var7 >> 32);
            var19 = (int)(var7 * (var7 * (long)(-var10 + 65536)) >> 32);
            stackOut_0_0 = new wg(var14 + var10, var15 + var13, var16 + -var12, var15 + -var13, var10 - -var17, var11 - -var18, var12 + var16, var18 + -var11, var19 + var10);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("uj.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 44 + 0 + 41);
        }
        return stackIn_1_0;
    }

    public static void d() {
        field_Kb = null;
    }

    final static int a(byte param0, sc param1, sc param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = null;
            stackOut_0_0 = cn.a((String) null, 0, -127, false, param1, 0, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("uj.D(").append(-127).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_1_0;
    }

    final void a(String param0, String param1, boolean param2) {
        CharSequence var5 = null;
        ((uj) this).field_Ub = param1;
        if (param2) {
            return;
        }
        try {
            ((uj) this).field_Fb = param0;
            var5 = (CharSequence) (Object) ((uj) this).field_Ub;
            String discarded$0 = dh.a(var5, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "uj.G(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Kb = "This option cannot be combined with the current settings for:  ";
    }
}
