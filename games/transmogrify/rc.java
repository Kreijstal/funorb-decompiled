/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_b;
    static int field_c;
    static bl field_a;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var3 = pe.a(4096, param0);
        var4 = ri.a(98, param0);
        var5 = pe.a(4096, param2);
        if (param1 > -44) {
          field_a = (bl) null;
          var6 = ri.a(-120, param2);
          var7 = (int)((long)var5 * (long)var3 >> 1073638288);
          var8 = (int)((long)var6 * (long)var3 >> 438431440);
          var9 = (int)((long)var4 * (long)var5 >> 232112848);
          var10 = (int)((long)var4 * (long)var6 >> -513720304);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        } else {
          var6 = ri.a(-120, param2);
          var7 = (int)((long)var5 * (long)var3 >> 1073638288);
          var8 = (int)((long)var6 * (long)var3 >> 438431440);
          var9 = (int)((long)var4 * (long)var5 >> 232112848);
          var10 = (int)((long)var4 * (long)var6 >> -513720304);
          return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        sj var2_ref = null;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              o.field_i = 0;
              if (!param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              mg.field_d = stackIn_4_0 != 0;
              if (param0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = -1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              jl.field_j = stackIn_7_0;
              if (hf.field_f == null) {
                il.field_c = new int[][]{new int[]{34, 190, wk.field_a.field_e.length * wl.field_K.field_n + 34, wl.field_K.field_m + 190}};
                wc.field_a = new int[][]{new int[]{161, 247, 161 + si.field_i.field_e.length * wl.field_K.field_n, wl.field_K.field_m + 247}};
                hf.field_f = new int[][]{new int[]{34, 114, wl.field_K.field_n * od.field_g.field_e.length + 34, wl.field_K.field_m + 114}, il.field_c[0], wc.field_a[0]};
                hd.field_c = new int[][]{hf.field_f[0], il.field_c[0]};
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              wk.field_a.a(true);
              si.field_i.a(true);
              od.field_g.field_d = 34;
              wk.field_a.field_d = 34;
              si.field_i.field_d = 161;
              if (param1 == -13) {
                break L4;
              } else {
                field_b = (String) null;
                break L4;
              }
            }
            L5: {
              od.field_g.field_c = 114;
              wk.field_a.field_c = 190;
              si.field_i.field_c = 247;
              ac.field_n = new ld(1024, 8, 8);
              if (!param0) {
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = 6;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              re.field_A = stackIn_15_0;
              if (dk.field_b) {
                hf.field_j = hf.field_j - 1;
                nc.field_t = nc.field_t - 1;
                dk.field_b = false;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              sg.field_d = null;
              oh.field_j = 0;
              oj.field_u.g(-1);
              hc.field_u = 0;
              da.field_C = 0;
              vh.field_n = vh.field_n + (eh.field_a << 931741222);
              eh.field_a = 0;
              if (null != qi.field_c) {
                hf.field_j = hf.field_j - qi.field_c.field_o;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              L9: {
                qi.field_c = we.field_l[am.field_n];
                hf.field_j = hf.field_j + qi.field_c.field_o;
                if (!mg.field_d) {
                  break L9;
                } else {
                  if (null == qi.field_c.field_b) {
                    break L9;
                  } else {
                    var2_int = 0;
                    L10: while (true) {
                      if (var2_int >= qi.field_c.field_b.length()) {
                        break L9;
                      } else {
                        si.field_i.field_e[var2_int] = w.a(si.field_i, var2_int, qi.field_c, (byte) 42, qi.field_c.field_b.charAt(var2_int));
                        si.field_i.field_e[var2_int].field_x = false;
                        var2_int++;
                        if (var3 != 0) {
                          break L8;
                        } else {
                          if (var3 == 0) {
                            continue L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (!mg.field_d) {
                break L8;
              } else {
                if (null == qi.field_c.field_n) {
                  break L8;
                } else {
                  L11: {
                    if (sg.field_p != null) {
                      sg.field_p.d(1);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  sg.field_p = w.a(de.field_d, 1, qi.field_c, (byte) 36, qi.field_c.field_n.charAt(1));
                  var2_ref = sg.field_p;
                  sg.field_p.field_g = 1000;
                  sg.field_p.field_x = true;
                  var2_ref.field_j = 1000;
                  break L8;
                }
              }
            }
            var2_int = 0;
            L12: while (true) {
              L13: {
                L14: {
                  if (vi.field_g.length <= var2_int) {
                    break L14;
                  } else {
                    vi.field_g[var2_int].setLength(0);
                    vi.field_a[var2_int] = 0;
                    var2_int++;
                    if (var3 != 0) {
                      break L13;
                    } else {
                      if (var3 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                od.field_g.a(true);
                wk.field_d = 0;
                dc.field_a = 0;
                eg.field_b = 0;
                n.field_a = 0;
                bi.field_J = 0;
                hi.field_a = 1;
                gk.field_e = 0;
                rb.field_a = 0;
                ce.field_c = 0;
                ad.field_e = false;
                wk.field_c = 0;
                bg.field_m = 1500;
                break L13;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "rc.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = "Retry";
    }
}
