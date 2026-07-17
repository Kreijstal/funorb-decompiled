/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class il extends jl {
    private oa field_ab;
    private int field_jb;
    private vg field_ib;
    private int field_db;
    static bi field_gb;
    private int field_Z;
    static String field_fb;
    static ob field_kb;
    static a field_bb;
    static String field_Y;
    static String field_lb;
    private int field_mb;
    private int field_X;
    static String field_hb;
    private cg field_eb;
    static float field_cb;

    private final void a(int param0, vg param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((il) this).field_eb) {
                break L1;
              } else {
                ((il) this).field_eb.b((byte) -124);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                param1.a(6 + ((il) this).field_db, param1.field_n, (byte) 121, 6, param1.field_x);
                ((il) this).field_eb = new cg(param1);
                break L2;
              } else {
                ((il) this).field_eb = new cg();
                break L2;
              }
            }
            ((il) this).b((byte) -97, (vg) (Object) ((il) this).field_eb);
            ((il) this).field_ib = null;
            if (param0 <= -5) {
              break L0;
            } else {
              boolean discarded$2 = ((il) this).k(-80);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("il.WB(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    il(tc param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_x, param1.field_n + param2 + 12);
        try {
            ((il) this).field_db = param2;
            ((il) this).field_mb = param4;
            ((il) this).field_jb = param3;
            ((il) this).field_X = param3;
            this.a(-75, param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "il.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    boolean a(int param0, char param1, int param2, vg param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              L1: {
                if (((il) this).field_eb == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param0) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((il) this).field_eb.a((byte) -60, param3);
                      break L2;
                    }
                  }
                  if (param0 != 99) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((il) this).field_eb.a((byte) -23, param3);
                    return false;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("il.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    public static void h(byte param0) {
        if (param0 != 88) {
          il.h((byte) -12);
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        } else {
          field_hb = null;
          field_gb = null;
          field_Y = null;
          field_lb = null;
          field_kb = null;
          field_bb = null;
          field_fb = null;
          return;
        }
    }

    final void g(byte param0) {
        if (((il) this).field_ab == gs.field_j) {
          return;
        } else {
          ((il) this).field_Z = 0;
          ((il) this).field_ab = je.field_a;
          if (param0 > -100) {
            return;
          } else {
            this.a(-125, ((il) this).field_ib);
            ((il) this).field_eb.field_J = 0;
            ((il) this).field_ib = null;
            return;
          }
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((il) this).field_ab) {
          if (gs.field_j != ((il) this).field_ab) {
            if (((il) this).field_ab == je.field_a) {
              int fieldTemp$2 = ((il) this).field_Z + 1;
              ((il) this).field_Z = ((il) this).field_Z + 1;
              if (fieldTemp$2 != ((il) this).field_jb) {
                ((il) this).field_eb.field_J = (((il) this).field_Z << 8) / ((il) this).field_jb;
                var2 = 0;
                return super.a((byte) 81);
              } else {
                ((il) this).field_eb.field_J = 256;
                ((il) this).field_ab = null;
                var2 = 0;
                return super.a((byte) 81);
              }
            } else {
              var2 = 0;
              return super.a((byte) 81);
            }
          } else {
            int fieldTemp$3 = ((il) this).field_Z + 1;
            ((il) this).field_Z = ((il) this).field_Z + 1;
            if (((il) this).field_X == fieldTemp$3) {
              ((il) this).field_ab = hd.field_s;
              ((il) this).b(-127, ((il) this).field_mb, 12 - -((il) this).field_ib.field_x, ((il) this).field_ib.field_n + ((il) this).field_db + 12);
              ((il) this).field_Z = 0;
              ((il) this).field_eb.field_J = 0;
              var2 = 0;
              return super.a((byte) 81);
            } else {
              ((il) this).field_eb.field_J = -((((il) this).field_Z << 8) / ((il) this).field_X) + 256;
              var2 = 0;
              return super.a((byte) 81);
            }
          }
        } else {
          var2 = 0;
          return super.a((byte) 81);
        }
    }

    void b(vg param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = 87 / ((51 - param1) / 57);
            ((il) this).field_ib = param0;
            if (hd.field_s != ((il) this).field_ab) {
              if (gs.field_j == ((il) this).field_ab) {
                break L0;
              } else {
                ((il) this).field_ab = gs.field_j;
                ((il) this).field_Z = 0;
                return;
              }
            } else {
              ((il) this).b(-55, ((il) this).field_mb, ((il) this).field_ib.field_x + 12, ((il) this).field_ib.field_n + ((il) this).field_db + 12);
              ((il) this).field_Z = 0;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("il.AB(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final void n(int param0) {
        if (null != ((il) this).field_ab) {
            if (!(((il) this).field_ab == je.field_a)) {
                ((il) this).b(12 - -((il) this).field_db + ((il) this).field_ib.field_n, 12 - -((il) this).field_ib.field_x, (byte) -109);
                this.a(-107, ((il) this).field_ib);
            }
            ((il) this).field_eb.field_J = 256;
            ((il) this).field_ab = null;
        }
        super.n(param0);
    }

    final static void a(int param0, int param1, int param2, bi param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ra.field_a) {
                  break L2;
                } else {
                  if (ra.field_a.length == gf.field_b) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ra.field_a = new int[gf.field_b];
              break L1;
            }
            var4_int = param2 & 15;
            param2 = param2 >> 4;
            var5 = param0 & 15;
            param0 = param0 >> 4;
            var12 = 0;
            var13 = param3.field_z * param2 + param0;
            var14 = -gf.field_b + param3.field_z;
            var15 = -gf.field_k;
            L3: while (true) {
              if (0 <= var15) {
                break L0;
              } else {
                var16 = 0;
                var17 = -1 + gf.field_b;
                L4: while (true) {
                  if (0 > var17) {
                    var15++;
                    var13 = var13 + var14;
                    continue L3;
                  } else {
                    var6 = param3.field_B[var13];
                    var8 = var6 & 65280;
                    var7 = var6 & 16711935;
                    var10 = 267390960 & var5 * var7;
                    var11 = var5 * var8 & 1044480;
                    var9 = var11 | var10;
                    var8 = var16 + var9;
                    var7 = 267390960 & var8;
                    var16 = (var6 << 4) - var9;
                    var6 = var8 & 1044480;
                    var10 = -16711936 & var4_int * var7;
                    var11 = 16711680 & var6 * var4_int;
                    var9 = var10 | var11;
                    gf.field_h[var12] = ra.field_a[var17] + var9 >> 8;
                    ra.field_a[var17] = (var8 << 4) - var9;
                    var12++;
                    var13++;
                    var17--;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("il.VB(").append(param0).append(44).append(0).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final boolean k(int param0) {
        if (param0 != 0) {
            return true;
        }
        ((il) this).n(7489);
        return super.k(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "Kick <%0> from this game";
        field_gb = null;
        field_lb = "Click to stop building fleets in this territory.";
        field_hb = "Accept NAP";
        field_Y = "WAITING FOR 1 PLAYER.";
    }
}
