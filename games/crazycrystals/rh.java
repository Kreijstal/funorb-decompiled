/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static int field_f;
    static String field_d;
    static boolean[] field_a;
    static String field_e;
    private String field_c;
    static ko field_g;
    private boolean field_b;

    rh(String param0) {
        this(param0, false);
    }

    final String a(byte param0) {
        if (param0 != -108) {
            field_a = (boolean[]) null;
        }
        return this.field_c;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 15157) {
            return;
        }
        field_e = null;
        field_d = null;
        field_g = null;
    }

    final boolean a(int param0) {
        if (param0 >= -101) {
            field_a = (boolean[]) null;
        }
        return this.field_b;
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.removeKeyListener(uf.field_c);
            param1.removeFocusListener(uf.field_c);
            bo.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "rh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int discarded$3 = 0;
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var1 = null;
        dl var1_ref = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dl var6 = null;
        dl var7 = null;
        dl var8 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            kh.c(243, 197, 369, 143, 16777215);
            kh.f(244, 198, 367, 141, 0);
            if (null == nl.field_f) {
              L1: {
                if (null != rn.field_k) {
                  discarded$3 = rn.field_k.a(vl.field_b, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var6 = nl.field_f[ue.field_a];
                var1_ref = var6;
                if (var6 != null) {
                  var6.a(245, 199);
                  break L2;
                } else {
                  if (null == rn.field_k) {
                    break L2;
                  } else {
                    discarded$4 = rn.field_k.a(vl.field_b, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  }
                }
              }
              L3: {
                if (!param0) {
                  break L3;
                } else {
                  field_f = -64;
                  break L3;
                }
              }
              L4: {
                if (h.field_b <= mb.field_f) {
                  break L4;
                } else {
                  var7 = nl.field_f[rd.field_f];
                  if (var7 == null) {
                    break L4;
                  } else {
                    var2_int = mb.field_f * (var7.field_n + 60) / h.field_b;
                    var3 = var2_int + -30;
                    if (!ve.field_t) {
                      pc.a(199, 617553576, 256 * (-var3 + var7.field_n) / 30, var7, -256 * var3 / 30, 245);
                      break L4;
                    } else {
                      pc.a(199, 617553576, var3 * -256 / 30, var7, (-var3 + var7.field_n) * 256 / 30, 245);
                      break L4;
                    }
                  }
                }
              }
              L5: {
                if (rn.field_k != null) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L6: while (true) {
                    if (var5 >= nl.field_f.length) {
                      if (var2 == null) {
                        break L5;
                      } else {
                        discarded$5 = rn.field_k.a("Screenshot(s) " + (String) (var2) + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L5;
                      }
                    } else {
                      var8 = nl.field_f[var5];
                      if (var8 != null) {
                        L7: {
                          L8: {
                            if (var8.field_n != 365) {
                              break L8;
                            } else {
                              if ((var8.field_o ^ -1) != -140) {
                                break L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (var2 != null) {
                            var2 = (String) (var2) + ", " + var5;
                            break L7;
                          } else {
                            var2 = Integer.toString(var5);
                            break L7;
                          }
                        }
                        var5++;
                        continue L6;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "rh.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static rh b(int param0) {
        if (param0 != 365) {
            field_e = (String) null;
        }
        String var1 = vg.b((byte) -29);
        if (var1 != null) {
            if ((var1.indexOf('@') ^ -1) <= -1) {
                var1 = "";
            }
        }
        return new rh(vg.b((byte) -29), lk.b(param0 + -359));
    }

    rh(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.field_c = param0;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((rh) (this)).field_b = stackIn_4_1 != 0;
              if (null != this.field_c) {
                break L2;
              } else {
                this.field_c = "";
                break L2;
              }
            }
            L3: {
              if (this.field_c.length() != 0) {
                break L3;
              } else {
                this.field_b = false;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("rh.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "One-Player Puzzles";
        field_e = "Loading levels";
    }
}
