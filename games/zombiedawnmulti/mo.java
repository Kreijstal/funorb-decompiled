/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends cj {
    static long field_Gb;
    private cj field_Pb;
    static ao field_Lb;
    cj field_Mb;
    static th field_Fb;
    static cj field_Hb;
    static ri[] field_Ob;
    static int field_Kb;
    static String field_Nb;
    static int field_Ib;
    static hh field_Jb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((mo) this).a(param2, param5, param3, param4, -3344);
        if (param1 != 2) {
            return;
        }
        this.a(param0, -17369, param6);
    }

    public static void h(int param0) {
        field_Nb = null;
        field_Hb = null;
        field_Lb = null;
        if (param0 != 2) {
          field_Hb = null;
          field_Ob = null;
          field_Jb = null;
          field_Fb = null;
          return;
        } else {
          field_Ob = null;
          field_Jb = null;
          field_Fb = null;
          return;
        }
    }

    final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (param1) {
          L0: {
            field_Ob = null;
            var4 = -param2;
            if (((mo) this).field_Pb != null) {
              var4 = ((mo) this).field_Pb.e(0);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var5 = -param2;
            if (null == ((mo) this).field_Mb) {
              break L1;
            } else {
              var5 = ((mo) this).field_Mb.e(0);
              break L1;
            }
          }
          return param0 + param2 + param0 - (-var4 + -var5);
        } else {
          L2: {
            var4 = -param2;
            if (((mo) this).field_Pb != null) {
              var4 = ((mo) this).field_Pb.e(0);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var5 = -param2;
            if (null == ((mo) this).field_Mb) {
              break L3;
            } else {
              var5 = ((mo) this).field_Mb.e(0);
              break L3;
            }
          }
          return param0 + param2 + param0 - (-var4 + -var5);
        }
    }

    final static String a(String param0, int param1, int param2, String param3, ul param4) {
        if (!param4.a((byte) -119)) {
          return param3;
        } else {
          if (param2 != -3) {
            field_Kb = -26;
            return param0 + " - " + param4.a(param1, (byte) 121) + "%";
          } else {
            return param0 + " - " + param4.a(param1, (byte) 121) + "%";
          }
        }
    }

    final static void a(int param0, k param1, int param2, int param3, byte param4) {
        param1.a(-120, 12);
        param1.a(17, (byte) -56);
        if (param4 != -124) {
          field_Gb = 73L;
          param1.a(param0, (byte) -70);
          param1.a(param3, (byte) -42);
          param1.a(-118, param2);
          return;
        } else {
          param1.a(param0, (byte) -70);
          param1.a(param3, (byte) -42);
          param1.a(-118, param2);
          return;
        }
    }

    final static void i(int param0) {
        jg.field_a = false;
        if (param0 > -2) {
            mo.i(-59);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var4 = -param0;
          var5 = -param0;
          if (null != ((mo) this).field_Pb) {
            var4 = ((mo) this).field_Pb.e(param1 + 17369);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -17369) {
          L1: {
            if (null == ((mo) this).field_Mb) {
              break L1;
            } else {
              var5 = ((mo) this).field_Mb.a(-1, -param2 + -param0 + (-var4 + ((mo) this).field_zb + -param2));
              break L1;
            }
          }
          L2: {
            var6 = var5 + (var4 + (param2 + param0 - -param2));
            if (((mo) this).field_zb < var6) {
              var5 = var5 + (((mo) this).field_zb + -var6);
              var6 = ((mo) this).field_zb;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((((mo) this).field_R ^ -1) == -2) {
              param2 = param2 + (((mo) this).field_zb + -var6) / 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if ((((mo) this).field_R ^ -1) != -3) {
              break L4;
            } else {
              param2 = param2 + (-var6 + ((mo) this).field_zb);
              break L4;
            }
          }
          L5: {
            if (((mo) this).field_Pb != null) {
              ((mo) this).field_Pb.a(((mo) this).field_z, 0, var4, param2, param1 ^ 20183);
              ((mo) this).field_Pb.field_lb = ((mo) this).field_lb;
              break L5;
            } else {
              break L5;
            }
          }
          if (((mo) this).field_Mb != null) {
            ((mo) this).field_Mb.a(((mo) this).field_z, 0, var5, param2 - (-var4 + -param0), -3344);
            if (null != ((mo) this).field_Pb) {
              ((mo) this).field_Mb.field_R = 0;
              ((mo) this).field_Mb.field_lb = ((mo) this).field_lb;
              return;
            } else {
              ((mo) this).field_Mb.field_R = ((mo) this).field_R;
              ((mo) this).field_Mb.field_lb = ((mo) this).field_lb;
              return;
            }
          } else {
            return;
          }
        } else {
          L6: {
            field_Gb = -30L;
            if (null == ((mo) this).field_Mb) {
              break L6;
            } else {
              var5 = ((mo) this).field_Mb.a(-1, -param2 + -param0 + (-var4 + ((mo) this).field_zb + -param2));
              break L6;
            }
          }
          L7: {
            var6 = var5 + (var4 + (param2 + param0 - -param2));
            if (((mo) this).field_zb < var6) {
              var5 = var5 + (((mo) this).field_zb + -var6);
              var6 = ((mo) this).field_zb;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if ((((mo) this).field_R ^ -1) == -2) {
              param2 = param2 + (((mo) this).field_zb + -var6) / 2;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if ((((mo) this).field_R ^ -1) != -3) {
              break L9;
            } else {
              param2 = param2 + (-var6 + ((mo) this).field_zb);
              break L9;
            }
          }
          L10: {
            if (((mo) this).field_Pb != null) {
              ((mo) this).field_Pb.a(((mo) this).field_z, 0, var4, param2, param1 ^ 20183);
              ((mo) this).field_Pb.field_lb = ((mo) this).field_lb;
              break L10;
            } else {
              break L10;
            }
          }
          if (((mo) this).field_Mb != null) {
            ((mo) this).field_Mb.a(((mo) this).field_z, 0, var5, param2 - (-var4 + -param0), -3344);
            if (null != ((mo) this).field_Pb) {
              ((mo) this).field_Mb.field_R = 0;
              ((mo) this).field_Mb.field_lb = ((mo) this).field_lb;
              return;
            } else {
              ((mo) this).field_Mb.field_R = ((mo) this).field_R;
              ((mo) this).field_Mb.field_lb = ((mo) this).field_lb;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param4 <= param2) {
          if (param2 < param6) {
            ld.a(-12628, param6, param2, param5, param3, param4, param0, oo.field_i, param1);
            if (param7 <= 30) {
              mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
              return;
            } else {
              return;
            }
          } else {
            if (param4 < param6) {
              ld.a(-12628, param2, param6, param0, param3, param4, param5, oo.field_i, param1);
              if (param7 <= 30) {
                mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                return;
              } else {
                return;
              }
            } else {
              ld.a(-12628, param2, param4, param0, param5, param6, param3, oo.field_i, param1);
              if (param7 <= 30) {
                mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param4 >= param6) {
            if (param6 > param2) {
              ld.a(-12628, param4, param6, param3, param0, param2, param5, oo.field_i, param1);
              if (param7 > 30) {
                return;
              } else {
                mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                return;
              }
            } else {
              ld.a(-12628, param4, param2, param3, param5, param6, param0, oo.field_i, param1);
              if (param7 > 30) {
                return;
              } else {
                mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
                return;
              }
            }
          } else {
            ld.a(-12628, param6, param4, param5, param0, param2, param3, oo.field_i, param1);
            if (param7 <= 30) {
              mo.a(-113, 39, -55, 5, -113, 4, -124, (byte) 78);
              return;
            } else {
              return;
            }
          }
        }
    }

    mo(long param0, cj param1, cj param2, cj param3, ja param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((mo) this).field_Pb = new cj(0L, param2);
            ((mo) this).field_Pb.field_rb = param4;
            ((mo) this).a((byte) 50, ((mo) this).field_Pb);
        }
        if (param5 != null) {
            ((mo) this).field_Mb = new cj(0L, param3, param5);
            ((mo) this).a((byte) 50, ((mo) this).field_Mb);
        }
        ((mo) this).f(-128);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = new ao(10, 2, 2, 0);
        field_Kb = 22;
        field_Nb = "Your email address is used to identify this account";
        field_Fb = new th();
        field_Jb = new hh(1);
    }
}
