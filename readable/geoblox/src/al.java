/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        wc var4_ref_wc = null;
        int var6 = 0;
        pk var9 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var4 = 0;
        Object var5 = null;
        ca var8 = null;
        byte[] var13 = null;
        var6 = Geoblox.field_C;
        try {
          if (param0 != 26146) {
            return;
          }
          L0: {
            var9 = eh.field_d;
            var2 = var9.c((byte) 34);
            if (var2 == 0) {
              var8 = (ca) ((Object) qa.field_e.firstForIteration(0));
              if (var8 == null) {
                jl.a((byte) -124);
                return;
              }
              {
                var4 = var9.c((byte) 34);
                if (0 != var4) {
                  var13 = new byte[var4];
                  var9.b(29915, var4, var13, 0);
                } else {
                  var5 = null;
                }
                var9.field_f = var9.field_f + 4;
                if (!var9.h((byte) 20)) {
                  jl.a((byte) -121);
                  return;
                }
                var8.unlinkNode(false);
              }
            } else {
              if (1 == var2) {
                var3 = var9.a((byte) -101);
                var4_ref_wc = (wc) ((Object) l.field_g.firstForIteration(0));
                L2: while (var4_ref_wc != null) {
                  if (var3 != var4_ref_wc.field_h) {
                    var4_ref_wc = (wc) ((Object) l.field_g.nextForIteration(1));
                    continue L2;
                  }
                  break;
                }
                if (var4_ref_wc != null) {
                  var4_ref_wc.unlinkNode(false);
                  break L0;
                }
                jl.a((byte) -124);
                return;
              }
              gi.a((Throwable) null, "A1: " + og.e(55), (byte) 125);
              jl.a((byte) -120);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "al.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var4 = Geoblox.field_C;
        var2 = qi.b(3, param0 ^ 9667);
        if (param0 != 9666) {
          return;
        }
        var3 = param1;
        if (var3 != 4) {
          if (var3 == 3) {
            td.playPcmSample(-348, fl.field_c[var2 + 13]);
          } else {
            if (var3 != 1) {
              if (var3 != 0) {
                if (var3 == 6) {
                  td.playPcmSample(-348, fl.field_c[var2 + 4]);
                } else {
                  if (5 == var3) {
                    td.playPcmSample(-348, fl.field_c[16 + var2]);
                  } else {
                    if (var3 == 2) {
                      td.playPcmSample(-348, fl.field_c[var2 + 19]);
                    }
                  }
                }
              } else {
                td.playPcmSample(-348, fl.field_c[var2 + 1]);
              }
            } else {
              td.playPcmSample(-348, fl.field_c[7 + var2]);
            }
          }
        } else {
          td.playPcmSample(-348, fl.field_c[10 + var2]);
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            int var5 = 0;
            RuntimeException var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            boolean stackIn_21_0 = false;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            var7 = Geoblox.field_C;
            try {
              if (td.field_H) {
                return true;
              }
              try {
                L0: {
                  var8 = "tuhstatbut";
                  var3 = (String) (wk.a((byte) -6, param1, "getcookies"));
                  var4 = uj.a(';', true, var3);
                  for (var5 = 0; var5 < var4.length; var5++) {
                    var6 = var4[var5].indexOf('=');
                    if (var6 >= 0) {
                      if (var4[var5].substring(0, var6).trim().equals(var8)) {
                        return true;
                      }
                    }
                  }
                  if (param0 != -109) {
                    al.a(114, -32);
                  }
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
              }
              stackIn_21_0 = !(null == param1.getParameter("tuhstatbut"));
              return stackIn_21_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_24_0 = (RuntimeException) (var2);

              stackIn_24_1 = new StringBuilder().append("al.A(").append(param0).append(',');

              if (param1 == null) {
                stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                stackIn_25_2 = "null";
              } else {
                stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                stackIn_25_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String b(int param0) {
        if (!(IntrusiveDeque.field_d != kd.field_b)) {
            return oc.field_a;
        }
        if (IntrusiveDeque.field_d == si.field_g) {
            return cg.field_k;
        }
        if (param0 != 0) {
            al.b(66);
        }
        if (!ih.field_c.a(-91)) {
            return cg.field_k;
        }
        return b.field_a;
    }

    static {
    }
}
