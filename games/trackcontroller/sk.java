/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    float field_i;
    private int field_f;
    private int field_c;
    static String field_g;
    static boolean field_b;
    static String field_h;
    private sg[] field_d;
    String field_a;
    private int field_e;
    static kk field_j;

    final boolean a(boolean param0) {
        int var3;
        sg var4;
        L0: {
          var3 = TrackController.field_F ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            sk.a((byte) 43);
            break L0;
          }
        }
        L1: while (true) {
          if (this.field_f < this.field_c) {
            var4 = this.field_d[this.field_f];
            if (!var4.field_c.c(113)) {
              this.a(-1, 0, var4);
              return false;
            } else {
              L2: {
                if (var4.field_h < 0) {
                  break L2;
                } else {
                  if (!var4.field_c.a((byte) -40, var4.field_h)) {
                    this.a(-1, var4.field_c.a(var4.field_h, -24214), var4);
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null == var4.field_f) {
                  break L3;
                } else {
                  if (!var4.field_c.b(var4.field_f, (byte) -3)) {
                    this.a(-1, var4.field_c.a(var4.field_f, 0), var4);
                    return false;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (-1 >= (var4.field_h ^ -1)) {
                  break L4;
                } else {
                  if (null != var4.field_f) {
                    break L4;
                  } else {
                    if (null == var4.field_b) {
                      break L4;
                    } else {
                      if (!var4.field_c.a((byte) 48)) {
                        this.a(-1, var4.field_c.a(true), var4);
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              this.field_f = this.field_f + 1;
              continue L1;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_h = null;
        if (param0 <= 99) {
            field_g = (String) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    private final void a(int param0, int param1, sg param2) {
        float var4_float = 0.0f;
        try {
            var4_float = (float)(1 + this.field_f) + (float)param1 / 100.0f;
            if (param0 != (param1 ^ -1)) {
                this.field_a = param2.field_b + " - " + param1 + "%";
            } else {
                this.field_a = param2.field_g;
            }
            this.field_i = var4_float * (float)this.field_e / (float)(1 + this.field_c);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "sk.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, kk param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        kk var5 = null;
        byte[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6 = param1.a(param3, param0, (byte) -117);
              var4 = var6;
              if (param2 == 1) {
                break L1;
              } else {
                var5 = (kk) null;
                sk.a(-44, (kk) null, 17, 118);
                break L1;
              }
            }
            if (var6 != null) {
              ve.a((byte) -28, var6);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("sk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    private sk() throws Throwable {
        throw new Error();
    }

    static {
        field_b = false;
        field_g = "Finish the exhibit with the blocks at the top.";
    }
}
