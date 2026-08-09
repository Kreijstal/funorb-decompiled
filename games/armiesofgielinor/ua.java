/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends bd {
    static String field_y;
    static String field_v;
    static char[] field_u;
    private int field_w;
    private ik field_x;
    static boolean field_t;
    static boolean field_s;

    final static void b(int param0, int param1) {
        if (param0 != 8) {
            return;
        }
        ps.a(param1, true);
    }

    final void a(int param0, ha param1) {
        param1.field_l.a((byte) -119, (tc) (new pj(this.field_x, this.field_w, this.field_m)));
        if (param0 != 64) {
            return;
        }
        try {
            this.field_x.a(param1, param0 + -1700635504);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ua.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        bw var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        String var8 = null;
        byte[] var9 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 0) {
                var9 = new byte[param1];
                var4 = var9;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= param1) {
                    break L1;
                  } else {
                    var9[var5_int] = param2[var5_int + param3];
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                var4 = param2;
                break L1;
              }
            }
            L3: {
              var5 = new bw();
              var5.b(200);
              var5.a((byte) -57, (long)(8 * param1), var4);
              if (param0 == -18423) {
                break L3;
              } else {
                var8 = (String) null;
                ua.a(44, (byte) 45, (String) null);
                break L3;
              }
            }
            var6 = new byte[64];
            var5.a(var6, 0, true);
            stackIn_9_0 = (byte[]) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("ua.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static String a(int param0, byte param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 51) {
                break L1;
              } else {
                var6 = (String) null;
                ua.a((java.applet.Applet) null, 31, (String) null, false);
                break L1;
              }
            }
            var3 = pt.field_W[param0];
            var4 = db.a(true, '_');
            var5 = var3 + var4 + param2;
            stackIn_3_0 = (String) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ua.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
            int var4_int = 0;
            if (!(!hd.field_n.startsWith("win"))) {
                if (br.a(param2, true)) {
                    return;
                }
            }
            var4_int = -80 / ((param1 - 12) / 48);
            try {
                param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                af.a((Throwable) null, 107, "MGR1: " + param2);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ua(ik param0, int param1, int param2) {
        try {
            this.field_w = param1;
            this.field_x = param0;
            this.field_m = param2;
            if (0 > (this.field_w ^ -1)) {
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        field_v = null;
        field_u = null;
        field_y = null;
        if (param0 != -4541) {
            ua.b(-26, 75);
        }
    }

    static {
        field_y = "Respect";
        field_u = new char[128];
        field_v = "Mute this player for 48 hours";
    }
}
