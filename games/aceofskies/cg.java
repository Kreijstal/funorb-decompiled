/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends ua implements tl {
    static qr field_p;
    private byte field_o;

    public final boolean a(byte param0) {
        if (param0 != -60) {
            return false;
        }
        return super.a(this.field_a.field_Fc, (byte) -115);
    }

    public final void a(int param0) {
        boolean discarded$0 = false;
        super.a(param0 + 0);
        if (param0 != 4665) {
            discarded$0 = this.a((byte) 95);
        }
    }

    public static void g(int param0) {
        field_p = null;
        if (param0 != -33) {
            field_p = (qr) null;
        }
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        if (param1 >= -58) {
            return (jaclib.memory.Buffer) null;
        }
        return super.a(this.field_a.field_Fc, param0, -10386);
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (dc.a((byte) -69, param0)) {
            return true;
          } else {
            if (param1 > 110) {
              if (param0 != 45) {
                if (param0 != 160) {
                  if (param0 != 32) {
                    if (95 == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    cg(jc param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final boolean a(int param0, int param1, int param2) {
        if (param1 > -112) {
          this.field_o = (byte) 15;
          this.field_o = (byte)param0;
          super.a(-12880, param2);
          return true;
        } else {
          this.field_o = (byte)param0;
          super.a(-12880, param2);
          return true;
        }
    }

    final int c(byte param0) {
        boolean discarded$0 = false;
        if (param0 < 17) {
            discarded$0 = this.a((byte) -104);
            return this.field_o;
        }
        return this.field_o;
    }

    final static void a(boolean param0, gk param1, gk param2, boolean param3, gk param4) {
        try {
            gm.field_x = od.a("", 66);
            gm.field_x.a(param0, false);
            kg.a(4, param2, param4, param1);
            nj.d(-8129);
            nb.field_c = dk.field_h;
            ht.field_k = dk.field_h;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "cg.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new qr();
    }
}
