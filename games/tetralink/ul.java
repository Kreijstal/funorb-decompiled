/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul implements kg {
    static String field_a;
    static float field_d;
    static String field_b;
    static String field_e;
    static kh[] field_c;

    public static void a(int param0) {
        int var1 = -102 / ((-25 - param0) / 36);
        field_b = null;
        field_e = null;
        field_c = null;
        field_a = null;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        Object var9 = null;
        oh var10 = null;
        oh var11 = null;
        if (param3) {
          var6 = param1 + param0.field_t;
          var7 = param2 + param0.field_w;
          in.a(var6, var7, (byte) -118, param0.field_F, param0.field_u);
          var11 = fj.field_q[1];
          if (param0 instanceof ae) {
            if (!((ae) (Object) param0).field_N) {
              L0: {
                if (param0.c(3)) {
                  id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var11.b((param0.field_F + -var11.field_t >> -522780447) + 1 + var6, 1 + (var7 - -(param0.field_u + -var11.field_F >> 1502553345)), 256);
                if (param0.c(3)) {
                  id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param0.c(3)) {
                id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          var9 = null;
          ul.a((byte) 88, (gd) null);
          var6 = param1 + param0.field_t;
          var7 = param2 + param0.field_w;
          in.a(var6, var7, (byte) -118, param0.field_F, param0.field_u);
          var10 = fj.field_q[1];
          if (param0 instanceof ae) {
            if (!((ae) (Object) param0).field_N) {
              L3: {
                if (param0.c(3)) {
                  id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6);
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            } else {
              L4: {
                var10.b((param0.field_F + -var10.field_t >> -522780447) + 1 + var6, 1 + (var7 - -(param0.field_u + -var10.field_F >> 1502553345)), 256);
                if (param0.c(3)) {
                  id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            }
          } else {
            L5: {
              if (param0.c(3)) {
                id.a(param0.field_F - 4, 2 + var7, 0, param0.field_u - 4, 2 + var6);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static void a(byte param0, gd param1) {
        gd var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TetraLink.field_J;
        var3 = 114 / ((param0 - 0) / 52);
        param1.b(false);
        var2 = (gd) (Object) gl.field_p.c(false);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a((byte) -115, param1)) {
              var2 = (gd) (Object) gl.field_p.a((byte) -70);
              continue L0;
            } else {
              L1: {
                if (var2 != null) {
                  cl.a((mc) (Object) var2, -94, (mc) (Object) param1);
                  break L1;
                } else {
                  gl.field_p.a((mc) (Object) param1, false);
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (var2 != null) {
                cl.a((mc) (Object) var2, -94, (mc) (Object) param1);
                break L2;
              } else {
                gl.field_p.a((mc) (Object) param1, false);
                break L2;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unable to connect to the data server. Please check any firewall you are using.";
        field_b = "You have resigned.";
    }
}
