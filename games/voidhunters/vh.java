/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh implements Iterable {
    static llb[] field_c;
    fh field_a;
    private fh field_b;

    final void a(byte param0) {
        int var3 = 0;
        var3 = VoidHunters.field_G;
        L0: while (true) {
          if (((vh) this).field_a.field_e == ((vh) this).field_a) {
            if (param0 < 50) {
              fh discarded$2 = ((vh) this).a(-59);
              return;
            } else {
              return;
            }
          } else {
            ((vh) this).field_a.field_e.d((byte) -35);
            continue L0;
          }
        }
    }

    private final fh a(fh param0, int param1) {
        fh var3 = null;
        if (param1 <= -98) {
          L0: {
            if (param0 != null) {
              var3 = param0;
              break L0;
            } else {
              var3 = ((vh) this).field_a.field_e;
              break L0;
            }
          }
          if (var3 == ((vh) this).field_a) {
            ((vh) this).field_b = null;
            return null;
          } else {
            ((vh) this).field_b = var3.field_e;
            return var3;
          }
        } else {
          L1: {
            Iterator discarded$8 = ((vh) this).iterator();
            if (param0 != null) {
              var3 = param0;
              break L1;
            } else {
              var3 = ((vh) this).field_a.field_e;
              break L1;
            }
          }
          if (var3 == ((vh) this).field_a) {
            ((vh) this).field_b = null;
            return null;
          } else {
            ((vh) this).field_b = var3.field_e;
            return var3;
          }
        }
    }

    final fh a(boolean param0) {
        if (param0) {
            return null;
        }
        return this.a((fh) null, -113);
    }

    final void a(int param0, fh param1) {
        if (param0 != -17569) {
          return;
        } else {
          L0: {
            if (null != param1.field_d) {
              param1.d((byte) -35);
              break L0;
            } else {
              break L0;
            }
          }
          param1.field_e = ((vh) this).field_a;
          param1.field_d = ((vh) this).field_a.field_d;
          param1.field_d.field_e = param1;
          param1.field_e.field_d = param1;
          return;
        }
    }

    final fh b(int param0) {
        fh var2 = null;
        var2 = ((vh) this).field_b;
        if (param0 == 8063) {
          if (var2 == ((vh) this).field_a) {
            ((vh) this).field_b = null;
            return null;
          } else {
            ((vh) this).field_b = var2.field_e;
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        field_c = null;
        if (!param0) {
            vh.b(true);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new jn((vh) this);
    }

    vh() {
        ((vh) this).field_a = new fh();
        ((vh) this).field_a.field_e = ((vh) this).field_a;
        ((vh) this).field_a.field_d = ((vh) this).field_a;
    }

    final fh a(int param0) {
        fh var2 = null;
        var2 = ((vh) this).field_a.field_e;
        if (param0 == -7481) {
          if (var2 == ((vh) this).field_a) {
            return null;
          } else {
            var2.d((byte) -35);
            return var2;
          }
        } else {
          ((vh) this).field_b = null;
          if (var2 == ((vh) this).field_a) {
            return null;
          } else {
            var2.d((byte) -35);
            return var2;
          }
        }
    }

    static {
    }
}
