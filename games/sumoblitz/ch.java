/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_d;
    ek field_b;
    ek field_c;
    us[] field_a;
    static String field_e;
    static boolean field_h;
    boolean field_g;
    ek field_f;
    us[] field_i;

    public static void a(byte param0) {
        field_e = null;
        if (param0 < 54) {
            ch.a(-75);
        }
    }

    final static void a(int param0) {
        iu.a((byte) -128);
        pg.field_a = true;
        mc.field_E = true;
        rf.field_a.a((byte) -64);
        if (param0 != 0) {
            ch.a(20);
        }
        oc.a(qe.field_b, false, (byte) 49);
    }

    ch(fr param0) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ek var4 = null;
        b var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        this.field_b = null;
        this.field_a = null;
        this.field_c = null;
        this.field_f = null;
        this.field_i = null;
        try {
          L0: {
            L1: {
              this.field_g = param0.field_Ic;
              mq.a(param0, (byte) 123);
              if (!this.field_g) {
                this.field_i = new us[16];
                var2_int = 0;
                L2: while (true) {
                  if ((var2_int ^ -1) <= -17) {
                    this.field_a = new us[16];
                    var2_int = 0;
                    L3: while (true) {
                      if (var2_int >= 16) {
                        break L1;
                      } else {
                        var24 = iq.a(qu.field_j, 14381, 32768, var2_int * 32768);
                        this.field_a[var2_int] = new us(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                        var2_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var23 = iq.a(ic.field_b, 14381, 32768, var2_int * 32768);
                    this.field_i[var2_int] = new us(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  var20 = ab.a(false, ic.field_b, 0);
                  this.field_b = new ek(param0, 6410, 128, 128, 16, var20, 6410);
                  var21 = ab.a(false, qu.field_j, 0);
                  this.field_f = new ek(param0, 6410, 128, 128, 16, var21, 6410);
                  var10 = param0.field_Sb;
                  if (!var10.b((byte) -101)) {
                    break L4;
                  } else {
                    L5: {
                      var22 = ab.a(false, dj.field_m, 0);
                      this.field_c = new ek(param0, 6408, 128, 128, 16);
                      var4 = new ek(param0, 6409, 128, 128, 16, var22, 6409);
                      if (!var10.a(this.field_c, 2.0f, false, var4)) {
                        this.field_c.b((byte) 106);
                        this.field_c = null;
                        break L5;
                      } else {
                        this.field_c.a(false);
                        break L5;
                      }
                    }
                    var4.b((byte) 126);
                    break L4;
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("ch.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    static {
        field_e = "Play free version";
    }
}
