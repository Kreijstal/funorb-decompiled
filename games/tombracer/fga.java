/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.BitSet;

final class fga implements sia {
    private boolean field_c;
    static String field_a;
    private int[] field_d;
    private int[] field_b;

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 32415) {
            this.field_d = (int[]) null;
          }
          ql.field_k.k(76, param0 ^ -30005);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fga.G(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 78 % ((-55 - param0) / 60);
          stackIn_7_0 = (rd.b(false)) && (aga.a(false, param1).field_d);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "fga.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void a(boolean param0, boolean param1) {
        int stackIn_32_1 = 0;
        boolean stackIn_33_2 = false;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_c) {
            return;
          }
          if (!param1) {
            return;
          }
          if (!param0) {
            return;
          }
          if (ld.field_e < 2) {
            return;
          }
          if (hf.field_b == 1) {
            try {
              var3_int = 0;
              while (this.field_d.length > var3_int) {
                if (var5 == 0) {
                  if (this.field_d[var3_int] < jm.field_m &&
                    jm.field_m < (40 + this.field_d[var3_int]) &&
                    lba.field_p > this.field_b[var3_int] &&
                    (this.field_b[var3_int] + 30) > lba.field_p &&
                    !oj.field_tb[82]) {
                    var4 = ak.a(var3_int, (byte) 56);
                    stackIn_32_1 = 74;
                    stackIn_33_2 = !(f.field_e.get(var4));
                    this.a((byte) stackIn_32_1, stackIn_33_2, var4);
                  }
                  var3_int++;
                  continue;
                }
                break;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              var3.printStackTrace();
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "fga.D(" + param0 + ',' + param1 + ')');
        }
    }

    public final boolean a(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            this.field_d = (int[]) null;
          }
          stackIn_4_0 = this.field_c;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fga.A(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, int param2) {
        int var4_int = 0;
        kh stackIn_3_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          ql.field_k.k(77, -2988);
          ql.field_k.i(param2, 0);
          stackIn_3_0 = ql.field_k;
          if (!param1) {
            stackIn_4_1 = 0;
          } else {
            stackIn_4_1 = 1;
          }
          ((kh) (Object) stackIn_3_0).i(stackIn_4_1, 0);
          var4_int = -5 % ((param0 + 45) / 58);
          this.d(32415);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "fga.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            if (param1) {
              fga.a(-59, false, -121, (java.awt.Canvas) null);
            }
            var4 = param3.getGraphics();
            gn.field_C.a(param2, param0, var4, 2);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param3.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var4_ref2;
          stackIn_10_1 = new StringBuilder().append("fga.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(int param0) {
        try {
          int stackIn_18_0 = 0;
          BitSet stackIn_18_1 = null;
          boolean stackIn_19_2 = false;
          int stackIn_47_0 = 0;
          int stackIn_61_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          RuntimeException var2 = null;
          int var3_int = 0;
          ha var3 = null;
          int var4 = 0;
          int var5 = 0;
          int var6_int = 0;
          qva var6 = null;
          int var7 = 0;
          int var8 = 0;
          Object var9 = null;
          int var10 = 0;
          Object var9Lifetime1;
          int var4Lifetime1;
          int var5Lifetime1;
          int var6_intLifetime1;
          var10 = TombRacer.field_G ? 1 : 0;
          try {
            if (!this.field_c) {
              return;
            }
            if (f.field_e == null) {
              return;
            }
            var2_int = aq.a(-5640);
            if (null == this.field_d ||
              var2_int != this.field_d.length) {
              this.field_b = new int[var2_int];
              this.field_d = new int[var2_int];
              var3_int = 20;
              var4 = 30;
              var5 = var3_int;
              var6_int = 0;
              while (var2_int > var6_int) {
                if (var6_int % 15 == 0) {
                  var4 += 30;
                  var5 = var3_int;
                }
                this.field_d[var6_int] = var5;
                var5 += 40;
                this.field_b[var6_int] = var4;
                var6_int++;
                if (var10 == 0) {
                  continue;
                }
                break;
              }
            }
            var3 = tga.field_a;
            var3.GA(0);
            stackIn_18_0 = 22;
            stackIn_18_1 = f.field_e;
            stackIn_19_2 = !(rd.b(false));
            var4Lifetime1 = jk.$cfr$intArgs$a$922851b022bc(stackIn_18_0, stackIn_18_1, stackIn_19_2);
            if (param0 != 1) {
              this.field_b = (int[]) null;
            }
            var5Lifetime1 = 0;
            while (true) {
              if (var5Lifetime1 >= var2_int) {
                var5Lifetime1 = una.a(f.field_e, 20297);
                stackIn_61_0 = 0;
                break;
              }
              var6_intLifetime1 = ak.a(var5Lifetime1, (byte) 95);
              var7 = f.field_e.get(var6_intLifetime1) ? 1 : 0;
              var8 = -10079437;
              stackIn_61_0 = var7;
              if (var10 == 0) {
                if (stackIn_61_0 == 0) {
                  if (var5Lifetime1 < var4Lifetime1 &&
                    !this.a((byte) -122, var6_intLifetime1)) {
                    var8 = -7829453;
                  } else if (this.a((byte) -120, var6_intLifetime1)) {
                    var8 = -2004318072;
                  }
                } else {
                  stackIn_47_0 = (!this.a((byte) -121, var6_intLifetime1)) ? -13391309 : -2013231104;
                  var8 = stackIn_47_0;
                }
                var3.c(var8, this.field_d[var5Lifetime1], 40, this.field_b[var5Lifetime1], -22971, 30);
                var3.a(this.field_b[var5Lifetime1], this.field_d[var5Lifetime1], 30, 40, -10066330, (byte) -107);
                var9 = null;
                if (var6_intLifetime1 != -1) {
                  var9 = Integer.toString(var6_intLifetime1);
                }
                if (var9 != null) {
                  oka.a((String) (var9), 16777215, kn.field_p, -1, this.field_b[var5Lifetime1] + 15, 20 + this.field_d[var5Lifetime1], 0);
                }
                var9Lifetime1 = null;
                if (aga.a(false, var6_intLifetime1).field_d) {
                  var9Lifetime1 = "M";
                }
                if (null != var9Lifetime1) {
                  oka.a((String) (var9Lifetime1), 16777215, kn.field_p, -1, 26 + this.field_b[var5Lifetime1], this.field_d[var5Lifetime1] + 20, 0);
                }
                var5Lifetime1++;
                continue;
              }
              break;
            }
            ts.a(stackIn_61_0, param0 - 16, 460, "max corridor: " + var5Lifetime1 + " / " + ml.a(param0 + 86), 10, kn.field_p, 16777215);
            try {
              var3.e(param0 - 1);
            } catch (qva decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (qva) (Object) decompiledCaughtException;
              System.out.println(var6);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw tba.a((Throwable) ((Object) var2), "fga.B(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 76) {
            return;
          }
          if (!toa.field_j) {
            f.field_e = null;
          }
          this.field_c = true;
          this.field_d = null;
          this.d(32415);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "fga.F(" + param0 + ')');
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          if (!this.field_c) {
            return false;
          }
          if (13 == param2) {
            this.field_c = false;
          }
          if (param0 != -72) {
            field_a = (String) null;
          }
          if (param2 != 35) {
            if (48 != param2) {
              return false;
            }
            var4_int = 0;
            var5 = 0;
            L3: while (true) {
              if (var5 < aq.a(-5640)) {
                stackIn_45_0 = var4_int;
                if (var7 != 0) {
                  break L3;
                }
                if (stackIn_45_0 < 10) {
                  var6 = ak.a(var5, (byte) 125);
                  if (aga.a(false, var6).field_d) {
                    this.a((byte) 110, true, var5);
                    var4_int++;
                  }
                  var5++;
                  continue;
                }
              }
              stackIn_45_0 = 1;
              break;
            }
            return stackIn_45_0 != 0;
          }
          var4_int = 0;
          do {
            if (var4_int >= 100) {
              var4_int = 0;
              break;
            }
            this.a((byte) -128, false, var4_int);
            var4_int++;
          } while (var7 == 0);
          var5Lifetime1 = 0;
          L10: while (true) {
            if (var5Lifetime1 < aq.a(param0 - 5568)) {
              stackIn_32_0 = 30;
              if (var7 != 0) {
                break L10;
              }
              if (stackIn_32_0 > var4_int) {
                var6Lifetime1 = ak.a(var5Lifetime1, (byte) 111);
                if (!aga.a(false, var6Lifetime1).field_d ||
                  var7 != 0) {
                  this.a((byte) 46, true, var5Lifetime1);
                  var4_int++;
                }
                var5Lifetime1++;
                continue;
              }
            }
            stackIn_32_0 = 1;
            break;
          }
          return stackIn_32_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "fga.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          int var1_int = 78 / ((63 - param0) / 40);
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "fga.J(" + param0 + ')');
        }
    }

    fga() {
        this.field_c = false;
        this.field_d = null;
        this.field_b = null;
    }

    static {
        field_a = "Menu";
    }
}
