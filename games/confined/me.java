/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends am {
    int field_K;
    static double[] field_J;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = param1.getDocumentBase().getFile();
                    var3 = var2.indexOf('?');
                    var4 = "reload.ws";
                    if (param0 >= 31) {
                      L2: {
                        if ((var3 ^ -1) <= -1) {
                          var4 = var4 + var2.substring(var3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5 = new java.net.URL(param1.getCodeBase(), var4);
                      param1.getAppletContext().showDocument(pn.a(var5, (byte) -33, param1), "_self");
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = (Exception) (Object) decompiledCaughtException;
                  var2_ref.printStackTrace();
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref2);
                stackOut_9_1 = new StringBuilder().append("me.B(").append(param0).append(',');
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(byte param0) {
        if (param0 >= -13) {
            return;
        }
        field_J = null;
    }

    me(fj param0) {
        super(param0.field_q, param0.field_m, param0.field_F, param0.field_z, (fe) null, (uk) null);
        try {
            param0.a(-117, this.field_F, 0, this.field_z, 0);
            this.field_H = param0;
            this.field_K = 256;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        nf var6 = null;
        if (param2 >= 36) {
          if (param1 != 0) {
            return;
          } else {
            if (this.field_H != null) {
              if (0 != this.field_K) {
                if ((this.field_K ^ -1) == -257) {
                  this.field_H.a(param0 - -this.field_m, param1, (byte) 45, param3 + this.field_q);
                  return;
                } else {
                  var6 = new nf(this.field_H.field_F, this.field_H.field_z);
                  vm.a(var6, -8409);
                  this.field_H.a(0, param1, (byte) 83, 0);
                  ib.b(false);
                  var6.a(param3 - -this.field_q, this.field_m + param0, this.field_K);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public me() {
        super(0, 0, 0, 0, (fe) null, (uk) null);
        this.field_K = 256;
    }

    static {
        field_J = new double[]{0.0, -20.0, 912.0};
    }
}
