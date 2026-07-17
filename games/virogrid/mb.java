/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mb extends dc {
    private int field_lb;
    static int[][] field_db;
    static int[] field_bb;
    private int field_jb;
    static String field_eb;
    static String field_mb;
    private int field_cb;
    private int field_hb;
    private int field_nb;
    private fi field_ib;
    private on field_fb;
    static String field_gb;
    private kn field_kb;

    boolean f(int param0) {
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        if (param0 != 3) {
          ((mb) this).field_lb = -93;
          if (null != ((mb) this).field_fb) {
            if (dk.field_e != ((mb) this).field_fb) {
              if (vf.field_b == ((mb) this).field_fb) {
                int fieldTemp$4 = ((mb) this).field_jb + 1;
                ((mb) this).field_jb = ((mb) this).field_jb + 1;
                if (((mb) this).field_hb != fieldTemp$4) {
                  ((mb) this).field_kb.field_H = (((mb) this).field_jb << 8) / ((mb) this).field_hb;
                  return super.f(3);
                } else {
                  ((mb) this).field_fb = null;
                  ((mb) this).field_kb.field_H = 256;
                  return super.f(3);
                }
              } else {
                return super.f(3);
              }
            } else {
              int fieldTemp$5 = ((mb) this).field_jb + 1;
              ((mb) this).field_jb = ((mb) this).field_jb + 1;
              if (fieldTemp$5 == ((mb) this).field_cb) {
                ((mb) this).field_fb = lm.field_e;
                ((mb) this).a(((mb) this).field_lb + (12 - -((mb) this).field_ib.field_m), param0 ^ 3, ((mb) this).field_nb, 12 + ((mb) this).field_ib.field_g);
                ((mb) this).field_kb.field_H = 0;
                ((mb) this).field_jb = 0;
                return super.f(3);
              } else {
                ((mb) this).field_kb.field_H = 256 + -((((mb) this).field_jb << 8) / ((mb) this).field_cb);
                return super.f(3);
              }
            }
          } else {
            return super.f(3);
          }
        } else {
          if (null != ((mb) this).field_fb) {
            if (dk.field_e != ((mb) this).field_fb) {
              if (vf.field_b == ((mb) this).field_fb) {
                int fieldTemp$6 = ((mb) this).field_jb + 1;
                ((mb) this).field_jb = ((mb) this).field_jb + 1;
                if (((mb) this).field_hb != fieldTemp$6) {
                  ((mb) this).field_kb.field_H = (((mb) this).field_jb << 8) / ((mb) this).field_hb;
                  return super.f(3);
                } else {
                  ((mb) this).field_fb = null;
                  ((mb) this).field_kb.field_H = 256;
                  return super.f(3);
                }
              } else {
                return super.f(3);
              }
            } else {
              int fieldTemp$7 = ((mb) this).field_jb + 1;
              ((mb) this).field_jb = ((mb) this).field_jb + 1;
              if (fieldTemp$7 == ((mb) this).field_cb) {
                ((mb) this).field_fb = lm.field_e;
                ((mb) this).a(((mb) this).field_lb + (12 - -((mb) this).field_ib.field_m), param0 ^ 3, ((mb) this).field_nb, 12 + ((mb) this).field_ib.field_g);
                ((mb) this).field_kb.field_H = 0;
                ((mb) this).field_jb = 0;
                return super.f(3);
              } else {
                ((mb) this).field_kb.field_H = 256 + -((((mb) this).field_jb << 8) / ((mb) this).field_cb);
                return super.f(3);
              }
            }
          } else {
            return super.f(3);
          }
        }
    }

    void b(fi param0, byte param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              ((mb) this).field_ib = param0;
              if (((mb) this).field_fb != lm.field_e) {
                if (((mb) this).field_fb == dk.field_e) {
                  break L1;
                } else {
                  ((mb) this).field_jb = 0;
                  ((mb) this).field_fb = dk.field_e;
                  break L1;
                }
              } else {
                ((mb) this).a(((mb) this).field_ib.field_m + (12 + ((mb) this).field_lb), param1 ^ -53, ((mb) this).field_nb, ((mb) this).field_ib.field_g + 12);
                ((mb) this).field_jb = 0;
                break L1;
              }
            }
            if (param1 == -53) {
              break L0;
            } else {
              var4 = null;
              boolean discarded$2 = ((mb) this).a((fi) null, '￈', 62, -58);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("mb.S(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    final static String a(boolean param0, char param1) {
        if (!param0) {
            java.applet.Applet discarded$0 = mb.g((byte) -40);
            return String.valueOf(param1);
        }
        return String.valueOf(param1);
    }

    final void j(int param0) {
        if (null == ((mb) this).field_fb) {
            super.j(param0);
            return;
        }
        if (((mb) this).field_fb != vf.field_b) {
            ((mb) this).c(((mb) this).field_ib.field_m + 12 - -((mb) this).field_lb, 120, 12 - -((mb) this).field_ib.field_g);
            this.c(6, ((mb) this).field_ib);
        } else {
            ((mb) this).field_kb.field_H = 256;
            ((mb) this).field_fb = null;
            super.j(param0);
            return;
        }
        ((mb) this).field_kb.field_H = 256;
        ((mb) this).field_fb = null;
        super.j(param0);
    }

    final void i(int param0) {
        if (((mb) this).field_fb != dk.field_e) {
          ((mb) this).field_jb = 0;
          ((mb) this).field_fb = vf.field_b;
          this.c(6, ((mb) this).field_ib);
          if (param0 <= 43) {
            return;
          } else {
            ((mb) this).field_kb.field_H = 0;
            ((mb) this).field_ib = null;
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, fi param1) {
        if (param0 != 6) {
            return;
        }
        try {
            if (((mb) this).field_kb != null) {
                ((mb) this).field_kb.a(false);
            }
            if (param1 != null) {
                param1.a(param1.field_m, true, 6 - -((mb) this).field_lb, 6, param1.field_g);
                ((mb) this).field_kb = new kn(param1);
            } else {
                ((mb) this).field_kb = new kn();
            }
            ((mb) this).a((fi) (Object) ((mb) this).field_kb, (byte) -78);
            ((mb) this).field_ib = null;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "mb.P(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    mb(je param0, fi param1, int param2, int param3, int param4) {
        super(param0, param1.field_g + 12, param2 + (12 - -param1.field_m));
        try {
            ((mb) this).field_hb = param3;
            ((mb) this).field_cb = param3;
            ((mb) this).field_lb = param2;
            ((mb) this).field_nb = param4;
            this.c(6, param1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "mb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void h(byte param0) {
        field_bb = null;
        field_gb = null;
        field_mb = null;
        field_eb = null;
        field_db = null;
    }

    final static void a(int param0, byte param1, mg[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (0 < param0) {
                  var5_int = param2[0].field_u;
                  var6 = param2[2].field_u;
                  var7 = param2[1].field_u;
                  param2[0].d(param3, param4);
                  param2[2].d(-var6 + param0 + param3, param4);
                  df.b(od.field_m);
                  df.h(param3 - -var5_int, param4, -var6 + param0 + param3, param2[1].field_z + param4);
                  if (param1 == -117) {
                    var8 = param3 + var5_int;
                    var9 = param0 + (param3 + -var6);
                    param3 = var8;
                    L2: while (true) {
                      if (var9 <= param3) {
                        df.a(od.field_m);
                        break L0;
                      } else {
                        param2[1].d(param3, param4);
                        param3 = param3 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("mb.Q(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void i(byte param0) {
        mi.field_d = sh.field_qb.h(-118);
        CharSequence var2 = (CharSequence) (Object) mi.field_d;
        wn.field_n = c.a(var2, true);
    }

    final static java.applet.Applet g(byte param0) {
        int var1 = 114 / ((param0 - -37) / 43);
        if (ai.field_a != null) {
            return ai.field_a;
        }
        return (java.applet.Applet) (Object) jj.field_n;
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = 32 % ((-75 - param3) / 36);
            if (super.a(param0, param1, param2, -117)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (((mb) this).field_kb != null) {
                L1: {
                  if (param2 == 98) {
                    boolean discarded$4 = ((mb) this).field_kb.a(param0, -8515);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 != 99) {
                    break L2;
                  } else {
                    boolean discarded$5 = ((mb) this).field_kb.a(param0, -8515);
                    break L2;
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("mb.AA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_12_0 != 0;
    }

    final boolean a(byte param0) {
        ((mb) this).j(-4236);
        int var2 = 32 % ((param0 - 50) / 33);
        return super.a((byte) -71);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "Blue";
        field_gb = "Please enter your age in years";
        field_mb = "Create a free account to start using this feature";
    }
}
