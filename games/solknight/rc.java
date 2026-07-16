/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rc extends gg {
    int field_t;
    static kb field_o;
    String field_z;
    dg field_n;
    int field_j;
    String field_i;
    jf field_h;
    int field_k;
    boolean field_v;
    int field_q;
    int field_u;
    static int field_l;
    static String field_s;
    int field_m;
    j field_w;
    static String field_p;
    static String field_y;
    int field_x;
    static java.awt.Image field_r;

    boolean a(int param0, rc param1, int param2, int param3, int param4, int param5, byte param6) {
        if (param6 <= 33) {
            return false;
        }
        return false;
    }

    void a(int param0, int param1, int param2, rc param3) {
        int var5 = ((rc) this).a(ad.field_m, gb.field_j, param0, param2, param1 + -18970) ? 1 : 0;
        if (param1 != 18874) {
            return;
        }
        if (var5 == (!((rc) this).field_v ? 1 : 0)) {
            ((rc) this).field_v = var5 != 0 ? true : false;
            if (null != ((rc) this).field_n) {
                if (!(!(((rc) this).field_n instanceof mk))) {
                    ((mk) (Object) ((rc) this).field_n).a((rc) this, (byte) -121, var5 != 0);
                }
            }
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_r = null;
        if (param0 != -24922) {
            rc.a(32, 42, -124, -105, (o) null, -64, 78, (byte) 43);
        }
        field_p = null;
        field_s = null;
        field_o = null;
    }

    final void b(StringBuilder param0, int param1, Hashtable param2, int param3) {
        int var6 = SolKnight.field_L ? 1 : 0;
        StringBuilder discarded$64 = param0.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((rc) this).field_m).append(",").append(((rc) this).field_j).append(" ").append(((rc) this).field_t).append("x").append(((rc) this).field_x);
        if (!(null == ((rc) this).field_i)) {
            StringBuilder discarded$65 = param0.append(" text=\"").append(((rc) this).field_i).append(34);
        }
        if (!(!((rc) this).field_v)) {
            StringBuilder discarded$66 = param0.append(" mouseover");
        }
        if (!(!((rc) this).b(true))) {
            StringBuilder discarded$67 = param0.append(" focused");
        }
        if (((rc) this).field_w == null) {
        } else {
            StringBuilder discarded$76 = param0.append(" renderer=");
            if (!(((rc) this).field_w instanceof rc)) {
                StringBuilder discarded$78 = param0.append(((rc) this).field_w);
            } else {
                param0 = ((rc) this).a(-100, param2, param0, 1 + param3);
            }
        }
        if (((rc) this).field_n != null) {
            StringBuilder discarded$87 = param0.append(" listener=");
            if (!(((rc) this).field_n instanceof rc)) {
                StringBuilder discarded$89 = param0.append(((rc) this).field_n);
            } else {
                param0 = ((rc) this).a(-57, param2, param0, 1 + param3);
            }
        }
        int var5 = 10 / ((param1 - -43) / 58);
    }

    void a(int param0, int param1, rc param2, int param3, int param4, int param5) {
        ((rc) this).field_u = param1;
    }

    boolean a(char param0, byte param1, int param2, rc param3) {
        int var5 = 75 / ((param1 - 31) / 56);
        return false;
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 <= 85) {
            boolean discarded$0 = rc.a(-41, (CharSequence) null);
        }
        return wh.a(false, param1, (byte) -123);
    }

    public final String toString() {
        return ((rc) this).a(-43, new Hashtable(), new StringBuilder(), 0).toString();
    }

    boolean b(boolean param0) {
        if (!param0) {
            field_r = null;
            return false;
        }
        return false;
    }

    boolean a(int param0, rc param1) {
        if (param0 != -1463) {
            ((rc) this).field_w = null;
            return false;
        }
        return false;
    }

    final boolean a(int param0, char param1, byte param2) {
        if (((rc) this).b(true)) {
            if (((rc) this).a(param1, (byte) -25, param0, (rc) this)) {
                return true;
            }
        }
        int var4 = param0;
        if (-81 == (var4 ^ -1)) {
            return ((rc) this).a(-1463, (rc) this);
        }
        var4 = 2 / ((23 - param2) / 52);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        bc var6 = null;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$3 = ((rc) this).a(118, 41, -10, 127, -68);
            break L0;
          }
        }
        L1: {
          ((rc) this).a(param3, 18874, param1, (rc) this);
          var5 = ((rc) this).b(true) ? 1 : 0;
          if (param2) {
            L2: {
              if (0 == cl.field_n) {
                break L2;
              } else {
                boolean discarded$4 = ((rc) this).a(param3, (rc) this, param1, gb.field_j, cl.field_n, ad.field_m, (byte) 96);
                break L2;
              }
            }
            L3: {
              if (hg.field_F == 0) {
                break L3;
              } else {
                if (!((rc) this).a(hg.field_F, param3, false, db.field_o, s.field_gb, param1, (rc) this)) {
                  if (var5 == 0) {
                    break L3;
                  } else {
                    ((rc) this).g(0);
                    break L3;
                  }
                } else {
                  param2 = false;
                  break L3;
                }
              }
            }
            if (-1 != (wb.field_c ^ -1)) {
              break L1;
            } else {
              if (ne.field_j != 0) {
                ((rc) this).a(ad.field_m, 0, (rc) this, param1, gb.field_j, param3);
                var6 = jf.field_a;
                if (var6 != null) {
                  L4: {
                    if (!(var6.field_n instanceof gk)) {
                      break L4;
                    } else {
                      ((gk) (Object) var6.field_n).a((th) null, -7935, var6);
                      break L4;
                    }
                  }
                  jf.field_a = null;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                ne.field_j = wb.field_c;
                pd.a(125, ((rc) this).c((byte) 78));
                return param2;
              }
            }
          } else {
            if (var5 == 0) {
              break L1;
            } else {
              if (0 != hg.field_F) {
                ((rc) this).g(0);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        ne.field_j = wb.field_c;
        pd.a(125, ((rc) this).c((byte) 78));
        return param2;
    }

    void g(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((rc) this).f(36);
        }
    }

    boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        if (param2) {
            return true;
        }
        if (!((rc) this).a(param4, param3, param1, param5, -113)) {
            return false;
        }
        ((rc) this).field_u = param0;
        return false;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (-1 == (param1 ^ -1)) {
            if (null != ((rc) this).field_w) {
                ((rc) this).field_w.a((byte) 124, param0, true, param2, (rc) this);
            }
        }
        if (param3 != 0) {
            ((rc) this).a(-1, 35, -37, -9);
        }
    }

    String c(byte param0) {
        if (param0 <= 14) {
            ((rc) this).field_i = null;
        }
        if (!((rc) this).field_v) {
            return null;
        }
        return ((rc) this).field_z;
    }

    int f(int param0) {
        int var2 = -86 / ((param0 - 17) / 43);
        return 0;
    }

    final void a(int param0, int param1, int param2) {
        int var5_int = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        if (param0 != 19550) {
            return;
        }
        int var4 = ((rc) this).f(-73);
        for (var5_int = 0; var5_int <= var4; var5_int++) {
            ((rc) this).a(param2, var5_int, param1, 0);
        }
        String var5 = va.a(true);
        if (!(var5 == null)) {
            ph.field_f.a(20, kd.field_c, bf.field_a, var5);
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (!(!((rc) this).a(param2, -1, param1, param3))) {
            ((rc) this).b(param2, -108, param1, param3);
        }
        if (param0 >= -41) {
            ((rc) this).a(38, -79, 40, 69);
        }
        return param2;
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        ((rc) this).field_m = param2;
        ((rc) this).field_j = param4;
        ((rc) this).field_t = param1;
        if (param3 != 0) {
            rc.e(-46);
        }
        ((rc) this).field_x = param0;
    }

    final void d(int param0) {
        ((rc) this).b(((rc) this).field_x, ((rc) this).field_t, ((rc) this).field_m, 0, ((rc) this).field_j);
        if (param0 != 1) {
            boolean discarded$0 = ((rc) this).a('�', (byte) -59, 25, (rc) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, o param4, int param5, int param6, byte param7) {
        o var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var19 = SolKnight.field_L ? 1 : 0;
          if ((mi.field_b ^ -1) < (param1 ^ -1)) {
            param0 = param0 - (mi.field_b - param1);
            param1 = mi.field_b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((param5 ^ -1) <= (mi.field_l ^ -1)) {
            break L1;
          } else {
            param2 = param2 - (-param5 + mi.field_l);
            param5 = mi.field_l;
            break L1;
          }
        }
        L2: {
          if (mi.field_k >= param1 - -param0) {
            break L2;
          } else {
            param0 = -param1 + mi.field_k;
            break L2;
          }
        }
        L3: {
          if ((param2 + param5 ^ -1) >= (mi.field_e ^ -1)) {
            break L3;
          } else {
            param2 = -param5 + mi.field_e;
            break L3;
          }
        }
        L4: {
          if ((param0 ^ -1) >= -1) {
            break L4;
          } else {
            if (0 >= param2) {
              break L4;
            } else {
              L5: {
                var8 = param4.c();
                var9 = mi.field_f;
                var10 = mi.field_a;
                var11 = mi.field_d;
                var12 = new int[4];
                mi.b(var12);
                param4.a();
                mi.d(var12[0], var12[1], var12[2], var12[3]);
                var13 = param4.field_p * param5 + param1;
                var14 = -param0 + param4.field_p;
                var15 = var8.field_v;
                if (param7 == 21) {
                  break L5;
                } else {
                  field_p = null;
                  break L5;
                }
              }
              var16 = param5;
              L6: while (true) {
                if (param2 + param5 <= var16) {
                  var8.d(-param4.field_s, -param4.field_n);
                  mi.a(var9, var10, var11);
                  mi.a(var12);
                  return;
                } else {
                  var17 = param1;
                  L7: while (true) {
                    if (param0 + param1 <= var17) {
                      var13 = var13 + var14;
                      var16++;
                      continue L6;
                    } else {
                      L8: {
                        var18 = var15[var13];
                        if (var18 == 0) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              if (-1 <= (var17 ^ -1)) {
                                break L10;
                              } else {
                                if (-1 == (var15[-1 + var13] ^ -1)) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if ((var16 ^ -1) >= -1) {
                                break L11;
                              } else {
                                if (-1 == (var15[var13 + -param4.field_p] ^ -1)) {
                                  break L9;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (var17 >= -1 + param4.field_p) {
                                break L12;
                              } else {
                                if (var15[1 + var13] == 0) {
                                  break L9;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            if (var16 >= param4.field_t - 1) {
                              break L8;
                            } else {
                              if (var15[param4.field_p + var13] == 0) {
                                break L9;
                              } else {
                                break L8;
                              }
                            }
                          }
                          mi.e(var17, var16, param3, param6);
                          break L8;
                        }
                      }
                      var13++;
                      var17++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param4 < -52) {
          L0: {
            L1: {
              if (((rc) this).field_m + param2 > param1) {
                break L1;
              } else {
                if (param0 < ((rc) this).field_j + param3) {
                  break L1;
                } else {
                  if (((rc) this).field_t + ((rc) this).field_m + param2 <= param1) {
                    break L1;
                  } else {
                    if (param0 >= ((rc) this).field_x + (param3 - -((rc) this).field_j)) {
                      break L1;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    rc(String param0, dg param1) {
        this(param0, ph.field_f.field_a, param1);
    }

    final boolean a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        if (param1 != -1) {
            boolean discarded$0 = ((rc) this).a(37, (rc) null);
        }
        if (!param2.containsKey(this)) {
            Object discarded$1 = param2.put(this, this);
            return true;
        }
        StringBuilder discarded$2 = param0.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
        return false;
    }

    protected rc() {
        ((rc) this).field_k = 0;
        ((rc) this).field_q = 0;
    }

    rc(String param0, j param1, dg param2) {
        eg var4 = null;
        ((rc) this).field_k = 0;
        ((rc) this).field_q = 0;
        ((rc) this).field_w = param1;
        ((rc) this).field_n = param2;
        ((rc) this).field_i = param0;
        if (((rc) this).field_w instanceof eg) {
            var4 = (eg) (Object) ((rc) this).field_w;
            ((rc) this).field_t = var4.a(true, (rc) this);
            ((rc) this).field_x = var4.a((rc) this, -125);
        }
    }

    rc(int param0, int param1, int param2, int param3, j param4, dg param5) {
        ((rc) this).field_k = 0;
        ((rc) this).field_q = 0;
        ((rc) this).field_x = param3;
        ((rc) this).field_n = param5;
        ((rc) this).field_j = param1;
        ((rc) this).field_m = param0;
        ((rc) this).field_t = param2;
        ((rc) this).field_w = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Next Level";
        field_o = new kb();
        field_p = "Creating your account";
        field_y = "Email: ";
    }
}
