/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static String field_g;
    private int field_b;
    private int field_d;
    private int field_f;
    static String field_c;
    static rd field_a;
    private int field_e;

    final static boolean a(long param0, String param1, byte param2) {
        int var4 = 0;
        hl var5 = null;
        var4 = 95 % ((-83 - param2) / 33);
        var5 = lg.a(param1, (byte) -34);
        if (var5 != null) {
          if (var5.field_Ib == null) {
            if (vu.field_M != null) {
              if (null != hr.a(param0, -77)) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (vu.field_M != null) {
            if (null == hr.a(param0, -77)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(wq param0, boolean param1) {
        Object var3 = null;
        L0: {
          var3 = this;
          if (param0 != null) {
            break L0;
          } else {
            param0 = new wq();
            break L0;
          }
        }
        param0.field_e = ((wq) var3).field_e;
        param0.field_b = ((wq) var3).field_b;
        if (!param1) {
          boolean discarded$2 = wq.a(true, -102, -89, 25, 68, 22, (byte) 122);
          param0.field_d = ((wq) var3).field_d;
          param0.field_f = ((wq) var3).field_f;
          return;
        } else {
          param0.field_d = ((wq) var3).field_d;
          param0.field_f = ((wq) var3).field_f;
          return;
        }
    }

    final void a(int param0, wq param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = ik.a((long)param1.field_b, (long)((wq) this).field_b, -1700635440) + -ik.a((long)param1.field_f, (long)((wq) this).field_f, -1700635440) - (ik.a((long)param1.field_d, (long)((wq) this).field_d, -1700635440) - -ik.a((long)param1.field_e, (long)((wq) this).field_e, param0 + -1700635441));
        var4 = ik.a((long)param1.field_b, (long)((wq) this).field_f, -1700635440) + (ik.a((long)param1.field_f, (long)((wq) this).field_b, -1700635440) - -ik.a((long)param1.field_d, (long)((wq) this).field_e, -1700635440)) - ik.a((long)param1.field_e, (long)((wq) this).field_d, -1700635440);
        var5 = ik.a((long)param1.field_b, (long)((wq) this).field_d, -1700635440) + -ik.a((long)param1.field_f, (long)((wq) this).field_e, -1700635440) + (ik.a((long)param1.field_d, (long)((wq) this).field_b, -1700635440) + ik.a((long)param1.field_e, (long)((wq) this).field_f, -1700635440));
        ((wq) this).field_e = ik.a((long)param1.field_b, (long)((wq) this).field_e, param0 + -1700635441) - -ik.a((long)param1.field_f, (long)((wq) this).field_d, -1700635440) + (-ik.a((long)param1.field_d, (long)((wq) this).field_f, -1700635440) - -ik.a((long)param1.field_e, (long)((wq) this).field_b, -1700635440));
        if (param0 != 1) {
          return;
        } else {
          ((wq) this).field_b = var3;
          ((wq) this).field_d = var5;
          ((wq) this).field_f = var4;
          ((wq) this).a(param0 ^ 125);
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        if (param0 > 65) {
          var2 = ik.a((long)((wq) this).field_b, (long)((wq) this).field_b, -1700635440) + ik.a((long)((wq) this).field_f, (long)((wq) this).field_f, -1700635440) + (ik.a((long)((wq) this).field_d, (long)((wq) this).field_d, -1700635440) + ik.a((long)((wq) this).field_e, (long)((wq) this).field_e, -1700635440));
          if (-65536 >= (var2 ^ -1)) {
            if (var2 > 65537) {
              var2 = so.a(var2, -129);
              ((wq) this).field_b = ue.a((long)((wq) this).field_b, (long)var2, (byte) 97);
              ((wq) this).field_f = ue.a((long)((wq) this).field_f, (long)var2, (byte) 97);
              ((wq) this).field_d = ue.a((long)((wq) this).field_d, (long)var2, (byte) 97);
              ((wq) this).field_e = ue.a((long)((wq) this).field_e, (long)var2, (byte) 97);
              return;
            } else {
              return;
            }
          } else {
            var2 = so.a(var2, -129);
            ((wq) this).field_b = ue.a((long)((wq) this).field_b, (long)var2, (byte) 97);
            ((wq) this).field_f = ue.a((long)((wq) this).field_f, (long)var2, (byte) 97);
            ((wq) this).field_d = ue.a((long)((wq) this).field_d, (long)var2, (byte) 97);
            ((wq) this).field_e = ue.a((long)((wq) this).field_e, (long)var2, (byte) 97);
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        param4 = param4 >> 1;
        var6 = sr.c(param4, 125);
        var7 = ld.a((byte) 67, param4);
        ((wq) this).field_b = var7;
        ((wq) this).field_f = ik.a((long)param1, (long)var6, -1700635440);
        ((wq) this).field_d = ik.a((long)param3, (long)var6, param0 ^ -1700635393);
        ((wq) this).field_e = ik.a((long)param2, (long)var6, -1700635440);
        if (param0 != 47) {
          var8 = null;
          boolean discarded$2 = wq.a(-48L, (String) null, (byte) -22);
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        Object var8 = null;
        L0: {
          if (!jj.b((byte) -73)) {
            break L0;
          } else {
            L1: {
              jt.a(param6 + -32133, param0, param4, param3);
              if (null == tn.field_Z) {
                break L1;
              } else {
                if (tn.field_Z.a(param1, (byte) 103, param4, param5, param0)) {
                  param0 = false;
                  ot.g(76);
                  break L1;
                } else {
                  kd.a(param6 ^ -81, param4, param0);
                  wm.a(0, param2, param0);
                  param0 = false;
                  if (param6 == -83) {
                    return param0;
                  } else {
                    var8 = null;
                    wq.a((String) null, false);
                    return param0;
                  }
                }
              }
            }
            kd.a(param6 ^ -81, param4, param0);
            wm.a(0, param2, param0);
            param0 = false;
            break L0;
          }
        }
        if (param6 != -83) {
          var8 = null;
          wq.a((String) null, false);
          return param0;
        } else {
          return param0;
        }
    }

    final static void a(String param0, boolean param1) {
        Object var3 = null;
        if (param1) {
          var3 = null;
          boolean discarded$2 = wq.a(71L, (String) null, (byte) 79);
          System.out.println("Error: " + dv.a(param0, -87, "%0a", "\n"));
          return;
        } else {
          System.out.println("Error: " + dv.a(param0, -87, "%0a", "\n"));
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        if (param0 != -57) {
            return;
        }
        field_c = null;
    }

    wq() {
        ((wq) this).field_b = 65536;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Quick Chat lobby";
        field_c = "ESC - cancel this line";
    }
}
