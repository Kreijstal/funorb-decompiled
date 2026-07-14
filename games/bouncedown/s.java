/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends vc {
    private int field_L;
    private String field_I;
    private uh field_H;
    private tg field_K;

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        vf var6 = null;
        sf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tg var14 = null;
        tg var15 = null;
        tg var16 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var13 = Bounce.field_N;
                var6 = ((s) this).field_H.a((byte) 122);
                if (ui.field_o == var6) {
                  break L3;
                } else {
                  if (mi.field_c == var6) {
                    break L3;
                  } else {
                    var5 = ((s) this).field_H.c((byte) 66);
                    if (var5 == null) {
                      var5 = ((s) this).field_I;
                      break L2;
                    } else {
                      if (!var5.equals((Object) (Object) ((s) this).field_h)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              var5 = he.field_l;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((s) this).field_h)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((s) this).field_h = var5;
          ((s) this).a(0);
          break L0;
        }
        L4: {
          super.a(param0, param1, 111, param3);
          var6 = ((s) this).field_H.a((byte) 124);
          var8 = (sf) (Object) ((s) this).field_j;
          var9 = param3 + ((s) this).field_r;
          if (param2 > 33) {
            break L4;
          } else {
            ((s) this).a(-109, -117, 123, 87);
            break L4;
          }
        }
        L5: {
          L6: {
            var10 = var8.a(param1, (lk) this, (byte) 51) - -(var8.b((lk) this, 0).b((byte) 14) >> 1865801473);
            if (var6 == ui.field_o) {
              break L6;
            } else {
              if (var6 == mi.field_c) {
                break L6;
              } else {
                if (a.field_e != var6) {
                  if (mc.field_a == var6) {
                    var15 = la.field_E[1];
                    var15.a(var9, -(var15.field_q >> -275481663) + var10, 256);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  var14 = la.field_E[2];
                  var14.a(var9, var10 + -(var14.field_q >> 1323349825), 256);
                  break L5;
                }
              }
            }
          }
          L7: {
            L8: {
              var16 = la.field_E[0];
              var11 = var16.field_t << 854565633;
              var12 = var16.field_o << 1579897377;
              if (null == ((s) this).field_K) {
                break L8;
              } else {
                if (((s) this).field_K.field_s < var11) {
                  break L8;
                } else {
                  if (((s) this).field_K.field_q >= var12) {
                    kh.a(((s) this).field_K, 1);
                    na.a();
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            ((s) this).field_K = new tg(var11, var12);
            kh.a(((s) this).field_K, 1);
            break L7;
          }
          var16.b(112, 144, var16.field_t << 443871140, var16.field_o << -404160860, -((s) this).field_L << -422959350, 4096);
          ve.a(-125);
          ((s) this).field_K.a(var9 + -(var16.field_t >> 1875061825), -var16.field_o + var10, 256);
          break L5;
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        long var2 = 0L;
        j var4_ref_j = null;
        int var4 = 0;
        int var5_int = 0;
        j var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Bounce.field_N;
        if (pj.field_a != b.field_b) {
          return false;
        } else {
          L0: {
            var2 = fa.a(-94);
            if (0 == vi.field_c) {
              break L0;
            } else {
              if (bh.field_c < 0) {
                var4_ref_j = (j) (Object) ih.field_w.a((byte) -99);
                if (var4_ref_j == null) {
                  break L0;
                } else {
                  if ((var4_ref_j.field_h ^ -1L) <= (var2 ^ -1L)) {
                    break L0;
                  } else {
                    var4_ref_j.c(2);
                    pe.field_d = var4_ref_j.field_i.length;
                    jc.field_g.field_h = 0;
                    var5_int = 0;
                    L1: while (true) {
                      if (pe.field_d <= var5_int) {
                        ak.field_z = i.field_f;
                        i.field_f = ck.field_b;
                        ck.field_b = wa.field_d;
                        wa.field_d = var4_ref_j.field_g;
                        return true;
                      } else {
                        jc.field_g.field_i[var5_int] = var4_ref_j.field_i[var5_int];
                        var5_int++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
          if (param0) {
            L2: while (true) {
              L3: {
                if (-1 >= (bh.field_c ^ -1)) {
                  break L3;
                } else {
                  jc.field_g.field_h = 0;
                  if (!qb.a(1, 3)) {
                    return false;
                  } else {
                    bh.field_c = jc.field_g.h((byte) 43);
                    jc.field_g.field_h = 0;
                    pe.field_d = param1[bh.field_c];
                    break L3;
                  }
                }
              }
              if (va.b(1)) {
                if (vi.field_c != 0) {
                  L4: {
                    var4 = vi.field_c;
                    if (oj.field_c == 0.0) {
                      break L4;
                    } else {
                      var4 = (int)((double)var4 + la.field_C.nextGaussian() * oj.field_c);
                      if (-1 >= (var4 ^ -1)) {
                        break L4;
                      } else {
                        var4 = 0;
                        break L4;
                      }
                    }
                  }
                  var5 = new j((long)var4 + var2, bh.field_c, new byte[pe.field_d]);
                  var6 = 0;
                  L5: while (true) {
                    if (var6 >= pe.field_d) {
                      ih.field_w.a(1, (ai) (Object) var5);
                      bh.field_c = -1;
                      continue L2;
                    } else {
                      var5.field_i[var6] = jc.field_g.field_i[var6];
                      var6++;
                      continue L5;
                    }
                  }
                } else {
                  ak.field_z = i.field_f;
                  i.field_f = ck.field_b;
                  ck.field_b = wa.field_d;
                  wa.field_d = bh.field_c;
                  bh.field_c = -1;
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    final boolean a(lk param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = s.a(true, (int[]) null);
            return false;
        }
        return false;
    }

    s(uh param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (fc) (Object) vd.a(93));
        ((s) this).field_H = param0;
        ((s) this).field_I = param1;
        ((s) this).b(param5, 80, param4, param2, param3);
    }

    final String d(int param0) {
        if (param0 == 0) {
            return null;
        }
        ((s) this).field_H = null;
        return null;
    }

    final static we a(gk param0, String param1, int param2, String param3) {
        if (param2 != 28576) {
            Object var6 = null;
            we discarded$0 = s.a((gk) null, (String) null, 64, (String) null);
        }
        int var4 = param0.a(param3, false);
        int var5 = param0.a(var4, param1, 102);
        return jd.a(var4, param0, 8, var5);
    }

    final void a(int param0, int param1, int param2, lk param3) {
        ((s) this).field_L = ((s) this).field_L + 1;
        super.a(param0, param1, param2, param3);
    }

    final static boolean a(String param0, int param1) {
        int var2 = 13 % ((param1 - 68) / 58);
        CharSequence var3 = (CharSequence) (Object) param0;
        return qe.field_e.equals((Object) (Object) ce.a(var3, 0));
    }

    static {
    }
}
