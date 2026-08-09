/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb extends bj {
    private boolean field_hb;
    private String field_jb;
    static int field_fb;
    private boolean field_gb;
    private cr field_bb;
    private String field_ib;
    static String field_eb;
    static String field_db;
    static String field_cb;

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1 ^ 0, param2);
        wm.field_a.b(this.field_jb, param0 - -(this.field_t >> 98628481), param2 - -103, 16777215, -1);
        if (param1 != 274) {
          L0: {
            this.field_gb = false;
            if (this.field_ib != null) {
              lb.c(20 + param0, 120 + param2 - 7, 260, 8421504);
              wm.field_a.a(this.field_ib, param0 - -20, 8 + param2 - -120, 260, 100, 16777215, -1, 1, 0, wm.field_a.field_F);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (this.field_ib != null) {
              lb.c(20 + param0, 120 + param2 - 7, 260, 8421504);
              wm.field_a.a(this.field_ib, param0 - -20, 8 + param2 - -120, 260, 100, 16777215, -1, 1, 0, wm.field_a.field_F);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static mb a(int param0, int param1, mf param2, mf param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        mb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 111) {
                break L1;
              } else {
                field_fb = -88;
                break L1;
              }
            }
            if (ln.a(-104, param4, param2, param1)) {
              stackIn_6_0 = jm.a(param3.a(param4, param1, 4), (byte) -14);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("tb.U(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mb) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static String a(String param0, String param1, boolean param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mf var13 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param1.length();
            var5 = param3.length();
            var6 = param0.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                if (param2) {
                  break L1;
                } else {
                  var13 = (mf) null;
                  tb.a(95, -81, (mf) null, (mf) null, -12);
                  break L1;
                }
              }
              L2: {
                var8 = var6 - var5;
                if (var8 != 0) {
                  var9_int = 0;
                  L3: while (true) {
                    var9_int = param1.indexOf(param3, var9_int);
                    if (0 > var9_int) {
                      break L2;
                    } else {
                      var9_int = var9_int + var5;
                      var7 = var7 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L4: while (true) {
                var11 = param1.indexOf(param3, var10);
                if ((var11 ^ -1) > -1) {
                  discarded$0 = var9.append(param1.substring(var10));
                  stackIn_14_0 = var9.toString();
                  break L0;
                } else {
                  discarded$1 = var9.append(param1.substring(var10, var11));
                  var10 = var11 + var5;
                  discarded$2 = var9.append(param0);
                  continue L4;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("tb.S(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ')');
        }
        return stackIn_14_0;
    }

    final void a(float param0, String param1, boolean param2, byte param3) {
        RuntimeException runtimeException = null;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = this.field_hb;

              if (param2) {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 0;
                break L1;
              } else {
                stackIn_3_0 = stackIn_2_0;
                stackIn_3_1 = 1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
                L3: {
                  stackIn_7_0 = this;

                  if (!param2) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((tb) (this)).field_hb = stackIn_8_1 != 0;
                if (this.field_hb) {
                  this.field_bb.b(8405024, 4210752, 2);
                  this.field_bb.field_J = true;
                  break L2;
                } else {
                  this.field_bb.b(2113632, 4210752, param3 + -84);
                  if (!this.field_gb) {
                    break L2;
                  } else {
                    this.field_bb.field_J = false;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            this.field_bb.field_L = (int)(param0 / 100.0f * 65536.0f);
            if (param3 == 86) {
              this.field_jb = param1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (runtimeException);

            stackIn_18_1 = new StringBuilder().append("tb.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void l(int param0) {
        if (param0 != 6457) {
          this.l(88);
          this.field_bb.field_J = false;
          this.field_gb = true;
          return;
        } else {
          this.field_bb.field_J = false;
          this.field_gb = true;
          return;
        }
    }

    tb(cp param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_ib = param1;
            if (null != this.field_ib) {
                var3_int = wm.field_a.b(this.field_ib, 260, wm.field_a.field_F);
                this.a(true, 150 - -var3_int, 300);
            }
            this.field_bb = new cr(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_hb = false;
            this.field_gb = false;
            this.field_bb.field_J = true;
            this.a(this.field_bb, true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "tb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void m(int param0) {
        field_cb = null;
        field_db = null;
        if (param0 > -26) {
            field_db = (String) null;
            field_eb = null;
            return;
        }
        field_eb = null;
    }

    static {
        field_db = "Catch this with your paddle.<br><br>A positive power-up is worth 100 points and will help you. A negative one will hinder you, but is worth 500 points!";
        field_fb = 0;
    }
}
