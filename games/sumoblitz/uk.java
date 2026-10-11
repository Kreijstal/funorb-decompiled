/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gt implements ai {
    static boolean field_ob;
    static char[] field_lb;
    private boolean field_nb;
    private boolean field_pb;
    private js field_mb;

    uk(dg param0, js param1) {
        super(param0, tq.field_a, su.field_c, false, false);
        try {
          this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(boolean param0) {
        field_lb = null;
        if (!param0) {
          return;
        }
        uk.g(false);
    }

    private final void a(boolean param0, byte param1, an param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        lc var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.field_nb = true;
          if (!param2.field_b) {
            if (param2.field_h == null) {
              var4 = param2.field_g;
              if (param2.field_e == 248) {
                if (!param0) {
                  gj.c(0);
                }
                var4 = rn.field_a;
                this.field_pb = true;
              }
            } else {
              var4 = au.field_e;
              if (null != this.field_mb) {
                this.field_mb.a((byte) -119);
              }
            }
          } else {
            var4 = vl.field_b;
          }
          var5 = -1 / ((-1 - param1) / 45);
          var6 = new lc((gt) (this), tq.field_a, var4);
          if (!param2.field_b) {
            if (this.field_pb) {
              var6.a(wd.field_h, (byte) -123, (qm) (this));
            } else {
              if (param2.field_e != 5) {
                var6.a(cq.field_c, -1, true);
              } else {
                var6.a(vf.field_e, 11, true);
                var6.a(of.field_k, 17, true);
              }
            }
            if (param2.field_e == 3) {
              var6.a(lq.field_c, 7, true);
            } else {
              if (param2.field_e != 6) {
                this.b((byte) -123, var6);
                return;
              }
              var6.a(eq.field_w, 9, true);
            }
          } else {
            if (param2.field_c) {
              this.b((byte) -95, new th(this));
              return;
            }
            var6.a(wd.field_h, (byte) -123, (qm) (this));
          }
          this.b((byte) -123, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("uk.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void f(boolean param0) {
        this.a(param0, (byte) 127, au.a(-91, rn.field_a, 248));
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param1 != 710) {
          field_ob = true;
        }
        if (this.field_pb) {
          sm.a((byte) -40, false, true);
          return;
        }
        try {
          kh.a(false);
          this.n(-7);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "uk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (wv.a((byte) -98, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (wv.a((byte) -95, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param1.charAt(var6);
            if (or.a((byte) 61, (char) var7)) {
              var8 = iv.a(241, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (~var5.length() != param0) {
            stackIn_29_0 = var5.toString();
            return stackIn_29_0;
          }
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("uk.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final boolean g(int param0) {
        an var2 = null;
        if (this.field_D) {
          if (this.field_nb) {
            if (param0 == -28778) {
              return super.g(param0 + 0);
            }
            return false;
          }
          var2 = ki.c((byte) 94);
          if (var2 == null) {
            if (param0 == -28778) {
              return super.g(param0 + 0);
            }
            return false;
          }
          this.a(false, (byte) -128, var2);
        }
        if (param0 == -28778) {
          return super.g(param0 + 0);
        }
        return false;
    }

    static {
        field_ob = false;
        field_lb = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
