/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends wb {
    static String field_gb;
    private boolean field_jb;
    private String field_cb;
    static ji field_ab;
    private String field_bb;
    static bd field_hb;
    static char[] field_db;
    static bd[] field_fb;
    private boolean field_kb;
    private ba field_ib;
    static vm field_eb;

    final void f(byte param0) {
        this.field_kb = true;
        this.field_ib.field_E = false;
        if (param0 > -71) {
            field_db = (char[]) null;
        }
    }

    final static void b(boolean param0) {
        String var2;
        if (!param0) {
          field_fb = (bd[]) null;
          var2 = (String) null;
          ak.a(false, (String) null, fj.field_Sb);
          return;
        } else {
          var2 = (String) null;
          ak.a(false, (String) null, fj.field_Sb);
          return;
        }
    }

    final void b(int param0, int param1, int param2) {
        super.b(param0, param1, param2);
        field_eb.b(this.field_bb, (this.field_s >> -238948511) + param2, 103 + param0, 16777215, -1);
        if (!(null == this.field_cb)) {
            si.a(param2 + 20, -7 + (120 + param0), 260, 8421504);
            field_eb.a(this.field_cb, param2 - -20, param0 - -128, 260, 100, 16777215, -1, 1, 0, field_eb.field_y);
        }
    }

    final void a(float param0, boolean param1, int param2, String param3) {
        RuntimeException var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_jb == param1) {
                break L1;
              } else {
                L2: {
                  stackIn_3_0 = this;

                  if (!param1) {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 0;
                    break L2;
                  } else {
                    stackIn_4_0 = this;
                    stackIn_4_1 = 1;
                    break L2;
                  }
                }
                ((pe) (this)).field_jb = stackIn_4_1 != 0;
                if (!this.field_jb) {
                  this.field_ib.a(2113632, 4210752, -1);
                  if (this.field_kb) {
                    this.field_ib.field_E = false;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_ib.a(8405024, 4210752, -1);
                  this.field_ib.field_E = true;
                  break L1;
                }
              }
            }
            this.field_ib.field_G = (int)(65536.0f * (param0 / 100.0f));
            this.field_bb = param3;
            if (param2 > 126) {
              break L0;
            } else {
              this.b(-60, -80, 35);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("pe.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static fa[] p(int param0) {
        if (param0 != 274) {
          pe.b(true);
          return new fa[]{ub.field_b, wh.field_c, w.field_S};
        } else {
          return new fa[]{ub.field_b, wh.field_c, w.field_S};
        }
    }

    final static void a(byte param0, int param1) {
        en var2;
        var2 = s.field_b;
        if (param0 != 51) {
          pe.p(-61);
          var2.i(19319, param1);
          var2.d(96, 1);
          var2.d(125, 0);
          return;
        } else {
          var2.i(19319, param1);
          var2.d(96, 1);
          var2.d(125, 0);
          return;
        }
    }

    pe(gg param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_cb = param1;
            if (null != this.field_cb) {
                var3_int = field_eb.b(this.field_cb, 260, field_eb.field_y);
                this.a(300, 15767, var3_int + 150);
            }
            this.field_ib = new ba(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_kb = false;
            this.field_jb = false;
            this.field_ib.field_E = true;
            this.a(51448, this.field_ib);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void q(int param0) {
        field_eb = null;
        field_db = null;
        if (param0 != 8421504) {
          pe.q(-49);
          field_hb = null;
          field_ab = null;
          field_gb = null;
          field_fb = null;
          return;
        } else {
          field_hb = null;
          field_ab = null;
          field_gb = null;
          field_fb = null;
          return;
        }
    }

    static {
        field_gb = "Play free version";
        field_db = new char[128];
    }
}
