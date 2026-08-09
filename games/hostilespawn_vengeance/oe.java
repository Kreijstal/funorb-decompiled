/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oe implements Iterator {
    static bd field_g;
    static bd field_d;
    private am field_b;
    static bn[] field_a;
    private ed field_c;
    private int field_e;
    private am field_f;

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2;
        var2 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_c.field_f[-1 + this.field_e] == this.field_b) {
          L0: while (true) {
            if (this.field_c.field_b > this.field_e) {
              fieldTemp$1 = this.field_e;
              this.field_e = this.field_e + 1;
              if (this.field_c.field_f[fieldTemp$1].field_g == this.field_c.field_f[this.field_e + -1]) {
                this.field_b = this.field_c.field_f[this.field_e + -1];
                continue L0;
              } else {
                this.field_b = this.field_c.field_f[-1 + this.field_e].field_g;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void remove() {
        if (this.field_f == null) {
            throw new IllegalStateException();
        }
        this.field_f.b(-124);
        this.field_f = null;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 <= 31) {
            field_d = (bd) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    private final void a(byte param0) {
        this.field_f = null;
        if (param0 != 105) {
          return;
        } else {
          this.field_e = 1;
          this.field_b = this.field_c.field_f[0].field_g;
          return;
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        am var1;
        int var2;
        var2 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_c.field_f[this.field_e - 1] == this.field_b) {
          L0: while (true) {
            if (this.field_e < this.field_c.field_b) {
              fieldTemp$1 = this.field_e;
              this.field_e = this.field_e + 1;
              var1 = this.field_c.field_f[fieldTemp$1].field_g;
              if (this.field_c.field_f[-1 + this.field_e] != var1) {
                this.field_f = var1;
                this.field_b = var1.field_g;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_b;
          this.field_f = var1;
          this.field_b = var1.field_g;
          return var1;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (param2 >= param5) {
          if (param2 >= param6) {
            if (param6 <= param5) {
              t.a(si.field_i, false, param4, param2, param0, param6, param5, param7, param3);
              if (param1 == -121) {
                return;
              } else {
                field_d = (bd) null;
                return;
              }
            } else {
              t.a(si.field_i, false, param4, param2, param0, param5, param6, param3, param7);
              if (param1 == -121) {
                return;
              } else {
                field_d = (bd) null;
                return;
              }
            }
          } else {
            t.a(si.field_i, false, param4, param6, param3, param5, param2, param0, param7);
            if (param1 == -121) {
              return;
            } else {
              field_d = (bd) null;
              return;
            }
          }
        } else {
          if (param5 >= param6) {
            if (param2 >= param6) {
              t.a(si.field_i, false, param4, param5, param7, param6, param2, param0, param3);
              if (param1 == -121) {
                return;
              } else {
                field_d = (bd) null;
                return;
              }
            } else {
              t.a(si.field_i, false, param4, param5, param7, param2, param6, param3, param0);
              if (param1 == -121) {
                return;
              } else {
                field_d = (bd) null;
                return;
              }
            }
          } else {
            t.a(si.field_i, false, param4, param6, param3, param2, param5, param7, param0);
            if (param1 == -121) {
              return;
            } else {
              field_d = (bd) null;
              return;
            }
          }
        }
    }

    oe(ed param0) {
        this.field_f = null;
        try {
            this.field_c = param0;
            this.a((byte) 105);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "oe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
