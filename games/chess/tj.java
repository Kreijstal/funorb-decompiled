/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends vm {
    static int field_o;
    static String[] field_p;
    static ta field_n;
    static boolean field_l;
    static long field_m;

    public static void i(int param0) {
        if (param0 != -19374) {
            Object var2 = null;
            boolean discarded$0 = tj.a(-38, -11, (um) null, (byte) -109);
        }
        field_p = null;
        field_n = null;
    }

    final static void b(byte param0) {
        int var1 = -45 % ((param0 - -50) / 58);
        dc.field_q = new ci(0L, (ci) null);
        if (!(!bo.field_c)) {
            dc.field_q.a((byte) 127, fe.field_h);
        }
        dc.field_q.a((byte) 124, bh.field_G);
        wf.field_W = new id(ja.field_c, dc.field_q);
        ql.field_d = new ci(0L, (ci) null);
        ql.field_d.a((byte) 124, (ci) (Object) wf.field_W.field_a);
        ql.field_d.a((byte) 123, ln.field_cc);
        e.g((byte) -128);
    }

    final static byte[] a(int param0, byte[] param1) {
        int var2 = param1.length;
        byte[] var3 = new byte[var2];
        if (param0 >= -12) {
            Object var4 = null;
            boolean discarded$0 = tj.a(93, 27, (um) null, (byte) 6);
        }
        ne.a(param1, 0, var3, 0, var2);
        return var3;
    }

    final String a(String param0, int param1) {
        if (param1 != -9316) {
            field_o = 22;
        }
        if (((tj) this).a((byte) -121, param0) == qk.field_b) {
            return bd.field_c;
        }
        return ie.field_c;
    }

    final static boolean h(int param0) {
        if (param0 < 53) {
            Object var2 = null;
            boolean discarded$0 = tj.a((byte) -38, (int[]) null);
        }
        return null == rm.field_R ? wc.field_x : true;
    }

    final static boolean a(int param0, int param1, um param2, byte param3) {
        if (param3 != 83) {
            Object var5 = null;
            boolean discarded$0 = tj.a((byte) -103, (int[]) null);
        }
        byte[] var6 = param2.a(param0, param1, param3 + 5764);
        byte[] var4 = var6;
        if (!(var6 != null)) {
            return false;
        }
        b.a(122, var6);
        return true;
    }

    final static boolean a(byte param0, int[] param1) {
        long var2 = 0L;
        tf var4_ref_tf = null;
        int var4 = 0;
        int var5_int = 0;
        tf var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        if (ik.field_e != tb.field_f) {
          return false;
        } else {
          if (param0 == 103) {
            L0: {
              var2 = ud.a(2);
              if (0 == fh.field_d) {
                break L0;
              } else {
                if (0 <= da.field_p) {
                  break L0;
                } else {
                  var4_ref_tf = (tf) (Object) kn.field_I.g(-18110);
                  if (var4_ref_tf == null) {
                    break L0;
                  } else {
                    if ((var4_ref_tf.field_m ^ -1L) <= (var2 ^ -1L)) {
                      break L0;
                    } else {
                      var4_ref_tf.c(-2193);
                      sb.field_sb = var4_ref_tf.field_j.length;
                      tk.field_h.field_l = 0;
                      var5_int = 0;
                      L1: while (true) {
                        if (var5_int >= sb.field_sb) {
                          lf.field_T = wc.field_u;
                          wc.field_u = hh.field_o;
                          hh.field_o = wg.field_B;
                          wg.field_B = var4_ref_tf.field_n;
                          return true;
                        } else {
                          tk.field_h.field_o[var5_int] = var4_ref_tf.field_j[var5_int];
                          var5_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            L2: while (true) {
              L3: {
                if ((da.field_p ^ -1) <= -1) {
                  break L3;
                } else {
                  tk.field_h.field_l = 0;
                  if (!tk.a(param0 + -222, 1)) {
                    return false;
                  } else {
                    da.field_p = tk.field_h.n(param0 ^ -31);
                    tk.field_h.field_l = 0;
                    sb.field_sb = param1[da.field_p];
                    break L3;
                  }
                }
              }
              if (!jl.a(false)) {
                return false;
              } else {
                if (fh.field_d == 0) {
                  lf.field_T = wc.field_u;
                  wc.field_u = hh.field_o;
                  hh.field_o = wg.field_B;
                  wg.field_B = da.field_p;
                  da.field_p = -1;
                  return true;
                } else {
                  L4: {
                    var4 = fh.field_d;
                    if (0.0 != rl.field_b) {
                      var4 = (int)((double)var4 + ph.field_d.nextGaussian() * rl.field_b);
                      if (-1 >= (var4 ^ -1)) {
                        break L4;
                      } else {
                        var4 = 0;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var5 = new tf((long)var4 + var2, da.field_p, new byte[sb.field_sb]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= sb.field_sb) {
                      kn.field_I.a((o) (Object) var5, (byte) -122);
                      da.field_p = -1;
                      continue L2;
                    } else {
                      var5.field_j[var6] = tk.field_h.field_o[var6];
                      var6++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    final mk a(byte param0, String param1) {
        int var3 = null == mn.a(param1, 19525) ? 1 : 0;
        int var4 = 63 / ((param0 - -49) / 62);
        if (!(var3 != 0)) {
            return qk.field_b;
        }
        return oa.field_a;
    }

    tj(qn param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = true;
    }
}
