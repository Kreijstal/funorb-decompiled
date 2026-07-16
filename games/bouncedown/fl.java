/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int[] field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8192) {
            field_b = null;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        if (param0 != 8192) {
          field_b = null;
          ph.a("", param1, (byte) 43);
          lg.a(0, param1);
          return;
        } else {
          ph.a("", param1, (byte) 43);
          lg.a(0, param1);
          return;
        }
    }

    final static fb a(byte param0, String param1) {
        Object var2 = null;
        Object var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        var3 = null;
        var5 = Bounce.field_N;
        if (tk.field_b != null) {
          if (param0 <= -124) {
            L0: {
              var8 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) ce.a(var8, 0);
              if (var2 != null) {
                break L0;
              } else {
                var2 = var3;
                break L0;
              }
            }
            var3 = (Object) (Object) (fb) (Object) tk.field_b.a((long)((String) var2).hashCode(), 0);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var9 = (CharSequence) (Object) ((fb) var3).field_ob;
                  var4 = ce.a(var9, 0);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = ((fb) var3).field_ob;
                    break L2;
                  }
                }
                if (var4.equals(var2)) {
                  return (fb) var3;
                } else {
                  var3 = (Object) (Object) (fb) (Object) tk.field_b.b(0);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            L3: {
              field_b = null;
              var6 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) ce.a(var6, 0);
              if (var2 != null) {
                break L3;
              } else {
                var2 = (Object) (Object) var6;
                break L3;
              }
            }
            var3 = (Object) (Object) (fb) (Object) tk.field_b.a((long)((String) var2).hashCode(), 0);
            L4: while (true) {
              if (var3 != null) {
                L5: {
                  var7 = (CharSequence) (Object) ((fb) var3).field_ob;
                  var4 = ce.a(var7, 0);
                  if (var4 != null) {
                    break L5;
                  } else {
                    var4 = ((fb) var3).field_ob;
                    break L5;
                  }
                }
                if (var4.equals(var2)) {
                  return (fb) var3;
                } else {
                  var3 = (Object) (Object) (fb) (Object) tk.field_b.b(0);
                  continue L4;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static tg[] a(int param0, int param1, gk param2, int param3) {
        int var4 = 0;
        var4 = 19 / ((65 - param0) / 57);
        if (!c.a(param2, false, param1, param3)) {
          return null;
        } else {
          return kc.a(true);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_a = 500;
    }
}
