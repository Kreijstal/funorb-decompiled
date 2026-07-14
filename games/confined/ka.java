/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka extends pm {
    private double field_O;
    private oi field_I;
    static int field_P;
    static mi field_N;
    private int field_J;
    static volatile int field_L;
    double field_K;
    static byte[] field_F;
    static String field_G;
    gk field_M;

    void a(boolean param0, ee param1) {
        if (!param0) {
            field_P = -79;
        }
    }

    final boolean f(int param0) {
        if (param0 > -54) {
            boolean discarded$0 = ((ka) this).g((byte) 11);
            return false;
        }
        return false;
    }

    ka(pm param0, double param1, bi param2) {
        this(param0.field_A, param0.field_E, param0.field_t, param0.field_D, param0.field_C * param1, param2);
    }

    final void a(int param0, vg param1) {
        if (param0 != -1) {
            field_F = null;
        }
    }

    final void a(int param0, int param1) {
        ((ka) this).field_K = ((ka) this).field_K + ((ka) this).field_O;
        ((ka) this).field_J = (int)((ka) this).field_K;
        if (param0 == 11878) {
          if (((ka) this).field_J >= uc.field_db.length) {
            ((ka) this).field_z = true;
            if (null != ((ka) this).field_M) {
              ((ka) this).field_M.field_t = null;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ka) this).a(96, -128);
          if (((ka) this).field_J >= uc.field_db.length) {
            ((ka) this).field_z = true;
            if (null == ((ka) this).field_M) {
              return;
            } else {
              ((ka) this).field_M.field_t = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            field_G = null;
            return false;
        }
        return false;
    }

    void a(int param0, hf param1) {
        if (param0 >= -29) {
            Object var4 = null;
            ((ka) this).a(-79, (mb) null);
        }
    }

    void a(int param0, mb param1) {
        if (param0 != -23154) {
            ((ka) this).field_K = -0.9744507612027556;
        }
    }

    final void a(mn param0, byte param1) {
        ((ka) this).field_I.field_t = ((ka) this).field_E;
        ((ka) this).field_I.field_o = ((ka) this).field_t;
        ((ka) this).field_I.field_p = ((ka) this).field_D;
        ((ka) this).field_I.field_u = ((ka) this).field_C * (((ka) this).field_C * (64.0 / (double)uc.field_db.length)) * ((double)uc.field_db.length - ((ka) this).field_K);
        int var3 = -113 % ((-2 - param1) / 62);
        param0.a((rk) (Object) ((ka) this).field_I, (byte) -108);
    }

    boolean g(byte param0) {
        if (param0 < 64) {
            field_P = -1;
            return false;
        }
        return false;
    }

    void a(int param0, ah param1) {
        int var3 = 98 % ((param0 - 14) / 53);
    }

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 >= -5) {
          field_G = null;
          ((ka) this).a(-13, uc.field_db[((ka) this).field_J], param1, param3);
          return;
        } else {
          ((ka) this).a(-13, uc.field_db[((ka) this).field_J], param1, param3);
          return;
        }
    }

    final static String a(mi param0, String param1, int param2, String param3) {
        if (param0.b(param2 + 12)) {
          if (param2 != -12) {
            field_G = null;
            return param3 + " - " + param0.c(-123) + "%";
          } else {
            return param3 + " - " + param0.c(-123) + "%";
          }
        } else {
          return param1;
        }
    }

    void a(pm param0, int param1) {
        if (param1 >= -81) {
            ((ka) this).field_O = 2.3214224287080496;
        }
    }

    final static boolean k(int param0) {
        if (param0 != -58) {
            return true;
        }
        return in.field_h;
    }

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Confined.field_J ? 1 : 0;
          var2 = param0.length();
          if (var2 > 20) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        if (param1 != 23617) {
          return null;
        } else {
          var4 = 0;
          L1: while (true) {
            if (var2 <= var4) {
              return new String(var8);
            } else {
              L2: {
                var5 = param0.charAt(var4);
                if (var5 < 65) {
                  break L2;
                } else {
                  if (90 >= var5) {
                    var3[var4] = (char)(97 + (var5 + -65));
                    var4++;
                    var4++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  if (var5 < 97) {
                    break L4;
                  } else {
                    if (var5 <= 122) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 48) {
                    break L5;
                  } else {
                    if (var5 > 57) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                var4++;
                continue L1;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L1;
            }
          }
        }
    }

    void a(boolean param0, il param1) {
        if (param0) {
            Object var4 = null;
            ((ka) this).a(98, (mb) null);
        }
    }

    final boolean a(pm param0, byte param1) {
        if (param1 != 72) {
            field_G = null;
            return false;
        }
        return false;
    }

    void a(byte param0, sa param1) {
        if (param0 != 9) {
            Object var4 = null;
            ((ka) this).a((pm) null, 62);
        }
    }

    final boolean a(boolean param0, pm param1) {
        if (!param0) {
            Object var4 = null;
            ((ka) this).a((cl) null, (byte) -89);
            return false;
        }
        return false;
    }

    final boolean i(int param0) {
        if (param0 != 8) {
            field_N = null;
            return false;
        }
        return false;
    }

    void a(cl param0, byte param1) {
        int var3 = -120 / ((-35 - param1) / 60);
    }

    ka(hn param0, double param1, double param2, double param3, double param4, bi param5) {
        super(param0, param1, param2, param3, param4);
        ((ka) this).field_J = 0;
        ((ka) this).field_K = 0.0;
        ((ka) this).field_I = new oi((pm) this);
        ((ka) this).field_O = (double)uc.field_db.length / (Math.pow(param4, 0.3333333333333333) * 64.0);
        if (param5 != null) {
            ((ka) this).field_M = new gk((pm) this, param5, 0);
        }
    }

    public static void l(int param0) {
        if (param0 != 0) {
            field_P = 76;
            field_G = null;
            field_N = null;
            field_F = null;
            return;
        }
        field_G = null;
        field_N = null;
        field_F = null;
    }

    final void a(hm param0, boolean param1) {
        if (!param1) {
            field_F = null;
        }
    }

    final void a(kh param0, int param1) {
        if (param1 <= 122) {
            field_N = null;
        }
    }

    final static boolean h(byte param0) {
        ag.field_h = true;
        int var1 = -51 / ((param0 - 22) / 43);
        ec.field_e = ri.a(-3) - -15000L;
        return (rk.field_e ^ -1) == -12 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = 0;
        field_G = "Error connecting to server. Please try using a different server.";
    }
}
