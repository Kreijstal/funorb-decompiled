/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an {
    private kp field_c;
    static kp field_b;
    private wf field_a;

    final static sn[] a(boolean param0) {
        if (vs.field_c != null) {
          if (param0) {
            return (sn[]) null;
          } else {
            return vs.field_c;
          }
        } else {
          vs.field_c = mq.a((byte) 122, new int[2]);
          if (param0) {
            return (sn[]) null;
          } else {
            return vs.field_c;
          }
        }
    }

    final wf a(byte param0) {
        wf var2 = null;
        var2 = ((an) this).field_a;
        if (((an) this).field_c.field_e == var2) {
          ((an) this).field_a = null;
          return null;
        } else {
          ((an) this).field_a = ((wf) var2).field_c;
          if (param0 != 120) {
            wf discarded$2 = ((an) this).a((byte) -65);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final wf a(int param0) {
        wf var2 = ((an) this).field_a;
        if (!(((an) this).field_c.field_e != var2)) {
            ((an) this).field_a = null;
            return null;
        }
        int var3 = -30 % ((param0 - -74) / 43);
        ((an) this).field_a = ((wf) var2).field_a;
        return var2;
    }

    final wf a(wf param0, int param1) {
        wf var3 = null;
        L0: {
          if (param0 != null) {
            var3 = param0;
            break L0;
          } else {
            var3 = ((an) this).field_c.field_e.field_c;
            break L0;
          }
        }
        if (((an) this).field_c.field_e != var3) {
          if (param1 != 0) {
            return (wf) null;
          } else {
            ((an) this).field_a = ((wf) var3).field_c;
            return var3;
          }
        } else {
          ((an) this).field_a = null;
          return null;
        }
    }

    final wf c(int param0) {
        wf var2 = null;
        var2 = ((an) this).field_c.field_e.field_a;
        if (((an) this).field_c.field_e != var2) {
          ((an) this).field_a = ((wf) var2).field_a;
          if (param0 != -1372) {
            ((an) this).field_c = (kp) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((an) this).field_a = null;
          return null;
        }
    }

    public static void b(int param0) {
        if (param0 != 32041) {
            return;
        }
        field_b = null;
    }

    final wf a(int param0, wf param1) {
        wf var3 = null;
        if (param0 < 40) {
            field_b = (kp) null;
            if (param1 == null) {
                var3 = ((an) this).field_c.field_e.field_a;
            } else {
                var3 = param1;
            }
            if (!(var3 != ((an) this).field_c.field_e)) {
                ((an) this).field_a = null;
                return null;
            }
            ((an) this).field_a = ((wf) var3).field_a;
            return var3;
        }
        if (param1 == null) {
            var3 = ((an) this).field_c.field_e.field_a;
        } else {
            var3 = param1;
        }
        if (!(var3 != ((an) this).field_c.field_e)) {
            ((an) this).field_a = null;
            return null;
        }
        ((an) this).field_a = ((wf) var3).field_a;
        return var3;
    }

    final wf b(boolean param0) {
        if (!param0) {
            return (wf) null;
        }
        wf var2 = ((an) this).field_c.field_e.field_c;
        if (!(((an) this).field_c.field_e != var2)) {
            ((an) this).field_a = null;
            return null;
        }
        ((an) this).field_a = ((wf) var2).field_c;
        return var2;
    }

    an(kp param0) {
        ((an) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kp();
    }
}
