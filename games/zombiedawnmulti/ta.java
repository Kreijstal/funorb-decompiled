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
        int stackIn_3_0 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_kb) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              if (stackIn_3_0 != (param3 ? 1 : 0)) {
                break L2;
              } else {
                L3: {
                  stackIn_6_0 = this;

                  if (!param3) {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 0;
                    break L3;
                  } else {
                    stackIn_7_0 = this;
                    stackIn_7_1 = 1;
                    break L3;
                  }
                }
                ((ta) (this)).field_kb = stackIn_7_1 != 0;
                if (this.field_kb) {
                  this.field_qb.a(4210752, 8405024, (byte) -95);
                  this.field_qb.field_L = true;
                  break L2;
                } else {
                  this.field_qb.a(4210752, 2113632, (byte) 117);
                  if (this.field_nb) {
                    this.field_qb.field_L = false;
                    break L2;
                  } else {
                    break L2;
                  }
                }
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
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("ta.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
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
        if (!param0) {
          L0: {
            field_hb = (ak) null;
            super.a(param0, param1, param2);
            ci.field_d.b(this.field_rb, param1 + (this.field_n >> -368012767), 103 + param2, 16777215, -1);
            if (null != this.field_mb) {
              oo.b(param1 - -20, 120 + (param2 - 7), 260, 8421504);
              ci.field_d.a(this.field_mb, param1 + 20, param2 - -120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
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
              ci.field_d.a(this.field_mb, param1 + 20, param2 - -120 + 8, 260, 100, 16777215, -1, 1, 0, ci.field_d.field_C);
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
