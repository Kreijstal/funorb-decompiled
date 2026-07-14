/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static ri[][] field_a;
    static th field_c;
    static int field_b;

    public static void a(boolean param0) {
        Object var2 = null;
        if (param0) {
          var2 = null;
          ja[] discarded$2 = a.a(-28, (byte) -5, (ul) null, -70);
          field_a = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        pm.field_P = null;
        nj.field_f = false;
        if (ch.field_e) {
          h.field_L.c(false);
          if (param0 != -1) {
            var3 = null;
            boolean discarded$4 = a.a((String) null, (String) null, (byte) 24);
            return;
          } else {
            return;
          }
        } else {
          var1 = qq.field_a;
          if (0 >= var1) {
            h.field_L.m(-7435);
            sp.c(param0 + 1);
            if (param0 != -1) {
              var3 = null;
              boolean discarded$5 = a.a((String) null, (String) null, (byte) 24);
              return;
            } else {
              return;
            }
          } else {
            if (1 == var1) {
              pm.field_P = rp.field_e;
              pm.field_P = wi.a(new CharSequence[3], 77);
              h.field_L.m(-7435);
              sp.c(param0 + 1);
              if (param0 == -1) {
                return;
              } else {
                var3 = null;
                boolean discarded$6 = a.a((String) null, (String) null, (byte) 24);
                return;
              }
            } else {
              pm.field_P = vl.a(al.field_cb, new String[1], 2);
              pm.field_P = wi.a(new CharSequence[3], 77);
              h.field_L.m(-7435);
              sp.c(param0 + 1);
              if (param0 == -1) {
                return;
              } else {
                var3 = null;
                boolean discarded$7 = a.a((String) null, (String) null, (byte) 24);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 >= -38) {
            field_c = null;
            return rn.field_f == null ? ro.field_L : true;
        }
        return rn.field_f == null ? ro.field_L : true;
    }

    final static ja[] a(int param0, byte param1, ul param2, int param3) {
        int var4 = 0;
        if (!ud.a(param3, param2, param0, (byte) -42)) {
          return null;
        } else {
          var4 = -18 / ((param1 - -16) / 62);
          return tg.a(0);
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = ee.a('_', "", param1, -121);
        if (param2 <= -71) {
          var3 = qc.b((byte) -32, param0);
          if (param1.indexOf(param0) == -1) {
            if ((param1.indexOf(var3) ^ -1) != 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_c = null;
          var3 = qc.b((byte) -32, param0);
          if (param1.indexOf(param0) != -1) {
            return true;
          } else {
            L0: {
              if ((param1.indexOf(var3) ^ -1) == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new th();
    }
}
