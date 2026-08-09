/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends hc {
    String field_V;
    static int field_sb;
    String field_qb;
    int field_tb;
    static qb field_ub;
    static int field_pb;
    static k field_S;
    static String[] field_ob;
    static int field_rb;

    final static boolean a(String param0, boolean param1, int param2, byte param3, String param4, String param5, v param6) {
        qd var7 = null;
        RuntimeException var7_ref = null;
        qd var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -38) {
                break L1;
              } else {
                field_pb = -128;
                break L1;
              }
            }
            if (fk.field_q == pj.field_D) {
              var8 = new qd(ng.field_c, param6);
              var7 = var8;
              ng.field_c.a((byte) -109, (vg) (var8));
              if (wh.a(false)) {
                var8.p(248);
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  ol.field_j = param0;
                  jj.field_d = null;
                  bg.field_q = param4;
                  if (!param1) {
                    stackIn_9_0 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = 1;
                    break L2;
                  }
                }
                rh.field_i = stackIn_9_0 != 0;
                ue.field_d = param5;
                rd.field_z = param2;
                fk.field_q = field_ub;
                return true;
              }
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7_ref);

            stackIn_14_1 = new StringBuilder().append("hg.J(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param5 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param6 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void h(int param0) {
        field_ob = null;
        int var1 = -51 / ((71 - param0) / 47);
        field_S = null;
        field_ub = null;
    }

    final static a d(byte param0) {
        String var1;
        L0: {
          var1 = vd.f(-120);
          if (var1 == null) {
            break L0;
          } else {
            if ((var1.indexOf('@') ^ -1) > -1) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 > -11) {
          hg.a(-53, 13, (byte) 24);
          return new a(vd.f(-52), bh.b((byte) -94));
        } else {
          return new a(vd.f(-52), bh.b((byte) -94));
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            String var3 = null;
            String var4 = null;
            String var5 = null;
            try {
                ml.field_h = param2;
                try {
                    var3 = param0.getParameter("cookieprefix");
                    var4 = param0.getParameter("cookiehost");
                    var5 = var3 + "session=" + param2 + "; version=1; path=/; domain=" + var4;
                    if (!((param2.length() ^ -1) != param1)) {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    pb.a(true, "document.cookie=\"" + var5 + "\"", param0);
                } catch (Throwable throwable) {
                }
                ti.a((byte) -101, param0);
            } catch (RuntimeException runtimeException) {
                throw ie.a((Throwable) ((Object) runtimeException), "hg.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    hg() {
        super(0L, (hc) null);
    }

    final static void e(byte param0) {
        cd.a(bg.field_q, param0 + -170, (String) null);
        if (param0 != 47) {
            hg.h(105);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -82) {
                break L1;
              } else {
                field_pb = -26;
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param0 <= 0) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = param1 & 1 | var3_int << -676123039;
                param0--;
                param1 = param1 >>> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var3), "hg.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_pb = 0;
        field_ub = new qb();
        field_ob = new String[40];
    }
}
