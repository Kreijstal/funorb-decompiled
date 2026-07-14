/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends je {
    static je field_Kb;
    static me field_Ib;
    static String field_Jb;
    private je field_Lb;
    static int field_Mb;
    je field_Ob;
    static String field_Pb;
    static kl field_Nb;

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param1;
          var5 = -param1;
          if (null != ((nf) this).field_Lb) {
            var4 = ((nf) this).field_Lb.j(98);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((nf) this).field_Ob == null) {
            break L1;
          } else {
            var5 = ((nf) this).field_Ob.a(true, -var4 + -param2 + ((nf) this).field_gb + -param1 - param2);
            break L1;
          }
        }
        L2: {
          var6 = param2 + (var5 + param2) + var4 - -param1;
          if (((nf) this).field_gb < var6) {
            var5 = var5 + (((nf) this).field_gb + -var6);
            var6 = ((nf) this).field_gb;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-2 == ((nf) this).field_Eb) {
            param2 = param2 + (((nf) this).field_gb + -var6) / 2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-3 != ((nf) this).field_Eb) {
            break L4;
          } else {
            param2 = param2 + (((nf) this).field_gb - var6);
            break L4;
          }
        }
        L5: {
          if (null != ((nf) this).field_Lb) {
            ((nf) this).field_Lb.a(((nf) this).field_ob, -20500, var4, 0, param2);
            ((nf) this).field_Lb.field_Fb = ((nf) this).field_Fb;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (param0 == -81) {
            break L6;
          } else {
            nf.k(94);
            break L6;
          }
        }
        L7: {
          if (null != ((nf) this).field_Ob) {
            ((nf) this).field_Ob.a(((nf) this).field_ob, -20500, var5, 0, var4 + param2 + param1);
            ((nf) this).field_Ob.field_Fb = ((nf) this).field_Fb;
            if (((nf) this).field_Lb == null) {
              ((nf) this).field_Ob.field_Eb = ((nf) this).field_Eb;
              break L7;
            } else {
              ((nf) this).field_Ob.field_Eb = 0;
              break L7;
            }
          } else {
            break L7;
          }
        }
    }

    final static int l(int param0) {
        if (param0 != 26136) {
            int discarded$0 = nf.l(77);
        }
        return kl.field_a.field_p[0];
    }

    public static void k(int param0) {
        field_Pb = null;
        field_Jb = null;
        field_Ib = null;
        field_Kb = null;
        if (param0 != 0) {
            field_Ib = null;
        }
        field_Nb = null;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = -param1;
        if (param0 > -32) {
            return 57;
        }
        int var5 = -param1;
        if (null != ((nf) this).field_Lb) {
            var4 = ((nf) this).field_Lb.j(125);
        }
        if (null != ((nf) this).field_Ob) {
            var5 = ((nf) this).field_Ob.j(102);
        }
        return param2 - (-var4 + -param1 - var5) - -param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param2 != -30061) {
            ((nf) this).a(46, -50, -114, 23, 28, -56, -92);
        }
        ((nf) this).a(param0, param2 + 9561, param3, param4, param5);
        this.a((byte) -81, param6, param1);
    }

    final static String a(boolean param0, String param1) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var2 = param1.length();
        if (!param0) {
            field_Ib = null;
        }
        char[] var3 = new char[var2];
        for (var4 = 0; var4 < var2; var4++) {
            var3[-var4 + var2 + -1] = param1.charAt(var4);
        }
        return new String(var3);
    }

    nf(long param0, je param1, je param2, je param3, wk param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((nf) this).field_Lb = new je(0L, param2);
            ((nf) this).field_Lb.field_cb = param4;
            ((nf) this).a(((nf) this).field_Lb, 60);
        }
        if (param5 != null) {
            ((nf) this).field_Ob = new je(0L, param3, param5);
            ((nf) this).a(((nf) this).field_Ob, 41);
        }
        ((nf) this).i(-10027);
    }

    final static boolean a(ls param0, ls param1, int param2) {
        if (!(param0.field_b >= param1.field_b)) {
            return true;
        }
        if (param0.field_b == param1.field_b) {
            if (!(param0.field_a >= param1.field_a)) {
                return true;
            }
        }
        if (param2 != 30549) {
            return false;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Jb = "Play free version";
        field_Ib = new me(13, 0, 1, 0);
        field_Pb = "Spells to affect the very ground itself.";
    }
}
