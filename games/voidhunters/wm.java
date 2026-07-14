/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wm implements ntb {
    boolean field_a;
    static String field_b;

    public void a(faa param0, boolean param1) {
        ((wm) this).field_a = kv.a(param1, param0);
    }

    int[] a(pe param0, int param1, int[] param2) {
        if (param1 <= 16) {
            wm.a((byte) 30);
        }
        return param2;
    }

    final static tpa a(String[] args, byte param1) {
        tpa var2 = new tpa(false);
        if (param1 > -121) {
            return null;
        }
        var2.field_e = args;
        return var2;
    }

    public void a(tv param0, int param1) {
        wm var3 = (wm) (Object) param0;
        if (param1 >= -19) {
            return;
        }
        int var4 = 0;
        if ((!var3.field_a ? 1 : 0) != (!((wm) this).field_a ? 1 : 0)) {
            var4 = 1;
            System.out.println("boolean not has changed. before=" + var3.field_a + ", now=" + ((wm) this).field_a);
        }
        if (var4 != 0) {
            System.out.println("This instance of MissionCondition has changed");
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3 = 115 % ((param0 - 22) / 59);
        wm var4 = (wm) (Object) param1;
        return (!var4.field_a ? 1 : 0) != (!var4.field_a ? 1 : 0) ? true : false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        mab.field_f = param3;
        if (param2 < 92) {
            field_b = null;
        }
        tba.field_o = param1;
        kjb.field_p = param0;
        whb.field_a = param4;
    }

    public static void a(byte param0) {
        if (param0 > -45) {
            field_b = null;
        }
        field_b = null;
    }

    void a(pe param0, int param1, int param2, int param3) {
        if (param1 != -2) {
            Object var6 = null;
            tpa discarded$0 = wm.a((String[]) null, (byte) -97);
        }
    }

    int a(byte param0, int param1) {
        if (param0 > -102) {
            return -122;
        }
        return 0;
    }

    public void b(faa param0, int param1) {
        if (param1 > -109) {
            Object var4 = null;
            ((wm) this).a((pe) null, 68, -88, 56);
        }
        boolean discarded$0 = vq.a(param0, -119, ((wm) this).field_a);
    }

    String a(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            ((wm) this).b((byte) -4, (tv) null);
        }
        return this.toString();
    }

    ucb[] a(pe param0, int param1) {
        if (param1 == -20605) {
            return null;
        }
        Object var4 = null;
        ((wm) this).a((tv) null, -22);
        return null;
    }

    public void b(byte param0, tv param1) {
        wm var5 = (wm) (Object) param1;
        wm var6 = var5;
        if (param0 <= 54) {
            return;
        }
        var6.field_a = var5.field_a;
    }

    final static int[] a(int param0, byte param1, int[] param2) {
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        if (param1 > 57) {
          if (param2 != null) {
            if (param2.length != 0) {
              var3 = -1;
              var4_int = 0;
              L0: while (true) {
                L1: {
                  if (var4_int >= param2.length) {
                    break L1;
                  } else {
                    if (param2[var4_int] != param0) {
                      var4_int++;
                      continue L0;
                    } else {
                      var3 = var4_int;
                      break L1;
                    }
                  }
                }
                if (0 > var3) {
                  return param2;
                } else {
                  if (-2 != (param2.length ^ -1)) {
                    var4 = new int[-1 + param2.length];
                    var5 = 0;
                    var6 = 0;
                    L2: while (true) {
                      if (param2.length <= var6) {
                        return var4;
                      } else {
                        if (var6 != var3) {
                          var4[var5] = param2[var6];
                          var5++;
                          var6++;
                          continue L2;
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    boolean a(int param0, lbb param1, pe param2) {
        if (param0 != 0) {
            ((wm) this).field_a = false;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Close";
    }
}
