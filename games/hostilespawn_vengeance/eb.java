/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static bd field_b;
    static sc field_c;
    static String field_d;
    static int field_a;
    static ug field_e;
    static String field_f;

    final static void a(fd param0, int param1, Object param2) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_d) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  if (50 <= var3_int) {
                    break L2;
                  } else {
                    if (null == param0.field_d.peekEvent()) {
                      break L2;
                    } else {
                      vj.a(1L, (byte) -49);
                      var3_int++;
                      continue L1;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      if (param1 == 1001) {
                        break L4;
                      } else {
                        field_f = (String) null;
                        break L4;
                      }
                    }
                    if (param2 == null) {
                      break L3;
                    } else {
                      param0.field_d.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
                      return;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (Exception) (Object) decompiledCaughtException;
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("eb.B(");

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
          throw wg.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        if (param0 <= 53) {
          eb.a(88);
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_e = null;
          return;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 13372) {
            field_c = (sc) null;
            if (!(-1 != jd.field_q)) {
                if (!(re.c((byte) 33, 1))) {
                    return false;
                }
                jd.field_q = sc.field_g.l(32270);
                sc.field_g.field_i = 0;
            }
            if (!(-2 != jd.field_q)) {
                if (!(re.c((byte) 33, 2))) {
                    return false;
                }
                jd.field_q = sc.field_g.e(8);
                sc.field_g.field_i = 0;
            }
            return re.c((byte) 33, jd.field_q);
        }
        if (!(-1 != jd.field_q)) {
            if (!(re.c((byte) 33, 1))) {
                return false;
            }
            jd.field_q = sc.field_g.l(32270);
            sc.field_g.field_i = 0;
        }
        if (!(-2 != jd.field_q)) {
            if (!(re.c((byte) 33, 2))) {
                return false;
            }
            jd.field_q = sc.field_g.e(8);
            sc.field_g.field_i = 0;
        }
        return re.c((byte) 33, jd.field_q);
    }

    static {
        field_d = null;
        field_a = 5;
        field_f = "Become a member to get this expansion and...";
    }
}
