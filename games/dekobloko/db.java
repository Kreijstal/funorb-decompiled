/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class db extends IOException {
    static char[] field_g;
    static w field_c;
    static String[] field_e;
    static int[] field_b;
    static boolean field_d;
    static ck field_f;
    static int field_a;

    public static void a(byte param0) {
        Object var2 = null;
        field_b = null;
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 <= 40) {
          var2 = null;
          db.a(-81, (String) null, (String) null, false);
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static void a(int param0, String param1, String param2, boolean param3) {
        Object var5 = null;
        tc.field_Qb = param2;
        if (param0 >= -125) {
          var5 = null;
          db.a((java.awt.Component) null, true);
          hb.field_Ob = param1;
          wi.a(param3, -83, jc.field_a);
          return;
        } else {
          hb.field_Ob = param1;
          wi.a(param3, -83, jc.field_a);
          return;
        }
    }

    final static void a(java.awt.Component param0, boolean param1) {
        param0.setFocusTraversalKeysEnabled(param1);
        param0.addKeyListener((java.awt.event.KeyListener) (Object) f.field_r);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) f.field_r);
    }

    final static String b(byte param0) {
        if (!(oa.field_f != null)) {
            return "";
        }
        if (param0 < 59) {
            return null;
        }
        return oa.field_f;
    }

    final static void a(boolean param0) {
        vh.field_h = null;
        if (!param0) {
            db.a(true);
        }
    }

    final static String a(CharSequence[] param0, int param1) {
        int var2 = 81 / ((param1 - 44) / 62);
        return hf.a(param0.length, 0, param0, (byte) 74);
    }

    db(String param0) {
        super(param0);
    }

    final static void a(int param0, Object param1, fd param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        if (param2.field_w != null) {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (-51 >= (var3_int ^ -1)) {
                break L1;
              } else {
                if (null == param2.field_w.peekEvent()) {
                  break L1;
                } else {
                  ua.a(1L, -128);
                  var3_int++;
                  continue L0;
                }
              }
            }
            try {
              L2: {
                L3: {
                  if (param0 < -33) {
                    break L3;
                  } else {
                    String discarded$1 = db.a((CharSequence[]) null, -126);
                    break L3;
                  }
                }
                if (param1 == null) {
                  break L2;
                } else {
                  param2.field_w.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param1, 1001, "dummy"));
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static ck[] a(String param0, String param1, ji param2, boolean param3, String param4) {
        ck[] var5 = null;
        var5 = new ck[9];
        if (!param3) {
          return null;
        } else {
          ck dupTemp$3 = id.a(param2, param4, "", 8192);
          var5[8] = dupTemp$3;
          var5[6] = dupTemp$3;
          var5[2] = dupTemp$3;
          var5[0] = dupTemp$3;
          ck dupTemp$4 = id.a(param2, param1, "", 8192);
          var5[7] = dupTemp$4;
          var5[1] = dupTemp$4;
          ck dupTemp$5 = id.a(param2, param0, "", 8192);
          var5[5] = dupTemp$5;
          var5[3] = dupTemp$5;
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_e = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
