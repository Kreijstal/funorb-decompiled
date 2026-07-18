/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bj extends ob implements vb {
    static String field_jb;
    private long field_V;
    static String field_sb;
    static String field_pb;
    private ag field_lb;
    private qm field_rb;
    static boolean field_mb;
    private ag field_nb;
    static int field_tb;
    static String field_kb;
    static ll[] field_ob;
    static String field_qb;
    static boolean field_ub;

    final boolean a(qm param0, byte param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_17_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_16_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              var5_int = param3;
              if (var5_int != 99) {
                break L1;
              } else {
                if (!ArcanistsMulti.field_G) {
                  boolean discarded$4 = ((bj) this).field_lb.a(0, (qm) this);
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            if (var5_int == 98) {
              boolean discarded$5 = ((bj) this).field_nb.a(0, (qm) this);
              stackOut_11_0 = 1;
              stackIn_12_0 = stackOut_11_0;
              return stackIn_12_0 != 0;
            } else {
              L2: {
                if (param1 <= -120) {
                  break L2;
                } else {
                  boolean discarded$6 = bj.a(-60, 57, 53, -57, -90, -4, -1);
                  break L2;
                }
              }
              stackOut_16_0 = super.a(param0, (byte) -125, param2, param3);
              stackIn_17_0 = stackOut_16_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("bj.N(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    bj(h param0) {
        super(param0, 200, 200);
        RuntimeException var2 = null;
        qm var2_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((bj) this).field_V = qj.b(-26572);
            var2_ref = new qm(qj.field_i, (wc) null);
            var2_ref.field_k = 100;
            var2_ref.field_v = ((bj) this).field_v;
            var2_ref.field_n = 0;
            var2_ref.field_j = 50;
            var2_ref.field_r = (pf) (Object) new jm(vc.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((bj) this).c(-67, var2_ref);
            ((bj) this).field_rb = new qm(qj.field_i, (wc) null);
            ((bj) this).field_rb.field_j = 20 + var2_ref.field_k + var2_ref.field_j;
            ((bj) this).field_rb.field_v = ((bj) this).field_v;
            ((bj) this).field_rb.field_n = 0;
            ((bj) this).field_rb.field_k = 80;
            ((bj) this).field_rb.field_r = (pf) (Object) new jm(go.field_k, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((bj) this).c(-108, ((bj) this).field_rb);
            int discarded$2 = 1;
            ((bj) this).field_nb = this.a((wc) this, ln.field_R);
            int discarded$3 = 1;
            ((bj) this).field_lb = this.a((wc) this, ki.field_t);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("bj.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    public static void l() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_jb = null;
            field_kb = null;
            field_qb = null;
            field_ob = null;
            field_pb = null;
            field_sb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "bj.G(" + -46 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = param0 >>> 1;
              var2_int = var2_int | var2_int >>> 1;
              var2_int = var2_int | var2_int >>> 2;
              var2_int = var2_int | var2_int >>> 4;
              var2_int = var2_int | var2_int >>> 8;
              if (param1 >= 87) {
                break L1;
              } else {
                field_kb = null;
                break L1;
              }
            }
            var2_int = var2_int | var2_int >>> 16;
            stackOut_3_0 = param0 & ~var2_int;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "bj.K(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 > 24) {
                break L1;
              } else {
                field_sb = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (~param6 < ~param5) {
                  break L3;
                } else {
                  if (param5 >= param3 + param6) {
                    break L3;
                  } else {
                    if (param2 > param0) {
                      break L3;
                    } else {
                      if (param0 >= param2 + param4) {
                        break L3;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var7, "bj.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (!tl.field_d) {
                break L1;
              } else {
                param0.d((byte) 29);
                break L1;
              }
            }
            L2: {
              L3: {
                var5_long = qj.b(-26572) + -((bj) this).field_V;
                var7 = (int)((-var5_long + 10999L) / 1000L);
                if (var7 > 0) {
                  break L3;
                } else {
                  int discarded$1 = 6;
                  u.b();
                  this.k((byte) 119);
                  ((bj) this).field_H.b((qm) (Object) new qn(((bj) this).field_H, bh.field_c), param2 ^ 15807);
                  if (!ArcanistsMulti.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              ((bj) this).field_rb.field_g = "" + var7;
              break L2;
            }
            L4: {
              if (!((bj) this).field_G) {
                break L4;
              } else {
                if (ka.field_m == null) {
                  this.k((byte) 116);
                  ((bj) this).field_H.b((qm) (Object) new qn(((bj) this).field_H, vi.field_C), 15637);
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (ka.field_m == null) {
                break L5;
              } else {
                if (!ka.field_m.field_e) {
                  break L5;
                } else {
                  this.k((byte) 122);
                  ((bj) this).field_H.b((qm) (Object) new qn(((bj) this).field_H, vi.field_C), 15637);
                  break L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("bj.E(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static wa a(boolean param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        vn var4 = null;
        Object var5 = null;
        Object var6 = null;
        wa var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        ne var17 = null;
        String var18 = null;
        int var19 = 0;
        dn stackIn_2_0 = null;
        dn stackIn_4_0 = null;
        dn stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kc stackIn_30_0 = null;
        kc stackIn_32_0 = null;
        kc stackIn_33_0 = null;
        String stackIn_33_1 = null;
        kc stackIn_34_0 = null;
        kc stackIn_36_0 = null;
        kc stackIn_37_0 = null;
        String stackIn_37_1 = null;
        int stackIn_41_0 = 0;
        Object stackIn_98_0 = null;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_1_0 = null;
        dn stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        dn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        kc stackOut_29_0 = null;
        kc stackOut_32_0 = null;
        String stackOut_32_1 = null;
        kc stackOut_30_0 = null;
        String stackOut_30_1 = null;
        kc stackOut_33_0 = null;
        kc stackOut_36_0 = null;
        String stackOut_36_1 = null;
        kc stackOut_34_0 = null;
        String stackOut_34_1 = null;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        Object stackOut_97_0 = null;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = nl.field_Gb.field_Db;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (dd.field_h != nl.field_Gb.field_Db) {
                stackOut_4_0 = (dn) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = (dn) (Object) stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              var3_int = ((dn) (Object) stackIn_5_0).a(stackIn_5_1 != 0, (byte) 98, ga.field_r - -2, 2, (3 * ga.field_r + 6) * param2, param0) ? 1 : 0;
              var4 = nl.field_Gb.field_Eb.field_G;
              var5 = null;
              if (jb.field_t != 2) {
                L3: {
                  L4: {
                    lj.field_j.field_rb = ba.field_f;
                    ec.field_d.field_ub = false;
                    if (jb.field_t != 1) {
                      break L4;
                    } else {
                      nl.field_Gb.field_Db.field_Hb.field_rb = le.field_db;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  nl.field_Gb.field_Db.field_Hb.field_rb = hn.field_l;
                  break L3;
                }
                fc.a((byte) -77, nl.field_Gb.field_Eb);
                break L2;
              } else {
                ec.field_d.field_ub = true;
                lj.field_j.field_rb = tj.a(-97, new String[1], e.field_C);
                nl.field_Gb.field_Db.field_Hb.field_rb = null;
                var6 = null;
                var7 = (wa) (Object) var4.b(12623);
                L5: while (true) {
                  L6: {
                    L7: {
                      L8: {
                        if (var7 == null) {
                          break L8;
                        } else {
                          var8 = 0;
                          if (var19 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (null == var7.field_G) {
                                var7.field_Jb = new kc(0L, qa.field_j);
                                var7.a(var7.field_Jb, 117);
                                var7.field_Fb = new kc(0L, le.field_E);
                                var7.a(var7.field_Fb, 26);
                                var7.field_Mb = new kc(0L, qa.field_j);
                                var7.a(var7.field_Mb, 71);
                                var7.field_Fb.field_X = 2;
                                var8 = 1;
                                var7.e((byte) 20);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              L11: {
                                var7.field_x = nl.field_Gb.field_Eb.field_x;
                                var9 = 0;
                                if (null != var7.field_Lb) {
                                  break L11;
                                } else {
                                  var10 = 13369344;
                                  var11 = 16737894;
                                  if (var19 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (ie.field_Nb == var7.field_Lb) {
                                  break L12;
                                } else {
                                  var10 = 13421568;
                                  var11 = 16777062;
                                  if (var19 == 0) {
                                    break L10;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var10 = 52224;
                              var11 = 6750054;
                              break L10;
                            }
                            L13: {
                              var12 = 0;
                              if (var7.field_Gb == null) {
                                break L13;
                              } else {
                                if (var7.field_Gb.equals((Object) (Object) "")) {
                                  break L13;
                                } else {
                                  var7.field_Mb.field_eb = var11;
                                  var7.field_Mb.field_W = eb.field_d;
                                  var7.field_Mb.a(eb.field_d.field_n + 3, 0, var9, ga.field_r, (byte) -120);
                                  var12 = 1;
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              var7.field_Fb.field_eb = var11;
                              var7.field_Jb.field_eb = var11;
                              var7.field_Fb.field_ob = var10;
                              var7.field_Jb.field_ob = var10;
                              kc fieldTemp$2 = var7.field_Jb;
                              var7.field_Fb.field_J = var11;
                              fieldTemp$2.field_J = var11;
                              var7.field_Fb.field_zb = var11;
                              var7.field_Jb.field_zb = var11;
                              var13 = 0;
                              var14 = -82 + var7.field_x;
                              if (var12 == 0) {
                                break L14;
                              } else {
                                var13 = eb.field_d.field_n - -3;
                                var14 = var14 - var13;
                                break L14;
                              }
                            }
                            L15: {
                              stackOut_29_0 = var7.field_Jb;
                              stackIn_32_0 = stackOut_29_0;
                              stackIn_30_0 = stackOut_29_0;
                              if (var14 <= 0) {
                                stackOut_32_0 = (kc) (Object) stackIn_32_0;
                                stackOut_32_1 = var7.field_Cb;
                                stackIn_33_0 = stackOut_32_0;
                                stackIn_33_1 = stackOut_32_1;
                                break L15;
                              } else {
                                stackOut_30_0 = (kc) (Object) stackIn_30_0;
                                stackOut_30_1 = dj.a(var7.field_Jb.field_Z, var7.field_Cb, var14);
                                stackIn_33_0 = stackOut_30_0;
                                stackIn_33_1 = stackOut_30_1;
                                break L15;
                              }
                            }
                            L16: {
                              stackIn_33_0.field_rb = stackIn_33_1;
                              var7.field_Jb.a(var14, var13, var9, ga.field_r, (byte) -120);
                              stackOut_33_0 = var7.field_Fb;
                              stackIn_36_0 = stackOut_33_0;
                              stackIn_34_0 = stackOut_33_0;
                              if (var7.field_Lb == null) {
                                stackOut_36_0 = (kc) (Object) stackIn_36_0;
                                stackOut_36_1 = nk.field_o;
                                stackIn_37_0 = stackOut_36_0;
                                stackIn_37_1 = stackOut_36_1;
                                break L16;
                              } else {
                                stackOut_34_0 = (kc) (Object) stackIn_34_0;
                                stackOut_34_1 = var7.field_Lb;
                                stackIn_37_0 = stackOut_34_0;
                                stackIn_37_1 = stackOut_34_1;
                                break L16;
                              }
                            }
                            L17: {
                              stackIn_37_0.field_rb = stackIn_37_1;
                              var7.field_Fb.a(80, -80 + var7.field_x, var9, ga.field_r, (byte) -120);
                              if (var7.field_Jb.field_rb.equals((Object) (Object) var7.field_Cb)) {
                                stackOut_40_0 = 0;
                                stackIn_41_0 = stackOut_40_0;
                                break L17;
                              } else {
                                stackOut_38_0 = 1;
                                stackIn_41_0 = stackOut_38_0;
                                break L17;
                              }
                            }
                            L18: {
                              var15 = stackIn_41_0;
                              var9 = var9 + ga.field_r;
                              if (var3_int == 0) {
                                var7.field_B = var9 - var7.field_I;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var8 != 0) {
                                nl.field_Gb.field_Eb.a((byte) 123, (kc) var6, (kc) (Object) var7, 2);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              L21: {
                                L22: {
                                  var6 = (Object) (Object) var7;
                                  if (var7.field_Mb == null) {
                                    break L22;
                                  } else {
                                    if (var7.field_Mb.field_C) {
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                L23: {
                                  if (var7.field_U != 0) {
                                    break L23;
                                  } else {
                                    if (!var7.field_Jb.field_C) {
                                      break L20;
                                    } else {
                                      if (var15 != 0) {
                                        kh.field_c = var7.field_Cb;
                                        if (var19 == 0) {
                                          break L20;
                                        } else {
                                          break L23;
                                        }
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                                L24: {
                                  var16 = var7.field_Cb;
                                  ArcanistsMulti.a(-26335, (int[]) null, nl.field_Gb.field_Db, var16, 0L, -1, -1, (String) null, (kc) (Object) var7);
                                  if (var7.field_Lb == null) {
                                    break L24;
                                  } else {
                                    int discarded$3 = -31046;
                                    if (tc.a(eo.field_c.field_h)) {
                                      break L24;
                                    } else {
                                      if (!wh.field_g) {
                                        L25: {
                                          if (ld.field_p) {
                                            break L25;
                                          } else {
                                            var17 = eo.field_c;
                                            var18 = tj.a(126, new String[1], mb.field_S);
                                            var17.field_l.a(8, var18, (byte) -26);
                                            break L25;
                                          }
                                        }
                                        var17 = eo.field_c;
                                        var18 = tj.a(-73, new String[1], bh.field_b);
                                        var17.field_l.a(18, var18, (byte) -26);
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                var5 = (Object) (Object) var7;
                                if (var19 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                              kh.field_c = var7.field_Gb;
                              break L20;
                            }
                            var7 = (wa) (Object) var4.a(0);
                            if (var19 == 0) {
                              continue L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (0 != nl.field_Gb.field_Jb.field_U) {
                        tc.field_A = new dh(nl.field_Gb.field_Jb.field_V, nl.field_Gb.field_Jb.field_nb, nl.field_Gb.field_Jb.field_x, nl.field_Gb.field_Jb.field_I, dg.field_v, ck.field_a, pg.field_c, pg.field_c);
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                    vd.field_h = 0;
                    break L6;
                  }
                  L26: {
                    if (nl.field_Gb.field_Lb.field_U == 0) {
                      break L26;
                    } else {
                      tc.field_A = new dh(nl.field_Gb.field_Lb.field_V, nl.field_Gb.field_Lb.field_nb, nl.field_Gb.field_Lb.field_x, nl.field_Gb.field_Lb.field_I, af.field_Gb, ck.field_a, pg.field_c, pg.field_c);
                      vd.field_h = 1;
                      break L26;
                    }
                  }
                  break L2;
                }
              }
            }
            stackOut_97_0 = var5;
            stackIn_98_0 = stackOut_97_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var3, "bj.J(" + param0 + ',' + -3 + ',' + param2 + ')');
        }
        return (wa) (Object) stackIn_98_0;
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((bj) this).field_nb == param4) {
                  break L2;
                } else {
                  if (((bj) this).field_lb != param4) {
                    break L1;
                  } else {
                    int discarded$4 = 6;
                    u.b();
                    this.k((byte) 104);
                    if (!ArcanistsMulti.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              this.k((byte) 86);
              break L1;
            }
            L3: {
              if (param0) {
                break L3;
              } else {
                boolean discarded$5 = ((bj) this).a((qm) null, (byte) 73, 'ﾻ', -7);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("bj.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final static boolean g() {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (pm.field_e == null) {
                  break L2;
                } else {
                  if (pm.field_e.g(7213) == null) {
                    break L2;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "bj.H(" + false + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = -7 + param0.length;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var3 >= ~var2_int) {
                    break L3;
                  } else {
                    int incrementValue$27 = var2_int;
                    var2_int++;
                    param0[incrementValue$27] = 0;
                    int incrementValue$28 = var2_int;
                    var2_int++;
                    param0[incrementValue$28] = 0;
                    int incrementValue$29 = var2_int;
                    var2_int++;
                    param0[incrementValue$29] = 0;
                    int incrementValue$30 = var2_int;
                    var2_int++;
                    param0[incrementValue$30] = 0;
                    int incrementValue$31 = var2_int;
                    var2_int++;
                    param0[incrementValue$31] = 0;
                    int incrementValue$32 = var2_int;
                    var2_int++;
                    param0[incrementValue$32] = 0;
                    int incrementValue$33 = var2_int;
                    var2_int++;
                    param0[incrementValue$33] = 0;
                    int incrementValue$34 = var2_int;
                    var2_int++;
                    param0[incrementValue$34] = 0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3 += 7;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (~var2_int <= ~var3) {
                      break L6;
                    } else {
                      int incrementValue$35 = var2_int;
                      var2_int++;
                      param0[incrementValue$35] = 0;
                      if (var4 != 0) {
                        break L5;
                      } else {
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  break L5;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("bj.R(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 0 + ')');
        }
    }

    private final ag a(wc param0, String param1) {
        ag var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ag stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4 = new ag(param1, param0);
            var4.field_r = (pf) (Object) new mm();
            var5 = -6 + ((bj) this).field_k;
            ((bj) this).field_k = ((bj) this).field_k + 38;
            var4.a(30, var5, ((bj) this).field_v + -30, 15, -76);
            ((bj) this).c(-96, (qm) (Object) var4);
            ((bj) this).e((byte) 84);
            stackOut_3_0 = (ag) var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("bj.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + true + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, CharSequence param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            if (qo.a(param0, 0)) {
              if (param1 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                var3_int = param1.length();
                if (var3_int < 12) {
                  L1: {
                    if (rk.a((byte) -51, param0)) {
                      if (var3_int != 0) {
                        break L1;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      }
                    } else {
                      break L1;
                    }
                  }
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("bj.F(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + -71 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private final void k(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((bj) this).field_G) {
              L1: {
                if (param0 >= 85) {
                  break L1;
                } else {
                  field_ob = null;
                  break L1;
                }
              }
              ((bj) this).field_G = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "bj.M(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_pb = "Lesson 6 of 7<br><br>Use of basic minions in a safe and secure environment.<br><br>Use your imps to destroy all three targets.<br><br><br>* Summoning minions *<br>* Minion selection *<br>* Selection of a minion's spells *";
        field_jb = "This spell can only be cast from within the water.";
        field_qb = "Logging in...";
        field_sb = "You cannot use this spell as an angel";
        field_kb = "Player names can be up to 12 letters, numbers and underscores";
    }
}
