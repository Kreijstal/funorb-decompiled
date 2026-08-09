/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    private boolean field_b;
    static int[] field_i;
    static ak field_g;
    private String field_f;
    static byte[][] field_e;
    static ob field_h;
    static mo field_d;
    static String field_a;
    static String field_c;

    final String a(int param0) {
        if (param0 != -30491) {
            field_c = (String) null;
            return this.field_f;
        }
        return this.field_f;
    }

    final static boolean b(int param0) {
        if (param0 != -10093) {
            sc.b(-27);
            return he.field_f != null ? true : false;
        }
        return he.field_f != null ? true : false;
    }

    final static String c(int param0) {
        if ((hf.field_q ^ -1) > -3) {
          return td.field_d;
        } else {
          if (null != hn.field_e) {
            if (!hn.field_e.b(param0 ^ -16421)) {
              return hm.field_a;
            } else {
              return wa.field_a;
            }
          } else {
            if (!wk.field_j.b(-3)) {
              return im.field_Mb;
            } else {
              if (wk.field_j.a("commonui", -1)) {
                if (!io.field_g.b(param0 ^ -16421)) {
                  return ha.field_f;
                } else {
                  if (!io.field_g.a("commonui", -1)) {
                    return pc.field_x + " - " + io.field_g.c(param0 ^ 16463, "commonui") + "%";
                  } else {
                    if (!qo.field_u.b(-3)) {
                      return jd.field_p;
                    } else {
                      if (param0 == 16422) {
                        if (!qo.field_u.a((byte) 92)) {
                          return em.field_a + " - " + qo.field_u.c(0) + "%";
                        } else {
                          return wd.field_b;
                        }
                      } else {
                        sc.b(34);
                        if (!qo.field_u.a((byte) 92)) {
                          return em.field_a + " - " + qo.field_u.c(0) + "%";
                        } else {
                          return wd.field_b;
                        }
                      }
                    }
                  }
                }
              } else {
                return g.field_q + " - " + wk.field_j.c(119, "commonui") + "%";
              }
            }
          }
        }
    }

    sc(String param0) {
        this(param0, false);
    }

    sc(String param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_f = param0;
              if (null != this.field_f) {
                break L1;
              } else {
                this.field_f = "";
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = this;

              if (!param1) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L2;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L2;
              }
            }
            ((sc) (this)).field_b = stackIn_6_1 != 0;
            if (this.field_f.length() == 0) {
              this.field_b = false;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("sc.<init>(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final boolean b(byte param0) {
        int var2 = -65 / ((59 - param0) / 43);
        return this.field_b;
    }

    public static void a(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_i = null;
        if (param0 >= -14) {
          field_g = (ak) null;
          field_e = (byte[][]) null;
          field_d = null;
          return;
        } else {
          field_e = (byte[][]) null;
          field_d = null;
          return;
        }
    }

    static {
        field_e = new byte[1000][];
        field_i = new int[128];
        field_c = "Accept rematch";
    }
}
