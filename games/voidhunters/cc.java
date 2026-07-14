/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends wm implements ntb, hd {
    private int field_c;
    static String field_d;

    final static void b(int param0) {
        oq.field_H = pk.field_o;
        uia.field_b = noa.field_q;
        qs.field_a = noa.field_q;
        kc.field_b = pk.field_o;
        if (param0 != -1) {
            cc.b(17);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            return -25;
        }
        return ((cc) this).field_c;
    }

    final String a(int param0) {
        Object var3 = null;
        if (param0 != -1) {
          var3 = null;
          boolean discarded$2 = ((cc) this).a(92, (lbb) null, (pe) null);
          return "Body " + ((cc) this).field_c + " destroyed";
        } else {
          return "Body " + ((cc) this).field_c + " destroyed";
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -119);
        param0.a(-632, ((cc) this).field_c, 32);
        if (param1 > -109) {
            ((cc) this).field_c = -40;
        }
    }

    final void a(pe param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var9 = VoidHunters.field_G;
          if (param3 > ((cc) this).field_c) {
            stackOut_2_0 = 1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param1 == -2) {
          var6 = 50;
          var7 = var6 * var5 + param3;
          var8 = param3;
          L1: while (true) {
            if (var8 != var7) {
              if (null == param0.d((byte) -27, var8)) {
                var8 = var8 + var5;
                continue L1;
              } else {
                ((cc) this).field_c = var8;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          var10 = null;
          boolean discarded$5 = ((cc) this).a((byte) -97, (tv) null);
          var6 = 50;
          var7 = var6 * var5 + param3;
          var8 = param3;
          L2: while (true) {
            if (var8 != var7) {
              if (null == param0.d((byte) -27, var8)) {
                var8 = var8 + var5;
                continue L2;
              } else {
                ((cc) this).field_c = var8;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != 6970) {
            return;
        }
        field_d = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        cc var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = 14 / ((22 - param0) / 59);
        var4 = (cc) (Object) param1;
        if (!super.a((byte) 92, param1)) {
          if (var4.field_c != var4.field_c) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final boolean a(int param0, lbb param1, pe param2) {
        if (param0 != 0) {
            return false;
        }
        return null == param2.d((byte) -27, ((cc) this).field_c) ? true : false;
    }

    public final int[] a(int param0, int[] param1) {
        Object var4 = null;
        if (param0 < 99) {
          L0: {
            var4 = null;
            ((cc) this).a((faa) null, false);
            if (-1 >= ((cc) this).field_c) {
              param1 = qi.a(((cc) this).field_c, true, param1, (byte) -14);
              break L0;
            } else {
              break L0;
            }
          }
          return param1;
        } else {
          L1: {
            if (-1 <= ((cc) this).field_c) {
              param1 = qi.a(((cc) this).field_c, true, param1, (byte) -14);
              break L1;
            } else {
              break L1;
            }
          }
          return param1;
        }
    }

    public final void a(faa param0, boolean param1) {
        Object var4 = null;
        super.a(param0, param1);
        if (param1) {
          var4 = null;
          ucb[] discarded$2 = ((cc) this).a((pe) null, 111);
          ((cc) this).field_c = param0.i(0, 32);
          return;
        } else {
          ((cc) this).field_c = param0.i(0, 32);
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        cc var5 = null;
        cc var6 = null;
        var5 = (cc) (Object) param1;
        var6 = var5;
        super.b((byte) 116, param1);
        var6.field_c = var5.field_c;
        if (param0 <= 54) {
          field_d = null;
          return;
        } else {
          return;
        }
    }

    public final void a(tv param0, int param1) {
        cc var3 = null;
        int var4 = 0;
        var3 = (cc) (Object) param0;
        super.a(param0, -81);
        var4 = 0;
        if (param1 >= -19) {
          L0: {
            ((cc) this).field_c = 28;
            if (var3.field_c != ((cc) this).field_c) {
              System.out.println("int body_id has changed. before=" + var3.field_c + ", now=" + ((cc) this).field_c);
              var4 = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of MissionConditionBodyDestroyed has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (var3.field_c != ((cc) this).field_c) {
              System.out.println("int body_id has changed. before=" + var3.field_c + ", now=" + ((cc) this).field_c);
              var4 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of MissionConditionBodyDestroyed has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    cc() {
    }

    cc(int param0) {
        ((cc) this).field_c = param0;
    }

    final ucb[] a(pe param0, int param1) {
        anb var5 = param0.d((byte) -27, ((cc) this).field_c);
        var5 = var5;
        if (param1 != -20605) {
            return null;
        }
        if (!(var5 == null)) {
            return new ucb[]{new ucb(var5.d(false), var5.g((byte) -77))};
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "You cannot chat to <%0> because <%0> is offline in your friend list.";
    }
}
