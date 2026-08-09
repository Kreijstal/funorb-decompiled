/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kla {
    static String[] field_a;

    final static void a(fia param0, byte param1, Object param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == param0.field_r) {
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (50 <= var3_int) {
                    break L2;
                  } else {
                    if (param0.field_r.peekEvent() == null) {
                      break L2;
                    } else {
                      vja.a(0, 1L);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                L3: {
                  if (param1 > 45) {
                    break L3;
                  } else {
                    var5 = (Object) null;
                    kla.a((fia) null, (byte) 44, (Object) null);
                    break L3;
                  }
                }
                try {
                  L4: {
                    if (param2 != null) {
                      param0.field_r.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                      break L4;
                    } else {
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("kla.B(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
    }

    final static void a(byte param0) {
        String var1;
        Object var2;
        if (!jf.field_r) {
          throw new IllegalStateException();
        } else {
          if (param0 != -72) {
            L0: {
              var2 = (Object) null;
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
            ej.field_a.c(um.field_l, 84);
            um.field_l.a(68, vn.field_b);
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
            ej.field_a.c(um.field_l, 84);
            um.field_l.a(68, vn.field_b);
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
            field_a = (String[]) null;
        }
    }

    static {
        field_a = new String[]{"<%0> mysteriously dropped dead", "<%0> died of unnatural causes", "<%0> ate munchy crunchy chocolatey cocoa death"};
    }
}
