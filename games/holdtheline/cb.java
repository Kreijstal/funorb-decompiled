/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb extends gd {
    private boolean field_m;
    static volatile int field_j;
    private String field_k;
    static boolean field_i;
    static int field_l;

    cb(nk param0) {
        super(param0);
        this.field_m = false;
    }

    final static String a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        char[] var5;
        char[] var6;
        char[] var7;
        if ((param1 ^ -1) <= -1) {
          var2 = param1 / 50;
          var3 = 2 * (param1 % 50);
          var4 = var2 / 60;
          var2 = var2 % 60;
          var7 = new char[8];
          var6 = var7;
          var5 = var6;
          var5[7] = (char)(var3 % 10 + 48);
          var5[4] = (char)(48 + var2 % 10);
          var5[6] = (char)(var3 / 10 + 48);
          var5[2] = (char)58;
          var5[5] = (char)46;
          var5[3] = (char)(48 + var2 / 10);
          var5[0] = (char)(48 + var4 / 10 % 10);
          if (param0 < 36) {
            cb.a(125, 106);
            var5[1] = (char)(48 + var4 % 10);
            return new String(var7);
          } else {
            var5[1] = (char)(48 + var4 % 10);
            return new String(var7);
          }
        } else {
          return "--:--.--";
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_k = null;
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        nd var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.field_k = (String) null;
                break L1;
              }
            }
            var5 = (CharSequence) ((Object) param0);
            var3 = en.a(12260, var5);
            if (var3 == null) {
              L2: {
                if (param0.equals(this.field_k)) {
                  break L2;
                } else {
                  var4 = vj.b(0, param0);
                  if (var4 != null) {
                    if (var4.field_d == null) {
                      this.field_k = param0;
                      this.field_m = var4.field_f;
                      break L2;
                    } else {
                      stackIn_10_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_m) {
                stackIn_16_0 = od.field_m;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_14_0 = ud.field_j;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_4_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("cb.L(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    final fd a(String param0, byte param1) {
        nd var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        fd stackIn_5_0 = null;
        fd stackIn_12_0 = null;
        fd stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 52) {
                break L1;
              } else {
                field_i = true;
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            if (!ff.a(var4, 8192)) {
              stackIn_5_0 = g.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!param0.equals(this.field_k)) {
                  L3: {
                    var3 = vj.b(0, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null != var3.field_d) {
                        break L3;
                      } else {
                        this.field_k = param0;
                        this.field_m = var3.field_f;
                        break L2;
                      }
                    }
                  }
                  stackIn_12_0 = um.field_a;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!this.field_m) {
                  stackIn_17_0 = g.field_k;
                  break L4;
                } else {
                  stackIn_17_0 = tg.field_d;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("cb.N(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
        field_i = false;
        field_j = 0;
        field_l = 0;
    }
}
