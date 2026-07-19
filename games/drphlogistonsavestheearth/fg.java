/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    int[] field_e;
    int field_g;
    private int field_k;
    private String field_b;
    private boolean field_f;
    static int field_h;
    String field_i;
    static int field_j;
    int field_d;
    int field_a;
    private long field_c;

    final static String a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (-21 <= (var2_int ^ -1)) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var9 = new char[var2_int];
            var8 = var9;
            var3 = var8;
            var4 = 0;
            var5 = 90 % ((param1 - 5) / 48);
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_17_0 = new String(var9);
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var6 = param0.charAt(var4);
                    if (var6 < 65) {
                      break L4;
                    } else {
                      if (var6 > 90) {
                        break L4;
                      } else {
                        var3[var4] = (char)(var6 - -32);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 <= 122) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var6 < 48) {
                        break L7;
                      } else {
                        if (var6 <= 57) {
                          break L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L3;
                  }
                  var3[var4] = (char)var6;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var2);
            stackOut_19_1 = new StringBuilder().append("fg.A(");
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
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        return stackIn_18_0;
    }

    final static sf a(int param0) {
        String discarded$1 = null;
        CharSequence var2 = null;
        if (param0 != 1) {
          L0: {
            var2 = (CharSequence) null;
            discarded$1 = fg.a((CharSequence) null, 84);
            if (null == th.field_c) {
              th.field_c = new sf();
              th.field_c.a(42, uh.field_i);
              th.field_c.field_n = 5;
              th.field_c.field_g = u.field_d;
              th.field_c.field_s = 6;
              th.field_c.field_k = 2763306;
              th.field_c.field_t = 4;
              th.field_c.field_c = 0;
              th.field_c.field_r = 7697781;
              th.field_c.field_q = 14;
              break L0;
            } else {
              break L0;
            }
          }
          return th.field_c;
        } else {
          L1: {
            if (null == th.field_c) {
              th.field_c = new sf();
              th.field_c.a(42, uh.field_i);
              th.field_c.field_n = 5;
              th.field_c.field_g = u.field_d;
              th.field_c.field_s = 6;
              th.field_c.field_k = 2763306;
              th.field_c.field_t = 4;
              th.field_c.field_c = 0;
              th.field_c.field_r = 7697781;
              th.field_c.field_q = 14;
              break L1;
            } else {
              break L1;
            }
          }
          return th.field_c;
        }
    }

    fg(boolean param0) {
        this.field_k = ib.field_o;
        this.field_i = am.field_m;
        this.field_f = td.field_f;
        this.field_a = kl.field_J;
        this.field_b = tf.field_kb;
        this.field_c = fm.field_j;
        this.field_g = dj.field_K;
        if (param0) {
            this.field_e = mf.field_x;
        } else {
            this.field_e = null;
        }
        this.field_d = ob.field_a;
    }

    final int a(byte param0) {
        int var2 = 0;
        if (!this.field_f) {
          if ((this.field_a ^ -1) != -3) {
            if (this.field_c != DrPhlogistonSavesTheEarth.field_I) {
              var2 = 19 / ((param0 - -29) / 38);
              if (-3 == (of.field_v ^ -1)) {
                if (ik.a(this.field_b, (byte) -119)) {
                  return 1;
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            if (0 >= this.field_k) {
              if (this.field_c != DrPhlogistonSavesTheEarth.field_I) {
                var2 = 19 / ((param0 - -29) / 38);
                if (-3 == (of.field_v ^ -1)) {
                  if (ik.a(this.field_b, (byte) -119)) {
                    return 1;
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    static {
    }
}
