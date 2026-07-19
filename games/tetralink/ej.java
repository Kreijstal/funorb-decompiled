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
                field_v = (oh) null;
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param0);
            stackOut_2_0 = ik.field_f.equals(cc.a(var3, (byte) 103));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ej.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(boolean param0, int param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        Object var6 = null;
        String var7 = null;
        CharSequence var8 = null;
        var3 = -22 / ((-38 - param2) / 57);
        if (lf.field_b != null) {
          var4 = lf.field_b.a(param0, (byte) 58);
          if (-1 != (var4 ^ -1)) {
            if ((var4 ^ -1) == -3) {
              if (null != lf.field_b.field_jb) {
                if (!lf.field_b.field_jb.equals("")) {
                  L0: {
                    if (lf.field_b.field_jb.charAt(0) == 91) {
                      var5 = lf.field_b.field_jb;
                      break L0;
                    } else {
                      var8 = (CharSequence) ((Object) lf.field_b.field_jb);
                      var5 = cc.a(var8, (byte) 124);
                      break L0;
                    }
                  }
                  L1: {
                    var6 = null;
                    if (ke.field_c != 0) {
                      break L1;
                    } else {
                      var6 = qf.a((byte) 122, var5, param1);
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (ke.field_c ^ -1)) {
                      break L2;
                    } else {
                      var6 = ma.a(false, var5, param1);
                      break L2;
                    }
                  }
                  L3: {
                    if ((ke.field_c ^ -1) == -3) {
                      var6 = li.a(param1, var5, 2);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if ((ke.field_c ^ -1) == -4) {
                      var6 = aa.a(var5, param1, 2, var5);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (var6 != null) {
                    var7 = (String) null;
                    fi.a(0, 0, var5, 2, (String) (var6), (String) null);
                    ke.field_c = -1;
                    lf.field_b = null;
                    return;
                  } else {
                    ke.field_c = -1;
                    lf.field_b = null;
                    return;
                  }
                } else {
                  ke.field_c = -1;
                  lf.field_b = null;
                  return;
                }
              } else {
                ke.field_c = -1;
                lf.field_b = null;
                return;
              }
            } else {
              ke.field_c = -1;
              lf.field_b = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_v = null;
        field_o = null;
        field_p = null;
        field_w = null;
        if (param0 != -1) {
          field_z = -123;
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    ej(int param0, int param1, boolean param2) {
        this.field_y = 0;
        this.field_q = 0;
        this.field_x = param2 ? true : false;
        this.field_u = param1;
        this.field_n = param0;
    }

    ej(bi param0, boolean param1) {
        try {
            this.field_x = param1 ? true : false;
            this.field_s = 0;
            this.field_q = 0;
            this.field_y = 0;
            this.field_u = param0.field_f;
            this.field_n = param0.field_b;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_w = "Offer rematch";
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = new db(2, 4, 4, 0);
        field_z = 250;
        field_t = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
