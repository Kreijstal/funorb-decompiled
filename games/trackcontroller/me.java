/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me extends fc {
    int field_j;
    static String field_k;
    static String[] field_p;
    int field_o;
    static int field_q;
    int field_r;
    private int field_n;
    int field_s;
    static byte[][][] field_i;
    int field_m;
    int field_l;

    final static ng[] d(int param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        ng[] var1 = new ng[gi.field_o];
        int var2 = 0;
        int var3 = 112 / ((-44 - param0) / 39);
        while (var2 < gi.field_o) {
            var1[var2] = new ng(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], qk.field_M[var2], qe.field_z);
            var2++;
        }
        ff.b(112);
        return var1;
    }

    public static void a(byte param0) {
        field_i = null;
        field_k = null;
        int var1 = 56 % ((-65 - param0) / 40);
        field_p = null;
    }

    final static void a(int param0, int param1) {
        try {
            if (r.field_i != null) {
                // iflt L30
                // if_acmpne L22
            } else {
                ra.field_C.field_k = 0;
                return;
            }
            if (param0 != -1) {
                return;
            }
            if (ra.field_C.field_k == 0) {
                if (qg.a(false) > qh.field_f + 10000L) {
                    ra.field_C.c(param1, param0 + 8);
                }
            }
            if (0 < ra.field_C.field_k) {
                try {
                    r.field_i.a(param0 + -124, ra.field_C.field_j, ra.field_C.field_k, 0);
                    qh.field_f = qg.a(false);
                } catch (IOException iOException) {
                    lj.a((byte) 118);
                }
                ra.field_C.field_k = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void f(int param0) {
        ((me) this).field_l = param0;
        ((me) this).field_r = ((me) this).field_r + ((me) this).field_o;
        ((me) this).field_s = ((me) this).field_s + ((me) this).field_j;
    }

    final static void a(dh param0, int param1, int param2) {
        if (param1 != 0) {
            field_p = null;
        }
        la var5 = ra.field_C;
        var5.c(param2, 7);
        var5.field_k = var5.field_k + 1;
        int var4 = var5.field_k;
        var5.a(1, (byte) -59);
        var5.a(param0.field_k, (byte) -61);
        var5.b(param1 ^ 16, param0.field_q);
        var5.b(false, param0.field_n);
        var5.b(false, param0.field_o);
        var5.b(false, param0.field_j);
        var5.b(false, param0.field_m);
        int discarded$0 = var5.a(var4, false);
        var5.a(true, -var4 + var5.field_k);
    }

    final boolean e(int param0) {
        int var2 = -3 % ((0 - param0) / 34);
        ((me) this).field_l = ((me) this).field_l + ((me) this).field_n;
        return ((me) this).field_l < 26 ? true : false;
    }

    final static int a(String param0, boolean param1, int param2, kh param3, int param4, int param5, kh param6) {
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref = null;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        be stackIn_14_0 = null;
        be stackIn_15_0 = null;
        be stackIn_16_0 = null;
        String stackIn_16_1 = null;
        be stackIn_17_0 = null;
        be stackIn_18_0 = null;
        be stackIn_19_0 = null;
        String stackIn_19_1 = null;
        be stackOut_13_0 = null;
        be stackOut_15_0 = null;
        String stackOut_15_1 = null;
        be stackOut_14_0 = null;
        String stackOut_14_1 = null;
        be stackOut_16_0 = null;
        be stackOut_18_0 = null;
        String stackOut_18_1 = null;
        be stackOut_17_0 = null;
        String stackOut_17_1 = null;
        L0: {
          var13 = TrackController.field_F ? 1 : 0;
          var14 = param3.b(-108);
          var11_ref = var14;
          var11_ref = var14;
          var8 = param6.b(-117);
          var11_ref = var8;
          var11_ref = var8;
          if (null != r.field_i) {
            break L0;
          } else {
            if (!bf.a(false, (byte) 106)) {
              return -1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (jc.field_a == gk.field_a) {
            L2: {
              qi.field_c = null;
              ra.field_C.field_k = 0;
              if (param0 == null) {
                L3: {
                  ui.field_p.field_k = 0;
                  ui.field_p.b(false, ta.field_c.nextInt());
                  ui.field_p.b(false, ta.field_c.nextInt());
                  stackOut_13_0 = ui.field_p;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (param3.a(-107)) {
                    stackOut_15_0 = (be) (Object) stackIn_15_0;
                    stackOut_15_1 = (String) var14;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L3;
                  } else {
                    stackOut_14_0 = (be) (Object) stackIn_14_0;
                    stackOut_14_1 = "";
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L3;
                  }
                }
                L4: {
                  ((be) (Object) stackIn_16_0).b(stackIn_16_1, 115);
                  stackOut_16_0 = ui.field_p;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (!param6.a(-46)) {
                    stackOut_18_0 = (be) (Object) stackIn_18_0;
                    stackOut_18_1 = "";
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L4;
                  } else {
                    stackOut_17_0 = (be) (Object) stackIn_17_0;
                    stackOut_17_1 = (String) var8;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L4;
                  }
                }
                ((be) (Object) stackIn_19_0).b(stackIn_19_1, 112);
                ra.field_C.a(16, (byte) -87);
                ra.field_C.field_k = ra.field_C.field_k + 1;
                var9 = ra.field_C.field_k;
                ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, 0, ui.field_p);
                ra.field_C.a(true, -var9 + ra.field_C.field_k);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  ui.field_p.field_k = 0;
                  if (param1) {
                    var9 = var9 | 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  ui.field_p.b(false, ta.field_c.nextInt());
                  ui.field_p.b(false, ta.field_c.nextInt());
                  ui.field_p.b(var14, 106);
                  ui.field_p.b(var8, 124);
                  var15 = (CharSequence) (Object) param0;
                  ui.field_p.b(qk.a(-128, var15), 119);
                  ui.field_p.b(param4, (byte) -119);
                  ui.field_p.a(param2, (byte) -98);
                  ui.field_p.a(var9, (byte) -66);
                  ra.field_C.a(18, (byte) -92);
                  ra.field_C.field_k = ra.field_C.field_k + 2;
                  var10 = ra.field_C.field_k;
                  var11_ref = bg.a(gd.b((byte) 77), -22004);
                  if (var11_ref != null) {
                    break L6;
                  } else {
                    var11_ref = "";
                    break L6;
                  }
                }
                ra.field_C.a((byte) -57, var11_ref);
                ee.a(sc.field_d, (be) (Object) ra.field_C, fj.field_N, 0, ui.field_p);
                ra.field_C.c(-var10 + ra.field_C.field_k, (byte) -96);
                break L2;
              }
            }
            me.a(-1, -1);
            jc.field_a = l.field_m;
            break L1;
          } else {
            break L1;
          }
        }
        L7: {
          if (jc.field_a != l.field_m) {
            break L7;
          } else {
            if (!hf.a(1, false)) {
              break L7;
            } else {
              L8: {
                var9 = ne.field_a.h(16383);
                ne.field_a.field_k = 0;
                if (var9 < 100) {
                  break L8;
                } else {
                  if (-106 <= var9) {
                    ca.field_a = new String[var9 + -100];
                    jc.field_a = kl.field_a;
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              if (-249 == var9) {
                ob.a(209, gd.b((byte) 77));
                fi.field_t = gh.field_c;
                lj.a((byte) 125);
                kg.field_f = false;
                return var9;
              } else {
                if ((var9 ^ -1) == -100) {
                  boolean discarded$1 = hf.a(va.a(93), false);
                  qi.field_c = new Boolean(bg.a((be) (Object) ne.field_a, -2));
                  ne.field_a.field_k = 0;
                  break L7;
                } else {
                  uk.field_c = var9;
                  jc.field_a = sf.field_D;
                  hd.field_o = -1;
                  break L7;
                }
              }
            }
          }
        }
        L9: {
          if (kl.field_a == jc.field_a) {
            var9 = 2;
            if (hf.a(var9, false)) {
              var10 = ne.field_a.d((byte) -94);
              ne.field_a.field_k = 0;
              if (hf.a(var10, false)) {
                var11 = ca.field_a.length;
                var12 = 0;
                L10: while (true) {
                  if (var11 <= var12) {
                    lj.a((byte) 121);
                    kg.field_f = false;
                    return var11 + 100;
                  } else {
                    ca.field_a[var12] = ne.field_a.j(-1);
                    var12++;
                    continue L10;
                  }
                }
              } else {
                break L9;
              }
            } else {
              break L9;
            }
          } else {
            break L9;
          }
        }
        L11: {
          var9 = 77 / ((param5 - 31) / 47);
          if (jc.field_a == sf.field_D) {
            if (!fh.a(520)) {
              break L11;
            } else {
              L12: {
                if (255 == uk.field_c) {
                  var10_ref = ne.field_a.d(19016);
                  if (var10_ref != null) {
                    dh.a(-19136, var10_ref, gd.b((byte) 77));
                    break L12;
                  } else {
                    break L12;
                  }
                } else {
                  fi.field_t = ne.field_a.g(0);
                  break L12;
                }
              }
              lj.a((byte) 115);
              kg.field_f = false;
              return uk.field_c;
            }
          } else {
            break L11;
          }
        }
        L13: {
          if (null != r.field_i) {
            break L13;
          } else {
            if (kg.field_f) {
              L14: {
                if ((bj.b(-21676) ^ -1L) >= -30001L) {
                  fi.field_t = cf.field_m;
                  break L14;
                } else {
                  fi.field_t = nk.field_j;
                  break L14;
                }
              }
              kg.field_f = false;
              return 249;
            } else {
              var10 = ke.field_c;
              ke.field_c = ma.field_c;
              ma.field_c = var10;
              kg.field_f = true;
              break L13;
            }
          }
        }
        return -1;
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        fh var4 = null;
        if (param1 != 22692) {
            return null;
        }
        if (param2 == null) {
            return null;
        }
        if (!(!(param2 instanceof byte[]))) {
            var3 = (byte[]) param2;
            if (param0) {
                return qd.a(var3, (byte) 102);
            }
            return var3;
        }
        if (param2 instanceof fh) {
            var4 = (fh) param2;
            return var4.b((byte) -2);
        }
        throw new IllegalArgumentException();
    }

    me(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((me) this).field_o = param4;
        ((me) this).field_r = param2;
        ((me) this).field_n = param5;
        ((me) this).field_m = param0;
        ((me) this).field_s = param1;
        ((me) this).field_j = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{"<col=6>Track.</col><br>Push these blocks of track to assemble the model railway exhibits.", "<col=6>Immovable obstacle.</col><br>The walls of the exhibition hall. Obviously these can't be moved.", "<col=6>Smooth floor.</col><br>Track pushed onto this will continue to slide.", "<col=6>Conveyor belt.</col><br>This will push track in the direction indicated. You can push track across the belt and walk onto it, but not against it."};
        field_k = "Close";
    }
}
