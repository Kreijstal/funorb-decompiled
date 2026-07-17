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
        field_d = null;
    }

    final void a(nm param0, byte param1) {
        RuntimeException var3 = null;
        ri[] stackIn_2_0 = null;
        ri[] stackIn_3_0 = null;
        ri[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ri[] stackOut_1_0 = null;
        ri[] stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ri[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
              if (0.0f > ((uf) this).field_f) {
                break L1;
              } else {
                L2: {
                  stackOut_1_0 = pp.field_q;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (!((uf) this).field_k) {
                    stackOut_3_0 = (ri[]) (Object) stackIn_3_0;
                    stackOut_3_1 = (int)((uf) this).field_f;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    break L2;
                  } else {
                    stackOut_2_0 = (ri[]) (Object) stackIn_2_0;
                    stackOut_2_1 = 6;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L2;
                  }
                }
                ((ri) (Object) stackIn_4_0[stackIn_4_1]).a(param0.c(((uf) this).field_e, -20126) - 12, -12 + param0.d(((uf) this).field_j, 111), ((uf) this).field_a);
                break L1;
              }
            }
            L3: {
              if (param1 >= 33) {
                break L3;
              } else {
                ((uf) this).field_a = -63;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("uf.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
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
            if (((uf) this).field_a > 25) {
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
        RuntimeException var3 = null;
        int var3_int = 0;
        th var4 = null;
        Object var5 = null;
        ml var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        jb var17 = null;
        jb var18 = null;
        tq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        tq stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        int stackIn_5_3 = 0;
        tq stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean stackIn_6_2 = false;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        cj stackIn_21_0 = null;
        cj stackIn_22_0 = null;
        cj stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        tq stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        boolean stackOut_3_2 = false;
        int stackOut_3_3 = 0;
        tq stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean stackOut_5_2 = false;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        tq stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean stackOut_4_2 = false;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        cj stackOut_20_0 = null;
        cj stackOut_22_0 = null;
        String stackOut_22_1 = null;
        cj stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_3_0 = gl.field_L.field_Jb;
              stackOut_3_1 = 2;
              stackOut_3_2 = param1;
              stackOut_3_3 = 2 + jk.field_f;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (vc.field_d != gl.field_L.field_Jb) {
                stackOut_5_0 = (tq) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L1;
              } else {
                stackOut_4_0 = (tq) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((tq) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 != 0, param0 * (3 * jk.field_f + 6), -90) ? 1 : 0;
                var4 = gl.field_L.field_Ib.field_Cb;
                if (ge.field_zb == 2) {
                  break L3;
                } else {
                  if (ge.field_zb != 1) {
                    gl.field_L.field_Z = false;
                    gl.field_L.field_Jb.field_Jb.field_wb = hj.field_e;
                    ob.a(gl.field_L.field_Ib, 37);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              gl.field_L.field_Z = true;
              gl.field_L.field_Jb.field_Jb.field_wb = null;
              var5 = null;
              var6 = (ml) (Object) var4.c(43);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (0 == gl.field_L.field_Gb.field_T) {
                      break L5;
                    } else {
                      gi.field_i = new dk(gl.field_L.field_Gb.field_w, gl.field_L.field_Gb.field_qb, gl.field_L.field_Gb.field_zb, gl.field_L.field_Gb.field_z, pl.field_K, kd.field_a, vo.field_m, vo.field_m);
                      ic.field_e = 2;
                      break L5;
                    }
                  }
                  if (gl.field_L.field_Hb.field_T == 0) {
                    break L2;
                  } else {
                    gi.field_i = new dk(gl.field_L.field_Hb.field_w, gl.field_L.field_Hb.field_qb, gl.field_L.field_Hb.field_zb, gl.field_L.field_Hb.field_z, gf.field_d, kd.field_a, vo.field_m, vo.field_m);
                    ic.field_e = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (var6.field_Cb == null) {
                      var6.field_Ib = new cj(0L, m.field_x);
                      var6.a((byte) 50, var6.field_Ib);
                      var6.field_Gb = new cj(0L, m.field_x);
                      var6.a((byte) 50, var6.field_Gb);
                      var7 = 1;
                      var6.f(-128);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_zb = gl.field_L.field_Ib.field_zb;
                    var6.field_Ib.a(jk.field_f, 0, var6.field_zb, 0, -3344);
                    var8 = 0;
                    if (var6.field_Kb == null) {
                      break L7;
                    } else {
                      if (var6.field_Kb.equals((Object) (Object) "")) {
                        break L7;
                      } else {
                        var6.field_Gb.field_ob = 16737894;
                        var6.field_Gb.field_rb = pa.field_T;
                        var6.field_Gb.a(jk.field_f, 0, 3 + pa.field_T.field_z, 0, -3344);
                        var8 = 1;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_zb;
                    if (var8 != 0) {
                      var9 = 3 + pa.field_T.field_z;
                      var10 = var10 - var9;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_20_0 = var6.field_Ib;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var10 > 0) {
                      stackOut_22_0 = (cj) (Object) stackIn_22_0;
                      stackOut_22_1 = fm.a(var6.field_Ib.field_yb, var6.field_Hb, var10);
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      break L9;
                    } else {
                      stackOut_21_0 = (cj) (Object) stackIn_21_0;
                      stackOut_21_1 = var6.field_Hb;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_23_1 = stackOut_21_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_23_0.field_wb = stackIn_23_1;
                    if (var6.field_Ib.field_wb.equals((Object) (Object) var6.field_Hb)) {
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L10;
                    } else {
                      stackOut_24_0 = 1;
                      stackIn_26_0 = stackOut_24_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_26_0;
                    var6.field_Ib.a(jk.field_f, 0, var10, var9, -3344);
                    if (var3_int == 0) {
                      var6.field_I = -var6.field_z + jk.field_f;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      gl.field_L.field_Ib.a(2, (cj) (Object) var6, 1300, (cj) var5);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var6.field_Gb) {
                        break L14;
                      } else {
                        if (var6.field_Gb.field_L) {
                          ui.field_j = var6.field_Kb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Ib.field_L) {
                      break L13;
                    } else {
                      if (var11 == 0) {
                        break L13;
                      } else {
                        ui.field_j = var6.field_Hb;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var6.field_T != 0) {
                      ve.a(0L, 196, var6.field_Hb, gl.field_L.field_Jb, var6.field_Pb, (cj) (Object) var6, -1, (int[]) null, -1);
                      var17 = pk.field_b;
                      var13_ref_String = qh.field_d;
                      var17.field_j.a((byte) -118, var13_ref_String, 7);
                      var18 = pk.field_b;
                      var13 = vb.field_f;
                      var14 = ka.field_t;
                      var18.field_j.b(4542, var13, 0, var14, 0);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var5 = (Object) (Object) var6;
                  var6 = (ml) (Object) var4.b(6);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "uf.E(" + param0 + 44 + param1 + 44 + 39 + 41);
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
