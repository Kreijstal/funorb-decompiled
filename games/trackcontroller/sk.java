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
        int var3 = 0;
        sg var5 = null;
        sg var6 = null;
        var3 = TrackController.field_F ? 1 : 0;
        if (!param0) {
          sk.a((byte) 43);
          L0: while (true) {
            if (this.field_f < this.field_c) {
              var6 = this.field_d[this.field_f];
              if (!var6.field_c.c(113)) {
                this.a(-1, 0, var6);
                return false;
              } else {
                L1: {
                  if (var6.field_h < 0) {
                    break L1;
                  } else {
                    if (!var6.field_c.a((byte) -40, var6.field_h)) {
                      this.a(-1, var6.field_c.a(var6.field_h, -24214), var6);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (null == var6.field_f) {
                    break L2;
                  } else {
                    if (!var6.field_c.b(var6.field_f, (byte) -3)) {
                      this.a(-1, var6.field_c.a(var6.field_f, 0), var6);
                      return false;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 >= (var6.field_h ^ -1)) {
                    break L3;
                  } else {
                    if (null != var6.field_f) {
                      break L3;
                    } else {
                      if (null == var6.field_b) {
                        break L3;
                      } else {
                        if (!var6.field_c.a((byte) 48)) {
                          this.a(-1, var6.field_c.a(true), var6);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                this.field_f = this.field_f + 1;
                continue L0;
              }
            } else {
              return true;
            }
          }
        } else {
          L4: while (true) {
            if (this.field_f < this.field_c) {
              var5 = this.field_d[this.field_f];
              if (!var5.field_c.c(113)) {
                this.a(-1, 0, var5);
                return false;
              } else {
                L5: {
                  if (var5.field_h < 0) {
                    break L5;
                  } else {
                    if (!var5.field_c.a((byte) -40, var5.field_h)) {
                      this.a(-1, var5.field_c.a(var5.field_h, -24214), var5);
                      return false;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (null == var5.field_f) {
                    break L6;
                  } else {
                    if (!var5.field_c.b(var5.field_f, (byte) -3)) {
                      this.a(-1, var5.field_c.a(var5.field_f, 0), var5);
                      return false;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-1 >= (var5.field_h ^ -1)) {
                    break L7;
                  } else {
                    if (null != var5.field_f) {
                      break L7;
                    } else {
                      if (null == var5.field_b) {
                        break L7;
                      } else {
                        if (!var5.field_c.a((byte) 48)) {
                          this.a(-1, var5.field_c.a(true), var5);
                          return false;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                }
                this.field_f = this.field_f + 1;
                continue L4;
              }
            } else {
              return true;
            }
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
        boolean discarded$2 = false;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        kk var5 = null;
        byte[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var6 = param1.a(param3, param0, (byte) -117);
              var4 = var6;
              if (param2 == 1) {
                break L1;
              } else {
                var5 = (kk) null;
                discarded$2 = sk.a(-44, (kk) null, 17, 118);
                break L1;
              }
            }
            if (var6 != null) {
              ve.a((byte) -28, var6);
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4_ref);
            stackOut_7_1 = new StringBuilder().append("sk.A(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
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
