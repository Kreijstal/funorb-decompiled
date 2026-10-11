/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    static String field_b;
    static String field_c;
    static String[] field_e;
    static volatile long field_d;
    static String field_a;

    final static boolean a(int param0, boolean param1, int param2) {
        int stackIn_3_0 = 0;
        int var3;
        String var4;
        String var4Lifetime1;
        stackIn_3_0 = (null == ej.field_n) ? 0 : 1;
        var3 = stackIn_3_0;
        if (sj.field_p != 9) {
          if (sj.field_p == 10) {
            if (var3 != 0) {
              return false;
            }
            q.a(13151);
            return true;
          }
          if (11 != sj.field_p) {
            if (param1) {
            }
            return false;
          }
          if (!vh.field_Hb) {
            if (param1) {
            }
            return false;
          }
          if (fh.field_n != 2) {
            if (fh.field_n != 2 &&
              var3 != 0) {
              return false;
            }
          } else {
            if (!pd.a(da.field_c, v.field_a, 2)) {
              return false;
            }
            if (fh.field_n == 2) {
              if (ob.d((byte) 88)) {
                var4 = (String) null;
                kb.a(mi.field_Gb, v.field_a, param0, (String) null, fh.field_n, 29602);
              }
              return true;
            }
            if (var3 != 0) {
              return false;
            }
          }
        } else {
          if (tn.a(bq.field_f, ld.field_Kb, (byte) -81, en.field_c, tb.field_t)) {
            if (en.field_c == 2) {
              return na.a(tb.field_t, (byte) -46, bq.field_f, ld.field_Kb, en.field_c);
            }
            if (var3 == 0) {
              return na.a(tb.field_t, (byte) -46, bq.field_f, ld.field_Kb, en.field_c);
            }
            return false;
          }
          if (sj.field_p == 10) {
            if (var3 != 0) {
              return false;
            }
            q.a(13151);
            return true;
          }
          if (11 != sj.field_p) {
            if (!param1) {
            }
            return false;
          }
          if (!vh.field_Hb) {
            if (!param1) {
            }
            return false;
          }
          if (fh.field_n == 2 &&
            !pd.a(da.field_c, v.field_a, 2)) {
            return false;
          }
          if (fh.field_n != 2 &&
            var3 != 0) {
            return false;
          }
        }
        if (ob.d((byte) 88)) {
          var4Lifetime1 = (String) null;
          kb.a(mi.field_Gb, v.field_a, param0, (String) null, fh.field_n, 29602);
        }
        return true;
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          if (param1 != 11) {
            field_c = (String) null;
          }
          param0.addKeyListener(um.field_c);
          param0.addFocusListener(um.field_c);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "eo.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rp.field_l.a(param6, param2, param5, param4, -3344);
        if (mj.field_Ib != null) {
          mj.field_Ib.a(-ti.field_Y + param0, param6, param3 ^ 77, param1, param0, param6);
          if (param3 != -10) {
            eo.a(114, -96, -86, -58, 125, -101, 21);
            return;
          }
          return;
        }
        if (param3 == -10) {
          return;
        }
        eo.a(114, -96, -86, -58, 125, -101, 21);
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = -49 / ((21 - param0) / 36);
    }

    static {
        field_c = "Open new routes for your zombies to attack from.";
        field_a = "Month";
        field_d = 0L;
    }
}
