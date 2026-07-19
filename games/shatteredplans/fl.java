/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fl implements Iterator {
    static bi field_b;
    static int field_f;
    private oh field_c;
    private oh field_a;
    private rm field_g;
    static String field_e;
    private int field_d;
    static int field_h;

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != -1) {
            ln var2 = (ln) null;
            fl.a((ln) null, (byte) -77);
        }
    }

    public final void remove() {
        if (null == this.field_c) {
            throw new IllegalStateException();
        }
        this.field_c.b((byte) -90);
        this.field_c = null;
    }

    final static qr a(int param0) {
        int var1 = -56 % ((-22 - param0) / 48);
        return wg.field_a.field_Eb;
    }

    final static void a(ln param0, byte param1) {
        RuntimeException var2 = null;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        mg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        db var11 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_s.c(-128)) {
              L1: {
                if (param1 >= 35) {
                  break L1;
                } else {
                  var10 = (ln) null;
                  fl.a((ln) null, (byte) -17);
                  break L1;
                }
              }
              var11 = new db();
              var11.a(param0.field_s.a(-123), 32);
              var3 = (mg) ((Object) param0.field_s.c(-128));
              L2: while (true) {
                if (var3 == null) {
                  var3 = (mg) ((Object) var11.c(-127));
                  L3: while (true) {
                    if (var3 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param0.field_s.a(var3, 32);
                      var3 = (mg) ((Object) var11.b(32));
                      continue L3;
                    }
                  }
                } else {
                  var4 = var3.field_y.field_A - var3.field_B.field_A;
                  var5 = var3.field_y.field_S + -var3.field_B.field_S;
                  var6 = (mg) ((Object) var11.c(-127));
                  L4: while (true) {
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        var7 = var6.field_y.field_A + -var6.field_B.field_A;
                        var8 = -var6.field_B.field_S + var6.field_y.field_S;
                        if (!oo.a(var4, var5, var7, true, var8)) {
                          var6 = (mg) ((Object) var11.b(32));
                          continue L4;
                        } else {
                          el.a(var3, 0, var6);
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 != null) {
                        break L6;
                      } else {
                        var11.a(var3, 32);
                        break L6;
                      }
                    }
                    var3 = (mg) ((Object) param0.field_s.b(32));
                    continue L2;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("fl.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(this.field_g.field_f[-1 + this.field_d] == this.field_a)) {
            return true;
        }
        while (this.field_g.field_d > this.field_d) {
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            if (this.field_g.field_f[fieldTemp$0].field_f != this.field_g.field_f[this.field_d + -1]) {
                this.field_a = this.field_g.field_f[this.field_d + -1].field_f;
                return true;
            }
            this.field_a = this.field_g.field_f[-1 + this.field_d];
        }
        return false;
    }

    final static void a(int param0, String param1) {
        RuntimeException runtimeException = null;
        ln var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              aj.field_a.a((byte) -113, new de(param1));
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (ln) null;
                fl.a((ln) null, (byte) 103);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("fl.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final Object next() {
        int fieldTemp$2 = 0;
        oh var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_g.field_f[-1 + this.field_d] == this.field_a) {
          L0: while (true) {
            if (this.field_g.field_d > this.field_d) {
              fieldTemp$2 = this.field_d;
              this.field_d = this.field_d + 1;
              var1 = this.field_g.field_f[fieldTemp$2].field_f;
              if (this.field_g.field_f[-1 + this.field_d] != var1) {
                this.field_c = var1;
                this.field_a = var1.field_f;
                return var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_a;
          this.field_a = var1.field_f;
          this.field_c = var1;
          return var1;
        }
    }

    fl(rm param0) {
        this.field_c = null;
        try {
            this.field_g = param0;
            this.c(-107);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void c(int param0) {
        Object discarded$0 = null;
        this.field_c = null;
        if (param0 > -77) {
            discarded$0 = this.next();
        }
        this.field_d = 1;
        this.field_a = this.field_g.field_f[0].field_f;
    }

    static {
        field_f = 360;
        field_e = "Animations do not play automatically. Click to enable.";
    }
}
