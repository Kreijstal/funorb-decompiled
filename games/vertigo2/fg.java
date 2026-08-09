/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends sp {
    private we field_W;
    static nj field_eb;
    private String field_fb;
    private boolean field_ab;
    private String field_bb;
    static String field_cb;
    private boolean field_Z;
    static String field_X;
    static int field_Y;
    static String field_db;

    public static void m(int param0) {
        field_db = null;
        field_cb = null;
        field_eb = null;
        if (param0 != -15691) {
            field_eb = (nj) null;
            field_X = null;
            return;
        }
        field_X = null;
    }

    final void c(boolean param0) {
        this.field_W.field_F = false;
        this.field_ab = param0 ? true : false;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 > -92) {
          return;
        } else {
          L0: {
            super.a((byte) -108, param1, param2);
            sg.field_a.c(this.field_bb, (this.field_n >> 812366273) + param1, 103 + param2, 16777215, -1);
            if (null != this.field_fb) {
              bi.b(param1 - -20, param2 + 120 + -7, 260, 8421504);
              sg.field_a.a(this.field_fb, 20 + param1, 8 + (120 + param2), 260, 100, 16777215, -1, 1, 0, sg.field_a.field_z);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final static String a(r param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0.b(0)) {
              stackIn_3_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param3 == 274) {
                stackIn_8_0 = param1 + " - " + param0.d(-1) + "%";
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("fg.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_8_0;
          }
        }
    }

    fg(sd param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_fb = param1;
            if (null != this.field_fb) {
                var3_int = sg.field_a.a(this.field_fb, 260, sg.field_a.field_z);
                this.b(-1535749535, 300, var3_int + 150);
            }
            this.field_W = new we(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_Z = false;
            this.field_ab = false;
            this.field_W.field_F = true;
            this.c((byte) -12, this.field_W);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "fg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_5_0 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 4210752) {
                break L1;
              } else {
                var6 = (String) null;
                this.a(-1.3080865144729614f, -13, false, (String) null);
                break L1;
              }
            }
            L2: {
              if (this.field_Z) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            L3: {
              if (stackIn_5_0 == (param2 ? 1 : 0)) {
                L4: {
                  stackIn_9_0 = this;

                  if (!param2) {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 0;
                    break L4;
                  } else {
                    stackIn_10_0 = this;
                    stackIn_10_1 = 1;
                    break L4;
                  }
                }
                ((fg) (this)).field_Z = stackIn_10_1 != 0;
                if (this.field_Z) {
                  this.field_W.b(8405024, -55, 4210752);
                  this.field_W.field_F = true;
                  break L3;
                } else {
                  this.field_W.b(2113632, param1 ^ -4210721, 4210752);
                  if (this.field_ab) {
                    this.field_W.field_F = false;
                    break L3;
                  } else {
                    this.field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
                    this.field_bb = param3;
                    return;
                  }
                }
              } else {
                break L3;
              }
            }
            this.field_W.field_G = (int)(param0 / 100.0f * 65536.0f);
            this.field_bb = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("fg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_cb = "You have withdrawn your request to join.";
        field_X = "Remove <%0> from friend list";
        field_Y = 20;
        field_eb = new nj();
        field_db = "Game full";
    }
}
