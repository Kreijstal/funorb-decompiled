/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends cr {
    static String field_Ib;
    cr field_Jb;
    private cr field_Lb;
    static String field_Kb;
    static r field_Hb;

    public static void a(byte param0) {
        if (param0 >= -7) {
          field_Ib = null;
          field_Kb = null;
          field_Ib = null;
          field_Hb = null;
          return;
        } else {
          field_Kb = null;
          field_Ib = null;
          field_Hb = null;
          return;
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null == ((nk) this).field_Lb) {
            break L0;
          } else {
            var4 = ((nk) this).field_Lb.j(-21391);
            break L0;
          }
        }
        L1: {
          if (((nk) this).field_Jb == null) {
            break L1;
          } else {
            var5 = ((nk) this).field_Jb.b(2, -param0 + (-param2 + ((nk) this).field_Fb - var4) - param2);
            break L1;
          }
        }
        var6 = param2 + var5 + (param2 + var4) + param0;
        if (param1 == 29138) {
          L2: {
            if (var6 <= ((nk) this).field_Fb) {
              break L2;
            } else {
              var5 = var5 + (((nk) this).field_Fb + -var6);
              var6 = ((nk) this).field_Fb;
              break L2;
            }
          }
          L3: {
            if (1 != ((nk) this).field_O) {
              break L3;
            } else {
              param2 = param2 + (-var6 + ((nk) this).field_Fb) / 2;
              break L3;
            }
          }
          L4: {
            if (-3 == (((nk) this).field_O ^ -1)) {
              param2 = param2 + (-var6 + ((nk) this).field_Fb);
              break L4;
            } else {
              break L4;
            }
          }
          if (((nk) this).field_Lb == null) {
            if (((nk) this).field_Jb != null) {
              ((nk) this).field_Jb.a(79, var5, ((nk) this).field_db, 0, param0 + (param2 - -var4));
              if (((nk) this).field_Lb != null) {
                ((nk) this).field_Jb.field_O = 0;
                ((nk) this).field_Jb.field_ab = ((nk) this).field_ab;
                return;
              } else {
                ((nk) this).field_Jb.field_O = ((nk) this).field_O;
                ((nk) this).field_Jb.field_ab = ((nk) this).field_ab;
                return;
              }
            } else {
              return;
            }
          } else {
            ((nk) this).field_Lb.a(123, var4, ((nk) this).field_db, 0, param2);
            ((nk) this).field_Lb.field_ab = ((nk) this).field_ab;
            if (((nk) this).field_Jb != null) {
              ((nk) this).field_Jb.a(79, var5, ((nk) this).field_db, 0, param0 + (param2 - -var4));
              if (((nk) this).field_Lb != null) {
                ((nk) this).field_Jb.field_O = 0;
                ((nk) this).field_Jb.field_ab = ((nk) this).field_ab;
                return;
              } else {
                ((nk) this).field_Jb.field_O = ((nk) this).field_O;
                ((nk) this).field_Jb.field_ab = ((nk) this).field_ab;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((nk) this).a(86, param1, param3, param0, param6);
        if (param5 != 1) {
          nk.a((byte) -127);
          this.a(param2, 29138, param4);
          return;
        } else {
          this.a(param2, 29138, param4);
          return;
        }
    }

    final static void a(int param0, String[][] param1, r param2, byte param3, int param4, byte[] param5, er[][] param6, String[][] param7, String[] param8, byte[] param9, String[] param10, er[][] param11, r param12, r param13, int[] param14, int param15, boolean param16, u[] param17, int[] param18) {
        int var19 = -13 % ((param3 - -24) / 45);
        Object var20 = null;
        mj.a(1, param17, param2, param1, param5, param0, param6, param10, param11, param12, param14, param9, param7, (String[]) null, param16, param8, param18, -23161, param4, param13);
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param2 != -24692) {
            Object var6 = null;
            nk.a(-81, (String[][]) null, (r) null, (byte) -46, -84, (byte[]) null, (er[][]) null, (String[][]) null, (String[]) null, (byte[]) null, (String[]) null, (er[][]) null, (r) null, (r) null, (int[]) null, 45, true, (u[]) null, (int[]) null);
            var4 = -param1;
            if (((nk) this).field_Lb != null) {
                var4 = ((nk) this).field_Lb.j(-21391);
            }
            var5 = -param1;
            if (null != ((nk) this).field_Jb) {
                var5 = ((nk) this).field_Jb.j(-21391);
            }
            return param0 + (var4 - -param1) - (-var5 - param0);
        }
        var4 = -param1;
        if (((nk) this).field_Lb != null) {
            var4 = ((nk) this).field_Lb.j(-21391);
        }
        var5 = -param1;
        if (null != ((nk) this).field_Jb) {
            var5 = ((nk) this).field_Jb.j(-21391);
        }
        return param0 + (var4 - -param1) - (-var5 - param0);
    }

    nk(long param0, cr param1, cr param2, cr param3, er param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((nk) this).field_Lb = new cr(0L, param2);
            ((nk) this).field_Lb.field_Db = param4;
            ((nk) this).b(((nk) this).field_Lb, 119);
        }
        if (param5 != null) {
            ((nk) this).field_Jb = new cr(0L, param3, param5);
            ((nk) this).b(((nk) this).field_Jb, 122);
        }
        ((nk) this).i(-2147483648);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ib = "<%0> has declined the invitation.";
    }
}
