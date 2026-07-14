/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rdb extends ksa implements ntb {
    private int field_e;
    private int field_g;
    private int field_d;
    static String field_f;

    final int a(boolean param0) {
        if (!param0) {
            int discarded$0 = ((rdb) this).a(46);
            return ((rdb) this).field_e;
        }
        return ((rdb) this).field_e;
    }

    final boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 >= -54) {
          return true;
        } else {
          L0: {
            var4 = param0 - ((rdb) this).field_e;
            var5 = param2 - ((rdb) this).field_d;
            var6 = ar.a(var4, (byte) 106, var5);
            if (51200 <= var6) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          ((rdb) this).field_e = -114;
          ((rdb) this).field_e = param0.i(0, 32);
          ((rdb) this).field_d = param0.i(0, 32);
          ((rdb) this).field_g = param0.i(0, 1);
          return;
        } else {
          ((rdb) this).field_e = param0.i(0, 32);
          ((rdb) this).field_d = param0.i(0, 32);
          ((rdb) this).field_g = param0.i(0, 1);
          return;
        }
    }

    final void a(lta param0, boolean param1) {
        int var3 = qpb.a(param1, ((rdb) this).field_g, 13894143);
        kq.a(param0.field_a * 51200.0f, (byte) 89, param0.b(true, ((rdb) this).field_d), var3, param0.a(((rdb) this).field_e, (byte) 121));
    }

    final int d(int param0) {
        int var2 = 28 % ((param0 - 55) / 49);
        return ((rdb) this).field_g;
    }

    final void a(int param0, pe param1) {
        if (param0 != 3128) {
            boolean discarded$0 = ((rdb) this).a(-54, (byte) 92, -6);
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 >= -109) {
          ((rdb) this).field_d = -98;
          param0.a(-632, ((rdb) this).field_e, 32);
          param0.a(-632, ((rdb) this).field_d, 32);
          param0.a(-632, ((rdb) this).field_g, 1);
          return;
        } else {
          param0.a(-632, ((rdb) this).field_e, 32);
          param0.a(-632, ((rdb) this).field_d, 32);
          param0.a(-632, ((rdb) this).field_g, 1);
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        Object var4 = null;
        rdb var6 = null;
        rdb var7 = null;
        var6 = (rdb) (Object) param1;
        var7 = var6;
        var7.field_g = var6.field_g;
        var7.field_e = var6.field_e;
        if (param0 < 54) {
          var4 = null;
          boolean discarded$2 = ((rdb) this).a((byte) 14, (tv) null);
          var7.field_d = var6.field_d;
          return;
        } else {
          var7.field_d = var6.field_d;
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var3 = -111 % ((param1 - -20) / 61);
        ((rdb) this).field_g = param0;
    }

    final int a(int param0) {
        if (param0 < 56) {
            ((rdb) this).field_d = -12;
            return ((rdb) this).field_d;
        }
        return ((rdb) this).field_d;
    }

    public static void c(int param0) {
        if (param0 != 51200) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        rdb var4 = null;
        var3 = 28 % ((22 - param0) / 59);
        var4 = (rdb) (Object) param1;
        if (var4.field_e == var4.field_e) {
          if (var4.field_d == var4.field_d) {
            if (var4.field_g != var4.field_g) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    rdb() {
    }

    rdb(int param0, int param1, int param2) {
        ((rdb) this).field_g = param2;
        ((rdb) this).field_d = param1;
        ((rdb) this).field_e = param0;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        rdb var5 = null;
        var5 = (rdb) (Object) param0;
        if (param1 < -19) {
          L0: {
            var4 = 0;
            if (var5.field_e == var5.field_e) {
              break L0;
            } else {
              System.out.println("int x has changed. before=" + var5.field_e + ", now=" + var5.field_e);
              var4 = 1;
              break L0;
            }
          }
          L1: {
            if (var5.field_d != var5.field_d) {
              var4 = 1;
              System.out.println("int y has changed. before=" + var5.field_d + ", now=" + var5.field_d);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var5.field_g != var5.field_g) {
              System.out.println("int team has changed. before=" + var5.field_g + ", now=" + var5.field_g);
              var4 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of SpawnPoint has changed");
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You can ask to join this game";
    }
}
