/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends ca {
    static int field_j;
    o field_f;
    o field_g;
    long field_h;
    static String field_i;

    final static void d(int param0) {
        L0: {
          bm.field_d.n(7920);
          if (na.field_c == null) {
            na.field_c = new ve(bm.field_d, bm.field_a);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          return;
        } else {
          bm.field_d.b((byte) 74, (pj) (na.field_c));
          return;
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = 107 % ((param0 - 8) / 51);
    }

    final void c(int param0) {
        String[] var3 = null;
        if (this.field_g != null) {
          this.field_g.field_f = this.field_f;
          this.field_f.field_g = this.field_g;
          this.field_f = null;
          if (param0 != -1) {
            var3 = (String[]) null;
            o.a(5, (byte) -99, (java.applet.Applet) null, (String[]) null, 44, -56);
            this.field_g = null;
            return;
          } else {
            this.field_g = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        te.field_O = 0;
        kk.field_S = param3;
        bk.field_e = param0;
        if (b.a((byte) 112, kk.field_S)) {
          L0: {
            var4 = 0;
            if ((kk.field_S ^ -1) == -8) {
              var4 = -1;
              break L0;
            } else {
              break L0;
            }
          }
          nc.field_cb[kk.field_S].a((byte) -108, var4, param2);
          if ((kk.field_S ^ -1) == -8) {
            vk.a(0, param2);
            if (param1 != 2) {
              field_j = -61;
              return;
            } else {
              return;
            }
          } else {
            if (param1 == 2) {
              return;
            } else {
              field_j = -61;
              return;
            }
          }
        } else {
          if (param1 == 2) {
            return;
          } else {
            field_j = -61;
            return;
          }
        }
    }

    final static void a(int param0, byte param1, java.applet.Applet param2, String[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              lf.field_c = param2.getParameter("overxgames");
              if (lf.field_c != null) {
                break L1;
              } else {
                lf.field_c = "0";
                break L1;
              }
            }
            L2: {
              pl.field_a = param2.getParameter("overxachievements");
              if (pl.field_a == null) {
                pl.field_a = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6_ref = param2.getParameter("currency");
              if (var6_ref == null) {
                ml.field_j = 2;
                break L3;
              } else {
                if (!tk.a(10, (CharSequence) ((Object) var6_ref))) {
                  ml.field_j = 2;
                  break L3;
                } else {
                  ml.field_j = th.a(103, (CharSequence) ((Object) var6_ref));
                  if (var9 == 0) {
                    break L3;
                  } else {
                    ml.field_j = 2;
                    break L3;
                  }
                }
              }
            }
            hd.field_t = param0;
            var7 = -51 / ((param1 - 18) / 56);
            pl.field_d = param5;
            uh.field_a = param4;
            il.field_e = new hj[param3.length];
            var8 = 0;
            L4: while (true) {
              L5: {
                L6: {
                  if (param3.length <= var8) {
                    break L6;
                  } else {
                    il.field_e[var8] = new hj(317, 34);
                    var8++;
                    if (var9 != 0) {
                      break L5;
                    } else {
                      if (var9 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                tb.field_c = param3;
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var6);
            stackOut_20_1 = new StringBuilder().append("o.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected o() {
    }

    static {
        field_i = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
