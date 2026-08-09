/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends un {
    static String field_u;
    static java.math.BigInteger field_v;
    private boolean field_q;
    private String field_r;
    static int field_s;
    static int[] field_t;

    public static void h(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != 66) {
            tp.h(102);
            field_v = null;
            return;
        }
        field_v = null;
    }

    final re a(boolean param0, String param1) {
        gh var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        re stackIn_2_0 = null;
        re stackIn_9_0 = null;
        re stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            if (sj.a(var5, 12319)) {
              L1: {
                if (!param1.equals(this.field_r)) {
                  L2: {
                    var3 = ed.a((byte) 127, param1);
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (null != var3.field_h) {
                        break L2;
                      } else {
                        this.field_r = param1;
                        this.field_q = var3.field_d;
                        break L1;
                      }
                    }
                  }
                  stackIn_9_0 = ua.field_I;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
              L3: {
                if (!param0) {
                  break L3;
                } else {
                  var4 = (String) null;
                  this.a((String) null, 126);
                  break L3;
                }
              }
              L4: {
                if (this.field_q) {
                  stackIn_16_0 = db.field_b;
                  break L4;
                } else {
                  stackIn_16_0 = jq.field_b;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = jq.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("tp.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        gh var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param0);
            var3 = vk.a(param1 ^ -1276425052, var6);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == -1276425040) {
                  break L1;
                } else {
                  var5 = (String) null;
                  this.a(true, (String) null);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_r)) {
                  var4 = ed.a((byte) 127, param0);
                  if (var4 != null) {
                    if (null == var4.field_h) {
                      this.field_q = var4.field_d;
                      this.field_r = param0;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (!this.field_q) {
                stackIn_17_0 = wg.field_d;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return ba.field_j;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("tp.C(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    tp(pm param0) {
        super(param0);
        this.field_q = false;
    }

    final void i(int param0) {
        if (param0 != -22837) {
            tp.h(-36);
            this.field_r = null;
            return;
        }
        this.field_r = null;
    }

    static {
        field_u = "This trait will make your powerups last even longer than Expert. Equip both for an extra bonus!";
        field_v = new java.math.BigInteger("65537");
        field_s = 66;
    }
}
