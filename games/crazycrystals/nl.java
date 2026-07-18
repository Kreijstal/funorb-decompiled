/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends fb {
    static String field_g;
    private int field_j;
    private int field_i;
    static dl[] field_f;
    private de field_h;

    final void a(boolean param0, int param1, int param2, byte param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wm var14 = null;
        int var15 = 0;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = CrazyCrystals.field_B;
          if (24 <= ((nl) this).field_i) {
            if (((nl) this).field_i < 48) {
              L1: {
                if (24 != param1) {
                  break L1;
                } else {
                  if (24 != param2) {
                    break L1;
                  } else {
                    vj.field_a[4 - -(1 ^ ((nl) this).field_j)][((nl) this).field_i % 12].b(param5, -param2 + param6, 2 * param1, 3 * param2, ek.field_f[((nl) this).field_a.field_u]);
                    break L0;
                  }
                }
              }
              vj.field_a[4 - -(((nl) this).field_j ^ 1)][((nl) this).field_i % 12].c(param5, param6 + -param2, ek.field_f[((nl) this).field_a.field_u]);
              break L0;
            } else {
              L2: {
                var8 = (72 + -((nl) this).field_i) * param1 / 24;
                var9 = -var8 + (param5 - -param1);
                var10 = (((nl) this).field_i - 24) * param2 / 24;
                var11 = -(var10 * 2) + (param2 + param6);
                var11 = var11 + (-48 + ((nl) this).field_i) * (var10 * ((((nl) this).field_i - 48) * (-48 + ((nl) this).field_i))) / 4608;
                if (param0) {
                  stackOut_8_0 = param2 + param6;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var12 = stackIn_9_0;
                if (param0) {
                  stackOut_11_0 = 480;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = param2 + param6;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var13 = stackIn_12_0;
                if (param4) {
                  var13 = param6 + 2 * param2;
                  break L4;
                } else {
                  break L4;
                }
              }
              var14 = jf.a(var13, 0, 0, 640, var12);
              if (var14 != null) {
                vj.field_a[(1 ^ ((nl) this).field_j) + 4][((nl) this).field_i % 12].b(var9, var11, var8 * 2, 3 * var10, ek.field_f[((nl) this).field_a.field_u]);
                var14.a((byte) -99);
                if (!param4) {
                  break L0;
                } else {
                  var15 = param2 + param6;
                  L5: while (true) {
                    if (var15 >= param6 + 2 * param2) {
                      break L0;
                    } else {
                      kh.a(var9, var15, 2 * var8, 0, (-param2 + var15 + -param6) * 256 / param2);
                      var15++;
                      continue L5;
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            L6: {
              if (param1 != 24) {
                break L6;
              } else {
                if (param2 != 24) {
                  break L6;
                } else {
                  vj.field_a[4 - -((nl) this).field_j][0].c(param5, param6 - param2, ek.field_f[((nl) this).field_a.field_u]);
                  break L0;
                }
              }
            }
            vj.field_a[4 + ((nl) this).field_j][0].b(param5, -param2 + param6, 2 * param1, param2 * 3, ek.field_f[((nl) this).field_a.field_u]);
            break L0;
          }
        }
        L7: {
          if (param3 <= -59) {
            break L7;
          } else {
            ((nl) this).field_j = 30;
            break L7;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            nl.b(-100);
        }
        field_f = null;
        field_g = null;
    }

    final fb a(int param0) {
        ((nl) this).field_i = ((nl) this).field_i + 1;
        if (!(((nl) this).field_i != 24)) {
            be.field_d.a(96, 12 * ((nl) this).field_a.field_A, ((nl) this).field_a.field_t * 12, 0, (byte) -111);
        }
        if (((nl) this).field_i == 48) {
            ((nl) this).field_h.field_j = (ea) (Object) ((nl) this).field_a;
        }
        if (!(((nl) this).field_i >= 72)) {
            return (fb) this;
        }
        int var2 = 116 / ((param0 - 36) / 62);
        ((nl) this).field_h.field_j = null;
        return null;
    }

    nl(fq param0, f[][] param1) {
        super(param0);
        f var3 = null;
        ((nl) this).field_i = 0;
        try {
            var3 = param0.field_l;
            while (!(var3 instanceof de)) {
                var3 = ((pn) (Object) var3).field_l;
            }
            ((nl) this).field_j = param0.field_w & 3;
            ((nl) this).field_h = (de) (Object) var3;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "nl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(db param0) {
        bl var2 = null;
        try {
            bl.b(param0.a(7693, "", "headers.packvorbis"));
            var2 = bl.a(param0, "jagex logo2.packvorbis", "");
            ko discarded$0 = var2.a();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "nl.A(" + (param0 != null ? "{...}" : "null") + ',' + 640 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Friends can be added in multiplayer<nbsp>games";
    }
}
