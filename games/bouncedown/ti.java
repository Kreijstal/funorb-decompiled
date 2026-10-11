/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ti extends ba implements wc {
    static int field_O;
    private uh field_N;
    private int field_M;

    final String d(int param0) {
        if (param0 != 0) {
          lk var3 = (lk) null;
          this.a(57, 60, -66, (lk) null);
          if (!this.field_g) {
            return null;
          }
          if (null != this.field_q) {
            ll.a(uc.field_C - (this.field_M - this.field_k), true, ll.field_y);
            return this.field_q;
          }
          return null;
        }
        if (!this.field_g) {
          return null;
        }
        if (null != this.field_q) {
          ll.a(uc.field_C - (this.field_M - this.field_k), true, ll.field_y);
          return this.field_q;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (param0 != -1) {
            field_O = 53;
          }
          this.field_M = -param1 + (uc.field_C - this.field_r);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ti.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(uh param0, boolean param1) {
        try {
          if (!param1) {
            String var4 = (String) null;
            ti.a((Throwable) null, (byte) 122, (String) null);
          }
          this.field_N = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ti.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        super.h(param0);
        if (null != this.field_N) {
          this.field_N.d((byte) 115);
        }
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
          si stackIn_15_0;
          java.net.URL stackIn_15_1;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          StringBuilder stackIn_15_4;
          java.net.URL stackIn_16_1;
          java.net.URL stackIn_16_2;
          String stackIn_16_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          mk var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Bounce.field_N;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = ae.a((byte) -114, param0);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            if (param1 != 100) {
              return;
            }
            ej.a(param1 ^ 0, var3);
            var7 = ak.a(param1 - 57, ":", "%3a", var3);
            var8 = ak.a(15, "@", "%40", var7);
            var9 = ak.a(88, "&", "%26", var8);
            var10 = ak.a(param1 ^ 48, "#", "%23", var9);
            if (gk.field_j == null) {
              return;
            }
            stackIn_15_0 = jj.field_a;
            stackIn_15_1 = null;
            stackIn_15_2 = null;
            stackIn_15_3 = gk.field_j.getCodeBase();
            stackIn_15_4 = new StringBuilder().append("clienterror.ws?c=").append(nd.field_E).append("&u=");
            if (ke.field_m != null) {
              stackIn_16_1 = null;
              stackIn_16_2 = null;
              stackIn_16_5 = ke.field_m;
            } else {
              stackIn_16_1 = null;
              stackIn_16_2 = null;
              stackIn_16_5 = "" + al.field_h;
            }
            var4 = ((si) (Object) stackIn_15_0).a(new java.net.URL(stackIn_15_3, ((StringBuilder) (Object) stackIn_15_4).append(stackIn_16_5).append("&v1=").append(si.field_r).append("&v2=").append(si.field_d).append("&e=").append(var10).toString()), false);
            while (0 == var4.field_f) {
              wh.a(1L, 19406);
            }
            if (1 != var4.field_f) {
              return;
            }
            var5 = (DataInputStream) (var4.field_e);
            var5.read();
            var5.close();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void l(int param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_36_0 = null;
        oh stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        oh var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Bounce.field_N;
        try {
          var1_int = jl.field_a;
          if (param0 != 6) {
            return;
          }
          var2 = 0;
          if (ne.field_u == 2) {
            var3_long = fa.a(-23) - gd.field_a;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          for (var3 = 0; se.field_E.length > var3; var3++) {
            var4 = m.field_a[var3];
            if (var4 < 0) {
              var5 = bc.field_a;
            } else {
              if (var4 != cf.field_f.field_b) {
                var5 = de.field_f;
              } else {
                var5 = ag.field_c;
              }
            }
            var6 = se.field_E[var3];
            if (ne.field_u == 2 &&
              var2 == 1) {
              if (t.field_r.length > eb.field_E.length) {
                stackIn_20_0 = t.field_r.length;
              } else {
                stackIn_20_0 = eb.field_E.length;
              }
              var7 = stackIn_20_0;
              if (6 <= var3 &&
                var3 < var7 + 6) {
                if (eb.field_E.length + (var3 - 6 - var7) < 0) {
                  stackIn_26_0 = "";
                } else {
                  stackIn_26_0 = eb.field_E[-var7 + (var3 - 6 + eb.field_E.length)];
                }
                var6 = stackIn_26_0;
              }
              if (ll.field_E.length >= vb.field_k.length) {
                stackIn_30_0 = ll.field_E.length;
              } else {
                stackIn_30_0 = vb.field_k.length;
              }
              var8 = stackIn_30_0;
              if (var3 >= 7 + var7 &&
                var3 < var8 + (var7 + 7)) {
                if (var3 - 7 - var7 < ll.field_E.length) {
                  stackIn_36_0 = ll.field_E[-7 + var3 - var7];
                } else {
                  stackIn_36_0 = "";
                }
                var6 = stackIn_36_0;
              }
            }
            if (-2 == var4) {
              var6 = Integer.toString(var2);
            }
            var7Lifetime1 = vh.a(!(var4 < 0), var6, true);
            var8Lifetime1 = bi.field_h - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              var1_int = var1_int + hj.field_a;
              if (cf.field_f.field_b != var4) {
                stackIn_47_0 = d.field_F;
              } else {
                stackIn_47_0 = le.field_a;
              }
              var9 = stackIn_47_0;
              if (var9 != null) {
                var9.a(var1_int, -kk.field_z + var8Lifetime1, (kk.field_z << 1) + var7Lifetime1, param0 ^ -21909, (cl.field_m << 1) + pb.field_j);
              }
              var1_int = var1_int + cl.field_m;
            }
            if (var4 < 0) {
              ba.field_E.b(var6, var8Lifetime1, qd.field_b + var1_int, var5, -1);
              var1_int = var1_int + k.field_D;
            } else {
              jc.field_h.b(var6, var8Lifetime1, ed.field_d + var1_int, var5, -1);
              var1_int = var1_int + (cl.field_m + hj.field_a + pb.field_j);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "ti.Q(" + param0 + ')');
        }
    }

    public final uh a(boolean param0) {
        if (!param0) {
          return (uh) null;
        }
        return this.field_N;
    }

    ti(String param0, sk param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        bc.field_a = param2;
        de.field_f = param0;
        ag.field_c = param1;
        if (param3 != 102) {
          field_O = 92;
        }
    }

    static {
    }
}
