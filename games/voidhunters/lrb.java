/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lrb extends rna implements ntb, hd {
    static dfa field_b;
    static String field_a;
    private int field_d;
    private int field_c;
    static boolean field_f;
    static int field_e;

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
            String discarded$0 = ((lrb) this).a(-15);
        }
        lrb var5 = (lrb) (Object) param1;
        lrb var6 = var5;
        super.b((byte) 103, param1);
        var6.field_c = var5.field_c;
        var6.field_d = var5.field_d;
    }

    public final void a(tv param0, int param1) {
        if (param1 > -19) {
            Object var5 = null;
            ucb discarded$0 = ((lrb) this).a((pe) null, 61);
        }
        super.a(param0, -97);
        lrb var6 = (lrb) (Object) param0;
        int var4 = 0;
        if (!(var6.field_d == var6.field_d)) {
            var4 = 1;
            System.out.println("int target_body has changed. before=" + var6.field_d + ", now=" + var6.field_d);
        }
        if (!(var6.field_c == var6.field_c)) {
            System.out.println("int team has changed. before=" + var6.field_c + ", now=" + var6.field_c);
            var4 = 1;
        }
        if (!(var4 == 0)) {
            System.out.println("This instance of MissionActionSetTeam has changed");
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        if (param2 != 0) {
            ((lrb) this).field_c = (param3 - -3) % 3;
        } else {
            var5 = param3 > ((lrb) this).field_d ? 1 : -1;
            var6 = 50;
            var7 = param3 + var6 * var5;
            var8 = param3;
            while (var8 != var7) {
                if (null == param0.d((byte) -27, var8)) {
                    // ifeq L86
                } else {
                    ((lrb) this).field_d = var8;
                    break;
                }
                var8 = var8 + var5;
            }
        }
        if (param1) {
            ((lrb) this).field_c = 56;
        }
    }

    public final void a(faa param0, boolean param1) {
        super.a(param0, param1);
        if (param1) {
            String discarded$0 = ((lrb) this).a(-27);
        }
        ((lrb) this).field_d = param0.i(0, 32);
        ((lrb) this).field_c = param0.i(0, 32);
    }

    final String a(int param0) {
        String var2 = "Set team of ship " + ((lrb) this).field_d;
        if (param0 != -1325) {
            Object var3 = null;
            ((lrb) this).a((tv) null, 8);
        }
        if (!(-1 != ((lrb) this).field_d)) {
            var2 = "Set team of whatever ship";
        }
        return var2 + " to " + ((lrb) this).field_c;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 52) {
            lrb.a((byte) -16);
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -119);
        if (param1 > -109) {
            field_b = null;
        }
        param0.a(-632, ((lrb) this).field_d, 32);
        param0.a(-632, ((lrb) this).field_c, 32);
    }

    public final boolean a(byte param0, tv param1) {
        lrb var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var4 = 38 / ((22 - param0) / 59);
            var3 = (lrb) (Object) param1;
            if (super.a((byte) -44, param1)) {
              break L1;
            } else {
              if (var3.field_d != var3.field_d) {
                break L1;
              } else {
                if (var3.field_c == var3.field_c) {
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

    public final int[] a(int param0, int[] param1) {
        if ((((lrb) this).field_d ^ -1) <= -1) {
            param1 = qi.a(((lrb) this).field_d, true, param1, (byte) -14);
        }
        if (param0 <= 99) {
            return null;
        }
        return param1;
    }

    private final void a(int param0, int param1, rsb param2) {
        sg var5 = null;
        anb var4 = param2.field_g.d((byte) -27, param0);
        if (var4 != null) {
            if (var4 instanceof sg) {
                var5 = (sg) (Object) var4;
                if (param2.a(((lrb) this).field_c, 0, var5.q((byte) 110))) {
                } else {
                    if (-1 != fw.field_a) {
                        // if_icmpeq L84
                        qha.b(false);
                    } else {
                        fw.field_a = param0;
                        tg.field_o = var5.q((byte) 90);
                        return;
                    }
                }
                var5.h(17704, ((lrb) this).field_c);
                if (var5.o((byte) -117) >= 0) {
                    if (!(var5.o((byte) -117) >= param2.field_c.length)) {
                        param2.a(var5.o((byte) -117), (byte) 59).field_h = ((lrb) this).field_c;
                    }
                }
            }
        }
        if (param1 != 32) {
            Object var6 = null;
            this.a(90, -3, (rsb) null);
        }
    }

    final ucb a(pe param0, int param1) {
        anb var3 = param0.d((byte) -27, ((lrb) this).field_d);
        if (param1 != 26964) {
            ((lrb) this).field_d = -27;
        }
        if (!(var3 == null)) {
            return new ucb(var3.d(false), var3.g((byte) 117));
        }
        return null;
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
            return -97;
        }
        if (0 == param0) {
            return ((lrb) this).field_d;
        }
        return ((lrb) this).field_c;
    }

    lrb() {
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if ((((lrb) this).field_d ^ -1) != 0) {
            this.a(((lrb) this).field_d, 32, param2);
            break L0;
          } else {
            if (param1 == null) {
              break L0;
            } else {
              if (param1.length <= 0) {
                break L0;
              } else {
                var4 = 0;
                L1: while (true) {
                  if (var4 >= param1.length) {
                    break L0;
                  } else {
                    this.a(param1[var4], 32, param2);
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (param0 == 1) {
            break L2;
          } else {
            lrb.a((byte) 94);
            break L2;
          }
        }
    }

    lrb(int param0, int param1) {
        ((lrb) this).field_d = param0;
        ((lrb) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
        field_e = 0;
    }
}
