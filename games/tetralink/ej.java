/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends mc {
    int field_u;
    int field_q;
    static db field_r;
    int field_s;
    boolean field_x;
    int field_n;
    static String field_p;
    static String field_w;
    int field_y;
    static int field_z;
    static String field_t;
    static byte[] field_o;
    static oh field_v;

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var3 = (CharSequence) (Object) param0;
            stackOut_2_0 = ik.field_f.equals((Object) (Object) cc.a(var3, (byte) 103));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ej.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        Object var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        var3 = 11;
        if (lf.field_b == null) {
          return;
        } else {
          var4 = lf.field_b.a(param0, (byte) 58);
          if (var4 != 0) {
            if (var4 != 2) {
              ke.field_c = -1;
              lf.field_b = null;
              return;
            } else {
              if (null == lf.field_b.field_jb) {
                ke.field_c = -1;
                lf.field_b = null;
                return;
              } else {
                if (!lf.field_b.field_jb.equals((Object) (Object) "")) {
                  L0: {
                    if (lf.field_b.field_jb.charAt(0) == 91) {
                      var5 = lf.field_b.field_jb;
                      break L0;
                    } else {
                      var8 = (CharSequence) (Object) lf.field_b.field_jb;
                      var5 = cc.a(var8, (byte) 124);
                      break L0;
                    }
                  }
                  L1: {
                    var6 = null;
                    if (ke.field_c != 0) {
                      break L1;
                    } else {
                      var6 = (Object) (Object) qf.a((byte) 122, var5, 13);
                      break L1;
                    }
                  }
                  L2: {
                    if (ke.field_c != 1) {
                      break L2;
                    } else {
                      var6 = (Object) (Object) ma.a(false, var5, 13);
                      break L2;
                    }
                  }
                  L3: {
                    if (ke.field_c == 2) {
                      var6 = (Object) (Object) li.a(13, var5, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ke.field_c == 3) {
                      var6 = (Object) (Object) aa.a(var5, 13, 2, var5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 == null) {
                    ke.field_c = -1;
                    lf.field_b = null;
                    return;
                  } else {
                    var7 = null;
                    fi.a(0, 0, var5, 2, (String) var6, (String) null);
                    ke.field_c = -1;
                    lf.field_b = null;
                    return;
                  }
                } else {
                  ke.field_c = -1;
                  lf.field_b = null;
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_v = null;
        field_o = null;
        field_p = null;
        field_w = null;
        field_t = null;
    }

    ej(int param0, int param1, boolean param2) {
        ((ej) this).field_y = 0;
        ((ej) this).field_q = 0;
        ((ej) this).field_x = param2 ? true : false;
        ((ej) this).field_u = param1;
        ((ej) this).field_n = param0;
    }

    ej(bi param0, boolean param1) {
        try {
            ((ej) this).field_x = param1 ? true : false;
            ((ej) this).field_s = 0;
            ((ej) this).field_q = 0;
            ((ej) this).field_y = 0;
            ((ej) this).field_u = param0.field_f;
            ((ej) this).field_n = param0.field_b;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Offer rematch";
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = new db(2, 4, 4, 0);
        field_z = 250;
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
