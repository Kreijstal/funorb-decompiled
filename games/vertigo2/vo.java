/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vo extends va {
    private int field_z;
    static int field_x;
    static int field_y;
    private int field_t;
    static String[] field_u;
    private int field_B;
    static String field_C;
    static String field_v;
    private er[] field_w;

    final static r a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        try {
            qh var6 = null;
            IOException var6_ref = null;
            qh var7 = null;
            uk var8 = null;
            Object var9 = null;
            r stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            r stackOut_16_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (null != or.field_f.field_o) {
                  ad.field_g = new im(or.field_f.field_o, 5200, 0);
                  or.field_f.field_o = null;
                  var6 = new qh(255, ad.field_g, new im(or.field_f.field_r, 12000, 0), 2097152);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (ad.field_g != null) {
                  L2: {
                    if (null == rg.field_g) {
                      rg.field_g = new im[or.field_f.field_n.length];
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null == rg.field_g[param3]) {
                      rg.field_g[param3] = new im(or.field_f.field_n[param3], 12000, 0);
                      or.field_f.field_n[param3] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = new qh(param3, ad.field_g, rg.field_g[param3], 2097152);
                  break L1;
                } else {
                  break L1;
                }
              }
              L4: {
                var8 = pd.field_c.a(18162, var6, param0, param3, var7);
                if (!param4) {
                  break L4;
                } else {
                  var8.a((byte) 81);
                  break L4;
                }
              }
              L5: {
                if (param1 >= 116) {
                  break L5;
                } else {
                  var9 = null;
                  tp discarded$2 = vo.a((String) null, 52);
                  break L5;
                }
              }
              stackOut_16_0 = new r((ab) (Object) var8, param5, param2);
              stackIn_17_0 = stackOut_16_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_17_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public vo() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        if (!param0) {
            return;
        }
        field_C = null;
    }

    final static tp a(String param0, int param1) {
        Object var3 = null;
        tp var3_ref = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        CharSequence var10 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        var3 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (se.field_A != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              if (param1 == 0) {
                var12 = (CharSequence) (Object) param0;
                var8 = rc.a(var12, 320);
                if (var8 != null) {
                  var3_ref = (tp) (Object) se.field_A.a(3661, (long)var8.hashCode());
                  L0: while (true) {
                    if (var3_ref != null) {
                      var13 = (CharSequence) (Object) var3_ref.field_Mb;
                      var9 = rc.a(var13, param1 + 320);
                      if (var9.equals((Object) (Object) var8)) {
                        return var3_ref;
                      } else {
                        var3_ref = (tp) (Object) se.field_A.a(-121);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                vo.a(true);
                var10 = (CharSequence) (Object) param0;
                var6 = rc.a(var10, 320);
                if (var6 != null) {
                  var3_ref = (tp) (Object) se.field_A.a(3661, (long)var6.hashCode());
                  L1: while (true) {
                    if (var3_ref != null) {
                      var11 = (CharSequence) (Object) var3_ref.field_Mb;
                      var7 = rc.a(var11, param1 + 320);
                      if (var7.equals((Object) (Object) var6)) {
                        return var3_ref;
                      } else {
                        var3_ref = (tp) (Object) se.field_A.a(-121);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    private vo(int param0, int param1, int param2) {
        ((vo) this).field_l = sg.field_a;
        ((vo) this).field_z = param1;
        ((vo) this).field_w = q.field_z;
        ((vo) this).field_B = param2;
        ((vo) this).field_t = param0;
    }

    final static void c(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        eg.field_t = null;
        if (param0 == 117) {
          ed.field_t = false;
          if (!tk.field_e) {
            var1 = rc.field_b;
            if (0 < var1) {
              if (1 != var1) {
                eg.field_t = Vertigo2.a(new String[1], kn.field_a, param0 + -111);
                eg.field_t = oq.a(new CharSequence[3], param0 + -31);
                df.field_l.h((byte) 63);
                p.a(-33);
                return;
              } else {
                eg.field_t = ll.field_c;
                eg.field_t = oq.a(new CharSequence[3], param0 + -31);
                df.field_l.h((byte) 63);
                p.a(-33);
                return;
              }
            } else {
              df.field_l.h((byte) 63);
              p.a(-33);
              return;
            }
          } else {
            df.field_l.m(param0 ^ 2121781);
            return;
          }
        } else {
          return;
        }
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        if (param2) {
          L0: {
            if (!param3.field_p) {
              if (param3.f(110)) {
                L1: {
                  var6 = 1;
                  if (param3 instanceof d) {
                    param0 = param0 & ((d) (Object) param3).field_F;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param0) {
                    if (var6 != 0) {
                      stackOut_13_0 = ((vo) this).field_z;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = ((vo) this).field_t;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  } else {
                    stackOut_10_0 = ((vo) this).field_B;
                    stackIn_14_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_14_0;
                  if (param0) {
                    stackOut_16_0 = 16777215;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  } else {
                    stackOut_15_0 = 7105644;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
                var8 = stackIn_17_0;
                s.a((byte) 49, ((vo) this).field_w, (param3.field_s + -((vo) this).field_w[0].field_B >> -120277663) + param4 - -param3.field_t, param3.field_n, param3.field_o + param1, var7);
                int discarded$2 = ((vo) this).field_l.a(param3.field_w, param1 - -param3.field_o, -2 + (param4 - -param3.field_t), param3.field_n, param3.field_s, var8, -1, 1, 1, ((vo) this).field_l.field_z);
                return;
              } else {
                stackOut_5_0 = 0;
                stackIn_19_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 1;
              stackIn_19_0 = stackOut_3_0;
              break L0;
            }
          }
          L4: {
            var6 = stackIn_19_0;
            if (param3 instanceof d) {
              param0 = param0 & ((d) (Object) param3).field_F;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (param0) {
              if (var6 != 0) {
                stackOut_26_0 = ((vo) this).field_z;
                stackIn_27_0 = stackOut_26_0;
                break L5;
              } else {
                stackOut_25_0 = ((vo) this).field_t;
                stackIn_27_0 = stackOut_25_0;
                break L5;
              }
            } else {
              stackOut_23_0 = ((vo) this).field_B;
              stackIn_27_0 = stackOut_23_0;
              break L5;
            }
          }
          L6: {
            var7 = stackIn_27_0;
            if (param0) {
              stackOut_29_0 = 16777215;
              stackIn_30_0 = stackOut_29_0;
              break L6;
            } else {
              stackOut_28_0 = 7105644;
              stackIn_30_0 = stackOut_28_0;
              break L6;
            }
          }
          var8 = stackIn_30_0;
          s.a((byte) 49, ((vo) this).field_w, (param3.field_s + -((vo) this).field_w[0].field_B >> -120277663) + param4 - -param3.field_t, param3.field_n, param3.field_o + param1, var7);
          int discarded$3 = ((vo) this).field_l.a(param3.field_w, param1 - -param3.field_o, -2 + (param4 - -param3.field_t), param3.field_n, param3.field_s, var8, -1, 1, 1, ((vo) this).field_l.field_z);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Options";
        field_C = "Spectate";
    }
}
