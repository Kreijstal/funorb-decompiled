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
            String var9 = null;
            r stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null != or.field_f.field_o) {
                    ad.field_g = new im(or.field_f.field_o, 5200, 0);
                    or.field_f.field_o = null;
                    var6 = new qh(255, ad.field_g, new im(or.field_f.field_r, 12000, 0), 2097152);
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
                    var7 = new qh(param3, ad.field_g, rg.field_g[param3], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var8 = pd.field_c.a(18162, (qh) (var6), param0, param3, (qh) (var7));
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
                    var9 = (String) null;
                    vo.a((String) null, 52);
                    break L6;
                  }
                }
                stackIn_17_0 = new r(var8, param5, param2);
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var6)).toString());
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
        if (!param0) {
            return;
        }
        field_C = null;
    }

    final static tp a(String param0, int param1) {
        String var2 = null;
        tp var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        tp stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (se.field_A != null) {
              if (param0 != null) {
                if (-1 != (param0.length() ^ -1)) {
                  L1: {
                    if (param1 == 0) {
                      break L1;
                    } else {
                      vo.a(true);
                      break L1;
                    }
                  }
                  var6 = (CharSequence) ((Object) param0);
                  var2 = rc.a(var6, 320);
                  if (var2 != null) {
                    var3 = (tp) ((Object) se.field_A.a(3661, (long)var2.hashCode()));
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_Mb);
                        var4 = rc.a(var7, param1 + 320);
                        if (var4.equals(var2)) {
                          stackIn_19_0 = (tp) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (tp) ((Object) se.field_A.a(-121));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_12_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("vo.E(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tp) ((Object) stackIn_12_0);
        } else {
          return stackIn_19_0;
        }
    }

    private vo(int param0, int param1, int param2) {
        this.field_l = sg.field_a;
        this.field_z = param1;
        this.field_w = q.field_z;
        this.field_B = param2;
        this.field_t = param0;
    }

    final static void c(byte param0) {
        int var1;
        int var2;
        var2 = Vertigo2.field_L ? 1 : 0;
        eg.field_t = null;
        if (param0 == 117) {
          ed.field_t = false;
          if (!tk.field_e) {
            var1 = rc.field_b;
            if (0 < var1) {
              if (1 != var1) {
                eg.field_t = Vertigo2.a(new String[]{Integer.toString(var1)}, kn.field_a, param0 + -111);
                eg.field_t = oq.a(new CharSequence[]{(CharSequence) ((Object) eg.field_t), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) e.field_j)}, param0 + -31);
                df.field_l.h((byte) 63);
                p.a(-33);
                return;
              } else {
                eg.field_t = ll.field_c;
                eg.field_t = oq.a(new CharSequence[]{(CharSequence) ((Object) eg.field_t), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) e.field_j)}, param0 + -31);
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
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            if (param2) {
              L1: {
                if (!param3.field_p) {
                  if (param3.f(110)) {
                    stackIn_8_0 = 1;
                    break L1;
                  } else {
                    stackIn_8_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_8_0 = 1;
                  break L1;
                }
              }
              L2: {
                var6_int = stackIn_8_0;
                if (param3 instanceof d) {
                  param0 = param0 & ((d) ((Object) param3)).field_F;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0) {
                  if (var6_int != 0) {
                    stackIn_16_0 = this.field_z;
                    break L3;
                  } else {
                    stackIn_16_0 = this.field_t;
                    break L3;
                  }
                } else {
                  stackIn_16_0 = this.field_B;
                  break L3;
                }
              }
              L4: {
                var7 = stackIn_16_0;
                if (param0) {
                  stackIn_19_0 = 16777215;
                  break L4;
                } else {
                  stackIn_19_0 = 7105644;
                  break L4;
                }
              }
              var8 = stackIn_19_0;
              s.a((byte) 49, this.field_w, (param3.field_s + -this.field_w[0].field_B >> -120277663) + param4 - -param3.field_t, param3.field_n, param3.field_o + param1, var7);
              this.field_l.a(param3.field_w, param1 - -param3.field_o, -2 + (param4 - -param3.field_t), param3.field_n, param3.field_s, var8, -1, 1, 1, this.field_l.field_z);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("vo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_v = "Options";
        field_C = "Spectate";
    }
}
