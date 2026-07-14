/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kla {
    static String[] field_a;

    final static void a(fia param0, byte param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null == param0.field_r) {
          return;
        } else {
          var3_int = 0;
          L0: while (true) {
            L1: {
              if (50 <= var3_int) {
                break L1;
              } else {
                if (param0.field_r.peekEvent() == null) {
                  break L1;
                } else {
                  vja.a(0, 1L);
                  var3_int++;
                  continue L0;
                }
              }
            }
            L2: {
              if (param1 > 45) {
                break L2;
              } else {
                var5 = null;
                kla.a((fia) null, (byte) 44, (Object) null);
                break L2;
              }
            }
            try {
              if (param2 != null) {
                param0.field_r.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
              } else {
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return;
            }
          }
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        Object var2 = null;
        if (!jf.field_r) {
          throw new IllegalStateException();
        } else {
          if (param0 != -72) {
            L0: {
              var2 = null;
              kla.a((fia) null, (byte) -10, (Object) null);
              if (null != ci.field_l) {
                ci.field_l.i((byte) -108);
                break L0;
              } else {
                break L0;
              }
            }
            var1 = ooa.a((byte) -107);
            vn.field_b = new jw(var1, (String) null, true, false, false);
            ej.field_a.c((ae) (Object) um.field_l, 84);
            um.field_l.a(68, (ae) (Object) vn.field_b);
            um.field_l.c(true);
            return;
          } else {
            L1: {
              if (null != ci.field_l) {
                ci.field_l.i((byte) -108);
                break L1;
              } else {
                break L1;
              }
            }
            var1 = ooa.a((byte) -107);
            vn.field_b = new jw(var1, (String) null, true, false, false);
            ej.field_a.c((ae) (Object) um.field_l, 84);
            um.field_l.a(68, (ae) (Object) vn.field_b);
            um.field_l.c(true);
            return;
          }
        }
    }

    final static void b(int param0) {
        if (wba.field_o != null) {
            wba.field_o.field_h = false;
            uu.b(12475, param0);
            return;
        }
        uu.b(12475, param0);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -9520) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"<%0> mysteriously dropped dead", "<%0> died of unnatural causes", "<%0> ate munchy crunchy chocolatey cocoa death"};
    }
}
