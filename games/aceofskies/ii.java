/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends vo {
    private String field_f;
    static pa[][] field_k;
    static String[] field_e;
    private uu field_h;
    static dk field_m;
    private boolean field_i;
    static rk field_j;
    static String field_l;
    static String field_g;

    ii(bm param0, bm param1) {
        super(param0);
        this.field_f = "";
        this.field_i = false;
        try {
            this.field_h = new uu(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_m = null;
        field_l = null;
        field_k = (pa[][]) null;
        field_j = null;
        if (param0 != -22) {
          field_g = (String) null;
          field_e = null;
          field_g = null;
          return;
        } else {
          field_e = null;
          field_g = null;
          return;
        }
    }

    final static int a(byte param0, jb param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == dl.field_p) {
              stackIn_12_0 = 5890;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              if (ac.field_b != param1) {
                if (un.field_i != param1) {
                  if (param1 == bs.field_a) {
                    stackIn_10_0 = 34166;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L1: {
                      if (param0 >= 63) {
                        break L1;
                      } else {
                        field_e = (String[]) null;
                        break L1;
                      }
                    }
                    throw new IllegalArgumentException();
                  }
                } else {
                  stackIn_6_0 = 34168;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_3_0 = 34167;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ii.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_h.a(param0, 8192) != bt.field_a) {
              L1: {
                if (param1 == 72) {
                  break L1;
                } else {
                  this.field_i = true;
                  break L1;
                }
              }
              if (this.a(param0, 8192) != bt.field_a) {
                stackIn_9_0 = gh.field_o;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_7_0 = dk.field_i;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_h.a(param0, (byte) 72);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ii.EA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    final pt a(String param0, int param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        pt stackIn_2_0 = null;
        pt stackIn_6_0 = null;
        pt stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_h.a(param0, param1 ^ 0) != bt.field_a) {
              L1: {
                if (param0.equals(this.field_f)) {
                  break L1;
                } else {
                  var3 = rq.a(-111, param0);
                  if (var3.a(false)) {
                    this.field_f = param0;
                    this.field_i = var3.a(param1 + -10107);
                    break L1;
                  } else {
                    stackIn_6_0 = ce.field_t;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (param1 == 8192) {
                  break L2;
                } else {
                  var4 = (String) null;
                  this.a((String) null, (byte) 79);
                  break L2;
                }
              }
              L3: {
                if (this.field_i) {
                  stackIn_13_0 = fd.field_a;
                  break L3;
                } else {
                  stackIn_13_0 = bt.field_a;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = bt.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("ii.DA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    static {
        field_e = new String[]{"Press 1 for speed increase", "Press 2 for improved fire rate", "Press 3 for improved manoeuvrability", "Press 4 for extra armour", "Press 5 for extra life", "Press 6 for extra wingmen", "Press 7 for score multiplier"};
        field_l = "settings";
        ek.a((byte) 116, 1600);
        field_g = "Passwords can only contain letters and numbers";
    }
}
