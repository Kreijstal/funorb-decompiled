/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends i {
    static int field_F;
    static String field_G;
    static String[] field_K;
    static long field_H;
    static String field_I;
    static byte[] field_J;

    final static int b(int param0, int param1) {
        if (param1 != 15832) {
          field_J = (byte[]) null;
        }
        if (param0 < 0) {
          if (param0 < -65536) {
            return ve.field_T[134217728 / -param0] - 2048;
          }
          return -ve.field_T[-param0 >> 5];
        }
        if (param0 <= 65536) {
          return ve.field_T[param0 >> 5];
        }
        return 2048 - ve.field_T[134217728 / param0];
    }

    final static void g(int param0) {
        int var1;
        int var2;
        var2 = Kickabout.field_G;
        var1 = -24 % ((param0 - 38) / 56);
        if (1 == ks.field_e) {
          ps.a(-25246, true, false, false, false, false, false);
        } else {
          if (ks.field_e != 2) {
            if (3 != ks.field_e) {
              if (ks.field_e != 4) {
                if (ks.field_e != 5) {
                  if (ks.field_e != 6) {
                    if (ks.field_e != 7) {
                      if (8 != ks.field_e) {
                        if (ks.field_e == 9) {
                          ps.a(-25246, false, false, true, true, false, false);
                        } else {
                          if (ks.field_e != 10) {
                            if (ks.field_e == 11) {
                              ps.a(-25246, true, true, true, true, false, true);
                            } else {
                              if (ks.field_e != 12) {
                                if (ks.field_e == 13) {
                                  ps.a(-25246, true, true, true, true, false, true);
                                } else {
                                  ps.a(-25246, true, true, true, true, true, true);
                                }
                              } else {
                                ps.a(-25246, false, false, true, true, false, false);
                              }
                            }
                          } else {
                            ps.a(-25246, false, false, false, false, true, false);
                          }
                        }
                      } else {
                        ps.a(-25246, true, true, false, true, false, true);
                      }
                    } else {
                      ps.a(-25246, true, true, false, false, false, true);
                    }
                  } else {
                    ps.a(-25246, false, false, false, true, false, false);
                  }
                } else {
                  ps.a(-25246, false, false, false, true, false, false);
                }
              } else {
                ps.a(-25246, false, false, false, true, false, false);
              }
            } else {
              ps.a(-25246, true, false, false, false, false, true);
            }
          } else {
            ps.a(-25246, false, false, false, false, false, true);
          }
        }
    }

    final static void a(String[] args, int param1, String param2, int param3) {
        int var5 = 0;
        String[] var7 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Kickabout.field_G;
        try {
          mj.field_a = cr.field_d;
          if (param3 != -1) {
            no.b(-9, -128);
          }
          if (255 != param1) {
            if (param1 < 100) {
              u.field_h = wb.a(-124, param2, param1);
            } else {
              if (105 < param1) {
                u.field_h = wb.a(-124, param2, param1);
              } else {
                var7 = args;
                pp.a(18267, var7);
                u.field_h = wt.a(-117, args);
              }
            }
          } else {
            stackIn_7_0 = !(tn.field_b >= 13);
            u.field_h = mf.a(stackIn_7_0, param3 ^ -42);
            pp.a(param3 ^ -18268, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("no.C(");
          if (args == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    no() {
        super(9);
        ut var1 = kb.field_E[-1 + kb.field_E.length];
        String var2 = q.field_h[-1 + q.field_h.length];
        String var3 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, gd.field_e[9], new String[]{var2});
        this.a(var3, this.field_t, var1, -117, this.field_u);
    }

    final void a(int param0, int param1) {
        super.a(122, param1);
        if (la.a(100)) {
          return;
        }
        if (param0 <= 60) {
          field_K = (String[]) null;
        }
        or.field_d.b(78, (byte) 113);
    }

    final static ld a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ld stackIn_3_0 = null;
        ld stackIn_7_0 = null;
        ld stackIn_10_0 = null;
        ld stackIn_19_0 = null;
        ld stackIn_23_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Kickabout.field_G;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ld.field_b;
            return stackIn_3_0;
          }
          if (var2_int > 63) {
            stackIn_7_0 = st.field_j;
            return stackIn_7_0;
          }
          if (param1 != 134217728) {
            stackIn_10_0 = (ld) null;
            return stackIn_10_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param0.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var2_int - 1 == var3) {
                stackIn_19_0 = lm.field_F;
                return stackIn_19_0;
              }
            } else {
              if (-1 == qs.field_V.indexOf(var4)) {
                stackIn_23_0 = lm.field_F;
                return stackIn_23_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("no.B(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_I = null;
        field_G = null;
        field_K = null;
        if (param0 != -93) {
          no.g((byte) 67);
        }
        field_J = null;
    }

    static {
        field_K = new String[]{"Unpacking sound", "Unpacking patches", "Unpacking graphics", "Unpacking menus", "Unpacking lobby", "Unpacking 3D models", "Unpacking animations", "Initialising 3D", "Initialising game components", "Initialising menus", "Initialising HUDs", "Initialising pitch", "Initialising UI", "Initialising client", null};
        field_G = "This password contains your email address, and would be easy to guess";
        field_H = 20000000L;
        field_I = "Game full";
    }
}
