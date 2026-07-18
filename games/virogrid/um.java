/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um extends km {
    km field_Jb;
    static String field_Ib;
    km field_Eb;
    static volatile int field_Fb;
    static int field_Gb;
    qm field_Hb;
    static String field_Kb;

    private final void a(boolean param0, int param1, int param2, int param3, int param4) {
        L0: {
          if (((um) this).field_Hb.f((byte) -87)) {
            ((um) this).field_Jb.field_Cb = ((um) this).field_Jb.field_Cb + param4;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((um) this).field_Hb.g(-1)) {
            ((um) this).field_Jb.field_Cb = ((um) this).field_Jb.field_Cb - param4;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (((um) this).field_Hb.h(-84)) {
            ((um) this).field_Jb.field_Cb = ((um) this).field_Jb.field_Cb + param3;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((um) this).field_Hb.g((byte) -29)) {
            ((um) this).field_Jb.field_Cb = ((um) this).field_Jb.field_Cb - param3;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (((um) this).field_S) {
            ((um) this).field_Jb.field_Cb = ((um) this).field_Jb.field_Cb - param1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0) {
            L6: {
              if (-(((um) this).field_Jb.field_F - -((um) this).field_Jb.field_Cb) < 0) {
                ((um) this).field_Jb.field_Cb = -((um) this).field_Jb.field_F;
                break L6;
              } else {
                break L6;
              }
            }
            if (-(((um) this).field_Jb.field_Cb + ((um) this).field_Jb.field_F) <= -((um) this).field_Eb.field_ub + (((um) this).field_Jb.field_ub - -((um) this).field_Jb.field_kb)) {
              break L5;
            } else {
              ((um) this).field_Jb.field_Cb = -(((um) this).field_Jb.field_ub - -((um) this).field_Jb.field_kb + -((um) this).field_Eb.field_ub) - ((um) this).field_Jb.field_F;
              break L5;
            }
          } else {
            L7: {
              if (-((um) this).field_Eb.field_ub + (((um) this).field_Jb.field_kb + ((um) this).field_Jb.field_ub) >= -(((um) this).field_Jb.field_F - -((um) this).field_Jb.field_Cb)) {
                break L7;
              } else {
                ((um) this).field_Jb.field_Cb = -((um) this).field_Jb.field_F + -(((um) this).field_Jb.field_ub - (-((um) this).field_Jb.field_kb - -((um) this).field_Eb.field_ub));
                break L7;
              }
            }
            if (0 <= -(((um) this).field_Jb.field_F - -((um) this).field_Jb.field_Cb)) {
              break L5;
            } else {
              ((um) this).field_Jb.field_Cb = -((um) this).field_Jb.field_F;
              break L5;
            }
          }
        }
        if (param2 <= -97) {
          L8: {
            if (((um) this).field_Hb.e((byte) 90)) {
              ((um) this).field_Jb.field_F = -((um) this).field_Hb.a((byte) 61, ((um) this).field_Eb.field_ub, param0, ((um) this).field_Jb.field_ub);
              ((um) this).field_Jb.field_Cb = 0;
              break L8;
            } else {
              break L8;
            }
          }
          ((um) this).field_Hb.a(((um) this).field_Jb.field_ub, -((um) this).field_Jb.field_F, ((um) this).field_Eb.field_ub, -1);
          return;
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param2) {
            if (((um) this).field_S) {
              if (!param4) {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_8_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_8_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_8_0 = stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_8_0;
        ((um) this).field_Jb.a(var8 != 0, param6, 0, ((um) this).field_Eb.field_ub);
        var9 = 0;
        this.a(false, param0, -102, param5, param3);
        return var8 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 > -97) {
            field_Ib = null;
        }
        ((um) this).field_ub = param4;
        ((um) this).field_K = param2;
        ((um) this).field_tb = param5;
        ((um) this).field_F = param0;
        this.a((byte) 64, param3, param6);
    }

    private final void a(byte param0, int param1, int param2) {
        ((um) this).field_Eb.field_ub = ((um) this).field_ub;
        if (param0 != 64) {
            rm[] discarded$0 = um.e((byte) -121);
        }
        ((um) this).field_Jb.field_tb = 0;
        ((um) this).field_Eb.field_K = ((um) this).field_K - (param2 - -param1);
        ((um) this).field_Jb.field_K = -param1 + (-param2 + ((um) this).field_K);
        ((um) this).field_Hb.a(0, ((um) this).field_ub, ((um) this).field_Jb.field_ub, -((um) this).field_Jb.field_F, 0, ((um) this).field_K - param2, param2, ((um) this).field_Eb.field_ub);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        this.a(param2, param3, -118, ((um) this).field_Eb.field_ub, param1);
        if (param0 != -1) {
            this.a((byte) -116, 107, -74);
        }
    }

    um(long param0, km param1, km param2, qm param3) {
        super(param0, (km) null);
        try {
            ((um) this).field_Eb = new km(0L, param2);
            ((um) this).field_Hb = new qm(0L, param3);
            ((um) this).a(0, ((um) this).field_Eb);
            ((um) this).a(0, (km) (Object) ((um) this).field_Hb);
            ((um) this).field_Jb = param1;
            ((um) this).field_Eb.a(0, param1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "um.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static rm[] e(byte param0) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        int var2 = 58 / ((param0 - -85) / 39);
        rm[] var1 = new rm[rj.field_h];
        for (var3 = 0; var3 < rj.field_h; var3++) {
            var1[var3] = new rm(oj.field_Kb, se.field_d, el.field_w[var3], mb.field_bb[var3], db.field_k[var3], gb.field_F[var3], lj.field_j[var3], k.field_c);
        }
        pe.b((byte) -28);
        return var1;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3, int param4, boolean param5) {
        if (param2) {
            boolean discarded$0 = ((um) this).a(-108, false, true, 15, -127, false);
        }
        return this.a(param4, 110, param5, param0, param1, ((um) this).field_Eb.field_ub, param3);
    }

    public static void g(int param0) {
        field_Ib = null;
        field_Kb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Fb = 0;
        field_Kb = "Switch between a 3D and 2D view";
        field_Ib = "Return to Main Menu";
    }
}
