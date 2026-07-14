/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tt extends rna implements ntb {
    private int field_d;
    static String field_a;
    static dja field_c;
    private int field_b;

    public static void a(byte param0) {
        int var1 = -98 % ((param0 - 42) / 51);
        field_c = null;
        field_a = null;
    }

    final String a(int param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          var2 = "Unknown mode";
          var3 = ((tt) this).field_b;
          if (-1 == (var3 ^ -1)) {
            var2 = "Add body components to";
            break L0;
          } else {
            if ((var3 ^ -1) == -2) {
              var2 = "Subtract body components from";
              break L0;
            } else {
              if (var3 == 2) {
                var2 = "Add 1 to";
                break L0;
              } else {
                if (3 != var3) {
                  break L0;
                } else {
                  var2 = "Subtract 1 from";
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (param0 == -1325) {
            break L1;
          } else {
            ((tt) this).field_b = -107;
            break L1;
          }
        }
        return var2 + " custom variable " + ((tt) this).field_d;
    }

    public final boolean a(byte param0, tv param1) {
        tt var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var3 = (tt) (Object) param1;
            var4 = 78 / ((22 - param0) / 59);
            if (super.a((byte) -64, param1)) {
              break L1;
            } else {
              if (((tt) this).field_d != var3.field_d) {
                break L1;
              } else {
                if (var3.field_b == ((tt) this).field_b) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = 1;
          stackIn_6_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
            return 117;
        }
        if (param0 != 0) {
            return ((tt) this).field_b;
        }
        return ((tt) this).field_d;
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
            field_a = null;
        }
        super.b(param0, -124);
        param0.a(-632, ((tt) this).field_d, 32);
        param0.a(-632, ((tt) this).field_b, 2);
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4 = 0;
        int var5 = 0;
        anb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        if (param1 != null) {
          var4 = 0;
          L0: while (true) {
            if (var4 >= param1.length) {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              return;
            } else {
              var5 = param1[var4];
              var6 = param2.field_g.d((byte) -27, var5);
              if (var6 != null) {
                L2: {
                  var7 = 1;
                  var8 = ((tt) this).field_b;
                  if (var8 != 0) {
                    if ((var8 ^ -1) != -2) {
                      if (2 == var8) {
                        var7 = 1;
                        break L2;
                      } else {
                        if (var8 == 3) {
                          var7 = -1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      var7 = -var6.field_k.j(1);
                      break L2;
                    }
                  } else {
                    var7 = var6.field_k.j(param0 + 0);
                    break L2;
                  }
                }
                param2.field_e.a((byte) -11, var7, ((tt) this).field_d);
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        tt var5 = (tt) (Object) param1;
        tt var6 = var5;
        super.b((byte) 55, param1);
        var6.field_b = var5.field_b;
        var6.field_d = var5.field_d;
        if (param0 <= 54) {
            field_a = null;
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        if (param1) {
            tt.a((int[][]) null, -105);
        }
        if (param2 == 0) {
            ((tt) this).field_d = param3;
            // if_icmple L58
            ((tt) this).field_d = 0;
        } else {
            ((tt) this).field_b = (param3 + 4) % 4;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        ((tt) this).field_d = param0.i(0, 32);
        ((tt) this).field_b = param0.i(0, 2);
    }

    final static void a(int[][] param0, int param1) {
        rba.field_b = param0;
        if (param1 > -88) {
            field_a = null;
        }
    }

    final ucb a(pe param0, int param1) {
        if (param1 == 26964) {
            return null;
        }
        Object var4 = null;
        ((tt) this).b((byte) 88, (tv) null);
        return null;
    }

    tt() {
    }

    tt(int param0, int param1) {
        ((tt) this).field_b = param1;
        ((tt) this).field_d = param0;
    }

    public final void a(tv param0, int param1) {
        super.a(param0, -90);
        if (param1 >= -19) {
            field_c = null;
        }
        tt var5 = (tt) (Object) param0;
        int var4 = 0;
        if (!(var5.field_d == var5.field_d)) {
            System.out.println("int index has changed. before=" + var5.field_d + ", now=" + var5.field_d);
            var4 = 1;
        }
        if (!(var5.field_b == var5.field_b)) {
            System.out.println("int mode has changed. before=" + var5.field_b + ", now=" + var5.field_b);
            var4 = 1;
        }
        if (var4 != 0) {
            System.out.println("This instance of MissionActionAddBodyInfo has changed");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create your own free Jagex account";
        field_c = (dja) (Object) new pu();
    }
}
