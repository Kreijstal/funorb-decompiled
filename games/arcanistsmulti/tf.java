/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tf extends pg {
    static int[] field_g;
    static String field_h;
    long field_k;
    tf field_i;
    static qb[] field_j;
    tf field_l;

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        if (param0 <= 17) {
            return;
        }
        field_g = null;
    }

    final static ri a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ri var7 = null;
        int var8 = 0;
        ri stackIn_4_0 = null;
        ri stackIn_8_0 = null;
        ri stackIn_11_0 = null;
        ri stackIn_15_0 = null;
        ri stackIn_21_0 = null;
        ri stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int == 0) {
              stackIn_4_0 = uh.field_i;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (255 < var2_int) {
                stackIn_8_0 = b.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = eh.a(false, '.', param1);
                if (param0 == 32752) {
                  if (-3 < (var3.length ^ -1)) {
                    stackIn_15_0 = uh.field_i;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_24_0 = ik.a(param0 + -32810, var3[var3.length - 1]);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = mo.a(var6, 45);
                        if (var7 != null) {
                          stackIn_21_0 = (ri) (var7);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_11_0 = (ri) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("tf.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L2;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
        }
    }

    final static f a(int param0, int param1, byte[] param2) {
        f var3 = null;
        RuntimeException var3_ref = null;
        f stackIn_2_0 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -25866) {
              var3 = new f(param2);
              cm.field_l.b(var3, -1);
              pb.a(32, param0, var3);
              stackIn_4_0 = (f) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (f) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("tf.Q(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(byte param0) {
        if (param0 != 88) {
            this.field_k = 116L;
        }
        if (!(this.field_i != null)) {
            return;
        }
        this.field_i.field_l = this.field_l;
        this.field_l.field_i = this.field_i;
        this.field_l = null;
        this.field_i = null;
    }

    final long b(boolean param0) {
        if (param0) {
            return 111L;
        }
        return this.field_k;
    }

    final void a(int param0, long param1) {
        if (param0 != 46) {
            return;
        }
        if (null != this.field_i) {
            throw new RuntimeException();
        }
        this.field_k = param1;
    }

    final boolean d(byte param0) {
        if (param0 != -17) {
            return false;
        }
        if (this.field_i != null) {
            return true;
        }
        return false;
    }

    protected tf() {
    }

    static {
        field_h = "Remember to select the focus point's location, then fire as before. Destroy the targets!";
    }
}
