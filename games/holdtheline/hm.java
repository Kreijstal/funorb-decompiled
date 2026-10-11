/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm {
    static uf field_b;
    static tk field_a;

    final static void a(byte param0, int param1) {
        int stackIn_100_0 = 0;
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = HoldTheLine.field_D;
        ol.field_f = ol.field_f + 1;
        var2 = 116 % ((param0 + 22) / 36);
        if (param1 != a.field_I) {
          if (!va.field_k) {
            if (ol.field_f >= HoldTheLine.field_A) {
              stackIn_100_0 = (HoldTheLine.field_A + lc.field_h > ol.field_f) ? 1 : 0;
            } else {
              stackIn_100_0 = 0;
            }
            var3 = stackIn_100_0;
            if (param1 == -1) {
              ol.field_f = 0;
              if (-1 == param1) {
                if (var3 != 0) {
                  va.field_k = true;
                }
              } else {
                va.field_k = false;
              }
              if (!va.field_k &&
                HoldTheLine.field_A > ol.field_f &&
                na.field_k) {
                ol.field_f = 0;
              }
              a.field_I = param1;
              if (va.field_k &&
                ol.field_f == fd.field_d) {
                ol.field_f = 0;
                va.field_k = false;
              }
              return;
            }
            if (!va.field_k &&
              var3 == 0) {
              ol.field_f = 0;
              if (-1 == param1) {
                if (var3 != 0) {
                  va.field_k = true;
                }
              } else {
                va.field_k = false;
              }
            } else {
              ol.field_f = HoldTheLine.field_A;
              if (-1 != param1) {
                va.field_k = false;
              } else {
                if (var3 == 0) {
                  if (!va.field_k &&
                    HoldTheLine.field_A > ol.field_f &&
                    na.field_k) {
                    ol.field_f = 0;
                  }
                  a.field_I = param1;
                  if (va.field_k &&
                    ol.field_f == fd.field_d) {
                    ol.field_f = 0;
                    va.field_k = false;
                    return;
                  }
                  return;
                }
                va.field_k = true;
              }
            }
            if (!va.field_k &&
              HoldTheLine.field_A > ol.field_f &&
              na.field_k) {
              ol.field_f = 0;
            }
            a.field_I = param1;
            if (!va.field_k) {
              return;
            }
            if (ol.field_f != fd.field_d) {
              return;
            }
            ol.field_f = 0;
            va.field_k = false;
            return;
          }
          var3Lifetime1 = 0;
          if (param1 == -1) {
            ol.field_f = 0;
            if (-1 == param1) {
              if (var3Lifetime1 != 0) {
                va.field_k = true;
              }
            } else {
              va.field_k = false;
            }
            if (!va.field_k &&
              HoldTheLine.field_A > ol.field_f &&
              na.field_k) {
              ol.field_f = 0;
            }
            a.field_I = param1;
            if (va.field_k &&
              ol.field_f == fd.field_d) {
              ol.field_f = 0;
              va.field_k = false;
            }
            return;
          }
          if (!va.field_k &&
            var3Lifetime1 == 0) {
            ol.field_f = 0;
            if (-1 == param1) {
            } else {
              va.field_k = false;
            }
            if (!va.field_k &&
              HoldTheLine.field_A > ol.field_f &&
              na.field_k) {
              ol.field_f = 0;
            }
            a.field_I = param1;
            if (va.field_k &&
              ol.field_f == fd.field_d) {
              ol.field_f = 0;
              va.field_k = false;
            }
            return;
          }
          ol.field_f = HoldTheLine.field_A;
          if (-1 != param1) {
            va.field_k = false;
            if (!va.field_k &&
              HoldTheLine.field_A > ol.field_f &&
              na.field_k) {
              ol.field_f = 0;
            }
            a.field_I = param1;
            if (va.field_k &&
              ol.field_f == fd.field_d) {
              ol.field_f = 0;
              va.field_k = false;
            }
            return;
          }
          if (var3Lifetime1 != 0) {
            va.field_k = true;
            if (!va.field_k &&
              HoldTheLine.field_A > ol.field_f &&
              na.field_k) {
              ol.field_f = 0;
            }
            a.field_I = param1;
            if (va.field_k &&
              ol.field_f == fd.field_d) {
              ol.field_f = 0;
              va.field_k = false;
            }
            return;
          }
        }
        if (!va.field_k &&
          HoldTheLine.field_A > ol.field_f) {
          if (!na.field_k) {
            a.field_I = param1;
            if (va.field_k &&
              ol.field_f == fd.field_d) {
              ol.field_f = 0;
              va.field_k = false;
            }
            return;
          }
          ol.field_f = 0;
        }
        a.field_I = param1;
        if (!va.field_k) {
          return;
        }
        if (ol.field_f != fd.field_d) {
          return;
        }
        ol.field_f = 0;
        va.field_k = false;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_b = (uf) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = HoldTheLine.field_D;
        try {
          if (param0 < 60) {
            field_b = (uf) null;
          }
          var1_int = qg.field_d[0];
          for (var2 = 1; qg.field_d.length > var2; var2++) {
            var3 = qg.field_d[var2];
            bc.a(al.field_b, var2 << 4, al.field_b, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "hm.E(" + param0 + ')');
        }
    }

    final static kg a(int param0, String param1) {
        RuntimeException var2 = null;
        kg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5499) {
            hm.a((byte) -81, 114);
          }
          stackIn_3_0 = new kg(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ie var4_ref_ie = null;
        fl var5 = null;
        int var5_int = 0;
        Object var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        da var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        var7 = HoldTheLine.field_D;
        try {
          var3 = -84 % ((-58 - param0) / 61);
          var9 = rd.field_e;
          var2 = var9.f((byte) -32);
          if (var2 != 0) {
            if (var2 == 1) {
              var4 = var9.a(-67);
              var5 = (fl) (pd.field_e.b((byte) 85));
              while (var5 != null) {
                if (var4 != var5.field_k) {
                  var5 = (fl) (pd.field_e.c((byte) -26));
                  continue;
                }
                break;
              }
              if (var5 != null) {
                var5.d(0);
                return;
              }
              r.a(-28036);
              return;
            }
            bl.a((Throwable) null, (byte) 65, "A1: " + em.b(false));
            r.a(-28036);
          } else {
            var4_ref_ie = (ie) (oc.field_d.b((byte) 94));
            if (var4_ref_ie == null) {
              r.a(-28036);
              return;
            }
            var5_int = var9.f((byte) -85);
            if (0 == var5_int) {
              var6 = null;
            } else {
              var11 = new byte[var5_int];
              var10 = var11;
              var8 = var10;
              var6 = var8;
              var9.a(var5_int, 0, (byte) 118, var11);
            }
            var9.field_l = var9.field_l + 4;
            if (!var9.e((byte) 78)) {
              r.a(-28036);
              return;
            }
            var4_ref_ie.field_m = true;
            var4_ref_ie.field_l = (byte[]) (var6);
            var4_ref_ie.d(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "hm.B(" + param0 + ')');
        }
    }

    static {
    }
}
