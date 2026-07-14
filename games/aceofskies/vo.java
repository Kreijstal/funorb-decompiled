/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vo extends li implements dr {
    static int[] field_d;
    private bm field_c;

    final static uc a(byte param0, int param1, int param2, int param3, int param4) {
        uc var5 = null;
        uc var5_ref = null;
        int var6 = 0;
        uc var7 = null;
        uc var8 = null;
        var5 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        if (param0 >= 120) {
          var5_ref = (uc) nh.field_g.d(268435455);
          L0: while (true) {
            if (var5_ref != null) {
              if (param4 != ((uc) var5_ref).field_n) {
                var5_ref = (uc) nh.field_g.b((byte) 103);
                continue L0;
              } else {
                return var5_ref;
              }
            } else {
              var7 = new uc();
              var7.field_n = param4;
              var7.field_j = param2;
              var7.field_m = param3;
              nh.field_g.a(81, (wf) (Object) var7);
              ag.a(param1, 5, var7);
              return var7;
            }
          }
        } else {
          field_d = (int[]) null;
          var5_ref = (uc) nh.field_g.d(268435455);
          L1: while (true) {
            if (var5_ref != null) {
              if (param4 != ((uc) var5).field_n) {
                var5_ref = (uc) nh.field_g.b((byte) 103);
                continue L1;
              } else {
                return var5;
              }
            } else {
              var8 = new uc();
              var5 = var8;
              var8.field_n = param4;
              var8.field_j = param2;
              var8.field_m = param3;
              nh.field_g.a(81, (wf) (Object) var8);
              ag.a(param1, 5, var8);
              return var8;
            }
          }
        }
    }

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 26921) {
          if (null != ((vo) this).field_c.field_f) {
            if (((vo) this).field_c.field_f.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_d = (int[]) null;
          if (null == ((vo) this).field_c.field_f) {
            return true;
          } else {
            L0: {
              if (((vo) this).field_c.field_f.length() != 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public final void b(bm param0, int param1) {
        if (param1 != -40) {
            bm var4 = (bm) null;
            ((vo) this).a((bm) null, -56);
        }
    }

    public final void a(bm param0, int param1) {
        ((vo) this).a((byte) 97);
        if (param1 != -6525) {
            bm var4 = (bm) null;
            ((vo) this).b((bm) null, -98);
        }
    }

    final String b(int param0) {
        String var3 = null;
        if (param0 != 8192) {
          var3 = (String) null;
          String discarded$2 = ((vo) this).a((String) null, (byte) -68);
          return ((vo) this).a(((vo) this).field_c.field_f, (byte) 72);
        } else {
          return ((vo) this).a(((vo) this).field_c.field_f, (byte) 72);
        }
    }

    abstract String a(String param0, byte param1);

    final pt c(int param0) {
        if (param0 != 0) {
          boolean discarded$2 = ((vo) this).a(83);
          return ((vo) this).a(((vo) this).field_c.field_f, param0 + 8192);
        } else {
          return ((vo) this).a(((vo) this).field_c.field_f, param0 + 8192);
        }
    }

    abstract pt a(String param0, int param1);

    vo(bm param0) {
        ((vo) this).field_c = param0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void d(int param0) {
        if (param0 != 14695) {
            vo.d(89);
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
