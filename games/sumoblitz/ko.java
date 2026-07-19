/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ko extends ms {
    private int field_k;
    private int field_o;
    private float field_l;
    private int field_n;
    private int field_r;
    static jn field_m;
    private int field_q;
    static int field_p;

    final static void a(int param0, int param1) {
        ms var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        hg var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (hg) ((Object) hi.field_f.b(-101));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    pm.a(param1, 1, var4);
                    var4 = (hg) ((Object) hi.field_f.d((byte) 18));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 0) {
                  break L2;
                } else {
                  field_m = (jn) null;
                  break L2;
                }
              }
              var2 = wr.field_E.b(-105);
              L4: while (true) {
                if (var2 == null) {
                  break L0;
                } else {
                  ou.a(125, param1);
                  var2 = wr.field_E.d((byte) 18);
                  if (var3 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "ko.A(" + param0 + ',' + param1 + ')');
        }
    }

    final int c(byte param0) {
        if (param0 != 50) {
            this.field_l = -3.14526629447937f;
            return this.field_r;
        }
        return this.field_r;
    }

    final int d(byte param0) {
        if (param0 != 109) {
            ko.a(39, 19);
            return this.field_o;
        }
        return this.field_o;
    }

    final int a(byte param0) {
        if (param0 < 71) {
            return -46;
        }
        return this.field_k;
    }

    final int c(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
            discarded$0 = this.c(false);
            return this.field_q;
        }
        return this.field_q;
    }

    public static void d(int param0) {
        if (param0 != 0) {
            ko.a(-33, -26);
            field_m = null;
            return;
        }
        field_m = null;
    }

    private ko() throws Throwable {
        throw new Error();
    }

    final int c(boolean param0) {
        if (!param0) {
            return -61;
        }
        return this.field_n;
    }

    final float a(int param0) {
        if (param0 != 0) {
            this.field_l = 0.354354590177536f;
            return this.field_l;
        }
        return this.field_l;
    }

    static {
        field_m = new jn();
        field_p = 0;
    }
}
