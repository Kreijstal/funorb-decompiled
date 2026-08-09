/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends ig {
    static int field_v;
    private boolean field_q;
    static dd field_u;
    static String field_m;
    static dd field_r;
    static int[] field_t;
    static int field_o;
    static String field_n;
    private String field_p;
    static String field_s;

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wc var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param0);
            var3 = pk.a(var5, param1 + -89);
            if (var3 == null) {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  field_u = (dd) null;
                  break L1;
                }
              }
              L2: {
                if (!param0.equals(this.field_p)) {
                  var4 = sm.a(param0, 118);
                  if (var4 != null) {
                    if (var4.field_b == null) {
                      this.field_p = param0;
                      this.field_q = var4.field_f;
                      break L2;
                    } else {
                      stackIn_11_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              if (this.field_q) {
                stackIn_17_0 = lb.field_M;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_15_0 = gi.field_n;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ua.L(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_11_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    final na a(String param0, boolean param1) {
        wc var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        na stackIn_2_0 = null;
        na stackIn_5_0 = null;
        na stackIn_11_0 = null;
        na stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (qi.a((byte) -64, var4)) {
              if (param1) {
                L1: {
                  if (param0.equals(this.field_p)) {
                    break L1;
                  } else {
                    L2: {
                      var3 = sm.a(param0, -51);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (var3.field_b == null) {
                          this.field_p = param0;
                          this.field_q = var3.field_f;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_11_0 = no.field_k;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
                L3: {
                  if (this.field_q) {
                    stackIn_16_0 = kr.field_e;
                    break L3;
                  } else {
                    stackIn_16_0 = gp.field_d;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_5_0 = (na) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = gp.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ua.K(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    ua(sl param0) {
        super(param0);
        this.field_q = false;
    }

    final void i(int param0) {
        if (param0 != 18) {
            return;
        }
        this.field_p = null;
    }

    public static void h(int param0) {
        field_m = null;
        field_r = null;
        field_u = null;
        if (param0 >= -51) {
          field_m = (String) null;
          field_n = null;
          field_t = null;
          field_s = null;
          return;
        } else {
          field_n = null;
          field_t = null;
          field_s = null;
          return;
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          if (oh.field_h) {
            kh.field_Vb.a((byte) -79, false);
            return;
          } else {
            return;
          }
        } else {
          field_s = (String) null;
          if (!oh.field_h) {
            return;
          } else {
            kh.field_Vb.a((byte) -79, false);
            return;
          }
        }
    }

    static {
        field_m = "Clan";
        field_v = 0;
        field_t = new int[]{17, 18, 8};
        field_n = "Chat";
        field_o = 0;
        field_s = "Start Game";
    }
}
