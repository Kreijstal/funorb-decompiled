/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vr {
    private int field_a;
    private int field_f;
    static Random field_h;
    private qe field_e;
    static ce field_b;
    private wl field_g;
    private hh[] field_d;
    private int field_i;
    static String[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        int var1 = 25 % ((param0 - 55) / 40);
        field_b = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != -118) {
          return false;
        }
        return this.field_d[param1].a((byte) -124);
    }

    final static boolean a(String param0, int param1) {
        String stackIn_13_2 = null;
        try {
          if (param0 != null &&
            param0.length() >= jm.field_d &&
            param0.length() <= dc.field_f) {
            if (param1 == 2) {
              return false;
            }
            String var3 = (String) null;
            vr.a((String) null, 81);
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var2;
          StringBuilder stackIn_12_1 = new StringBuilder().append("vr.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5) {
        param4 = param4 & this.field_g.c((byte) 16);
        if (param2 == 2147483647) {
          if (!param4) {
            if (param0 != 4 &&
              8 != param0 &&
              param0 != 9) {
              if (param0 != 0 &&
                param1) {
                param0 = param0 | -2147483648;
              }
              if (param0 != this.field_i) {
                if (0 != this.field_i) {
                  this.field_d[2147483647 & this.field_i].b((byte) 105);
                }
                if (param0 != 0) {
                  this.field_d[2147483647 & param0].a(false, param1);
                  this.field_d[param0 & 2147483647].a(4096, param1);
                  this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                }
                this.field_f = param3;
                this.field_a = param5;
                this.field_i = param0;
              } else {
                if (0 != this.field_i) {
                  this.field_d[this.field_i & 2147483647].a(4096, param1);
                  if (this.field_a == param5 &&
                    param3 == this.field_f) {
                    return;
                  }
                  this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                  this.field_f = param3;
                  this.field_a = param5;
                }
              }
              return;
            }
            if (param0 == 4) {
              param3 = param5;
            }
            param0 = 2;
          }
          if (param0 != 0) {
            if (!param1) {
              if (param0 != this.field_i) {
                if (0 != this.field_i) {
                  this.field_d[2147483647 & this.field_i].b((byte) 105);
                }
                if (param0 != 0) {
                  this.field_d[2147483647 & param0].a(false, param1);
                  this.field_d[param0 & 2147483647].a(4096, param1);
                  this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                }
                this.field_f = param3;
                this.field_a = param5;
                this.field_i = param0;
              } else {
                if (0 != this.field_i) {
                  this.field_d[this.field_i & 2147483647].a(4096, param1);
                  if (this.field_a == param5 &&
                    param3 == this.field_f) {
                    return;
                  }
                  this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                  this.field_f = param3;
                  this.field_a = param5;
                }
              }
              return;
            }
            param0 = param0 | -2147483648;
          }
          if (param0 != this.field_i) {
            if (0 != this.field_i) {
              this.field_d[2147483647 & this.field_i].b((byte) 105);
            }
            if (param0 != 0) {
              this.field_d[2147483647 & param0].a(false, param1);
              this.field_d[param0 & 2147483647].a(4096, param1);
              this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
            }
            this.field_f = param3;
            this.field_a = param5;
            this.field_i = param0;
            return;
          }
          if (0 == this.field_i) {
            return;
          }
          this.field_d[this.field_i & 2147483647].a(4096, param1);
          if (this.field_a == param5 &&
            param3 == this.field_f) {
            return;
          }
          this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
          this.field_f = param3;
          this.field_a = param5;
          return;
        }
        this.field_d = (hh[]) null;
        if (!param4) {
          if (param0 == 4) {
            if (param0 == 4) {
              param3 = param5;
            }
            param0 = 2;
            if (param0 != 0) {
              if (!param1) {
                if (param0 != this.field_i) {
                  if (0 != this.field_i) {
                    this.field_d[2147483647 & this.field_i].b((byte) 105);
                  }
                  if (param0 != 0) {
                    this.field_d[2147483647 & param0].a(false, param1);
                    this.field_d[param0 & 2147483647].a(4096, param1);
                    this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
                  }
                  this.field_f = param3;
                  this.field_a = param5;
                  this.field_i = param0;
                } else {
                  if (0 != this.field_i) {
                    this.field_d[this.field_i & 2147483647].a(4096, param1);
                    if (this.field_a == param5 &&
                      param3 == this.field_f) {
                      return;
                    }
                    this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                    this.field_f = param3;
                    this.field_a = param5;
                  }
                }
                return;
              }
              param0 = param0 | -2147483648;
            }
            if (param0 != this.field_i) {
              if (0 != this.field_i) {
                this.field_d[2147483647 & this.field_i].b((byte) 105);
              }
              if (param0 != 0) {
                this.field_d[2147483647 & param0].a(false, param1);
                this.field_d[param0 & 2147483647].a(4096, param1);
                this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
              }
              this.field_f = param3;
              this.field_a = param5;
              this.field_i = param0;
              return;
            }
            if (0 == this.field_i) {
              return;
            }
            this.field_d[this.field_i & 2147483647].a(4096, param1);
            if (this.field_a == param5 &&
              param3 == this.field_f) {
              return;
            }
            this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
            this.field_f = param3;
            this.field_a = param5;
            return;
          }
          if (8 != param0 &&
            param0 != 9) {
            if (param0 != 0 &&
              param1) {
              param0 = param0 | -2147483648;
            }
            if (param0 == this.field_i) {
              if (0 != this.field_i) {
                this.field_d[this.field_i & 2147483647].a(4096, param1);
                if (this.field_a == param5 &&
                  param3 == this.field_f) {
                  return;
                }
                this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
                this.field_f = param3;
                this.field_a = param5;
                return;
              }
              return;
            }
            if (0 != this.field_i) {
              this.field_d[2147483647 & this.field_i].b((byte) 105);
            }
            if (param0 != 0) {
              this.field_d[2147483647 & param0].a(false, param1);
              this.field_d[param0 & 2147483647].a(4096, param1);
              this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
            }
            this.field_f = param3;
            this.field_a = param5;
            this.field_i = param0;
            return;
          }
          if (param0 == 4) {
            param3 = param5;
          }
          param0 = 2;
        }
        if (param0 != 0 &&
          param1) {
          param0 = param0 | -2147483648;
        }
        if (param0 != this.field_i) {
          if (0 != this.field_i) {
            this.field_d[2147483647 & this.field_i].b((byte) 105);
          }
          if (param0 != 0) {
            this.field_d[2147483647 & param0].a(false, param1);
            this.field_d[param0 & 2147483647].a(4096, param1);
            this.field_d[2147483647 & param0].a((byte) -65, param5, param3);
          }
          this.field_f = param3;
          this.field_a = param5;
          this.field_i = param0;
          return;
        }
        if (0 == this.field_i) {
          return;
        }
        this.field_d[this.field_i & 2147483647].a(4096, param1);
        if (this.field_a == param5 &&
          param3 == this.field_f) {
          return;
        }
        this.field_d[this.field_i & 2147483647].a((byte) -65, param5, param3);
        this.field_f = param3;
        this.field_a = param5;
    }

    final boolean a(int param0, int param1, rt param2) {
        String stackIn_11_2 = null;
        try {
          if (0 == this.field_i) {
            return false;
          }
          if (param1 != -1896) {
            this.a((byte) 95, -4);
          }
          this.field_d[this.field_i & 2147483647].a(param0, -1486691000, param2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var4;
          StringBuilder stackIn_10_1 = new StringBuilder().append("vr.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    vr(wl param0) {
        String stackIn_9_2 = null;
        this.field_f = 0;
        this.field_a = 0;
        this.field_i = 0;
        try {
          this.field_g = param0;
          this.field_e = new qe(param0);
          this.field_d = new hh[10];
          this.field_d[1] = (hh) ((Object) new wk(param0));
          this.field_d[2] = (hh) ((Object) new bk(param0, this.field_e));
          this.field_d[4] = (hh) ((Object) new ij(param0, this.field_e));
          this.field_d[5] = (hh) ((Object) new rc(param0, this.field_e));
          this.field_d[6] = (hh) ((Object) new np(param0));
          this.field_d[7] = (hh) ((Object) new ne(param0));
          this.field_d[3] = (hh) ((Object) new g(param0));
          this.field_d[8] = (hh) ((Object) new sd(param0, this.field_e));
          this.field_d[9] = (hh) ((Object) new ci(param0, this.field_e));
          if (!this.field_d[8].a((byte) -76)) {
            this.field_d[8] = this.field_d[4];
          }
          if (!this.field_d[9].a((byte) -128)) {
            this.field_d[9] = this.field_d[8];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_8_0 = runtimeException;
          StringBuilder stackIn_8_1 = new StringBuilder().append("vr.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_h = new Random();
        field_c = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
