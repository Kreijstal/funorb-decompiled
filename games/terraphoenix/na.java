/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends ei {
    static String[] field_db;
    static int field_Y;
    private String field_bb;
    private String field_eb;
    private hm field_cb;
    private boolean field_W;
    static byte[][] field_Z;
    private boolean field_ab;
    static String field_X;

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
            nh.field_D = param3;
            ol.field_Hb = param1;
            int var4_int = -26 / ((32 - param2) / 55);
            ta.a(fh.field_x, param0, 10);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "na.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, boolean param1, String param2, float param3) {
        RuntimeException runtimeException = null;
        String var6 = null;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        int stackIn_3_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_1_0 = false;
        int stackOut_1_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this.field_W;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param1) {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = stackIn_1_0;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              if ((stackIn_3_0 ? 1 : 0) == stackIn_3_1) {
                L3: {
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!param1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((na) (this)).field_W = stackIn_8_1 != 0;
                if (this.field_W) {
                  this.field_cb.a(4210752, -7062047, 8405024);
                  this.field_cb.field_P = true;
                  break L2;
                } else {
                  this.field_cb.a(4210752, -7062047, 2113632);
                  if (!this.field_ab) {
                    break L2;
                  } else {
                    this.field_cb.field_P = false;
                    break L2;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (param0 == 60) {
                break L4;
              } else {
                var6 = (String) null;
                na.a(true, (String) null, 41, (String) null);
                break L4;
              }
            }
            this.field_cb.field_M = (int)(65536.0f * (param3 / 100.0f));
            this.field_eb = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("na.O(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        int discarded$0 = 0;
        super.a(param0, param1, param2);
        be.field_x.c(this.field_eb, param0 + (this.field_p >> -562649663), param1 + 103, 16777215, -1);
        if (null != this.field_bb) {
            l.d(20 + param0, -7 + (120 + param1), 260, 8421504);
            discarded$0 = be.field_x.a(this.field_bb, 20 + param0, param1 - -128, 260, 100, 16777215, -1, 1, 0, be.field_x.field_s);
        }
    }

    final void h(byte param0) {
        if (param0 > -73) {
          this.h((byte) 5);
          this.field_cb.field_P = false;
          this.field_ab = true;
          return;
        } else {
          this.field_cb.field_P = false;
          this.field_ab = true;
          return;
        }
    }

    na(d param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_bb = param1;
            if (this.field_bb != null) {
                var3_int = be.field_x.a(this.field_bb, 260, be.field_x.field_s);
                this.b(98, 150 + var3_int, 300);
            }
            this.field_cb = new hm(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_ab = false;
            this.field_W = false;
            this.field_cb.field_P = true;
            this.b((byte) 95, this.field_cb);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "na.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(boolean param0) {
        field_Z = (byte[][]) null;
        if (!param0) {
            field_Y = -73;
            field_db = null;
            field_X = null;
            return;
        }
        field_db = null;
        field_X = null;
    }

    static {
        field_Z = new byte[250][];
        field_Y = 5;
        field_X = "You have <%0> unread messages!";
        field_db = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
