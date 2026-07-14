/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bb extends ki implements pi, ka {
    private boolean field_H;
    static fg field_I;
    private vg field_L;
    private vg field_O;
    private boolean field_E;
    private pj field_N;
    private String field_K;
    static int[] field_P;
    private pj field_M;
    private pj field_D;
    static int field_G;
    private boolean field_J;

    public final void a(vg param0, boolean param1) {
        if (!param1) {
            ((bb) this).field_K = null;
        }
        if (!(((bb) this).field_O != param0)) {
            boolean discarded$0 = ((bb) this).field_L.a(-1463, (rc) this);
        }
        if (param0 == ((bb) this).field_L) {
            this.k(-1525);
        }
    }

    final static String a(String param0, String[] param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = SolKnight.field_L ? 1 : 0;
          if (param2 == -63) {
            break L0;
          } else {
            boolean discarded$4 = bb.h(86);
            break L0;
          }
        }
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L1: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (-1 < (var6_int ^ -1)) {
            var6 = new StringBuilder(var4);
            var5 = 0;
            var7 = 0;
            L2: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (var8 >= 0) {
                var5 = var8 - -2;
                L3: while (true) {
                  L4: {
                    if (var3 <= var5) {
                      break L4;
                    } else {
                      if (!gh.a(param0.charAt(var5), (byte) -124)) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (ec.a(30418, (CharSequence) (Object) var9)) {
                    if (var5 >= var3) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var10 = il.a((CharSequence) (Object) var9, 6054);
                        StringBuilder discarded$5 = var6.append(param0.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$6 = var6.append(param1[var10]);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              } else {
                StringBuilder discarded$7 = var6.append(param0.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = var6_int - -2;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!gh.a(param0.charAt(var5), (byte) -124)) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref = param0.substring(var6_int - -2, var5);
              if (!ec.a(30418, (CharSequence) (Object) var7_ref)) {
                continue L1;
              } else {
                if (var5 >= var3) {
                  continue L1;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = il.a((CharSequence) (Object) var7_ref, param2 ^ -6041);
                    var4 = var4 + (-var5 + var6_int + param1[var8].length());
                    continue L1;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        }
    }

    bb(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (j) null);
        gh var6 = null;
        mg var7 = null;
        String var8 = null;
        fg var9 = null;
        ke var12 = null;
        ke var13 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_16_0 = null;
        pj stackIn_16_1 = null;
        pj stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        pj stackIn_17_1 = null;
        pj stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        pj stackIn_18_1 = null;
        pj stackIn_18_2 = null;
        String stackIn_18_3 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_15_0 = null;
        pj stackOut_15_1 = null;
        pj stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        pj stackOut_17_1 = null;
        pj stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        pj stackOut_16_1 = null;
        pj stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((bb) this).field_E = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param4) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((bb) this).field_H = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param3) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((bb) this).field_J = stackIn_9_1 != 0;
          ((bb) this).field_K = param1;
          if (!((bb) this).field_E) {
            break L3;
          } else {
            L4: {
              if (((bb) this).field_J) {
                break L4;
              } else {
                if (!((bb) this).field_H) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((bb) this).field_O = (vg) (Object) new qb(param0, (dg) this, 100);
          ((bb) this).field_L = (vg) (Object) new qb("", (dg) this, 20);
          if (!((bb) this).field_E) {
            L6: {
              ((bb) this).field_N = new pj(ga.field_H, (dg) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (((bb) this).field_H) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = pf.field_c;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = u.field_e;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new pj(stackIn_18_3, (dg) null);
            ((bb) this).field_D = stackIn_18_1;
            if (!((bb) this).field_J) {
              break L5;
            } else {
              ((bb) this).field_M = new pj(wk.field_g, (dg) this);
              break L5;
            }
          } else {
            ((bb) this).field_N = new pj(gg.field_c, (dg) null);
            ((bb) this).field_D = new pj(ph.field_e, (dg) null);
            ((bb) this).field_O.field_B = false;
            break L5;
          }
        }
        L7: {
          ((bb) this).field_O.field_w = (j) (Object) new uf(10000536);
          ((bb) this).field_L.field_w = (j) (Object) new bg(10000536);
          var6 = new gh();
          ((bb) this).field_N.field_w = (j) (Object) var6;
          if (null == ((bb) this).field_D) {
            break L7;
          } else {
            ((bb) this).field_D.field_w = (j) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((bb) this).field_O.field_z = oc.field_e;
          if (((bb) this).field_M == null) {
            break L8;
          } else {
            ((bb) this).field_M.field_w = (j) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (((bb) this).field_M == null) {
            break L9;
          } else {
            ((bb) this).field_M.field_z = id.field_b;
            break L9;
          }
        }
        L10: {
          if (((bb) this).field_E) {
            ((bb) this).field_D.field_z = hb.field_j;
            break L10;
          } else {
            if (!((bb) this).field_H) {
              ((bb) this).field_D.field_w = (j) (Object) new ri();
              break L10;
            } else {
              ((bb) this).field_D.field_z = a.field_g;
              ((bb) this).field_D.field_w = (j) (Object) new ri();
              break L10;
            }
          }
        }
        L11: {
          ((bb) this).field_j = 15;
          var7 = ua.field_G;
          if (((bb) this).field_K == null) {
            break L11;
          } else {
            ((bb) this).field_j = ((bb) this).field_j + (var7.b(((bb) this).field_K, -40 + ((bb) this).field_t, var7.field_F) + 5);
            break L11;
          }
        }
        L12: {
          var8 = hh.field_J;
          var9 = lf.a((byte) 120, ia.g(116));
          if (sk.field_p == var9) {
            var8 = rc.field_y;
            break L12;
          } else {
            if (field_I != var9) {
              break L12;
            } else {
              var8 = kf.field_H;
              break L12;
            }
          }
        }
        L13: {
          var12 = new ke(10, ((bb) this).field_j, ((bb) this).field_t - 20, 25, (rc) (Object) ((bb) this).field_O, false, 80, 3, var7, 16777215, var8);
          ((bb) this).a((rc) (Object) new ke(10, ((bb) this).field_j, ((bb) this).field_t - 20, 25, (rc) (Object) ((bb) this).field_O, false, 80, 3, var7, 16777215, var8), 5411);
          ((bb) this).field_j = ((bb) this).field_j + (((rc) (Object) var12).field_x + 5);
          var13 = new ke(10, ((bb) this).field_j, ((bb) this).field_t + -20, 25, (rc) (Object) ((bb) this).field_L, false, 80, 3, var7, 16777215, ld.field_O);
          ((bb) this).a((rc) (Object) new ke(10, ((bb) this).field_j, ((bb) this).field_t + -20, 25, (rc) (Object) ((bb) this).field_L, false, 80, 3, var7, 16777215, ld.field_O), 5411);
          ((bb) this).field_N.field_n = (dg) this;
          ((bb) this).field_j = ((bb) this).field_j + (5 + ((rc) (Object) var13).field_x);
          if (((bb) this).field_M == null) {
            break L13;
          } else {
            ((bb) this).field_M.field_n = (dg) this;
            break L13;
          }
        }
        L14: {
          if (null == ((bb) this).field_D) {
            break L14;
          } else {
            ((bb) this).field_D.field_n = (dg) this;
            break L14;
          }
        }
        L15: {
          if (((bb) this).field_M != null) {
            ((bb) this).field_N.b(30, -95 + ((bb) this).field_t, 85, 0, ((bb) this).field_j);
            ((bb) this).field_j = ((bb) this).field_j + 60;
            break L15;
          } else {
            ((bb) this).field_N.b(30, ((bb) this).field_t - 6 - 10, 8, 0, ((bb) this).field_j);
            ((bb) this).field_j = ((bb) this).field_j + 35;
            break L15;
          }
        }
        L16: {
          if (null == ((bb) this).field_M) {
            break L16;
          } else {
            ((bb) this).field_M.b(30, -10 + ((bb) this).field_t - 6, 8, 0, ((bb) this).field_j);
            ((bb) this).field_j = ((bb) this).field_j + 35;
            break L16;
          }
        }
        L17: {
          if (((bb) this).field_D == null) {
            break L17;
          } else {
            L18: {
              if (((bb) this).field_E) {
                break L18;
              } else {
                if (((bb) this).field_H) {
                  break L18;
                } else {
                  ((bb) this).field_D.b(20, 40, 8, 0, ((bb) this).field_j);
                  ((bb) this).field_j = ((bb) this).field_j + 25;
                  break L17;
                }
              }
            }
            ((bb) this).field_D.b(30, -10 + (-6 + ((bb) this).field_t), 8, 0, ((bb) this).field_j);
            ((bb) this).field_j = ((bb) this).field_j + 35;
            break L17;
          }
        }
        L19: {
          ((bb) this).b(3 + ((bb) this).field_j, ((bb) this).field_t, 0, 0, 0);
          ((bb) this).a((rc) (Object) ((bb) this).field_N, 5411);
          if (((bb) this).field_M == null) {
            break L19;
          } else {
            ((bb) this).a((rc) (Object) ((bb) this).field_M, 5411);
            break L19;
          }
        }
        L20: {
          if (null == ((bb) this).field_D) {
            break L20;
          } else {
            ((bb) this).a((rc) (Object) ((bb) this).field_D, 5411);
            break L20;
          }
        }
    }

    final static void a(byte param0, int param1, int param2) {
        h.field_g = param1;
        me.field_b = param2;
        je.field_d = 1;
        if (param0 != -14) {
            bb.a((byte) -52);
        }
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if (param4) {
            break L0;
          } else {
            ((bb) this).field_J = true;
            break L0;
          }
        }
        L1: {
          if (param3 == ((bb) this).field_N) {
            this.k(-1525);
            break L1;
          } else {
            if (param3 != ((bb) this).field_M) {
              if (param3 == ((bb) this).field_D) {
                if (!((bb) this).field_E) {
                  if (((bb) this).field_H) {
                    ig.a((byte) -82);
                    break L1;
                  } else {
                    qd.a((byte) -13);
                    break L1;
                  }
                } else {
                  rf.h(15);
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              wf.d(350);
              break L1;
            }
          }
        }
    }

    final boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 0;
        var5 = 34 % ((param1 - 31) / 56);
        if (super.a(param0, (byte) -36, param2, param3)) {
          return true;
        } else {
          if (98 == param2) {
            return ((bb) this).a((byte) -114, param3);
          } else {
            if ((param2 ^ -1) == -100) {
              return ((bb) this).b(90, param3);
            } else {
              return false;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(null == ((bb) this).field_K)) {
            int discarded$0 = ua.field_G.a(((bb) this).field_K, ((bb) this).field_m + (param2 + 20), 15 + (((bb) this).field_j + param0), -40 + ((bb) this).field_t, ((bb) this).field_x, 16777215, -1, 1, 0, ua.field_G.field_F);
        }
        if (null != ((bb) this).field_M) {
            mi.b(10 + param2, param0 - -134, ((bb) this).field_t - 20, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    final void a(int param0, String param1) {
        vg var3 = ((bb) this).field_O;
        String var4 = param1;
        if (param0 != 25) {
            ((bb) this).field_L = null;
        }
        var3.a(param0 ^ -110, false, var4);
        ((bb) this).field_L.l(param0 ^ -125);
    }

    public static void a(byte param0) {
        field_P = null;
        if (param0 < 92) {
            return;
        }
        field_I = null;
    }

    public final void a(vg param0, byte param1) {
        if (param1 != -79) {
            ((bb) this).field_E = false;
        }
    }

    final String j(int param0) {
        if (param0 != -19569) {
            return null;
        }
        if (((bb) this).field_O.field_i == null) {
            return "";
        }
        return ((bb) this).field_O.field_i;
    }

    private final void k(int param0) {
        if (!ji.a(-19688)) {
            // if_icmpge L65
            // if_icmpge L65
        }
        hg.a(8192, ((bb) this).field_O.field_i, ((bb) this).field_L.field_i);
        if (param0 != -1525) {
            ((bb) this).field_J = true;
        }
    }

    final static boolean h(int param0) {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = 34 % ((param0 - -11) / 48);
            if (10 > fj.field_i) {
              break L1;
            } else {
              if (-14 < (kj.field_R ^ -1)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void i(int param0) {
        ((bb) this).field_O.l(-115);
        ((bb) this).field_L.l(-87);
        if (param0 < 5) {
            String discarded$0 = ((bb) this).j(-11);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new fg("usename");
        field_P = new int[10];
    }
}
