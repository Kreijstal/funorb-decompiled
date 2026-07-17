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
            Object var6 = null;
            Object var7 = null;
            uk var8 = null;
            Object var9 = null;
            r stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            r stackOut_16_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != or.field_f.field_o) {
                    ad.field_g = new im(or.field_f.field_o, 5200, 0);
                    or.field_f.field_o = null;
                    var6 = (Object) (Object) new qh(255, ad.field_g, new im(or.field_f.field_r, 12000, 0), 2097152);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ad.field_g != null) {
                    L3: {
                      if (null == rg.field_g) {
                        rg.field_g = new im[or.field_f.field_n.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (null == rg.field_g[param3]) {
                        rg.field_g[param3] = new im(or.field_f.field_n[param3], 12000, 0);
                        or.field_f.field_n[param3] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new qh(param3, ad.field_g, rg.field_g[param3], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var8 = pd.field_c.a(18162, (qh) var6, param0, param3, (qh) var7);
                  if (!param4) {
                    break L5;
                  } else {
                    var8.a((byte) 81);
                    break L5;
                  }
                }
                L6: {
                  if (param1 >= 116) {
                    break L6;
                  } else {
                    var9 = null;
                    tp discarded$2 = vo.a((String) null, 52);
                    break L6;
                  }
                }
                stackOut_16_0 = new r((ab) (Object) var8, param5, param2);
                stackIn_17_0 = stackOut_16_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_17_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public vo() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_C = null;
    }

    final static tp a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        tp var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        tp stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        tp stackOut_18_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (se.field_A != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                L0: {
                  if (param1 == 0) {
                    break L0;
                  } else {
                    vo.a(true);
                    break L0;
                  }
                }
                var6 = (CharSequence) (Object) param0;
                var2 = rc.a(var6, 320);
                if (var2 != null) {
                  var3 = (tp) (Object) se.field_A.a(3661, (long)var2.hashCode());
                  L1: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_Mb;
                      var4 = rc.a(var7, param1 + 320);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_18_0 = (tp) var3;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        var3 = (tp) (Object) se.field_A.a(-121);
                        continue L1;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (tp) (Object) stackIn_12_0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("vo.E(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 41);
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
        ed.field_t = false;
        if (!tk.field_e) {
          var1 = rc.field_b;
          if (0 < var1) {
            if (1 != var1) {
              eg.field_t = Vertigo2.a(new String[1], kn.field_a, 6);
              eg.field_t = oq.a(new CharSequence[3], 86);
              df.field_l.h((byte) 63);
              p.a(-33);
              return;
            } else {
              eg.field_t = ll.field_c;
              eg.field_t = oq.a(new CharSequence[3], 86);
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
          df.field_l.m(2121792);
          return;
        }
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (param2) {
              L1: {
                if (!param3.field_p) {
                  if (param3.f(110)) {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_8_0 = stackOut_5_0;
                    break L1;
                  }
                } else {
                  stackOut_3_0 = 1;
                  stackIn_8_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var6_int = stackIn_8_0;
                if (param3 instanceof d) {
                  param0 = param0 & ((d) (Object) param3).field_F;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0) {
                  if (var6_int != 0) {
                    stackOut_15_0 = ((vo) this).field_z;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = ((vo) this).field_t;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                } else {
                  stackOut_12_0 = ((vo) this).field_B;
                  stackIn_16_0 = stackOut_12_0;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_16_0;
                if (param0) {
                  stackOut_18_0 = 16777215;
                  stackIn_19_0 = stackOut_18_0;
                  break L4;
                } else {
                  stackOut_17_0 = 7105644;
                  stackIn_19_0 = stackOut_17_0;
                  break L4;
                }
              }
              var8 = stackIn_19_0;
              s.a((byte) 49, ((vo) this).field_w, (param3.field_s + -((vo) this).field_w[0].field_B >> 1) + param4 - -param3.field_t, param3.field_n, param3.field_o + param1, var7);
              int discarded$1 = ((vo) this).field_l.a(param3.field_w, param1 - -param3.field_o, -2 + (param4 - -param3.field_t), param3.field_n, param3.field_s, var8, -1, 1, 1, ((vo) this).field_l.field_z);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("vo.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param4 + 41);
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
