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

    final static String a(CharSequence param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        String stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int <= 20) {
                break L1;
              } else {
                var2_int = 20;
                break L1;
              }
            }
            var11 = new char[var2_int];
            var10 = var11;
            var9 = var10;
            var8 = var9;
            var3 = var8;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_19_0 = new String(var11);
                stackIn_20_0 = stackOut_19_0;
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
                        var4++;
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
                    var3[var4] = '_';
                    var4++;
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
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("fg.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 90 + 41);
        }
        return stackIn_20_0;
    }

    final static sf a() {
        if (!(null != th.field_c)) {
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
        }
        return th.field_c;
    }

    fg(boolean param0) {
        ((fg) this).field_k = ib.field_o;
        ((fg) this).field_i = am.field_m;
        ((fg) this).field_f = td.field_f;
        ((fg) this).field_a = kl.field_J;
        ((fg) this).field_b = tf.field_kb;
        ((fg) this).field_c = fm.field_j;
        ((fg) this).field_g = dj.field_K;
        if (param0) {
            ((fg) this).field_e = mf.field_x;
        } else {
            ((fg) this).field_e = null;
        }
        ((fg) this).field_d = ob.field_a;
    }

    final int a(byte param0) {
        int var2 = 0;
        if (!((fg) this).field_f) {
          if (((fg) this).field_a != 2) {
            if (((fg) this).field_c != DrPhlogistonSavesTheEarth.field_I) {
              var2 = 19 / ((param0 - -29) / 38);
              if (of.field_v == 2) {
                int discarded$12 = -119;
                if (ik.a(((fg) this).field_b)) {
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
            if (0 >= ((fg) this).field_k) {
              if (((fg) this).field_c != DrPhlogistonSavesTheEarth.field_I) {
                var2 = 19 / ((param0 - -29) / 38);
                if (of.field_v == 2) {
                  int discarded$13 = -119;
                  if (ik.a(((fg) this).field_b)) {
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
