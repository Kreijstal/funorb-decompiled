/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he extends ub {
    static tk field_G;
    int field_F;

    final static void a(long param0, java.applet.Applet param1, String param2, int param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param1.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param4 + "=" + param2 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (0L > param0) {
                      var7 = var9 + "; Discard;";
                      break L1;
                    } else {
                      var7 = var9 + "; Expires=" + cd.a(75, param0 * 1000L + bb.b(-1)) + "; Max-Age=" + param0;
                      break L1;
                    }
                  }
                  L2: {
                    if (param3 <= -98) {
                      break L2;
                    } else {
                      field_G = (tk) null;
                      break L2;
                    }
                  }
                  eo.a(param1, -31645, "document.cookie=\"" + var7 + "\"");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("he.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L3;
                }
              }
              L4: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    he(n param0) {
        super(param0.field_k, param0.field_o, param0.field_x, param0.field_u, (dh) null, (tb) null);
        try {
            param0.a(0, (byte) 122, 0, this.field_u, this.field_x);
            this.field_B = param0;
            this.field_F = 256;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public he() {
        super(0, 0, 0, 0, (dh) null, (tb) null);
        this.field_F = 256;
    }

    public static void h(int param0) {
        field_G = null;
        if (param0 != 1000) {
            String var2 = (String) null;
            he.a(-9L, (java.applet.Applet) null, (String) null, -57, (String) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        hj var6;
        if (param3 == 0) {
          if (null == this.field_B) {
            return;
          } else {
            if (0 == this.field_F) {
              return;
            } else {
              if (this.field_F == 256) {
                this.field_B.a(-9532, this.field_o + param1, this.field_k + param2, param3);
                return;
              } else {
                var6 = new hj(this.field_B.field_x, this.field_B.field_u);
                hf.a(var6, -1);
                this.field_B.a(param0, 0, 0, param3);
                dm.b((byte) -10);
                var6.d(param2 - -this.field_k, param1 + this.field_o, this.field_F);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
