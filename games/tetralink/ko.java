/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ko extends mc {
    static jb field_u;
    static int field_s;
    int field_p;
    int field_n;
    static af field_o;
    int field_r;
    static fn field_q;
    static int field_t;

    public static void b(byte param0) {
        field_o = null;
        if (param0 > -81) {
            ko.b((byte) -79);
        }
        field_q = null;
        field_u = null;
    }

    ko(int param0, int param1, int param2) {
        ((ko) this).field_n = param2;
        ((ko) this).field_r = param0;
        ((ko) this).field_p = param1;
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        je var4 = null;
        Object var5 = null;
        ud var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        pf var16 = null;
        pf var17 = null;
        rb stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        boolean stackIn_2_4 = false;
        rb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        boolean stackIn_3_4 = false;
        rb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        boolean stackIn_4_4 = false;
        int stackIn_4_5 = 0;
        hl stackIn_20_0 = null;
        hl stackIn_21_0 = null;
        hl stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        rb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        boolean stackOut_1_4 = false;
        rb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        boolean stackOut_3_4 = false;
        int stackOut_3_5 = 0;
        rb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        boolean stackOut_2_4 = false;
        int stackOut_2_5 = 0;
        hl stackOut_19_0 = null;
        hl stackOut_21_0 = null;
        String stackOut_21_1 = null;
        hl stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var15 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              stackOut_1_0 = fl.field_n.field_Rb;
              stackOut_1_1 = 2;
              stackOut_1_2 = 2 + qe.field_d;
              stackOut_1_3 = 123;
              stackOut_1_4 = param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              if (fl.field_n.field_Rb != bi.field_d) {
                stackOut_3_0 = (rb) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                break L1;
              } else {
                stackOut_2_0 = (rb) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((rb) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5 != 0, param0 * ((qe.field_d - -2) * 3)) ? 1 : 0;
                var4 = fl.field_n.field_Kb.field_fb;
                if (ji.field_Tb == 2) {
                  break L3;
                } else {
                  if (1 == ji.field_Tb) {
                    break L3;
                  } else {
                    fl.field_n.field_S = false;
                    fl.field_n.field_Rb.field_Ob.field_jb = kl.field_f;
                    int discarded$1 = -104;
                    hd.a(fl.field_n.field_Kb);
                    break L2;
                  }
                }
              }
              fl.field_n.field_S = true;
              fl.field_n.field_Rb.field_Ob.field_jb = null;
              var5 = null;
              var6 = (ud) (Object) var4.c(false);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (fl.field_n.field_Sb.field_F != 0) {
                      lf.field_b = new vg(fl.field_n.field_Sb.field_eb, fl.field_n.field_Sb.field_z, fl.field_n.field_Sb.field_Hb, fl.field_n.field_Sb.field_R, vj.field_p, um.field_n, bk.field_i, bk.field_i);
                      ke.field_c = 2;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (fl.field_n.field_Pb.field_F != 0) {
                    lf.field_b = new vg(fl.field_n.field_Pb.field_eb, fl.field_n.field_Pb.field_z, fl.field_n.field_Pb.field_Hb, fl.field_n.field_Pb.field_R, ha.field_d, um.field_n, bk.field_i, bk.field_i);
                    ke.field_c = 3;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (null == var6.field_fb) {
                      var6.field_Tb = new hl(0L, sk.field_h);
                      var6.a((byte) -103, var6.field_Tb);
                      var6.field_Kb = new hl(0L, sk.field_h);
                      var6.a((byte) 43, var6.field_Kb);
                      var6.c((byte) 112);
                      var7 = 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_Hb = fl.field_n.field_Kb.field_Hb;
                    var6.field_Tb.a((byte) -107, var6.field_Hb, 0, qe.field_d, 0);
                    var8 = 0;
                    if (null == var6.field_Vb) {
                      break L7;
                    } else {
                      if (!var6.field_Vb.equals((Object) (Object) "")) {
                        var6.field_Kb.field_L = 16737894;
                        var6.field_Kb.field_vb = db.field_b;
                        var6.field_Kb.a((byte) -79, 3 + db.field_b.field_t, 0, qe.field_d, 0);
                        var8 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_Hb;
                    if (var8 != 0) {
                      var9 = 3 + db.field_b.field_t;
                      var10 = var10 - var9;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_19_0 = var6.field_Tb;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var10 > 0) {
                      stackOut_21_0 = (hl) (Object) stackIn_21_0;
                      stackOut_21_1 = jb.a(var6.field_Tb.field_Ib, var6.field_Mb, var10);
                      stackIn_22_0 = stackOut_21_0;
                      stackIn_22_1 = stackOut_21_1;
                      break L9;
                    } else {
                      stackOut_20_0 = (hl) (Object) stackIn_20_0;
                      stackOut_20_1 = var6.field_Mb;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_22_0.field_jb = stackIn_22_1;
                    if (var6.field_Tb.field_jb.equals((Object) (Object) var6.field_Mb)) {
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L10;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_25_0;
                    var6.field_Tb.a((byte) -107, var10, 0, qe.field_d, var9);
                    if (var3_int == 0) {
                      var6.field_mb = -var6.field_R + qe.field_d;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 != 0) {
                      fl.field_n.field_Kb.a((hl) var5, true, (hl) (Object) var6, 2);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (null == var6.field_Kb) {
                        break L14;
                      } else {
                        if (var6.field_Kb.field_Y) {
                          re.field_P = var6.field_Vb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Tb.field_Y) {
                      break L13;
                    } else {
                      if (var11 != 0) {
                        re.field_P = var6.field_Mb;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L15: {
                    var5 = (Object) (Object) var6;
                    if (var6.field_F != 0) {
                      gd.a(var6.field_Lb, 255, var6.field_Mb, -1, fl.field_n.field_Rb, (int[]) null, 0L, (hl) (Object) var6, -1);
                      var16 = hd.field_s;
                      var13_ref_String = kk.field_P;
                      var16.field_j.a(var13_ref_String, 1, 7);
                      var17 = hd.field_s;
                      var13 = ci.field_B;
                      var14 = li.field_o;
                      var17.field_j.a(0, var14, -115, 0, var13);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var6 = (ud) (Object) var4.a((byte) -70);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ko.A(" + param0 + ',' + param1 + ',' + -64 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_o = new af();
    }
}
