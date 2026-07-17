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
            Object var2 = null;
            fl.a((ln) null, (byte) -77);
        }
    }

    public final void remove() {
        if (null == ((fl) this).field_c) {
            throw new IllegalStateException();
        }
        ((fl) this).field_c.b((byte) -90);
        ((fl) this).field_c = null;
    }

    final static qr a() {
        int var1 = 0;
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
        Object var10 = null;
        db var11 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
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
                  var10 = null;
                  fl.a((ln) null, (byte) -17);
                  break L1;
                }
              }
              var11 = new db();
              var11.a(param0.field_s.a(-123), 32);
              var3 = (mg) (Object) param0.field_s.c(-128);
              L2: while (true) {
                if (var3 == null) {
                  var3 = (mg) (Object) var11.c(-127);
                  L3: while (true) {
                    if (var3 == null) {
                      break L0;
                    } else {
                      param0.field_s.a((df) (Object) var3, 32);
                      var3 = (mg) (Object) var11.b(32);
                      continue L3;
                    }
                  }
                } else {
                  var4 = var3.field_y.field_A - var3.field_B.field_A;
                  var5 = var3.field_y.field_S + -var3.field_B.field_S;
                  var6 = (mg) (Object) var11.c(-127);
                  L4: while (true) {
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        var7 = var6.field_y.field_A + -var6.field_B.field_A;
                        var8 = -var6.field_B.field_S + var6.field_y.field_S;
                        if (!oo.a(var4, var5, var7, true, var8)) {
                          var6 = (mg) (Object) var11.b(32);
                          continue L4;
                        } else {
                          el.a((df) (Object) var3, 0, (df) (Object) var6);
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 != null) {
                        break L6;
                      } else {
                        var11.a((df) (Object) var3, 32);
                        break L6;
                      }
                    }
                    var3 = (mg) (Object) param0.field_s.b(32);
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("fl.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 41);
        }
    }

    public final boolean hasNext() {
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((fl) this).field_g.field_f[-1 + ((fl) this).field_d] == ((fl) this).field_a)) {
            return true;
        }
        while (((fl) this).field_g.field_d > ((fl) this).field_d) {
            int fieldTemp$0 = ((fl) this).field_d;
            ((fl) this).field_d = ((fl) this).field_d + 1;
            if (((fl) this).field_g.field_f[fieldTemp$0].field_f != ((fl) this).field_g.field_f[((fl) this).field_d + -1]) {
                ((fl) this).field_a = ((fl) this).field_g.field_f[((fl) this).field_d + -1].field_f;
                return true;
            }
            ((fl) this).field_a = ((fl) this).field_g.field_f[-1 + ((fl) this).field_d];
        }
        return false;
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            aj.field_a.a((byte) -113, (oh) (Object) new de(param1));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("fl.E(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    public final Object next() {
        oh var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((fl) this).field_g.field_f[-1 + ((fl) this).field_d] == ((fl) this).field_a) {
          L0: while (true) {
            if (((fl) this).field_g.field_d > ((fl) this).field_d) {
              int fieldTemp$2 = ((fl) this).field_d;
              ((fl) this).field_d = ((fl) this).field_d + 1;
              var1 = ((fl) this).field_g.field_f[fieldTemp$2].field_f;
              if (((fl) this).field_g.field_f[-1 + ((fl) this).field_d] != var1) {
                ((fl) this).field_c = var1;
                ((fl) this).field_a = var1.field_f;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((fl) this).field_a;
          ((fl) this).field_a = var1.field_f;
          ((fl) this).field_c = var1;
          return (Object) (Object) var1;
        }
    }

    fl(rm param0) {
        ((fl) this).field_c = null;
        try {
            ((fl) this).field_g = param0;
            int discarded$0 = -107;
            this.c();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "fl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final void c() {
        ((fl) this).field_c = null;
        ((fl) this).field_d = 1;
        ((fl) this).field_a = ((fl) this).field_g.field_f[0].field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 360;
        field_e = "Animations do not play automatically. Click to enable.";
    }
}
