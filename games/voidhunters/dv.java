/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dv implements ntb {
    int field_e;
    static ij field_c;
    static Object field_b;
    boolean field_a;
    static int field_f;
    static String field_d;

    public final void b(byte param0, tv param1) {
        Object var4 = null;
        dv var6 = null;
        dv var7 = null;
        var6 = (dv) (Object) param1;
        var7 = var6;
        var7.field_a = var6.field_a;
        var7.field_e = var6.field_e;
        if (param0 <= 54) {
          var4 = null;
          ((dv) this).b((byte) -57, (tv) null);
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 < 97) {
          dv.a((byte) -23);
          jt.a(param5, param4, param1, (byte) -122, 31, param2, param0);
          return;
        } else {
          jt.a(param5, param4, param1, (byte) -122, 31, param2, param0);
          return;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        dv var6 = null;
        var6 = (dv) (Object) param0;
        if (param1 <= -19) {
          L0: {
            var4 = 0;
            if (var6.field_e != ((dv) this).field_e) {
              var4 = 1;
              System.out.println("int option has changed. before=" + var6.field_e + ", now=" + ((dv) this).field_e);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var6.field_a != ((dv) this).field_a) {
              System.out.println("boolean unvote has changed. before=" + var6.field_a + ", now=" + ((dv) this).field_a);
              var4 = 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of PlayerVote has changed");
            return;
          } else {
            return;
          }
        } else {
          L2: {
            var5 = null;
            boolean discarded$1 = ((dv) this).a((byte) -95, (tv) null);
            var4 = 0;
            if (var6.field_e != ((dv) this).field_e) {
              var4 = 1;
              System.out.println("int option has changed. before=" + var6.field_e + ", now=" + ((dv) this).field_e);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var6.field_a != ((dv) this).field_a) {
              System.out.println("boolean unvote has changed. before=" + var6.field_a + ", now=" + ((dv) this).field_a);
              var4 = 1;
              break L3;
            } else {
              break L3;
            }
          }
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of PlayerVote has changed");
            return;
          }
        }
    }

    public final void a(faa param0, boolean param1) {
        ((dv) this).field_e = param0.i(0, 32);
        ((dv) this).field_a = kv.a(param1, param0);
    }

    public final void b(faa param0, int param1) {
        param0.a(-632, ((dv) this).field_e, 32);
        boolean discarded$12 = vq.a(param0, -70, ((dv) this).field_a);
        if (param1 >= -109) {
            ((dv) this).field_a = false;
        }
    }

    public final boolean a(byte param0, tv param1) {
        dv var3 = null;
        int var4 = 0;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        boolean stackOut_1_0 = false;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var3 = (dv) (Object) param1;
            var4 = 9 % ((param0 - 22) / 59);
            if (var3.field_e != var3.field_e) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = var3.field_a;
                stackIn_3_0 = stackOut_1_0;
                stackIn_2_0 = stackOut_1_0;
                if (var3.field_a) {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  break L2;
                } else {
                  stackOut_2_0 = stackIn_2_0;
                  stackOut_2_1 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  break L2;
                }
              }
              if ((stackIn_4_0 ? 1 : 0) != stackIn_4_1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -98) {
            field_c = null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    dv() {
    }

    dv(int param0, boolean param1) {
        ((dv) this).field_e = param0;
        ((dv) this).field_a = param1 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ij();
        field_d = "Fastest";
    }
}
