/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta extends al {
    static String field_jb;
    static String field_ob;
    static int[] field_ib;
    static String field_lb;
    private boolean field_kb;
    static cj field_gb;
    private String field_rb;
    private boolean field_nb;
    static char[] field_pb;
    private le field_qb;
    private String field_mb;
    static ak field_hb;

    public static void k(byte param0) {
        if (param0 > -61) {
          return;
        } else {
          field_ob = null;
          field_ib = null;
          field_hb = null;
          field_lb = null;
          field_gb = null;
          field_pb = null;
          field_jb = null;
          return;
        }
    }

    final void l(int param0) {
        this.field_qb.field_L = false;
        this.field_nb = true;
        if (param0 <= 110) {
            this.field_nb = true;
        }
    }

    ta(vk param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_mb = param1;
            if (null != this.field_mb) {
                var3_int = ci.field_d.a(this.field_mb, 260, ci.field_d.field_C);
                this.b(300, var3_int + 150, 78);
            }
            this.field_qb = new le(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb = false;
            this.field_qb.field_L = true;
            this.field_nb = false;
            this.b((byte) 107, this.field_qb);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String param0, float param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_kb) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (param3 ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackOut_4_0 = this;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!param3) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                L4: {
                  ((ta) (this)).field_kb = stackIn_7_1 != 0;
                  if (this.field_kb) {
                    break L4;
                  } else {
                    this.field_qb.a(4210752, 2113632, (byte) 117);
                    if (this.field_nb) {
                      this.field_qb.field_L = false;
                      if (!ZombieDawnMulti.field_E) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.field_qb.a(4210752, 8405024, (byte) -95);
                this.field_qb.field_L = true;
                break L2;
              }
            }
            this.field_qb.field_B = (int)(65536.0f * (param1 / 100.0f));
            this.field_rb = param0;
            if (param2 >= 24) {
              break L0;
            } else {
              field_gb = (cj) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var5);
            stackOut_15_1 = new StringBuilder().append("ta.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void b(byte param0, String param1) {
        try {
            int var2_int = 34 / ((param0 - -20) / 42);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ta.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        if (!param0) {
          L0: {
            field_hb = (ak) null;
            super.a(param0, param1, param2);
            ci.field_d.b(this.field_rb, param1 + (this.field_n >> -368012767), 103 + param2, 16777215, -1);
            if (null != this.field_mb) {
              oo.b(param1 - -20, 120 + (param2 - 7), 260, 8421504);
              discarded$2 = ci.field_d.a(this.field_mb, param1 + 20, param2 - -120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            super.a(param0, param1, param2);
            ci.field_d.b(this.field_rb, param1 + (this.field_n >> -368012767), 103 + param2, 16777215, -1);
            if (null != this.field_mb) {
              oo.b(param1 - -20, 120 + (param2 - 7), 260, 8421504);
              discarded$3 = ci.field_d.a(this.field_mb, param1 + 20, param2 - -120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_jb = "You cannot chat to <%0> because <%0> is not in your friend list.";
        field_pb = new char[128];
    }
}
