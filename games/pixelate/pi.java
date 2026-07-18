/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends ak {
    private int field_Qb;
    static te field_Rb;
    private int field_Nb;
    private int field_Eb;
    private int field_Lb;
    private int[] field_Mb;
    private ak field_Pb;
    static int field_Fb;
    private int field_Gb;
    private int field_Ob;
    private lo[] field_Ib;
    private ak field_Jb;
    private tf[] field_Kb;
    private int field_Hb;

    final static String a(CharSequence[] param0, int param1, int param2) {
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        String stackOut_25_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param2 != 0) {
              if (param2 == 1) {
                var10 = param0[0];
                var4 = var10;
                if (var4 != null) {
                  stackOut_9_0 = ((Object) (Object) var10).toString();
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  stackOut_7_0 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                var4_int = param2;
                var5 = 0;
                var6_int = 0;
                L1: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = 0;
                    L2: while (true) {
                      if (var7 >= var4_int) {
                        stackOut_25_0 = var6.toString();
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        L3: {
                          var8 = param0[var7];
                          if (var8 == null) {
                            StringBuilder discarded$5 = var6.append("null");
                            break L3;
                          } else {
                            StringBuilder discarded$6 = var6.append(var8);
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L4;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L4;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = "";
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4_ref;
            stackOut_27_1 = new StringBuilder().append("pi.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + 0 + ',' + param2 + ',' + 21197 + ')');
        }
        return stackIn_26_0;
    }

    public static void b() {
        field_Rb = null;
    }

    pi(pi param0) {
        this((ak) (Object) param0, param0.field_Kb, param0.field_Pb, param0.field_Jb, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Eb, param0.field_Qb);
    }

    final void a(String param0, byte param1, int param2) {
        try {
            ((pi) this).field_Ib[((pi) this).field_Hb] = new lo(0L, (ak) null, (ak) null, ((pi) this).field_Jb, (tf) null, param0);
            ((pi) this).field_Ib[((pi) this).field_Hb].field_ab = ((pi) this).field_Kb;
            ((pi) this).field_Ib[((pi) this).field_Hb].field_A = true;
            ((pi) this).field_Ib[((pi) this).field_Hb].field_kb = 1;
            ((pi) this).a((ak) (Object) ((pi) this).field_Ib[((pi) this).field_Hb], (byte) 26);
            ((pi) this).field_Mb[((pi) this).field_Hb] = param2;
            if (param1 > -23) {
                ((pi) this).field_Pb = null;
            }
            ((pi) this).field_Hb = ((pi) this).field_Hb + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pi.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = kj.field_j;
        kj.field_j = null;
        return var1;
    }

    final void a(int param0, int param1, tf param2, String param3) {
        try {
            ((pi) this).field_Ib[((pi) this).field_Hb] = new lo((long)param0, (ak) null, (ak) null, ((pi) this).field_Jb, param2, param3);
            ((pi) this).field_Ib[((pi) this).field_Hb].field_ab = ((pi) this).field_Kb;
            ((pi) this).field_Ib[((pi) this).field_Hb].field_A = true;
            ((pi) this).field_Ib[((pi) this).field_Hb].field_kb = 1;
            ((pi) this).a((ak) (Object) ((pi) this).field_Ib[((pi) this).field_Hb], (byte) 26);
            ((pi) this).field_Mb[((pi) this).field_Hb] = param1;
            ((pi) this).field_Hb = ((pi) this).field_Hb + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pi.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        ((pi) this).a(param0 ^ 24573, param1);
        if (!(param1)) {
            return -2;
        }
        if (param0 != -12487) {
            return 40;
        }
        for (var3 = 0; ~((pi) this).field_Hb < ~var3; var3++) {
            if (((pi) this).field_Ib[var3].field_P != 0) {
                return ((pi) this).field_Mb[var3];
            }
        }
        if (nm.field_c != 0) {
            return -1;
        }
        return ((pi) this).field_Gb;
    }

    final boolean j(int param0) {
        if (!(((pi) this).field_Gb == -2)) {
            return false;
        }
        int var2 = -31 / ((71 - param0) / 52);
        if (ke.field_a != 13) {
            return true;
        }
        ((pi) this).field_Gb = -1;
        return true;
    }

    pi(ak param0, tf[] param1, ak param2, ak param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((pi) this).field_Mb = new int[256];
        ((pi) this).field_Gb = -2;
        ((pi) this).field_Ib = new lo[256];
        try {
            ((pi) this).field_Kb = param1;
            ((pi) this).field_Jb = param3;
            ((pi) this).field_Lb = param6;
            ((pi) this).field_Qb = param8;
            ((pi) this).field_Nb = param5;
            ((pi) this).field_Eb = param7;
            ((pi) this).field_Ob = param4;
            ((pi) this).field_Pb = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Pixelate.field_H ? 1 : 0;
          if (((pi) this).field_Hb != 0) {
            break L0;
          } else {
            ((pi) this).field_Ib[((pi) this).field_Hb] = new lo(0L, (ak) null, (ak) null, ((pi) this).field_Pb, (tf) null, ln.field_l);
            ((pi) this).field_Ib[((pi) this).field_Hb].field_kb = 1;
            ((pi) this).a((ak) (Object) ((pi) this).field_Ib[((pi) this).field_Hb], (byte) 26);
            ((pi) this).field_Mb[((pi) this).field_Hb] = -1;
            ((pi) this).field_Hb = ((pi) this).field_Hb + 1;
            break L0;
          }
        }
        L1: {
          var6 = 0;
          if (param2 >= 12) {
            break L1;
          } else {
            ((pi) this).field_Hb = 83;
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          if (var7 >= ((pi) this).field_Hb) {
            var6 = var6 + 2 * ((pi) this).field_Ob;
            var7 = ((pi) this).field_Qb * ((pi) this).field_Hb + (((pi) this).field_Eb - -((pi) this).field_Eb);
            int discarded$1 = -1;
            var8 = ui.a(param4, param1, var6);
            var9 = pj.a(var7, param3, param0, (byte) 45);
            ((pi) this).a(var9, var7, var8, 256, var6);
            var10 = 0;
            L3: while (true) {
              if (var10 >= ((pi) this).field_Hb) {
                return;
              } else {
                ((pi) this).field_Ib[var10].a(((pi) this).field_Qb, ((pi) this).field_Nb, ((pi) this).field_Lb, ((pi) this).field_Eb - -(((pi) this).field_Qb * var10), ((pi) this).field_Ob, var6 - 2 * ((pi) this).field_Ob, -2147483648);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = ((pi) this).field_Ib[var7].c(-25469, ((pi) this).field_Lb, ((pi) this).field_Nb);
            if (var6 < var8) {
              var6 = var8;
              var7++;
              continue L2;
            } else {
              var7++;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = 10;
    }
}
