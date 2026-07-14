/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends nm {
    int field_p;
    static th field_i;
    static String field_n;
    static String field_k;
    static jp field_o;
    static String field_m;
    static String field_l;
    static vl field_j;

    public static void a(byte param0) {
        field_n = null;
        field_k = null;
        field_m = null;
        field_o = null;
        int var1 = 119 / ((param0 - 71) / 51);
        field_l = null;
        field_j = null;
        field_i = null;
    }

    public kq() {
    }

    final static void a(int param0, tg param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1.field_p != null) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (var3_int >= 50) {
                break L1;
              } else {
                if (null == param1.field_p.peekEvent()) {
                  break L1;
                } else {
                  wj.a(param0 + 4192, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param0 == -4317) {
                break L2;
              } else {
                field_o = null;
                break L2;
              }
            }
            try {
              L3: {
                if (param2 == null) {
                  break L3;
                } else {
                  param1.field_p.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                  break L3;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var3 = (Exception) (Object) decompiledCaughtException;
          }
        } else {
          return;
        }
    }

    final static String a(gb param0, byte param1) {
        String var2 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          var2 = null;
          var3 = 13 % ((-28 - param1) / 42);
          if (param0.field_q != null) {
            L1: {
              var6 = param0.field_q;
              var2 = var6;
              var4 = var2;
              var2 = var6;
              if (1 == param0.field_a) {
                var2 = "<img=0>" + var6;
                break L1;
              } else {
                break L1;
              }
            }
            if (-3 != (param0.field_a ^ -1)) {
              break L0;
            } else {
              var2 = "<img=1>" + var2;
              var4 = var2;
              var4 = var2;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          var4 = "";
          if (-3 == param0.field_c) {
            if (!param0.field_e) {
              L3: {
                if (-1 != param0.field_f) {
                  break L3;
                } else {
                  if (-1 == param0.field_d) {
                    var4 = rd.a(hq.field_x, new String[1], (byte) 103);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var4 = rd.a(ek.field_fb, new String[1], (byte) 103);
              break L2;
            } else {
              break L2;
            }
          } else {
            L4: {
              if (-1 != param0.field_c) {
                break L4;
              } else {
                if (th.field_d) {
                  var4 = "[" + fi.field_u + "] ";
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if ((param0.field_c ^ -1) != -2) {
                break L5;
              } else {
                var4 = "[" + rd.a(fm.field_a, new String[1], (byte) 103) + "] ";
                break L5;
              }
            }
            L6: {
              if ((param0.field_c ^ -1) != -5) {
                break L6;
              } else {
                if (jd.field_b == null) {
                  break L6;
                } else {
                  var4 = "[" + jd.field_b + "] ";
                  break L6;
                }
              }
            }
            L7: {
              if ((param0.field_c ^ -1) != -4) {
                break L7;
              } else {
                var4 = "[#" + param0.field_p + "] ";
                break L7;
              }
            }
            if (!param0.field_e) {
              var4 = var4 + var2 + ": ";
              break L2;
            } else {
              break L2;
            }
          }
        }
        return var4;
    }

    final static void a(vn param0, byte param1, int param2, int param3, int param4) {
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (0 < param0.field_v) {
            jc.field_J.c((param0.field_j >> 2019366216) / param2 + param3, param4 - -((param0.field_m >> -1177875000) / param2));
        } else {
            if (-1 > (param0.field_J ^ -1)) {
                gr.field_c.b(param3 - -((param0.field_j >> -1800639416) / param2), param4 - -((param0.field_m >> 1041382888) / param2), 128);
            } else {
                gr.field_c.c(param3 + (param0.field_j >> -377519256) / param2, (param0.field_m >> 1153335912) / param2 + param4);
            }
        }
        if (param1 != -119) {
            Object var7 = null;
            kq.a(-14, (tg) null, (Object) null);
        }
    }

    kq(int param0) {
        ((kq) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Well done! <%0>";
        field_i = new th(14, 0, 4, 1);
        field_k = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_m = "<%0> has not yet unlocked this option for use.";
        field_l = "Email (Login):";
        field_j = new vl();
    }
}
