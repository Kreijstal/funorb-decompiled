/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class uf {
    private int field_e;
    static int field_g;
    private int field_j;
    private float field_f;
    private int field_a;
    static String field_d;
    static int[][] field_b;
    static String field_c;
    static String field_i;
    private boolean field_k;
    static ja field_h;

    final void a(boolean param0) {
        ((uf) this).field_k = param0 ? true : false;
        uj discarded$0 = nm.b(-128, 59);
    }

    public static void b(int param0) {
        field_h = null;
        field_c = null;
        field_b = null;
        field_i = null;
        if (param0 != 16737894) {
            field_d = null;
        }
        field_d = null;
    }

    final void a(nm param0, byte param1) {
        if (0.0f <= ((uf) this).field_f) {
            pp.field_q[((uf) this).field_k ? 6 : (int)((uf) this).field_f].a(param0.c(((uf) this).field_e, -20126) - 12, -12 + param0.d(((uf) this).field_j, 111), ((uf) this).field_a);
        }
        if (param1 < 33) {
            ((uf) this).field_a = -63;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((uf) this).field_a = 256;
        ((uf) this).field_f = (float)param0;
        ((uf) this).field_j = param2;
        ((uf) this).field_e = param1;
    }

    final void b(boolean param0) {
        ((uf) this).field_k = false;
        if (!param0) {
            Object var3 = null;
            ((uf) this).a((nm) null, (byte) 30);
        }
        uj discarded$0 = nm.b(-126, 20);
    }

    final void a(int param0) {
        if (!(((uf) this).field_f == -1.0f)) {
            ((uf) this).field_f = ((uf) this).field_f + 0.5f;
            if (-26 > (((uf) this).field_a ^ -1)) {
                ((uf) this).field_a = ((uf) this).field_a - 25;
            }
            if (((uf) this).field_f > 5.0f) {
                ((uf) this).field_f = -1.0f;
            }
        }
        if (param0 != -29987) {
            field_b = null;
        }
    }

    uf() {
        ((uf) this).field_j = 0;
        ((uf) this).field_e = 0;
        ((uf) this).field_f = -1.0f;
        ((uf) this).field_k = false;
    }

    final static void a(int param0, boolean param1, byte param2) {
        int var3 = 0;
        th var4 = null;
        ml var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jb var17 = null;
        jb var18 = null;
        tq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        tq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        tq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        cj stackIn_20_0 = null;
        cj stackIn_21_0 = null;
        cj stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        tq stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean stackOut_2_2 = false;
        int stackOut_2_3 = 0;
        tq stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean stackOut_4_2 = false;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        tq stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        boolean stackOut_3_2 = false;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        cj stackOut_19_0 = null;
        cj stackOut_21_0 = null;
        String stackOut_21_1 = null;
        cj stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param2 == 39) {
          L0: {
            stackOut_2_0 = gl.field_L.field_Jb;
            stackOut_2_1 = 2;
            stackOut_2_2 = param1;
            stackOut_2_3 = 2 + jk.field_f;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_4_2 = stackOut_2_2;
            stackIn_4_3 = stackOut_2_3;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            if (vc.field_d != gl.field_L.field_Jb) {
              stackOut_4_0 = (tq) (Object) stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = stackIn_4_2;
              stackOut_4_3 = stackIn_4_3;
              stackOut_4_4 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              stackIn_5_3 = stackOut_4_3;
              stackIn_5_4 = stackOut_4_4;
              break L0;
            } else {
              stackOut_3_0 = (tq) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_5_4 = stackOut_3_4;
              break L0;
            }
          }
          L1: {
            L2: {
              var3 = ((tq) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, param0 * (3 * jk.field_f + 6), -90) ? 1 : 0;
              var4 = gl.field_L.field_Ib.field_Cb;
              if (ge.field_zb == 2) {
                break L2;
              } else {
                if ((ge.field_zb ^ -1) != -2) {
                  gl.field_L.field_Z = false;
                  gl.field_L.field_Jb.field_Jb.field_wb = hj.field_e;
                  ob.a(gl.field_L.field_Ib, 37);
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            gl.field_L.field_Z = true;
            gl.field_L.field_Jb.field_Jb.field_wb = null;
            var5 = null;
            var6 = (ml) (Object) var4.c(43);
            L3: while (true) {
              if (var6 == null) {
                L4: {
                  if (0 == gl.field_L.field_Gb.field_T) {
                    break L4;
                  } else {
                    gi.field_i = new dk(gl.field_L.field_Gb.field_w, gl.field_L.field_Gb.field_qb, gl.field_L.field_Gb.field_zb, gl.field_L.field_Gb.field_z, pl.field_K, kd.field_a, vo.field_m, vo.field_m);
                    ic.field_e = 2;
                    break L4;
                  }
                }
                if (-1 == (gl.field_L.field_Hb.field_T ^ -1)) {
                  break L1;
                } else {
                  gi.field_i = new dk(gl.field_L.field_Hb.field_w, gl.field_L.field_Hb.field_qb, gl.field_L.field_Hb.field_zb, gl.field_L.field_Hb.field_z, gf.field_d, kd.field_a, vo.field_m, vo.field_m);
                  ic.field_e = 3;
                  break L1;
                }
              } else {
                L5: {
                  var7 = 0;
                  if (var6.field_Cb == null) {
                    var6.field_Ib = new cj(0L, m.field_x);
                    var6.a((byte) 50, var6.field_Ib);
                    var6.field_Gb = new cj(0L, m.field_x);
                    var6.a((byte) 50, var6.field_Gb);
                    var7 = 1;
                    var6.f(-128);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var6.field_zb = gl.field_L.field_Ib.field_zb;
                  var6.field_Ib.a(jk.field_f, 0, var6.field_zb, 0, -3344);
                  var8 = 0;
                  if (var6.field_Kb == null) {
                    break L6;
                  } else {
                    if (var6.field_Kb.equals((Object) (Object) "")) {
                      break L6;
                    } else {
                      var6.field_Gb.field_ob = 16737894;
                      var6.field_Gb.field_rb = pa.field_T;
                      var6.field_Gb.a(jk.field_f, 0, 3 + pa.field_T.field_z, 0, -3344);
                      var8 = 1;
                      break L6;
                    }
                  }
                }
                L7: {
                  var9 = 0;
                  var10 = var6.field_zb;
                  if (var8 != 0) {
                    var9 = 3 + pa.field_T.field_z;
                    var10 = var10 - var9;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  stackOut_19_0 = var6.field_Ib;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (var10 > 0) {
                    stackOut_21_0 = (cj) (Object) stackIn_21_0;
                    stackOut_21_1 = fm.a(var6.field_Ib.field_yb, var6.field_Hb, var10);
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L8;
                  } else {
                    stackOut_20_0 = (cj) (Object) stackIn_20_0;
                    stackOut_20_1 = var6.field_Hb;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L8;
                  }
                }
                L9: {
                  stackIn_22_0.field_wb = stackIn_22_1;
                  if (var6.field_Ib.field_wb.equals((Object) (Object) var6.field_Hb)) {
                    stackOut_24_0 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    break L9;
                  } else {
                    stackOut_23_0 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    break L9;
                  }
                }
                L10: {
                  var11 = stackIn_25_0;
                  var6.field_Ib.a(jk.field_f, 0, var10, var9, param2 + -3383);
                  if (var3 == 0) {
                    var6.field_I = -var6.field_z + jk.field_f;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var7 != 0) {
                    gl.field_L.field_Ib.a(2, (cj) (Object) var6, 1300, (cj) (Object) var5);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    if (null == var6.field_Gb) {
                      break L13;
                    } else {
                      if (var6.field_Gb.field_L) {
                        ui.field_j = var6.field_Kb;
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (!var6.field_Ib.field_L) {
                    break L12;
                  } else {
                    if (var11 == 0) {
                      break L12;
                    } else {
                      ui.field_j = var6.field_Hb;
                      break L12;
                    }
                  }
                }
                L14: {
                  if (-1 != (var6.field_T ^ -1)) {
                    ve.a(0L, 196, var6.field_Hb, gl.field_L.field_Jb, var6.field_Pb, (cj) (Object) var6, -1, (int[]) null, -1);
                    var17 = pk.field_b;
                    var13_ref = qh.field_d;
                    var17.field_j.a((byte) -118, var13_ref, 7);
                    var18 = pk.field_b;
                    var13 = vb.field_f;
                    var14 = ka.field_t;
                    var18.field_j.b(4542, var13, 0, var14, 0);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var5 = var6;
                var6 = (ml) (Object) var4.b(6);
                continue L3;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Enhance your technological skills.";
        field_i = "<%0> has resigned.";
        field_c = "Aggressive zombies get the brains.";
    }
}
