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

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        CharSequence var4_ref_CharSequence = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Pixelate.field_H ? 1 : 0;
        if (param2 != 0) {
          if ((param2 ^ -1) == -2) {
            var10 = param0[param1];
            var4_ref_CharSequence = var10;
            if (var4_ref_CharSequence != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param1 + param2;
            if (param3 == 21197) {
              var5 = 0;
              var6_int = param1;
              L0: while (true) {
                if (var6_int >= var4) {
                  var6 = new StringBuilder(var5);
                  var7 = param1;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param0[var7];
                      if (var8 == null) {
                        StringBuilder discarded$2 = var6.append("null");
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append(var8);
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  var7_ref_CharSequence = param0[var6_int];
                  if (var7_ref_CharSequence == null) {
                    var5 += 4;
                    var6_int++;
                    continue L0;
                  } else {
                    var5 = var5 + var7_ref_CharSequence.length();
                    var6_int++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return "";
        }
    }

    public static void b(byte param0) {
        field_Rb = null;
        if (param0 < 121) {
            Object var2 = null;
            String discarded$0 = pi.a((CharSequence[]) null, -85, 35, 38);
        }
    }

    pi(pi param0) {
        this((ak) (Object) param0, param0.field_Kb, param0.field_Pb, param0.field_Jb, param0.field_Ob, param0.field_Nb, param0.field_Lb, param0.field_Eb, param0.field_Qb);
    }

    final void a(String param0, byte param1, int param2) {
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
    }

    final static Boolean c(byte param0) {
        Boolean var1 = kj.field_j;
        if (param0 != 104) {
            Object var2 = null;
            String discarded$0 = pi.a((CharSequence[]) null, 88, -25, -27);
        }
        kj.field_j = null;
        return var1;
    }

    final void a(int param0, int param1, tf param2, String param3) {
        ((pi) this).field_Ib[((pi) this).field_Hb] = new lo((long)param0, (ak) null, (ak) null, ((pi) this).field_Jb, param2, param3);
        ((pi) this).field_Ib[((pi) this).field_Hb].field_ab = ((pi) this).field_Kb;
        ((pi) this).field_Ib[((pi) this).field_Hb].field_A = true;
        ((pi) this).field_Ib[((pi) this).field_Hb].field_kb = 1;
        ((pi) this).a((ak) (Object) ((pi) this).field_Ib[((pi) this).field_Hb], (byte) 26);
        ((pi) this).field_Mb[((pi) this).field_Hb] = param1;
        ((pi) this).field_Hb = ((pi) this).field_Hb + 1;
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
        for (var3 = 0; (((pi) this).field_Hb ^ -1) < (var3 ^ -1); var3++) {
            if (-1 != (((pi) this).field_Ib[var3].field_P ^ -1)) {
                return ((pi) this).field_Mb[var3];
            }
        }
        if (-1 != (nm.field_c ^ -1)) {
            return -1;
        }
        return ((pi) this).field_Gb;
    }

    final boolean j(int param0) {
        if (!((((pi) this).field_Gb ^ -1) == 1)) {
            return false;
        }
        int var2 = -31 / ((71 - param0) / 52);
        if ((ke.field_a ^ -1) != -14) {
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
        ((pi) this).field_Kb = param1;
        ((pi) this).field_Jb = param3;
        ((pi) this).field_Lb = param6;
        ((pi) this).field_Qb = param8;
        ((pi) this).field_Nb = param5;
        ((pi) this).field_Eb = param7;
        ((pi) this).field_Ob = param4;
        ((pi) this).field_Pb = param2;
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
            var8 = ui.a(param4, param1, var6, (byte) -1);
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
