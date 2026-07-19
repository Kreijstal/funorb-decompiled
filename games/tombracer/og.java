/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends hl implements qm {
    static int field_m;
    private byte field_l;

    og(kda param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (param0 != -15730) {
          this.field_l = (byte) -118;
          return super.a(this.field_h.field_Tc, param1, 1);
        } else {
          return super.a(this.field_h.field_Tc, param1, 1);
        }
    }

    final static void b(int param0) {
        if (null != dq.field_f) {
          pq.a(dq.field_f, false);
          dq.field_f.a((byte) -34, dsa.field_c);
          dq.field_f = null;
          if (null == wba.field_o) {
            nma.field_l.requestFocus();
            if (param0 != 0) {
              field_m = -90;
              return;
            } else {
              return;
            }
          } else {
            wba.field_o.a(118);
            nma.field_l.requestFocus();
            if (param0 == 0) {
              return;
            } else {
              field_m = -90;
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_3_0 = null;
            String stackIn_12_0 = null;
            Object stackIn_17_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_11_0 = null;
            String stackOut_2_0 = null;
            Object stackOut_16_0 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var7 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    if (param2 == 86) {
                      var3 = (String) (lb.b(param0, 2864, "getcookies"));
                      var4 = rga.a(param2 + 32201, var3, ';');
                      var5 = 0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          var6 = var4[var5].indexOf('=');
                          if (var7 == 0) {
                            L3: {
                              if ((var6 ^ -1) > -1) {
                                break L3;
                              } else {
                                if (var4[var5].substring(0, var6).trim().equals(param1)) {
                                  stackOut_11_0 = var4[var5].substring(var6 + 1).trim();
                                  stackIn_12_0 = stackOut_11_0;
                                  decompiledRegionSelector0 = 2;
                                  break L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            var5++;
                            continue L2;
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      stackOut_2_0 = (String) null;
                      stackIn_3_0 = stackOut_2_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) (var3_ref2);
                stackOut_18_1 = new StringBuilder().append("og.F(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L5;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L5;
                }
              }
              L6: {
                stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L6;
                } else {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "{...}";
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L6;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_17_0);
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_12_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
            return false;
        }
        this.field_l = (byte)param1;
        super.a(-97, param0);
        return true;
    }

    final int a(byte param0) {
        if (param0 > -25) {
            return 2;
        }
        return this.field_l;
    }

    public final void a(int param0) {
        if (param0 != 12574) {
            return;
        }
        super.a(param0 ^ 0);
    }

    public final boolean a(boolean param0) {
        if (!param0) {
          field_m = 54;
          return super.a(this.field_h.field_Tc, 108);
        } else {
          return super.a(this.field_h.field_Tc, 108);
        }
    }

    static {
    }
}
