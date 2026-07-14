/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsb extends wm implements ntb {
    static int field_d;
    private int field_c;
    static String[] field_e;

    public final void a(tv param0, int param1) {
        super.a(param0, -47);
        jsb var3 = (jsb) (Object) param0;
        int var4 = 0;
        if (var3.field_c != var3.field_c) {
            var4 = 1;
            System.out.println("int team_id has changed. before=" + var3.field_c + ", now=" + var3.field_c);
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of MissionConditionShipJustSpawned has changed");
        }
        if (param1 >= -19) {
            field_d = -49;
        }
    }

    final ucb[] a(pe param0, int param1) {
        if (param1 == -20605) {
            return null;
        }
        return null;
    }

    final int[] a(pe param0, int param1, int[] param2) {
        sg[] var4 = null;
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          var4 = param0.d(1000);
          if (param1 > 16) {
            break L0;
          } else {
            String discarded$2 = ((jsb) this).a(-56);
            break L0;
          }
        }
        var5 = var4;
        var6 = 0;
        L1: while (true) {
          if (var5.length <= var6) {
            return param2;
          } else {
            var7 = var5[var6];
            if (var7 != null) {
              if (var7.q((byte) 114) == ((jsb) this).field_c) {
                if (!var7.l((byte) -10)) {
                  if (var7.o((byte) -117) >= 0) {
                    if (var7.field_D) {
                      param2 = qi.a(var7.c(false), true, param2, (byte) -14);
                      var6++;
                      continue L1;
                    } else {
                      var6++;
                      continue L1;
                    }
                  } else {
                    var6++;
                    continue L1;
                  }
                } else {
                  var6++;
                  continue L1;
                }
              } else {
                var6++;
                continue L1;
              }
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, lbb param1, pe param2) {
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        var8 = VoidHunters.field_G;
        var9 = param2.d(param0 ^ 1000);
        var5 = var9;
        var6 = param0;
        L0: while (true) {
          if (var6 >= var5.length) {
            return false;
          } else {
            var7 = var5[var6];
            if (var7 != null) {
              if (var7.q((byte) 93) == ((jsb) this).field_c) {
                if (var7.field_D) {
                  return true;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var6++;
                continue L0;
              }
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void b(byte param0) {
        if (param0 != 11) {
            jsb.b((byte) 113);
        }
        field_e = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        jsb var4 = null;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var3 = -112 % ((param0 - 22) / 59);
            var4 = (jsb) (Object) param1;
            if (super.a((byte) -56, param1)) {
              break L1;
            } else {
              if (var4.field_c == var4.field_c) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        jsb var6 = (jsb) (Object) param1;
        jsb var7 = var6;
        if (param0 <= 54) {
            Object var4 = null;
            ucb[] discarded$0 = ((jsb) this).a((pe) null, -15);
        }
        super.b((byte) 81, param1);
        var7.field_c = ((jsb) this).field_c;
    }

    jsb() {
    }

    final String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        String var2 = "Any ship just spawned";
        return var2 + " onto team " + ((jsb) this).field_c;
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((jsb) this).field_c = param0.i(0, 8);
    }

    jsb(int param0) {
        ((jsb) this).field_c = param0;
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            Object var4 = null;
            ucb[] discarded$0 = ((jsb) this).a((pe) null, 9);
        }
        return ((jsb) this).field_c;
    }

    final void a(pe param0, int param1, int param2, int param3) {
        if (param1 != -2) {
            return;
        }
        ((jsb) this).field_c = (so.field_b + param3) % so.field_b;
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -116);
        if (param1 > -109) {
            return;
        }
        param0.a(-632, ((jsb) this).field_c, 8);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 1;
    }
}
